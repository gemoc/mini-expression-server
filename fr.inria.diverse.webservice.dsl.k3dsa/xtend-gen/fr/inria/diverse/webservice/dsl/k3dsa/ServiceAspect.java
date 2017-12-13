package fr.inria.diverse.webservice.dsl.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.webservice.dsl.k3dsa.ServiceAspectServiceAspectProperties;
import fr.inria.diverse.webservice.dsl.model.Param;
import fr.inria.diverse.webservice.dsl.model.Service;
import java.lang.reflect.Method;
import java.util.List;
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
  
  protected static Object _privk3_execute(final ServiceAspectServiceAspectProperties _self_, final Service _self, final List<Param> parameters) {
    try {
      final String fqn = _self.getFqn();
      final int i = fqn.lastIndexOf(".");
      final String classFqn = fqn.substring(0, i);
      final String methodName = fqn.substring((i + 1));
      final Class<?> c = Class.forName(classFqn);
      final Function1<Method, Boolean> _function = (Method it) -> {
        String _name = it.getName();
        return Boolean.valueOf(Objects.equal(_name, methodName));
      };
      final Method m = IterableExtensions.<Method>findFirst(((Iterable<Method>)Conversions.doWrapArray(c.getMethods())), _function);
      final Function1<Param, String> _function_1 = (Param it) -> {
        return it.getValue();
      };
      return m.invoke(null, ListExtensions.<Param, String>map(parameters, _function_1));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
