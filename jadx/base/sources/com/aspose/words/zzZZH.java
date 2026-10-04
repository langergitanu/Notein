package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZZH extends com.aspose.words.internal.zz0S implements zzZ9P {
    private int zzYWE;

    public zzZZH(int i) {
        this.zzYWE = i;
    }

    public final int getSize() {
        return (getItemCount() * this.zzYWE) + (zzsk() * 4);
    }

    public final void zzGl(int i) {
        for (int i2 = 0; i2 < zzsk(); i2++) {
            zzZD(i2, (zzTe(i2) * 2) + i);
        }
    }

    public zzZ8R zzU(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int i = this.zzYWE;
        if (i == 0) {
            return null;
        }
        if (i == 4) {
            return new zzY08(zzzox.zzXc());
        }
        throw new IllegalStateException("You need to override this method to read PLCF data.");
    }

    public int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        if (getItemCount() == 0) {
            return 0;
        }
        getItemCount();
        for (int i = 0; i < zzsk(); i++) {
            zzzow.zzl(zzTe(i));
        }
        for (int i2 = 0; i2 < getItemCount(); i2++) {
            Object item = getItem(i2);
            if (item != null) {
                zzZ8R zzz8r = (zzZ8R) com.aspose.words.internal.zzZKW.zzZ(item, zzZ8R.class);
                if (zzz8r == null) {
                    throw new IllegalStateException("Cannot write PLCF item because it does not expose IWritable interface.");
                }
                zzz8r.zzZ(zzzow);
            }
        }
        return getSize();
    }

    @Override // com.aspose.words.zzZ9P
    public final void zzY(com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
        if (zzsk() == 0) {
            add(i);
        }
        zzX(i2, zzU(zzzox));
    }

    public final void zzZ(com.aspose.words.internal.zzZOX zzzox, zzZRG zzzrg) throws Exception {
        zzzox.zzq().zzH(zzzrg.zzYHK);
        zzYLK.zzZ(zzzox, zzzrg.zzYHJ, this.zzYWE, this, getClass().getName());
    }

    public final int zzZrQ() {
        return this.zzYWE + (getItemCount() == 0 ? 8 : 4);
    }
}
