package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.IOException;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: loaded from: classes5.dex */
class zzYQA extends CipherSpi {
    private static final Class zzVVx = (Class) AccessController.doPrivileged(new PrivilegedAction<Class>() { // from class: com.aspose.words.internal.zzYQA.1
        @Override // java.security.PrivilegedAction
        public final /* synthetic */ Class run() {
            return zzYQA.zzwx("sun.security.internal.spec.TlsRsaPremasterSecretParameterSpec");
        }
    });
    private final Class[] zzVVU;
    private zzZ57 zzVVl;
    private zzZ54 zzVVm;
    private zzZ4M zzVVn;
    private boolean zzVVp;
    private boolean zzVVq;
    private zzZ4C zzVVr;
    private final zzYP6 zzVVs;
    private final zzZ5T zzVVt;
    private final zzZ55 zzVVu;
    private final zzZ18 zzVVv;
    private final boolean zzVVw;
    private AlgorithmParameterSpec zzVVy;
    private AlgorithmParameters zzVW3;
    private final Map<zzZ5W, zzZ4M> zzVW8;
    private final zzZ5W[] zzVW9;
    private final zzYQ8 zzVWk;
    private final zzYP5 zzVWr;
    private final zzYNG zzVWs;
    private Set<zzZ5W> zzVW6 = new HashSet();
    private zzYPW zzVVo = new zzYPW();

    public static class zzZ extends BadPaddingException {
        private Throwable zzWIA;

        public zzZ(String str, Throwable th) {
            super(str);
            this.zzWIA = th;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.zzWIA;
        }
    }

    public zzYQA(zzYQ8 zzyq8, boolean z, boolean z2, boolean z3, Class[] clsArr, zzZ5T zzz5t, zzZ18 zzz18, zzZ55 zzz55, zzYNG zzyng, zzYP5 zzyp5, zzYP6 zzyp6, Map<zzZ5W, zzZ4M> map, zzZ5W... zzz5wArr) {
        this.zzVVq = false;
        this.zzVVp = false;
        this.zzVWk = zzyq8;
        this.zzVVq = z;
        this.zzVVp = z2;
        this.zzVVw = z3;
        this.zzVVU = clsArr;
        this.zzVVt = zzz5t;
        this.zzVVv = zzz18;
        this.zzVVu = zzz55;
        this.zzVWs = zzyng;
        this.zzVWr = zzyp5;
        this.zzVVs = zzyp6;
        this.zzVW8 = map;
        this.zzVW9 = zzz5wArr;
        this.zzVW6.addAll(Arrays.asList(zzz5wArr));
    }

    private void zzXBA() {
        if (this.zzVVr == null || this.zzVVo.size() <= this.zzVVr.zzXGJ()) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Too much data for block: maximum " + this.zzVVr.zzXGJ() + " bytes");
    }

    private byte[] zzXBz() throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrZze;
        byte[] byteArray = null;
        try {
            byteArray = this.zzVVo.toByteArray();
            zzZ4C zzz4c = this.zzVVr;
            if (zzz4c instanceof zzZ49) {
                try {
                    bArrZze = ((zzZ49) zzz4c).zze(byteArray, byteArray.length);
                } catch (zzZ4H e) {
                    throw new IllegalBlockSizeException("unable to encrypt block: " + e.getMessage());
                }
            } else if (zzz4c != null) {
                try {
                    bArrZze = ((zzZ4B) zzz4c).zzf(byteArray, byteArray.length);
                } catch (zzZ5D e2) {
                    throw new zzZ("unable to decrypt block", e2);
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new zzZ("unable to decrypt block", e3);
                }
            } else {
                try {
                    bArrZze = this.zzVVl.zzh(byteArray, byteArray.length);
                } catch (zzZ5B e4) {
                    throw new zzZ("unable to decrypt block", e4);
                } catch (ArrayIndexOutOfBoundsException e5) {
                    throw new zzZ("unable to decrypt block", e5);
                }
            }
            Arrays.fill(byteArray, (byte) 0);
            this.zzVVo.zzXBd();
            return bArrZze;
        } catch (Throwable th) {
            if (byteArray != null) {
                Arrays.fill(byteArray, (byte) 0);
                this.zzVVo.zzXBd();
            }
            throw th;
        }
    }

    private void zzZ(Set<zzZ5W> set, OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        for (zzZ5W zzz5w : set) {
            if (zzz5w.getName().endsWith("OAEP")) {
                this.zzVW6.add(zzz5w);
            }
        }
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        if (zzYNC.zzVOz.get(mGF1ParameterSpec.getDigestAlgorithm()) == null) {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
        this.zzVVy = oAEPParameterSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Class zzwx(String str) {
        try {
            return zzYQA.class.getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException, IOException {
        if (bArr != null) {
            this.zzVVo.write(bArr, i, i2);
        }
        zzXBA();
        return zzXBz();
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof RSAKey) {
            return ((RSAKey) key).getModulus().bitLength();
        }
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not an valid key!");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        try {
            return this.zzVVr.zzXGI();
        } catch (NullPointerException unused) {
            throw new IllegalStateException("Single block Cipher not initialised");
        }
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.zzVW3 == null && this.zzVVn != null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("OAEP", this.zzVWk);
                this.zzVW3 = algorithmParameters;
                algorithmParameters.init(this.zzVVy);
            } catch (Exception e) {
                throw new IllegalStateException(e.toString(), e);
            }
        }
        return this.zzVW3;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, final AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        zzZ5V zzz5vZzY;
        Class cls;
        final zzZ5W next = this.zzVW6.size() == 1 ? this.zzVW6.iterator().next() : this.zzVW9[0];
        zzZ5T zzz5t = this.zzVVt;
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof OAEPParameterSpec) && ((cls = zzVVx) == null || !cls.isAssignableFrom(algorithmParameterSpec.getClass()))) {
            throw new InvalidAlgorithmParameterException("Unknown parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
        }
        if ((key instanceof RSAPublicKey) || (key instanceof DHPublicKey)) {
            if (this.zzVVp && i == 1) {
                throw new InvalidKeyException("Mode 1 requires PrivateKey for encryption");
            }
            zzz5vZzY = this.zzVWs.zzY(next, (PublicKey) key);
        } else {
            if (!(key instanceof RSAPrivateKey) && !(key instanceof DHPrivateKey)) {
                if (key == null) {
                    throw new InvalidKeyException("Null key type passed to single block cipher");
                }
                throw new InvalidKeyException("Unknown key type passed to single block cipher: ".concat(key.getClass().getName()));
            }
            if (this.zzVVq && i == 1) {
                throw new InvalidKeyException("Mode 2 requires PublicKey for encryption");
            }
            zzz5vZzY = this.zzVWr.zzZ(next, (PrivateKey) key);
        }
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.zzVVy = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase(IDevicePopManager.MGF_1) && !oAEPParameterSpec.getMGFAlgorithm().equals(zzZ96.zzWyu.getId())) {
                throw new InvalidAlgorithmParameterException("Unknown mask generation function specified");
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Unkown MGF parameters");
            }
            if (zzYNC.zzVOz.get(oAEPParameterSpec.getDigestAlgorithm()) == null) {
                throw new InvalidAlgorithmParameterException("No match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm());
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            if (zzYNC.zzVOz.get(mGF1ParameterSpec.getDigestAlgorithm()) == null) {
                throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
            }
        } else if (algorithmParameterSpec != null) {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: com.aspose.words.internal.zzYQA.2
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    if (zzYQA.zzVVx == null) {
                        return null;
                    }
                    zzYQA.zzVVx.isAssignableFrom(algorithmParameterSpec.getClass());
                    return null;
                }
            });
        }
        if (secureRandom == null) {
            secureRandom = this.zzVWk.zzXBp();
        }
        this.zzVVn = this.zzVVs.zzW(new zzZ4M() { // from class: com.aspose.words.internal.zzYQA.3
            @Override // com.aspose.words.internal.zzZ4M
            public final zzZ5W zzXGV() {
                return next;
            }
        }).zzY(true, this.zzVVy, secureRandom);
        this.zzVVo.reset();
        if (i == 1) {
            if (this.zzVVw) {
                throw new InvalidParameterException("Cipher available for WRAP_MODE and UNWRAP_MODE only");
            }
            this.zzVVr = (zzZ4C) zzYNC.zzZ(zzz5t.zzZ(zzz5vZzY, this.zzVVn), secureRandom);
            return;
        }
        if (i == 2) {
            if (!this.zzVVw) {
                this.zzVVr = (zzZ4C) zzYNC.zzZ(zzz5t.zzY(zzz5vZzY, this.zzVVn), secureRandom);
                return;
            }
            if (next instanceof zzZ1P) {
                this.zzVVl = this.zzVVv.zzY(zzz5vZzY, this.zzVVn);
            } else {
                try {
                    this.zzVVl = this.zzVVu.zzY(zzz5vZzY, this.zzVVn);
                } catch (ClassCastException unused) {
                    throw new InvalidParameterException("Cipher does not support WRAP_MODE");
                }
            }
            this.zzVVl = (zzZ57) zzYNC.zzZ(this.zzVVl, secureRandom);
            return;
        }
        if (i == 3) {
            if (next instanceof zzZ1P) {
                this.zzVVm = this.zzVVv.zzZ(zzz5vZzY, this.zzVVn);
            } else {
                try {
                    this.zzVVm = this.zzVVu.zzZ(zzz5vZzY, this.zzVVn);
                } catch (ClassCastException unused2) {
                    throw new InvalidParameterException("Cipher does not support WRAP_MODE");
                }
            }
            this.zzVVm = (zzZ54) zzYNC.zzZ(this.zzVVm, secureRandom);
            return;
        }
        if (i != 4) {
            throw new InvalidParameterException(o0Oo0oo.OooO0O0(i, "Unknown opmode ", " passed to single block cipher"));
        }
        if (next instanceof zzZ1P) {
            this.zzVVl = this.zzVVv.zzY(zzz5vZzY, this.zzVVn);
        } else {
            try {
                this.zzVVl = this.zzVVu.zzY(zzz5vZzY, this.zzVVn);
            } catch (ClassCastException unused3) {
                throw new InvalidParameterException("Cipher does not support WRAP_MODE");
            }
        }
        this.zzVVl = (zzZ57) zzYNC.zzZ(this.zzVVl, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String upperCase = zzYGI.toUpperCase(str);
        if (!upperCase.equals("NONE") && !upperCase.equals("ECB")) {
            throw new NoSuchAlgorithmException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("can't support mode ", str));
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = zzYGI.toUpperCase(str);
        HashSet<zzZ5W> hashSet = new HashSet(this.zzVW6);
        this.zzVW6.clear();
        if (upperCase.equals("NOPADDING")) {
            for (zzZ5W zzz5w : hashSet) {
                if (zzz5w.getName().indexOf(47) < 0) {
                    this.zzVW6.add(zzz5w);
                }
            }
        } else if (upperCase.equals("PKCS1PADDING")) {
            for (zzZ5W zzz5w2 : hashSet) {
                if (zzz5w2.getName().endsWith("PKCS1V1.5")) {
                    this.zzVW6.add(zzz5w2);
                }
            }
        } else if (upperCase.equals("OAEPPADDING") || upperCase.equals("OAEPWITHSHA1ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
            zzZ(hashSet, OAEPParameterSpec.DEFAULT);
        } else if (upperCase.equals("OAEPWITHSHA224ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
            zzZ(hashSet, new OAEPParameterSpec("SHA-224", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
        } else if (upperCase.equals("OAEPWITHSHA256ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
            zzZ(hashSet, new OAEPParameterSpec(KeyUtil.HMAC_KEY_HASH_ALGORITHM, IDevicePopManager.MGF_1, MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        } else if (upperCase.equals("OAEPWITHSHA384ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
            zzZ(hashSet, new OAEPParameterSpec("SHA-384", IDevicePopManager.MGF_1, MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
        } else if (upperCase.equals("OAEPWITHSHA512ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
            zzZ(hashSet, new OAEPParameterSpec("SHA-512", IDevicePopManager.MGF_1, MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
        } else if (upperCase.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
            zzZ(hashSet, new OAEPParameterSpec("SHA3-224", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT));
        } else if (upperCase.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
            zzZ(hashSet, new OAEPParameterSpec("SHA3-256", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
        } else if (upperCase.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
            zzZ(hashSet, new OAEPParameterSpec("SHA3-384", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT));
        } else {
            if (!upperCase.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                throw new NoSuchPaddingException(C20593OooO0Oo.OooO0O0("Padding ", str, " unknown."));
            }
            zzZ(hashSet, new OAEPParameterSpec("SHA3-512", IDevicePopManager.MGF_1, new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
        }
        if (this.zzVW6.isEmpty()) {
            throw new NoSuchPaddingException(upperCase.concat(" not found"));
        }
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            return zzYQ9.zzZ(str, i, this.zzVVl.zzh(bArr, bArr.length), this.zzVWk);
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new InvalidKeyException("unwrapping failed", e2);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) throws IOException {
        this.zzVVo.write(bArr, i, i2);
        zzXBA();
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        if (key == null) {
            throw new NullPointerException("Key parameter is null");
        }
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding");
        }
        try {
            return this.zzVVm.zzg(encoded, encoded.length);
        } catch (zzZ4H e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    public static class zzY {
        private Class[] zzVVU;
        private boolean zzVVp;
        private boolean zzVVq;
        private zzYP6 zzVVs;
        private zzZ5T zzVVt;
        private zzZ55 zzVVu;
        private zzZ18 zzVVv;
        private boolean zzVVw;
        private final Map<zzZ5W, zzZ4M> zzVW8;
        private final zzZ5W[] zzVW9;
        private final zzYQ8 zzVWk;
        private zzYP5 zzVWr;
        private zzYNG zzVWs;

        public zzY(zzYQ8 zzyq8, zzZ5W... zzz5wArr) {
            this.zzVVU = new Class[0];
            this.zzVWk = zzyq8;
            this.zzVW8 = new HashMap();
            this.zzVW9 = zzz5wArr;
        }

        public final zzY zzOF(boolean z) {
            this.zzVVw = z;
            return this;
        }

        public final zzY zzV(Class[] clsArr) {
            this.zzVVU = clsArr;
            return this;
        }

        public final zzYQA zzXBv() {
            return new zzYQA(this.zzVWk, this.zzVVq, this.zzVVp, this.zzVVw, this.zzVVU, this.zzVVt, this.zzVVv, this.zzVVu, this.zzVWs, this.zzVWr, this.zzVVs, this.zzVW8, this.zzVW9);
        }

        public final zzY zzXBw() {
            this.zzVVp = true;
            return this;
        }

        public final zzY zzXBx() {
            this.zzVVq = true;
            return this;
        }

        public final zzY zzZ(zzZ18 zzz18) {
            this.zzVVt = null;
            this.zzVVv = zzz18;
            return this;
        }

        public final zzY zzZ(zzZ5T zzz5t, zzZ55 zzz55) {
            this.zzVVt = zzz5t;
            this.zzVVu = zzz55;
            return this;
        }

        public final zzY zzZ(zzYNG zzyng) {
            this.zzVWs = zzyng;
            return this;
        }

        public zzY(zzYQ8 zzyq8, zzZ4M... zzz4mArr) {
            this.zzVVU = new Class[0];
            this.zzVWk = zzyq8;
            HashMap map = new HashMap(1);
            this.zzVW8 = map;
            this.zzVW9 = new zzZ5W[]{zzz4mArr[0].zzXGV()};
            map.put(zzz4mArr[0].zzXGV(), zzz4mArr[0]);
        }

        public final zzY zzZ(zzYP5 zzyp5) {
            this.zzVWr = zzyp5;
            return this;
        }

        public final zzY zzZ(zzYP6 zzyp6) {
            this.zzVVs = zzyp6;
            return this;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        this.zzVVo.write(bArr, i, i2);
        zzXBA();
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            if (bArr != null) {
                this.zzVVo.write(bArr, i, i2);
            }
            zzXBA();
            byte[] bArrZzXBz = zzXBz();
            for (int i4 = 0; i4 != bArrZzXBz.length; i4++) {
                bArr2[i3 + i4] = bArrZzXBz[i4];
            }
            Arrays.fill(bArrZzXBz, (byte) 0);
            return bArrZzXBz.length;
        }
        throw new ShortBufferException("Not enough space for output");
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
            } catch (InvalidParameterSpecException e) {
                throw new InvalidAlgorithmParameterException("Cannot recognize parameters: " + e.toString(), e);
            }
        } else {
            parameterSpec = null;
        }
        this.zzVW3 = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException("Eeeek! " + e.toString(), e);
        }
    }
}
