package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYFA extends zzYF6 {

    /* JADX INFO: renamed from: fo */
    protected zzYF6 f50788fo;

    /* JADX INFO: renamed from: fp */
    protected zzYF6 f50789fp;

    public zzYFA(zzYF6 zzyf6, zzYF6 zzyf62) {
        this.f50788fo = zzyf6;
        this.f50789fp = zzyf62;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final String zzP(String str, String str2, String str3, String str4) throws zzZQS {
        String strZzP = this.f50788fo.zzP(str, str2, str3, str4);
        if (strZzP != null) {
            str4 = strZzP;
        }
        return this.f50789fp.zzP(str, str2, str3, str4);
    }

    @Override // com.aspose.words.internal.zzYF6
    public final void zzP7(boolean z) throws zzZQS {
        this.f50788fo.zzP7(z);
        this.f50789fp.zzP7(z);
    }

    @Override // com.aspose.words.internal.zzYF6
    public final int zzXOx() throws zzZQS {
        int iZzXOx = this.f50788fo.zzXOx();
        int iZzXOx2 = this.f50789fp.zzXOx();
        return iZzXOx < iZzXOx2 ? iZzXOx : iZzXOx2;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final String zzZ(String str, String str2, String str3, char[] cArr, int i, int i2) throws zzZQS {
        String strZzZ = this.f50788fo.zzZ(str, str2, str3, cArr, i, i2);
        return strZzZ != null ? this.f50789fp.zzP(str, str2, str3, strZzZ) : this.f50789fp.zzZ(str, str2, str3, cArr, i, i2);
    }

    @Override // com.aspose.words.internal.zzYF6
    public final int zzj(String str, String str2, String str3) throws zzZQS {
        int iZzj = this.f50788fo.zzj(str, str2, str3);
        int iZzj2 = this.f50789fp.zzj(str, str2, str3);
        return iZzj < iZzj2 ? iZzj : iZzj2;
    }

    @Override // com.aspose.words.internal.zzYF6
    public final void zzk(String str, String str2, String str3) throws zzZQS {
        this.f50788fo.zzk(str, str2, str3);
        this.f50789fp.zzk(str, str2, str3);
    }
}
