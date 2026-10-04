package com.aspose.words.internal;

import com.aspose.words.internal.zzUO;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes5.dex */
final class zzU5 extends zzUO {
    private static int[] zzRO = {41377, 41378, 41379, 41380, 41392, 41393, 41457, 41459, 41889, 41900, 41914, 45480, 45496, 45502, 45755, 46025, 46070, 46323, 46525, 46532, 46563, 46767, 46804, 46816, 47010, 47016, 47037, 47062, 47069, 47284, 47327, 47350, 47531, 47561, 47576, 47610, 47613, 47821, 48039, 48086, 48097, 48122, 48316, 48347, 48382, 48588, 48845, 48861, 49076, 49094, 49097, 49332, 49389, 49611, 49883, 50119, 50396, 50410, 50636, 50935, 51192, 51371, 51403, 51413, 51431, 51663, 51706, 51889, 51893, 51911, 51920, 51926, 51957, 51965, 52460, 52728, 52906, 52932, 52946, 52965, 53173, 53186, 53206, 53442, 53445, 53456, 53460, 53671, 53930, 53938, 53941, 53947, 53972, 54211, 54224, 54269, 54466, 54490, 54754, 54992};

    @Override // com.aspose.words.internal.zzU1
    public final String getLanguage() {
        return TranslateLanguage.CHINESE;
    }

    @Override // com.aspose.words.internal.zzU1
    public final String getName() {
        return "GB18030";
    }

    @Override // com.aspose.words.internal.zzUO
    public final boolean zzZ(zzUO.zzZ zzz, zzUU zzuu) {
        int iZzY;
        int iZzY2;
        zzz.index = zzz.zzRX;
        zzz.zzRW = false;
        int iZzY3 = zzz.zzY(zzuu);
        zzz.zzRY = iZzY3;
        if (iZzY3 < 0) {
            zzz.zzRV = true;
            return false;
        }
        if (iZzY3 <= 128) {
            return !zzz.zzRV;
        }
        int iZzY4 = zzz.zzY(zzuu);
        zzz.zzRY = (zzz.zzRY << 8) | iZzY4;
        if (iZzY3 < 129 || iZzY3 > 254) {
            return !zzz.zzRV;
        }
        if ((iZzY4 >= 64 && iZzY4 <= 126) || (iZzY4 >= 80 && iZzY4 <= 254)) {
            return !zzz.zzRV;
        }
        if (iZzY4 < 48 || iZzY4 > 57 || (iZzY = zzz.zzY(zzuu)) < 129 || iZzY > 254 || (iZzY2 = zzz.zzY(zzuu)) < 48 || iZzY2 > 57) {
            zzz.zzRW = true;
            return !zzz.zzRV;
        }
        zzz.zzRY = iZzY2 | (zzz.zzRY << 16) | (iZzY << 8);
        return !zzz.zzRV;
    }

    @Override // com.aspose.words.internal.zzU1
    public final zzUP zzZ(zzUU zzuu) {
        int iZzZ = zzZ(zzuu, zzRO);
        if (iZzZ == 0) {
            return null;
        }
        return new zzUP(this, iZzZ);
    }
}
