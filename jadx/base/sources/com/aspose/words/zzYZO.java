package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZO {
    private com.aspose.words.internal.zzZQC<zzZ05> zzY07 = new com.aspose.words.internal.zzZQC<>();
    private DocumentBase zzZG3;

    public zzYZO(DocumentBase documentBase) {
        this.zzZG3 = documentBase;
    }

    public final int visitOfficeMathEnd(OfficeMath officeMath) {
        if (officeMath.zzZsL().getMathObjectType() == 19) {
            this.zzY07.pop().visitOfficeMathEnd(officeMath);
            return 0;
        }
        if (this.zzY07.size() == 0 || !zzZ05.zzq(officeMath)) {
            return 0;
        }
        this.zzY07.peek().visitOfficeMathEnd(officeMath);
        return 0;
    }

    public final int visitOfficeMathStart(OfficeMath officeMath) {
        if (officeMath.zzZsL().getMathObjectType() == 19) {
            this.zzY07.push(new zzZ05(this.zzZG3));
            return 0;
        }
        if (this.zzY07.size() == 0 || !zzZ05.zzq(officeMath)) {
            return 0;
        }
        this.zzY07.peek().visitOfficeMathStart(officeMath);
        return 0;
    }
}
