package com.aspose.words;

import com.aspose.words.net.System.Data.IDataReader;
import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2W implements zzZAF {
    private IDataReader zzCB;
    private boolean zzPx;
    private String[] zzY63;
    private String zzYDj;

    public zzZ2W(IDataReader iDataReader, String str) {
        this.zzCB = iDataReader;
        this.zzYDj = str;
    }

    private void zzYK4() {
        if (this.zzY63 != null) {
            return;
        }
        this.zzY63 = new String[this.zzCB.getFieldCount()];
        for (int i = 0; i < this.zzCB.getFieldCount(); i++) {
            this.zzY63[i] = zzZ2M.zzIN(this.zzCB.getName(i));
        }
    }

    @Override // com.aspose.words.zzZAF
    public final int getFieldCount() {
        return this.zzCB.getFieldCount();
    }

    @Override // com.aspose.words.zzZAF
    public final String getTableName() {
        return this.zzYDj;
    }

    @Override // com.aspose.words.zzZAF
    public final boolean getValue(String str, Ref<Object> ref) throws Exception {
        return zzZ2M.zzZ(this, str, ref);
    }

    @Override // com.aspose.words.zzZAG
    public final boolean moveNext() {
        if (this.zzPx) {
            return false;
        }
        boolean z = this.zzCB.read();
        this.zzPx = !z;
        return z;
    }

    @Override // com.aspose.words.zzZAG
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzZAF
    public final int zzMq(String str) {
        for (int i = 0; i < this.zzCB.getFieldCount(); i++) {
            if (com.aspose.words.internal.zzZYD.zzi(this.zzCB.getName(i), str)) {
                return i;
            }
        }
        zzYK4();
        return com.aspose.words.internal.zzZ1.zzX(this.zzY63, str);
    }

    @Override // com.aspose.words.zzZAF
    public final boolean zzZ(int i, Ref<Object> ref) throws Exception {
        if (zzZ2M.zzZ(this, i)) {
            ref.set(this.zzCB.get(i));
            return true;
        }
        ref.set(null);
        return false;
    }

    @Override // com.aspose.words.zzZAG
    public final boolean zzZha() {
        return false;
    }

    @Override // com.aspose.words.zzZAF
    public final boolean zzZhb() {
        return true;
    }

    @Override // com.aspose.words.zzZAF
    public final zzZAF zzu(String str, boolean z) {
        return null;
    }
}
