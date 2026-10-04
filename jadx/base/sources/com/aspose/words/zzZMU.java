package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMU extends zzYVO {
    private static zzUZ zzF(zzUZ zzuz) throws Exception {
        if (zzuz.isEmpty() || (zzuz.zz6w() instanceof zzYIA)) {
            return zzuz.zz06();
        }
        for (zzYAU zzyauZzYQc = ((zzZ55) zzuz.zz6w()).zzYQc(); zzyauZzYQc != null; zzyauZzYQc = (zzYAU) zzyauZzYQc.zz5Y()) {
            if (zzyauZzYQc.zzZo6() == 21788 || zzyauZzYQc.zzZo6() == 10528) {
                return zzuz.zzYn(false);
            }
            if (zzyauZzYQc.zzZo6() != 0 && zzyauZzYQc.zzZo6() != 21537) {
                break;
            }
        }
        return zzuz.zz06();
    }

    private static void zzY(zzZMW zzzmw) throws Exception {
        if (zzzmw.isEmpty() || ((zzYVQ) ((zzYVQ) zzzmw.zz6w()).zzYo1()) == null) {
            return;
        }
        while (((zzYVQ) zzzmw.zz6w()).zza9() == ((zzYVQ) ((zzYVQ) zzzmw.zz6w()).zzYo1()).zza9()) {
            ((zzYVQ) ((zzYVQ) zzzmw.zz6w()).zzYo1()).zzZ((zzYVR) zzzmw, false);
            if (((zzYVQ) ((zzYVQ) zzzmw.zz6w()).zzYo1()) == null) {
                return;
            }
        }
    }

    @Override // com.aspose.words.zzYVO
    public final boolean zzR(RefInt refInt) throws Exception {
        refInt.set(Math.max(0, this.zzZvz - this.zzXUB.zzYzr()));
        if (refInt.get() != 0 || this.zzZsl) {
            return false;
        }
        if (!this.zzXUB.isEmpty()) {
            zzUZ zzuz = (zzUZ) com.aspose.words.internal.zzZKW.zzZ((zzTF) this.zzXUB.zzZZJ().zzYo1(), zzUZ.class);
            if (zzuz == null) {
                zzuz = (zzUZ) this.zzXUB.zzZZJ().zz0s();
            }
            this.zzXUB.zz6x().zzN(((zzYVI) this.zzXUB.zza9()).zzY(zzuz, true));
        }
        this.zzXUB.remove();
        return true;
    }

    @Override // com.aspose.words.zzYVO
    public final void zzZja() throws Exception {
        if (this.zzXUz) {
            return;
        }
        ArrayList<zzYAD> arrayListZz01 = ((zzUZ) this.zzXUB.zzZZJ()).zz01();
        Iterator<zzYAD> it = arrayListZz01.iterator();
        while (it.hasNext()) {
            zzZMT zzzmt = (zzZMT) it.next().zzY7l();
            if (((zzYVQ) zzzmt.zz6x()).zzZZJ() != this.zzXUB || ((zzYVQ) zzzmt.zz6w()).zzZZJ() != this.zzXUB) {
                zzY((zzZMW) this.zzXUB);
                zzzmt.zzYzj();
                ((zzYVQ) zzzmt.zz6x()).zzZ(this.zzXUB, false);
            }
        }
        ((zzZMW) this.zzXUB).zzZz(arrayListZz01);
    }

    @Override // com.aspose.words.zzYVO
    public final boolean zzZjb() throws Exception {
        zzUZ zzuzZzF;
        if (this.zzXUB.isEmpty() || (zzuzZzF = zzF((zzUZ) this.zzXUB.zzZZJ())) == null) {
            return false;
        }
        ArrayList<zzYAD> arrayListZzYzl = zzYzl();
        for (int size = arrayListZzYzl.size() - 1; size >= 0; size--) {
            if (arrayListZzYzl.get(size).zzqh(2) == zzuzZzF) {
                zzZMT zzzmt = (zzZMT) arrayListZzYzl.get(size).zzY7l();
                ((zzYVQ) zzzmt.zz6x()).zzZ(((zzYVI) zzzmt.zza9()).zzY(zzuzZzF, true), true);
            }
        }
        if (!this.zzXUB.isEmpty()) {
            return false;
        }
        this.zzXUB.remove();
        return true;
    }
}
