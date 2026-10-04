package com.aspose.words;

import com.aspose.words.Node;

/* JADX INFO: loaded from: classes6.dex */
public abstract class DocumentBase<T extends Node> extends CompositeNode<T> {
    private int zzYSc;
    private Document zzYSd;
    private IResourceLoadingCallback zzYSe;
    private Shape zzYSf;
    private boolean zzYSo;
    private zzYD3 zzYSp;
    private zzY41 zzYSq;
    private int zzYSr;
    private int zzYSu;
    zzZ7M zzYSx;
    private IWarningCallback zzZG0;
    private Node zzYSw = new zzYTY(this);
    private int zzYSt = 100000;
    private int zzYSs = 32768;
    private FontInfoCollection zzYSn = new FontInfoCollection();
    private StyleCollection zzYSm = new StyleCollection(this);
    private ListCollection zzYSl = new ListCollection(this);
    private zzZK0 zzYSk = new zzZK0();
    private zzYLU zzYSj = new zzYLU();
    private zzZZF zzYSi = new zzZZF();
    private VariableCollection zzYSh = new VariableCollection();
    private zzZMR zzYSg = new zzZMR();
    private zzYWL zzYSv = new zzYWL();

    public static int zzFV(int i) {
        return ((i / 1024) + (i % 1024 > 0 ? 1 : 0)) * 1024;
    }

    private void zzT(DocumentBase documentBase) {
        NodeCollection childNodes = getChildNodes(28, true);
        if (childNodes.getCount() != 0) {
            NodeCollection childNodes2 = documentBase.getChildNodes(28, true);
            childNodes.getCount();
            childNodes2.getCount();
            for (int i = 0; i < childNodes2.getCount(); i++) {
                ((StructuredDocumentTag) childNodes2.get(i)).setId(((StructuredDocumentTag) childNodes.get(i)).getId());
            }
        }
    }

    public static boolean zzXV(int i, int i2) {
        return i / 1024 == i2 / 1024;
    }

    private Document zzZpT() throws Exception {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(deepClone(false), Document.class);
        if (document == null) {
            document = new Document(1);
        }
        document.ensureMinimum();
        document.zzZqg().zzYTf();
        document.zzZqy().zzU(zzZqy().zzZpj());
        return document;
    }

    public Shape getBackgroundShape() {
        return this.zzYSf;
    }

    @Override // com.aspose.words.Node
    public DocumentBase getDocument() {
        return this;
    }

    public FontInfoCollection getFontInfos() {
        return this.zzYSn;
    }

    public ListCollection getLists() {
        return this.zzYSl;
    }

    public INodeChangingCallback getNodeChangingCallback() {
        return this.zzYSv.zzYAS();
    }

    public int getPageColor() {
        return getBackgroundShape() != null ? getBackgroundShape().getFillColor() : com.aspose.words.internal.zzZQ1.zz2p;
    }

    public IResourceLoadingCallback getResourceLoadingCallback() {
        return this.zzYSe;
    }

    public StyleCollection getStyles() {
        return this.zzYSm;
    }

    public VariableCollection getVariables() {
        return this.zzYSh;
    }

    public IWarningCallback getWarningCallback() {
        return this.zzZG0;
    }

    public Node importNode(Node node, boolean z) {
        return zzZ(node, z, 0, (zzZA5) null);
    }

    public void resetState() {
        this.zzYSm = new StyleCollection(this);
        removeAllChildren();
    }

    public void setBackgroundShape(Shape shape) {
        if (shape != null) {
            if (shape.getDocument() != this) {
                throw new IllegalArgumentException("The shape was created from a different document.");
            }
            if (shape.getParentNode() != null) {
                throw new IllegalArgumentException("The shape is a child of another node.");
            }
            if (shape.getShapeType() != 1) {
                throw new IllegalArgumentException("Only a rectangle shape can be set as a document background.");
            }
        }
        this.zzYSf = shape;
        this.zzYSi.zzYVf.setDisplayBackgroundShape(shape != null);
    }

    public void setNodeChangingCallback(INodeChangingCallback iNodeChangingCallback) {
        this.zzYSv.zzV(iNodeChangingCallback);
    }

    public void setPageColor(int i) {
        if (com.aspose.words.internal.zzZQ1.zzRk(i)) {
            setBackgroundShape(null);
            return;
        }
        setBackgroundShape(new Shape(this, 1));
        getBackgroundShape().setFillColor(i);
        getBackgroundShape().getStroke().setOn(false);
    }

    public void setResourceLoadingCallback(IResourceLoadingCallback iResourceLoadingCallback) {
        this.zzYSe = iResourceLoadingCallback;
    }

    public void setWarningCallback(IWarningCallback iWarningCallback) {
        this.zzZG0 = iWarningCallback;
    }

    public final void zzFW(int i) {
        this.zzYSt = i;
    }

    public final void zzG(int i, String str) {
        if (getWarningCallback() != null) {
            OooO00o.OooO0O0(getWarningCallback(), 1, i, str);
        }
    }

    public abstract void zzG0(int i);

    public abstract void zzG1(int i);

    public final void zzO(Shape shape) {
        this.zzYSf = shape;
    }

    public final void zzWz(boolean z) {
        this.zzYSo = z;
    }

    public final int zzXW(int i, int i2) {
        if (zzXV(i, i2 + i)) {
            return i;
        }
        this.zzYSt = zzFV(i);
        return zzZq0();
    }

    public final void zzY(NodeChangingArgs nodeChangingArgs) {
        try {
            if (this.zzYSv.isEmpty()) {
                return;
            }
            int action = nodeChangingArgs.getAction();
            if (action == 0) {
                this.zzYSv.nodeInserted(nodeChangingArgs);
            } else {
                if (action != 1) {
                    throw new IllegalStateException("Unknown node changed action.");
                }
                this.zzYSv.nodeRemoved(nodeChangingArgs);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public Node zzZ(boolean z, zzZA5 zzza5) {
        DocumentBase documentBase = (DocumentBase) super.zzZ(z, zzza5);
        documentBase.zzYSw = new zzYTY(documentBase);
        documentBase.zzYSv = new zzYWL();
        documentBase.zzYSq = null;
        documentBase.zzYSp = null;
        documentBase.zzYSn = this.zzYSn.zzZ71();
        documentBase.zzYSm = this.zzYSm.zzo(documentBase);
        documentBase.zzYSl = this.zzYSl.zzY(documentBase, zzza5);
        documentBase.zzYSi = this.zzYSi.zzZrP();
        documentBase.zzYSh = this.zzYSh.zzXU7();
        documentBase.zzYSg = this.zzYSg.zzZ(documentBase, zzza5);
        documentBase.zzYSk = this.zzYSk.zzZ4g();
        documentBase.zzYSj = this.zzYSj.zzYnv();
        Shape shape = this.zzYSf;
        if (shape != null) {
            documentBase.zzYSf = (Shape) documentBase.zzZ(shape, zzza5);
        }
        if (z) {
            zzT(documentBase);
        }
        if (this.zzYSx != null) {
            documentBase.zzYSx = null;
        }
        return documentBase;
    }

    public final zzY41 zzZpQ() {
        if (this.zzYSq == null) {
            this.zzYSq = new zzY41();
        }
        return this.zzYSq;
    }

    public final zzYD3 zzZpR() {
        if (this.zzYSp == null) {
            this.zzYSp = new zzYD3(this);
        }
        return this.zzYSp;
    }

    public final Document zzZpS() throws Exception {
        if (this.zzYSd == null) {
            this.zzYSd = zzZpT();
        }
        this.zzYSd.removeAllChildren();
        this.zzYSd.ensureMinimum();
        this.zzYSd.zzZqk();
        return this.zzYSd;
    }

    public final zzZMR zzZpU() {
        return this.zzYSg;
    }

    public final zzZZF zzZpV() {
        return this.zzYSi;
    }

    public final int zzZpW() {
        int i = this.zzYSr;
        this.zzYSr = i + 1;
        return i;
    }

    public final void zzZpX() {
        this.zzYSr = 0;
    }

    public final int zzZpY() {
        int i = this.zzYSs;
        this.zzYSs = i + 1;
        return i;
    }

    public final int zzZpZ() {
        return zzZq0();
    }

    public final int zzZq0() {
        int i = this.zzYSt + 1;
        this.zzYSt = i;
        return i;
    }

    public final zzYLU zzZq1() {
        return this.zzYSj;
    }

    public final zzZK0 zzZq2() {
        return this.zzYSk;
    }

    public final Node zzZq3() {
        return this.zzYSw;
    }

    public final int zzZq4() {
        return this.zzYSu;
    }

    public final boolean zzZq5() {
        return this.zzYSc > 0;
    }

    public final void zzZq6() {
        this.zzYSc--;
    }

    public final void zzZq7() {
        this.zzYSc++;
    }

    public final void zzZq8() {
        this.zzYSu++;
    }

    public abstract Theme zzZqI();

    public abstract boolean zzZqo();

    public abstract boolean zzZqp();

    public abstract zzZYQ zzZqx();

    public abstract zzZYZ zzZqy();

    public Node importNode(Node node, boolean z, int i) {
        return zzZ(node, z, i, (zzZA5) null);
    }

    public final boolean zzY(INodeChangingCallback iNodeChangingCallback) {
        return this.zzYSv.zzW(iNodeChangingCallback);
    }

    private Node zzZ(Node node, zzZA5 zzza5) {
        return zzZ(node, true, 0, zzza5);
    }

    private Node zzZ(Node node, boolean z, int i, zzZA5 zzza5) {
        return new NodeImporter(node.getDocument(), this, i).zzZ(node, z, zzza5);
    }

    public final NodeChangingArgs zzZ(Node node, Node node2, Node node3, int i) {
        this.zzYSu++;
        if (this.zzYSv.isEmpty()) {
            return null;
        }
        return new NodeChangingArgs(node, node2, node3, i);
    }

    public final void zzZ(NodeChangingArgs nodeChangingArgs) {
        try {
            if (this.zzYSv.isEmpty()) {
                return;
            }
            int action = nodeChangingArgs.getAction();
            if (action == 0) {
                this.zzYSv.nodeInserting(nodeChangingArgs);
            } else {
                if (action == 1) {
                    this.zzYSv.nodeRemoving(nodeChangingArgs);
                    return;
                }
                throw new IllegalStateException("Unknown node changed action.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final void zzZ(INodeChangingCallback iNodeChangingCallback) {
        this.zzYSv.zzX(iNodeChangingCallback);
    }
}
