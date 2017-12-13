package fr.inria.diverse.webservice.dsl.k3dsa;

import fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties;
import fr.inria.diverse.webservice.dsl.model.App;
import java.util.Map;

@SuppressWarnings("all")
public class AppAspectAppAspectContext {
  public final static AppAspectAppAspectContext INSTANCE = new AppAspectAppAspectContext();
  
  public static AppAspectAppAspectProperties getSelf(final App _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<App, AppAspectAppAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.webservice.dsl.model.App, fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties>();
  
  public Map<App, AppAspectAppAspectProperties> getMap() {
    return map;
  }
}
