

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.softwareag.util.IDataMap;
// --- <<IS-END-IMPORTS>> ---

public final class JavaServices

{
	// ---( internal utility methods )---

	final static JavaServices _instance = new JavaServices();

	static JavaServices _newInstance() { return new JavaServices(); }

	static JavaServices _cast(Object o) { return (JavaServices)o; }

	// ---( server methods )---




	public static final void myfirstjavaservices (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(myfirstjavaservices)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inputString
		// [o] field:0:required OutputString
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	inputString = IDataUtil.getString( pipelineCursor, "inputString" );
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "OutputString", inputString );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void mysecondjavaservices (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(mysecondjavaservices)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inputString
		// [o] field:0:required outpputString
		IDataMap idm = new IDataMap(pipeline);
		String inputString = idm.getAsNonEmptyString("inputString");
		
		// do some process
		
		// pipeline
		idm.put("outputString", "outputString");
		// --- <<IS-END>> ---

                
	}
}

