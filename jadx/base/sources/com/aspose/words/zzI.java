package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzI {
    private zzYDZ zzZFZ;
    private IWarningCallback zzZG0;
    private DocumentBase zzZG3;
    private com.aspose.words.internal.zzD3<zzUG> zzZG2 = new com.aspose.words.internal.zzD3<>();
    private ArrayList<zzZV1> zzZG1 = new ArrayList<>();

    public zzI(DocumentBase documentBase, zzYDZ zzydz, IWarningCallback iWarningCallback) {
        this.zzZG3 = documentBase;
        this.zzZFZ = zzydz;
        documentBase.zzZpX();
        this.zzZG0 = iWarningCallback;
    }

    private zzZV1 zzPn(int i) {
        zzZV1 next;
        Iterator<zzZV1> it = this.zzZG1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.zzZZy() && next.zzYLM.getId() == i && !next.zzZZx()) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        zzZV1 zzzv1 = new zzZV1();
        zzzv1.zzZuO = this.zzZG3.zzZpW();
        com.aspose.words.internal.zzZQG.zzZ(this.zzZG1, zzzv1);
        return zzzv1;
    }

    private zzUG zzPo(int i) {
        zzUG zzug = this.zzZG2.get(i);
        if (zzug != null) {
            return zzug;
        }
        zzUG zzug2 = new zzUG();
        zzug2.zzZuO = this.zzZG3.zzZpW();
        this.zzZG2.set(i, zzug2);
        return zzug2;
    }

    private void zzTG(String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 16777216, 0, str);
        }
    }

    private void zzbN() {
        com.aspose.words.internal.zzD3<zzUG>.zzZ zzzZzCK = this.zzZG2.zzCK();
        while (zzzZzCK.moveNext()) {
            zzUG zzugZzCI = zzzZzCK.zzCI();
            Comment comment = zzugZzCI.zzZuR;
            if (comment != null) {
                int i = -1;
                if (comment.getParentId() != -1) {
                    zzUG zzug = this.zzZG2.get(zzugZzCI.zzZuR.getParentId());
                    if (zzug != null) {
                        i = zzug.zzZuO;
                    }
                }
                zzugZzCI.zzZuR.setParentId(i);
            }
        }
    }

    private void zzbO() {
        for (zzUG zzug : this.zzZG2.zzCJ()) {
            if (zzug.zzZZy() && !zzug.zzZZx()) {
                zzTG("CommentStart without corresponding CommentEnd was removed.");
                zzug.zzZZz();
            }
            if (!zzug.zzZZy() && zzug.zzZZx()) {
                zzTG("CommentEnd without corresponding CommentStart was removed.");
                zzug.zzZZz();
            }
            if (zzug.zzZuR == null && zzug.zzZZy() && zzug.zzZZx()) {
                zzTG("CommentRange without corresponding Comment was removed.");
                zzug.zzZZz();
            }
            if (zzug.zzZZv()) {
                zzTG("Empty comment range was removed.");
                zzug.zzZZz();
            } else if (zzug.zzZuR != null && zzug.zzZZy() && Node.zzD(zzug.zzZuR, zzug.zzZuQ)) {
                zzTG("Comment range was removed because located below its Comment node.");
                zzug.zzZZz();
            }
            if (zzug.zzZuR != null && this.zzZFZ != null && zzug.zzZZy() && zzug.zzZZx()) {
                this.zzZFZ.zzK(zzug.zzZuR);
            }
            zzug.zzZZA();
        }
    }

    private void zzbP() {
        for (zzZV1 zzzv1 : this.zzZG1) {
            if (zzzv1.zzZZy() && !zzzv1.zzZZx()) {
                zzTG("EditableRangeStart without corresponding EditableRangeEnd was removed.");
                zzzv1.zzZjN();
            }
            if (!zzzv1.zzZZy() && zzzv1.zzZZx()) {
                zzTG("EditableRangeEnd without corresponding EditableRangeStart was removed.");
                zzzv1.zzZjN();
            }
            zzzv1.zzZZA();
        }
    }

    public final int visitCommentRangeEnd(CommentRangeEnd commentRangeEnd) {
        zzUG zzugZzPo = zzPo(commentRangeEnd.getId());
        if (zzugZzPo.zzZZx() || !zzugZzPo.zzZZy()) {
            commentRangeEnd.remove();
            return 1;
        }
        zzugZzPo.zzZuP = commentRangeEnd;
        return 0;
    }

    public final int visitCommentRangeStart(CommentRangeStart commentRangeStart) {
        zzUG zzugZzPo = zzPo(commentRangeStart.getId());
        if (zzugZzPo.zzZZy()) {
            commentRangeStart.remove();
            return 1;
        }
        zzugZzPo.zzZuQ = commentRangeStart;
        return 0;
    }

    public final int visitEditableRangeEnd(EditableRangeEnd editableRangeEnd) {
        zzZV1 zzzv1ZzPn = zzPn(editableRangeEnd.getId());
        if (zzzv1ZzPn.zzZZx() || !zzzv1ZzPn.zzZZy()) {
            editableRangeEnd.remove();
            return 1;
        }
        zzzv1ZzPn.zzYLL = editableRangeEnd;
        return 0;
    }

    public final int visitEditableRangeStart(EditableRangeStart editableRangeStart) {
        zzZV1 zzzv1ZzPn = zzPn(editableRangeStart.getId());
        if (zzzv1ZzPn.zzZZy()) {
            editableRangeStart.remove();
            return 1;
        }
        zzzv1ZzPn.zzYLM = editableRangeStart;
        return 0;
    }

    public final int zzZ(Comment comment) {
        comment.ensureMinimum();
        zzUG zzugZzPo = zzPo(comment.getId());
        if (zzugZzPo.zzZuR != null) {
            comment.setIdInternal(this.zzZG3.zzZpW());
            return 0;
        }
        zzugZzPo.zzZuR = comment;
        return 0;
    }

    public final void zzbQ() {
        zzbO();
        zzbN();
        zzbP();
    }
}
