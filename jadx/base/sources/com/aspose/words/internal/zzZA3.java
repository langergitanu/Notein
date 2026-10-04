package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZA3 extends zzZDB {
    zzZD4 zzWDL;
    zzZD4 zzWDM;

    private zzZA3(zzZD4 zzzd4) {
        if (zzzd4.size() <= 0 || zzzd4.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
        this.zzWDM = zzZD4.zzYy(zzzd4.zzg6(0));
        if (zzzd4.size() > 1) {
            this.zzWDL = zzZD4.zzYy(zzzd4.zzg6(1));
        }
    }

    public static zzZA3 zzXZ(Object obj) {
        if (obj == null || (obj instanceof zzZA3)) {
            return (zzZA3) obj;
        }
        if (obj instanceof zzZD4) {
            return new zzZA3((zzZD4) obj);
        }
        return null;
    }

    public final zzZA5[] zzXJt() {
        zzZA5[] zzza5Arr = new zzZA5[this.zzWDM.size()];
        for (int i = 0; i != this.zzWDM.size(); i++) {
            zzza5Arr[i] = zzZA5.zzY1(this.zzWDM.zzg6(i));
        }
        return zzza5Arr;
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
