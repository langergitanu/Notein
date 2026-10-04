package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJC {
    private Comment zzYsv;
    private boolean zzYsw;
    private ArrayList<Comment> zzYsx = new ArrayList<>();
    private zzZJU zzYsy;
    private zzZH5 zzYsz;
    private zzZAO zzYt4;
    private com.aspose.words.internal.zzDB zzYzW;
    private zzYDZ zzZFZ;

    public zzZJC(Document document, zzZAO zzzao, zzZH5 zzzh5, zzZJU zzzju, zzYDZ zzydz) {
        this.zzYt4 = zzzao;
        this.zzYsz = zzzh5;
        this.zzYsy = zzzju;
        this.zzZFZ = zzydz;
        NodeCollection childNodes = document.getChildNodes(19, true);
        int count = childNodes.getCount();
        if (count > 0) {
            this.zzYzW = new com.aspose.words.internal.zzDB(count);
            Iterator<T> it = childNodes.iterator();
            while (it.hasNext()) {
                this.zzYzW.add(((Comment) it.next()).getId());
            }
        }
    }

    private String zzP(Comment comment) {
        return com.aspose.words.internal.zzZKN.format("[{0}{1}]", comment.getInitial(), zzYTW.zzM(zzzQ(comment.getId()), 0, true));
    }

    private int zzzQ(int i) {
        return this.zzYzW.indexOf(i) + 1;
    }

    private String zzzR(int i) {
        return com.aspose.words.internal.zzZKN.zzO("#_cmntref", Integer.toString(zzzQ(i)));
    }

    private String zzzS(int i) {
        return com.aspose.words.internal.zzZKN.zzO("_cmnt", Integer.toString(zzzQ(i)));
    }

    private String zzzT(int i) {
        return com.aspose.words.internal.zzZKN.zzO("#_cmnt", Integer.toString(zzzQ(i)));
    }

    private String zzzU(int i) {
        return com.aspose.words.internal.zzZKN.zzO("_cmntref", Integer.toString(zzzQ(i)));
    }

    public final int zzQ(Comment comment) {
        if (this.zzZFZ.zzL(comment)) {
            return 0;
        }
        this.zzYsy.zzZO(zzzU(comment.getId()), 19);
        return 0;
    }

    public final int zzR(Comment comment) throws Exception {
        if (this.zzYsw) {
            return 0;
        }
        this.zzYsy.zzZ40();
        if (!this.zzZFZ.zzL(comment)) {
            this.zzYsy.zzZP(zzzU(comment.getId()), 19);
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYsx, comment);
        zzZ(zzP(comment), zzzT(comment.getId()), comment.getFont());
        return 1;
    }

    public final void zzVu(boolean z) throws Exception {
        this.zzYsw = true;
        if (this.zzYsx.size() != 0) {
            this.zzYt4.zzZ3E().zzZN(TranslateLanguage.CROATIAN, 1);
            zzLU zzlu = new zzLU();
            zzlu.zzU("width", 33.0d);
            zzlu.zzZ("height", 1.0d, 6);
            zzlu.zzZs("text-align", "left");
            this.zzYt4.zzZ3C().zzV(zzlu);
            this.zzYt4.zzZ3E().endElement(TranslateLanguage.CROATIAN);
            for (Comment comment : this.zzYsx) {
                this.zzYt4.zzZ3E().zzZN("div", 0);
                this.zzYt4.zzZ3E().zzX("id", zzzS(comment.getId()));
                if (z) {
                    zzLU zzlu2 = new zzLU();
                    if (com.aspose.words.internal.zzZYD.zzXk(comment.getAuthor())) {
                        zzlu2.setString("-aw-comment-author", comment.getAuthor());
                    }
                    if (!com.aspose.words.internal.zzZQ9.zzZ(comment.zzZZU(), com.aspose.words.internal.zzZQ9.zz35)) {
                        zzlu2.setString("-aw-comment-datetime", com.aspose.words.internal.zzJB.zzQ(comment.zzZZU()));
                    }
                    if (com.aspose.words.internal.zzZYD.zzXk(comment.getInitial())) {
                        zzlu2.setString("-aw-comment-initial", comment.getInitial());
                    }
                    if (comment.getParentId() != -1) {
                        zzlu2.zzZs("-aw-comment-parent-id", zzzS(comment.getParentId()));
                    }
                    if (comment.getDone()) {
                        zzlu2.zzZs("-aw-comment-done", "yes");
                    }
                    if (zzlu2.getCount() != 0) {
                        this.zzYt4.zzZ3C().zzV(zzlu2);
                    }
                }
                this.zzYsv = comment;
                this.zzYt4.zzZa(comment);
                this.zzYt4.zzZ3E().endElement("div");
            }
            this.zzYsx.clear();
        }
        this.zzYsw = false;
    }

    public final int zzZ(CommentRangeStart commentRangeStart) {
        this.zzYsy.zzZP(zzzU(commentRangeStart.getId()), 33);
        return 0;
    }

    public final void zzZ3N() throws Exception {
        Comment comment = this.zzYsv;
        if (comment != null) {
            zzZ(zzP(comment), zzzR(this.zzYsv.getId()), this.zzYsv.getFont());
            this.zzYsv = null;
        }
    }

    public final int zzZ(CommentRangeEnd commentRangeEnd) {
        this.zzYsy.zzZO(zzzU(commentRangeEnd.getId()), 34);
        return 0;
    }

    private void zzZ(String str, String str2, Font font) throws Exception {
        this.zzYsz.zzP(str2, true, false);
        this.zzYt4.zzZ3E().zzZN("span", 0);
        zzLU zzlu = new zzLU();
        zzlu.zzY("color", zzZKF.zzYtz);
        this.zzYt4.zzZ3C().zzZ(font, 3, 0, zzlu, this.zzYt4.zzZ3b());
        this.zzYt4.zzZ3E().writeString(str);
        this.zzYt4.zzZ3E().endElement("span");
        this.zzYsz.zzZlN();
    }
}
