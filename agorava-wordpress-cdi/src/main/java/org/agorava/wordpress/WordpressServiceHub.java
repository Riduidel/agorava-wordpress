/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.wordpress;

import org.agorava.core.cdi.AbstractSocialMediaApiHub;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * @author ndx
 */
public class WordpressServiceHub extends AbstractSocialMediaApiHub {
    public static final String MEDIA_NAME = "StackExchange";


    @Inject
    Instance<WordpressBaseService> services;

    @Override
    public String getSocialMediaName() {
        return MEDIA_NAME;
    }


}
