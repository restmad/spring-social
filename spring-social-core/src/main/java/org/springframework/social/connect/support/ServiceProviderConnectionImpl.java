/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.connect.support;

import java.io.Serializable;

import org.springframework.social.connect.ServiceProviderConnection;

public class ServiceProviderConnectionImpl<S> implements ServiceProviderConnection<S> {

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Serializable getAccountId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProviderId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProviderAccountId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProfileName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProfileUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProfilePictureUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean supportsSignIn() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean test() {
		// TODO Auto-generated method stub
		return false;
	}

	public void updateStatus(String message) {
		// TODO Auto-generated method stub
	}

	public void sync() {
		// TODO Auto-generated method stub
		
	}

	public S getServiceApi() {
		// TODO Auto-generated method stub
		return null;
	}

	public ServiceProviderConnection<S> assignAccountId(Serializable accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}