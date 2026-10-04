package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZK0 {
    private com.aspose.words.internal.zzZYV<zzZK1> zzYth = new com.aspose.words.internal.zzZYV<>();

    public static void zzR(zzY6G zzy6g) {
        for (int i = 5019; i >= 5016; i--) {
            if (zzy6g.contains(i)) {
                zzy6g.remove(i);
            }
        }
    }

    private zzYMX zzZU(int i, boolean z) {
        zzZK1 zzzk1ZzA8 = zzA8(i);
        if (zzzk1ZzA8 == null) {
            return new zzYMX();
        }
        if (!z) {
            return zzzk1ZzA8.zzZYj();
        }
        zzYMX zzymxZzZU = zzZU(zzzk1ZzA8.getParentId(), true);
        zzzk1ZzA8.zzZYj().zzY(zzymxZzZU);
        return zzymxZzZU;
    }

    public final int getCount() {
        return this.zzYth.getCount();
    }

    public final int indexOfKey(int i) {
        return this.zzYth.indexOfKey(i);
    }

    public final zzZK1 zzA7(int i) {
        return this.zzYth.zzVY(i);
    }

    public final zzZK1 zzA8(int i) {
        return this.zzYth.get(i);
    }

    public final void zzX(zzZK0 zzzk0) {
        for (int i = 0; i < zzzk0.zzYth.getCount(); i++) {
            zzZ(zzzk0.zzA7(i));
        }
    }

    public final void zzZ(zzZK1 zzzk1) {
        if (this.zzYth.get(zzzk1.getId()) != null) {
            return;
        }
        this.zzYth.add(zzzk1.getId(), zzzk1);
        zzzk1.zzY(this);
    }

    public final zzZK0 zzZ4g() {
        zzZK0 zzzk0 = new zzZK0();
        for (int i = 0; i < this.zzYth.getCount(); i++) {
            zzzk0.zzZ(zzA7(i).zzZ4h());
        }
        return zzzk0;
    }

    public final void zzZ(zzYMX zzymx, zzYMX zzymx2, boolean z) {
        Object objZzPk = zzymx.zzPk(1585);
        if (objZzPk != null) {
            zzZU(((Integer) objZzPk).intValue(), z).zzY(zzymx2);
        }
    }

    public final void zzZ(zzY6G zzy6g, int i, boolean z) {
        zzYMX zzymx = new zzYMX();
        zzZU(i, z).zzY(zzymx);
        for (int i2 = 1592; i2 <= 1595; i2++) {
            if (zzymx.get(i2) != null) {
                zzy6g.set(i2 + 3424, zzymx.get(i2));
            }
        }
    }
}
