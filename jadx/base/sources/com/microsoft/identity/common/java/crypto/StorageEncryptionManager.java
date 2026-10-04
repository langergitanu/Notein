package com.microsoft.identity.common.java.crypto;

import Oooo0oO.o0Oo0oo;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.controllers.ExceptionAdapter;
import com.microsoft.identity.common.java.crypto.key.AbstractSecretKeyLoader;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.exception.ErrorStrings;
import com.microsoft.identity.common.java.logging.Logger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import oO0000oO.C31932OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public abstract class StorageEncryptionManager implements IKeyAccessor {
    private static final String ENCODE_VERSION = "E1";
    public static final int IV_LENGTH = 16;
    public static final int KEY_IDENTIFIER_LENGTH = 4;
    public static final int MAC_DIGEST_LENGTH = 32;
    private static final String TAG = "StorageEncryptionManager#";
    private final IVGenerator mGenerator;

    public StorageEncryptionManager() {
        this.mGenerator = new IVGenerator() { // from class: com.microsoft.identity.common.java.crypto.StorageEncryptionManager.1
            final SecureRandom mRandom = new SecureRandom();

            @Override // com.microsoft.identity.common.java.crypto.IVGenerator
            public byte[] generate() {
                byte[] bArr = new byte[16];
                this.mRandom.nextBytes(bArr);
                return bArr;
            }
        };
    }

    private void assertHMac(byte[] bArr, int i, int i2, byte[] bArr2) throws ClientException {
        if (bArr2.length != i2 - i) {
            throw new ClientException(ClientException.UNEXPECTED_HMAC_LENGTH);
        }
        byte b = 0;
        for (int i3 = i; i3 < i2; i3++) {
            b = (byte) (b | (bArr2[i3 - i] ^ bArr[i3]));
        }
        if (b != 0) {
            throw new ClientException(ClientException.HMAC_MISMATCH);
        }
    }

    private byte[] decryptWithSecretKey(byte[] bArr, AbstractSecretKeyLoader abstractSecretKeyLoader) throws ClientException {
        String str;
        if (abstractSecretKeyLoader == null) {
            throw new NullPointerException("keyLoader is marked non-null but is null");
        }
        try {
            SecretKey key = abstractSecretKeyLoader.getKey();
            SecretKey hMacKey = KeyUtil.getHMacKey(key);
            int length = bArr.length - 48;
            int length2 = bArr.length - 32;
            int length3 = abstractSecretKeyLoader.getKeyTypeIdentifier().getBytes(AuthenticationConstants.ENCODING_UTF8).length;
            Cipher cipher = Cipher.getInstance(abstractSecretKeyLoader.getCipherAlgorithm());
            Mac mac = Mac.getInstance(KeyUtil.HMAC_ALGORITHM);
            mac.init(hMacKey);
            mac.update(bArr, 0, length2);
            assertHMac(bArr, length2, bArr.length, mac.doFinal());
            cipher.init(2, key, new IvParameterSpec(bArr, length, 16));
            return cipher.doFinal(bArr, length3, length - length3);
        } catch (ClientException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            e = e2;
            str = ClientException.DATA_MALFORMED;
            throw new ClientException(str, e.getMessage(), e);
        } catch (InvalidAlgorithmParameterException e3) {
            e = e3;
            str = ClientException.INVALID_ALG_PARAMETER;
            throw new ClientException(str, e.getMessage(), e);
        } catch (InvalidKeyException e4) {
            e = e4;
            str = ClientException.INVALID_KEY;
            throw new ClientException(str, e.getMessage(), e);
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            str = "no_such_algorithm";
            throw new ClientException(str, e.getMessage(), e);
        } catch (BadPaddingException e6) {
            e = e6;
            str = ClientException.BAD_PADDING;
            throw new ClientException(str, e.getMessage(), e);
        } catch (IllegalBlockSizeException e7) {
            e = e7;
            str = ClientException.INVALID_BLOCK_SIZE;
            throw new ClientException(str, e.getMessage(), e);
        } catch (NoSuchPaddingException e8) {
            e = e8;
            str = ClientException.NO_SUCH_PADDING;
            throw new ClientException(str, e.getMessage(), e);
        } catch (Throwable th) {
            e = th;
            str = ClientException.UNKNOWN_CRYPTO_ERROR;
            throw new ClientException(str, e.getMessage(), e);
        }
    }

    private static int getEncodeVersionLengthFromCipherText(String str) {
        if (str != null) {
            return str.charAt(0) - 'a';
        }
        throw new NullPointerException("cipherText is marked non-null but is null");
    }

    private char getEncodeVersionLengthPrefix() {
        return (char) 99;
    }

    public static String getKeyIdentifierFromCipherText(byte[] bArr) {
        try {
            return new String(stripEncodeVersionFromCipherText(bArr), 0, 4, AuthenticationConstants.ENCODING_UTF8);
        } catch (Exception e) {
            Logger.verbose(OooO00o.OooO0OO(new StringBuilder(), TAG, ":getKeyIdentifierFromCipherText"), e.getMessage());
            return "EXCEPTION OCCURRED GETTING KEY IDENTIFIER";
        }
    }

    private byte[] prefixWithEncodeVersion(byte[] bArr) {
        return (getEncodeVersionLengthPrefix() + ENCODE_VERSION + C31932OooO00o.OooO0OO(bArr, 2)).getBytes(AuthenticationConstants.ENCODING_UTF8);
    }

    private static byte[] stripEncodeVersionFromCipherText(byte[] bArr) throws ClientException {
        if (bArr.length < 1) {
            throw new IllegalArgumentException("Input blob is null or length < 1");
        }
        String str = new String(bArr, AuthenticationConstants.ENCODING_UTF8);
        int encodeVersionLengthFromCipherText = getEncodeVersionLengthFromCipherText(str);
        validateEncodeVersion(str, encodeVersionLengthFromCipherText);
        return C31932OooO00o.OooO00o(str.substring(encodeVersionLengthFromCipherText + 1), 0);
    }

    private static void validateEncodeVersion(String str, int i) throws ClientException {
        if (str == null) {
            throw new NullPointerException("cipherString is marked non-null but is null");
        }
        if (i <= 0) {
            throw new ClientException(ClientException.DATA_MALFORMED, o0Oo0oo.OooO0O0(i, "Encode version length: '", "' is not valid, it must be greater of equal to 0"));
        }
        int i2 = i + 1;
        if (i2 > str.length()) {
            throw new ClientException(ClientException.DATA_MALFORMED, "Length of encode version string (plus the length character) is longer than the CipherString itself. The data is malformed.");
        }
        if (!str.substring(1, i2).equals(ENCODE_VERSION)) {
            throw new ClientException(ClientException.DATA_MALFORMED, "Unsupported encode version received. Encode version supported is: 'E1'");
        }
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public byte[] decrypt(byte[] bArr) throws ClientException {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":decrypt");
        try {
            byte[] bArrStripEncodeVersionFromCipherText = stripEncodeVersionFromCipherText(bArr);
            List<AbstractSecretKeyLoader> keyLoaderForDecryption = getKeyLoaderForDecryption(bArr);
            if (keyLoaderForDecryption.size() == 0) {
                throw new IllegalStateException("Cannot find a matching Keyloader.");
            }
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractSecretKeyLoader> it = keyLoaderForDecryption.iterator();
            while (it.hasNext()) {
                AbstractSecretKeyLoader next = it.next();
                try {
                    return decryptWithSecretKey(bArrStripEncodeVersionFromCipherText, next);
                } catch (Throwable th) {
                    Logger.warn(strOooO0OO, "Failed to decrypt with key:" + next.getAlias() + " thumbprint : " + KeyUtil.getKeyThumbPrint(next));
                    arrayList.add(th);
                }
            }
            if (arrayList.size() == 1) {
                throw ExceptionAdapter.clientExceptionFromException((Throwable) arrayList.get(0));
            }
            ClientException clientException = new ClientException(ErrorStrings.DECRYPTION_FAILED, "Tried all decryption keys and decryption still fails.");
            clientException.getSuppressedException().addAll(arrayList);
            throw clientException;
        } catch (ClientException e) {
            Logger.verbose(strOooO0OO, "Failed to strip encode version from cipherText, string might not be encrypted. Exception: ", e.getMessage());
            return bArr;
        }
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public byte[] encrypt(byte[] bArr) throws ClientException {
        String str;
        AbstractSecretKeyLoader keyLoaderForEncryption = getKeyLoaderForEncryption();
        if (keyLoaderForEncryption == null) {
            throw new IllegalStateException("Cannot find a matching Keyloader.");
        }
        try {
            SecretKey key = keyLoaderForEncryption.getKey();
            SecretKey hMacKey = KeyUtil.getHMacKey(key);
            byte[] bytes = keyLoaderForEncryption.getKeyTypeIdentifier().getBytes(AuthenticationConstants.ENCODING_UTF8);
            byte[] bArrGenerate = this.mGenerator.generate();
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrGenerate);
            Cipher cipher = Cipher.getInstance(keyLoaderForEncryption.getCipherAlgorithm());
            Mac mac = Mac.getInstance(KeyUtil.HMAC_ALGORITHM);
            cipher.init(1, key, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            mac.init(hMacKey);
            mac.update(bytes);
            mac.update(bArrDoFinal);
            mac.update(bArrGenerate);
            byte[] bArrDoFinal2 = mac.doFinal();
            byte[] bArr2 = new byte[bytes.length + bArrDoFinal.length + bArrGenerate.length + bArrDoFinal2.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArrDoFinal, 0, bArr2, bytes.length, bArrDoFinal.length);
            System.arraycopy(bArrGenerate, 0, bArr2, bytes.length + bArrDoFinal.length, bArrGenerate.length);
            System.arraycopy(bArrDoFinal2, 0, bArr2, bytes.length + bArrDoFinal.length + bArrGenerate.length, bArrDoFinal2.length);
            Logger.verbose(TAG + ":encrypt", "Finished encryption");
            return prefixWithEncodeVersion(bArr2);
        } catch (ClientException e) {
            throw e;
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            str = ClientException.INVALID_ALG_PARAMETER;
            throw new ClientException(str, e.getMessage(), e);
        } catch (InvalidKeyException e3) {
            e = e3;
            str = ClientException.INVALID_KEY;
            throw new ClientException(str, e.getMessage(), e);
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            str = "no_such_algorithm";
            throw new ClientException(str, e.getMessage(), e);
        } catch (BadPaddingException e5) {
            e = e5;
            str = ClientException.BAD_PADDING;
            throw new ClientException(str, e.getMessage(), e);
        } catch (IllegalBlockSizeException e6) {
            e = e6;
            str = ClientException.INVALID_BLOCK_SIZE;
            throw new ClientException(str, e.getMessage(), e);
        } catch (NoSuchPaddingException e7) {
            e = e7;
            str = ClientException.NO_SUCH_PADDING;
            throw new ClientException(str, e.getMessage(), e);
        } catch (Throwable th) {
            e = th;
            str = ClientException.UNKNOWN_CRYPTO_ERROR;
            throw new ClientException(str, e.getMessage(), e);
        }
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public IKeyAccessor generateDerivedKey(byte[] bArr, byte[] bArr2, CryptoSuite cryptoSuite) {
        throw new UnsupportedOperationException();
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public Certificate[] getCertificateChain() {
        throw new UnsupportedOperationException();
    }

    public abstract List<AbstractSecretKeyLoader> getKeyLoaderForDecryption(byte[] bArr) throws ClientException;

    public abstract AbstractSecretKeyLoader getKeyLoaderForEncryption() throws ClientException;

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public SecureHardwareState getSecureHardwareState() {
        return SecureHardwareState.FALSE;
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public byte[] getThumbprint() {
        throw new UnsupportedOperationException();
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public byte[] sign(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.microsoft.identity.common.java.crypto.IKeyAccessor
    public boolean verify(byte[] bArr, byte[] bArr2) {
        throw new UnsupportedOperationException();
    }

    public StorageEncryptionManager(IVGenerator iVGenerator) {
        if (iVGenerator != null) {
            this.mGenerator = iVGenerator;
            return;
        }
        throw new NullPointerException("generator is marked non-null but is null");
    }
}
