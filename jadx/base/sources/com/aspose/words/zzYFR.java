package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFR {
    public static void zzQ(zzYEM zzyem) throws Exception {
        zzYI4 zzyi4 = zzyem.getDocument().zzZpV().zzYVj;
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        if (zzyi4.getCount() == 0) {
            return;
        }
        zzyhzZzYfW.zzFg();
        zzyhzZzYfW.zzCB("\\rsidtbl");
        for (int i = 0; i < zzyi4.getCount(); i++) {
            zzyhzZzYfW.zzZ5("\\rsid", zzyi4.get(i));
        }
        zzyhzZzYfW.zzYj3();
        zzyhzZzYfW.zzFg();
    }

    public static void zzR(zzYEM zzyem) throws Exception {
        zzYFS zzyfsZzYgv = zzyem.zzYgv();
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        if (zzyfsZzYgv.getCount() < 2) {
            return;
        }
        zzyhzZzYfW.zzFg();
        zzyhzZzYfW.zzCC("\\*\\revtbl");
        for (int i = 0; i < zzyfsZzYgv.getCount(); i++) {
            zzyhzZzYfW.zzYj5();
            zzyhzZzYfW.zzYV(zzyfsZzYgv.get(i));
            zzyhzZzYfW.zzYj8();
            zzyhzZzYfW.zzYj4();
        }
        zzyhzZzYfW.zzYj3();
        zzyhzZzYfW.zzFg();
    }
}
