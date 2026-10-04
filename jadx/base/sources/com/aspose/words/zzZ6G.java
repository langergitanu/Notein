package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6G extends zzZ6H {
    public zzZ6G(zzYMD zzymd) throws Exception {
        super(zzymd);
    }

    public final String getName() {
        return ((zzYAT) zz14()).getName();
    }

    public final boolean zzW(zzZ6R zzz6r) throws Exception {
        PdfSaveOptions pdfSaveOptions;
        if (!zzZou()) {
            return false;
        }
        if (!zz14().zzaa().zzZ4E() || (pdfSaveOptions = (PdfSaveOptions) com.aspose.words.internal.zzZKW.zzZ(zzz6r.zzYTe(), PdfSaveOptions.class)) == null || pdfSaveOptions.getHeaderFooterBookmarksExportMode() == 2) {
            return true;
        }
        if (pdfSaveOptions.getHeaderFooterBookmarksExportMode() == 0) {
            return false;
        }
        pdfSaveOptions.getHeaderFooterBookmarksExportMode();
        zzZKV zzzkv = (zzZKV) zz14().zzaa();
        int storyType = zzzkv.getStoryType();
        zzYN8 zzyn8ZzZ8m = zzzkv.zzZ8m();
        zzZ2D zzz2d = (zzZ2D) zzyn8ZzZ8m.zza9();
        zzzkv.zzZ4C();
        if (((zzUZ) zzyn8ZzZ8m.zz6x()) != null) {
            ((zzUZ) zzyn8ZzZ8m.zz6x()).zza9();
        }
        zzYN8 zzyn8ZzYJb = zzz2d.zzZXV().zzY7m().zzZ((zzZYW) null, storyType, false) == null ? null : zzz2d.zzYJb();
        if (zzyn8ZzYJb == zzyn8ZzZ8m) {
            return true;
        }
        zzYN8 zzyn8 = (zzYN8) zzyn8ZzZ8m.zzYo0();
        zzZ2D zzz2d2 = zzz2d;
        while (true) {
            if (zzyn8.zza9() != zzz2d2) {
                while (zzyn8.zza9() != zzz2d2.zzYTo()) {
                    zzz2d2 = (zzZ2D) zzz2d2.zzYTo();
                    if (zzz2d2.zzZXV().zzY7m().zzZ((zzZYW) null, storyType, false) != null) {
                        return true;
                    }
                }
                zzyn8.zza9();
                zzz2d2 = (zzZ2D) zzyn8.zza9();
                if (zzyn8ZzYJb == null && zzz2d2.zzZXV().zzY7m().zzZ((zzZYW) null, storyType, false) != null) {
                    zzyn8ZzYJb = zzz2d2.zzYJb();
                }
            }
            zzZKY zzzkyZzYqq = zzyn8.zzYqq();
            if (zzzkyZzYqq != null && zzzkyZzYqq.zzaa().getStoryType() == storyType) {
                zzZKW.zzZ((zzZ2D) zzyn8.zza9(), storyType, false);
                zzZKW.zzZ(zzz2d, storyType, false);
                return false;
            }
            if (zzyn8 == zzyn8ZzYJb) {
                return true;
            }
            zzyn8 = (zzYN8) zzyn8.zzYo0();
        }
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        if (((zzYAT) this.zzYgm) != null) {
            zzz61.zzZ(this);
        }
    }

    @Override // com.aspose.words.zzZ6H, com.aspose.words.zzZ6S
    public final long zzZT() {
        if (!this.zzYfe) {
            this.zzZN = com.aspose.words.internal.zzSA.zzF(com.aspose.words.internal.zzZPZ.zzZm(zz14().zzY6J(), 0));
            this.zzYfe = true;
        }
        return this.zzZN;
    }

    public final boolean zzZou() {
        return ((zzYAT) this.zzYgm).zzZ1s() == 2;
    }
}
