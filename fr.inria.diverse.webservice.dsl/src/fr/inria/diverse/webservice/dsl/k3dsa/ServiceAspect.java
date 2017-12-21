package fr.inria.diverse.webservice.dsl.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspectServiceAspectProperties;
import fr.inria.diverse.webservice.dsl.model.Param;
import fr.inria.diverse.webservice.dsl.model.Service;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@Aspect(className = Service.class)
@SuppressWarnings("all")
public class ServiceAspect {
  @Step
  public static Object execute(final Service _self, final List<Param> parameters) {
    final fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspectServiceAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspectServiceAspectContext.getSelf(_self);
    Object result = null;
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		addToResult(_privk3_execute(_self_, _self,parameters));
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self, new Object[] {parameters}, command, "Service", "execute");
    } else {
    	command.execute();
    }
    result = command.getResult();
    ;;
    return (java.lang.Object)result;
  }
  
  private static Object service(final Service _self) {
    final fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspectServiceAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspectServiceAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_service(_self_, _self);;
    return (java.lang.Object)result;
  }
  
  private static void service(final Service _self, final Object service) {
    final fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspectServiceAspectProperties _self_ = fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspectServiceAspectContext.getSelf(_self);
    _privk3_service(_self_, _self,service);;
  }
  
  protected static Object _privk3_execute(final ServiceAspectServiceAspectProperties _self_, final Service _self, final List<Param> parameters) {
    try {
      final Function1<Param, String> _function = (Param it) -> {
        return it.getName();
      };
      boolean _containsAll = _self.getAcceptedParams().containsAll(ListExtensions.<Param, String>map(parameters, _function));
      if (_containsAll) {
        final Function1<String, String> _function_1 = (String p) -> {
          final Function1<Param, Boolean> _function_2 = (Param it) -> {
            String _name = it.getName();
            return Boolean.valueOf(Objects.equal(p, _name));
          };
          return IterableExtensions.<Param>findFirst(parameters, _function_2).getValue();
        };
        final List<String> params = ListExtensions.<String, String>map(_self.getAcceptedParams(), _function_1);
        final String methodName = _self.getMethodName();
        if ((methodName != null)) {
          Object _service = ServiceAspect.service(_self);
          boolean _tripleEquals = (_service == null);
          if (_tripleEquals) {
            final Function1<IConfigurationElement, Boolean> _function_2 = (IConfigurationElement it) -> {
              String _attribute = it.getAttribute("name");
              String _name = _self.getName();
              return Boolean.valueOf(Objects.equal(_attribute, _name));
            };
            final IConfigurationElement confElt = IterableExtensions.<IConfigurationElement>findFirst(((Iterable<IConfigurationElement>)Conversions.doWrapArray(Platform.getExtensionRegistry().getConfigurationElementsFor(
              "org.gemoc.diverseminar2017.service"))), _function_2);
            ServiceAspect.service(_self, confElt.createExecutableExtension("class"));
          }
          try {
            final Class<?> c = ServiceAspect.service(_self).getClass();
            final Function1<Method, Boolean> _function_3 = (Method it) -> {
              String _name = it.getName();
              return Boolean.valueOf(Objects.equal(_name, methodName));
            };
            final Method m = IterableExtensions.<Method>findFirst(((Iterable<Method>)Conversions.doWrapArray(c.getMethods())), _function_3);
            if ((m != null)) {
              boolean _isStatic = Modifier.isStatic(m.getModifiers());
              if (_isStatic) {
                return m.invoke(null, params.toArray());
              } else {
                return m.invoke(ServiceAspect.service(_self), params.toArray());
              }
            }
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              final Exception e = (Exception)_t;
              e.printStackTrace();
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static Object _privk3_service(final ServiceAspectServiceAspectProperties _self_, final Service _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getService") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Object) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.service;
  }
  
  protected static void _privk3_service(final ServiceAspectServiceAspectProperties _self_, final Service _self, final Object service) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setService")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, service);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.service = service;
    }
  }
}
