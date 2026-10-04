package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zz8 extends zzG implements zzZ9B {
    private zzZ68 zzZFu;
    private zzZ6L zzZFv;
    private ArrayList<com.aspose.words.internal.zzZL> zzZFw;
    private com.aspose.words.internal.zzZS zzZFx;

    public zz8(zzZ68 zzz68, com.aspose.words.internal.zzZS zzzs, com.aspose.words.internal.zzZL zzzl) throws Exception {
        super(zzz68.zzbL(), zzzl);
        this.zzZFx = zzzs;
        this.zzZFu = zzz68;
        this.zzZFW = zzz68.zzmS();
    }

    @Override // com.aspose.words.zzZ9B
    public int getZOrder_IShape() {
        return this.zzZFu.zz14().zzY6M().getZOrder();
    }

    public final void zzD(ArrayList<com.aspose.words.internal.zzZL> arrayList) {
        this.zzZFw = arrayList;
    }

    public final com.aspose.words.internal.zzZS zzbA() {
        return this.zzZFx;
    }

    public final boolean zzbB() {
        return getZOrder_IShape() == 0 && zzbz().isImage() && !zzYJP.zzZ(this.zzZFu.zzYgm);
    }

    public final boolean zzbC() {
        return getZOrder_IShape() < 0;
    }

    public final boolean zzbD() {
        return this.zzZFu.zzYgm.zzaa().zzbD();
    }

    public final ArrayList<com.aspose.words.internal.zzZL> zzbw() {
        return this.zzZFw;
    }

    public final zzZ68 zzbx() {
        return this.zzZFu;
    }

    public final zzY9X zzby() {
        return (zzY9X) com.aspose.words.internal.zzZKW.zzZ(this.zzZFu.zz14(), zzY9X.class);
    }

    public final zzZ6L zzbz() {
        if (this.zzZFv == null) {
            this.zzZFv = zzZ6L.zzYT(this.zzZFu.getNode());
        }
        return this.zzZFv;
    }
}
