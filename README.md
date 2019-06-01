# AmjiVolleyRequest
Handle Volley Requests Easy

------------------

# How to use

## create a package named "app"
## copy files "App.class" & "VolleyRequestController.java" & "IVolleyParams" in "app"

------------------
```
        String url = "your_url_here";
        
        VolleyRequestController volleyRequestController = new VolleyRequestController(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.i("TAG", response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        Map<String, String> map = new HashMap<>();
        map.put("myparam", "myvalue");

        volleyRequestController.getParameters(map);
        volleyRequestController.start();


```
