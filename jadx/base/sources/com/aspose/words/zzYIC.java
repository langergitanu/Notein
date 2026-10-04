package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIC extends zzTG {
    private boolean zzXGn;
    private boolean zzXxb;
    private int zzXxc;
    private int zzXxd;
    private int zzXxe;
    private int zzXxf;
    private zzYMD zzZA6;
    private zzYMD zzZA7;
    private boolean zzsy;
    private boolean zzXxa = false;
    private boolean zzXGm = false;

    private boolean zzRA(boolean z) throws Exception {
        if (z && this.zzXGm) {
            return this.zzXGn;
        }
        boolean zZzQ = zzY39.zzQ(this);
        if (z) {
            this.zzXGn = zZzQ;
            this.zzXGm = true;
        }
        return zZzQ;
    }

    private zzWV zzZr(int i, boolean z) {
        int columnCount = this.zzXxf;
        zzWV zzwv = (zzWV) zzZXZ();
        while (columnCount < i && zzwv != null) {
            columnCount += zzwv.getColumnCount();
            zzwv = (zzWV) zzwv.zzYTp();
        }
        if (!z ? columnCount > i : columnCount != i) {
            zzwv = null;
        }
        if (zzwv == null || !zzwv.zzYTn()) {
            return zzwv;
        }
        return null;
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void merge() throws Exception {
        if (zzYTp() == null) {
            return;
        }
        zzYIC zzyic = (zzYIC) zzYTp();
        this.zzXxf = zzyic.zzXxf;
        this.zzXxe = zzyic.zzXxe;
        this.zzXxd = zzyic.zzXxd;
        this.zzXxc = zzyic.zzXxc;
        super.merge();
    }

    public final zzYAS zz69() {
        return ((zzWV) zzZXY()).zz69();
    }

    public final boolean zz6a() {
        return ((zzY6N) zza9()).zzY6a().zzZz();
    }

    @Override // com.aspose.words.zzZ6T
    public final zzZ6T zz6u() throws Exception {
        zzYIC zzyic = new zzYIC();
        zzyic.zzXxf = this.zzXxf;
        zzyic.zzXxe = this.zzXxe;
        zzyic.zzXxd = this.zzXxd;
        zzyic.zzXxc = this.zzXxc;
        zzyic.zzZ(zzYTt());
        return zzyic;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6w() {
        return this.zzZA6;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6x() {
        return this.zzZA7;
    }

    @Override // com.aspose.words.zzZ6T
    public final int zz6y() {
        return 8;
    }

    public final boolean zzBz() {
        if (!this.zzXxa) {
            if (((zzZ36) zzYTt()).zzBz()) {
                this.zzsy = true;
                this.zzXxa = true;
            } else {
                this.zzsy = false;
                this.zzXxa = true;
                if (!zzYTm() && ((zzYIC) zzYTo()).zzBz()) {
                    boolean z = false;
                    boolean z2 = true;
                    for (zzWV zzwv = (zzWV) zzZXZ(); !zzwv.zzYTn(); zzwv = (zzWV) zzwv.zzYTp()) {
                        if (zzwv.zz6m() == 3 || zzwv.zz6m() == 2) {
                            z = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2 || (z && zzab().zza7().zzZYM())) {
                        this.zzsy = true;
                    }
                }
            }
        }
        return this.zzsy;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) throws Exception {
        zza9();
        zzymd.zza9();
        if (8 == zzymd.zz60()) {
            return ((zzY6N) zza9()).zzX(zzymd);
        }
        zzYMD zzymd2 = this.zzZA7;
        if (zzymd2 == null) {
            zzZ(null, null, new zzYIA(), true);
            return (zzTF) this.zzZA7;
        }
        if (zzymd2 == this.zzZA6) {
            return (zzTF) zzymd2;
        }
        zzYMD zzymdZzy = zzymd.zza9().zzy(zzymd);
        if (zzymd.zzYo0() != null && zzymdZzy != null) {
            return zzymdZzy.zzZZJ();
        }
        zzymd.zza9().zza9();
        return (zzTF) this.zzZA7;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzY(zzYMD zzymd) {
        this.zzZA6 = zzymd;
    }

    public final int zzYKt() {
        if (((zzY6N) zza9()) == null || !((zzY6N) zza9()).zzY6a().zzYKu()) {
            return 0;
        }
        return ((zzY6N) zza9()).zzY6a().zzYKt();
    }

    public final int zzYjW() {
        return ((zzY6N) zza9()).zzY6a().zzZz() ? this.zzXxf : this.zzXxd;
    }

    public final void zzYjX() throws Exception {
        zzYIC zzyic;
        zzWV zzwvZzZr;
        ((zzY6N) zza9()).zzXYq();
        zzZ6T zzz6tZzZXZ = zzZXZ();
        while (true) {
            zzWV zzwv = (zzWV) zzz6tZzZXZ;
            if (zzwv == null) {
                break;
            }
            if (((zzWV) zzwv.zzYTp()) == null) {
                zzwv.zzZ((zzWV) null);
                zzwv.zzY((zzWV) null);
            } else {
                int columnIndex = zzwv.getColumnIndex();
                zzWV zzwv2 = zzwv;
                while (((zzZ3B) zzwv2.zzYTt()).zzYMY() && (zzyic = (zzYIC) ((zzYIC) zzwv2.zza9()).zzYTo()) != null && (zzwvZzZr = zzyic.zzZr(columnIndex, true)) != null && zzwv.getColumnCount() == zzwvZzZr.getColumnCount()) {
                    zzwv2 = zzwvZzZr;
                }
                zzwv2.zzZ((zzWV) null);
                zzYIC zzyic2 = (zzYIC) ((zzYIC) zzwv2.zza9()).zzYTp();
                while (zzyic2 != null) {
                    zzWV zzwvZzZr2 = zzyic2.zzZr(columnIndex, true);
                    if (zzwvZzZr2 == null || zzwv.getColumnCount() != zzwvZzZr2.getColumnCount() || !((zzZ3B) zzwvZzZr2.zzYTt()).zzYMY()) {
                        break;
                    }
                    zzwv2.zzY(zzwvZzZr2);
                    zzwvZzZr2.zzZ(zzwv2);
                    zzyic2 = (zzYIC) zzyic2.zzYTp();
                    zzwv2 = zzwvZzZr2;
                }
                zzwv2.zzY((zzWV) null);
            }
            zzz6tZzZXZ = zzwv.zzYTp();
        }
        for (zzWV zzwv3 = (zzWV) zzZXZ(); zzwv3 != null && ((zzWV) zzwv3.zzYTp()) != null; zzwv3 = (zzWV) zzwv3.zzYTp()) {
            if (zzwv3.zz6m() == 1 && ((zzZ3B) zzwv3.zzYTt()).isCached()) {
                for (zzWV zzwvZz6n = zzwv3; zzwvZz6n != null; zzwvZz6n = zzwvZz6n.zz6n()) {
                    zzwvZz6n.zz6v();
                    if (zzwvZz6n.zz6o() != null) {
                        ((zzZ3B) zzwvZz6n.zzYTt()).zzV(((zzZ3B) zzwv3.zzYTt()).zzYMZ());
                        ((zzZ3B) zzwvZz6n.zzYTt()).zzwx(((zzZ3B) zzwv3.zzYTt()).getLeftPadding());
                        ((zzZ3B) zzwvZz6n.zzYTt()).zzwu(((zzZ3B) zzwv3.zzYTt()).getRightPadding());
                        ((zzZ3B) zzwvZz6n.zzYTt()).setVerticalAlignment(((zzZ3B) zzwv3.zzYTt()).getVerticalAlignment());
                        ((zzZ3B) zzwvZz6n.zzYTt()).setOrientation(((zzZ3B) zzwv3.zzYTt()).getOrientation());
                        ((zzZ3B) zzwvZz6n.zzYTt()).zzY((zzZ34) null);
                    }
                }
            }
        }
    }

    public final void zzYjY() {
        this.zzXxb = true;
    }

    public final boolean zzYjZ() {
        return this.zzXxb;
    }

    public final int zzYk0() throws Exception {
        int height = 0;
        for (zzYMD zzymdZzYo1 = this.zzZA7; zzymdZzYo1 != null; zzymdZzYo1 = zzymdZzYo1.zzYo1()) {
            height += zzymdZzYo1.getHeight();
        }
        return height;
    }

    public final zzZ36 zzYk1() {
        return (zzZ36) zzYTt();
    }

    public final zzYIA zzYk2() {
        return (zzYIA) this.zzZA6;
    }

    public final zzYIA zzYk3() {
        return (zzYIA) this.zzZA7;
    }

    public final boolean zzYk4() {
        return ((zzY6N) zza9()) != null && ((zzY6N) zza9()).zzY6a().zzYKu() && zzY6U.zzZ(((zzY6N) zza9()).zzXYo());
    }

    public final boolean zzYk5() {
        return ((zzY6N) zza9()) != null && ((zzY6N) zza9()).zzY6a().zzYKu();
    }

    public final int zzYk6() {
        int alignment = ((zzZ36) zzYTt()).getAlignment();
        return alignment != 0 ? alignment != 2 ? ((zzZ36) zzYTt()).getAlignment() : ((zzY6N) zza9()).zzY6a().zzZz() ? 0 : 2 : ((zzY6N) zza9()).zzY6a().zzZz() ? 2 : 0;
    }

    public final int zzYk7() {
        return this.zzXxc;
    }

    public final int zzYk8() {
        return this.zzXxd;
    }

    public final int zzYk9() {
        return this.zzXxe;
    }

    public final int zzYka() {
        return this.zzXxf;
    }

    public final boolean zzYok() throws Exception {
        return zzRA(false);
    }

    public final boolean zzYol() throws Exception {
        return zzRA(true);
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzYMD zzymd) {
        this.zzZA7 = zzymd;
    }

    @Override // com.aspose.words.zzYS
    public final zzY6N zza6() {
        return (zzY6N) zza9();
    }

    public final zzWV zzpd(int i) {
        return zzZr(i, true);
    }

    public final zzWV zzpe(int i) {
        return zzZr(i, false);
    }

    public final void zzpf(int i) {
        this.zzXxc = i;
    }

    public final void zzpg(int i) {
        this.zzXxd = i;
    }

    public final void zzph(int i) {
        this.zzXxe = i;
    }

    public final void zzpi(int i) {
        this.zzXxf = i;
    }
}
