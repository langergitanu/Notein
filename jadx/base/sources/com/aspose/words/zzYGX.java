package com.aspose.words;

import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGX extends zzYF7 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\bxe", "\\ixe", "\\xef", "\\yxe", "\\*\\pxe");
    private String zzXv1;
    private String zzYER;
    private String zzYEW;
    private boolean zzYEX;
    private boolean zzYEY;
    private String zzYG0;

    public zzYGX(zzYFT zzyft) {
        super(zzyft);
    }

    public static String zzCk(String str) {
        return str.replace("\\:", Character.toString((char) 57345)).replace(C18241k5.f55433h, "\\:").replace(Character.toString((char) 57345), C18241k5.f55433h);
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        if (zzYiN().getType() != 132) {
            super.zzT(zzyet);
        }
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            this.zzYEY = true;
            return;
        }
        if (iZzTP == 1) {
            this.zzYEX = true;
            return;
        }
        if (iZzTP == 2) {
            this.zzYEW = Character.toString((char) zzyet.zzYeT());
        } else if (iZzTP == 3 || iZzTP == 4) {
            this.zzYER = zzyet.zzYR();
        } else {
            super.zzT(zzyet);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        int type = zzYiN().getType();
        if (type == 133) {
            this.zzYG0 = zzyet.zzYR();
        } else if (type != 134) {
            super.zzY(zzyet);
        } else {
            this.zzXv1 = zzyet.zzYR();
        }
    }

    @Override // com.aspose.words.zzYF7
    public final String zzYi7() {
        return " XE ";
    }

    @Override // com.aspose.words.zzYF7
    public final void zzYi8() throws Exception {
        if (this.zzYEY) {
            zzYiM().zzCe("\\b ");
        }
        if (this.zzYEX) {
            zzYiM().zzCe("\\i ");
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYEW)) {
            zzYiM().zzCe(com.aspose.words.internal.zzZKN.format("\\f \"{0}\" ", this.zzYEW));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYG0)) {
            zzYiM().zzCe(com.aspose.words.internal.zzZKN.format("\\t \"{0}\" ", this.zzYG0));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXv1)) {
            zzYiM().zzCe(com.aspose.words.internal.zzZKN.format("\\r \"{0}\" ", this.zzXv1));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYER)) {
            zzYiM().zzCe(com.aspose.words.internal.zzZKN.format("\\y \"{0}\" ", this.zzYER));
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        if (zzYiN().getType() == 132) {
            zzYft();
        }
        super.zzYjb();
        this.zzXw4.zzXt9 = false;
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        if (zzYiN().getType() == 132) {
            zzYfu();
        }
        this.zzXw4.zzXt9 = true;
        super.zzZ(zzyet);
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        int type = zzyhp.getType();
        return (type == 133 || type == 134) ? this : super.zzZ(zzyhp);
    }
}
