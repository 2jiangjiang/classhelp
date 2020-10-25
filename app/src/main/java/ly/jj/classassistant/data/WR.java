package ly.jj.classassistant.data;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;

public class WR {
    public void WR(Context context) throws IOException {
        JSONObject jsonObject = context.getAssets().open("database.json");
    }

}
