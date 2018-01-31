package examples.com.multi_user_common_view_architecture.users;

import android.content.Context;

import examples.com.multi_user_common_view_architecture.AppClass;

/**
 * Created by youssef2016 on 31/1/2018.
 */

public abstract class BaseUserAction implements IUserAction {
    protected Context context = AppClass.getAppClass();
    protected String className = this.getClass().getSimpleName();
    protected String btn1 = "Button 1";
    protected String btn2 = "Button 2";
    protected String btn3 = "Button 3";
    protected String pressedKeyword = " pressed ";
    protected String sentence = className + pressedKeyword;

}
