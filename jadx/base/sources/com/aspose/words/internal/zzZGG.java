package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGG extends zzZG6 {
    final String zzWNB;
    static final zzZGG zzWND = new zzZGG("No elements allowed in pure #PCDATA content model");
    static final zzZGG zzWNC = new zzZGG("No elements allowed in EMPTY content model");

    private zzZGG(String str) {
        this.zzWNB = str;
    }

    public static zzZGG zzXOn() {
        return zzWND;
    }

    @Override // com.aspose.words.internal.zzZG6
    public final String zzXOZ() {
        return null;
    }

    @Override // com.aspose.words.internal.zzZG6
    public final zzZG6 zzXP0() {
        return this;
    }

    @Override // com.aspose.words.internal.zzZG6
    public final String zzZ(zzZDZ zzzdz) {
        return this.zzWNB;
    }
}
