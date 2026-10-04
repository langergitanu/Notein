package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZ1 extends zzZ7I {
    private CleanupOptions zzYRW;
    private DocumentBase zzZG3;
    private com.aspose.words.internal.zzIM<Integer> zzYRY = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<Integer> zzZue = new com.aspose.words.internal.zzIM<>();
    private com.aspose.words.internal.zzIM<Integer> zzYRX = new com.aspose.words.internal.zzIM<>();

    private zzZZ1(CleanupOptions cleanupOptions) {
        this.zzYRW = cleanupOptions;
    }

    private boolean zzFN(int i) {
        return (this.zzZue.getCount() <= 0 || this.zzZG3.getLists().getCount() != 1) && !this.zzZue.contains(Integer.valueOf(i));
    }

    private void zzFO(int i) {
        this.zzZue.add(Integer.valueOf(i));
        List listByListId = this.zzZG3.getLists().getListByListId(i);
        if (listByListId != null) {
            zzZ4J zzz4jZzYPa = listByListId.zzYPa();
            zzFP(zzz4jZzYPa.zzYOO());
            this.zzYRX.add(Integer.valueOf(zzz4jZzYPa.zzYP8()));
        }
    }

    private void zzFP(int i) {
        while (!this.zzYRY.contains(Integer.valueOf(i))) {
            Style styleZzZ8 = this.zzZG3.getStyles().zzZ8(i, false);
            this.zzYRY.add(Integer.valueOf(i));
            if (styleZzZ8 == null) {
                return;
            }
            if (styleZzZ8.zzZYj().getListId() != 0) {
                zzFO(styleZzZ8.zzZYj().getListId());
            }
            if (styleZzZ8.zzY3t() != 12287) {
                zzFP(styleZzZ8.zzY3t());
            }
            if (styleZzZ8.zzY3v() == 12287) {
                return;
            } else {
                i = styleZzZ8.zzY3v();
            }
        }
    }

    private void zzS(DocumentBase documentBase) throws Exception {
        this.zzZG3 = documentBase;
        zzD(documentBase);
        if (!this.zzYRW.getUnusedBuiltinStyles()) {
            zzZpp();
        }
        zzZpo();
        if (this.zzYRW.getUnusedLists()) {
            zzZpm();
            zzZpl();
        }
        if (this.zzYRW.getUnusedStyles()) {
            zzZpn();
        }
        if (this.zzYRW.getDuplicateStyle()) {
            zzZVE.zzI(documentBase);
        }
        if (this.zzYRW.getUnusedStyles() || this.zzYRW.getDuplicateStyle()) {
            zzY8N.zzI(documentBase);
        }
    }

    public static void zzZ(DocumentBase documentBase, CleanupOptions cleanupOptions) throws Exception {
        new zzZZ1(cleanupOptions).zzS(documentBase);
    }

    private void zzZpl() {
        int i = 0;
        while (i < this.zzZG3.getLists().zzYOX().size()) {
            if (this.zzYRX.contains(Integer.valueOf(this.zzZG3.getLists().zzYOX().get(i).zzYP8()))) {
                i++;
            } else {
                this.zzZG3.getLists().zzYOX().remove(i);
            }
        }
    }

    private void zzZpm() {
        int i = 0;
        while (i < this.zzZG3.getLists().getCount()) {
            List list = this.zzZG3.getLists().get(i);
            if (zzFN(list.getListId())) {
                this.zzZG3.getLists().zzxm(list.getListId());
            } else {
                i++;
            }
        }
    }

    private void zzZpn() {
        int i = 0;
        while (i < this.zzZG3.getStyles().getCount()) {
            Style style = this.zzZG3.getStyles().get(i);
            if (this.zzYRY.contains(Integer.valueOf(style.zzZ7j()))) {
                i++;
            } else {
                this.zzZG3.getStyles().zzs(style);
            }
        }
    }

    private void zzZpo() {
        for (List list : this.zzZG3.getLists()) {
            if (list.getStyle() != null && this.zzYRY.contains(Integer.valueOf(list.getStyle().zzZ7j()))) {
                zzFO(list.getListId());
            }
        }
    }

    private void zzZpp() {
        for (Style style : this.zzZG3.getStyles()) {
            if (style.getBuiltIn()) {
                zzFP(style.zzZ7j());
            }
        }
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzV(zzYEF zzyef) {
        zzFP(zzyef.zzZ7j());
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzX(zzY6G zzy6g) {
        zzFP(zzy6g.zzZ7j());
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzY(zzYMX zzymx) {
        zzFP(zzymx.zzZ7j());
        if (zzymx.getListId() != 0) {
            zzFO(zzymx.getListId());
        }
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzZ(zzZZF zzzzf) {
        Style styleZzZ8 = this.zzZG3.getStyles().zzZ8(zzzzf.zzYVZ, false);
        if (styleZzZ8 != null) {
            zzFP(styleZzZ8.zzZ7j());
        }
        Style styleZzZ82 = this.zzZG3.getStyles().zzZ8(zzzzf.zzYVY, false);
        if (styleZzZ82 != null) {
            zzFP(styleZzZ82.zzZ7j());
        }
    }
}
