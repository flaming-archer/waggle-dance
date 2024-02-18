/**
 * Copyright (C) 2016-2024 Expedia, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hotels.bdp.waggledance.util;

import java.util.concurrent.ConcurrentHashMap;

public class DlgHelper {

  private static ConcurrentHashMap<String, String> cache = new ConcurrentHashMap();

  public static void addToken(String tokenSig, String token) {
    cache.put(tokenSig, token);
  }

  public static String getToken(String tokenSig) {
    return cache.get(tokenSig);
  }
}
