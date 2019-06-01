

import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;

import com.android.volley.toolbox.StringRequest;

import java.util.Map;


public class VolleyRequestController extends StringRequest implements IVolleyParams {

    private Map<String, String> map;

    public VolleyRequestController(int method, String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(method, url, listener, errorListener);
    }

    @Override
    protected Response<String> parseNetworkResponse(NetworkResponse response) {
        // check request
        return super.parseNetworkResponse(response);

    }


    @Override
    protected void deliverResponse(String response) {
        Log.i("amjiVolley", response + "");
        // change response before send
        // this call after @parseNetworkResponse
        super.deliverResponse(response);
    }


    @Override
    public void getParameters(Map<String, String> map) {
        this.map = map;

        // add primary parameters here
        this.map.put("amjiVolleyKey", "");
    }


    // Don't change this
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return this.map;
    }


    public void start() {
        App.requestQueue.add(this);
    }


}
