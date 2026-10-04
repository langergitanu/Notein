package com.aspose.words;

import com.orion.notein.domain.models.UserConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzXJ {
    private static HashMap<String, HashMap<Integer, Integer>> zzZAW = new HashMap<>();

    static {
        HashMap map = new HashMap();
        com.aspose.words.internal.zzZQF.zzY(map, 61607, 9642);
        com.aspose.words.internal.zzZQF.zzY(map, 61558, 10070);
        com.aspose.words.internal.zzZQF.zzY(map, 61656, 10146);
        com.aspose.words.internal.zzZQF.zzY(map, 61692, Integer.valueOf(UserConstants.ERROR_CODE_AVATAR_UPLOAD_NETWORK));
        HashMap map2 = new HashMap();
        com.aspose.words.internal.zzZQF.zzY(map2, 61623, 8226);
        com.aspose.words.internal.zzZQF.zzY(zzZAW, "Wingdings", map);
        com.aspose.words.internal.zzZQF.zzY(zzZAW, "Symbol", map2);
    }

    public static int zzH(int i, String str) {
        if (zzZAW.containsKey(str) && zzZAW.get(str).containsKey(Integer.valueOf(i))) {
            return zzZAW.get(str).get(Integer.valueOf(i)).intValue();
        }
        return 0;
    }
}
