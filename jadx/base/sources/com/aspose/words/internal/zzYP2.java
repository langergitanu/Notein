package com.aspose.words.internal;

import OooO0o.C20424OooO0Oo;
import OooOoo.C20593OooO0Oo;
import com.aspose.words.internal.zzYRJ;
import com.aspose.words.internal.zzYZH;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ0T;
import com.aspose.words.internal.zzZ1T;
import com.aspose.words.internal.zzZ4K;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYP2 extends zzYQR {
    private static final Map<zzZDA, String> zzVTJ;
    private static final Map<String, zzZDA> zzVTK;

    public static class zzZ extends zzY implements zzZ79, zzZ96 {
        private boolean zzVTF;
        private final byte[] zzVTG;
        private final Map<String, byte[]> zzVTH;

        public zzZ(zzYQ8 zzyq8) {
            super(false, zzyq8);
            try {
                byte[] bArr = new byte[32];
                this.zzVTG = bArr;
                if (zzyq8 != null) {
                    SecureRandom.getInstance("DEFAULT", zzyq8).nextBytes(bArr);
                } else {
                    SecureRandom.getInstance("DEFAULT").nextBytes(bArr);
                }
                this.zzVTH = new HashMap();
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalArgumentException("can't create cert factory - " + e.toString());
            }
        }

        private byte[] zzQ(String str, char[] cArr) {
            byte[] bArrZzn = cArr != null ? zzYGU.zzn(zzYGI.zzD(cArr), zzYGI.zzwc(str)) : zzYGU.zzn(this.zzVTG, zzYGI.zzwc(str));
            byte[] bArr = new byte[32];
            zzYZH.zzZ zzz = new zzYZH.zzZ();
            zzYZH.zzX zzx = zzYZH.zzWbg;
            zzz.zzY(zzYZH.zzX.zzZ(this.zzVTG, 16384, 8, 1, bArrZzn)).zzXi(bArr);
            return bArr;
        }

        @Override // com.aspose.words.internal.zzYP2.zzY, java.security.KeyStoreSpi
        public final void engineDeleteEntry(String str) throws KeyStoreException {
            throw new KeyStoreException("delete operation not supported in immutable mode");
        }

        @Override // com.aspose.words.internal.zzYP2.zzY, java.security.KeyStoreSpi
        public final Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException, NoSuchAlgorithmException {
            byte[] bArrZzQ = zzQ(str, cArr);
            if (this.zzVTH.containsKey(str) && !zzYGU.zzo(this.zzVTH.get(str), bArrZzQ)) {
                throw new UnrecoverableKeyException(C20593OooO0Oo.OooO0O0("unable to recover key (", str, ")"));
            }
            Key keyEngineGetKey = super.engineGetKey(str, cArr);
            if (keyEngineGetKey != null && !this.zzVTH.containsKey(str)) {
                this.zzVTH.put(str, bArrZzQ);
            }
            return keyEngineGetKey;
        }

        @Override // com.aspose.words.internal.zzYP2.zzY, java.security.KeyStoreSpi
        public final void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            synchronized (this) {
                if (this.zzVTF) {
                    throw new IOException("immutable keystore already loaded");
                }
                this.zzVTF = true;
            }
            super.engineLoad(loadStoreParameter);
        }

        @Override // com.aspose.words.internal.zzYP2.zzY, java.security.KeyStoreSpi
        public final void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in immutable mode");
        }

        @Override // com.aspose.words.internal.zzYP2.zzY, java.security.KeyStoreSpi
        public final void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in immutable mode");
        }

        @Override // com.aspose.words.internal.zzYP2.zzY, java.security.KeyStoreSpi
        public final void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in immutable mode");
        }

        @Override // com.aspose.words.internal.zzYP2.zzY, java.security.KeyStoreSpi
        public final void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            synchronized (this) {
                if (!this.zzVTF) {
                    this.zzVTF = true;
                } else {
                    throw new IOException("immutable keystore already loaded");
                }
            }
            super.engineLoad(inputStream, cArr);
        }
    }

    static {
        HashMap map = new HashMap();
        zzVTK = map;
        HashMap map2 = new HashMap();
        zzVTJ = map2;
        zzZDA zzzda = zzZ9K.zzWyX;
        map.put("DESEDE", zzzda);
        map.put("TRIPLEDES", zzzda);
        map.put("TDEA", zzzda);
        map.put("HMACSHA1", zzZ96.zzWy4);
        map.put("HMACSHA224", zzZ96.zzWy3);
        map.put("HMACSHA256", zzZ96.zzWy2);
        map.put("HMACSHA384", zzZ96.zzWy1);
        map.put("HMACSHA512", zzZ96.zzWy0);
        map.put("SEED", zzZ9X.zzWBz);
        map.put("CAMELLIA.128", zzZ9M.zzWzb);
        map.put("CAMELLIA.192", zzZ9M.zzWza);
        map.put("CAMELLIA.256", zzZ9M.zzWz9);
        map.put("ARIA.128", zzZ9N.zzWzH);
        map.put("ARIA.192", zzZ9N.zzWzC);
        map.put("ARIA.256", zzZ9N.zzWzx);
        map2.put(zzZ96.zzWyA, AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA);
        map2.put(zzZ6W.zzWoc, "EC");
        map2.put(zzZ9K.zzWyT, "DH");
        map2.put(zzZ96.zzWyk, "DH");
        map2.put(zzZ6W.zzWnD, "DSA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzJ(zzZDA zzzda) {
        String str = zzVTJ.get(zzzda);
        return str != null ? str : zzzda.getId();
    }

    @Override // com.aspose.words.internal.zzYQR
    public final void zzZ(final zzYQ8 zzyq8) {
        zzyq8.zzZ("KeyStore.BCFKS", "org.bouncycastle.jcajce.provider.keystore.bcfks.BCFKSKeyStore", new zzYPS() { // from class: com.aspose.words.internal.zzYP2.1
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(true, zzyq8);
            }
        });
        zzyq8.zzZ("KeyStore.IBCFKS", "org.bouncycastle.jcajce.provider.keystore.bcfks.IBCFKSKeyStore", new zzYPS() { // from class: com.aspose.words.internal.zzYP2.2
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ(zzyq8);
            }
        });
        if (zzZ5L.zzXH0()) {
            return;
        }
        zzyq8.zzZ("KeyStore.BCFKS-DEF", "org.bouncycastle.jcajce.provider.keystore.bcfks.BCSFKSDefKeyStore", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP2.3
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzY(false, null);
            }
        }));
        zzyq8.zzZ("KeyStore.IBCFKS-DEF", "org.bouncycastle.jcajce.provider.keystore.bcfks.IBCFKSDefKeyStore", new zzYPP(new zzYPS() { // from class: com.aspose.words.internal.zzYP2.4
            @Override // com.aspose.words.internal.zzYPS
            public final Object zzWL(Object obj) {
                return new zzZ(null);
            }
        }));
    }

    public static class zzY extends KeyStoreSpi {
        private Date zzVTt;
        private Date zzVTu;
        private zzZ9C zzVTv;
        private zzZ86 zzVTw;
        private final boolean zzVTz;
        private final zzYQ8 zzVWk;
        private static final BigInteger zzVTE = BigInteger.valueOf(0);
        private static final BigInteger zzVTD = BigInteger.valueOf(1);
        private static final BigInteger zzVTC = BigInteger.valueOf(2);
        private static final BigInteger zzVTB = BigInteger.valueOf(3);
        private static final BigInteger zzVTA = BigInteger.valueOf(4);
        private final Map<String, zzZB5> zzVTy = new HashMap();
        private final Map<String, PrivateKey> zzVTx = new HashMap();
        private zzZDA zzVTs = zzZ9O.zzWA8;

        public zzY(boolean z, zzYQ8 zzyq8) {
            this.zzVTz = z;
            this.zzVWk = zzyq8;
        }

        private Certificate zzWK(Object obj) {
            try {
                if (this.zzVWk != null) {
                    return new zzYN8(this.zzVWk, zzZ80.zzXh(obj));
                }
                try {
                    return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(zzZ80.zzXh(obj).getEncoded()));
                } catch (Exception unused) {
                    return new zzYN8(null, zzZ80.zzXh(obj));
                }
            } catch (CertificateParsingException unused2) {
                return null;
            }
        }

        private SecureRandom zzXBp() {
            zzYQ8 zzyq8 = this.zzVWk;
            return zzyq8 != null ? zzyq8.zzXBp() : new SecureRandom();
        }

        private static zzZB7 zzZ(zzZ9E zzz9e, Certificate[] certificateArr) throws CertificateEncodingException {
            zzZ80[] zzz80Arr = new zzZ80[certificateArr.length];
            for (int i = 0; i != certificateArr.length; i++) {
                zzz80Arr[i] = zzZ80.zzXh(certificateArr[i].getEncoded());
            }
            return new zzZB7(zzz9e, zzz80Arr);
        }

        private zzZ9C zzeV(int i) {
            byte[] bArr = new byte[64];
            zzXBp().nextBytes(bArr);
            return new zzZ9C(zzZ96.zzWyb, new zzZ98(bArr, 16384, i, new zzZ86(zzZ96.zzWy0, zzZC8.zzWHS)));
        }

        @Override // java.security.KeyStoreSpi
        public Enumeration<String> engineAliases() {
            final Iterator it = new HashSet(this.zzVTy.keySet()).iterator();
            return new Enumeration<String>() { // from class: com.aspose.words.internal.zzYP2.zzY.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.Enumeration
                /* JADX INFO: renamed from: zzXB7, reason: merged with bridge method [inline-methods] */
                public String nextElement() {
                    return (String) it.next();
                }

                @Override // java.util.Enumeration
                public final boolean hasMoreElements() {
                    return it.hasNext();
                }
            };
        }

        @Override // java.security.KeyStoreSpi
        public boolean engineContainsAlias(String str) {
            if (str != null) {
                return this.zzVTy.containsKey(str);
            }
            throw new NullPointerException("alias value is null");
        }

        @Override // java.security.KeyStoreSpi
        public void engineDeleteEntry(String str) throws KeyStoreException {
            if (this.zzVTy.get(str) == null) {
                return;
            }
            this.zzVTx.remove(str);
            this.zzVTy.remove(str);
            this.zzVTt = new Date();
        }

        @Override // java.security.KeyStoreSpi
        public Certificate engineGetCertificate(String str) {
            zzZB5 zzzb5 = this.zzVTy.get(str);
            if (zzzb5 == null) {
                return null;
            }
            if (zzzb5.zzXKd().equals(zzVTD) || zzzb5.zzXKd().equals(zzVTB)) {
                return zzWK(zzZB7.zzYq(zzzb5.getData()).zzXKj()[0]);
            }
            if (zzzb5.zzXKd().equals(zzVTE)) {
                return zzWK(zzzb5.getData());
            }
            return null;
        }

        @Override // java.security.KeyStoreSpi
        public String engineGetCertificateAlias(Certificate certificate) {
            if (certificate == null) {
                return null;
            }
            try {
                byte[] encoded = certificate.getEncoded();
                for (Map.Entry<String, zzZB5> entry : this.zzVTy.entrySet()) {
                    zzZB5 value = entry.getValue();
                    if (value.zzXKd().equals(zzVTE)) {
                        if (zzYGU.zzp(value.getData(), encoded)) {
                            return entry.getKey();
                        }
                    } else if (value.zzXKd().equals(zzVTD) || value.zzXKd().equals(zzVTB)) {
                        try {
                            if (zzYGU.zzp(zzZB7.zzYq(value.getData()).zzXKj()[0].zzXL0().getEncoded(), encoded)) {
                                return entry.getKey();
                            }
                            continue;
                        } catch (IOException unused) {
                            continue;
                        }
                    }
                }
            } catch (CertificateEncodingException unused2) {
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.security.KeyStoreSpi
        public Certificate[] engineGetCertificateChain(String str) {
            zzZB5 zzzb5 = this.zzVTy.get(str);
            if (zzzb5 == null) {
                return null;
            }
            if (!zzzb5.zzXKd().equals(zzVTD) && !zzzb5.zzXKd().equals(zzVTB)) {
                return null;
            }
            zzZ80[] zzz80ArrZzXKj = zzZB7.zzYq(zzzb5.getData()).zzXKj();
            int length = zzz80ArrZzXKj.length;
            X509Certificate[] x509CertificateArr = new X509Certificate[length];
            for (int i = 0; i != length; i++) {
                x509CertificateArr[i] = zzWK(zzz80ArrZzXKj[i]);
            }
            return x509CertificateArr;
        }

        @Override // java.security.KeyStoreSpi
        public Date engineGetCreationDate(String str) {
            zzZB5 zzzb5 = this.zzVTy.get(str);
            if (zzzb5 == null) {
                return null;
            }
            try {
                return zzzb5.zzXKe().getDate();
            } catch (ParseException unused) {
                return new Date();
            }
        }

        @Override // java.security.KeyStoreSpi
        public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException, NoSuchAlgorithmException {
            zzZB5 zzzb5 = this.zzVTy.get(str);
            if (zzzb5 == null) {
                return null;
            }
            if (!zzzb5.zzXKd().equals(zzVTD) && !zzzb5.zzXKd().equals(zzVTB)) {
                if (!zzzb5.zzXKd().equals(zzVTC) && !zzzb5.zzXKd().equals(zzVTA)) {
                    throw new UnrecoverableKeyException(C20593OooO0Oo.OooO0O0("BCFKS KeyStore unable to recover secret key (", str, "): type not recognized"));
                }
                zzZB6 zzzb6ZzYp = zzZB6.zzYp(zzzb5.getData());
                try {
                    zzZAZ zzzazZzYi = zzZAZ.zzYi(zzZ("SECRET_KEY_ENCRYPTION", zzzb6ZzYp.zzXKh(), cArr, zzzb6ZzYp.zzXKg()));
                    return (this.zzVWk != null ? SecretKeyFactory.getInstance(zzzazZzYi.zzXK3().getId(), this.zzVWk) : SecretKeyFactory.getInstance(zzzazZzYi.zzXK3().getId())).generateSecret(new SecretKeySpec(zzzazZzYi.zzXK4(), zzzazZzYi.zzXK3().getId()));
                } catch (Exception e) {
                    throw new UnrecoverableKeyException(OooOO0.OooO0OO.OooO0Oo(e, C20424OooO0Oo.OooO0o0("BCFKS KeyStore unable to recover secret key (", str, "): ")));
                }
            }
            PrivateKey privateKey = this.zzVTx.get(str);
            if (privateKey != null) {
                return privateKey;
            }
            zzZ9E zzz9eZzXP = zzZ9E.zzXP(zzZB7.zzYq(zzzb5.getData()).zzXKi());
            try {
                zzZ94 zzz94ZzXG = zzZ94.zzXG(zzZ("PRIVATE_KEY_ENCRYPTION", zzz9eZzXP.zzXKk(), cArr, zzz9eZzXP.getEncryptedData()));
                PrivateKey privateKeyGeneratePrivate = (this.zzVWk != null ? KeyFactory.getInstance(zzz94ZzXG.zzXJ8().zzXJk().getId(), this.zzVWk) : KeyFactory.getInstance(zzYP2.zzJ(zzz94ZzXG.zzXJ8().zzXJk()))).generatePrivate(new PKCS8EncodedKeySpec(zzz94ZzXG.getEncoded()));
                new zzYRH(engineGetCertificate(str).getPublicKey(), privateKeyGeneratePrivate);
                this.zzVTx.put(str, privateKeyGeneratePrivate);
                return privateKeyGeneratePrivate;
            } catch (Exception e2) {
                throw new UnrecoverableKeyException(OooOO0.OooO0OO.OooO0Oo(e2, C20424OooO0Oo.OooO0o0("BCFKS KeyStore unable to recover private key (", str, "): ")));
            }
        }

        @Override // java.security.KeyStoreSpi
        public boolean engineIsCertificateEntry(String str) {
            zzZB5 zzzb5 = this.zzVTy.get(str);
            if (zzzb5 != null) {
                return zzzb5.zzXKd().equals(zzVTE);
            }
            return false;
        }

        @Override // java.security.KeyStoreSpi
        public boolean engineIsKeyEntry(String str) {
            zzZB5 zzzb5 = this.zzVTy.get(str);
            if (zzzb5 == null) {
                return false;
            }
            BigInteger bigIntegerZzXKd = zzzb5.zzXKd();
            return bigIntegerZzXKd.equals(zzVTD) || bigIntegerZzXKd.equals(zzVTC) || bigIntegerZzXKd.equals(zzVTB) || bigIntegerZzXKd.equals(zzVTA);
        }

        @Override // java.security.KeyStoreSpi
        public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            if (loadStoreParameter == null) {
                throw new IllegalArgumentException("'param' arg cannot be null");
            }
            if (!(loadStoreParameter instanceof zzYRJ)) {
                if (!(loadStoreParameter instanceof zzYRI)) {
                    throw new IllegalArgumentException("no support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
                }
                engineLoad(((zzYRI) loadStoreParameter).getInputStream(), zzYNC.zzZ(loadStoreParameter));
                return;
            }
            zzYRJ zzyrj = (zzYRJ) loadStoreParameter;
            char[] cArrZzZ = zzYNC.zzZ(zzyrj);
            this.zzVTv = zzZ(zzyrj.zzXC0());
            if (zzyrj.zzXBZ() == zzYRJ.zzZ.AES256_CCM$2aa38581) {
                this.zzVTs = zzZ9O.zzWA8;
            } else {
                this.zzVTs = zzZ9O.zzWA7;
            }
            if (zzyrj.zzXBY() == zzYRJ.zzY.HmacSHA512$234ef56b) {
                this.zzVTw = new zzZ86(zzZ96.zzWy0, zzZC8.zzWHS);
            } else {
                this.zzVTw = new zzZ86(zzZ9O.zzWAw, zzZC8.zzWHS);
            }
            zzZ86 zzz86 = this.zzVTw;
            zzZDA zzzda = this.zzVTs;
            InputStream inputStream = zzyrj.getInputStream();
            engineLoad(inputStream, cArrZzZ);
            if (inputStream != null) {
                if (!zzz86.equals(this.zzVTw) || !zzZ(zzyrj.zzXC0(), this.zzVTv) || !zzzda.equals(this.zzVTs)) {
                    throw new IOException("configuration parameters do not match existing store");
                }
            }
        }

        @Override // java.security.KeyStoreSpi
        public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            Date dateZzZ;
            zzZB5 zzzb5 = this.zzVTy.get(str);
            Date date = new Date();
            if (zzzb5 == null) {
                dateZzZ = date;
            } else {
                if (!zzzb5.zzXKd().equals(zzVTE)) {
                    throw new KeyStoreException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("BCFKS KeyStore already has a key entry with alias ", str));
                }
                dateZzZ = zzZ(zzzb5, date);
            }
            try {
                this.zzVTy.put(str, new zzZB5(zzVTE, str, dateZzZ, date, certificate.getEncoded()));
                this.zzVTt = date;
            } catch (CertificateEncodingException e) {
                throw new KeyStoreException("BCFKS KeyStore unable to handle certificate: " + e.getMessage(), e);
            }
        }

        @Override // java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            zzZAZ zzzaz;
            zzZB6 zzzb6;
            zzZ9E zzz9e;
            Date date = new Date();
            zzZB5 zzzb5 = this.zzVTy.get(str);
            Date dateZzZ = zzzb5 != null ? zzZ(zzzb5, date) : date;
            this.zzVTx.remove(str);
            if (key instanceof PrivateKey) {
                if (certificateArr == null) {
                    throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
                }
                try {
                    new zzYRH(certificateArr[0].getPublicKey(), (PrivateKey) key);
                    byte[] encoded = key.getEncoded();
                    zzZ9C zzz9cZzeV = zzeV(32);
                    if (cArr == null) {
                        cArr = new char[0];
                    }
                    byte[] bArrZzZ = zzZ(zzz9cZzeV, "PRIVATE_KEY_ENCRYPTION", cArr, 32);
                    zzZDA zzzda = this.zzVTs;
                    zzZDA zzzda2 = zzZ9O.zzWA8;
                    if (zzzda.equals(zzzda2)) {
                        new zzZ1T.zzZ();
                        zzZ1T.zzY zzy = zzZ1T.zzWiS;
                        zzZ1T.zzY zzyZzW = zzy.zzW(zzXBp());
                        zzZ12<zzZ1T.zzY> zzz12ZzZ = zzZ1T.zzZ.zzZ((zzZ46) new zzZ43(zzy, bArrZzZ), zzyZzW);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        zzZ5N zzz5nZzR = zzz12ZzZ.zzR(byteArrayOutputStream);
                        zzz5nZzR.write(encoded);
                        zzz5nZzR.close();
                        zzz9e = new zzZ9E(new zzZ86(zzZ96.zzWyc, new zzZ99(zzz9cZzeV, new zzZ9D(zzzda2, new zzZAT(zzyZzW.getIV(), zzyZzW.zzXH3() / 8)))), byteArrayOutputStream.toByteArray());
                    } else {
                        zzZ1T.zzV zzv = new zzZ1T.zzV();
                        zzZ1T.zzR zzr = zzZ1T.zzWiO;
                        zzz9e = new zzZ9E(new zzZ86(zzZ96.zzWyc, new zzZ99(zzz9cZzeV, new zzZ9D(zzZ9O.zzWA7))), zzv.zzZ((zzZ46) new zzZ43(zzr, bArrZzZ), zzr).zzg(encoded, encoded.length));
                    }
                    this.zzVTy.put(str, new zzZB5(zzVTD, str, dateZzZ, date, zzZ(zzz9e, certificateArr).getEncoded()));
                } catch (Exception e) {
                    throw new KeyStoreException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("BCFKS KeyStore exception storing private key: ")), e);
                }
            } else {
                if (!(key instanceof SecretKey)) {
                    throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
                }
                if (certificateArr != null) {
                    throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
                }
                try {
                    byte[] encoded2 = key.getEncoded();
                    String upperCase = zzYGI.toUpperCase(key.getAlgorithm());
                    if (upperCase.indexOf(AES256KeyLoader.AES_ALGORITHM) >= 0) {
                        zzzaz = new zzZAZ(zzZ9O.zzWAv, encoded2);
                    } else {
                        zzZDA zzzda3 = (zzZDA) zzYP2.zzVTK.get(upperCase);
                        if (zzzda3 != null) {
                            zzzaz = new zzZAZ(zzzda3, encoded2);
                        } else {
                            zzZDA zzzda4 = (zzZDA) zzYP2.zzVTK.get(upperCase + "." + (encoded2.length * 8));
                            if (zzzda4 == null) {
                                throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + upperCase + ") for storage.");
                            }
                            zzzaz = new zzZAZ(zzzda4, encoded2);
                        }
                    }
                    zzZ9C zzz9cZzeV2 = zzeV(32);
                    if (cArr == null) {
                        cArr = new char[0];
                    }
                    byte[] bArrZzZ2 = zzZ(zzz9cZzeV2, "SECRET_KEY_ENCRYPTION", cArr, 32);
                    zzZDA zzzda5 = this.zzVTs;
                    zzZDA zzzda6 = zzZ9O.zzWA8;
                    if (zzzda5.equals(zzzda6)) {
                        new zzZ1T.zzZ();
                        zzZ1T.zzY zzy2 = zzZ1T.zzWiS;
                        zzZ1T.zzY zzyZzW2 = zzy2.zzW(zzXBp());
                        zzZ12<zzZ1T.zzY> zzz12ZzZ2 = zzZ1T.zzZ.zzZ((zzZ46) new zzZ43(zzy2, bArrZzZ2), zzyZzW2);
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        zzZ5N zzz5nZzR2 = zzz12ZzZ2.zzR(byteArrayOutputStream2);
                        zzz5nZzR2.write(zzzaz.getEncoded());
                        zzz5nZzR2.close();
                        zzzb6 = new zzZB6(new zzZ86(zzZ96.zzWyc, new zzZ99(zzz9cZzeV2, new zzZ9D(zzzda6, new zzZAT(zzyZzW2.getIV(), zzyZzW2.zzXH3() / 8)))), byteArrayOutputStream2.toByteArray());
                    } else {
                        zzZ1T.zzV zzv2 = new zzZ1T.zzV();
                        zzZ1T.zzR zzr2 = zzZ1T.zzWiO;
                        zzzb6 = new zzZB6(new zzZ86(zzZ96.zzWyc, new zzZ99(zzz9cZzeV2, new zzZ9D(zzZ9O.zzWA7))), zzv2.zzZ((zzZ46) new zzZ43(zzr2, bArrZzZ2), zzr2).zzg(encoded2, encoded2.length));
                    }
                    this.zzVTy.put(str, new zzZB5(zzVTC, str, dateZzZ, date, zzzb6.getEncoded()));
                } catch (Exception e2) {
                    throw new KeyStoreException(C22245OooO0oO.OooO0Oo(e2, new StringBuilder("BCFKS KeyStore exception storing private key: ")), e2);
                }
            }
            this.zzVTt = date;
        }

        @Override // java.security.KeyStoreSpi
        public int engineSize() {
            return this.zzVTy.size();
        }

        @Override // java.security.KeyStoreSpi
        public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
            if (loadStoreParameter == null) {
                throw new IllegalArgumentException("'param' arg cannot be null");
            }
            if (!(loadStoreParameter instanceof zzYRJ)) {
                if (!(loadStoreParameter instanceof zzYRI)) {
                    throw new IllegalArgumentException("no support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
                }
                engineStore(((zzYRI) loadStoreParameter).getOutputStream(), zzYNC.zzZ(loadStoreParameter));
                return;
            }
            zzYRJ zzyrj = (zzYRJ) loadStoreParameter;
            char[] cArrZzZ = zzYNC.zzZ(zzyrj);
            this.zzVTv = zzZ(zzyrj.zzXC0());
            if (zzyrj.zzXBZ() == zzYRJ.zzZ.AES256_CCM$2aa38581) {
                this.zzVTs = zzZ9O.zzWA8;
            } else {
                this.zzVTs = zzZ9O.zzWA7;
            }
            if (zzyrj.zzXBY() == zzYRJ.zzY.HmacSHA512$234ef56b) {
                this.zzVTw = new zzZ86(zzZ96.zzWy0, zzZC8.zzWHS);
            } else {
                this.zzVTw = new zzZ86(zzZ9O.zzWAw, zzZC8.zzWHS);
            }
            engineStore(zzyrj.getOutputStream(), cArrZzZ);
        }

        private static Date zzZ(zzZB5 zzzb5, Date date) {
            try {
                return zzzb5.zzXKf().getDate();
            } catch (ParseException unused) {
                return date;
            }
        }

        private zzZ9C zzZ(zzYRM zzyrm) {
            zzZDA zzzda = zzZ9U.zzWAS;
            if (zzzda.equals(zzyrm.zzXJk())) {
                zzYRL zzyrl = (zzYRL) zzyrm;
                byte[] bArr = new byte[zzyrl.getSaltLength()];
                zzXBp().nextBytes(bArr);
                return new zzZ9C(zzzda, new zzZ9R(bArr, zzyrl.zzXC4(), zzyrl.getBlockSize(), zzyrl.zzXC3(), 64));
            }
            zzYRN zzyrn = (zzYRN) zzyrm;
            byte[] bArr2 = new byte[zzyrn.getSaltLength()];
            zzXBp().nextBytes(bArr2);
            return new zzZ9C(zzZ96.zzWyb, new zzZ98(bArr2, zzyrn.getIterationCount(), 64, zzyrn.zzXC5()));
        }

        private zzZ9C zzZ(zzZ9C zzz9c, int i) {
            zzZDA zzzda = zzZ9U.zzWAS;
            if (zzzda.equals(zzz9c.zzXJk())) {
                zzZ9R zzz9rZzXW = zzZ9R.zzXW(zzz9c.zzXJj());
                byte[] bArr = new byte[zzz9rZzXW.getSalt().length];
                zzXBp().nextBytes(bArr);
                return new zzZ9C(zzzda, new zzZ9R(bArr, zzz9rZzXW.zzXJs(), zzz9rZzXW.zzXJr(), zzz9rZzXW.zzXJq(), BigInteger.valueOf(i)));
            }
            zzZ98 zzz98ZzXJ = zzZ98.zzXJ(zzz9c.zzXJj());
            byte[] bArr2 = new byte[zzz98ZzXJ.getSalt().length];
            zzXBp().nextBytes(bArr2);
            return new zzZ9C(zzZ96.zzWyb, new zzZ98(bArr2, zzz98ZzXJ.zzXJh().intValue(), i, zzz98ZzXJ.zzXJd()));
        }

        @Override // java.security.KeyStoreSpi
        public void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            zzZB8 zzzb8;
            if (this.zzVTu != null) {
                zzZB5[] zzzb5Arr = (zzZB5[]) this.zzVTy.values().toArray(new zzZB5[this.zzVTy.size()]);
                zzZ9C zzz9cZzZ = zzZ(this.zzVTv, 32);
                byte[] bArrZzZ = zzZ(zzz9cZzZ, "STORE_ENCRYPTION", cArr != null ? cArr : new char[0], 32);
                zzZB2 zzzb2 = new zzZB2(this.zzVTw, this.zzVTu, this.zzVTt, new zzZB4(zzzb5Arr));
                zzZDA zzzda = this.zzVTs;
                zzZDA zzzda2 = zzZ9O.zzWA8;
                if (zzzda.equals(zzzda2)) {
                    new zzZ1T.zzZ();
                    zzZ1T.zzY zzy = zzZ1T.zzWiS;
                    zzZ1T.zzY zzyZzW = zzy.zzW(zzXBp());
                    zzZ12<zzZ1T.zzY> zzz12ZzZ = zzZ1T.zzZ.zzZ((zzZ46) new zzZ43(zzy, bArrZzZ), zzyZzW);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    zzZ5N zzz5nZzR = zzz12ZzZ.zzR(byteArrayOutputStream);
                    zzz5nZzR.write(zzzb2.getEncoded());
                    zzz5nZzR.close();
                    zzzb8 = new zzZB8(new zzZ86(zzZ96.zzWyc, new zzZ99(zzz9cZzZ, new zzZ9D(zzzda2, new zzZAT(zzyZzW.getIV(), zzyZzW.zzXH3() / 8)))), byteArrayOutputStream.toByteArray());
                } else {
                    zzZ1T.zzV zzv = new zzZ1T.zzV();
                    zzZ1T.zzR zzr = zzZ1T.zzWiO;
                    zzZ17<zzZ1T.zzR> zzz17ZzZ = zzv.zzZ((zzZ46) new zzZ43(zzr, bArrZzZ), zzr);
                    zzZ99 zzz99 = new zzZ99(zzz9cZzZ, new zzZ9D(zzZ9O.zzWA7));
                    byte[] encoded = zzzb2.getEncoded();
                    zzzb8 = new zzZB8(new zzZ86(zzZ96.zzWyc, zzz99), zzz17ZzZ.zzg(encoded, encoded.length));
                }
                if (zzZ9U.zzWAS.equals(this.zzVTv.zzXJk())) {
                    this.zzVTv = zzZ(this.zzVTv, zzZ9R.zzXW(this.zzVTv.zzXJj()).zzXJO().intValue());
                } else {
                    this.zzVTv = zzZ(this.zzVTv, zzZ98.zzXJ(this.zzVTv.zzXJj()).zzXJO().intValue());
                }
                outputStream.write(new zzZB3(zzzb8, new zzZB1(new zzZB0(this.zzVTw, this.zzVTv, zzZ(zzzb8.getEncoded(), this.zzVTw, this.zzVTv, cArr)))).getEncoded());
                outputStream.flush();
                return;
            }
            throw new IOException("KeyStore not initialized");
        }

        @Override // java.security.KeyStoreSpi
        public void engineLoad(InputStream inputStream, char[] cArr) throws NoSuchAlgorithmException, IOException, CertificateException {
            zzZB2 zzzb2ZzYl;
            this.zzVTy.clear();
            this.zzVTx.clear();
            this.zzVTu = null;
            this.zzVTt = null;
            if (inputStream == null) {
                Date date = new Date();
                this.zzVTu = date;
                this.zzVTt = date;
                this.zzVTw = new zzZ86(zzZ96.zzWy0, zzZC8.zzWHS);
                this.zzVTv = zzeV(64);
                return;
            }
            zzZB3 zzzb3ZzYm = zzZB3.zzYm(new zzZDE(inputStream).zzXKN());
            zzZB1 zzzb1ZzXKc = zzzb3ZzYm.zzXKc();
            if (zzzb1ZzXKc.getType() == 0) {
                zzZB0 zzzb0ZzYj = zzZB0.zzYj(zzzb1ZzXKc.zzXK8());
                this.zzVTw = zzzb0ZzYj.zzXK7();
                this.zzVTv = zzzb0ZzYj.zzXK6();
                zzZ(zzzb3ZzYm.zzXKb().zzXL0().getEncoded(), zzzb0ZzYj, cArr);
                zzZDK zzzdkZzXKb = zzzb3ZzYm.zzXKb();
                if (zzzdkZzXKb instanceof zzZB8) {
                    zzZB8 zzzb8 = (zzZB8) zzzdkZzXKb;
                    zzzb2ZzYl = zzZB2.zzYl(zzZ("STORE_ENCRYPTION", zzzb8.zzXKk(), cArr, zzzb8.zzXKl().zzXL5()));
                } else {
                    zzzb2ZzYl = zzZB2.zzYl(zzzdkZzXKb);
                }
                try {
                    this.zzVTu = zzzb2ZzYl.zzXKf().getDate();
                    this.zzVTt = zzzb2ZzYl.zzXKe().getDate();
                    if (zzzb2ZzYl.zzXKa().equals(this.zzVTw)) {
                        Iterator<zzZDK> it = zzzb2ZzYl.zzXK9().iterator();
                        while (it.hasNext()) {
                            zzZB5 zzzb5ZzYo = zzZB5.zzYo(it.next());
                            this.zzVTy.put(zzzb5ZzYo.getIdentifier(), zzzb5ZzYo);
                        }
                        return;
                    }
                    throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                } catch (ParseException unused) {
                    throw new IOException("BCFKS KeyStore unable to parse store data information.");
                }
            }
            throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
        }

        private static byte[] zzZ(zzZ9C zzz9c, String str, char[] cArr, int i) throws IOException {
            zzZ0T.zzY zzyZzWY;
            zzZ4I zzz4i = zzZ4I.PKCS12;
            byte[] bArrZzI = zzz4i.zzI(cArr);
            byte[] bArrZzI2 = zzz4i.zzI(str.toCharArray());
            if (zzZ9U.zzWAS.equals(zzz9c.zzXJk())) {
                zzZ9R zzz9rZzXW = zzZ9R.zzXW(zzz9c.zzXJj());
                if (zzz9rZzXW.zzXJO() != null) {
                    i = zzz9rZzXW.zzXJO().intValue();
                } else if (i == -1) {
                    throw new IOException("no keyLength found in ScryptParams");
                }
                zzYZH.zzZ zzz = new zzYZH.zzZ();
                byte[] bArrZzn = zzYGU.zzn(bArrZzI, bArrZzI2);
                zzYZH.zzX zzx = zzYZH.zzWbg;
                byte[] bArr = new byte[i];
                zzz.zzY(zzYZH.zzX.zzZ(zzz9rZzXW.getSalt(), zzz9rZzXW.zzXJs().intValue(), zzz9rZzXW.zzXJr().intValue(), zzz9rZzXW.zzXJr().intValue(), bArrZzn)).zzXi(bArr);
                zzYGU.zzWa(bArrZzn);
                zzYGU.zzWa(bArrZzI);
                return bArr;
            }
            if (zzz9c.zzXJk().equals(zzZ96.zzWyb)) {
                zzZ98 zzz98ZzXJ = zzZ98.zzXJ(zzz9c.zzXJj());
                if (zzz98ZzXJ.zzXJO() != null) {
                    i = zzz98ZzXJ.zzXJO().intValue();
                } else if (i == -1) {
                    throw new IOException("no keyLength found in PBKDF2Params");
                }
                zzZ0T.zzZ zzz2 = new zzZ0T.zzZ();
                if (zzz98ZzXJ.zzXJd().zzXJk().equals(zzZ96.zzWy0)) {
                    zzZ0T.zzX zzx2 = zzZ0T.zzWfI;
                    zzyZzWY = zzZ0T.zzX.zzZ(zzZ0P.zzZ.zzWdC, zzYGU.zzn(bArrZzI, bArrZzI2)).zzfM(zzz98ZzXJ.zzXJh().intValue()).zzWY(zzz98ZzXJ.getSalt());
                } else if (zzz98ZzXJ.zzXJd().zzXJk().equals(zzZ9O.zzWAw)) {
                    zzZ0T.zzX zzx3 = zzZ0T.zzWfI;
                    zzyZzWY = zzZ0T.zzX.zzZ(zzZ0P.zzZ.zzWdq, zzYGU.zzn(bArrZzI, bArrZzI2)).zzfM(zzz98ZzXJ.zzXJh().intValue()).zzWY(zzz98ZzXJ.getSalt());
                } else {
                    throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF: " + zzz98ZzXJ.zzXJd().zzXJk());
                }
                return zzz2.zzX(zzyZzWY).zzZ(zzZ4K.zzZ.CIPHER, i);
            }
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }

        private void zzZ(byte[] bArr, zzZB0 zzzb0, char[] cArr) throws NoSuchAlgorithmException, IOException {
            if (!zzYGU.zzo(zzZ(bArr, zzzb0.zzXK7(), zzzb0.zzXK6(), cArr), zzzb0.zzXK5())) {
                throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed.");
            }
        }

        private byte[] zzZ(byte[] bArr, zzZ86 zzz86, zzZ9C zzz9c, char[] cArr) throws NoSuchAlgorithmException, IOException {
            Mac mac;
            String id = zzz86.zzXJk().getId();
            zzYQ8 zzyq8 = this.zzVWk;
            if (zzyq8 != null) {
                mac = Mac.getInstance(id, zzyq8);
            } else {
                mac = Mac.getInstance(id);
            }
            try {
                if (cArr == null) {
                    cArr = new char[0];
                }
                mac.init(new SecretKeySpec(zzZ(zzz9c, "INTEGRITY_CHECK", cArr, -1), id));
                return mac.doFinal(bArr);
            } catch (InvalidKeyException e) {
                throw new zzYO6("Cannot set up MAC calculation: " + e.getMessage(), e);
            }
        }

        @Override // java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            Date date = new Date();
            zzZB5 zzzb5 = this.zzVTy.get(str);
            Date dateZzZ = zzzb5 != null ? zzZ(zzzb5, date) : date;
            if (certificateArr != null) {
                try {
                    zzZ9E zzz9eZzXP = zzZ9E.zzXP(bArr);
                    try {
                        this.zzVTx.remove(str);
                        this.zzVTy.put(str, new zzZB5(zzVTB, str, dateZzZ, date, zzZ(zzz9eZzXP, certificateArr).getEncoded()));
                    } catch (Exception e) {
                        throw new KeyStoreException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("BCFKS KeyStore exception storing protected private key: ")), e);
                    }
                } catch (Exception e2) {
                    throw new KeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e2);
                }
            } else {
                try {
                    this.zzVTy.put(str, new zzZB5(zzVTA, str, dateZzZ, date, bArr));
                } catch (Exception e3) {
                    throw new KeyStoreException(C22245OooO0oO.OooO0Oo(e3, new StringBuilder("BCFKS KeyStore exception storing protected private key: ")), e3);
                }
            }
            this.zzVTt = date;
        }

        private static boolean zzZ(zzYRM zzyrm, zzZ9C zzz9c) {
            if (!zzyrm.zzXJk().equals(zzz9c.zzXJk())) {
                return false;
            }
            if (zzZ9U.zzWAS.equals(zzz9c.zzXJk())) {
                if (!(zzyrm instanceof zzYRL)) {
                    return false;
                }
                zzYRL zzyrl = (zzYRL) zzyrm;
                zzZ9R zzz9rZzXW = zzZ9R.zzXW(zzz9c.zzXJj());
                return zzyrl.getSaltLength() == zzz9rZzXW.getSalt().length && zzyrl.getBlockSize() == zzz9rZzXW.zzXJr().intValue() && zzyrl.zzXC4() == zzz9rZzXW.zzXJs().intValue() && zzyrl.zzXC3() == zzz9rZzXW.zzXJq().intValue();
            }
            if (!(zzyrm instanceof zzYRN)) {
                return false;
            }
            zzYRN zzyrn = (zzYRN) zzyrm;
            zzZ98 zzz98ZzXJ = zzZ98.zzXJ(zzz9c.zzXJj());
            return zzyrn.getSaltLength() == zzz98ZzXJ.getSalt().length && zzyrn.getIterationCount() == zzz98ZzXJ.zzXJh().intValue();
        }

        private static byte[] zzZ(String str, zzZ86 zzz86, char[] cArr, byte[] bArr) throws IOException {
            if (zzz86.zzXJk().equals(zzZ96.zzWyc)) {
                zzZ99 zzz99ZzXK = zzZ99.zzXK(zzz86.zzXJj());
                zzZ9D zzz9dZzXJf = zzz99ZzXK.zzXJf();
                if (zzz9dZzXJf.zzXJk().equals(zzZ9O.zzWA8)) {
                    zzZAT zzzatZzYe = zzZAT.zzYe(zzz9dZzXJf.zzXJj());
                    zzZ1T.zzY zzy = zzZ1T.zzWiS;
                    zzZ1T.zzY zzyZzg1 = zzy.zzXg(zzzatZzYe.zzXJY()).zzg1(zzzatZzYe.zzXJX() * 8);
                    zzZ1T.zzZ zzz = new zzZ1T.zzZ();
                    zzZ9C zzz9cZzXJg = zzz99ZzXK.zzXJg();
                    if (cArr == null) {
                        cArr = new char[0];
                    }
                    byte[] bArrZzZ = zzZ(zzz9cZzXJg, str, cArr, 32);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    zzZ5N zzz5nZzS = zzz.zzY((zzZ46) new zzZ43(zzy, bArrZzZ), zzyZzg1).zzS(byteArrayOutputStream);
                    zzz5nZzS.write(bArr);
                    zzz5nZzS.close();
                    return byteArrayOutputStream.toByteArray();
                }
                if (zzz9dZzXJf.zzXJk().equals(zzZ9O.zzWA7)) {
                    zzZ1T.zzR zzr = zzZ1T.zzWiO;
                    zzZ1T.zzV zzv = new zzZ1T.zzV();
                    zzZ9C zzz9cZzXJg2 = zzz99ZzXK.zzXJg();
                    if (cArr == null) {
                        cArr = new char[0];
                    }
                    try {
                        return zzv.zzY((zzZ46) new zzZ43(zzr, zzZ(zzz9cZzXJg2, str, cArr, 32)), zzr).zzh(bArr, bArr.length);
                    } catch (zzZ5B e) {
                        throw new IOException(e.getMessage());
                    }
                }
                throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
            }
            throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
        }
    }
}
