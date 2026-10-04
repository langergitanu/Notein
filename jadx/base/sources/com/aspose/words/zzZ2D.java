package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.aspose.words.ref.Ref;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzZ2D extends zzYCT {
    private zzUZ zzY4q;
    private zzUZ zzY4r;
    private zzYMD zzY4s;
    private zzYMD zzY4t;
    private int zzY4u;
    private int zzY4v;

    private zzTF zzD(zzUZ zzuz) throws Exception {
        if (!zzuz.zz0n()) {
            zzuz.zz0H().zza9();
            zzuz.zz0H().zzZZJ();
            return (zzYN8) zzuz.zz0H().zzZZJ();
        }
        zzYMD zzymd = this.zzY4t;
        if (((zzYN8) zzymd) != null && ((zzYN8) zzymd) == ((zzYN8) this.zzY4s) && ((zzYN8) zzymd).isEmpty()) {
            return (zzYN8) this.zzY4t;
        }
        zzUZ zzuzZzYm = zzuz.zzYm(true);
        zzUZ zzuzZzYn = zzuz.zzYn(true);
        if (zzuzZzYm == null && zzuzZzYn == null) {
            zzYN8 zzyn8 = new zzYN8();
            zzZ(null, null, zzyn8, true);
            return zzyn8;
        }
        int iZzU = zzU(zzuzZzYm, zzuzZzYn);
        boolean z = (iZzU & 3) == 2;
        int i = iZzU & (-4);
        if (i == 16) {
            zzyn8 = z ? (zzYN8) zzuzZzYm.zzZZJ() : (zzYN8) zzuzZzYn.zzZZJ();
        } else if (i == 32) {
            zzYN8 zzyn82 = new zzYN8();
            if (z || ((zzYN8) zzuzZzYn.zzZZJ()) == ((zzYN8) ((zzZ2D) zzuzZzYn.zza9()).zzY4t)) {
                zzZ(z ? (zzYN8) zzuzZzYm.zzZZJ() : null, z ? null : (zzYN8) zzuzZzYn.zzZZJ(), zzyn82, true);
            } else {
                zzZ(null, (zzYN8) ((zzZ2D) zzuzZzYn.zza9()).zzY4t, zzyn82, true);
            }
            zzyn8 = zzyn82;
        } else if (i != 48) {
            com.aspose.words.internal.zzZKN.format("Invalid action {0} in GetContainerForColumn.", Integer.valueOf(iZzU));
        } else {
            ((zzYN8) zzuzZzYm.zzZZJ()).zzw(zzuzZzYm);
            zzyn8 = z ? (zzYN8) zzuzZzYm.zzZZJ() : (zzYN8) zzuzZzYn.zzZZJ();
            zzyn8.zza9();
            ((zzUZ) zzyn8.zz6x()).zza9();
        }
        zzYMD zzymd2 = this.zzY4t;
        if (((zzYN8) zzymd2) == null || ((zzYN8) ((zzYN8) zzymd2).zzYo0()) == zzyn8) {
            this.zzY4t = zzyn8;
        }
        zzYMD zzymd3 = this.zzY4s;
        if (((zzYN8) zzymd3) != null && ((zzYN8) ((zzYN8) zzymd3).zzYo1()) != zzyn8) {
            return zzyn8;
        }
        this.zzY4s = zzyn8;
        return zzyn8;
    }

    private static zzTF zzR(zzTF zztf) {
        zzTC zztcZzZXK = (zzTC) zztf;
        while (zztcZzZXK != null) {
            zztcZzZXK = zztcZzZXK.zzZXK();
            if (zztcZzZXK != null && zztcZzZXK.zzZZJ() != null) {
                break;
            }
        }
        return zztcZzZXK;
    }

    private zzTF zzS(zzTF zztf) {
        zzTF zztfZzQ = zzQ(zztf);
        if (zztfZzQ == null) {
            zztfZzQ = zzR(zztf);
        }
        return zztfZzQ != null ? zztfZzQ.zzZZJ() : this.zzY4r;
    }

    private zzTF zzT(zzTF zztf) throws Exception {
        return this.zzY4r == null ? zzYJ2() : zzS(zztf);
    }

    private int zzU(zzUZ zzuz, zzUZ zzuz2) {
        if (zzuz == null && zzuz2 == null) {
            throw new IllegalStateException();
        }
        if (zzuz2 == null) {
            return (this == ((zzZ2D) zzuz.zza9()) || !zzYJ4()) ? 34 : 18;
        }
        if (zzuz == null) {
            return (this == ((zzZ2D) zzuz2.zza9()) || !((zzZ2D) zzuz2.zza9()).zzYJ4()) ? 33 : 17;
        }
        if (this == ((zzZ2D) zzuz.zza9()) && this == ((zzZ2D) zzuz2.zza9())) {
            return 34;
        }
        if (this != ((zzZ2D) zzuz.zza9()) && this != ((zzZ2D) zzuz2.zza9())) {
            if (((zzYN8) zzuz.zzZZJ()) == ((zzYN8) zzuz2.zzZZJ())) {
                return zzYJ4() ? 18 : 49;
            }
            if (zzYJ4()) {
                return 18;
            }
            return ((zzZ2D) zzuz2.zza9()).zzYJ4() ? 17 : 34;
        }
        if (this != ((zzZ2D) zzuz.zza9())) {
            zzuz2.zza9();
            if (((zzYN8) zzuz.zzZZJ()) == ((zzYN8) zzuz2.zzZZJ())) {
                return 50;
            }
            return zzYJ4() ? 18 : 34;
        }
        zzuz2.zza9();
        if (((zzYN8) zzuz.zzZZJ()) == ((zzYN8) zzuz2.zzZZJ())) {
            return 49;
        }
        return ((zzZ2D) zzuz2.zza9()).zzYJ4() ? 17 : 34;
    }

    private void zzV(zzUZ zzuz, zzUZ zzuz2) throws Exception {
        if (zzuz.zz09() != null) {
            zzuz.zz09().zzNd(5);
        }
        if (zzuz.zz08() != null) {
            zzuz.zz08().zzNd(5);
        }
        while (zzuz2 != null) {
            if (zzuz2.zz09() != null) {
                zzuz2.zz09().zzZ(((zzZ2C) zza9()).zzab().zzZoZ().zzY(zzuz, true));
            }
            if (zzuz2.zz08() != null) {
                zzuz2.zz08().zzZ(((zzZ2C) zza9()).zzab().zzZoY().zzY(zzuz, true));
            }
            zzuz2 = (zzUZ) zzuz2.zzYo1();
        }
    }

    private zzYN8 zzYJ0() {
        zzZ2D zzz2d = (zzZ2D) zzYTp();
        while (zzz2d != null) {
            zzYMD zzymd = zzz2d.zzY4t;
            if (((zzYN8) zzymd) != null && ((zzYN8) this.zzY4s) != ((zzYN8) zzymd)) {
                break;
            }
            zzz2d = (zzZ2D) zzz2d.zzYTp();
        }
        if (zzz2d == null) {
            return null;
        }
        return (zzYN8) zzz2d.zzY4t;
    }

    private zzYN8 zzYJ1() {
        zzZ2D zzz2d = (zzZ2D) zzYTo();
        while (zzz2d != null) {
            zzYMD zzymd = zzz2d.zzY4s;
            if (((zzYN8) zzymd) != null && ((zzYN8) this.zzY4t) != ((zzYN8) zzymd)) {
                break;
            }
            zzz2d = (zzZ2D) zzz2d.zzYTo();
        }
        if (zzz2d == null) {
            return null;
        }
        return (zzYN8) zzz2d.zzY4s;
    }

    private zzTF zzYJ2() throws Exception {
        int columnsCount = ((zzZ35) zzYTt()).getColumnsCount();
        zzUZ zzuz = null;
        while (true) {
            int i = columnsCount - 1;
            if (columnsCount <= 0) {
                return this.zzY4r;
            }
            zzUZ zzuz2 = new zzUZ();
            zzuz2.zzT(zzuz == null ? zzuz2 : zzuz.zz0H());
            zzZ(zzuz, null, zzuz2, true);
            zzuz2.zzZZJ();
            zzuz = zzuz2;
            columnsCount = i;
        }
    }

    private zzYN9 zzYJ5() {
        zzYN7 zzyn7 = new zzYN7();
        zzyn7.zzHj(((zzZ35) zzYTt()).zzZRi());
        zzyn7.zzHi(((zzZ35) zzYTt()).zzZRh());
        zzyn7.zzvT(((zzZ35) zzYTt()).zzZRg());
        zzyn7.zzvS(((zzZ35) zzYTt()).zzZRf());
        zzyn7.zzvP(((zzZ35) zzYTt()).zzYLq());
        zzyn7.setMultiplePages(zza7().getMultiplePages());
        zzyn7.zzRF(zza7().zzYMN());
        zzyn7.setOrientation(((zzZ35) zzYTt()).getOrientation());
        zzyn7.zzRG(((zzZ35) zzYTt()).getOrientation() == ((zzZ35) ((zzZ2D) ((zzZ2C) zza9()).zzZXZ()).zzYTt()).getOrientation());
        zzyn7.zzRI(!zza7().zzYMM());
        zzyn7.zzRH(((zzZ35) zzYTt()).zzYLb());
        return new zzYN9(zzyn7);
    }

    private boolean zzv6(int i) throws Exception {
        zzYAU zzyauZzZXV = zzZXV();
        zzZ4N zzz4nZzYPe = ((zzZ2C) zza9()).zzY4s().zzYPe();
        zzz4nZzYPe.zzX(zzyauZzZXV);
        while (zzz4nZzYPe.movePrevious()) {
            zzYAU zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
            if (zzY9R.zzmP(zzyau.zzZo6())) {
                return false;
            }
            if (zzyau.zzY6X() && (zzyau instanceof zzYAD) && zzyau.zzY7n() == i) {
                return true;
            }
        }
        return false;
    }

    private int zzv7(int i) {
        if (((zzZ35) zzYTt()).zzZRg() < 0 && ((zzZ35) zzYTt()).zzZRf() < 0) {
            return 1073741823;
        }
        return i < 0 ? ((zzZ35) zzYTt()).getPageHeight() : (int) (((double) ((zzZ35) zzYTt()).getPageHeight()) * 0.4d);
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void merge() throws Exception {
        zzV(this.zzY4q, ((zzZ2D) zzYTp()).zzY4r);
        super.merge();
    }

    @Override // com.aspose.words.zzZ6T
    public final zzZ6T zz6u() throws Exception {
        zzZ2D zzz2d = new zzZ2D();
        zzz2d.zzZ(zzYTt());
        return zzz2d;
    }

    @Override // com.aspose.words.zzYCT, com.aspose.words.zzZ6T
    public final zzYMD zz6w() {
        return this.zzY4q;
    }

    @Override // com.aspose.words.zzYCT, com.aspose.words.zzZ6T
    public final zzYMD zz6x() {
        return this.zzY4r;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzB(zzYMD zzymd) throws Exception {
        zzymd.zza9();
        int iZz60 = zzymd.zz60();
        if (iZz60 != 1) {
            if (iZz60 != 2) {
                return;
            }
            zzUZ zzuz = (zzUZ) zzymd;
            if (zzuz.zz0e()) {
                ArrayList<zzUZ> arrayListZz0c = zzuz.zz0c();
                zzUZ zzuz2 = arrayListZz0c.get(0);
                zzUZ zzuz3 = (zzUZ) C21505OooO0Oo.OooO00o(1, arrayListZz0c);
                if (this.zzY4r == zzuz2) {
                    this.zzY4r = (zzUZ) zzuz3.zzYo1();
                }
                if (this.zzY4q == zzuz3) {
                    this.zzY4q = (zzUZ) zzuz2.zzYo0();
                }
                if (zzuz2.zzYo0() != null) {
                    zzuz2.zzYo0().zzu(zzuz3.zzYo1());
                }
                if (zzuz3.zzYo1() != null) {
                    zzuz3.zzYo1().zzt(zzuz2.zzYo0());
                }
                for (zzUZ zzuz4 : arrayListZz0c) {
                    zzuz4.zzZZJ();
                    zzuz4.zzZ((zzZ6T) null);
                    zzuz4.zzu(null);
                    zzuz4.zzt(null);
                    zzuz4.zzT((zzUZ) null);
                }
                return;
            }
            return;
        }
        zza9();
        zza9().zzB(zzymd);
        for (zzYN8 zzyn8 = (zzYN8) zzymd.zzYo1(); zzyn8 != null; zzyn8 = (zzYN8) zzyn8.zzYo1()) {
            if (zzyn8.zzYqq() != null && zzyn8.zzYqq().zzac()) {
                zzyn8.zzYqq().zzNd(3);
            }
            if (zzyn8.zzYqp() != null && zzyn8.zzYqp().zzac()) {
                zzyn8.zzYqp().zzNd(3);
            }
        }
        if (zzymd.zzYo1() != null) {
            zzymd.zzYo1().zzt(zzymd.zzYo0());
        }
        if (zzymd.zzYo0() != null) {
            zzymd.zzYo0().zzu(zzymd.zzYo1());
        }
        zzYMD zzymd2 = this.zzY4t;
        if (zzymd == ((zzYN8) zzymd2)) {
            zzYN8 zzyn82 = (zzYN8) ((zzYN8) zzymd2).zzYo1();
            this.zzY4t = zzyn82;
            if (zzyn82 != null && this != ((zzZ2D) zzyn82.zza9())) {
                this.zzY4t = null;
            }
        }
        zzYMD zzymd3 = this.zzY4s;
        if (zzymd == ((zzYN8) zzymd3)) {
            zzYN8 zzyn83 = (zzYN8) ((zzYN8) zzymd3).zzYo0();
            this.zzY4s = zzyn83;
            if (zzyn83 != null && this != ((zzZ2D) zzyn83.zza9())) {
                this.zzY4s = null;
            }
        }
        zzymd.zzZ((zzZ6T) null);
    }

    public final void zzE(zzUZ zzuz) {
        this.zzY4r = zzuz;
    }

    public final void zzP(zzYN8 zzyn8) {
        this.zzY4s = zzyn8;
    }

    public final void zzQ(zzYN8 zzyn8) {
        this.zzY4t = zzyn8;
    }

    public final int zzTq(boolean z) {
        return zzYJ5().zzZt(3, z);
    }

    public final int zzTr(boolean z) {
        return zzYJ5().zzZt(1, z);
    }

    public final long zzTs(boolean z) {
        return zzZN(0, z);
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void zzW(zzZ6T zzz6t) throws Exception {
        zzUZ zzuz = (zzUZ) ((zzYMM) zzz6t).zz6w().zzqh(2);
        zzuz.zza9();
        zzV(zzuz, (zzUZ) zzuz.zzYo1());
        super.zzW(zzz6t);
    }

    @Override // com.aspose.words.zzYCT, com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) throws Exception {
        if (zzymd.zz60() == 1) {
            return null;
        }
        return zzymd.zz60() == 2 ? zzD((zzUZ) zzymd) : zzT((zzTF) zzymd);
    }

    @Override // com.aspose.words.zzYCT, com.aspose.words.zzZ6T
    public final void zzY(zzYMD zzymd) {
        this.zzY4q = (zzUZ) zzymd;
    }

    public final boolean zzYJ3() throws Exception {
        if (this.zzY4u == 0) {
            this.zzY4u = zzv6(3) ? 1 : -1;
        }
        return this.zzY4u > 0;
    }

    public final boolean zzYJ4() {
        if (zzYTm()) {
            return false;
        }
        zzZ35 zzz35 = (zzZ35) ((zzZ2D) zzYTo()).zzYTt();
        if (!zzX(zzz35, (zzZ35) zzYTt())) {
            return false;
        }
        if (((zzZ35) zzYTt()).getSectionStart() == 0) {
            return true;
        }
        return !zza7().zzZYM() && zzY(zzz35, (zzZ35) zzYTt());
    }

    public final int zzYJ6() {
        return zzv7(((zzZ35) zzYTt()).zzZRf());
    }

    public final int zzYJ7() {
        return zzv7(((zzZ35) zzYTt()).zzZRg());
    }

    public final zzUZ zzYJ8() {
        return this.zzY4q;
    }

    public final zzUZ zzYJ9() {
        return this.zzY4r;
    }

    public final zzYN8 zzYJa() {
        return (zzYN8) this.zzY4s;
    }

    public final zzYN8 zzYJb() {
        return (zzYN8) this.zzY4t;
    }

    @Override // com.aspose.words.zzZ6T
    public final boolean zzYTs() {
        return this.zzY4r == null && ((zzYN8) this.zzY4t) == null;
    }

    @Override // com.aspose.words.zzYCT, com.aspose.words.zzZ6T
    public final void zzZ(zzYMD zzymd) {
        this.zzY4r = (zzUZ) zzymd;
    }

    public final long zzZN(int i, boolean z) {
        return zzYJ5().zzZ(i, ((zzZ35) zzYTt()).getPageWidth(), z, zza7().zzZYM());
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZoU() {
        super.zzZoU();
        this.zzY4v = 0;
        this.zzY4u = 0;
    }

    public final boolean zzZrS() throws Exception {
        if (this.zzY4v == 0) {
            this.zzY4v = zzv6(2) ? 1 : -1;
        }
        return this.zzY4v > 0;
    }

    private static zzTF zzQ(zzTF zztf) {
        zzTC zztcZzZXJ = (zzTC) zztf;
        while (zztcZzZXJ != null) {
            zztcZzZXJ = zztcZzZXJ.zzZXJ();
            if (zztcZzZXJ != null && zztcZzZXJ.zzZZJ() != null) {
                break;
            }
        }
        return zztcZzZXJ;
    }

    private static boolean zzY(zzZ35 zzz35, zzZ35 zzz352) {
        return zzz352.getSectionStart() == 1 && zzz352.getColumnsCount() > 1 && zzz352.getColumnsCount() == zzz35.getColumnsCount();
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzYMD zzymd, zzYMD zzymd2, zzYMD zzymd3, boolean z) throws Exception {
        if (zzymd3.zz60() == 2) {
            super.zzZ(zzymd, zzymd2, zzymd3, z);
            return;
        }
        if (zzymd3.zz60() == 1) {
            if (zzymd2 == null && zzymd == null) {
                zzymd2 = zzYJ0();
            }
            zzYMD zzymd4 = zzymd2;
            if (zzymd4 == null && zzymd == null) {
                zzymd = zzYJ1();
            }
            zzYMD zzymd5 = zzymd;
            Ref<zzYMD> ref = new Ref<>(this.zzY4t);
            Ref<zzYMD> ref2 = new Ref<>(this.zzY4s);
            zzZ(zzymd5, zzymd4, zzymd3, ref, ref2);
            this.zzY4t = ref.get();
            this.zzY4s = ref2.get();
            zza9().zzZ(zzymd5, zzymd4, zzymd3, z);
        }
    }

    private static boolean zzX(zzZ35 zzz35, zzZ35 zzz352) {
        if (zzz35.getPageWidth() == zzz352.getPageWidth() && zzz35.getPageHeight() == zzz352.getPageHeight()) {
            return zzz35.zzYLz() == 0 || zzz352.zzYLz() == 0 || zzz35.zzYLz() == zzz352.zzYLz();
        }
        return false;
    }

    public static boolean zzZ(zzZ35 zzz35, zzZ35 zzz352) {
        if (zzX(zzz35, zzz352)) {
            return zzY(zzz35, zzz352);
        }
        return false;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzZ3E zzz3e) throws Exception {
        zzYMD zzymd = this.zzY4t;
        if (((zzYN8) zzymd) != null && ((zzYN8) zzymd).isEmpty()) {
            ((zzYN8) this.zzY4t).remove();
        }
        boolean z = zzYTt() != null;
        super.zzZ(zzz3e);
        if (z) {
            zzY44.zzV(this);
        }
    }
}
