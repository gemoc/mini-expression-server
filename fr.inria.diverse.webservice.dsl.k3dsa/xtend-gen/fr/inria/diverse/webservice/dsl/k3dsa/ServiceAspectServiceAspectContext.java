package fr.inria.diverse.webservice.dsl.k3dsa;

import fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspectServiceAspectProperties;
import fr.inria.diverse.webservice.dsl.model.Service;
import java.util.Map;

@SuppressWarnings("all")
public class ServiceAspectServiceAspectContext {
  public final static ServiceAspectServiceAspectContext INSTANCE = new ServiceAspectServiceAspectContext();
  
  public static ServiceAspectServiceAspectProperties getSelf(final Service _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspectServiceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Service, ServiceAspectServiceAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.webservice.dsl.model.Service, fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspectServiceAspectProperties>();
  
  public Map<Service, ServiceAspectServiceAspectProperties> getMap() {
    return map;
  }
}
