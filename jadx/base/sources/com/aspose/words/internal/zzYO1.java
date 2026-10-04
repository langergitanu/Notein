package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzYWQ;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ4K;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYO1 extends zzYQP {
    private static final Logger zzVRs = Logger.getLogger(zzYO1.class.getName());
    private static final zzYPK zzVRr = new zzYPK();

    public static class zzS extends KeyStoreSpi implements zzZ79, zzZ96 {
        private zzZDA zzVRe;
        private CertificateFactory zzVRf;
        private boolean zzVRg;
        private Hashtable zzVRh;
        private Hashtable zzVRi;
        private zzY zzVRj;
        private Hashtable zzVRk;
        private zzY zzVRl;
        private zzY zzVRm;
        private final boolean zzVTz;
        private zzYQ8 zzVWk;
        private zzZDA zzWGs;
        protected final SecureRandom zzWk5;

        public zzS(zzYQ8 zzyq8, Provider provider, zzZDA zzzda, zzZDA zzzda2) {
            this(false, zzyq8, provider, zzzda, zzzda2);
        }

        private static byte[] zzT(zzZ7D zzz7d) {
            new zzZ0P.zzR();
            zzZ10 zzz10ZzX = zzZ0P.zzR.zzX(zzZ0P.zzWex);
            zzz10ZzX.zzXGT().update(zzz7d.zzXHH().getBytes());
            return zzz10ZzX.zzXI5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zzZ7E zzW(PublicKey publicKey) throws IOException {
            return new zzZ7E(zzT(zzZ7D.zzWZ(zzZD5.zzXo(publicKey.getEncoded()))));
        }

        private Set zzXAz() {
            HashSet hashSet = new HashSet();
            Enumeration enumerationKeys = this.zzVRl.keys();
            while (enumerationKeys.hasMoreElements()) {
                Certificate[] certificateArrEngineGetCertificateChain = engineGetCertificateChain((String) enumerationKeys.nextElement());
                for (int i = 0; i != certificateArrEngineGetCertificateChain.length; i++) {
                    hashSet.add(certificateArrEngineGetCertificateChain[i]);
                }
            }
            Enumeration enumerationKeys2 = this.zzVRj.keys();
            while (enumerationKeys2.hasMoreElements()) {
                hashSet.add(engineGetCertificate((String) enumerationKeys2.nextElement()));
            }
            return hashSet;
        }

        private void zzY(Certificate certificate) throws KeyStoreException {
            try {
                this.zzVRi.put(new zzZ(certificate.getPublicKey()), certificate);
            } catch (IOException e) {
                throw new KeyStoreException(C21111o0ooOoO.OooO00o(e, new StringBuilder("Exception: ")), e);
            }
        }

        private void zzZ(Certificate certificate) throws KeyStoreException {
            try {
                this.zzVRi.remove(new zzZ(certificate.getPublicKey()));
            } catch (IOException e) {
                throw new KeyStoreException(C21111o0ooOoO.OooO00o(e, new StringBuilder("Exception: ")), e);
            }
        }

        @Override // java.security.KeyStoreSpi
        public Enumeration engineAliases() {
            Hashtable hashtable = new Hashtable();
            Enumeration enumerationKeys = this.zzVRj.keys();
            while (enumerationKeys.hasMoreElements()) {
                hashtable.put(enumerationKeys.nextElement(), "cert");
            }
            Enumeration enumerationKeys2 = this.zzVRl.keys();
            while (enumerationKeys2.hasMoreElements()) {
                String str = (String) enumerationKeys2.nextElement();
                if (hashtable.get(str) == null) {
                    hashtable.put(str, "key");
                }
            }
            return hashtable.keys();
        }

        @Override // java.security.KeyStoreSpi
        public boolean engineContainsAlias(String str) {
            if (str != null) {
                return (this.zzVRj.get(str) == null && this.zzVRl.get(str) == null) ? false : true;
            }
            throw new NullPointerException("alias value is null");
        }

        @Override // java.security.KeyStoreSpi
        public void engineDeleteEntry(String str) throws KeyStoreException {
            Key key = (Key) this.zzVRl.remove(str);
            this.zzVRm.remove(str);
            Certificate certificate = (Certificate) this.zzVRj.remove(str);
            if (certificate != null) {
                zzZ(certificate);
            }
            if (key != null) {
                String str2 = (String) this.zzVRk.remove(str);
                if (str2 != null) {
                    certificate = (Certificate) this.zzVRh.remove(str2);
                }
                if (certificate != null) {
                    zzZ(certificate);
                }
            }
        }

        @Override // java.security.KeyStoreSpi
        public Certificate engineGetCertificate(String str) {
            if (str == null) {
                throw new IllegalArgumentException("null alias passed to getCertificate.");
            }
            Certificate certificate = (Certificate) this.zzVRj.get(str);
            if (certificate != null) {
                return certificate;
            }
            String str2 = (String) this.zzVRk.get(str);
            return str2 != null ? (Certificate) this.zzVRh.get(str2) : (Certificate) this.zzVRh.get(str);
        }

        @Override // java.security.KeyStoreSpi
        public String engineGetCertificateAlias(Certificate certificate) {
            Enumeration enumerationElements = this.zzVRj.elements();
            Enumeration enumerationKeys = this.zzVRj.keys();
            while (enumerationElements.hasMoreElements()) {
                Certificate certificate2 = (Certificate) enumerationElements.nextElement();
                String str = (String) enumerationKeys.nextElement();
                if (certificate2.equals(certificate)) {
                    return str;
                }
            }
            Enumeration enumerationElements2 = this.zzVRh.elements();
            Enumeration enumerationKeys2 = this.zzVRh.keys();
            while (enumerationElements2.hasMoreElements()) {
                Certificate certificate3 = (Certificate) enumerationElements2.nextElement();
                String str2 = (String) enumerationKeys2.nextElement();
                if (certificate3.equals(certificate)) {
                    return str2;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        @Override // java.security.KeyStoreSpi
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Certificate[] engineGetCertificateChain(String str) {
            Certificate certificate;
            if (str == null) {
                throw new IllegalArgumentException("null alias passed to getCertificateChain.");
            }
            Certificate[] certificateArr = null;
            if (!engineIsKeyEntry(str)) {
                return null;
            }
            Certificate certificateEngineGetCertificate = engineGetCertificate(str);
            if (certificateEngineGetCertificate != null) {
                Vector vector = new Vector();
                while (certificateEngineGetCertificate != null) {
                    X509Certificate x509Certificate = (X509Certificate) certificateEngineGetCertificate;
                    byte[] extensionValue = x509Certificate.getExtensionValue(zzZ7U.zzWqt.getId());
                    if (extensionValue != null) {
                        zzZ85 zzz85ZzXl = zzZ85.zzXl(zzZD9.zzYz(extensionValue).zzXL5());
                        certificate = zzz85ZzXl.zzXIn() != null ? (Certificate) this.zzVRi.get(new zzZ(zzz85ZzXl.zzXIn())) : null;
                    }
                    if (certificate == null) {
                        Principal issuerDN = x509Certificate.getIssuerDN();
                        if (!issuerDN.equals(x509Certificate.getSubjectDN())) {
                            Enumeration enumerationKeys = this.zzVRi.keys();
                            while (true) {
                                if (!enumerationKeys.hasMoreElements()) {
                                    break;
                                }
                                X509Certificate x509Certificate2 = (X509Certificate) this.zzVRi.get(enumerationKeys.nextElement());
                                if (x509Certificate2.getSubjectDN().equals(issuerDN)) {
                                    try {
                                        x509Certificate.verify(x509Certificate2.getPublicKey());
                                        certificate = x509Certificate2;
                                        break;
                                    } catch (Exception unused) {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                    if (!vector.contains(certificateEngineGetCertificate)) {
                        vector.addElement(certificateEngineGetCertificate);
                        if (certificate != certificateEngineGetCertificate) {
                            certificateEngineGetCertificate = certificate;
                        }
                    }
                    certificateEngineGetCertificate = null;
                }
                int size = vector.size();
                certificateArr = new Certificate[size];
                for (int i = 0; i != size; i++) {
                    certificateArr[i] = (Certificate) vector.elementAt(i);
                }
            }
            return certificateArr;
        }

        @Override // java.security.KeyStoreSpi
        public Date engineGetCreationDate(String str) {
            if (str == null) {
                throw new NullPointerException("alias == null");
            }
            if (this.zzVRl.get(str) == null && this.zzVRj.get(str) == null) {
                return null;
            }
            return new Date();
        }

        @Override // java.security.KeyStoreSpi
        public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException, NoSuchAlgorithmException {
            Certificate certificateEngineGetCertificate;
            if (str == null) {
                throw new IllegalArgumentException("null alias passed to getKey.");
            }
            Key key = (Key) this.zzVRl.get(str);
            try {
                if (!(key instanceof PrivateKey) || this.zzVRm.get(str) != null || (certificateEngineGetCertificate = engineGetCertificate(str)) == null) {
                    return key;
                }
                new zzYRH(certificateEngineGetCertificate.getPublicKey(), (PrivateKey) key);
                this.zzVRm.put(str, key);
                return key;
            } catch (IllegalArgumentException e) {
                throw new UnrecoverableKeyException(e.getMessage());
            }
        }

        @Override // java.security.KeyStoreSpi
        public boolean engineIsCertificateEntry(String str) {
            return this.zzVRj.get(str) != null && this.zzVRl.get(str) == null;
        }

        @Override // java.security.KeyStoreSpi
        public boolean engineIsKeyEntry(String str) {
            return this.zzVRl.get(str) != null;
        }

        @Override // java.security.KeyStoreSpi
        public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            char[] cArr2;
            boolean z;
            zzZD9 zzzd9ZzYz;
            String string;
            zzZ9H[] zzz9hArr;
            zzZ9H[] zzz9hArr2;
            zzZD9 zzzd9ZzYz2;
            String string2;
            this.zzVRm.clear();
            if (inputStream == null) {
                return;
            }
            if (cArr == null) {
                throw new NullPointerException("No password supplied for PKCS#12 KeyStore.");
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(10);
            if (bufferedInputStream.read() != 48) {
                throw new IOException("stream does not represent a PKCS12 key store");
            }
            bufferedInputStream.reset();
            zzZ95 zzz95ZzXH = zzZ95.zzXH((zzZD4) new zzZDE(bufferedInputStream).zzXKN());
            zzZ9H zzz9hZzXJb = zzz95ZzXH.zzXJb();
            Vector vector = new Vector();
            if (zzz95ZzXH.zzXJa() != null) {
                zzZ9B zzz9bZzXJa = zzz95ZzXH.zzXJa();
                zzZ7X zzz7xZzXJi = zzz9bZzXJa.zzXJi();
                zzZ86 zzz86ZzXI6 = zzz7xZzXJi.zzXI6();
                byte[] salt = zzz9bZzXJa.getSalt();
                int iIntValue = zzz9bZzXJa.zzXJh().intValue();
                byte[] bArrZzXL5 = ((zzZD9) zzz9hZzXJb.zzXJV()).zzXL5();
                cArr2 = cArr;
                try {
                    byte[] bArrZzZ = zzZ(zzz86ZzXI6, salt, iIntValue, cArr2, bArrZzXL5);
                    byte[] bArrZzXI5 = zzz7xZzXJi.zzXI5();
                    if (!zzYGU.zzo(bArrZzZ, bArrZzXI5)) {
                        if (cArr2.length > 0) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        if (!zzYGU.zzo(zzZ(zzz86ZzXI6, salt, iIntValue, bArrZzXL5), bArrZzXI5)) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        this.zzVRg = true;
                    }
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new zzYO6(C22245OooO0oO.OooO0Oo(e2, new StringBuilder("error constructing MAC: ")), e2);
                }
            } else {
                cArr2 = cArr;
            }
            byte b = 0;
            this.zzVRl = new zzY(b);
            this.zzVRk = new Hashtable();
            if (zzz9hZzXJb.zzXJW().equals(zzZ96.zzWFM)) {
                zzZ9H[] zzz9hArrZzXJp = zzZ9J.zzXU(new zzZDE(((zzZD9) zzz9hZzXJb.zzXJV()).zzXL5()).zzXKN()).zzXJp();
                int i = 0;
                z = false;
                while (i != zzz9hArrZzXJp.length) {
                    if (zzz9hArrZzXJp[i].zzXJW().equals(zzZ96.zzWFM)) {
                        zzZD4 zzzd4 = (zzZD4) new zzZDE(((zzZD9) zzz9hArrZzXJp[i].zzXJV()).zzXL5()).zzXKN();
                        int i2 = b;
                        while (i2 != zzzd4.size()) {
                            zzZ8Y zzz8yZzXA = zzZ8Y.zzXA(zzzd4.zzg6(i2));
                            if (zzz8yZzXA.zzXIT().equals(zzZ96.zzWwH)) {
                                zzZ9E zzz9eZzXP = zzZ9E.zzXP(zzz8yZzXA.zzXIS());
                                PrivateKey privateKeyZzZ = zzZ(zzz9eZzXP.zzXKk(), zzz9eZzXP.getEncryptedData(), cArr2);
                                if (zzz8yZzXA.zzXIR() != null) {
                                    Enumeration enumerationZzXKE = zzz8yZzXA.zzXIR().zzXKE();
                                    zzzd9ZzYz2 = null;
                                    string2 = null;
                                    while (enumerationZzXKE.hasMoreElements()) {
                                        zzZD4 zzzd42 = (zzZD4) enumerationZzXKE.nextElement();
                                        zzZDA zzzda = (zzZDA) zzzd42.zzg6(b);
                                        zzZ9H[] zzz9hArr3 = zzz9hArrZzXJp;
                                        zzZD2 zzzd2 = (zzZD2) zzzd42.zzg6(1);
                                        if (zzzd2.size() > 0) {
                                            zzZD5 zzzd5 = (zzZD5) zzzd2.zzg6(0);
                                            if (zzzda.equals(zzZ96.zzWxK)) {
                                                if (string2 != null && !string2.equals(zzZCH.zzYv(zzzd5).getString())) {
                                                    throw new IOException("attempt to add existing attribute with different value");
                                                }
                                                string2 = zzZCH.zzYv(zzzd5).getString();
                                                this.zzVRl.put(string2, privateKeyZzZ);
                                            } else if (!zzzda.equals(zzZ96.zzWxJ)) {
                                                continue;
                                            } else {
                                                if (zzzd9ZzYz2 != null && !zzzd9ZzYz2.equals(zzzd5)) {
                                                    throw new IOException("attempt to add existing attribute with different value");
                                                }
                                                zzzd9ZzYz2 = zzZD9.zzYz(zzzd5);
                                            }
                                        }
                                        zzz9hArrZzXJp = zzz9hArr3;
                                        b = 0;
                                    }
                                } else {
                                    zzzd9ZzYz2 = null;
                                    string2 = null;
                                }
                                zzz9hArr2 = zzz9hArrZzXJp;
                                if (zzzd9ZzYz2 != null) {
                                    String strZzVG = zzYGI.zzVG(zzYGC.encode(zzzd9ZzYz2.zzXL5()));
                                    if (string2 == null) {
                                        this.zzVRl.put(strZzVG, privateKeyZzZ);
                                    } else {
                                        this.zzVRk.put(string2, strZzVG);
                                    }
                                } else {
                                    this.zzVRl.put("unmarked", privateKeyZzZ);
                                    z = true;
                                }
                            } else {
                                zzz9hArr2 = zzz9hArrZzXJp;
                                if (zzz8yZzXA.zzXIT().equals(zzZ96.zzWwG)) {
                                    vector.addElement(zzz8yZzXA);
                                } else {
                                    zzYO1.zzVRs.info("extra in data " + zzz8yZzXA.zzXIT());
                                    zzYO1.zzVRs.fine(zzZ8F.zzXr(zzz8yZzXA));
                                }
                            }
                            i2++;
                            zzz9hArrZzXJp = zzz9hArr2;
                            b = 0;
                        }
                        zzz9hArr = zzz9hArrZzXJp;
                    } else {
                        zzz9hArr = zzz9hArrZzXJp;
                        if (zzz9hArr[i].zzXJW().equals(zzZ96.zzWFH)) {
                            zzZ9F zzz9fZzXQ = zzZ9F.zzXQ(zzz9hArr[i].zzXJV());
                            zzZD4 zzzd43 = (zzZD4) zzZD5.zzXo(zzZ(false, zzz9fZzXQ.zzXKk(), cArr2, zzz9fZzXQ.zzXJl().zzXL5()));
                            for (int i3 = 0; i3 != zzzd43.size(); i3++) {
                                zzZ8Y zzz8yZzXA2 = zzZ8Y.zzXA(zzzd43.zzg6(i3));
                                if (zzz8yZzXA2.zzXIT().equals(zzZ96.zzWwG)) {
                                    vector.addElement(zzz8yZzXA2);
                                } else if (zzz8yZzXA2.zzXIT().equals(zzZ96.zzWwH)) {
                                    zzZ9E zzz9eZzXP2 = zzZ9E.zzXP(zzz8yZzXA2.zzXIS());
                                    PrivateKey privateKeyZzZ2 = zzZ(zzz9eZzXP2.zzXKk(), zzz9eZzXP2.getEncryptedData(), cArr2);
                                    Enumeration enumerationZzXKE2 = zzz8yZzXA2.zzXIR().zzXKE();
                                    zzZD9 zzzd9ZzYz3 = null;
                                    String string3 = null;
                                    while (enumerationZzXKE2.hasMoreElements()) {
                                        zzZD4 zzzd44 = (zzZD4) enumerationZzXKE2.nextElement();
                                        zzZDA zzzda2 = (zzZDA) zzzd44.zzg6(0);
                                        zzZD2 zzzd22 = (zzZD2) zzzd44.zzg6(1);
                                        if (zzzd22.size() > 0) {
                                            zzZD5 zzzd52 = (zzZD5) zzzd22.zzg6(0);
                                            if (zzzda2.equals(zzZ96.zzWxK)) {
                                                if (string3 != null && !string3.equals(zzZCH.zzYv(zzzd52).getString())) {
                                                    throw new IOException("attempt to add existing attribute with different value");
                                                }
                                                string3 = zzZCH.zzYv(zzzd52).getString();
                                                this.zzVRl.put(string3, privateKeyZzZ2);
                                            } else if (!zzzda2.equals(zzZ96.zzWxJ)) {
                                                continue;
                                            } else {
                                                if (zzzd9ZzYz3 != null && !zzzd9ZzYz3.equals(zzzd52)) {
                                                    throw new IOException("attempt to add existing attribute with different value");
                                                }
                                                zzzd9ZzYz3 = zzZD9.zzYz(zzzd52);
                                            }
                                        }
                                    }
                                    String strZzVG2 = zzYGI.zzVG(zzYGC.encode(zzzd9ZzYz3.zzXL5()));
                                    if (string3 == null) {
                                        this.zzVRl.put(strZzVG2, privateKeyZzZ2);
                                    } else {
                                        this.zzVRk.put(string3, strZzVG2);
                                    }
                                } else if (zzz8yZzXA2.zzXIT().equals(zzZ96.zzWwI)) {
                                    PrivateKey privateKeyZzV = this.zzVWk.zzV(zzZ94.zzXG(zzz8yZzXA2.zzXIS()));
                                    Enumeration enumerationZzXKE3 = zzz8yZzXA2.zzXIR().zzXKE();
                                    zzZD9 zzzd9ZzYz4 = null;
                                    String string4 = null;
                                    while (enumerationZzXKE3.hasMoreElements()) {
                                        zzZD4 zzzd45 = (zzZD4) enumerationZzXKE3.nextElement();
                                        zzZDA zzzda3 = (zzZDA) zzzd45.zzg6(0);
                                        zzZD2 zzzd23 = (zzZD2) zzzd45.zzg6(1);
                                        if (zzzd23.size() > 0) {
                                            zzZD5 zzzd53 = (zzZD5) zzzd23.zzg6(0);
                                            if (zzzda3.equals(zzZ96.zzWxK)) {
                                                if (string4 != null && !string4.equals(zzZCH.zzYv(zzzd53).getString())) {
                                                    throw new IOException("attempt to add existing attribute with different value");
                                                }
                                                string4 = zzZCH.zzYv(zzzd53).getString();
                                                this.zzVRl.put(string4, privateKeyZzV);
                                            } else if (!zzzda3.equals(zzZ96.zzWxJ)) {
                                                continue;
                                            } else {
                                                if (zzzd9ZzYz4 != null && !zzzd9ZzYz4.equals(zzzd53)) {
                                                    throw new IOException("attempt to add existing attribute with different value");
                                                }
                                                zzzd9ZzYz4 = zzZD9.zzYz(zzzd53);
                                            }
                                        }
                                    }
                                    String strZzVG3 = zzYGI.zzVG(zzYGC.encode(zzzd9ZzYz4.zzXL5()));
                                    if (string4 == null) {
                                        this.zzVRl.put(strZzVG3, privateKeyZzV);
                                    } else {
                                        this.zzVRk.put(string4, strZzVG3);
                                    }
                                } else {
                                    zzYO1.zzVRs.info("extra in encryptedData " + zzz8yZzXA2.zzXIT());
                                    zzYO1.zzVRs.fine(zzZ8F.zzXr(zzz8yZzXA2));
                                }
                            }
                        } else {
                            zzYO1.zzVRs.info("extra " + zzz9hArr[i].zzXJW().getId());
                            zzYO1.zzVRs.fine("extra " + zzZ8F.zzXr(zzz9hArr[i].zzXJV()));
                        }
                    }
                    i++;
                    zzz9hArrZzXJp = zzz9hArr;
                    b = 0;
                }
            } else {
                z = false;
            }
            this.zzVRj = new zzY((byte) 0);
            this.zzVRi = new Hashtable();
            this.zzVRh = new Hashtable();
            for (int i4 = 0; i4 != vector.size(); i4++) {
                zzZ8Y zzz8y = (zzZ8Y) vector.elementAt(i4);
                zzZ9I zzz9iZzXT = zzZ9I.zzXT(zzz8y.zzXIS());
                if (!zzz9iZzXT.zzXJo().equals(zzZ96.zzWxG)) {
                    throw new IOException("Unsupported certificate type: " + zzz9iZzXT.zzXJo());
                }
                try {
                    Certificate certificateGenerateCertificate = this.zzVRf.generateCertificate(new ByteArrayInputStream(((zzZD9) zzz9iZzXT.zzXJn()).zzXL5()));
                    if (zzz8y.zzXIR() != null) {
                        Enumeration enumerationZzXKE4 = zzz8y.zzXIR().zzXKE();
                        zzzd9ZzYz = null;
                        string = null;
                        while (enumerationZzXKE4.hasMoreElements()) {
                            zzZD4 zzzd46 = (zzZD4) enumerationZzXKE4.nextElement();
                            zzZDA zzzda4 = (zzZDA) zzzd46.zzg6(0);
                            zzZD5 zzzd54 = (zzZD5) ((zzZD2) zzzd46.zzg6(1)).zzg6(0);
                            if (zzzda4.equals(zzZ96.zzWxK)) {
                                if (string != null && !string.equals(zzZCH.zzYv(zzzd54).getString())) {
                                    throw new IOException("attempt to add existing attribute with different value");
                                }
                                string = zzZCH.zzYv(zzzd54).getString();
                            } else if (!zzzda4.equals(zzZ96.zzWxJ)) {
                                continue;
                            } else {
                                if (zzzd9ZzYz != null && !zzzd9ZzYz.equals(zzzd54)) {
                                    throw new IOException("attempt to add existing attribute with different value");
                                }
                                zzzd9ZzYz = zzZD9.zzYz(zzzd54);
                            }
                        }
                    } else {
                        zzzd9ZzYz = null;
                        string = null;
                    }
                    this.zzVRi.put(new zzZ(certificateGenerateCertificate.getPublicKey()), certificateGenerateCertificate);
                    if (!z) {
                        if (zzzd9ZzYz != null) {
                            this.zzVRh.put(zzYGI.zzVG(zzYGC.encode(zzzd9ZzYz.zzXL5())), certificateGenerateCertificate);
                        }
                        if (string != null) {
                            this.zzVRj.put(string, certificateGenerateCertificate);
                        }
                    } else if (this.zzVRh.isEmpty()) {
                        String strZzVG4 = zzYGI.zzVG(zzYGC.encode(zzW(certificateGenerateCertificate.getPublicKey()).zzXIn()));
                        this.zzVRh.put(strZzVG4, certificateGenerateCertificate);
                        zzY zzy = this.zzVRl;
                        zzy.put(strZzVG4, zzy.remove("unmarked"));
                    }
                } catch (Exception e3) {
                    throw new zzYO6(e3.toString(), e3);
                }
            }
        }

        @Override // java.security.KeyStoreSpi
        public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            if (this.zzVRl.get(str) != null) {
                throw new KeyStoreException(C20593OooO0Oo.OooO0O0("There is a key entry with the name ", str, "."));
            }
            this.zzVRj.put(str, certificate);
            zzY(certificate);
        }

        @Override // java.security.KeyStoreSpi
        public void engineSetEntry(String str, KeyStore.Entry entry, KeyStore.ProtectionParameter protectionParameter) throws KeyStoreException {
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                super.engineSetEntry(str, entry, new KeyStore.PasswordProtection(new char[0]));
            } else {
                if (entry instanceof KeyStore.SecretKeyEntry) {
                    throw new KeyStoreException("PKCS12 does not support storage of symmetric keys.");
                }
                super.engineSetEntry(str, entry, null);
            }
        }

        @Override // java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("operation not supported");
        }

        @Override // java.security.KeyStoreSpi
        public int engineSize() {
            Hashtable hashtable = new Hashtable();
            Enumeration enumerationKeys = this.zzVRj.keys();
            while (enumerationKeys.hasMoreElements()) {
                hashtable.put(enumerationKeys.nextElement(), "cert");
            }
            Enumeration enumerationKeys2 = this.zzVRl.keys();
            while (enumerationKeys2.hasMoreElements()) {
                String str = (String) enumerationKeys2.nextElement();
                if (hashtable.get(str) == null) {
                    hashtable.put(str, "key");
                }
            }
            return hashtable.size();
        }

        @Override // java.security.KeyStoreSpi
        public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            if (loadStoreParameter == null) {
                throw new IllegalArgumentException("'param' arg cannot be null");
            }
            if (loadStoreParameter instanceof zzYRI) {
                engineLoad(((zzYRI) loadStoreParameter).getInputStream(), zzYNC.zzZ(loadStoreParameter));
            } else {
                if (!(loadStoreParameter instanceof zzYRA)) {
                    throw new IllegalArgumentException("no support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
                }
                zzYRA zzyra = (zzYRA) loadStoreParameter;
                zzZ(zzyra.getOutputStream(), zzYNC.zzZ(loadStoreParameter), zzyra.zzXBX());
            }
        }

        public static class zzZ {
            byte[] zzVRd;

            public zzZ(PublicKey publicKey) throws IOException {
                this.zzVRd = zzS.zzW(publicKey).zzXIn();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof zzZ) {
                    return zzYGU.zzp(this.zzVRd, ((zzZ) obj).zzVRd);
                }
                return false;
            }

            public final int hashCode() {
                return zzYGU.hashCode(this.zzVRd);
            }

            public zzZ(byte[] bArr) {
                this.zzVRd = bArr;
            }
        }

        public zzS(boolean z, zzYQ8 zzyq8, Provider provider, zzZDA zzzda, zzZDA zzzda2) {
            byte b = 0;
            this.zzVRm = new zzY(b);
            this.zzVRl = new zzY(b);
            this.zzVRk = new Hashtable();
            this.zzVRj = new zzY(b);
            this.zzVRi = new Hashtable();
            this.zzVRh = new Hashtable();
            this.zzVRg = false;
            this.zzVTz = z;
            this.zzVWk = zzyq8;
            this.zzWGs = zzzda;
            this.zzVRe = zzzda2;
            this.zzWk5 = zzyq8.zzXBp();
            try {
                if (provider != null) {
                    this.zzVRf = CertificateFactory.getInstance("X.509", provider);
                } else {
                    this.zzVRf = CertificateFactory.getInstance("X.509");
                }
            } catch (Exception e) {
                throw new IllegalArgumentException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("can't create cert factory - ")));
            }
        }

        @Override // java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            if (!(key instanceof PrivateKey)) {
                throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
            }
            if (certificateArr == null) {
                throw new KeyStoreException("no certificate chain for private key");
            }
            if (this.zzVRl.get(str) != null) {
                engineDeleteEntry(str);
            }
            try {
                new zzYRH(certificateArr[0].getPublicKey(), (PrivateKey) key);
                this.zzVRl.put(str, key);
                this.zzVRm.put(str, key);
                this.zzVRj.put(str, certificateArr[0]);
                for (int i = 0; i != certificateArr.length; i++) {
                    zzY(certificateArr[i]);
                }
            } catch (IllegalArgumentException e) {
                throw new KeyStoreException(e.getMessage());
            }
        }

        public static class zzY {
            private Hashtable zzVRb;
            private Hashtable zzVRc;

            private zzY() {
                this.zzVRc = new Hashtable();
                this.zzVRb = new Hashtable();
            }

            public final void clear() {
                this.zzVRc.clear();
            }

            public final Enumeration elements() {
                return this.zzVRc.elements();
            }

            public final Object get(String str) {
                String str2;
                if (str == null || (str2 = (String) this.zzVRb.get(zzYGI.toLowerCase(str))) == null) {
                    return null;
                }
                return this.zzVRc.get(str2);
            }

            public final Enumeration keys() {
                return this.zzVRc.keys();
            }

            public final void put(String str, Object obj) {
                String lowerCase = zzYGI.toLowerCase(str);
                String str2 = (String) this.zzVRb.get(lowerCase);
                if (str2 != null) {
                    this.zzVRc.remove(str2);
                }
                this.zzVRb.put(lowerCase, str);
                this.zzVRc.put(str, obj);
            }

            public final Object remove(String str) {
                String str2;
                if (str == null || (str2 = (String) this.zzVRb.remove(zzYGI.toLowerCase(str))) == null) {
                    return null;
                }
                return this.zzVRc.remove(str2);
            }

            public /* synthetic */ zzY(byte b) {
                this();
            }
        }

        private Cipher zzY(int i, char[] cArr, zzZ86 zzz86) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            SecretKey secretKeyGenerateSecret;
            zzZ99 zzz99ZzXK = zzZ99.zzXK(zzz86.zzXJj());
            zzZ98 zzz98ZzXJ = zzZ98.zzXJ(zzz99ZzXK.zzXJg().zzXJj());
            zzZ86 zzz86ZzXm = zzZ86.zzXm(zzz99ZzXK.zzXJf());
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(zzz99ZzXK.zzXJg().zzXJk().getId(), this.zzVWk);
            if (zzz98ZzXJ.zzXJe()) {
                secretKeyGenerateSecret = secretKeyFactory.generateSecret(new PBEKeySpec(cArr, zzz98ZzXJ.getSalt(), zzz98ZzXJ.zzXJh().intValue(), zzYO1.zzVRr.zzT(zzz86ZzXm) * 8));
            } else {
                secretKeyGenerateSecret = secretKeyFactory.generateSecret(new zzYMD(cArr, zzz98ZzXJ.getSalt(), zzz98ZzXJ.zzXJh().intValue(), zzYO1.zzVRr.zzT(zzz86ZzXm) * 8, zzz98ZzXJ.zzXJd()));
            }
            Cipher cipher = Cipher.getInstance(zzz86ZzXm.zzXJk().getId());
            zzZDK zzzdkZzXJj = zzz86ZzXm.zzXJj();
            if (zzzdkZzXJj instanceof zzZD9) {
                cipher.init(i, secretKeyGenerateSecret, new IvParameterSpec(zzZD9.zzYz(zzzdkZzXJj).zzXL5()));
                return cipher;
            }
            zzZAC zzzacZzY4 = zzZAC.zzY4(zzzdkZzXJj);
            cipher.init(i, secretKeyGenerateSecret, new zzYMO(zzzacZzY4.zzXJx(), zzzacZzY4.getIV()));
            return cipher;
        }

        private PrivateKey zzZ(zzZ86 zzz86, byte[] bArr, char[] cArr) throws IOException {
            Cipher cipherZzY;
            zzZDA zzzdaZzXJk = zzz86.zzXJk();
            try {
                if (zzzdaZzXJk.zzY(zzZ96.zzWwC)) {
                    cipherZzY = zzZ(4, cArr, zzz86);
                } else if (zzzdaZzXJk.equals(zzZ96.zzWyc)) {
                    cipherZzY = zzY(4, cArr, zzz86);
                } else {
                    throw new IOException("exception unwrapping private key - cannot recognize: " + zzzdaZzXJk);
                }
                return (PrivateKey) cipherZzY.unwrap(bArr, "", 2);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new zzYO6(C22245OooO0oO.OooO0Oo(e2, new StringBuilder("exception unwrapping private key - ")), e2);
            }
        }

        @Override // java.security.KeyStoreSpi
        public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
            zzZ(outputStream, cArr, false);
        }

        private byte[] zzZ(zzZ86 zzz86, Key key, char[] cArr) throws IOException {
            Cipher cipherZzY;
            zzZDA zzzdaZzXJk = zzz86.zzXJk();
            try {
                if (zzzdaZzXJk.zzY(zzZ96.zzWwC)) {
                    cipherZzY = zzZ(3, cArr, zzz86);
                } else if (zzzdaZzXJk.equals(zzZ96.zzWyc)) {
                    cipherZzY = zzY(3, cArr, zzz86);
                } else {
                    throw new IOException("exception unwrapping private key - cannot recognize: " + zzzdaZzXJk);
                }
                return cipherZzY.wrap(key);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new zzYO6(C22245OooO0oO.OooO0Oo(e2, new StringBuilder("exception unwrapping private key - ")), e2);
            }
        }

        private byte[] zzZ(boolean z, zzZ86 zzz86, char[] cArr, byte[] bArr) throws IOException {
            Cipher cipherZzY;
            zzZDA zzzdaZzXJk = zzz86.zzXJk();
            int i = z ? 1 : 2;
            try {
                if (zzzdaZzXJk.zzY(zzZ96.zzWwC)) {
                    cipherZzY = zzZ(i, cArr, zzz86);
                } else if (zzzdaZzXJk.equals(zzZ96.zzWyc)) {
                    cipherZzY = zzY(i, cArr, zzz86);
                } else {
                    throw new IOException("unknown PBE algorithm: " + zzzdaZzXJk);
                }
                return cipherZzY.doFinal(bArr);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new zzYO6(C22245OooO0oO.OooO0Oo(e2, new StringBuilder("exception decrypting data - ")), e2);
            }
        }

        private Cipher zzZ(int i, char[] cArr, zzZ86 zzz86) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            zzZ97 zzz97ZzXI = zzZ97.zzXI(zzz86.zzXJj());
            Cipher cipher = Cipher.getInstance(zzz86.zzXJk().getId(), this.zzVWk);
            cipher.init(i, new zzYRB(cArr, this.zzVRg, zzz97ZzXI.getIV(), zzz97ZzXI.zzXJc().intValue()));
            return cipher;
        }

        private void zzZ(OutputStream outputStream, char[] cArr, boolean z) throws IOException {
            zzZD7 zzzcq;
            zzZD7 zzzcq2;
            if (cArr != null) {
                zzZDJ zzzdj = new zzZDJ();
                Enumeration enumerationKeys = this.zzVRl.keys();
                while (enumerationKeys.hasMoreElements()) {
                    byte[] bArr = new byte[20];
                    this.zzWk5.nextBytes(bArr);
                    String str = (String) enumerationKeys.nextElement();
                    PrivateKey privateKey = (PrivateKey) this.zzVRl.get(str);
                    zzZ86 zzz86 = new zzZ86(this.zzWGs, new zzZ97(bArr, 1024));
                    zzZ9E zzz9e = new zzZ9E(zzz86, zzZ(zzz86, privateKey, cArr));
                    zzZDJ zzzdj2 = new zzZDJ();
                    zzZDJ zzzdj3 = new zzZDJ();
                    Certificate certificateEngineGetCertificate = engineGetCertificate(str);
                    zzzdj3.zzZ(zzZ96.zzWxJ);
                    zzzdj3.zzZ(new zzZC0(zzW(certificateEngineGetCertificate.getPublicKey())));
                    zzzdj2.zzZ(new zzZC2(zzzdj3));
                    zzZDJ zzzdj4 = new zzZDJ();
                    zzzdj4.zzZ(zzZ96.zzWxK);
                    zzzdj4.zzZ(new zzZC0(new zzZCH(str)));
                    zzzdj2.zzZ(new zzZC2(zzzdj4));
                    zzzdj.zzZ(new zzZ8Y(zzZ96.zzWwH, zzz9e.zzXL0(), new zzZC0(zzzdj2)));
                }
                zzZCS zzzcs = new zzZCS(new zzZC2(zzzdj).getEncoded("DER"));
                byte[] bArr2 = new byte[20];
                this.zzWk5.nextBytes(bArr2);
                zzZDJ zzzdj5 = new zzZDJ();
                zzZ86 zzz862 = new zzZ86(this.zzVRe, new zzZ97(bArr2, 1024).zzXL0());
                Hashtable hashtable = new Hashtable();
                Enumeration enumerationKeys2 = this.zzVRl.keys();
                while (enumerationKeys2.hasMoreElements()) {
                    try {
                        String str2 = (String) enumerationKeys2.nextElement();
                        Certificate certificateEngineGetCertificate2 = engineGetCertificate(str2);
                        zzZ9I zzz9i = new zzZ9I(zzZ96.zzWxG, new zzZC6(certificateEngineGetCertificate2.getEncoded()));
                        zzZDJ zzzdj6 = new zzZDJ();
                        zzZDJ zzzdj7 = new zzZDJ();
                        zzzdj7.zzZ(zzZ96.zzWxJ);
                        Enumeration enumeration = enumerationKeys2;
                        zzzdj7.zzZ(new zzZC0(zzW(certificateEngineGetCertificate2.getPublicKey())));
                        zzzdj6.zzZ(new zzZC2(zzzdj7));
                        zzZDJ zzzdj8 = new zzZDJ();
                        zzzdj8.zzZ(zzZ96.zzWxK);
                        zzzdj8.zzZ(new zzZC0(new zzZCH(str2)));
                        zzzdj6.zzZ(new zzZC2(zzzdj8));
                        zzzdj5.zzZ(new zzZ8Y(zzZ96.zzWwG, zzz9i.zzXL0(), new zzZC0(zzzdj6)));
                        hashtable.put(certificateEngineGetCertificate2, certificateEngineGetCertificate2);
                        enumerationKeys2 = enumeration;
                    } catch (CertificateEncodingException e) {
                        throw new IOException("Error encoding certificate: " + e.toString());
                    }
                }
                Enumeration enumerationKeys3 = this.zzVRj.keys();
                while (enumerationKeys3.hasMoreElements()) {
                    try {
                        String str3 = (String) enumerationKeys3.nextElement();
                        Certificate certificate = (Certificate) this.zzVRj.get(str3);
                        if (this.zzVRl.get(str3) == null) {
                            zzZ9I zzz9i2 = new zzZ9I(zzZ96.zzWxG, new zzZC6(certificate.getEncoded()));
                            zzZDJ zzzdj9 = new zzZDJ();
                            zzZDJ zzzdj10 = new zzZDJ();
                            zzzdj10.zzZ(zzZ96.zzWxK);
                            Enumeration enumeration2 = enumerationKeys3;
                            zzzdj10.zzZ(new zzZC0(new zzZCH(str3)));
                            zzzdj9.zzZ(new zzZC2(zzzdj10));
                            zzzdj5.zzZ(new zzZ8Y(zzZ96.zzWwG, zzz9i2.zzXL0(), new zzZC0(zzzdj9)));
                            hashtable.put(certificate, certificate);
                            enumerationKeys3 = enumeration2;
                        }
                    } catch (CertificateEncodingException e2) {
                        throw new IOException("Error encoding certificate: " + e2.toString());
                    }
                }
                Set setZzXAz = zzXAz();
                Enumeration enumerationKeys4 = this.zzVRi.keys();
                while (enumerationKeys4.hasMoreElements()) {
                    try {
                        Certificate certificate2 = (Certificate) this.zzVRi.get((zzZ) enumerationKeys4.nextElement());
                        if (setZzXAz.contains(certificate2) && hashtable.get(certificate2) == null) {
                            zzzdj5.zzZ(new zzZ8Y(zzZ96.zzWwG, new zzZ9I(zzZ96.zzWxG, new zzZC6(certificate2.getEncoded())).zzXL0(), new zzZC0(new zzZDJ())));
                        }
                    } catch (CertificateEncodingException e3) {
                        throw new IOException("Error encoding certificate: " + e3.toString());
                    }
                }
                byte[] bArrZzZ = zzZ(true, zzz862, cArr, new zzZC2(zzzdj5).getEncoded("DER"));
                zzZDA zzzda = zzZ96.zzWFM;
                zzZ9J zzz9j = new zzZ9J(new zzZ9H[]{new zzZ9H(zzzda, zzzcs), new zzZ9H(zzZ96.zzWFH, new zzZ9F(zzzda, zzz862, new zzZCS(bArrZzZ)).zzXL0())});
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (z) {
                    zzzcq = new zzZC4(byteArrayOutputStream);
                } else {
                    zzzcq = new zzZCQ(byteArrayOutputStream);
                }
                zzzcq.zzY(zzz9j);
                zzZ9H zzz9h = new zzZ9H(zzzda, new zzZCS(byteArrayOutputStream.toByteArray()));
                byte[] bArr3 = new byte[20];
                this.zzWk5.nextBytes(bArr3);
                byte[] bArrZzXL5 = ((zzZD9) zzz9h.zzXJV()).zzXL5();
                try {
                    zzZ86 zzz863 = new zzZ86(zzZ79.zzWpe, zzZC8.zzWHS);
                    zzZ95 zzz95 = new zzZ95(zzz9h, new zzZ9B(new zzZ7X(zzz863, zzZ(zzz863, bArr3, 1024, cArr, bArrZzXL5)), bArr3));
                    if (z) {
                        zzzcq2 = new zzZC4(outputStream);
                    } else {
                        zzzcq2 = new zzZCQ(outputStream);
                    }
                    zzzcq2.zzY(zzz95);
                    return;
                } catch (Exception e4) {
                    throw new IOException(C22245OooO0oO.OooO0Oo(e4, new StringBuilder("error constructing MAC: ")));
                }
            }
            throw new NullPointerException("No password supplied for PKCS#12 KeyStore.");
        }

        private byte[] zzZ(zzZ86 zzz86, byte[] bArr, int i, byte[] bArr2) throws Exception {
            byte[] bArrZzZ = zzZ(zzz86, new byte[2], bArr, i);
            String id = zzz86.zzXJk().getId();
            Mac mac = Mac.getInstance(id, this.zzVWk);
            mac.init(new SecretKeySpec(bArrZzZ, id));
            mac.update(bArr2);
            return mac.doFinal();
        }

        private byte[] zzZ(zzZ86 zzz86, byte[] bArr, int i, char[] cArr, byte[] bArr2) throws Exception {
            byte[] bArrZzZ = zzZ(zzz86, zzZ4I.PKCS12.zzI(cArr), bArr, i);
            String id = zzz86.zzXJk().getId();
            Mac mac = Mac.getInstance(id, this.zzVWk);
            mac.init(new SecretKeySpec(bArrZzZ, id));
            mac.update(bArr2);
            return mac.doFinal();
        }

        private static byte[] zzZ(zzZ86 zzz86, byte[] bArr, byte[] bArr2, int i) {
            zzZ4K<zzYWQ.zzT> zzz4kZzZ;
            int i2 = 32;
            if (zzz86.zzXJk().equals(zzZAE.zzWF1)) {
                new zzYWQ.zzZ();
                zzz4kZzZ = zzYWQ.zzZ.zzZ(zzYWQ.zzW58.zzZ(zzYW0.zzZ.zzW1U, bArr).zzWm(bArr2).zzfo(i));
            } else if (zzz86.zzXJk().equals(zzZ9O.zzWAI)) {
                new zzYWQ.zzZ();
                zzz4kZzZ = zzYWQ.zzZ.zzZ(zzYWQ.zzW58.zzZ(zzZ0P.zzZ.zzWdJ, bArr).zzWm(bArr2).zzfo(i));
                i2 = 28;
            } else if (zzz86.zzXJk().equals(zzZ9O.zzWAL)) {
                new zzYWQ.zzZ();
                zzz4kZzZ = zzYWQ.zzZ.zzZ(zzYWQ.zzW58.zzZ(zzZ0P.zzZ.zzWdH, bArr).zzWm(bArr2).zzfo(i));
            } else {
                new zzYWQ.zzZ();
                zzz4kZzZ = zzYWQ.zzZ.zzZ(zzYWQ.zzW58.zzZ(zzZ0P.zzZ.zzWdL, bArr).zzWm(bArr2).zzfo(i));
                i2 = 20;
            }
            return zzz4kZzZ.zzZ(zzZ4K.zzZ.MAC, i2);
        }
    }

    public static class zzU extends zzYQH {
        private final zzZ4K.zzZ zzVRn;
        private final zzZ1J zzVRo;
        private final String zzVRt;

        public zzU(String str, zzZ1J zzz1j, zzZ4K.zzZ zzz) {
            this.zzVRt = str;
            this.zzVRo = zzz1j;
            this.zzVRn = zzz;
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec: ".concat(keySpec.getClass().getName()));
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            return pBEKeySpec.getSalt() == null ? new zzYRC(pBEKeySpec.getPassword()) : zzYO1.zzZ(this.zzVRo, this.zzVRt, pBEKeySpec, this.zzVRn, pBEKeySpec.getKeyLength());
        }
    }

    public static class zzV extends zzS {
        public zzV(zzYQ8 zzyq8) {
            super(zzyq8, null, zzZ96.zzWwz, zzZ96.zzWww);
        }
    }

    public static class zzW extends zzS {
        /* JADX WARN: Illegal instructions before constructor call */
        public zzW(zzYQ8 zzyq8) {
            zzZDA zzzda = zzZ96.zzWwz;
            super(zzyq8, null, zzzda, zzzda);
        }
    }

    public static class zzX extends zzS {
        public zzX(zzYQ8 zzyq8) {
            super(zzyq8, zzyq8, zzZ96.zzWwz, zzZ96.zzWww);
        }
    }

    public static class zzY extends zzS {
        /* JADX WARN: Illegal instructions before constructor call */
        public zzY(zzYQ8 zzyq8) {
            zzZDA zzzda = zzZ96.zzWwz;
            super(true, zzyq8, zzyq8, zzzda, zzzda);
        }
    }

    public static class zzZ extends zzYQK {
        zzZ97 zzVRp;

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF-PKCS12 parameters algorithm parameters object");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.zzVRp = new zzZ97(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        }

        @Override // java.security.AlgorithmParametersSpi
        public final String engineToString() {
            return "PBKDF-PKCS12 Parameters";
        }

        @Override // com.aspose.words.internal.zzYQK
        public final void zzVV(byte[] bArr) throws IOException {
            this.zzVRp = zzZ97.zzXI(bArr);
        }

        @Override // com.aspose.words.internal.zzYQK
        public final byte[] zzXBF() throws IOException {
            return this.zzVRp.getEncoded("DER");
        }

        @Override // com.aspose.words.internal.zzYQK
        public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new PBEParameterSpec(this.zzVRp.getIV(), this.zzVRp.zzXJc().intValue());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }
    }

    public static SecretKey zzZ(zzZ5K zzz5k, String str, PBEKeySpec pBEKeySpec, zzZ4K.zzZ zzz, int i) {
        new zzYWQ.zzZ();
        return new zzYPE(zzYWQ.zzZ.zzZ(zzYWQ.zzW58.zzZ(zzz5k, zzZ4I.PKCS12, pBEKeySpec.getPassword()).zzfo(pBEKeySpec.getIterationCount()).zzWm(pBEKeySpec.getSalt())).zzZ(zzz, (i + 7) / 8), str, pBEKeySpec);
    }

    public static class zzT extends zzYQH {
        private final zzZ4K.zzZ zzVRn;
        private final String zzVRt;
        private final zzZ5K zzVWe;
        private final int zzWiC;

        public zzT(String str, zzZ5K zzz5k, zzZ4K.zzZ zzz, int i) {
            this.zzVRt = str;
            this.zzVWe = zzz5k;
            this.zzVRn = zzz;
            this.zzWiC = i;
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public final SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec: ".concat(keySpec.getClass().getName()));
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            return pBEKeySpec.getSalt() == null ? new zzYRC(pBEKeySpec.getPassword()) : zzYO1.zzZ(this.zzVWe, this.zzVRt, pBEKeySpec, this.zzVRn, this.zzWiC);
        }

        public zzT(String str, zzZ4K.zzZ zzz, int i) {
            this(str, zzZ0P.zzZ.zzWdL, zzz, i);
        }
    }

    public static byte[] zzZ(SecretKey secretKey, PBEParameterSpec pBEParameterSpec, zzZ4K.zzZ zzz, int i) {
        new zzYWQ.zzZ();
        return zzYWQ.zzZ.zzZ(zzYWQ.zzW58.zzZ(zzZ0P.zzZ.zzWdL, secretKey.getEncoded()).zzfo(pBEParameterSpec.getIterationCount()).zzWm(pBEParameterSpec.getSalt())).zzZ(zzz, (i + 7) / 8);
    }

    public static byte[] zzZ(SecretKey secretKey, zzZ5K zzz5k, PBEParameterSpec pBEParameterSpec, zzZ4K.zzZ zzz, int i) {
        new zzYWQ.zzZ();
        return zzYWQ.zzZ.zzZ(zzYWQ.zzW58.zzZ(zzz5k, secretKey.getEncoded()).zzfo(pBEParameterSpec.getIterationCount()).zzWm(pBEParameterSpec.getSalt())).zzZ(zzz, (i + 7) / 8);
    }

    public static byte[][] zzZ(SecretKey secretKey, zzZ5K zzz5k, PBEParameterSpec pBEParameterSpec, zzZ4K.zzZ zzz, int i, int i2) {
        new zzYWQ.zzZ();
        return zzYWQ.zzZ.zzZ(zzYWQ.zzW58.zzZ(zzz5k, secretKey.getEncoded()).zzfo(pBEParameterSpec.getIterationCount()).zzWm(pBEParameterSpec.getSalt())).zzZ(zzz, (i + 7) / 8, (i2 + 7) / 8);
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("KeyStore.PKCS12", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$BCPKCS12KeyStore3DES", new zzYPS() { // from class: com.aspose.words.internal.zzYO1.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(zzyq8);
            }
        });
        zzyq8.zzXp("Alg.Alias.KeyStore.BCPKCS12", "PKCS12");
        zzyq8.zzXp("Alg.Alias.KeyStore.PKCS12-3DES-3DES", "PKCS12");
        zzyq8.zzZ("KeyStore.PKCS12-DEF", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$DefPKCS12KeyStore3DES", new zzYPS() { // from class: com.aspose.words.internal.zzYO1.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzW(zzyq8);
            }
        });
        zzyq8.zzXp("Alg.Alias.KeyStore.PKCS12-DEF-3DES-3DES", "PKCS12-DEF");
        zzyq8.zzZ("KeyStore.PKCS12-3DES-40RC2", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$BCPKCS12KeyStore", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO1.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzX(zzyq8);
            }
        }));
        zzyq8.zzZ("KeyStore.PKCS12-DEF-3DES-40RC2", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$DefPKCS12KeyStore", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO1.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzV(zzyq8);
            }
        }));
        zzyq8.zzZ("AlgorithmParameters.PBKDF-PKCS12", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12AlgParams", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO1.5
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        }));
        zzyq8.zzZ("AlgorithmParameters.PBKDF-PKCS12WITHSHA256", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12SHA256AlgParams", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO1.6
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ();
            }
        }));
        zzyq8.zzZ("SecretKeyFactory.PBKDF-PKCS12", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12SecKeyFact", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO1.7
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzU("PBKDF-PKCS12withSHA1", zzZ0P.zzZ.zzWdL, zzZ4K.zzZ.CIPHER);
            }
        }));
        zzyq8.zzZ("SecretKeyFactory.PBKDF-PKCS12WITHSHA256", "org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12SHA256SecKeyFact", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYO1.8
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzU("PBKDF-PKCS12withSHA256", zzZ0P.zzZ.zzWdH, zzZ4K.zzZ.CIPHER);
            }
        }));
    }
}
