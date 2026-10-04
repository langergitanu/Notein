package com.aspose.words;

import com.aspose.words.ref.RefBoolean;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8S extends zzZPS {
    private String zzX9A;
    private zzY8J zzX9v;
    private boolean zzX9w;
    private HashMap<String, Boolean> zzX9x = new HashMap<>();
    private String[] zzX9y;
    private String[] zzX9z;
    private int zzXI9;
    private String zzXRk;
    private StyleCollection zzYSm;

    private zzY8S(String str, StyleCollection styleCollection) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzYSm = styleCollection;
        this.zzXRk = str;
        this.zzX9A = zzY8M.zzAD(str);
        String[] strArrZzZ = com.aspose.words.internal.zzZKN.zzZ(str, new String[]{Character.toString(com.aspose.words.internal.zzJB.zzH2())}, com.aspose.words.internal.zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd);
        this.zzX9z = strArrZzZ;
        this.zzX9y = new String[strArrZzZ.length];
        int i = 0;
        while (true) {
            String[] strArr = this.zzX9z;
            if (i >= strArr.length) {
                this.zzXI9 = com.aspose.words.internal.zzJB.zzZo(str);
                return;
            } else {
                this.zzX9y[i] = zzY8M.zzAD(strArr[i]);
                i++;
            }
        }
    }

    private boolean zzAH(String str) {
        Iterator<Style> it = this.zzYSm.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzZ(it.next(), str)) {
                i++;
            }
            if (i > 1) {
                return true;
            }
        }
        return false;
    }

    private boolean zzAI(String str) {
        RefBoolean refBoolean = new RefBoolean(false);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzX9x, str, refBoolean);
        boolean z = refBoolean.get();
        if (zZzZ) {
            return z;
        }
        boolean zZzAH = zzAH(str);
        this.zzX9x.put(str, Boolean.valueOf(zZzAH));
        return zZzAH;
    }

    private boolean zzAJ(String str) {
        return zzr(str, this.zzXRk, this.zzX9A);
    }

    private boolean zzN(zzZAM zzzam) {
        return zzX(zzzam.getRunPr_IInline(), false);
    }

    private boolean zzR(Field field, boolean z) throws Exception {
        this.zzX9w = z;
        return zzZ((Node) field.getStart().getParentParagraph(), z, false) != null;
    }

    private boolean zzX(zzZS zzzs, boolean z) {
        int iIntValue = ((Integer) zzzs.zzPj(z ? 1000 : 50)).intValue();
        int i = this.zzXI9;
        if (i != Integer.MIN_VALUE) {
            return i == iIntValue;
        }
        return zzi(this.zzYSm.zzVp(iIntValue, z ? 0 : 10));
    }

    private void zzY(FieldStyleRef fieldStyleRef) throws Exception {
        this.zzX9w = !fieldStyleRef.getSearchFromBottom();
        zzG(fieldStyleRef);
    }

    private boolean zzY0(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        return zzAI(str2) ? com.aspose.words.internal.zzZKN.zzX(str, str2, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) : com.aspose.words.internal.zzZYD.zzi(str, str2);
    }

    private static boolean zzYa(Paragraph paragraph) {
        return (paragraph.getParentNode().getNodeType() == 7 && paragraph.zzYB4() == null) ? false : true;
    }

    private boolean zzYb(Paragraph paragraph) {
        return zzX(paragraph.zzYp5(), false);
    }

    private static boolean zzYc(Paragraph paragraph) {
        return paragraph.zzYp8() && paragraph.getRuns().getCount() == 0;
    }

    private boolean zzYd(Paragraph paragraph) {
        return (this.zzX9w && zzYc(paragraph)) ? false : true;
    }

    private boolean zzYe(Paragraph paragraph) {
        return zzYd(paragraph) && zzX(paragraph.zzZYj(), true);
    }

    public static NodeCollection zzYf(Paragraph paragraph) {
        return paragraph.zzY(new int[]{21, 20}, false);
    }

    private zzY8J zzYg(Paragraph paragraph) {
        boolean z;
        if (paragraph.getAncestor(3) == null) {
            return null;
        }
        if (zzYe(paragraph)) {
            return zzY8J.zzN(paragraph, this.zzX9w);
        }
        boolean z2 = false;
        boolean z3 = !this.zzX9w && zzYb(paragraph);
        boolean z4 = z3 && zzYa(paragraph);
        NodeCollection nodeCollectionZzYf = zzYf(paragraph);
        int count = nodeCollectionZzYf.getCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < count; i3++) {
            int i4 = this.zzX9w ? i3 : (count - 1) - i3;
            if (!zzN((zzZAM) nodeCollectionZzYf.get(i4))) {
                if (i >= 0 || z4) {
                    break;
                }
            } else if (i < 0) {
                i = i4;
                i2 = i;
            } else {
                i2 = i4;
            }
        }
        if (this.zzX9w) {
            int iMax = Math.max(i, i2);
            z3 = (iMax < 0 || iMax == count - 1) && zzYb(paragraph);
            if (z3 && zzYa(paragraph)) {
                z2 = true;
            }
            z = z2;
        } else {
            z = z4;
        }
        return zzY8J.zzZ(paragraph, i, i2, this.zzX9w, z, z3);
    }

    public static zzY8J zzZ(FieldStyleRef fieldStyleRef, String str) throws Exception {
        return new zzY8S(str, fieldStyleRef.getStart().getDocument().getStyles()).zzZ(fieldStyleRef);
    }

    private void zzZT(Field field) throws Exception {
        if (zzR(field, false)) {
            return;
        }
        zzR(field, true);
    }

    private boolean zzh(Style style) {
        String[] strArrZzY3w = style.zzY3w();
        String name = style.getName();
        int i = 0;
        while (true) {
            String[] strArr = this.zzX9z;
            if (i >= strArr.length) {
                return true;
            }
            String str = strArr[i];
            String str2 = this.zzX9y[i];
            if (!zzr(name, str, str2) && !zzZ(strArrZzY3w, str, str2)) {
                return false;
            }
            i++;
        }
    }

    private boolean zzi(Style style) {
        if (zzAJ(style.getName()) || zzAJ(style.zzY3x())) {
            return true;
        }
        for (String str : style.zzY3w()) {
            if (zzAJ(str)) {
                return true;
            }
        }
        return zzh(style);
    }

    private boolean zzr(String str, String str2, String str3) {
        return zzY0(str, str2) || zzY0(str, str3);
    }

    @Override // com.aspose.words.zzZPS
    public final boolean zz4r() {
        return this.zzX9w;
    }

    @Override // com.aspose.words.zzZPS
    public final Paragraph zzW(Paragraph paragraph) {
        if (paragraph == null) {
            return null;
        }
        zzY8J zzy8jZzYg = zzYg(paragraph);
        this.zzX9v = zzy8jZzYg;
        if (zzy8jZzYg != null) {
            return zzy8jZzYg.getParagraph();
        }
        return null;
    }

    @Override // com.aspose.words.zzZPS
    public final void zzZcD() {
        this.zzX9w = true;
    }

    @Override // com.aspose.words.zzZPS
    public final void zzZcE() {
        this.zzX9w = false;
    }

    @Override // com.aspose.words.zzZPS
    public final boolean zzp(Paragraph paragraph) {
        return !this.zzX9w || paragraph == null;
    }

    private zzY8J zzZ(FieldStyleRef fieldStyleRef) throws Exception {
        if (fieldStyleRef.zzZgt()) {
            zzY(fieldStyleRef);
        } else {
            zzZT(fieldStyleRef);
        }
        return this.zzX9v;
    }

    private boolean zzZ(String[] strArr, String str, String str2) {
        for (String str3 : strArr) {
            if (zzr(str3, str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzZ(Style style, String str) {
        if (com.aspose.words.internal.zzZYD.zzh(str, style.getName())) {
            return true;
        }
        for (String str2 : style.zzY3w()) {
            if (com.aspose.words.internal.zzZYD.zzh(str, str2)) {
                return true;
            }
        }
        return false;
    }
}
