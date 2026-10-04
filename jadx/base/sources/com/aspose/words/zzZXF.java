package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXF extends zzYV5 {
    private int zzYG;
    private zzZYD zzYPf;
    private zzZXR zzYPg;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzZXF(int i, zzZXR zzzxr) throws Exception {
        String strZzZkI;
        String str;
        String str2;
        String str3;
        boolean z = false;
        if (i != 1 ? zzzxr.zzZqS().zzXp7 || !zzzxr.getDocument().zzZpU().isDefault() : zzzxr.zzZqS().zzXp6 || !zzzxr.getDocument().zzZpU().isDefault()) {
            z = true;
        }
        super(i, z, zzzxr);
        this.zzYPg = zzzxr;
        if (zzZrS()) {
            if (i == 0) {
                strZzZkI = zzzxr.zzZmp().zzZkI();
                str = "footnotes.xml";
                str2 = "application/vnd.openxmlformats-officedocument.wordprocessingml.footnotes+xml";
                str3 = "w:footnotes";
            } else {
                if (i != 1) {
                    throw new IllegalStateException("Unknown footnote type.");
                }
                strZzZkI = zzzxr.zzZmp().zzZkH();
                str = "endnotes.xml";
                str2 = "application/vnd.openxmlformats-officedocument.wordprocessingml.endnotes+xml";
                str3 = "w:endnotes";
            }
            zzZYD zzzydZzJ = this.zzYPg.zzJ(str, str2, strZzZkI);
            this.zzYPf = zzzydZzJ;
            zzzydZzJ.zzNU(str3);
        }
    }

    public final void close() {
        zzZYD zzzyd = this.zzYPf;
        if (zzzyd != null) {
            zzzyd.endDocument();
        }
    }

    @Override // com.aspose.words.zzYV5
    public final String zzEH(int i) {
        return zzZXP.zzFa(i);
    }

    public final void zzEI(int i) {
        this.zzYPf.zzY(zzYyL() ? "w:endnote" : "w:footnote");
        this.zzYPf.zzA("w:type", zzZXP.zz3(i, zzYyL()), "normal");
        this.zzYPf.zzZj("w:id", this.zzYG);
        this.zzYPg.zzY(this.zzYPf);
    }

    @Override // com.aspose.words.zzYV5
    public final void zzZ(zzZMS zzzms) throws Exception {
        if (zzzms == null) {
            return;
        }
        zzEI(zzzms.zzZ6S());
        zzzms.accept(this.zzYPg);
        this.zzYPg.zzZX(zzYyL() ? "w:endnote" : "w:footnote", zzZlM());
    }

    public final int zzZlM() {
        this.zzYPf.zzp();
        this.zzYPg.zzZlX();
        int i = this.zzYG;
        this.zzYG = i + 1;
        return i;
    }
}
