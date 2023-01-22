package com.driver.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.driver.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driver.model.Admin;
import com.driver.model.Customer;
import com.driver.model.Driver;
import com.driver.repository.AdminRepository;
import com.driver.repository.CustomerRepository;
import com.driver.repository.DriverRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository1;

	@Autowired
	DriverRepository driverRepository1;

	@Autowired
	CustomerRepository customerRepository1;

	@Override
	public void adminRegister(Admin admin) {
		//Save the admin in the database
		adminRepository1.save(admin);
	}

	@Override
	public Admin updatePassword(Integer adminId, String password) {
		//Update the password of admin with given id
		Admin newAdmin = adminRepository1.getOne(adminId);
		newAdmin.setPassword(password);
		return newAdmin;

	}

	@Override
	public void deleteAdmin(int adminId){
		// Delete admin without using deleteById function

	}

	@Override
	public List<Driver> getListOfDrivers() {
		//Find the list of all drivers
		List<Driver> drivers = new ArrayList<>();
		return drivers;

	}

	@Override
	public List<Customer> getListOfCustomers() {
		//Find the list of all customers
		List<Customer> customers= new ArrayList<>();

		return customers;
	}

}
