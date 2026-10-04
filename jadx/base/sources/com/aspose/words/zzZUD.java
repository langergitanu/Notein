package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUD extends zzYVO {
    private static boolean zzL(zzUZ zzuz) {
        return !zzuz.isEmpty() && zzuz.zz6w().zz60() == 32;
    }

    private static boolean zzM(zzUZ zzuz) throws Exception {
        if (zzL(zzuz)) {
            return zzY9R.zzmU(((zzZ55) zzuz.zz6w()).zzYQc().zzZo6());
        }
        return false;
    }

    private static boolean zzN(zzUZ zzuz) throws Exception {
        if (zzL(zzuz)) {
            return zzY9R.zzmP(((zzZ55) zzuz.zz6w()).zzYQc().zzZo6());
        }
        return false;
    }

    private zzUZ zzY(zzZ2D zzz2d) throws Exception {
        zzUZ zzuzZzYJ8 = zzz2d.zzYJ8();
        if (((zzZ35) zzz2d.zzYTt()).zzYLt().length == 1) {
            return zzuzZzYJ8;
        }
        while (zzuzZzYJ8 != null) {
            if (zzN(zzuzZzYJ8)) {
                return zzuzZzYJ8;
            }
            zzuzZzYJ8 = (zzUZ) zzuzZzYJ8.zzYo0();
        }
        throw new IllegalStateException("Unexpected endnote location.");
    }

    private boolean zzZj7() throws Exception {
        zzUZ zzuz = (zzUZ) this.zzXUB.zzZZJ();
        zzZ35 zzz35 = (zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt();
        if (zzz35.zzYLh() == 3 && !zzuz.isEmpty() && !zzM(zzuz)) {
            return true;
        }
        if (zzz35.zzYLh() == 0) {
            if (((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).getSuppressEndnotes() && !((zzZ2D) zzuz.zza9()).zzYTn()) {
                return true;
            }
            if (!zzuz.isEmpty() && !zzN(zzuz)) {
                return true;
            }
        }
        if (zzuz.isEmpty() && zzuz.zz08().isEmpty()) {
            return true;
        }
        return (!zzuz.isEmpty() || ((zzUZ) zzuz.zzYo1()) == null || ((zzUZ) zzuz.zzYo1()).isEmpty()) ? false : true;
    }

    private void zzZj8() throws Exception {
        zzUZ zzuzZzY;
        zzUZ zzuz = (zzUZ) this.zzXUB.zzZZJ();
        zzZ35 zzz35 = (zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt();
        int iZzYLh = zzz35.zzYLh();
        if (iZzYLh == 0) {
            zzZ2D zzz2d = (zzZ2D) zzuz.zza9();
            zzuzZzY = (!zzz35.getSuppressEndnotes() || ((zzZ2D) zzz2d.zzYTp()) == null) ? zzY(zzz2d) : zzY((zzZ2D) zzz2d.zzYTp());
        } else {
            if (iZzYLh != 3) {
                throw new IllegalStateException("Unexpected endnote location.");
            }
            zzuzZzY = zzY((zzZ2D) zzuz.zzab().zzZp0().zzZXY());
        }
        zzuz.zz08().zz6x().zzN(zzuzZzY != zzuz ? zzuz.zzab().zzZoY().zzY(zzuzZzY, true) : null);
    }

    private boolean zzZj9() throws Exception {
        if (this.zzXUB.isEmpty()) {
            return false;
        }
        zzUZ zzuz = (zzUZ) this.zzXUB.zzZZJ();
        zzZ2D zzz2d = (zzZ2D) zzuz.zza9();
        if (((zzZ35) zzz2d.zzYTt()).zzYLh() != 0 || ((zzZ2D) zzz2d.zzYTp()) == null) {
            return false;
        }
        ArrayList<zzYAD> arrayListZzYzl = zzYzl();
        for (int size = arrayListZzYzl.size() - 1; size >= 0; size--) {
            if (((zzZ2D) ((zzUZ) arrayListZzYzl.get(size).zzqh(2)).zza9()) == ((zzZ2D) zzz2d.zzYTp())) {
                zzZUC zzzuc = (zzZUC) arrayListZzYzl.get(size).zzY7l();
                ((zzYVQ) zzzuc.zz6x()).zzZ(((zzYVI) zzzuc.zza9()).zzY(((zzZ2D) zzz2d.zzYTp()).zzYJ9(), true), true);
            }
        }
        return zzuz.zz08() == null;
    }

    @Override // com.aspose.words.zzYVO
    public final boolean zzR(RefInt refInt) throws Exception {
        zzUZ zzuz = (zzUZ) this.zzXUB.zzZZJ();
        zzuz.zz0u();
        refInt.set(Math.max(0, ((this.zzZvz - zzuz.getContentHeight()) - (zzuz.zz09() != null ? zzuz.zz09().getHeight() : 0)) - this.zzXUB.zzYzr()));
        if (refInt.get() != 0) {
            return false;
        }
        if (this.zzXUB.isEmpty()) {
            this.zzXUB.remove();
            return true;
        }
        zzZj8();
        return true;
    }

    @Override // com.aspose.words.zzYVO
    public final void zzZja() throws Exception {
        if (this.zzXUB.isEmpty()) {
            zzUZ zzuz = (zzUZ) this.zzXUB.zzZZJ();
            zzZ35 zzz35 = (zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt();
            int iZzYLh = zzz35.zzYLh();
            if (iZzYLh != 0) {
                if (iZzYLh != 3) {
                    throw new IllegalStateException("Unexpected endnote location.");
                }
                for (zzYVN zzyvn = (zzYVN) zzuz.zzab().zzZoY().zzZXZ(); zzyvn != null; zzyvn = (zzYVN) ((zzYCT) zzyvn.zzYTp())) {
                    zzyvn.zzYzj();
                    ((zzYVQ) zzyvn.zz6x()).zzO(this.zzXUB);
                }
                return;
            }
            zzZ2D zzz2d = (zzZ2D) zzuz.zza9();
            if (!zzz35.getSuppressEndnotes() || ((zzZ2D) zzz2d.zzYTp()) == null) {
                zzYVQ zzyvq = null;
                zzYVQ zzyvq2 = null;
                while (zzuz != null) {
                    if (zzuz.zz08() != null && !zzuz.zz08().isEmpty()) {
                        if (zzyvq == null) {
                            zzyvq = (zzYVQ) zzuz.zz08().zz6x();
                        }
                        zzyvq2 = (zzYVQ) zzuz.zz08().zz6w();
                    }
                    zzuz = (zzUZ) zzuz.zzYo1();
                }
                ArrayList<zzYVN> arrayList = new ArrayList();
                while (zzyvq != ((zzYVQ) zzyvq2.zzYo1())) {
                    if (!arrayList.contains((zzYVN) zzyvq.zza9())) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYVN>) arrayList, (zzYVN) zzyvq.zza9());
                    }
                    zzyvq = (zzYVQ) zzyvq.zzYo1();
                }
                for (zzYVN zzyvn2 : arrayList) {
                    zzyvn2.zzYzj();
                    ((zzYVQ) zzyvn2.zz6x()).zzO(this.zzXUB);
                }
            }
        }
    }

    @Override // com.aspose.words.zzYVO
    public final boolean zzZjb() throws Exception {
        if (zzZj9()) {
            return true;
        }
        if (!zzZj7()) {
            return false;
        }
        if (this.zzXUB.isEmpty()) {
            this.zzXUB.remove();
        } else {
            zzZj8();
        }
        return true;
    }

    @Override // com.aspose.words.zzYVO
    public final boolean zzZjc() throws Exception {
        return this.zzXUB.zz60() == 512 && this.zzXUB.zza7().zzZYM() && this.zzXUA != this.zzXUB.zzYzr() && zzYzn();
    }
}
