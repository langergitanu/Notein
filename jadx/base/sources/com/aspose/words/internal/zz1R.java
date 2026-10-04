package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1R extends zz1Y {
    private zzBI zzZQ;

    public zz1R(zz4W zz4w, String str, String str2, zzBI zzbi) {
        super(zz4w, str, str2);
        this.zzZQ = zzbi;
    }

    @Override // com.aspose.words.internal.zz1Y
    public final void zzz(zzFY zzfy) throws Exception {
        if (this.zzZQ.isEmpty()) {
            return;
        }
        zzfy.zzYY("/A");
        zzfy.zzFd();
        zzfy.zzH("/O", "/Layout");
        zzfy.zzZ("/BBox", this.zzZQ.zzBE());
        zzfy.zzFc();
    }
}
