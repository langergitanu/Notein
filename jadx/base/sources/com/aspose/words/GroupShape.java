package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class GroupShape extends ShapeBase {
    public GroupShape(DocumentBase documentBase) {
        this(documentBase, (byte) 1);
    }

    private static boolean zzZc(Node node) {
        int nodeType = node.getNodeType();
        return nodeType == 17 || nodeType == 18;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitGroupShapeEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitGroupShapeStart(this);
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 17;
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(node, ShapeBase.class);
        if (shapeBase == null) {
            return false;
        }
        if (getMarkupLanguage() != shapeBase.getMarkupLanguage()) {
            throw new IllegalArgumentException("Cannot insert a Shape into a GroupShape with a different markup language");
        }
        if (getMarkupLanguage() == 1) {
            return zzZc(node);
        }
        int iZzZHY = zzY9i().zzZHY();
        int iZzZHY2 = shapeBase.zzY9i().zzZHY();
        return (iZzZHY == 12 || iZzZHY2 == 12) ? iZzZHY2 == 12 ? iZzZHY == 9 || iZzZHY == 3 || iZzZHY == 5 || iZzZHY == 6 || iZzZHY == 13 : iZzZHY2 == 6 || iZzZHY2 == 13 || iZzZHY2 == 7 : zzZc(node);
    }

    @Override // com.aspose.words.ShapeBase
    public final boolean zzZ55() {
        return isInline() && getMarkupLanguage() != 1;
    }

    public final void zzZ56() {
        setShapeAttr(1280, 0);
    }

    public final int zzZ57() {
        return ((Integer) fetchShapeAttr(1280)).intValue();
    }

    public GroupShape(DocumentBase documentBase, byte b) {
        super(documentBase, b);
        setShapeType(-1);
    }
}
