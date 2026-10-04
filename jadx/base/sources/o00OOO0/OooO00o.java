package o00OOO0;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile SecureRandom f84854OooO00o;

    static {
        "0123456789ABCDEF".toCharArray();
    }

    public static SecureRandom OooO00o() {
        if (f84854OooO00o != null) {
            return f84854OooO00o;
        }
        synchronized (OooO00o.class) {
            try {
                if (f84854OooO00o == null) {
                    f84854OooO00o = new SecureRandom();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f84854OooO00o;
    }
}
