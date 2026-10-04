package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMW extends zzYVR {
    private static zzYMD zzG(zzUZ zzuz) throws Exception {
        zzTC zztc = (zzTC) zzuz.zz6w();
        if (zztc == null || zztc.zz60() != 32) {
            return zztc;
        }
        zzZ55 zzz55 = (zzZ55) zztc;
        return (!zzz55.zzYQ6() || zzz55.zzYQ9()) ? zztc : zztc.zz5Y();
    }

    private int zzH(zzUZ zzuz) throws Exception {
        return (!((zzZ2D) zzuz.zza9()).zzZrS() && zza7().zzZYM() && ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLt().length == 1) ? ((zzZ35) ((zzZ2D) ((zzUZ) zzYVN.zzv(zzuz.zz09().zz6x()).zzqh(2)).zza9()).zzYTt()).zzYLl() : ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLl();
    }

    public static int zzI(zzUZ zzuz) throws Exception {
        int iZz0t = zzuz.zz0t();
        zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzG(zzuz), zzZ55.class);
        if (zzz55 != null && ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLt().length <= 1) {
            boolean zZzZ = zzZ55.zzZ(zzz55, zzYAD.class);
            if (zzuz.zza7().zzZYM() || zZzZ) {
                iZz0t += zzz55.zzYQj().zzYQE();
            }
        }
        int iMax = 0;
        zzY5N zzy5nZzYG = ((zzYN8) zzuz.zzZZJ()).zzYG(false);
        if (zzy5nZzYG != null && zzuz.zz09() != null && zzuz.zz0n() && zzuz.zzYnZ() && zzuz.zzYnY()) {
            int y = zzuz.getY() + iZz0t;
            for (zzZNO zzzno : zzy5nZzYG.zzXVS()) {
                if (zzzno.zzbD() && !zzzno.zzhk()) {
                    iMax = Math.max(iMax, zzzno.zzZ8V().getBottom());
                }
            }
            if (iMax > y) {
                return (iMax - y) + iZz0t;
            }
        }
        return iZz0t;
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final int getWidth() throws Exception {
        return zzZZJ().getWidth();
    }

    @Override // com.aspose.words.zzYMD
    public final int getY() throws Exception {
        zzUZ zzuz = (zzUZ) zzZZJ();
        if (zzH(zzuz) != 1) {
            return zzYBJ.zzW((zzYBL) zzuz, true);
        }
        int iZzI = zzI(zzuz);
        return (zza7().zzZYM() || zzuz.getHeight() - iZzI >= getHeight()) ? zzuz.getHeight() - getHeight() : iZzI;
    }

    @Override // com.aspose.words.zzYMD
    public final zzTF zz0s() throws Exception {
        zzUZ zzuz = (zzUZ) zzZZJ();
        return ((zzYVI) zza9()).zzY(zzuz.zzYTn() ? (zzUZ) zzuz.zz0s() : (zzUZ) zzuz.zzYo1(), true);
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 256;
    }

    @Override // com.aspose.words.zzYVR
    public final boolean zzZjd() {
        if (zza7().zzZYM()) {
            return false;
        }
        zzUZ zzuz = (zzUZ) zzZZJ();
        if (zzV1.zzV(zzuz)) {
            return !zzZZJ().zza9().zza7().zzYMP() || ((zzZ2D) ((zzUZ) zzYVN.zzv(zzuz.zz09().zz6x()).zzqh(2)).zza9()) == ((zzZ2D) zzuz.zza9());
        }
        return false;
    }

    @Override // com.aspose.words.zzYVR
    public final int zzZje() {
        return 14;
    }

    @Override // com.aspose.words.zzYVR
    public final int zzZjf() {
        return 13;
    }

    @Override // com.aspose.words.zzYVR
    public final int zzZjg() {
        return 12;
    }

    public final void zzZz(ArrayList<zzYAD> arrayList) {
        if (arrayList.size() == 0) {
            return;
        }
        zzYVQ zzyvq = (zzYVQ) ((zzYVQ) zz6x()).zzYo0();
        zzYVQ zzyvq2 = (zzYVQ) ((zzYVQ) zz6w()).zzYo1();
        int i = 0;
        boolean z = false;
        while (i < arrayList.size() - 1) {
            zzZMT zzzmt = (zzZMT) arrayList.get(i).zzY7l();
            i++;
            zzZMT zzzmt2 = (zzZMT) arrayList.get(i).zzY7l();
            ((zzYVQ) zzzmt.zz6x()).zzZZJ();
            ((zzYVQ) zzzmt2.zz6x()).zzZZJ();
            if (((zzYVQ) ((zzYVQ) zzzmt.zz6w()).zzYo1()) != ((zzYVQ) zzzmt2.zz6x())) {
                ((zzYVQ) zzzmt.zz6w()).zzu((zzYVQ) zzzmt2.zz6x());
                ((zzYVQ) zzzmt2.zz6x()).zzt((zzYVQ) zzzmt.zz6w());
                z = true;
            }
        }
        if (!z) {
            return;
        }
        zzY(((zzZMT) ((zzYAD) C21505OooO0Oo.OooO00o(1, arrayList)).zzY7l()).zz6x());
        zz6w().zzu(zzyvq2);
        if (zzyvq2 != null) {
            zzyvq2.zzt(zz6w());
        }
        zzYAD zzyad = (zzYAD) zzYVN.zzv((zzYVQ) zz6x());
        zzYVQ zzyvq3 = (zzYVQ) ((zzZMT) arrayList.get(0).zzY7l()).zz6x();
        if (zzyad.zzqh(2) == zzZZJ()) {
            zzZ(zzyvq3);
            zz6x().zzt(zzyvq);
            if (zzyvq != null) {
                zzyvq.zzu(zz6x());
                return;
            }
            return;
        }
        zzYMD zzymdZz6x = zz6x();
        while (true) {
            zzYVQ zzyvq4 = (zzYVQ) zzymdZz6x;
            if (((zzZMT) zzyvq4.zza9()).zzYzk().zzqh(2) == zzZZJ()) {
                zzYVQ zzyvq5 = (zzYVQ) zzyvq4.zzYo0();
                zzyvq5.zzu(zzyvq3);
                zzyvq3.zzt(zzyvq5);
                return;
            }
            zzymdZz6x = zzyvq4.zzYo1();
        }
    }
}
