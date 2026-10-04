package com.huawei.hms.framework.network.grs.p579g;

import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.d */
/* JADX INFO: loaded from: classes7.dex */
public class C17944d {

    /* JADX INFO: renamed from: o */
    private static final String f53704o = "d";

    /* JADX INFO: renamed from: a */
    private Map<String, List<String>> f53705a;

    /* JADX INFO: renamed from: b */
    private byte[] f53706b;

    /* JADX INFO: renamed from: c */
    private int f53707c;

    /* JADX INFO: renamed from: d */
    private long f53708d;

    /* JADX INFO: renamed from: e */
    private long f53709e;

    /* JADX INFO: renamed from: f */
    private long f53710f;

    /* JADX INFO: renamed from: g */
    private String f53711g;

    /* JADX INFO: renamed from: h */
    private int f53712h;

    /* JADX INFO: renamed from: i */
    private int f53713i;

    /* JADX INFO: renamed from: j */
    private String f53714j;

    /* JADX INFO: renamed from: k */
    private long f53715k;

    /* JADX INFO: renamed from: l */
    private String f53716l;

    /* JADX INFO: renamed from: m */
    private Exception f53717m;

    /* JADX INFO: renamed from: n */
    private String f53718n;

    public C17944d(int i, Map<String, List<String>> map, byte[] bArr, long j) {
        this.f53712h = 2;
        this.f53713i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f53714j = "";
        this.f53715k = 0L;
        this.f53716l = "";
        this.f53707c = i;
        this.f53705a = map;
        this.f53706b = ByteBuffer.wrap(bArr).array();
        this.f53708d = j;
        m77095s();
    }

    /* JADX INFO: renamed from: p */
    private void m77092p() {
        int i;
        if (m77113m()) {
            Logger.m76963i(f53704o, "GRSSDK get httpcode{304} not any changed.");
            m77085c(1);
            return;
        }
        if (!m77115o()) {
            Logger.m76963i(f53704o, "GRSSDK parse server body all failed.");
            m77085c(2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(StringUtils.byte2Str(this.f53706b));
            if (jSONObject.has("isSuccess")) {
                if (jSONObject.getInt("isSuccess") == 1) {
                }
            } else if (jSONObject.has("resultCode")) {
                i = jSONObject.getInt("resultCode") == 0 ? 1 : 2;
            } else {
                Logger.m76960e(f53704o, "sth. wrong because server errorcode's key.");
                i = -1;
            }
            if (i != 1 && jSONObject.has("services")) {
                i = 0;
            }
            m77085c(i);
            if (i == 1 || i == 0) {
                m77091f(jSONObject.has("services") ? jSONObject.getJSONObject("services").toString() : "");
                m77090e(jSONObject.has("errorList") ? jSONObject.getJSONObject("errorList").toString() : "");
            } else {
                m77083b(jSONObject.has("errorCode") ? jSONObject.getInt("errorCode") : ConnectionResult.RESOLUTION_REQUIRED);
                m77089d(jSONObject.has("errorDesc") ? jSONObject.getString("errorDesc") : "");
            }
        } catch (JSONException e) {
            Logger.m76969w(f53704o, "GrsResponse GrsResponse(String result) JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            m77085c(2);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m77093q() {
        if (m77115o() || m77114n() || m77113m()) {
            Map<String, String> mapM77094r = m77094r();
            if (mapM77094r.size() <= 0) {
                Logger.m76967w(f53704o, "parseHeader {headers.size() <= 0}");
                return;
            }
            try {
                if (m77115o() || m77113m()) {
                    m77084b(mapM77094r);
                    m77082a(mapM77094r);
                }
                if (m77114n()) {
                    m77088c(mapM77094r);
                }
            } catch (JSONException e) {
                Logger.m76969w(f53704o, "parseHeader catch JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private Map<String, String> m77094r() {
        HashMap map = new HashMap(16);
        Map<String, List<String>> map2 = this.f53705a;
        if (map2 == null || map2.size() <= 0) {
            Logger.m76965v(f53704o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return map;
        }
        for (Map.Entry<String, List<String>> entry : this.f53705a.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                map.put(key, it.next());
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: s */
    private void m77095s() {
        m77093q();
        m77092p();
    }

    /* JADX INFO: renamed from: a */
    public String m77096a() {
        return this.f53714j;
    }

    /* JADX INFO: renamed from: b */
    public int m77100b() {
        return this.f53707c;
    }

    /* JADX INFO: renamed from: c */
    public int m77103c() {
        return this.f53713i;
    }

    /* JADX INFO: renamed from: d */
    public Exception m77104d() {
        return this.f53717m;
    }

    /* JADX INFO: renamed from: e */
    public String m77105e() {
        return this.f53716l;
    }

    /* JADX INFO: renamed from: f */
    public int m77106f() {
        return this.f53712h;
    }

    /* JADX INFO: renamed from: g */
    public long m77107g() {
        return this.f53710f;
    }

    /* JADX INFO: renamed from: h */
    public long m77108h() {
        return this.f53709e;
    }

    /* JADX INFO: renamed from: i */
    public long m77109i() {
        return this.f53708d;
    }

    /* JADX INFO: renamed from: j */
    public String m77110j() {
        return this.f53711g;
    }

    /* JADX INFO: renamed from: k */
    public long m77111k() {
        return this.f53715k;
    }

    /* JADX INFO: renamed from: l */
    public String m77112l() {
        return this.f53718n;
    }

    /* JADX INFO: renamed from: m */
    public boolean m77113m() {
        return this.f53707c == 304;
    }

    /* JADX INFO: renamed from: n */
    public boolean m77114n() {
        return this.f53707c == 503;
    }

    /* JADX INFO: renamed from: o */
    public boolean m77115o() {
        return this.f53707c == 200;
    }

    public C17944d(Exception exc, long j) {
        this.f53707c = 0;
        this.f53712h = 2;
        this.f53713i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f53714j = "";
        this.f53715k = 0L;
        this.f53716l = "";
        this.f53717m = exc;
        this.f53708d = j;
    }

    /* JADX INFO: renamed from: b */
    private void m77083b(int i) {
        this.f53713i = i;
    }

    /* JADX INFO: renamed from: c */
    private void m77085c(int i) {
        this.f53712h = i;
    }

    /* JADX INFO: renamed from: d */
    private void m77089d(String str) {
    }

    /* JADX INFO: renamed from: e */
    private void m77090e(String str) {
    }

    /* JADX INFO: renamed from: f */
    private void m77091f(String str) {
        this.f53711g = str;
    }

    /* JADX INFO: renamed from: a */
    public void m77097a(int i) {
    }

    /* JADX INFO: renamed from: c */
    private void m77086c(long j) {
        this.f53715k = j;
    }

    /* JADX INFO: renamed from: a */
    public void m77098a(long j) {
        this.f53710f = j;
    }

    /* JADX INFO: renamed from: b */
    public void m77101b(long j) {
        this.f53709e = j;
    }

    /* JADX INFO: renamed from: c */
    private void m77087c(String str) {
        this.f53714j = str;
    }

    /* JADX INFO: renamed from: a */
    public void m77099a(String str) {
        this.f53716l = str;
    }

    /* JADX INFO: renamed from: b */
    public void m77102b(String str) {
        this.f53718n = str;
    }

    /* JADX INFO: renamed from: a */
    private void m77082a(Map<String, String> map) {
        if (!map.containsKey("ETag")) {
            Logger.m76963i(f53704o, "Response Heads has not Etag");
            return;
        }
        String str = map.get("ETag");
        if (TextUtils.isEmpty(str)) {
            Logger.m76963i(f53704o, "The Response Heads Etag is Empty");
        } else {
            Logger.m76963i(f53704o, "success get Etag from server");
            m77099a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m77084b(Map<String, String> map) {
        long time;
        if (map.containsKey("Cache-Control")) {
            String str = map.get("Cache-Control");
            if (TextUtils.isEmpty(str) || !str.contains("max-age=")) {
                time = 0;
            } else {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                } catch (NumberFormatException e) {
                    e = e;
                    time = 0;
                }
                try {
                    Logger.m76966v(f53704o, "Cache-Control value{%s}", Long.valueOf(time));
                } catch (NumberFormatException e2) {
                    e = e2;
                    Logger.m76968w(f53704o, "getExpireTime addHeadersToResult NumberFormatException", e);
                }
            }
        } else {
            if (map.containsKey("Expires")) {
                String str2 = map.get("Expires");
                Logger.m76966v(f53704o, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey("Date") ? map.get("Date") : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e3) {
                    Logger.m76968w(f53704o, "getExpireTime ParseException.", e3);
                    time = 0;
                }
            } else {
                Logger.m76963i(f53704o, "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        if (time <= 0 || time > 2592000) {
            time = 86400;
        }
        long j = time * 1000;
        Logger.m76964i(f53704o, "convert expireTime{%s}", Long.valueOf(j));
        m77087c(String.valueOf(System.currentTimeMillis() + j));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m77088c(Map<String, String> map) {
        long j;
        if (map.containsKey("Retry-After")) {
            String str = map.get("Retry-After");
            if (TextUtils.isEmpty(str)) {
                j = 0;
            } else {
                try {
                    j = Long.parseLong(str);
                } catch (NumberFormatException e) {
                    Logger.m76968w(f53704o, "getRetryAfter addHeadersToResult NumberFormatException", e);
                    j = 0;
                }
            }
        }
        long j2 = j * 1000;
        Logger.m76966v(f53704o, "convert retry-afterTime{%s}", Long.valueOf(j2));
        m77086c(j2);
    }
}
