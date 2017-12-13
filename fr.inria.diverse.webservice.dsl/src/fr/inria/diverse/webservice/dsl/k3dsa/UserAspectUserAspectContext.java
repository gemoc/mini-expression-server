package fr.inria.diverse.webservice.dsl.k3dsa;

import fr.inria.diverse.webservice.dsl.k3dsa.UserAspectUserAspectProperties;
import fr.inria.diverse.webservice.dsl.model.User;
import java.util.Map;

@SuppressWarnings("all")
public class UserAspectUserAspectContext {
  public final static UserAspectUserAspectContext INSTANCE = new UserAspectUserAspectContext();
  
  public static UserAspectUserAspectProperties getSelf(final User _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.webservice.dsl.k3dsa.UserAspectUserAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<User, UserAspectUserAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.webservice.dsl.model.User, fr.inria.diverse.webservice.dsl.k3dsa.UserAspectUserAspectProperties>();
  
  public Map<User, UserAspectUserAspectProperties> getMap() {
    return map;
  }
}
