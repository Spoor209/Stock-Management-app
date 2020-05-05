<%@ include file="/WEB-INF/views/includes/includes.jsp" %>
<!-- Sidebar -->
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<a href="javascript:void(0);" class="sidebar-brand d-flex align-items-center justify-content-center" >
		<div class="sidebar-brand-icon rotate-n-15">
			<i class="fas fa-seedling"></i>
		</div>
		<div class="sidebar-brand-text mx-3">
			Gestion<sup>2</sup>Stock 
		</div>
	</a>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">
	

	<!-- Nav Item - Tableau de bord/home -->
	<c:url value="/home/" var="home"/>
	<li class="nav-item"><a class="nav-link" href="${home }"> <i
			class="fas fa-fw fa-tachometer-alt"></i><fmt:message code="common.dashboard" /></a></li>
			
	<!-- Nav Item - Articles -->
	<c:url value="/article/" var="article"/>
	<li class="nav-item"><a class="nav-link" href="${article }"> <i
			class="fas fa-fw fa-tachometer-alt"></i><span><fmt:message code="common.article" /></span></a></li>
			
	<!-- Nav Item - Ventes -->
	<c:url value="/vente/" var="vente"/>		
	<li class="nav-item"><a class="nav-link" href="${vente }"> <i
			class="fas fa-fw fa-table"></i><span><fmt:message code="common.vente" /></span></a></li>
			
	<!-- Nav Item - Stock -->
	<c:url value="/stock/" var="stock"/>
	<li class="nav-item">
	  <a class="nav-link" href="${stock }">
	    <i class="fas fa-fw fa-table"></i><span><fmt:message code="common.stock" /></span></a></li>		

    
	<!-- Divider -->
	<!--hr class="sidebar-divider my-0"-->
	<!--hr class="sidebar-divider"-->

	<!-- Heading -->
	<!--div class="sidebar-heading">Clients et Fournisseurs</div-->

	<!-- Nav Item - Pages Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true"
		aria-controls="collapseTwo"> <i class="fas fa-fw fa-chart-area"></i> <span>Clients</span>
	</a>
		<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
			data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				
				<c:url value="/client/" var="client"/>
				<a class="collapse-item" href="${client }"><fmt:message code="common.client" /></a> 
				<c:url value="/commandeclient/" var="commandeclient"/>
				<a class="collapse-item" href="${commandeclient }"><fmt:message code="common.client.commande" /></a>
			</div>
		</div></li>
		
		<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseThree" aria-expanded="true"
		aria-controls="collapseThree"> <i class="fas fa-fw fa-chart-area"></i> <span>Fournisseurs</span>
	</a>
		<div id="collapseThree" class="collapse" aria-labelledby="headingTwo"
			data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				
				<c:url value="/fournisseur/" var="fournisseur"/>
				<a class="collapse-item" href="${fournisseur }"><fmt:message code="common.fournisseur" /></a> 
				<c:url value="/commandefournisseur/" var="Cdefournisseur"/>
				<a class="collapse-item" href="${Cdefournisseur }"><fmt:message code="common.fournisseur.commande" /></a>
			</div>
		</div></li>

	<!-- Nav Item - Utilities Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseUtilities"
		aria-expanded="true" aria-controls="collapseUtilities"> <i
			class="fas fa-fw fa-wrench"></i> <span>Paramétrage</span>
	</a>
		<div id="collapseUtilities" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				
				<c:url value="/utilisateur/" var="user"/>
				<a class="collapse-item" href="${user }"><fmt:message code="common.parametrage.utilisateur" /></a> 
				<c:url value="/category/" var="category"/>
				<a class="collapse-item" href="${category }"><fmt:message code="common.parametrage.category" /></a> 
			</div>
		</div></li>
		
		
		

	

	<!-- Nav Item - Pages Collapse Menu -->
	<!--  li class="nav-item active"><a class="nav-link" href="#"
		data-toggle="collapse" data-target="#collapsePages"
		aria-expanded="true" aria-controls="collapsePages"> <i
			class="fas fa-fw fa-folder"></i> <span>Pages</span>
	</a>
		<div id="collapsePages" class="collapse show"
			aria-labelledby="headingPages" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Login Screens:</h6>
				<a class="collapse-item" href="login.html">Login</a> <a
					class="collapse-item" href="register.html">Register</a> <a
					class="collapse-item" href="forgot-password.html">Forgot
					Password</a>
				<div class="collapse-divider"></div>
				<h6 class="collapse-header">Other Pages:</h6>
				<a class="collapse-item" href="404.html">404 Page</a> <a
					class="collapse-item active" href="blank.html">Blank Page</a>
			</div>
		</div></li>-->



    
	

	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>

</ul>
<!-- End of Sidebar -->