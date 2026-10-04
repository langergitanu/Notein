package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1E {
    private ArrayList<ShapeBase> zzY2E = new ArrayList<>();
    private zzZ1K zzY2S;
    private zzZ1G zzY2T;
    private zzZ1F zzYs4;

    public zzZ1E(zzZ1K zzz1k, zzZ1F zzz1f, zzZ1G zzz1g) {
        this.zzY2S = zzz1k;
        this.zzYs4 = zzz1f;
        this.zzY2T = zzz1g;
    }

    public static boolean zz0(ShapeBase shapeBase) {
        return (!shapeBase.isTopLevel() || shapeBase.zzY9h().getHidden() || shapeBase.getFont().getHidden()) ? false : true;
    }

    public static boolean zz2(ShapeBase shapeBase) {
        return shapeBase.getWrapType() == 3;
    }

    private static boolean zzN(Section section) {
        if (section.zzYB3()) {
            return false;
        }
        Section section2 = (Section) section.getNextSibling();
        return section2.getPageSetup().getSectionStart() == 2 || section2.getPageSetup().getSectionStart() == 3 || section2.getPageSetup().getSectionStart() == 4;
    }

    private void zzYHp() throws Exception {
        long jZzYHq = zzYHq();
        this.zzY2S.zzj(com.aspose.words.internal.zzZKQ.zzZa(Float.intBitsToFloat((int) jZzYHq)), com.aspose.words.internal.zzZKQ.zzZa(com.aspose.words.internal.zzZPW.zzYz(jZzYHq)));
        for (int i = 0; i < this.zzY2E.size(); i++) {
            this.zzYs4.zz4(this.zzY2E.get(i));
        }
        this.zzY2S.zzZ3G();
        this.zzY2E.clear();
    }

    private long zzYHq() throws Exception {
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (int i = 0; i < this.zzY2E.size(); i++) {
            ShapeBase shapeBase = this.zzY2E.get(i);
            ShapeRenderer shapeRenderer = shapeBase.getShapeRenderer();
            fMax = (float) Math.max(fMax, zzYCH.zzYJ(shapeBase) + ((double) Float.intBitsToFloat((int) shapeRenderer.zzYzG().getSize())));
            fMax2 = (float) Math.max(fMax2, zzYCH.zzYI(shapeBase) + ((double) com.aspose.words.internal.zzZPW.zzYz(shapeRenderer.zzYzG().getSize())));
        }
        return com.aspose.words.internal.zzZPW.zzG(fMax, fMax2);
    }

    private static boolean zzZW(ShapeBase shapeBase) {
        Section section = (Section) shapeBase.getAncestor(2);
        if (!zzN(section)) {
            return false;
        }
        Node nodeNextPreOrder = shapeBase.nextPreOrder(section);
        while (nodeNextPreOrder != null && (nodeNextPreOrder.getNodeType() == 9 || nodeNextPreOrder.getNodeType() == 10)) {
            nodeNextPreOrder = nodeNextPreOrder.nextPreOrder(section);
        }
        if (nodeNextPreOrder == null) {
            return true;
        }
        CompositeNode compositeNode = (CompositeNode) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getAncestor(8).zzYB4(), CompositeNode.class);
        return compositeNode != null && shapeBase.zzYB4() == null && compositeNode.nextPreOrder(section) == null;
    }

    private static boolean zzZX(ShapeBase shapeBase) {
        Node nextSibling = shapeBase.getNextSibling();
        while (nextSibling != null && (nextSibling.getNodeType() == 9 || nextSibling.getNodeType() == 10)) {
            nextSibling = nextSibling.getNextSibling();
        }
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(nextSibling, Run.class);
        return run != null && com.aspose.words.internal.zzZKN.zzS(run.getText(), ControlChar.PAGE_BREAK, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    private static boolean zzZY(ShapeBase shapeBase) {
        while (shapeBase != null && zz2(shapeBase)) {
            if (zzZX(shapeBase) || zzZW(shapeBase)) {
                return true;
            }
            Node nextSibling = shapeBase.getNextSibling();
            while (nextSibling != null && (nextSibling.getNodeType() == 9 || nextSibling.getNodeType() == 10)) {
                nextSibling = nextSibling.getNextSibling();
            }
            shapeBase = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(nextSibling, ShapeBase.class);
        }
        return false;
    }

    public static boolean zzZZ(ShapeBase shapeBase) {
        shapeBase.getWrapType();
        return (shapeBase.getRelativeHorizontalPosition() == 3 || zzZY(shapeBase)) ? false : true;
    }

    private void zzz(Shape shape) throws Exception {
        this.zzY2T.zzZ0K();
        this.zzY2S.zzz(shape);
    }

    public final int zz1(ShapeBase shapeBase) throws Exception {
        zzZFY zzzfy = (zzZFY) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzY9H() ? shapeBase.zzY9h().getOleFormat().getOleControl() : null, zzZFY.class);
        if (zzzfy != null) {
            this.zzY2S.zzZ(zzzfy);
            return 1;
        }
        if (zzZY(shapeBase)) {
            if (zz0(shapeBase)) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzY2E, shapeBase);
            }
            if (!zzZX(shapeBase) && !zzZW(shapeBase)) {
                return 1;
            }
            zzYHp();
            return 1;
        }
        if (!zz0(shapeBase)) {
            return 1;
        }
        if (shapeBase.zzY9G()) {
            zzz((Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class));
            return 1;
        }
        this.zzYs4.zz4(shapeBase);
        return 1;
    }
}
