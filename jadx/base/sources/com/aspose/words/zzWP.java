package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzWP extends WordAttrCollection implements zzZD5 {
    private static zzWP zzZzV;
    static com.aspose.words.internal.zzZQH<Integer, Integer> zzZzU = new com.aspose.words.internal.zzZQH<>();
    static int[] zzZzT = {3120, 3140, 3110, 3130, 3210, 3200, 3150, 3160};

    static {
        zzWP zzwp = new zzWP();
        zzZzV = zzwp;
        zzwp.add(3010, 0);
        zzZzV.add(3020, PreferredWidth.AUTO);
        zzZzV.add(3030, 0);
        zzZzV.add(3040, 0);
        zzZzV.add(3050, 0);
        zzZzV.add(3060, 0);
        zzZzV.add(3070, 0);
        zzZzV.add(3080, 0);
        zzZzV.add(3090, 0);
        zzZzV.add(3100, 0);
        zzZzV.add(3180, Boolean.TRUE);
        zzWP zzwp2 = zzZzV;
        Boolean bool = Boolean.FALSE;
        zzwp2.add(3220, bool);
        zzZzV.add(3190, bool);
        zzZzV.add(3110, new Border());
        zzZzV.add(3120, new Border());
        zzZzV.add(3130, new Border());
        zzZzV.add(3140, new Border());
        zzZzV.add(3150, new Border());
        zzZzV.add(3160, new Border());
        zzZzV.add(3200, new Border());
        zzZzV.add(3210, new Border());
        zzZzV.add(3170, new Shading());
        zzZzV.add(3900, 1);
        zzZzU.zzB(3, 3110);
        zzZzU.zzB(1, 3120);
        zzZzU.zzB(0, 3130);
        zzZzU.zzB(2, 3140);
        zzZzU.zzB(6, 3150);
        zzZzU.zzB(7, 3160);
    }

    public static Object zzOt(int i) {
        return zzZzV.zzPj(i);
    }

    @Override // com.aspose.words.zzZD5
    public final void clearCellAttrs() {
        clear();
    }

    @Override // com.aspose.words.zzZD5
    public final Object fetchCellAttr(int i) {
        return zzPj(i);
    }

    @Override // com.aspose.words.zzZD5
    public final Object fetchInheritedCellAttr(int i) {
        return zzPi(i);
    }

    public final int getBottomPadding() {
        return ((Integer) zzPj(3080)).intValue();
    }

    @Override // com.aspose.words.zzZD5
    public final Object getDirectCellAttr(int i) {
        return zzPk(i);
    }

    public final boolean getFitText() {
        return ((Boolean) zzPj(3190)).booleanValue();
    }

    public final boolean getHideMark() {
        return ((Boolean) zzPj(3220)).booleanValue();
    }

    public final int getHorizontalMerge() {
        return ((Integer) zzPj(3040)).intValue();
    }

    public final int getLeftPadding() {
        return ((Integer) zzPj(3090)).intValue();
    }

    public final int getOrientation() {
        return ((Integer) zzPj(3050)).intValue();
    }

    public final PreferredWidth getPreferredWidth() {
        return (PreferredWidth) zzPj(3020);
    }

    public final int getRightPadding() {
        return ((Integer) zzPj(3100)).intValue();
    }

    public final Shading getShading() {
        return (Shading) zzPk(3170);
    }

    public final int getTopPadding() {
        return ((Integer) zzPj(3070)).intValue();
    }

    public final int getVerticalAlignment() {
        return ((Integer) zzPj(3060)).intValue();
    }

    public final int getVerticalMerge() {
        return ((Integer) zzPj(3030)).intValue();
    }

    public final int getWidth() {
        return ((Integer) zzPj(3010)).intValue();
    }

    public final boolean getWrapText() {
        return ((Boolean) zzPj(3180)).booleanValue();
    }

    @Override // com.aspose.words.zzZD5
    public final void setCellAttr(int i, Object obj) {
        zzQ(i, obj);
    }

    public final void setHideMark(boolean z) {
        zzQ(3220, Boolean.valueOf(z));
    }

    public final void setHorizontalMerge(int i) {
        zzQ(3040, Integer.valueOf(i));
    }

    public final void setPreferredWidth(PreferredWidth preferredWidth) {
        zzQ(3020, preferredWidth);
    }

    public final void setVerticalAlignment(int i) {
        zzQ(3060, Integer.valueOf(i));
    }

    public final void setVerticalMerge(int i) {
        zzQ(3030, Integer.valueOf(i));
    }

    public final void setWidth(int i) {
        zzQ(3010, Integer.valueOf(i));
    }

    public final Border zz5A() {
        return (Border) zzPk(3110);
    }

    public final boolean zz5B() {
        return getHorizontalMerge() == 2 || getVerticalMerge() == 2;
    }

    public final boolean zz5C() {
        PreferredWidth preferredWidth = (PreferredWidth) zzPk(3020);
        if (getWidth() > 0 || zz5B()) {
            return false;
        }
        if (preferredWidth != null && preferredWidth.isFixed() && preferredWidth.zzYmC()) {
            setWidth(preferredWidth.zzYmD());
            return true;
        }
        setWidth(1440);
        return true;
    }

    public final void zz5D() {
        Iterator<Integer> it = zzZzU.zzl9().iterator();
        while (it.hasNext()) {
            remove(it.next().intValue());
        }
    }

    public final int zz5q() {
        return ((Integer) zzPj(3900)).intValue();
    }

    public final zzWP zz5r() {
        if (!zz6D()) {
            return this;
        }
        zzWP zzwp = (zzWP) zzbn();
        zzwp.zzYpN();
        return zzwp;
    }

    public final zzWP zz5s() {
        return zz6D() ? (zzWP) zzYsN().zzZ6C() : this;
    }

    public final Border zz5t() {
        return (Border) zzPk(3210);
    }

    public final Border zz5u() {
        return (Border) zzPk(3200);
    }

    public final Border zz5v() {
        return (Border) zzPk(3160);
    }

    public final Border zz5w() {
        return (Border) zzPk(3150);
    }

    public final Border zz5x() {
        return (Border) zzPk(3140);
    }

    public final Border zz5y() {
        return (Border) zzPk(3120);
    }

    public final Border zz5z() {
        return (Border) zzPk(3130);
    }

    public final void zzJ(Border border) {
        zzQ(3160, border);
    }

    public final void zzK(Border border) {
        zzQ(3150, border);
    }

    public final void zzL(Object obj, int i) {
        if (i == 0) {
            if (zzYsN() != null && !zzYsN().zzZ6C().contains(3030)) {
                zzY(zzYsN().zzZ6C(), 3030);
            }
            zzQ(3030, obj);
            return;
        }
        if (com.aspose.words.internal.zzZKO.equals(zzVR(3030, i), obj)) {
            return;
        }
        if (zzYsN() == null) {
            zzZ(new zzZMK(new zzWP(), "", com.aspose.words.internal.zzZQ9.zzQO()));
        }
        zzYsN().zzZ6C().zzQ(3030, obj);
    }

    public final void zzM(Border border) {
        zzQ(3120, border);
    }

    public final void zzN(Border border) {
        zzQ(3130, border);
    }

    public final void zzO(Border border) {
        zzQ(3110, border);
    }

    public final void zzOu(int i) {
        zzQ(3900, Integer.valueOf(i));
    }

    public final void zzY(zzWP zzwp) {
        Iterator<Integer> it = zzZzU.zzl9().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (contains(iIntValue)) {
                Border border = new Border();
                border.zzW((Border) get(iIntValue));
                zzwp.set(iIntValue, border);
            } else {
                zzwp.remove(iIntValue);
            }
        }
    }

    public final void zzZ(PreferredWidth preferredWidth) {
        setPreferredWidth(preferredWidth);
        if (preferredWidth.isFixed()) {
            setWidth(preferredWidth.zzYmD());
        }
    }

    @Override // com.aspose.words.zzZS
    public final zzZS zzbo() {
        return zzZzV;
    }

    public final void zzZ(Shading shading) {
        zzQ(3170, shading);
    }

    public final void zzL(Border border) {
        zzQ(3140, border);
    }
}
