package com.aspose.words;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZR6 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\t", "\\d", "\\x", "\\h", "\\r", "\\s", "\\f", "\\b", "\\p", "\\c", "\\q");

    public static int getSwitchType(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
            case 2:
                return 1;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return 2;
            default:
                return 0;
        }
    }

    public static void zzT(Field field) throws Exception {
        String strZzY = zzY(field, "DISPLAYBARCODE");
        field.zzZgR();
        field.zzMn(strZzY);
        field.zzZgU();
        field.zzZgP();
    }

    private static String zzY(Field field, String str) {
        zzZR1 zzzr1ZzZgq = field.zzZgq();
        String result = field.getResult();
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        boolean z = com.aspose.words.internal.zzZKN.zzS(result, "\"", i) && com.aspose.words.internal.zzZKN.zzW(field.getResult(), "\"", i);
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, str);
        sb.append(ControlChar.SPACE_CHAR);
        if (!z) {
            sb.append('\"');
        }
        com.aspose.words.internal.zzZNH.zzU(sb, field.getResult());
        if (!z) {
            sb.append('\"');
        }
        for (int i2 = 1; i2 < zzzr1ZzZgq.zzZfD().size(); i2++) {
            sb.append(ControlChar.SPACE_CHAR);
            com.aspose.words.internal.zzZNH.zzU(sb, zzzr1ZzZgq.zzDH(i2).getText());
        }
        for (zzZPC zzzpc : zzzr1ZzZgq.zzZfC()) {
            sb.append(ControlChar.SPACE_CHAR);
            com.aspose.words.internal.zzZNH.zzU(sb, zzzpc.getName());
            sb.append(ControlChar.SPACE_CHAR);
            com.aspose.words.internal.zzZNH.zzU(sb, zzzpc.zzZcc().getText());
        }
        return sb.toString();
    }

    private static Node zzZ(int i, Document document, BarcodeParameters barcodeParameters) throws Exception {
        zzYEF zzyef = new zzYEF();
        zzyef.zzQ(60, zzZU.zzZF6);
        IBarcodeGenerator barcodeGenerator = document.getFieldOptions().getBarcodeGenerator();
        if (barcodeGenerator == null) {
            return new Run(document, "Error! Bar code generator is not set.", zzyef);
        }
        Bitmap bitmapZzZ = zzZ(barcodeGenerator, i, barcodeParameters);
        if (bitmapZzZ == null) {
            return new Run(document, "Error! Image was not generated.", zzyef);
        }
        Shape shape = new Shape(document, 75);
        shape.getImageData().setImage(bitmapZzZ);
        shape.zzYa7();
        shape.setWrapType(0);
        return shape;
    }

    private static Bitmap zzZ(IBarcodeGenerator iBarcodeGenerator, int i, BarcodeParameters barcodeParameters) throws Exception {
        if (i == 63) {
            return iBarcodeGenerator.getOldBarcodeImage(barcodeParameters);
        }
        if (i != 6301) {
            return null;
        }
        return iBarcodeGenerator.getBarcodeImage(barcodeParameters);
    }

    public static zzYWB zzY(int i, Document document, BarcodeParameters barcodeParameters) throws Exception {
        Node nodeZzZ = zzZ(i, document, barcodeParameters);
        return new zzYWB(nodeZzZ, nodeZzZ);
    }
}
