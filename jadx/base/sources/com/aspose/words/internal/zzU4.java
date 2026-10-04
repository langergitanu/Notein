package com.aspose.words.internal;

import com.aspose.words.internal.zzUO;
import com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes5.dex */
final class zzU4 extends zzUO {
    private static int[] zzRO = {33088, 33089, 33090, 33093, 33115, 33129, 33130, 33141, 33142, 33440, 33442, 33444, 33449, 33450, 33451, 33453, 33455, 33457, 33459, 33461, 33463, 33469, 33470, 33473, 33476, 33477, 33478, 33480, 33481, 33484, 33485, 33500, 33504, 33511, 33512, 33513, 33514, 33520, 33521, 33601, 33603, 33614, 33615, 33624, 33630, 33634, 33639, 33653, 33654, 33673, 33674, 33675, 33677, 33683, SmsRetrieverStatusCodes.USER_PERMISSION_REQUIRED, 37882, 38314};

    @Override // com.aspose.words.internal.zzU1
    public final String getLanguage() {
        return TranslateLanguage.JAPANESE;
    }

    @Override // com.aspose.words.internal.zzU1
    public final String getName() {
        return "Shift_JIS";
    }

    @Override // com.aspose.words.internal.zzUO
    public final boolean zzZ(zzUO.zzZ zzz, zzUU zzuu) {
        zzz.index = zzz.zzRX;
        zzz.zzRW = false;
        int iZzY = zzz.zzY(zzuu);
        zzz.zzRY = iZzY;
        if (iZzY < 0) {
            return false;
        }
        if (iZzY <= 128) {
            return true;
        }
        if (iZzY >= 160 && iZzY <= 223) {
            return true;
        }
        if (iZzY >= 253 && iZzY <= 255) {
            return true;
        }
        if ((iZzY >= 129 && iZzY <= 159) || (iZzY >= 224 && iZzY <= 252)) {
            int iZzY2 = zzz.zzY(zzuu);
            if (iZzY2 < 0) {
                return false;
            }
            zzz.zzRY = (iZzY << 8) | iZzY2;
            if ((iZzY2 >= 64 && iZzY2 <= 126) || (iZzY2 >= 128 && iZzY2 <= 252)) {
                return true;
            }
        }
        zzz.zzRW = true;
        return true;
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
