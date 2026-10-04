package oO00Oo0;

import OooOoOO.C20519OooO0Oo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: oO00Oo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32267OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C32447OooOOo f115962OooO00o = C20519OooO0Oo.OooO0OO(OooO00o.f115963OooOo0o);

    /* JADX INFO: renamed from: oO00Oo0.OooO0o0$OooO00o */
    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Method> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f115963OooOo0o = new OooO00o(0);

        @Override // oO0O000o.OooO00o
        public final Method invoke() {
            try {
                return Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static final void OooO00o(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Method method = (Method) f115962OooO00o.getValue();
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
