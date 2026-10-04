package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzE1 extends zzDQ {
    private static final zzZHW zzUR = new zzZHW("inkSource");

    private zzE1(zzDO zzdo) {
        super(zzdo);
    }

    private zzE2 zzDt() {
        zzE2 zze2 = new zzE2();
        String strZzV = zzD9().zzV("id", "");
        if (zzZKN.zzU3(strZzV)) {
            throw new IllegalStateException();
        }
        zzD8().zzD7().zzW(strZzV, zze2);
        while (zzD9().zzQ("context")) {
            if (zzUR.zzTP(zzD9().getLocalName()) == 0) {
                zze2.zzZ(zzDT.zzW(zzD8()));
            }
        }
        return zze2;
    }

    public static zzE2 zzX(zzDO zzdo) {
        return new zzE1(zzdo).zzDt();
    }
}
