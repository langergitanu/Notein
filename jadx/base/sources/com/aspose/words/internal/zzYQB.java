package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0Q;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQB extends SignatureSpi implements zzZ79, zzZ96 {
    protected zzZ4S zzVVA;
    protected zzZ4P zzVVB;
    private final AlgorithmParameterSpec zzVVC;
    private final zzZ4E zzVVD;
    protected AlgorithmParameterSpec zzVVy;
    protected zzZ41 zzVVz;
    protected AlgorithmParameters zzVW3;
    private final zzYQ8 zzVWk;
    private final zzYP5 zzVWr;
    private final zzYNG zzVWs;
    protected zzZ5V zzW5V;
    protected zzZ4M zzWil;

    public zzYQB(zzYQ8 zzyq8, zzZ4E zzz4e, zzYNG zzyng, zzYP5 zzyp5, zzZ4M zzz4m) {
        this.zzVWk = zzyq8;
        this.zzVVD = zzz4e;
        this.zzVWs = zzyng;
        this.zzVWr = zzyp5;
        this.zzWil = zzz4m;
        this.zzVVC = null;
    }

    private static byte zzeX(int i) {
        if (i == 1) {
            return (byte) -68;
        }
        throw new IllegalArgumentException("Unknown trailer field");
    }

    @Override // java.security.SignatureSpi
    public final Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("GetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public final AlgorithmParameters engineGetParameters() {
        if (this.zzVW3 == null && this.zzVVy != null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("PSS", this.zzVWk);
                this.zzVW3 = algorithmParameters;
                algorithmParameters.init(this.zzVVy);
            } catch (Exception e) {
                throw new IllegalStateException(e.toString(), e);
            }
        }
        return this.zzVW3;
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        zzZ5S zzz5sZzZ = this.zzVWr.zzZ(this.zzWil.zzXGV(), privateKey);
        this.zzW5V = zzz5sZzZ;
        try {
            zzZ4S zzz4s = (zzZ4S) zzYNC.zzZ(this.zzVVD.zzY(zzz5sZzZ, this.zzWil), this.zzVWk.zzXBp());
            this.zzVVA = zzz4s;
            this.zzVVz = zzz4s.zzXGO();
        } catch (Exception e) {
            throw new InvalidKeyException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Cannot initialize for signing: ")), e);
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        zzZ5R zzz5rZzY = this.zzVWs.zzY(this.zzWil.zzXGV(), publicKey);
        this.zzW5V = zzz5rZzY;
        zzZ4P zzz4pZzZ = this.zzVVD.zzZ(zzz5rZzY, this.zzWil);
        this.zzVVB = zzz4pZzZ;
        this.zzVVz = zzz4pZzZ.zzXGN();
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null && (algorithmParameterSpec = this.zzVVC) == null) {
            return;
        }
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            throw new InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
        }
        PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
        AlgorithmParameterSpec algorithmParameterSpec2 = this.zzVVC;
        if (algorithmParameterSpec2 instanceof PSSParameterSpec) {
            PSSParameterSpec pSSParameterSpec2 = (PSSParameterSpec) algorithmParameterSpec2;
            if (algorithmParameterSpec2 != PSSParameterSpec.DEFAULT && !zzYPU.zzXn(pSSParameterSpec2.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                throw new InvalidAlgorithmParameterException("Parameter must be using " + pSSParameterSpec2.getDigestAlgorithm());
            }
        }
        if (!pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase(IDevicePopManager.MGF_1) && !pSSParameterSpec.getMGFAlgorithm().equals(zzZ96.zzWyu.getId())) {
            throw new InvalidAlgorithmParameterException("Unknown mask generation function specified");
        }
        if (!(pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
            throw new InvalidAlgorithmParameterException("Unknown MGF parameters");
        }
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
        if (!zzYPU.zzXn(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException("Digest algorithm for MGF should be the same as for PSS parameters.");
        }
        zzZ5K zzz5kZzwr = zzYPU.zzwr(mGF1ParameterSpec.getDigestAlgorithm());
        if (zzz5kZzwr == null) {
            throw new InvalidAlgorithmParameterException("No match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
        if (!(zzz5kZzwr instanceof zzZ1P)) {
            throw new InvalidAlgorithmParameterException("Digest algorithm not supported: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
        zzZ1J zzz1j = (zzZ1J) zzz5kZzwr;
        zzZ0Q.zzL zzlZzfI = zzZ0Q.zzWfv.zzU(zzz1j).zzT(zzz1j).zzfJ(pSSParameterSpec.getSaltLength()).zzfI(zzeX(pSSParameterSpec.getTrailerField()));
        this.zzWil = zzlZzfI;
        this.zzVVy = pSSParameterSpec;
        if (this.zzVVz != null) {
            zzZ5V zzz5v = this.zzW5V;
            if (zzz5v instanceof zzZ5S) {
                zzZ4S zzz4s = (zzZ4S) zzYNC.zzZ(this.zzVVD.zzY((zzZ5S) zzz5v, zzlZzfI), this.zzVWk.zzXBp());
                this.zzVVA = zzz4s;
                this.zzVVz = zzz4s.zzXGO();
            } else {
                zzZ4P zzz4pZzZ = this.zzVVD.zzZ((zzZ5R) zzz5v, zzlZzfI);
                this.zzVVB = zzz4pZzZ;
                this.zzVVz = zzz4pZzZ.zzXGN();
            }
        }
    }

    @Override // java.security.SignatureSpi
    public final byte[] engineSign() throws SignatureException {
        try {
            return this.zzVVA.getSignature();
        } catch (Exception e) {
            throw new SignatureException(e.toString(), e);
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte b) throws SignatureException {
        this.zzVVz.update(b);
    }

    @Override // java.security.SignatureSpi
    public final boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            return this.zzVVB.zzXh(bArr);
        } catch (Exception e) {
            throw new SignatureException(e.toString(), e);
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.zzVVz.update(bArr, i, i2);
    }

    public zzYQB(zzYQ8 zzyq8, zzZ4E zzz4e, zzYNG zzyng, zzYP5 zzyp5, zzZ4M zzz4m, AlgorithmParameterSpec algorithmParameterSpec) {
        this.zzVWk = zzyq8;
        this.zzVVD = zzz4e;
        this.zzVWs = zzyng;
        this.zzVWr = zzyp5;
        this.zzWil = zzz4m;
        this.zzVVy = algorithmParameterSpec;
        this.zzVVC = algorithmParameterSpec;
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        zzZ5S zzz5sZzZ = this.zzVWr.zzZ(this.zzWil.zzXGV(), privateKey);
        this.zzW5V = zzz5sZzZ;
        zzZ4S zzz4sZzY = this.zzVVD.zzY(zzz5sZzZ, this.zzWil);
        if (secureRandom == null) {
            secureRandom = this.zzVWk.zzXBp();
        }
        zzZ4S zzz4s = (zzZ4S) zzYNC.zzZ(zzz4sZzY, secureRandom);
        this.zzVVA = zzz4s;
        this.zzVVz = zzz4s.zzXGO();
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("SetParameter unsupported");
    }
}
