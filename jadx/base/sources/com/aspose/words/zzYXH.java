package com.aspose.words;

import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXH implements zzZBV {
    private static HashMap<Integer, String[]> zzXXd;
    private int zzXXc;
    private zzY0M zzXXe;
    private Shape zzXXj;
    private CompositeNode zzXXk;
    private CompositeNode zzXXl;
    private zzZRA zzYUj;
    private LoadOptions zzYWO;
    private DocumentBase zzZG3;
    private com.aspose.words.internal.zzZQC<Node> zzYR5 = new com.aspose.words.internal.zzZQC<>();
    private ArrayList<Node> zzXXi = new ArrayList<>();
    private HashMap<FieldStart, String> zzXXh = new HashMap<>();
    private ArrayList<CompositeNode> zzXXg = new ArrayList<>();
    private ArrayList<BuildingBlock> zzXXf = new ArrayList<>();

    static {
        HashMap<Integer, String[]> map = new HashMap<>();
        zzXXd = map;
        com.aspose.words.internal.zzZQF.zzY(map, 7, new String[]{"SERIENDRUCKFELD;MERGEFIELD", "FORMATVERBINDEN;MERGEFORMAT", "FORMULARKONTROLLFELD;FORMCHECKBOX", "WENN;IF", "SEITE;PAGE", "ANZPAGEN;NUMPAGES"});
        com.aspose.words.internal.zzZQF.zzY(zzXXd, 12, new String[]{"CHAMPFUSION;MERGEFIELD", "FUSIONFORMAT;MERGEFORMAT", "LIENHYPERTEXTE;HYPERLINK"});
        com.aspose.words.internal.zzZQF.zzY(zzXXd, 10, new String[]{"PÁGINA;PAGE", "NÚMPAGES;NUMPAGES", "COMFORMATO;MERGEFORMAT", "FORMTEXTO;FORMTEXT"});
    }

    public zzYXH(DocumentBase documentBase, zzZRA zzzra, LoadOptions loadOptions) {
        this.zzZG3 = documentBase;
        this.zzYUj = zzzra;
        this.zzXXc = zzzra.zzYHz & 255;
        this.zzXXl = documentBase;
        this.zzYWO = loadOptions;
        this.zzXXe = new zzY0M(documentBase);
    }

    private IWarningCallback getWarningCallback() {
        LoadOptions loadOptions = this.zzYWO;
        if (loadOptions != null) {
            return loadOptions.getWarningCallback();
        }
        return null;
    }

    private static void zzC(Cell cell) {
        zzWP zzwpZz6G = cell.zz6G();
        zzT(zzwpZz6G);
        if (zzwpZz6G.zz6D()) {
            zzT((zzWP) zzwpZz6G.zzYsN().zzZ6C());
        }
    }

    private static void zzF(Row row) {
        if (row.zzZYf().zz6D()) {
            zzZMK zzzmkZzYsN = row.zzZYf().zzYsN();
            zzWO zzwoZz5l = ((zzY6G) zzzmkZzYsN.zzZ6C()).zz5l();
            if (zzwoZz5l == null) {
                row.zzZYf().remove(10010);
                return;
            }
            int i = 0;
            for (Cell firstCell = row.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
                firstCell.zz6G().zzZ(new zzZMK(zzwoZz5l.zzOs(i), zzzmkZzYsN.getAuthor(), zzzmkZzYsN.zzZx()));
                i++;
            }
            if (i != zzwoZz5l.getCount()) {
                throw new IllegalStateException("Number of cells does not match the number of cells properties.");
            }
        }
    }

    private static void zzG(Row row) {
        zzWO zzwoZz5l = row.zzZYf().zz5l();
        Cell firstCell = row.getFirstCell();
        for (int i = 0; firstCell != null && i < zzwoZz5l.getCount(); i++) {
            firstCell.zzZ(zzwoZz5l.zzOs(i));
            firstCell = firstCell.getNextCell();
        }
        if (firstCell != null) {
            zzYW0.zzn(firstCell, null);
        }
    }

    private void zzH(Row row) {
        for (Cell cell : row.getCells()) {
            if (cell.zz6G().getHorizontalMerge() == 2) {
                if (cell.getChildNodes(0, false).getCount() == 1 && cell.getChildNodes(0, false).get(0).getNodeType() == 8) {
                    Paragraph paragraph = (Paragraph) cell.getChildNodes(0, false).get(0);
                    if (paragraph.hasChildNodes()) {
                        paragraph.getChildNodes(0, false).clear();
                    }
                } else if (cell.hasChildNodes()) {
                    cell.getChildNodes(0, false).clear();
                    cell.appendChild(new Paragraph(this.zzZG3));
                }
            }
        }
    }

    private static void zzI(Row row) {
        Cell firstCell = row.getFirstCell();
        Cell cell = null;
        while (row.getLastCell() != firstCell) {
            cell = (Cell) row.insertAfter(row.getLastCell(), cell);
            zzC(cell);
        }
        if (firstCell != null) {
            zzC(firstCell);
        }
    }

    private zzZR4 zzS(FieldEnd fieldEnd) {
        zzZR4 zzzr4 = new zzZR4();
        zzzr4.zzX(fieldEnd);
        if (zztL(23)) {
            zzzr4.zzX((FieldSeparator) this.zzYR5.pop());
        }
        if (zztL(22)) {
            zzzr4.zzY((FieldStart) this.zzYR5.pop());
        }
        return zzzr4;
    }

    private static void zzT(zzWP zzwp) {
        Border borderZz5y = zzwp.zz5y();
        Border borderZz5x = zzwp.zz5x();
        if (borderZz5y != null) {
            zzwp.zzL(borderZz5y);
        } else {
            zzwp.remove(3140);
        }
        if (borderZz5x != null) {
            zzwp.zzM(borderZz5x);
        } else {
            zzwp.remove(3120);
        }
    }

    private static void zzU(CompositeNode compositeNode) {
        Node nodeZzZYq = compositeNode.zzZYq();
        if (nodeZzZYq == null || nodeZzZYq.getNodeType() != 8) {
            return;
        }
        Paragraph paragraph = (Paragraph) nodeZzZYq;
        if (paragraph.hasChildNodes()) {
            Node nodeZzYB9 = paragraph.zzYB9();
            if (nodeZzYB9 == null || nodeZzYB9.getNodeType() != 8) {
                return;
            }
            Paragraph paragraph2 = (Paragraph) nodeZzYB9;
            paragraph2.zzY(paragraph2.getNextSibling(), paragraph, paragraph2.getLastChild());
            while (paragraph.hasChildNodes()) {
                paragraph2.appendChild(paragraph.getFirstChild());
            }
        }
        paragraph.remove();
    }

    private boolean zzW(char c, zzYEF zzyef) {
        if (c != 0) {
            return false;
        }
        for (Node node : zzYYM.zzZ(this.zzZG3, zzyef)) {
            this.zzXXl.zzA(node);
        }
        return true;
    }

    private void zzYBX() {
        String[] strArr = (String[]) com.aspose.words.internal.zzQW.zzZ(zzXXd, Integer.valueOf(this.zzXXc));
        if (strArr == null) {
            return;
        }
        ArrayList<Field> arrayListZzZS = zzZQF.zzZS(this.zzZG3);
        boolean z = false;
        for (int i = 0; i < arrayListZzZS.size(); i++) {
            zzYWB zzywbZzZgG = arrayListZzZS.get(i).zzZgG();
            ArrayList arrayList = new ArrayList();
            while (true) {
                Run run = null;
                String strZzZI = "";
                for (Node node : zzywbZzZgG) {
                    if (node.getNodeType() == 21) {
                        if (run == null) {
                            run = (Run) node;
                        } else {
                            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Run>) arrayList, (Run) node);
                        }
                        strZzZI = com.aspose.words.internal.zzZKN.zzZI(strZzZI, node.getText());
                        String strZzT = zzT(strZzZI, strArr);
                        if (!com.aspose.words.internal.zzZKN.equals(strZzT, strZzZI)) {
                            run.setText(strZzT);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((Run) it.next()).remove();
                            }
                            arrayList.clear();
                            z = true;
                        }
                    }
                }
            }
        }
        if (z) {
            zzT(16777216, "Field codes were translated.");
        }
    }

    private void zzYBY() throws Exception {
        Map<Node, Field> mapZzZR = zzZQF.zzZR(this.zzZG3);
        boolean z = false;
        for (Map.Entry<FieldStart, String> entry : this.zzXXh.entrySet()) {
            FieldStart key = entry.getKey();
            Field field = (Field) com.aspose.words.internal.zzQW.zzZ((Map<FieldStart, TValue>) mapZzZR, key);
            if (field != null && key.getFieldType() == 88) {
                String value = entry.getValue();
                zzZR8 zzzr8ZzDH = field.zzZgq().zzDH(0);
                if (zzzr8ZzDH != null && !zzYD(zzzr8ZzDH.zzW2(true), value)) {
                    field.zzZgq().zzB(0, value);
                    z = true;
                }
            }
        }
        if (z) {
            zzT(16777216, "Hyperlinks were updated.");
        }
    }

    private void zzYBZ() {
        if (this.zzXXi.size() == 0) {
            return;
        }
        Node lastChild = this.zzXXl.getNodeType() == 8 ? this.zzXXl : this.zzXXl.getLastChild();
        if (lastChild instanceof Paragraph) {
            Iterator<Node> it = this.zzXXi.iterator();
            while (it.hasNext()) {
                ((Paragraph) lastChild).zzA(it.next());
            }
            this.zzXXi.clear();
        }
    }

    private void zzYC0() {
        this.zzZG3.getNodeType();
        int i = 0;
        while (i < this.zzXXg.size()) {
            BuildingBlock buildingBlock = this.zzXXf.get(i);
            CompositeNode compositeNode = this.zzXXg.get(i);
            CompositeNode compositeNodeZzZYq = i != this.zzXXg.size() - 1 ? this.zzXXg.get(i + 1) : null;
            Section section = (Section) compositeNode.getAncestor(2);
            Section section2 = compositeNodeZzZYq != null ? (Section) compositeNodeZzZYq.getAncestor(2) : (Section) this.zzZG3.getLastChild();
            Node nodeZzG = zzG(compositeNode, section);
            Node nodeZzG2 = compositeNodeZzZYq != null ? zzG(compositeNodeZzZYq, section2) : section2.getLastChild();
            if (compositeNodeZzZYq == null) {
                compositeNodeZzZYq = ((CompositeNode) nodeZzG2).zzZYq();
            }
            if (section != section2) {
                Section section3 = (Section) buildingBlock.appendChild(section.deepClone(false));
                CompositeNode compositeNode2 = (CompositeNode) section3.appendChild(nodeZzG.deepClone(false));
                compositeNode2.zzY(zzG(compositeNode, nodeZzG), null, null);
                if (nodeZzG.getNextSibling() != null) {
                    section3.zzY(nodeZzG.getNextSibling(), null, compositeNode2);
                }
                for (Node node : section.getChildNodes(0, false)) {
                    if (node != nodeZzG) {
                        section3.appendChild(node.deepClone(true));
                    }
                }
                Section section4 = (Section) section.getNextSibling();
                nodeZzG = section2.getFirstChild();
                Node firstChild = ((CompositeNode) nodeZzG).getFirstChild();
                while (section4 != section2) {
                    buildingBlock.appendChild(section4.deepClone(true));
                    section4 = (Section) section4.getNextSibling();
                }
                section = section4;
                compositeNode = firstChild;
            }
            Section section5 = (Section) buildingBlock.appendChild(section.deepClone(false));
            if (nodeZzG != nodeZzG2) {
                ((CompositeNode) section5.appendChild(nodeZzG.deepClone(false))).zzY(zzG(compositeNode, nodeZzG), null, null);
                Node nextSibling = nodeZzG.getNextSibling();
                Node firstChild2 = ((CompositeNode) nodeZzG2).getFirstChild();
                nodeZzG = nextSibling;
                while (nodeZzG != nodeZzG2) {
                    section5.appendChild(nodeZzG.deepClone(true));
                    nodeZzG = nodeZzG.getNextSibling();
                }
                compositeNode = firstChild2;
            }
            ((CompositeNode) section5.appendChild(nodeZzG2.deepClone(false))).zzY(zzG(compositeNode, nodeZzG), zzG(compositeNodeZzZYq, nodeZzG2), null);
            i++;
        }
        this.zzZG3.removeAllChildren();
        for (int i2 = 0; i2 < this.zzXXf.size(); i2++) {
            this.zzZG3.appendChild(this.zzXXf.get(i2));
        }
    }

    private void zzYC1() {
        int nodeType = this.zzXXl.getNodeType();
        if (nodeType != 5) {
            if (nodeType == 6) {
                Row row = (Row) this.zzXXl;
                zzZI();
                zzT(16777216, "EndStory occurred in row, row will be deleted.");
                row.remove();
            } else {
                if (nodeType != 7) {
                    throw new IllegalStateException("End of story is out of sync.");
                }
                zzZI();
                Row row2 = (Row) this.zzXXl;
                zzZI();
                zzT(16777216, "EndStory occurred in a cell, row will be deleted.");
                row2.remove();
            }
        }
        Table table = (Table) this.zzXXl;
        zzZI();
        if (table.getRows().getCount() == 0) {
            table.remove();
        }
    }

    private void zzYC2() {
        Node firstChild = this.zzXXl.getFirstChild();
        if (this.zzXXl.zzZYr() != null || firstChild == null) {
            return;
        }
        for (Node nextSibling = firstChild; nextSibling != null; nextSibling = nextSibling.getNextSibling()) {
            if ((nextSibling instanceof zzZD7) && com.aspose.words.internal.zzZKN.zzS(((zzZD7) nextSibling).getName(), C18115b5.CONNECTOR, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                return;
            }
        }
        Node parentRow = this.zzXXl;
        Cell cell = (Cell) com.aspose.words.internal.zzZKW.zzZ(parentRow.zzYBd(), Cell.class);
        if (cell != null && cell.zzZYt() == this.zzXXl) {
            parentRow = cell.getParentRow().getFirstCell() == cell ? cell.getParentRow() : cell;
        }
        if (parentRow.getParentNode().zzT(firstChild)) {
            parentRow.getParentNode().zzZ(firstChild, (Node) null, parentRow);
        }
    }

    private static boolean zzYD(String str, String str2) {
        return com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZVR.zzWt(com.aspose.words.internal.zzZKN.zzW(str, IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS)).toLowerCase(), com.aspose.words.internal.zzZVR.zzWt(com.aspose.words.internal.zzZKN.zzW(str2, IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS)).toLowerCase());
    }

    private void zzYK(Node node) {
        if (this.zzXXl.zzT(node)) {
            this.zzXXl.zzA(node);
        } else {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXXi, node);
        }
    }

    private void zzZI() {
        zzYBZ();
        this.zzXXl = this.zzXXl.getParentNode();
    }

    private void zzj(Shape shape) throws Exception {
        if (this.zzYWO.getConvertMetafilesToPng() && shape != null && shape.zzZjT()) {
            byte[] imageBytes = shape.getImageData().getImageBytes();
            if (com.aspose.words.internal.zzEF.zzZH(imageBytes)) {
                shape.getImageData().zzY7(com.aspose.words.internal.zzEF.zzZz(imageBytes));
            }
        }
    }

    private static void zzk(Table table) {
        if (table.getFirstRow() != null) {
            zzY6G zzy6gZzZYf = table.getRows().get(0).zzZYf();
            Object objZzPk = zzy6gZzZYf.zzPk(4020);
            Object objZzPk2 = zzy6gZzZYf.zzPk(4320);
            Iterator<T> it = table.getRows().iterator();
            while (it.hasNext()) {
                zzY6G zzy6gZzZYf2 = ((Row) it.next()).zzZYf();
                if (objZzPk != null && zzy6gZzZYf2.zzPk(4020) == null) {
                    zzy6gZzZYf2.zzwx(108);
                }
                if (objZzPk2 != null && zzy6gZzZYf2.zzPk(4320) == null) {
                    zzy6gZzZYf2.zzwu(108);
                }
            }
        }
    }

    private void zzl(Table table) {
        Row row = table.getRows().get(0);
        row.zzZYf().zzQ(5112, Boolean.TRUE);
        int iIntValue = ((Integer) row.zzZYf().get(5102)).intValue();
        for (Row row2 : table.getRows()) {
            int iIntValue2 = ((Integer) row2.zzZYf().zzPj(5102)).intValue();
            if (iIntValue2 < iIntValue) {
                row = row2;
                iIntValue = iIntValue2;
            }
        }
        Cell firstCell = row.getFirstCell();
        int iIntValue3 = ((Integer) row.zzZYf().zzPj(5102)).intValue() + ((firstCell == null || !firstCell.zz6G().contains(3090)) ? row.zzZYf().getLeftPadding() : firstCell.zz6G().getLeftPadding());
        boolean zContains = table.getRows().get(0).zzZYf().contains(5111);
        int i = zContains ? 4260 : 4250;
        boolean zIsFloating = table.isFloating();
        for (Row row3 : table.getRows()) {
            zzY6G zzy6gZzZYf = row3.zzZYf();
            int iIntValue4 = ((Integer) zzy6gZzZYf.zzPj(5102)).intValue() - iIntValue;
            if (iIntValue4 != 0) {
                zzy6gZzZYf.zzQ(i, Integer.valueOf(iIntValue4));
            }
            if (!zIsFloating && iIntValue3 != 0 && !zzy6gZzZYf.contains(4340)) {
                zzy6gZzZYf.zzwa(iIntValue3);
            }
            if (zContains) {
                zzI(row3);
            }
        }
        if (this.zzYUj.zzYHB == 193) {
            Iterator<T> it = table.getChildNodes(18, true).iterator();
            while (it.hasNext()) {
                ((Shape) it.next()).zzYvW().zzQ(944, Boolean.FALSE);
            }
        }
    }

    private static boolean zzm(Table table) {
        if (table.getRows().getCount() == 0) {
            return false;
        }
        zzY6G zzy6gZzZYf = table.getRows().get(0).zzZYf();
        return zzy6gZzZYf.contains(5102) || zzy6gZzZYf.contains(5111);
    }

    private static void zzn(Table table) {
        for (Row row : table.getRows()) {
            if (!row.zzZYf().contains(4020)) {
                row.zzZYf().zzwx(0);
                if (!table.zzhk()) {
                    row.zzZYf().zzwa(row.zzZYf().zzYM7() + BackupEvent.ERROR_UID_NOT_EXIST);
                }
            }
            if (!row.zzZYf().contains(4320)) {
                row.zzZYf().zzwu(0);
            }
        }
    }

    private void zztK(int i) {
        if (this.zzXXl.getNodeType() == i && (i == 4 || i == 18)) {
            zzU(this.zzXXl);
        }
        while (this.zzXXl.getNodeType() != i) {
            zzYC1();
        }
    }

    private boolean zztL(int i) {
        return this.zzYR5.size() != 0 && this.zzYR5.peek().getNodeType() == i;
    }

    @Override // com.aspose.words.zzZBV
    public final void zzJE(String str) {
        if ("_PictureBullets".equals(str)) {
            return;
        }
        zzYK(new BookmarkEnd(this.zzZG3, str));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzQ(zzY6G zzy6g) {
        if (this.zzXXl.getNodeType() != 6) {
            throw new IllegalStateException("End of row is out of sync.");
        }
        Row row = (Row) this.zzXXl;
        if (zzy6g.zz5l() == null) {
            zzZI();
            row.remove();
            return;
        }
        row.zzZ(zzy6g);
        zzG(row);
        zzF(row);
        row.zzZYf().zzXXc();
        zzZNS.zzS(row.zzZYf());
        zzH(row);
        if (row.zzZYf().isFloating()) {
            row.zzYkc();
        }
        zzZI();
    }

    @Override // com.aspose.words.zzZBV
    public final void zzVa(boolean z) throws Exception {
        this.zzZG3.zzWz(z);
        if (this.zzXXh.size() != 0) {
            zzYBY();
        }
        if (this.zzYUj.zzYHB < 217 && this.zzXXc != 9) {
            zzYBX();
        }
        if (this.zzZG3.getNodeType() == 31) {
            zzYC0();
        }
    }

    @Override // com.aspose.words.zzZBV
    public final void zzX(char c, zzYEF zzyef) {
        if (zzW(c, zzyef)) {
            return;
        }
        this.zzXXl.zzA(new SpecialChar(this.zzZG3, c, zzyef));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzY(zzYMX zzymx, zzYEF zzyef) {
        while (this.zzXXl.getNodeType() == 27) {
            zzT(16777216, com.aspose.words.internal.zzZKN.format("Smart tag '{0}' ends after paragraph mark.", ((SmartTag) this.zzXXl).getElement()));
            zzYWB();
        }
        if (this.zzXXl.getNodeType() != 8) {
            throw new IllegalStateException("End of paragraph is out of sync.");
        }
        Paragraph paragraph = (Paragraph) this.zzXXl;
        paragraph.zzZ(zzymx);
        if (zzymx.getListId() > paragraph.getDocument().getLists().getCount()) {
            zzymx.zzxC(0);
        }
        paragraph.zzC((zzYEF) zzyef.zzbn());
        if (!this.zzYWO.zzZrB()) {
            zzZNS.zzZ(paragraph);
            if (zzZRA.zzDL(this.zzYUj.zzYHB)) {
                this.zzXXe.zzXU(paragraph);
            }
            if (paragraph.hasRevisions() && paragraph.zzZYj().zzYsN() != null) {
                zzZNS.zzZ((zzYMX) paragraph.zzZYj().zzYsN().zzZ6C());
            }
        }
        zzZI();
    }

    @Override // com.aspose.words.zzZBV
    public final void zzY8(byte[] bArr) {
        FieldStart fieldStart = (FieldStart) com.aspose.words.internal.zzZKW.zzZ(this.zzYR5.peek(), FieldStart.class);
        if (fieldStart != null) {
            fieldStart.zzYg(bArr);
        }
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYQ(String str, String str2) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            BuildingBlock buildingBlock = new BuildingBlock((GlossaryDocument) com.aspose.words.internal.zzZKW.zzZ(this.zzZG3, GlossaryDocument.class));
            buildingBlock.setName(str);
            buildingBlock.zzTa(str2);
            buildingBlock.setCategory("General");
            buildingBlock.setGallery(1);
            buildingBlock.zzR(com.aspose.words.internal.zzZZS.zzY(str));
            com.aspose.words.internal.zzZQG.zzZ(this.zzXXg, this.zzXXl);
            com.aspose.words.internal.zzZQG.zzZ(this.zzXXf, buildingBlock);
        }
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWB() {
        if (this.zzXXl.getNodeType() != 27) {
            return;
        }
        zzZI();
    }

    @Override // com.aspose.words.zzZBV
    public final SmartTag zzYWC() {
        SmartTag smartTag = new SmartTag(this.zzZG3);
        zzT(smartTag);
        return smartTag;
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWD() {
        if (this.zzXXl.getNodeType() != 7) {
            throw new IllegalStateException("End of cell is out of sync.");
        }
        zzZI();
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWE() {
        zzT(new Cell(this.zzZG3, null));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWF() {
        zzT(new Row(this.zzZG3, null));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWG() {
        if (this.zzXXl.getNodeType() != 5) {
            throw new IllegalStateException("End of table is out of sync.");
        }
        Table table = (Table) this.zzXXl;
        if (!this.zzYWO.zzZrB()) {
            zzk(table);
            if (zzm(table)) {
                zzl(table);
            }
            if (table.getFirstRow() != null && !table.getFirstRow().zzZYf().contains(4005)) {
                zzn(table);
            }
        }
        zzZI();
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWH() {
        zzT(new Table(this.zzZG3));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWI() {
        while (this.zzXXl.getNodeType() != 19) {
            if (this.zzXXl.getNodeType() == 6) {
                Row row = (Row) this.zzXXl;
                if (row.zzZYf() == null) {
                    row.zzZ(zzY6G.zzXXu());
                }
                zzZI();
            } else if (this.zzXXl.getNodeType() == 7) {
                Cell cell = (Cell) this.zzXXl;
                if (cell.zz6G() == null) {
                    cell.zzZ(new zzWP());
                }
                zzZI();
            } else if (this.zzXXl.getNodeType() == 5) {
                zzZI();
            }
        }
        zzZI();
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWJ() {
        zztK(20);
        zzZI();
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWK() {
        zztK(18);
        this.zzXXl = this.zzXXk;
        this.zzXXk = null;
        Shape shape = this.zzXXj;
        if (shape != null) {
            shape.removeAllChildren();
            if (this.zzXXj.zzZid() && !com.aspose.words.internal.zzZYD.zzXk(this.zzXXj.getOleFormat().getProgId())) {
                this.zzXXj.setShapeType(75);
            }
            this.zzXXj = null;
        }
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWL() {
        zzT(new Paragraph(this.zzZG3));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWM() {
        zzU(this.zzXXl);
        this.zzXXl = this.zzZG3;
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWN() {
        zztK(4);
        zzZI();
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWO() {
        zztK(3);
        zzZI();
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWP() {
        zzT(new Body(this.zzZG3));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWQ() {
        if (this.zzXXl.getNodeType() != 2) {
            throw new IllegalStateException("End of section is out of sync.");
        }
        zzZI();
    }

    @Override // com.aspose.words.zzZBV
    public final void zzYWR() {
        if (this.zzYWO.zzZrB()) {
            return;
        }
        if (this.zzYUj.zzYHB < 268) {
            zzZNS.zzW(this.zzZG3.getStyles());
        }
        Iterator<Style> it = this.zzZG3.getStyles().iterator();
        while (it.hasNext()) {
            zzZMI.zzV(it.next());
        }
    }

    @Override // com.aspose.words.zzZBV
    public final void zzZ(zzYCZ zzycz) {
        zzT(new Section(this.zzZG3, zzycz));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzZC(String str, int i) {
        if ("_PictureBullets".equals(str)) {
            return;
        }
        zzYK(new BookmarkStart(this.zzZG3, str, i));
    }

    @Override // com.aspose.words.zzZBV
    public final int zzZe6() {
        if (this.zzYR5.size() > 0) {
            return ((FieldChar) this.zzYR5.peek()).getFieldType();
        }
        return 0;
    }

    @Override // com.aspose.words.zzZBV
    public final void zza(ShapeBase shapeBase) throws Exception {
        if (shapeBase.canHaveImage()) {
            zzj((Shape) shapeBase);
        }
        if (shapeBase.isGroup() || !shapeBase.zzZtk()) {
            this.zzXXl.zzA(shapeBase);
        } else {
            this.zzZG3.getLists().zzo((Shape) shapeBase);
        }
    }

    @Override // com.aspose.words.zzZBV
    public final void zzt(Shape shape) {
        this.zzXXk = this.zzXXl;
        this.zzXXl = shape;
        if (shape.zzZid()) {
            this.zzXXj = shape;
        }
    }

    @Override // com.aspose.words.zzZBV
    public final void zzyp(int i) {
        zzYK(new CommentRangeEnd(this.zzZG3, i));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzyq(int i) {
        zzYK(new CommentRangeStart(this.zzZG3, i));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzyr(int i) {
        CompositeNode compositeNode = this.zzXXl;
        DocumentBase documentBase = this.zzZG3;
        if (compositeNode != documentBase) {
            throw new IllegalStateException("Footnote separators are expected to be processed at the document level.");
        }
        zzZMS zzzms = new zzZMS(documentBase, i);
        this.zzZG3.zzZpU().zzZ(i, zzzms);
        this.zzXXl = zzzms;
    }

    @Override // com.aspose.words.zzZBV
    public final void zzys(int i) {
        zzT(new HeaderFooter(this.zzZG3, i));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzZ(zzZMM zzzmm, zzYEF zzyef) {
        this.zzXXl.zzA(new FormField(this.zzZG3, zzzmm, zzyef));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzZ(zzYEF zzyef, zzYOC zzyoc) {
        FieldSeparator fieldSeparator = new FieldSeparator(this.zzZG3, zzyef, 0, zzyoc);
        if (!zztL(22)) {
            zzT(16777216, "Invalid field separator without field start occurred.");
        } else {
            this.zzXXl.zzA(fieldSeparator);
            this.zzYR5.push(fieldSeparator);
        }
    }

    private static Node zzG(Node node, Node node2) {
        if (node == null) {
            return null;
        }
        while (node.getParentNode() != null && node.getParentNode() != node2) {
            node = node.getParentNode();
        }
        return node;
    }

    private Shape zzS(FieldSeparator fieldSeparator) {
        Shape shape = this.zzXXj;
        if (shape != null) {
            return shape;
        }
        if (fieldSeparator == null) {
            return null;
        }
        Node nextSibling = fieldSeparator.getNextSibling();
        while (nextSibling != null && zzYVU.zztq(nextSibling.getNodeType())) {
            nextSibling = nextSibling.getNextSibling();
        }
        return (Shape) com.aspose.words.internal.zzZKW.zzZ(nextSibling, Shape.class);
    }

    @Override // com.aspose.words.zzZBV
    public final void zzT(int i, String str) {
        if (this.zzYWO.getWarningCallback() != null) {
            OooO00o.OooO0O0(this.zzYWO.getWarningCallback(), i, 10, str);
        }
    }

    @Override // com.aspose.words.zzZBV
    public final void zzZ(zzYEF zzyef, boolean z, boolean z2, boolean z3) throws Exception {
        FieldEnd fieldEnd = new FieldEnd(this.zzZG3, zzyef, 0, false);
        fieldEnd.isDirty(z2);
        fieldEnd.isLocked(z);
        fieldEnd.zzVY(z3);
        this.zzXXl.zzA(fieldEnd);
        zzZR4 zzzr4ZzS = zzS(fieldEnd);
        if (zzzr4ZzS.getStart() == null) {
            zzzr4ZzS.zzZg1();
            return;
        }
        int iZzZg2 = zzzr4ZzS.zzZg2();
        if (iZzZg2 != 0 && iZzZg2 != zzzr4ZzS.getStart().getFieldType()) {
            zzY1Z.zzZ(getWarningCallback(), 10, "Invalid field type specified while reading DOC file.", new Object[0]);
        } else {
            iZzZg2 = zzzr4ZzS.getStart().getFieldType();
        }
        if (zzzr4ZzS.getSeparator() == null && zzZOO.zzCF(iZzZg2) == 2) {
            zzzr4ZzS.zzX(new FieldSeparator(this.zzZG3, (zzYEF) zzyef.zzbn(), iZzZg2));
            this.zzXXl.insertBefore(zzzr4ZzS.getSeparator(), zzzr4ZzS.getEnd());
        }
        zzzr4ZzS.zzDJ(iZzZg2);
        zzzr4ZzS.zzZg0();
        zzzr4ZzS.getEnd().zzVU(zzzr4ZzS.getSeparator() != null);
        Shape shapeZzS = zzS(zzzr4ZzS.getSeparator());
        zzYC9.zzZ(zzzr4ZzS, shapeZzS, this.zzYWO);
        if (shapeZzS == null || shapeZzS.getShapeType() != 201) {
            return;
        }
        shapeZzS.zzYvW().zzQ(508, Boolean.FALSE);
    }

    private void zzT(CompositeNode compositeNode) {
        this.zzXXl.zzA(compositeNode);
        this.zzXXl = compositeNode;
        zzYBZ();
    }

    private static String zzT(String str, String[] strArr) {
        for (String str2 : strArr) {
            String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str2, ';');
            str = str.replace(strArrZzR[0], strArrZzR[1]);
        }
        return str;
    }

    @Override // com.aspose.words.zzZBV
    public final void zzY(String str, zzYEF zzyef) throws Exception {
        if (!this.zzYUj.zzZgX()) {
            this.zzXXl.zzA(new Run(this.zzZG3, str, zzyef));
            return;
        }
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ControlChar.PARAGRAPH_BREAK_CHAR);
        this.zzXXl.zzA(new Run(this.zzZG3, strArrZzR[0], zzyef));
        for (int i = 1; i < strArrZzR.length; i++) {
            if (this.zzXXl.getNodeType() == 8) {
                Paragraph paragraph = (Paragraph) this.zzXXl;
                zzY((zzYMX) paragraph.zzZYj().zzbn(), (zzYEF) paragraph.zzYp5().zzbn());
                zzYWL();
            }
            this.zzXXl.zzA(new Run(this.zzZG3, strArrZzR[i], zzyef));
        }
    }

    @Override // com.aspose.words.zzZBV
    public final void zzZ(int i, boolean z, String str, zzYEF zzyef) {
        zzT(new Footnote(this.zzZG3, i, z, str, zzyef));
    }

    @Override // com.aspose.words.zzZBV
    public final void zzY(zzYEF zzyef, int i, String str) {
        if (i == 1) {
            i = 0;
        }
        zzYC2();
        FieldStart fieldStart = new FieldStart(this.zzZG3, zzyef, i);
        this.zzXXl.zzA(fieldStart);
        this.zzYR5.push(fieldStart);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzXXh.put(fieldStart, str);
        }
    }

    @Override // com.aspose.words.zzZBV
    public final void zzZ(int i, int i2, String str, String str2, com.aspose.words.internal.zzZQ9 zzzq9, zzYEF zzyef) {
        Comment comment = new Comment(this.zzZG3, zzyef);
        comment.setIdInternal(i);
        comment.setInitial(str);
        comment.setAuthor(str2);
        comment.zzv(zzzq9);
        comment.setParentId(i2);
        zzT(comment);
    }

    @Override // com.aspose.words.zzZBV
    public final void zzZ(EditableRangeStart editableRangeStart) {
        editableRangeStart.zzY(this.zzZG3);
        zzYK(editableRangeStart);
    }

    @Override // com.aspose.words.zzZBV
    public final void zzZ(EditableRangeEnd editableRangeEnd) {
        editableRangeEnd.zzY(this.zzZG3);
        zzYK(editableRangeEnd);
    }

    @Override // com.aspose.words.zzZBV
    public final void zzZ(SubDocument subDocument) {
        this.zzXXl.zzA(subDocument);
    }
}
