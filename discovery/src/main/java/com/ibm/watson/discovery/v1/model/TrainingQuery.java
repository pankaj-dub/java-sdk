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
package com.ibm.watson.discovery.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * TrainingQuery.
 */
public class TrainingQuery extends GenericModel {

  @SerializedName("query_id")
  private String queryId;
  @SerializedName("natural_language_query")
  private String naturalLanguageQuery;
  private String filter;
  private List<TrainingExample> examples;

  /**
   * Gets the queryId.
   *
   * @return the queryId
   */
  public String getQueryId() {
    return queryId;
  }

  /**
   * Gets the naturalLanguageQuery.
   *
   * @return the naturalLanguageQuery
   */
  public String getNaturalLanguageQuery() {
    return naturalLanguageQuery;
  }

  /**
   * Gets the filter.
   *
   * @return the filter
   */
  public String getFilter() {
    return filter;
  }

  /**
   * Gets the examples.
   *
   * @return the examples
   */
  public List<TrainingExample> getExamples() {
    return examples;
  }
}