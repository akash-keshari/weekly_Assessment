package com.springBoot.service.serviceImpl;


@Component
public class SigninImpl implements SignSer{
@Autowired
signinRepo repo;

@Override
public String signin(Signup s) {
	// TODO Auto-generated method stub
	repo.save(s);
	return "Signin Successfull";
}

@Override
public List<Signup> showdet() {
	// TODO Auto-generated method stub
	return repo.findAll();
}

@Override
public String update(Signup s) {
	// TODO Auto-generated method stub
	repo.save(s);
	return "Update Successfull";
}

@Override
public String delete(long id) {
	// TODO Auto-generated method stub
	repo.deleteById(id);
	return "Data deleted";
}
	
}