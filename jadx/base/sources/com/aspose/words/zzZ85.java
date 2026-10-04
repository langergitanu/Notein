package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ85 implements zzZA5 {
    private Body zzYGe;
    private boolean zzYiA;
    private Run zzYiB;
    private boolean zzYiC;
    private boolean zzYiD;
    private NodeCollection zzYiu;
    private Node zzYiv;
    private Node zzYiw;
    private com.aspose.words.internal.zzIM<Integer> zzYix;
    private com.aspose.words.internal.zzIM<Integer> zzYiy = new com.aspose.words.internal.zzIM<>();
    private boolean zzYiz;
    private DocumentBase zzYj0;

    private com.aspose.words.internal.zzIM<Integer> zzYVd() {
        List listByListId;
        if (this.zzYix == null) {
            this.zzYix = new com.aspose.words.internal.zzIM<>();
            Iterator<Style> it = this.zzYj0.getStyles().iterator();
            while (it.hasNext()) {
                Object obj = it.next().zzZYj().get(EditingLanguage.KASHMIRI_ARABIC);
                if (obj != null && (listByListId = this.zzYj0.getLists().getListByListId(((Integer) obj).intValue())) != null && !this.zzYix.contains(Integer.valueOf(listByListId.zzYP8()))) {
                    this.zzYix.add(Integer.valueOf(listByListId.zzYP8()));
                }
            }
        }
        return this.zzYix;
    }

    private void zzra() {
        this.zzYiz = false;
        this.zzYGe = null;
        this.zzYiw = null;
        this.zzYiv = null;
        this.zzYiu = null;
        this.zzYiy.clear();
    }

    @Override // com.aspose.words.zzZA5
    public final void zzW(Node node, Node node2) {
        Object obj;
        List listByListId;
        int nodeType = node2.getNodeType();
        if (nodeType == 2) {
            if (this.zzYj0 == null) {
                this.zzYj0 = ((Section) node).getDocument();
            }
            zzra();
            Section section = (Section) node;
            this.zzYiD = section.zzYVg();
            this.zzYiC = section.zzYVf();
            return;
        }
        if (nodeType == 3) {
            this.zzYGe = (Body) node2;
            this.zzYiz = true;
            return;
        }
        if (nodeType == 4) {
            this.zzYiz = false;
            return;
        }
        if (nodeType != 8) {
            if (nodeType == 21 && this.zzYiB == null && this.zzYiz) {
                this.zzYiB = (Run) node2;
                return;
            }
            return;
        }
        Paragraph paragraph = (Paragraph) node;
        if (!this.zzYiA && (obj = paragraph.zzZYj().get(EditingLanguage.KASHMIRI_ARABIC)) != null && (listByListId = this.zzYj0.getLists().getListByListId(((Integer) obj).intValue())) != null && zzYVd().contains(Integer.valueOf(listByListId.zzYP8()))) {
            this.zzYiA = true;
        }
        if (this.zzYiz) {
            Integer num = (Integer) ((Paragraph) node2).fetchParaAttr(EditingLanguage.KASHMIRI_ARABIC);
            if (num.intValue() != 0) {
                this.zzYiy.add(num);
            }
        }
    }

    public final boolean zzYVc() {
        return this.zzYiA;
    }

    public final Run zzYVe() {
        return this.zzYiB;
    }

    public final boolean zzYVf() {
        return this.zzYiC;
    }

    public final boolean zzYVg() {
        return this.zzYiD;
    }

    public final NodeCollection zzYVh() {
        Body body;
        if (this.zzYiu == null && (body = this.zzYGe) != null) {
            this.zzYiu = new NodeCollection((CompositeNode) body, 8, true);
        }
        return this.zzYiu;
    }

    public final boolean zzYVi() {
        return this.zzYiy.getCount() == 1;
    }

    public final boolean zzYVj() {
        return this.zzYiy.getCount() > 0;
    }

    public final boolean zzYVk() {
        return zzYVn() != null && zzYVn().getNodeType() == 28;
    }

    public final boolean zzYVl() {
        return zzYVo() != null && zzYVo().getNodeType() == 28;
    }

    public final boolean zzYVm() {
        return zzYVo() != null && zzYVo().getNodeType() == 5;
    }

    public final Node zzYVn() {
        Body body;
        if (this.zzYiv == null && (body = this.zzYGe) != null) {
            this.zzYiv = body.zzZYq();
        }
        return this.zzYiv;
    }

    public final Node zzYVo() {
        Body body;
        if (this.zzYiw == null && (body = this.zzYGe) != null) {
            this.zzYiw = body.zzZYr();
        }
        return this.zzYiw;
    }
}
