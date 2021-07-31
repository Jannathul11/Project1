package org.sample;

import org.base.BaseParent;
import org.pojo.Facebk;

public class Fb extends BaseParent {

	public static void main(String[] args) {
		
		chromeBrowserLaunch();
		launchUrl("https://en-gb.facebook.com/");
		toMaximize();
		
		Facebk f=new Facebk();
		toInput(f.getTxtUser(),"Arshi");
		toInput(f.getTxtPass(), "3445");
		toClick(f.getLogIn());

	}

}
