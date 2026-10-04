package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYH {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("color", "themeColor", "themeShade", "themeTint", "background", "AlternateContent", "drawing", "Choice", "Fallback", "Requires");

    public static void zzE(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        com.aspose.words.internal.zzPV zzpvZzzY = null;
        String value = null;
        String value2 = null;
        String value3 = null;
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zzpvZzzY = zzY35.zzzY(zzyu4ZzZsD.getValue());
                if (com.aspose.words.internal.zzPV.zzZ(zzpvZzzY, com.aspose.words.internal.zzPV.zzI5)) {
                    zzpvZzzY = null;
                }
            } else if (iZzTP == 1) {
                value = zzyu4ZzZsD.getValue();
            } else if (iZzTP == 2) {
                value2 = zzyu4ZzZsD.getValue();
            } else if (iZzTP == 3) {
                value3 = zzyu4ZzZsD.getValue();
            }
        }
        zzyu4ZzZsD.zzj();
        Shape shapeZzZU = zzZU(zzzxt);
        if (shapeZzZU == null) {
            shapeZzZU = zzM(zzzxt.getDocument());
        }
        zzzxt.getDocument().zzO(shapeZzZU);
        if (zzpvZzzY != null) {
            shapeZzZU.setShapeAttr(385, zzpvZzzY);
        }
        if (value != null) {
            shapeZzZU.setShapeAttr(4147, value);
        }
        if (value2 != null) {
            shapeZzZU.setShapeAttr(4148, value2);
        }
        if (value3 != null) {
            shapeZzZU.setShapeAttr(4149, value3);
        }
    }

    private static Shape zzM(DocumentBase documentBase) {
        return new Shape(documentBase, 1);
    }

    private static Shape zzZS(zzZXT zzzxt) throws Exception {
        zzO zzo = new zzO();
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        boolean z = false;
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 9) {
                zzyu4ZzZsD.zzZ(16777216, 14, zzyu4ZzZsD.getLocalName());
            } else {
                String value = zzyu4ZzZsD.getValue();
                if (com.aspose.words.internal.zzZYD.zzXk(value) && zzYUN.zzHe(zzyu4ZzZsD.zzM(value))) {
                    zzo.zzTH(value);
                    z = true;
                }
            }
        }
        zzyu4ZzZsD.zzj();
        if (!z) {
            zzyu4ZzZsD.zzk();
            return null;
        }
        Shape shapeZzZU = zzZU(zzzxt);
        if (shapeZzZU == null) {
            shapeZzZU = zzM(zzzxt.getDocument());
        }
        shapeZzZU.zzZYh().zzZ(zzo);
        return shapeZzZU;
    }

    private static Shape zzZT(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        Shape shapeZzZU = null;
        Shape shapeZzM = null;
        while (zzyu4ZzZsD.zzQ("AlternateContent")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 7) {
                shapeZzM = zzZS(zzzxt);
            } else if (iZzTP != 8) {
                zzyu4ZzZsD.zzT(16777216, 14, zzyu4ZzZsD.getLocalName());
            } else {
                shapeZzZU = zzZU(zzzxt);
            }
        }
        if (shapeZzZU == null) {
            if (shapeZzM != null) {
                shapeZzM.zzZYh().remove(790);
            }
            return shapeZzM;
        }
        if (shapeZzM == null) {
            if (shapeZzZU.getMarkupLanguage() == 1) {
                return shapeZzZU;
            }
            shapeZzM = zzM(zzzxt.getDocument());
            shapeZzM.zzZYh().zzZ(new zzO());
        }
        zzO zzoZzYdB = shapeZzM.zzZYh().zzYdB();
        Paragraph paragraph = new Paragraph(zzzxt.getDocument());
        paragraph.appendChild(shapeZzZU);
        zzoZzYdB.zzZ(paragraph);
        return shapeZzM;
    }

    private static Shape zzZU(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        Shape shapeZzZT = null;
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 4) {
                shapeZzZT = zzM(zzzxt.getDocument());
                zzY2D.zzY(zzzxt, shapeZzZT);
            } else if (iZzTP == 5) {
                shapeZzZT = zzZT(zzzxt);
            } else if (iZzTP != 6) {
                zzyu4ZzZsD.zzk();
            } else {
                new zzYEF();
                shapeZzZT = (Shape) zzzxt.zzZmg();
                zzzxt.getDocument().removeChild(shapeZzZT);
            }
        }
        return shapeZzZT;
    }
}
