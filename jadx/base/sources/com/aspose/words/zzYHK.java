package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHK extends zzYHS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\bkmkcolf", "\\bkmkcoll");
    private EditableRangeEnd zzYLR;
    private EditableRangeStart zzYLS;

    public zzYHK(zzYFT zzyft) {
        super(zzyft);
    }

    private void zzCm(String str) {
        if (str.length() != 16) {
            throw new IllegalArgumentException("incorrect EditableRangeEndValue format");
        }
        zzYGY zzygy = new zzYGY(str);
        zzygy.zzXc();
        this.zzYLR.setId(zzygy.zzXa());
    }

    private void zzCn(String str) {
        if (str.length() != 16) {
            throw new IllegalArgumentException("incorrect EditableRangeStartValue format");
        }
        int iZzCo = zzYHN.zzCo(str.substring(0, 4));
        zzYGY zzygy = new zzYGY(str);
        int i = (zzygy.readByte() & 255) - 1;
        zzygy.zzn(3);
        short sZzXa = zzygy.zzXa();
        if (iZzCo != Integer.MIN_VALUE) {
            this.zzYLS.setEditorGroup(iZzCo);
            this.zzYLS.setSingleUser("");
        } else {
            this.zzYLS.setEditorGroup(0);
            this.zzYLS.setSingleUser(this.zzXw4.zzYgu().get(i));
        }
        this.zzYLS.setId(sZzXa);
    }

    private void zzM(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            this.zzYLS.zzOX(zzyet.zzYeT());
        } else {
            if (iZzTP != 1) {
                return;
            }
            this.zzYLS.zzOW(zzyet.zzYeT() - 1);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int type = zzYiN().getType();
        if (type == 53) {
            zzM(zzyet);
        } else if (type != 54) {
            super.zzT(zzyet);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        switch (zzYiN().getType()) {
            case 52:
                this.zzXw4.zzYgu().add(zzyet.zzYR());
                break;
            case 53:
                zzCn(zzyet.zzYR());
                break;
            case 54:
                zzCm(zzyet.zzYR());
                break;
            default:
                super.zzY(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        int type = zzYiN().getType();
        if (type == 53) {
            this.zzYLS = new EditableRangeStart(getDocument());
            zzYiM().zzY(this.zzYLS);
        } else if (type != 54) {
            super.zzZ(zzyet);
        } else {
            this.zzYLR = new EditableRangeEnd(getDocument());
            zzYiM().zzY(this.zzYLR);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        switch (zzyhp.getType()) {
            case 52:
            case 53:
            case 54:
                return this;
            default:
                return super.zzZ(zzyhp);
        }
    }
}
