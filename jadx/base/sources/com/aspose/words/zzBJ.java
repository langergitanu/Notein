package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzBJ extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("grpSpPr", "sp", "cxnSp", "wsp", "grpSp", "wgp", "pic", "txSp", "nvGrpSpPr", "cNvPr", "cNvFrPr", "cNvGrpSpPr", TranslateLanguage.BULGARIAN, "whole", "graphicFrame", "contentPart", "xfrm", "graphic", "extLst", "nvGraphicFramePr", "ln", "blipFill", "gradFill", "grpFill", "noFill", "pattFill", "solidFill");
    private zzZXT zzZfi;

    private zzBJ(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    private static void zzX(zz53 zz53Var) {
        boolean z = zz53Var.zzZHY() == 12;
        if (zz53Var.zzZyc() == null) {
            zz53Var.zzZ(z ? new zz4P() : new zz4O());
        }
    }

    private void zzY(zz53 zz53Var) throws Exception {
        zzX(zz53Var);
        zz53Var.zzZyc().zzZ(zz51.zz6(this.zzZfi));
    }

    private void zzZ(zz53 zz53Var) throws Exception {
        zzX(zz53Var);
        zz53Var.zzZyc().zzY(zz51.zz5(this.zzZfi));
    }

    private zz7X zzZFh() throws Exception {
        zz7X zz7xZzc = null;
        while (this.zzZfi.zzZsD().zzQ(TranslateLanguage.BULGARIAN)) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    zz7xZzc = zz7V.zzc(this.zzZfi);
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
        return zz7xZzc;
    }

    private zz4G zzZFi() throws Exception {
        zz4G zz4gZz4 = null;
        while (this.zzZfi.zzZsD().zzQ("whole")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 20) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zz4gZz4 = zz4C.zz4(this.zzZfi);
            }
        }
        return zz4gZz4;
    }

    public static GroupShape zzx(zzZXT zzzxt) throws Exception {
        String localName = zzzxt.zzZsD().getLocalName();
        if (!"grpSp".equals(localName) && !"wgp".equals(localName) && !"spTree".equals(localName)) {
            return null;
        }
        GroupShape groupShapeZzY = zzY(zzzxt, localName);
        if (groupShapeZzY.zzY9i().zzZHY() == 9) {
            zzzxt.zzZqn().zzYr8();
        }
        return groupShapeZzY;
    }

    public static GroupShape zzy(zzZXT zzzxt) throws Exception {
        String localName = zzzxt.zzZsD().getLocalName();
        if ("lockedCanvas".equals(localName) || "wpc".equals(localName)) {
            return zzY(zzzxt, localName);
        }
        return null;
    }

    private static GroupShape zzY(zzZXT zzzxt, String str) throws Exception {
        GroupShape groupShape = new GroupShape(zzzxt.getDocument(), (byte) 0);
        int iZzOo = zz39.zzOo(str);
        boolean z = iZzOo == 10 || iZzOo == 5;
        zzzxt.zzT(groupShape);
        groupShape.zzU(z ? new zz5H(iZzOo) : new zz6Z(iZzOo));
        new zzBJ(zzzxt).zzZ(groupShape);
        zzzxt.zztj(17);
        return groupShape;
    }

    private void zzZ(GroupShape groupShape) throws Exception {
        String localName = this.zzZfi.zzZsD().getLocalName();
        int iZzZHY = groupShape.zzY9i().zzZHY();
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 0:
                    zz51.zzZ(this.zzZfi, (zzBK) groupShape.zzY9i());
                    break;
                case 1:
                case 2:
                case 3:
                    this.zzZfi.zzZT(zz1S.zzG(this.zzZfi));
                    break;
                case 4:
                case 5:
                    zzx(this.zzZfi);
                    break;
                case 6:
                    zz3U.zzG(this.zzZfi);
                    break;
                case 7:
                    if (groupShape.zzY9i() instanceof zz6Z) {
                        ((zz6Z) groupShape.zzY9i()).zzY(zz0I.zz2(this.zzZfi));
                    } else {
                        zz39.zzK(this.zzZfi.zzZsD());
                    }
                    break;
                case 8:
                    if (groupShape.zzY9i().zzZyc() == null) {
                        groupShape.zzY9i().zzZ(new zz4O());
                    }
                    zz51.zzZ(groupShape.zzY9i().zzZyc(), this.zzZfi);
                    break;
                case 9:
                    zzZ(groupShape.zzY9i());
                    break;
                case 10:
                case 11:
                    zzY(groupShape.zzY9i());
                    break;
                case 12:
                    if (iZzZHY == 10) {
                        ((zz5H) groupShape.zzY9i()).setFill(zzZFh());
                    } else {
                        zz39.zzK(this.zzZfi.zzZsD());
                    }
                    break;
                case 13:
                    if (iZzZHY == 10) {
                        ((zz5H) groupShape.zzY9i()).setOutline(zzZFi());
                    } else {
                        zz39.zzK(this.zzZfi.zzZsD());
                    }
                    break;
                case 14:
                    zzZXT zzzxt = this.zzZfi;
                    zzY(zzzxt, zzzxt.zzZsD().getLocalName());
                    break;
                case 15:
                    zzB3.zzG(this.zzZfi);
                    break;
                case 16:
                    if (iZzZHY == 12) {
                        groupShape.zzY9i().zzZ(zz06.zzK(this.zzZfi.zzZsD(), this.zzZfi.zzZqn()));
                    } else {
                        zz39.zzK(this.zzZfi.zzZsD());
                    }
                    break;
                case 17:
                    if (iZzZHY == 12) {
                        zz77.zz8(this.zzZfi);
                    } else {
                        zz39.zzK(this.zzZfi.zzZsD());
                    }
                    break;
                case 18:
                    if (iZzZHY == 12) {
                        ((zz6Z) groupShape.zzY9i()).setExtensions(zz81.zzd(this.zzZfi));
                    } else {
                        zz39.zzK(this.zzZfi.zzZsD());
                    }
                    break;
                case 19:
                    groupShape.zzY9i().zzZ(new zz4P());
                    zz51.zzZ(groupShape.zzY9i().zzZyc(), this.zzZfi);
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
    }
}
