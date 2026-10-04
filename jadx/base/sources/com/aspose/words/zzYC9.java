package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYC9 {
    private static void zzN(zzZR4 zzzr4) throws Exception {
        byte[] bArrZzYW2;
        if (zzzr4.getStart().getFieldType() != 67) {
            zzzr4.getStart().getFieldType();
        }
        zzZQW zzzqwZzX = zzZQW.zzX(zzzr4);
        ShapeBase shapeBaseZzZ = zzZ(zzzr4, false, (IWarningCallback) null);
        if (shapeBaseZzZ == null) {
            Shape shape = new Shape(zzzr4.getStart().getDocument(), 75);
            zzzr4.getStart().zzYC(shape);
            double d = zzzqwZzX.isLinkOnly() ? ShapeBase.zzXn6 : 1.0d;
            shape.zzWf(d);
            shape.zzWe(d);
            shape.setWrapType(0);
            shape.getImageData().setSourceFullName(zzzqwZzX.getSourceFullName());
            if (!zzzr4.getEnd().isPrivate() && (bArrZzYW2 = shape.getImageData().zzYW2()) != null) {
                com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(bArrZzYW2);
                double dZzZ = zzZ(zzegZzZT, zzzr4.getStart().getDocument());
                shape.zzWf(zzegZzZT.getWidthPoints() * dZzZ);
                shape.zzWe(zzegZzZT.getHeightPoints() * dZzZ);
            }
        } else {
            Shape shape2 = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBaseZzZ, Shape.class);
            if (shape2 != null) {
                if (!shape2.getBehindText()) {
                    shape2.setWrapType(0);
                }
                if (!shape2.getImageData().isLink() && !com.aspose.words.internal.zzZVR.zzWz(zzzqwZzX.getSourceFullName())) {
                    shape2.getImageData().setSourceFullName(zzzqwZzX.getSourceFullName());
                }
            }
        }
        zzYW0.zzZ((Node) zzzr4.getStart(), true, (Node) zzzr4.getEnd(), true, 0);
    }

    private static void zzO(zzZR4 zzzr4) throws Exception {
        zzzr4.getStart().getFieldType();
        ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(zzzr4.getSeparator().getNextSibling(), ShapeBase.class);
        if (shapeBase == null || !shapeBase.zzYvW().contains(780)) {
            return;
        }
        zzZ(zzzr4, false, (IWarningCallback) null);
        zzYW0.zzZ((Node) zzzr4.getStart(), true, (Node) zzzr4.getEnd(), true, 0);
    }

    private static void zzP(zzZR4 zzzr4) throws Exception {
        ShapeBase shapeBase;
        zzzr4.getStart().getFieldType();
        if (zzzr4.getSeparator() == null || (shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(zzzr4.getSeparator().getNextSibling(), ShapeBase.class)) == null || shapeBase.getNextSibling() != zzzr4.getEnd()) {
            return;
        }
        zzZQX zzzqxZzY = zzZQX.zzY(zzzr4);
        shapeBase.setHRef(zzzqxZzY.getHRef());
        if (com.aspose.words.internal.zzZYD.zzXk(zzzqxZzY.getScreenTip())) {
            shapeBase.setScreenTip(zzzqxZzY.getScreenTip());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzzqxZzY.getTarget())) {
            shapeBase.setTarget(zzzqxZzY.getTarget());
        }
        zzT(zzzr4);
    }

    private static void zzT(zzZR4 zzzr4) throws Exception {
        while (true) {
            Node nextSibling = zzzr4.getSeparator().getNextSibling();
            if (nextSibling == null || !(zzYVU.zztq(nextSibling.getNodeType()) || nextSibling.getNodeType() == 18 || nextSibling.getNodeType() == 17)) {
                break;
            } else {
                zzzr4.getStart().zzYC(nextSibling);
            }
        }
        zzYW0.zzZ((Node) zzzr4.getStart(), true, (Node) zzzr4.getEnd(), true, 0);
    }

    private static zzYEF zzV(zzYEF zzyef, zzYEF zzyef2) {
        zzYEF zzyef3 = (zzYEF) zzyef.zzbn();
        zzyef2.zzX(zzyef3, 40);
        zzyef2.zzX(zzyef3, 30);
        return zzyef3;
    }

    private static void zzY(zzZR4 zzzr4, Shape shape) throws Exception {
        zzzr4.getStart().getFieldType();
        if (shape == null) {
            return;
        }
        zzZQU zzzquZzW = zzZQU.zzW(zzzr4);
        if (zzzquZzW.zzZf9() == 3) {
            return;
        }
        shape.setShapeType(-2);
        if (zzzr4.getSeparator().getOleObject() != null) {
            shape.getOleFormat().zzY(zzzr4.getSeparator().getOleObject());
        }
        OleFormat oleFormat = shape.getOleFormat();
        oleFormat.setProgId(zzzquZzW.getProgId());
        oleFormat.setSourceFullName(zzzquZzW.getSourceFullName());
        oleFormat.setAutoUpdate(zzzquZzW.getAutoUpdate());
        oleFormat.zzqW(zzzquZzW.zzZfa());
        oleFormat.zzqX(zzzquZzW.zzZf9());
        if (com.aspose.words.internal.zzZYD.zzXk(zzzquZzW.getSourceItem())) {
            oleFormat.setSourceItem(zzzquZzW.getSourceItem());
        }
        zzT(zzzr4);
    }

    public static void zzZ(zzZR4 zzzr4, Shape shape, LoadOptions loadOptions) throws Exception {
        int fieldType = zzzr4.getStart().getFieldType();
        if (fieldType == 35) {
            zzO(zzzr4);
            return;
        }
        if (fieldType == 49) {
            zzYEG.zzR(zzzr4);
            return;
        }
        if (fieldType != 58) {
            if (fieldType != 67) {
                if (fieldType != 91) {
                    if (fieldType == 95) {
                        zzZ(zzzr4, loadOptions.getWarningCallback());
                        return;
                    }
                    if (fieldType != 55) {
                        if (fieldType == 56) {
                            zzY(zzzr4, shape);
                            return;
                        } else if (fieldType != 87) {
                            if (fieldType != 88) {
                                return;
                            }
                            zzP(zzzr4);
                            return;
                        }
                    }
                }
            }
            if (loadOptions.getPreserveIncludePictureField()) {
                return;
            }
            zzN(zzzr4);
            return;
        }
        zzZ(zzzr4, shape);
    }

    private static void zzZ(zzZR4 zzzr4, IWarningCallback iWarningCallback) throws Exception {
        zzzr4.getStart().getFieldType();
        ShapeBase shapeBaseZzZ = zzZ(zzzr4, true, iWarningCallback);
        if (shapeBaseZzZ != null) {
            Shape shape = (Shape) shapeBaseZzZ.zztD(18);
            if (shape != null) {
                shapeBaseZzZ.zzZ(zzV(shape.zzZYh(), shapeBaseZzZ.zzZYh()));
                if (Math.abs(shapeBaseZzZ.getWidth() - shape.getWidth()) > 0.3d || Math.abs(shapeBaseZzZ.getHeight() - shape.getHeight()) > 0.3d) {
                    shapeBaseZzZ.zzYvW().zzQ(4160, shape.zzYvW().get(4131));
                    shapeBaseZzZ.zzYvW().zzQ(4161, shape.zzYvW().get(4132));
                }
                shapeBaseZzZ.setWrapType(0);
            }
            zzYW0.zzZ((Node) zzzr4.getStart(), true, (Node) zzzr4.getEnd(), true, 0);
        }
    }

    private static double zzZ(com.aspose.words.internal.zzEG zzeg, DocumentBase documentBase) {
        if (!documentBase.zzZpV().zzYVg.getUICompat97To2003()) {
            return 1.0d;
        }
        double dZzDO = ((double) zzeg.zzDO()) > 9690.0d ? 9690.0d / ((double) zzeg.zzDO()) : 1.0d;
        double dZzDN = ((double) zzeg.zzDN()) > 13560.0d ? 13560.0d / ((double) zzeg.zzDN()) : 1.0d;
        return dZzDO < dZzDN ? dZzDO : dZzDN;
    }

    private static void zzZ(zzZR4 zzzr4, Shape shape) throws Exception {
        if (zzzr4.getStart().getFieldType() != 87 && zzzr4.getStart().getFieldType() != 58) {
            zzzr4.getStart().getFieldType();
        }
        if (shape == null) {
            return;
        }
        int i = zzzr4.getStart().getFieldType() == 87 ? 201 : -2;
        if (zzzr4.getSeparator().getOleObject() != null) {
            shape.setShapeType(i);
            shape.getOleFormat().zzY(zzzr4.getSeparator().getOleObject());
            shape.getOleFormat().setProgId(zzZQY.zzZ(zzzr4).getProgId());
        } else {
            shape.setShapeType(75);
        }
        zzT(zzzr4);
    }

    private static ShapeBase zzZ(zzZR4 zzzr4, boolean z, IWarningCallback iWarningCallback) {
        Node nextSibling = zzzr4.getSeparator().getNextSibling();
        ShapeBase shapeBase = null;
        if (zzzr4.getStart().getParentNode() != zzzr4.getEnd().getParentNode()) {
            zzY1Z.zzZ(iWarningCallback, 17, "Invalid SHAPE field could not be parsed.", new Object[0]);
            return null;
        }
        while (nextSibling != zzzr4.getEnd()) {
            Node nextSibling2 = nextSibling.getNextSibling();
            zzzr4.getStart().zzYC(nextSibling);
            if (nextSibling.getNodeType() == 18 || nextSibling.getNodeType() == 17) {
                ShapeBase shapeBase2 = (ShapeBase) nextSibling;
                if (z) {
                    return shapeBase2;
                }
                shapeBase = shapeBase2;
            }
            nextSibling = nextSibling2;
        }
        return shapeBase;
    }
}
