// tag::copyright[]
/*******************************************************************************
 * Copyright (c) 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - Initial implementation
 *******************************************************************************/
// end::copyright[]
package io.openliberty.guides.query;

import java.util.List;

import org.eclipse.microprofile.config.inject.ConfigProperties;

import jakarta.enterprise.context.Dependent;

// tag::prefix[]
@ConfigProperties(prefix = "system")
// end::prefix[]
@Dependent
public class ConfigSystemBean {

    public int httpPort;
    public String user;
    public String password;
    public String userPassword;
    public String contextRoot;
    public List<String> properties;

}
