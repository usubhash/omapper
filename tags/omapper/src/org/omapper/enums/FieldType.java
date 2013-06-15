/**
 * 
 */
package org.omapper.enums;

import org.apache.log4j.Logger;

/**
 * @author Sachin
 *
 */
public enum FieldType {
	
	JAVA,
	USER,
	ENUM,
	ARRAY,
	COLLECTION,
	MAP,
	/*This field type indicates that the field type is an interface or abstract which can not be instantiated and needs an implementation */
	TEMPLATE

}
