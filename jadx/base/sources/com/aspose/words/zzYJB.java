package com.aspose.words;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJB {
    static com.aspose.words.internal.zzPV zzXBt;
    static com.aspose.words.internal.zzPV zzXBu;
    private static HashMap<Integer, com.aspose.words.internal.zzPV> zzXBy = zzYlr();
    private static com.aspose.words.internal.zzPV[] zzXBx = {zzpx(13), zzpx(2), zzpx(16), zzpx(18), zzpx(12), zzpx(15), zzpx(8), zzpx(11)};
    static com.aspose.words.internal.zzPV zzXBw = zzpx(14);
    static com.aspose.words.internal.zzPV zzXBv = zzpx(13);

    static {
        com.aspose.words.internal.zzPV zzpvZzpx = zzpx(13);
        zzXBu = zzpvZzpx;
        zzXBt = zzZP(zzpvZzpx);
    }

    private static HashMap<Integer, com.aspose.words.internal.zzPV> zzYlr() {
        HashMap<Integer, com.aspose.words.internal.zzPV> map = new HashMap<>();
        map.put(0, com.aspose.words.internal.zzPV.zzHZ);
        map.put(1, new com.aspose.words.internal.zzPV(ViewCompat.MEASURED_STATE_MASK));
        map.put(2, new com.aspose.words.internal.zzPV(-13723693));
        map.put(3, new com.aspose.words.internal.zzPV(-8084645));
        map.put(4, new com.aspose.words.internal.zzPV(-16776961));
        map.put(5, new com.aspose.words.internal.zzPV(SupportMenu.CATEGORY_MASK));
        map.put(6, new com.aspose.words.internal.zzPV(-13144426));
        map.put(7, new com.aspose.words.internal.zzPV(-7858140));
        map.put(8, new com.aspose.words.internal.zzPV(-2057685));
        map.put(9, new com.aspose.words.internal.zzPV(-6249559));
        map.put(10, new com.aspose.words.internal.zzPV(-11512226));
        map.put(11, new com.aspose.words.internal.zzPV(-13868492));
        map.put(12, new com.aspose.words.internal.zzPV(-3263601));
        map.put(13, new com.aspose.words.internal.zzPV(-4913106));
        map.put(14, new com.aspose.words.internal.zzPV(-14967637));
        map.put(15, new com.aspose.words.internal.zzPV(-12668990));
        map.put(16, new com.aspose.words.internal.zzPV(-10276233));
        map.put(17, new com.aspose.words.internal.zzPV(-1));
        map.put(18, new com.aspose.words.internal.zzPV(-339342));
        map.put(20, com.aspose.words.internal.zzPV.zzI0);
        map.put(19, null);
        return map;
    }

    public static com.aspose.words.internal.zzPV zzZP(com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(zzpv);
        zzip.zzZQ(0.9200000166893005d);
        return zzip.zzGx();
    }

    public static com.aspose.words.internal.zzPV zzpw(int i) {
        com.aspose.words.internal.zzPV[] zzpvArr = zzXBx;
        return zzpvArr[i % zzpvArr.length];
    }

    public static com.aspose.words.internal.zzPV zzpx(int i) {
        if ((((long) i) & 4278190080L) != 0) {
            zzXBy.put(Integer.valueOf(i), new com.aspose.words.internal.zzPV(i));
        }
        return zzXBy.get(Integer.valueOf(i));
    }
}
