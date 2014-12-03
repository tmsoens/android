/* This file has been automatically generated; do not edit */

package org.meshpoint.anode.stub.gen.platform;

public final class Com_tpvision_gpiitvproxy_TVSettings {

	private static Object[] __args = new Object[3];

	public static Object[] __getArgs() { return __args; }

	static Object __invoke(com.tpvision.gpiitvproxy.TVSettings inst, int opIdx, Object[] args) {
		Object result = null;
		switch(opIdx) {
		case 0: /* get */
			result = inst.get(
				(String)args[0],
				(String)args[1]
			);
			break;
		case 1: /* set */
			result = inst.set(
				(String)args[0],
				(String)args[1],
				(String)args[2]
			);
			break;
		default:
		}
		return result;
	}

}
