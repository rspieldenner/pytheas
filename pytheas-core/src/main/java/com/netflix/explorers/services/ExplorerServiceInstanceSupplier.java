/**
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.explorers.services;

import com.google.common.base.Supplier;

public class ExplorerServiceInstanceSupplier<T> implements Supplier<T> {
    private final T instance;
    
    public ExplorerServiceInstanceSupplier(T instance) {
        this.instance = instance;
    }

    @Override
    public T get() {
        return instance;
    }
}
