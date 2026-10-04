package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKX implements zzZ9N {
    private static volatile HashMap<String, String> zzXDo;
    private static Object zzXDp = new Object();

    private static String zzCV(String str) {
        int iZzT = com.aspose.words.internal.zzZKN.zzT(str, "<", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) + 1;
        return str.substring(iZzT, ((com.aspose.words.internal.zzZKN.zzT(str, ">", r0) - r1) - 1) + iZzT);
    }

    private static HashMap<String, String> zzYmA() throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.PresetShapeDefinitions.xml", Document.class);
        try {
            com.aspose.words.internal.zzZOO zzzoo = new com.aspose.words.internal.zzZOO(zzzopZzW);
            try {
                HashMap<String, String> map = new HashMap<>(190);
                zzZ(zzzoo);
                for (String line = zzzoo.readLine(); line != null; line = zzzoo.readLine()) {
                    if (com.aspose.words.internal.zzZKN.zzS(line, "</presetShapeDefinitons>", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                        break;
                    }
                    com.aspose.words.internal.zzZQF.zzY(map, zzCV(line), line);
                }
                return map;
            } finally {
                zzzoo.close();
            }
        } finally {
            if (zzzopZzW != null) {
                zzzopZzW.close();
            }
        }
    }

    private static Map<String, String> zzYmz() throws Exception {
        if (zzXDo == null) {
            synchronized (zzXDp) {
                try {
                    if (zzXDo == null) {
                        zzXDo = zzYmA();
                    }
                } finally {
                }
            }
        }
        return zzXDo;
    }

    private static void zzZ(com.aspose.words.internal.zzZOO zzzoo) throws Exception {
        zzzoo.readLine();
        zzzoo.readLine();
    }

    @Override // com.aspose.words.zzZ9N
    public final String zzJC(String str) {
        try {
            return (String) com.aspose.words.internal.zzQW.zzZ((Map<String, TValue>) zzYmz(), str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
