/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
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
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.plugin.jdbc.h2.define;

/**
 * {@link JdbcConnectionInstrumentation} presents that skywalking intercepts {@link org.h2.jdbc.JdbcConnection}.
 *
 * @author zhangxin
 */
public class JdbcConnectionInstrumentation extends AbstractConnectionInstrumentation {
    public static final String ENHANCE_CLASS = "org.h2.jdbc.JdbcConnection";

    @Override public String getEnhanceClass() {
        return ENHANCE_CLASS;
    }
}
