package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ46 extends zzZ4F {
    private com.aspose.words.internal.zzD3<zzZ> zzYbI = new com.aspose.words.internal.zzD3<>();
    private com.aspose.words.internal.zzD7 zzYbH = new com.aspose.words.internal.zzD7();

    public static class zzZ {
        private List[] zzYbG = new List[zzZ4F.zzYcp];
        private List zzYo7;

        public zzZ(List list) {
            this.zzYo7 = list;
        }

        public final List getList() {
            return this.zzYo7;
        }

        public final List[] zzYNX() {
            return this.zzYbG;
        }
    }

    private zzZ46() {
    }

    private zzZ zzN(List list) {
        int listId = list.getListId();
        zzZ zzz = this.zzYbI.get(listId);
        if (zzz != null) {
            return zzz;
        }
        zzZ zzz2 = new zzZ(list);
        this.zzYbI.add(listId, zzz2);
        return zzz2;
    }

    private List zzZ(Paragraph paragraph, zzZ zzz) {
        paragraph.getListFormat().getListId();
        zzz.getList().getListId();
        List[] listArrZzYNX = zzz.zzYNX();
        List list = listArrZzYNX[this.zzYbH.zzCR()];
        if (list == null) {
            List list2 = zzz.getList();
            listArrZzYNX[this.zzYbH.zzCR()] = list2;
            return list2;
        }
        if (paragraph.zzZYj().get(1643) == null) {
            return list;
        }
        List listZzZ = paragraph.getDocument().getLists().zzZ(zzz.getList(), false);
        listArrZzYNX[this.zzYbH.zzCR()] = listZzZ;
        return listZzZ;
    }

    public static void zzs(Document document) throws Exception {
        document.accept(new zzZ46());
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) {
        int listId = paragraph.getListFormat().getListId();
        if (listId == 0) {
            return 0;
        }
        List listZzZ = zzZ(paragraph, zzN(paragraph.getListFormat().getList()));
        if (listZzZ.getListId() != listId) {
            paragraph.getListFormat().setList(listZzZ);
        }
        paragraph.zzZYj().remove(1643);
        return 0;
    }

    @Override // com.aspose.words.zzZ4F
    public final void zzYOE() {
        this.zzYbH.zzCQ();
    }

    @Override // com.aspose.words.zzZ4F
    public final void zzxf(int i) {
        this.zzYbH.zzVF(i);
    }
}
