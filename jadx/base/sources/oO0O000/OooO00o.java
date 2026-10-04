package oO0O000;

import java.io.Closeable;
import oO00ooO.C32435OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {
    public static final void OooO00o(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C32435OooO0Oo.OooO00o(th, th2);
            }
        }
    }
}
