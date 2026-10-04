package com.google.mlkit.vision.text.pipeline;

import androidx.appcompat.app.OooOOO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok;

/* JADX INFO: loaded from: classes8.dex */
final class zba extends zbn {
    private final zbo zba;
    private final zbok zbb;
    private final zbkx zbc;
    private final boolean zbd;

    public zba(zbo zboVar, zbok zbokVar, zbkx zbkxVar, boolean z) {
        this.zba = zboVar;
        this.zbb = zbokVar;
        if (zbkxVar == null) {
            throw new NullPointerException("Null lineBoxParcels");
        }
        this.zbc = zbkxVar;
        this.zbd = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zbn) {
            zbn zbnVar = (zbn) obj;
            if (this.zba.equals(zbnVar.zbc()) && this.zbb.equals(zbnVar.zbb()) && this.zbc.equals(zbnVar.zba()) && this.zbd == zbnVar.zbd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zba.hashCode() ^ 1000003) * 1000003) ^ this.zbb.hashCode()) * 1000003) ^ this.zbc.hashCode()) * 1000003) ^ (true != this.zbd ? 1237 : 1231);
    }

    public final String toString() {
        zbkx zbkxVar = this.zbc;
        zbok zbokVar = this.zbb;
        String string = this.zba.toString();
        String string2 = zbokVar.toString();
        String string3 = zbkxVar.toString();
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("VkpResults{status=", string, ", textParcel=", string2, ", lineBoxParcels=");
        sbOooO0O0.append(string3);
        sbOooO0O0.append(", fromColdCall=");
        return OooOOO.OooO00o(sbOooO0O0, "}", this.zbd);
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final zbkx zba() {
        return this.zbc;
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final zbok zbb() {
        return this.zbb;
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final zbo zbc() {
        return this.zba;
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final boolean zbd() {
        return this.zbd;
    }
}
