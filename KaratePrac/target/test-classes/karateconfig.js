function fn() {

	karate.configure("ssl",true);
	
	
	var config = {};
	var endpoint;
	var env = karate.properties["karate.environment"];
	
	karate.log(env);
	
	switch (env) {
		case "retrive":
			endpoint = "http://vmo.claimsconnect.services.zurichna.com/ClaimService/rest/Claims/retrieveLossEvent";
			break;
		case "int":
			endpoint = "https://int.sample.url/";
			break;
		case "qa":
			endpoint = "https://qa.sample.url/";
			break;
		default:
			endpoint = "https://default.sample.url/";
	}
	config.ENDPOINT = endpoint
	
	return config;

}