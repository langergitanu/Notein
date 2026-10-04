package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZOG {
    private static final byte[] zzZWN = new byte[255];
    private static String zzZWO = ", ";
    private static String zzZWP = ",";
    private static String zzZWQ = "=";
    private zzZ6R zzZWR;
    private X509Certificate[] zzZWS;
    private KeyStore zzZWT;
    private String zzZWU;
    private PrivateKey zzZWV;
    private byte[] zzZWW;
    private X509Certificate zzZWX;

    static {
        for (int i = 0; i < 255; i++) {
            zzZWN[i] = -1;
        }
        for (int i2 = 90; i2 >= 65; i2--) {
            zzZWN[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 122; i3 >= 97; i3--) {
            zzZWN[i3] = (byte) (i3 - 71);
        }
        for (int i4 = 57; i4 >= 48; i4--) {
            zzZWN[i4] = (byte) (i4 + 4);
        }
        byte[] bArr = zzZWN;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public zzZOG(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            this.zzZWT = keyStore;
            keyStore.load(fileInputStream, str2.toCharArray());
            for (String str3 : zzio()) {
                this.zzZWU = str3;
                PrivateKey privateKey = (PrivateKey) this.zzZWT.getKey(str3, str2.toCharArray());
                this.zzZWV = privateKey;
                if (privateKey != null) {
                    break;
                }
            }
            X509Certificate x509Certificate = (X509Certificate) this.zzZWT.getCertificate(this.zzZWU);
            this.zzZWW = x509Certificate.getEncoded();
            this.zzZWX = x509Certificate;
            this.zzZWR = zzZ(x509Certificate);
            try {
                fileInputStream.close();
            } catch (Exception e2) {
                zzZHV.zzZ(e2);
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            zzZHV.zzZ(e);
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception e4) {
                    zzZHV.zzZ(e4);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception e5) {
                    zzZHV.zzZ(e5);
                }
            }
            throw th;
        }
    }

    private static boolean zzB(byte b) {
        return b == 61 || zzZWN[b] != -1;
    }

    private static boolean zzV6(String str) {
        try {
            byte[] bytes = str.getBytes("US-ASCII");
            if (bytes.length == 0) {
                return true;
            }
            for (byte b : bytes) {
                if (!zzB(b)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            zzZHV.zzZ(e);
            return false;
        }
    }

    private static String zzV7(String str) {
        return (str == null || "".equals(str)) ? "" : str.replace("EMAILADDRESS=", "E=").replace("ST=", "S=").replace(zzZWP, zzZWO);
    }

    private static X509Certificate zzY(zzZOG zzzog) {
        try {
            return zzYR(zzzog.zzZWW);
        } catch (Exception e) {
            zzZHV.zzZ(e);
            return null;
        }
    }

    private static byte[] zzYQ(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder();
            String strReplaceAll = new String(bArr).replaceAll(" ", "").replaceAll("\r", "").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "").replaceAll("\t", "");
            boolean z = strReplaceAll.contains("-----BEGIN CERTIFICATE-----\n") && strReplaceAll.contains("\n-----END CERTIFICATE-----");
            if (!z && !zzV6(strReplaceAll)) {
                strReplaceAll = zzZHR.zzYI(bArr);
            }
            if (!z) {
                sb.append("-----BEGIN CERTIFICATE-----\n");
            }
            sb.append(strReplaceAll);
            if (!z) {
                sb.append("\n-----END CERTIFICATE-----");
            }
            return sb.toString().getBytes();
        } catch (Exception e) {
            zzZHV.zzZ(e);
            return null;
        }
    }

    private static X509Certificate zzYR(byte[] bArr) throws Exception {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(zzYQ(bArr));
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
        byteArrayInputStream.close();
        return x509Certificate;
    }

    private void zzYS(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            throw new IllegalArgumentException("Bytes array cannot be null or empty");
        }
        byte[] bArr2 = new byte[bArr.length];
        this.zzZWW = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        X509Certificate x509CertificateZzY = zzY(this);
        this.zzZWX = x509CertificateZzY;
        this.zzZWR = zzZ(x509CertificateZzY);
    }

    private List<String> zzio() throws KeyStoreException {
        Enumeration<String> enumerationAliases = this.zzZWT.aliases();
        ArrayList arrayList = new ArrayList();
        while (enumerationAliases.hasMoreElements()) {
            arrayList.add(enumerationAliases.nextElement());
        }
        return arrayList;
    }

    public final PrivateKey getPrivateKey() {
        return this.zzZWV;
    }

    public final String getSubject() {
        X509Certificate x509Certificate = this.zzZWX;
        if (x509Certificate == null) {
            return null;
        }
        zzZ6R zzz6r = this.zzZWR;
        if (zzz6r == null) {
            return zzV7(x509Certificate.getSubjectDN().getName());
        }
        String strZzZ = zzZ(zzz6r.zzXIe());
        return strZzZ != null ? strZzZ : zzV7(this.zzZWX.getSubjectDN().getName());
    }

    public final void zzZ(Certificate[] certificateArr) {
        X509Certificate[] x509CertificateArr = new X509Certificate[certificateArr.length];
        this.zzZWS = x509CertificateArr;
        System.arraycopy(certificateArr, 0, x509CertificateArr, 0, certificateArr.length);
    }

    public final X509Certificate zzin() {
        if (this.zzZWX == null) {
            this.zzZWX = zzY(this);
        }
        return this.zzZWX;
    }

    public final String zzip() {
        X509Certificate x509Certificate = this.zzZWX;
        if (x509Certificate == null) {
            return null;
        }
        zzZ6R zzz6r = this.zzZWR;
        if (zzz6r == null) {
            return zzV7(x509Certificate.getIssuerDN().getName());
        }
        String strZzZ = zzZ(zzz6r.zzXIh());
        return strZzZ != null ? strZzZ : zzV7(this.zzZWX.getSubjectDN().getName());
    }

    public final void zzZ(PrivateKey privateKey) {
        this.zzZWV = privateKey;
    }

    private static String zzZ(zzZ8C zzz8c) {
        if (zzz8c == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            zzZ8D[] zzz8dArrZzXIo = zzz8c.zzXIo();
            for (int length = zzz8dArrZzXIo.length - 1; length >= 0; length--) {
                zzZ8E zzz8eZzXIq = zzz8dArrZzXIo[length].zzXIq();
                sb.append(zzZ89.zzWrP.zzR(zzz8eZzXIq.zzXIt()));
                sb.append(zzZWQ);
                sb.append(zzz8eZzXIq.zzXIs());
                if (length != 0) {
                    sb.append(zzZWO);
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private static zzZ6R zzZ(X509Certificate x509Certificate) {
        try {
            return new zzZ6R(x509Certificate);
        } catch (Exception unused) {
            return null;
        }
    }

    public zzZOG(byte[] bArr) {
        zzYS(bArr);
    }
}
