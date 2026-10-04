package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz9E extends zz9J {
    private zzIP zzZ5N;
    private zzIN zzZhN;

    public zz9E(zz8Z zz8z) {
        super(zz8z);
        this.zzZhN = new zzIN();
    }

    @Override // com.aspose.words.zz9K
    public final void zzW(com.aspose.words.internal.zzZYT<String> zzzyt) {
        this.zzZhN.zzX(zzzyt);
    }

    @Override // com.aspose.words.zz9K
    public final void zzXZ(long j) {
        zzXX(this.zzZhN.zzZSe().zzZ(zzZDQ(), new com.aspose.words.internal.zzZQ4(0L, j)).zzZE());
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDA() {
        this.zzZ5N = new zzIP(this.zzZhN, zzZDL().zzZCH());
        Iterator<zz9K> it = zzQw().iterator();
        while (it.hasNext()) {
            this.zzZ5N.zzZ(it.next());
        }
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDC() {
        this.zzZ5N.zzZSi();
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDD() {
        Iterator<zz9K> it = zzQw().iterator();
        while (it.hasNext()) {
            this.zzZhN.zzZRH().zzZ(it.next(), zzZDv(), zzZDL().zzZCH());
        }
    }

    @Override // com.aspose.words.zz9J
    public final long zzZDw() {
        return this.zzZ5N.zzZRN();
    }

    @Override // com.aspose.words.zz9J
    public final boolean zzZDx() {
        return !this.zzZ5N.zzYf(zzZDv());
    }

    @Override // com.aspose.words.zz9J
    public final boolean zzZDy() {
        return this.zzZ5N.isEmpty();
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDz() {
        zzZDL().zzZCI().zzZ((zz9K) this, this.zzZ5N.zzZRN(), zzZDv());
        this.zzZ5N.zzYa(zzZDv());
        this.zzZ5N.zzZRO();
    }

    @Override // com.aspose.words.zz9K
    public final void zzZE0() {
        super.zzZE0();
        zzZDR().zzHW(30);
    }
}
