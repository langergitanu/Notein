package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz5V {
    private zzIM<String> zzkU = new zzIM<>();
    private zz4W zzkV;

    public zz5V(zz4W zz4w) {
        this.zzkV = zz4w;
    }

    private void zzY0(String str) {
        this.zzkV.zz2(zzZKN.format("{0} This violates the compliance requirements. The output document will not be fully compliant.", str));
    }

    private void zzY1(String str) {
        this.zzkU.add(str);
    }

    public final void zzV(zzGH zzgh) {
        if (!zzZYD.zzXk(this.zzkV.zzv9().getTitle()) && this.zzkV.zzv7().zzvy()) {
            zzY0("Document title is missing.");
        }
        if (this.zzkV.zzv6() && this.zzkV.zzv7().zzvr()) {
            zzgh.zzZ(new zz2Y(this));
        }
        Iterator<String> it = this.zzkU.iterator();
        while (it.hasNext()) {
            zzY0(it.next());
        }
    }

    public final void zzwm() {
        if (this.zzkV.zzv7().zzvy()) {
            zzY1("The document contains headings which levels are not consecutive.");
        }
    }

    public final void zzwn() {
        if (this.zzkV.zzv7().zzvy()) {
            zzY1("There are tables without header row/column in the document.");
        }
    }

    public final void zzwo() {
        if (this.zzkV.zzv7().zzvy()) {
            zzY1("There are hyperlinks without alt text in the document.");
        }
    }

    public final void zzwp() {
        if (this.zzkV.zzv7().zzvq()) {
            zzY1("There are tables without alt text in the document.");
        }
    }

    public final void zzwq() {
        if (this.zzkV.zzv7().zzvq()) {
            zzY1("There are shapes without alt text in the document.");
        }
    }

    public final void zzwr() {
        if (this.zzkV.zzv7().zzvs()) {
            zzY1("The document contains .notdef glyphs.");
        }
    }

    public final void zzws() {
        if (this.zzkV.zzv7().zzvt()) {
            zzY1("The document contains Unicode PUA characters.");
        }
    }
}
