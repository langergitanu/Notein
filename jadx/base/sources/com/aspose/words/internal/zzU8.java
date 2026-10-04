package com.aspose.words.internal;

import com.aspose.words.internal.zzUO;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzU8 extends zzUO {
    @Override // com.aspose.words.internal.zzUO
    public final boolean zzZ(zzUO.zzZ zzz, zzUU zzuu) {
        zzz.index = zzz.zzRX;
        zzz.zzRW = false;
        int iZzY = zzz.zzY(zzuu);
        zzz.zzRY = iZzY;
        if (iZzY < 0) {
            zzz.zzRV = true;
            return false;
        }
        if (iZzY <= 141) {
            return !zzz.zzRV;
        }
        int iZzY2 = zzz.zzY(zzuu);
        zzz.zzRY = (zzz.zzRY << 8) | iZzY2;
        if (iZzY >= 161 && iZzY <= 254) {
            if (iZzY2 < 161) {
                zzz.zzRW = true;
            }
            return !zzz.zzRV;
        }
        if (iZzY == 142) {
            if (iZzY2 < 161) {
                zzz.zzRW = true;
            }
            return !zzz.zzRV;
        }
        if (iZzY == 143) {
            int iZzY3 = zzz.zzY(zzuu);
            zzz.zzRY = (zzz.zzRY << 8) | iZzY3;
            if (iZzY3 < 161) {
                zzz.zzRW = true;
            }
        }
        return !zzz.zzRV;
    }
}
