package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ7I extends DocumentVisitor {
    private void zzC(DocumentBase documentBase) throws Exception {
        Iterator<zzZMS> it = documentBase.zzZpU().iterator();
        while (it.hasNext()) {
            it.next().accept(this);
        }
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldEnd(FieldEnd fieldEnd) {
        zzV(fieldEnd.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldSeparator(FieldSeparator fieldSeparator) {
        zzV(fieldSeparator.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFieldStart(FieldStart fieldStart) {
        zzV(fieldStart.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFootnoteStart(Footnote footnote) {
        zzV(footnote.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitFormField(FormField formField) {
        zzV(formField.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitParagraphStart(Paragraph paragraph) {
        zzY(paragraph.zzZYj());
        zzV(paragraph.zzYp5());
        if (paragraph.zzZYj().zz6D()) {
            zzY((zzYMX) paragraph.zzZYj().zzYsN().zzZ6C());
        }
        if (!paragraph.zzYp5().zz6D()) {
            return 0;
        }
        zzV((zzYEF) paragraph.zzYp5().zzYsN().zzZ6C());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitRowStart(Row row) {
        zzX(row.zzZYf());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitRun(Run run) {
        zzV(run.zzZYh());
        if (!run.zzZYh().zz6D()) {
            return 0;
        }
        zzV((zzYEF) run.zzZYh().zzYsN().zzZ6C());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitShapeStart(Shape shape) {
        zzV(shape.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitSpecialChar(SpecialChar specialChar) {
        zzV(specialChar.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) {
        zzV(structuredDocumentTag.zzY3J());
        zzV(structuredDocumentTag.zzY3I());
        return 0;
    }

    public final void zzD(DocumentBase documentBase) throws Exception {
        zzV(documentBase.getStyles().zzY37());
        zzY(documentBase.getStyles().zzY36());
        documentBase.accept(this);
        zzC(documentBase);
        zzZ(documentBase.zzZpV());
    }

    public abstract void zzV(zzYEF zzyef);

    public abstract void zzX(zzY6G zzy6g);

    public abstract void zzY(zzYMX zzymx);

    public abstract void zzZ(zzZZF zzzzf);
}
