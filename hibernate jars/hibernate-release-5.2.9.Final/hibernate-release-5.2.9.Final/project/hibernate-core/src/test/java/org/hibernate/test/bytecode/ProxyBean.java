/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.test.bytecode;


/**
 * Created by IntelliJ IDEA.
 * User: Paul
 * Date: Mar 9, 2007
 * Time: 11:31:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProxyBean {
	private String someString;
	private long someLong;


	public String getSomeString() {
		return someString;
	}

	public void setSomeString(String someString) {
		this.someString = someString;
	}


	public long getSomeLong() {
		return someLong;
	}

	public void setSomeLong(long someLong) {
		this.someLong = someLong;
	}
}
