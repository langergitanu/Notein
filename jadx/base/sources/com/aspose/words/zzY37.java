package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY37 {
    private zzYU6 zzXSu;

    public zzY37(zzYU6 zzyu6) {
        this.zzXSu = zzyu6;
    }

    public final void zzK(String str, boolean z, boolean z2) {
        if (z != z2) {
            this.zzXSu.zzX(str, z ? "t" : "f");
        }
    }

    public final void zzN(String str, Object obj) {
        if (obj instanceof Boolean) {
            this.zzXSu.zz0(str, ((Boolean) obj).booleanValue() ? "t" : "f");
        } else if (obj instanceof com.aspose.words.internal.zzPV) {
            this.zzXSu.zz0(str, zzY35.zzf((com.aspose.words.internal.zzPV) obj));
        } else {
            this.zzXSu.zzP(str, obj);
        }
    }

    public final void zzX(String str, Object obj, Object obj2) {
        if (obj == null || obj.equals(obj2)) {
            return;
        }
        zzN(str, obj);
    }
}
