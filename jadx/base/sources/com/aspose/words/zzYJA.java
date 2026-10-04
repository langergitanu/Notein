package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJA {
    private zzYJ7 zzYfE;
    private Document zzZEY;
    private HashMap<Node, ArrayList<Node>> zzXBs = new HashMap<>();
    private HashMap<Comment, RevisionGroup> zzXBr = new HashMap<>();

    public zzYJA(Document document, zzYJ7 zzyj7) {
        this.zzZEY = document;
        this.zzYfE = zzyj7;
        zzYlq();
    }

    private static void zzS(WordAttrCollection wordAttrCollection) {
        wordAttrCollection.remove(12);
        wordAttrCollection.remove(10010);
        wordAttrCollection.remove(14);
        wordAttrCollection.remove(15);
        wordAttrCollection.remove(13);
    }

    private static Node zzT(RevisionGroup revisionGroup) {
        Run runZzRD;
        Node nodeZzYlp = revisionGroup.zzYlp();
        int nodeType = nodeZzYlp.getNodeType();
        return nodeType != 1 ? nodeType != 2 ? (nodeType == 8 && revisionGroup.zzYli() && (runZzRD = ((Paragraph) nodeZzYlp).zzRD(false)) != null) ? runZzRD : nodeZzYlp : ((Section) nodeZzYlp).getBody().getFirstChild() : ((Document) nodeZzYlp).getFirstSection().getBody().getFirstChild();
    }

    private Comment zzU(RevisionGroup revisionGroup) {
        if (!zzV(revisionGroup)) {
            return null;
        }
        Comment comment = new Comment(this.zzZEY);
        if (revisionGroup.zzYlm() != null) {
            zzZ(revisionGroup, comment);
            return comment;
        }
        if (revisionGroup.zzYll() == null) {
            revisionGroup.zzYsN();
            comment.appendChild(new Paragraph(this.zzZEY));
            comment.getFirstParagraph().appendChild(new Run(this.zzZEY, revisionGroup.getText()));
            return comment;
        }
        if (revisionGroup.zzYll().getType() != 1) {
            zzZ(revisionGroup, comment);
            return comment;
        }
        comment.appendChild(new Paragraph(this.zzZEY));
        return comment;
    }

    private boolean zzV(RevisionGroup revisionGroup) {
        int showInBalloons = this.zzYfE.getShowInBalloons();
        if (showInBalloons == 1) {
            return revisionGroup.zzYsN() != null;
        }
        if (showInBalloons != 2) {
            return false;
        }
        return (revisionGroup.zzYsN() == null && revisionGroup.zzYll() == null && (revisionGroup.zzYlm() == null || revisionGroup.zzYlm().getType() != 1)) ? false : true;
    }

    private void zzYlq() {
        for (int i = 0; i < this.zzZEY.getRevisions().getGroups().getCount(); i++) {
            RevisionGroup revisionGroup = this.zzZEY.getRevisions().getGroups().get(i);
            Comment commentZzU = zzU(revisionGroup);
            if (commentZzU != null) {
                this.zzXBr.put(commentZzU, revisionGroup);
                Node nodeZzT = zzT(revisionGroup);
                if (this.zzXBs.containsKey(nodeZzT)) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Comment>) this.zzXBs.get(nodeZzT), commentZzU);
                } else {
                    ArrayList<Node> arrayList = new ArrayList<>();
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Comment>) arrayList, commentZzU);
                    this.zzXBs.put(nodeZzT, arrayList);
                }
            }
        }
    }

    public final RevisionGroup zzN(Comment comment) {
        comment.getNodeType();
        return (RevisionGroup) com.aspose.words.internal.zzQW.zzZ(this.zzXBr, comment);
    }

    public final ArrayList<Node> zzW(zzZYT zzzyt) {
        if (zzzyt == null || zzzyt.zzZot()) {
            return null;
        }
        return (ArrayList) com.aspose.words.internal.zzQW.zzZ(this.zzXBs, zzzyt.getNode());
    }

    public final void zzZ(zzYAS zzyas, int i, Paragraph paragraph) {
        if (i != 4) {
            return;
        }
        if (paragraph.zzYB4() != null) {
            zzyas.zzQz(true);
            return;
        }
        RevisionGroup revisionGroup = (RevisionGroup) com.aspose.words.internal.zzQW.zzZ(this.zzXBr, (Comment) paragraph.getAncestor(19));
        if (revisionGroup == null || revisionGroup.zzYsN() != null) {
            zzyas.zzQz(false);
        } else {
            ArrayList<Node> arrayListZzYlo = revisionGroup.zzYlo();
            zzyas.zzQz(arrayListZzYlo.size() > 0 && ((Node) C21505OooO0Oo.OooO00o(1, arrayListZzYlo)).getNodeType() == 8);
        }
    }

    public final void zzW(zzYAQ zzyaq, Comment comment) {
        RevisionGroup revisionGroupZzN = zzN(comment);
        if (revisionGroupZzN == null) {
            return;
        }
        zzyaq.zzQy(true);
        zzZ(revisionGroupZzN, zzyaq);
    }

    private void zzZ(RevisionGroup revisionGroup, Comment comment) {
        Paragraph lastParagraph = comment.getLastParagraph();
        Paragraph paragraph = new Paragraph(this.zzZEY);
        for (Node run : revisionGroup.zzYlo()) {
            if (run.zzYAY() == 6) {
                if (lastParagraph == null) {
                    lastParagraph = paragraph;
                }
                if (run.getNodeType() == 18 && !((Shape) run).isInline()) {
                    run = new Run(run.getDocument(), zzUF.zzZZo());
                }
                Cloneable cloneableDeepClone = run.deepClone(true);
                zzS(((zzZAM) cloneableDeepClone).getRunPr_IInline());
                lastParagraph.appendChild(cloneableDeepClone);
            } else if (run.getNodeType() == 8) {
                Paragraph paragraph2 = (Paragraph) ((Paragraph) run).deepClone(false);
                zzS(paragraph2.zzYp5());
                comment.appendChild(paragraph2);
                while (paragraph.hasChildNodes()) {
                    paragraph2.appendChild(paragraph.getFirstChild());
                }
                lastParagraph = null;
            } else {
                run.getNodeType();
            }
        }
        if (paragraph.hasChildNodes()) {
            comment.appendChild(new Paragraph(this.zzZEY));
            while (paragraph.hasChildNodes()) {
                comment.getLastParagraph().appendChild(paragraph.getFirstChild());
            }
        }
    }

    private static void zzZ(RevisionGroup revisionGroup, zzYAQ zzyaq) {
        if (revisionGroup.zzYsN() == null) {
            return;
        }
        int nodeType = revisionGroup.zzYlp().getNodeType();
        boolean z = true;
        if (nodeType != 1 && nodeType != 2) {
            if (nodeType != 8) {
                return;
            }
            if (revisionGroup.zzYli()) {
                z = false;
            }
        }
        zzyaq.zzQx(z);
    }
}
