package com.huawei.hms.network.embedded;

import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.PackageManagerCompat;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.embedded.AbstractC18129c5;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.exception.NetworkTimeoutException;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.x4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18413x4 extends AbstractC18129c5 {

    /* JADX INFO: renamed from: A */
    public static final String f56595A = "DefaultRCEventListener";

    /* JADX INFO: renamed from: a */
    public boolean f56596a;

    /* JADX INFO: renamed from: b */
    public long f56597b;

    /* JADX INFO: renamed from: c */
    public long f56598c;

    /* JADX INFO: renamed from: d */
    public int f56599d;

    /* JADX INFO: renamed from: e */
    public int f56600e;

    /* JADX INFO: renamed from: f */
    public long f56601f;

    /* JADX INFO: renamed from: g */
    public long f56602g;

    /* JADX INFO: renamed from: h */
    public long f56603h;

    /* JADX INFO: renamed from: i */
    public long f56604i;

    /* JADX INFO: renamed from: j */
    public int f56605j;

    /* JADX INFO: renamed from: k */
    public String f56606k;

    /* JADX INFO: renamed from: l */
    public String f56607l;

    /* JADX INFO: renamed from: m */
    public int f56608m;

    /* JADX INFO: renamed from: n */
    public int f56609n;

    /* JADX INFO: renamed from: o */
    public int f56610o;

    /* JADX INFO: renamed from: p */
    public String f56611p;

    /* JADX INFO: renamed from: q */
    public String f56612q;

    /* JADX INFO: renamed from: r */
    public Map<String, String> f56613r;

    /* JADX INFO: renamed from: s */
    public List<InterfaceC18267m3> f56614s;

    /* JADX INFO: renamed from: t */
    public List<IOException> f56615t;

    /* JADX INFO: renamed from: u */
    public boolean f56616u;

    /* JADX INFO: renamed from: v */
    public Exception f56617v;

    /* JADX INFO: renamed from: w */
    public int f56618w;

    /* JADX INFO: renamed from: x */
    public int f56619x;

    /* JADX INFO: renamed from: y */
    public PolicyNetworkService f56620y;

    /* JADX INFO: renamed from: z */
    public boolean f56621z;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.x4$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f56622a;

        public a(Object obj) {
            this.f56622a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18413x4.this.reportData(this.f56622a);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.x4$b */
    public static class b implements AbstractC18129c5.c {

        /* JADX INFO: renamed from: b */
        public static final AtomicLong f56624b = new AtomicLong(1);

        /* JADX INFO: renamed from: a */
        public boolean f56625a;

        public b(boolean z) {
            this.f56625a = z;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18129c5.c
        public AbstractC18129c5 create(Submit submit) {
            return new C18413x4(f56624b.getAndIncrement(), this.f56625a, null);
        }
    }

    public C18413x4(long j, boolean z) {
        this.f56600e = 0;
        this.f56604i = 0L;
        this.f56607l = "default";
        this.f56612q = "X-HwPs-Redirects";
        this.f56614s = new ArrayList();
        this.f56615t = new ArrayList();
        this.f56616u = false;
        this.f56618w = 0;
        this.f56619x = 0;
        this.f56620y = NetworkKitInnerImpl.getInstance().getPolicyNetworkService(NetworkService.Constants.CONFIG_SERVICE);
        this.f56597b = j;
        this.f56596a = z;
    }

    /* JADX INFO: renamed from: a */
    private long m79882a(long j, long j2) {
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return j - j2;
    }

    /* JADX INFO: renamed from: b */
    private void m79891b(Response response) {
        List<String> list;
        if (response == null || response.getHeaders() == null || (list = response.getHeaders().get(this.f56612q)) == null || list.isEmpty()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        this.f56611p = stringBuffer.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:20|3|(2:5|(4:7|8|(0)|16))|22|13|16) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        com.huawei.hms.framework.common.Logger.m76967w(com.huawei.hms.network.embedded.C18413x4.f56595A, "executor rejected at report");
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized <T> void m79894c(T t) {
        if (this.f56614s.size() > 0) {
            if (this.f56614s.get(r0.size() - 1) instanceof C18282n4) {
                Logger.m76966v(f56595A, "listenerFinishState:%d", Integer.valueOf(this.f56618w));
                if ((this.f56618w & 3) == 3) {
                }
            }
        }
        HianalyticsHelper.getInstance().getReportExecutor().submit(new a(t));
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void acquireRequestEnd(C18321q3.d dVar) {
        this.f56606k = dVar.getUrl();
        m79893b("acquireRequestEnd");
        this.f56613r = dVar.getNetConfig().getMap(PolicyNetworkService.RequestConstants.METRICS_DATA);
        this.f56619x = dVar.getNetConfig().enableConnectEmptyBody() ? 1 : 0;
        this.f56621z = dVar.getNetConfig().enableInnerConnectEmptyBody();
        this.f56608m = dVar.getNetConfig().getInt(PolicyNetworkService.RequestConstants.CONNECT_TIMEOUT);
        this.f56609n = dVar.getNetConfig().getInt(PolicyNetworkService.RequestConstants.READ_TIMEOUT);
        this.f56610o = dVar.getNetConfig().getInt(PolicyNetworkService.RequestConstants.WRITE_TIMEOUT);
        String string = dVar.getNetConfig().getString(PolicyNetworkService.ProfileConstants.SCENE_TYPE);
        if (!TextUtils.isEmpty(string)) {
            Logger.m76965v(f56595A, "type: " + string);
            this.f56607l = string;
        }
        Logger.m76965v(f56595A, "sceneType: " + this.f56607l);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void acquireRequestStart() {
        m79893b("acquireRequestStart");
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void callEnd(Response response) {
        this.f56603h = SystemClock.elapsedRealtime();
        m79887a(2);
        this.f56601f = SystemClock.elapsedRealtime() - this.f56602g;
        this.f56605j = response.getCode();
        m79891b(response);
        m79894c(Integer.valueOf(response.getCode()));
        m79893b("callEnd");
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void callFailed(Exception exc) {
        this.f56603h = SystemClock.elapsedRealtime();
        m79887a(2);
        this.f56601f = SystemClock.elapsedRealtime() - this.f56602g;
        if (this.f56616u) {
            this.f56605j = (C18321q3.apiAvailable(4) && (exc instanceof NetworkTimeoutException)) ? ExceptionCode.NETWORK_TIMEOUT : ExceptionCode.CANCEL;
            m79894c(Integer.valueOf(this.f56605j));
        } else {
            m79894c(exc);
            this.f56617v = exc;
        }
        m79893b("callFailed");
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void callFinishAtNetLib() {
        Logger.m76965v(f56595A, "call finish at net lib, try to report data to AIOps");
        m79887a(1);
        Exception exc = this.f56617v;
        if (exc != null) {
            m79894c(exc);
        } else {
            m79894c(Integer.valueOf(this.f56605j));
        }
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void callStart() {
        this.f56598c = System.currentTimeMillis();
        this.f56602g = SystemClock.elapsedRealtime();
        this.f56599d = NetworkUtil.netWork(ContextHolder.getAppContext());
        m79893b("callStart");
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void cancel() {
        this.f56616u = true;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void convertGrsEnd(String str) {
        this.f56606k = str;
        m79893b("convertGrsEnd");
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void convertGrsStart(String str) {
        m79893b("convertGrsStart");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void reportData(T t) {
        String string;
        if (!HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getAppContext())) {
            Logger.m76963i(f56595A, "HianalyticsHelper report disable");
            return;
        }
        if (this.f56621z) {
            return;
        }
        Context appContext = ContextHolder.getAppContext();
        C18115b5 c18115b5 = new C18115b5();
        this.f56600e--;
        c18115b5.put("sdk_version", "5.0.4.300").put(C18115b5.REQ_START, this.f56598c).put(C18115b5.CALL_START_NETWORK_TYPE, this.f56599d).put("network_type", NetworkUtil.getNetworkType(appContext)).put(C18115b5.TOTAL_TIME, this.f56601f).put(C18115b5.REQUEST_RETRY, Math.max(this.f56600e, 0)).putIfNotDefault(C18115b5.REQUEST_TYPE, this.f56619x, 0L).put(C18115b5.WAITINGTIME, this.f56604i);
        PolicyNetworkService policyNetworkService = this.f56620y;
        if (policyNetworkService != null) {
            c18115b5.put("config_version", policyNetworkService.getValue("", "core_configversion"));
            c18115b5.put(C18115b5.PROFILE_TYPE, Character.toUpperCase(this.f56607l.charAt(0)) + C18115b5.CONNECTOR + this.f56620y.getValue("", "core_configversion"));
        }
        if (this.f56613r != null) {
            for (String str : C18115b5.RECORD_LIST) {
                if (this.f56613r.containsKey(str)) {
                    c18115b5.put(str, this.f56613r.get(str));
                }
            }
            string = this.f56613r.get("trace_id");
        } else {
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
            c18115b5.put("trace_id", string);
        }
        AbstractC18151e.m78274c().mo78275a(string);
        String strM79324a = C18305p0.m79323d().m79324a("", "core_wlacid");
        if (!TextUtils.isEmpty(strM79324a)) {
            c18115b5.put(C18115b5.WLACID, strM79324a);
        }
        if (t instanceof Integer) {
            c18115b5.put("error_code", ((Integer) t).intValue());
        }
        if (!TextUtils.isEmpty(this.f56611p)) {
            c18115b5.put(C18115b5.REDIRECT_INFO, this.f56611p);
        }
        c18115b5.put(C18115b5.CONNECT_TIMEOUT, this.f56608m);
        c18115b5.put(C18115b5.READ_TIMEOUT, this.f56609n);
        c18115b5.put(C18115b5.WRITE_TIMEMEOUT, this.f56610o);
        try {
            URL url = new URL(this.f56606k);
            c18115b5.put(C18115b5.ORIGIN_DOMAIN, url.getHost());
            c18115b5.put(C18115b5.API_ID, this.f56596a ? url.getPath() : StringUtils.anonymizeMessage(url.getPath()));
        } catch (MalformedURLException unused) {
            Logger.m76967w(f56595A, "the url is error,and can't known the host and path!");
            c18115b5.put(C18115b5.ORIGIN_DOMAIN, "unknown");
            c18115b5.put(C18115b5.API_ID, "unknown");
        }
        c18115b5.put(C18115b5.TIMETO_INIT, System.currentTimeMillis() - C18374u4.getInstance().getInitTime());
        m79889a(c18115b5);
        c18115b5.put(C18115b5.NETDIAG_INFO, m79884a(t));
        Logger.m76965v(f56595A, c18115b5);
        HianalyticsHelper.getInstance().onEvent(c18115b5.get());
        m79892b(t);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void retryInterceptorEnd(Response response, C18225j3 c18225j3) {
        m79893b("retryInterceptorEnd");
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void retryInterceptorFailed(IOException iOException) {
        this.f56615t.add(iOException);
        m79893b("retryInterceptorFailed");
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18129c5
    public void retryInterceptorStart(Request request, InterfaceC18267m3 interfaceC18267m3, long j) {
        this.f56600e++;
        this.f56604i += j;
        this.f56614s.add(interfaceC18267m3);
        m79893b("retryInterceptorStart");
        if (interfaceC18267m3 instanceof C18282n4) {
            m79890a((C18282n4) interfaceC18267m3);
        }
    }

    public /* synthetic */ C18413x4(long j, boolean z, a aVar) {
        this(j, z);
    }

    /* JADX INFO: renamed from: a */
    private String m79883a(Response response) {
        String str = Headers.m77737of(response.getHeaders()).get("dl-from");
        for (String str2 : C18115b5.DL_WHITESPACE) {
            if (str2.equalsIgnoreCase(str)) {
                return str2;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    private <T> void m79892b(T t) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        linkedHashMapPack.put("package", ContextHolder.getAppContext().getPackageName()).put("version", "5.0.4.300").put("service", "networkkit").put("apiName", HianalyticsBaseData.EVENT_ID).put("result", t instanceof Integer ? 0L : -1L).put(WiseOpenHianalyticsData.UNION_COSTTIME, this.f56601f).put(WiseOpenHianalyticsData.UNION_APP_VERSION, PackageManagerCompat.getAppVersion(ContextHolder.getAppContext())).put("callTime", this.f56598c);
        HianalyticsHelper.getInstance().onEvent(linkedHashMapPack.getAll(), "60000", 0);
    }

    /* JADX INFO: renamed from: a */
    private <T> String m79884a(T t) {
        String str;
        String str2;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String strValueOf4;
        JSONObject jSONObject;
        String strValueOf5;
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        try {
            AbstractC18304p abstractC18304pMo78276a = AbstractC18151e.m78274c().mo78276a(this.f56602g, this.f56603h);
            if (abstractC18304pMo78276a == null) {
                return "";
            }
            linkedHashMapPack.putIfNotDefault(C18115b5.NETWORK_CHANGED, abstractC18304pMo78276a.mo79321h(), 0L).putIfNotDefault("debug_enabled", abstractC18304pMo78276a.mo79314a(), 0L).put(C18115b5.MOBILE_SIGNAL_STRENGTH, abstractC18304pMo78276a.mo79316c().mo79585f()).put(C18115b5.WIFI_SIGNAL_STRENGTH, abstractC18304pMo78276a.mo79316c().mo79587h()).put(C18115b5.CS_CQI, abstractC18304pMo78276a.mo79316c().mo79581b()).put(C18115b5.CS_RSRP, abstractC18304pMo78276a.mo79316c().mo79583d()).put(C18115b5.CS_RSRQ, abstractC18304pMo78276a.mo79316c().mo79582c()).put(C18115b5.CS_RSSI, abstractC18304pMo78276a.mo79316c().mo79584e()).put(C18115b5.CS_RSSNR, abstractC18304pMo78276a.mo79316c().mo79578a());
            if (t instanceof Exception) {
                AbstractC18263m abstractC18263mMo79315b = abstractC18304pMo78276a.mo79315b();
                String str3 = null;
                if (abstractC18263mMo79315b.mo79005a().isEmpty()) {
                    str2 = null;
                    strValueOf = null;
                    strValueOf2 = null;
                    strValueOf3 = null;
                    strValueOf4 = null;
                } else {
                    InterfaceC18291o interfaceC18291oMo79008b = abstractC18263mMo79315b.mo79008b(0);
                    InterfaceC18291o interfaceC18291oMo79008b2 = abstractC18263mMo79315b.mo79008b(1);
                    if (interfaceC18291oMo79008b != null) {
                        strValueOf5 = String.valueOf(interfaceC18291oMo79008b.mo79210b());
                        strValueOf3 = String.valueOf(interfaceC18291oMo79008b.mo79212c());
                        strValueOf = String.valueOf(interfaceC18291oMo79008b.mo79214e());
                    } else {
                        strValueOf = null;
                        strValueOf5 = null;
                        strValueOf3 = null;
                    }
                    if (interfaceC18291oMo79008b2 != null) {
                        String strValueOf6 = String.valueOf(interfaceC18291oMo79008b2.mo79210b());
                        strValueOf4 = String.valueOf(interfaceC18291oMo79008b2.mo79212c());
                        String str4 = strValueOf5;
                        strValueOf2 = String.valueOf(interfaceC18291oMo79008b2.mo79214e());
                        str2 = strValueOf6;
                        str3 = str4;
                    } else {
                        str2 = null;
                        strValueOf4 = null;
                        str3 = strValueOf5;
                        strValueOf2 = null;
                    }
                }
                linkedHashMapPack.put(C18115b5.SYS_CONTROL_TYPE, abstractC18304pMo78276a.mo79320g().mo79808c()).put(C18115b5.CONTROL_POLICY_TYPE, abstractC18304pMo78276a.mo79320g().mo79805b()).put(C18115b5.PING_DIAG_TEST_TIMESTAMP, str3).put(C18115b5.PING_STATUS_CODE, strValueOf3).put(C18115b5.PING_TOTAL_TIME, strValueOf).put(C18115b5.HTTP_DIAG_TEST_TIMESTAMP, str2).put(C18115b5.HTTP_STATUS_CODE, strValueOf4).put(C18115b5.HTTP_TOTAL_TIME, strValueOf2);
                jSONObject = new JSONObject(linkedHashMapPack.getAll());
            } else {
                Logger.m76965v(f56595A, "the execute has not error!");
                jSONObject = new JSONObject(linkedHashMapPack.getAll());
            }
            return jSONObject.toString();
        } catch (NullPointerException e) {
            e = e;
            str = "key == null";
            Logger.m76967w(f56595A, str);
            HianalyticsHelper.getInstance().reportException(e, "crash");
            return "";
        } catch (Throwable th) {
            e = th;
            str = "netdiag has error!";
            Logger.m76967w(f56595A, str);
            HianalyticsHelper.getInstance().reportException(e, "crash");
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private void m79893b(String str) {
        Logger.m76966v(f56595A, "callId = %d / %s : ElapsedTime = %d", Long.valueOf(this.f56597b), str, Long.valueOf(System.currentTimeMillis() - this.f56598c));
    }

    /* JADX INFO: renamed from: a */
    private String m79885a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length <= 3) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(strArrSplit[i]);
            sb.append(";");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private LinkedHashMap<String, String> m79886a(InterfaceC18267m3 interfaceC18267m3) {
        RequestFinishedInfo requestFinishedInfo;
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        if (interfaceC18267m3 == null || (requestFinishedInfo = interfaceC18267m3.getRequestFinishedInfo()) == null) {
            Logger.m76967w(f56595A, "the task or reqInfo is null,and the collection is failed!");
            return linkedHashMapPack.getAll();
        }
        C18426y4 c18426y4 = (C18426y4) requestFinishedInfo.getMetrics();
        List<String> connectIps = c18426y4.getConnectIps();
        if (connectIps.isEmpty()) {
            try {
                for (InetAddress inetAddress : InetAddress.getAllByName(requestFinishedInfo.getHost())) {
                    connectIps.add(inetAddress.getHostAddress());
                }
            } catch (NullPointerException | UnknownHostException e) {
                Logger.m76967w(f56595A, e);
            }
        }
        String string = connectIps.isEmpty() ? null : Arrays.toString(connectIps.toArray());
        String successIp = requestFinishedInfo.getMetrics().getSuccessIp();
        if (!TextUtils.isEmpty(successIp)) {
            string = o0Oo0oo.OooO0Oo(string, "/", successIp);
        }
        long connectRetryTime = c18426y4.getConnectRetryTime();
        LinkedHashMapPack linkedHashMapPackPut = linkedHashMapPack.put(C18115b5.SERVER_IP, string).put("domain", requestFinishedInfo.getHost()).put(C18115b5.REQ_SIZE, c18426y4.getRequestByteCount()).put(C18115b5.RSP_SIZE, c18426y4.getResponseByteCount());
        if (connectRetryTime < 0) {
            connectRetryTime = 0;
        }
        linkedHashMapPackPut.put(C18115b5.CONNECT_RETRY, connectRetryTime).put(C18115b5.PROTOCOL, c18426y4.getProtocol()).put(C18115b5.PROTOCOL_IMPL, requestFinishedInfo.getNetworkSdkType()).put(C18115b5.TLS_VERSION, c18426y4.getTlsVersion());
        RequestFinishedInfo.MetricsTime metricsRealTime = requestFinishedInfo.getMetricsRealTime();
        linkedHashMapPack.put("req_total_time", metricsRealTime.getTotalTime()).put(C18115b5.TCP_CONN_TIME, m79882a(metricsRealTime.getSecureConnectStartTime(), metricsRealTime.getConnectStartTime())).put(C18115b5.SSL_TIME, m79882a(metricsRealTime.getSecureConnectEndTime(), metricsRealTime.getSecureConnectStartTime())).put(C18115b5.CONNECT_TIME, m79882a(metricsRealTime.getConnectEndTime(), metricsRealTime.getConnectStartTime())).put(C18115b5.REQ_START_TRANSFER, m79882a(metricsRealTime.getRequestHeadersStartTime(), metricsRealTime.getCallStartTime())).put(C18115b5.TTFB, requestFinishedInfo.getMetricsRealTime().getTtfb()).put(C18115b5.DNS_TIME, m79882a(metricsRealTime.getDnsEndTime(), metricsRealTime.getDnsStartTime())).put(C18115b5.DNS_TYPE, c18426y4.getDnsType()).put(C18115b5.DNS_CACHE, c18426y4.getDnsCache()).put("dns_server_ips", NetworkUtil.getDnsServerIps(ContextHolder.getAppContext())).put("req_start_time", requestFinishedInfo.getMetricsTime().getCallStartTime());
        Exception exception = requestFinishedInfo.getException();
        if (exception != null) {
            int iMappingCronetErrorCode = interfaceC18267m3 instanceof C18282n4 ? C18240k4.getInstance().mappingCronetErrorCode(exception) : 10000802;
            if (iMappingCronetErrorCode == 10000802) {
                iMappingCronetErrorCode = C18214i6.getErrorCodeFromException(exception);
            }
            linkedHashMapPack.put("error_code", iMappingCronetErrorCode).put("exception_name", exception.getClass().getSimpleName()).put("message", StringUtils.anonymizeMessage(exception.getMessage()));
        } else if (requestFinishedInfo.getResponse() != null) {
            String strM79883a = m79883a(requestFinishedInfo.getResponse());
            if (!TextUtils.isEmpty(strM79883a)) {
                linkedHashMapPack.put(C18115b5.DL_FROM, strM79883a);
            }
        }
        if (requestFinishedInfo.getResponse() != null) {
            m79888a(linkedHashMapPack, requestFinishedInfo.getResponse());
        }
        return linkedHashMapPack.getAll();
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m79887a(int i) {
        this.f56618w = i | this.f56618w;
    }

    /* JADX INFO: renamed from: a */
    private void m79888a(LinkedHashMapPack linkedHashMapPack, Response response) {
        Headers headersM77737of = Headers.m77737of(response.getHeaders());
        String strM79885a = m79885a(headersM77737of.get("network-vendor"));
        if (!TextUtils.isEmpty(strM79885a)) {
            linkedHashMapPack.put(C18115b5.NETWORK_VENDOR, strM79885a);
        }
        String strM79885a2 = m79885a(headersM77737of.get("network-in"));
        if (!TextUtils.isEmpty(strM79885a2)) {
            linkedHashMapPack.put(C18115b5.NETWORK_IN, strM79885a2);
        }
        String strM79885a3 = m79885a(headersM77737of.get("network-out"));
        if (!TextUtils.isEmpty(strM79885a3)) {
            linkedHashMapPack.put(C18115b5.NETWORK_OUT, strM79885a3);
        }
        String str = headersM77737of.get("net-msg-id");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        linkedHashMapPack.put(C18115b5.NETWORK_MSG_ID, str);
    }

    /* JADX INFO: renamed from: a */
    private void m79889a(C18115b5 c18115b5) {
        int size = this.f56614s.size();
        if (size > 0) {
            int i = size - 1;
            c18115b5.put(m79886a(this.f56614s.get(i)));
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < i; i2++) {
                jSONArray.put(new JSONObject(m79886a(this.f56614s.get(i2))));
            }
            if (jSONArray.length() > 0) {
                c18115b5.put(C18115b5.FAILED_INFO, jSONArray.toString());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m79890a(C18282n4 c18282n4) {
        c18282n4.setRcEventListener(this);
    }
}
