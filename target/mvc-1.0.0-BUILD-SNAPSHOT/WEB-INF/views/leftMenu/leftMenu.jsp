<%@taglib uri="http://www.springframework.org/tags" prefix="fmt"%>
<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search">
				<div class="input-group custom-search-form">
					<input type="text" class="form-control" placeholder="Recherche...">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div> <!-- /input-group -->
			</li>
		
			<li class=""><a href=""><i class="fa fa-dashboard fa-fw"></i>
			      
					<fmt:message code="common.dashbord" /> </a></li>
	
			<li><a href=""><i class="fa fa-barcode fa-fw"></i>
					<fmt:message code="common.article" /> </a></li>
			<li><a href="#"><i class="fa fa-users fa-fw"></i>
					<fmt:message code="common.client" /><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level" area-expended="false">
				
					<li><a href="#"><fmt:message code="common.client" /></a></li>
					
					<li><a href="${cdeClt }"><fmt:message code="common.client.commande" /></a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-users fa-fw"></i>
					<fmt:message code="common.fournisseur" /><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
				
					<li><a href="${fournisseur }"><fmt:message code="common.fournisseur" /></a></li>
				
					<li><a href="${fournisseur }"><fmt:message code="common.fournisseur.commande" /></a></li>
				</ul> <!-- /.nav-second-level --></li>
			
			<li><a href="${stock }"><i class="fa fa-dropbox fa-fw"></i>
					<fmt:message code="common.stock" /></a></li>
			
			<li><a href="${vente }"><i class="fa fa-shopping-cart fa-fw"></i>
					<fmt:message code="common.vente" /></a></li>
			<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
					<fmt:message code="common.parametrage" /><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
				
					<li><a href="${user }"><fmt:message code="common.parametrage.utilisateur" /></a></li>
					
					<li><a href="${category }"><fmt:message code="common.parametrage.category" /></a></li>
				</ul> <!-- /.nav-second-level --></li>
		</ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>