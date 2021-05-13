package com.sapient.chat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.chat.dao.UpdateProfileDAO;
import com.sapient.chat.entity.UpdateProfile;
import com.sapient.chat.exceptions.AgeLessThan18Exception;
import com.sapient.chat.exceptions.EmailNotValidException;
import com.sapient.chat.exceptions.NameTooSmallException;
import com.sapient.chat.exceptions.PasswordNotStrongException;
import com.sapient.chat.interfaces.IUpdateProfileDAO;

@RestController
@RequestMapping("/api")
public class UpdateProfileController {

	private IUpdateProfileDAO dao = new UpdateProfileDAO();

	@GetMapping("/healthy")
	public String health() {
		return "Update Profile Controller";
	}

	@PutMapping("/changeEmail/{userId}")
	public boolean changeEmail(@PathVariable int userId, @RequestBody String email) {
		try {
			return dao.updateEmail(userId, email);
		} catch (EmailNotValidException e) {
			e.printStackTrace();
		}
		return false;
	}

	@PutMapping("changeName/{userId}")
	public boolean changeName(@PathVariable int userId, @RequestBody UpdateProfile updateProfile) {
		try {

			return dao.updateName(userId, updateProfile.getName());
		} catch (NameTooSmallException e) {
			e.printStackTrace();
		}
		return false;
	}

	@PutMapping("changePassword/{userId}")
	public boolean changePassword(@PathVariable int userId, @RequestBody UpdateProfile updateProfile) {
		try {
			return dao.updatePassword(userId, updateProfile.getPassword());
		} catch (PasswordNotStrongException e) {
			e.printStackTrace();
		}
		return false;
	}

	@PutMapping("changeDOB/{userId}")
	public boolean changeDOB(@PathVariable int userId, @RequestBody UpdateProfile updateProfile) {
		try {
			return dao.updateDOB(userId, updateProfile.getDob());
		} catch (AgeLessThan18Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
