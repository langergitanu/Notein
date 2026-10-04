package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6X {
    private static com.aspose.words.internal.zzZYJ zzX6Q;

    static {
        com.aspose.words.internal.zzZYJ zzzyj = new com.aspose.words.internal.zzZYJ();
        zzX6Q = zzzyj;
        zzzyj.zzP(0, "Times New Roman");
        zzX6Q.zzP(1, "Arial");
        zzX6Q.zzP(2, "Courier New");
        zzX6Q.zzP(3, "Symbol");
        zzX6Q.zzP(4, "Helvetica");
        zzX6Q.zzP(5, "Courier");
        zzX6Q.zzP(6, "Tms Rmn");
        zzX6Q.zzP(7, "Helv");
        zzX6Q.zzP(8, "New York");
        zzX6Q.zzP(9, "System");
        zzX6Q.zzP(10, "Wingdings");
        zzX6Q.zzP(11, "MS Mincho");
        zzX6Q.zzP(12, "Batang");
        zzX6Q.zzP(13, "SimSun");
        zzX6Q.zzP(14, "PMingLiU");
        zzX6Q.zzP(15, "MS Gothic");
        zzX6Q.zzP(16, "Dotum");
        zzX6Q.zzP(17, "SimHei");
        zzX6Q.zzP(18, "MingLiU");
        zzX6Q.zzP(19, "Mincho");
        zzX6Q.zzP(20, "Gulim");
        zzX6Q.zzP(21, "Century");
        zzX6Q.zzP(22, "Angsana New");
        zzX6Q.zzP(23, "Cordia New");
        zzX6Q.zzP(24, "Mangal");
        zzX6Q.zzP(25, "Latha");
        zzX6Q.zzP(26, "Sylfaen");
        zzX6Q.zzP(27, "Vrinda");
        zzX6Q.zzP(28, "Raavi");
        zzX6Q.zzP(29, "Shruti");
        zzX6Q.zzP(30, "Sendnya");
        zzX6Q.zzP(31, "Gautami");
        zzX6Q.zzP(32, "Tunga");
        zzX6Q.zzP(33, "Estrangelo Edessa");
        zzX6Q.zzP(34, "Arial Unicode MS");
        zzX6Q.zzP(35, "Tahoma");
    }

    public static String zzB6(int i) {
        return zzX6Q.zzO(i, "Times New Roman");
    }

    public static int zzLn(String str) {
        return zzX6Q.zzG(str, 0);
    }

    public static boolean zzT(TableStyle tableStyle) {
        Iterator<ConditionalStyle> it = tableStyle.getConditionalStyles().zzZY9().iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            ConditionalStyle next = it.next();
            if (next.zzZYg()) {
                zzYEF zzyefZzZYh = next.zzZYh();
                for (int i : zzYEF.zzXq6) {
                    if (zzyefZzZYh.contains(i)) {
                        if (zzX6Q.zzXo(((zzU1) zzyefZzZYh.zzPk(i)).getName()) == Integer.MIN_VALUE) {
                            return true;
                        }
                    }
                }
            }
        }
    }
}
