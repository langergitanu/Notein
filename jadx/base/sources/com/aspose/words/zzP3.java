package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzP3 {
    private static zzLU zzZq2;

    static {
        zzLU zzlu = new zzLU();
        zzZq2 = zzlu;
        zzlu.zzY("color", com.aspose.words.internal.zzPV.zzKa);
        zzZq2.zzZs("display", "inline");
        zzZq2.zzJ("Times New Roman");
        zzZq2.zzZ("font-size", 10.0d, 4);
        zzZq2.zzZs("font-style", "normal");
        zzZq2.zzZs("font-variant", "normal");
        zzZq2.zzZs("font-weight", "normal");
        zzZq2.zzZs("letter-spacing", "normal");
        zzZq2.zzZs("text-transform", "none");
        zzZq2.zzZs("vertical-align", "baseline");
        zzZq2.zzY(new zzL2(zzL4.zzZno));
        zzZq2.zzX(zzL4.zzZno, zzL4.zzZlB, zzL4.zzZnp);
        zzZq2.zzZs("background-color", "transparent");
    }

    private static void zzX(zzLU zzlu) {
        for (zzPT zzpt : zzZq2) {
            if (zzlu.zzSd(zzpt.zzZWo()) == null) {
                zzlu.zzV(zzpt);
            }
        }
    }

    public static void zzZ(zzLU zzlu, Font font, int i, int i2, zzZHR zzzhr, zzZN8 zzzn8, boolean z) throws Exception {
        zzLU zzluZzZ = zzZ(font, i, zzzhr, zzzn8, z);
        zzX(zzluZzZ);
        zzZ(zzluZzZ, i2);
        zzlu.zzW(zzluZzZ);
    }

    private static zzLU zzZ(Font font, int i, zzZHR zzzhr, zzZN8 zzzn8, boolean z) throws Exception {
        zzLU zzlu = new zzLU();
        zzlu.zzJ(zzzhr.zzX(font, i));
        boolean z2 = font.getBidi() || font.getComplexScript();
        double sizeBi = z2 ? font.getSizeBi() : font.getSize();
        if (font.getVerticalAlignment() != 0) {
            sizeBi *= 0.6666666666666666d;
        }
        zzlu.zzZ("font-size", sizeBi, 4);
        if ((z2 ? font.getBoldBi() : font.getBold()) || font.getOutline() || font.getEmboss() || font.getEngrave()) {
            zzlu.zzZs("font-weight", "bold");
        }
        if (z2 ? font.getItalicBi() : font.getItalic()) {
            zzlu.zzZs("font-style", "italic");
        }
        if (font.getSmallCaps()) {
            zzlu.zzZs("font-variant", "small-caps");
        }
        if (font.getAllCaps()) {
            zzlu.zzZs("text-transform", "uppercase");
        }
        zzL2 zzl2 = new zzL2();
        if (font.getStrikeThrough() || font.getDoubleStrikeThrough()) {
            zzl2.zzI(zzL4.zzZn8);
        }
        if (font.getUnderline() != 0) {
            zzl2.zzI(zzL4.zzZna);
        }
        if (zzl2.getCount() == 0) {
            zzl2.zzI(zzL4.zzZno);
        }
        zzlu.zzY(zzl2);
        if (font.getSpacing() != 0.0d) {
            zzlu.zzZ("letter-spacing", font.getSpacing(), 4);
        }
        if (font.getPosition() != 0.0d) {
            zzlu.zzZ("vertical-align", font.getPosition(), 4);
        } else if (font.getSubscript()) {
            zzlu.zzZs("vertical-align", "sub");
        } else if (font.getSuperscript()) {
            zzlu.zzZs("vertical-align", "super");
        }
        if (zzzn8 != null) {
            zzlu.zzY("color", zzzn8.zz7(font.zz8Q()));
        }
        if (font.getHidden()) {
            zzlu.zzZs("display", "none");
        }
        if (!font.zzZ7k().isEmpty()) {
            zzlu.zzY("background-color", font.zzZ7k());
        } else {
            zzM9.zzZ(font.getShading(), zzlu);
        }
        zzQS.zzZ(font.getBorder(), zzlu, z);
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(font.zzZ7g(), Inline.class);
        ParagraphFormat paragraphFormat = (inline == null || inline.getParentParagraph() == null) ? null : inline.getParentParagraph().getParagraphFormat();
        if (paragraphFormat != null && paragraphFormat.getBaselineAlignment() != 4 && paragraphFormat.getBaselineAlignment() != 2) {
            zzlu.zzV(new zzM3("vertical-align", zzL5.zzM6(paragraphFormat.getBaselineAlignment()), (byte) 0));
        }
        if (paragraphFormat != null && paragraphFormat.getLineSpacingRule() == 2) {
            double dZzZa = com.aspose.words.internal.zzZKQ.zzZa((paragraphFormat.getLineSpacing() / 12.0d) * 100.0d);
            if (dZzZa != 100.0d) {
                zzlu.zzU("line-height", dZzZa);
            }
        }
        return zzlu;
    }

    private static void zzZ(zzLU zzlu, int i) {
        if ((i & 4) != 0) {
            zzlu.zzY(new zzL2(zzL4.zzZno));
        }
        if ((1 & i) != 0) {
            zzlu.zzX(zzL4.zzZno, zzL4.zzZlB, zzL4.zzZnp);
        }
        if ((i & 2) != 0) {
            zzlu.remove("background-color");
            zzlu.zzZs("background-color", "transparent");
        }
    }
}
