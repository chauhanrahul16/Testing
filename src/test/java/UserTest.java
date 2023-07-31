import com.javafortesters.domainentities.User;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest
{
    User user= new User("admin", "password");

    @Test
    public void newUserConstructor()
    {
        User user= new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        Assert.assertEquals("username",user.getUsername());
        Assert.assertEquals("password", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        Assert.assertEquals("admin", user.getUsername());
        Assert.assertEquals("password",user.getPassword());
    }

}
