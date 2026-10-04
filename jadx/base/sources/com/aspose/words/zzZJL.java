package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJL {
    private static zzZJM zzYsE = new zzZJM();
    private HashMap<Character, HashMap<zzZJM, zzZJM>> zzYsG = new HashMap<>();
    private zzZJM zzYsF = new zzZJM();

    private zzZJM zzKT(String str) {
        int i;
        zzZJM zzzjm = this.zzYsF;
        if (str != null) {
            while (i < str.length()) {
                HashMap map = (HashMap) com.aspose.words.internal.zzQW.zzZ(this.zzYsG, Character.valueOf(str.charAt(i)));
                i = (map == null || (zzzjm = (zzZJM) com.aspose.words.internal.zzQW.zzZ(map, zzzjm)) == null) ? 0 : i + 1;
                return zzYsE;
            }
        }
        return zzzjm;
    }

    public final void add(String str, String str2) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZYD.zzXk(str2);
        zzZJM zzzjm = this.zzYsF;
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            HashMap<zzZJM, zzZJM> map = (HashMap) com.aspose.words.internal.zzQW.zzZ(this.zzYsG, Character.valueOf(cCharAt));
            if (map == null) {
                map = new HashMap<>();
                this.zzYsG.put(Character.valueOf(cCharAt), map);
            }
            zzZJM zzzjm2 = (zzZJM) com.aspose.words.internal.zzQW.zzZ(map, zzzjm);
            if (zzzjm2 == null) {
                zzzjm2 = new zzZJM();
                map.put(zzzjm, zzzjm2);
            }
            zzzjm.zzZ3R();
            i++;
            zzzjm = zzzjm2;
        }
        zzzjm.zzKW(str2);
    }

    public final boolean zzKU(String str) {
        return !zzKT(str).zzZ3S();
    }

    public final String zzKV(String str) {
        return zzKT(str).getCharacters();
    }
}
