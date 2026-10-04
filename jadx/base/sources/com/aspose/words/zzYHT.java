package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHT {
    public static void zzZ(zzYEM zzyem) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzFg();
        zzyhzZzYfW.zzCC("\\colortbl");
        zzyhzZzYfW.zzYj8();
        for (int i = 1; i < zzyem.zzYgw().getCount(); i++) {
            com.aspose.words.internal.zzPV zzpvZzp0 = zzyem.zzYgw().zzp0(i);
            zzyhzZzYfW.zzZ5("\\red", zzpvZzp0.zzPC());
            zzyhzZzYfW.zzZ5("\\green", zzpvZzp0.zzPB());
            zzyhzZzYfW.zzZ5("\\blue", zzpvZzp0.zzPA());
            zzyhzZzYfW.zzYj8();
        }
        zzyhzZzYfW.zzYj3();
        zzyhzZzYfW.zzFg();
    }
}
