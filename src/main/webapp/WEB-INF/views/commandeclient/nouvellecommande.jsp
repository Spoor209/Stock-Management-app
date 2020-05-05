<%@ include file="/WEB-INF/views/includes/includes.jsp"%>
<!DOCTYPE html>
<html lang="fr">
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Blank</title>

<!-- Custom fonts for this template-->
<link
	href="<%=request.getContextPath()%>/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="<%=request.getContextPath()%>/resources/https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="<%=request.getContextPath()%>/resources/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">
	<%@ include file="/WEB-INF/views/menu_left/leftmenu.jsp"%>
		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<%@ include file="/WEB-INF/views/menu_top/topmenu.jsp"%>

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-4 text-gray-800"><fmt:message code="common.cdeclient.nouveau"/></h1>
					
					<div class="alert alert-danger" role="alert" id="notFoundMsgBlock">
                    <fmt:message code="common.client.article.not.found"/>
                    </div>
                    <div class="alert alert-danger" role="alert" id="clientNotSelectedMsgBlock">
                    <fmt:message code="common.client.select.client.msfg.erreur"/>
                    </div>
                    <div class="alert alert-danger" role="alert" id="unexpectedErrorMsgBlock">
                    <fmt:message code="common.client.select.client.unexpected.error"/>
                    </div>
                    
                    
					
					<div class="card shadow mb-4">
                    <div class="card-header py-3">
                    <h6 class="m-0 font-weight-bold text-primary"><fmt:message code="common.nouvelle.cde"/></h6>
                    </div>
                    <div class="card-body">
            
                   <form action="" enctype="multipart/form-data" role="form">
                     <div class="form-row">
                     <div class="col-md-4 mb-3">
                     <label><fmt:message code="common.code.article"/></label>
                     <input  class="form-control" placeholder="Entrez le code" id="codeCommande"value="${code }"/>
                     </div>
                     
                     <div class="col-md-4 mb-3">
                     <label><fmt:message code="common.date"/></label>
                     <input  class="form-control" placeholder="Entrez la date" id="dateCommande" value="${dateCde }" disabled />
                     </div>
                     
                     <div class="col-md-4 mb-3">
                     <label><fmt:message code="common.client"/></label>
             
                     <select class="form-control" id="listClients">
                     <option value="-1">
                     <fmt:message code="commande.client.select.client" />
                     </option>
                     <c:forEach items="${clients}" var="clt">
                       <option value="${clt.getIdClient() }">${clt.getPrenom() }</option>
                     
                     </c:forEach>
                     </select>
                     </div>
                     </div>
                  
                     <div class="panel-footer">
                     <button type="button" id="btnEnregistrerCommande" class="btn btn-success btn-icon-split">
                     <span class="icon text-white-50"><i class="fa fa-save"></i></span>
                     <span class="text"><fmt:message code="common.enregistrer" /></span></button>
                     <a href="<c:url value="/commandeclient/" />" class="btn btn-danger btn-icon-split">
                     <span class="icon text-white-50"><i class="fa fa-ban"></i></span>
                      <span class="text"><fmt:message code="common.annuler" /></span></a>
                     </div>
               
             <!--    <a href="<c:url value="/client/enregistrer/"/>"class="btn btn-success btn-icon-split">
              <span class="icon text-white-50"><i class="fas fa-save"></i></span>
              <span class="text"><fmt:message code="common.enregistrer"/></span>
              </a>
              
              <a href="<c:url value="/client/"/>"class="btn btn-danger btn-icon-split">
              <span class="icon text-white-50"><i class="fas fa-ban"></i></span>
              <span class="text"><fmt:message code="common.annuler"/></span>
              </a> -->
              
                <!--button type="submit" class="btn btn-success"><fmt:message code="common.enregistrer"/></button>  -->
                
                
                <!--a href="<c:url value="/client/"/>"type="reset" class="btn btn-danger"><fmt:message code="common.annuler"/></a>  -->
             </form>
            </div>
          </div>
          
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary"><fmt:message code="common.detail.commande"/></h6>
            </div>
            
            <div class="card-body">
            <div class="form-row">
              <div class="col-md-4 mb-3" >
              <label><fmt:message code="common.chercher"/></label>
              <input class="form-control form-control-sm" placeholder="Saisir un code article" type="text" id="codeArticle_search"/>
              </div>
            </div>
            
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable">
                  <thead>
                    <tr>
                      <th><fmt:message code="common.article"/></th>
                      <th><fmt:message code="common.qte"/></th>
                      <th><fmt:message code="common.prixunitaire.ttc"/></th>
                      <th><fmt:message code="common.total"/></th>
                      <th><fmt:message code="common.actions" /></th>
                      
        
                    </tr>
                  </thead>
               
                  <tbody id="detailNouvelleCommande">
                  <tr>
                     
                    </tr>
                    
                  </tbody>
                </table>
              </div>
            </div>
          </div>

				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<footer class="sticky-footer bg-white">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright &copy; Your Website 2019</span>
					</div>
				</div>
			</footer>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<c:url value="/j_spring_security_logout" var="logout" />	
					<a class="btn btn-primary" href="${logout }">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="<%=request.getContextPath()%>/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
		
		<!-- Page level plugins -->
  <script src="<%=request.getContextPath()%>/resources/vendor/datatables/jquery.dataTables.min.js"></script>
  <script src="<%=request.getContextPath()%>/resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script
		src="<%=request.getContextPath()%>/resources/js/sb-admin-2.min.js"></script>
     <!-- Custom JavaScript files-->
	<script src="<%=request.getContextPath()%>/resources/javascript/commandeClient.js"></script>

</body>

</html>
