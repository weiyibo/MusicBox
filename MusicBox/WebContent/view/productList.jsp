
<div class="container-wrapper" style="padding-top:100px; padding-bottom:50px">
	<div class="container">
		<div class="page-header">
			<h1>All Products</h1>
			<p class="lead">Checkout all the awesome products available now</p>
		</div>
		<table class="table table-striped table-hover">
			<thead>
				<tr class="bg-success">
					<th>Photo Thumb</th>
					<td>ID</td>
					<th>Product Name</th>
					<th>Category</th>
					<th>Condition</th>
					<th>Price</th>
					<th>More Info</th>
				</tr>
			</thead>
			<tr class="bg-success" ng-repeat="product in productList">
				<td><a href="#ProductDetail/{{product.productId}}"><img src="#" alt="image"></a></td>
				<td>{{product.productId}}</td>
				<td>{{product.productName}}</td>
				<td>{{product.productCategory}}</td>
				<td>{{product.productCondition}}</td>
				<td>{{product.productPrice}}</td>
				<td><a href="#ProductDetail/{{product.productId}}"><span class="glyphicon glyphicon-info-sign"></span></a></td>
			</tr>
		</table>
	</div>
</div>
