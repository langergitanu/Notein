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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.drive.n */
/* JADX INFO: loaded from: classes6.dex */
public class CallableC17879n implements Callable {

    /* JADX INFO: renamed from: a */
    private HashSet<C17878m> f53436a;

    /* JADX INFO: renamed from: b */
    private List<String> f53437b;

    /* JADX INFO: renamed from: c */
    private String f53438c;

    /* JADX INFO: renamed from: d */
    private HashMap<String, C17883r> f53439d;

    /* JADX INFO: renamed from: e */
    private PLSharedPreferences f53440e;

    /* JADX INFO: renamed from: f */
    private C17881p f53441f;

    /* JADX INFO: renamed from: com.huawei.hms.drive.n$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.m76966v("DNKeeperBatchCallable", "dnkeeper report data to aiops is: %s", new JSONObject(CallableC17879n.this.f53441f.get()));
            HianalyticsHelper.getInstance().onEvent(CallableC17879n.this.f53441f.get(), C18424y2.f56682b);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.n$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.m76966v("DNKeeperBatchCallable", "dnkeeper report data to aiops is: %s", new JSONObject(CallableC17879n.this.f53441f.get()));
            HianalyticsHelper.getInstance().onEvent(CallableC17879n.this.f53441f.get(), C18424y2.f56682b);
        }
    }

    public CallableC17879n(HashSet<C17878m> hashSet, String str, HashMap<String, C17883r> map, PLSharedPreferences pLSharedPreferences, C17881p c17881p) {
        HashSet<C17878m> hashSet2 = new HashSet<>();
        this.f53436a = hashSet2;
        hashSet2.addAll(hashSet);
        this.f53438c = str;
        this.f53439d = map;
        this.f53440e = pLSharedPreferences;
        this.f53441f = c17881p;
    }

    /* JADX INFO: renamed from: b */
    private void m76829b() {
        Iterator<C17883r> it = this.f53439d.values().iterator();
        while (it.hasNext()) {
            it.next().m76844a(System.currentTimeMillis());
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HashMap<String, C17884s> call() {
        RequestFinishedInfo.Metrics metrics;
        HttpClient httpClientM76814d = C17877l.m76793a().m76814d();
        HashMap<String, C17884s> map = new HashMap<>();
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("https://"), this.f53438c, "/dnsbackup/batchQuery");
        String strM76840a = C17882q.m76840a(this.f53436a);
        String string = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C18437z2.f56753g, new JSONObject().put("trace_id", string));
        } catch (JSONException e) {
            Logger.m76968w("DNKeeperBatchCallable", "recordMap fail to put:", e);
        }
        Request requestBuild = httpClientM76814d.newRequest().options(jSONObject.toString()).requestBody(RequestBodyProviders.create("application/json", StringUtils.str2Byte(strM76840a))).url(strOooO0OO).method("POST").build();
        Logger.m76965v("DNKeeperBatchCallable", "DNKeeperCallable call : " + requestBuild);
        this.f53441f.put(C18424y2.f56691k, this.f53436a.toString());
        this.f53441f.put("trace_id", string);
        Submit<ResponseBody> submitNewSubmit = httpClientM76814d.newSubmit(requestBuild);
        try {
            Response<ResponseBody> responseExecute = submitNewSubmit.execute();
            m76828a(submitNewSubmit);
            RequestFinishedInfo requestFinishedInfo = submitNewSubmit.getRequestFinishedInfo();
            if (requestFinishedInfo != null && (metrics = requestFinishedInfo.getMetrics()) != null) {
                this.f53437b = metrics.getConnectIps();
            }
            if (responseExecute.isOK()) {
                Logger.m76963i("DNKeeperBatchCallable", "response from dnkeeper server success");
                this.f53441f.put("error_code", 10020000L);
                m76827a(responseExecute);
            } else {
                Logger.m76967w("DNKeeperBatchCallable", "response status code:" + responseExecute.getCode());
                this.f53441f.put("error_code", (long) responseExecute.getCode());
                m76829b();
            }
            if (HianalyticsHelper.getInstance().isEnableReportNoSeed(ContextHolder.getAppContext())) {
                HianalyticsHelper.getInstance().getReportExecutor().execute(new b());
            }
            for (Map.Entry<String, C17883r> entry : this.f53439d.entrySet()) {
                C17883r value = entry.getValue();
                if (!C17882q.m76842a(value.m76851d())) {
                    Logger.m76958d("DNKeeperBatchCallable", "queryIps from dnkeeper service success");
                    value.m76847a(false);
                    map.put(entry.getKey(), value.m76851d());
                }
            }
        } catch (IOException e2) {
            Logger.m76968w("DNKeeperBatchCallable", "IOException: ", e2);
            this.f53441f.put("error_code", ExceptionCode.getErrorCodeFromException(e2));
            m76828a(submitNewSubmit);
            m76829b();
            if (HianalyticsHelper.getInstance().isEnableReportNoSeed(ContextHolder.getAppContext())) {
                HianalyticsHelper.getInstance().getReportExecutor().execute(new a());
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private void m76825a(C17883r c17883r) {
        c17883r.m76844a(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    private void m76826a(C17884s c17884s, String str) {
        if (c17884s == null) {
            try {
                List<String> list = this.f53437b;
                if (list != null && !list.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C18437z2.f56754h, C18385v2.f56336h);
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < this.f53437b.size(); i++) {
                        C17882q.m76841a(jSONArray, i, C18385v2.f56336h, this.f53437b.get(i), 0L);
                    }
                    jSONObject.put("addressList", jSONArray);
                    jSONObject.put(C18252l2.f55571g, System.currentTimeMillis());
                    PLSharedPreferences pLSharedPreferences = this.f53440e;
                    if (pLSharedPreferences != null) {
                        pLSharedPreferences.putString(this.f53438c, jSONObject.toString());
                    }
                    Logger.m76963i("DNKeeperBatchCallable", "dnkeeper ip result");
                    return;
                }
                return;
            } catch (JSONException e) {
                Logger.m76968w("DNKeeperBatchCallable", "fail to JSONException:", e);
                return;
            }
        }
        List<C17884s.a> listM76852a = c17884s.m76852a();
        if (listM76852a == null || listM76852a.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C18437z2.f56754h, C18385v2.f56336h);
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < listM76852a.size(); i2++) {
                C17882q.m76841a(jSONArray2, i2, listM76852a.get(i2).m76861a(), listM76852a.get(i2).m76862b(), listM76852a.get(i2).m76863c());
            }
            jSONObject2.put("addressList", jSONArray2);
            jSONObject2.put(C18252l2.f55571g, System.currentTimeMillis());
            PLSharedPreferences pLSharedPreferences2 = this.f53440e;
            if (pLSharedPreferences2 != null) {
                pLSharedPreferences2.putString(str, jSONObject2.toString());
            }
        } catch (JSONException e2) {
            Logger.m76968w("DNKeeperBatchCallable", "fail to JSONException:", e2);
        }
        Logger.m76958d("DNKeeperBatchCallable", "other ip result :" + str);
    }

    /* JADX INFO: renamed from: a */
    private void m76827a(Response<ResponseBody> response) {
        try {
            String strByte2Str = StringUtils.byte2Str(IoUtils.toByteArray(response.getBody().getInputStream()));
            Logger.m76965v("DNKeeperBatchCallable", "response = " + strByte2Str);
            JSONObject jSONObject = new JSONObject(strByte2Str);
            JSONArray jSONArray = jSONObject.getJSONArray("responseDomainInfos");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("whiteDomainRecords");
            StringBuilder sb = new StringBuilder();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    if (i > 0) {
                        sb.append("&");
                    }
                    sb.append(jSONArrayOptJSONArray.opt(i));
                }
            }
            PLSharedPreferences pLSharedPreferences = this.f53440e;
            if (pLSharedPreferences != null) {
                pLSharedPreferences.putString("dnkeeperSP", "https://" + this.f53438c);
                Logger.m76958d("DNKeeperBatchCallable", "whiteDomainRecords persist " + jSONArrayOptJSONArray);
                this.f53440e.putString("whiteDomainRecords", sb.toString());
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string = jSONObject2.getString("domainName");
                C17883r c17883r = this.f53439d.get(string);
                if (c17883r == null) {
                    c17883r = new C17883r();
                    this.f53439d.put(string, c17883r);
                }
                if (jSONObject2.getInt("atnCode") == 0) {
                    jSONObject2.put(C18252l2.f55571g, System.currentTimeMillis());
                    C17884s c17884sM76838a = C17882q.m76838a(jSONObject2.toString());
                    c17883r.m76845a(c17884sM76838a);
                    m76826a(c17884sM76838a, string);
                } else {
                    this.f53441f.put("error_code", 10020001L);
                    m76825a(c17883r);
                }
            }
            m76826a(null, null);
        } catch (IOException e) {
            e = e;
            m76829b();
            this.f53441f.put("error_code", 10020001L);
            Logger.m76967w("DNKeeperBatchCallable", e.getClass().getSimpleName());
        } catch (JSONException e2) {
            e = e2;
            m76829b();
            this.f53441f.put("error_code", 10020001L);
            Logger.m76967w("DNKeeperBatchCallable", e.getClass().getSimpleName());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76828a(Submit submit) {
        Iterator<C17883r> it = this.f53439d.values().iterator();
        while (it.hasNext()) {
            it.next().m76846a((Future) null);
        }
        RequestFinishedInfo requestFinishedInfo = submit.getRequestFinishedInfo();
        if (requestFinishedInfo != null) {
            RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
            this.f53437b = metrics.getConnectIps();
            this.f53441f.put("dns_server_ips", Arrays.toString(metrics.getConnectIps().toArray()));
            this.f53441f.put("dnkeeper_time", requestFinishedInfo.getMetricsTime().getTotalTime());
        }
    }
}
