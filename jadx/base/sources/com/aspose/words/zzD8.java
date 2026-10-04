package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzD8 extends zz53 implements zzZCL {
    private int zzAr;
    private String zzRG;
    private ArrayList<zzEV> zzZa9;
    private zzFL zzZaa;
    private zzD3 zzZab;
    private zzG1 zzZac;
    private Theme zzZad;
    private String zzZae;
    private boolean zzZaf;
    private int zzZag;
    private boolean zzZah;
    private zzDN zzZai;
    private zzE0 zzZaj;
    private boolean zzZak;
    private zzG2 zzZal;
    private boolean zzZam;
    private zzZBL zzZan;
    private com.aspose.words.internal.zzZYG<zz82> zzZaq;
    private zzEY zzZy4;
    private zzCL zzZyC;
    private zzD9 zzZyx;

    public zzD8() {
        this(false);
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final String getAlternativeText() {
        return zzZyb().isTopLevel() ? super.getAlternativeText() : "";
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final boolean getAspectRatioLocked() {
        return zzZyb().isTopLevel() && super.getAspectRatioLocked();
    }

    public final boolean getAutoUpdate() {
        return this.zzZam;
    }

    @Override // com.aspose.words.zzZCL
    public final zz7X getFill() {
        return zzaQ().getFill();
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final boolean getHidden() {
        return zzZyb().isTopLevel() && super.getHidden();
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final String getName() {
        return zzZyb().isTopLevel() ? super.getName() : "";
    }

    @Override // com.aspose.words.zzZCL
    public final zz4G getOutline() {
        return zzaQ().getOutline();
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final String getTitle() {
        return zzZyb().isTopLevel() ? super.getTitle() : "";
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final void setAlternativeText(String str) {
        if (zzZyb().isTopLevel()) {
            super.setAlternativeText(str);
        }
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final void setAspectRatioLocked(boolean z) {
        if (zzZyb().isTopLevel()) {
            super.setAspectRatioLocked(z);
        }
    }

    public final void setAutoUpdate(boolean z) {
        this.zzZam = z;
    }

    @Override // com.aspose.words.zzZCL
    public final void setFill(zz7X zz7x) {
        zzaQ().setFill(zz7x);
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final void setName(String str) {
        if (zzZyb().isTopLevel()) {
            super.setName(str);
        }
    }

    @Override // com.aspose.words.zzZCL
    public final void setOutline(zz4G zz4g) {
        zzaQ().setOutline(zz4g);
    }

    @Override // com.aspose.words.zz53, com.aspose.words.zzZLD
    public final void setTitle(String str) {
        if (zzZyb().isTopLevel()) {
            super.setTitle(str);
        }
    }

    public final boolean zz33() {
        return this.zzZaf;
    }

    public final boolean zz7e() {
        Document document = (Document) zzZyb().getDocument();
        return document != null && document.getBuiltInDocumentProperties().zz7e();
    }

    public final void zzKt(int i) {
        this.zzZag = i;
    }

    public final void zzKu(int i) {
        if (i <= 0 || i > 48) {
            return;
        }
        this.zzAr = i;
    }

    public final void zzRf(String str) {
        this.zzRG = str;
    }

    public final void zzRg(String str) {
        this.zzZae = str;
    }

    public final void zzW(zzEY zzey) {
        zzey.zzZ(this);
        this.zzZy4 = zzey;
    }

    public final void zzXC(boolean z) {
        this.zzZah = z;
    }

    public final void zzXD(boolean z) {
        this.zzZak = z;
    }

    @Override // com.aspose.words.zz53
    public final zz53 zzY(boolean z, zzZA5 zzza5) {
        zzD8 zzd8 = (zzD8) super.zzY(z, zzza5);
        zzEY zzey = this.zzZy4;
        if (zzey != null) {
            zzd8.zzW(zzey.zzZM0());
            zzd8.zzZy4.zzZ(zzd8);
        }
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            zzd8.zzZyx = zzd9.zzZI4();
        }
        zzE0 zze0 = this.zzZaj;
        if (zze0 != null) {
            zzd8.zzZaj = zze0.zzZKT();
        }
        zzDN zzdn = this.zzZai;
        if (zzdn != null) {
            zzd8.zzZai = zzdn.zzZIQ();
        }
        zzCL zzcl = this.zzZyC;
        if (zzcl != null) {
            zzd8.zzZyC = zzcl.zzZGr();
        }
        Theme theme = this.zzZad;
        if (theme != null) {
            zzd8.zzZad = theme.zzXVK();
        }
        zzG2 zzg2 = this.zzZal;
        if (zzg2 != null) {
            zzd8.zzZal = zzg2.zzZO2();
        }
        zzG1 zzg1 = this.zzZac;
        if (zzg1 != null) {
            zzd8.zzZac = zzg1.zzZO1();
        }
        zzD3 zzd3 = this.zzZab;
        if (zzd3 != null) {
            zzd8.zzZab = zzd3.zzZHv();
        }
        zzFL zzfl = this.zzZaa;
        if (zzfl != null) {
            zzd8.zzZaa = zzfl.zzZN8();
        }
        if (this.zzZa9 != null) {
            zzd8.zzZa9 = new ArrayList<>();
            Iterator<zzEV> it = this.zzZa9.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(zzd8.zzZa9, it.next().zzZLP());
            }
        }
        if (this.zzZaq != null) {
            zzd8.zzZaq = new com.aspose.words.internal.zzZYG<>();
            Iterator<zz82> it2 = this.zzZaq.zzCJ().iterator();
            while (it2.hasNext()) {
                zz82 zz82VarZzZC0 = it2.next().zzZC0();
                zzd8.zzZaq.set(zz82VarZzZC0.getUri(), zz82VarZzZC0);
            }
        }
        return zzd8;
    }

    @Override // com.aspose.words.zzZCL
    public final void zzZ(zz1K zz1k) {
    }

    public final ArrayList<zzEV> zzZHH() {
        if (this.zzZa9 == null) {
            this.zzZa9 = new ArrayList<>();
        }
        return this.zzZa9;
    }

    public final zzFL zzZHI() {
        if (this.zzZaa == null) {
            this.zzZaa = new zzFL();
        }
        return this.zzZaa;
    }

    public final zzD3 zzZHJ() {
        return this.zzZab;
    }

    public final zzG1 zzZHK() {
        return this.zzZac;
    }

    public final zzG2 zzZHL() {
        return this.zzZal;
    }

    public final Theme zzZHM() {
        return this.zzZad;
    }

    public final int zzZHN() {
        return this.zzZag;
    }

    public final int zzZHO() {
        return this.zzAr;
    }

    public final boolean zzZHP() {
        return this.zzZah;
    }

    public final zzDN zzZHQ() {
        return this.zzZai;
    }

    public final zzE0 zzZHR() {
        return this.zzZaj;
    }

    public final String zzZHS() {
        return this.zzRG;
    }

    public final boolean zzZHT() {
        return (this.zzZan == null && this.zzZae == null) ? false : true;
    }

    public final String zzZHU() {
        return this.zzZae;
    }

    public final zzZBL zzZHV() {
        return this.zzZan;
    }

    public final boolean zzZHW() {
        return this.zzZak;
    }

    public final zzEY zzZHX() {
        return this.zzZy4;
    }

    @Override // com.aspose.words.zz53
    public final int zzZHY() {
        return this.zzZaf ? 13 : 6;
    }

    public final void zzZHZ() {
        this.zzZan = null;
        this.zzZae = null;
    }

    public final zzGK zzZJd() {
        return this.zzZy4.zz45().zzZJd();
    }

    public final ArrayList<zzGK> zzZJf() {
        return this.zzZy4.zz45().zzZJf();
    }

    public final boolean zzZMS() {
        return this.zzZag > 0;
    }

    @Override // com.aspose.words.zzZCL
    public final zz1K zzZTj() {
        return null;
    }

    public final zzD9 zzaQ() {
        if (this.zzZyx == null) {
            this.zzZyx = new zzD9();
        }
        return this.zzZyx;
    }

    public final zzCL zzaR() {
        if (this.zzZyC == null) {
            this.zzZyC = new zzCL();
        }
        return this.zzZyC;
    }

    public zzD8(boolean z) {
        this.zzZam = true;
        this.zzAr = 2;
        this.zzZag = Integer.MIN_VALUE;
        this.zzZaf = z;
    }

    public final void zzZ(zzZBL zzzbl) {
        this.zzZan = zzzbl;
    }

    public final void zzZ(zzE0 zze0) {
        this.zzZaj = zze0;
    }

    public final void zzZ(zzDN zzdn) {
        this.zzZai = zzdn;
    }

    public final void zzZ(Theme theme) {
        this.zzZad = theme;
    }

    public final void zzZ(zzG2 zzg2) {
        this.zzZal = zzg2;
    }

    public final void zzZ(zzG1 zzg1) {
        this.zzZac = zzg1;
    }

    public final void zzZ(zzD3 zzd3) {
        this.zzZab = zzd3;
    }
}
