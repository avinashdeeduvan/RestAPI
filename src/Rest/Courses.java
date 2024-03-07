package Rest;

import java.util.List;

public class Courses {
	private List<Mobile> mobile  ;
	private List<WebAutomation> webAutomation ;
	private List<API> api  ;
	public List<API> getApi() {
		return api;
	}
	public void setApi(List<API> api) {
		this.api = api;
	}
	public List<Mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}
	public List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}
	public void setWebAutomation(List<WebAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}
	
	
	

}
