/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.atmosphere.websocket.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Expose WebSocket endpoints using the Atmosphere framework.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.atmosphere-websocket")
public class WebsocketComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the atmosphere-websocket
     * component. This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Default name of servlet to use. The default name is CamelServlet.
     */
    private String servletName = "CamelServlet";
    /**
     * Whether to automatic bind multipart/form-data as attachments on the Camel
     * Exchange. The options attachmentMultipartBinding=true and
     * disableStreamCache=false cannot work together. Remove disableStreamCache
     * to use AttachmentMultipartBinding. This is turn off by default as this
     * may require servlet specific configuration to enable this when using
     * Servlet's.
     */
    private Boolean attachmentMultipartBinding = false;
    /**
     * Whitelist of accepted filename extensions for accepting uploaded files.
     * Multiple extensions can be separated by comma, such as txt,xml.
     */
    private String fileNameExtWhitelist;
    /**
     * To use a custom org.apache.camel.component.servlet.HttpRegistry. The
     * option is a org.apache.camel.component.servlet.HttpRegistry type.
     */
    private String httpRegistry;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Whether to allow java serialization when a request uses
     * context-type=application/x-java-serialized-object. This is by default
     * turned off. If you enable this then be aware that Java will deserialize
     * the incoming data from the request to Java and that can be a potential
     * security risk.
     */
    private Boolean allowJavaSerializedObject = false;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * To use a custom HttpBinding to control the mapping between Camel message
     * and HttpClient. The option is a org.apache.camel.http.common.HttpBinding
     * type.
     */
    private String httpBinding;
    /**
     * To use the shared HttpConfiguration as base configuration. The option is
     * a org.apache.camel.http.common.HttpConfiguration type.
     */
    private String httpConfiguration;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message. The option is a
     * org.apache.camel.spi.HeaderFilterStrategy type.
     */
    private String headerFilterStrategy;

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public Boolean getAttachmentMultipartBinding() {
        return attachmentMultipartBinding;
    }

    public void setAttachmentMultipartBinding(Boolean attachmentMultipartBinding) {
        this.attachmentMultipartBinding = attachmentMultipartBinding;
    }

    public String getFileNameExtWhitelist() {
        return fileNameExtWhitelist;
    }

    public void setFileNameExtWhitelist(String fileNameExtWhitelist) {
        this.fileNameExtWhitelist = fileNameExtWhitelist;
    }

    public String getHttpRegistry() {
        return httpRegistry;
    }

    public void setHttpRegistry(String httpRegistry) {
        this.httpRegistry = httpRegistry;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getAllowJavaSerializedObject() {
        return allowJavaSerializedObject;
    }

    public void setAllowJavaSerializedObject(Boolean allowJavaSerializedObject) {
        this.allowJavaSerializedObject = allowJavaSerializedObject;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getHttpBinding() {
        return httpBinding;
    }

    public void setHttpBinding(String httpBinding) {
        this.httpBinding = httpBinding;
    }

    public String getHttpConfiguration() {
        return httpConfiguration;
    }

    public void setHttpConfiguration(String httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
    }

    public String getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(String headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }
}