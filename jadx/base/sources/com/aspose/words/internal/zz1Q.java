package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1Q extends zz1Y {
    private int zzsB;

    public zz1Q(zz4W zz4w, int i) {
        super(zz4w, "/L", "");
        this.zzsB = i;
    }

    private static String zzTG(int i) {
        switch (i) {
            case 1:
                return "/Decimal";
            case 2:
                return "/UpperRoman";
            case 3:
                return "/LowerRoman";
            case 4:
                return "/UpperAlpha";
            case 5:
                return "/LowerAlpha";
            case 6:
                return "/Unordered";
            case 7:
                return "/Ordered";
            default:
                return "/None";
        }
    }

    @Override // com.aspose.words.internal.zz1Y
    public final void zzz(zzFY zzfy) throws Exception {
        if (this.zzsB != 0) {
            zzfy.zzYY("/A");
            zzfy.zzFd();
            zzfy.zzH("/O", "/List");
            zzfy.zzH("/ListNumbering", zzTG(this.zzsB));
            zzfy.zzFc();
        }
    }
}
