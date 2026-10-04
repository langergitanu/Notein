package oO0000O;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import oO00000.C31906OooO0Oo;
import oO00000o.C31909OooO0o0;
import oO0000O.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0OO extends SignatureSpi {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> f113792OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOo.OooO00o f113793OooO0O0;

    public static class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final MessageDigest f113794OooO0OO;

        public OooO00o(oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> oooO00o, String str) throws NoSuchAlgorithmException {
            super(oooO00o);
            this.f113794OooO0OO = MessageDigest.getInstance(str);
        }

        @Override // oO0000O.OooO0OO
        public final byte[] OooO00o() {
            return this.f113794OooO0OO.digest();
        }

        @Override // oO0000O.OooO0OO
        public final void OooO0O0(byte b) {
            this.f113794OooO0OO.update(b);
        }

        @Override // oO0000O.OooO0OO
        public final void OooO0OO(byte[] bArr, int i, int i2) {
            this.f113794OooO0OO.update(bArr, i, i2);
        }

        @Override // oO0000O.OooO0OO, java.security.SignatureSpi
        public final void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
            super.engineInitSign(privateKey);
            this.f113794OooO0OO.reset();
        }
    }

    public static class OooO0O0 extends OooO0OO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ByteArrayOutputStream f113795OooO0OO;

        public OooO0O0(oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> oooO00o) {
            super(oooO00o);
            this.f113795OooO0OO = new ByteArrayOutputStream();
        }

        @Override // oO0000O.OooO0OO
        public final byte[] OooO00o() {
            return this.f113795OooO0OO.toByteArray();
        }

        @Override // oO0000O.OooO0OO
        public final void OooO0O0(byte b) {
            this.f113795OooO0OO.write(b);
        }

        @Override // oO0000O.OooO0OO
        public final void OooO0OO(byte[] bArr, int i, int i2) {
            this.f113795OooO0OO.write(bArr, i, i2);
        }

        @Override // oO0000O.OooO0OO, java.security.SignatureSpi
        public final void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
            super.engineInitSign(privateKey);
            this.f113795OooO0OO.reset();
        }
    }

    public OooO0OO(oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> oooO00o) {
        this.f113792OooO00o = oooO00o;
    }

    public abstract byte[] OooO00o();

    public abstract void OooO0O0(byte b);

    public abstract void OooO0OO(byte[] bArr, int i, int i2);

    @Override // java.security.SignatureSpi
    public final Object engineGetParameter(String str) throws InvalidParameterException {
        throw new InvalidParameterException("ECDSA doesn't take parameters");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof OooOo.OooO00o)) {
            throw new InvalidKeyException("Unsupported key type");
        }
        this.f113793OooO0O0 = (OooOo.OooO00o) privateKey;
    }

    @Override // java.security.SignatureSpi
    public final void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        throw new InvalidKeyException("Can only be used for signing.");
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(String str, Object obj) throws InvalidParameterException {
        throw new InvalidParameterException("ECDSA doesn't take parameters");
    }

    @Override // java.security.SignatureSpi
    public final byte[] engineSign() throws SignatureException {
        OooOo.OooO00o oooO00o = this.f113793OooO0O0;
        if (oooO00o == null) {
            throw new SignatureException("Not initialized");
        }
        try {
            return oooO00o.OooO0O0(this.f113792OooO00o, OooO00o());
        } catch (Exception e) {
            throw new SignatureException(e);
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte b) throws SignatureException {
        if (this.f113793OooO0O0 == null) {
            throw new SignatureException("Not initialized");
        }
        OooO0O0(b);
    }

    @Override // java.security.SignatureSpi
    public final boolean engineVerify(byte[] bArr) throws SignatureException {
        throw new SignatureException("Not initialized");
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        if (this.f113793OooO0O0 != null) {
            OooO0OO(bArr, i, i2);
            return;
        }
        throw new SignatureException("Not initialized");
    }
}
