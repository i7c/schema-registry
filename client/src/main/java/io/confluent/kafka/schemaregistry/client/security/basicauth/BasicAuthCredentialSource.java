/*
 * Copyright 2017 Confluent Inc.
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

package io.confluent.kafka.schemaregistry.client.security.basicauth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum BasicAuthCredentialSource {
  URL, USER_INFO, SASL_INHERIT, USERNAME_PASSWORD;
  public static final List<String> NAMES;

  static {
    List<String> names = new ArrayList<>(values().length);
    for (BasicAuthCredentialSource restAuthType : values()) {
      names.add(restAuthType.name());
    }
    NAMES = Collections.unmodifiableList(names);
  }
}
