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
<link
	href="<%=request.getContextPath()%>/resources/css/sb-admin-2.min.css"
	rel="stylesheet">
	
<link href="<%=request.getContextPath()%>/resources/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

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
          <h1 class="h3 mb-2 text-gray-800"><fmt:message code="common.fournisseur"/></h1>
          <nav aria-label="breadcrumb">
          
          <ol class="breadcrumb">
           <li class="breadcrumb-item">
             <a href="<c:url value="/fournisseur/nouveau"/>"class="btn btn-success btn-icon-split">
              <span class="icon text-white-50"><i class="fas fa-user-plus"></i></span>
              <span class="text"><fmt:message code="common.ajouter"/></span>
             </a>
           </li>
           
          <li class="breadcrumb-item">
            <a href="#" class="btn btn-primary btn-icon-split">
             <span class="icon text-white-50"><i class="fas fa-download"></i></span>
             <span class="text"><fmt:message code="common.exporter"/></span>
            </a>
           </li>
        
           <li class="breadcrumb-item">
           <a href="#" class="btn btn-info btn-icon-split">
            <span class="icon text-white-50"><i class="fas fa-upload"></i></span>
             <span class="text"><fmt:message code="common.importer"/></span>
            </a>
           </li>
           
          </ol>
          </nav>
          <!-- List des clients -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary"><fmt:message code="fournisseur.list"/></h6>
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable">
                  <thead>
                    <tr>
                      <th><fmt:message code="common.photo"/></th>
                      <th><fmt:message code="common.nom"/></th>
                      <th><fmt:message code="common.prenom"/></th>
                      <th><fmt:message code="common.adresse"/></th>
                      <th><fmt:message code="common.mail"/></th>
                      <th><fmt:message code="common.actions"/></th>
        
                    </tr>
                  </thead>
               
                  <tbody>
                    <c:forEach items="${fournisseurs }"  var = "fournisseur">
                    <tr class="odd gradeX">
                      <td class="center"><img src="${fournisseur.getPhoto() }" width="90px" height="90px"/></td>
                      <td>${fournisseur.getNom() }</td>
                      <td>${fournisseur.getPrenom() }</td>
                      <td>${fournisseur.getAdresse()}</td>
                      <td>${fournisseur.getMail()}</td>
                      <td>
         
                         <c:url value="/fournisseur/modifier/${fournisseur.getIdFournisseur() }" var="urlModif" />
                        <a href="${urlModif }" class="btn btn-warning btn-circle btn-sm">
                       <i class="fas fa-edit">
                       </i></a>
                       <a href="javascript:void(0);" data-toggle="modal" data-target="#modalFournisseur${fournisseur.getIdFournisseur() }"class="btn btn-danger btn-circle btn-sm">
                       <i class="fas fa-trash">
                       </i></a>
                       <div class="modal fade" id="modalFournisseur${fournisseur.getIdFournisseur() }" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                          <div class="modal-dialog" role="document">
                             <div class="modal-content">
                                <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel"><fmt:message code="common.suppression" /></h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                                </button>
                                </div>
                                 <div class="modal-body">
                                   <fmt:message code="common.suppr.questionfr" />
                                 </div>
                               <div class="modal-footer">
                               <button type="button" class="btn btn-danger" data-dismiss="modal">
                                <span class="icon text-white-50"><i class="far fa-times-circle"></i></span>
                                <span class="text"><fmt:message code="common.non" /></span></button>
                               
                               <c:url value="/fournisseur/supprimer/${fournisseur.getIdFournisseur() }" var="urlSuppression" />
                               <a href="${urlSuppression }" class="btn btn-success">
                               <span class="icon text-white-50"><i class="fas fa-trash"></i></span>
                                <span class="text"><fmt:message code="common.oui" /></span></a>
                             
                               
                               </div>
                            </div>
                          </div>
                       </div>

                      </td>
                    </tr>
                     </c:forEach>
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

	<!-- Custom scripts for all pages-->
	<script
		src="<%=request.getContextPath()%>/resources/js/sb-admin-2.min.js"></script>
		
	<!-- Page level plugins -->
  <script src="<%=request.getContextPath()%>/resources/vendor/datatables/jquery.dataTables.min.js"></script>
  <script src="<%=request.getContextPath()%>/resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>
  
  <!-- Page level custom scripts -->
  <script src="<%=request.getContextPath()%>/resources/js/demo/datatables-demo.js"></script>
		

</body>

</html>
