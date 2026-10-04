package ooooOOo0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: ooooOOo0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35227OooOOoo extends InterfaceC35214OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C35227OooOOoo f126480OooO00o = new C35227OooOOoo();

    /* JADX INFO: renamed from: ooooOOo0.OooOOoo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC35214OooO0o<ResponseBody, Optional<T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC35214OooO0o<ResponseBody, T> f126481OooO00o;

        public OooO00o(InterfaceC35214OooO0o<ResponseBody, T> interfaceC35214OooO0o) {
            this.f126481OooO00o = interfaceC35214OooO0o;
        }

        @Override // ooooOOo0.InterfaceC35214OooO0o
        public final Object convert(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.f126481OooO00o.convert(responseBody));
        }
    }

    @Override // ooooOOo0.InterfaceC35214OooO0o.OooO00o
    public final InterfaceC35214OooO0o<ResponseBody, ?> OooO0O0(Type type, Annotation[] annotationArr, C35240OooOoOO c35240OooOoOO) {
        if (C35244OooOooo.OooO0o0(type) != Optional.class) {
            return null;
        }
        return new OooO00o(c35240OooOoOO.OooO0Oo(C35244OooOooo.OooO0Oo(0, (ParameterizedType) type), annotationArr));
    }
}
