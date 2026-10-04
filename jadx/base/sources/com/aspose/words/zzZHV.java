package com.aspose.words;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHV extends zzZII {
    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzL4 zzl4ZzS1 = zzL4.zzS1(zzzas.zzKM("color"));
        if (zzl4ZzS1 != null) {
            zzpr.zzV(new zzM3("color", zzl4ZzS1, (byte) 0));
        }
        String strZzKM = zzzas.zzKM(OptionalModuleUtils.FACE);
        if (strZzKM != null && !com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZKN.zzTX(strZzKM), "")) {
            String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(strZzKM, ',');
            zzL2 zzl2 = new zzL2();
            for (String str : strArrZzR) {
                String strZzTX = com.aspose.words.internal.zzZKN.zzTX(str);
                if (!com.aspose.words.internal.zzZKN.zzU3(strZzTX)) {
                    zzl2.zzI(zzL4.zzS4(strZzTX));
                }
            }
            zzpr.zzV(new zzM3("font-family", new zzPA(zzl2)));
        }
        zzL4 zzl4ZzS0 = zzL4.zzS0(zzzas.zzKM("size"));
        if (zzl4ZzS0 != null) {
            zzpr.zzV(new zzM3("font-size", zzl4ZzS0, (byte) 0));
        }
    }
}
