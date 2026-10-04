package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYI3 extends zzYHS {
    private Comment zzYsv;

    public zzYI3(zzYFT zzyft) {
        super(zzyft);
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        int iZzZo;
        int iZzZo2;
        int iZzZo3;
        int size;
        int type = zzYiL().zzYiN().getType();
        if (type == 75) {
            if (this.zzYsv == null || (iZzZo = com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR())) == Integer.MIN_VALUE) {
                return;
            }
            zzYiM().zzW(this.zzYsv, iZzZo);
            return;
        }
        if (type == 76) {
            if (this.zzYsv == null || (iZzZo2 = com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR())) == Integer.MIN_VALUE) {
                return;
            }
            this.zzYsv.zzv(zzKE.zzM4(iZzZo2));
            return;
        }
        if (type != 259) {
            if (type != 260) {
                super.zzY(zzyet);
                return;
            } else {
                this.zzXw4.zzC0("\\atnicn");
                return;
            }
        }
        if (this.zzYsv == null || (iZzZo3 = com.aspose.words.internal.zzJB.zzZo(zzyet.zzYR())) >= 0 || (zzYiM().zzXuy.size() + iZzZo3) - 1 < 0) {
            return;
        }
        this.zzYsv.setParentId(zzYiM().zzXuy.get(size).getId());
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        if (zzYiL().zzYiN().getType() != 72) {
            super.zzYjb();
        } else {
            zzYiM().zzYWI();
            this.zzYsv = null;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        int type = zzyhp.getType();
        return (type == 75 || type == 76 || type == 259 || type == 260) ? this : super.zzZ(zzyhp);
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        if (zzYiL().zzYiN().getType() != 72) {
            super.zzZ(zzyet);
            return;
        }
        this.zzYsv = new Comment(getDocument(), zzYiL().zzYir());
        zzYiM().zzXuy.add(this.zzYsv);
        this.zzYsv.setInitial(this.zzXw4.zzYgl());
        this.zzYsv.setAuthor(this.zzXw4.zzYgk());
        zzYiM().zzM(this.zzYsv);
    }
}
