package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYAD extends zzYA3 implements zzZ99 {
    private int zzXc8;
    private int zzXc9;
    private zzYCT zzXcI;
    private Footnote zzXca;
    private String zzXce;

    public zzYAD(Footnote footnote) {
        super(EditingLanguage.ARABIC_YEMEN);
        this.zzXca = footnote;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.aspose.words.zzYMD] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.aspose.words.zzYAD] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private int getPageIndex() throws Exception {
        zzUZ zzuz = (zzUZ) zzqh(2);
        ?? ZzZ = this;
        int i = 0;
        while (zzuz != null) {
            ZzZ = ZzZ;
            if (!zzuz.isEmpty()) {
                if (ZzZ == 0) {
                    ZzZ = zzuz.zz6w();
                }
                while (ZzZ != 0) {
                    ZzZ = zzYJR.zzZ((zzYMD) ZzZ, false, this.zzXca.getStoryType(), (zzWT) null);
                    if (ZzZ != 0) {
                        if (ZzZ.zzXca.isAuto()) {
                            i++;
                        }
                    }
                }
            }
            zzuz = (zzUZ) zzuz.zz5Y();
            ZzZ = ZzZ;
        }
        return i;
    }

    private int zzQw(boolean z) throws Exception {
        int iZzY5t;
        zzZ35 zzz35 = (zzZ35) ((zzZ2D) zza9().zzYTk()).zzYTt();
        int iZzYLi = z ? zzz35.zzYLi() : zzz35.zzYLe();
        if (iZzYLi != 1) {
            iZzY5t = zzY5u();
        } else {
            int iZzYLk = z ? zzz35.zzYLk() : zzz35.zzYLg();
            if (iZzYLk == 1) {
                iZzY5t = zzY5t();
            } else if (iZzYLk != 2) {
                iZzY5t = zzY5u();
            } else {
                if (!z) {
                    throw new IllegalStateException("Restart from page is not a valid rule for endnotes.");
                }
                iZzY5t = getPageIndex();
            }
        }
        return iZzY5t + iZzYLi;
    }

    private int zzY5t() throws Exception {
        if (this.zzXc8 == 0) {
            zzYAD zzyadZzlH = zzlH(21857);
            this.zzXc8 = zzyadZzlH == null ? 0 : zzyadZzlH.zzY5t() + 1;
        }
        return this.zzXc8;
    }

    private int zzY5u() throws Exception {
        if (this.zzXc9 == 0) {
            zzYAD zzyadZzlH = zzlH(21639);
            this.zzXc9 = zzyadZzlH == null ? 0 : zzyadZzlH.zzY5u() + 1;
        }
        return this.zzXc9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0033, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.aspose.words.zzYMD] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.aspose.words.zzYAD] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzYAD zzlH(int i) throws Exception {
        if (i == 21788) {
            zzUZ zzuz = (zzUZ) zzqh(2);
            ?? ZzZ = this;
            while (zzuz != null) {
                ZzZ = ZzZ;
                if (!zzuz.isEmpty()) {
                    if (ZzZ == 0) {
                        ZzZ = zzuz.zz6w();
                    }
                    while (ZzZ != 0) {
                        ZzZ = zzYJR.zzZ((zzYMD) ZzZ, false, this.zzXca.getStoryType(), (zzWT) null);
                        if (ZzZ != 0) {
                            if (ZzZ.zzXca.isAuto()) {
                                return ZzZ;
                            }
                        }
                    }
                }
                zzuz = (zzUZ) zzuz.zz5Y();
                ZzZ = ZzZ;
            }
        } else {
            zzYCT zzyctZzYTk = i == 21639 ? null : zza9().zzYTk();
            for (zzYCT zzyct = (zzYCT) zzY7l().zzYTo(); zzyct != null; zzyct = (zzYCT) zzyct.zzYTo()) {
                zzYAD zzyad = (zzYAD) ((zzYVN) zzyct).zzYzk();
                if (zzyad == null || !(zzyctZzYTk == null || zzyad.zza9().zzYTk() == zzyctZzYTk)) {
                    break;
                }
                if (zzyad.zzXca.isAuto()) {
                    return zzyad;
                }
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return 1;
    }

    @Override // com.aspose.words.zzZ99
    public final String getScreenTip() {
        return null;
    }

    @Override // com.aspose.words.zzYAU
    public final String getText() throws Exception {
        if (zza9() == null) {
            return "";
        }
        if (!this.zzXca.isAuto()) {
            return this.zzXca.getReferenceMark() != null ? this.zzXca.getReferenceMark() : "";
        }
        zzZ35 zzz35 = (zzZ35) ((zzZ2D) zza9().zzYTk()).zzYTt();
        return zzYTW.zzM(zzQw(this.zzXca.getStoryType() == 2), this.zzXca.getStoryType() == 2 ? zzz35.zzYLj() : zzz35.zzYLf(), true);
    }

    @Override // com.aspose.words.zzYAU
    public final void zzX(zzYCT zzyct) {
        this.zzXcI = zzyct;
    }

    public final Footnote zzY5v() {
        return this.zzXca;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzYAD zzyad = new zzYAD(this.zzXca);
        zzyad.zzX(zzY7l());
        zzZB(zzyad);
        return zzyad;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYCT zzY7l() {
        if (this.zzXcI == null && zza9() != null) {
            if (this.zzXca.getStoryType() != 2) {
                this.zzXca.getStoryType();
            }
            zza9().zzaa();
            this.zzXcI = zzY6L().zza9().zzYTk();
        }
        return this.zzXcI;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzY7n() {
        return this.zzXca.getStoryType();
    }

    @Override // com.aspose.words.zzYAU
    public final void zzY7p() {
        for (zzYCT zzyctZzY7l = zzY7l(); zzyctZzY7l != null; zzyctZzY7l = (zzYCT) zzyctZzY7l.zzYTp()) {
            zzYAD zzyad = (zzYAD) ((zzYVN) zzyctZzY7l).zzYzk();
            zzyad.zzXc9 = 0;
            zzyad.zzXc8 = 0;
        }
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY7t() throws Exception {
        return com.aspose.words.internal.zzZKN.zzU3(getText());
    }

    @Override // com.aspose.words.zzZ99
    public final String zzYWa() {
        return null;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZ1s() {
        return 1;
    }

    @Override // com.aspose.words.zzZ99
    public final String zzZkA() {
        if (zza8().zzYT3() && this.zzXce == null) {
            this.zzXce = com.aspose.words.internal.zzZKN.format("#_AsposeWordsSpanFootnote{0}", Integer.valueOf(hashCode()));
        }
        return this.zzXce;
    }
}
