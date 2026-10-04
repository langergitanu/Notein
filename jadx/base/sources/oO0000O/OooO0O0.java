package oO0000O;

import OooOoOO.C20519OooO0Oo;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import oO00000.C31906OooO0Oo;
import oO00000o.C31909OooO0o0;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 extends CipherSpi {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f113784OooO0oo = C34354OooO0Oo.OooO0O0(OooO0O0.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> f113785OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f113786OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOo f113788OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f113789OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f113790OooO0o0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ByteArrayOutputStream f113787OooO0OO = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f113791OooO0oO = -1;

    public OooO0O0(oO00000.OooO00o oooO00o, HashMap map) throws NoSuchPaddingException {
        this.f113785OooO00o = oooO00o;
        this.f113786OooO0O0 = map;
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException {
        if (this.f113788OooO0Oo == null) {
            throw new IllegalStateException("Cipher not initialized");
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f113787OooO0OO;
        if (i2 > 0) {
            byteArrayOutputStream.write(bArr, i, i2);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            KeyPair keyPair = (KeyPair) this.f113786OooO0O0.get(this.f113788OooO0Oo.f113835OooOo);
            Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
            cipher.init(this.f113791OooO0oO, keyPair.getPublic());
            Cipher cipher2 = Cipher.getInstance("RSA/" + this.f113790OooO0o0 + "/" + this.f113789OooO0o);
            cipher2.init(this.f113791OooO0oO, keyPair.getPrivate());
            int i3 = this.f113791OooO0oO;
            oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> oooO00o = this.f113785OooO00o;
            if (i3 != 1) {
                if (i3 == 2) {
                    return cipher2.doFinal(cipher.doFinal(this.f113788OooO0Oo.OooO0O0(oooO00o, byteArray)));
                }
                throw new UnsupportedOperationException();
            }
            try {
                return this.f113788OooO0Oo.OooO0O0(oooO00o, cipher.doFinal(cipher2.doFinal(byteArray)));
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new IllegalStateException(e);
            }
        } catch (NoSuchPaddingException e2) {
            throw new UnsupportedOperationException("SecurityProvider doesn't support RSA without padding", e2);
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetBlockSize() {
        OooOo oooOo = this.f113788OooO0Oo;
        if (oooOo != null) {
            return oooOo.f113835OooOo.f113744OooOo.f113752OooO0O0 / 8;
        }
        throw new IllegalStateException("Cipher not initialized");
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineGetIV() {
        return new byte[0];
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetOutputSize(int i) {
        return engineGetBlockSize();
    }

    @Override // javax.crypto.CipherSpi
    public final AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        C20519OooO0Oo.OooO0o0(4, f113784OooO0oo, "Engine init: mode={} padding={}", this.f113790OooO0o0, this.f113789OooO0o);
        if (!(key instanceof OooOo)) {
            throw new InvalidKeyException("Unsupported key type");
        }
        if (!AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA.equals(((OooOo) key).getAlgorithm())) {
            throw new InvalidKeyException("Cipher only supports RSA.");
        }
        this.f113788OooO0Oo = (OooOo) key;
        this.f113791OooO0oO = i;
        this.f113787OooO0OO.reset();
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetMode(String str) throws NoSuchAlgorithmException {
        this.f113790OooO0o0 = str;
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetPadding(String str) throws NoSuchPaddingException {
        this.f113789OooO0o = str;
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f113787OooO0OO.write(bArr, i, i2);
        return new byte[0];
    }

    @Override // javax.crypto.CipherSpi
    public final int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f113787OooO0OO.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            engineInit(i, key, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("Cipher must be initialized with params = null");
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            engineInit(i, key, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("Cipher must be initialized with params = null");
    }

    @Override // javax.crypto.CipherSpi
    public final int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i, i2);
        try {
            System.arraycopy(bArrEngineDoFinal, 0, bArr2, i3, bArrEngineDoFinal.length);
            return bArrEngineDoFinal.length;
        } catch (IndexOutOfBoundsException unused) {
            throw new ShortBufferException();
        }
    }
}
