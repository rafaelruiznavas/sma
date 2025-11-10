package common;


public class ArgumentParser {

	public class ArgumentsProxy {
		public final int port;
		public final boolean looseRouting;
		public final boolean debug;
		
		public ArgumentsProxy(int port, boolean looseRouting, boolean debug) {
			super();
			this.port = port;
			this.looseRouting = looseRouting;
			this.debug = debug;
		}
	}
	
	public class ArgumenstUA {
		public final String userSIP;
		public final int portUA;
		public final String ipProxy;
		public final boolean debug;
		
		public ArgumenstUA(String userSIP, int portUA, String ipProxy, boolean debug) {
			super();
			this.userSIP = userSIP;
			this.portUA = portUA;
			this.ipProxy = ipProxy;
			this.debug = debug;
		}		
	}
}


