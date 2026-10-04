package com.aspose.words.internal;

import com.aspose.words.internal.zzZYG;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZXS extends zzJP {
    public static Iterable<zzGR> zzY(zzF4 zzf4) {
        try {
            return zz0T.zzss() ? zzqc() : zzqb();
        } catch (Exception e) {
            zzJP.zzZ(zzf4, zzZKN.format("Error loading font from system folder: {0}", e.getMessage()));
            return new ArrayList();
        }
    }

    public static String[] zzqa() throws Exception {
        int iZzst = zz0T.zzst();
        return iZzst != 0 ? iZzst != 1 ? iZzst != 2 ? iZzst != 3 ? iZzst != 4 ? new String[0] : zzZXR.zzq3() : zzZXR.zzpV() : zzZXR.zzq4() : zzZXR.zzq7() : new String[]{zzZXR.zzq8()};
    }

    private static Iterable<zzGR> zzqb() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (String str : zzqa()) {
            if (zzZYD.zzXk(str) && zzZOV.zzYb(str)) {
                ArrayList<String> arrayListZzU = zzJ9.zzU(str, true);
                Collections.sort(arrayListZzU, zzZYN.zzc9);
                Iterator<String> it = arrayListZzU.iterator();
                while (it.hasNext()) {
                    zzZQG.zzZ((ArrayList<zzKG>) arrayList, new zzKG(it.next()));
                }
            }
        }
        return arrayList;
    }

    private static Iterable<zzGR> zzqc() throws Exception {
        zzZYG zzzyg = new zzZYG(false);
        String strZzq8 = zzZXR.zzq8();
        if (!zzZYD.zzXk(strZzq8) || !zzZOV.zzYb(strZzq8)) {
            return new ArrayList();
        }
        for (String str : zzJ9.zzU(strZzq8, false)) {
            zzzyg.set(str, str);
        }
        zzZXR.zzq9();
        ArrayList arrayList = new ArrayList();
        zzZYG.zzZ zzzZzr2 = zzzyg.zzr2();
        while (zzzZzr2.moveNext()) {
            String strZzr3 = zzzZzr2.zzr3();
            if (zzZYD.zzXk(strZzr3) && zzZOU.zzYb(strZzr3)) {
                zzZQG.zzZ((ArrayList<zzKG>) arrayList, new zzKG(strZzr3));
            }
        }
        return arrayList;
    }

    @Override // com.aspose.words.internal.zzGP
    public final Iterable<zzGR> getFontDataInternal() {
        return zzY(zzHq());
    }
}
