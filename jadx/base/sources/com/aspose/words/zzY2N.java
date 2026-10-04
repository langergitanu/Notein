package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2N {
    private String zzWWJ;
    private String zzWWK;
    private String zzWWL;
    private String zzWWM;
    private int zzWZQ;
    private zzYU6 zzXSu;

    public zzY2N(zzYU6 zzyu6) {
        this.zzXSu = zzyu6;
    }

    public final void zzIg() {
        if (this.zzWZQ <= 0) {
            return;
        }
        this.zzXSu.zzY("o:lock");
        this.zzXSu.zz0("v:ext", "edit");
        this.zzXSu.zz0("aspectratio", this.zzWWM);
        this.zzXSu.zz0("verticies", this.zzWWL);
        this.zzXSu.zz0("text", this.zzWWK);
        this.zzXSu.zz0("shapetype", this.zzWWJ);
        this.zzXSu.zzp();
    }

    public final void zzZP(int i, Object obj) {
        if (i == 120) {
            this.zzWWM = zzY23.zzYN(obj);
            this.zzWZQ++;
            return;
        }
        if (i == 828) {
            if (((Boolean) obj).booleanValue()) {
                this.zzWWJ = zzY23.zzW(obj, false);
                this.zzWZQ++;
                return;
            }
            return;
        }
        if (i == 124) {
            if (((Boolean) obj).booleanValue()) {
                this.zzWWL = zzY23.zzW(obj, false);
                this.zzWZQ++;
                return;
            }
            return;
        }
        if (i == 125 && ((Boolean) obj).booleanValue()) {
            this.zzWWK = zzY23.zzW(obj, false);
            this.zzWZQ++;
        }
    }
}
