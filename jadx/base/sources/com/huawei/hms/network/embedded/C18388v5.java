package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.v5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18388v5 extends Interceptor {

    /* JADX INFO: renamed from: a */
    public static final String f56367a = "RouteInterceptor";

    /* JADX INFO: renamed from: b */
    public static final String f56368b = "alt-svc";

    /* JADX INFO: renamed from: c */
    public static final String f56369c = "quic";

    /* JADX INFO: renamed from: d */
    public static final String f56370d = ";";

    /* JADX INFO: renamed from: e */
    public static final String f56371e = "=";

    /* JADX INFO: renamed from: a */
    private int m79692a(String str, String str2) {
        Logger.m76966v(f56367a, "the quicFiled is %s-%s", str, str2);
        if (str == null || str2.isEmpty()) {
            return 0;
        }
        int iStringToInteger = 0;
        for (String str3 : str.split(";")) {
            String[] strArrSplit = str3.split("=");
            if (strArrSplit.length == 2 && str2.equals(strArrSplit[0].trim())) {
                String strReplace = StringUtils.replace(StringUtils.replace(strArrSplit[1].trim(), "\"", ""), C18241k5.f55433h, "");
                if (strReplace.length() > 0) {
                    Logger.m76966v(f56367a, "the temport is %s", strReplace);
                    iStringToInteger = StringUtils.stringToInteger(strReplace, 0);
                }
            }
        }
        return iStringToInteger;
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response<ResponseBody> intercept(Interceptor.Chain chain) throws Throwable {
        RequestFinishedInfo requestFinishedInfo;
        String str;
        InterfaceC18267m3 requestTask = ((C18321q3.b) chain).getRequestTask();
        Request requestM79552a = C18362t5.getInstance().m79552a((C18321q3.d) chain.request());
        C18185g5 c18185g5 = new C18185g5(requestM79552a.getUrl());
        String host = c18185g5.getHost();
        int port = c18185g5.getPort();
        RequestFinishedInfo requestFinishedInfo2 = null;
        requestFinishedInfo2 = null;
        try {
            try {
                Response<ResponseBody> responseProceed = chain.proceed(requestM79552a);
                if (requestTask != null) {
                    requestFinishedInfo = requestTask.getRequestFinishedInfo();
                    if (requestFinishedInfo != null) {
                        try {
                            Logger.m76966v(f56367a, "the net lib is %s", requestFinishedInfo.getNetworkSdkType());
                            Logger.m76966v(f56367a, "the protocol is %s", requestFinishedInfo.getMetrics().getProtocol());
                        } catch (Exception e) {
                            e = e;
                            requestFinishedInfo2 = requestFinishedInfo;
                            if ((requestTask instanceof C18282n4) && !requestTask.isCanceled()) {
                                C18240k4.getInstance().updateQuicHints(host, port, false);
                            }
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            requestFinishedInfo2 = requestFinishedInfo;
                            if (requestFinishedInfo2 != null) {
                                RequestFinishedInfo.MetricsTime metricsRealTime = requestFinishedInfo2.getMetricsRealTime();
                                long secureConnectStartTime = metricsRealTime.getSecureConnectStartTime() - metricsRealTime.getConnectStartTime();
                                if (secureConnectStartTime <= 0) {
                                    secureConnectStartTime = metricsRealTime.getConnectEndTime() - metricsRealTime.getConnectStartTime();
                                }
                                C18362t5.getInstance().m79553a(secureConnectStartTime, host);
                            }
                            throw th;
                        }
                    }
                } else {
                    requestFinishedInfo = null;
                }
                Headers headersM77737of = responseProceed != null ? Headers.m77737of(responseProceed.getHeaders()) : null;
                C18225j3 realHttpclient = ((C18321q3.b) chain).getRealHttpclient();
                if (headersM77737of != null && realHttpclient != null && realHttpclient.quicEnabled() && (str = headersM77737of.get(f56368b)) != null && str.contains(f56369c)) {
                    int iM79692a = m79692a(str, f56369c);
                    Logger.m76966v(f56367a, "the port is %s", Integer.valueOf(iM79692a));
                    C18240k4.getInstance().updateQuicHints(host, iM79692a, true);
                }
                if (requestFinishedInfo != null) {
                    RequestFinishedInfo.MetricsTime metricsRealTime2 = requestFinishedInfo.getMetricsRealTime();
                    long secureConnectStartTime2 = metricsRealTime2.getSecureConnectStartTime() - metricsRealTime2.getConnectStartTime();
                    if (secureConnectStartTime2 <= 0) {
                        secureConnectStartTime2 = metricsRealTime2.getConnectEndTime() - metricsRealTime2.getConnectStartTime();
                    }
                    C18362t5.getInstance().m79553a(secureConnectStartTime2, host);
                }
                return responseProceed;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
