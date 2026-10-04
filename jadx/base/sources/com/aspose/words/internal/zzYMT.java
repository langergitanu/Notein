package com.aspose.words.internal;

import java.security.spec.ECPoint;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class zzYMT implements KeySpec {

    /* JADX INFO: renamed from: o */
    private final ECPoint f51226o;

    /* JADX INFO: renamed from: p */
    private final zzYMM<zzYMV> f51227p;

    public zzYMT(ECPoint eCPoint, zzYMM<zzYMV> zzymm) {
        this.f51226o = eCPoint;
        this.f51227p = zzymm;
    }

    public final ECPoint getW() {
        return this.f51226o;
    }

    public final zzYMM<zzYMV> zzXBG() {
        return this.f51227p;
    }
}
