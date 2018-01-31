package examples.com.multi_user_common_view_architecture.users;

/**
 * Created by youssef2016 on 31/1/2018.
 */

public class UserReference {
    private static IUserAction iUserAction;

    public static final IUserAction getCurrentUser() {
        if (iUserAction == null) {
/*
default user
 */
            iUserAction = new UnRegisteredUser();
            return iUserAction;
        } else
            return iUserAction;
    }

    public static final void setCurrentUser(IUserAction iUserAction) {
        UserReference.iUserAction = iUserAction;
    }
}
