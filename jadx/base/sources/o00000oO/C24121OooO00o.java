package o00000oO;

import java.security.AccessController;
import oO0oo0o0.C34249OooO00o;
import oO0ooO00.C34267OooO00o;

/* JADX INFO: renamed from: o00000oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24121OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f81289OooO00o = 0;

    public static final float OooO00o(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    public static Class OooO0O0(String str) {
        try {
            ClassLoader classLoader = C34267OooO00o.class.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new C34249OooO00o(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
