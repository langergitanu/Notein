package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.Submit;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.c5 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18129c5 {
    public static final int ALL_LISTENER_FINISH = 3;
    public static final int NET_LIB_LISTENER_FINISH = 1;
    public static final AbstractC18129c5 NONE = new a();
    public static final int RCEVENT_LISTENER_FINISH = 2;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c5$a */
    public static class a extends AbstractC18129c5 {
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c5$b */
    public static class b implements c {
        public b() {
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18129c5.c
        public AbstractC18129c5 create(Submit submit) {
            return AbstractC18129c5.this;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c5$c */
    public interface c {
        AbstractC18129c5 create(Submit submit);
    }

    public static c factory(AbstractC18129c5 abstractC18129c5) {
        return abstractC18129c5.new b();
    }

    public void acquireRequestEnd(C18321q3.d dVar) {
    }

    public void acquireRequestStart() {
    }

    public void callEnd(Response response) {
    }

    public void callFailed(Exception exc) {
    }

    public void callFinishAtNetLib() {
    }

    public void callStart() {
    }

    public void cancel() {
    }

    public void convertGrsEnd(String str) {
    }

    public void convertGrsStart(String str) {
    }

    public void retryInterceptorEnd(Response response, C18225j3 c18225j3) {
    }

    public void retryInterceptorFailed(IOException iOException) {
    }

    public void retryInterceptorStart(Request request, InterfaceC18267m3 interfaceC18267m3, long j) {
    }
}
