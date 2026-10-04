package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZY7 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("comment");

    private static int zzD(zzYU4 zzyu4) {
        return zzZXQ.zzNt(zzyu4.zzV("displacedByCustomXml", null));
    }

    public static void zzE(zzZXT zzzxt) throws Exception {
        zzZW1 zzzw1ZzNJ = zzzxt.zzNJ(zzzxt.zzZmp().getComments());
        if (zzzw1ZzNJ == null) {
            return;
        }
        while (zzzw1ZzNJ.zzQ("comments")) {
            if (zzUR.zzTP(zzzw1ZzNJ.getLocalName()) != 0) {
                zzzw1ZzNJ.zzk();
            } else {
                zzYVH zzyvh = new zzYVH(zzzw1ZzNJ);
                Comment comment = new Comment(zzzxt.getDocument(), new zzYEF());
                comment.setIdInternal(zzyvh.getId());
                comment.setAuthor(zzyvh.getAuthor());
                comment.setInitial(zzyvh.getInitials());
                if (!com.aspose.words.internal.zzZQ9.zzZ(zzyvh.zzkT(), com.aspose.words.internal.zzZQ9.zz35)) {
                    comment.zzv(com.aspose.words.internal.zzZQ9.zzZ(zzyvh.zzkT(), 2L));
                }
                zzZWW.zzZl2();
                zzzxt.zzQ(comment);
                zzzxt.zzT(comment);
            }
        }
        zzzxt.zzZmi();
    }

    public static void zzP(zzYVB zzyvb) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        String strZzV = zzyu4ZzZsD.zzV("id", null);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            CommentRangeEnd commentRangeEnd = new CommentRangeEnd(zzyvb.getDocument(), com.aspose.words.internal.zzJB.zzZv(strZzV));
            commentRangeEnd.zzOY(zzD(zzyu4ZzZsD));
            zzyvb.zzYK(commentRangeEnd);
        }
    }

    public static void zzQ(zzYVB zzyvb) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        String strZzV = zzyu4ZzZsD.zzV("id", null);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            CommentRangeStart commentRangeStart = new CommentRangeStart(zzyvb.getDocument(), com.aspose.words.internal.zzJB.zzZv(strZzV));
            commentRangeStart.zzOY(zzD(zzyu4ZzZsD));
            zzyvb.zzYK(commentRangeStart);
        }
    }
}
