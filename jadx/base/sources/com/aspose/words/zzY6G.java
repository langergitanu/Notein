package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6G extends WordAttrCollection implements zzZ9J {
    private static zzY6G zzX4X;
    static com.aspose.words.internal.zzZQH<Integer, Integer> zzZzU = new com.aspose.words.internal.zzZQH<>();

    static {
        zzY6G zzy6g = new zzY6G();
        zzX4X = zzy6g;
        zzy6g.add(4050, new Border());
        zzX4X.add(4060, new Border());
        zzX4X.add(4070, new Border());
        zzX4X.add(4080, new Border());
        zzX4X.add(4090, new Border());
        zzX4X.add(EditingLanguage.CHINESE_SINGAPORE, new Border());
        zzX4X.add(4330, new Shading());
        zzX4X.add(4005, 11);
        zzX4X.add(4140, Integer.valueOf(TableStyleOptions.DEFAULT));
        zzX4X.add(4230, PreferredWidth.AUTO);
        zzY6G zzy6g2 = zzX4X;
        Boolean bool = Boolean.FALSE;
        zzy6g2.add(4240, bool);
        zzX4X.add(4340, 0);
        zzX4X.add(4250, 0);
        zzX4X.add(4251, 0);
        zzX4X.add(4260, 0);
        zzX4X.add(4253, PreferredWidth.fromPoints(0.0d));
        zzX4X.add(4261, PreferredWidth.fromPoints(0.0d));
        zzX4X.add(4010, 0);
        zzX4X.add(4380, bool);
        zzX4X.add(4300, 0);
        zzX4X.add(4310, 0);
        zzX4X.add(4020, 0);
        zzX4X.add(4320, 0);
        zzX4X.add(4290, PreferredWidth.zzXDr);
        zzX4X.add(4120, new zzZKP(2, 0));
        zzY6G zzy6g3 = zzX4X;
        Boolean bool2 = Boolean.TRUE;
        zzy6g3.add(4360, bool2);
        zzX4X.add(4040, bool);
        zzX4X.add(4350, bool2);
        zzX4X.add(4220, 0);
        zzX4X.add(4280, 0);
        zzX4X.add(4210, 0);
        zzX4X.add(4270, 0);
        zzX4X.add(4150, 2);
        zzX4X.add(4160, 0);
        zzX4X.add(4170, 0);
        zzX4X.add(4190, 0);
        zzX4X.add(4180, 0);
        zzX4X.add(4200, 0);
        zzX4X.add(4500, 0);
        zzX4X.add(4510, 0);
        zzX4X.add(5000, "");
        zzX4X.add(5010, "");
        zzX4X.add(4520, bool);
        zzX4X.add(5015, 0);
        zzX4X.add(5104, 0);
        zzX4X.add(5105, 0);
        zzX4X.add(5102, 0);
        zzX4X.add(5112, bool);
        zzX4X.add(5108, 0);
        zzX4X.add(5109, 0);
        zzX4X.add(5101, 0);
        zzZzU.zzB(3, 4050);
        zzZzU.zzB(1, 4060);
        zzZzU.zzB(0, 4070);
        zzZzU.zzB(2, 4080);
        zzZzU.zzB(4, 4090);
        zzZzU.zzB(5, Integer.valueOf(EditingLanguage.CHINESE_SINGAPORE));
    }

    private boolean getAllowOverlap() {
        return ((Boolean) zzPj(4350)).booleanValue();
    }

    private int getRelativeHorizontalPosition() {
        return ((Integer) zzPj(4150)).intValue();
    }

    private void setPreferredWidth(PreferredWidth preferredWidth) {
        zzQ(4230, preferredWidth);
    }

    public static Object zzOt(int i) {
        return zzX4X.zzPj(i);
    }

    private int zzP(zzWP zzwp) {
        Border borderZz5y = zzwp.zz5y();
        if (borderZz5y == null) {
            borderZz5y = zz5y();
        }
        if (borderZz5y != null) {
            return com.aspose.words.internal.zzSA.zzYF(borderZz5y.zz8L());
        }
        return 0;
    }

    private int zzQ(zzWP zzwp) {
        Object objZzPk = zzwp.zzPk(3090);
        return objZzPk != null ? ((Integer) objZzPk).intValue() : getLeftPadding();
    }

    public static zzY6G zzXXu() {
        zzY6G zzy6g = new zzY6G();
        zzy6g.zzwx(108);
        zzy6g.zzwu(108);
        zzy6g.zzXXq();
        zzy6g.setPreferredWidth(PreferredWidth.fromPercent(100.0d));
        Iterator<Integer> it = zzZzU.zzl9().iterator();
        while (it.hasNext()) {
            zzy6g.zzQ(it.next().intValue(), new Border(1, 4, com.aspose.words.internal.zzPV.zzHZ));
        }
        return zzy6g;
    }

    public static int zzjU(int i) {
        return i ^ TableStyleOptions.DEFAULT_2003;
    }

    public static int zzqE(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 2) {
            return i;
        }
        return 0;
    }

    @Override // com.aspose.words.zzZ9J
    public final void clearRowAttrs() {
        clear();
    }

    @Override // com.aspose.words.zzZ9J
    public final Object fetchInheritedRowAttr(int i) {
        return zzPi(i);
    }

    @Override // com.aspose.words.zzZ9J
    public final Object fetchRowAttr(int i) {
        return zzPj(i);
    }

    public final int getAlignment() {
        return ((Integer) zzPj(4010)).intValue();
    }

    public final boolean getAllowAutoFit() {
        return ((Boolean) zzPj(4240)).booleanValue();
    }

    public final boolean getAllowBreakAcrossPages() {
        return ((Boolean) zzPj(4360)).booleanValue();
    }

    public final boolean getBidi() {
        return ((Boolean) zzPj(4380)).booleanValue();
    }

    public final int getBottomPadding() {
        return ((Integer) zzPj(4310)).intValue();
    }

    public final String getDescription() {
        return (String) zzPj(5010);
    }

    @Override // com.aspose.words.zzZ9J
    public final Object getDirectRowAttr(int i) {
        return zzPk(i);
    }

    public final boolean getHeadingFormat() {
        return ((Boolean) zzPj(4040)).booleanValue();
    }

    public final int getHeight() {
        return ((zzZKP) zzPj(4120)).getValue();
    }

    public final int getHeightRule() {
        return ((zzZKP) zzPj(4120)).zzZ4A();
    }

    public final boolean getHidden() {
        return ((Boolean) zzPj(4520)).booleanValue();
    }

    public final int getHorizontalAlignment() {
        return ((Integer) zzPj(4180)).intValue();
    }

    public final int getLeftPadding() {
        return ((Integer) zzPj(4020)).intValue();
    }

    public final int getRelativeVerticalPosition() {
        return ((Integer) zzPj(4160)).intValue();
    }

    public final int getRightPadding() {
        return ((Integer) zzPj(4320)).intValue();
    }

    public final Shading getShading() {
        return (Shading) zzPk(4330);
    }

    public final int getStyleOptions() {
        return ((Integer) zzPj(4140)).intValue();
    }

    public final String getTitle() {
        return (String) zzPj(5000);
    }

    public final int getTopPadding() {
        return ((Integer) zzPj(4300)).intValue();
    }

    public final int getVerticalAlignment() {
        return ((Integer) zzPj(4200)).intValue();
    }

    public final boolean isFloating() {
        return zzVE(4170) || zzVE(4190) || zzXXk() || zzXXg() || zzXXh() || (zzXXj() && getRelativeVerticalPosition() != 1);
    }

    @Override // com.aspose.words.zzZ9J
    public final void resetToDefaultAttrs() {
        clearRowAttrs();
    }

    public final void setAlignment(int i) {
        zzQ(4010, Integer.valueOf(i));
    }

    public final void setDescription(String str) {
        zzQ(5010, str);
    }

    public final void setHeight(int i) {
        ((zzZKP) zzhM(4120)).setValue(i);
    }

    public final void setHeightRule(int i) {
        ((zzZKP) zzhM(4120)).zzAe(i);
    }

    @Override // com.aspose.words.zzZ9J
    public final void setRowAttr(int i, Object obj) {
        zzQ(i, obj);
    }

    public final void setTitle(String str) {
        zzQ(5000, str);
    }

    public final Border zz5A() {
        return (Border) zzPk(4050);
    }

    public final void zz5D() {
        Iterator<Integer> it = zzZzU.zzl9().iterator();
        while (it.hasNext()) {
            remove(it.next().intValue());
        }
    }

    public final zzWO zz5l() {
        return (zzWO) zzPk(5100);
    }

    public final Border zz5t() {
        return (Border) zzPk(EditingLanguage.CHINESE_SINGAPORE);
    }

    public final Border zz5u() {
        return (Border) zzPk(4090);
    }

    public final Border zz5x() {
        return (Border) zzPk(4080);
    }

    public final Border zz5y() {
        return (Border) zzPk(4060);
    }

    public final Border zz5z() {
        return (Border) zzPk(4070);
    }

    public final void zzBl(int i) {
        zzQ(4005, Integer.valueOf(i));
    }

    public final boolean zzE(zzY6G zzy6g) {
        boolean zIsFloating = isFloating();
        boolean zIsFloating2 = zzy6g.isFloating();
        if (zIsFloating || zIsFloating2) {
            return zIsFloating == zIsFloating2 && getAllowOverlap() == zzy6g.getAllowOverlap() && getRelativeHorizontalPosition() == zzy6g.getRelativeHorizontalPosition() && getRelativeVerticalPosition() == zzy6g.getRelativeVerticalPosition() && zzYpC() == zzy6g.zzYpC() && zzYpB() == zzy6g.zzYpB() && getHorizontalAlignment() == zzy6g.getHorizontalAlignment() && getVerticalAlignment() == zzy6g.getVerticalAlignment();
        }
        return true;
    }

    public final int zzW(zzWP zzwp, boolean z) {
        if (z) {
            return (-zzP(zzwp)) / 2;
        }
        int iZzQ = zzQ(zzwp);
        int iZzYmE = zzXXp().zzYmE() * 2;
        int iZzP = (iZzQ == 0 || iZzYmE > 0) ? zzP(zzwp) : 0;
        if (iZzYmE == 0) {
            iZzP /= 2;
        }
        if (iZzYmE <= 0) {
            iZzYmE = 0;
        }
        return iZzQ + iZzYmE + iZzP;
    }

    public final int zzX(zzWP zzwp, boolean z) {
        return zzYM7() - zzW(zzwp, z);
    }

    public final zzY6G zzXXa() {
        if (!zz6D()) {
            return this;
        }
        zzY6G zzy6g = (zzY6G) zzbn();
        zzy6g.zzYpN();
        return zzy6g;
    }

    public final zzY6G zzXXb() {
        return zz6D() ? (zzY6G) zzYsN().zzZ6C() : this;
    }

    public final void zzXXc() {
        remove(5100);
        zzZMK zzzmkZzYsN = zzYsN();
        if (zzzmkZzYsN != null) {
            zzzmkZzYsN.zzZ6C().remove(5100);
        }
    }

    public final void zzXXd() {
        zzQ(4520, Boolean.TRUE);
    }

    public final int zzXXe() {
        return ((Integer) zzPj(4251)).intValue();
    }

    public final zzY6U zzXXf() {
        return (zzY6U) zzPk(5106);
    }

    public final boolean zzXXg() {
        return zzVE(4180) && getHorizontalAlignment() != 0;
    }

    public final boolean zzXXh() {
        return zzVE(4200) && getVerticalAlignment() != 0;
    }

    public final void zzXXi() {
        zzQ(4190, 0);
    }

    public final boolean zzXXj() {
        return zzVE(4160) && getRelativeVerticalPosition() != 0;
    }

    public final boolean zzXXk() {
        return zzVE(4150) && getRelativeHorizontalPosition() != 2;
    }

    public final int zzXXl() {
        return ((Integer) zzPj(4210)).intValue();
    }

    public final int zzXXm() {
        return ((Integer) zzPj(4270)).intValue();
    }

    public final int zzXXn() {
        return ((Integer) zzPj(4280)).intValue();
    }

    public final int zzXXo() {
        return ((Integer) zzPj(4220)).intValue();
    }

    public final PreferredWidth zzXXp() {
        return (PreferredWidth) zzPj(4290);
    }

    public final void zzXXq() {
        zzQ(4240, Boolean.TRUE);
    }

    public final boolean zzXXr() {
        return zzVE(4050) || zzVE(4060) || zzVE(4070) || zzVE(4080) || zzVE(4090) || zzVE(EditingLanguage.CHINESE_SINGAPORE);
    }

    public final int zzXXs() {
        return ((Integer) zzPj(4510)).intValue();
    }

    public final int zzXXt() {
        return ((Integer) zzPj(4500)).intValue();
    }

    public final void zzY(zzY6U zzy6u) {
        zzQ(5106, zzy6u);
    }

    public final int zzYM7() {
        return ((Integer) zzPj(4340)).intValue();
    }

    public final int zzYk7() {
        return ((Integer) zzPj(4260)).intValue();
    }

    public final int zzYk8() {
        return ((Integer) zzPj(5105)).intValue();
    }

    public final int zzYk9() {
        return ((Integer) zzPj(4250)).intValue();
    }

    public final int zzYka() {
        return ((Integer) zzPj(5104)).intValue();
    }

    public final int zzYpB() {
        return ((Integer) zzPj(4190)).intValue();
    }

    public final int zzYpC() {
        return ((Integer) zzPj(4170)).intValue();
    }

    public final int zzYps() {
        return ((Integer) zzPj(5015)).intValue();
    }

    public final void zzZ(Shading shading) {
        zzQ(4330, shading);
    }

    public final int zzZ7j() {
        return ((Integer) zzPj(4005)).intValue();
    }

    @Override // com.aspose.words.zzZS
    public final zzZS zzbo() {
        return zzX4X;
    }

    public final void zzpf(int i) {
        zzQ(4260, Integer.valueOf(i));
    }

    public final void zzph(int i) {
        zzQ(4250, Integer.valueOf(i));
    }

    public final void zzqF(int i) {
        zzQ(5015, Integer.valueOf(i));
    }

    public final void zzwa(int i) {
        zzQ(4340, Integer.valueOf(i));
    }

    public final void zzws(int i) {
        zzQ(4310, Integer.valueOf(i));
    }

    public final void zzwu(int i) {
        zzQ(4320, Integer.valueOf(i));
    }

    public final void zzwv(int i) {
        zzQ(4300, Integer.valueOf(i));
    }

    public final void zzwx(int i) {
        zzQ(4020, Integer.valueOf(i));
    }
}
