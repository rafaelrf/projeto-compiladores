/*
* generated by Xtext
*/
package org.myModel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CSharpStandaloneSetup extends CSharpStandaloneSetupGenerated{

	public static void doSetup() {
		new CSharpStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

