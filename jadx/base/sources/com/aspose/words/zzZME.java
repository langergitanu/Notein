package com.aspose.words;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzZME {
    private Style zzYvY;
    private zzZ86 zzYw1;
    private static int[] zzYw0 = {1580, 1610, 1620, 1630, 1640};
    private static int[] zzYvZ = {12, 14, 13, 15, 10010};
    private Style zzYvX = Style.zzl6(1);
    private Style zzYvW = Style.zzl6(1);

    public zzZME(zzZ86 zzz86) {
        this.zzYw1 = zzz86;
        Style styleZzZ7 = zzz86.zzYVG().zzZ7(0, false);
        if (styleZzZ7 != null) {
            int i = !this.zzYw1.zzYVu().zzYVr() ? 40 : 8;
            this.zzYvX.zzZ(styleZzZ7.zzl1(i));
            this.zzYvX.zzZ(styleZzZ7.zzqw(16));
            this.zzYvW.zzZ(styleZzZ7.zzl1(i | 1));
            this.zzYvW.zzZ(styleZzZ7.zzqw(17));
        } else {
            this.zzYvX.zzZYh().zzZ((zzZS) this.zzYvX.zzZYh(), true);
            zzz86.zzYVH().zzY37().zzZ((zzZS) this.zzYvW.zzZYh(), true);
            zzz86.zzYVH().zzY36().zzZ((zzZS) this.zzYvW.zzZYj(), false);
            styleZzZ7 = zzz86.zzYVH().zzZ7(0, false);
            if (styleZzZ7 != null) {
                styleZzZ7.zzZYh().zzZ((zzZS) this.zzYvX.zzZYh(), false);
                styleZzZ7.zzZYh().zzZ((zzZS) this.zzYvW.zzZYh(), false);
                styleZzZ7.zzZYj().zzZ((zzZS) this.zzYvW.zzZYj(), false);
            }
        }
        this.zzYvY = styleZzZ7;
    }

    private boolean zzAI(int i) {
        if (zzY8O.zzkF(i)) {
            return true;
        }
        Style styleZzZ7 = this.zzYw1.zzYVG().zzZ7(179, false);
        return styleZzZ7 != null && styleZzZ7.zzZ7j() == i;
    }

    private zzYMX zzAJ(int i) {
        return ((i & 1) != 0 ? this.zzYvW : this.zzYvX).zzZYj();
    }

    private zzYEF zzAK(int i) {
        return ((i & 1) != 0 ? this.zzYvW : this.zzYvX).zzZYh();
    }

    private Style zzU(Style style) {
        Style styleZz0 = this.zzYw1.zzYVG().zz0(style.getName(), false);
        if (styleZz0 != null) {
            return styleZz0;
        }
        if (!style.getBuiltIn()) {
            return this.zzYw1.zzYVG().zzn(style);
        }
        StyleCollection styleCollectionZzYVG = this.zzYw1.zzYVG();
        Style styleZzm = styleCollectionZzYVG.zzm(style);
        return styleZzm != null ? styleZzm : styleCollectionZzYVG.addCopy(styleCollectionZzYVG.zzY32().zzZ7(style.getStyleIdentifier(), false));
    }

    private zzYEF zzV(Paragraph paragraph, boolean z) {
        Style styleZzZ8;
        int i = !this.zzYw1.zzYVu().zzYVr() ? 545 : InputDeviceCompat.SOURCE_DPAD;
        boolean z2 = paragraph.getParentTable() != null && zzYVU.zzl(paragraph.getParentTable(), this.zzYw1.zzYVv());
        if (!z2) {
            i |= 64;
        }
        if (!paragraph.zzYp5().zz6D() || z) {
            i |= 8;
        }
        zzYEF zzyefZzqv = paragraph.zzqv(i);
        if (this.zzYw1.zzYVx()) {
            Theme.zzZ(this.zzYw1.zzYVJ().zzZqI(), zzyefZzqv);
        }
        zzYEF zzyefZzAK = zzAK(i);
        if (this.zzYw1.zzYVu().zzYVr()) {
            int iIntValue = ((Integer) paragraph.zzWm(1000, 1)).intValue();
            if (zzAI(iIntValue) && (styleZzZ8 = this.zzYw1.zzYVG().zzZ8(iIntValue, false)) != null) {
                zzyefZzAK = styleZzZ8.zzl1(i);
            }
            for (int i2 : zzyefZzAK.zzrc()) {
                zzyefZzqv.zzN(i2, zzYEF.zzne(i2));
            }
        } else {
            zzyefZzqv.zzX(zzyefZzAK);
        }
        zzyefZzqv.remove(50);
        zzYEF zzyefZzYp5 = paragraph.zzYp5();
        if (z) {
            zzyefZzYp5 = (zzYEF) zzyefZzYp5.zzYsN().zzZ6C();
        }
        zzyefZzYp5.zzZ(zzyefZzqv, zzYEF.zzXq4);
        if (z2) {
            zzZ(zzyefZzqv, zzh(paragraph), z);
        }
        return zzyefZzqv;
    }

    private static boolean zzg(int i, Object obj) {
        return (i == 190 || i == 350) ? ((Integer) obj).intValue() == 24 : i == 1020 && ((Integer) obj).intValue() == 0;
    }

    private Style zzh(Paragraph paragraph) {
        Style styleZzZH = zzZ7R.zzZH(paragraph);
        if (styleZzZH == null) {
            return null;
        }
        return this.zzYw1.zzYVG().zzZ(this.zzYw1, styleZzZH);
    }

    public final void zzW(Paragraph paragraph, Paragraph paragraph2) {
        if (paragraph.zzZYj().zz6D()) {
            if (paragraph.zzZYj().zzZ7j() != 0) {
                paragraph2.zzZYj().zzBl(zzU(paragraph.zzqy(0)).zzZ7j());
            }
            WordAttrCollection wordAttrCollectionZzZ6C = paragraph2.zzZYj().zzYsN().zzZ6C();
            wordAttrCollectionZzZ6C.clear();
            zzW(paragraph, true).zzY(wordAttrCollectionZzZ6C);
            zzZMI.zzi(paragraph2);
        } else {
            zzYMX zzymxZzW = zzW(paragraph, false);
            if (paragraph2.zzZYj().hasRevisions()) {
                paragraph2.zzZYj().zzZ(zzymxZzW, zzYvZ);
            }
            paragraph2.zzZ(zzymxZzW);
        }
        if (paragraph.zzYp5().zz6D()) {
            WordAttrCollection wordAttrCollectionZzZ6C2 = paragraph2.zzYp5().zzYsN().zzZ6C();
            wordAttrCollectionZzZ6C2.clear();
            zzV(paragraph, true).zzY(wordAttrCollectionZzZ6C2);
            wordAttrCollectionZzZ6C2.zzX(paragraph2.zzYp5());
            return;
        }
        zzYEF zzyefZzV = zzV(paragraph, false);
        if (paragraph2.zzYp5().hasRevisions()) {
            paragraph2.zzYp5().zzZ(zzyefZzV, zzYvZ);
        }
        paragraph2.zzC(zzyefZzV);
    }

    public final void zzZ(zzZAM zzzam, zzZAM zzzam2) {
        zzYEF zzyefZzZ = zzZ(zzzam, false);
        if (zzzam2.getRunPr_IInline().hasRevisions()) {
            zzzam2.getRunPr_IInline().zzZ(zzyefZzZ, zzYvZ);
        }
        zzzam2.setRunPr_IInline(zzyefZzZ);
        if (zzzam.getRunPr_IInline().zz6D()) {
            WordAttrCollection wordAttrCollectionZzZ6C = zzzam2.getRunPr_IInline().zzYsN().zzZ6C();
            wordAttrCollectionZzZ6C.clear();
            zzZ(zzzam, true).zzY(wordAttrCollectionZzZ6C);
            wordAttrCollectionZzZ6C.zzX(zzzam2.getRunPr_IInline());
        }
    }

    private zzYEF zzZ(zzZAM zzzam, boolean z) {
        Style styleZzZ8;
        int i = !this.zzYw1.zzYVu().zzYVr() ? 544 : 512;
        if (!zzzam.getRunPr_IInline().zz6D() || z) {
            i |= 8;
        }
        Paragraph parentParagraph_IInline = zzzam.getParentParagraph_IInline();
        boolean z2 = parentParagraph_IInline != null && zzYVU.zzl(parentParagraph_IInline, this.zzYw1.zzYVv());
        int i2 = i | (z2 ? 1 : 256);
        boolean z3 = z2 && parentParagraph_IInline.getParentTable() != null && zzYVU.zzl(parentParagraph_IInline.getParentTable(), this.zzYw1.zzYVv());
        if (!z3) {
            i2 |= 64;
        }
        zzYEF expandedRunPr_IInline = zzzam.getExpandedRunPr_IInline(i2);
        this.zzYw1.zzM(expandedRunPr_IInline);
        zzYEF zzyefZzAK = zzAK(i2);
        if (this.zzYw1.zzYVu().zzYVr()) {
            int iIntValue = ((Integer) zzzam.getParentParagraph_IInline().zzWm(1000, 1)).intValue();
            if (zzAI(iIntValue) && (styleZzZ8 = this.zzYw1.zzYVG().zzZ8(iIntValue, false)) != null) {
                zzyefZzAK = styleZzZ8.zzl1(i2);
            }
            for (int i3 : zzyefZzAK.zzrc()) {
                expandedRunPr_IInline.zzN(i3, zzYEF.zzne(i3));
            }
        } else {
            expandedRunPr_IInline.zzX(zzyefZzAK);
        }
        expandedRunPr_IInline.remove(50);
        zzYEF runPr_IInline = zzzam.getRunPr_IInline();
        if (z) {
            runPr_IInline = (zzYEF) runPr_IInline.zzYsN().zzZ6C();
        }
        runPr_IInline.zzZ(expandedRunPr_IInline, zzYEF.zzXq4);
        if (z3) {
            zzZ(expandedRunPr_IInline, zzh(parentParagraph_IInline), z);
        }
        return expandedRunPr_IInline;
    }

    private zzYMX zzW(Paragraph paragraph, boolean z) {
        Style styleZzZ8;
        int i = (paragraph.getParentTable() == null || !zzYVU.zzl(paragraph.getParentTable(), this.zzYw1.zzYVv())) ? 0 : 4;
        int i2 = i | 1;
        if (!paragraph.zzZYj().zz6D() || z) {
            i2 = i | 17;
        }
        zzYMX zzymxZzqw = paragraph.zzqw(i2);
        zzYMX zzymxZzAJ = zzAJ(i2);
        if (this.zzYw1.zzYVu().zzYVr()) {
            if (zzAI(zzymxZzqw.zzZ7j()) && (styleZzZ8 = this.zzYw1.zzYVG().zzZ8(zzymxZzqw.zzZ7j(), false)) != null) {
                zzymxZzAJ = styleZzZ8.zzqw(i2);
            }
            for (int i3 : zzymxZzAJ.zzrc()) {
                zzymxZzqw.zzN(i3, zzYMX.zzOt(i3));
            }
            if (!zzAI(zzymxZzqw.zzZ7j())) {
                zzymxZzqw.remove(1000);
            } else if (zzY8O.zzkF(zzymxZzqw.zzZ7j())) {
                zzymxZzqw.remove(1280);
            }
        } else {
            zzymxZzqw.zzX(zzymxZzAJ);
            zzymxZzqw.remove(1000);
        }
        if (paragraph.zzYBd() instanceof Shape) {
            zzymxZzqw.zzYpk();
        }
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        if (z) {
            zzymxZzZYj = (zzYMX) zzymxZzZYj.zzYsN().zzZ6C();
        }
        zzymxZzZYj.zzZ(zzymxZzqw, zzYw0);
        NodeImporter.zzZ(zzymxZzqw, zzymxZzqw, this.zzYw1);
        if ((4 & i2) != 0) {
            zzZ(zzymxZzqw, zzh(paragraph), z);
        }
        return zzymxZzqw;
    }

    private void zzZ(zzZS zzzs, Style style, boolean z) {
        com.aspose.words.internal.zzZYU zzzyuZzZYh;
        if (style == null) {
            return;
        }
        boolean zZzZ = zzZ7R.zzZ(this.zzYw1.zzYVI(), (TableStyle) style);
        boolean z2 = zzzs instanceof zzYEF;
        WordAttrCollection wordAttrCollectionZzZYh = z2 ? style.zzZYh() : style.zzZYj();
        if (z && wordAttrCollectionZzZYh.zz6D()) {
            wordAttrCollectionZzZYh = wordAttrCollectionZzZYh.zzYsN().zzZ6C();
        }
        Style style2 = this.zzYvY;
        if (style2 != null) {
            zzzyuZzZYh = z2 ? style2.zzZYh() : style2.zzZYj();
        } else {
            zzzyuZzZYh = null;
        }
        for (int count = zzzs.getCount() - 1; count >= 0; count--) {
            int iZzT3 = zzzs.zzT3(count);
            Object obj = wordAttrCollectionZzZYh.get(iZzT3);
            if (obj != null) {
                Object obj2 = zzzyuZzZYh != null ? zzzyuZzZYh.get(iZzT3) : null;
                if ((obj2 == null || (zZzZ && zzg(iZzT3, obj2))) && obj.equals(zzzs.get(iZzT3))) {
                    zzzs.removeAt(count);
                }
            }
        }
    }
}
