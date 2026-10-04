package o0O00oO0;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import o0O0oooO.o00oO0O;
import o0oO0O0o.C30782OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile C25849OooO0oO f88208OooO00o;

    public static C25849OooO0oO OooO00o(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        InputStream inputStreamOpen;
        System.currentTimeMillis();
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        o00oO0O.OooO00o(context);
        if (f88208OooO00o == null) {
            synchronized (OooO0o.class) {
                if (f88208OooO00o == null) {
                    try {
                        inputStreamOpen = C30782OooO00o.OooOO0(context);
                    } catch (RuntimeException unused) {
                        o00OOOo.OooO0OO.OooO0OO("SecureX509SingleInstance", "get files bks error");
                        inputStreamOpen = null;
                    }
                    if (inputStreamOpen == null) {
                        o00OOOo.OooO0OO.OooO0Oo("SecureX509SingleInstance", "get assets bks");
                        inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        o00OOOo.OooO0OO.OooO0Oo("SecureX509SingleInstance", "get files bks");
                    }
                    f88208OooO00o = new C25849OooO0oO(inputStreamOpen);
                }
            }
        }
        System.currentTimeMillis();
        return f88208OooO00o;
    }
}
