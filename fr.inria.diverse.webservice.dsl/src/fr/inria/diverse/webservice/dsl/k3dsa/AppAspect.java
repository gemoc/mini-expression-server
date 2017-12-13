package fr.inria.diverse.webservice.dsl.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties;
import fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspect;
import fr.inria.diverse.webservice.dsl.k3dsa.UserAspect;
import fr.inria.diverse.webservice.dsl.model.App;
import fr.inria.diverse.webservice.dsl.model.Param;
import fr.inria.diverse.webservice.dsl.model.Service;
import fr.inria.diverse.webservice.dsl.model.User;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiConsumer;
import org.eclipse.gemoc.executionframework.engine.annotations.EventEmitter;
import org.eclipse.gemoc.executionframework.engine.annotations.EventHandler;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@Aspect(className = App.class)
@SuppressWarnings("all")
public class AppAspect {
  @Step
  @EventHandler
  public static void auth(final App _self, final String login, final String password) {
    final fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_auth(_self_, _self,login,password);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self, new Object[] {login,password}, command, "App", "auth");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Step
  @EventHandler
  public static void service(final App _self, final String token, final String service, final List<Param> params) {
    final fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_service(_self_, _self,token,service,params);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self, new Object[] {token,service,params}, command, "App", "service");
    } else {
    	command.execute();
    }
    ;;
  }
  
  private static void updateTimestamps(final App _self) {
    final fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectContext.getSelf(_self);
    _privk3_updateTimestamps(_self_, _self);;
  }
  
  @Step
  @EventEmitter
  public static void authSuccess(final App _self, final String token) {
    final fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_authSuccess(_self_, _self,token);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self, new Object[] {token}, command, "App", "authSuccess");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Step
  @EventEmitter
  public static void authFailure(final App _self) {
    final fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_authFailure(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self, new Object[] {_self}, command, "App", "authFailure");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Step
  @EventEmitter
  public static void result(final App _self, final String result) {
    final fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_result(_self_, _self,result);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self, new Object[] {result}, command, "App", "result");
    } else {
    	command.execute();
    }
    ;;
  }
  
  private static Map<User, Long> timestamps(final App _self) {
    final fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_timestamps(_self_, _self);;
    return (java.util.Map<fr.inria.diverse.webservice.dsl.model.User, java.lang.Long>)result;
  }
  
  private static long authTime(final App _self) {
    final fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_authTime(_self_, _self);;
    return (long)result;
  }
  
  private static List<String> es(final App _self) {
    final fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.AppAspectAppAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_es(_self_, _self);;
    return (java.util.List<java.lang.String>)result;
  }
  
  protected static void _privk3_auth(final AppAspectAppAspectProperties _self_, final App _self, final String login, final String password) {
    AppAspect.updateTimestamps(_self);
    final Function1<User, Boolean> _function = (User it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, login));
    };
    final User usr = IterableExtensions.<User>findFirst(_self.getUsers(), _function);
    if (((usr != null) && Objects.equal(usr.getPassword(), password))) {
      final int numberOfElements = 200;
      final ThreadLocalRandom rand = ThreadLocalRandom.current();
      final StringBuilder sb = new StringBuilder();
      for (int i = 0; (i < numberOfElements); i++) {
        {
          final int randomIndex = rand.nextInt(AppAspect.es(_self).size());
          sb.append(AppAspect.es(_self).get(randomIndex));
        }
      }
      final String token = sb.toString();
      UserAspect.token(usr, token);
      AppAspect.timestamps(_self).put(usr, Long.valueOf(new Date().getTime()));
      AppAspect.authSuccess(_self, token);
    } else {
      AppAspect.authFailure(_self);
    }
  }
  
  protected static void _privk3_service(final AppAspectAppAspectProperties _self_, final App _self, final String token, final String service, final List<Param> params) {
    AppAspect.updateTimestamps(_self);
    final Function1<Service, Boolean> _function = (Service it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, service));
    };
    final Service s = IterableExtensions.<Service>findFirst(_self.getServices(), _function);
    if (((s != null) && ListExtensions.<User, String>map(s.getAllowedUsers(), ((Function1<User, String>) (User it) -> {
      return token;
    })).contains(token))) {
      final Object result = ServiceAspect.execute(s, params);
      if ((result != null)) {
        AppAspect.result(_self, result.toString());
      } else {
        AppAspect.result(_self, "error");
      }
    } else {
      AppAspect.result(_self, "error");
    }
  }
  
  protected static void _privk3_updateTimestamps(final AppAspectAppAspectProperties _self_, final App _self) {
    final long time = new Date().getTime();
    final BiConsumer<User, Long> _function = (User usr, Long t) -> {
      long _authTime = AppAspect.authTime(_self);
      boolean _greaterThan = ((time - (t).longValue()) > _authTime);
      if (_greaterThan) {
        UserAspect.token(usr, "");
      }
    };
    AppAspect.timestamps(_self).forEach(_function);
  }
  
  protected static void _privk3_authSuccess(final AppAspectAppAspectProperties _self_, final App _self, final String token) {
  }
  
  protected static void _privk3_authFailure(final AppAspectAppAspectProperties _self_, final App _self) {
  }
  
  protected static void _privk3_result(final AppAspectAppAspectProperties _self_, final App _self, final String result) {
  }
  
  protected static Map<User, Long> _privk3_timestamps(final AppAspectAppAspectProperties _self_, final App _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTimestamps") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Map) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.timestamps;
  }
  
  protected static long _privk3_authTime(final AppAspectAppAspectProperties _self_, final App _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getAuthTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.authTime;
  }
  
  protected static List<String> _privk3_es(final AppAspectAppAspectProperties _self_, final App _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getEs") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.es;
  }
}
