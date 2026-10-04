package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZA4 extends zzZDB {
    zzZD4 zzWDL;
    zzZD4 zzWDM;

    private zzZA4(zzZD4 zzzd4) {
        if (zzzd4.size() <= 0 || zzzd4.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
        this.zzWDM = zzZD4.zzYy(zzzd4.zzg6(0));
        if (zzzd4.size() > 1) {
            this.zzWDL = zzZD4.zzYy(zzzd4.zzg6(1));
        }
    }

    public static zzZA4 zzY0(Object obj) {
        if (obj instanceof zzZA4) {
            return (zzZA4) obj;
        }
        if (obj != null) {
            return new zzZA4(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZA6[] zzXJu() {
        zzZA6[] zzza6Arr = new zzZA6[this.zzWDM.size()];
        for (int i = 0; i != this.zzWDM.size(); i++) {
            zzza6Arr[i] = zzZA6.zzY2(this.zzWDM.zzg6(i));
        }
        return zzza6Arr;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWDM);
        zzZD4 zzzd4 = this.zzWDL;
        if (zzzd4 != null) {
            zzzdj.zzZ(zzzd4);
        }
        return new zzZC2(zzzdj);
    }
}
