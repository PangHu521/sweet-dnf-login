package com.sweet.simple.login;

import com.sweet.simple.login.util.SpringContextUtil;
import com.sweet.simple.login.view.LoginSwing;

import java.awt.*;

public class ViewStart {
	
	public static void run() {
		EventQueue.invokeLater(() -> SpringContextUtil.getBean(LoginSwing.class).setVisible(true));
	}
}
