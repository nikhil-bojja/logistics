<html>
<body>
    <div id="header"></div>

        <a href="/" > Home </a></br></br>
		<form action="/updateItem" method="post">
			<h1>Update Item</h1>
			<div>
  				<div><input hidden = True value= "${updateItem.getName()}" type="text" name="key" required></div>
            </div>

			<div>
				<div><label>Name</label></div>
				<div><input value= "${updateItem.getName()}" type="text" name="name" required></div>
			</div>

			<div>
				<div><label>Cost</label></div>
				<div><input value= "${updateItem.getCost()}" type="text" name="cost" required></div>
			</div>
			<div>
				<div><label>Description</label></div>
				<div><input value = "${updateItem.getDescription()}" type="text" name="description" ></div>
			</div>
			<div>
				<button>
					Update
				</button>
			</div>
		</form>

	</div>
</body>
</html>