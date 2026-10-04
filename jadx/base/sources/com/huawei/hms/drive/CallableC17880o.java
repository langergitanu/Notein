package com.huawei.hms.drive;

import com.huawei.hms.drive.C17884s;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.base.common.RequestBodyProviders;
import com.huawei.hms.network.embedded.C18252l2;
import com.huawei.hms.network.embedded.C18385v2;
import com.huawei.hms.network.embedded.C18424y2;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.drive.o */
/* JADX INFO: loaded from: classes6.dex */
public class CallableC17880o implements Callable {

    /* JADX INFO: renamed from: a */
    private C17878m f53444a;

    /* JADX INFO: renamed from: b */
    private String f53445b;

    /* JADX INFO: renamed from: c */
    private List<String> f53446c;

    /* JADX INFO: renamed from: d */
    private String f53447d;

    /* JADX INFO: renamed from: e */
    private C17883r f53448e;

    /* JADX INFO: renamed from: f */
    private PLSharedPreferences f53449f;

    /* JADX INFO: renamed from: g */
    private C17881p f53450g;

    /* JADX INFO: renamed from: com.huawei.hms.drive.o$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.m76966v("DNKeeperCallable", "dnkeeper report data to aiops is: %s", new JSONObject(CallableC17880o.this.f53450g.get()));
            HianalyticsHelper.getInstance().onEvent(CallableC17880o.this.f53450g.get(), C18424y2.f56682b);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.o$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.m76966v("DNKeeperCallable", "dnkeepersdk report data to aiops is: %s", new JSONObject(CallableC17880o.this.f53450g.get()));
            HianalyticsHelper.getInstance().onEvent(CallableC17880o.this.f53450g.get(), C18424y2.f56682b);
        }
    }

    public CallableC17880o(C17878m c17878m, String str, C17883r c17883r, PLSharedPreferences pLSharedPreferences, C17881p c17881p) {
        this.f53444a = c17878m;
        this.f53445b = c17878m.m76815a();
        this.f53447d = str;
        this.f53448e = c17883r;
        this.f53449f = pLSharedPreferences;
        this.f53450g = c17881p;
    }

    /* JADX INFO: renamed from: b */
    private void m76835b() {
        this.f53448e.m76844a(System.currentTimeMillis());
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C17884s call() {
        HttpClient httpClientM76814d = C17877l.m76793a().m76814d();
        C17884s c17884s = new C17884s();
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("https://"), this.f53447d, "/dnsbackup/queryHost");
        String string = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C18437z2.f56753g, new JSONObject().put("trace_id", string));
        } catch (JSONException e) {
            Logger.m76968w("DNKeeperCallable", "recordMap fail to put:", e);
        }
        Request requestBuild = httpClientM76814d.newRequest().options(jSONObject.toString()).requestBody(RequestBodyProviders.create("text/plain", StringUtils.str2Byte(C17882q.m76839a(this.f53444a)))).url(strOooO0OO).method("POST").build();
        Logger.m76965v("DNKeeperCallable", "DNKeeperCallable call : " + this.f53444a.m76815a());
        this.f53450g.put(C18424y2.f56691k, "[" + this.f53444a.m76815a() + ']');
        this.f53450g.put("trace_id", string);
        Submit<ResponseBody> submitNewSubmit = httpClientM76814d.newSubmit(requestBuild);
        try {
            Response<ResponseBody> responseExecute = submitNewSubmit.execute();
            m76834a(submitNewSubmit);
            if (responseExecute.isOK() && this.f53447d.equals(this.f53445b)) {
                m76832a((C17884s) null);
                try {
                    responseExecute.close();
                } catch (IOException e2) {
                    Logger.m76968w("DNKeeperCallable", "response close error", e2);
                }
                PLSharedPreferences pLSharedPreferences = this.f53449f;
                return pLSharedPreferences != null ? C17882q.m76838a(pLSharedPreferences.getString(this.f53447d)) : c17884s;
            }
            if (responseExecute.isOK()) {
                m76833a(responseExecute);
            } else {
                Logger.m76967w("DNKeeperCallable", "response status code:" + responseExecute.getCode());
                this.f53450g.put("error_code", (long) responseExecute.getCode());
                m76835b();
            }
            if (HianalyticsHelper.getInstance().isEnableReportNoSeed(ContextHolder.getAppContext())) {
                HianalyticsHelper.getInstance().getReportExecutor().execute(new b());
            }
            C17884s c17884sM76851d = this.f53448e.m76851d();
            if (!C17882q.m76842a(c17884sM76851d)) {
                Logger.m76963i("DNKeeperCallable", this.f53445b + " queryIps from dnkeeper service success");
                this.f53448e.m76847a(false);
            }
            return c17884sM76851d;
        } catch (IOException e3) {
            Logger.m76968w("DNKeeperCallable", "IOException: ", e3);
            this.f53450g.put("error_code", ExceptionCode.getErrorCodeFromException(e3));
            m76834a(submitNewSubmit);
            m76835b();
            if (HianalyticsHelper.getInstance().isEnableReportNoSeed(ContextHolder.getAppContext())) {
                HianalyticsHelper.getInstance().getReportExecutor().execute(new a());
            }
            return c17884s;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76832a(C17884s c17884s) {
        PLSharedPreferences pLSharedPreferences = this.f53449f;
        if (pLSharedPreferences != null) {
            pLSharedPreferences.putString("dnkeeperSP", "https://" + this.f53447d);
        }
        try {
            if (c17884s != null) {
                List<C17884s.a> listM76852a = c17884s.m76852a();
                if (listM76852a == null || listM76852a.size() == 0) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C18437z2.f56754h, C18385v2.f56336h);
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < listM76852a.size(); i++) {
                    C17882q.m76841a(jSONArray, i, listM76852a.get(i).m76861a(), listM76852a.get(i).m76862b(), listM76852a.get(i).m76863c());
                }
                jSONObject.put("addressList", jSONArray);
                jSONObject.put(C18252l2.f55571g, c17884s.m76858b());
                PLSharedPreferences pLSharedPreferences2 = this.f53449f;
                if (pLSharedPreferences2 != null) {
                    pLSharedPreferences2.putString(this.f53445b, jSONObject.toString());
                    return;
                }
                return;
            }
            List<String> list = this.f53446c;
            if (list != null && !list.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C18437z2.f56754h, C18385v2.f56336h);
                JSONArray jSONArray2 = new JSONArray();
                int size = this.f53446c.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C17882q.m76841a(jSONArray2, i2, C18385v2.f56336h, this.f53446c.get(i2), 0L);
                }
                jSONObject2.put("addressList", jSONArray2);
                jSONObject2.put(C18252l2.f55571g, System.currentTimeMillis());
                PLSharedPreferences pLSharedPreferences3 = this.f53449f;
                if (pLSharedPreferences3 != null) {
                    pLSharedPreferences3.putString(this.f53447d, jSONObject2.toString());
                }
            }
        } catch (JSONException e) {
            Logger.m76968w("DNKeeperCallable", "fail to JSONException:", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76833a(Response<ResponseBody> response) {
        try {
            String strByte2Str = StringUtils.byte2Str(IoUtils.toByteArray(response.getBody().getInputStream()));
            Logger.m76965v("DNKeeperCallable", "response = " + strByte2Str);
            JSONObject jSONObject = new JSONObject(strByte2Str);
            if (jSONObject.getInt("atnCode") != 0) {
                this.f53450g.put("error_code", 10020001L);
                m76835b();
                return;
            }
            this.f53450g.put("error_code", 10020000L);
            jSONObject.put(C18252l2.f55571g, System.currentTimeMillis());
            C17884s c17884sM76838a = C17882q.m76838a(jSONObject.toString());
            this.f53448e.m76845a(c17884sM76838a);
            m76832a(c17884sM76838a);
            m76832a((C17884s) null);
        } catch (IOException e) {
            e = e;
            m76835b();
            this.f53450g.put("error_code", 10020001L);
            Logger.m76967w("DNKeeperCallable", e.getClass().getSimpleName());
        } catch (JSONException e2) {
            e = e2;
            m76835b();
            this.f53450g.put("error_code", 10020001L);
            Logger.m76967w("DNKeeperCallable", e.getClass().getSimpleName());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76834a(Submit submit) {
        this.f53448e.m76846a((Future) null);
        RequestFinishedInfo requestFinishedInfo = submit.getRequestFinishedInfo();
        if (requestFinishedInfo != null) {
            RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
            this.f53446c = metrics.getConnectIps();
            this.f53450g.put("dns_server_ips", Arrays.toString(metrics.getConnectIps().toArray()));
            this.f53450g.put("dnkeeper_time", requestFinishedInfo.getMetricsTime().getTotalTime());
        }
    }
}
