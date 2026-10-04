package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zz1G implements zzZBZ {
    private DocumentVisitor zzYYi;
    private int zzYYj;
    private HashMap<Node, Node> zzYYk = new HashMap<>();
    private zzYDZ zzZFZ;

    public zz1G(zzYDZ zzydz, int i, DocumentVisitor documentVisitor) {
        this.zzZFZ = zzydz;
        this.zzYYj = i;
        this.zzYYi = documentVisitor;
    }

    private void zzA(ShapeBase shapeBase) throws Exception {
        if (shapeBase.isTopLevel()) {
            shapeBase.zzYa2();
            ShapeBase shapeBaseZzZ = zzY24.zzZ(shapeBase, false, this.zzZFZ);
            if (shapeBaseZzZ.isGroup() && !shapeBaseZzZ.hasChildNodes() && shapeBaseZzZ.zzY9i().zzZHY() == 9) {
                shapeBase.remove();
                return;
            }
            if (zzC(shapeBase)) {
                zzZ(shapeBaseZzZ, shapeBase);
            } else {
                zzY(shapeBase, shapeBaseZzZ);
                zzG(4, "VML shape is not supported in Strict Open XML Document format and will be converted to DrawingML.");
            }
            shapeBaseZzZ.accept(this.zzYYi);
            if (shapeBase.getNodeType() != 17) {
                shapeBaseZzZ.zzYa7();
            }
        }
    }

    private boolean zzB(ShapeBase shapeBase) {
        if (shapeBase.getMarkupLanguage() == 1) {
            return (shapeBase.zzY9n() == null || shapeBase.zzY9n().getMarkupLanguage() != 0) && (this.zzZFZ.zzXpa instanceof OoxmlSaveOptions) && zzZtY() == 2;
        }
        return false;
    }

    private boolean zzC(ShapeBase shapeBase) {
        if (zzB(shapeBase)) {
            return shapeBase.isSignatureLine() || shapeBase.zzZid() || shapeBase.zzY98();
        }
        return false;
    }

    private void zzD(ShapeBase shapeBase) throws Exception {
        ShapeBase shapeBaseZzY9n = shapeBase.zzY9n();
        if (zz00.zzZ(shapeBase, this.zzYYi)) {
            zzG(2, "DrawingML shape is replaced with fallback Shape, some formatting might be lost.");
            com.aspose.words.internal.zzZQF.zzY(this.zzYYk, shapeBase, shapeBaseZzY9n);
        }
    }

    private void zzE(ShapeBase shapeBase) throws Exception {
        if (zzZtY() == 0) {
            zzD(shapeBase);
        } else {
            shapeBase.zzY9n().accept(this.zzYYi);
        }
    }

    private void zzF(ShapeBase shapeBase) throws Exception {
        if (this.zzZFZ.zzYfy.getMailMerge().zzYKf()) {
            return;
        }
        zzD(shapeBase);
    }

    private static void zzG(ShapeBase shapeBase) {
        if (shapeBase.zzY9n() == null || shapeBase.zzY9i().zzZHY() != 8) {
            return;
        }
        zzO zzoZzYdB = shapeBase.zzZYh().zzYdB();
        int[] iArr = {9, 10, 22, 24, 19, 33, 34, 21, 26, 35};
        if (zzoZzYdB.zzbR().zzY(iArr, true).getCount() < shapeBase.zzY(iArr, true).getCount()) {
            zzoZzYdB.zzZ(null);
        }
    }

    private void zzQ(Shape shape) throws Exception {
        ShapeBase shapeBaseZzZ = zzY24.zzZ(shape, false, this.zzZFZ);
        shapeBaseZzZ.setWrapType(0);
        zzZ(shapeBaseZzZ, shape);
    }

    private void zzU(DocumentBase documentBase) throws Exception {
        Shape backgroundShape = documentBase.getBackgroundShape();
        ShapeBase shapeBaseZzY9n = backgroundShape.zzY9n();
        if (backgroundShape.getMarkupLanguage() != 0) {
            if (shapeBaseZzY9n == null || shapeBaseZzY9n.getMarkupLanguage() != 0) {
                return;
            }
            backgroundShape.zzZYh().remove(790);
            return;
        }
        if (shapeBaseZzY9n == null || shapeBaseZzY9n.getMarkupLanguage() != 1) {
            documentBase.zzO((Shape) zz00.zzY(backgroundShape, this.zzZFZ, zzZtW()));
        } else {
            shapeBaseZzY9n.remove();
            documentBase.zzO((Shape) shapeBaseZzY9n);
        }
    }

    private static ShapeBase zzY(ShapeBase shapeBase, ShapeBase shapeBase2) {
        if (shapeBase2 != null) {
            zzYVU.zzj(shapeBase2, shapeBase);
            shapeBase.remove();
        }
        return shapeBase2;
    }

    private boolean zzZtW() {
        return (this.zzYYj & 64) == 64;
    }

    private boolean zzZtX() {
        return this.zzZFZ.zzYdh() || this.zzZFZ.zzXpa.getSaveFormat() == 60 || this.zzZFZ.zzXpa.getSaveFormat() == 61;
    }

    private int zzZtY() {
        return zzYO3.zzZ(this.zzZFZ.zzYfy.zzZqn(), (OoxmlSaveOptions) com.aspose.words.internal.zzZKW.zzZ(this.zzZFZ.zzXpa, OoxmlSaveOptions.class));
    }

    @Override // com.aspose.words.zzZBZ
    public final void zzH(ShapeBase shapeBase) throws Exception {
        ShapeBase shapeBaseZzY;
        if (shapeBase.zzYa1() && shapeBase.zzY9n() != null) {
            shapeBase.zzZYh().zzYdB().zzZ(null);
        }
        zzG(shapeBase);
        shapeBase.zzY9Z();
        boolean zZzZtW = zzZtW();
        if (zzZtX() || (zZzZtW && !shapeBase.zzY9m())) {
            ShapeBase shapeBaseZzZ = zz00.zzZ(shapeBase, this.zzZFZ, zZzZtW);
            if (shapeBaseZzZ != null) {
                shapeBaseZzZ.accept(this.zzYYi);
            }
            com.aspose.words.internal.zzZQF.zzY(this.zzYYk, shapeBase, shapeBaseZzZ);
            zzG(2, com.aspose.words.internal.zzZKN.format("DrawingML is not supported in {0} format and will be converted to shape.", FileFormatUtil.zzC9(this.zzZFZ.zzXpa.getSaveFormat())));
            return;
        }
        if (!this.zzZFZ.zzYda()) {
            if (this.zzZFZ.zzXpa.zzZ9f()) {
                return;
            }
            int dmlRenderingMode = this.zzZFZ.zzXpa.getDmlRenderingMode();
            if (dmlRenderingMode == 0) {
                zzF(shapeBase);
                return;
            } else {
                if (dmlRenderingMode != 1) {
                    return;
                }
                if (zzY3X.zzS(shapeBase, this.zzZFZ.zzXpa.getImlRenderingMode() == 1)) {
                    zzF(shapeBase);
                    return;
                }
                return;
            }
        }
        if (shapeBase.zzY9g()) {
            zzYO3.zzd(this.zzZFZ.zzYfy);
        }
        if (shapeBase.zzY9n() != null) {
            if (zzB(shapeBase.zzY9n())) {
                shapeBase.zzZYh().zzYdB().zzZ(null);
                return;
            } else {
                zzE(shapeBase);
                return;
            }
        }
        if (!zz00.zzZ(shapeBase, zzZtY()) || (shapeBaseZzY = zz00.zzY(shapeBase, this.zzZFZ, true)) == null) {
            return;
        }
        Paragraph paragraph = new Paragraph(shapeBase.getDocument());
        paragraph.appendChild(shapeBaseZzY);
        zzO zzo = new zzO();
        zzo.zzZ(paragraph);
        shapeBase.zzZYh().zzZ(zzo);
        zzE(shapeBase);
    }

    @Override // com.aspose.words.zzZBZ
    public final boolean zzI(ShapeBase shapeBase) throws Exception {
        if (!zzB(shapeBase)) {
            return false;
        }
        zzA(shapeBase);
        return true;
    }

    @Override // com.aspose.words.zzZBZ
    public final Shape zzZ(DocumentBase documentBase, Shape shape) throws Exception {
        if (Shape.zzZG(shape)) {
            if (zzB(shape)) {
                zzZ(zzY24.zzZ(shape, true, this.zzZFZ), shape);
                return shape;
            }
            if (zzZtX() || (this.zzZFZ.zzYda() && zzZtY() == 0)) {
                zzU(documentBase);
            }
        }
        return shape;
    }

    @Override // com.aspose.words.zzZBZ
    public final void zzZtZ() {
        ArrayList arrayListZzY = com.aspose.words.internal.zzZQG.zzY(this.zzYYk.keySet());
        int i = 0;
        while (i < arrayListZzY.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < arrayListZzY.size(); i3++) {
                if (((ShapeBase) arrayListZzY.get(i)).zzY9P() && ((ShapeBase) arrayListZzY.get(i3)).zzY9P()) {
                    Shape shape = (Shape) arrayListZzY.get(i);
                    Shape shape2 = (Shape) arrayListZzY.get(i3);
                    Shape shape3 = (Shape) this.zzYYk.get(shape);
                    Shape shape4 = (Shape) this.zzYYk.get(shape2);
                    if (TextBox.zzY(shape, shape2) && !TextBox.zzY(shape3, shape4)) {
                        shape3.getTextBox().setNext(shape4.getTextBox());
                    }
                    if (TextBox.zzY(shape2, shape) && !TextBox.zzY(shape4, shape3)) {
                        shape4.getTextBox().setNext(shape3.getTextBox());
                    }
                }
            }
            i = i2;
        }
    }

    @Override // com.aspose.words.zzZBZ
    public final void zzZ(ListCollection listCollection) throws Exception {
        for (int i = 0; i < listCollection.zzYP0(); i++) {
            Shape shapeZzxn = listCollection.zzxn(i);
            if (zzB(shapeZzxn)) {
                zzQ(shapeZzxn);
            } else if (zzZtX() || (this.zzZFZ.zzYda() && zzZtY() == 0)) {
                zzZ(listCollection, i);
            }
        }
    }

    private void zzG(int i, String str) {
        IWarningCallback warningCallback = this.zzZFZ.zzYfy.getWarningCallback();
        if (warningCallback != null) {
            OooO00o.OooO0O0(warningCallback, 65536, i, str);
        }
    }

    private static void zzZ(ShapeBase shapeBase, ShapeBase shapeBase2) {
        if (shapeBase == null) {
            return;
        }
        Paragraph paragraph = new Paragraph(shapeBase2.getDocument());
        paragraph.appendChild(shapeBase);
        zzO zzo = new zzO();
        zzo.zzZ(paragraph);
        shapeBase2.zzZYh().zzZ(zzo);
    }

    private void zzZ(ListCollection listCollection, int i) throws Exception {
        Shape shapeZzxn = listCollection.zzxn(i);
        ShapeBase shapeBaseZzY9n = shapeZzxn.zzY9n();
        if (shapeZzxn.getMarkupLanguage() == 0) {
            if (shapeBaseZzY9n != null && shapeBaseZzY9n.getMarkupLanguage() == 1) {
                shapeBaseZzY9n.remove();
                listCollection.zzZ(i, (Shape) shapeBaseZzY9n);
                return;
            } else {
                listCollection.zzZ(i, (Shape) zz00.zzY(shapeZzxn, this.zzZFZ, zzZtW()));
                return;
            }
        }
        if (shapeBaseZzY9n == null || shapeBaseZzY9n.getMarkupLanguage() != 0) {
            return;
        }
        shapeZzxn.zzZYh().remove(790);
    }
}
