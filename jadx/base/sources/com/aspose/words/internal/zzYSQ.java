package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYSQ {
    private final int zzWbd;
    private final int zzWjt;
    private final SecureRandom zzWk5;
    private final int zzWkM;
    private final int zzWtn;

    public zzYSQ(int i, int i2, int i3, SecureRandom secureRandom) {
        this(i, i2, i3, secureRandom, -1);
    }

    public final int getL() {
        return this.zzWtn;
    }

    public final SecureRandom zzXCJ() {
        return this.zzWk5;
    }

    public final int zzXCn() {
        return this.zzWbd;
    }

    public final int zzXEq() {
        return this.zzWjt;
    }

    public final int zzXGn() {
        return this.zzWkM;
    }

    public zzYSQ(int i, int i2, int i3, SecureRandom secureRandom, int i4) {
        this.zzWtn = i;
        this.zzWbd = i2;
        this.zzWjt = i3;
        this.zzWkM = i4;
        this.zzWk5 = secureRandom;
    }
}
