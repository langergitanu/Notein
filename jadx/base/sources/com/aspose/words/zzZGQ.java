package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZGQ {
    private boolean zzYpd;
    private zzOJ zzYpe;
    private zzOJ zzYpf;
    private zzOJ zzYpg;
    private boolean zzYph;
    private zzOJ zzYpi;
    private Paragraph zzYtC;

    public zzZGQ(Paragraph paragraph, zzOJ zzoj, zzOJ zzoj2, zzOJ zzoj3, zzOJ zzoj4, boolean z, boolean z2) {
        this.zzYtC = paragraph;
        this.zzYpg = zzoj;
        this.zzYpi = zzoj2;
        this.zzYpf = zzoj3;
        this.zzYpe = zzoj4;
        this.zzYpd = z;
        this.zzYph = z2;
    }

    public final Paragraph getParagraph() {
        return this.zzYtC;
    }

    public zzOJ zzW(zzOJ zzoj, zzOJ zzoj2) {
        return zzOJ.zzZ(zzoj, this.zzYpg);
    }

    public final zzOJ zzX(zzOJ zzoj, zzOJ zzoj2) {
        return this.zzYpd ? zzoj2 : zzX(zzoj);
    }

    public abstract zzOJ zzZ(zzOJ zzoj, zzOJ zzoj2, ListLevel listLevel);

    public final boolean zzZ1n() {
        return this.zzYpd;
    }

    public final zzOJ zzZ1o() {
        return this.zzYpe;
    }

    public final zzOJ zzZ1p() {
        return this.zzYpf;
    }

    public final zzOJ zzZ1q() {
        return this.zzYpg;
    }

    public final boolean zzZ1r() {
        return this.zzYph;
    }

    private zzOJ zzX(zzOJ zzoj) {
        return zzOJ.zzY(zzOJ.zzZ(zzOJ.zzZ(this.zzYpe, this.zzYpf), zzOJ.zzY(zzoj, this.zzYpi)));
    }
}
