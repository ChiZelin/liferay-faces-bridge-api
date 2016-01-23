/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.bridge.scope;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.liferay.faces.util.helper.Wrapper;


/**
 * @author  Neil Griffin
 */
public abstract class BridgeRequestScopeCacheWrapper implements BridgeRequestScopeCache,
	Wrapper<BridgeRequestScopeCache> {

	public void clear() {
		getWrapped().clear();
	}

	public boolean containsKey(Object key) {
		return getWrapped().containsKey(key);
	}

	public boolean containsValue(Object value) {
		return getWrapped().containsValue(value);
	}

	public Set<java.util.Map.Entry<String, BridgeRequestScope>> entrySet() {
		return getWrapped().entrySet();
	}

	public BridgeRequestScope get(Object key) {
		return getWrapped().get(key);
	}

	public Set<String> keySet() {
		return getWrapped().keySet();
	}

	public BridgeRequestScope put(String key, BridgeRequestScope value) {
		return getWrapped().put(key, value);
	}

	public void putAll(Map<? extends String, ? extends BridgeRequestScope> m) {
		getWrapped().putAll(m);
	}

	public BridgeRequestScope remove(Object key) {
		return getWrapped().remove(key);
	}

	public int size() {
		return getWrapped().size();
	}

	public Collection<BridgeRequestScope> values() {
		return getWrapped().values();
	}

	public abstract BridgeRequestScopeCache getWrapped();

	public boolean isEmpty() {
		return getWrapped().isEmpty();
	}
}
