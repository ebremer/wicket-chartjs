/*******************************************************************************
 * Copyright 2013 Martin Spielmann
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package de.martinspielmann.wicket.chartjs.data.dataset;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;
import de.martinspielmann.wicket.chartjs.data.dataset.property.data.Data;

/**
 * The Class AbstractDataset provides the simplest kind of a dataset. besides the list of data
 * itself, it contains default values for fill- and stroke color.
 * 
 * @author Martin Spielmann
 */
public class AbstractDataset implements Serializable {

  private static final long serialVersionUID = 1L;

  private ChartType type;
  private String label;
  private Data data;

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public ChartType getType() {
    return type;
  }

  public void setType(ChartType type) {
    this.type = type;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

}
