package com.facebook.soloader;

import OooO0o.C20424OooO0Oo;
import android.os.StrictMode;
import android.os.Trace;
import com.facebook.soloader.OooOOOO;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: com.facebook.soloader.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22312OooOOOo {
    static {
        new ReentrantReadWriteLock();
    }

    public static String[] OooO00o(String str, InterfaceC22310OooO0oo interfaceC22310OooO0oo) throws IOException {
        boolean z = SoLoader.f67523OooO00o;
        if (z) {
            Api18TraceUtils.OooO00o("soloader.NativeDeps.getDependencies[", str, "]");
        }
        try {
            try {
                String[] strArrOooO00o = OooOOOO.OooO00o(interfaceC22310OooO0oo);
                if (z) {
                    Trace.endSection();
                }
                return strArrOooO00o;
            } catch (OooOOOO.OooO00o e) {
                throw OooOo.OooO0OO(str, e);
            }
        } catch (Throwable th) {
            if (SoLoader.f67523OooO00o) {
                Trace.endSection();
            }
            throw th;
        }
    }

    public static void OooO0O0(String str, OooO oooO, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        String[] strArrOooO00o = OooO00o(str, oooO);
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Loading ", str, "'s dependencies: ");
        sbOooO0o0.append(Arrays.toString(strArrOooO00o));
        OooOOO.OooO00o("SoLoader", sbOooO0o0.toString());
        for (String str2 : strArrOooO00o) {
            if (!str2.startsWith("/")) {
                SoLoader.OooOO0o(str2, null, i | 1, threadPolicy);
            }
        }
    }
}
