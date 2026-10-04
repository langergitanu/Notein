package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSH {
    public static zzTL zzW(zzZQM zzzqm, String str) throws Exception {
        return zzZ(zzzqm, str, new zzZQG(false, false));
    }

    public static zzTL zzX(zzZQM zzzqm, String str) throws Exception {
        return zzZ(zzzqm, str, new zzZQG(false));
    }

    public static zzZVZ zzY(zzZQM zzzqm, String str, boolean z) throws Exception {
        zzZSM zzzsmZzY = zzZSG.zzY(zzzqm, com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(str, '=', ControlChar.SPACE_CHAR), (char) 7, ControlChar.SPACE_CHAR), '\t', ControlChar.SPACE_CHAR), ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.SPACE_CHAR), new zzYJS(z));
        if (zzzsmZzY == null) {
            return null;
        }
        return (zzZVZ) com.aspose.words.internal.zzZKW.zzZ(zzZSJ.zzZ(zzzsmZzY), zzZVZ.class);
    }

    public static zzTL zzZ(Field field, String str) throws Exception {
        return zzZ(new zzZQM(field), str, new zzZQG(true));
    }

    private static zzTL zzZ(zzZQM zzzqm, String str, zzZBH zzzbh) throws Exception {
        zzZSM zzzsmZzY = zzZSG.zzY(zzzqm, str, zzzbh);
        if (zzzsmZzY == null) {
            return zzZU3.zzZiV();
        }
        return zzZSJ.zzZ(zzzsmZzY);
    }
}
