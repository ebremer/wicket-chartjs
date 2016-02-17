/*******************************************************************************
 * Copyright 2013 Martin Spielmann
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.core.js.ChartType;
import com.pingunaut.wicket.chartjs.data.DoughnutChartData;

/**
 * The Class DoughnutChartPanel provides a simple implementation of chart.js
 * doughnut chart
 *
 * @see <a href="http://www.chartjs.org/docs/#doughnutChart">chart.js docs</a>
 *
 * @author Martin Spielmann
 *
 */
public class DoughnutChartPanel extends ChartPanel {

   public DoughnutChartPanel(String id, IModel<DoughnutChartData> model) {
		super(id, ChartType.DOUGHNUT, model);
	}


}
