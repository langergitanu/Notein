package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSK {
    private zzYPT zzXQV;
    private zzYTN zzXQW;
    private zzYOW zzXRR;
    private zzYPM zzXRS;
    private zzYOR zzXRT;

    public zzYSK(zzYOR zzyor, zzYPM zzypm, zzYOW zzyow, zzYTN zzytn, zzYPT zzypt) {
        this.zzXRT = zzyor;
        this.zzXRS = zzypm;
        this.zzXRR = zzyow;
        this.zzXQW = zzytn;
        this.zzXQV = zzypt;
    }

    public final int visitCommentStart(Comment comment) {
        if ((comment.getParentNode() instanceof OfficeMath) && !this.zzXRT.zzYs5()) {
            return 1;
        }
        this.zzXRT.zzRY(true);
        if (this.zzXRT.zzYsE()) {
            this.zzXQW.zzO(comment);
            return 0;
        }
        if (this.zzXRT.zzYsC() != 1) {
            return 0;
        }
        if (this.zzXRR.zzXu(comment)) {
            return 1;
        }
        this.zzXRR.zzXs(comment);
        this.zzXRS.zzYtO();
        this.zzXQV.zzYud();
        this.zzXRT.zzYsG().zzY("office:annotation");
        this.zzXRT.zzYsG().zzZ("dc:creator", comment.getAuthor());
        this.zzXRR.zzXr(comment);
        return 0;
    }

    public final int zzYwW() {
        if (this.zzXRT.zzYsC() == 1) {
            this.zzXRT.zzYsG().zzo();
            this.zzXQV.zzYuc();
        }
        this.zzXRT.zzRY(false);
        return 0;
    }
}
