package com.huawei.agconnect.remoteconfig.internal.p572c;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.remoteconfig.internal.p570a.C17673b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.huawei.agconnect.remoteconfig.internal.c.b */
/* JADX INFO: loaded from: classes8.dex */
public class C17681b {
    /* JADX INFO: renamed from: a */
    public static List<Map<String, String>> m75672a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(m75673a(jSONArray.optJSONObject(i)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m75673a(JSONObject jSONObject) {
        HashMap map = new HashMap(10);
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && jSONObject.opt(next) != null) {
                    map.put(next, jSONObject.optString(next));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m75674a(int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            XmlResourceParser xml = AGConnectInstance.getInstance().getContext().getResources().getXml(i);
            int eventType = xml.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    if ("value".equals(xml.getName())) {
                        String attributeValue = xml.getAttributeValue(null, "key");
                        int next = xml.next();
                        if (next == 4) {
                            String text = xml.getText();
                            int next2 = xml.next();
                            if (next2 == 3 && "value".equals(xml.getName())) {
                                try {
                                    jSONObject.putOpt(attributeValue, text);
                                } catch (JSONException e) {
                                    Logger.m75328e("RemoteConfig", "default resource json exception", e);
                                }
                            }
                            eventType = next2;
                        } else {
                            eventType = next;
                        }
                    }
                }
                eventType = xml.next();
            }
        } catch (Resources.NotFoundException e2) {
            e = e2;
            str = "default resource not found ";
            Logger.m75328e("RemoteConfig", str, e);
            return jSONObject;
        } catch (IOException e3) {
            e = e3;
            str = "default resource io exception";
            Logger.m75328e("RemoteConfig", str, e);
            return jSONObject;
        } catch (XmlPullParserException e4) {
            e = e4;
            str = "default resource xml parser exception";
            Logger.m75328e("RemoteConfig", str, e);
            return jSONObject;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m75675a(List<C17673b> list) {
        JSONObject jSONObject = new JSONObject();
        if (list != null) {
            try {
                for (C17673b c17673b : list) {
                    String key = c17673b.getKey();
                    if (key != null && key.length() != 0) {
                        String value = c17673b.getValue();
                        if (value == null) {
                            value = "";
                        }
                        jSONObject.putOpt(key, value);
                    }
                }
            } catch (JSONException e) {
                Logger.m75328e("RemoteConfig", "parameter json exception", e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m75676a(Map<String, Object> map) {
        String key;
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        key = entry.getKey();
                    } else if (value instanceof Boolean) {
                        key = entry.getKey();
                        value = value.toString();
                    } else if (value instanceof Number) {
                        key = entry.getKey();
                        value = value.toString();
                    } else {
                        Logger.m75331w("RemoteConfig", "default map ignore key");
                    }
                    jSONObject.putOpt(key, value);
                }
            } catch (JSONException e) {
                Logger.m75328e("RemoteConfig", "default resource json exception", e);
            }
        }
        return jSONObject;
    }
}
