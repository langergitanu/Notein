package com.huawei.hms.device;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import com.huawei.hms.utils.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.device.a */
/* JADX INFO: loaded from: classes6.dex */
public class C17762a {
    /* JADX INFO: renamed from: a */
    public static boolean m75918a(X509Certificate x509Certificate, List<X509Certificate> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        if (x509Certificate == null) {
            HMSLog.m80172e("X509CertUtil", "rootCert is null,verify failed ");
            return false;
        }
        PublicKey publicKey = x509Certificate.getPublicKey();
        for (X509Certificate x509Certificate2 : list) {
            if (x509Certificate2 != null) {
                try {
                    x509Certificate2.checkValidity();
                    x509Certificate2.verify(publicKey);
                    publicKey = x509Certificate2.getPublicKey();
                } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e) {
                    HMSLog.m80172e("X509CertUtil", "verify failed " + e.getMessage());
                }
            }
            return false;
        }
        return m75920a(list);
    }

    /* JADX INFO: renamed from: b */
    public static List<X509Certificate> m75922b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m75913a(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m75925c(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 1) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            HMSLog.m80172e("X509CertUtil", "Failed to getCertChain: " + e.getMessage());
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<X509Certificate> m75921b(String str) {
        return m75922b(m75925c(str));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75924b(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(m75910a(x509Certificate.getSubjectDN().getName(), str));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75923b(X509Certificate x509Certificate, String str) {
        return m75924b(x509Certificate, "OU", str);
    }

    /* JADX INFO: renamed from: a */
    public static X509Certificate m75913a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m75914a(Base64.decode(str));
        } catch (IllegalArgumentException e) {
            HMSLog.m80172e("X509CertUtil", "getCert failed : " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static X509Certificate m75914a(byte[] bArr) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e) {
            HMSLog.m80172e("X509CertUtil", "Failed to get cert: " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m75910a(String str, String str2) {
        int iIndexOf = str.toUpperCase(Locale.getDefault()).indexOf(str2 + "=");
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf(",", iIndexOf);
        if (iIndexOf2 != -1) {
            return str.substring(str2.length() + iIndexOf + 1, iIndexOf2);
        }
        return str.substring(str2.length() + iIndexOf + 1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75915a(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (5 < keyUsage.length) {
            return keyUsage[5];
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75920a(List<X509Certificate> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (!m75915a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75916a(X509Certificate x509Certificate, String str) {
        return m75924b(x509Certificate, "CN", str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75917a(X509Certificate x509Certificate, String str, String str2) {
        try {
            return m75919a(x509Certificate, str.getBytes("UTF-8"), Base64.decode(str2));
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            HMSLog.m80172e("X509CertUtil", " plainText exception: " + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75919a(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) {
        try {
            Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            HMSLog.m80172e("X509CertUtil", "failed checkSignature : " + e.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX INFO: renamed from: a */
    public static X509Certificate m75912a(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        KeyStore keyStore;
        ?? r3 = 0;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        keyStore = KeyStore.getInstance("bks");
                        inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                        try {
                            keyStore.load(inputStreamOpen, "".toCharArray());
                        } catch (IOException e) {
                            e = e;
                            HMSLog.m80172e("X509CertUtil", "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                        } catch (KeyStoreException e2) {
                            e = e2;
                            HMSLog.m80172e("X509CertUtil", "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                        } catch (NoSuchAlgorithmException e3) {
                            e = e3;
                            HMSLog.m80172e("X509CertUtil", "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                        } catch (CertificateException e4) {
                            e = e4;
                            HMSLog.m80172e("X509CertUtil", "exception:" + e.getMessage());
                            IOUtils.closeQuietly(inputStreamOpen);
                        }
                    } catch (IOException e5) {
                        e = e5;
                        inputStreamOpen = null;
                        HMSLog.m80172e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (KeyStoreException e6) {
                        e = e6;
                        inputStreamOpen = null;
                        HMSLog.m80172e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (NoSuchAlgorithmException e7) {
                        e = e7;
                        inputStreamOpen = null;
                        HMSLog.m80172e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (CertificateException e8) {
                        e = e8;
                        inputStreamOpen = null;
                        HMSLog.m80172e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        IOUtils.closeQuietly((InputStream) r3);
                        throw th;
                    }
                    if (!keyStore.containsAlias(str)) {
                        HMSLog.m80172e("X509CertUtil", "Not include alias " + str);
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    }
                    Certificate certificate = keyStore.getCertificate(str);
                    if (!(certificate instanceof X509Certificate)) {
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    }
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    x509Certificate.checkValidity();
                    IOUtils.closeQuietly(inputStreamOpen);
                    return x509Certificate;
                }
            } catch (Throwable th2) {
                th = th2;
                r3 = context;
            }
        }
        HMSLog.m80172e("X509CertUtil", "args are error");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static X509Certificate m75911a(Context context) {
        return m75912a(context, "052root");
    }
}
