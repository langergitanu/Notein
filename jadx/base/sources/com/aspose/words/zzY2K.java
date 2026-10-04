package com.aspose.words;

import com.google.common.net.HttpHeaders;
import com.google.firebase.messaging.Constants;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2K {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("id", "shapeid", "name", "persistPropertyBag", "persistStorage", "persistStream", "persistStreamInit", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "classid", "class", "w", C18773h.f57233c, "align", "iPersistPropertyBag", "Type", "ProgID", "ShapeID", "DrawAspect", "ObjectID", "Moniker", "UpdateMode", "LinkType", "LockedField", "WordFieldCodes", "FieldCodes");

    public static void zzW(zzZ8W zzz8w) throws Exception {
        zzZBL zzzblZzNP;
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        String value = null;
        String value2 = null;
        String value3 = null;
        String strZzY9 = "";
        boolean zZzi = false;
        boolean zZzi2 = false;
        boolean zZzi3 = false;
        String value4 = null;
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 0) {
                switch (iZzTP) {
                    case 14:
                        zZzi3 = com.aspose.words.internal.zzZYD.zzi(zzyu4ZzZsD.getValue(), HttpHeaders.LINK);
                        break;
                    case 15:
                        value4 = zzyu4ZzZsD.getValue();
                        break;
                    case 16:
                        value = zzyu4ZzZsD.getValue();
                        break;
                    case 17:
                        zZzi2 = com.aspose.words.internal.zzZYD.zzi(zzyu4ZzZsD.getValue(), "Icon");
                        break;
                    case 18:
                        value3 = zzyu4ZzZsD.getValue();
                        break;
                    case 19:
                        strZzY9 = zzyu4ZzZsD.getValue();
                        break;
                    case 20:
                        zZzi = com.aspose.words.internal.zzZYD.zzi(zzyu4ZzZsD.getValue(), "Always");
                        break;
                    default:
                        zzyu4ZzZsD.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon reading OLE specific elements by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
                        break;
                }
            } else {
                value2 = zzyu4ZzZsD.getValue();
            }
        }
        Shape shape = (Shape) zzz8w.zzJJ(value);
        if (shape == null) {
            return;
        }
        shape.setShapeType(-2);
        OleFormat oleFormat = shape.getOleFormat();
        oleFormat.setAutoUpdate(zZzi);
        oleFormat.zzRP(zZzi2);
        if (value4 != null) {
            oleFormat.setProgId(value4);
        }
        if (zZzi3) {
            if (com.aspose.words.internal.zzZYD.zzXk(value2)) {
                strZzY9 = zzz8w.zzY9(value2);
            }
            if (com.aspose.words.internal.zzZYD.zzXk(strZzY9)) {
                String[] strArrZzT = com.aspose.words.internal.zzZKN.zzT(strZzY9, new char[]{'!'});
                oleFormat.setSourceFullName(strArrZzT[0]);
                if (strArrZzT.length > 1) {
                    oleFormat.setSourceItem(strArrZzT[1]);
                }
            }
        } else {
            zzYVB zzyvb = (zzYVB) com.aspose.words.internal.zzZKW.zzZ(zzz8w, zzYVB.class);
            if (!com.aspose.words.internal.zzZYD.zzXk(value2)) {
                value2 = value3;
            }
            if ((zzyvb == null || !zzyvb.zzYyZ().getIgnoreOleData()) && (zzzblZzNP = zzz8w.zzNP(value2)) != null) {
                int iZzGN = zzYU3.zzGN(value3);
                if (iZzGN != Integer.MIN_VALUE) {
                    zzzblZzNP.setId(iZzGN);
                }
                oleFormat.zzY(zzzblZzNP);
            }
        }
        while (zzyu4ZzZsD.zzQ("OLEObject")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 21:
                    oleFormat.zzqX(zzY30.zzzP(zzyu4ZzZsD.readString()));
                    break;
                case 22:
                    oleFormat.isLocked(zzyu4ZzZsD.zzSv(true));
                    break;
                case 23:
                case 24:
                    String string = zzyu4ZzZsD.readString();
                    if (string.length() <= 0) {
                        oleFormat.zzqW(0);
                    } else {
                        char cOooO00o = androidx.core.content.OooO0O0.OooO00o(1, string);
                        if (cOooO00o >= '0' && cOooO00o <= '5') {
                            oleFormat.zzqW(cOooO00o - '0');
                        }
                    }
                    break;
                default:
                    zzyu4ZzZsD.zzT(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon reading OLE specific elements by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
                    break;
            }
        }
    }

    public static Shape zzX(zzZ8W zzz8w) throws Exception {
        com.aspose.words.internal.zzKD zzkd;
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String strSubstring = str4;
        String str5 = strSubstring;
        while (zzyu4ZzZsD.zzi()) {
            String value = zzyu4ZzZsD.getValue();
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 0) {
                if (iZzTP == 1) {
                    str = value;
                } else if (iZzTP != 2) {
                    switch (iZzTP) {
                        case 7:
                            str4 = value;
                            break;
                        case 8:
                            strSubstring = value;
                            break;
                        case 9:
                            break;
                        case 10:
                            str2 = value;
                            break;
                        case 11:
                            str3 = value;
                            break;
                        case 12:
                            zzyu4ZzZsD.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon reading OLE specific elements by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
                            break;
                        case 13:
                            zzyu4ZzZsD.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon reading OLE specific elements by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
                            break;
                        default:
                            zzyu4ZzZsD.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon reading OLE specific elements by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
                            break;
                    }
                } else {
                    str5 = value;
                }
            }
        }
        Shape shape = (Shape) zzz8w.zzJJ(str);
        if (shape == null) {
            shape = new Shape(zzz8w.getDocument());
            shape.setWrapType(0);
        }
        shape.setShapeType(201);
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            shape.zzWf(ConvertUtil.pixelToPoint(com.aspose.words.internal.zzJB.parseDouble(str2)));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str3)) {
            shape.zzWe(ConvertUtil.pixelToPoint(com.aspose.words.internal.zzJB.parseDouble(str3)));
        }
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzS(str4, "DATA:application/x-oleobject;BASE64,", i)) {
            byte[] bArrZzVT = com.aspose.words.internal.zzZQB.zzVT(str4.substring(36));
            if (com.aspose.words.internal.zzZKN.zzS(strSubstring, "CLSID:", i)) {
                strSubstring = strSubstring.substring(6);
            }
            zzkd = new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzAA(com.aspose.words.internal.zzZYD.zzXk(strSubstring) ? new com.aspose.words.internal.zzZOZ(strSubstring) : com.aspose.words.internal.zzZOZ.zzZXP));
            zzkd.zzIf().zzZ("\u0003OCXDATA", new com.aspose.words.internal.zzZOR(bArrZzVT));
        } else {
            byte[] bArrZzNO = zzz8w.zzNO(str4);
            zzkd = bArrZzNO != null ? new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzZOR(bArrZzNO)) : null;
        }
        if (zzkd != null) {
            new zzYTO(str5).zzW(zzkd.zzIf());
            zzYTR.zzYyl().zzW(zzkd.zzIf());
            shape.getOleFormat().zzY(new zzYOC(shape.getId(), zzkd.zzIf()));
        }
        return shape;
    }

    public static Shape zzY(zzZ8W zzz8w) throws Exception {
        com.aspose.words.internal.zzKD zzkd;
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        String str = "";
        String str2 = "";
        String str3 = str2;
        while (zzyu4ZzZsD.zzi()) {
            String value = zzyu4ZzZsD.getValue();
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                str2 = value;
            } else if (iZzTP == 1) {
                str = value;
            } else {
                if (iZzTP != 2) {
                    throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + zzyu4ZzZsD.getLocalName());
                }
                str3 = value;
            }
        }
        Shape shape = (Shape) zzz8w.zzJJ(str);
        if (shape == null) {
            shape = new Shape(zzz8w.getDocument());
            shape.setWrapType(0);
        }
        shape.setShapeType(201);
        zzZXU zzzxu = (zzZXU) zzz8w;
        com.aspose.words.internal.zz77 zz77VarZzYd = zzzxu.zzYd(zzz8w.zzY9(str2));
        zzYU4 zzyu4 = new zzYU4(zz77VarZzYd.zzR1());
        String strZzV = zzyu4.zzV("persistence", null);
        String strZzV2 = zzyu4.zzV("classid", null);
        int iZzTP2 = zzUR.zzTP(strZzV);
        if (iZzTP2 == 3) {
            shape.getOleFormat().zzY(new zzYO2(zz77VarZzYd.zzR1(), "application/vnd.ms-office.activeX+xml", str3, new com.aspose.words.internal.zzZOZ(strZzV2)));
            return shape;
        }
        if (iZzTP2 != 4 && iZzTP2 != 5) {
            if (iZzTP2 != 6) {
                throw new IllegalStateException("Invalid persistence value.");
            }
            zzyu4ZzZsD.zzT(1, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon reading OLE specific elements by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
            return shape;
        }
        com.aspose.words.internal.zz77 zz77VarZzYd2 = zzzxu.zzYd(zz77VarZzYd.zzY9("rId1"));
        if ("persistStorage".equals(strZzV)) {
            zzkd = new com.aspose.words.internal.zzKD(zz77VarZzYd2.zzxk());
        } else {
            zzkd = new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzZOZ(strZzV2));
            zzkd.zzIf().zzZ("\u0003OCXDATA", zz77VarZzYd2.zzxk());
        }
        new zzYTO(str3).zzW(zzkd.zzIf());
        zzYTR.zzYyl().zzW(zzkd.zzIf());
        shape.getOleFormat().zzY(new zzYOC(shape.getId(), zzkd.zzIf()));
        return shape;
    }
}
