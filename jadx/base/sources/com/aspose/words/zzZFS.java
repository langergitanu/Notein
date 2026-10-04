package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFS {
    private zzZFI zzYnA;
    private zzZJY zzYnt;
    private boolean zzYnv;
    private zzYMX zzYnx;
    private zzZJB zzYny;
    private zzZGJ zzYnz;
    private zzZK3 zzYqv;
    private zzZYY zzYso;
    private com.aspose.words.internal.zzIM<Paragraph> zzYta;
    private DocumentBuilder zzZwh;
    private boolean zzYnB = false;
    private boolean zzYnw = true;
    private com.aspose.words.internal.zzZQC<Paragraph> zzYnu = new com.aspose.words.internal.zzZQC<>();

    public zzZFS(zzZFI zzzfi, zzZK3 zzzk3, DocumentBuilder documentBuilder, zzZYY zzzyy, zzZJB zzzjb, zzYMX zzymx, zzZGJ zzzgj, zzZJY zzzjy, boolean z) {
        this.zzYta = new com.aspose.words.internal.zzIM<>();
        this.zzYnA = zzzfi;
        this.zzYqv = zzzk3;
        this.zzZwh = documentBuilder;
        this.zzYso = zzzyy;
        this.zzYny = zzzjb;
        this.zzYnx = zzymx;
        this.zzYnz = zzzgj;
        this.zzYnv = z;
        this.zzYta = new com.aspose.words.internal.zzIM<>();
        this.zzYnt = zzzjy;
    }

    private boolean zzYZS() {
        if (zzZN(this.zzZwh.getCurrentParagraph())) {
            return false;
        }
        boolean z = this.zzYnv;
        this.zzYnv = false;
        if (this.zzZwh.getCurrentParagraph().isListItem() && this.zzYso.zzZUt() == 3 && !z) {
            return false;
        }
        if (this.zzZwh.isAtStartOfParagraph()) {
            return true;
        }
        if (this.zzZwh.getCurrentParagraph().getChildNodes(0, false).getCount() == 3) {
            FieldStart fieldStart = (FieldStart) com.aspose.words.internal.zzZKW.zzZ(this.zzZwh.getCurrentParagraph().getFirstChild(), FieldStart.class);
            FieldSeparator fieldSeparator = (FieldSeparator) com.aspose.words.internal.zzZKW.zzZ(this.zzZwh.getCurrentParagraph().getLastChild(), FieldSeparator.class);
            if (fieldStart != null && fieldSeparator != null && fieldStart.getFieldType() == 88 && fieldSeparator.getFieldType() == 88) {
                return true;
            }
        }
        if (zzZDY.zzZL(this.zzZwh.getCurrentParagraph())) {
            return true;
        }
        return (zzZDY.zzZK(this.zzZwh.getCurrentParagraph()) && this.zzYnw) || zzZDY.zzZJ(this.zzZwh.getCurrentParagraph());
    }

    private boolean zzZ13() {
        zzZGJ zzzgj = this.zzYnz;
        return (zzzgj == null || zzzgj.zzZ0T() == null || !this.zzYnz.zzZ0T().zzZ13()) ? false : true;
    }

    private boolean zzZ1r() {
        zzZGJ zzzgj = this.zzYnz;
        return (zzzgj == null || zzzgj.zzZ0T() == null || !this.zzYnz.zzZ0T().zzZ1r()) ? false : true;
    }

    public final void zzVq(boolean z) {
        this.zzYnB = z;
    }

    public final boolean zzYZR() {
        return this.zzYnB;
    }

    public final void zzYZT() {
        this.zzYnu.size();
    }

    public final void zzYZU() {
        if (this.zzYnB || !this.zzYso.zzZpf()) {
            return;
        }
        this.zzYnB = true;
    }

    public final void zzYZV() {
        this.zzZwh.insertParagraph();
    }

    public final void zzYZW() {
        if (!zzZ13() || zzZ1r()) {
            return;
        }
        this.zzZwh.getParagraphFormat().isListItem();
        this.zzZwh.insertParagraph();
    }

    public final void zzYZX() {
        this.zzYqv.isEmpty();
        if (this.zzYnu.size() > 0) {
            this.zzZwh.moveTo(this.zzYnu.pop());
        }
    }

    public final void zzYZY() {
        if (zzZN(this.zzZwh.getCurrentParagraph())) {
            this.zzZwh.insertParagraph();
        }
    }

    public final void zzYZZ() {
        this.zzYta.add(this.zzZwh.getCurrentParagraph());
    }

    public final void zzZ(zzYMX zzymx, zzYEF zzyef) {
        if (this.zzYnB) {
            if (!this.zzZwh.isAtStartOfParagraph() || this.zzZwh.getCurrentParagraph().isListItem()) {
                boolean z = this.zzZwh.getCurrentParagraph().getNextSibling() != null && this.zzZwh.getCurrentParagraph().getNextSibling().getNodeType() == 10;
                Paragraph paragraphInsertParagraph = this.zzZwh.insertParagraph();
                if (z) {
                    Node nextSibling = this.zzZwh.getCurrentParagraph().getNextSibling();
                    while (nextSibling.getNextSibling() != null) {
                        nextSibling = nextSibling.getNextSibling();
                    }
                    nextSibling.zzYD(paragraphInsertParagraph);
                }
            }
            this.zzZwh.getCurrentParagraph().zzZ(zzymx);
            this.zzZwh.getCurrentParagraph().zzC(zzyef);
        }
    }

    public final void zzZ00() {
        this.zzYqv.isEmpty();
        if (this.zzYso.zzZUv() || zzZ13()) {
            this.zzYnB = true;
        }
    }

    public final boolean zzZ01() throws Exception {
        boolean z;
        zzZGJ zzzgj;
        this.zzYqv.isEmpty();
        boolean zZzYZS = zzYZS();
        if (zZzYZS) {
            z = false;
        } else {
            this.zzYqv.zzZ4o();
            this.zzZwh.insertParagraph();
            z = true;
        }
        this.zzYnB = false;
        this.zzYnw = false;
        int listId = this.zzZwh.getParagraphFormat().getListId();
        ListLevel listLevelZzZ1f = (listId == 0 || (zzzgj = this.zzYnz) == null || zzzgj.zzZ0T() == null) ? null : this.zzYnz.zzZ0T().zzZ1f();
        int iZzYps = this.zzZwh.getCurrentParagraph().zzZYj().zzYps();
        this.zzZwh.getCurrentParagraph().zzZ((zzYMX) this.zzYnx.zzbn());
        if (iZzYps != 0) {
            this.zzZwh.getCurrentParagraph().zzZYj().zzqF(iZzYps);
        }
        zzZGJ zzzgj2 = this.zzYnz;
        if (zzzgj2 != null && zzzgj2.zzZ0T() != null && this.zzYnz.zzZ0T().zzZ12() != -1 && listId != 0 && zZzYZS) {
            this.zzZwh.getParagraphFormat().zzxC(listId);
            if (listLevelZzZ1f != null) {
                this.zzZwh.getParagraphFormat().zzrM(listLevelZzZ1f.zzYOa());
            }
        }
        this.zzYnA.zzVm(true);
        this.zzZwh.getCurrentParagraph().zzC(this.zzZwh.zzZpG());
        return z;
    }

    public final void zzZ02() throws Exception {
        if (this.zzYnB) {
            boolean zZzZ01 = zzZ01();
            if (zZzZ01) {
                this.zzYny.zzc(this.zzZwh.getCurrentParagraph());
                this.zzYnw = true;
            }
            this.zzYnA.zzYZz();
            if (zZzZ01) {
                this.zzYnt.zzVv(false);
            }
        }
    }

    public final void zzZ5(Node node) {
        this.zzYqv.isEmpty();
        this.zzZwh.getCurrentParagraph();
        this.zzYnu.push(this.zzZwh.getCurrentParagraph());
        this.zzZwh.moveTo(node);
    }

    public final boolean zzZN(Paragraph paragraph) {
        return this.zzYta.contains(paragraph);
    }
}
