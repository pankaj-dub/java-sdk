/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.assistant.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * Contains information specific to a particular skill within the Assistant.
 */
public class MessageContextSkill extends GenericModel {

  @SerializedName("user_defined")
  private String userDefined;

  /**
   * Gets the userDefined.
   *
   * Arbitrary variables that can be read and written to by a particular skill within the Assistant.
   *
   * @return the userDefined
   */
  public String getUserDefined() {
    return userDefined;
  }
}
