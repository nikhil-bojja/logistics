<html>
<body>
    <div id="header"></div>

        <a href="/" > Home </a></br></br>
		<form action="/addItem" method="post">
			<h1>Add Item</h1>
			<div>
				<div><label>Name</label></div>
				<div><input type="text" name="name" required></div>
			</div>

			<div>
				<div><label>Cost</label></div>
				<div><input type="text" name="cost" required></div>
			</div>
			<div>
				<div><label>Description</label></div>
				<div><input type="text" name="description" ></div>
			</div>
			<div>
				<button>
					Add
				</button>
			</div>
		</form>

	</div>
</body>
</html>