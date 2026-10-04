package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYEE extends DocumentVisitor {
    private void zzO(ListCollection listCollection) {
        for (int i = 0; i < listCollection.zzYP1(); i++) {
            Iterator<ListLevel> it = listCollection.zzxs(i).zzYOP().iterator();
            while (it.hasNext()) {
                zzt(it.next().zzZYh());
            }
        }
        Iterator<List> it2 = listCollection.iterator();
        while (it2.hasNext()) {
            for (zzZ4B zzz4b : it2.next().zzYPb()) {
                if (zzz4b.zzYbW) {
                    zzt(zzz4b.getListLevel().zzZYh());
                }
            }
        }
    }

    private void zzT(StyleCollection styleCollection) {
        zzt(styleCollection.zzY37());
        for (Style style : styleCollection) {
            zzt(style.zzZYh());
            if (style.getType() == 3) {
                zzX((TableStyle) style);
            }
        }
    }

    private void zzX(TableStyle tableStyle) {
        Iterator<ConditionalStyle> it = tableStyle.getConditionalStyles().zzZY9().iterator();
        while (it.hasNext()) {
            zzt(it.next().zzZYh());
        }
    }

    private void zzs(DocumentBase documentBase) {
        zzT(documentBase.getStyles());
        zzO(documentBase.getLists());
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitCommentStart(Comment comment) {
        zzt(comment.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitDocumentEnd(Document document) {
        zzs(document);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldEnd(FieldEnd fieldEnd) {
        zzt(fieldEnd.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldSeparator(FieldSeparator fieldSeparator) {
        zzt(fieldSeparator.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldStart(FieldStart fieldStart) {
        zzt(fieldStart.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFootnoteStart(Footnote footnote) {
        zzt(footnote.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFormField(FormField formField) {
        zzt(formField.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitGlossaryDocumentEnd(GlossaryDocument glossaryDocument) {
        zzs(glossaryDocument);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitGroupShapeStart(GroupShape groupShape) {
        zzt(groupShape.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitParagraphStart(Paragraph paragraph) {
        zzt(paragraph.zzYp5());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitRun(Run run) {
        zzt(run.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitShapeStart(Shape shape) {
        zzt(shape.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitSpecialChar(SpecialChar specialChar) {
        zzt(specialChar.zzZYh());
        return 0;
    }

    public abstract void zzt(zzYEF zzyef);
}
