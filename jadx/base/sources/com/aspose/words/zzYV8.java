package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYV8 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("fldCharType", "dirty", "fldLock", "begin", "separate", "end", "fldData");

    public static void zzB(zzYVB zzyvb) {
        zzyvb.zzYz7();
        FieldStart fieldStart = (FieldStart) zzyvb.zzYz7().getChild(22, 0, false);
        if (fieldStart != null) {
            fieldStart.zzYg(com.aspose.words.internal.zzZQB.zzVT(zzyvb.zzZsD().readString()));
        }
    }

    private static void zzR(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        FieldEnd fieldEnd = new FieldEnd(zzyvb.getDocument(), zzyef, 0, false);
        zzyvb.zzXB(fieldEnd);
        if (zzyu4ZzZsD.zzYyy().size() == 0) {
            return;
        }
        zzZR4 zzzr4 = new zzZR4();
        zzzr4.zzX(fieldEnd);
        if (zzyu4ZzZsD.zzYyy().peek() instanceof FieldSeparator) {
            zzzr4.zzX((FieldSeparator) zzyu4ZzZsD.zzYyy().pop());
        }
        if (zzyu4ZzZsD.zzYyy().size() == 0) {
            zzzr4.zzZg1();
            return;
        }
        zzzr4.zzY((FieldStart) zzyu4ZzZsD.zzYyy().pop());
        int iZzZg2 = zzzr4.zzZg2();
        zzzr4.zzDJ(iZzZg2);
        if (zzzr4.getSeparator() == null && zzZOO.zzCF(iZzZg2) == 2) {
            zzzr4.zzX(new FieldSeparator(zzyvb.getDocument(), zzyef, iZzZg2));
            zzyvb.zzZ(zzyvb.zzYz7(), zzzr4.getSeparator(), zzzr4.getEnd());
        }
        zzzr4.getEnd().zzVU(zzzr4.getSeparator() != null);
        zzzr4.zzZg0();
        zzZ(zzyvb, zzzr4);
    }

    private static void zzS(zzYVB zzyvb, zzYEF zzyef) {
        if (zzyvb.zzZsD().zzYyy().size() <= 0 || !(zzyvb.zzZsD().zzYyy().peek() instanceof FieldSeparator)) {
            FieldSeparator fieldSeparator = new FieldSeparator(zzyvb.getDocument(), zzyef, 0);
            zzyvb.zzXB(fieldSeparator);
            zzyvb.zzZsD().zzYyy().push(fieldSeparator);
        }
    }

    private static void zzT(zzYVB zzyvb, zzYEF zzyef) {
        FieldStart fieldStart = new FieldStart(zzyvb.getDocument(), zzyef, 0);
        zzyvb.zzXB(fieldStart);
        zzyvb.zzZsD().zzYyy().push(fieldStart);
    }

    private static void zzX(zzYVB zzyvb, zzZR4 zzzr4) throws Exception {
        Shape shape;
        if (zzzr4.getStart().getFieldType() != 67) {
            zzzr4.getStart().getFieldType();
        }
        Node nextSibling = zzzr4.getSeparator().getNextSibling();
        int nodeType = nextSibling != null ? nextSibling.getNodeType() : 24;
        if (nodeType == 9) {
            Shape shape2 = (Shape) nextSibling.zztD(18);
            zzyvb.zzZ(zzzr4.getStart().getParentNode(), (BookmarkStart) nextSibling, zzzr4.getStart());
            shape = shape2;
        } else if (nodeType == 24) {
            shape = new Shape(zzyvb.getDocument(), 75);
            shape.setWidth(1.0d);
            shape.setHeight(1.0d);
            shape.setWrapType(0);
            zzyvb.zzY(zzzr4.getSeparator().getParentNode(), shape, zzzr4.getSeparator());
        } else if (nodeType == 17) {
            shape = (Shape) nextSibling.getNextSibling();
        } else if (nodeType != 18) {
            return;
        } else {
            shape = (Shape) nextSibling;
        }
        if (!shape.getBehindText()) {
            shape.setWrapType(0);
        }
        if (!shape.getImageData().isLink()) {
            shape.getImageData().setSourceFullName(zzZQW.zzX(zzzr4).getSourceFullName());
        }
        zzT(zzzr4);
    }

    private static void zzY(zzYVB zzyvb, zzZR4 zzzr4) throws Exception {
        boolean zZzZmh = zzyvb.zzZmh();
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzZMM zzzmmZzYyw = zzyu4ZzZsD.zzYyw();
        if (zzzmmZzYyw == null && zZzZmh) {
            return;
        }
        if (zzyu4ZzZsD.zzXSt != null || zZzZmh) {
            zzYEF zzyef = (zzYEF) zzzr4.getStart().zzZYh().zzbn();
            zzZMM zzzmmZzYi = zZzZmh ? zzzmmZzYyw : zzZRB.zzYi(com.aspose.words.internal.zzZQB.zzVT(zzyu4ZzZsD.zzXSt));
            if (!zZzZmh && zzzr4.getFieldType() == 71 && zzyvb.zzYyZ().getMswVersion() > 5) {
                zzzmmZzYi.zzVA(zzzmmZzYi.zzZ6H() & com.aspose.words.internal.zzZKN.zzW(zzyu4ZzZsD.zzXSt, IOUtils.LINE_SEPARATOR_WINDOWS, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8));
            }
            FormField formField = new FormField(zzyvb.getDocument(), zzzmmZzYi, zzyef);
            FieldChar fieldCharZzZgr = zzzr4.zzZgr();
            zzyvb.zzZ(fieldCharZzZgr.getParentNode(), formField, fieldCharZzZgr);
            if (zzzmmZzYyw != null) {
                zzyu4ZzZsD.zzYyv();
            }
        }
    }

    private static void zzZ(zzYVB zzyvb, zzZR4 zzzr4) throws Exception {
        int fieldType = zzzr4.getStart().getFieldType();
        if (fieldType == 49) {
            zzYEG.zzR(zzzr4);
            return;
        }
        if (fieldType == 55 || fieldType == 67) {
            if (zzyvb.zzYyZ().getPreserveIncludePictureField()) {
                return;
            }
            zzX(zzyvb, zzzr4);
        } else if (fieldType == 83 || fieldType == 70 || fieldType == 71) {
            zzY(zzyvb, zzzr4);
        }
    }

    public final void zzW(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        boolean z = false;
        while (zzyu4ZzZsD.zzi()) {
            com.aspose.words.internal.zzZHW zzzhw = zzUR;
            int iZzTP = zzzhw.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                int iZzTP2 = zzzhw.zzTP(zzyu4ZzZsD.getValue());
                if (iZzTP2 == 3) {
                    zzT(zzyvb, zzyef);
                } else if (iZzTP2 == 4) {
                    zzS(zzyvb, zzyef);
                } else if (iZzTP2 == 5) {
                    z = true;
                }
            } else if (iZzTP != 1) {
                if (iZzTP == 2 && zzyvb.zzZsD().zzYyy().size() > 0) {
                    ((FieldChar) zzyu4ZzZsD.zzYyy().peek()).isLocked(zzyu4ZzZsD.zz8());
                }
            } else if (zzyvb.zzZsD().zzYyy().size() > 0) {
                ((FieldChar) zzyu4ZzZsD.zzYyy().peek()).isDirty(zzyu4ZzZsD.zz8());
            }
        }
        if (z) {
            zzR(zzyvb, zzyef);
        }
        while (zzyu4ZzZsD.zzQ("fldChar")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) == 6) {
                String string = zzyu4ZzZsD.readString();
                if (zzyvb.zzZmh()) {
                    FieldChar fieldChar = (FieldChar) zzyu4ZzZsD.zzYyy().peek();
                    if (fieldChar.getNodeType() == 22) {
                        ((FieldStart) fieldChar).zzYg(com.aspose.words.internal.zzZQB.zzVT(string));
                    }
                } else {
                    zzyu4ZzZsD.zzXSt = string;
                }
            } else if (!zzZ(zzyu4ZzZsD.getLocalName(), zzyvb)) {
                zzyu4ZzZsD.zzk();
            }
        }
    }

    public abstract boolean zzZ(String str, zzYVB zzyvb);

    private static void zzT(zzZR4 zzzr4) {
        Node start = zzzr4.getStart();
        while (start != zzzr4.getEnd().getNextSibling()) {
            Node nextSibling = start.getNextSibling();
            int nodeType = start.getNodeType();
            if (nodeType != 17 && nodeType != 18) {
                start.remove();
            }
            start = nextSibling;
        }
    }
}
