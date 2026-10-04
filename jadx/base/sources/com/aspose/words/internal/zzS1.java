package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import com.aspose.slides.PatternStyle;
import com.aspose.words.FipsUnapprovedOperationException;
import com.aspose.words.internal.zzYW8;
import com.aspose.words.internal.zzZ0Q;
import com.aspose.words.internal.zzZ1H;
import com.aspose.words.internal.zzZ1K;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.util.Arrays;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzS1 {
    public static final zzZ0O zzNV;
    private static final zzZHW zzUR;
    private static byte[] zzNX = zzZO0.zzhX().getBytes("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwx yz0123456789+/");
    private static final zzYHN zzNW = new zzYHK();

    public static class zzZ extends SecureRandom {
        private zzZ() {
        }

        @Override // java.util.Random
        public final int nextInt() {
            return 0;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    static {
        zzZ0O zzz0oZzZ = zzZ1L.zzWhD.zzZ(new zzYRP(new SecureRandom(), true)).zzZ(null, true, null);
        zzNV = zzz0oZzZ;
        zzUR = new zzZHW("SHA1", "SHA224", "SHA256", "http://www.w3.org/2000/09/xmldsig#sha256", "SHA384", "SHA512", "MD2", "MD4", "MD5");
        SecureRandom zzz = zzz0oZzZ;
        if (zzZZS.zzrR()) {
            zzz = new zzZ((byte) 0);
        }
        zzZ5L.zzZ(zzz);
    }

    public static boolean isInFipsMode() {
        return zzZ5L.zzXH0();
    }

    public static void startFipsMode() {
        zzZ5L.zzXH1();
        zzZ5L.zzZ(zzNV);
    }

    private static byte[] zzA(byte[] bArr) throws Exception {
        int length = bArr.length / 2;
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 0, length));
        BigInteger bigInteger2 = new BigInteger(1, Arrays.copyOfRange(bArr, length, bArr.length));
        byte[] byteArray = bigInteger.toByteArray();
        byte[] byteArray2 = bigInteger2.toByteArray();
        int length2 = byteArray.length;
        int i = length2 + 4;
        int length3 = byteArray2.length + i;
        byte[] bArr2 = new byte[length3 + 2];
        bArr2[0] = PatternStyle.Wave;
        bArr2[1] = (byte) (length3 & 255);
        bArr2[2] = 2;
        bArr2[3] = (byte) (byteArray.length & 255);
        System.arraycopy(byteArray, 0, bArr2, 4, byteArray.length);
        bArr2[i] = 2;
        bArr2[length2 + 5] = (byte) (byteArray2.length & 255);
        System.arraycopy(byteArray2, 0, bArr2, length2 + 6, byteArray2.length);
        return bArr2;
    }

    private static byte[] zzB(byte[] bArr) throws Exception {
        zzZBN zzzbn = (zzZBN) new zzZDE(bArr).zzXKN();
        byte[] encoded = zzzbn.zzg6(0).zzXL0().getEncoded();
        byte[] encoded2 = zzzbn.zzg6(1).zzXL0().getEncoded();
        byte[] bArr2 = new byte[40];
        System.arraycopy(encoded, encoded.length - 20, bArr2, 0, 20);
        System.arraycopy(encoded2, encoded2.length - 20, bArr2, 20, 20);
        return bArr2;
    }

    private static boolean zzC(byte[] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte b : bArr) {
            if (b != 13 && b != 10 && b != 61 && !zzZ1.zzZ(zzNX, b)) {
                return false;
            }
        }
        return true;
    }

    public static zzGG zzD(byte[] bArr) {
        zzGG zzggZzYt = zzYt(1);
        zzggZzYt.init(bArr);
        return zzggZzYt;
    }

    public static zzWZ zzE(byte[] bArr) {
        zzZ6T zzz6tZzF = zzF(bArr);
        zzWZ zzwz = new zzWZ();
        zzwz.zzZ(zzz6tZzF);
        return zzwz;
    }

    private static zzZ6T zzF(byte[] bArr) {
        if (zzC(bArr)) {
            bArr = zzYGH.decode(bArr);
        }
        try {
            return new zzZ6T(bArr);
        } catch (Exception e) {
            zzZHV.zzZ(e);
            return null;
        }
    }

    private static void zzO(zzZOP zzzop) {
        try {
            zzzop.zzH(0L);
        } catch (Exception e) {
            zzZHV.zzZ(e);
        }
    }

    public static zzFU zzRu() {
        return new zzZZT(3);
    }

    public static int zzT(zzWZ zzwz) {
        return zzX(zzwz.zzVj());
    }

    public static byte zzU(zzWZ zzwz) {
        return zzY(zzwz.zzVj());
    }

    public static byte zzV(zzWZ zzwz) {
        return zzY(zzX(zzwz.zzVk()));
    }

    public static byte[] zzW(zzWZ zzwz) throws IOException {
        return zzwz.zzVk().getEncoded();
    }

    private static zzZ5V zzX(zzZ6T zzz6t) {
        try {
            String strZzO = zzNW.zzO(zzz6t.zzXIc());
            if (strZzO.contains("ECDSA")) {
                return new zzZ3N(zzZ1H.zzWjd, zzz6t.zzXId());
            }
            if (strZzO.contains("DSA")) {
                return new zzZ3V(zzZ1K.zzWjd, zzz6t.zzXId());
            }
            if (strZzO.contains(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA)) {
                return new zzZ3D(zzZ0Q.zzWjd, zzz6t.zzXId());
            }
            return null;
        } catch (Exception e) {
            zzZHV.zzZ(e);
            return null;
        }
    }

    public static zzZOG zzY(zzZ6T zzz6t) {
        try {
            return new zzZOG(zzz6t.getEncoded());
        } catch (Exception e) {
            zzZHV.zzZ(e);
            return null;
        }
    }

    private static zzGG zzYt(int i) {
        return new zzAR(i);
    }

    public static zzH7 zzYu(int i) {
        return new zzQU(i);
    }

    public static boolean zzZ(zzWZ zzwz, int i, byte[] bArr, byte[] bArr2) {
        zzZ5V zzz5vZzX = zzX(zzwz.zzVk());
        byte bZzY = zzY(zzz5vZzX);
        if (bZzY == 0) {
            return zzZ((zzZ3D) zzz5vZzX, i, bArr, bArr2);
        }
        if (bZzY == 1) {
            return zzZ((zzZ5R) zzz5vZzX, i, bArr, bArr2);
        }
        if (bZzY == 2) {
            return zzY((zzZ5R) zzz5vZzX, i, bArr, bArr2);
        }
        throw new IllegalStateException("Unexpected CryptoAlgorithm value.");
    }

    public static zzGG zzo(String str) {
        return zzYt(zzp(str));
    }

    public static int zzp(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
            default:
                throw new IllegalStateException("Unsupported hash algorithm.");
            case 8:
                return 8;
        }
    }

    public static zzH7 zzq(String str) {
        return zzYu(zzp(str));
    }

    private static byte[] zzz(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length <= 0) {
            return bArr;
        }
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[length];
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(bArr, length, bArr3, 0, length);
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(new BigInteger(1, bArr2)));
        zzzdj.zzZ(new zzZDD(new BigInteger(1, bArr3)));
        return new zzZC2(zzzdj).getEncoded("DER");
    }

    public static zzOE zzY(zzWZ zzwz) {
        zzZ3V zzz3v = (zzZ3V) zzX(zzwz.zzVk());
        zzOE zzoe = new zzOE();
        zzoe.zzm(zzZKK.zzZ(zzz3v.zzXGC().getP()));
        zzoe.zzl(zzZKK.zzZ(zzz3v.zzXGC().getQ()));
        zzoe.zzk(zzZKK.zzZ(zzz3v.zzXGC().getG()));
        zzoe.zzj(zzZKK.zzZ(zzz3v.getY()));
        return zzoe;
    }

    public static byte[] zzZ(zzWZ zzwz, byte[] bArr, int i) throws Exception {
        zzZ5V zzz5vZzVj = zzwz.zzVj();
        byte bZzY = zzY(zzz5vZzVj);
        if (bZzY == 0) {
            return zzZ((zzZ3E) zzz5vZzVj, bArr, i);
        }
        if (bZzY == 1) {
            return zzZ((zzZ3W) zzz5vZzVj, bArr, i);
        }
        if (bZzY == 2) {
            return zzZ((zzZ3O) zzz5vZzVj, bArr, i);
        }
        throw new IllegalStateException("Unexpected CryptoAlgorithm value.");
    }

    public static String zzX(zzWZ zzwz) {
        return zzwz.zzVk().getSerialNumber().toString();
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0019: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:11:0x0019 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzWZ zzY(zzZOP zzzop, String str, String str2) throws Throwable {
        zzZK7 zzzk7;
        AutoCloseable autoCloseable;
        zzO(zzzop);
        AutoCloseable autoCloseable2 = null;
        try {
            try {
                zzzk7 = new zzZK7(zzzop);
                try {
                    try {
                        zzWZ zzwzZzZ = zzZ(str, zzzk7, "PKCS12", str2);
                        try {
                            zzzk7.close();
                            return zzwzZzZ;
                        } catch (Exception e) {
                            zzZHV.zzZ(e);
                            return zzwzZzZ;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zzZHV.zzZ(e);
                        if (zzzk7 != null) {
                            try {
                                zzzk7.close();
                            } catch (Exception e3) {
                                zzZHV.zzZ(e3);
                            }
                        }
                        return null;
                    }
                } catch (IOException unused) {
                    zzO(zzzop);
                    zzWZ zzwzZzZ2 = zzZ(str, zzzk7, "JKS", str2);
                    try {
                        zzzk7.close();
                    } catch (Exception e4) {
                        zzZHV.zzZ(e4);
                    }
                    return zzwzZzZ2;
                }
            } catch (Throwable th) {
                th = th;
                autoCloseable2 = autoCloseable;
                if (autoCloseable2 != null) {
                    try {
                        autoCloseable2.close();
                    } catch (Exception e5) {
                        zzZHV.zzZ(e5);
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            zzzk7 = null;
        } catch (Throwable th2) {
            th = th2;
            if (autoCloseable2 != null) {
            }
            throw th;
        }
    }

    public static zzWZ zzX(zzZOP zzzop, String str) {
        return zzY(zzzop, str, null);
    }

    private static zzWZ zzX(char[] cArr, KeyStore keyStore, String str, X509Certificate x509Certificate) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateEncodingException {
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyStore.getKey(str, cArr);
        return zzZ(keyStore, str, x509Certificate, eCPrivateKey, new zzZ3O(zzZ1H.zzWjd, eCPrivateKey.getEncoded()));
    }

    public static zzZZ8 zzZ(zzWZ zzwz) {
        zzZ3D zzz3d = (zzZ3D) zzX(zzwz.zzVk());
        return new zzZZ8(zzZKK.zzZ(zzz3d.getModulus()), zzZKK.zzZ(zzz3d.getPublicExponent()));
    }

    private static int zzX(zzZ5V zzz5v) {
        return zzz5v instanceof zzZ3P ? 3 : 1;
    }

    private static zzWZ zzZ(String str, InputStream inputStream, String str2, String str3) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        if (str != null) {
            char[] charArray = str.toCharArray();
            KeyStore keyStore = KeyStore.getInstance(str2);
            keyStore.load(inputStream, charArray);
            Enumeration<String> enumerationAliases = keyStore.aliases();
            if (str3 == null) {
                while (true) {
                    if (!enumerationAliases.hasMoreElements()) {
                        break;
                    }
                    String strNextElement = enumerationAliases.nextElement();
                    if (keyStore.isKeyEntry(strNextElement) && (keyStore.getKey(strNextElement, charArray) instanceof PrivateKey)) {
                        str3 = strNextElement;
                        break;
                    }
                }
            }
            if (str3 != null) {
                Key key = keyStore.getKey(str3, charArray);
                if (key != null) {
                    X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(str3);
                    if (key instanceof RSAPrivateKey) {
                        return zzZ(charArray, keyStore, str3, x509Certificate);
                    }
                    if (key instanceof DSAPrivateKey) {
                        return zzY(charArray, keyStore, str3, x509Certificate);
                    }
                    if (key instanceof ECPrivateKey) {
                        return zzX(charArray, keyStore, str3, x509Certificate);
                    }
                    throw new IllegalStateException("Key is not supported");
                }
                throw new SecurityException(C20593OooO0Oo.OooO0O0("Private key was not found by alias '", str3, "'"));
            }
            throw new SecurityException("At least one certificate and its private key must be present.");
        }
        throw new IllegalArgumentException("Password cannot be empty or null");
    }

    private static zzWZ zzY(char[] cArr, KeyStore keyStore, String str, X509Certificate x509Certificate) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateEncodingException {
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) keyStore.getKey(str, cArr);
        return zzZ(keyStore, str, x509Certificate, dSAPrivateKey, new zzZ3W(zzZ1K.zzWjd, dSAPrivateKey.getEncoded()));
    }

    private static byte zzY(zzZ5V zzz5v) {
        if (zzz5v instanceof zzZ3X) {
            return (byte) 1;
        }
        if (zzz5v instanceof zzZ3F) {
            return (byte) 0;
        }
        if (zzz5v instanceof zzZ3P) {
            return (byte) 2;
        }
        throw new IllegalArgumentException("Not supported asymmetric key type: " + zzz5v.getClass());
    }

    private static boolean zzY(zzZ5R zzz5r, int i, byte[] bArr, byte[] bArr2) {
        try {
            new zzZ1H.zzU();
            zzZ0V<zzZ1H.zzT> zzz0vZzZ = zzZ1H.zzU.zzZ(zzz5r, zzZ1H.zzWh3.zzY((zzZ1J) zzQU.zzYm(i)));
            zzZ41 zzz41ZzXGN = zzz0vZzZ.zzXGN();
            zzz41ZzXGN.update(bArr);
            zzz41ZzXGN.flush();
            zzz41ZzXGN.close();
            if (bArr2[0] == 0) {
                bArr2 = zzz(bArr2);
            }
            return zzz0vZzZ.zzXh(bArr2);
        } catch (Exception e) {
            throw new RuntimeException("CryptoException: ", e);
        }
    }

    private static zzWZ zzZ(char[] cArr, KeyStore keyStore, String str, X509Certificate x509Certificate) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateEncodingException {
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyStore.getKey(str, cArr);
        return zzZ(keyStore, str, x509Certificate, rSAPrivateCrtKey, new zzZ3E(zzZ0Q.zzWjd, rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient()));
    }

    private static zzWZ zzZ(KeyStore keyStore, String str, X509Certificate x509Certificate, PrivateKey privateKey, zzZ5S zzz5s) throws IOException, KeyStoreException, CertificateEncodingException {
        zzWZ zzwz = new zzWZ();
        zzwz.zzZ(new zzZ6T(x509Certificate.getEncoded()));
        zzwz.zzZ(zzz5s);
        zzZOG zzzogZzY = zzY(zzwz.zzVk());
        zzzogZzY.zzZ(keyStore.getCertificateChain(str));
        zzwz.zzZ(zzzogZzY);
        zzwz.zzVi().zzZ(privateKey);
        return zzwz;
    }

    private static boolean zzZ(zzZ3D zzz3d, int i, byte[] bArr, byte[] bArr2) {
        try {
            zzZ0Q.zzH zzh = new zzZ0Q.zzH();
            zzZ1J zzz1j = (zzZ1J) zzQU.zzYm(i);
            zzZ1P zzz1p = zzZ0Q.zzWjd;
            zzZ0V zzz0vZzZ = zzh.zzY((zzZ5R) zzz3d, zzZ0Q.zzM.zzV(zzz1j));
            zzZ41 zzz41ZzXGN = zzz0vZzZ.zzXGN();
            zzz41ZzXGN.write(bArr, 0, bArr.length);
            zzz41ZzXGN.close();
            return zzz0vZzZ.zzXh(bArr2);
        } catch (Exception e) {
            throw new RuntimeException("CryptoException: ", e);
        }
    }

    private static boolean zzZ(zzZ5R zzz5r, int i, byte[] bArr, byte[] bArr2) {
        try {
            new zzZ1K.zzU();
            zzZ1J zzz1j = (zzZ1J) zzQU.zzYm(i);
            zzZ1P zzz1p = zzZ1K.zzWjd;
            zzZ0V<zzZ1K.zzT> zzz0vZzZ = zzZ1K.zzU.zzZ(zzz5r, zzZ1K.zzT.zzZ(zzz1j));
            zzZ41 zzz41ZzXGN = zzz0vZzZ.zzXGN();
            zzz41ZzXGN.update(bArr);
            zzz41ZzXGN.flush();
            zzz41ZzXGN.close();
            return zzz0vZzZ.zzXh(zzA(bArr2));
        } catch (Exception e) {
            throw new RuntimeException("CryptoException: ", e);
        }
    }

    private static byte[] zzZ(zzZ3E zzz3e, byte[] bArr, int i) {
        zzZ4S zzz4sZzY;
        int iBitLength;
        try {
            zzZ5K zzz5kZzYm = zzQU.zzYm(i);
            if (zzZ5L.zzXH0() && (iBitLength = zzz3e.getModulus().bitLength()) != 2048 && iBitLength != 3072) {
                throw new FipsUnapprovedOperationException(zzZKN.format("You cannot use a key with size {0} for {1} in FIPS mode", Integer.valueOf(iBitLength), zzz3e.zzXGV().getName()));
            }
            if (zzz5kZzYm instanceof zzZ1J) {
                zzZ0Q.zzH zzh = new zzZ0Q.zzH();
                zzZ1P zzz1p = zzZ0Q.zzWjd;
                zzz4sZzY = zzh.zzW(zzz3e, zzZ0Q.zzM.zzV((zzZ1J) zzz5kZzYm)).zzX(new SecureRandom());
            } else {
                zzYW8.zzN zzn = new zzYW8.zzN();
                zzYXR zzyxr = zzYW8.zzWb4;
                zzz4sZzY = zzn.zzY(zzz3e, zzYW8.zzQ.zzR(zzz5kZzYm));
            }
            zzZ41 zzz41ZzXGO = zzz4sZzY.zzXGO();
            zzz41ZzXGO.write(bArr, 0, bArr.length);
            zzz41ZzXGO.close();
            return zzz4sZzY.getSignature();
        } catch (Throwable th) {
            throw new RuntimeException("CryptoException: ", th);
        }
    }

    private static byte[] zzZ(zzZ3W zzz3w, byte[] bArr, int i) throws Exception {
        try {
            zzZ5K zzz5kZzYm = zzQU.zzYm(i);
            zzZ1K.zzU zzu = new zzZ1K.zzU();
            zzZ1P zzz1p = zzZ1K.zzWjd;
            zzZ0X zzz0xZzX = zzu.zzY(zzz3w, zzZ1K.zzT.zzZ((zzZ1J) zzz5kZzYm)).zzX(new SecureRandom());
            zzZ41 zzz41ZzXGO = zzz0xZzX.zzXGO();
            zzz41ZzXGO.write(bArr, 0, bArr.length);
            zzz41ZzXGO.close();
            return zzB(zzz0xZzX.getSignature());
        } catch (Exception e) {
            throw new RuntimeException("CryptoException: ", e);
        }
    }

    private static byte[] zzZ(zzZ3O zzz3o, byte[] bArr, int i) {
        try {
            zzZ0X zzz0xZzX = new zzZ1H.zzU().zzY(zzz3o, zzZ1H.zzWh3.zzY((zzZ1J) zzQU.zzYm(i))).zzX(new SecureRandom());
            zzZ41 zzz41ZzXGO = zzz0xZzX.zzXGO();
            zzz41ZzXGO.write(bArr, 0, bArr.length);
            zzz41ZzXGO.close();
            return zzz0xZzX.getSignature();
        } catch (Exception e) {
            throw new RuntimeException("CryptoException: ", e);
        }
    }
}
