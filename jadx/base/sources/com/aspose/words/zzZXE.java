package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXE extends zzZXT {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("background", "docParts", "docPart", "docPartPr", "docPartBody", "behaviors", "category", "description", "guid", "name", "style", "types", "behavior", "gallery", "decorated", "val", "all", C18437z2.f56754h);
    private BuildingBlock zzYNJ;
    private GlossaryDocument zzYNK;

    public zzZXE(com.aspose.words.internal.zz78 zz78Var, com.aspose.words.internal.zz77 zz77Var, GlossaryDocument glossaryDocument, LoadOptions loadOptions, zzYO3 zzyo3, zzZWG zzzwg, zzZWH zzzwh, zzZX3 zzzx3, zzZWM zzzwm) throws Exception {
        super(zz78Var, zz77Var, glossaryDocument, loadOptions, zzyo3, zzzwg, zzzwh, zzzx3, zzzwm);
        this.zzYNK = glossaryDocument;
    }

    private void zzZlF() {
        boolean zZz8 = false;
        while (zzZsD().zzi()) {
            if (zzUR.zzTP(zzZsD().getLocalName()) == 16) {
                zZz8 = zzZsD().zz8();
            }
        }
        while (zzZsD().zzQ("types")) {
            if (zzUR.zzTP(zzZsD().getLocalName()) != 17) {
                zzZsD().zzk();
            } else {
                this.zzYNJ.setType(zzZXP.zzNg(zzZsD().zzV("val", null)));
            }
        }
        if (zZz8) {
            this.zzYNJ.setType(7);
        }
    }

    private void zzZlG() {
        while (zzZsD().zzi()) {
            int iZzTP = zzUR.zzTP(zzZsD().getLocalName());
            if (iZzTP == 14) {
                this.zzYNJ.zzYK(zzZsD().zz8());
            } else if (iZzTP == 15) {
                this.zzYNJ.zzTc(zzZsD().getValue());
            }
        }
    }

    private void zzZlH() {
        while (zzZsD().zzQ("category")) {
            int iZzTP = zzUR.zzTP(zzZsD().getLocalName());
            if (iZzTP == 9) {
                this.zzYNJ.zzTb(zzZsD().zzV("val", null));
            } else if (iZzTP != 13) {
                zzZsD().zzk();
            } else {
                this.zzYNJ.setGallery(zzZXP.zzNh(zzZsD().zzV("val", null)));
            }
        }
    }

    private void zzZlI() {
        while (zzZsD().zzQ("behaviors")) {
            if (zzUR.zzTP(zzZsD().getLocalName()) != 12) {
                zzZsD().zzk();
            } else {
                this.zzYNJ.setBehavior(zzZXP.zzNi(zzZsD().zzV("val", null)));
            }
        }
    }

    private void zzZlJ() {
        while (zzZsD().zzQ("docPartPr")) {
            switch (zzUR.zzTP(zzZsD().getLocalName())) {
                case 5:
                    zzZlI();
                    break;
                case 6:
                    zzZlH();
                    break;
                case 7:
                    this.zzYNJ.setDescription(zzZsD().zzV("val", null));
                    break;
                case 8:
                    this.zzYNJ.zzR(new com.aspose.words.internal.zzZOZ(zzZsD().zzV("val", null)));
                    break;
                case 9:
                    zzZlG();
                    break;
                case 10:
                    this.zzYNJ.zzTa(zzZsD().zzV("val", null));
                    break;
                case 11:
                    zzZlF();
                    break;
                default:
                    zzZsD().zzk();
                    break;
            }
        }
    }

    private void zzZlK() throws Exception {
        BuildingBlock buildingBlock = new BuildingBlock(this.zzYNK);
        this.zzYNJ = buildingBlock;
        zzT(buildingBlock);
        while (zzZsD().zzQ("docPart")) {
            int iZzTP = zzUR.zzTP(zzZsD().getLocalName());
            if (iZzTP == 3) {
                zzZlJ();
            } else if (iZzTP != 4) {
                zzZsD().zzk();
            } else {
                zzL(this.zzYNK);
                endSection();
            }
        }
        zztj(32);
    }

    private void zzZlL() throws Exception {
        while (zzZsD().zzQ("docParts")) {
            if (zzUR.zzTP(zzZsD().getLocalName()) != 2) {
                zzZsD().zzk();
            } else {
                zzZlK();
            }
        }
    }

    @Override // com.aspose.words.zzZXT
    public final void zzZmu() throws Exception {
        while (zzZsD().zzQ("glossaryDocument")) {
            int iZzTP = zzUR.zzTP(zzZsD().getLocalName());
            if (iZzTP == 0) {
                zzZYH.zzE(this);
            } else if (iZzTP != 1) {
                zzZsD().zzk();
            } else {
                zzZlL();
            }
        }
    }

    @Override // com.aspose.words.zzYVB
    public final boolean zzZmv() {
        return false;
    }
}
