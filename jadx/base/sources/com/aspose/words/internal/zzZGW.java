package com.aspose.words.internal;

import OooO0o.C20424OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGW extends zzZH1 {
    final zzZDR zzWOp;

    public zzZGW(zzZDZ zzzdz, zzZGH zzzgh, int i, boolean z, boolean z2, zzZDR zzzdr) {
        super(zzzdz, zzzgh, i, z, z2);
        this.zzWOp = zzzdr;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final int getValueType() {
        return 1;
    }

    @Override // com.aspose.words.internal.zzZH1
    public final String zzZ(zzZGJ zzzgj, char[] cArr, int i, int i2, boolean z) throws zzZQS {
        String strZzZ = zzZH1.zzZ(cArr, i, i2, z, this.zzWOp);
        if (strZzZ != null) {
            return strZzZ;
        }
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Invalid enumerated value '", new String(cArr, i, i2 - i), "': has to be one of (");
        sbOooO0o0.append(this.zzWOp);
        sbOooO0o0.append(")");
        return zzZ(zzzgj, sbOooO0o0.toString());
    }

    @Override // com.aspose.words.internal.zzZH1
    public final zzZH1 zzgY(int i) {
        return new zzZGW(this.zzWOF, this.zzWOD, i, this.zzWOC, this.zzWOB, this.zzWOp);
    }

    @Override // com.aspose.words.internal.zzZH1
    public final void zzZ(zzZEV zzzev) throws zzZQS {
        String strZzX = zzX(zzzev, true);
        String strZzwU = this.zzWOp.zzwU(strZzX);
        if (strZzwU == null) {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Invalid default value '", strZzX, "': has to be one of (");
            sbOooO0o0.append(this.zzWOp);
            sbOooO0o0.append(")");
            zzZ(zzzev, sbOooO0o0.toString());
            return;
        }
        this.zzWOD.setValue(strZzwU);
    }
}
