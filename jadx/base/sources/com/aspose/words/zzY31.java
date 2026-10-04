package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY31 {
    private zzJW[] zzWZp;
    private String zzWZq;
    private String zzWZr;
    private String zzWZs;
    private String zzWZt;
    private String zzWZu;
    private String zzWZv;
    private zzZ8U zzWZx;
    private zzYU6 zzXSu;
    private String zzxu;
    private String zzWZw = null;
    private int zzWZQ = 0;

    public zzY31(zzZ8U zzz8u, zzYU6 zzyu6) {
        this.zzXSu = zzyu6;
        this.zzWZx = zzz8u;
    }

    public final String zzXTI() {
        return this.zzWZw;
    }

    public final void zzXTJ() {
        if (this.zzWZQ > 0) {
            this.zzXSu.zzY("o:diagram");
            this.zzXSu.zz0("v:ext", "edit");
            this.zzXSu.zz0("dgmstyle", this.zzxu);
            this.zzXSu.zz0("dgmscalex", this.zzWZv);
            this.zzXSu.zz0("dgmscaley", this.zzWZu);
            this.zzXSu.zz0("dgmfontsize", this.zzWZt);
            this.zzXSu.zz0("constrainbounds", this.zzWZs);
            this.zzXSu.zz0("autoformat", this.zzWZr);
            this.zzXSu.zz0("reverse", this.zzWZq);
            zzJW[] zzjwArr = this.zzWZp;
            if (zzjwArr != null && zzjwArr.length > 0) {
                this.zzXSu.zzY("o:relationtable");
                this.zzXSu.zz0("v:ext", "edit");
                for (zzJW zzjw : this.zzWZp) {
                    this.zzXSu.zzY("o:rel");
                    this.zzXSu.zz0("v:ext", "edit");
                    this.zzXSu.zz0("idsrc", this.zzWZx.zzFt(zzjw.zzZj2));
                    this.zzXSu.zz0("iddest", this.zzWZx.zzFt(zzjw.zzZj1));
                    this.zzXSu.zz0("idcntr", this.zzWZx.zzFt(zzjw.zzZj0));
                    this.zzXSu.zzp();
                }
                this.zzXSu.zzp();
            }
            this.zzXSu.zzp();
        }
    }

    public final void zzZP(int i, Object obj) {
        int i2 = this.zzWZQ;
        this.zzWZQ = i2 + 1;
        if (i == 1280) {
            this.zzWZw = zzY30.zziI(((Integer) obj).intValue());
            this.zzWZQ--;
            return;
        }
        if (i == 1281) {
            this.zzxu = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
            return;
        }
        if (i == 1340) {
            this.zzWZr = zzY23.zzYN(obj);
            return;
        }
        if (i == 1341) {
            this.zzWZq = zzY23.zzYN(obj);
            return;
        }
        if (i == 1343) {
            this.zzWZQ = i2;
            return;
        }
        switch (i) {
            case 1284:
                this.zzWZp = (zzJW[]) obj;
                break;
            case 1285:
                this.zzWZv = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                break;
            case 1286:
                this.zzWZu = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                break;
            case 1287:
                this.zzWZt = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                break;
            case 1288:
                this.zzWZs = zzYU3.zz7((int[]) obj);
                break;
        }
    }
}
