package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNC {
    private static volatile com.aspose.words.internal.zzD3<zzYND> zzXHZ;
    private static Object zzwC = new Object();

    private static byte[] zzCZ(String str) {
        try {
            com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW(com.aspose.words.internal.zzZKN.format("Aspose.Words.Resources.PageBorderArt.{0}", str), Document.class);
            try {
                return com.aspose.words.internal.zzEF.zzZ(com.aspose.words.internal.zzZYQ.zzZX(zzzopZzW), com.aspose.words.internal.zzEG.zzX(1, 1, 96.0d));
            } finally {
                if (zzzopZzW != null) {
                    zzzopZzW.close();
                }
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    private static com.aspose.words.internal.zzD3<zzYND> zzYqy() throws Exception {
        if (zzXHZ == null) {
            synchronized (zzwC) {
                try {
                    if (zzXHZ == null) {
                        zzXHZ = zzYqz();
                    }
                } finally {
                }
            }
        }
        return zzXHZ;
    }

    private static com.aspose.words.internal.zzD3<zzYND> zzYqz() throws Exception {
        com.aspose.words.internal.zzD3<zzYND> zzd3 = new com.aspose.words.internal.zzD3<>();
        com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.PageBorderArt.Definitions.xml", Document.class);
        try {
            com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzopZzW);
            while (zzo.zzQ("BorderArtDefinitions")) {
                zzYND zzynd = new zzYND(com.aspose.words.internal.zzZQB.zz2(zzo.zzV("id", "-1")), com.aspose.words.internal.zzZQB.zz2(zzo.zzV("contraction", "0")), com.aspose.words.internal.zzZQB.zz2(zzo.zzV("hexpansion", "0")), com.aspose.words.internal.zzZQB.zz2(zzo.zzV("vexpansion", "0")));
                zzynd.zzZ(3, 0, zzCZ(zzo.zzV(TranslateLanguage.TAGALOG, "")));
                zzynd.zzZ(3, 1, zzCZ(zzo.zzV("t", "")));
                zzynd.zzZ(3, 2, zzCZ(zzo.zzV(TranslateLanguage.TURKISH, "")));
                zzynd.zzZ(1, 1, zzCZ(zzo.zzV("l", "")));
                zzynd.zzZ(2, 1, zzCZ(zzo.zzV("r", "")));
                zzynd.zzZ(0, 0, zzCZ(zzo.zzV("bl", "")));
                zzynd.zzZ(0, 1, zzCZ(zzo.zzV("b", "")));
                zzynd.zzZ(0, 2, zzCZ(zzo.zzV("br", "")));
                zzd3.add(zzynd.getId(), zzynd);
            }
            return zzd3;
        } finally {
            if (zzzopZzW != null) {
                zzzopZzW.close();
            }
        }
    }

    public static int zzqQ(int i) {
        switch (i) {
            case 208:
                return 229;
            case 209:
                return 230;
            case 210:
                return 231;
            case 211:
                return 232;
            case 212:
                return 233;
            case 213:
                return 234;
            default:
                return i;
        }
    }

    public static int zzqR(int i) {
        switch (i) {
            case 228:
                return 121;
            case 229:
                return 208;
            case 230:
                return 209;
            case 231:
                return 210;
            case 232:
                return 211;
            case 233:
                return 212;
            case 234:
                return 213;
            default:
                return i;
        }
    }

    public static zzYND zzqS(int i) {
        try {
            zzYND zzynd = zzYqy().get(zzqR(i));
            if (zzynd != null) {
                return zzynd;
            }
            throw new IllegalStateException("Unknown border art.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
