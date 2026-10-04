package com.huawei.hms.drive;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* JADX INFO: renamed from: com.huawei.hms.drive.v */
/* JADX INFO: loaded from: classes6.dex */
public class C17887v {

    /* JADX INFO: renamed from: a */
    private static final String f53483a = "SecureX509SingleInstance";

    /* JADX INFO: renamed from: b */
    private static volatile C17888w f53484b;

    private C17887v() {
    }

    /* JADX INFO: renamed from: a */
    public static C17888w m76883a(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        C17891z.m76905a(context);
        if (f53484b == null) {
            synchronized (C17887v.class) {
                try {
                    if (f53484b == null) {
                        InputStream inputStreamM76894b = C17889x.m76894b(context);
                        if (inputStreamM76894b == null) {
                            C17766ac.m75934b(f53483a, "get assets bks");
                            inputStreamM76894b = context.getAssets().open("hmsrootcas.bks");
                        } else {
                            C17766ac.m75934b(f53483a, "get files bks");
                        }
                        f53484b = new C17888w(inputStreamM76894b, "");
                        new AsyncTaskC17764aa().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, context);
                    }
                } finally {
                }
            }
        }
        C17766ac.m75933a(f53483a, "SecureX509TrustManager getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return f53484b;
    }
}
