package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRJ extends DocumentVisitor {
    private static void zzR(zzYEF zzyef) {
        zzyef.remove(830);
        zzyef.remove(810);
        zzyef.remove(825);
        zzyef.remove(840);
        zzyef.remove(820);
        zzyef.remove(835);
        zzyef.remove(815);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        zzR(fieldEnd.zzZYh());
        return super.visitFieldEnd(fieldEnd);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) throws Exception {
        zzR(fieldSeparator.zzZYh());
        return super.visitFieldSeparator(fieldSeparator);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) throws Exception {
        zzR(fieldStart.zzZYh());
        return super.visitFieldStart(fieldStart);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFormField(FormField formField) throws Exception {
        zzR(formField.zzZYh());
        return super.visitFormField(formField);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathStart(OfficeMath officeMath) throws Exception {
        zzR(officeMath.zzZYh());
        return super.visitOfficeMathStart(officeMath);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        zzR(paragraph.zzYp5());
        return super.visitParagraphStart(paragraph);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) throws Exception {
        zzR(run.zzZYh());
        return super.visitRun(run);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) throws Exception {
        zzR(structuredDocumentTag.zzY3J());
        zzR(structuredDocumentTag.zzY3I());
        return super.visitStructuredDocumentTagStart(structuredDocumentTag);
    }
}
