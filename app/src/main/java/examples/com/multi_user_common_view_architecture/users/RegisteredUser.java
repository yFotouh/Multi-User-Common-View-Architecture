package examples.com.multi_user_common_view_architecture.users;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by youssef2016 on 31/1/2018.
 */

public class RegisteredUser extends BaseUserAction {

    @Override
    public void Button1Pressed() {
        Toast.makeText(context, sentence + btn1, Toast.LENGTH_LONG).show();
    }

    @Override
    public void Button2Pressed() {
        Toast.makeText(context, sentence + btn2, Toast.LENGTH_LONG).show();
    }

    @Override
    public void Button3Pressed() {
        Toast.makeText(context, sentence + btn3, Toast.LENGTH_LONG).show();
    }
}
