package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGT {
    public static void zzZ(zzYEM zzyem) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzZ73 zzz73ZzYi5 = zzyem.getDocument().getStyles().zzYi5();
        zzyhzZzYfW.zzCC("\\*\\latentstyles");
        zzyhzZzYfW.zzZ5("\\lsdstimax", zzz73ZzYi5.zzYUa());
        zzyhzZzYfW.zz5("\\lsdlockeddef", zzz73ZzYi5.zzYUf());
        zzyhzZzYfW.zz5("\\lsdsemihiddendef", zzz73ZzYi5.zzYUd());
        zzyhzZzYfW.zz5("\\lsdunhideuseddef", zzz73ZzYi5.zzYUb());
        zzyhzZzYfW.zz5("\\lsdqformatdef", zzz73ZzYi5.zzYUe());
        zzyhzZzYfW.zzZ5("\\lsdprioritydef", zzz73ZzYi5.zzYUc());
        zzyhzZzYfW.zzCC("\\lsdlockedexcept");
        for (int i = 0; i < zzz73ZzYi5.getCount(); i++) {
            zzZ74 zzz74Zzy3 = zzz73ZzYi5.zzy3(i);
            String strZzh = zzY8T.zzh(zzz74Zzy3.getStyleIdentifier(), "");
            if (com.aspose.words.internal.zzZYD.zzXk(strZzh)) {
                if (zzz74Zzy3.getSemiHidden() != zzz73ZzYi5.zzYUd()) {
                    zzyhzZzYfW.zz5("\\lsdsemihidden", zzz74Zzy3.getSemiHidden());
                }
                if (zzz74Zzy3.getUnhideWhenUsed() != zzz73ZzYi5.zzYUb()) {
                    zzyhzZzYfW.zz5("\\lsdunhideused", zzz74Zzy3.getUnhideWhenUsed());
                }
                if (zzz74Zzy3.zzYUl() != zzz73ZzYi5.zzYUe()) {
                    zzyhzZzYfW.zz5("\\lsdqformat", zzz74Zzy3.zzYUl());
                }
                if (zzz74Zzy3.zzYUi() != zzz73ZzYi5.zzYUc()) {
                    zzyhzZzYfW.zzZ5("\\lsdpriority", zzz74Zzy3.zzYUi());
                }
                if (zzz74Zzy3.getLocked() != zzz73ZzYi5.zzYUf()) {
                    zzyhzZzYfW.zz5("\\lsdlocked", zzz74Zzy3.getLocked());
                }
                zzyhzZzYfW.zzYV(strZzh);
                zzyhzZzYfW.zzYj8();
            }
        }
        zzyhzZzYfW.zzYj3();
        zzyhzZzYfW.zzYj3();
    }
}
