package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZV0 implements zzG8 {
    private byte[] zz6Y;
    private zzZTY zzr0;

    private zzZV0(zz8T zz8t) {
        this.zzr0 = new zzZTY(zz8t, this);
    }

    private void zzRQ(int i) throws Exception {
        this.zzr0.zzmP().zzq().zzH(this.zzr0.zzmP().zzq().getPosition() + ((long) i));
        this.zz6Y = zzEF.zzZ(this.zzr0.zzmP(), this.zzr0.zzmO().getDataSize() - i);
    }

    public static byte[] zzY(zz8T zz8t) throws Exception {
        zzZV0 zzzv0 = new zzZV0(zz8t);
        zzzv0.zzr0.play();
        return zzzv0.zz6Y;
    }

    @Override // com.aspose.words.internal.zzG8
    public final boolean zzMO() throws Exception {
        int type = this.zzr0.zzmO().getType();
        if (type == 259 || type == 300 || type == 1046) {
            return true;
        }
        if (type == 2881) {
            zzRQ(20);
            return false;
        }
        if (type != 3907) {
            return type == 523 || type == 524;
        }
        zzRQ(22);
        return false;
    }
}
