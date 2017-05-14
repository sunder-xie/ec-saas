package com.yjg.ec.platform.auth.common;

import org.springframework.stereotype.Component;

import com.yjg.ec.platform.auth.api.AuthManager;
import com.yjg.ec.platform.auth.dto.LoginUser;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by zhangyunfei on 12/02/2017.
 */
@Component
public class UserUtil {

	@Resource
	private AuthManager authManager;

	private static ThreadLocal<LoginUser> loginUserThreadLocal = new ThreadLocal<>();

	public static LoginUser getCurrentLoginUser() {
		return loginUserThreadLocal.get();
	}

	public static Object getCurrentUserInfo() {
		return loginUserThreadLocal.get() == null ? null : loginUserThreadLocal.get().getUserInfo();
	}

	public static void setCurrentLoginUser(LoginUser loginUser) {
		loginUserThreadLocal.set(loginUser);
	}

	public void updateUserInfo(HttpSession session, Object object) {
		loginUserThreadLocal.get().setUserInfo(object);
		authManager.updateUserInfo(session.getId(), object);
	}
}
