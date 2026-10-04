package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6B extends zzZ6H {
    public zzZ6B(zzYMD zzymd) throws Exception {
        super(zzymd);
    }

    public final boolean zzYRF() {
        return ((zzYAS) zz14()).zzYRF();
    }

    public final int zzYRG() throws Exception {
        int iZzZo6 = zz14().zzZo6();
        if (iZzZo6 == 21857 && !this.zzYgm.zza9().zzaa().zzbD()) {
            iZzZo6 = 21537;
        }
        if (iZzZo6 == 10528) {
            return 1;
        }
        if (iZzZo6 == 21577 || iZzZo6 == 21586 || iZzZo6 == 21595) {
            return 4;
        }
        if (iZzZo6 == 21639) {
            return 10;
        }
        if (iZzZo6 == 21779) {
            return 2;
        }
        if (iZzZo6 == 21788) {
            return 1;
        }
        if (iZzZo6 == 21513 || iZzZo6 == 21514) {
            return 0;
        }
        switch (iZzZo6) {
            case 21857:
                return 5;
            case 21858:
                return 6;
            case 21859:
                return 8;
            case 21860:
                return 7;
            case 21861:
                return 9;
            default:
                return 3;
        }
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzYAU zzyau = (zzYAU) this.zzYgm;
        if (!(21577 == zzyau.zzZo6() && zzyau.zzY6S().zzRA(true)) && com.aspose.words.internal.zzZYD.zzXk(zzyau.getText())) {
            zzz61.zzZ(this);
        }
    }
}
