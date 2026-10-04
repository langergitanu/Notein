package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ64 extends zzZ6H {
    public zzZ64(zzYMD zzymd) throws Exception {
        super(zzymd);
    }

    @Override // com.aspose.words.zzZ6H
    public final boolean zzYRM() throws Exception {
        if (zz14().zzYol()) {
            return false;
        }
        return ((zz14().getText().length() == 0 || zz14().getText().charAt(0) == 0) && zz14().zzZXS() == 0) ? false : true;
    }

    @Override // com.aspose.words.zzZ6H
    public final boolean zzYS0() {
        return this.zzZi.length() > 1 && zz14().zzZSu();
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzz61.zzZ(this);
    }

    public zzZ64(zzYMD zzymd, String str) throws Exception {
        super(zzymd, str);
    }
}
