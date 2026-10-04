package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGN extends zzYHQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\listid", "\\listtemplateid", "\\listsimple", "\\listhybrid", "\\listrestarthdn", "\\liststyleid");
    private com.aspose.words.internal.zzD3<zzZ4J> zzXuK;
    private com.aspose.words.internal.zzD3<Style> zzXvQ;
    private zzZ4J zzYbN;

    public zzYGN(zzYFT zzyft, com.aspose.words.internal.zzD3<Style> zzd3) {
        super(zzyft);
        this.zzXvQ = zzd3;
        this.zzXuK = new com.aspose.words.internal.zzD3<>();
    }

    private void zzCi(String str) {
        Style styleZzl6 = Style.zzl6(4);
        zzYUC.zzZ(zzY8T.zzAN(str), getDocument().getStyles(), false, true, false, styleZzl6);
        styleZzl6.zzl5(12);
        getDocument().getStyles().zzZ(styleZzl6, (String[]) null);
        this.zzYbN.zzxh(styleZzl6.zzZ7j());
        this.zzXvQ.add(this.zzYbN.zzYP8(), styleZzl6);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            this.zzYbN.zzxB(zzyet.zzYeT());
            return;
        }
        if (iZzTP == 1) {
            this.zzYbN.zzxi(zzyet.zzYeT());
            return;
        }
        if (iZzTP == 2) {
            this.zzYbN.zzxj(!zzyet.zzYeY() ? 1 : 0);
            return;
        }
        if (iZzTP == 3) {
            this.zzYbN.zzxj(2);
            return;
        }
        if (iZzTP == 4) {
            this.zzYbN.isRestartAtEachSection(true);
        } else if (iZzTP != 5) {
            zzO(zzyet);
        } else {
            this.zzXuK.set(zzyet.zzYeT(), this.zzYbN);
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        int type = zzYiN().getType();
        if (type == 63) {
            this.zzYbN.setName(com.aspose.words.internal.zzZKN.zzTX(zzyet.zzYeX()));
            return;
        }
        if (type != 64) {
            return;
        }
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(zzyet.zzYeX());
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzTX) || this.zzXvQ.zzVE(this.zzYbN.zzYP8())) {
            return;
        }
        zzCi(strZzTX);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() {
        if (zzYiN().getType() == 62) {
            getDocument().getLists().zzZ(this.zzYbN);
            return;
        }
        if (zzYiN().getType() == 71) {
            this.zzXw4.zzRk(false);
        }
        if (zzYiN().getType() != 61) {
            return;
        }
        com.aspose.words.internal.zzD3<zzZ4J>.zzZ zzzZzCK = this.zzXuK.zzCK();
        while (zzzZzCK.moveNext()) {
            zzzZzCK.zzCI().zzxh(getDocument().getLists().zzxq(zzzZzCK.zzCM()).zzYOO());
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) {
        int type = zzYiN().getType();
        if (type == 62) {
            this.zzYbN = new zzZ4J(getDocument());
        } else {
            if (type != 71) {
                return;
            }
            this.zzXw4.zzRk(true);
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        int type = zzyhp.getType();
        if (type != 71 && type != 100) {
            if (type != 103) {
                switch (type) {
                    case 62:
                    case 63:
                    case 64:
                        break;
                    case 65:
                        return new zzYGQ(this.zzXw4, this.zzYbN.zzYOP());
                    default:
                        return null;
                }
            } else {
                return new zzYFY(this.zzXw4);
            }
        }
        return this;
    }
}
