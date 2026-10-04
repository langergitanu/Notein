package com.aspose.words.internal;

import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ4K;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQI extends MacSpi {
    private static zzZ52<zzYW0.zzY> zzVVS;
    private static zzZ15<zzZ0P.zzY> zzVVT = new zzZ0P.zzS();
    private zzZ41 zzVVO;
    private zzZ4T zzVVP;
    private final zzYPG zzVVQ;
    private final zzZ52 zzVVR;
    private final zzZ5W zzWlz;

    public zzYQI(zzZ1P zzz1p, zzYPG zzypg) {
        this.zzWlz = zzz1p;
        this.zzVVR = zzVVT;
        this.zzVVQ = zzypg;
    }

    private static zzZ52<zzYW0.zzY> zzXBC() {
        if (zzZ5L.zzXH0()) {
            return null;
        }
        if (zzVVS == null) {
            zzVVS = new zzYW0.zzS();
        }
        return zzVVS;
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
        zzZ5Q zzz5qZzY;
        PBEParameterSpec pBEParameterSpec;
        if (algorithmParameterSpec instanceof PBEParameterSpec) {
            try {
                zzz5qZzY = this.zzVVQ.zzY(true, null, null);
            } catch (IllegalArgumentException e) {
                throw new InvalidAlgorithmParameterException("Invalid algorithm parameter: " + e.getMessage(), e);
            }
        } else {
            zzz5qZzY = this.zzVVQ.zzY(true, algorithmParameterSpec, null);
        }
        if (key instanceof zzYRC) {
            int iZzXH3 = zzz5qZzY.zzXH3();
            if (algorithmParameterSpec != null) {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE algorithms can only take PBEParameterSpec");
                }
                pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            } else {
                if (!(key instanceof PBEKey)) {
                    throw new InvalidKeyException("No algorithm parameters provided when required.");
                }
                PBEKey pBEKey = (PBEKey) key;
                pBEParameterSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
            }
            try {
                SecretKey secretKey = (SecretKey) key;
                if (key == null) {
                    throw new InvalidKeyException("Unable to use passed in key for PBE");
                }
                key = new SecretKeySpec(zzYO1.zzZ(secretKey, zzYNC.zzR(this.zzWlz), pBEParameterSpec, zzZ4K.zzZ.MAC, iZzXH3), this.zzWlz.getName());
            } catch (Exception unused) {
                throw new InvalidKeyException("PBE schemes requires a SecretKey/PBEKey");
            }
        }
        zzZ4T zzz4tZzZ = this.zzVVR.zzZ(zzYNC.zzZ(this.zzWlz, key), zzz5qZzY);
        this.zzVVP = zzz4tZzZ;
        this.zzVVO = zzz4tZzZ.zzXGQ();
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

    @Override // javax.crypto.MacSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        this.zzVVO.update(bArr, i, i2);
    }

    public zzYQI(zzYXR zzyxr, zzYPG zzypg) {
        this.zzWlz = zzyxr;
        this.zzVVR = zzXBC();
        this.zzVVQ = zzypg;
    }
}
