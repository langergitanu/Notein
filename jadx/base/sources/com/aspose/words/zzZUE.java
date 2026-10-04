package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUE extends zzYVR {
    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final int getWidth() throws Exception {
        return zzZZJ().getWidth();
    }

    @Override // com.aspose.words.zzYMD
    public final int getY() throws Exception {
        zzUZ zzuz = (zzUZ) zzZZJ();
        return (zzuz.zz09() == null || ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLl() == 1) ? zzuz.getContentHeight() : zzuz.zz09().getBottom();
    }

    @Override // com.aspose.words.zzYMD
    public final zzTF zz0s() throws Exception {
        zzUZ zzuz = (zzUZ) zzZZJ();
        zzZ35 zzz35 = (zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt();
        zzUZ zzuzZz06 = zzuz.zz06();
        if ((zzz35.zzYLh() == 0 && ((zzUZ) zzuz.zzYo1()) == null && !zzz35.getSuppressEndnotes()) || zzuz.zzYQq()) {
            zzuzZz06 = (zzUZ) zzuz.zz0s();
        }
        return ((zzYVI) zza9()).zzY(zzuzZz06, true);
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 512;
    }

    @Override // com.aspose.words.zzYVR
    public final boolean zzZjd() {
        return ((zzTF) zzYo0()) != null && zzZZJ().zza9().zzYTk() == ((zzTF) zzYo0()).zzZZJ().zza9().zzYTk();
    }

    @Override // com.aspose.words.zzYVR
    public final int zzZje() {
        return 17;
    }

    @Override // com.aspose.words.zzYVR
    public final int zzZjf() {
        return 16;
    }

    @Override // com.aspose.words.zzYVR
    public final int zzZjg() {
        return 15;
    }
}
