package com.aspose.words;

import androidx.appcompat.widget.C21532OooOOo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYVB implements zzZ8W, zzZ9Y {
    private static int[] zzXTO = {60, 120, 80, 130, 70, StyleIdentifier.SUBTLE_EMPHASIS, 110};
    private boolean zzXTP;
    private zzYJC zzXTR;
    private zzZ4J zzXTS;
    private com.aspose.words.internal.zzZO0 zzXTT;
    private zzYUK zzXTU;
    private boolean zzXTV;
    private zzZ1B zzXTW;
    private boolean zzXUb;
    String zzXUd;
    String zzXUe;
    zzY99 zzXUm;
    private zzYUE zzXUo;
    private CompositeNode zzXXl;
    private LoadOptions zzYWO;
    private boolean zzYkj;
    private zzYO3 zzZ88;
    private DocumentBase zzZG3;
    ArrayList<Integer> zzXUl = new ArrayList<>();
    ArrayList<Table> zzXUk = new ArrayList<>();
    HashMap<String, zzTM> zzXUj = new HashMap<>();
    zzYCZ zzXUi = new zzYCZ();
    zzYMX zzXUh = new zzYMX();
    zzY6G zzXUg = new zzY6G();
    zzYEF zzXUf = new zzYEF();
    private com.aspose.words.internal.zzIM<Integer> zzXUc = new com.aspose.words.internal.zzIM<>();
    private ArrayList<Node> zzXXi = new ArrayList<>();
    private ArrayList<zzZ> zzXUa = new ArrayList<>();
    private ArrayList<Node> zzXU9 = new ArrayList<>();
    private ArrayList<Paragraph> zzXU8 = new ArrayList<>();
    private ArrayList<ShapeBase> zzXU7 = new ArrayList<>();
    private ArrayList<ShapeBase> zzXU6 = new ArrayList<>();
    private HashMap<String, ShapeBase> zzXU5 = new HashMap<>();
    private ArrayList<ShapeBase> zzXU4 = new ArrayList<>();
    private com.aspose.words.internal.zzD3<ShapeBase> zzXU3 = new com.aspose.words.internal.zzD3<>();
    private HashMap<Integer, com.aspose.words.internal.zzZYV<ShapeBase>> zzXU2 = new HashMap<>();
    private HashMap<Integer, Shape> zzXU1 = new HashMap<>();
    private HashMap<Object, Integer> zzXU0 = new HashMap<>();
    private HashMap<Integer, String> zzXTZ = new HashMap<>();
    private HashMap<Integer, zzZ4J> zzXTY = new HashMap<>();
    private HashMap<com.aspose.words.internal.zzXC, byte[]> zzXTX = new HashMap<>();
    private HashMap<String, zzYC3> zzYkl = new HashMap<>();
    private zzYCZ zzXTQ = new zzYCZ();
    private com.aspose.words.internal.zzD3<Style> zzXTN = new com.aspose.words.internal.zzD3<>(4);

    public static class zzZ {
        private Node zzXTL;
        private Node zzXTM;

        public zzZ(Node node, Node node2) {
            this.zzXTM = node;
            this.zzXTL = node2;
        }

        public final Node zzYyS() {
            return this.zzXTL;
        }

        public final Node zzYyT() {
            return this.zzXTM;
        }
    }

    public zzYVB(DocumentBase documentBase, LoadOptions loadOptions, int i, zzYO3 zzyo3, zzYUE zzyue, zzYUK zzyuk) {
        this.zzZG3 = documentBase;
        this.zzXXl = documentBase;
        this.zzXTW = new zzZ1B(loadOptions, i);
        this.zzYWO = loadOptions;
        this.zzZ88 = zzyo3;
        this.zzXUo = zzyue;
        this.zzXTU = zzyuk;
        this.zzXUm = new zzY99(loadOptions.getWarningCallback(), i);
    }

    private void zzXD(Node node) {
        zzZCT zzzct = (zzZCT) com.aspose.words.internal.zzZKW.zzZ(node, zzZCT.class);
        if (zzzct == null || !this.zzXTW.zzYHh()) {
            return;
        }
        zzzct.setDisplacedByCustomXml(2);
    }

    private boolean zzXz(Node node) {
        CompositeNode compositeNodeZzY;
        zzZCT zzzct = (zzZCT) com.aspose.words.internal.zzZKW.zzZ(node, zzZCT.class);
        if (zzzct == null || zzzct.getDisplacedByCustomXml() != 1 || this.zzXTW.zzYHh() || this.zzXXl.getLastChild() == null || this.zzXXl.getLastChild() != this.zzXTW.zzYHi() || (compositeNodeZzY = zzY(this.zzXTW.zzYHj())) == null) {
            return false;
        }
        compositeNodeZzY.appendChild(node);
        zzzct.setDisplacedByCustomXml(2);
        return true;
    }

    private void zzZ(com.aspose.words.internal.zzZYV<ShapeBase> zzzyv, int i) {
        if (this.zzXU1.size() > i) {
            zzZVH.zzZ(this.zzXU1.get(Integer.valueOf(i)), zzzyv, getDocument());
        }
    }

    private void zzZe(Paragraph paragraph) {
        if (paragraph == null) {
            paragraph = new Paragraph(getDocument());
            this.zzXXl.appendChild(paragraph);
        }
        for (Node node : this.zzXXi) {
            zzXD(node);
            paragraph.zzA(node);
        }
        this.zzXXi.clear();
    }

    private static void zzZk(ArrayList<ShapeBase> arrayList) {
        if (arrayList.size() == 0) {
            return;
        }
        zzYBT.zzS(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).setZOrder(i);
        }
    }

    private static void zzi(Table table) throws Exception {
        Cell firstCell = table.getFirstRow().getFirstCell();
        if (firstCell == null) {
            return;
        }
        zzY6G zzy6gZzZYf = table.getFirstRow().zzZYf();
        StyleCollection styles = table.getDocument().getStyles();
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(styles.zzZ8(zzy6gZzZYf.zzZ7j(), false), TableStyle.class);
        if (zzy6gZzZYf.get(4340) == null) {
            if ((tableStyle == null || !zzYU9.zzZ(firstCell.getDocument(), zzy6gZzZYf)) && !styles.contains(105)) {
                int iIntValue = ((Integer) firstCell.fetchCellAttr(3090)).intValue();
                if (iIntValue > 0) {
                    table.setLeftIndent(((double) iIntValue) / 20.0d);
                }
                if (tableStyle != null || zzy6gZzZYf.zzZ7j() > 14 || styles.zzZ8(zzy6gZzZYf.zzZ7j(), false) == null) {
                    return;
                }
                styles.zzs(table.getStyle());
            }
        }
    }

    private void zzti(int i) {
        List list = new List(getDocument(), i);
        if (this.zzXTS == null) {
            int iZzYP3 = getDocument().getLists().zzYP3();
            this.zzXTS = new zzZ4J(getDocument(), iZzYP3, 2, iZzYP3);
            getDocument().getLists().zzZ(this.zzXTS);
            zzZ(this.zzXTS.zzYOP().get(0), "\u0000.", 36, 720);
            zzZ(this.zzXTS.zzYOP().get(1), "\u0001.", 72, 1440);
            zzZ(this.zzXTS.zzYOP().get(2), "\u0002.", 108, 2160);
            zzZ(this.zzXTS.zzYOP().get(3), "\u0003.", 144, 2880);
            zzZ(this.zzXTS.zzYOP().get(4), "\u0004.", 180, 3600);
            zzZ(this.zzXTS.zzYOP().get(5), "\u0005.", 216, 4320);
            zzZ(this.zzXTS.zzYOP().get(6), "\u0006.", StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, 5040);
            zzZ(this.zzXTS.zzYOP().get(7), "\u0007.", StyleIdentifier.GRID_TABLE_2_ACCENT_2, 5760);
            zzZ(this.zzXTS.zzYOP().get(8), "\b.", StyleIdentifier.LIST_TABLE_3, 6480);
        } else {
            zzJ(list);
        }
        list.zzxB(this.zzXTS.zzYP8());
        getDocument().getLists().zzQ(list);
    }

    @Override // com.aspose.words.zzZ8W
    @ReservedForInternalUse
    @Deprecated
    public DocumentBase getDocument() {
        return this.zzZG3;
    }

    public abstract Comment zzFw(int i);

    @ReservedForInternalUse
    @Deprecated
    public final void zzH(Object obj, int i) {
        this.zzXU0.put(obj, Integer.valueOf(i));
    }

    @Override // com.aspose.words.zzZ9Y
    @ReservedForInternalUse
    @Deprecated
    public final int zzJ(Object obj, int i) {
        return ((Integer) com.aspose.words.internal.zzQW.zzZ(this.zzXU0, obj, Integer.valueOf(i))).intValue();
    }

    @Override // com.aspose.words.zzZ8W
    public final zzYC3 zzJI(String str) {
        if (com.aspose.words.internal.zzZKN.zzS(str, "#", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            str = str.substring(1);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str) && this.zzYkl.containsKey(str)) {
            return this.zzYkl.get(str);
        }
        return null;
    }

    @Override // com.aspose.words.zzZ8W
    public final ShapeBase zzJJ(String str) {
        return (ShapeBase) com.aspose.words.internal.zzQW.zzZ(this.zzXU5, str);
    }

    public final void zzK(StructuredDocumentTag structuredDocumentTag) {
        if (structuredDocumentTag.getLevel() == 1) {
            zzT(structuredDocumentTag);
        }
        this.zzXTW.zzO(structuredDocumentTag);
    }

    public final void zzL(com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzXTT = zzzo0;
    }

    public final void zzN(Run run) {
        Paragraph parentParagraph;
        Style styleZzZ8;
        for (int i : zzXTO) {
            StyleCollection styles = run.getDocument().getStyles();
            if (!run.zzZYh().contains(i) && (parentParagraph = run.getParentParagraph()) != null && (styleZzZ8 = styles.zzZ8(parentParagraph.zzZYj().zzZ7j(), false)) != null && styleZzZ8.zzZa(i, false) != null) {
                Table parentTable = parentParagraph.getParentTable();
                if (parentTable == null || parentTable.zzZ7j() == 11) {
                    Style styleZzZ82 = styles.zzZ8(run.zzZYh().zzZ7j(), false);
                    if (styleZzZ82 != null && styleZzZ82.zzZa(i, false) != null) {
                        this.zzXUc.add(Integer.valueOf(styleZzZ8.zzZ7j()));
                        this.zzXUc.add(Integer.valueOf(styleZzZ82.zzZ7j()));
                    }
                } else {
                    this.zzXUc.add(Integer.valueOf(styleZzZ8.zzZ7j()));
                    Style styleZzZ83 = styles.zzZ8(run.zzZYh().zzZ7j(), false);
                    if (styleZzZ83 != null && styleZzZ83.zzZa(i, false) != null) {
                        this.zzXUc.add(Integer.valueOf(styleZzZ83.zzZ7j()));
                    }
                }
            }
        }
    }

    public final void zzQ(CompositeNode compositeNode) throws Exception {
        zzYBZ();
        CompositeNode compositeNode2 = this.zzXXl;
        this.zzXXl = compositeNode;
        this.zzXUo.zzG(this);
        zzYBZ();
        this.zzXXl = compositeNode2;
    }

    public final void zzR(CompositeNode compositeNode) {
        this.zzXXl = compositeNode;
    }

    public final void zzS(CompositeNode compositeNode) {
        if (compositeNode == null || this.zzXU8.size() == 0) {
            return;
        }
        if (compositeNode.getNodeType() == 6 || compositeNode.getNodeType() == 7) {
            Cell cell = compositeNode.getNodeType() == 7 ? (Cell) compositeNode : new Cell(compositeNode.getDocument());
            Iterator<Paragraph> it = this.zzXU8.iterator();
            while (it.hasNext()) {
                cell.prependChild(it.next());
            }
            if (cell.getParentNode() == null) {
                compositeNode.appendChild(cell);
            }
            this.zzXU8.clear();
        }
    }

    public final void zzSA(boolean z) throws Exception {
        this.zzXTU.zzY(this, this.zzXUi);
        if (z) {
            this.zzXTP = true;
        }
    }

    public final void zzSB(boolean z) {
        this.zzXUb = z;
    }

    public final void zzSz(boolean z) {
        this.zzXTV = z;
    }

    public abstract void zzT(Comment comment);

    public final void zzT(CompositeNode compositeNode) {
        this.zzXXl.zzA(compositeNode);
        this.zzXXl = compositeNode;
    }

    public final void zzTG(String str) {
        zzZ(16777216, 14, str);
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzVb(boolean z) {
        this.zzYkj = z;
    }

    public final void zzX(StructuredDocumentTag structuredDocumentTag, Node node) {
        if (structuredDocumentTag.getLevel() == 1) {
            zztj(structuredDocumentTag.getNodeType());
        }
        this.zzXTW.zzZ(structuredDocumentTag, node);
        if (structuredDocumentTag.getLevel() != 1) {
            zzJ(structuredDocumentTag);
        }
    }

    public final void zzXA(Node node) {
        this.zzXTW.zzYO(node);
    }

    public final void zzXB(Node node) {
        CompositeNode compositeNode = this.zzXXl;
        zzY(compositeNode, node, compositeNode.getLastChild());
    }

    public final void zzXC(Node node) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXU9, node);
    }

    public abstract Footnote zzXR(int i, int i2);

    public final void zzY(Body body) {
        if (body.zzZYq() instanceof Paragraph) {
            return;
        }
        zzT(new Paragraph(body.getDocument()));
        zzYz9();
        zzYBZ();
        zztj(8);
    }

    public final byte[] zzY0(byte[] bArr) {
        com.aspose.words.internal.zzXC zzxcZz3 = com.aspose.words.internal.zzIL.zz3(bArr);
        byte[] bArr2 = (byte[]) com.aspose.words.internal.zzQW.zzZ(this.zzXTX, zzxcZz3);
        if (bArr2 != null) {
            return bArr2;
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzXTX, zzxcZz3, bArr);
        return bArr;
    }

    @Override // com.aspose.words.zzZ8W
    @ReservedForInternalUse
    @Deprecated
    public abstract String zzY9(String str);

    public final void zzYBZ() {
        if (this.zzXXi.size() == 0) {
            return;
        }
        zzZe(this.zzXXl.getNodeType() == 8 ? (Paragraph) this.zzXXl : (Paragraph) this.zzXXl.getChild(8, -1, false));
    }

    public final zzZ7Q zzYHk() {
        return this.zzXTW.zzYHk();
    }

    public final void zzYK(Node node) {
        if (!this.zzXXl.zzT(node)) {
            if (zzXz(node)) {
                return;
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzXXi, node);
        } else {
            zzXB(node);
            if (node.zzYAY() != 6) {
                zzXA(node);
                zzZsD().zzXy(node);
            }
        }
    }

    @Override // com.aspose.words.zzZ8W
    public final boolean zzYXm() {
        return this.zzYkj;
    }

    public final com.aspose.words.internal.zzD3<Style> zzYyU() {
        return this.zzXTN;
    }

    public final zzYCZ zzYyV() {
        return this.zzXTQ;
    }

    public final boolean zzYyW() {
        return this.zzXTP;
    }

    public final zzYJC zzYyX() {
        return this.zzXTR;
    }

    public final com.aspose.words.internal.zzZO0 zzYyY() {
        return this.zzXTT;
    }

    public final LoadOptions zzYyZ() {
        return this.zzYWO;
    }

    public final boolean zzYz0() {
        return this.zzXTV;
    }

    public final void zzYz1() {
        for (int i : zzXTO) {
            Iterator<Integer> it = this.zzXUc.iterator();
            while (it.hasNext()) {
                Style styleZzZ8 = getDocument().getStyles().zzZ8(it.next().intValue(), false);
                zzY(styleZzZ8, i);
                Style styleZzY3j = styleZzZ8.zzY3j();
                if (styleZzY3j != null) {
                    zzY(styleZzY3j, i);
                }
            }
        }
    }

    public final void zzYz2() {
        for (int i = 0; i < this.zzXUl.size(); i++) {
            int iIntValue = this.zzXUl.get(i).intValue();
            if (getDocument().getLists().getListByListId(iIntValue) == null) {
                zzti(iIntValue);
            }
        }
    }

    public final void zzYz3() {
        zztj(3);
        zztj(2);
        zzT(new Section(getDocument()));
        zzT(new Body(getDocument()));
    }

    public final void zzYz4() throws Exception {
        this.zzXTW.zzYHl();
    }

    public final Map<Integer, zzZ4J> zzYz5() {
        return this.zzXTY;
    }

    public final Map<Integer, String> zzYz6() {
        return this.zzXTZ;
    }

    public final CompositeNode zzYz7() {
        return this.zzXXl;
    }

    public final void zzYz8() {
        Story story;
        if (this.zzXU9.size() == 0 || (story = (Story) com.aspose.words.internal.zzZKW.zzZ(this.zzXXl, Story.class)) == null) {
            return;
        }
        Paragraph lastParagraph = story.getLastParagraph();
        if (lastParagraph != null && this.zzXU9.get(0).getNodeType() == 8) {
            Paragraph paragraph = (Paragraph) this.zzXU9.get(0);
            while (paragraph.hasChildNodes()) {
                lastParagraph.appendChild(paragraph.getFirstChild());
            }
            paragraph.zzZYj().zzY(lastParagraph.zzZYj());
            paragraph.zzYp5().zzY(lastParagraph.zzYp5());
            this.zzXU9.remove(0);
        }
        Iterator<Node> it = this.zzXU9.iterator();
        while (it.hasNext()) {
            story.appendChild(it.next());
        }
        this.zzXU9.clear();
    }

    public final void zzYz9() {
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzXXl, Paragraph.class);
        if (paragraph == null) {
            return;
        }
        int i = 0;
        Node nodeZztB = paragraph.zztB(0);
        if (nodeZztB == null) {
            return;
        }
        while (i < this.zzXUa.size()) {
            Node nodeZzYyT = this.zzXUa.get(i).zzYyT();
            if (this.zzXUa.get(i).zzYyS() == nodeZztB && paragraph.zzT(nodeZzYyT)) {
                paragraph.appendChild(nodeZzYyT);
                this.zzXUa.remove(i);
            } else {
                i++;
            }
        }
    }

    public final void zzYza() {
        int iZzJ;
        int iZzJ2;
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXUe) && (iZzJ2 = zzJ(this.zzXUe, -1)) >= 0) {
            getDocument().zzZpV().zzYVZ = iZzJ2;
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXUd) || (iZzJ = zzJ(this.zzXUd, -1)) < 0) {
            return;
        }
        getDocument().zzZpV().zzYVY = iZzJ;
    }

    public final void zzYzb() {
        for (Map.Entry<String, zzTM> entry : this.zzXUj.entrySet()) {
            ShapeBase shapeBase = (ShapeBase) com.aspose.words.internal.zzQW.zzZ(this.zzXU5, entry.getKey().substring(1));
            if (shapeBase != null) {
                zzTM value = entry.getValue();
                ShapeBase shapeBase2 = (ShapeBase) com.aspose.words.internal.zzQW.zzZ(this.zzXU5, value.zzZsC.substring(1));
                if (shapeBase2 != null) {
                    value.zzZsG = shapeBase2.getId();
                }
                ShapeBase shapeBase3 = (ShapeBase) com.aspose.words.internal.zzQW.zzZ(this.zzXU5, value.zzZsB.substring(1));
                if (shapeBase3 != null) {
                    value.zzZsF = shapeBase3.getId();
                }
                shapeBase.zzYvW().zzQ(4156, entry.getValue());
            }
        }
    }

    public final void zzYzc() {
        zzZVH.zzZ(this.zzXU3, this.zzXU2);
        for (com.aspose.words.internal.zzZYV<ShapeBase> zzzyv : this.zzXU2.values()) {
            int iZzY9q = ((Shape) zzzyv.zzVY(0)).zzY9q();
            if (this.zzXU3.get(iZzY9q) == null) {
                zzZ(zzzyv, iZzY9q);
            }
        }
    }

    public final void zzYzd() {
        ShapeBase shapeBase;
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
        for (ShapeBase shapeBase2 : this.zzXU4) {
            String str = (String) shapeBase2.zzYvW().get(142);
            if (com.aspose.words.internal.zzZYD.zzXk(str) && !com.aspose.words.internal.zzZKN.equals(shapeBase2.getName(), str) && (shapeBase = (ShapeBase) com.aspose.words.internal.zzQW.zzZ(this.zzXU5, str)) != null && !zzim.contains(Integer.valueOf(shapeBase.getId()))) {
                shapeBase2.setShapeAttr(138, Integer.valueOf(shapeBase.getId()));
                if (shapeBase2.getId() != shapeBase.getId()) {
                    zzim.add(Integer.valueOf(shapeBase.getId()));
                }
            }
        }
    }

    public final void zzYze() {
        zzZk(this.zzXU7);
        zzZk(this.zzXU6);
    }

    public final void zzZT(ShapeBase shapeBase) {
        if (shapeBase != null && shapeBase.zzY9i().zzZHY() == 8) {
            Shape shape = (Shape) shapeBase;
            if (shape.getTextBox() != null && shapeBase.zzY9q() == 0) {
                HashMap<Integer, Shape> map = this.zzXU1;
                map.put(Integer.valueOf(map.size()), shape);
            }
            if (shapeBase.zzY9r() > 0) {
                this.zzXU3.set(shapeBase.zzY9r(), shapeBase);
            }
            if (shapeBase.zzY9q() > 0) {
                if (!this.zzXU2.containsKey(Integer.valueOf(shapeBase.zzY9q()))) {
                    this.zzXU2.put(Integer.valueOf(shapeBase.zzY9q()), new com.aspose.words.internal.zzZYV<>());
                }
                ((com.aspose.words.internal.zzZYV) com.aspose.words.internal.zzQW.zzZ(this.zzXU2, Integer.valueOf(shapeBase.zzY9q()))).set(shapeBase.zzY9p(), shapeBase);
            }
        }
    }

    public final void zzZd(Paragraph paragraph) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXU8, paragraph);
    }

    public abstract boolean zzZmh();

    public abstract boolean zzZmj();

    public abstract boolean zzZmk();

    @Override // com.aspose.words.zzZ8W
    @ReservedForInternalUse
    @Deprecated
    public abstract void zzZml() throws Exception;

    public abstract boolean zzZmv();

    public final zzYO3 zzZqn() {
        return this.zzZ88;
    }

    @Override // com.aspose.words.zzZ8W
    @ReservedForInternalUse
    @Deprecated
    public abstract zzYU4 zzZsD();

    @Override // com.aspose.words.zzZ8W
    @ReservedForInternalUse
    @Deprecated
    public final void zzb(ShapeBase shapeBase) {
        if (this.zzXUb) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXU7, shapeBase);
        } else {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXU6, shapeBase);
        }
    }

    public final void zzh(Node node, Node node2) {
        if (node2 == null) {
            node2 = this.zzXXl;
        }
        if (!zzYVU.zzXS(node2)) {
            node2 = node2.zztB(0);
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzXUa, new zzZ(node, node2));
    }

    public final void zzj(Table table) throws Exception {
        if (getDocument().getStyles().contains(105)) {
            return;
        }
        if (table.zzZ7j() == 11) {
            Iterator<T> it = table.getRows().iterator();
            while (it.hasNext()) {
                zzY6G zzy6gZzZYf = ((Row) it.next()).zzZYf();
                zzy6gZzZYf.zzN(4020, 10);
                zzy6gZzZYf.zzN(4320, 10);
                zzy6gZzZYf.zzN(4300, 0);
                zzy6gZzZYf.zzN(4310, 0);
            }
        }
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(getDocument(), Document.class);
        if (document == null || document.getCompatibilityOptions().getMswVersion() >= 15 || !table.zzY0f()) {
            return;
        }
        zzi(table);
    }

    public final void zztj(int i) {
        if (this.zzXXl.getNodeType() != i) {
            throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("End of node is out of sync. Expected {0} but got {1}.", Integer.valueOf(i), Integer.valueOf(this.zzXXl.getNodeType())));
        }
        if (this.zzXXl.getNodeType() == 3 && (this.zzXUa.size() > 0 || this.zzXXi.size() > 0)) {
            zzY((Body) this.zzXXl);
        }
        this.zzXXl = this.zzXXl.getParentNode();
    }

    private void zzJ(StructuredDocumentTag structuredDocumentTag) {
        CompositeNode compositeNodeZzY;
        ArrayList<Node> arrayList = new ArrayList();
        for (int i = 0; i < this.zzXXi.size(); i++) {
            Node node = this.zzXXi.get(i);
            zzZCT zzzct = (zzZCT) com.aspose.words.internal.zzZKW.zzZ(node, zzZCT.class);
            if (zzzct != null && zzzct.getDisplacedByCustomXml() == 0) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Node>) arrayList, node);
            }
        }
        if (arrayList.size() == 0 || (compositeNodeZzY = zzY(structuredDocumentTag)) == null) {
            return;
        }
        for (Node node2 : arrayList) {
            compositeNodeZzY.appendChild(node2);
            this.zzXXi.remove(node2);
        }
    }

    public final void zzZ(Section section, HeaderFooter headerFooter) {
        if (section.getHeadersFooters().getByHeaderFooterType(headerFooter.getHeaderFooterType()) == null) {
            zzZ(section, headerFooter, section.getBody());
            return;
        }
        HeaderFooter byHeaderFooterType = section.getHeadersFooters().getByHeaderFooterType(headerFooter.getHeaderFooterType());
        Paragraph paragraph = new Paragraph(byHeaderFooterType.getDocument());
        paragraph.zzZYj().set(1000, Integer.valueOf(section.getDocument().getStyles().zzZ7(0, true).zzZ7j()));
        byHeaderFooterType.insertBefore(paragraph, byHeaderFooterType.getFirstChild());
        while (headerFooter.hasChildNodes()) {
            byHeaderFooterType.insertBefore(headerFooter.getLastChild(), byHeaderFooterType.getFirstChild());
        }
    }

    public final void zzY(CompositeNode compositeNode, Node node, Node node2) {
        zzZ(compositeNode, node, node2, true);
    }

    private CompositeNode zzY(zzZAD zzzad) {
        ArrayList<Node> arrayListZzZ = this.zzXTW.zzZ(zzzad);
        for (int size = arrayListZzZ.size() - 1; size >= 0; size--) {
            if (arrayListZzZ.get(size).isComposite()) {
                CompositeNode compositeNodeZzZYs = (CompositeNode) arrayListZzZ.get(size);
                while (compositeNodeZzZYs != null && compositeNodeZzZYs.getNodeType() != 8) {
                    compositeNodeZzZYs = compositeNodeZzZYs.zzZYs();
                }
                return compositeNodeZzZYs;
            }
        }
        return null;
    }

    public final void zzS(zzZS zzzs, int i) {
        int i2;
        int i3;
        Style style;
        if (i == 1) {
            i2 = 1000;
            i3 = 0;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "null\r\nParameter name: type\r\nParameter value: "));
            }
            i2 = 4005;
            i3 = 105;
        }
        if (zzzs.contains(i2) || (style = this.zzXTN.get(i)) == null || style.getStyleIdentifier() == i3) {
            return;
        }
        zzzs.zzQ(i2, Integer.valueOf(style.zzZ7j()));
    }

    public final void zzZ(CompositeNode compositeNode, Node node, Node node2) {
        zzZ(compositeNode, node, node2, false);
    }

    private static void zzJ(List list) {
        for (int i = 0; i < 9; i++) {
            zzZ4B zzz4b = new zzZ4B(list.getDocument(), i);
            zzz4b.zzYbX = true;
            list.zzYPb().zzZ(zzz4b);
        }
    }

    private void zzZ(CompositeNode compositeNode, Node node, Node node2, boolean z) {
        if (z) {
            if (node2 == compositeNode.getLastChild()) {
                compositeNode.zzA(node);
            } else {
                compositeNode.insertAfter(node, node2);
            }
        } else {
            compositeNode.insertBefore(node, node2);
        }
        zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class);
        if (zzzam != null) {
            this.zzXUm.zzZ(zzzam.getRunPr_IInline(), node);
        }
    }

    private static void zzY(Style style, int i) {
        zzZU zzzu = (zzZU) style.zzZYh().get(i);
        if (zzzu == zzZU.zzZF6 || zzzu == zzZU.zzZF7) {
            style.zzZYh().zzQ(i, zzzu == ((zzZU) style.fetchInheritedRunAttr(i)) ? zzZU.zzZF5 : zzZU.zzZF4);
        }
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzZ(String str, ShapeBase shapeBase) {
        this.zzXU5.put(str, shapeBase);
        com.aspose.words.internal.zzZQG.zzZ(this.zzXU4, shapeBase);
    }

    @Override // com.aspose.words.zzZ8W
    public final void zzZ(String str, zzYC3 zzyc3) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzYkl.put(str, zzyc3);
        }
    }

    public final void zzZ(int i, int i2, String str) {
        if (this.zzYWO.getWarningCallback() != null) {
            OooO00o.OooO0O0(this.zzYWO.getWarningCallback(), i, i2, str);
        }
    }

    private static void zzZ(ListLevel listLevel, String str, int i, int i2) {
        listLevel.setNumberStyle(0);
        listLevel.setNumberFormat(str);
        TabStopCollection tabStopCollection = new TabStopCollection();
        tabStopCollection.add(new TabStop(i * 20, 6, 0));
        listLevel.zzZYj().zzY(tabStopCollection);
        listLevel.zzZYj().zzwa(i2);
        listLevel.zzZYj().zzwb(-720);
    }

    public final void zzZ(zzYJC zzyjc) {
        this.zzXTR = zzyjc;
    }
}
