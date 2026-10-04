package com.huawei.hms.drive;

import android.content.Context;
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
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.huawei.hms.drive.w */
/* JADX INFO: loaded from: classes6.dex */
public class C17888w implements X509TrustManager {

    /* JADX INFO: renamed from: b */
    private static final String f53485b = "w";

    /* JADX INFO: renamed from: a */
    protected List<X509TrustManager> f53486a;

    /* JADX INFO: renamed from: c */
    private X509Certificate[] f53487c;

    public C17888w(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, IllegalArgumentException {
        this(context, false);
    }

    /* JADX INFO: renamed from: a */
    private void m76884a() {
        C17766ac.m75934b(f53485b, "loadSystemCA");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            keyStore.load(null, null);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    this.f53486a.add((X509TrustManager) trustManager);
                }
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            C17766ac.m75936d(f53485b, "loadSystemCA: exception : " + e.getMessage());
        }
        C17766ac.m75933a(f53485b, "loadSystemCA: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        C17766ac.m75934b(f53485b, "checkClientTrusted: ");
        Iterator<X509TrustManager> it = this.f53486a.iterator();
        while (it.hasNext()) {
            try {
                it.next().checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                C17766ac.m75936d(f53485b, "checkServerTrusted CertificateException" + e.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        m76888a(x509CertificateArr);
        C17766ac.m75934b(f53485b, "checkServerTrusted begin ,server ca chain size is : " + x509CertificateArr.length + " ,auth type is : " + str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int length = x509CertificateArr.length;
        for (int i = 0; i < length; i++) {
            X509Certificate x509Certificate = x509CertificateArr[i];
            String str2 = f53485b;
            C17766ac.m75933a(str2, "server ca chain: getSubjectDN is :" + x509Certificate.getSubjectDN());
            C17766ac.m75933a(str2, "IssuerDN :" + x509Certificate.getIssuerDN());
            C17766ac.m75933a(str2, "SerialNumber : " + x509Certificate.getSerialNumber());
        }
        int size = this.f53486a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                String str3 = f53485b;
                C17766ac.m75934b(str3, "check server i : " + i2);
                X509TrustManager x509TrustManager = this.f53486a.get(i2);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    C17766ac.m75934b(str3, "client root ca size is : " + acceptedIssuers.length);
                    for (int i3 = 0; i3 < acceptedIssuers.length; i3++) {
                        C17766ac.m75933a(f53485b, "client root ca getIssuerDN :" + acceptedIssuers[i3].getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                C17766ac.m75934b(f53485b, "checkServerTrusted succeed ,root ca issuer is : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e) {
                String str4 = f53485b;
                C17766ac.m75936d(str4, "checkServerTrusted error :" + e.getMessage() + " , time : " + i2);
                if (i2 == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        C17766ac.m75936d(str4, "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e;
                }
            }
        }
        C17766ac.m75933a(f53485b, "checkServerTrusted: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it = this.f53486a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            C17766ac.m75936d(f53485b, "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }

    public C17888w(Context context, boolean z) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, IllegalArgumentException {
        this.f53486a = new ArrayList();
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        C17891z.m76905a(context);
        if (z) {
            m76884a();
        }
        m76885a(context);
        if (this.f53486a.isEmpty()) {
            throw new CertificateException("X509TrustManager is empty");
        }
    }

    public C17888w(InputStream inputStream, String str) throws IllegalArgumentException {
        this.f53486a = new ArrayList();
        m76887a(inputStream, str);
    }

    /* JADX INFO: renamed from: a */
    public void m76888a(X509Certificate[] x509CertificateArr) {
        this.f53487c = x509CertificateArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m76885a(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        String str = f53485b;
        C17766ac.m75934b(str, "loadBksCA");
        long jCurrentTimeMillis = System.currentTimeMillis();
        InputStream inputStreamM76894b = C17889x.m76894b(context);
        if (inputStreamM76894b != null) {
            try {
                C17766ac.m75934b(str, "get bks not from assets");
                m76886a(inputStreamM76894b);
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                C17766ac.m75936d(f53485b, "loadBksCA: exception : " + e.getMessage());
            }
            if (inputStreamM76894b == null) {
                C17766ac.m75934b(f53485b, " get bks from assets ");
                m76886a(context.getAssets().open("hmsrootcas.bks"));
            }
        } else if (inputStreamM76894b == null) {
        }
        C17766ac.m75933a(f53485b, "loadBksCA: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    /* JADX INFO: renamed from: a */
    private void m76886a(InputStream inputStream) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            KeyStore keyStore = KeyStore.getInstance("bks");
            keyStore.load(inputStream, "".toCharArray());
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.f53486a.add((X509TrustManager) trustManager);
                }
            }
        } finally {
            AbstractC17765ab.m75930a(inputStream);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76887a(InputStream inputStream, String str) {
        if (inputStream != null && str != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                    KeyStore keyStore = KeyStore.getInstance("bks");
                    keyStore.load(inputStream, str.toCharArray());
                    trustManagerFactory.init(keyStore);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    for (TrustManager trustManager : trustManagers) {
                        if (trustManager instanceof X509TrustManager) {
                            this.f53486a.add((X509TrustManager) trustManager);
                        }
                    }
                    AbstractC17765ab.m75930a(inputStream);
                } finally {
                    AbstractC17765ab.m75930a(inputStream);
                }
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                C17766ac.m75936d(f53485b, "loadInputStream: exception : " + e.getMessage());
            }
            C17766ac.m75933a(f53485b, "loadInputStream: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            return;
        }
        throw new IllegalArgumentException("inputstream or trustPwd is null");
    }
}
