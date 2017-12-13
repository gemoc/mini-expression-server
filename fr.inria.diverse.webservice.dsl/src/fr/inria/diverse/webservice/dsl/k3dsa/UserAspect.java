package fr.inria.diverse.webservice.dsl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.webservice.dsl.k3dsa.UserAspectUserAspectProperties;
import fr.inria.diverse.webservice.dsl.model.User;

@Aspect(className = User.class)
@SuppressWarnings("all")
public class UserAspect {
  public static String token(final User _self) {
    final fr.inria.diverse.webservice.dsl.k3dsa.UserAspectUserAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.UserAspectUserAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_token(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static void token(final User _self, final String token) {
    final fr.inria.diverse.webservice.dsl.k3dsa.UserAspectUserAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.UserAspectUserAspectContext.getSelf(_self);
    _privk3_token(_self_, _self,token);;
  }
  
  protected static String _privk3_token(final UserAspectUserAspectProperties _self_, final User _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getToken") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.token;
  }
  
  protected static void _privk3_token(final UserAspectUserAspectProperties _self_, final User _self, final String token) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setToken")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, token);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.token = token;
    }
  }
}
