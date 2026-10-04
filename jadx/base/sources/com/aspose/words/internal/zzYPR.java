package com.aspose.words.internal;

import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPR {
    public static zzYMM<zzYMN> zzW(zzZ2Y<zzZ2Z> zzz2y) {
        return new zzYMM<>(zzz2y);
    }

    public static zzYMM<zzYMV> zzX(zzZ2Y<zzZ33> zzz2y) {
        return new zzYMM<>(zzz2y);
    }

    public static zzZ2Y<zzZ33> zzY(zzYMM<zzYMV> zzymm) {
        return new zzZ2Y<>(zzymm.zzXJw(), zzymm.zzXJv(), zzymm.zzXJv(), zzYPT.zzZ((ECParameterSpec) zzymm.zzXA3()));
    }

    public static zzZ2Y<zzZ2Z> zzZ(zzYMM<zzYMN> zzymm) {
        zzYMN zzymn = (zzYMN) zzymm.zzXA3();
        return new zzZ2Y<>(zzymm.zzXJw(), zzymm.zzXJv(), zzymm.zzXJv(), new zzZ2Z(zzymn.getKeySize(), zzymn.getP(), zzymn.getQ(), zzymn.getA()));
    }
}
