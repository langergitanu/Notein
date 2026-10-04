package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGA {
    private static String zzW(short s, int i) {
        byte[] bArr = new byte[6];
        for (int i2 = 0; i2 < 2; i2++) {
            bArr[i2] = (byte) s;
            s = (short) (s >> 8);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3 + 2] = (byte) i;
            i >>= 8;
        }
        return com.aspose.words.internal.zzZYD.zzZ8(bArr);
    }

    public static void zzZ(zzYEM zzyem, zzYX6 zzyx6, int i) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        if (com.aspose.words.internal.zzZYD.zzXk(zzyx6.getName())) {
            zzyhzZzYfW.zzYj5();
            zzyhzZzYfW.zzCD(i == 1 ? "\\*\\mvtof" : "\\*\\mvfmf");
            if (zzyx6.isColumn()) {
                zzyhzZzYfW.zzZ5("\\bkmkcolf", zzyx6.getFirstColumn());
                zzyhzZzYfW.zzZ5("\\bkmkcoll", zzyx6.getLastColumn() + 1);
            }
            zzyhzZzYfW.zzYV(zzyx6.getName());
            zzyhzZzYfW.zzFh();
            zzyhzZzYfW.zzYV(zzW((short) zzyem.zzYgv().add(zzyx6.getAuthor()), zzYEO.zzt(zzyx6.zzkT())));
            zzyhzZzYfW.zzYj4();
        }
    }

    public static void zzZ(zzYEM zzyem, zzYX9 zzyx9, int i) throws Exception {
        String name = zzYX8.zzP(zzyx9.getDocument(), zzyx9.getId()).getName();
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        if (com.aspose.words.internal.zzZYD.zzXk(name)) {
            zzyhzZzYfW.zzYj5();
            zzyhzZzYfW.zzCD(i == 1 ? "\\*\\mvtol" : "\\*\\mvfml");
            zzyhzZzYfW.zzYV(name);
            zzyhzZzYfW.zzYj4();
        }
    }
}
