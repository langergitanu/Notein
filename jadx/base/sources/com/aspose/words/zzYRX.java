package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRX {
    private zzYTN zzXQW;
    private zzYPM zzXRS;
    private zzYOR zzXRT;
    private com.aspose.words.internal.zzZQC<Run> zzXPG = new com.aspose.words.internal.zzZQC<>();
    private boolean zzXPF = false;

    public zzYRX(zzYOR zzyor, zzYPM zzypm, zzYTN zzytn) {
        this.zzXRT = zzyor;
        this.zzXRS = zzypm;
        this.zzXQW = zzytn;
    }

    private void zzJ(Footnote footnote) {
        Paragraph firstParagraph = footnote.getFirstParagraph();
        if (this.zzXPF) {
            firstParagraph.zzYVe().remove();
            this.zzXPF = false;
        }
        while (this.zzXPG.size() > 0) {
            firstParagraph.insertBefore(this.zzXPG.pop(), firstParagraph.getFirstChild());
        }
    }

    private void zzK(Footnote footnote) {
        int length = footnote.getReferenceMark().length();
        Node nodeZzYVe = footnote.getFirstParagraph().zzYVe();
        while (nodeZzYVe.zz0R() <= length) {
            Node nextSibling = nodeZzYVe.getNextSibling();
            this.zzXPG.push((Run) nodeZzYVe);
            nodeZzYVe.remove();
            length -= nodeZzYVe.zz0R();
            if (length <= 0 || nextSibling == null || nextSibling.getNodeType() != 21) {
                return;
            } else {
                nodeZzYVe = nextSibling;
            }
        }
        this.zzXPF = true;
        this.zzXPG.push((Run) nodeZzYVe.deepClone(false));
        ((Run) nodeZzYVe).zzG(length, nodeZzYVe.zz0R() - length, false);
    }

    private boolean zzL(Footnote footnote) {
        return (!footnote.getParentParagraph().zzZ7D() && this.zzXRT.zzYsF()) || this.zzXRT.zzYsC() == 5 || this.zzXRT.zzYsC() == 6;
    }

    private void zzM(Footnote footnote) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("text:note-citation");
        if (!footnote.isAuto()) {
            zzytgZzYsG.zz0("text:label", footnote.getReferenceMark());
            zzytgZzYsG.writeString(footnote.getReferenceMark());
        }
        zzytgZzYsG.zzo();
    }

    private void zzN(Footnote footnote) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        String str = footnote.getFootnoteType() == 1 ? "endnote" : "footnote";
        zzytgZzYsG.zzGB("text:span");
        zzytgZzYsG.zzYt("text:style-name", this.zzXRS.zzYtV());
        zzytgZzYsG.zzY("text:note");
        zzytgZzYsG.zz0("text:note-class", str);
        zzM(footnote);
        zzytgZzYsG.zzY("text:note-body");
    }

    private void zzO(Footnote footnote) {
        if (!footnote.isAuto()) {
            zzK(footnote);
        }
        if (footnote.getParentParagraph().zzZYj().zzVE(1330)) {
            return;
        }
        this.zzXQW.zzO(footnote);
    }

    public final int visitFootnoteEnd(Footnote footnote) {
        if (!zzL(footnote) && !this.zzXRT.zzYsE()) {
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            zzytgZzYsG.zzo();
            zzytgZzYsG.zzo();
            zzytgZzYsG.zzGA("text:span");
            zzJ(footnote);
        }
        return 0;
    }

    public final int visitFootnoteStart(Footnote footnote) {
        if (footnote.getFootnoteType() == 1) {
            this.zzXRT.zzYsg();
        }
        if (footnote.getFootnoteType() == 0) {
            this.zzXRT.zzYse();
        }
        if (zzL(footnote)) {
            return 0;
        }
        if (this.zzXRT.zzYsE()) {
            zzO(footnote);
        } else {
            zzN(footnote);
        }
        return 0;
    }
}
