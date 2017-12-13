package fr.inria.diverse.webservice.dsl.k3dsa;

import com.vdurmont.emoji.Emoji;
import com.vdurmont.emoji.EmojiManager;
import fr.inria.diverse.webservice.dsl.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class AppAspectAppAspectProperties {
  public final Map<User, Long> timestamps = new HashMap<User, Long>();
  
  public final long authTime = (60 * 1000);
  
  public final List<String> es = IterableExtensions.<String>toList(IterableExtensions.<Emoji, String>map(EmojiManager.getAll(), ((Function1<Emoji, String>) (Emoji it) -> {
    return it.getUnicode();
  })));
  
  public final int tokenLength = 20;
}
