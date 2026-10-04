package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHD {
    public static void zzZ(zzYEM zzyem) throws Exception {
        if (zzyem.zzYeo().size() == 0) {
            return;
        }
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzYj9();
        zzyhzZzYfW.zzCC("\\*\\filetbl");
        int i = 0;
        while (i < zzyem.zzYeo().size()) {
            zzyhzZzYfW.zzCC("\\file");
            int i2 = i + 1;
            zzyhzZzYfW.zzZ5("\\fid", i2);
            zzyhzZzYfW.zzYV(zzyem.zzYeo().get(i));
            zzyhzZzYfW.zzYj3();
            zzyhzZzYfW.zzFg();
            i = i2;
        }
        zzyhzZzYfW.zzYj3();
        zzyhzZzYfW.zzFg();
    }
}
