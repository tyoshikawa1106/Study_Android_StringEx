
package tyoshikawa1106.studty.stringex;
import android.os.Bundle;
import android.app.Activity;
import android.view.Window;

public class StringEx extends Activity {
    
    @Override
    protected void onCreate(Bundle include) {
        super.onCreate(include);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new StringView(this));
    }
}
