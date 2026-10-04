package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzR1 {
    private static void zzX(zzPS zzps, Shape shape) {
        shape.getMarkupLanguage();
        zzRL zzrlZzZ = zzRL.zzZ(zzps, 3, false);
        if (zzrlZzZ.zzZXh()) {
            return;
        }
        zzrlZzZ.zzZ(shape.getStroke());
        if (shape.getStroke().getOn()) {
            zzYC3 zzyc3ZzYvW = shape.zzYvW();
            int iIntValue = ((Integer) zzyc3ZzYvW.zzPj(4143)).intValue();
            int iIntValue2 = ((Integer) zzyc3ZzYvW.zzPj(4145)).intValue();
            int iIntValue3 = ((Integer) zzyc3ZzYvW.zzPj(4144)).intValue();
            int iIntValue4 = ((Integer) zzyc3ZzYvW.zzPj(4146)).intValue();
            int iZzp = com.aspose.words.internal.zzSA.zzp(shape.getStroke().getWeight());
            zzyc3ZzYvW.zzQ(4143, Integer.valueOf(iIntValue + iZzp));
            zzyc3ZzYvW.zzQ(4145, Integer.valueOf(iIntValue2 + iZzp));
            zzyc3ZzYvW.zzQ(4144, Integer.valueOf(iIntValue3 + iZzp));
            zzyc3ZzYvW.zzQ(4146, Integer.valueOf(iIntValue4 + iZzp));
        }
    }

    private static void zzY(zzPS zzps, Shape shape) {
        shape.getMarkupLanguage();
        zzZ(zzps, shape, 3, EditingLanguage.SPANISH_GUATEMALA);
        zzZ(zzps, shape, 2, 4109);
        zzZ(zzps, shape, 0, EditingLanguage.FRENCH_SWITZERLAND);
        zzZ(zzps, shape, 1, 4107);
    }

    public static void zzZ(zzPS zzps, int i, Border border) {
        zzRL zzrlZzZ = zzRL.zzZ(zzps, i, false);
        if (zzrlZzZ.zzZXh()) {
            return;
        }
        zzrlZzZ.zzI(border);
    }

    public static void zzZ(zzPS zzps, ParagraphFormat paragraphFormat) throws Exception {
        zzRL zzrlZzZ = zzRL.zzZ(zzps, 1, false);
        if (!zzrlZzZ.zzZXh()) {
            zzrlZzZ.zzI(paragraphFormat.getBorders().getLeft());
        }
        zzRL zzrlZzZ2 = zzRL.zzZ(zzps, 2, false);
        if (!zzrlZzZ2.zzZXh()) {
            zzrlZzZ2.zzI(paragraphFormat.getBorders().getRight());
        }
        zzRL zzrlZzZ3 = zzRL.zzZ(zzps, 3, false);
        if (!zzrlZzZ3.zzZXh()) {
            zzrlZzZ3.zzI(paragraphFormat.getBorders().getTop());
        }
        zzRL zzrlZzZ4 = zzRL.zzZ(zzps, 0, false);
        if (zzrlZzZ4.zzZXh()) {
            return;
        }
        zzrlZzZ4.zzI(paragraphFormat.getBorders().getBottom());
    }

    public static void zzZ(zzPS zzps, Shape shape) {
        if (shape.getMarkupLanguage() == 1) {
            zzY(zzps, shape);
        } else {
            zzX(zzps, shape);
        }
    }

    private static void zzZ(zzPS zzps, Shape shape, int i, int i2) {
        zzRL zzrlZzZ = zzRL.zzZ(zzps, i, false);
        if (zzrlZzZ.zzZXh()) {
            return;
        }
        Border border = new Border();
        zzrlZzZ.zzI(border);
        shape.setShapeAttr(i2, border);
    }
}
