package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzK5 {
    public static boolean zzY(int i, zzZXH zzzxh) {
        return zzzxh.zzSC(i);
    }

    public static boolean zzZ(String str, zzZXH zzzxh) throws Exception {
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            if (zzZ(((Integer) itOooO00o.next()).intValue(), zzzxh)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzZ(int i, zzZXH zzzxh) throws Exception {
        if (zzzxh == null || i == 0) {
            return false;
        }
        zzZX9 zzzx9ZzSy = zzzxh.zzpP().zzSy(i);
        return zzzx9ZzSy == null || zzzx9ZzSy.getGlyphIndex() == zzzxh.zzpP().zzoT().getGlyphIndex();
    }
}
