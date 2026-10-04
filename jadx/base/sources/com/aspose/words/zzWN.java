package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWN implements zzZ97 {
    private com.aspose.words.internal.zzZOX zzW6;
    private int zzZD8;
    private zzWO zzZzS;

    public zzWN(int i) {
        this.zzZD8 = i;
    }

    private boolean zz5k() {
        return this.zzZD8 >= 257;
    }

    private void zz5m() throws Exception {
        int i = this.zzW6.readByte() & 255;
        int i2 = this.zzW6.readByte() & 255;
        byte b = this.zzW6.readByte();
        PreferredWidth preferredWidthZzS = zzS(this.zzW6);
        if (preferredWidthZzS.isFixed()) {
            int iMin = Math.min(i2, this.zzZzS.getCount());
            int iZzYmD = preferredWidthZzS.zzYmD();
            for (int iMin2 = Math.min(i, this.zzZzS.getCount()); iMin2 < iMin; iMin2++) {
                zzWP zzwpZzOs = this.zzZzS.zzOs(iMin2);
                if ((b & 2) != 0) {
                    zzwpZzOs.zzQ(3090, Integer.valueOf(iZzYmD));
                }
                if ((b & 1) != 0) {
                    zzwpZzOs.zzQ(3070, Integer.valueOf(iZzYmD));
                }
                if ((b & 4) != 0) {
                    zzwpZzOs.zzQ(3080, Integer.valueOf(iZzYmD));
                }
                if ((b & 8) != 0) {
                    zzwpZzOs.zzQ(3100, Integer.valueOf(iZzYmD));
                }
            }
        }
    }

    private void zz5n() throws Exception {
        int i = this.zzW6.readByte() & 255;
        int i2 = this.zzW6.readByte() & 255;
        int i3 = 0;
        boolean z = i2 == 1;
        if (i2 == 3) {
            i3 = 1;
        } else if (z) {
            i3 = 2;
        }
        zzWO zzwo = this.zzZzS;
        if (zzwo == null) {
            return;
        }
        zzwo.zzOs(i).zzQ(3030, Integer.valueOf(i3));
    }

    private void zz5o() throws Exception {
        int i = this.zzW6.readByte() & 255;
        int iMin = Math.min(this.zzW6.readByte() & 255, this.zzZzS.getCount());
        this.zzZzS.zzOs(i).zzQ(3040, 1);
        for (int i2 = i + 1; i2 < iMin; i2++) {
            this.zzZzS.zzOs(i2).zzQ(3040, 2);
        }
    }

    private void zzOp(int i) throws Exception {
        Border borderZzY;
        int i2 = this.zzW6.readByte() & 255;
        int i3 = this.zzW6.readByte() & 255;
        byte b = this.zzW6.readByte();
        if (i == 193) {
            borderZzY = zzXY.zzY(this.zzW6, null);
        } else if (i == 54816) {
            borderZzY = zzXY.zzX(this.zzW6, null);
        } else {
            if (i != 54831) {
                throw new IllegalStateException("Unexpected sprm value.");
            }
            borderZzY = zzXY.zzW(this.zzW6, null);
        }
        int iMin = Math.min(i3, this.zzZzS.getCount());
        for (int iMin2 = Math.min(i2, this.zzZzS.getCount()); iMin2 < iMin; iMin2++) {
            zzWP zzwpZzOs = this.zzZzS.zzOs(iMin2);
            if ((b & 2) != 0) {
                zzwpZzOs.zzQ(3120, borderZzY.zz8H());
            }
            if ((b & 1) != 0) {
                zzwpZzOs.zzQ(3110, borderZzY.zz8H());
            }
            if ((b & 4) != 0) {
                zzwpZzOs.zzQ(3130, borderZzY.zz8H());
            }
            if ((b & 8) != 0) {
                zzwpZzOs.zzQ(3140, borderZzY.zz8H());
            }
            if ((b & 16) != 0) {
                zzwpZzOs.zzQ(3150, borderZzY.zz8H());
            }
            if ((b & 32) != 0) {
                zzwpZzOs.zzQ(3160, borderZzY.zz8H());
            }
        }
    }

    private void zzOq(int i) throws Exception {
        int i2 = i / 4;
        for (int i3 = 0; i3 < i2; i3++) {
            zzWP zzwpZzOs = this.zzZzS.zzOs(i3);
            zzZ(zzwpZzOs, 3110, this.zzW6.readByte() & 255);
            zzZ(zzwpZzOs, 3120, this.zzW6.readByte() & 255);
            zzZ(zzwpZzOs, 3130, this.zzW6.readByte() & 255);
            zzZ(zzwpZzOs, 3140, this.zzW6.readByte() & 255);
        }
    }

    private static PreferredWidth zzS(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        return PreferredWidth.zzW6(zzzox.readByte() & 255, zzzox.zzXa());
    }

    private void zzV(int i, int i2, Object obj) {
        int iMin = Math.min(i >> 8, this.zzZzS.getCount());
        for (int iMin2 = Math.min(i & 255, this.zzZzS.getCount()); iMin2 < iMin; iMin2++) {
            this.zzZzS.zzOs(iMin2).zzQ(i2, obj);
        }
    }

    private void zzW(zzWP zzwp) throws Exception {
        short sZzXa = this.zzW6.zzXa();
        int i = 0;
        int i2 = (sZzXa & 1) != 0 ? 1 : (sZzXa & 2) != 0 ? 2 : 0;
        if (i2 != 0) {
            zzwp.zzQ(3040, Integer.valueOf(i2));
        }
        int i3 = (sZzXa & 28) >> 2;
        if (i3 != 0) {
            zzwp.zzQ(3050, Integer.valueOf(i3));
        }
        boolean z = (sZzXa & 32) != 0;
        if ((sZzXa & 64) != 0) {
            i = 1;
        } else if (z) {
            i = 2;
        }
        if (i != 0) {
            zzwp.zzQ(3030, Integer.valueOf(i));
        }
        int i4 = (sZzXa & 384) >> 7;
        if (i4 != 0) {
            zzwp.zzQ(3060, Integer.valueOf(i4));
        }
        int i5 = (sZzXa & 3584) >> 9;
        short sZzXa2 = this.zzW6.zzXa();
        if (i5 != 0) {
            zzwp.zzQ(3020, PreferredWidth.zzW6(i5, sZzXa2));
        }
        if ((sZzXa & 4096) != 0) {
            zzwp.zzQ(3190, Boolean.TRUE);
        }
        if ((sZzXa & 8192) != 0) {
            zzwp.zzQ(3180, Boolean.FALSE);
        }
        zzZ(zzwp, 3110);
        zzZ(zzwp, 3120);
        zzZ(zzwp, 3130);
        zzZ(zzwp, 3140);
    }

    private void zzX(zzWP zzwp) throws Exception {
        short sZzXa = this.zzW6.zzXa();
        int i = 0;
        boolean z = (sZzXa & 1) != 0;
        boolean z2 = (sZzXa & 2) != 0;
        if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        if (i != 0) {
            zzwp.zzQ(3040, Integer.valueOf(i));
        }
        zzY(zzwp, 3110);
        zzY(zzwp, 3120);
        zzY(zzwp, 3130);
        zzY(zzwp, 3140);
    }

    private void zzY(zzWP zzwp, int i) throws Exception {
        Border borderZzY = zzXY.zzY(this.zzW6, null);
        if (borderZzY.getLineStyle() != 0 || borderZzY.zz8F()) {
            zzwp.zzQ(i, borderZzY);
        }
    }

    private void zzYw(int i, int i2) throws Exception {
        int i3;
        switch (i) {
            case 54810:
                i3 = 3110;
                break;
            case 54811:
                i3 = 3120;
                break;
            case 54812:
                i3 = 3130;
                break;
            case 54813:
                i3 = 3140;
                break;
            default:
                i3 = 0;
                break;
        }
        int i4 = i2 / 4;
        for (int i5 = 0; i5 < i4; i5++) {
            int iZzXc = this.zzW6.zzXc();
            if (i4 <= this.zzZzS.getCount() && this.zzZzS.zzOs(i5).zzVE(i3)) {
                ((Border) this.zzZzS.zzOs(i5).zzPj(i3)).zzm(zzY0E.zzhI(iZzXc));
            } else if (iZzXc == -1) {
                this.zzZzS.zzOs(i5).zzQ(i3, Border.zz8G());
            }
        }
    }

    private void zzYx(int i, int i2) throws Exception {
        if (i == 54793) {
            int i3 = i2 / 2;
            for (int i4 = 0; i4 < i3; i4++) {
                zzZ(this.zzW6, this.zzZzS.zzOs(i4), i);
            }
            return;
        }
        int i5 = i2 % 10;
        if (i5 != 0) {
            if (i5 != 4) {
                throw new IllegalStateException("Cell shading in unknown format is encountered.");
            }
            i2 += 256;
        }
        int iZzG7 = zzZZ5.zzG7(i) * 22;
        int i6 = (i2 / 10) + iZzG7;
        while (iZzG7 < i6) {
            zzZ(this.zzW6, this.zzZzS.zzOs(iZzG7), i);
            iZzG7++;
        }
    }

    public final zzWO zz5l() {
        return this.zzZzS;
    }

    public final void zz5p() throws Exception {
        this.zzW6.readByte();
        int i = this.zzW6.readByte() & 255;
        short sZzXa = this.zzW6.zzXa();
        for (int i2 = 0; i2 < i; i2++) {
            zzWP zzwp = new zzWP();
            zzwp.setWidth(sZzXa);
            this.zzZzS.zzU(zzwp);
        }
    }

    public final int zzOr(int i) throws Exception {
        int position = (int) this.zzW6.zzq().getPosition();
        int i2 = this.zzW6.readByte() & 255;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            iArr[i5] = this.zzW6.zzXa();
        }
        int i6 = iArr[0];
        while (i4 < i2) {
            zzWP zzwp = new zzWP();
            if (((int) this.zzW6.zzq().getPosition()) - position < i) {
                if (zzZRA.zzDL(this.zzZD8)) {
                    zzX(zzwp);
                } else {
                    zzW(zzwp);
                }
            }
            int i7 = i4 + 1;
            int i8 = iArr[i7] - iArr[i4];
            zzwp.setWidth(i8);
            int i9 = this.zzZD8;
            if (i9 <= 193) {
                zzwp.setPreferredWidth(PreferredWidth.zzpK(i8));
            } else if (i9 <= 217 && !zzwp.contains(3020)) {
                zzwp.setPreferredWidth(PreferredWidth.zzpK(i8));
            }
            this.zzZzS.zzU(zzwp);
            i4 = i7;
        }
        return i6;
    }

    @Override // com.aspose.words.zzZ97
    public final boolean zzZ(int i, int i2, int i3, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (i2 != 5) {
            return true;
        }
        this.zzW6 = zzzox;
        if (this.zzZzS == null) {
            return false;
        }
        switch (i) {
            case 191:
                Shading shadingZzZ = zzYCK.zzZ(zzzox, (Shading) null);
                if (shadingZzZ != null) {
                    for (int i4 = 0; i4 < this.zzZzS.getCount(); i4++) {
                        this.zzZzS.zzOs(i4).zzQ(3170, shadingZzZ.zzYbE());
                    }
                }
                if (i3 != 2) {
                    zzzox.zzq().zzH(zzzox.zzq().getPosition() + ((long) (i3 - 2)));
                }
                return true;
            case 193:
            case 54816:
            case 54831:
                zzOp(i);
                return true;
            case 22052:
                zz5o();
                return true;
            case 30243:
                short sZzXa = zzzox.zzXa();
                short sZzXa2 = zzzox.zzXa();
                zzV(sZzXa, 3010, Integer.valueOf(sZzXa2));
                if (this.zzZD8 <= 193) {
                    zzV(sZzXa, 3020, PreferredWidth.zzpK(sZzXa2));
                }
                return true;
            case 30249:
                zzV(zzzox.zzX9() & 65535, 3050, Integer.valueOf(zzzox.zzX9() & 65535));
                return true;
            case 54793:
            case 54796:
            case 54802:
            case 54806:
                if (!zz5k()) {
                    zzYx(i, i3);
                }
                return true;
            case 54810:
            case 54811:
            case 54812:
            case 54813:
                zzYw(i, i3);
                return true;
            case 54827:
                zz5n();
                return true;
            case 54828:
                zzV(zzzox.zzX9() & 65535, 3060, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 54834:
                zz5m();
                return true;
            case 54837:
                zzV(zzzox.zzXa(), 3020, zzS(zzzox));
                return true;
            case 54841:
                zzV(zzzox.zzX9() & 65535, 3180, Boolean.valueOf(!zzzox.readBoolean()));
                return true;
            case 54850:
                zzV(zzzox.zzX9() & 65535, 3220, Boolean.valueOf(zzzox.readBoolean()));
                return true;
            case 54882:
                zzOq(i3);
                return true;
            case 54896:
            case 54897:
            case 54898:
                zzYx(i, i3);
                return true;
            case 63030:
                zzV(zzzox.zzX9() & 65535, 3190, Boolean.valueOf(zzzox.readBoolean()));
                return true;
            default:
                return false;
        }
    }

    private void zzZ(zzWP zzwp, int i) throws Exception {
        Border borderZzX = zzXY.zzX(this.zzW6, null);
        if (borderZzX.getLineStyle() != 0 || borderZzX.zz8F()) {
            zzwp.zzQ(i, borderZzX);
        }
    }

    private static void zzZ(com.aspose.words.internal.zzZOX zzzox, WordAttrCollection wordAttrCollection, int i) throws Exception {
        Shading shading = (Shading) wordAttrCollection.zzPk(3170);
        Shading shadingZzZ = i == 54793 ? zzYCK.zzZ(zzzox, shading) : zzYCK.zzY(zzzox, shading);
        if (shadingZzZ != null) {
            wordAttrCollection.zzQ(3170, shadingZzZ);
        }
    }

    private static void zzZ(zzWP zzwp, int i, int i2) {
        Border border = (Border) zzwp.zzPk(i);
        if (border == null || i2 == 255) {
            return;
        }
        border.zzOV(i2);
    }

    public final void zzZ(zzWO zzwo) {
        this.zzZzS = zzwo;
    }
}
