package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.aspose.words.ref.Ref;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzUZ extends zzYBL {
    private zzUZ zzZvA;
    private boolean zzZvq;
    private int zzZvr;
    private zzZMW zzZvs;
    private zzZUE zzZvt;
    private zzTE zzZvu;

    private boolean zz0d() {
        for (zzUZ zzuz = this.zzZvA; zzuz != null && zzuz.zzZvA == this.zzZvA; zzuz = (zzUZ) zzuz.zzYo1()) {
            if (zzuz.zzZvs != null) {
                return true;
            }
        }
        return false;
    }

    private boolean zz0k() {
        zza9();
        zzZ2D zzz2d = (zzZ2D) ((zzZ2D) zza9()).zzYTp();
        return zz0l() && zzz2d != null && zzz2d.zzYJ4() && ((zzZ35) zzz2d.zzYTt()).getSectionStart() == 0;
    }

    private void zz0r() {
        zzZMW zzzmw = this.zzZvs;
        if (zzzmw != null) {
            zzzmw.zzY((zzTF) this);
        }
        zzZUE zzzue = this.zzZvt;
        if (zzzue != null) {
            zzzue.zzY((zzTF) this);
        }
    }

    private static void zzP(zzUZ zzuz) {
        while (zzuz != null) {
            zzUZ zzuz2 = null;
            while (zzuz != null) {
                zzuz.zzZvq = false;
                zzuz2 = zzuz;
                zzuz = (zzUZ) zzuz.zzYo1();
            }
            zzuz = zzuz2.zzYn(true);
        }
    }

    private static int zzQ(zzUZ zzuz) throws Exception {
        return zzuz.zz0o() ? ((zzYN8) zzuz.zzZZJ()).getWidth() - zzuz.getRight() : ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLu()[zzuz.getColumnIndex()] / 2;
    }

    private static int zzR(zzUZ zzuz) {
        return zzuz.zz4U() ? zzuz.getX() : ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLu()[((zzUZ) zzuz.zzYo0()).getColumnIndex()] / 2;
    }

    public static int zzS(zzUZ zzuz) throws Exception {
        int iMax = 0;
        for (zzUZ zzuz2 : zzuz.zz0c()) {
            if (!zzuz2.isEmpty()) {
                zzYMD zzymdZz6w = zzuz2.zz6w();
                if ((zzymdZz6w instanceof zzZ55) && zzY9R.zzlw(((zzYAU) ((zzZ55) zzymdZz6w).zz6x()).zzZo6())) {
                    zzymdZz6w = zzymdZz6w.zz5Y();
                }
                if (zzymdZz6w != null) {
                    iMax = Math.max(iMax, zzymdZz6w.getBottom() + ((zzTC) zzymdZz6w).zzZXQ());
                }
            }
        }
        return iMax;
    }

    private static com.aspose.words.internal.zzZG zzY(zzUZ zzuz, int i) throws Exception {
        if (zzuz.isEmpty() || zzuz.zz4U() || !((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLv()) {
            return null;
        }
        int i2 = -i;
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(com.aspose.words.internal.zzSA.zzF(com.aspose.words.internal.zzZPZ.zzZm(i2, 0)), com.aspose.words.internal.zzSA.zzF(com.aspose.words.internal.zzZPZ.zzZm(i2, zzS(zzuz.zzZvA))));
        zzzgZzZ.zzX(new com.aspose.words.internal.zzOU(com.aspose.words.internal.zzPV.zzKa));
        return zzzgZzZ;
    }

    public final int getColumnIndex() {
        zzUZ zzuz = this.zzZvA;
        int i = 0;
        while (this != zzuz) {
            zzuz = (zzUZ) zzuz.zzYo1();
            i++;
        }
        zza9();
        return i;
    }

    @Override // com.aspose.words.zzYMD
    public final int getContentHeight() throws Exception {
        if (!zzac()) {
            return 0;
        }
        if (this.zzZvr == Integer.MIN_VALUE) {
            zzYMD zzymdZzY8k = zzY8k();
            this.zzZvr = isEmpty() ? 0 : zzymdZzY8k.getY() + Math.max(zzymdZzY8k.getHeight(), zzymdZzY8k.zz0t());
        }
        return this.zzZvr;
    }

    public final ArrayList<zzYAD> zz01() throws Exception {
        ArrayList<zzYAD> arrayList = new ArrayList<>();
        zzYJR zzyjr = new zzYJR(this);
        while (true) {
            zzYAD zzyadZzYlX = zzyjr.zzYlX();
            if (zzyadZzYlX == null) {
                return arrayList;
            }
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzyadZzYlX);
        }
    }

    public final zzTC zz02() {
        zzTC zztc = null;
        for (zzUZ zzuz = this; zzuz != null && ((zzYN8) zzuz.zzZZJ()) == ((zzYN8) zzZZJ()); zzuz = (zzUZ) zzuz.zzYo1()) {
            zztc = (zzTC) zzuz.zz6x();
            if (zztc != null) {
                break;
            }
        }
        return zztc;
    }

    public final boolean zz03() {
        return this.zzZvq;
    }

    public final boolean zz04() throws Exception {
        if (zz4U()) {
            return false;
        }
        zzUZ zzuz = (zzUZ) zzYo0();
        if (zzuz.zzZvq) {
            return false;
        }
        while (zzuz.isEmpty() && !zzuz.zz0n()) {
            zzuz = (zzUZ) zzuz.zzYo0();
        }
        if (zzuz.isEmpty() || zzuz.zz6w().zz60() != 32) {
            return false;
        }
        zzZ55 zzz55 = (zzZ55) zzuz.zz6w();
        return (zzz55.zzYQc().zzZo6() != 21861 && zzY9R.zzlu(zzz55.zzYQc().zzZo6())) || zzz55.zzYQ4();
    }

    public final zzUZ[] zz05() {
        int length = ((zzZ35) ((zzZ2D) zza9()).zzYTt()).zzYLt().length;
        zzUZ[] zzuzArr = new zzUZ[length];
        for (int i = 0; i < length; i++) {
            zzUZ zzuz = new zzUZ();
            zzuzArr[i] = zzuz;
            zzuz.zzZvA = zzuzArr[0];
        }
        return zzuzArr;
    }

    public final zzUZ zz06() {
        if (((zzUZ) zzYo1()) != null) {
            return (zzUZ) zzYo1();
        }
        if (((zzZ2D) ((zzZ2D) zza9()).zzYTp()) != null) {
            return ((zzZ2D) ((zzZ2D) zza9()).zzYTp()).zzYJ9();
        }
        return null;
    }

    public final zzUZ zz07() {
        if (((zzUZ) zzYo0()) != null) {
            return (zzUZ) zzYo0();
        }
        if (((zzZ2D) ((zzZ2D) zza9()).zzYTo()) != null) {
            return ((zzZ2D) ((zzZ2D) zza9()).zzYTo()).zzYJ8();
        }
        return null;
    }

    public final zzZUE zz08() {
        return this.zzZvt;
    }

    public final zzZMW zz09() {
        return this.zzZvs;
    }

    public final zzUZ zz0H() {
        return this.zzZvA;
    }

    public final zzUZ zz0a() {
        zzUZ zzuz = this;
        while (zzuz != null && !zzuz.zz0o()) {
            zzuz = (zzUZ) zzuz.zzYo1();
        }
        return zzuz;
    }

    public final boolean zz0b() {
        for (zzUZ zzuz = this.zzZvA; zzuz != null && zzuz.zzZvA == this.zzZvA; zzuz = (zzUZ) zzuz.zzYo1()) {
            if (!zzuz.zzac()) {
                return true;
            }
            zzZMW zzzmw = zzuz.zzZvs;
            if (zzzmw != null && !zzzmw.zzac()) {
                return true;
            }
            zzZUE zzzue = zzuz.zzZvt;
            if (zzzue != null && !zzzue.zzac()) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList<zzUZ> zz0c() {
        ArrayList<zzUZ> arrayList = new ArrayList<>();
        for (zzUZ zzuz = this.zzZvA; zzuz != null && zzuz.zzZvA == this.zzZvA; zzuz = (zzUZ) zzuz.zzYo1()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzuz);
        }
        return arrayList;
    }

    public final boolean zz0e() {
        for (zzUZ zzuz = this.zzZvA; zzuz != null && zzuz.zzZvA == this.zzZvA; zzuz = (zzUZ) zzuz.zzYo1()) {
            if (!zzuz.isEmpty() || zzuz.zzZvs != null || zzuz.zzZvt != null) {
                return false;
            }
        }
        return true;
    }

    public final boolean zz0f() {
        for (zzUZ zzuz = this.zzZvA; zzuz != null && zzuz.zzZvA == this.zzZvA; zzuz = (zzUZ) zzuz.zzYo1()) {
            if (zzuz.zz6x() != null || zzuz.zz6w() != null) {
                return false;
            }
        }
        return true;
    }

    public final boolean zz0g() {
        zzZZJ();
        return ((zzYN8) zzZZJ()).zzYql() == this.zzZvA;
    }

    public final boolean zz0h() {
        zzZZJ();
        return ((zzUZ) ((zzYN8) zzZZJ()).zz6x()) == this.zzZvA;
    }

    public final boolean zz0i() throws Exception {
        zza9();
        if (zz0k()) {
            for (zzUZ zzuz = this.zzZvA; zzuz != null && zzuz.zzZvA == this.zzZvA; zzuz = (zzUZ) zzuz.zzYo1()) {
                if (!zzuz.isEmpty() && zzuz.zz6w().zz60() == 32) {
                    zzYAU zzyauZzYQc = ((zzZ55) zzuz.zz6w()).zzYQc();
                    if (zzY9R.zzmT(zzyauZzYQc.zzZo6())) {
                        return true;
                    }
                    if (zzY9R.zzlv(zzyauZzYQc.zzZo6())) {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean zz0j() {
        if (!zza9().zza7().zzYMP() && ((zzZ35) ((zzZ2D) zza9()).zzYTt()).zzYLl() == 1 && zz0d()) {
            return (zzab().zza7().zzZYM() && ((zzZ35) ((zzZ2D) zza9()).zzYTt()).zzYLt().length == 1) ? false : true;
        }
        return false;
    }

    public final boolean zz0l() {
        zza9();
        zza9();
        return ((zzZ2D) zza9()).zzYJ8().zzZvA == this.zzZvA;
    }

    public final boolean zz0m() {
        return this == ((zzUZ) ((zzYN8) zzZZJ()).zz6x());
    }

    public final boolean zz0n() {
        return this.zzZvA == this;
    }

    public final boolean zz0o() {
        return ((zzUZ) zzYo1()) == null || ((zzUZ) zzYo1()).zzZvA != this.zzZvA;
    }

    public final boolean zz0p() {
        return zzab().zzZoR() != null && zzab().zzZoR().zzYq5() == this.zzZvA;
    }

    public final void zz0q() throws Exception {
        int iMax;
        zzUZ zzuz;
        int x;
        int i;
        int iZzYqo;
        long jZzZN = ((zzZ2D) zza9()).zzZN(1, ((zzYN8) zzZZJ()).zzYqk());
        int i2 = (int) jZzZN;
        if (zz0h()) {
            iZzYqo = ((zzYN8) zzZZJ()).zzYqo();
            zzuz = this;
            x = i2;
            i = 0;
        } else {
            if (this.zzZvq) {
                zzUZ zzuzZzYm = zzYm(true);
                iMax = zzuzZzYm.getY();
                int iZzYqn = ((zzYN8) zzZZJ()).zzYqn() - iMax;
                zzuz = this;
                i = 0;
                do {
                    zzuz.setX(zzuzZzYm.getX());
                    zzuz.setWidth(zzuzZzYm.getWidth());
                    zzuz.setY(iMax);
                    zzuz.setHeight(iZzYqn);
                    zzuzZzYm = (zzUZ) zzuzZzYm.zzYo1();
                    x = zzuzZzYm.getX();
                    i++;
                    zzuz = (zzUZ) zzuz.zzYo1();
                } while (zzuz.zzZvq);
            } else {
                zzUZ zzuzZzYm2 = this;
                iMax = 0;
                do {
                    zzuzZzYm2 = zzuzZzYm2.zzYm(true);
                    for (zzUZ zzuz2 = zzuzZzYm2; zzuz2 != null; zzuz2 = (zzUZ) zzuz2.zzYo1()) {
                        iMax = Math.max(iMax, zzuz2.getBottom());
                    }
                } while (zzuzZzYm2.zzZvq);
                zzuz = this;
                x = i2;
                i = 0;
            }
            iZzYqo = iMax;
        }
        int iMax2 = Math.max(0, ((zzYN8) zzZZJ()).zzYqn() - iZzYqo);
        int[] iArrZzYLt = ((zzZ35) ((zzZ2D) zza9()).zzYTt()).zzYLt();
        while (zzuz != null && zzuz.zzZvA == this.zzZvA) {
            zzuz.setX(x);
            zzuz.setWidth(iArrZzYLt[i]);
            zzuz.setY(iZzYqo);
            zzuz.setHeight(iMax2);
            x = zzuz.getRight() + ((zzZ35) ((zzZ2D) zza9()).zzYTt()).zzYLu()[i];
            if (zz5T()) {
                zzuz.setX(zzYEK.zzZ(zzuz, i2, (int) (jZzZN >> 32)));
            }
            zzuz = (zzUZ) zzuz.zzYo1();
            i++;
        }
    }

    @Override // com.aspose.words.zzYMD
    public final zzTF zz0s() throws Exception {
        zzUZ zzuzZz0a = zz0a();
        zzUZ[] zzuzArrZz05 = zz05();
        for (int i = 0; i < zzuzArrZz05.length; i++) {
            ((zzZ2D) zza9()).zzZ(zzuzZz0a, null, zzuzArrZz05[i], true);
            zzuzZz0a = zzuzArrZz05[i];
        }
        return zzYn(false);
    }

    @Override // com.aspose.words.zzYMD
    public final int zz0t() throws Exception {
        if (isEmpty()) {
            return 0;
        }
        zzYMD zzymdZzY8k = zzY8k();
        if (zzymdZzY8k != null && zzymdZzY8k.zz60() == 32) {
            zzZ55 zzz55 = (zzZ55) zzymdZzY8k;
            if (zzz55.zzYQ6() && !zzz55.zzYQ9()) {
                if (zzymdZzY8k == zz6x()) {
                    return 0;
                }
                zzymdZzY8k = zzj(zzymdZzY8k.zz5Y());
            }
        }
        if (zzymdZzY8k == null) {
            return 0;
        }
        return zzymdZzY8k.getY() + zzymdZzY8k.zz0t();
    }

    @Override // com.aspose.words.zzYMD
    public final void zz0u() {
        this.zzZvr = Integer.MIN_VALUE;
    }

    @Override // com.aspose.words.zzYMD
    public final zzTE zz0v() {
        if (this.zzZvu == null) {
            this.zzZvu = new zzTE(this);
        }
        return this.zzZvu;
    }

    public final boolean zz4U() {
        return ((zzUZ) zzYo0()) == null || ((zzUZ) zzYo0()).zzZvA != this.zzZvA;
    }

    @Override // com.aspose.words.zzTF
    public final boolean zz5T() {
        return ((zzZ35) ((zzZ2D) zza9()).zzYTt()).zzZz();
    }

    @Override // com.aspose.words.zzYMD
    public final zzYMD zz5Y() {
        zza9();
        zzZZJ();
        if (((zzUZ) zzYo0()) != null) {
            if (((zzYN8) ((zzUZ) zzYo0()).zzZZJ()) == ((zzYN8) zzZZJ())) {
                return (zzUZ) zzYo0();
            }
            return null;
        }
        zzUZ zzuzZzYm = zzYm(true);
        if (zzuzZzYm == null || ((zzYN8) zzuzZzYm.zzZZJ()) != ((zzYN8) zzZZJ())) {
            return null;
        }
        return zzuzZzYm.zz0a();
    }

    @Override // com.aspose.words.zzYMD
    public final zzYMD zz5Z() {
        zza9();
        zzZZJ();
        if (((zzUZ) zzYo1()) != null) {
            if (((zzYN8) ((zzUZ) zzYo1()).zzZZJ()) == ((zzYN8) zzZZJ())) {
                return (zzUZ) zzYo1();
            }
            return null;
        }
        zzUZ zzuzZzYn = zzYn(true);
        if (zzuzZzYn == null || ((zzYN8) zzuzZzYn.zzZZJ()) != ((zzYN8) zzZZJ())) {
            return null;
        }
        return zzuzZzYn;
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 2;
    }

    public final void zzNc(int i) throws Exception {
        for (zzUZ zzuz = this.zzZvA; zzuz != null && zzuz.zzZvA == this.zzZvA; zzuz = (zzUZ) zzuz.zzYo1()) {
            zzuz.setHeight(i);
        }
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final boolean zzNd(int i) throws Exception {
        if (super.zzNd(i)) {
            return true;
        }
        if ((i & 4) != 0) {
            zzZMW zzzmw = this.zzZvs;
            if (zzzmw != null) {
                zzzmw.zzNd(i);
            }
            zzZUE zzzue = this.zzZvt;
            if (zzzue != null) {
                zzzue.zzNd(i);
            }
        }
        zzP(this);
        return false;
    }

    public final void zzT(zzUZ zzuz) {
        this.zzZvA = zzuz;
    }

    public final void zzYl(boolean z) {
        this.zzZvq = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzUZ zzYm(boolean z) {
        zzUZ zzuz = this;
        do {
            zzUZ zzuz2 = (zzUZ) zzuz.zzZvA.zzYo0();
            while (zzuz2 != null && zzuz2 != zzuz2.zzZvA) {
                zzuz2 = (zzUZ) zzuz2.zzYo0();
            }
            if (zzuz2 == null && z && ((zzZ2D) ((zzZ2D) zzuz.zza9()).zzYTo()) != null) {
                zzZ2D zzz2d = (zzZ2D) ((zzZ2D) zzuz.zza9()).zzYTo();
                while (zzz2d != null && zzz2d.zzYJ8() == null) {
                    zzz2d = (zzZ2D) zzz2d.zzYTo();
                }
                if (zzz2d != null) {
                    zzuz = zzz2d.zzYJ8().zzZvA;
                }
            } else {
                zzuz = zzuz2;
            }
            if (zzuz == null) {
                break;
            }
        } while (((zzYN8) zzuz.zzZZJ()) == null);
        return zzuz;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzUZ zzYn(boolean z) {
        zzUZ zzuzZzYJ9 = this;
        do {
            zzUZ zzuz = zzuzZzYJ9;
            while (zzuz != null && zzuz.zzZvA == zzuzZzYJ9.zzZvA) {
                zzuz = (zzUZ) zzuz.zzYo1();
            }
            if (zzuz == null && z) {
                zzZ2D zzz2d = (zzZ2D) ((zzZ2D) zzuzZzYJ9.zza9()).zzYTp();
                while (zzz2d != null && zzz2d.zzYJ9() == null) {
                    zzz2d = (zzZ2D) zzz2d.zzYTp();
                }
                if (zzz2d != null) {
                    zzuzZzYJ9 = zzz2d.zzYJ9();
                }
            } else {
                zzuzZzYJ9 = zzuz;
            }
            if (zzuzZzYJ9 == null) {
                break;
            }
        } while (((zzYN8) zzuzZzYJ9.zzZZJ()) == null);
        return zzuzZzYJ9;
    }

    @Override // com.aspose.words.zzYMD
    public final void zzZ(zzTE zzte) {
        this.zzZvu = zzte;
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final com.aspose.words.internal.zzZL zzbF() throws Exception {
        if (super.zzbF() == null) {
            com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
            ArrayList<com.aspose.words.internal.zzZL> arrayListZzZ = zz5.zzZ(this);
            Ref ref = new Ref(null);
            Ref ref2 = new Ref(null);
            zz5.zzZ(this, (Ref<ArrayList<com.aspose.words.internal.zzZL>>) ref, (Ref<ArrayList<com.aspose.words.internal.zzZL>>) ref2);
            ArrayList arrayList = (ArrayList) ref.get();
            ArrayList arrayList2 = (ArrayList) ref2.get();
            com.aspose.words.internal.zzZQG.zzZ(arrayList2, (Iterable) arrayListZzZ);
            com.aspose.words.internal.zzZQG.zzZ(arrayList2, (Iterable) arrayList);
            int iZzR = zzR(this);
            com.aspose.words.internal.zzZG zzzgZzY = zzY(this, iZzR);
            if (zzzgZzY != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList2, zzzgZzY);
                iZzR += com.aspose.words.internal.zzSA.zzYy(2);
            }
            zz5.zzZ(zzg, new com.aspose.words.internal.zzZQ5(-iZzR, 0, getWidth() + iZzR + zzQ(this), getHeight()));
            zz5.zzZ(zzg, getX(), getY());
            zzg.zzZ(arrayList2);
            super.zzF(zzg);
        }
        return super.zzbF();
    }

    @Override // com.aspose.words.zzTF
    public final void zzZ(zzYMD zzymd, zzTF zztf) throws Exception {
        zzab().zzZoS();
        if (zztf == this) {
            return;
        }
        if (zztf == null) {
            zztf = zz0s();
        }
        zzUZ zzuz = (zzUZ) zztf;
        zzZNC.zzJ(zzuz);
        if (!zzTD.zzZ(this, zzuz)) {
            super.zzZ(zzymd, zztf);
            return;
        }
        int iZzYjN = zzymd.zz60() == 8 ? ((zzYIA) zzymd).zzYjN() : 0;
        ArrayList<zzYMD> arrayListZzZ = zzZ((zzYMD) null, zzymd);
        zzTD.zzZ(this, zztf);
        for (int i = 0; i < arrayListZzZ.size(); i++) {
            arrayListZzZ.get(i).zzY(this);
        }
        zz0r();
        zzuz.zz0r();
        zztf.zzZ(zzymd);
        zztf.zzY(zz6w());
        zzTC zztc = arrayListZzZ.size() <= 0 ? null : (zzTC) C21505OooO0Oo.OooO00o(1, arrayListZzZ);
        zzY((zzYMD) zztc);
        if (zztc == null) {
            zzZ((zzYMD) null);
        }
        zzY44.zzd(zzymd);
        if (zzymd.zz60() == 8 && iZzYjN != ((zzYIA) zzymd).zzYjN()) {
            zzymd.zzNd(5);
        }
        if (zz0e()) {
            remove();
        }
    }

    public final void zzZ(zzZMW zzzmw) {
        zzZMW zzzmw2 = this.zzZvs;
        if (zzzmw2 != null) {
            zzzmw2.zzY((zzTF) null);
        }
        if (zzzmw != null) {
            zzzmw.zzY((zzTF) this);
        }
        this.zzZvs = zzzmw;
    }

    public final void zzZ(zzZUE zzzue) {
        zzZUE zzzue2 = this.zzZvt;
        if (zzzue2 != null) {
            zzzue2.zzY((zzTF) null);
        }
        if (zzzue != null) {
            zzzue.zzY((zzTF) this);
        }
        this.zzZvt = zzzue;
    }
}
