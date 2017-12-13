DSL fr.inria.diverse.webservice.dsl.WebService {
	
	abstract-syntax {
		ecore = "platform:/resource/fr.inria.diverse.webservice.dsl.model/model/model.ecore"
	}
	
	semantic {
		k3 = "fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspect",
			"fr.inria.diverse.webservice.dsl.k3dsa.AppAspect",
			"fr.inria.diverse.webservice.dsl.k3dsa.UserAspect"
	}
}
