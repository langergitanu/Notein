package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import com.aspose.words.internal.zzZ1D;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQM extends KeyAgreementSpi {
    private static final zzYPK zzVWu;
    private static final Map<String, String> zzVWv;
    private static final Map<String, zzZDA> zzVWw;
    private byte[] zzVWl;
    protected byte[] zzVWm;
    protected zzZ5Y zzVWn;
    private final zzZ1D.zzX zzVWo;
    private final zzZ59 zzVWp;
    private final zzYP7 zzVWq;
    private final zzYP5 zzVWr;
    private final zzYNG zzVWs;
    private final zzZ5X zzVWt;
    private zzZ4M zzWil;

    static {
        HashMap map = new HashMap();
        zzVWw = map;
        HashMap map2 = new HashMap();
        zzVWv = map2;
        zzVWu = new zzYPK();
        zzZDA zzzda = zzZ96.zzWya;
        map.put("DESEDE", zzzda);
        map.put(AES256KeyLoader.AES_ALGORITHM, zzZ9O.zzWAd);
        zzZDA zzzda2 = zzZ9M.zzWz9;
        map.put("CAMELLIA", zzzda2);
        zzZDA zzzda3 = zzZ9X.zzWBz;
        map.put("SEED", zzzda3);
        zzZDA zzzda4 = zzZ9K.zzWz0;
        map.put("DES", zzzda4);
        map2.put(zzZ9U.zzWB9.getId(), "CAST5");
        map2.put(zzZ9U.zzWB8.getId(), "IDEA");
        map2.put(zzZ9U.zzWB5.getId(), "Blowfish");
        map2.put(zzZ9U.zzWB4.getId(), "Blowfish");
        map2.put(zzZ9U.zzWB3.getId(), "Blowfish");
        map2.put(zzZ9U.zzWB2.getId(), "Blowfish");
        map2.put(zzZ9K.zzWz1.getId(), "DES");
        map2.put(zzzda4.getId(), "DES");
        map2.put(zzZ9K.zzWyY.getId(), "DES");
        map2.put(zzZ9K.zzWyZ.getId(), "DES");
        map2.put(zzZ9K.zzWyX.getId(), "DESede");
        map2.put(zzzda.getId(), "DESede");
        map2.put(zzZ96.zzWwu.getId(), "DESede");
        map2.put(zzZ96.zzWwt.getId(), "RC2");
        map2.put(zzZ96.zzWy4.getId(), "HmacSHA1");
        map2.put(zzZ96.zzWy3.getId(), "HmacSHA224");
        map2.put(zzZ96.zzWy2.getId(), KeyUtil.HMAC_ALGORITHM);
        map2.put(zzZ96.zzWy1.getId(), "HmacSHA384");
        map2.put(zzZ96.zzWy0.getId(), "HmacSHA512");
        map2.put(zzZ9M.zzWzb.getId(), "Camellia");
        map2.put(zzZ9M.zzWza.getId(), "Camellia");
        map2.put(zzzda2.getId(), "Camellia");
        map2.put(zzZ9M.zzWz8.getId(), "Camellia");
        map2.put(zzZ9M.zzWz7.getId(), "Camellia");
        map2.put(zzZ9M.zzWz6.getId(), "Camellia");
        map2.put(zzZ9X.zzWBw.getId(), "SEED");
        map2.put(zzzda3.getId(), "SEED");
        map2.put(zzZ9X.zzWBy.getId(), "SEED");
        map2.put(zzZAE.zzWEX.getId(), "GOST28147");
        map2.put(zzZ9O.zzWAq.getId(), AES256KeyLoader.AES_ALGORITHM);
        zzZDA zzzda5 = zzZ9O.zzWAo;
        map2.put(zzzda5.getId(), AES256KeyLoader.AES_ALGORITHM);
        map2.put(zzzda5.getId(), AES256KeyLoader.AES_ALGORITHM);
    }

    public zzYQM(zzZ5X zzz5x, zzYNG zzyng, zzYP5 zzyp5, zzYP7 zzyp7) {
        this(zzz5x, zzyng, zzyp5, zzyp7, null);
    }

    private static byte[] zzVU(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    private byte[] zzY(zzZ5R zzz5r) throws InvalidKeyException {
        try {
            return this.zzVWn.zzZ(zzz5r);
        } catch (zzZ5E e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    private void zzZ(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.zzWil = this.zzVWq.zzY(true, algorithmParameterSpec, secureRandom);
        if (algorithmParameterSpec instanceof zzYME) {
            this.zzVWl = ((zzYME) algorithmParameterSpec).zzXA5();
        } else if (algorithmParameterSpec instanceof zzYN1) {
            this.zzVWl = ((zzYN1) algorithmParameterSpec).zzXA5();
        } else if (algorithmParameterSpec instanceof zzYMA) {
            this.zzVWl = ((zzYMA) algorithmParameterSpec).zzXA5();
        } else {
            this.zzVWl = null;
        }
        zzZ5W zzz5wZzXGV = this.zzWil.zzXGV();
        if (!(key instanceof PrivateKey)) {
            StringBuilder sb = new StringBuilder();
            sb.append(zzz5wZzXGV.getName());
            sb.append(" key agreement requires ");
            throw new InvalidKeyException(androidx.concurrent.futures.OooO00o.OooO0OO(sb, zzj(ECPrivateKey.class), " for initialisation"));
        }
        try {
            this.zzVWn = this.zzVWt.zzZ(this.zzVWr.zzZ(zzz5wZzXGV, (PrivateKey) key), this.zzWil);
        } catch (zzZ0H e) {
            throw new InvalidKeyException(e.getMessage(), e);
        } catch (zzZ5E e2) {
            throw new InvalidAlgorithmParameterException(e2.getMessage());
        }
    }

    private static String zzj(Class<?> cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private static int zzwA(String str) {
        return str.indexOf(91) > 0 ? (Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93))) + 7) / 8 : zzVWu.zzwA(str);
    }

    private static String zzwz(String str) {
        if (str.indexOf(91) > 0) {
            return str.substring(0, str.indexOf(91));
        }
        if (str.startsWith(zzZ9O.zzWAv.getId())) {
            return AES256KeyLoader.AES_ALGORITHM;
        }
        if (str.startsWith(zzZA1.zzWCz.getId())) {
            return "Serpent";
        }
        String str2 = zzVWv.get(str);
        return str2 != null ? str2 : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.crypto.KeyAgreementSpi
    public final Key engineDoPhase(Key key, boolean z) throws IllegalStateException, InvalidKeyException {
        zzZ4M zzz4m = this.zzWil;
        if (zzz4m == null) {
            throw new IllegalStateException("KeyAgreement not initialized");
        }
        zzZ5W zzz5wZzXGV = zzz4m.zzXGV();
        if (!(key instanceof PublicKey)) {
            StringBuilder sb = new StringBuilder();
            sb.append(zzz5wZzXGV.getName());
            sb.append(" key agreement requires ");
            throw new InvalidKeyException(androidx.concurrent.futures.OooO00o.OooO0OO(sb, zzj(PublicKey.class), " for doPhase"));
        }
        PublicKey publicKey = (PublicKey) key;
        zzZ1P zzz1p = zzZ1M.zzWjd;
        if (zzz5wZzXGV.equals(zzz1p)) {
            zzZ5R zzz5rZzY = this.zzVWs.zzY(this.zzWil.zzXGV(), publicKey);
            this.zzVWm = zzY(zzz5rZzY);
            return new zzYOT(new zzZ3Y(zzz1p, ((zzZ40) zzz5rZzY).zzXGD(), new BigInteger(1, this.zzVWm)));
        }
        if (z) {
            this.zzVWm = zzY(this.zzVWs.zzY(this.zzWil.zzXGV(), publicKey));
            return null;
        }
        throw new IllegalStateException(zzz5wZzXGV.getName() + " can only be between two parties.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    public final byte[] engineGenerateSecret() throws IllegalStateException {
        byte[] bArr = this.zzVWm;
        if (bArr == null) {
            throw new IllegalStateException("KeyAgreement not initialized");
        }
        zzZ1D.zzX zzx = this.zzVWo;
        if (zzx != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.zzVWp.zzY(zzx.zzX1(bArr).zzX2(this.zzVWl)).zzi(bArr2, length);
            zzYGU.fill(bArr, (byte) 0);
            this.zzVWm = bArr2;
        }
        byte[] bArr3 = this.zzVWm;
        this.zzVWm = null;
        return bArr3;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public final void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        zzZ(key, algorithmParameterSpec, secureRandom);
    }

    public zzYQM(zzZ5X zzz5x, zzYNG zzyng, zzYP5 zzyp5, zzYP7 zzyp7, zzZ1D.zzX zzx) {
        this.zzVWt = zzz5x;
        this.zzVWs = zzyng;
        this.zzVWr = zzyp5;
        this.zzVWq = zzyp7;
        this.zzVWo = zzx;
        this.zzVWp = new zzZ1D.zzW();
    }

    @Override // javax.crypto.KeyAgreementSpi
    public final void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            zzZ(key, null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException("Issue processing null paramSpec: " + e.getMessage(), e);
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public final int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        byte[] bArrEngineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i >= bArrEngineGenerateSecret.length) {
            System.arraycopy(bArrEngineGenerateSecret, 0, bArr, i, bArrEngineGenerateSecret.length);
            return bArrEngineGenerateSecret.length;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzWil.zzXGV().getName());
        sb.append(" key agreement: need ");
        throw new ShortBufferException(C21023OooO0Oo.OooO0OO(" bytes", bArrEngineGenerateSecret.length, sb));
    }

    @Override // javax.crypto.KeyAgreementSpi
    public final SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        byte[] bArr;
        byte[] bArr2 = this.zzVWm;
        if (bArr2 != null) {
            this.zzVWm = null;
            String upperCase = zzYGI.toUpperCase(str);
            if (upperCase.indexOf(47) < 0) {
                Map<String, zzZDA> map = zzVWw;
                String id = map.containsKey(upperCase) ? map.get(upperCase).getId() : str;
                int iZzwA = zzwA(id);
                if (iZzwA < 0) {
                    if (str.equals("TlsPremasterSecret") && this.zzVWn.zzXH6().zzXGV().getName().equals("DH")) {
                        return new SecretKeySpec(zzVU(bArr2), str);
                    }
                    return new SecretKeySpec(bArr2, zzwz(id));
                }
                zzZ1D.zzX zzx = this.zzVWo;
                if (zzx != null) {
                    bArr = new byte[iZzwA];
                    this.zzVWp.zzY(zzx.zzX1(bArr2).zzX2(this.zzVWl)).zzi(bArr, iZzwA);
                    zzYGU.fill(bArr2, (byte) 0);
                } else {
                    bArr = new byte[iZzwA];
                    System.arraycopy(bArr2, 0, bArr, 0, iZzwA);
                    zzYGU.fill(bArr2, (byte) 0);
                }
                if (zzYQ2.zzws(id)) {
                    zzYQ2.zzW0(bArr);
                }
                return new SecretKeySpec(bArr, zzwz(id));
            }
            String strSubstring = upperCase.substring(0, upperCase.indexOf(47));
            String strSubstring2 = upperCase.substring(upperCase.indexOf(47) + 1);
            int iZzwA2 = zzwA(strSubstring);
            int iZzwA3 = zzwA(strSubstring2);
            byte[] bArr3 = new byte[iZzwA2];
            byte[] bArr4 = new byte[iZzwA3];
            zzZ1D.zzX zzx2 = this.zzVWo;
            if (zzx2 != null) {
                int i = iZzwA2 + iZzwA3;
                byte[] bArr5 = new byte[i];
                this.zzVWp.zzY(zzx2.zzX1(bArr2).zzX2(this.zzVWl)).zzi(bArr5, i);
                System.arraycopy(bArr5, 0, bArr3, 0, iZzwA2);
                System.arraycopy(bArr5, iZzwA2, bArr4, 0, iZzwA3);
                zzYGU.fill(bArr2, (byte) 0);
                zzYGU.fill(bArr5, (byte) 0);
                return new zzYRK(new SecretKeySpec(bArr4, zzwz(strSubstring2)), zzwz(strSubstring), bArr3);
            }
            throw new IllegalStateException("KDF is required for key agreement with confirmation");
        }
        throw new IllegalStateException("KeyAgreement not initialized");
    }
}
