package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzNE implements zzH2 {
    private boolean zzGx;
    private ArrayList<Long> zzEG = new ArrayList<>();
    private ArrayList<Integer> zzEF = new ArrayList<>();
    private ArrayList<Integer> zzEE = new ArrayList<>();

    private void zzR(long j, int i) {
        if (this.zzGx) {
            this.zzGx = false;
            i = 0;
        }
        zzZQG.zzZ(this.zzEG, Long.valueOf(j));
        this.zzEF.add(Integer.valueOf(i));
        this.zzEE.add(0);
    }

    public final ArrayList<Integer> zzLw() {
        return this.zzEE;
    }

    public final ArrayList<Integer> zzLx() {
        return this.zzEF;
    }

    public final ArrayList<Long> zzLy() {
        return this.zzEG;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        boolean z = this.zzGx;
        if (zzp5.isClosed() && !z) {
            ArrayList<Integer> arrayList = this.zzEE;
            arrayList.set(arrayList.size() - 1, 8);
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        this.zzGx = true;
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        for (int i = 0; i < zzos.zzNu().getCount(); i++) {
            zzR(zzos.zzNu().get(i), 1);
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        zzR(zzpz.zzPX(), 1);
        zzR(zzpz.zzPL(), 3);
        zzR(zzpz.zzPK(), 3);
        zzR(zzpz.zzPW(), 3);
        return true;
    }
}
