package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZY6 {
    private com.aspose.words.internal.zzD4 zzYPb = new com.aspose.words.internal.zzD4();
    private zzZYD zzYPc;
    private zzZYD zzYPd;
    private zzZYD zzYPe;
    private zzZYD zzYPf;
    private zzZXR zzYPg;

    public zzZY6(zzZXR zzzxr) throws Exception {
        this.zzYPg = zzzxr;
        if (zzzxr.getCompliance() != 0) {
            zzZYD zzzydZzJ = this.zzYPg.zzJ("commentsExtended.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.commentsExtended+xml", zzzxr.zzZmp().zzZkL());
            this.zzYPe = zzzydZzJ;
            zzzydZzJ.zzNU("w15:commentsEx");
            if (this.zzYPg.zzZlO() >= 16) {
                zzZYD zzzydZzJ2 = this.zzYPg.zzJ("commentsIds.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.commentsIds+xml", zzzxr.zzZmp().zzZkK());
                this.zzYPd = zzzydZzJ2;
                zzzydZzJ2.zzNU("w16cid:commentsIds");
            }
            if (this.zzYPg.zzZlO() >= 17) {
                zzZYD zzzydZzJ3 = this.zzYPg.zzJ("commentsExtensible.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.commentsExtensible+xml", zzzxr.zzZmp().zzZkJ());
                this.zzYPc = zzzydZzJ3;
                zzzydZzJ3.zzNU("w16cex:commentsExtensible");
            }
        }
        zzZYD zzzydZzJ4 = this.zzYPg.zzJ("comments.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.comments+xml", zzzxr.zzZmp().getComments());
        this.zzYPf = zzzydZzJ4;
        zzzydZzJ4.zzNU("w:comments");
    }

    private void zzU(Comment comment) {
        if (this.zzYPc != null) {
            com.aspose.words.internal.zzZQ9 zzzq9ZzZZT = comment.zzZZT();
            com.aspose.words.internal.zzZQ9 zzzq9 = com.aspose.words.internal.zzZQ9.zz35;
            if (!com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZZT, zzzq9) || comment.zzZZR()) {
                this.zzYPc.zzY("w16cex:commentExtensible");
                this.zzYPc.zz0("w16cex:durableId", zzYU3.zzsV(comment.zzZZS()));
                if (!com.aspose.words.internal.zzZQ9.zzZ(comment.zzZZT(), zzzq9)) {
                    this.zzYPc.zzV("w16cex:dateUtc", comment.zzZZT());
                }
                if (comment.zzZZR()) {
                    this.zzYPc.zzV("w16cex:intelligentPlaceholder", comment.zzZZT());
                }
                this.zzYPc.zzp();
            }
        }
    }

    private int zzV(Comment comment) {
        int iZzYoR = comment.getLastParagraph().zzYoR();
        if (iZzYoR == 0) {
            iZzYoR = this.zzYPg.zzFv(comment.getLastParagraph().getParentStory().getStoryType());
        }
        this.zzYPg.zzZlP().zzP(comment.getLastParagraph(), iZzYoR);
        this.zzYPb.add(comment.getId(), iZzYoR);
        return iZzYoR;
    }

    private void zzX(Comment comment, int i) {
        zzZYD zzzyd = this.zzYPd;
        if (zzzyd == null) {
            return;
        }
        zzzyd.zzY("w16cid:commentId");
        this.zzYPd.zz0("w16cid:paraId", zzYU3.zzsV(i));
        if (comment.zzZZS() == 0) {
            comment.zzNb(zzZmH());
        }
        this.zzYPd.zz0("w16cid:durableId", zzYU3.zzsV(comment.zzZZS()));
        this.zzYPd.zzp();
    }

    private void zzY(Comment comment, int i) {
        zzZYD zzzyd = this.zzYPe;
        if (zzzyd == null) {
            return;
        }
        zzzyd.zzY("w15:commentEx");
        this.zzYPe.zz0("w15:paraId", zzYU3.zzsV(i));
        if (comment.getParentId() != -1 && this.zzYPb.zzVE(comment.getParentId())) {
            this.zzYPe.zz0("w15:paraIdParent", zzYU3.zzsV(this.zzYPb.get(comment.getParentId())));
        }
        this.zzYPe.zzx("w15:done", comment.getDone());
        this.zzYPe.zzp();
    }

    private int zzZmH() {
        while (true) {
            int iHashCode = com.aspose.words.internal.zzZZS.zzY(new Object[0]).hashCode() & Integer.MAX_VALUE;
            if (iHashCode != 0 && !this.zzYPg.zzZqS().zzXoR.contains(Integer.valueOf(iHashCode))) {
                this.zzYPg.zzZqS().zzXoR.add(Integer.valueOf(iHashCode));
                return iHashCode;
            }
        }
    }

    public final void close() {
        this.zzYPf.endDocument();
        zzZYD zzzyd = this.zzYPe;
        if (zzzyd != null) {
            zzzyd.endDocument();
        }
        zzZYD zzzyd2 = this.zzYPd;
        if (zzzyd2 != null) {
            zzzyd2.endDocument();
        }
        zzZYD zzzyd3 = this.zzYPc;
        if (zzzyd3 != null) {
            zzzyd3.endDocument();
        }
    }

    public final void zzZ(Comment comment, int i) {
        int iZzV = zzV(comment);
        zzY(comment, iZzV);
        zzX(comment, iZzV);
        zzU(comment);
        this.zzYPf.zzY("w:comment");
        this.zzYPf.zzZj("w:id", i);
        this.zzYPf.zz0("w:author", comment.getAuthor());
        if (!com.aspose.words.internal.zzZQ9.zzZ(comment.zzZZU(), com.aspose.words.internal.zzZQ9.zz35)) {
            this.zzYPf.zzU("w:date", comment.zzZZU());
        }
        this.zzYPf.zz0("w:initials", comment.getInitial());
        this.zzYPg.zzY(this.zzYPf);
    }

    public final void zzZmI() {
        this.zzYPf.zzp();
        this.zzYPg.zzZlX();
    }
}
