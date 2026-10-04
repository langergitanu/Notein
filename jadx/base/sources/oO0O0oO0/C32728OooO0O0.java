package oO0O0oO0;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: oO0O0oO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32728OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooO00o f117660OooO00o;

    /* JADX INFO: renamed from: oO0O0oO0.OooO0O0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f117661OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f117662OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Method f117663OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Method f117664OooO0Oo;

        public OooO00o(Method method, Method method2, Method method3, Method method4) {
            this.f117661OooO00o = method;
            this.f117662OooO0O0 = method2;
            this.f117663OooO0OO = method3;
            this.f117664OooO0Oo = method4;
        }
    }

    public static OooO00o OooO00o() {
        OooO00o oooO00o;
        OooO00o oooO00o2 = f117660OooO00o;
        if (oooO00o2 != null) {
            return oooO00o2;
        }
        try {
            oooO00o = new OooO00o(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            oooO00o = new OooO00o(null, null, null, null);
        }
        f117660OooO00o = oooO00o;
        return oooO00o;
    }
}
