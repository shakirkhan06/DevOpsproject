/**
 * 
 */
$(document).ready( function () {
	 var table = $('#categoryTable').DataTable({
			"sAjaxSource": "categorys",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "categoryId"},
		      { "mData": "categoryName" }
		      
							 
			]
	 });
	 
	
		 var table = $('#supplierTable').DataTable({
				"sAjaxSource": "suppliers",
				"sAjaxDataProp": "",
				"order": [[ 0, "asc" ]],
				"aoColumns": [
				    { "mData": "supplierId"},
			      { "mData": "supplierName" }
			      
								 
				]
		 });
		 var table = $('#productsTable').DataTable({
				"sAjaxSource": "products",
				"sAjaxDataProp": "",
				"order": [[ 0, "asc" ]],
				"aoColumns": [
				    { "mData": "prodId"},
			      { "mData": "prodName" },
			      { "mData": "prodCategory"},
			      { "mData": "prodSupplier"},
			      { "mData": "prodPrice"},
				    { "mData": "prodQuantity"}
			      
								 
				]
		 });
	 });