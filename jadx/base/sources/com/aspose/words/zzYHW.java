package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHW {
    static boolean zzZD5 = false;
    private zzYEM zzXwl;

    public zzYHW(zzYEM zzyem) {
        this.zzXwl = zzyem;
    }

    private void zzZ(Border border, zzZD5 zzzd5, int i, boolean z) throws Exception {
        if (border == null || border.isInherited() || border.equals(Border.zzZCe)) {
            border = (Border) zzzd5.fetchInheritedCellAttr(i);
        }
        if (border.isVisible() || !this.zzXwl.zzYen().getExportCompactSize()) {
            this.zzXwl.zzYfW().zzCD(zzYHY.zzZo(i, z));
            if (border.isVisible()) {
                zzYI0.zzY(this.zzXwl, border);
            } else {
                if (z) {
                    return;
                }
                this.zzXwl.zzYfW().zzCD("\\brdrnone");
            }
        }
    }

    private void zzp1(int i) throws Exception {
        if (i == 1) {
            this.zzXwl.zzYfW().zzCD("\\clvmgf");
        } else {
            if (i != 2) {
                return;
            }
            this.zzXwl.zzYfW().zzCD("\\clvmrg");
        }
    }

    private void zzp2(int i) throws Exception {
        if (i == 1) {
            this.zzXwl.zzYfW().zzCD("\\clmgf");
        } else {
            if (i != 2) {
                return;
            }
            this.zzXwl.zzYfW().zzCD("\\clmrg");
        }
    }

    public final void zzR(zzWP zzwp) throws Exception {
        zzY(zzwp, false);
    }

    public final void zzY(zzWP zzwp, boolean z) throws Exception {
        int i;
        Border border = null;
        Border border2 = null;
        Border border3 = null;
        Border border4 = null;
        Border border5 = null;
        Border border6 = null;
        Border border7 = null;
        Shading shading = null;
        int i2 = 0;
        Border border8 = null;
        while (i2 < zzwp.getCount()) {
            int iZzT3 = zzwp.zzT3(i2);
            Object objZzVY = zzwp.zzVY(i2);
            switch (iZzT3) {
                case 3010:
                case 10010:
                    break;
                case 3020:
                    i = i2;
                    this.zzXwl.zzYfW().zzZ("\\clwWidth", "\\clftsWidth", (PreferredWidth) objZzVY);
                    continue;
                    i2 = i + 1;
                    break;
                case 3030:
                    zzp1(((Integer) objZzVY).intValue());
                    break;
                case 3040:
                    zzp2(((Integer) objZzVY).intValue());
                    break;
                case 3050:
                    this.zzXwl.zzYfW().zzCD(zzYHY.zzp4(((Integer) objZzVY).intValue()));
                    break;
                case 3060:
                    this.zzXwl.zzYfW().zzCD(zzYHY.zzZq(((Integer) objZzVY).intValue(), z));
                    break;
                case 3070:
                    this.zzXwl.zzYfW().zzZ5(z ? "\\tscellpaddl" : "\\clpadl", ((Integer) objZzVY).intValue());
                    this.zzXwl.zzYfW().zzCD(z ? "\\tscellpaddfl3" : "\\clpadfl3");
                    break;
                case 3080:
                    this.zzXwl.zzYfW().zzZ5(z ? "\\tscellpaddb" : "\\clpadb", ((Integer) objZzVY).intValue());
                    this.zzXwl.zzYfW().zzCD(z ? "\\tscellpaddfb3" : "\\clpadfb3");
                    break;
                case 3090:
                    this.zzXwl.zzYfW().zzZ5(z ? "\\tscellpaddt" : "\\clpadt", ((Integer) objZzVY).intValue());
                    this.zzXwl.zzYfW().zzCD(z ? "\\tscellpaddft3" : "\\clpadft3");
                    break;
                case 3100:
                    this.zzXwl.zzYfW().zzZ5(z ? "\\tscellpaddr" : "\\clpadr", ((Integer) objZzVY).intValue());
                    this.zzXwl.zzYfW().zzCD(z ? "\\tscellpaddfr3" : "\\clpadfr3");
                    break;
                case 3110:
                    i = i2;
                    border2 = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 3120:
                    i = i2;
                    border = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 3130:
                    i = i2;
                    border3 = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 3140:
                    i = i2;
                    border8 = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 3150:
                    i = i2;
                    border5 = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 3160:
                    i = i2;
                    border4 = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 3170:
                    i = i2;
                    shading = (Shading) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 3180:
                    this.zzXwl.zzYfW().zz7(z ? "\\tsnowrap" : "\\clNoWrap", !((Boolean) objZzVY).booleanValue());
                    break;
                case 3190:
                    this.zzXwl.zzYfW().zz7("\\clFitText", ((Boolean) objZzVY).booleanValue());
                    break;
                case 3200:
                    i = i2;
                    border6 = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 3210:
                    i = i2;
                    border7 = (Border) objZzVY;
                    continue;
                    i2 = i + 1;
                    break;
                case 3220:
                    this.zzXwl.zzYfW().zz7("\\clhidemark", ((Boolean) objZzVY).booleanValue());
                    break;
                default:
                    if (zzZD5) {
                        com.aspose.words.internal.zzZKN.format("Unhandled cell attribute: {0}", Integer.valueOf(iZzT3));
                    }
                    break;
            }
            i = i2;
            i2 = i + 1;
        }
        zzZ(border, zzwp, 3120, z);
        zzZ(border8, zzwp, 3140, z);
        zzZ(border2, zzwp, 3110, z);
        zzZ(border3, zzwp, 3130, z);
        zzZ(border4, zzwp, 3160, z);
        zzZ(border5, zzwp, 3150, z);
        if (z) {
            zzZ(border6, zzwp, 3200, z);
            zzZ(border7, zzwp, 3210, z);
        }
        zzZ(shading, zzwp, z);
    }

    private void zzZ(Shading shading, zzZD5 zzzd5, boolean z) throws Exception {
        if (shading == null || shading.isInherited()) {
            shading = (Shading) zzzd5.fetchInheritedCellAttr(3170);
        }
        Shading shading2 = shading;
        if (shading2.isVisible()) {
            zzYFH.zzZ(this.zzXwl, shading2, z ? "\\tscellpct" : "\\clshdng", z ? "\\tscellcbpat" : "\\clcbpat", z ? "\\tscellcfpat" : "\\clcfpat", zzYHY.zzZp(shading2.getTexture(), z));
        }
    }
}
