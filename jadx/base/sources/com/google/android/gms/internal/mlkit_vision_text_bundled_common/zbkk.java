package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import OooOoo.C20593OooO0Oo;

/* JADX INFO: loaded from: classes7.dex */
final class zbkk extends zbki {
    private final Object zba;

    public zbkk(Object obj) {
        this.zba = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final boolean equals(Object obj) {
        if (obj instanceof zbkk) {
            return this.zba.equals(((zbkk) obj).zba);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final int hashCode() {
        return this.zba.hashCode() + 1502476572;
    }

    public final String toString() {
        return C20593OooO0Oo.OooO0O0("Optional.of(", this.zba.toString(), ")");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final Object zba() {
        return this.zba;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final Object zbb(Object obj) {
        return this.zba;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final boolean zbc() {
        return true;
    }
}
