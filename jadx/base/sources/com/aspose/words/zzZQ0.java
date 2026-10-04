package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQ0 {
    private boolean zzYDs;
    private zzZ7X zzYDt;
    private zzZQV zzYDv;
    private DocumentBuilder zzYRM;

    public zzZQ0(zzZQV zzzqv, DocumentBuilder documentBuilder) {
        this.zzYDv = zzzqv;
        this.zzYRM = documentBuilder;
    }

    public final void zzZ(zzZ7X zzz7x) {
        this.zzYDt = zzz7x;
    }

    public final boolean zzZde() {
        return this.zzYDs;
    }

    public final boolean zzZdf() {
        return this.zzYDt != null;
    }

    public final zzZ7X zzZdg() {
        return this.zzYDt;
    }

    public final void zzZdh() {
        this.zzYDt = null;
        this.zzYDs = true;
    }

    public final void zzZdi() {
        this.zzYDt = null;
        this.zzYDs = false;
    }

    public final zzZQV zzZdj() {
        return this.zzYDv;
    }

    public final DocumentBuilder zzZp6() {
        return this.zzYRM;
    }
}
