package com.huawei.hms.network.embedded;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.concurrent.futures.OooO00o;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.Utils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.z2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18437z2 {

    /* JADX INFO: renamed from: d */
    public static final String f56750d = "HttpDnsClient";

    /* JADX INFO: renamed from: e */
    public static final String f56751e = ",";

    /* JADX INFO: renamed from: f */
    public static final String f56752f = "Retry-After";

    /* JADX INFO: renamed from: g */
    public static final String f56753g = "metrics_data";

    /* JADX INFO: renamed from: h */
    public static final String f56754h = "type";

    /* JADX INFO: renamed from: i */
    public static final String f56755i = "ttl";

    /* JADX INFO: renamed from: j */
    public static final String f56756j = "values";

    /* JADX INFO: renamed from: k */
    public static final String f56757k = "domain";

    /* JADX INFO: renamed from: l */
    public static final String f56758l = "dns";

    /* JADX INFO: renamed from: m */
    public static final String f56759m = "error_code";

    /* JADX INFO: renamed from: n */
    public static final int f56760n = 1000;

    /* JADX INFO: renamed from: o */
    public static final int f56761o = 5;

    /* JADX INFO: renamed from: p */
    public static final int f56762p = 86400;

    /* JADX INFO: renamed from: q */
    public static final int f56763q = 600;

    /* JADX INFO: renamed from: r */
    public static final int f56764r = 60;

    /* JADX INFO: renamed from: s */
    public static final int f56765s = 503;

    /* JADX INFO: renamed from: a */
    public final String f56766a;

    /* JADX INFO: renamed from: b */
    public final HttpClient f56767b = new HttpClient.Builder().retryTimeOnConnectionFailure(0).build();

    /* JADX INFO: renamed from: c */
    public b f56768c;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z2$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C18424y2 f56769a;

        public a(C18424y2 c18424y2) {
            this.f56769a = c18424y2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.m76966v("HttpDnsClient", "httpdns report data to aiops is: %s", new JSONObject(this.f56769a.get()));
            HianalyticsHelper.getInstance().onEvent(this.f56769a.get(), C18424y2.f56682b);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.z2$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final long f56770a;

        /* JADX INFO: renamed from: b */
        public final long f56771b;

        public b(long j, long j2) {
            this.f56770a = j;
            this.f56771b = j2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m80028a() {
            return SystemClock.elapsedRealtime() - this.f56771b <= this.f56770a;
        }
    }

    public C18437z2(String str) {
        this.f56766a = str;
    }

    /* JADX INFO: renamed from: a */
    public C18385v2 m80024a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C18424y2 c18424y2 = new C18424y2();
        ArrayList<C18385v2> arrayListM80023a = m80023a(arrayList, c18424y2);
        if (HianalyticsHelper.getInstance().isEnableReportNoSeed(ContextHolder.getAppContext())) {
            HianalyticsHelper.getInstance().getReportExecutor().execute(new a(c18424y2));
        }
        Iterator<C18385v2> it = arrayListM80023a.iterator();
        return it.hasNext() ? it.next() : new C18385v2();
    }

    /* JADX INFO: renamed from: a */
    private C18385v2 m80021a(JSONObject jSONObject) {
        C18385v2 c18385v2 = new C18385v2();
        c18385v2.m79680b(3);
        if (TextUtils.isEmpty(jSONObject.optString("error_code"))) {
            int iOptInt = jSONObject.optInt("ttl");
            if (iOptInt > 86400) {
                iOptInt = 86400;
            } else if (iOptInt < 0) {
                iOptInt = 600;
            }
            c18385v2.m79681b(iOptInt * 1000);
            String strOptString = jSONObject.optString(f56754h);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(f56756j);
            c18385v2.m79682b(jSONObject.optString("domain"));
            c18385v2.m79685c(strOptString);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                c18385v2.m79676a((String) jSONArrayOptJSONArray.opt(i));
            }
        }
        return c18385v2;
    }

    /* JADX INFO: renamed from: a */
    public b m80025a() {
        return this.f56768c;
    }

    /* JADX INFO: renamed from: a */
    private ArrayList<C18385v2> m80022a(Response<ResponseBody> response) {
        ArrayList<C18385v2> arrayList = new ArrayList<>();
        try {
            String strByte2Str = StringUtils.byte2Str(IoUtils.toByteArray(response.getBody().getInputStream()));
            Logger.m76965v("HttpDnsClient", "BODY:" + strByte2Str);
            JSONArray jSONArray = new JSONObject(strByte2Str).getJSONArray("dns");
            arrayList.ensureCapacity(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(m80021a(jSONArray.getJSONObject(i)));
            }
        } catch (IOException e) {
            Logger.m76968w("HttpDnsClient", "IOException", e);
        } catch (JSONException e2) {
            Logger.m76969w("HttpDnsClient", "JSONException", e2.getClass().getSimpleName());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<C18385v2> m80026a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (String str : list) {
            if (i >= 5) {
                break;
            }
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
                i++;
            }
        }
        C18424y2 c18424y2 = new C18424y2();
        c18424y2.put(C18424y2.f56686f, "dns_init");
        ArrayList<C18385v2> arrayListM80023a = m80023a(arrayList, c18424y2);
        if (HianalyticsHelper.getInstance().isEnableReportNoSeed(ContextHolder.getAppContext())) {
            HianalyticsHelper.getInstance().getReportExecutor().execute(new a(c18424y2));
        }
        return arrayListM80023a;
    }

    /* JADX INFO: renamed from: a */
    private ArrayList<C18385v2> m80023a(List<String> list, C18424y2 c18424y2) {
        long code;
        if (TextUtils.isEmpty(this.f56766a)) {
            Logger.m76960e("HttpDnsClient", "HttpDns baseUrl is null,maybe accountId is null");
            return new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(str);
                i = i2;
            }
        }
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), this.f56766a, sb.toString());
        Logger.m76965v("HttpDnsClient", "send the request to server:" + strOooO0OO);
        String string = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f56753g, new JSONObject().put("trace_id", string));
        } catch (JSONException e) {
            Logger.m76968w("HttpDnsClient", "recordMap fail to put:", e);
        }
        c18424y2.put("trace_id", string);
        c18424y2.put(C18424y2.f56691k, list.toString());
        c18424y2.put("network_type", NetworkUtil.netWork(ContextHolder.getAppContext()));
        Request requestBuild = this.f56767b.newRequest().options(jSONObject.toString()).url(strOooO0OO).build();
        ArrayList<C18385v2> arrayList = new ArrayList<>();
        Submit<ResponseBody> submitNewSubmit = this.f56767b.newSubmit(requestBuild);
        try {
            Response<ResponseBody> responseExecute = submitNewSubmit.execute();
            if (responseExecute.isOK()) {
                arrayList = m80022a(responseExecute);
                if (arrayList.isEmpty()) {
                    code = 10020001;
                    c18424y2.put("error_code", code);
                } else {
                    c18424y2.put("error_code", 10020000L);
                    Logger.m76965v("HttpDnsClient", arrayList);
                }
            } else if (responseExecute.getCode() == 503) {
                c18424y2.put("error_code", responseExecute.getCode());
                long jStringToLong = StringUtils.stringToLong(Headers.m77737of(responseExecute.getHeaders()).get("Retry-After"), 60L) * 1000;
                m80027a(new b(Utils.getCurrentTime(true), jStringToLong));
                Logger.m76963i("HttpDnsClient", "retry-after:" + jStringToLong);
            } else {
                Logger.m76963i("HttpDnsClient", "httpDns request error code:" + responseExecute.getCode());
                code = (long) responseExecute.getCode();
                c18424y2.put("error_code", code);
            }
            RequestFinishedInfo requestFinishedInfo = submitNewSubmit.getRequestFinishedInfo();
            if (requestFinishedInfo != null) {
                c18424y2.put("dns_server_ips", Arrays.toString(requestFinishedInfo.getMetrics().getConnectIps().toArray()));
                c18424y2.put(C18424y2.f56695o, requestFinishedInfo.getMetricsTime().getTotalTime());
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<C18385v2> it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append(Arrays.toString(it.next().m79686d().toArray()));
            }
            c18424y2.put(C18424y2.f56693m, sb2.toString());
            return arrayList;
        } catch (IOException e2) {
            Logger.m76968w("HttpDnsClient", "IOException: ", e2);
            c18424y2.put("error_code", C18210i2.m78755a((Exception) e2));
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m80027a(b bVar) {
        this.f56768c = bVar;
    }
}
