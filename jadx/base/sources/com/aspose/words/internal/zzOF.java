package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzOF extends zz0V {
    private zzH0 zzFT;
    private zzH0 zzFU;

    public zzOF(zzZZR zzzzr, zzH0 zzh0, zzH0 zzh02) {
        super(zzzzr);
        this.zzFU = zzh0;
        this.zzFT = zzh02;
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        Object objZzx = this.zzFU.zzx();
        String string = null;
        String string2 = objZzx == null ? null : objZzx.toString();
        if (zzZKN.zzU3(string2)) {
            throw new IllegalStateException("An expression providing combobox or dropdown list item's value should return a non-empty value.");
        }
        zzH0 zzh0 = this.zzFT;
        if (zzh0 == null) {
            string = string2;
        } else {
            Object objZzx2 = zzh0.zzx();
            if (objZzx2 != null) {
                string = objZzx2.toString();
            }
        }
        zzfs.zzY(zzzzr.zzEW(), string2, string);
        return 0;
    }
}
