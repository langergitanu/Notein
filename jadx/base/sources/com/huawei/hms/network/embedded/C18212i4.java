package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18268m4;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.i4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18212i4 extends RequestFinishedInfo.Listener {

    /* JADX INFO: renamed from: a */
    public static final String f55105a = "CronetEventListener";

    /* JADX INFO: renamed from: b */
    public static final long f55106b = -1;

    /* JADX INFO: renamed from: c */
    public static final String f55107c = "unknown";

    public C18212i4(Executor executor) {
        super(executor);
    }

    /* JADX INFO: renamed from: a */
    private C18282n4 m78756a(RequestFinishedInfo requestFinishedInfo) {
        Collection annotations = requestFinishedInfo.getAnnotations();
        Object obj = (annotations == null || annotations.isEmpty()) ? null : annotations.toArray()[0];
        if (!(obj instanceof C18282n4)) {
            return null;
        }
        Logger.m76965v(f55105a, "call getAnnotations return CronetRequestTask instance");
        return (C18282n4) obj;
    }

    public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        if (requestFinishedInfo == null) {
            Logger.m76960e(f55105a, "requestInfo == null at onRequestFinished");
            return;
        }
        try {
            C18282n4 c18282n4M78756a = m78756a(requestFinishedInfo);
            if (c18282n4M78756a == null) {
                Logger.m76960e(f55105a, "fail to get CronetRequestTask from getAnnotations");
                return;
            }
            C18268m4 c18268m4 = (C18268m4) c18282n4M78756a.getRequestFinishedInfo();
            if (c18268m4 == null) {
                Logger.m76967w(f55105a, "requestFinishedInfo == null at onRequestFinished");
            } else {
                m78759a(requestFinishedInfo, c18268m4);
                c18282n4M78756a.m79251a();
            }
        } catch (Throwable th) {
            Logger.m76960e(f55105a, "onRequestFinished occur exception, exception name:".concat(th.getClass().getSimpleName()));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78757a(RequestFinishedInfo.Metrics metrics, AbstractC18439z4 abstractC18439z4) {
        if (metrics == null || abstractC18439z4 == null) {
            Logger.m76960e(f55105a, "invalid parameters");
            return;
        }
        abstractC18439z4.setCallStartTime(metrics.getRequestStart() == null ? -1L : metrics.getRequestStart().getTime());
        abstractC18439z4.setCallEndTime(metrics.getRequestEnd() == null ? -1L : metrics.getRequestEnd().getTime());
        abstractC18439z4.setDnsStartTime(metrics.getDnsStart() == null ? -1L : metrics.getDnsStart().getTime());
        abstractC18439z4.setDnsEndTime(metrics.getDnsEnd() == null ? -1L : metrics.getDnsEnd().getTime());
        abstractC18439z4.setConnectStartTime(metrics.getConnectStart() == null ? -1L : metrics.getConnectStart().getTime());
        abstractC18439z4.setConnectEndTime(metrics.getConnectEnd() == null ? -1L : metrics.getConnectEnd().getTime());
        abstractC18439z4.setSecureConnectStartTime(metrics.getSslStart() == null ? -1L : metrics.getSslStart().getTime());
        abstractC18439z4.setSecureConnectEndTime(metrics.getSslEnd() == null ? -1L : metrics.getSslEnd().getTime());
        abstractC18439z4.setRequestHeadersStartTime(metrics.getSendingStart() == null ? -1L : metrics.getSendingStart().getTime());
        abstractC18439z4.setRequestHeadersEndTime(metrics.getSendingEnd() == null ? -1L : metrics.getSendingEnd().getTime());
        abstractC18439z4.setResponseHeadersStartTime(metrics.getResponseStart() == null ? -1L : metrics.getResponseStart().getTime());
        abstractC18439z4.setResponseBodyEndTime(metrics.getRequestEnd() == null ? -1L : metrics.getRequestEnd().getTime());
        if (abstractC18439z4 instanceof C18268m4.a) {
            C18268m4.a aVar = (C18268m4.a) abstractC18439z4;
            aVar.setTtfb(metrics.getTtfbMs() == null ? -1L : metrics.getTtfbMs().longValue());
            aVar.setTotalTime(metrics.getTotalTimeMs() != null ? metrics.getTotalTimeMs().longValue() : -1L);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78758a(RequestFinishedInfo.Metrics metrics, RequestFinishedInfo requestFinishedInfo, C18426y4 c18426y4) {
        if (metrics == null || requestFinishedInfo == null || c18426y4 == null) {
            Logger.m76960e(f55105a, "invalid parameters");
            return;
        }
        c18426y4.setRequestByteCount(metrics.getSentByteCount() == null ? -1L : metrics.getSentByteCount().longValue());
        c18426y4.setResponseByteCount(metrics.getReceivedByteCount() != null ? metrics.getReceivedByteCount().longValue() : -1L);
        c18426y4.setProtocol(requestFinishedInfo.getResponseInfo() == null ? "unknown" : requestFinishedInfo.getResponseInfo().getNegotiatedProtocol());
    }

    /* JADX INFO: renamed from: a */
    private void m78759a(RequestFinishedInfo requestFinishedInfo, C18268m4 c18268m4) {
        if (requestFinishedInfo == null || c18268m4 == null) {
            Logger.m76960e(f55105a, "invalid parameters");
            return;
        }
        c18268m4.setUrl(requestFinishedInfo.getUrl());
        c18268m4.setException(requestFinishedInfo.getException());
        m78757a(requestFinishedInfo.getMetrics(), c18268m4.getMetricsTime());
        m78758a(requestFinishedInfo.getMetrics(), requestFinishedInfo, c18268m4.getMetrics());
    }
}
