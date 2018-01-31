package examples.com.multi_user_common_view_architecture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;
import examples.com.multi_user_common_view_architecture.users.RegisteredUser;
import examples.com.multi_user_common_view_architecture.users.UnRegisteredUser;
import examples.com.multi_user_common_view_architecture.users.UserReference;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.unregistered_user)
    public void unRegisteredUser() {
        UserReference.setCurrentUser(new UnRegisteredUser());
    }

    @OnClick(R.id.registered_user)
    public void registeredUser() {
        UserReference.setCurrentUser(new RegisteredUser());
    }

    @OnClick(R.id.btn1)
    public void btn1Clicked() {
        UserReference.getCurrentUser().Button1Pressed();
    }

    @OnClick(R.id.btn1)
    public void btn2Clicked() {
        UserReference.getCurrentUser().Button2Pressed();
    }

    @OnClick(R.id.btn1)
    public void btn3Clicked() {
        UserReference.getCurrentUser().Button3Pressed();
    }
}
