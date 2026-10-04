package com.huawei.agconnect.https;

import o0O00OOO.OooO0o;

/* JADX INFO: loaded from: classes8.dex */
public interface Service {

    public static class Factory {
        public static Service get(HttpsKit httpsKit) {
            return new C17663d(httpsKit.client(), httpsKit.executor());
        }
    }

    OooO0o<HttpsResult> execute(Method method);
}
