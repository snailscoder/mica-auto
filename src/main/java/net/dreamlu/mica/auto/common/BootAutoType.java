/*
 * Copyright (c) 2019-2029, Dreamlu 卢春梦 (596392912@qq.com & www.dreamlu.net).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dreamlu.mica.auto.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.dreamlu.mica.auto.annotation.*;

/**
 * 注解类型
 *
 * @author L.cm
 */
@Getter
@RequiredArgsConstructor
public enum BootAutoType {

	/**
	 * Component，组合注解，添加到 spring.factories
	 */
	COMPONENT("org.springframework.stereotype.Component", "org.springframework.boot.autoconfigure.EnableAutoConfiguration"),
	/**
	 * ApplicationContextInitializer 添加到 spring.factories
	 */
	CONTEXT_INITIALIZER(AutoContextInitializer.class.getName(), "org.springframework.context.ApplicationContextInitializer"),
	/**
	 * ApplicationListener 添加到 spring.factories
	 */
	LISTENER(AutoListener.class.getName(), "org.springframework.context.ApplicationListener"),
	/**
	 * SpringApplicationRunListener 添加到 spring.factories
	 */
	RUN_LISTENER(AutoRunListener.class.getName(), "org.springframework.boot.SpringApplicationRunListener"),
	/**
	 * EnvironmentPostProcessor 添加到 spring.factories
	 */
	ENV_POST_PROCESSOR(AutoEnvPostProcessor.class.getName(), "org.springframework.boot.env.EnvironmentPostProcessor"),
	/**
	 * FailureAnalyzer 添加到 spring.factories
	 */
	FAILURE_ANALYZER(AutoFailureAnalyzer.class.getName(), "org.springframework.boot.diagnostics.FailureAnalyzer"),
	/**
	 * AutoConfigurationImportFilter spring.factories
	 */
	AUTO_CONFIGURATION_IMPORT_FILTER(AutoConfigImportFilter.class.getName(), "org.springframework.boot.autoconfigure.AutoConfigurationImportFilter"),
	/**
	 * TemplateAvailabilityProvider 添加到 spring.factories
	 */
	TEMPLATE_AVAILABILITY_PROVIDER(AutoTemplateProvider.class.getName(), "org.springframework.boot.autoconfigure.template.TemplateAvailabilityProvider");

	private final String annotation;
	private final String configureKey;

}
