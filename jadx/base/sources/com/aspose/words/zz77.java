package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz77 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("graphicData", "uri", "lockedCanvas", "wpc", "pic", "chart", "relIds", "wsp", "sp", "wgp", "grpSp", "contentPart", "AlternateContent", "Choice", "Fallback");
    private zzZXT zzZfi;

    private zz77(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    public static ShapeBase zz8(zzZXT zzzxt) throws Exception {
        return new zz77(zzzxt).zzZAo();
    }

    private Shape zzZAl() throws Exception {
        String localName = this.zzZfi.zzZsD().getLocalName();
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) == 11) {
                return zzB3.zzG(this.zzZfi);
            }
            this.zzZfi.zzZsD().getLocalName();
            this.zzZfi.zzZsD().zzk();
        }
        return null;
    }

    private Shape zzZAm() throws Exception {
        Shape shapeZzZAl = null;
        while (this.zzZfi.zzZsD().zzQ("AlternateContent")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 13) {
                shapeZzZAl = zzZAl();
            } else if (iZzTP != 14) {
                this.zzZfi.zzZsD().getLocalName();
                this.zzZfi.zzZsD().zzk();
            } else {
                this.zzZfi.zzZsD().zzk();
            }
        }
        return shapeZzZAl;
    }

    private ShapeBase zzZAn() throws Exception {
        while (this.zzZfi.zzZsD().zzi()) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 1) {
                this.zzZfi.zzZsD().zzZ(16777216, 2, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", this.zzZfi.zzZsD().getLocalName()));
            }
        }
        while (this.zzZfi.zzZsD().zzQ("graphicData")) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 2:
                case 3:
                    return zzBJ.zzy(this.zzZfi);
                case 4:
                    return zz3U.zzG(this.zzZfi);
                case 5:
                    return zzDM.zzG(this.zzZfi);
                case 6:
                    return zz92.zzG(this.zzZfi);
                case 7:
                case 8:
                    return zz1S.zzG(this.zzZfi);
                case 9:
                case 10:
                    return zzBJ.zzx(this.zzZfi);
                case 11:
                    return zzB3.zzG(this.zzZfi);
                case 12:
                    return zzZAm();
                default:
                    this.zzZfi.zzZsD().zzk();
                    break;
            }
        }
        return null;
    }

    private ShapeBase zzZAo() throws Exception {
        while (this.zzZfi.zzZsD().zzQ("graphic")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) == 0) {
                return zzZAn();
            }
            this.zzZfi.zzZsD().zzk();
        }
        return null;
    }
}
