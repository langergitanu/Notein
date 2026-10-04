package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYVM extends zzYBL {
    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final int getHeight() throws Exception {
        if (super.getHeight() <= 0) {
            super.setHeight(zzZXU());
        }
        return super.getHeight();
    }

    @Override // com.aspose.words.zzYMD
    public final int getX() {
        return zzZZJ().getX();
    }

    @Override // com.aspose.words.zzYMD
    public final int getY() throws Exception {
        switch (zzaa().getStoryType()) {
            case 12:
            case 13:
            case 15:
            case 16:
                return 0;
            case 14:
            case 17:
                return zzZZJ().zz6w().getY() + zzZZJ().zz6w().getHeight();
            default:
                throw new IllegalStateException();
        }
    }

    public final boolean isVisible() {
        zzZZJ();
        zzYVR zzyvr = (zzYVR) zzZZJ();
        if (!zzyvr.isEmpty() && zzyvr.zzYo1() != null) {
            if (zzyvr instanceof zzZUE) {
                zzUZ zzuz = (zzUZ) zzyvr.zzZZJ();
                return ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLh() != 0 || ((zzZ2D) zzuz.zza9()) == ((zzZ2D) ((zzUZ) zzyvr.zzYo1().zzZZJ()).zza9());
            }
            if (zzyvr.zz6w().zza9().zzYTk() == ((zzTF) zzyvr.zzYo1()).zz6x().zza9().zzYTk()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 8192;
    }

    @Override // com.aspose.words.zzTF
    public final int zzZXQ() {
        return zzZZJ().zzZXQ();
    }

    @Override // com.aspose.words.zzYBL
    public final boolean zzZZK() {
        return false;
    }
}
