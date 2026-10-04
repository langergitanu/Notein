package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import Oooo0.C20855OooooOO;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes7.dex */
final class zbsw extends zbtb {
    private final int zbc;

    public zbsw(byte[] bArr, int i, int i2) {
        super(bArr);
        zbtc.zbh(0, i2, bArr.length);
        this.zbc = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final byte zba(int i) {
        int i2 = this.zbc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zbtb) this).zba[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(C21532OooOOo.OooO0OO(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final byte zbb(int i) {
        return ((zbtb) this).zba[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb
    public final int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final int zbd() {
        return this.zbc;
    }
}
