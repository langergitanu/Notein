package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQE extends MacSpi {
    private zzZ41 zzVVO;
    private zzZ4T zzVVP;
    private final zzYPG zzVVQ;
    private final zzZ52 zzVVR;
    private final int zzWiC;
    private final zzZ5W zzWlz;

    public zzYQE(zzZ5W zzz5w, zzZ52 zzz52, zzYPG zzypg) {
        this(zzz5w, zzz52, zzypg, 0);
    }

    @Override // javax.crypto.MacSpi
    public final byte[] engineDoFinal() {
        return this.zzVVP.zzXGP();
    }

    @Override // javax.crypto.MacSpi
    public final int engineGetMacLength() {
        return (this.zzVVQ.zzXBE().zzXH3() + 7) / 8;
    }

    @Override // javax.crypto.MacSpi
    public final void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        zzZ46 zzz46ZzZ = zzYNC.zzZ(this.zzWlz, key);
        int i = this.zzWiC;
        if (i != 0 && zzYNC.zzZ(zzz46ZzZ, i)) {
            throw new InvalidKeyException(C21023OooO0Oo.OooO0OO(" bits", this.zzWiC, new StringBuilder("MAC requires key of size ")));
        }
        try {
            zzZ4T zzz4tZzZ = this.zzVVR.zzZ(zzz46ZzZ, this.zzVVQ.zzY(false, algorithmParameterSpec, null));
            this.zzVVP = zzz4tZzZ;
            this.zzVVO = zzz4tZzZ.zzXGQ();
        } catch (IllegalArgumentException e) {
            throw new InvalidAlgorithmParameterException(e.getMessage(), e.getCause());
        }
    }

    @Override // javax.crypto.MacSpi
    public final void engineReset() {
        zzZ4T zzz4t = this.zzVVP;
        if (zzz4t != null) {
            zzz4t.reset();
        }
    }

    @Override // javax.crypto.MacSpi
    public final void engineUpdate(byte b) {
        this.zzVVO.update(b);
    }

    public zzYQE(zzZ4M zzz4m, zzZ52 zzz52, zzYPG zzypg) {
        this(zzz4m.zzXGV(), zzz52, zzypg, 0);
    }

    @Override // javax.crypto.MacSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        this.zzVVO.update(bArr, i, i2);
    }

    public zzYQE(zzZ4M zzz4m, zzZ52 zzz52, zzYPG zzypg, int i) {
        this(zzz4m.zzXGV(), zzz52, zzypg, i);
    }

    private zzYQE(zzZ5W zzz5w, zzZ52 zzz52, zzYPG zzypg, int i) {
        this.zzWlz = zzz5w;
        this.zzVVR = zzz52;
        this.zzVVQ = zzypg;
        this.zzWiC = i;
    }
}
