package fr.inria.diverse.webservice.dsl.k3dsa;

import fr.inria.diverse.webservice.dsl.model.User;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class AppAspectAppAspectProperties {
  public final Map<User, Long> timestamps = new HashMap<User, Long>();
  
  public final long authTime = (60 * 1000);
}
