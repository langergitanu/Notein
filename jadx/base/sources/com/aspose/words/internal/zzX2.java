package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzX2 {
    private boolean zzUc;
    private zzZQE<zzX1> zzUd = new zzZQE<>();
    private Object zzUe;

    public zzX2(Object obj) {
        this.zzUe = obj;
    }

    public final boolean zzVs() {
        return this.zzUc;
    }

    public final zzX1 zzVt() {
        if (this.zzUd.size() > 0) {
            return this.zzUd.zzl7().getValue();
        }
        return null;
    }

    public final zzZQE<zzX1> zzVu() {
        return this.zzUd;
    }

    public final Object zzVv() {
        return this.zzUe;
    }

    public final void zzZ(zzX1 zzx1, boolean z) {
        this.zzUd.addLast(zzx1);
        this.zzUc = this.zzUc || z;
    }
}
