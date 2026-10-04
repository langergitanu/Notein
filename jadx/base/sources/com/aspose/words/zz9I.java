package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz9I extends zz9J {
    private zzJB zzZ5W;
    private zzJ9 zzZ5X;
    public HashMap<zz9K, zz5K> zzZ5Y;

    public zz9I(zz8Z zz8z) {
        super(zz8z);
        this.zzZ5X = new zzJ9();
        this.zzZ5Y = new HashMap<>();
    }

    @Override // com.aspose.words.zz9K
    public final void zzW(com.aspose.words.internal.zzZYT<String> zzzyt) {
        this.zzZ5X.zzX(zzzyt);
    }

    @Override // com.aspose.words.zz9K
    public final void zzXZ(long j) {
        zzXX(this.zzZ5X.zzZSe().zzZ(zzZDQ(), new com.aspose.words.internal.zzZQ4(0L, j)).zzZE());
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDA() {
        int iZzZF2 = zzZDL().zzZCH().zzZF2();
        Iterator<T> it = this.zzZ5Y.values().iterator();
        while (it.hasNext()) {
            ((zz5K) it.next()).zzZyC();
        }
        zzZDR().zzZzb();
        this.zzZ5W = new zzJB(this.zzZ5Y);
        Iterator<zz9K> it2 = zzQw().iterator();
        while (it2.hasNext()) {
            this.zzZ5W.zzZ(it2.next());
        }
        zzZDL().zzZCH().zzX8(iZzZF2);
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDB() {
        this.zzZ5W.zzZ(zzZDL().zzZCI());
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDC() {
        this.zzZ5W.zzZSj();
        this.zzZ5W.zzZSi();
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDD() {
        this.zzZ5X.zzZSf().zzZ(zzZDN(), zzZDM(), zzZDL());
    }

    @Override // com.aspose.words.zz9J
    public final long zzZDw() {
        return this.zzZ5W.zzZSh().getSize();
    }

    @Override // com.aspose.words.zz9J
    public final boolean zzZDx() {
        return !this.zzZ5W.zzYf(zzZDv());
    }

    @Override // com.aspose.words.zz9J
    public final boolean zzZDy() {
        return false;
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDz() {
        zzZDL().zzZCI().zzZ((zz9K) this, this.zzZ5W.zzZSh().getSize(), zzZDv());
        this.zzZ5W.zzR(zzZDv(), this.zzZ5X.zzZSf().zzZSl());
        zzZDR().zzZzb();
        this.zzZ5W.zzZSk();
    }

    @Override // com.aspose.words.zz9K
    public final void zzZE0() {
        super.zzZE0();
        for (zz9K zz9k : zzQw()) {
            zz5K zz5k = new zz5K(this, zz9k, zzZDL());
            com.aspose.words.internal.zzZQF.zzY(this.zzZ5Y, zz9k, zz5k);
            zz5k.zzZ(zzZDR());
        }
    }
}
