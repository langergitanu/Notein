package com.microsoft.identity.common.java.crypto;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.exception.ClientException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class RawKeyAccessor implements IKeyAccessor {
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();
    private final String mAlias;
    private final byte[] mKey;
    private final CryptoSuite mSuite;

    public static class RawKeyAccessorBuilder {
        private String alias;
        private byte[] key;
        private CryptoSuite suite;

        public RawKeyAccessorBuilder alias(String str) {
            this.alias = str;
            return this;
        }

        public RawKeyAccessor build() {
            return new RawKeyAccessor(this.suite, this.key, this.alias);
        }

        public RawKeyAccessorBuilder key(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("key is marked non-null but is null");
            }
            this.key = bArr;
            return this;
        }

        public RawKeyAccessorBuilder suite(CryptoSuite cryptoSuite) {
            if (cryptoSuite == null) {
                throw new NullPointerException("suite is marked non-null but is null");
            }
            this.suite = cryptoSuite;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RawKeyAccessor.RawKeyAccessorBuilder(suite=");
            sb.append(this.suite);
            sb.append(", key=");
            sb.append(Arrays.toString(this.key));
            sb.append(", alias=");
            return OooO00o.OooO0OO(sb, this.alias, ")");
        }
    }

    public RawKeyAccessor(CryptoSuite cryptoSuite, byte[] bArr, String str) {
        if (cryptoSuite == null) {
            throw new NullPointerException("suite is marked non-null but is null");
        }
        if (bArr == null) {
            throw new NullPointerException("key is marked non-null but is null");
        }
        this.mSuite = cryptoSuite;
        this.mKey = bArr;
        this.mAlias = str;
    }

    public static RawKeyAccessorBuilder builder() {
        return new RawKeyAccessorBuilder();
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public byte[] decrypt(byte[] bArr) throws ClientException {
        String str;
        if (bArr == null) {
            throw new NullPointerException("ciphertext is marked non-null but is null");
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.mKey, this.mSuite.cipher().name());
            Cipher cipher = Cipher.getInstance(secretKeySpec.getAlgorithm());
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr, 0, 12));
            return cipher.doFinal(Arrays.copyOfRange(bArr, 12, bArr.length));
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            str = ClientException.INVALID_ALG_PARAMETER;
            throw new ClientException(str, e.getMessage(), e);
        } catch (InvalidKeyException e2) {
            e = e2;
            str = ClientException.INVALID_KEY;
            throw new ClientException(str, e.getMessage(), e);
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            str = "no_such_algorithm";
            throw new ClientException(str, e.getMessage(), e);
        } catch (BadPaddingException e4) {
            e = e4;
            str = ClientException.BAD_PADDING;
            throw new ClientException(str, e.getMessage(), e);
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            str = ClientException.INVALID_BLOCK_SIZE;
            throw new ClientException(str, e.getMessage(), e);
        } catch (NoSuchPaddingException e6) {
            e = e6;
            str = ClientException.NO_SUCH_PADDING;
            throw new ClientException(str, e.getMessage(), e);
        }
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public byte[] encrypt(byte[] bArr) throws ClientException {
        String str;
        if (bArr == null) {
            throw new NullPointerException("plaintext is marked non-null but is null");
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.mKey, this.mSuite.cipher().name());
            Cipher cipher = Cipher.getInstance(secretKeySpec.getAlgorithm());
            byte[] bArr2 = new byte[12];
            SECURE_RANDOM.nextBytes(bArr2);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            byte[] bArrUpdate = cipher.update(bArr);
            byte[] bArrDoFinal = cipher.doFinal();
            byte[] bArr3 = new byte[bArrUpdate.length + 12 + bArrDoFinal.length];
            System.arraycopy(bArr2, 0, bArr3, 0, 12);
            System.arraycopy(bArrUpdate, 0, bArr3, 12, bArrUpdate.length);
            System.arraycopy(bArrDoFinal, 0, bArr3, 12 + bArrUpdate.length, bArrDoFinal.length);
            return bArr3;
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            str = ClientException.INVALID_ALG_PARAMETER;
            throw new ClientException(str, e.getMessage());
        } catch (InvalidKeyException e2) {
            e = e2;
            str = ClientException.INVALID_KEY;
            throw new ClientException(str, e.getMessage());
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            str = "no_such_algorithm";
            throw new ClientException(str, e.getMessage());
        } catch (BadPaddingException e4) {
            e = e4;
            str = ClientException.BAD_PADDING;
            throw new ClientException(str, e.getMessage());
        } catch (IllegalBlockSizeException e5) {
            e = e5;
            str = ClientException.INVALID_BLOCK_SIZE;
            throw new ClientException(str, e.getMessage());
        } catch (NoSuchPaddingException e6) {
            e = e6;
            str = ClientException.NO_SUCH_PADDING;
            throw new ClientException(str, e.getMessage());
        }
    }

    public byte[] generateDerivedKey(byte[] bArr, byte[] bArr2) throws ClientException {
        if (bArr2 == null) {
            throw new NullPointerException("ctx is marked non-null but is null");
        }
        try {
            return new SP800108KeyGen(new DefaultCryptoFactory()).generateDerivedKey(this.mKey, bArr, bArr2);
        } catch (IOException e) {
            throw new ClientException("io_error", e.getMessage(), e);
        } catch (InvalidKeyException e2) {
            throw new ClientException(ClientException.INVALID_KEY, e2.getMessage(), e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new ClientException("no_such_algorithm", e3.getMessage(), e3);
        }
    }

    public String getAlias() {
        return this.mAlias;
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public Certificate[] getCertificateChain() {
        return null;
    }

    public byte[] getKey() {
        return this.mKey;
    }

    public byte[] getRawKey() {
        byte[] bArr = this.mKey;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public SecureHardwareState getSecureHardwareState() {
        return SecureHardwareState.FALSE;
    }

    public CryptoSuite getSuite() {
        return this.mSuite;
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public byte[] getThumbprint() throws ClientException {
        String str;
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.mKey, this.mSuite.cipher().name());
        try {
            Cipher cipher = Cipher.getInstance(secretKeySpec.getAlgorithm());
            return MessageDigest.getInstance("SHA256").digest(cipher.doFinal((secretKeySpec.getAlgorithm() + cipher.getBlockSize() + cipher.getParameters()).getBytes(AuthenticationConstants.CHARSET_UTF8)));
        } catch (NoSuchAlgorithmException e) {
            e = e;
            str = "no_such_algorithm";
            throw new ClientException(str, e.getMessage(), e);
        } catch (BadPaddingException e2) {
            e = e2;
            str = ClientException.BAD_PADDING;
            throw new ClientException(str, e.getMessage(), e);
        } catch (IllegalBlockSizeException e3) {
            e = e3;
            str = ClientException.INVALID_BLOCK_SIZE;
            throw new ClientException(str, e.getMessage(), e);
        } catch (NoSuchPaddingException e4) {
            e = e4;
            str = ClientException.NO_SUCH_PADDING;
            throw new ClientException(str, e.getMessage(), e);
        }
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public byte[] sign(byte[] bArr) throws ClientException {
        String str;
        if (bArr == null) {
            throw new NullPointerException("text is marked non-null but is null");
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.mKey, this.mSuite.cipher().name());
            Mac mac = Mac.getInstance(this.mSuite.macName());
            mac.init(secretKeySpec);
            return mac.doFinal(bArr);
        } catch (InvalidKeyException e) {
            e = e;
            str = ClientException.INVALID_KEY;
            throw new ClientException(str, e.getMessage());
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            str = "no_such_algorithm";
            throw new ClientException(str, e.getMessage());
        }
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public boolean verify(byte[] bArr, byte[] bArr2) throws ClientException {
        if (bArr == null) {
            throw new NullPointerException("text is marked non-null but is null");
        }
        if (bArr2 != null) {
            return Arrays.equals(bArr2, sign(bArr));
        }
        throw new NullPointerException("signature is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public IKeyAccessor generateDerivedKey(byte[] bArr, byte[] bArr2, CryptoSuite cryptoSuite) throws ClientException {
        if (bArr == null) {
            throw new NullPointerException("label is marked non-null but is null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("ctx is marked non-null but is null");
        }
        if (cryptoSuite != null) {
            try {
                return new RawKeyAccessor(cryptoSuite, new SP800108KeyGen(new DefaultCryptoFactory()).generateDerivedKey(this.mKey, bArr, bArr2), null);
            } catch (IOException e) {
                throw new ClientException("io_error", e.getMessage(), e);
            } catch (InvalidKeyException e2) {
                throw new ClientException(ClientException.INVALID_KEY, e2.getMessage(), e2);
            } catch (NoSuchAlgorithmException e3) {
                throw new ClientException("no_such_algorithm", e3.getMessage(), e3);
            }
        }
        throw new NullPointerException("suite is marked non-null but is null");
    }
}
