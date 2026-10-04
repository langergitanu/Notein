package com.aspose.words.internal;

import com.aspose.words.internal.zzUO;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes5.dex */
final class zzU9 extends zzUO {
    private static int[] zzRP = {41280, 41281, 41282, 41283, 41287, 41289, 41333, 41334, 42048, 42054, 42055, 42056, 42065, 42068, 42071, 42084, 42090, 42092, 42103, 42147, 42148, 42151, 42177, 42190, 42193, 42207, 42216, 42237, 42304, 42312, 42328, 42345, 42445, 42471, 42583, 42593, 42594, 42600, 42608, 42664, 42675, 42681, 42707, 42715, 42726, 42738, 42816, 42833, 42841, 42970, 43171, 43173, 43181, 43217, 43219, 43236, 43260, 43456, 43474, 43507, 43627, 43706, 43710, 43724, 43772, 44103, 44111, 44208, 44242, 44377, 44745, 45024, 45290, 45423, 45747, 45764, 45935, 46156, 46158, 46412, 46501, 46525, 46544, 46552, 46705, 47085, 47207, 47428, 47832, 47940, 48033, 48593, 49860, 50105, 50240, 50271};

    @Override // com.aspose.words.internal.zzU1
    public final String getLanguage() {
        return TranslateLanguage.CHINESE;
    }

    @Override // com.aspose.words.internal.zzU1
    public final String getName() {
        return "Big5";
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
        if (iZzY > 127 && iZzY != 255) {
            int iZzY2 = zzz.zzY(zzuu);
            if (iZzY2 < 0) {
                return false;
            }
            zzz.zzRY = (zzz.zzRY << 8) | iZzY2;
            if (iZzY2 < 64 || iZzY2 == 127 || iZzY2 == 255) {
                zzz.zzRW = true;
            }
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzU1
    public final zzUP zzZ(zzUU zzuu) {
        int iZzZ = zzZ(zzuu, zzRP);
        if (iZzZ == 0) {
            return null;
        }
        return new zzUP(this, iZzZ);
    }
}
