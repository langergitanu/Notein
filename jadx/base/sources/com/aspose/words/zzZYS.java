package com.aspose.words;

import com.aspose.slides.PatternStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYS extends DocumentVisitor {
    private zzYL3 zzYQZ;
    private zzI zzYR4;
    private LoadOptions zzYWO;
    private com.aspose.words.internal.zzZQC<FieldChar> zzYR5 = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<Table> zzYR3 = new com.aspose.words.internal.zzZQC<>();
    private zzY6L zzYR2 = new zzY6L();
    private zzY40 zzYR1 = new zzY40();
    private zzXYV zzYR0 = new zzXYV();

    private IWarningCallback getWarningCallback() {
        LoadOptions loadOptions = this.zzYWO;
        if (loadOptions != null) {
            return loadOptions.getWarningCallback();
        }
        return null;
    }

    private void zzF(Document document) {
        if (this.zzYR5.size() == 0) {
            return;
        }
        while (this.zzYR5.size() > 0) {
            FieldChar fieldCharPop = this.zzYR5.pop();
            if (this.zzYR5.size() > 0 && this.zzYR5.peek().getNodeType() == 22 && fieldCharPop.getNodeType() == 23) {
                zzZ(document, (FieldSeparator) fieldCharPop);
            } else {
                fieldCharPop.remove();
            }
        }
        zzY1Z.zzZ(getWarningCallback(), 16777216, 17, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{110, 73, 97, 118, 105, 108, 32, 100, 105, 102, 108, 101, 115, 100, 119, 32, 114, 101, 32, 101, 112, 117, 97, 100, 101, 116, 32, 100, 114, 111, 114, 32, 109, 101, 118, 111, 100, 101, PatternStyle.Divot}));
    }

    private void zzG(Document document) throws Exception {
        zzY0C.zzZM(document);
        zzF(document);
    }

    private void zzH(ShapeBase shapeBase) throws Exception {
        if (shapeBase.zzY9n() != null) {
            shapeBase.zzY9n().accept(this);
            shapeBase.zzYa0();
        }
    }

    private void zzL(Shape shape) throws Exception {
        if (shape.hasImage()) {
            if (com.aspose.words.internal.zzAN.zzZD(shape.getWidth()) && com.aspose.words.internal.zzAN.zzZD(shape.getHeight())) {
                zzY("Image has zero dimensions, used defaults.", new Object[0]);
                shape.zzWf(ShapeBase.zzXn6);
                shape.zzWe(ShapeBase.zzXn6);
            }
            if (!shape.zzYvW().contains(4131)) {
                shape.zzWf(50.25d);
            }
            if (shape.zzYvW().contains(4132)) {
                return;
            }
            shape.zzWe(50.25d);
        }
    }

    private void zzM(Shape shape) throws Exception {
        if (shape.zzZid() && shape.getOleFormat().zzYrB() == null) {
            int iZzYyi = shape.zzYyi();
            if (iZzYyi != 1) {
                if (iZzYyi == 2) {
                    return;
                }
                if (iZzYyi != 3) {
                    throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{110, 85, 120, 101, 101, 112, 116, 99, 100, 101, 79, 32, 69, 76, 111, 32, 106, 98, 99, 101, 32, 116, 121, 116, 101, 112, PatternStyle.Divot}));
                }
            }
            zzY("Embedded OLE object without data found, converted to image.", new Object[0]);
            shape.setShapeType(75);
        }
    }

    private static void zzN(Shape shape) throws Exception {
        zzUD zzudZzY;
        if (shape.zzY9I()) {
            zzYC3 zzyc3ZzYvW = shape.zzYvW();
            String str = (String) zzyc3ZzYvW.get(4113);
            zzYOC zzyoc = (zzYOC) com.aspose.words.internal.zzZKW.zzZ(zzyc3ZzYvW.get(4112), zzYOC.class);
            if (com.aspose.words.internal.zzZYD.zzXk(str) || zzyoc == null || (zzudZzY = zzUD.zzY(zzyoc.zzYrr())) == null || !com.aspose.words.internal.zzZYD.zzXk(zzudZzY.getProgId())) {
                return;
            }
            shape.setShapeAttr(4113, zzudZzY.getProgId());
        }
    }

    private void zzR(DocumentBase documentBase) {
        zzY(documentBase.getLists());
        zzZ(documentBase.getStyles());
        zzZ(documentBase.zzZq2());
        this.zzYR4 = new zzI(documentBase, null, getWarningCallback());
    }

    private static void zzU(Table table) {
        zzY6G zzy6gZzZYf;
        if (table == null || table.getFirstRow() == null || (zzy6gZzZYf = table.getFirstRow().zzZYf()) == null) {
            return;
        }
        int iZzYka = zzy6gZzZYf.zzYka();
        int iZzYk9 = zzy6gZzZYf.zzYk9();
        int iZzXXe = zzy6gZzZYf.zzXXe();
        if (iZzYka == 0 && iZzYk9 == 0 && iZzXXe == 0) {
            return;
        }
        Iterator<T> it = table.getRows().iterator();
        boolean z = false;
        boolean z2 = true;
        boolean z3 = false;
        while (it.hasNext()) {
            zzY6G zzy6gZzZYf2 = ((Row) it.next()).zzZYf();
            if (zzy6gZzZYf2 == null) {
                com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{117, 78, 108, 108, 82, 32, 119, 111, 84, PatternStyle.Divot, 98, 97, 101, 108, 114, 80, 115, 32, 111, 104, 108, 117, 32, 100, 111, 110, 32, 116, 97, 104, 112, 112, 110, 101, PatternStyle.Divot});
                break;
            }
            z3 = zzy6gZzZYf2.hasRevisions() || zzy6gZzZYf2.zzY3m();
            if (z3) {
                break;
            }
            z2 = iZzYka == zzy6gZzZYf2.zzYka() && iZzYk9 == zzy6gZzZYf2.zzYk9() && iZzXXe == zzy6gZzZYf2.zzXXe();
            if (!z2) {
                break;
            }
        }
        z = z2;
        if (z3 || !z) {
            return;
        }
        Iterator<T> it2 = table.getRows().iterator();
        while (it2.hasNext()) {
            zzY6G zzy6gZzZYf3 = ((Row) it2.next()).zzZYf();
            zzy6gZzZYf3.remove(5104);
            zzy6gZzZYf3.remove(4250);
            zzy6gZzZYf3.remove(4251);
        }
        zzZ(table.zzZYf(), iZzYka);
    }

    private void zzW(StructuredDocumentTag structuredDocumentTag) {
        if ((structuredDocumentTag.getSdtType() == 4 || structuredDocumentTag.getSdtType() == 5) && structuredDocumentTag.getListItems().getSelectedValue() == null) {
            String strZzV = com.aspose.words.internal.zzZKN.zzV(structuredDocumentTag.getText(), 7, ControlChar.PARAGRAPH_BREAK_CHAR, '\f');
            for (int i = 0; i < structuredDocumentTag.getListItems().getCount(); i++) {
                if (com.aspose.words.internal.zzZKN.equals(structuredDocumentTag.getListItems().get(i).getDisplayText(), strZzV)) {
                    structuredDocumentTag.getListItems().setSelectedValue(structuredDocumentTag.getListItems().get(i));
                    return;
                }
            }
            zzZ(65536, 13, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{116, 83, 117, 114, 116, 99, 114, 117, 100, 101, 68, 32, 99, 111, 109, 117, 110, 101, 32, 116, 97, 84, 32, 103, 111, 99, 116, 110, 110, 101, 32, 116, 115, 105, 109, 32, 115, 101, 101, 115, 32, 100, 112, 117, PatternStyle.Divot}));
        }
    }

    private static void zzY(ListCollection listCollection) {
        int iZzYP1 = listCollection.zzYP1();
        for (int i = 0; i < iZzYP1; i++) {
            zzZ4J zzz4jZzxs = listCollection.zzxs(i);
            if (!zzz4jZzxs.isListStyleReference()) {
                zzz4jZzxs.zzYOP().zzZ(zzz4jZzxs.zzYOR(), listCollection.getDocument());
            }
        }
    }

    private boolean zzZon() {
        LoadOptions loadOptions = this.zzYWO;
        return (loadOptions == null || loadOptions.zzZrB()) ? false : true;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyStart(Body body) throws Exception {
        return this.zzYR1.visitBodyStart(body);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellStart(Cell cell) {
        if (!zzZon()) {
            return 0;
        }
        if (cell.zz6G() == null) {
            cell.zzZ(new zzWP());
        }
        cell.zz6G().zz5C();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeEnd(CommentRangeEnd commentRangeEnd) {
        return this.zzYR4.visitCommentRangeEnd(commentRangeEnd);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeStart(CommentRangeStart commentRangeStart) {
        return this.zzYR4.visitCommentRangeStart(commentRangeStart);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) {
        return this.zzYR4.zzZ(comment);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentEnd(Document document) throws Exception {
        this.zzYR4.zzbQ();
        if (this.zzYWO.zzYNC()) {
            this.zzYR5.size();
        } else {
            zzG(document);
        }
        zzYL3 zzyl3 = this.zzYQZ;
        if (zzyl3 == null) {
            return 0;
        }
        zzyl3.zzV6(true);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentStart(Document document) throws Exception {
        zzY40 zzy40 = new zzY40();
        this.zzYR1 = zzy40;
        zzy40.visitDocumentStart(document);
        zzR(document);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitEditableRangeEnd(EditableRangeEnd editableRangeEnd) {
        return this.zzYR4.visitEditableRangeEnd(editableRangeEnd);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitEditableRangeStart(EditableRangeStart editableRangeStart) {
        return this.zzYR4.visitEditableRangeStart(editableRangeStart);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) {
        if (this.zzYR5.size() > 0 && this.zzYR5.peek().getNodeType() == 23) {
            this.zzYR5.pop();
        }
        if (this.zzYR5.size() <= 0 || this.zzYR5.peek().getNodeType() != 22) {
            return 0;
        }
        this.zzYR5.pop();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        this.zzYR5.push(fieldSeparator);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) {
        this.zzYR5.push(fieldStart);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGlossaryDocumentEnd(GlossaryDocument glossaryDocument) {
        this.zzYR4.zzbQ();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGlossaryDocumentStart(GlossaryDocument glossaryDocument) {
        zzR(glossaryDocument);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeStart(GroupShape groupShape) throws Exception {
        groupShape.zzYa2();
        if (groupShape.getMarkupLanguage() == 0) {
            zzH(groupShape);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterStart(HeaderFooter headerFooter) throws Exception {
        return this.zzYR1.visitHeaderFooterStart(headerFooter);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        if (zzH(paragraph)) {
            zzY("Invalid number revision found, removed.", new Object[0]);
            zzymxZzZYj.remove(EditingLanguage.DIVEHI);
        }
        Style styleZzZ8 = paragraph.getDocument().getStyles().zzZ8(zzymxZzZYj.zzZ7j(), false);
        if (styleZzZ8 != null) {
            zzZ(styleZzZ8, paragraph);
        }
        this.zzYR1.visitParagraphStart(paragraph);
        if (paragraph.zzZYj().zzZ0C() > 9) {
            paragraph.zzZYj().zzQ(EditingLanguage.KASHMIRI_ARABIC, 0);
            paragraph.zzZYj().zzQ(EditingLanguage.GALICIAN, 12);
            if (this.zzYWO.getMswVersion() <= 5) {
                paragraph.insertBefore(new Run(paragraph.getDocument(), ControlChar.TAB), paragraph.getFirstChild());
            }
        }
        zzYL3 zzyl3 = this.zzYQZ;
        if (zzyl3 != null) {
            zzyl3.zzV6(false);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowStart(Row row) {
        row.zzYke();
        zzY6D.zzi(row);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSectionStart(Section section) {
        section.zzYvR().zzZ(getWarningCallback());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) throws Exception {
        shape.zzYa2();
        if (shape.getMarkupLanguage() == 0) {
            zzH(shape);
            return 0;
        }
        zzM(shape);
        zzN(shape);
        zzL(shape);
        LoadOptions loadOptions = this.zzYWO;
        if (loadOptions != null && loadOptions.getConvertShapeToOfficeMath()) {
            zzYOL.zzZ(shape, getWarningCallback());
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSmartTagStart(SmartTag smartTag) {
        zzZ(smartTag);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) throws Exception {
        structuredDocumentTag.zzQk(false);
        structuredDocumentTag.zzY3Y();
        zzW(structuredDocumentTag);
        if (this.zzYWO.zzYND() && structuredDocumentTag.getXmlMapping().zzX(this.zzYR0) && structuredDocumentTag.getDeleteRevision() == null) {
            structuredDocumentTag.getXmlMapping().zzZ(this.zzYR0);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableEnd(Table table) {
        if (!zzZon() || !(table.getDocument() instanceof Document)) {
            return 0;
        }
        zzZZ8.zzW(table);
        Table tableZz2 = this.zzYR2.zz2(table);
        if (tableZz2 == null) {
            return 0;
        }
        if (table == tableZz2) {
            zzU(tableZz2);
        }
        zzZ(tableZz2, this.zzYR3, true);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) throws Exception {
        for (TValue tvalue : table.getRows().zzYAN()) {
            if (tvalue.getCells().getCount() == 0) {
                zzZ(65536, 17, "Empty table row was removed.");
                tvalue.remove();
            }
        }
        if (!zzZon()) {
            return 0;
        }
        Row rowZzY07 = table.zzY07();
        if (rowZzY07 != null) {
            rowZzY07.zzYkd();
            rowZzY07.getParentTable().accept(this);
        }
        table.zzY0b();
        return 0;
    }

    public final void zzZ(Document document, LoadOptions loadOptions, int i) throws Exception {
        this.zzYWO = loadOptions;
        if (loadOptions != null) {
            loadOptions.getLanguagePreferences().zzB(document);
        }
        this.zzYQZ = (loadOptions.getLoadFormat() == 64 || i == 64) ? null : new zzYL3(document, loadOptions);
        document.accept(this);
        this.zzYQZ = null;
        if (document.getGlossaryDocument() != null) {
            document.getGlossaryDocument().accept(this);
        }
        zzZ(document.getStyles(), document.getLists());
        document.getFontInfos().zzX(document.zzZpV());
        if (document.zzZqI() == null && document.getStyles().zzY37().zzYdA()) {
            document.zzY(Theme.zzXVL().zzXVK());
        }
    }

    private static boolean zzH(Paragraph paragraph) {
        zzYTV zzytvZzYpK = paragraph.zzZYj().zzYpK();
        if (zzytvZzYpK == null) {
            return false;
        }
        if (!zzytvZzYpK.zzYyr() && !zzytvZzYpK.zzYyq()) {
            return true;
        }
        if (!zzytvZzYpK.zzYyr() && zzytvZzYpK.zzYyq() && paragraph.isListItem()) {
            return true;
        }
        return (!zzytvZzYpK.zzYyr() || zzytvZzYpK.zzYyq() || paragraph.isListItem()) ? false : true;
    }

    private static void zzY(com.aspose.words.internal.zzDB zzdb, int i) {
        int iMin;
        if (zzdb != null && (iMin = Math.min(zzdb.getCount(), i)) > 0) {
            zzdb.removeRange(0, iMin);
        }
    }

    private void zzY(String str, Object... objArr) {
        zzY1Z.zzZ(getWarningCallback(), 0, str, objArr);
    }

    private void zzZ(Document document, FieldSeparator fieldSeparator) {
        Paragraph parentParagraph = fieldSeparator.getParentParagraph();
        if (parentParagraph == null) {
            return;
        }
        Node nodeZztD = fieldSeparator.zztD(22);
        boolean z = nodeZztD == null;
        Node lastChild = z ? parentParagraph.getLastChild() : nodeZztD.getPreviousSibling();
        FieldEnd fieldEnd = new FieldEnd(document, fieldSeparator.zzZYh() == null ? new zzYEF() : (zzYEF) fieldSeparator.zzZYh().zzbn(), fieldSeparator.getFieldType(), true);
        if (!com.aspose.words.internal.zzZKO.zzA(lastChild, fieldSeparator) && !z) {
            parentParagraph.insertBefore(fieldEnd, lastChild);
        } else {
            parentParagraph.insertAfter(fieldEnd, lastChild);
        }
        FieldStart fieldStart = (FieldStart) this.zzYR5.pop();
        fieldEnd.zzDJ(fieldStart.getFieldType());
        fieldSeparator.zzDJ(fieldStart.getFieldType());
    }

    private void zzZ(StyleCollection styleCollection) {
        styleCollection.zzY2V();
        Iterator<Style> it = styleCollection.iterator();
        while (it.hasNext()) {
            it.next().zzY(getWarningCallback());
        }
    }

    private static void zzZ(Style style, Paragraph paragraph) {
        if (style.getType() == 2) {
            paragraph.zzZYj().remove(1000);
        } else if (style.isHeading()) {
            zzZ(paragraph, style);
        }
    }

    private static void zzZ(Paragraph paragraph, Style style) {
        style.isHeading();
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        if (zzymxZzZYj.contains(1280)) {
            if (paragraph.isInCell()) {
                zzymxZzZYj.setOutlineLevel(style.zzZYj().getOutlineLevel());
            } else {
                zzymxZzZYj.remove(1280);
            }
        }
    }

    private static void zzZ(SmartTag smartTag) {
        Node firstChild = smartTag.getFirstChild();
        if (firstChild instanceof SmartTag) {
            SmartTag smartTag2 = (SmartTag) firstChild;
            if (com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{100, 97, 114, 100, 115, 101, 115}).equals(smartTag2.getElement()) || com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{101, 80, 115, 114, 110, 111, 97, 78, 101, 109}).equals(smartTag2.getElement()) || com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{108, 112, 99, 97, 101}).equals(smartTag2.getElement())) {
                smartTag.zzX(smartTag2);
            }
        }
    }

    private static void zzZ(zzY6G zzy6g, int i) {
        zzY((com.aspose.words.internal.zzDB) zzy6g.get(5103), i);
        zzY6S zzy6s = (zzY6S) zzy6g.get(5107);
        if (zzy6s != null) {
            zzY(zzy6s.zzX6a, i);
        }
    }

    public static void zzZ(Table table, com.aspose.words.internal.zzZQC<Table> zzzqc, boolean z) {
        zzzqc.push(table);
        if (table.zzhk()) {
            return;
        }
        while (zzzqc.size() != 0) {
            zzZNR.zzY(zzzqc.pop(), z);
        }
    }

    private static void zzZ(zzZK0 zzzk0) {
        for (int i = 0; i < zzzk0.getCount(); i++) {
            zzZK1 zzzk1ZzA7 = zzzk0.zzA7(i);
            if (zzzk1ZzA7.getParentId() == zzzk1ZzA7.getId()) {
                zzzk1ZzA7.setParentId(0);
            }
        }
    }

    private void zzZ(StyleCollection styleCollection, ListCollection listCollection) {
        ArrayList arrayList;
        int listId;
        List listByListId;
        int iZzYOa;
        HashMap map = new HashMap();
        for (int i = 0; i < styleCollection.zzY38(); i++) {
            Style styleZzZ8 = styleCollection.zzZ8(i, false);
            if (styleZzZ8 != null && !styleZzZ8.getBuiltIn() && styleZzZ8.zzZYj().getListId() != 0 && (listByListId = listCollection.getListByListId((listId = styleZzZ8.zzZYj().getListId()))) != null && listByListId.zzYPa().zzYOO() != i) {
                if (styleZzZ8.zzZYj().zzVE(EditingLanguage.GALICIAN)) {
                    iZzYOa = ((Integer) styleZzZ8.zzZYj().get(EditingLanguage.GALICIAN)).intValue();
                } else {
                    Iterator<ListLevel> it = listByListId.zzYPa().zzYOP().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            iZzYOa = 0;
                            break;
                        }
                        ListLevel next = it.next();
                        if (next.zzYOc() == styleZzZ8.zzZ7j()) {
                            iZzYOa = next.zzYOa();
                            break;
                        }
                    }
                }
                if (!map.containsKey(Integer.valueOf(listId))) {
                    map.put(Integer.valueOf(listId), new HashMap());
                }
                if (!((HashMap) map.get(Integer.valueOf(listId))).containsKey(Integer.valueOf(iZzYOa))) {
                    ((HashMap) map.get(Integer.valueOf(listId))).put(Integer.valueOf(iZzYOa), new ArrayList());
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Style>) ((HashMap) map.get(Integer.valueOf(listId))).get(Integer.valueOf(iZzYOa)), styleZzZ8);
            }
        }
        for (List list : listCollection) {
            for (ListLevel listLevel : list.zzYPa().zzYOP()) {
                if (listLevel.getNumberStyle() != 23 && map.containsKey(Integer.valueOf(list.getListId())) && ((HashMap) map.get(Integer.valueOf(list.getListId()))).containsKey(Integer.valueOf(listLevel.zzYOa())) && (arrayList = (ArrayList) ((HashMap) map.get(Integer.valueOf(list.getListId()))).get(Integer.valueOf(listLevel.zzYOa()))) != null) {
                    if (arrayList.size() > 1) {
                        for (int i2 = 1; i2 < arrayList.size(); i2++) {
                            Style style = (Style) arrayList.get(i2);
                            style.zzZYj().remove(EditingLanguage.KASHMIRI_ARABIC);
                            style.zzZYj().remove(EditingLanguage.GALICIAN);
                            listLevel.zzZYj().zzY(style.zzZYj());
                            zzZ(16777216, 17, com.aspose.words.internal.zzZKN.format("Removed numbering reference for style '{0}'.", style.getName()));
                        }
                    }
                }
            }
        }
    }

    private void zzZ(int i, int i2, String str) {
        if (getWarningCallback() != null) {
            OooO00o.OooO0O0(getWarningCallback(), i, i2, str);
        }
    }
}
