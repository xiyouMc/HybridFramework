package top.alision.hybridframework.coustom;

import com.vivavideo.mobile.h5api.annotation.H5ActionFilterAnnotation;
import com.vivavideo.mobile.h5api.api.H5ActionFilter;
import com.vivavideo.mobile.h5api.api.H5Event;
import com.vivavideo.mobile.h5api.api.H5Plugin;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Description:
 * Data：17/03/2017-4:54 PM
 * Author: Mark
 */

@H5ActionFilterAnnotation(actions = {H5CustomPlugin.ADD})
public class H5CustomPlugin implements H5Plugin {
    public static final String ADD = "add";
    @Override
    public void getFilter(H5ActionFilter h5ActionFilter) {

    }

    @Override
    public void onRelease() {

    }

    @Override
    public boolean interceptEvent(H5Event h5Event) throws JSONException {
        return false;
    }

    @Override
    public boolean handleEvent(H5Event h5Event) throws JSONException {
        String action = h5Event.getAction();
        if (action.equals(ADD)){
            JSONObject params = h5Event.getParam();
            int a = params.optInt("a");
            int b = params.optInt("b");
            int c = a + b;
            JSONObject s = new JSONObject();
            s.put("c",c);
            h5Event.sendBack(s);
            return true;
        }
        return false;
    }
}
