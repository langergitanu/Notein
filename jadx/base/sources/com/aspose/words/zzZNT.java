package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
class zzZNT extends zzZE3 {
    private zzZDN zzYym;

    public zzZNT(zzZDN zzzdn) {
        this.zzYym = zzzdn;
    }

    private zzZDN zzZ9k() {
        zzZDN zzzdnZzYXe = this.zzYym.zzYXe();
        zzZDN zzzdn = null;
        while (zzzdnZzYXe != null && zzzdn == null) {
            if (TranslateLanguage.THAI.equals(zzzdnZzYXe.getName()) || "td".equals(zzzdnZzYXe.getName())) {
                zzzdn = zzzdnZzYXe;
            } else {
                zzzdnZzYXe = zzzdnZzYXe.zzYXe();
            }
        }
        return zzzdn;
    }

    @Override // com.aspose.words.zzZE3
    public final void run() {
        zzZDN zzzdnZzZ9k = zzZ9k();
        zzZDN zzzdn = new zzZDN("div");
        zzLU zzlu = new zzLU();
        zzlu.zzZs("display", "inline-block");
        zzlu.zzZs("overflow", "visible");
        zzlu.zzU("height", 100.0d);
        zzlu.zzU("width", 100.0d);
        zzPT zzptZzSx = zzzdnZzZ9k.zzYXe().zzYXf().zzSx("height");
        if (zzptZzSx != null) {
            zzptZzSx.zzZWj().getCount();
            zzptZzSx.zzZWj().zzZVx().getValueType();
            zzOI zzoi = (zzOI) zzptZzSx.zzZWj().zzZVx();
            zzlu.zzZ("height", zzoi.getDoubleValue(), zzoi.getUnit());
        }
        zzzdn.zzYXj().zzZ(new zzZDP(zzlu.zzZWe()));
        while (zzzdnZzZ9k.zzYXk().getCount() != 0) {
            zzZDK zzzdkZzyy = zzzdnZzZ9k.zzYXk().zzyy(0);
            zzzdnZzZ9k.zzYXk().zzW(zzzdkZzyy);
            zzzdn.zzYXk().zzX(zzzdkZzyy);
        }
        zzzdnZzZ9k.zzYXk().zzX(zzzdn);
    }

    @Override // com.aspose.words.zzZE3
    public final boolean zzZ(zzZE3 zzze3) {
        zzZNT zzznt = (zzZNT) com.aspose.words.internal.zzZKW.zzZ(zzze3, zzZNT.class);
        return zzznt != null && zzZ9k() == zzznt.zzZ9k();
    }
}
