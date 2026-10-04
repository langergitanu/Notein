package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzV0 {
    private zzZMU zzZvx;
    private zzYBK zzZvy;
    private int zzZvz;
    private ArrayList<zzYAD> zzZvw = new ArrayList<>();
    private ArrayList<zzYAD> zzZvv = zz0D().zz01();

    private zzV0(zzZMU zzzmu, zzYBK zzybk, int i) throws Exception {
        this.zzZvx = zzzmu;
        this.zzZvy = zzybk;
        this.zzZvz = i;
    }

    private void zz0A() throws Exception {
        boolean z;
        if (zz0D().zzab().zza7().zzZYM()) {
            return;
        }
        zzTC zztc = (zzTC) zz0D().zz6w();
        zzTC zztc2 = (zzTC) zztc.zz5Y();
        boolean z2 = false;
        if (zztc2 != null && zztc2.zza9() == zztc.zza9() && (zztc.zza9() instanceof zzYMM)) {
            zzYMM zzymm = (zzYMM) zztc.zza9();
            zzZ55 zzz55ZzYos = zzymm.zzYos();
            if (((zzZ37) zzymm.zzYTt()).zzYLU()) {
                int i = 0;
                z = true;
                for (zzYMD zzymdZz5Z = zzz55ZzYos; zzymdZz5Z != null; zzymdZz5Z = zzymdZz5Z.zz5Z()) {
                    if (i > 3) {
                        z = false;
                    }
                    i++;
                }
            } else {
                z = true;
            }
            if (z) {
                zztc2 = (zzTC) zzz55ZzYos.zz5Y();
            }
        }
        zzYBK zzybk = this.zzZvy;
        if (zzZ7C.zzQ(zztc) || (zztc2 != null && zzZ7C.zzQ(zztc2))) {
            z2 = true;
        }
        zzybk.zzQN(z2);
    }

    private void zz0B() throws Exception {
        this.zzZvw.size();
        int iZz0E = zz0E();
        int iZz0t = 0;
        for (int i = 0; i <= this.zzZvw.size() - 1; i++) {
            zzZMT zzzmt = (zzZMT) this.zzZvw.get(i).zzY7l();
            zzYVQ zzyvq = (zzYVQ) zzzmt.zz6x();
            if (zzyvq.zzqh(2) == zz0D()) {
                iZz0t += zzyvq.zz0t();
                zzUZ zzuz = (zzUZ) zz0D().zzYo1();
                zzyvq.zzZ(zzuz.zz09() != null ? zzuz.zz09() : ((zzYVI) zzzmt.zza9()).zzY(zzuz, true), true);
            }
        }
        this.zzZvw.clear();
        if (iZz0t == 0 || zz0D().zz09() == null) {
            return;
        }
        zz0D().zz09().zzNd(4);
        this.zzZvx.zzZ(zz0D().zz09(), iZz0E - iZz0t, false, true);
    }

    private void zz0C() throws Exception {
        while (this.zzZvz < zzZMW.zzI(zz0D()) + zz0E() && zz0D().zz09() != null) {
            this.zzZvx.zzZ(zz0D().zz09(), zz0E() - 1, false, true);
        }
        if (zz0D().zz09() == null) {
            this.zzZvy.zzZ((zzYBL) zz0D(), this.zzZvz, true, false);
        }
    }

    private zzUZ zz0D() {
        return (zzUZ) this.zzZvy.zzY8i();
    }

    private int zz0E() throws Exception {
        if (zz0D().zz09() == null) {
            return 0;
        }
        return zz0D().zz09().zz0t();
    }

    private boolean zz0F() {
        zz0D().zza7();
        return zz0D().zz09() == null || zz0x();
    }

    private boolean zz0G() throws Exception {
        int i;
        if (this.zzZvv.size() == 0 && this.zzZvx.isOverflow()) {
            zz0D().zz6x().zzN((zzUZ) zz0D().zzYo1());
            return false;
        }
        zz0w();
        int i2 = 0;
        while (true) {
            RefInt refInt = new RefInt(i2);
            boolean zZzS = zzS(refInt);
            i = refInt.get();
            if (zZzS) {
                if (((zzUZ) zz0D().zzYo1()) == null) {
                    return false;
                }
            } else {
                if (zz0D().isEmpty()) {
                    return false;
                }
                int iZz0t = this.zzZvy.zz0t();
                int iZz0t2 = this.zzZvy.zz0t();
                if (zzNf(iZz0t2)) {
                    return true;
                }
                if (iZz0t2 > this.zzZvy.zz0t()) {
                    zz0z();
                }
                if (iZz0t <= this.zzZvy.zz0t()) {
                    zz0C();
                    return false;
                }
                if (zzNg(i)) {
                    break;
                }
                i2 = i;
            }
        }
        return zzNj(i);
    }

    private void zz0w() throws Exception {
        if (zz0D().zza9().zza7().zzYMP() && this.zzZvv.size() > 0 && zzU(zz0D())) {
            zzNi(((zzZ55) ((zzZMT) this.zzZvv.get(0).zzY7l()).zzYzk().zzqh(32)).getY());
        }
    }

    private boolean zz0x() {
        zzYVN zzyvn = (zzYVN) ((zzYVQ) zz0D().zz09().zz6w()).zza9();
        zzUZ zzuz = (zzUZ) zzyvn.zzYzk().zzqh(2);
        zzUZ zzuz2 = (zzUZ) zzyvn.zz6x().zzqh(2);
        return ((zzuz2.zza7().zzZYM() || zz0D().zza9().zza7().zzYMP()) && ((zzZ2D) zzuz2.zza9()) != ((zzZ2D) zzuz.zza9())) ? zzuz2.zzZ8m() == zzuz.zzZ8m() : zzyvn.zzYzk().zzqh(2) == zzyvn.zz6x().zzqh(2);
    }

    private boolean zz0y() {
        if (((zzUZ) zz0D().zzYo1()).zz09() == null) {
            return false;
        }
        zzYVN zzyvn = (zzYVN) ((zzYVQ) zz0D().zz09().zz6w()).zza9();
        zzYVN zzyvn2 = (zzYVN) ((zzYVQ) ((zzUZ) zz0D().zzYo1()).zz09().zz6x()).zza9();
        return zzyvn == zzyvn2 || ((zzZ55) zzyvn2.zzYzk().zzZZJ()) == ((zzZ55) zzyvn.zzYzk().zzZZJ());
    }

    private void zz0z() {
        this.zzZvw.clear();
        for (int size = this.zzZvv.size() - 1; size >= 0; size--) {
            zzYAD zzyad = this.zzZvv.get(size);
            if (zzyad.zzqh(2) != zz0D()) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzZvw, zzyad);
                this.zzZvv.remove(size);
            }
        }
    }

    private boolean zzL(zzWT zzwt) {
        for (zzYMD zzymdZz5Z = (zzTC) zzwt.zz6x(); zzymdZz5Z != null; zzymdZz5Z = zzymdZz5Z.zz5Z()) {
            if (zzymdZz5Z.zz60() == 8 ? zzZ((zzYIA) zzymdZz5Z) : zzZ55.zzZ((zzZ55) zzymdZz5Z, zzYAD.class)) {
                return true;
            }
        }
        return false;
    }

    private boolean zzNe(int i) throws Exception {
        zzYVN zzyvn = (zzYVN) ((zzYVQ) zz0D().zz09().zz6w()).zza9();
        zzYAD zzyad = (zzYAD) com.aspose.words.internal.zzZKW.zzZ(zzyvn.zzYzk(), zzYAD.class);
        this.zzZvx.zzZ(zz0D().zz09(), i, false, true);
        if (zz0D().zz09() == null) {
            this.zzZvw.clear();
            return true;
        }
        if (zzyvn == ((zzYVN) ((zzYVQ) zz0D().zz09().zz6w()).zza9())) {
            return false;
        }
        this.zzZvw.contains(zzyad);
        this.zzZvw.remove(zzyad);
        return true;
    }

    private boolean zzNf(int i) throws Exception {
        zz0A();
        zzTC zztc = (zzTC) zz0D().zz6x();
        zzUZ zzuz = (zzUZ) ((zzYVN) ((zzYVQ) zz0D().zz09().zz6x()).zza9()).zzYzk().zzqh(2);
        boolean z = zzZ(zztc) && zzuz == zz0D();
        if (this.zzZvy.zzZ((zzYBL) zz0D(), i - 1, false, true)) {
            return true;
        }
        return zz0D().isEmpty() && (z || (zz0D().zzY8m() && zzuz == zz0D())) && this.zzZvy.zzZ((zzYBL) zz0D(), i, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        zz0B();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzNg(int i) throws Exception {
        if (this.zzZvw.size() <= 0) {
            return false;
        }
        int iZz0E = zz0E();
        while (true) {
            if (this.zzZvz >= zz0E() + i) {
                break;
            }
            zzYAD zzyad = (zzYAD) com.aspose.words.internal.zzZKW.zzZ(((zzYVN) ((zzYVQ) zz0D().zz09().zz6w()).zza9()).zzYzk(), zzYAD.class);
            if (zzyad == null || !this.zzZvw.contains(zzyad)) {
                break;
            }
            iZz0E--;
            boolean zZzNe = zzNe(iZz0E);
            if (iZz0E > zz0E()) {
                iZz0E = zz0E();
            }
            if (zZzNe) {
                if (zz0D().zz09() == null || this.zzZvw.size() == 0) {
                    break;
                }
                if (zz0D().zza7().zzZYM()) {
                    zz0B();
                    break;
                }
            }
        }
        return this.zzZvz >= zzZMW.zzI(zz0D()) + zz0E();
    }

    private boolean zzNh(int i) throws Exception {
        zz0D().zza7();
        if (zz0D().zz09() == null) {
            return false;
        }
        if (((zzZ35) ((zzZ2D) zz0D().zza9()).zzYTt()).zzYLt().length > 1 && !zz0x()) {
            return true;
        }
        if (((zzTC) ((zzUZ) zz0D().zzYo1()).zz6x()) == null) {
            this.zzZvw.clear();
            return false;
        }
        zzTC zztc = (zzTC) ((zzUZ) zz0D().zzYo1()).zz6x();
        int iZz60 = zztc.zz60();
        if (iZz60 == 8) {
            return zzZ((zzYIA) zztc, i);
        }
        if (iZz60 == 32) {
            return zzZ((zzZ55) zztc, i);
        }
        throw new IllegalStateException("Unexpected part type.");
    }

    private boolean zzNi(int i) throws Exception {
        if (this.zzZvy.zzZ((zzYBL) zz0D(), i, true, false)) {
            return true;
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) this.zzZvv, (Iterable) this.zzZvw);
        zz0z();
        if (this.zzZvw.size() > 0) {
            zz0B();
        }
        return false;
    }

    private boolean zzNj(int i) throws Exception {
        if (zz0D().zza7().zzZYM()) {
            if (zz0D().zz09() == null || zz0x()) {
                return false;
            }
            return zzNi(i);
        }
        this.zzZvy.zzQN(false);
        if (zzNh(i)) {
            return zzNi(i);
        }
        if (zz0F()) {
            return zzNi(this.zzZvy.zz0t());
        }
        if (this.zzZvw.size() > 0) {
            zz0B();
        }
        return false;
    }

    private boolean zzS(RefInt refInt) throws Exception {
        refInt.set(zzZMW.zzI(zz0D()));
        return refInt.get() + (zz0D().zz09() != null ? zz0D().zz09().getHeight() : 0) <= this.zzZvz;
    }

    public static boolean zzU(zzUZ zzuz) {
        zzUZ zzuzZz0H = zzuz.zz0H();
        while (zzuz != null && zzuz.zz0H() == zzuzZz0H) {
            zzZMW zzzmwZz09 = zzuz.zz09();
            if (zzzmwZz09 == null) {
                zzuz = (zzUZ) zzuz.zzYo0();
            } else {
                if (((zzZ2D) ((zzUZ) ((zzZMT) ((zzYVQ) zzzmwZz09.zz6x()).zza9()).zzYzk().zzqh(2)).zza9()) != ((zzZ2D) zzuz.zza9())) {
                    return true;
                }
                zzuz = (zzUZ) zzuz.zzYo0();
            }
        }
        return false;
    }

    private static boolean zzV(zzYMM zzymm) {
        Iterator<zzYMD> it = zzymm.zzA(null).iterator();
        while (it.hasNext()) {
            if (zzZ55.zzZ((zzZ55) it.next(), zzYAD.class)) {
                return true;
            }
        }
        return false;
    }

    private boolean zzW(zzWT zzwt, int i) throws Exception {
        zz0D().zza7();
        zzTC zztc = (zzTC) zzwt.zz6x();
        int iZz60 = zztc.zz60();
        if (iZz60 == 8) {
            return false;
        }
        if (iZz60 != 32) {
            throw new IllegalStateException("Unexpected part type.");
        }
        if (zzV((zzYMM) com.aspose.words.internal.zzZKW.zzZ(zztc.zza9(), zzYMM.class))) {
            return zzZ((zzZ55) zztc, i);
        }
        return false;
    }

    public static boolean zzZ(zzYBK zzybk, zzZMU zzzmu, int i) throws Exception {
        return new zzV0(zzzmu, zzybk, i).zz0G();
    }

    private boolean zzZ(zzYIA zzyia, int i) throws Exception {
        zz0D().zza7();
        if (zzZ7C.zzQ(zzyia)) {
            return false;
        }
        for (zzWT zzwt = (zzWT) zzyia.zz6x(); zzwt != null; zzwt = (zzWT) zzwt.zz5Z()) {
            if (!zzwt.isEmpty() && !zzwt.isVirtual() && zzW(zzwt, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean zzW(zzYMM zzymm) {
        zzZ37 zzz37 = (zzZ37) zzymm.zzYTt();
        zzz37.zzYLX();
        if (zzz37.zzYLW()) {
            return true;
        }
        zzYVN zzyvn = (zzYVN) ((zzYVQ) zz0D().zz09().zz6w()).zza9();
        zzZMW zzzmwZz09 = ((zzUZ) zz0D().zzYo1()).zz09();
        return zzzmwZz09 == null || zzyvn == ((zzYVN) ((zzYVQ) zzzmwZz09.zz6x()).zza9()) || ((zzZ55) zzyvn.zzYzk().zzZZJ()) == zzymm.zzYSj();
    }

    private boolean zzZ(zzZ55 zzz55, int i) throws Exception {
        zz0D().zza7();
        zzYMM zzymm = (zzYMM) zzz55.zza9();
        if (!zzV(zzymm)) {
            return true;
        }
        boolean z = zzz55.zzYQ3() && zzymm.zzYSj() == zzz55;
        if (!zz0x() && (!((zzZ37) zzymm.zzYTt()).zzYLT() || z)) {
            return true;
        }
        if (z) {
            return (zzZMW.zzI(zz0D()) + zz0D().zz09().getHeight()) + zzz55.zz0t() <= this.zzZvz;
        }
        zzZ37 zzz37 = (zzZ37) zzymm.zzYTt();
        if (!zzz37.zzYLT() || zzz55.zzZZJ().zz60() == 16) {
            return false;
        }
        if (zzz37.zzYLX()) {
            return zzW(zzymm);
        }
        if (zzz37.zzYLU()) {
            return zzZ(zzymm, i);
        }
        zzz37.zzYLW();
        return zz0y();
    }

    private boolean zzZ(zzTC zztc) {
        zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zztc, zzZ55.class);
        if (zzz55 != null) {
            return zzV((zzYMM) zzz55.zza9());
        }
        return zzZ((zzYIA) com.aspose.words.internal.zzZKW.zzZ(zztc, zzYIA.class));
    }

    private boolean zzZ(zzYMM zzymm, int i) throws Exception {
        ArrayList<zzYMD> arrayListZzA = zzymm.zzA(null);
        return (arrayListZzA.size() < 4 || !zz0x() || (zzymm.zzYos().zzZZJ() != zzymm.zzYSj().zzZZJ() && ((zzYMD) C21505OooO0Oo.OooO00o(3, arrayListZzA)).zzZZJ() == ((zzYMD) C21505OooO0Oo.OooO00o(2, arrayListZzA)).zzZZJ())) && i + zz0E() < this.zzZvz;
    }

    private boolean zzZ(zzYIA zzyia) {
        for (zzWT zzwt = (zzWT) zzyia.zz6x(); zzwt != null; zzwt = (zzWT) zzwt.zz5Z()) {
            if (!zzwt.isEmpty() && !zzwt.isVirtual() && zzL(zzwt)) {
                return true;
            }
        }
        return false;
    }
}
