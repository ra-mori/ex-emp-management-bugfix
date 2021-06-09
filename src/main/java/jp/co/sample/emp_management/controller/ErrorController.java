package jp.co.sample.emp_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.emp_management.form.LoginForm;

/**
 * エラー時処理をまとめたコントローラ.
 * 
 * @author shigeki.morishita
 *
 */
@Controller
@RequestMapping("/error")
public class ErrorController {
	/**
	 * 使用するフォームオブジェクトをリクエストスコープに格納する.
	 * 
	 * @return フォーム
	 */
	@ModelAttribute
	public LoginForm setUpLoginForm() {
		return new LoginForm();
	}

	/**
	 * ログインページにもどる.
	 * 
	 * @return 指定したページ
	 */
	@RequestMapping("/tologinpage")
	public String toLoginPage() {
		return "/administrator/login";
	}
}
