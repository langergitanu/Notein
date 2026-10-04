package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ4K;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQJ extends CipherSpi {
    private byte[] zzVVV;
    private zzYPW zzVVW;
    private zzZ41 zzVVX;
    private zzZ41 zzVVY;
    private zzZ4W<zzZ4M> zzVVZ;
    private zzZ4U<zzZ4M> zzVW0;
    private zzZ4X<zzZ4M> zzVW1;
    private String zzVW2;
    private AlgorithmParameters zzVW3;
    private String zzVW4;
    private PBEParameterSpec zzVW5;
    private Set<zzZ5W> zzVW6;
    private final int zzVW7;
    private final Map<zzZ5W, zzZ4M> zzVW8;
    private final zzZ5W[] zzVW9;
    private final zzYP6<zzZ4M> zzVWa;
    private final zzYP6<zzZ0S> zzVWb;
    private final Class[] zzVWc;
    private final Class[] zzVWd;
    private final zzZ5K zzVWe;
    private final int zzVWf;
    private final zzZ5Z zzVWg;
    private final zzZ1U zzVWh;
    private final zzZ44 zzVWi;
    private final zzZ0J zzVWj;
    private final zzYQ8 zzVWk;
    private final int zzWiC;

    public /* synthetic */ zzYQJ(zzYQ8 zzyq8, int i, int i2, zzZ5K zzz5k, int i3, zzZ0J zzz0j, zzZ44 zzz44, zzZ1U zzz1u, zzZ5Z zzz5z, Class[] clsArr, zzYP6 zzyp6, zzYP6 zzyp62, Map map, zzZ5W[] zzz5wArr, byte b) {
        this(zzyq8, i, i2, zzz5k, i3, zzz0j, zzz44, zzz1u, zzz5z, clsArr, zzyp6, zzyp62, map, zzz5wArr);
    }

    private static boolean zzW(zzZ5W zzz5w) {
        String name = zzz5w.getName();
        return name.contains("/CCM") || name.contains("/EAX") || name.contains("/GCM") || name.contains("/OCB");
    }

    private zzZ5W zzXGV() {
        return this.zzVW6.size() == 1 ? this.zzVW6.iterator().next() : this.zzVW9[0];
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException {
        if (bArr != null && i2 != 0) {
            try {
                this.zzVVX.update(bArr, i, i2);
            } catch (IOException e) {
                if (this.zzVW1.zzXH6() instanceof zzZ5P) {
                    zzYQ3.zzwt(e.getMessage());
                }
                throw new BadPaddingException(e.getMessage());
            }
        }
        this.zzVVX.close();
        byte[] byteArray = this.zzVVW.toByteArray();
        this.zzVVW.zzXBd();
        byte[] bArr2 = this.zzVVV;
        if (bArr2 != null) {
            this.zzVVY.update(bArr2);
        }
        return byteArray;
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetBlockSize() {
        return (this.zzVWf + 7) / 8;
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineGetIV() {
        zzZ4M zzz4mZzXH6 = this.zzVW1.zzXH6();
        if (zzz4mZzXH6 instanceof zzZ4L) {
            return ((zzZ4L) zzz4mZzXH6).getIV();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetOutputSize(int i) {
        return this.zzVW1.zzfZ(i);
    }

    @Override // javax.crypto.CipherSpi
    public final AlgorithmParameters engineGetParameters() {
        zzZ4X<zzZ4M> zzz4x;
        if (this.zzVW3 == null && (zzz4x = this.zzVW1) != null) {
            zzZ4M zzz4mZzXH6 = zzz4x.zzXH6();
            String strZzS = zzYNC.zzS(zzz4mZzXH6.zzXGV());
            if (zzz4mZzXH6 instanceof zzZ5P) {
                try {
                    zzZ5P zzz5p = (zzZ5P) zzz4mZzXH6;
                    AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(strZzS, this.zzVWk);
                    this.zzVW3 = algorithmParameters;
                    algorithmParameters.init(new zzZAN(zzz5p.getIV(), zzz5p.zzXH3() / 8).getEncoded());
                } catch (Exception e) {
                    throw new IllegalStateException(e.toString(), e);
                }
            } else if (zzz4mZzXH6 instanceof zzZ4L) {
                zzZ4L zzz4l = (zzZ4L) zzz4mZzXH6;
                if (zzz4l.getIV() != null) {
                    try {
                        AlgorithmParameters algorithmParameters2 = AlgorithmParameters.getInstance(strZzS, this.zzVWk);
                        this.zzVW3 = algorithmParameters2;
                        algorithmParameters2.init(new zzZC6(zzz4l.getIV()).getEncoded());
                    } catch (Exception e2) {
                        throw new IllegalStateException(e2.toString(), e2);
                    }
                }
            }
            if (this.zzVW5 != null) {
                try {
                    AlgorithmParameters algorithmParameters3 = AlgorithmParameters.getInstance(this.zzVW4, this.zzVWk);
                    this.zzVW3 = algorithmParameters3;
                    algorithmParameters3.init(this.zzVW5);
                } catch (Exception unused) {
                    return null;
                }
            }
        }
        return this.zzVW3;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01db A[Catch: IllegalArgumentException -> 0x01d9, TryCatch #11 {IllegalArgumentException -> 0x01d9, blocks: (B:100:0x01d3, B:106:0x01e2, B:105:0x01db), top: B:193:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0151 A[Catch: IllegalArgumentException -> 0x014f, TryCatch #6 {IllegalArgumentException -> 0x014f, blocks: (B:80:0x0149, B:86:0x0158, B:85:0x0151), top: B:189:0x0149 }] */
    @Override // javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        zzYP7 zzyp7ZzW;
        zzZ44 zzz44;
        zzZ5Z zzz5z;
        boolean z;
        zzZ4M zzz4mZzY;
        Key secretKeySpec;
        char c;
        PBEParameterSpec pBEParameterSpec;
        int i2;
        this.zzVW4 = null;
        this.zzVW3 = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("Key for algorithm " + key.getAlgorithm() + " not suitable for symmetric enryption.");
        }
        SecureRandom secureRandomZzXBp = secureRandom == null ? this.zzVWk.zzXBp() : secureRandom;
        zzZ5W zzz5wZzXGV = zzXGV();
        if (zzz5wZzXGV instanceof zzZ1P) {
            zzyp7ZzW = this.zzVWb.zzW((zzZ0S) this.zzVW8.get(zzz5wZzXGV));
            zzz44 = this.zzVWj;
            zzz5z = this.zzVWh;
        } else {
            if (zzZ5L.zzXH0()) {
                throw new zzZ0H("Cipher cannot be used in approved mode");
            }
            zzyp7ZzW = this.zzVWa.zzW(this.zzVW8.get(zzz5wZzXGV));
            zzz44 = this.zzVWi;
            zzz5z = this.zzVWg;
        }
        if (i == 1) {
            z = true;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new InvalidParameterException(o0Oo0oo.OooO0O0(i, "unknown opmode ", " passed"));
                    }
                }
                z = true;
            }
            z = false;
        }
        boolean z2 = key instanceof PBEKey;
        if ((z2 && !(key instanceof zzYPE)) || this.zzVW7 != 0 || (algorithmParameterSpec instanceof PBEParameterSpec)) {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                PBEParameterSpec pBEParameterSpec2 = (PBEParameterSpec) algorithmParameterSpec;
                this.zzVW5 = pBEParameterSpec2;
                c = 1;
                pBEParameterSpec = pBEParameterSpec2;
            } else {
                if (!z2) {
                    if (!z2) {
                        throw new InvalidKeyException("Algorithm requires a PBE key");
                    }
                    throw new InvalidAlgorithmParameterException("No algorithm parameters provided when required");
                }
                PBEKey pBEKey = (PBEKey) key;
                c = 1;
                PBEParameterSpec pBEParameterSpec3 = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                this.zzVW5 = pBEParameterSpec3;
                pBEParameterSpec = pBEParameterSpec3;
            }
            try {
                SecretKey secretKey = (SecretKey) key;
                if (this.zzWiC == 0) {
                    throw new InvalidAlgorithmParameterException("Invalid algorithm parameter: cannot use PBE with variable key size");
                }
                if ((key instanceof zzYRE) || (i2 = this.zzVW7) == zzYPF.PBKDF2$3a317ada) {
                    PBEParameterSpec pBEParameterSpec4 = pBEParameterSpec;
                    this.zzVW4 = "PBKDF2";
                    secretKeySpec = new SecretKeySpec(zzYO2.zzZ(secretKey, pBEParameterSpec4, zzZ4K.zzZ.CIPHER, this.zzWiC), zzz5wZzXGV.getName());
                    try {
                        if (!zzz5wZzXGV.zzXH5()) {
                            zzz4mZzY = zzyp7ZzW.zzY(z, null, secureRandomZzXBp);
                        } else {
                            if (algorithmParameterSpec == null) {
                                throw new InvalidKeyException("No algorithm parameters provided when required");
                            }
                            zzz4mZzY = zzyp7ZzW.zzY(z, algorithmParameterSpec, secureRandomZzXBp);
                        }
                    } catch (IllegalArgumentException e) {
                        throw new InvalidAlgorithmParameterException("Invalid algorithm parameter: " + e.getMessage(), e);
                    }
                } else if ((key instanceof zzYRF) || i2 == zzYPF.PBKDF1$3a317ada) {
                    PBEParameterSpec pBEParameterSpec5 = pBEParameterSpec;
                    this.zzVW4 = "PBKDF1";
                    if (zzz5wZzXGV.zzXH5()) {
                        byte[][] bArrZzZ = zzYO3.zzZ(secretKey, pBEParameterSpec5, this.zzVWe, zzZ4K.zzZ.CIPHER, this.zzWiC, this.zzVWf);
                        secretKeySpec = new SecretKeySpec(bArrZzZ[0], zzz5wZzXGV.getName());
                        if (algorithmParameterSpec != null) {
                            try {
                                AlgorithmParameterSpec ivParameterSpec = !(algorithmParameterSpec instanceof PBEParameterSpec) ? algorithmParameterSpec : new IvParameterSpec(bArrZzZ[c]);
                                zzz4mZzY = zzyp7ZzW.zzY(z, ivParameterSpec, secureRandomZzXBp);
                            } catch (IllegalArgumentException e2) {
                                throw new InvalidAlgorithmParameterException("Invalid algorithm parameter: " + e2.getMessage(), e2);
                            }
                        }
                    } else {
                        secretKeySpec = new SecretKeySpec(zzYO3.zzZ(secretKey, pBEParameterSpec5, this.zzVWe, zzZ4K.zzZ.CIPHER, this.zzWiC), zzz5wZzXGV.getName());
                        try {
                            zzz4mZzY = zzyp7ZzW.zzY(z, null, secureRandomZzXBp);
                        } catch (IllegalArgumentException e3) {
                            throw new InvalidAlgorithmParameterException("Invalid algorithm parameter: " + e3.getMessage(), e3);
                        }
                    }
                } else {
                    if (!(key instanceof zzYRC) && i2 != zzYPF.PKCS12$3a317ada) {
                        throw new InvalidKeyException("Unable to use passed in key for PBE");
                    }
                    this.zzVW4 = "PBKDF-PKCS12";
                    if (zzz5wZzXGV.zzXH5()) {
                        byte[][] bArrZzZ2 = zzYO1.zzZ(secretKey, this.zzVWe, pBEParameterSpec, zzZ4K.zzZ.CIPHER, this.zzWiC, this.zzVWf);
                        secretKeySpec = new SecretKeySpec(bArrZzZ2[0], zzz5wZzXGV.getName());
                        if (algorithmParameterSpec != null) {
                            try {
                                AlgorithmParameterSpec ivParameterSpec2 = !(algorithmParameterSpec instanceof PBEParameterSpec) ? algorithmParameterSpec : new IvParameterSpec(bArrZzZ2[c]);
                                zzz4mZzY = zzyp7ZzW.zzY(z, ivParameterSpec2, secureRandomZzXBp);
                            } catch (IllegalArgumentException e4) {
                                throw new InvalidAlgorithmParameterException("Invalid algorithm parameter: " + e4.getMessage(), e4);
                            }
                        }
                    } else {
                        secretKeySpec = new SecretKeySpec(zzYO1.zzZ(secretKey, pBEParameterSpec, zzZ4K.zzZ.CIPHER, this.zzWiC), zzz5wZzXGV.getName());
                        try {
                            zzz4mZzY = zzyp7ZzW.zzY(z, null, secureRandomZzXBp);
                        } catch (IllegalArgumentException e5) {
                            throw new InvalidAlgorithmParameterException("Invalid algorithm parameter: " + e5.getMessage(), e5);
                        }
                    }
                }
            } catch (Exception unused) {
                throw new InvalidKeyException("Algorithm requires a PBE key");
            }
        } else {
            if (key instanceof zzYRD) {
                throw new InvalidKeyException("PBE key requires a PBEParameterSpec");
            }
            if (!z && zzz5wZzXGV.zzXH5() && algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException("No algorithm parameters provided when required");
            }
            try {
                zzz4mZzY = zzyp7ZzW.zzY(z, algorithmParameterSpec, secureRandomZzXBp);
                secretKeySpec = key;
            } catch (IllegalArgumentException e6) {
                throw new InvalidAlgorithmParameterException("Invalid algorithm parameter: " + e6.getMessage(), e6);
            }
        }
        try {
            zzZ46 zzz46ZzZ = zzYNC.zzZ(zzz5wZzXGV, secretKeySpec);
            int i3 = this.zzWiC;
            if (i3 != 0 && zzYNC.zzZ(zzz46ZzZ, i3)) {
                throw new InvalidKeyException("Cipher requires key of size " + this.zzWiC + " bits");
            }
            if (!zzW(zzz5wZzXGV)) {
                if (z) {
                    zzZ4U<zzZ4M> zzz4u = (zzZ4U) zzYNC.zzZ(zzz44.zzX(zzz46ZzZ, zzz4mZzY), secureRandomZzXBp);
                    this.zzVW0 = zzz4u;
                    this.zzVW1 = zzz4u;
                    this.zzVVX = zzz4u.zzR(this.zzVVW);
                    this.zzVVY = null;
                    return;
                }
                zzZ4W<zzZ4M> zzz4w = (zzZ4W) zzYNC.zzZ(zzz44.zzW(zzz46ZzZ, zzz4mZzY), secureRandomZzXBp);
                this.zzVVZ = zzz4w;
                this.zzVW1 = zzz4w;
                this.zzVVX = zzz4w.zzS(this.zzVVW);
                this.zzVVY = null;
                return;
            }
            if (z) {
                zzZ4U<zzZ4M> zzz4u2 = (zzZ4U) zzYNC.zzZ(zzz5z.zzZ(zzz46ZzZ, zzz4mZzY), secureRandomZzXBp);
                this.zzVW0 = zzz4u2;
                this.zzVW1 = zzz4u2;
                this.zzVVX = zzz4u2.zzR(this.zzVVW);
                this.zzVVY = ((zzZ4Y) this.zzVW0).zzXH7();
            } else {
                zzZ4W<zzZ4M> zzz4w2 = (zzZ4W) zzYNC.zzZ(zzz5z.zzY(zzz46ZzZ, zzz4mZzY), secureRandomZzXBp);
                this.zzVVZ = zzz4w2;
                this.zzVW1 = zzz4w2;
                this.zzVVX = zzz4w2.zzS(this.zzVVW);
                this.zzVVY = ((zzZ4Z) this.zzVVZ).zzXH7();
            }
            if (algorithmParameterSpec instanceof zzYN5) {
                byte[] bArrZzXA9 = ((zzYN5) algorithmParameterSpec).zzXA9();
                this.zzVVV = bArrZzXA9;
                if (bArrZzXA9 != null) {
                    this.zzVVY.update(bArrZzXA9);
                }
            }
        } catch (zzZ5E e7) {
            throw new InvalidKeyException(e7.getMessage(), e7);
        } catch (InvalidParameterException e8) {
            throw e8;
        } catch (IllegalArgumentException e9) {
            throw new InvalidAlgorithmParameterException(e9.getMessage(), e9);
        } catch (InvalidKeyException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new InvalidKeyException(e11.getMessage(), e11);
        }
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetMode(String str) throws NoSuchAlgorithmException {
        String str2;
        String strOooO0OO;
        String upperCase = zzYGI.toUpperCase(str);
        this.zzVW2 = upperCase;
        if (upperCase.equals("CTS")) {
            this.zzVW2 = "CBC/CS3";
        }
        if (this.zzVW2.equals("SIC")) {
            str2 = "/CTR";
            strOooO0OO = "/CTR/";
        } else if (this.zzVW2.equals("CFB") || this.zzVW2.equals("OFB")) {
            str2 = "/" + this.zzVW2 + Integer.toString(this.zzVWf);
            strOooO0OO = "/" + this.zzVW2 + Integer.toString(this.zzVWf) + "/";
        } else {
            str2 = "/" + this.zzVW2;
            strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("/"), this.zzVW2, "/");
        }
        HashSet<zzZ5W> hashSet = new HashSet(this.zzVW6);
        this.zzVW6.clear();
        for (zzZ5W zzz5w : hashSet) {
            if (zzz5w.getName().endsWith(str2) || zzz5w.getName().contains(strOooO0OO)) {
                this.zzVW6.add(zzz5w);
            }
        }
        if (this.zzVW6.isEmpty()) {
            throw new NoSuchAlgorithmException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzVW2, " not found"));
        }
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = zzYGI.toUpperCase(str);
        HashSet<zzZ5W> hashSet = new HashSet(this.zzVW6);
        this.zzVW6.clear();
        if (upperCase.equals("NOPADDING")) {
            for (zzZ5W zzz5w : hashSet) {
                if (zzz5w.getName().indexOf(47) == zzz5w.getName().lastIndexOf(47)) {
                    this.zzVW6.add(zzz5w);
                }
            }
            if (this.zzVW6.isEmpty() && hashSet.size() == 1) {
                for (zzZ5W zzz5w2 : hashSet) {
                    if (zzz5w2.getName().endsWith("CS3")) {
                        this.zzVW6.add(zzz5w2);
                    }
                }
            }
        } else if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING")) {
            for (zzZ5W zzz5w3 : hashSet) {
                if (zzz5w3.getName().endsWith("PKCS7")) {
                    this.zzVW6.add(zzz5w3);
                }
            }
        } else if (upperCase.equals("ISO10126PADDING") || upperCase.equals("ISO10126-2PADDING")) {
            for (zzZ5W zzz5w4 : hashSet) {
                if (zzz5w4.getName().endsWith("ISO10126-2")) {
                    this.zzVW6.add(zzz5w4);
                }
            }
        } else if (upperCase.equals("X9.23PADDING") || upperCase.equals("X923PADDING")) {
            for (zzZ5W zzz5w5 : hashSet) {
                if (zzz5w5.getName().endsWith("X9.23")) {
                    this.zzVW6.add(zzz5w5);
                }
            }
        } else if (upperCase.equals("ISO7816-4PADDING") || upperCase.equals("ISO9797-1PADDING")) {
            for (zzZ5W zzz5w6 : hashSet) {
                if (zzz5w6.getName().endsWith("ISO7816-4")) {
                    this.zzVW6.add(zzz5w6);
                }
            }
        } else if (upperCase.equals("TBCPADDING")) {
            for (zzZ5W zzz5w7 : hashSet) {
                if (zzz5w7.getName().endsWith("TBC")) {
                    this.zzVW6.add(zzz5w7);
                }
            }
        } else if (upperCase.equals("CTSPADDING") || upperCase.equals("CS3PADDING")) {
            for (zzZ5W zzz5w8 : hashSet) {
                if (zzz5w8.getName().endsWith("CS3")) {
                    this.zzVW6.add(zzz5w8);
                }
            }
        } else if (upperCase.equals("CS1PADDING")) {
            for (zzZ5W zzz5w9 : hashSet) {
                if (zzz5w9.getName().endsWith("CS1")) {
                    this.zzVW6.add(zzz5w9);
                }
            }
        } else {
            if (!upperCase.equals("CS2PADDING")) {
                throw new NoSuchPaddingException(C20593OooO0Oo.OooO0O0("Padding ", str, " unknown"));
            }
            for (zzZ5W zzz5w10 : hashSet) {
                if (zzz5w10.getName().endsWith("CS2")) {
                    this.zzVW6.add(zzz5w10);
                }
            }
        }
        if (this.zzVW6.isEmpty()) {
            throw new NoSuchPaddingException(upperCase.concat(" not found"));
        }
    }

    @Override // javax.crypto.CipherSpi
    public final Key engineUnwrap(byte[] bArr, String str, int i) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            return zzYQ9.zzZ(str, i, engineDoFinal(bArr, 0, bArr.length), this.zzVWk);
        } catch (BadPaddingException e) {
            throw new InvalidKeyException(e.getMessage());
        } catch (IllegalBlockSizeException e2) {
            throw new InvalidKeyException(e2.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.zzVVX.update(bArr, i, i2);
        if (this.zzVVW.size() <= 0) {
            return null;
        }
        byte[] byteArray = this.zzVVW.toByteArray();
        this.zzVVW.reset();
        return byteArray;
    }

    @Override // javax.crypto.CipherSpi
    public final void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.zzVVY.update(bArr, i, i2);
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (BadPaddingException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    public static class zzZ {
        private Class[] zzVVU;
        private int zzVW7;
        private final Map<zzZ5W, zzZ4M> zzVW8;
        private final zzZ5W[] zzVW9;
        private zzYP6 zzVWa;
        private zzYP6 zzVWb;
        private zzZ5K zzVWe = zzZ0P.zzZ.zzWdL;
        private zzZ5Z zzVWg;
        private zzZ1U zzVWh;
        private zzZ44 zzVWi;
        private zzZ0J zzVWj;
        private final zzYQ8 zzVWk;
        private int zzWiC;
        private final int zzZNm;

        public zzZ(zzYQ8 zzyq8, int i, zzZ4M... zzz4mArr) {
            this.zzVWk = zzyq8;
            this.zzZNm = i;
            this.zzVW8 = new HashMap(zzz4mArr.length);
            this.zzVW9 = new zzZ5W[zzz4mArr.length];
            for (int i2 = 0; i2 != zzz4mArr.length; i2++) {
                this.zzVW8.put(zzz4mArr[i2].zzXGV(), zzz4mArr[i2]);
                this.zzVW9[i2] = zzz4mArr[i2].zzXGV();
            }
        }

        public final zzZ zzQ(zzZ5K zzz5k) {
            this.zzVWe = zzz5k;
            return this;
        }

        public final zzZ zzW(Class[] clsArr) {
            this.zzVVU = clsArr;
            return this;
        }

        public final zzYQJ zzXBD() {
            if (!zzZ5L.zzXH0()) {
                return new zzYQJ(this.zzVWk, this.zzZNm, this.zzWiC, this.zzVWe, this.zzVW7, this.zzVWj, this.zzVWi, this.zzVWh, this.zzVWg, this.zzVVU, this.zzVWb, this.zzVWa, this.zzVW8, this.zzVW9, (byte) 0);
            }
            Set<zzZ5W> setZzY = zzYNC.zzY(this.zzVW9);
            if (setZzY.isEmpty()) {
                return null;
            }
            return new zzYQJ(this.zzVWk, this.zzZNm, this.zzWiC, this.zzVWe, this.zzVW7, this.zzVWj, this.zzVWi, this.zzVWh, this.zzVWg, this.zzVVU, this.zzVWb, this.zzVWa, this.zzVW8, (zzZ5W[]) setZzY.toArray(new zzZ5W[setZzY.size()]), (byte) 0);
        }

        public final zzZ zzZ(zzYP6 zzyp6, zzZ0J zzz0j) {
            this.zzVWb = zzyp6;
            this.zzVWj = zzz0j;
            return this;
        }

        public final zzZ zzeY(int i) {
            this.zzVW7 = i;
            return this;
        }

        public final zzZ zzeZ(int i) {
            this.zzWiC = i;
            return this;
        }

        public final zzZ zzZ(zzYP6 zzyp6, zzZ0J zzz0j, zzZ1U zzz1u) {
            this.zzVWb = zzyp6;
            this.zzVWj = zzz0j;
            this.zzVWh = zzz1u;
            return this;
        }

        public final zzZ zzZ(zzYP6 zzyp6, zzZ44 zzz44, zzZ5Z zzz5z) {
            this.zzVWa = zzyp6;
            this.zzVWi = zzz44;
            this.zzVWg = zzz5z;
            return this;
        }
    }

    private zzYQJ(zzYQ8 zzyq8, int i, int i2, zzZ5K zzz5k, int i3, zzZ0J zzz0j, zzZ44 zzz44, zzZ1U zzz1u, zzZ5Z zzz5z, Class[] clsArr, zzYP6 zzyp6, zzYP6 zzyp62, Map<zzZ5W, zzZ4M> map, zzZ5W... zzz5wArr) {
        this.zzVW6 = new HashSet();
        this.zzVW5 = null;
        this.zzVW4 = null;
        this.zzVW3 = null;
        this.zzVW2 = null;
        this.zzVVW = new zzYPW();
        this.zzVVV = null;
        this.zzVWk = zzyq8;
        this.zzWiC = i2;
        this.zzVWe = zzz5k;
        this.zzVW7 = i3;
        this.zzVWj = zzz0j;
        this.zzVWi = zzz44;
        this.zzVWh = zzz1u;
        this.zzVWg = zzz5z;
        this.zzVWf = i;
        this.zzVWd = clsArr;
        this.zzVWc = clsArr;
        this.zzVWb = zzyp6;
        this.zzVWa = zzyp62;
        this.zzVW8 = map;
        this.zzVW9 = zzz5wArr;
        this.zzVW6.addAll(Arrays.asList(zzz5wArr));
    }

    @Override // javax.crypto.CipherSpi
    public final void engineUpdateAAD(ByteBuffer byteBuffer) {
        this.zzVVY.update(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    @Override // javax.crypto.CipherSpi
    public final int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (this.zzVW1.zzfY(i2) + i3 <= bArr2.length) {
            byte[] bArrEngineUpdate = engineUpdate(bArr, i, i2);
            if (bArrEngineUpdate == null) {
                return 0;
            }
            System.arraycopy(bArrEngineUpdate, 0, bArr2, i3, bArrEngineUpdate.length);
            return bArrEngineUpdate.length;
        }
        throw new ShortBufferException("Output buffer too short for input.");
    }

    @Override // javax.crypto.CipherSpi
    public final int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            byte[] bArrEngineDoFinal = engineDoFinal(bArr, i, i2);
            System.arraycopy(bArrEngineDoFinal, 0, bArr2, i3, bArrEngineDoFinal.length);
            Arrays.fill(bArrEngineDoFinal, (byte) 0);
            return bArrEngineDoFinal.length;
        }
        throw new ShortBufferException("Output buffer too short for input.");
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec = null;
        if (algorithmParameters != null) {
            Class[] clsArr = zzXGV() instanceof zzZ1P ? this.zzVWd : this.zzVWc;
            for (int i2 = 0; i2 != clsArr.length; i2++) {
                Class cls = clsArr[i2];
                if (cls != null) {
                    try {
                        parameterSpec = algorithmParameters.getParameterSpec(cls);
                        break;
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (parameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        engineInit(i, key, parameterSpec, secureRandom);
        this.zzVW3 = algorithmParameters;
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage(), e);
        }
    }
}
