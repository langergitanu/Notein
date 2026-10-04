package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7O extends zzZDB {
    zzZCG zzWq3;
    zzZDD zzWq4;
    zzZ7Q zzWq5;

    private zzZ7O(zzZD4 zzzd4) {
        if (zzzd4.size() != 2 && zzzd4.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
        this.zzWq5 = zzZ7Q.zzX8(zzzd4.zzg6(0));
        this.zzWq4 = zzZDD.zzYB(zzzd4.zzg6(1));
        if (zzzd4.size() == 3) {
            this.zzWq3 = zzZCG.zzYu(zzzd4.zzg6(2));
        }
    }

    public static zzZ7O zzX6(Object obj) {
        if (obj instanceof zzZ7O) {
            return (zzZ7O) obj;
        }
        if (obj != null) {
            return new zzZ7O(zzZD4.zzYy(obj));
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWq5);
        zzzdj.zzZ(this.zzWq4);
        zzZCG zzzcg = this.zzWq3;
        if (zzzcg != null) {
            zzzdj.zzZ(zzzcg);
        }
        return new zzZC2(zzzdj);
    }
}
