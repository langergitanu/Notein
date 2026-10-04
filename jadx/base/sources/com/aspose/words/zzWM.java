package com.aspose.words;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.Oooo0;

/* JADX INFO: loaded from: classes6.dex */
final class zzWM implements zzZ98 {
    private zzY9I zzZzR;
    private zzWO zzZzS;
    private static Shading zzZzQ = new Shading();
    private static Border zzZzP = new Border();

    private void zzL(int i, int i2, int i3, int i4) throws Exception {
        this.zzZzR.zzJ((short) -10699);
        this.zzZzR.writeByte((byte) 5);
        this.zzZzR.writeByte((byte) i);
        this.zzZzR.writeByte((byte) i2);
        this.zzZzR.writeByte((byte) i3);
        this.zzZzR.zzK((short) i4);
    }

    private static int zzOl(int i) {
        if (i == 1) {
            return 3070;
        }
        if (i == 2) {
            return 3090;
        }
        if (i == 4) {
            return 3080;
        }
        if (i == 8) {
            return 3100;
        }
        if (i == 16 || i == 32) {
            return 0;
        }
        throw new IllegalStateException();
    }

    private static int zzOm(int i) {
        if (i == 1) {
            return 3110;
        }
        if (i == 2) {
            return 3120;
        }
        if (i == 4) {
            return 3130;
        }
        if (i == 8) {
            return 3140;
        }
        if (i == 16) {
            return 3150;
        }
        if (i == 32) {
            return 3160;
        }
        throw new IllegalStateException();
    }

    private boolean zzOn(int i) {
        int iZzG7 = zzZZ5.zzG7(i);
        int iMin = Math.min(this.zzZzS.getCount(), (iZzG7 + 1) * 22);
        for (int i2 = iZzG7 * 22; i2 < iMin; i2++) {
            if (this.zzZzS.zzOs(i2).zzVE(3170)) {
                return true;
            }
        }
        return false;
    }

    private void zzV(zzWP zzwp) throws Exception {
        this.zzZzR.zzK((short) ((zzwp.getHorizontalMerge() == 1 ? 1 : 0) | (zzwp.getHorizontalMerge() == 2 ? 2 : 0) | (zzwp.getOrientation() << 2) | (zzwp.getVerticalMerge() != 0 ? 32 : 0) | (zzwp.getVerticalMerge() == 1 ? 64 : 0) | (zzwp.getVerticalAlignment() << 7) | (zzwp.getPreferredWidth().getType() << 9) | (zzwp.getFitText() ? 4096 : 0) | (zzwp.getWrapText() ? 0 : 8192)));
        this.zzZzR.zzK((short) zzwp.getPreferredWidth().zzYmE());
        zzX(zzwp, 3110);
        zzX(zzwp, 3120);
        zzX(zzwp, 3130);
        zzX(zzwp, 3140);
    }

    private void zzX(zzWP zzwp, int i) throws Exception {
        Border border = (Border) zzwp.zzPk(i);
        if (border == null || border.isInherited()) {
            this.zzZzR.zzk(0);
        } else if (border.getLineStyle() == 0 && border.zz8F()) {
            this.zzZzR.zzk(-1);
        } else {
            zzXY.zzZ(border, this.zzZzR, false);
        }
    }

    private void zzY(int i, int i2, int i3, int i4, Object obj) throws Exception {
        if (obj != null) {
            this.zzZzR.zzJ((short) i);
            this.zzZzR.writeByte((byte) 6);
            this.zzZzR.writeByte((byte) i2);
            this.zzZzR.writeByte((byte) i3);
            this.zzZzR.writeByte((byte) i4);
            this.zzZzR.writeByte((byte) 3);
            this.zzZzR.zzK((short) ((Integer) obj).intValue());
        }
    }

    private void zzYs(int i, int i2) throws Exception {
        this.zzZzR.zzJ((short) -10709);
        this.zzZzR.writeByte((byte) 2);
        this.zzZzR.writeByte((byte) i);
        this.zzZzR.writeByte((byte) i2);
    }

    private void zzYt(int i, int i2) throws Exception {
        this.zzZzR.zzJ((short) 22052);
        this.zzZzR.writeByte((byte) i);
        this.zzZzR.writeByte((byte) i2);
    }

    private void zzYu(int i, int i2) throws Exception {
        if (this.zzZzS == null) {
            return;
        }
        this.zzZzR.zzJ((short) i);
        this.zzZzR.writeByte((byte) (this.zzZzS.getCount() * 4));
        for (int i3 = 0; i3 < this.zzZzS.getCount(); i3++) {
            Border border = (Border) this.zzZzS.zzOs(i3).zzPk(i2);
            if (border == null || border.isInherited()) {
                border = zzZzP;
            }
            this.zzZzR.zzl(zzY0E.zzZD(border.zz8Q()));
        }
    }

    public final void zz5g() throws Exception {
        if (this.zzZzS == null) {
            return;
        }
        int i = 0;
        while (i < this.zzZzS.getCount()) {
            zzWP zzwpZzOs = this.zzZzS.zzOs(i);
            int i2 = i + 1;
            zzZ(i, i2, (Border) zzwpZzOs.get(3150), 16, 54816);
            zzZ(i, i2, (Border) zzwpZzOs.get(3150), 16, 54831);
            zzZ(i, i2, (Border) zzwpZzOs.get(3160), 32, 54816);
            zzZ(i, i2, (Border) zzwpZzOs.get(3160), 32, 54831);
            i = i2;
        }
    }

    public final void zz5h() throws Exception {
        zzYu(54810, 3110);
        zzYu(54811, 3120);
        zzYu(54812, 3130);
        zzYu(54813, 3140);
    }

    public final void zz5i() throws Exception {
        for (int i = 0; i < this.zzZzS.getCount(); i++) {
            if (this.zzZzS.zzOs(i).getVerticalMerge() == 1) {
                zzYs(i, 3);
            } else if (this.zzZzS.zzOs(i).getVerticalMerge() == 2) {
                zzYs(i, 1);
            }
        }
    }

    public final void zz5j() throws Exception {
        int i = -1;
        for (int i2 = 0; i2 < this.zzZzS.getCount(); i2++) {
            int horizontalMerge = this.zzZzS.zzOs(i2).getHorizontalMerge();
            if (horizontalMerge == 1 || horizontalMerge == 0) {
                if (i >= 0) {
                    zzYt(i, i2);
                }
                i = horizontalMerge == 1 ? i2 : -1;
            }
        }
        if (i >= 0) {
            zzYt(i, this.zzZzS.getCount());
        }
    }

    public final void zzM(int i, Object obj) throws Exception {
        zzY(54836, 0, 1, i, obj);
    }

    public final void zzOo(int i) throws Exception {
        int count;
        if (zzOn(i)) {
            int iZzG7 = zzZZ5.zzG7(i);
            int i2 = 0;
            boolean z = i != 54793;
            if (z) {
                i2 = iZzG7 * 22;
                if (i2 >= this.zzZzS.getCount()) {
                    return;
                } else {
                    count = Math.min(this.zzZzS.getCount(), (iZzG7 + 1) * 22);
                }
            } else {
                count = this.zzZzS.getCount();
            }
            int iZzYM = (count - i2) * zzYCK.zzYM(z);
            if (iZzYM > 220) {
                throw new IllegalStateException("Cell shading sprm is too long.");
            }
            this.zzZzR.zzJ((short) i);
            this.zzZzR.writeByte((byte) iZzYM);
            while (i2 < count) {
                Shading shading = (Shading) this.zzZzS.zzOs(i2).zzPk(3170);
                if (shading == null || shading.isInherited()) {
                    shading = zzZzQ;
                }
                zzYCK.zzZ(shading, this.zzZzR, z);
                i2++;
            }
        }
    }

    public final void zzYC(boolean z) throws Exception {
        if (z) {
            zzY9K.zzZ(this.zzZzS, 3020, 54837, this);
            return;
        }
        for (int i = 0; i < this.zzZzS.getCount(); i++) {
            if (this.zzZzS.zzOs(i).contains(3020)) {
                zzL(i, i + 1, 3, this.zzZzS.zzOs(i).getWidth());
            }
        }
    }

    public final void zzYD(boolean z) throws Exception {
        if (z) {
            return;
        }
        this.zzZzR.zzVy(30241, (this.zzZzS.getCount() << 8) + 23592960);
    }

    @Override // com.aspose.words.zzZ98
    public final int zzYv(int i, int i2) {
        if (i == 54831) {
            return zzOm(i2);
        }
        if (i == 54834) {
            return zzOl(i2);
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Not implemented for {0} value.", Integer.valueOf(i)));
    }

    @Override // com.aspose.words.zzZ98
    public final void zzZ(int i, int i2, int i3, int i4, Object obj) throws Exception {
        switch (i) {
            case 30243:
                int iIntValue = ((Integer) obj).intValue();
                this.zzZzR.zzJ((short) 30243);
                this.zzZzR.writeByte((byte) i2);
                this.zzZzR.writeByte((byte) i3);
                this.zzZzR.zzK((short) iIntValue);
                return;
            case 30249:
                int iIntValue2 = ((Integer) obj).intValue();
                if (iIntValue2 != 0) {
                    this.zzZzR.zzJ((short) 30249);
                    this.zzZzR.writeByte((byte) i2);
                    this.zzZzR.writeByte((byte) i3);
                    this.zzZzR.zzJ((short) iIntValue2);
                    return;
                }
                return;
            case 54828:
                int iIntValue3 = ((Integer) obj).intValue();
                if (iIntValue3 != 0) {
                    this.zzZzR.zzJ((short) -10708);
                    this.zzZzR.writeByte((byte) 3);
                    this.zzZzR.writeByte((byte) i2);
                    this.zzZzR.writeByte((byte) i3);
                    this.zzZzR.writeByte((byte) iIntValue3);
                    return;
                }
                return;
            case 54831:
                zzZ(i2, i3, (Border) obj, i4, 54831);
                return;
            case 54834:
                zzY(54834, i2, i3, i4, (Integer) obj);
                return;
            case 54837:
                zzL(i2, i3, this.zzZzS.zzOs(i2).getPreferredWidth().getType(), this.zzZzS.zzOs(i2).getPreferredWidth().zzYmE());
                return;
            case 54841:
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                this.zzZzR.zzJ((short) -10695);
                this.zzZzR.writeByte((byte) 3);
                this.zzZzR.writeByte((byte) i2);
                this.zzZzR.writeByte((byte) i3);
                this.zzZzR.writeByte((byte) 1);
                return;
            case 54850:
                if (((Boolean) obj).booleanValue()) {
                    this.zzZzR.zzJ((short) -10686);
                    this.zzZzR.writeByte((byte) 3);
                    this.zzZzR.writeByte((byte) i2);
                    this.zzZzR.writeByte((byte) i3);
                    this.zzZzR.writeByte((byte) 1);
                    return;
                }
                return;
            case 63030:
                if (((Boolean) obj).booleanValue()) {
                    this.zzZzR.zzJ((short) -2506);
                    this.zzZzR.writeByte((byte) i2);
                    this.zzZzR.writeByte((byte) i3);
                    this.zzZzR.writeByte((byte) 1);
                    return;
                }
                return;
            default:
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Not implemented for {0} value.", Integer.valueOf(i)));
        }
    }

    public final void zzZ(zzWO zzwo, int i) throws Exception {
        zzWO zzwo2 = this.zzZzS;
        this.zzZzS = zzwo;
        zzOo(i);
        this.zzZzS = zzwo2;
    }

    public final void zzZ(boolean z, int i, int i2, int i3) throws Exception {
        this.zzZzR.zzJ((short) -10744);
        this.zzZzR.zzK((short) C22213OooOoOO.OooO0O0(this.zzZzS.getCount(), 20, Oooo0.OooO00o(this.zzZzS.getCount(), 1, 2, 1), 1));
        this.zzZzR.writeByte((byte) this.zzZzS.getCount());
        if (z) {
            i = i2;
        }
        int width = i + i3;
        this.zzZzR.zzK((short) width);
        for (int i4 = 0; i4 < this.zzZzS.getCount(); i4++) {
            width += this.zzZzS.zzOs(i4).getWidth();
            this.zzZzR.zzK((short) width);
        }
        for (int i5 = 0; i5 < this.zzZzS.getCount(); i5++) {
            zzV(this.zzZzS.zzOs(i5));
        }
    }

    private void zzZ(int i, int i2, Border border, int i3, int i4) throws Exception {
        if (border == null) {
            return;
        }
        this.zzZzR.zzJ((short) i4);
        this.zzZzR.writeByte((byte) (zzXY.zzYM(i4 == 54831) + 3));
        this.zzZzR.writeByte((byte) i);
        this.zzZzR.writeByte((byte) i2);
        this.zzZzR.writeByte((byte) i3);
        zzXY.zzX(border, this.zzZzR, i4 == 54831);
    }

    public final void zzZ(zzWO zzwo) {
        this.zzZzS = zzwo;
    }

    public final void zzZ(zzY9I zzy9i) {
        this.zzZzR = zzy9i;
    }
}
