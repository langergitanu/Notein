package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZB7 extends zzZDB {
    private final zzZ80[] zzWGK;
    private final zzZ9E zzWGL;

    public zzZB7(zzZ9E zzz9e, zzZ80[] zzz80Arr) {
        this.zzWGL = zzz9e;
        zzZ80[] zzz80Arr2 = new zzZ80[zzz80Arr.length];
        this.zzWGK = zzz80Arr2;
        System.arraycopy(zzz80Arr, 0, zzz80Arr2, 0, zzz80Arr.length);
    }

    public static zzZB7 zzYq(Object obj) {
        if (obj != null) {
            return new zzZB7(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZ9E zzXKi() {
        return this.zzWGL;
    }

    public final zzZ80[] zzXKj() {
        zzZ80[] zzz80Arr = this.zzWGK;
        zzZ80[] zzz80Arr2 = new zzZ80[zzz80Arr.length];
        System.arraycopy(zzz80Arr, 0, zzz80Arr2, 0, zzz80Arr.length);
        return zzz80Arr2;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWGL);
        zzzdj.zzZ(new zzZC2(this.zzWGK));
        return new zzZC2(zzzdj);
    }

    private zzZB7(zzZD4 zzzd4) {
        int i = 0;
        this.zzWGL = zzZ9E.zzXP(zzzd4.zzg6(0));
        zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzzd4.zzg6(1));
        this.zzWGK = new zzZ80[zzzd4ZzYy.size()];
        while (true) {
            zzZ80[] zzz80Arr = this.zzWGK;
            if (i == zzz80Arr.length) {
                return;
            }
            zzz80Arr[i] = zzZ80.zzXh(zzzd4ZzYy.zzg6(i));
            i++;
        }
    }
}
