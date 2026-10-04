package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIQ {
    private static zzYIU zzS(zzYIU zzyiu) {
        if (zzYIT.zzW(zzyiu)) {
            return zzYIU.zzXxD;
        }
        zzYIS zzyis = new zzYIS();
        for (com.aspose.words.internal.zzHG zzhg : zzyiu) {
            char cZzFM = zzhg.zzFM();
            if (cZzFM > ' ' && cZzFM < 127) {
                zzyis.zzZ((char) ((cZzFM - ' ') | 65280), (zzYIV) zzhg);
            } else if (cZzFM == ' ') {
                zzyis.zzZ((char) 12288, (zzYIV) zzhg);
            } else {
                zzyis.zzZ((zzYIV) zzhg);
            }
        }
        return zzyis.zzYkq();
    }

    private static zzYIU zzT(zzYIU zzyiu) {
        if (zzyiu == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: s");
        }
        zzYIS zzyis = new zzYIS(zzyiu);
        int i = 0;
        while (true) {
            if (i >= zzyis.getLength()) {
                break;
            }
            zzYIV zzyivZzpn = zzyis.zzpn(i);
            if (!com.aspose.words.internal.zzZYD.zzh(zzyivZzpn.zzFM())) {
                zzyis.zzZ(i, zzyivZzpn.zzYks());
                break;
            }
            i++;
        }
        return zzyis.zzYkq();
    }

    private static zzYIU zzU(zzYIU zzyiu) {
        if (zzyiu == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: s");
        }
        zzYIS zzyis = new zzYIS(zzyiu);
        boolean z = false;
        for (int i = 0; i < zzyis.getLength(); i++) {
            zzYIV zzyivZzpn = zzyis.zzpn(i);
            if (com.aspose.words.internal.zzZYD.zzh(zzyivZzpn.zzFM())) {
                z = false;
            } else if (z) {
                zzyis.zzZ(i, zzyivZzpn.zzYkr());
            } else {
                zzyis.zzZ(i, zzyivZzpn.zzYks());
                z = true;
            }
        }
        return zzyis.zzYkq();
    }

    public static zzYIU zzZ(zzYIU zzyiu, int i) {
        if (i == 0) {
            return zzyiu;
        }
        if (i == 1) {
            return zzyiu.zzYkp();
        }
        if (i == 2) {
            return zzyiu.zzYko();
        }
        if (i == 3) {
            return zzU(zzyiu);
        }
        if (i == 4) {
            return zzT(zzyiu);
        }
        if (i == 5) {
            return zzS(zzyiu);
        }
        throw new IllegalStateException("Unknown char case specified.");
    }
}
