package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYM3 implements com.aspose.words.internal.zzH2 {
    private com.aspose.words.internal.zzP5 zzSo;

    public static com.aspose.words.internal.zzZG zzp(com.aspose.words.internal.zzZG zzzg) throws Exception {
        return zzzg.zzU(zzw(zzzg.zzZ0()));
    }

    private com.aspose.words.internal.zzP8 zzv(com.aspose.words.internal.zzP8 zzp8) throws Exception {
        if (zzp8.getCount() == 0) {
            return zzp8.zzO8();
        }
        com.aspose.words.internal.zzP8 zzp82 = new com.aspose.words.internal.zzP8();
        for (int size = zzp8.zzO7().size() - 1; size >= 0; size--) {
            com.aspose.words.internal.zzP5 zzp5 = zzp8.zzO7().get(size);
            com.aspose.words.internal.zzP5 zzp52 = new com.aspose.words.internal.zzP5();
            this.zzSo = zzp52;
            zzp52.zze(zzp5.isClosed());
            zzp5.zzY(this);
            com.aspose.words.internal.zzZQG.zzZ(zzp82.zzO7(), this.zzSo);
        }
        return zzp82;
    }

    private static com.aspose.words.internal.zzP8 zzw(com.aspose.words.internal.zzP8 zzp8) throws Exception {
        return new zzYM3().zzv(zzp8);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(com.aspose.words.internal.zzP5 zzp5) {
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzP5 zzp5) {
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzOS zzos) {
        com.aspose.words.internal.zz0Q zz0q = new com.aspose.words.internal.zz0Q(zzos.zzNu());
        zz0q.reverse();
        this.zzSo.zzNY().add(0, new com.aspose.words.internal.zzOS(zz0q, false));
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzPZ zzpz) {
        this.zzSo.zzNY().add(0, new com.aspose.words.internal.zzPZ(zzpz.zzPW(), zzpz.zzPK(), zzpz.zzPL(), zzpz.zzPX()));
        return true;
    }
}
