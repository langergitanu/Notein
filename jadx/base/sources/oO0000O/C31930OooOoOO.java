package oO0000O;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import oO00000.C31906OooO0Oo;
import oO00000o.C31909OooO0o0;
import oO0000O.OooOo;

/* JADX INFO: renamed from: oO0000O.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31930OooOoOO extends SignatureSpi {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> f113868OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f113869OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f113870OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOo.OooO0O0 f113871OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Signature f113872OooO0o0;

    public C31930OooOoOO(oO00000.OooO00o oooO00o, HashMap map, String str) throws NoSuchPaddingException {
        this.f113868OooO00o = oooO00o;
        this.f113869OooO0O0 = map;
        this.f113870OooO0OO = str;
    }

    public final Signature OooO00o(boolean z) throws NoSuchAlgorithmException {
        if (this.f113872OooO0o0 == null) {
            Signature signature = Signature.getInstance(this.f113870OooO0OO);
            this.f113872OooO0o0 = signature;
            if (z) {
                try {
                    signature.initSign(((KeyPair) this.f113869OooO0O0.get(oO00000o.OooO0OO.RSA2048)).getPrivate());
                } catch (InvalidKeyException unused) {
                    throw new NoSuchAlgorithmException();
                }
            }
        }
        return this.f113872OooO0o0;
    }

    @Override // java.security.SignatureSpi
    public final Object engineGetParameter(String str) throws InvalidParameterException {
        Signature signature = this.f113872OooO0o0;
        if (signature != null) {
            return signature.getParameter(str);
        }
        throw new InvalidParameterException("Not initialized");
    }

    @Override // java.security.SignatureSpi
    public final AlgorithmParameters engineGetParameters() {
        Signature signature = this.f113872OooO0o0;
        if (signature != null) {
            return signature.getParameters();
        }
        throw new InvalidParameterException("Not initialized");
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof OooOo.OooO0O0)) {
            throw new InvalidKeyException("Unsupported key type");
        }
        OooOo.OooO0O0 oooO0O0 = (OooOo.OooO0O0) privateKey;
        this.f113871OooO0Oo = oooO0O0;
        try {
            OooO00o(false).initSign(((KeyPair) this.f113869OooO0O0.get(oooO0O0.f113835OooOo)).getPrivate());
        } catch (NoSuchAlgorithmException e) {
            throw new InvalidKeyException(e);
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        throw new InvalidKeyException("Can only be used for signing.");
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(String str, Object obj) throws InvalidParameterException {
        try {
            OooO00o(true).setParameter(str, obj);
        } catch (NoSuchAlgorithmException unused) {
            throw new InvalidParameterException("Not initialized");
        }
    }

    @Override // java.security.SignatureSpi
    public final byte[] engineSign() throws SignatureException {
        if (this.f113871OooO0Oo == null || this.f113872OooO0o0 == null) {
            throw new SignatureException("Not initialized");
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
            cipher.init(1, ((KeyPair) this.f113869OooO0O0.get(this.f113871OooO0Oo.f113835OooOo)).getPublic());
            return this.f113871OooO0Oo.OooO0O0(this.f113868OooO00o, cipher.doFinal(this.f113872OooO0o0.sign()));
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte b) throws SignatureException {
        Signature signature = this.f113872OooO0o0;
        if (signature == null) {
            throw new SignatureException("Not initialized");
        }
        signature.update(b);
    }

    @Override // java.security.SignatureSpi
    public final boolean engineVerify(byte[] bArr) throws SignatureException {
        throw new SignatureException("Not initialized");
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        try {
            OooO00o(true).setParameter(algorithmParameterSpec);
        } catch (NoSuchAlgorithmException unused) {
            throw new InvalidParameterException("Not initialized");
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        Signature signature = this.f113872OooO0o0;
        if (signature != null) {
            signature.update(bArr, i, i2);
            return;
        }
        throw new SignatureException("Not initialized");
    }
}
