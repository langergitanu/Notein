package com.aspose.words;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class Revision {
    private int zzL4;
    private RevisionCollection zzXBL;
    private Style zzXBM;
    private zzYJC zzXBN;
    private Node zzXVV;
    private boolean zzYPp;

    public Revision(int i, zzYJC zzyjc, Node node, RevisionCollection revisionCollection) {
        this(i, zzyjc, revisionCollection);
        this.zzXVV = node;
        this.zzYPp = node instanceof zzZAM;
    }

    private DocumentBase getDocument() {
        Node node = this.zzXVV;
        return node != null ? node.getDocument() : this.zzXBM.getDocument();
    }

    private void zzw(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzXBN.zz4(zzzq9);
    }

    public void accept() throws Exception {
        zzZ(true, new zzYJ9(true, getRevisionType()));
    }

    public String getAuthor() {
        return this.zzXBN.getAuthor();
    }

    public Date getDateTime() {
        return com.aspose.words.internal.zzZQ9.zzJ(this.zzXBN.zzZx());
    }

    public RevisionGroup getGroup() {
        if (this.zzL4 == 3) {
            return null;
        }
        return this.zzXBL.getGroups().zzY(this.zzXBN);
    }

    public Node getParentNode() {
        Node node = this.zzXVV;
        if (node != null) {
            return node;
        }
        throw new IllegalStateException("Can not access ParentNode for a style revision. Use ParentStyle instead.");
    }

    public Style getParentStyle() {
        Style style = this.zzXBM;
        if (style != null) {
            return style;
        }
        throw new IllegalStateException("Can not access ParentStyle for a node revision. Use ParentNode instead.");
    }

    public int getRevisionType() {
        return this.zzL4;
    }

    public final boolean isInline() {
        return this.zzL4 != 3 && this.zzYPp;
    }

    public void reject() throws Exception {
        zzZ(true, new zzYJ9(false, getRevisionType()));
    }

    public void setAuthor(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            throw new IllegalArgumentException(str);
        }
        this.zzXBN.setAuthor(str);
    }

    public void setDateTime(Date date) {
        zzw(com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public final com.aspose.words.internal.zzZQ9 zzYly() {
        return this.zzXBN.zzZx();
    }

    public final void zzZ(boolean z, zzYJ9 zzyj9) throws Exception {
        int iZzZq4 = getDocument().zzZq4();
        Node node = this.zzXVV;
        if (node != null) {
            zzYJ3.zzZ(node, zzyj9);
        } else if (zzyj9.zzYl5()) {
            this.zzXBM.zzZYh().zzYpN();
            this.zzXBM.zzZYj().zzYpN();
        } else {
            this.zzXBM.zzZYh().remove(10010);
            this.zzXBM.zzZYj().remove(10010);
        }
        if (getDocument().zzZq4() == iZzZq4) {
            getDocument().zzZq8();
        }
        if (z) {
            this.zzXBL.zzV(this);
        }
    }

    public Revision(zzYJC zzyjc, Style style, RevisionCollection revisionCollection) {
        this(3, zzyjc, revisionCollection);
        this.zzXBM = style;
    }

    private Revision(int i, zzYJC zzyjc, RevisionCollection revisionCollection) {
        this.zzXBL = revisionCollection;
        this.zzL4 = i;
        this.zzXBN = zzyjc;
    }
}
