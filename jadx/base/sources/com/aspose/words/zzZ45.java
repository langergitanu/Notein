package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ45 {
    private boolean zzYbC;
    private double zzYbD;
    private double zzYbE;
    private double zzYbF;
    private double zzYoL;
    private double zzYoM;
    private Paragraph zzYtC;

    private zzZ45(Paragraph paragraph) {
        this.zzYtC = paragraph;
    }

    public static zzZ45 zzP(Paragraph paragraph, int i) {
        double d;
        double position;
        zzZGI zzzgiZzZ = zzZGI.zzZ(paragraph, paragraph.zzqw(StyleIdentifier.COLORFUL_GRID_ACCENT_6), paragraph.zzqw(StyleIdentifier.GRID_TABLE_3), i);
        zzzgiZzZ.isListItem();
        double firstLineIndent = zzzgiZzZ.getFirstLineIndent();
        double leftIndent = zzzgiZzZ.getLeftIndent();
        double dZzW = zzW(zzzgiZzZ);
        double dZzW2 = com.aspose.words.internal.zzAN.zzZD(dZzW) ? zzW(paragraph, zzzgiZzZ.getLabelString()) : dZzW;
        int alignment = zzzgiZzZ.getListLevel().getAlignment();
        if (alignment == 0) {
            d = dZzW2;
        } else if (alignment == 1) {
            d = dZzW2 / 2.0d;
        } else {
            if (alignment != 2) {
                throw new IllegalArgumentException();
            }
            d = 0.0d;
        }
        double d2 = firstLineIndent + leftIndent + d;
        int trailingCharacter = zzzgiZzZ.getTrailingCharacter();
        if (trailingCharacter == 0) {
            zzZEM[] zzzemArrZzZ = zzZEN.zzZ(paragraph, true, i);
            int length = zzzemArrZzZ.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    position = leftIndent;
                    break;
                }
                zzZEM zzzem = zzzemArrZzZ[i2];
                if (zzzem.getPosition() >= d2) {
                    position = zzzem.getPosition();
                    break;
                }
                i2++;
            }
        } else {
            position = trailingCharacter != 1 ? d2 : zzW(paragraph, " ") + d2;
        }
        zzZ45 zzz45 = new zzZ45(paragraph);
        zzz45.zzYbF = leftIndent;
        zzz45.zzYbD = position;
        zzz45.zzYbE = d2 - dZzW2;
        zzz45.zzYoM = position - d2;
        zzz45.zzYoL = dZzW2;
        zzz45.zzYbC = !com.aspose.words.internal.zzAN.zzZD(dZzW);
        return zzz45;
    }

    private static double zzW(Paragraph paragraph, String str) {
        paragraph.getListLabel();
        return paragraph.getDocument().zzZqy().zzY(r0.getName(), (float) (paragraph.getListLabel().getFont().getSize() > 0.0d ? r0.getSize() : 10.0d), r0.zzza()).zz7(str);
    }

    public static zzZ45 zzZx(Paragraph paragraph) {
        return zzP(paragraph, 1);
    }

    public final double getLeftIndent() {
        return this.zzYbF;
    }

    public final double zzYNV() {
        return this.zzYbD;
    }

    public final double zzYNW() {
        return this.zzYbE;
    }

    public final double zzZ19() {
        return this.zzYoL;
    }

    public final double zzZ1a() {
        return this.zzYoM;
    }

    private static double zzW(zzZGI zzzgi) {
        Shape shapeZzZ0P = zzzgi.zzZ0P();
        double size = zzzgi.zzZ0S().getSize();
        if (shapeZzZ0P == null || size <= 0.0d) {
            return 0.0d;
        }
        long size2 = shapeZzZ0P.zzYzG().getSize();
        return Float.intBitsToFloat((int) size2) * (((float) size) / com.aspose.words.internal.zzZPW.zzYz(size2));
    }
}
