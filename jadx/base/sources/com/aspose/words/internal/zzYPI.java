package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import com.aspose.words.internal.zzYMG;
import com.aspose.words.internal.zzYMI;
import com.aspose.words.internal.zzYMJ;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.ShortBufferException;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPI extends CipherSpi {
    private RSAPrivateKey zzVUm;
    private RSAPublicKey zzVUn;
    private zzYMG zzVUo;
    private SecretKeyFactory zzVUp;
    private AlgorithmParameters zzVW3;
    private final zzYQ8 zzVWk;
    private final String zzVZp;
    private SecureRandom zzWk5;

    public zzYPI(zzYQ8 zzyq8, String str) throws NoSuchAlgorithmException {
        this.zzVWk = zzyq8;
        this.zzVZp = str;
        this.zzVUp = SecretKeyFactory.getInstance("RSA-KAS-KEM", zzyq8);
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetKeySize(Key key) {
        if (key instanceof RSAKey) {
            return ((RSAKey) key).getModulus().bitLength();
        }
        throw new IllegalArgumentException("not an valid key!");
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public final AlgorithmParameters engineGetParameters() {
        if (this.zzVW3 == null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.zzVZp, this.zzVWk);
                this.zzVW3 = algorithmParameters;
                algorithmParameters.init(this.zzVUo);
            } catch (Exception e) {
                throw new IllegalStateException(e.toString(), e);
            }
        }
        return this.zzVW3;
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
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
            int iBitLength = (this.zzVUm.getModulus().bitLength() + 7) / 8;
            byte[] bArr2 = new byte[iBitLength];
            System.arraycopy(bArr, 0, bArr2, 0, iBitLength);
            zzYRG zzyrg = (zzYRG) this.zzVUp.generateSecret(new zzYMJ.zzZ(this.zzVUm, bArr2, this.zzVUo.zzXA0(), this.zzVUo.getKeySize(), this.zzVUo.zzXzW()).zzR(this.zzVUo.zzXzV()).zzX(this.zzVUo.getParameterSpec()).zzXA2());
            Cipher cipher = Cipher.getInstance(this.zzVUo.zzXA0(), this.zzVWk);
            cipher.init(4, zzyrg, this.zzWk5);
            int length = bArr.length - iBitLength;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, iBitLength, bArr3, 0, length);
            return cipher.unwrap(bArr3, str, i);
        } catch (IllegalArgumentException e) {
            throw new NoSuchAlgorithmException("Unable to generate KTS secret: " + e.getMessage());
        } catch (InvalidKeyException e2) {
            throw e2;
        } catch (GeneralSecurityException e3) {
            if (e3 instanceof NoSuchAlgorithmException) {
                throw ((NoSuchAlgorithmException) e3);
            }
            throw new NoSuchAlgorithmException("Unable to generate KTS secret: " + e3.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineUpdate(byte[] bArr, int i, int i2) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        if (key.getEncoded() == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            zzYRG zzyrg = (zzYRG) this.zzVUp.generateSecret(new zzYMI.zzZ(this.zzVUn, this.zzVUo.zzXA0(), this.zzVUo.getKeySize(), this.zzVUo.zzXzW()).zzQ(this.zzVUo.zzXzV()).zzw(this.zzWk5).zzW(this.zzVUo.getParameterSpec()).zzXA1());
            Cipher cipher = Cipher.getInstance(this.zzVUo.zzXA0(), this.zzVWk);
            cipher.init(3, zzyrg, this.zzWk5);
            return zzYGU.zzn(zzyrg.zzXGK(), cipher.wrap(key));
        } catch (IllegalArgumentException e) {
            throw new IllegalBlockSizeException("Unable to generate KTS secret: " + e.getMessage());
        } catch (InvalidKeyException e2) {
            throw e2;
        } catch (GeneralSecurityException e3) {
            throw new IllegalBlockSizeException("Unable to generate KTS secret: " + e3.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public final int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public final int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (secureRandom == null) {
            this.zzWk5 = this.zzVWk.zzXBp();
        }
        if (algorithmParameterSpec == null) {
            this.zzVUo = new zzYMG.zzZ(AES256KeyLoader.AES_ALGORITHM, 128).zzXzU();
        } else if (algorithmParameterSpec instanceof zzYMG) {
            this.zzVUo = (zzYMG) algorithmParameterSpec;
        } else {
            throw new InvalidAlgorithmParameterException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzVZp, " can only accept KTSParameterSpec"));
        }
        if (i == 3) {
            if (key instanceof RSAPublicKey) {
                this.zzVUn = (RSAPublicKey) key;
                return;
            }
            throw new InvalidKeyException("Only an RSA public key can be used for wrapping");
        }
        if (i == 4) {
            if (key instanceof RSAPrivateKey) {
                this.zzVUm = (RSAPrivateKey) key;
                return;
            }
            throw new InvalidKeyException("Only an RSA private key can be used for unwrapping");
        }
        throw new InvalidParameterException("Cipher only valid for wrapping/unwrapping");
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(zzYMG.class);
            } catch (Exception unused) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i, key, parameterSpec, this.zzWk5);
    }
}
