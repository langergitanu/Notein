package com.aspose.words.internal;

import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPT {
    public static ECParameterSpec zzP(zzZ33 zzz33) {
        return zzz33 instanceof zzZ30 ? new zzYMS((zzZ30) zzz33) : new zzYMV(zzz33);
    }

    public static zzZ33 zzZ(ECParameterSpec eCParameterSpec) {
        zzZ33 zzz33ZzXGy = eCParameterSpec instanceof zzYMV ? ((zzYMV) eCParameterSpec).zzXGy() : new zzYMV(eCParameterSpec).zzXGy();
        return eCParameterSpec instanceof zzYMS ? new zzZ30(zzz33ZzXGy) : zzz33ZzXGy;
    }

    public static zzYLX zzZ(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return zzZ(zzZ(eCParameterSpec).zzXHv(), eCPoint);
    }

    public static zzYLX zzZ(zzYM1 zzym1, ECPoint eCPoint) {
        return zzym1.zzY(eCPoint.getAffineX(), eCPoint.getAffineY());
    }
}
