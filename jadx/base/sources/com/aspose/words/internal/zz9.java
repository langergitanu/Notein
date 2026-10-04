package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zz9 extends zzZV {
    private boolean zzZk;
    private zzPM zzZl;
    private ArrayList<String> zzZm;
    private int zzZn;
    private long zzZr;

    public zz9(zzZQ4 zzzq4, String str, ArrayList<String> arrayList, int i, zzPV zzpv, zzPV zzpv2, zzPM zzpm, long j, boolean z) {
        super(zzzq4, str, zzpv, zzpv2);
        this.zzZm = arrayList;
        this.zzZn = i;
        this.zzZl = zzpm;
        this.zzZr = j;
        this.zzZk = z;
    }

    public final int getValue() {
        return this.zzZn;
    }

    @Override // com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
    }

    public final ArrayList<String> zzZA() {
        return this.zzZm;
    }

    public final zzPM zzZB() {
        return this.zzZl;
    }

    public final long zzZE() {
        return this.zzZr;
    }

    public final boolean zzZz() {
        return this.zzZk;
    }
}
