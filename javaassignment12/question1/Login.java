package javaassignment12.question1;

abstract class Login {
	public abstract boolean checkUser(String name,String password);

}
class checkValidation extends Login{
    private AuthorizedUser authuser=new AuthorizedUser();

	public boolean checkUser(String name, String password) {
		  if(name.equals(authuser.getName())){
			  if(password.equals(authuser.getPassword())) {
				  return true;
			  }
		  }
		  return false;
	}
}