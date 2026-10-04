package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class zzYUS {
    private int zzWk4;
    private SecureRandom zzWk5;

    public zzYUS(SecureRandom secureRandom, int i) {
        this.zzWk5 = secureRandom;
        this.zzWk4 = i;
    }

    public final int getStrength() {
        return this.zzWk4;
    }

    public final SecureRandom zzXCJ() {
        return this.zzWk5;
    }
}
