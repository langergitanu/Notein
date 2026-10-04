package com.aspose.words;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEW {
    private static com.aspose.words.internal.zzZYJ zzXrf;
    private static com.aspose.words.internal.zzZYJ zzXrg = new com.aspose.words.internal.zzZYJ();

    static {
        com.aspose.words.internal.zzZYJ zzzyj = new com.aspose.words.internal.zzZYJ();
        zzXrf = zzzyj;
        zzzyj.zzH("\\fhimajor", InputDeviceCompat.SOURCE_TRACKBALL);
        zzXrf.zzH("\\flomajor", 65537);
        zzXrf.zzH("\\fdbmajor", 65539);
        zzXrf.zzH("\\fbimajor", 65538);
        zzXrf.zzH("\\fhiminor", 131076);
        zzXrf.zzH("\\flominor", 131073);
        zzXrf.zzH("\\fdbminor", 131075);
        zzXrf.zzH("\\fbiminor", 131074);
        zzXrg.zzH("\\cmaindarkone", 0);
        zzXrg.zzH("\\cmainlightone", 1);
        zzXrg.zzH("\\cmaindarktwo", 2);
        zzXrg.zzH("\\cmainlighttwo", 3);
        zzXrg.zzH("\\caccentone", 4);
        zzXrg.zzH("\\caccenttwo", 5);
        zzXrg.zzH("\\caccentthree", 6);
        zzXrg.zzH("\\caccentfour", 7);
        zzXrg.zzH("\\caccentfive", 8);
        zzXrg.zzH("\\caccentsix", 9);
        zzXrg.zzH("\\chyperlink", 10);
        zzXrg.zzH("\\cfollowedhyperlink", 11);
        zzXrg.zzH("\\cbackgroundone", 14);
        zzXrg.zzH("\\ctextone", 12);
        zzXrg.zzH("\\cbackgroundtwo", 15);
        zzXrg.zzH("\\ctexttwo", 13);
    }

    public static int zzBI(String str) {
        return zzXrf.zzXo(str);
    }

    public static int zzBJ(String str) {
        return zzXrg.zzXo(str);
    }

    public static String zznJ(int i) {
        return zzXrf.zzSY(i);
    }
}
