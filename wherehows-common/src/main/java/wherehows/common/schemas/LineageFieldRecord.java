/**
 * Copyright 2015 LinkedIn Corp. All rights reserved.
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
 */
package wherehows.common.schemas;

import java.util.List;


public class LineageFieldRecord extends AbstractRecord {

  String fieldPath;
  List<LineageFieldMapRecord> mappedToFields;

  public LineageFieldRecord() {
  }

  @Override
  public List<Object> fillAllFields() {
    return null;
  }

  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public List<LineageFieldMapRecord> getMappedToFields() {
    return mappedToFields;
  }

  public void setMappedToFields(List<LineageFieldMapRecord> mappedToFields) {
    this.mappedToFields = mappedToFields;
  }
}
