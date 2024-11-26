/*
 * Copyright (C) 2024-2024 Sermant Authors. All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.sermant.demo.template;

import java.util.HashMap;

/**
 * simulate a backend service
 *
 * @author luanwenfei
 * @since 2024-11-29
 */
public class SimulateServer {
    public static void handleRequest(HashMap<String, String> body) {
        consume(body);
    }

    private static void consume(HashMap<String, String> body) {
        SimulateProvider.handleConsume(body);
    }
}
