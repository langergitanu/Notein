package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJ4 extends zzZJ3 {
    public zzZJ4(DocumentBuilder documentBuilder, zzZYY zzzyy) {
        super(documentBuilder, zzzyy);
    }

    private StructuredDocumentTag zzW(String str, int i, boolean z) throws Exception {
        StructuredDocumentTag structuredDocumentTag = new StructuredDocumentTag(zzZ3K().getDocument(), i, 1);
        structuredDocumentTag.setLockContents(!z);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            structuredDocumentTag.setTitle(str);
            structuredDocumentTag.setTag(str);
        }
        zzZ3J().zzZ(structuredDocumentTag.getContentsFont(), zzZ3K().getCurrentParagraph().zzqy(0));
        zzZ3K().insertNode(structuredDocumentTag);
        return structuredDocumentTag;
    }

    private StructuredDocumentTag zzX(String str, int i, boolean z) throws Exception {
        StructuredDocumentTag structuredDocumentTagZzW = zzW(str, i, z);
        if (structuredDocumentTagZzW.isShowingPlaceholderText()) {
            structuredDocumentTagZzW.setPlaceholderName(zzzP(i));
        }
        return structuredDocumentTagZzW;
    }

    private String zzzP(int i) {
        return zzZ3K().getDocument().zzZpR().zzmB(i).getName();
    }

    @Override // com.aspose.words.zzZJ3
    public final void zzZ(String str, boolean z, String str2, int i) throws Exception {
        StructuredDocumentTag structuredDocumentTagZzX = zzX(str, 6, z);
        structuredDocumentTagZzX.setDateDisplayFormat(com.aspose.words.internal.zzJB.zzH8());
        structuredDocumentTagZzX.zz1(com.aspose.words.internal.zzJB.zzZg(str2));
    }

    @Override // com.aspose.words.zzZJ3
    public final void zzZ(String str, boolean z, boolean z2, boolean z3) throws Exception {
        zzX(str, 13, z2).setChecked(z3);
    }

    @Override // com.aspose.words.zzZJ3
    public final void zzZ(String str, String str2, boolean z, int i, String str3) throws Exception {
        String strZzzP;
        boolean zZzXk = com.aspose.words.internal.zzZYD.zzXk(str2);
        boolean zZzXk2 = com.aspose.words.internal.zzZYD.zzXk(str3);
        StructuredDocumentTag structuredDocumentTagZzW = zzW(str, 12, z);
        if (zZzXk2) {
            strZzzP = zzZ3K().getDocument().zzZpR().zzBg(str3);
        } else {
            strZzzP = zzzP(12);
        }
        structuredDocumentTagZzW.setPlaceholderName(strZzzP);
        structuredDocumentTagZzW.isShowingPlaceholderText();
        structuredDocumentTagZzW.getFirstChild().getNodeType();
        int iZzZ7j = ((Run) structuredDocumentTagZzW.getFirstChild()).zzZYh().zzZ7j();
        structuredDocumentTagZzW.getChildNodes(0, false).clear();
        Document document = zzZ3K().getDocument();
        if (!zZzXk) {
            str2 = str3;
        }
        Run run = new Run(document, str2);
        zzZ3J().zzZ(run.getFont(), zzZ3K().getCurrentParagraph().zzqy(0));
        if (!zZzXk && zZzXk2) {
            run.zzZYh().zzBl(iZzZ7j);
        }
        structuredDocumentTagZzW.appendChild(run);
        structuredDocumentTagZzW.isShowingPlaceholderText(!zZzXk);
    }

    @Override // com.aspose.words.zzZJ3
    public final void zzZ(String str, boolean z, Iterable<zzZFW> iterable) throws Exception {
        StructuredDocumentTag structuredDocumentTagZzX = zzX(str, 4, z);
        for (zzZFW zzzfw : iterable) {
            zzZ(structuredDocumentTagZzX, zzzfw.getText(), zzzfw.getValue(), zzzfw.isSelected());
        }
    }

    private static void zzZ(StructuredDocumentTag structuredDocumentTag, String str, String str2, boolean z) {
        SdtListItem sdtListItem;
        if (com.aspose.words.internal.zzZYD.zzXk(str2) || com.aspose.words.internal.zzZYD.zzXk(str)) {
            if (!com.aspose.words.internal.zzZYD.zzXk(str2)) {
                str2 = str;
            }
            if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                sdtListItem = new SdtListItem(str, str2);
            } else {
                sdtListItem = new SdtListItem(str2);
            }
            structuredDocumentTag.getListItems().add(sdtListItem);
            if (z || structuredDocumentTag.getListItems().getCount() == 1) {
                structuredDocumentTag.getListItems().setSelectedValue(sdtListItem);
            }
        }
    }
}
