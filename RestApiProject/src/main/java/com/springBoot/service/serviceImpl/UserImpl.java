package com.springBoot.service.serviceImpl;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springBoot.entities.SignUp;
import com.springBoot.repository.UserRepo;
import com.springBoot.service.SignSer;

@Component
class UserImpl implements UserSer{
@Autowired
UserRepo usre;

@Autowired
SignSer serv;

	@Override
	public String use(User s) {
		// TODO Auto-generated method stub
		usre.save(s);
		return "Data Added";
	}

	@Override
	public List<User> showdet() {
		// TODO Auto-generated method stub
		return usre.findAll();
	}

	@Override
	public String update(User s) {
		// TODO Auto-generated method stub
		usre.save(s);
		return "Data Updated";
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		usre.deleteById(id);
		return "Data Deleted";
	}

	@Override
	public String sucessSignin(long id, String email, String pass) {
		// TODO Auto-generated method stub
		List<SignUp> sign = serv.showdet();
		for (SignUp s : sign) {
			System.out.println("i am in for");
			System.out.println(s);
			if (s.getId() == id && s.getEmail().equals(email) && s.getPass().equals(pass)) {
				System.out.println("i am in if");
				return "Login Success";
			}
		}
		return "invalid login";
	}
	


	}