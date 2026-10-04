package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZED extends zzZEL {
    public zzZED(zzZEA zzzea, String str, zzZHB zzzhb) {
        super(zzzea, str, zzzhb, false);
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzW0(String str) throws zzZQS {
        if (!this.zzWK7) {
            zzZEK.zzxn("Trying to write a namespace declaration when there is no open start element.");
        }
        zzxq(str);
        zzxp(str);
    }

    @Override // com.aspose.words.internal.zzZEL
    public final void zzXE(String str, String str2) throws zzZQS {
        this.zzWKj.zzXz(str, str2);
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzY(String str, String str2, String str3, String str4) throws zzZQS {
        if (!this.zzWK7) {
            zzZEK.zzxn(zzZH9.zzWP0);
        }
        zzM(str3, str2, str, str4);
    }

    @Override // com.aspose.words.internal.zzZQQ
    public final void zzZZ(String str, String str2) throws zzZQS {
        if (str == null || str.length() == 0 || str.equals("xmlns")) {
            zzW0(str2);
            return;
        }
        if (!this.zzWK7) {
            zzZEK.zzxn("Trying to write a namespace declaration when there is no open start element.");
        }
        if (!this.zzWQ6 && str2.length() == 0) {
            zzZEK.zzxn(zzZH9.zzWPk);
        }
        setPrefix(str, str2);
        zzXG(str, str2);
    }

    @Override // com.aspose.words.internal.zzZEL
    public final void zzi(String str, String str2, String str3) throws zzZQS {
        zzXH(str2, str);
        zzYF6 zzyf6 = this.zzWKU;
        if (zzyf6 != null) {
            zzyf6.zzk(str2, str3, str);
        }
        zzZEC zzzec = this.zzWKh;
        if (zzzec != null) {
            this.zzWKh = zzzec.zzY(this.zzWKj, str, str2, str3);
            this.zzWKg--;
            this.zzWKj = zzzec;
        } else {
            this.zzWKj = this.zzWKj.zzg(str, str2, str3);
        }
        zzXF(str, str2);
    }

    @Override // com.aspose.words.internal.zzZEL
    public final void zzxq(String str) throws zzZQS {
        this.zzWKj.zzx5(str);
    }
}
