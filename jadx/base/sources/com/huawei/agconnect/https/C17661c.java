package com.huawei.agconnect.https;

import java.io.IOException;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34531OooOO0o;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34540OooOo0;
import oOo00OoO.InterfaceC34526OooO0o0;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.huawei.agconnect.https.c */
/* JADX INFO: loaded from: classes8.dex */
class C17661c implements Interceptor {

    /* JADX INFO: renamed from: com.huawei.agconnect.https.c$a */
    public static class a extends RequestBody {

        /* JADX INFO: renamed from: a */
        private final RequestBody f52245a;

        public a(RequestBody requestBody) {
            this.f52245a = requestBody;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return -1L;
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getF124162OooO0OO() {
            MediaType.f124148OooO0o0.getClass();
            return MediaType.Companion.OooO0O0("application/x-gzip");
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC34526OooO0o0 interfaceC34526OooO0o0) throws Throwable {
            C34540OooOo0 c34540OooOo0OooO00o = C34535OooOOOo.OooO00o(new C34531OooOO0o(interfaceC34526OooO0o0));
            this.f52245a.writeTo(c34540OooOo0OooO00o);
            c34540OooOo0OooO00o.close();
        }
    }

    /* JADX INFO: renamed from: com.huawei.agconnect.https.c$b */
    public static class b extends RequestBody {

        /* JADX INFO: renamed from: a */
        RequestBody f52246a;

        /* JADX INFO: renamed from: b */
        C34524OooO0Oo f52247b;

        public b(RequestBody requestBody) throws IOException {
            this.f52247b = null;
            this.f52246a = requestBody;
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            this.f52247b = c34524OooO0Oo;
            requestBody.writeTo(c34524OooO0Oo);
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f52247b.f123723OooOo;
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getF124162OooO0OO() {
            return this.f52246a.getF124162OooO0OO();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC34526OooO0o0 interfaceC34526OooO0o0) throws IOException {
            interfaceC34526OooO0o0.Oooo0O0(this.f52247b.o0000oO());
        }
    }

    /* JADX INFO: renamed from: a */
    private RequestBody m75643a(RequestBody requestBody) throws IOException {
        return new b(requestBody);
    }

    /* JADX INFO: renamed from: b */
    private RequestBody m75644b(RequestBody requestBody) {
        return new a(requestBody);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request f124446OooO0o0 = chain.getF124446OooO0o0();
        if (f124446OooO0o0.f124241OooO0Oo == null || f124446OooO0o0.f124240OooO0OO.OooO0O0("Content-Encoding") != null) {
            return chain.OooO00o(f124446OooO0o0);
        }
        Request.Builder builderOooO00o = f124446OooO0o0.OooO00o();
        builderOooO00o.OooO0OO("Content-Encoding", "gzip");
        builderOooO00o.OooO0Oo(f124446OooO0o0.f124239OooO0O0, m75643a(m75644b(f124446OooO0o0.f124241OooO0Oo)));
        return chain.OooO00o(builderOooO00o.OooO0O0());
    }
}
