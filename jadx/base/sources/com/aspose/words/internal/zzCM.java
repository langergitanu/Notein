package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzCM implements zzH8 {
    private Object zzu3;

    public zzCM(String str, zzCN zzcn) throws Exception {
        zzZKN.zzU3(str);
        this.zzu3 = zzZ(str, null, zzcn);
    }

    private static Object zzZ(String str, zzZOP zzzop, zzCN zzcn) throws Exception {
        if (zzcn == null) {
            zzcn = zzCN.zzu4;
        }
        return zzCJ.zzZ(zzZ(str, zzzop), zzcn);
    }

    @Override // com.aspose.words.internal.zzH8
    public final Object zzRt() {
        return this.zzu3;
    }

    public zzCM(zzZOP zzzop, zzCN zzcn) throws Exception {
        this.zzu3 = zzZ(null, zzzop, zzcn);
    }

    private static String zzZ(String str, zzZOP zzzop) throws Exception {
        if (zzzop != null) {
            return new zzZOO(zzzop).zziv();
        }
        return zzZOU.zzZ(str, zzZO0.zzhV());
    }
}
