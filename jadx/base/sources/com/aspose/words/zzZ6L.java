package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ6L {
    protected long zzYV = 0;
    protected zzY9X zzYfj;

    public static boolean zz8(ShapeBase shapeBase) throws Exception {
        return shapeBase.getNodeType() == 18 && ((Shape) shapeBase).hasImage();
    }

    private boolean zzYS2() {
        ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(getNode(), ShapeBase.class);
        return (shapeBase == null || !shapeBase.isInline() || zzYVU.zzXG(getNode()) == 0.0f) ? false : true;
    }

    public static zzZ6L zzYT(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType == 17 || nodeType == 18) {
            ShapeBase shapeBase = (ShapeBase) node;
            return shapeBase.getMarkupLanguage() == 1 ? new zzZ6I(shapeBase) : new zzZ6K(shapeBase);
        }
        if (nodeType == 35) {
            return new zzZ6J((OfficeMath) node);
        }
        throw new IllegalStateException("Unexpected node type.");
    }

    public abstract String getHRef();

    public abstract double getHeight() throws Exception;

    public abstract boolean getHidden();

    public abstract Node getNode();

    public abstract String getScreenTip();

    public long getSize() throws Exception {
        return zzZ68.zzU(this.zzYfj).zz7s().getSize();
    }

    public abstract double getWidth() throws Exception;

    public abstract int getWrapType();

    public abstract boolean hasChart();

    public abstract boolean hasChildNodes();

    public abstract boolean hasImage() throws Exception;

    public abstract boolean hasSmartArt();

    public abstract boolean isImage();

    public abstract boolean isInline() throws Exception;

    public abstract boolean isWordArt();

    public abstract void zzV(zzY9X zzy9x);

    public boolean zzYS3() {
        return false;
    }

    public final void zzYS4() throws Exception {
        zzY9X zzy9x = this.zzYfj;
        if (zzy9x != null && zzy9x.zzY6W()) {
            this.zzYV = getSize();
            if (zzYS2()) {
                this.zzYV = com.aspose.words.internal.zzZPW.zzG(com.aspose.words.internal.zzZPW.zzYz(this.zzYV), Float.intBitsToFloat((int) this.zzYV));
            }
        }
        this.zzYfj = null;
    }

    public boolean zzYS5() {
        return false;
    }

    public boolean zzYS6() {
        return false;
    }

    public abstract boolean zzYS7();

    public boolean zzYS8() {
        return false;
    }

    public abstract String zzZe();

    public boolean zzZid() {
        return false;
    }
}
