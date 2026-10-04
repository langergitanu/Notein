package ooooOOo0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import oO00ooO.C32460OooOooO;
import oOO00oOo.InterfaceC34404OooOo0o;
import oOo00OoO.C34524OooO0Oo;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: ooooOOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35208OooO00o extends InterfaceC35214OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f126424OooO00o;

    /* JADX INFO: renamed from: ooooOOo0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20390OooO00o implements InterfaceC35214OooO0o<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20390OooO00o f126425OooO00o = new C20390OooO00o();

        @Override // ooooOOo0.InterfaceC35214OooO0o
        public final ResponseBody convert(ResponseBody responseBody) throws IOException {
            ResponseBody responseBody2 = responseBody;
            try {
                C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                responseBody2.getF124289OooOoO0().o0O0O00(c34524OooO0Oo);
                return ResponseBody.create(responseBody2.getF124288OooOo0o(), responseBody2.getF124449OooOo(), c34524OooO0Oo);
            } finally {
                responseBody2.close();
            }
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooO00o$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC35214OooO0o<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f126426OooO00o = new OooO0O0();

        @Override // ooooOOo0.InterfaceC35214OooO0o
        public final RequestBody convert(RequestBody requestBody) throws IOException {
            return requestBody;
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooO00o$OooO0OO */
    public static final class OooO0OO implements InterfaceC35214OooO0o<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f126427OooO00o = new OooO0OO();

        @Override // ooooOOo0.InterfaceC35214OooO0o
        public final ResponseBody convert(ResponseBody responseBody) throws IOException {
            return responseBody;
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C35209OooO0Oo implements InterfaceC35214OooO0o<Object, String> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C35209OooO0Oo f126428OooO00o = new C35209OooO0Oo();

        @Override // ooooOOo0.InterfaceC35214OooO0o
        public final String convert(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooO00o$OooO0o */
    public static final class OooO0o implements InterfaceC35214OooO0o<ResponseBody, Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0o f126429OooO00o = new OooO0o();

        @Override // ooooOOo0.InterfaceC35214OooO0o
        public final Void convert(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return null;
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public static final class C35210OooO0o0 implements InterfaceC35214OooO0o<ResponseBody, C32460OooOooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C35210OooO0o0 f126430OooO00o = new C35210OooO0o0();

        @Override // ooooOOo0.InterfaceC35214OooO0o
        public final C32460OooOooO convert(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // ooooOOo0.InterfaceC35214OooO0o.OooO00o
    public final InterfaceC35214OooO0o OooO00o(Type type) {
        if (RequestBody.class.isAssignableFrom(C35244OooOooo.OooO0o0(type))) {
            return OooO0O0.f126426OooO00o;
        }
        return null;
    }

    @Override // ooooOOo0.InterfaceC35214OooO0o.OooO00o
    public final InterfaceC35214OooO0o<ResponseBody, ?> OooO0O0(Type type, Annotation[] annotationArr, C35240OooOoOO c35240OooOoOO) {
        if (type == ResponseBody.class) {
            return C35244OooOooo.OooO0oo(annotationArr, InterfaceC34404OooOo0o.class) ? OooO0OO.f126427OooO00o : C20390OooO00o.f126425OooO00o;
        }
        if (type == Void.class) {
            return OooO0o.f126429OooO00o;
        }
        if (!this.f126424OooO00o || type != C32460OooOooO.class) {
            return null;
        }
        try {
            return C35210OooO0o0.f126430OooO00o;
        } catch (NoClassDefFoundError unused) {
            this.f126424OooO00o = false;
            return null;
        }
    }
}
