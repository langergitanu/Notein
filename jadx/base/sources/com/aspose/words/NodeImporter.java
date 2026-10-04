package com.aspose.words;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class NodeImporter {
    private int zzXVg;
    private zzZME zzXVh;
    private boolean zzXVi;
    private boolean zzXVj;
    private ArrayList<BookmarkEnd> zzXVk;
    private ArrayList<BookmarkStart> zzXVl;
    private HashMap<String, String> zzXVm;
    private com.aspose.words.internal.zzX6 zzXVn;
    private com.aspose.words.internal.zzD3<com.aspose.words.internal.zzZYV<ShapeBase>> zzXVo;
    private com.aspose.words.internal.zzD3<ShapeBase> zzXVp;
    private com.aspose.words.internal.zzD3<ShapeBase> zzXVq;
    private zzZ86 zzYw1;

    public NodeImporter(DocumentBase documentBase, DocumentBase documentBase2, int i) {
        this(documentBase, documentBase2, new zzZ86(documentBase, documentBase2, i));
    }

    private Style zzE(Row row) {
        return this.zzYw1.zzYVG().zzZ(this.zzYw1, this.zzYw1.zzYVH().zzVp(((Integer) row.zzZYf().zzPj(4005)).intValue(), 11));
    }

    private String zzHG(String str) {
        int i = 0;
        while (true) {
            String str2 = com.aspose.words.internal.zzZKN.format("{0}_{1}", str, Integer.valueOf(i));
            if (!zzYAg().contains(str2)) {
                return str2;
            }
            i++;
        }
    }

    private void zzL(StructuredDocumentTag structuredDocumentTag) throws Exception {
        if (structuredDocumentTag.getXmlMapping().isEmpty() || !com.aspose.words.internal.zzZYD.zzXk(structuredDocumentTag.getXmlMapping().getStoreItemId())) {
            return;
        }
        CustomXmlPartCollection customXmlParts = this.zzYw1.zzYVI().zzYBa().getCustomXmlParts();
        if (zzZ(customXmlParts, structuredDocumentTag.getXmlMapping().getStoreItemId())) {
            return;
        }
        ArrayList<CustomXmlPart> arrayListZzZ = zzZ(customXmlParts, structuredDocumentTag.getXmlMapping());
        if (arrayListZzZ.size() == 1 && !zzZ(arrayListZzZ.get(0), structuredDocumentTag.getXmlMapping())) {
            structuredDocumentTag.getXmlMapping().zzyh(arrayListZzZ.get(0).getId());
            return;
        }
        CustomXmlPartCollection customXmlParts2 = this.zzYw1.zzYVJ().zzYBa().getCustomXmlParts();
        for (CustomXmlPart customXmlPart : zzZ(customXmlParts2, structuredDocumentTag.getXmlMapping())) {
            if (com.aspose.words.internal.zzZKO.zzA(customXmlPart, customXmlParts2.getById(structuredDocumentTag.getXmlMapping().getStoreItemId()))) {
                customXmlParts.add(customXmlPart.deepClone());
                return;
            }
        }
    }

    private void zzM(com.aspose.words.internal.zzZYV<ShapeBase> zzzyv) {
        for (int i = 0; i < zzzyv.getCount(); i++) {
            ShapeBase shapeBaseZzVY = zzzyv.zzVY(i);
            shapeBaseZzVY.zzm9(0);
            shapeBaseZzVY.zzm8(0);
            shapeBaseZzVY.zzYvW().set(138, 0);
            shapeBaseZzVY.zzYvW().set(4124, Integer.valueOf(this.zzYw1.zzYVI().zzZq0()));
        }
    }

    private boolean zzO(zzZAM zzzam) {
        return zzZi(zzzam.getParentParagraph_IInline());
    }

    private void zzV(Paragraph paragraph, Paragraph paragraph2) {
        if (paragraph.isListItem() && this.zzYw1.zzYVC().getCount() == 0) {
            this.zzYw1.zzXF(zzZl(paragraph));
        }
        if (paragraph.zzZYj().zz6D() && paragraph.zzZYj().zzZ7j() != 0) {
            zzZm(paragraph);
        }
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        zzYMX zzymxZzZYj2 = paragraph2.zzZYj();
        zzZ(zzymxZzZYj, zzymxZzZYj2, 1000);
        zzY(zzymxZzZYj, zzymxZzZYj2);
        if (zzymxZzZYj.zz6D()) {
            WordAttrCollection wordAttrCollectionZzZ6C = zzymxZzZYj.zzYsN().zzZ6C();
            WordAttrCollection wordAttrCollectionZzZ6C2 = zzymxZzZYj2.zzYsN().zzZ6C();
            zzZ(wordAttrCollectionZzZ6C, wordAttrCollectionZzZ6C2, 1000);
            zzY((zzYMX) wordAttrCollectionZzZ6C, (zzYMX) wordAttrCollectionZzZ6C2);
        }
        zzYEF zzyefZzYp5 = paragraph.zzYp5();
        zzYEF zzyefZzYp52 = paragraph2.zzYp5();
        zzZ(zzyefZzYp5, zzyefZzYp52, 50);
        if (zzyefZzYp5.zz6D()) {
            zzZ(zzyefZzYp5.zzYsN().zzZ6C(), zzyefZzYp52.zzYsN().zzZ6C(), 50);
        }
        if (this.zzYw1.zzZn1() == 0) {
            zzyefZzYp52.zzW(paragraph.zzqy(0).zzZYh());
        }
        if (zzymxZzZYj2.zzYpF() && !zzymxZzZYj2.zzVE(1320)) {
            zzymxZzZYj2.set(1320, paragraph.zzWn(1320, 0));
        }
        if (this.zzXVi && zzZi(paragraph)) {
            this.zzXVh.zzW(paragraph, paragraph2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzW(ShapeBase shapeBase, ShapeBase shapeBase2) {
        int iZzZHY = shapeBase.zzY9i().zzZHY();
        if ((iZzZHY == 9 || iZzZHY == 8) && shapeBase2.zzY9n() != null) {
            shapeBase2.zzZYh().zzYdB().zzZ(null);
        }
        int iZzZHY2 = shapeBase2.zzY9i().zzZHY();
        if (iZzZHY2 == 6) {
            zzD8 zzd8 = (zzD8) shapeBase2.zzY9i();
            if (this.zzYw1.zzZn1() == 1 && zzd8.zzZHM() == null && shapeBase.getDocument().zzZqI() != null) {
                zzd8.zzZ(shapeBase.getDocument().zzZqI().zzXVJ());
            }
        } else if (iZzZHY2 == 8) {
            zzZV(shapeBase2);
        } else if (iZzZHY2 == 13) {
        }
        if (!this.zzXVi || shapeBase2.zzY9a() == null) {
            return;
        }
        shapeBase2.zzY9a().getFill().zzW(shapeBase.getDocument().zzZqI());
    }

    private void zzX(ShapeBase shapeBase, ShapeBase shapeBase2) {
        if (shapeBase.getMarkupLanguage() == 0) {
            zzW(shapeBase, shapeBase2);
        } else if (shapeBase instanceof Shape) {
            int id = ((Shape) shapeBase2).getId();
            if (this.zzXVq.get(id) == null) {
                this.zzXVq.add(id, shapeBase2);
            }
        }
        Object obj = shapeBase2.zzYvW().get(4154);
        if (obj != null) {
            shapeBase2.setZOrder(((Integer) obj).intValue() + zzYAf());
        }
    }

    private Node zzY(Node node, boolean z, zzZA5 zzza5) throws Exception {
        if (node == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: srcNode");
        }
        Node nodeZzZ = node.zzZ(false, zzza5);
        nodeZzZ.zzY(this.zzYw1.zzYVI());
        if (z && node.isComposite()) {
            zzZ((CompositeNode) node, (CompositeNode) nodeZzZ, zzza5);
        }
        zzw(node, nodeZzZ);
        nodeZzZ.getDocument();
        nodeZzZ.getParentNode();
        return nodeZzZ;
    }

    private int zzYAf() {
        if (this.zzXVg == Integer.MIN_VALUE) {
            this.zzXVg = 0;
            Iterator<T> it = this.zzYw1.zzYVI().zzY(new int[]{18, 17}, true).iterator();
            while (it.hasNext()) {
                int zOrder = ((ShapeBase) ((Node) it.next())).getZOrder();
                if (zOrder > this.zzXVg) {
                    this.zzXVg = zOrder;
                }
            }
        }
        return this.zzXVg;
    }

    private com.aspose.words.internal.zzX6 zzYAg() {
        if (this.zzXVn == null) {
            this.zzXVn = new com.aspose.words.internal.zzX6();
            HashMap map = new HashMap();
            for (BookmarkEnd bookmarkEnd : this.zzYw1.zzYVI().getChildNodes(10, true)) {
                map.put(bookmarkEnd.getName(), bookmarkEnd);
            }
            for (BookmarkStart bookmarkStart : this.zzYw1.zzYVI().getChildNodes(9, true)) {
                if (map.containsKey(bookmarkStart.getName())) {
                    this.zzXVn.add(bookmarkStart.getName());
                }
            }
        }
        return this.zzXVn;
    }

    private void zzYAi() {
        Document document;
        Document document2 = (Document) com.aspose.words.internal.zzZKW.zzZ(this.zzYw1.zzYVJ(), Document.class);
        if (document2 == null || (document = (Document) com.aspose.words.internal.zzZKW.zzZ(this.zzYw1.zzYVI(), Document.class)) == null || document2.zzZqI() == null || document.zzZqI() != null) {
            return;
        }
        document.zzY(document2.zzZqI().zzXVK());
    }

    private void zzYAj() {
        zzYAn();
        zzYAm();
        this.zzXVq.clear();
        this.zzXVp.clear();
        this.zzXVo.clear();
    }

    private void zzYAl() {
        if (this.zzXVl.size() == this.zzXVk.size()) {
            for (int i = 0; i < this.zzXVl.size(); i++) {
                BookmarkStart bookmarkStart = this.zzXVl.get(i);
                BookmarkEnd bookmarkEnd = this.zzXVk.get(i);
                bookmarkStart.remove();
                bookmarkEnd.remove();
            }
        }
        this.zzXVl.clear();
        this.zzXVk.clear();
    }

    private void zzYAm() {
        for (ShapeBase shapeBase : this.zzXVp.zzCJ()) {
            zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
            DocumentBase documentBaseZzYVI = this.zzYw1.zzYVI();
            com.aspose.words.internal.zzZYV<ShapeBase> zzzyv = this.zzXVo.get(shapeBase.zzY9r());
            int iZzZpZ = documentBaseZzYVI.zzZpZ();
            if (zzzyv != null) {
                iZzZpZ = documentBaseZzYVI.zzXW(iZzZpZ, zzzyv.getCount());
            }
            zzyc3ZzYvW.set(4124, Integer.valueOf(iZzZpZ));
            int iZzY9r = shapeBase.zzY9r();
            if (zzzyv == null && zzyc3ZzYvW.get(138) != null) {
                shapeBase.zzma(0);
                zzyc3ZzYvW.set(138, 0);
            }
            if (shapeBase.zzY9r() > 0 && zzzyv != null) {
                shapeBase.zzma(documentBaseZzYVI.zzZpY());
            }
            if (zzzyv != null) {
                zzZ(shapeBase, zzzyv);
                if (iZzY9r > 0) {
                    this.zzXVo.zzVG(iZzY9r);
                }
            }
        }
        Iterator<com.aspose.words.internal.zzZYV<ShapeBase>> it = this.zzXVo.zzCJ().iterator();
        while (it.hasNext()) {
            zzM(it.next());
        }
    }

    private void zzYAn() {
        if (this.zzXVq.getCount() == 0) {
            return;
        }
        int iZzFV = DocumentBase.zzFV(this.zzYw1.zzYVI().zzZq0());
        int iMax = iZzFV;
        for (ShapeBase shapeBase : this.zzXVq.zzCJ()) {
            shapeBase.setId(shapeBase.getId() + iZzFV);
            iMax = Math.max(iMax, shapeBase.getId());
            if (shapeBase.zzY9A() != 0) {
                if (this.zzXVq.get(shapeBase.zzY9A()) == null) {
                    shapeBase.zzmb(0);
                } else {
                    shapeBase.zzmb(shapeBase.zzY9A() + iZzFV);
                    iMax = Math.max(iMax, shapeBase.zzY9A());
                }
            }
        }
        this.zzYw1.zzYVI().zzFW(iMax + 1);
    }

    private static com.aspose.words.internal.zzIM<Integer> zzYb(Node node) {
        com.aspose.words.internal.zzIM<Integer> zzim = new com.aspose.words.internal.zzIM<>();
        zzZ(node, zzim);
        if (node instanceof zzZAM) {
            zzim.add(0);
        }
        return zzim;
    }

    private boolean zzYc(Node node) {
        int i;
        int i2;
        StyleCollection styleCollectionZzYVH = this.zzYw1.zzYVH();
        StyleCollection styleCollectionZzYVG = this.zzYw1.zzYVG();
        Theme themeZzZqI = this.zzYw1.zzYVJ().zzZqI();
        Theme themeZzZqI2 = this.zzYw1.zzYVI().zzZqI();
        zzYEF zzyef = (zzYEF) styleCollectionZzYVH.zzY37().zzbn();
        zzYEF zzyef2 = (zzYEF) styleCollectionZzYVG.zzY37().zzbn();
        Theme.zzZ(themeZzZqI, zzyef);
        Theme.zzZ(themeZzZqI2, zzyef2);
        zzZ(zzyef, this.zzYw1.zzYVJ().getFontInfos());
        zzZ(zzyef2, this.zzYw1.zzYVI().getFontInfos());
        boolean z = (zzyef.zzW(zzyef2, (int[]) null) && styleCollectionZzYVH.zzY36().zzW(styleCollectionZzYVG.zzY36(), (int[]) null)) ? false : true;
        Iterator<Integer> it = zzYb(node).iterator();
        while (it.hasNext()) {
            Style styleZzZ8 = styleCollectionZzYVH.zzZ8(it.next().intValue(), false);
            if (styleZzZ8 != null) {
                Style styleZzm = styleCollectionZzYVG.zzm(styleZzZ8);
                if (styleZzm != null) {
                    if (z && styleZzZ8.getType() == 1) {
                        i = 33;
                        i2 = 65;
                    } else {
                        i = 32;
                        i2 = 64;
                    }
                    zzYEF zzyefZzl1 = styleZzZ8.zzl1(i);
                    zzYEF zzyefZzl12 = styleZzm.zzl1(i);
                    Theme.zzZ(themeZzZqI, zzyefZzl1);
                    Theme.zzZ(themeZzZqI2, zzyefZzl12);
                    if (!zzyefZzl1.zzW(zzyefZzl12, Style.zzXa8)) {
                        return false;
                    }
                    if (styleZzZ8.getType() != 2 && (!styleZzZ8.zzqw(i2).zzW(styleZzm.zzqw(i2), Style.zzXa8) || !zzY(styleZzZ8.zzY39(), styleZzm.zzY39()))) {
                        return false;
                    }
                } else if (styleZzZ8.getBuiltIn() && styleZzZ8.zzY3t() != 12287) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean zzYd(Node node) {
        BuildingBlock buildingBlock;
        return (node.getDocument() instanceof GlossaryDocument) && (buildingBlock = (BuildingBlock) node.getAncestor(32)) != null && !this.zzYw1.zzYVv().zzYF(buildingBlock) && (this.zzYw1.zzYVv() != buildingBlock || this.zzXVj);
    }

    private void zzYe(Node node) {
        Row row = (Row) node;
        row.zzZYf().zzQ(4005, Integer.valueOf(zzE(row).zzZ7j()));
        if (this.zzYw1.zzZn1() == 1) {
            zzY5K.zze(row);
        } else {
            zzY5J.zzd(row);
        }
    }

    private void zzYf(Node node) {
        if (this.zzYw1.zzZn1() == 1) {
            zzY5K.zzj((Cell) node);
        } else {
            zzY5J.zzi((Cell) node);
        }
    }

    private void zzZU(ShapeBase shapeBase) {
        int iZzY9q = shapeBase.zzY9q();
        if (!this.zzXVo.zzVE(iZzY9q)) {
            this.zzXVo.set(iZzY9q, new com.aspose.words.internal.zzZYV<>());
        }
        this.zzXVo.get(iZzY9q).set(shapeBase.zzY9p(), shapeBase);
    }

    private void zzZV(ShapeBase shapeBase) {
        if (shapeBase.zzY9q() > 0) {
            zzZU(shapeBase);
        }
        if (shapeBase.zzY9r() > 0) {
            this.zzXVp.add(shapeBase.zzY9r(), shapeBase);
        }
    }

    private boolean zzZh(Paragraph paragraph) {
        Shape shape;
        return this.zzYw1.zzYVu().getIgnoreTextBoxes() || (shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYBd(), Shape.class)) == null || !shape.zzY9o();
    }

    private boolean zzZi(Paragraph paragraph) {
        if (paragraph == null || (paragraph.getDocument() instanceof GlossaryDocument)) {
            return false;
        }
        Story parentStory = paragraph.getParentStory();
        boolean z = this.zzYw1.zzYVv().getNodeType() == 1 || this.zzYw1.zzYVv().getNodeType() == 2;
        boolean z2 = (parentStory == null || parentStory.getStoryType() == 1) ? false : true;
        if (z && z2 && this.zzYw1.zzYVu().getIgnoreHeaderFooter()) {
            return false;
        }
        CompositeNode parentNode = paragraph.getParentNode();
        if (parentNode != null && zzYVU.zzl(parentNode, this.zzYw1.zzYVv())) {
            if (parentNode.getNodeType() == 20 || parentNode.getNodeType() == 19) {
                return false;
            }
            if ((paragraph.zzYBd() instanceof Shape) && zzZh(paragraph)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzZj(Paragraph paragraph) {
        for (Node node : paragraph.getChildNodes(0, false)) {
            if (!zzYVU.zztq(node.getNodeType()) && node.getNodeType() != 21) {
                return false;
            }
            if (node.getNodeType() == 21 && com.aspose.words.internal.zzZYD.zzXk(((Run) node).getText())) {
                return false;
            }
        }
        return true;
    }

    private static Paragraph zzZk(Paragraph paragraph) {
        for (Node previousSibling = paragraph.getPreviousSibling(); previousSibling != null; previousSibling = previousSibling.getPreviousSibling()) {
            if (previousSibling.getNodeType() == 8) {
                Paragraph paragraph2 = (Paragraph) previousSibling;
                if (!zzZj(paragraph2)) {
                    return paragraph2;
                }
            }
        }
        return null;
    }

    private long zzZl(Paragraph paragraph) {
        Paragraph paragraphZzZk;
        if (!this.zzYw1.zzYVu().zzYVt() && (paragraphZzZk = zzZk(paragraph)) != null) {
            if (zzV(paragraphZzZk) < zzV(paragraph)) {
                return paragraph.getListFormat().getList().zzYP8();
            }
        }
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    private void zzZm(Paragraph paragraph) {
        zzM(paragraph.zzqy(0));
        zzM(paragraph.zzqy(1));
    }

    private void zzv(Node node, Node node2) throws Exception {
        if (node.getNodeType() != 29) {
            StructuredDocumentTagRangeEnd structuredDocumentTagRangeEnd = (StructuredDocumentTagRangeEnd) node;
            ((StructuredDocumentTagRangeEnd) node2).setIdInternal(this.zzYw1.zzYVy().zzVE(structuredDocumentTagRangeEnd.getId()) ? this.zzYw1.zzYVy().get(structuredDocumentTagRangeEnd.getId()) : structuredDocumentTagRangeEnd.getId());
            return;
        }
        StructuredDocumentTagRangeStart structuredDocumentTagRangeStart = (StructuredDocumentTagRangeStart) node;
        StructuredDocumentTagRangeStart structuredDocumentTagRangeStart2 = (StructuredDocumentTagRangeStart) node2;
        structuredDocumentTagRangeStart2.zzm((StructuredDocumentTag) structuredDocumentTagRangeStart.zzYcK().deepClone(false));
        structuredDocumentTagRangeStart2.setId(structuredDocumentTagRangeStart2.zzYcK().getId());
        if (this.zzYw1.zzYVy().zzVE(structuredDocumentTagRangeStart.getId())) {
            this.zzYw1.zzYVy().zzVG(structuredDocumentTagRangeStart.getId());
        }
        this.zzYw1.zzYVy().add(structuredDocumentTagRangeStart.getId(), structuredDocumentTagRangeStart2.getId());
        zzL(structuredDocumentTagRangeStart2.zzYcK());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zzw(Node node, Node node2) throws Exception {
        if (node instanceof ShapeBase) {
            zzX((ShapeBase) node, (ShapeBase) node2);
        } else if (node instanceof zzZAM) {
            zzY((zzZAM) node, (zzZAM) node2);
        } else if (node instanceof Paragraph) {
            zzV((Paragraph) node, (Paragraph) node2);
        } else if (node instanceof Row) {
            zzYe(node2);
        } else if (node instanceof Cell) {
            zzYf(node2);
        } else if (node instanceof StructuredDocumentTag) {
            zzZ((StructuredDocumentTag) node, (StructuredDocumentTag) node2);
        } else if ((node instanceof StructuredDocumentTagRangeStart) || (node instanceof StructuredDocumentTagRangeEnd)) {
            zzv(node, node2);
        } else if (node instanceof BookmarkStart) {
            zzZ((BookmarkStart) node, (BookmarkStart) node2);
        } else if (node instanceof BookmarkEnd) {
            zzZ((BookmarkEnd) node, (BookmarkEnd) node2);
        }
        if (node instanceof zzZA1) {
            zzZ((zzZA1) node, (zzZA1) node2);
        }
    }

    private static GlossaryDocument zzx(DocumentBase documentBase) {
        GlossaryDocument glossaryDocument = documentBase.getNodeType() == 31 ? (GlossaryDocument) documentBase : ((Document) documentBase).getGlossaryDocument();
        if (glossaryDocument != null) {
            return glossaryDocument;
        }
        Document document = (Document) documentBase;
        document.setGlossaryDocument(new GlossaryDocument());
        return document.getGlossaryDocument();
    }

    public Node importNode(Node node, boolean z) {
        return zzZ(node, z, (zzZA5) null);
    }

    public final zzZ86 zzYAh() {
        return this.zzYw1;
    }

    public final void zzYAk() {
        try {
            CustomXmlPart customXmlPartZzZTG = this.zzYw1.zzYVJ().zzYBa().getCustomXmlParts().zzZTG();
            if (customXmlPartZzZTG == null) {
                return;
            }
            CustomXmlPartCollection customXmlParts = this.zzYw1.zzYVI().zzYBa().getCustomXmlParts();
            CustomXmlPart customXmlPartZzZTG2 = customXmlParts.zzZTG();
            if (customXmlPartZzZTG2 != null) {
                zzZ(customXmlPartZzZTG2, customXmlPartZzZTG);
            } else {
                if (zzZ(customXmlPartZzZTG)) {
                    return;
                }
                customXmlParts.add(customXmlPartZzZTG.deepClone());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final Node zzZ(Node node, boolean z, zzZA5 zzza5) {
        try {
            this.zzYw1.zzZ4(node);
            this.zzXVi = (this.zzYw1.zzZn1() != 1 || this.zzYw1.zzYVu().getForceCopyStyles() || zzYc(node)) ? false : true;
            this.zzXVj = true;
            zzY82 zzy82 = new zzY82(this.zzYw1.zzYVI());
            try {
                Node nodeZzY = zzY(node, z, zzza5);
                zzYAj();
                zzYAl();
                return nodeZzY;
            } finally {
                zzy82.dispose();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NodeImporter(DocumentBase documentBase, DocumentBase documentBase2, int i, ImportFormatOptions importFormatOptions) {
        this(documentBase, documentBase2, new zzZ86(documentBase, documentBase2, i, importFormatOptions));
    }

    public NodeImporter(DocumentBase documentBase, DocumentBase documentBase2, zzZ86 zzz86) {
        this.zzXVq = new com.aspose.words.internal.zzD3<>();
        this.zzXVp = new com.aspose.words.internal.zzD3<>();
        this.zzXVo = new com.aspose.words.internal.zzD3<>();
        this.zzXVm = new HashMap<>();
        this.zzXVl = new ArrayList<>();
        this.zzXVk = new ArrayList<>();
        this.zzXVg = Integer.MIN_VALUE;
        if (documentBase == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: srcDoc");
        }
        if (documentBase2 != null) {
            this.zzYw1 = zzz86;
            zzYAi();
            documentBase2.getFontInfos().zzY(documentBase.getFontInfos());
            this.zzXVh = new zzZME(this.zzYw1);
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dstDoc");
    }

    private void zzM(Style style) {
        if (style.getBuiltIn()) {
            StyleCollection styleCollectionZzYVG = this.zzYw1.zzYVG();
            if (styleCollectionZzYVG.zzm(style) != null) {
                return;
            }
            styleCollectionZzYVG.addCopy(styleCollectionZzYVG.zzY32().zzZ7(style.getStyleIdentifier(), false));
        }
    }

    public final void zzY(CompositeNode compositeNode, CompositeNode compositeNode2) throws Exception {
        this.zzYw1.zzZ4(compositeNode);
        this.zzXVi = (this.zzYw1.zzZn1() != 1 || this.zzYw1.zzYVu().getForceCopyStyles() || zzYc(compositeNode)) ? false : true;
        this.zzXVj = false;
        zzZ(compositeNode, compositeNode2, (zzZA5) null);
        zzYAj();
        zzYAl();
    }

    private void zzZ(ShapeBase shapeBase, com.aspose.words.internal.zzZYV<ShapeBase> zzzyv) {
        int count = zzzyv.getCount();
        int iZzY9r = shapeBase.zzY9r();
        int iZzZq0 = this.zzYw1.zzYVI().zzZq0();
        shapeBase.zzYvW().set(138, Integer.valueOf(iZzZq0));
        int i = 0;
        while (i < count) {
            ShapeBase shapeBaseZzVY = zzzyv.zzVY(i);
            int i2 = i + 1;
            if (shapeBaseZzVY.zzY9p() > i2) {
                shapeBaseZzVY.zzm8(0);
                shapeBase.zzYvW().set(138, 0);
                iZzY9r = 0;
            }
            shapeBaseZzVY.zzm9(iZzY9r);
            shapeBaseZzVY.zzYvW().set(4124, Integer.valueOf(iZzZq0));
            if (i < count - 1) {
                iZzZq0 = iZzY9r > 0 ? this.zzYw1.zzYVI().zzZq0() : 0;
                shapeBaseZzVY.zzYvW().set(138, Integer.valueOf(iZzZq0));
            }
            i = i2;
        }
    }

    private void zzY(zzZAM zzzam, zzZAM zzzam2) {
        zzYEF runPr_IInline = zzzam.getRunPr_IInline();
        zzYEF runPr_IInline2 = zzzam2.getRunPr_IInline();
        zzZ(runPr_IInline, runPr_IInline2, 50);
        if (zzzam.getRunPr_IInline().zz6D()) {
            zzZ(runPr_IInline.zzYsN().zzZ6C(), runPr_IInline2.zzYsN().zzZ6C(), 50);
        }
        if (this.zzXVi && zzO(zzzam)) {
            this.zzXVh.zzZ(zzzam, zzzam2);
        }
    }

    private void zzY(zzYMX zzymx, zzYMX zzymx2) {
        zzZ(zzymx, zzymx2, this.zzYw1);
    }

    public static void zzZ(zzYMX zzymx, zzYMX zzymx2, zzZ86 zzz86) {
        int listId;
        List listByListId;
        Object objZzVv;
        int listId2 = zzymx.getListId();
        if (listId2 == 0) {
            Style styleZzZ8 = zzz86.zzYVG().zzZ8(zzymx2.zzZ7j(), false);
            if (styleZzZ8 == null || (listByListId = zzz86.zzYVE().getListByListId((listId = styleZzZ8.zzZYj().getListId()))) == null || (objZzVv = styleZzZ8.zzVv(EditingLanguage.GALICIAN, 1)) == null) {
                return;
            }
            Integer num = (Integer) objZzVv;
            Style linkedStyle = listByListId.zzxw(num.intValue()).getLinkedStyle();
            if (linkedStyle == null || linkedStyle.zzZ7j() == styleZzZ8.zzZ7j()) {
                return;
            }
            zzymx2.set(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(listId));
            zzymx2.set(EditingLanguage.GALICIAN, num);
            return;
        }
        boolean z = zzz86.zzYVI() == zzz86.zzYVJ();
        zzymx2.set(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(z ? listId2 : zzz86.zzYVE().zzZ(zzz86, listId2)));
        List listByListId2 = zzz86.zzYVF().getListByListId(listId2);
        if (listByListId2 == null || z || zzz86.zzYVB().zzVE(listByListId2.zzYP8())) {
            return;
        }
        ListLevel listLevelZzZ = zzz86.zzYVE().zzZ(zzymx2, 0);
        ListLevel listLevelZzZ2 = zzz86.zzYVF().zzZ(zzymx, 0);
        zzZ84 zzz84 = new zzZ84(listLevelZzZ2.zzZYj(), listLevelZzZ.zzZYj());
        zzYMX zzymx3 = (zzYMX) listLevelZzZ2.zzZYj().zzbn();
        zzymx3.zzX(listLevelZzZ.zzZYj());
        zzymx3.zzZ(zzymx2, zzz84);
    }

    private boolean zzY(List list, List list2) {
        if (com.aspose.words.internal.zzZ4.zzZ(list, list2)) {
            return false;
        }
        if (com.aspose.words.internal.zzZ4.zzX(list, list2)) {
            return true;
        }
        if (list.getListId() != list2.getListId() && !this.zzYw1.zzYVu().getKeepSourceNumbering()) {
            return true;
        }
        zzZ4J zzz4jZzxr = this.zzYw1.zzYVE().zzxr(list.zzYPa().zzYP8());
        if (zzz4jZzxr == null || !this.zzYw1.zzyh(zzz4jZzxr.zzYP8())) {
            return list.equals(list2);
        }
        return true;
    }

    private static int zzV(zzZ9Q zzz9q) {
        return ((Integer) zzz9q.fetchParaAttr(EditingLanguage.CENTRAL_KURDISH_IRAQ)).intValue() + ((Integer) zzz9q.fetchParaAttr(1160)).intValue();
    }

    private void zzZ(CompositeNode compositeNode, CompositeNode compositeNode2, zzZA5 zzza5) throws Exception {
        if (compositeNode != null) {
            if (compositeNode.getDocument() != this.zzYw1.zzYVJ()) {
                throw new IllegalArgumentException("srcContainer should belong to the source document.");
            }
            if (compositeNode2 != null) {
                if (compositeNode2.getDocument() == this.zzYw1.zzYVI()) {
                    for (Node firstChild = compositeNode.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                        compositeNode2.appendChild(zzY(firstChild, true, zzza5));
                    }
                    return;
                }
                throw new IllegalArgumentException("dstContainer should belong to the destination document.");
            }
            throw new NullPointerException("Value cannot be null.\r\nParameter name: dstContainer");
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: srcContainer");
    }

    private void zzZ(StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2) throws Exception {
        if (structuredDocumentTag.getDocument() != structuredDocumentTag2.getDocument()) {
            structuredDocumentTag2.setId(structuredDocumentTag.getId());
        }
        if (!this.zzYw1.zzYVy().zzVE(structuredDocumentTag.getId())) {
            this.zzYw1.zzYVy().add(structuredDocumentTag.getId(), structuredDocumentTag2.getId());
        }
        if (structuredDocumentTag.zzY3J().getCount() != 0) {
            zzZ(structuredDocumentTag.zzY3J(), structuredDocumentTag2.zzY3J(), 50);
        }
        if (structuredDocumentTag.zzY3I().getCount() != 0) {
            zzZ(structuredDocumentTag.zzY3I(), structuredDocumentTag2.zzY3I(), 50);
        }
        zzZ(structuredDocumentTag2, structuredDocumentTag2.getPlaceholder());
        zzL(structuredDocumentTag2);
    }

    private static void zzZ(StructuredDocumentTag structuredDocumentTag, BuildingBlock buildingBlock) {
        if (buildingBlock != null) {
            GlossaryDocument glossaryDocumentZzx = zzx(structuredDocumentTag.getDocument());
            if (zzZ(glossaryDocumentZzx, buildingBlock)) {
                glossaryDocumentZzx.appendChild((BuildingBlock) glossaryDocumentZzx.importNode(buildingBlock, true));
            }
            structuredDocumentTag.zzQk(true);
        }
    }

    private static boolean zzZ(GlossaryDocument glossaryDocument, BuildingBlock buildingBlock) {
        if (buildingBlock.getDocument() == glossaryDocument) {
            return false;
        }
        if (buildingBlock.getType() != 2) {
            return true;
        }
        Iterator<T> it = glossaryDocument.getBuildingBlocks().iterator();
        while (it.hasNext()) {
            if (com.aspose.words.internal.zzZOZ.zzZ(buildingBlock.zz7i(), ((BuildingBlock) it.next()).zz7i())) {
                return false;
            }
        }
        return !zzYD3.zzBh(buildingBlock.getName());
    }

    private static boolean zzZ(CustomXmlPartCollection customXmlPartCollection, String str) {
        Iterator<CustomXmlPart> it = customXmlPartCollection.iterator();
        while (it.hasNext()) {
            if (com.aspose.words.internal.zzZKN.equals(it.next().getId(), str)) {
                return true;
            }
        }
        return false;
    }

    private void zzZ(zzZA1 zzza1, zzZA1 zzza12) {
        com.aspose.words.internal.zzD4 zzd4ZzYVz = this.zzYw1.zzYVz();
        int iZzZpW = zzd4ZzYVz.get(zzza1.getIdInternal());
        if (com.aspose.words.internal.zzD4.zzWm(iZzZpW)) {
            iZzZpW = this.zzYw1.zzYVI().zzZpW();
            zzd4ZzYVz.set(zzza1.getIdInternal(), iZzZpW);
        }
        zzza12.setIdInternal(iZzZpW);
        if (zzza1.getParentIdInternal() != -1) {
            zzza12.setParentIdInternal(zzd4ZzYVz.get(zzza1.getParentIdInternal()));
        }
    }

    private void zzZ(BookmarkStart bookmarkStart, BookmarkStart bookmarkStart2) {
        if (zzYd(bookmarkStart)) {
            return;
        }
        String name = bookmarkStart.getName();
        if (zzYAg().contains(name)) {
            if ("_GoBack".equals(bookmarkStart.getName())) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzXVl, bookmarkStart2);
            }
            String strZzHG = zzHG(name);
            zzYAg().add(strZzHG);
            this.zzXVm.put(name, strZzHG);
            bookmarkStart2.zzTh(strZzHG);
            return;
        }
        zzYAg().add(name);
    }

    private void zzZ(BookmarkEnd bookmarkEnd, BookmarkEnd bookmarkEnd2) {
        String str = (String) com.aspose.words.internal.zzQW.zzZ(this.zzXVm, bookmarkEnd.getName());
        if (str != null) {
            if ("_GoBack".equals(bookmarkEnd.getName())) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzXVk, bookmarkEnd2);
            }
            bookmarkEnd2.zzTh(str);
            com.aspose.words.internal.zzZQF.zzY(this.zzXVm, bookmarkEnd.getName());
        }
    }

    private void zzZ(zzZS zzzs, zzZS zzzs2, int i) {
        Style styleZzZ8 = this.zzYw1.zzYVH().zzZ8(((Integer) zzzs.zzPj(i)).intValue(), false);
        if (styleZzZ8 != null && !zzY8O.zzd(styleZzZ8)) {
            int iZzZn1 = this.zzYw1.zzZn1();
            if (this.zzYw1.zzZn1() == 1 && !this.zzYw1.zzYVu().getForceCopyStyles()) {
                this.zzYw1.zzyg(0);
            }
            Style styleZzZ = this.zzYw1.zzYVG().zzZ(this.zzYw1, styleZzZ8);
            if (styleZzZ.getStyleIdentifier() == 0) {
                zzzs2.remove(i);
            } else {
                zzzs2.zzQ(i, Integer.valueOf(styleZzZ.zzZ7j()));
            }
            this.zzYw1.zzyg(iZzZn1);
            return;
        }
        zzzs2.remove(i);
    }

    private static void zzZ(zzYEF zzyef, FontInfoCollection fontInfoCollection) {
        zzZ(zzyef, 230, fontInfoCollection);
        zzZ(zzyef, 235, fontInfoCollection);
        zzZ(zzyef, 270, fontInfoCollection);
        zzZ(zzyef, 240, fontInfoCollection);
    }

    private static void zzZ(zzYEF zzyef, int i, FontInfoCollection fontInfoCollection) {
        zzU1 zzu1 = (zzU1) com.aspose.words.internal.zzZKW.zzZ(zzyef.get(i), zzU1.class);
        if (zzu1 == null || zzu1.zzZYI() || com.aspose.words.internal.zzZYD.zzXg(zzu1.getName())) {
            return;
        }
        for (FontInfo fontInfo : fontInfoCollection) {
            if (com.aspose.words.internal.zzZKN.equals(zzu1.getName(), fontInfo.getName()) && fontInfo.getAltName().length() != 0 && com.aspose.words.internal.zzZYD.zzXg(fontInfo.getAltName())) {
                zzyef.set(i, zzU1.zzSP(fontInfo.getAltName()));
                return;
            }
        }
    }

    private static void zzZ(Node node, com.aspose.words.internal.zzIM<Integer> zzim) {
        if (node.isComposite()) {
            Iterator<V> it = ((CompositeNode) node).iterator();
            while (it.hasNext()) {
                zzZ((Node) it.next(), zzim);
            }
        }
        zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class);
        if (zzzam != null) {
            zzZ(zzim, zzzam.getRunPr_IInline(), 50);
        } else if (node.getNodeType() == 8) {
            zzZ(zzim, ((Paragraph) node).zzZYj(), 1000);
        }
    }

    private static void zzZ(com.aspose.words.internal.zzIM<Integer> zzim, WordAttrCollection wordAttrCollection, int i) {
        zzim.add((Integer) wordAttrCollection.zzVR(i, 0));
        zzim.add((Integer) wordAttrCollection.zzVR(i, 1));
    }

    private static ArrayList<CustomXmlPart> zzZ(CustomXmlPartCollection customXmlPartCollection, XmlMapping xmlMapping) throws Exception {
        ArrayList<CustomXmlPart> arrayList = new ArrayList<>();
        for (CustomXmlPart customXmlPart : customXmlPartCollection) {
            if (zzKM.zzZ(customXmlPart.getData(), xmlMapping.getXPath(), xmlMapping.getPrefixMappings(), null, null).size() > 0) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, customXmlPart);
            }
        }
        return arrayList;
    }

    private static boolean zzZ(CustomXmlPart customXmlPart, XmlMapping xmlMapping) throws Exception {
        ArrayList<org.w3c.dom.Node> arrayListZzZ = zzKM.zzZ(customXmlPart.getData(), xmlMapping.getXPath(), xmlMapping.getPrefixMappings(), null, null);
        boolean z = false;
        if (arrayListZzZ.size() > 0) {
            String strZzm = zzKM.zzm(arrayListZzZ);
            if (com.aspose.words.internal.zzZYD.zzXk(strZzm) && strZzm.contains("<pkg:package")) {
                com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzZO0.zzhV().getBytes(strZzm));
                try {
                    int loadFormat = FileFormatUtil.zzZb(zzzor).getLoadFormat();
                    if (loadFormat != 255 && loadFormat != 62) {
                        z = true;
                    }
                    return z;
                } finally {
                    zzzor.close();
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        throw r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(CustomXmlPart customXmlPart, CustomXmlPart customXmlPart2) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(customXmlPart.getData());
        try {
            org.w3c.dom.Document documentZzX = com.aspose.words.internal.zzZSN.zzX(zzzor, true);
            if (documentZzX.getDocumentElement() != null && "b:Sources".equals(documentZzX.getDocumentElement().getNodeName())) {
                zzzor = new com.aspose.words.internal.zzZOR(customXmlPart2.getData());
                org.w3c.dom.Document documentZzX2 = com.aspose.words.internal.zzZSN.zzX(zzzor, true);
                if (documentZzX2.getDocumentElement() != null && "b:Sources".equals(documentZzX2.getDocumentElement().getNodeName())) {
                    for (int i = 0; i < documentZzX2.getDocumentElement().getChildNodes().getLength(); i++) {
                        documentZzX.getDocumentElement().appendChild(documentZzX.importNode(documentZzX2.getDocumentElement().getChildNodes().item(i), true));
                    }
                    com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
                    com.aspose.words.internal.zzZSN.zzZ(documentZzX, (com.aspose.words.internal.zzZOP) zzzor2);
                    customXmlPart.setData(com.aspose.words.internal.zzZYQ.zzZX(zzzor2));
                    zzzor.close();
                }
            }
        } finally {
        }
    }

    private static boolean zzZ(CustomXmlPart customXmlPart) throws Exception {
        if (customXmlPart == null) {
            return true;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(customXmlPart.getData());
        try {
            org.w3c.dom.Document documentZzX = com.aspose.words.internal.zzZSN.zzX(zzzor, true);
            if (documentZzX.getDocumentElement() != null && "b:Sources".equals(documentZzX.getDocumentElement().getNodeName())) {
                return documentZzX.getDocumentElement().getChildNodes().getLength() == 0;
            }
            return true;
        } finally {
            zzzor.close();
        }
    }
}
