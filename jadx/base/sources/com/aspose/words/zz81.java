package com.aspose.words;

import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
final class zz81 extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("ext", "{E40237B7-FDA0-4F09-8148-C483321AD2D9}", "{909E8E84-426E-40DD-AFC4-6F175D3DCCD1}", "{28A0092B-C50C-407E-A947-70E740481C1C}", "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}", "{02D57815-91ED-43cb-92C2-25804820EDAC}", "{C3380CC4-5D6E-409C-BE32-E72D297353CC}", "{C809E66F-F1BF-436E-b5F7-EEA9579F0CBA}", "http://schemas.microsoft.com/office/drawing/2008/diagram", "{91240B29-F687-4F45-9708-019B960494DF}", "{6F2FDCE9-48DA-4B69-8628-5D25D57E5C99}", "{96DAC541-7B7A-43D3-8B79-37D633B846F1}", "{C183D7F6-B498-43B3-948B-1728B52AA6E4}", "dataModelExt", "webVideoPr", "embeddedHtml", "w", C18773h.f57233c, "hiddenLine", "useLocalDpi", "decorative", "cNvPr", "hiddenFill", "noFill", "grpFill", "pattFill", "blipFill", "gradFill", "solidFill", "invertSolidFillFmt", "spPr", "hlinkClick", "hlinkHover", "svgBlip");
    private zzYU4 zzZ7n;
    private zzZXT zzZfi;

    private zz81(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
        this.zzZ7n = zzzxt.zzZsD();
    }

    private void zzO(com.aspose.words.internal.zzZYG<zz82> zzzyg) throws Exception {
        com.aspose.words.internal.zzZHW zzzhw = zzUR;
        if (zzzhw.zzTP(this.zzZ7n.getLocalName()) != 0) {
            zz39.zzI(this.zzZ7n);
            if (this.zzZ7n.zzc()) {
                this.zzZ7n.zzd();
                return;
            } else {
                this.zzZ7n.zzYyH();
                return;
            }
        }
        String strZzV = this.zzZ7n.zzV("uri", "");
        zz82 zz82Var = new zz82(strZzV, null);
        com.aspose.words.internal.zzZSO zzzso = new com.aspose.words.internal.zzZSO(null);
        String strZzZ = this.zzZ7n.zzZ((com.aspose.words.internal.zzEY) null, zzzso);
        this.zzZ7n = this.zzZfi.zzX(strZzZ, zzzso.zzmv());
        switch (zzzhw.zzTP(strZzV)) {
            case 1:
                zz82Var.zzZ(zzZBE());
                break;
            case 2:
                zz82Var.zzX(zzZ(zz82Var));
                break;
            case 3:
                zz82Var.zzXi(zzZBG());
                break;
            case 4:
                zz82Var.zzW(zzFW.zzN(this.zzZfi));
                break;
            case 5:
                zzZ(zz82Var, strZzZ);
                break;
            case 6:
                zzY(zz82Var, strZzZ);
                break;
            case 7:
                zz82Var.zzZ(zzZBJ());
                break;
            case 8:
                zz82Var.zzOI(zzZBK());
                break;
            case 9:
                zz82Var.zzY(zzZBH());
                break;
            case 10:
                zz82Var.zzY(zzZBD());
                break;
            case 11:
                zz82Var.zzX(zzZBA());
                break;
            case 12:
                zz82Var.zzXh(zzZBF());
                break;
            default:
                zz82Var.zzOJ(strZzZ);
                zzZ("ext", zz82Var);
                break;
        }
        zzzyg.set(zz82Var.getUri(), zz82Var);
        this.zzZ7n = this.zzZfi.zzZmi();
    }

    private zz7X zzY(zz82 zz82Var) throws Exception {
        while (this.zzZ7n.zzQ("hiddenFill")) {
            switch (zzUR.zzTP(this.zzZ7n.getLocalName())) {
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    if (zz82Var.zzZBY() == null) {
                        return zz7V.zzc(this.zzZfi);
                    }
                    zz39.zzK(this.zzZ7n);
                    break;
                    break;
                default:
                    zz39.zzK(this.zzZ7n);
                    break;
            }
        }
        return null;
    }

    private zz7X zzZ(zz82 zz82Var) throws Exception {
        while (this.zzZ7n.zzQ("ext")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) == 22) {
                this.zzZfi.zzZqn().zzYr8();
                return zzY(zz82Var);
            }
            zz39.zzK(this.zzZ7n);
        }
        return null;
    }

    private zzH1 zzZBA() throws Exception {
        while (this.zzZ7n.zzQ("ext")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) == 33) {
                return zz7V.zz9(this.zzZfi);
            }
            zz39.zzK(this.zzZ7n);
        }
        return null;
    }

    private zz4T zzZBB() throws Exception {
        zz4T zz4t = new zz4T(this.zzZ7n.zzX("id", 0), this.zzZ7n.zzV("name", null));
        while (this.zzZ7n.zzQ("cNvPr")) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 31) {
                zz4t.zzZ(zz6O.zz7(this.zzZfi));
            } else if (iZzTP != 32) {
                zz39.zzK(this.zzZ7n);
            } else {
                zz4t.zzY(zz6O.zz7(this.zzZfi));
            }
        }
        return zz4t;
    }

    private zzD9 zzZBC() throws Exception {
        while (this.zzZ7n.zzQ("invertSolidFillFmt")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) == 30) {
                this.zzZfi.zzZqn().zzYr8();
                zzD9 zzd9 = new zzD9();
                zzFW.zzZ(this.zzZfi, zzd9);
                return zzd9;
            }
            zz39.zzK(this.zzZ7n);
        }
        return null;
    }

    private zzD9 zzZBD() throws Exception {
        while (this.zzZ7n.zzQ("ext")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) == 29) {
                return zzZBC();
            }
            zz39.zzK(this.zzZ7n);
        }
        return null;
    }

    private zz4T zzZBE() throws Exception {
        while (this.zzZ7n.zzQ("ext")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) == 21) {
                if ("dgm14".equals(this.zzZ7n.getPrefix())) {
                    this.zzZfi.zzZqn().zzYr8();
                }
                return zzZBB();
            }
            zz39.zzK(this.zzZ7n);
        }
        return null;
    }

    private boolean zzZBF() {
        while (this.zzZ7n.zzQ("ext")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) == 20) {
                return this.zzZ7n.zzX("val", false);
            }
            zz39.zzK(this.zzZ7n);
        }
        return false;
    }

    private boolean zzZBG() {
        while (this.zzZ7n.zzQ("ext")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) == 19) {
                return this.zzZ7n.zzX("val", false);
            }
            zz39.zzK(this.zzZ7n);
        }
        return false;
    }

    private zz4G zzZBH() throws Exception {
        while (this.zzZ7n.zzQ("ext")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) == 18) {
                return zz4C.zz4(this.zzZfi);
            }
            zz39.zzK(this.zzZ7n);
        }
        return null;
    }

    private zzZZW zzZBI() {
        zzZZW zzzzw = new zzZZW();
        while (this.zzZ7n.zzi()) {
            switch (zzUR.zzTP(this.zzZ7n.getLocalName())) {
                case 15:
                    zzzzw.zzOf(this.zzZ7n.getValue());
                    break;
                case 16:
                    zzzzw.zzXd(this.zzZ7n.zz9());
                    break;
                case 17:
                    zzzzw.zzXc(this.zzZ7n.zz9());
                    break;
                default:
                    zzYU4 zzyu4 = this.zzZ7n;
                    zzyu4.zzZ(16777216, 14, com.aspose.words.internal.zzZKN.format("Unexpected attribute '{0}' is occurred while reading document, ignored.", zzyu4.getLocalName()));
                    break;
            }
        }
        return zzzzw;
    }

    private zzZZW zzZBJ() {
        while (this.zzZ7n.zzQ("ext")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) == 14) {
                if ("wp15".equals(this.zzZ7n.getPrefix())) {
                    this.zzZfi.zzZqn().zzYr8();
                }
                return zzZBI();
            }
            zz39.zzK(this.zzZ7n);
        }
        return null;
    }

    private String zzZBK() {
        while (this.zzZ7n.zzQ("ext")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) == 13) {
                return this.zzZ7n.zzV("relId", "");
            }
            zz39.zzK(this.zzZ7n);
        }
        return "";
    }

    private com.aspose.words.internal.zzZYG<zz82> zzZBL() throws Exception {
        com.aspose.words.internal.zzZYG<zz82> zzzyg = new com.aspose.words.internal.zzZYG<>();
        String localName = this.zzZ7n.getLocalName();
        if (this.zzZ7n.zzQ(localName)) {
            while (!this.zzZ7n.zzP(localName)) {
                zzO(zzzyg);
            }
        }
        return zzzyg;
    }

    public static com.aspose.words.internal.zzZYG<zz82> zzd(zzZXT zzzxt) throws Exception {
        return new zz81(zzzxt).zzZBL();
    }

    private void zzZ(String str, zz82 zz82Var) throws Exception {
        while (this.zzZ7n.zzQ(str)) {
            String strZzV = this.zzZ7n.zzV("embed", "");
            if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
                zz82Var.zzZBN().zzB(strZzV, this.zzZfi.zzNI(strZzV) ? this.zzZfi.zzNO(strZzV) : null);
            }
            if (!this.zzZ7n.zzc()) {
                zzZ(this.zzZ7n.getLocalName(), zz82Var);
            }
            this.zzZ7n.zzYyH();
        }
    }

    private void zzY(zz82 zz82Var, String str) {
        zz82Var.zzO(zzFW.zzP(this.zzZfi));
        zz82Var.zzOJ(str);
    }

    private void zzZ(zz82 zz82Var, String str) throws Exception {
        zzCB zzcbZzQ = zzFW.zzQ(this.zzZfi);
        if (zzcbZzQ != null) {
            zz82Var.zzZBR().zzZ(zzcbZzQ);
        } else {
            zz82Var.zzOJ(str);
        }
    }
}
