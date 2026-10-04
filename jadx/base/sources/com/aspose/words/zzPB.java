package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzPB extends zzOP {
    public zzPB() {
        super("font-family", true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    @Override // com.aspose.words.zzOP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzPT zzZ(zzL2 zzl2, int i, boolean z, boolean z2, RefInt refInt) {
        refInt.set(0);
        boolean z3 = false;
        boolean z4 = false;
        int valueType = 7;
        for (int i2 = i; i2 < zzl2.getCount() && !z3 && !z4; i2++) {
            zzL4 zzl4ZzMl = zzl2.zzMl(i2);
            if (valueType != 0) {
                if (valueType != 1) {
                    if (valueType == 7) {
                        if (zzl4ZzMl.getValueType() == 1 || zzl4ZzMl.getValueType() == 0) {
                            com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
                        } else {
                            z4 = true;
                        }
                    }
                } else if (zzl4ZzMl.getValueType() == 7) {
                    com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
                } else {
                    z3 = true;
                }
            } else if (zzl4ZzMl.getValueType() == 0 || zzl4ZzMl.getValueType() == 7) {
                com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
            }
            valueType = zzl4ZzMl.getValueType();
        }
        if (refInt.get() != 0 && !z4 && valueType != 7) {
            return zzX(zzl2.zzYc(i, refInt.get()), z, z2);
        }
        refInt.set(0);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    @Override // com.aspose.words.zzOP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzMP zzZ(zzL2 zzl2, boolean z) {
        zzL4 zzot;
        zzL2 zzl22 = new zzL2();
        boolean z2 = true;
        int valueType = 7;
        String strZzZI = "";
        for (int i = 0; i < zzl2.getCount() && z2; i++) {
            zzL4 zzl4ZzMl = zzl2.zzMl(i);
            if (valueType != 0) {
                if (valueType != 1) {
                    if (valueType == 7) {
                        if (zzl4ZzMl.getValueType() == 1) {
                            zzl22.zzI(zzl4ZzMl);
                        } else if (zzl4ZzMl.getValueType() == 0) {
                            strZzZI = ((zzOT) zzl4ZzMl).getValue();
                        } else {
                            z2 = false;
                        }
                    }
                } else if (zzl4ZzMl.getValueType() == 7) {
                    z2 = true;
                }
            } else if (zzl4ZzMl.getValueType() == 0) {
                if (!com.aspose.words.internal.zzZKN.equals(strZzZI, "")) {
                    strZzZI = com.aspose.words.internal.zzZKN.zzZI(strZzZI, " ");
                }
                strZzZI = com.aspose.words.internal.zzZKN.zzZI(strZzZI, ((zzOT) zzl4ZzMl).getValue());
            } else if (zzl4ZzMl.getValueType() == 7) {
                com.aspose.words.internal.zzZKN.equals(strZzZI, "");
                if (strZzZI.contains(" ")) {
                    zzot = new zzM2(strZzZI);
                } else {
                    zzot = new zzOT(strZzZI);
                }
                zzl22.zzI(zzot);
                strZzZI = "";
            }
            valueType = zzl4ZzMl.getValueType();
        }
        if (z2 && !com.aspose.words.internal.zzZKN.equals(strZzZI, "")) {
            zzl22.zzI(zzL4.zzS4(strZzZI));
        }
        if (z2) {
            return new zzPA(zzl22);
        }
        return null;
    }
}
