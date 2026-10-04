package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21023OooO0Oo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQ9 extends CipherSpi {
    private Class[] zzVVU;
    private zzY zzVVg;
    private zzZ4M zzVVh;
    private zzZ57 zzVVl;
    private zzZ54 zzVVm;
    private zzZ55 zzVVu;
    private zzZ18 zzVVv;
    private AlgorithmParameters zzVW3;
    private final Map<zzZ5W, zzZ4M> zzVW8;
    private zzYP6 zzVWa;
    private zzYP6 zzVWb;
    private final zzYQ8 zzVWk;
    private int zzWiC;
    private zzZ5W zzWlz;

    public static final class zzY extends ByteArrayOutputStream {
        public final void zzXBs() {
            zzYGU.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public final byte[] zzXBt() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public /* synthetic */ zzYQ9(zzYQ8 zzyq8, Map map, zzZ5W zzz5w, zzZ18 zzz18, zzZ55 zzz55, Class[] clsArr, zzYP6 zzyp6, zzYP6 zzyp62, int i, byte b) {
        this(zzyq8, map, zzz5w, zzz18, zzz55, clsArr, zzyp6, zzyp62, i);
    }

    public static Key zzZ(String str, int i, byte[] bArr, zzYQ8 zzyq8) throws NoSuchAlgorithmException, InvalidKeyException {
        if (i == 3) {
            return new SecretKeySpec(bArr, str);
        }
        if (i == 2) {
            if (str != null) {
                try {
                    if (!str.equals("")) {
                        return KeyFactory.getInstance(str, zzyq8).generatePrivate(new PKCS8EncodedKeySpec(bArr));
                    }
                } catch (Exception e) {
                    throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Invalid private key encoding: ")), e);
                }
            }
            zzZ94 zzz94ZzXG = zzZ94.zzXG(bArr);
            PrivateKey privateKeyZzV = zzyq8.zzV(zzz94ZzXG);
            if (privateKeyZzV != null) {
                return privateKeyZzV;
            }
            throw new InvalidKeyException("Algorithm " + zzz94ZzXG.zzXJ8().zzXJk() + " not supported");
        }
        if (str != null) {
            try {
                if (!str.equals("")) {
                    return KeyFactory.getInstance(str, zzyq8).generatePublic(new X509EncodedKeySpec(bArr));
                }
            } catch (Exception e2) {
                throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e2, new StringBuilder("Invalid private key encoding: ")), e2);
            }
        }
        zzZ7D zzz7dZzWZ = zzZ7D.zzWZ(bArr);
        PublicKey publicKeyZzU = zzyq8.zzU(zzz7dZzWZ);
        if (publicKeyZzU != null) {
            return publicKeyZzU;
        }
        throw new InvalidKeyException("Algorithm " + zzz7dZzWZ.zzXHJ().zzXJk() + " not supported");
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException, IOException {
        byte[] bArrZzh;
        zzY zzy = this.zzVVg;
        if (zzy == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        zzy.write(bArr, i, i2);
        try {
            zzZ54 zzz54 = this.zzVVm;
            if (zzz54 != null) {
                try {
                    try {
                        bArrZzh = zzz54.zzg(this.zzVVg.zzXBt(), this.zzVVg.size());
                    } catch (IllegalArgumentException e) {
                        throw new IllegalBlockSizeException(e.getMessage());
                    }
                } catch (zzZ4H e2) {
                    throw new BadPaddingException(e2.getMessage());
                }
            } else {
                try {
                    bArrZzh = this.zzVVl.zzh(this.zzVVg.zzXBt(), this.zzVVg.size());
                } catch (zzZ5B e3) {
                    throw new BadPaddingException(e3.getMessage());
                }
            }
            return bArrZzh;
        } finally {
            this.zzVVg.zzXBs();
        }
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineGetIV() {
        zzZ4M zzz4m = this.zzVVh;
        if (zzz4m instanceof zzZ4L) {
            return ((zzZ4L) zzz4m).getIV();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public final AlgorithmParameters engineGetParameters() {
        zzZ4M zzz4m = this.zzVVh;
        if (!(zzz4m instanceof zzZ4L)) {
            return null;
        }
        zzZ4L zzz4l = (zzZ4L) zzz4m;
        if (zzz4l.getIV() == null) {
            return null;
        }
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(zzYNC.zzS(this.zzVVh.zzXGV()), this.zzVWk);
            this.zzVW3 = algorithmParameters;
            algorithmParameters.init(new zzZC6(zzz4l.getIV()).getEncoded());
            return this.zzVW3;
        } catch (Exception e) {
            throw new IllegalStateException(e.toString(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        zzZ5W zzz5w = this.zzWlz;
        zzYP7 zzyp7ZzW = (zzz5w instanceof zzZ1P ? this.zzVWb : this.zzVWa).zzW(this.zzVW8.get(zzz5w));
        zzZ43 zzz43 = new zzZ43(this.zzWlz, key.getEncoded());
        int i2 = this.zzWiC;
        if (i2 != 0 && zzYNC.zzZ(zzz43, i2)) {
            throw new InvalidKeyException(C21023OooO0Oo.OooO0OO(" bits", this.zzWiC, new StringBuilder("Cipher requires key of size ")));
        }
        if (secureRandom == null) {
            secureRandom = this.zzVWk.zzXBp();
        }
        this.zzVVg = null;
        try {
            if (i != 1) {
                if (i == 2) {
                    this.zzVVg = new zzY();
                } else if (i != 3) {
                    if (i != 4) {
                        throw new InvalidParameterException("Unknown mode parameter passed to init.");
                    }
                }
                zzZ4M zzz4mZzY = zzyp7ZzW.zzY(false, algorithmParameterSpec, secureRandom);
                this.zzVVh = zzz4mZzY;
                if (this.zzWlz instanceof zzZ1P) {
                    this.zzVVl = this.zzVVv.zzY(zzz43, zzz4mZzY);
                } else {
                    this.zzVVl = this.zzVVu.zzY(zzz43, zzz4mZzY);
                }
                this.zzVVl = (zzZ57) zzYNC.zzZ(this.zzVVl, secureRandom);
                this.zzVVm = null;
                return;
            }
            this.zzVVg = new zzY();
            zzZ4M zzz4mZzY2 = zzyp7ZzW.zzY(true, algorithmParameterSpec, secureRandom);
            this.zzVVh = zzz4mZzY2;
            if (this.zzWlz instanceof zzZ1P) {
                this.zzVVm = this.zzVVv.zzZ(zzz43, zzz4mZzY2);
            } else {
                this.zzVVm = this.zzVVu.zzZ(zzz43, zzz4mZzY2);
            }
            this.zzVVm = (zzZ54) zzYNC.zzZ(this.zzVVm, secureRandom);
            this.zzVVl = null;
        } catch (zzZ5E e) {
            throw new InvalidKeyException(e.getMessage(), e);
        } catch (InvalidParameterException e2) {
            throw e2;
        } catch (IllegalArgumentException e3) {
            throw new InvalidAlgorithmParameterException(e3.getMessage(), e3);
        } catch (Exception e4) {
            throw new InvalidKeyException(e4.getMessage(), e4);
        }
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Cannot support mode ", str));
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(C20593OooO0Oo.OooO0O0("Padding ", str, " unknown"));
    }

    @Override // javax.crypto.CipherSpi
    public final Key engineUnwrap(byte[] bArr, String str, int i) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            return zzZ(str, i, this.zzVVl.zzh(bArr, bArr.length), this.zzVWk);
        } catch (Exception e) {
            throw new InvalidKeyException(e.getMessage(), e.getCause());
        }
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineUpdate(byte[] bArr, int i, int i2) throws IOException {
        zzY zzy = this.zzVVg;
        if (zzy == null) {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
        zzy.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            return this.zzVVm.zzg(encoded, encoded.length);
        } catch (zzZ4H e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    public static class zzZ {
        private Class[] zzVVU;
        private zzZ55 zzVVe;
        private zzZ18 zzVVf;
        private final Map<zzZ5W, zzZ4M> zzVW8;
        private final zzZ5W[] zzVW9;
        private zzYP6 zzVWa;
        private zzYP6 zzVWb;
        private final zzYQ8 zzVWk;
        private int zzWiC;

        public zzZ(zzYQ8 zzyq8, zzZ4M... zzz4mArr) {
            this.zzVWk = zzyq8;
            HashMap map = new HashMap(1);
            this.zzVW8 = map;
            this.zzVW9 = new zzZ5W[]{zzz4mArr[0].zzXGV()};
            map.put(zzz4mArr[0].zzXGV(), zzz4mArr[0]);
        }

        public final zzZ zzU(Class[] clsArr) {
            this.zzVVU = clsArr;
            return this;
        }

        public final zzYQ9 zzXBu() {
            if (!zzZ5L.zzXH0()) {
                return new zzYQ9(this.zzVWk, this.zzVW8, this.zzVW9[0], this.zzVVf, this.zzVVe, this.zzVVU, this.zzVWb, this.zzVWa, this.zzWiC, (byte) 0);
            }
            Set<zzZ5W> setZzY = zzYNC.zzY(this.zzVW9);
            if (setZzY.isEmpty()) {
                return null;
            }
            return new zzYQ9(this.zzVWk, this.zzVW8, ((zzZ5W[]) setZzY.toArray(new zzZ5W[setZzY.size()]))[0], this.zzVVf, this.zzVVe, this.zzVVU, this.zzVWb, this.zzVWa, this.zzWiC, (byte) 0);
        }

        public final zzZ zzZ(zzYP6 zzyp6, zzZ18 zzz18) {
            this.zzVWb = zzyp6;
            this.zzVVf = zzz18;
            return this;
        }

        public final zzZ zzeW(int i) {
            this.zzWiC = i;
            return this;
        }

        public final zzZ zzZ(zzYP6 zzyp6, zzZ55 zzz55) {
            this.zzVWa = zzyp6;
            this.zzVVe = zzz55;
            return this;
        }
    }

    private zzYQ9(zzYQ8 zzyq8, Map<zzZ5W, zzZ4M> map, zzZ5W zzz5w, zzZ18 zzz18, zzZ55 zzz55, Class[] clsArr, zzYP6 zzyp6, zzYP6 zzyp62, int i) {
        this.zzVW3 = null;
        this.zzVVg = null;
        this.zzVWk = zzyq8;
        this.zzVW8 = map;
        this.zzWlz = zzz5w;
        this.zzVVv = zzz18;
        this.zzVVu = zzz55;
        this.zzVVU = clsArr;
        this.zzVWb = zzyp6;
        this.zzVWa = zzyp62;
        this.zzWiC = i;
    }

    @Override // javax.crypto.CipherSpi
    public final int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException, ShortBufferException {
        zzY zzy = this.zzVVg;
        if (zzy != null) {
            zzy.write(bArr, i, i2);
            return 0;
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public final int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        byte[] bArrZzg;
        zzY zzy = this.zzVVg;
        if (zzy != null) {
            zzy.write(bArr, i, i2);
            try {
                zzZ54 zzz54 = this.zzVVm;
                if (zzz54 != null) {
                    try {
                        bArrZzg = zzz54.zzg(this.zzVVg.zzXBt(), this.zzVVg.size());
                    } catch (zzZ4H e) {
                        throw new BadPaddingException(e.getMessage());
                    } catch (IllegalArgumentException e2) {
                        throw new IllegalBlockSizeException(e2.getMessage());
                    }
                } else {
                    try {
                        bArrZzg = this.zzVVl.zzh(this.zzVVg.zzXBt(), this.zzVVg.size());
                    } catch (zzZ5B e3) {
                        throw new BadPaddingException(e3.getMessage());
                    }
                }
                if (bArrZzg.length + i3 <= bArr2.length) {
                    System.arraycopy(bArrZzg, 0, bArr2, i3, bArrZzg.length);
                    return bArrZzg.length;
                }
                throw new ShortBufferException("output buffer too short for input.");
            } finally {
                this.zzVVg.zzXBs();
            }
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec = null;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                Class[] clsArr = this.zzVVU;
                if (i2 == clsArr.length) {
                    break;
                }
                try {
                    parameterSpec = algorithmParameters.getParameterSpec(clsArr[i2]);
                    break;
                } catch (Exception unused) {
                    i2++;
                }
            }
            if (parameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        this.zzVW3 = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
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
