package com.huawei.agconnect.https;

import com.huawei.agconnect.https.Adapter;
import java.io.IOException;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Method<HttpsRequest> {
    HttpsRequest httpsRequest;

    public static class Get<HttpsRequest> extends Method {
        public Get(HttpsRequest httpsrequest) {
            this.httpsRequest = httpsrequest;
        }

        @Override // com.huawei.agconnect.https.Method
        public Request.Builder create() {
            return C17665f.m75649a(this.httpsRequest).m75650a();
        }
    }

    public static class Post<HttpsRequest> extends Method {
        Adapter.Factory factory;

        public Post(HttpsRequest httpsrequest, Adapter.Factory factory) {
            init(httpsrequest, factory);
        }

        private void init(HttpsRequest httpsrequest, Adapter.Factory factory) {
            this.httpsRequest = httpsrequest;
            this.factory = factory;
        }

        @Override // com.huawei.agconnect.https.Method
        public Request.Builder create() {
            Request.Builder builderM75650a = C17665f.m75649a(this.httpsRequest).m75650a();
            try {
                if (this.factory.requestBodyAdapter() != null) {
                    return createBody(builderM75650a, (RequestBody) this.factory.requestBodyAdapter().adapter(this.httpsRequest));
                }
                throw new IllegalArgumentException("RequestBodyAdapter should not be null.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public Request.Builder createBody(Request.Builder builder, RequestBody body) {
            builder.getClass();
            OooOOO0.OooO0oO(body, "body");
            builder.OooO0Oo("POST", body);
            return builder;
        }
    }

    public static class Put<HttpsRequest> extends Post {
        public Put(HttpsRequest httpsrequest, Adapter.Factory factory) {
            super(httpsrequest, factory);
        }

        @Override // com.huawei.agconnect.https.Method.Post
        public Request.Builder createBody(Request.Builder builder, RequestBody body) {
            builder.getClass();
            OooOOO0.OooO0oO(body, "body");
            builder.OooO0Oo("PUT", body);
            return builder;
        }
    }

    /* JADX INFO: renamed from: com.huawei.agconnect.https.Method$a */
    public static final class C17651a<HttpsRequest> extends Method {

        /* JADX INFO: renamed from: a */
        Adapter.Factory f52225a;

        public C17651a(HttpsRequest httpsrequest) {
            this.httpsRequest = httpsrequest;
        }

        @Override // com.huawei.agconnect.https.Method
        public Request.Builder create() {
            Request.Builder builderM75650a = C17665f.m75649a(this.httpsRequest).m75650a();
            Adapter.Factory factory = this.f52225a;
            if (factory == null || factory.requestBodyAdapter() == null) {
                builderM75650a.getClass();
                builderM75650a.OooO0Oo("DELETE", Util.f124304OooO0Oo);
                return builderM75650a;
            }
            try {
                builderM75650a.OooO0Oo("DELETE", (RequestBody) this.f52225a.requestBodyAdapter().adapter(this.httpsRequest));
                return builderM75650a;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public C17651a(HttpsRequest httpsrequest, Adapter.Factory factory) {
            this.httpsRequest = httpsrequest;
            this.f52225a = factory;
        }
    }

    public abstract Request.Builder create();
}
