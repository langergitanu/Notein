package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFZ {
    public static void zzZ(zzYEM zzyem) throws Exception {
        zzZK0 zzzk0ZzZq2 = zzyem.getDocument().zzZq2();
        if (zzzk0ZzZq2.getCount() == 0) {
            return;
        }
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzYj9();
        zzyhzZzYfW.zzCC("\\*\\pgptbl");
        for (int i = 0; i < zzzk0ZzZq2.getCount(); i++) {
            zzZK1 zzzk1ZzA7 = zzzk0ZzZq2.zzA7(i);
            zzyhzZzYfW.zzCC("\\pgp");
            zzyhzZzYfW.zzZ5("\\ipgp", zzzk0ZzZq2.indexOfKey(zzzk1ZzA7.getParentId()) + 1);
            zzyhzZzYfW.zzZ5("\\itap", zzzk1ZzA7.zzZ4k());
            zzyhzZzYfW.zzZ5("\\li", ((Integer) zzzk1ZzA7.zzZYj().zzPj(1592)).intValue());
            zzyhzZzYfW.zzZ5("\\ri", ((Integer) zzzk1ZzA7.zzZYj().zzPj(1593)).intValue());
            zzyhzZzYfW.zzZ5("\\sb", ((Integer) zzzk1ZzA7.zzZYj().zzPj(1594)).intValue());
            zzyhzZzYfW.zzZ5("\\sa", ((Integer) zzzk1ZzA7.zzZYj().zzPj(1595)).intValue());
            zzZ(zzyem, "\\brdrt", zzzk1ZzA7.zzZYj().zz5A());
            zzZ(zzyem, "\\brdrl", zzzk1ZzA7.zzZYj().zz5y());
            zzZ(zzyem, "\\brdrb", zzzk1ZzA7.zzZYj().zz5z());
            zzZ(zzyem, "\\brdrr", zzzk1ZzA7.zzZYj().zz5x());
            zzyhzZzYfW.zzYj3();
            zzyhzZzYfW.zzFg();
        }
        zzyhzZzYfW.zzYj3();
        zzyhzZzYfW.zzFg();
    }

    private static void zzZ(zzYEM zzyem, String str, Border border) throws Exception {
        if (border.isVisible()) {
            zzyem.zzYfW().zzCD(str);
            zzYI0.zzZ(zzyem, border);
        }
    }
}
