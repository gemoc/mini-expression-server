package fr.inria.diverse.webservice.dsl.k3dsa;

import fr.inria.diverse.webservice.dsl.model.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class AppAspectAppAspectProperties {
  public final Map<User, Long> timestamps = new HashMap<User, Long>();
  
  public final long authTime = (60 * 1000);
  
  public final List<String> es = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("a", "b", "c"));
  
  public final int tokenLength = 20;
}
