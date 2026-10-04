package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzOZ extends zzJ5 {
    private long zzGE;
    private long zzGF;
    private zz0Q zzGG = new zz0Q(3);

    private zzOZ(long j, long j2) {
        this.zzGF = j;
        this.zzGE = j2;
    }

    public static zz0Q zzZ(zzP8 zzp8, long j, long j2) throws Exception {
        zzOZ zzoz = new zzOZ(j, j2);
        for (int i = 0; i < zzp8.getCount(); i++) {
            zzP4.zzZ(zzp8.zzO7().get(i), zzoz);
        }
        return zzoz.zzGG;
    }

    @Override // com.aspose.words.internal.zzJ5
    public final boolean zzP(long j, long j2) {
        long jZzN = zzJ6.zzN(j, j2, this.zzGF, this.zzGE);
        if (zzZPY.zzYF(jZzN)) {
            return true;
        }
        this.zzGG.add(jZzN);
        return true;
    }

    @Override // com.aspose.words.internal.zzJ5
    public final boolean zzQ(long j, long j2, long j3, long j4) {
        zz0Q zz0qZzY = zzJ6.zzY(j, j2, j3, j4, this.zzGF, this.zzGE);
        for (int i = 0; i < zz0qZzY.getCount(); i++) {
            this.zzGG.add(zz0qZzY.get(i));
        }
        return true;
    }
}
