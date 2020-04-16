pub class PathVariables {
	
	@RequestMapping(value = {"/article", "/article/{id}"})
	public Article getArticle(@PathVariable(name = "id") Integer articleId) {
		if (articleId != null) {
			//
		} else {
			//
		}
	}
	
	// Required attribute
	@RequestMapping(value = {"/article", "/article/{id}"})
	public Article getArticle(@PathVariable(required = false) Integer articleId) {
	   if (articleId != null) {
		   //
	   } else {
		   //
	   }
	}
	
	// Optional<> type
	@RequestMapping(value = {"/article", "/article/{id}"}")
	public Article getArticle(@PathVariable Optional<Integer> optionalArticleId) {
		if (optionalArticleId.isPresent()) {
			Integer articleId = optionalArticleId.get();
			//
		} else {
			//
		}
	}

	// Map<,> type
	@RequestMapping(value = {"/article", "/article/{id}"})
	public Article getArticle(@PathVariable Map<String, String> pathVarsMap) {
		String articleId = pathVarsMap.get("id");
		if (articleId != null) {
			Integer articleIdAsInt = Integer.valueOf(articleId);
			//
		} else {
			//
		}
	}
	
	// Two methods
	@RequestMapping(value = "/article")
	public Article getDefaultArticle() {
		//
	}
	
	@RequestMapping(value = "/article/{id}")
	public Article getArticle(@PathVariable(name = "id") Integer articleId) {
		//      
	}

}
