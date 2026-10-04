package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQO {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(".xml", ".rdf", ".png");
    private String mName;
    private com.aspose.words.internal.zzZOR zzkX;

    public zzYQO(String str) throws Exception {
        this(str, new com.aspose.words.internal.zzZOR());
    }

    public final String getName() {
        return this.mName;
    }

    public final void zzF(com.aspose.words.internal.zzZOR zzzor) {
        this.zzkX = zzzor;
    }

    public final String zzYZ5() throws Exception {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZOQ.zzVe(this.mName));
        return iZzTP != 0 ? iZzTP != 1 ? iZzTP != 2 ? "" : "image/png" : "application/rdf+xml" : "text/xml";
    }

    public final boolean zzYvH() {
        return zzYOU.zzDl(this.mName);
    }

    public final com.aspose.words.internal.zzZOR zzYvo() {
        return this.zzkX;
    }

    public zzYQO(String str, com.aspose.words.internal.zzZOR zzzor) {
        com.aspose.words.internal.zzZ4.zzU(str, "PackagePart.Name");
        this.mName = str;
        this.zzkX = zzzor;
    }
}
