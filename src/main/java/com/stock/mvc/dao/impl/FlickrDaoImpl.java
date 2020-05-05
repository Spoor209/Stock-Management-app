package com.stock.mvc.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.swing.JOptionPane;

import org.scribe.model.Token;
import org.scribe.model.Verifier;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.Response;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;
import com.github.scribejava.apis.FlickrApi;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth1AccessToken;
import com.github.scribejava.core.model.OAuth1RequestToken;
import com.github.scribejava.core.model.OAuth1Token;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth10aService;
import com.stock.mvc.dao.IFlickrDao;


public class FlickrDaoImpl implements IFlickrDao {
	
	private Flickr flickr;
	
	
	private UploadMetaData uploadMetaData = new UploadMetaData();
	
	private String apiKey = "541fbc7f97008aa9184eff3249a03be7";

    private String apiSecret = "a029e6d2215f77de";

	private OAuth10aService service = new ServiceBuilder("541fbc7f97008aa9184eff3249a03be7")
             .apiSecret("a029e6d2215f77de")
             .build(FlickrApi.instance(FlickrApi.FlickrPerm.DELETE));
    private Scanner in = new Scanner(System.in);
    
  

    private void connect(){
    	
        flickr = new Flickr(apiKey, apiSecret, new REST());
        Auth auth = new Auth();
        auth.setPermission(Permission.READ);
        auth.setToken("72157713818937627-a92c37d3e33dbfdd");
        auth.setTokenSecret("b64ff45da040750e");
        RequestContext requestContext = RequestContext.getRequestContext();
        requestContext.setAuth(auth);
        flickr.setAuth(auth);
    }

    @Override
    public String savePhoto(InputStream photo, String title) throws Exception {
        connect();
        uploadMetaData.setTitle(title);
        String photoId = flickr.getUploader().upload(photo, uploadMetaData);
        return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
    }

  
	public void auth() throws IOException, InterruptedException, ExecutionException, RuntimeException {
    	flickr = new Flickr(apiKey, apiSecret, new REST());
    	  //AuthInterface authInterface = flickr.getAuthInterface();
    	  
    	  
    	  
    	  OAuth1RequestToken token = service.getRequestToken();
    	  System.out.println("token: " + token);
    	  
    	  String authorizationUrl = service.getAuthorizationUrl(token);
    	  System.out.println("Follow this URL to authorize yourself on Flickr");
    	  System.out.println(authorizationUrl);
    	  System.out.println("Paste in the token it gives you");
    	  System.out.println(">>");
    	  
    	  String oauthVerifier = in.nextLine();
    	  System.out.println();
    	  
    	  OAuth1AccessToken accessToken = service.getAccessToken(token, oauthVerifier);
    	  System.out.println("Got the Access Token!");
          System.out.println("(The raw response looks like this: " + accessToken.getRawResponse() + "')");
          System.out.println();
    	  
    	  Auth auth = null ; 
    	  
    	  
    	// This token can be used until the user revokes it.
          System.out.println("Token: " + accessToken.getToken());
          System.out.println("Secret: " + accessToken.getTokenSecret());
          System.out.println("nsid: " + auth.getUser().getId());
          System.out.println("Realname: " + auth.getUser().getRealName());
          System.out.println("Username: " + auth.getUser().getUsername());
          System.out.println("Permission: " + auth.getPermission().getType());
    	
      }
  
        

    }


