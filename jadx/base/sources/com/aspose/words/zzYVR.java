package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYVR extends zzTF {
    private zzYMD zzXUC;
    private zzYVM zzXUD;

    private int zzYzq() throws Exception {
        if (zzYzs() == null) {
            return 0;
        }
        if (!zza7().zzZYM() || zzYzs().isVisible()) {
            return zzYzs().getHeight();
        }
        return 0;
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final int getHeight() throws Exception {
        super.setHeight(((zzYVQ) zz6w()).getY() + ((zzYVQ) zz6w()).getHeight() + zzYzq());
        return super.getHeight();
    }

    @Override // com.aspose.words.zzYMD
    public final int getX() {
        return 0;
    }

    @Override // com.aspose.words.zzYMD
    public final void remove() throws Exception {
        if (zzZZJ() != null) {
            ((zzYVI) zza9()).zzK((zzUZ) zzZZJ());
            zzY((zzTF) null);
        }
        if (zza9() != null) {
            zza9().zzB(this);
        }
    }

    @Override // com.aspose.words.zzYMD
    public final int zz0t() throws Exception {
        return ((zzYVQ) zz6w()).getY() + zz6w().zz0t() + zzYzq();
    }

    public final int zzYzr() throws Exception {
        return zzYzt().getHeight() + zzYzq();
    }

    public final zzYVM zzYzs() throws Exception {
        zzYMD zzz55;
        if (this.zzXUC == null) {
            zzYVJ zzyvjZztl = zzab().zzZoL().zztl(zzZje());
            if (zzyvjZztl != null) {
                zzz55 = (zzYVM) zzyvjZztl.zz6x();
                zzz55.setWidth(getWidth());
            } else {
                zzz55 = new zzZ55();
            }
            zzz55.zzY(this);
            this.zzXUC = zzz55;
        }
        return (zzYVM) com.aspose.words.internal.zzZKW.zzZ(this.zzXUC, zzYVM.class);
    }

    public final zzYVM zzYzt() throws Exception {
        if (this.zzXUD == null) {
            int iZzZjg = zzZjg();
            if (zzZjd()) {
                iZzZjg = zzZjf();
            }
            zzYVM zzyvm = (zzYVM) zzab().zzZoL().zztl(iZzZjg).zz6x();
            this.zzXUD = zzyvm;
            zzyvm.setWidth(getWidth());
            this.zzXUD.zzY((zzTF) this);
        }
        return this.zzXUD;
    }

    public final void zzZ(zzYVR zzyvr) throws Exception {
        for (zzYVQ zzyvq = (zzYVQ) zz6x(); zzyvq != null && zzyvq.zzZZJ() == this; zzyvq = (zzYVQ) zzyvq.zzYo1()) {
            zzyvq.zzZ(zzyvr, false);
        }
    }

    public abstract boolean zzZjd() throws Exception;

    public abstract int zzZje();

    public abstract int zzZjf();

    public abstract int zzZjg();
}
