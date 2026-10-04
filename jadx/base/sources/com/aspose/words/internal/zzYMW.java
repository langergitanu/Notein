package com.aspose.words.internal;

import java.security.spec.ECPoint;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class zzYMW implements KeySpec {

    /* JADX INFO: renamed from: n */
    private final zzYMY f51231n;

    /* JADX INFO: renamed from: o */
    private final ECPoint f51232o;

    public zzYMW(ECPoint eCPoint, zzYMY zzymy) {
        this.f51232o = eCPoint;
        this.f51231n = zzymy;
    }

    public final ECPoint getW() {
        return this.f51232o;
    }

    public final zzYMY zzXBH() {
        return this.f51231n;
    }
}
