package o0O00oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import android.content.Context;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import o0O0oooO.o00oO0O;
import o0oO0O0o.C30782OooO00o;

/* JADX INFO: renamed from: o0O00oO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25849OooO0oO implements X509TrustManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ArrayList f88213OooO00o = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C25849OooO0oO(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, IllegalArgumentException {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        o00oO0O.OooO00o(context);
        o00OOOo.OooO0OO.OooO0Oo("OooO0oO", "loadBksCA");
        System.currentTimeMillis();
        FileInputStream fileInputStreamOooOO0 = C30782OooO00o.OooOO0(context);
        if (fileInputStreamOooOO0 != null) {
            try {
                o00OOOo.OooO0OO.OooO0Oo("OooO0oO", "get bks not from assets");
                OooO0O0(fileInputStreamOooOO0);
            } catch (IOException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                o00OOOo.OooO0OO.OooO0OO("OooO0oO", "loadBksCA: exception : " + e.getMessage());
            }
            if (fileInputStreamOooOO0 == null) {
                o00OOOo.OooO0OO.OooO0Oo("OooO0oO", " get bks from assets ");
                OooO0O0(context.getAssets().open("hmsrootcas.bks"));
            }
        } else if (fileInputStreamOooOO0 == null) {
        }
        System.currentTimeMillis();
        if (this.f88213OooO00o.isEmpty()) {
            throw new CertificateException("X509TrustManager is empty");
        }
    }

    public final void OooO00o() {
        o00OOOo.OooO0OO.OooO0Oo("OooO0oO", "loadSystemCA");
        System.currentTimeMillis();
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            keyStore.load(null, null);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    this.f88213OooO00o.add((X509TrustManager) trustManager);
                }
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            o00OOOo.OooO0OO.OooO0OO("OooO0oO", "loadSystemCA: exception : " + e.getMessage());
        }
        System.currentTimeMillis();
    }

    public final void OooO0O0(InputStream inputStream) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            KeyStore keyStore = KeyStore.getInstance("bks");
            keyStore.load(inputStream, "".toCharArray());
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.f88213OooO00o.add((X509TrustManager) trustManager);
                }
            }
        } finally {
            AbstractC20449OooO0Oo.OooO0o(inputStream);
        }
    }

    public final void OooO0OO(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("inputstream or trustPwd is null");
        }
        System.currentTimeMillis();
        try {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                KeyStore keyStore = KeyStore.getInstance("bks");
                keyStore.load(inputStream, "".toCharArray());
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f88213OooO00o.add((X509TrustManager) trustManager);
                    }
                }
                AbstractC20449OooO0Oo.OooO0o(inputStream);
            } finally {
                AbstractC20449OooO0Oo.OooO0o(inputStream);
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            o00OOOo.OooO0OO.OooO0OO("OooO0oO", "loadInputStream: exception : " + e.getMessage());
        }
        System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        o00OOOo.OooO0OO.OooO0Oo("OooO0oO", "checkClientTrusted: ");
        Iterator it = this.f88213OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((X509TrustManager) it.next()).checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                o00OOOo.OooO0OO.OooO0OO("OooO0oO", "checkServerTrusted CertificateException" + e.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        o00OOOo.OooO0OO.OooO0Oo("OooO0oO", "checkServerTrusted begin ,server ca chain size is : " + x509CertificateArr.length + " ,auth type is : " + str);
        System.currentTimeMillis();
        int length = x509CertificateArr.length;
        for (int i = 0; i < length; i++) {
            X509Certificate x509Certificate = x509CertificateArr[i];
            Objects.toString(x509Certificate.getSubjectDN());
            Objects.toString(x509Certificate.getIssuerDN());
            Objects.toString(x509Certificate.getSerialNumber());
        }
        ArrayList arrayList = this.f88213OooO00o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                o00OOOo.OooO0OO.OooO0Oo("OooO0oO", "check server i : " + i2);
                X509TrustManager x509TrustManager = (X509TrustManager) arrayList.get(i2);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    o00OOOo.OooO0OO.OooO0Oo("OooO0oO", "client root ca size is : " + acceptedIssuers.length);
                    for (int i3 = 0; i3 < acceptedIssuers.length; i3++) {
                        Objects.toString(acceptedIssuers[i3].getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                o00OOOo.OooO0OO.OooO0Oo("OooO0oO", "checkServerTrusted succeed ,root ca issuer is : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e) {
                o00OOOo.OooO0OO.OooO0OO("OooO0oO", "checkServerTrusted error :" + e.getMessage() + " , time : " + i2);
                if (i2 == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        o00OOOo.OooO0OO.OooO0OO("OooO0oO", "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e;
                }
            }
        }
        System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f88213OooO00o.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            o00OOOo.OooO0OO.OooO0OO("OooO0oO", "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }

    public C25849OooO0oO(InputStream inputStream) throws IllegalArgumentException {
        OooO0OO(inputStream);
    }
}
