package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEU extends zzYF7 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\tcl", "\\tcf");
    private boolean zzXrc;
    private Object zzXrd;
    private boolean zzXre;
    private int zzYw;

    public zzYEU(zzYFT zzyft, boolean z) {
        super(zzyft);
        this.zzYw = 1;
        this.zzXre = z;
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        this.zzXrc = false;
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            this.zzYw = zzyet.zzYeT();
            return;
        }
        if (iZzTP != 1) {
            super.zzT(zzyet);
        } else if (zzyet.zzYf2() > 0) {
            this.zzXrd = Character.valueOf((char) zzyet.zzYeT());
        } else {
            this.zzXrc = true;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        if (!this.zzXrc) {
            super.zzY(zzyet);
            return;
        }
        if (zzyet.zz0R() > 0) {
            this.zzXrd = Character.valueOf(zzyet.zzYR().charAt(0));
        }
        this.zzXrc = false;
    }

    @Override // com.aspose.words.zzYF7
    public final String zzYi7() {
        return " TC  ";
    }

    @Override // com.aspose.words.zzYF7
    public final void zzYi8() throws Exception {
        if (this.zzXre) {
            zzYiM().zzCe("\\n");
        }
        if (this.zzYw != 1) {
            zzYiM().zzCe(com.aspose.words.internal.zzZKN.format(" \\l {0}", Integer.valueOf(this.zzYw)));
        }
        if (this.zzXrd != null) {
            zzYiM().zzCe(com.aspose.words.internal.zzZKN.format(" \\f {0}", (Character) this.zzXrd));
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        if (zzYiN().getType() == 130) {
            zzYft();
        }
        super.zzYjb();
        this.zzXw4.zzXt8 = false;
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        if (zzYiN().getType() == 130) {
            zzYfu();
        }
        this.zzXw4.zzXt8 = true;
        super.zzZ(zzyet);
    }
}
