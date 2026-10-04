package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKW implements zzZ9M {
    private static volatile HashMap<String, String> zzXDo;
    private static Object zzXDp = new Object();

    private static String zzCV(String str) {
        int iZzT = com.aspose.words.internal.zzZKN.zzT(str, "<", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) + 1;
        return str.substring(iZzT, ((com.aspose.words.internal.zzZKN.zzT(str, ">", r0) - r1) - 1) + iZzT);
    }

    private static HashMap<String, String> zzYmx() throws Exception {
        if (zzXDo == null) {
            synchronized (zzXDp) {
                try {
                    if (zzXDo == null) {
                        zzXDo = zzYmy();
                    }
                } finally {
                }
            }
        }
        return zzXDo;
    }

    private static HashMap<String, String> zzYmy() throws Exception {
        com.aspose.words.internal.zzZOO zzzoo = new com.aspose.words.internal.zzZOO(com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.PresetTextWarpDefinitions.xml", Document.class));
        try {
            HashMap<String, String> map = new HashMap<>(190);
            zzZ(zzzoo);
            while (true) {
                String line = zzzoo.readLine();
                if (line == null || com.aspose.words.internal.zzZKN.zzS(line, "</presetTextWarpDefinitions>", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                    break;
                }
                com.aspose.words.internal.zzZQF.zzY(map, zzCV(line), line);
            }
            return map;
        } finally {
            zzzoo.close();
        }
    }

    private static void zzZ(com.aspose.words.internal.zzZOO zzzoo) throws Exception {
        zzzoo.readLine();
        zzzoo.readLine();
    }

    @Override // com.aspose.words.zzZ9M
    public final String zzJB(String str) {
        try {
            return (String) com.aspose.words.internal.zzQW.zzZ(zzYmx(), str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
