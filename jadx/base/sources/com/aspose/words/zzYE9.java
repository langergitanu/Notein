package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYE9 {
    private boolean zzXpU;
    private boolean zzXpV;

    public final void zzXQ(char c) {
        int script = zzY42.getScript(c);
        boolean z = true;
        this.zzXpV = this.zzXpV || script == 1098015074 || (script == 1516858984 && com.aspose.words.internal.zzZVS.zzS3(c));
        if (!this.zzXpU && script != 1214603890) {
            z = false;
        }
        this.zzXpU = z;
    }

    public final boolean zzYdr() {
        return this.zzXpV || this.zzXpU;
    }

    public final boolean zzYds() {
        return this.zzXpU;
    }

    public final boolean zzYdt() {
        return this.zzXpV;
    }
}
