private RequestQueue mQueue;


mQueue = Volley.newRequestQueue(this);



if (Utils.isNetworkConnetcted(this)) {//do not use it if you do not have the authority in manifest
    //TODO:add your progressDialog here
    String url = "";
    try {
        HashMap<String, String> data = new HashMap<String, String>();
        //TODO:add your params here(GET/POST)
        data.put("", "");
        //TODO:add your params here(GET/POST)
        url = Utils.mergeUrl("", data);
    } catch (Exception e) {
        e.printStackTrace();
    }

    //TODO:uncomment this for debug
    Log.d("volley url", url);
    JsonObjectRequest request = new JsonObjectRequest(url, null, new Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {
            //TODO:uncomment this for debug
            Log.d("volley response", response.toString());
					
            boolean ret;

            try {
                ret = response.getBoolean("ret");
            }catch (Exception e) {
				e.printStackTrace();
			}

			//TODO:dismiss the progressDialog
			//#Template_Class_Lower#Adapter.notifyDataSetChanged();
        }
    }, new ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("error", "network error");
                //TODO:close the progressDialog
                Toast.makeText(getApplicationContext(), "网络状况不好,请刷新重试", Toast.LENGTH_SHORT).show();
            }
        }
	);
	mQueue.add(request);
} else {
	// 没有网络
	Toast.makeText(getApplicationContext(), "暂无网络", Toast.LENGTH_LONG).show();
}












