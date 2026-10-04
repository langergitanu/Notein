package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYHI extends zzYHS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\flddirty", "\\fldlock", "\\datafield", "\\fldedit", "\\fldpriv");
    private boolean zzXvU;
    private FieldEnd zzYEr;

    public zzYHI(zzYFT zzyft) {
        super(zzyft);
        this.zzYEr = null;
        this.zzXvU = false;
    }

    private void zzYzA() {
        this.zzYEr = zzYiM().zzYhJ();
        zzYiM().zzWI(this.zzYEr);
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            if (zzYiM().zzYOl() != null) {
                zzYiM().zzYOl().isDirty(true);
                return;
            }
            return;
        }
        if (iZzTP == 1) {
            if (zzYiM().zzYOl() != null) {
                zzYiM().zzYOl().isLocked(true);
            }
        } else if (iZzTP == 2) {
            if (zzYiM().zzYhi() != null) {
                zzYiM().zzYhi().zzYhc();
            }
            super.zzT(zzyet);
        } else if (iZzTP == 3 || iZzTP == 4) {
            this.zzXw4.zzC0(zzyet.getName());
        } else {
            super.zzT(zzyet);
        }
    }

    public final boolean zzYiI() {
        return this.zzXvU;
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        int type = zzYiN().getType();
        if (type == 40) {
            zzYiM().zzN(this.zzYEr);
        } else if (type != 41) {
            super.zzYjb();
        } else {
            zzYzA();
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        switch (zzYiN().getType()) {
            case 40:
                zzYiM().zzYhL();
                break;
            case 41:
                this.zzXvU = true;
                break;
            case 42:
                zzYiM().zzZ((zzYOC) null);
                break;
            default:
                super.zzZ(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        switch (zzyhp.getType()) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                return new zzYH0(this.zzXw4);
            case 40:
            default:
                return super.zzZ(zzyhp);
            case 41:
            case 42:
                return this;
        }
    }
}
