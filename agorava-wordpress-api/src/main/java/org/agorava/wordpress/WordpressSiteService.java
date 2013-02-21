package org.agorava.wordpress;

import org.agorava.wordpress.model.Site;

/**
 * Get infos about sites ...
 * @see http://developer.wordpress.com/docs/api/1/get/sites/%24site/
 * @author Nicolas
 *
 */
public interface WordpressSiteService {
	public Site getSite(String siteUrl);
	public Site getSite(int siteId);
}
