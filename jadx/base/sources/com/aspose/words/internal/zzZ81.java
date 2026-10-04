package com.aspose.words.internal;

import com.orion.penkit.models.LayerInfo;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ81 extends zzZDB {
    private zzZDI zzWqW;
    private static final String[] zzWqY = {LayerInfo.UNSPECIFIED_LAYER_ID, "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    private static final Hashtable zzWqX = new Hashtable();

    private zzZ81(int i) {
        this.zzWqW = new zzZDI(i);
    }

    public static zzZ81 zzXi(Object obj) {
        if (obj instanceof zzZ81) {
            return (zzZ81) obj;
        }
        if (obj != null) {
            return zzg2(zzZDI.zzYD(obj).zzXKZ().intValue());
        }
        return null;
    }

    private static zzZ81 zzg2(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Hashtable hashtable = zzWqX;
        if (!hashtable.containsKey(numValueOf)) {
            hashtable.put(numValueOf, new zzZ81(i));
        }
        return (zzZ81) hashtable.get(numValueOf);
    }

    public final String toString() {
        int iIntValue = this.zzWqW.zzXKZ().intValue();
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("CRLReason: ", (iIntValue < 0 || iIntValue > 10) ? "invalid" : zzWqY[iIntValue]);
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWqW;
    }
}
