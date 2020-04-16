public class RequestMapping {
	
	// By path
	@RequestMapping(value = "/ex/foos", method = RequestMethod.GET)
	@ResponseBody
	public String getFoosBySimplePath() {
		return "Get some Foos";
	}
	
	// Header attribute
	@RequestMapping(value = "/ex/foos", headers = "key=val", method = GET)
	@ResponseBody
	public String getFoosWithHeader() {
		return "Get some Foos with Header";
	}
	
	// Consumes and Produces
	@RequestMapping(
		value = "/ex/foos", 
		method = RequestMethod.GET, 
		produces = "application/json"
	)
	@ResponseBody
	public String getFoosAsJsonFromREST() {
		return "Get some Foos with Header New";
	}
	
	// Single @PathVariable
	@RequestMapping(value = "/ex/foos/{id}", method = GET)
	@ResponseBody
	public String getFoosBySimplePathWithPathVariable(
	  @PathVariable("id") long id) {
		return "Get a specific Foo with id=" + id;
	}
	
	// Multiple @PathVariable
	@RequestMapping(value = "/ex/foos/{fooid}/bar/{barid}", method = GET)
	@ResponseBody
	public String getFoosBySimplePathWithPathVariables
	  (@PathVariable long fooid, @PathVariable long barid) {
		return "Get a specific Bar with id=" + barid + 
		  " from a Foo with id=" + fooid;
	}
	
	// Multiple Paths
	@RequestMapping(
		value = { "/ex/advanced/bars", "/ex/advanced/foos" }, 
		method = GET)
	@ResponseBody
	public String getFoosOrBarsByPath() {
		return "Advanced - Get some Foos or Bars";
	}
	
	// Multiple HTTP Request
	@RequestMapping(
		value = "/ex/foos/multiple", 
		method = { RequestMethod.PUT, RequestMethod.POST }
	)
	@ResponseBody
	public String putAndPostFoos() {
		return "Advanced - PUT and POST within single method";
	}
	
	// Shortcuts
	@GetMapping("/{id}")
	public ResponseEntity<?> getBazz(@PathVariable String id){
		return new ResponseEntity<>(new Bazz(id, "Bazz"+id), HttpStatus.OK);
	}
	 
	@PostMapping
	public ResponseEntity<?> newBazz(@RequestParam("name") String name){
		return new ResponseEntity<>(new Bazz("5", name), HttpStatus.OK);
	}
	 
	@PutMapping("/{id}")
	public ResponseEntity<?> updateBazz(
	  @PathVariable String id,
	  @RequestParam("name") String name) {
		return new ResponseEntity<>(new Bazz(id, name), HttpStatus.OK);
	}
	 
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteBazz(@PathVariable String id){
		return new ResponseEntity<>(new Bazz(id), HttpStatus.OK);
	}
	
}