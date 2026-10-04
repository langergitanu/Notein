package com.aspose.words.internal;

import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zz23 {
    private static String zzTH(int i) {
        return zz4P.toString(i).toUpperCase() + "withRSA";
    }

    public static zzZ6G zzZ(zzWZ zzwz, int i) throws Exception {
        Security.addProvider(new zzYQ8());
        zzYHL zzyhlZzW = new zzYH7(zzTH(i)).zzW(zzwz.zzVi().getPrivateKey());
        zzZ6G zzz6g = new zzZ6G();
        zzz6g.zzZ(new zzZ61(new zzYH6().zzXyt()).zzXH8().zzZ(zzyhlZzW, zzwz.zzVk()));
        ArrayList arrayList = new ArrayList();
        zzZQG.zzZ((ArrayList<zzZ6T>) arrayList, zzwz.zzVk());
        zzz6g.zzZ(new zzZ6S(arrayList));
        return zzz6g;
    }

    public static zzZ63 zzZ(zzZ63 zzz63, zzYGW zzygw) {
        zzZAV zzzav = new zzZAV(zzZ96.zzWx9, new zzZC0(zzygw.zzXyn().zzXHi()));
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(zzzav);
        return zzZ63.zzZ(zzz63, new zzZAU(zzzdj));
    }
}
