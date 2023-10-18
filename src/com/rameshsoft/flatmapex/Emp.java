package com.rameshsoft.flatmapex;

import java.util.List;

public class Emp {

		String name;
		List<Long> phones;
		public Emp(String name, List<Long> phones) {
			super();
			this.name = name;
			this.phones = phones;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Long> getPhones() {
			return phones;
		}
		public void setPhones(List<Long> phones) {
			this.phones = phones;
		}
		
}
