package model;

import java.util.HashSet;
import java.util.Set;

public class DBAdmin implements AdminServices {

	
	
	@Override
	public Admin findAdmin(int id) {
		
		return getMockAdmin( (int)(Math.random()*10000), "Pedro");
	}

	private Admin getMockAdmin(int i, String name) {
		Admin admin = new Admin();
		admin.setName(name);
		return null;
	}

	@Override
	public Set<Admin> findAllAdmin() {
		int size = (int) (Math.random()*100);
		HashSet<Admin> list = new HashSet<>(size);
		
		for(int i=0; i<size; i++)
			list.add(getMockAdmin(i,"NoName" + i));
		
		return null;
	}

}
