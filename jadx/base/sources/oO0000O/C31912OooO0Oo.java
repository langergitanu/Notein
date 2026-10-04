package oO0000O;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import oO00000.C31906OooO0Oo;
import oO00000o.C31909OooO0o0;
import oO0000O.OooOo;

/* JADX INFO: renamed from: oO0000O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31912OooO0Oo extends KeyAgreementSpi {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> f113796OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOo.OooO00o f113797OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ECPublicKey f113798OooO0OO;

    public C31912OooO0Oo(oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> oooO00o) {
        this.f113796OooO00o = oooO00o;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public final Key engineDoPhase(Key key, boolean z) throws IllegalStateException, InvalidKeyException {
        if (this.f113797OooO0O0 == null) {
            throw new IllegalStateException("KeyAgreement not initialized");
        }
        if (!z) {
            throw new IllegalStateException("Multiple phases not supported");
        }
        if (!(key instanceof PublicKey) || oO00000o.OooO0OO.OooO00o(key) != this.f113797OooO0O0.f113835OooOo) {
            throw new InvalidKeyException("Wrong key type");
        }
        this.f113798OooO0OO = (ECPublicKey) key;
        return null;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public final byte[] engineGenerateSecret() throws IllegalStateException {
        ECPublicKey eCPublicKey;
        OooOo.OooO00o oooO00o = this.f113797OooO0O0;
        if (oooO00o == null || (eCPublicKey = this.f113798OooO0OO) == null) {
            throw new IllegalStateException("Not initialized with both private and public keys");
        }
        try {
            try {
                return oooO00o.OooO0OO(this.f113796OooO00o, eCPublicKey);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        } finally {
            this.f113798OooO0OO = null;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public final void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(key instanceof OooOo.OooO00o)) {
            throw new InvalidKeyException("Key must be instance of PivPrivateKey");
        }
        this.f113797OooO0O0 = (OooOo.OooO00o) key;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public final void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        engineInit(key, secureRandom);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public final int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        byte[] bArrEngineGenerateSecret = engineGenerateSecret();
        try {
            System.arraycopy(bArrEngineGenerateSecret, 0, bArr, i, bArrEngineGenerateSecret.length);
            return bArrEngineGenerateSecret.length;
        } catch (IndexOutOfBoundsException unused) {
            throw new ShortBufferException();
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public final SecretKey engineGenerateSecret(String str) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        throw new IllegalStateException("Not supported");
    }
}
