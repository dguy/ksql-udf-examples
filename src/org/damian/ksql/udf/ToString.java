/*
 * Copyright 2018 Confluent Inc.
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
 **/

package org.damian.ksql.udf;

import java.util.Map;

import io.confluent.ksql.function.udf.Udf;
import io.confluent.ksql.function.udf.UdfDescription;


@UdfDescription(name = "tostring", description = "converts things to a string")
public class ToString {

  @Udf(description = "returns the string argument")
  public String fromString(final String value) {return value;}

  @Udf(description = "returns the string value of the map")
  public String fromMap(final Map<String, Integer> value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  @Udf(description = "returns the string value of the integer")
  public String fromInt(final Integer value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  @Udf(description = "returns the string value of the long")
  public String fromLong(final Long value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

}
