package com.aspose.words;

import com.google.firebase.firestore.local.SQLitePersistence;

/* JADX INFO: loaded from: classes6.dex */
final class zz22 {
    private static void zzN(zz6G zz6g) {
        if (zz6g.getWrapType() == 5 || zz6g.getWrapType() == 4) {
            Shape shape = zz6g.getShape();
            int iIntValue = ((Integer) shape.zzYvW().get(EditingLanguage.LULE_SAMI_NORWAY)).intValue();
            shape.setShapeAttr(899, zz6G.zzI4(iIntValue) ? zzZZT.zzk(zz6g.getWidth(), zz6g.getHeight()) : zz6G.zzI5(iIntValue) ? zzZZT.zzZrV() : zz6G.zzI6(zz6g.zzZzL()) ? zzZZT.zzZ(shape, iIntValue, zz6g.getWidth(), zz6g.getHeight()) : zzZZT.zzZrU());
        }
    }

    private static void zzO(zz6G zz6g) throws Exception {
        new zz52(zz6g).zzUQ();
    }

    private static boolean zzT(Shape shape) {
        int shapeType;
        if (shape.getShapeType() == 20) {
            return true;
        }
        return (!shape.zzY9v() || (shapeType = shape.getShapeType()) == 120 || shapeType == 177) ? false : true;
    }

    private static boolean zzU(Shape shape) {
        if (!shape.zzY9w() && shape.getShapeType() != 17) {
            return false;
        }
        switch (shape.getShapeType()) {
        }
        return false;
    }

    public static Shape zzZ(DocumentBuilder documentBuilder, int i, double d, double d2) throws Exception {
        zz6G zz6gZzZ = zzZ(documentBuilder, i, d, d2, 0);
        zzO(zz6gZzZ);
        return zz6gZzZ.getShape();
    }

    public static Shape zzZ(DocumentBuilder documentBuilder, int i, int i2, double d, int i3, double d2, double d3, double d4, int i4) throws Exception {
        zz6G zz6gZzZ = zzZ(documentBuilder, i, d3, d4, i4);
        zz6gZzZ.getShape().setTop(d2);
        zz6gZzZ.getShape().setLeft(d);
        zz6gZzZ.getShape().setRelativeVerticalPosition(i3);
        zz6gZzZ.getShape().setRelativeHorizontalPosition(i2);
        zzN(zz6gZzZ);
        zz6gZzZ.getShape().setShapeAttr(SQLitePersistence.MAX_ARGS, 114300);
        zz6gZzZ.getShape().setShapeAttr(902, 114300);
        zz6gZzZ.getShape().setShapeAttr(901, 0);
        zz6gZzZ.getShape().setShapeAttr(903, 0);
        zzO(zz6gZzZ);
        return zz6gZzZ.getShape();
    }

    private static zz6G zzZ(DocumentBuilder documentBuilder, int i, double d, double d2, int i2) {
        Shape shapeZzZ = zzZ(documentBuilder, i, i2);
        zz6G zz6g = new zz6G();
        zz6g.zzXe(documentBuilder.zzZzM());
        zzZ(documentBuilder, zz6g);
        zz6g.zzI2(i);
        zz6g.setShape(shapeZzZ);
        zz6g.setWidth(d);
        zz6g.setHeight(d2);
        zz6g.zzXg(zzT(zz6g.getShape()));
        zz6g.zzXd(zzU(zz6g.getShape()));
        zz6g.setWrapType(i2);
        shapeZzZ.zzU(zz52.zzP(zz6g));
        documentBuilder.insertNode(shapeZzZ);
        shapeZzZ.zzU(null);
        return zz6g;
    }

    private static Shape zzZ(DocumentBuilder documentBuilder, int i, int i2) {
        if (!ShapeBase.zzme(i)) {
            throw new UnsupportedOperationException("Cannot create shapes of this type.");
        }
        if (-1 != i) {
            if (zzY23.zzZ0(i, true)) {
                throw new UnsupportedOperationException("Cannot create WordArt shapes with DML type.");
            }
            if (i != 75) {
                if (documentBuilder.zzZzM()) {
                    GroupShape groupShape = (GroupShape) documentBuilder.getCurrentNode().getParentNode();
                    if (groupShape.zzY9i() != null) {
                        if (groupShape.zzY9i().zzZHY() == 12) {
                            throw new UnsupportedOperationException("Cannot insert DML shape with specified type into graphic frame object.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Cannot insert DML shape into VML group.");
                    }
                }
                Document documentZzYBa = documentBuilder.getDocument().zzYBa();
                if (documentZzYBa != null) {
                    if (documentZzYBa.zzZqn() == null) {
                        documentZzYBa.zzZ(new zzYO3());
                    }
                    documentZzYBa.zzZqn().zzYrc();
                }
                Shape shape = new Shape((DocumentBase) documentBuilder.getDocument(), (byte) 0);
                shape.setWrapType(i2);
                shape.setShapeType(i);
                shape.setId(documentBuilder.getDocument().zzZq0());
                return shape;
            }
            throw new UnsupportedOperationException("Use \"InsertImage\" method in the builder to insert this type of shapes.");
        }
        throw new UnsupportedOperationException("Use constructor of the appropriate class to create group shape.");
    }

    private static void zzZ(DocumentBuilder documentBuilder, zz6G zz6g) {
        if (documentBuilder.isAtEndOfParagraph() || documentBuilder.getCurrentNode().getParentNode().getNodeType() != 18) {
            return;
        }
        Shape shape = (Shape) documentBuilder.getCurrentNode().getParentNode();
        if (shape.zzY9i() != null) {
            int iZzZHY = shape.zzY9i().zzZHY();
            zz6g.zzXf(iZzZHY == 6 || iZzZHY == 13);
            zz6g.zzYV((float) shape.getWidth());
            zz6g.zzYU((float) shape.getHeight());
        }
    }
}
