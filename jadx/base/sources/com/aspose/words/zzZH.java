package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzZH extends zzTI {
    private static char[] zzZEI = {FilenameUtils.EXTENSION_SEPARATOR, '+', '-', '!', '#', '$', '%', '&', '\'', '*', IOUtils.DIR_SEPARATOR_UNIX, '=', '?', '^', '_', '`', '{', '|', '}', '~'};
    private static char[] zzZEH = {FilenameUtils.EXTENSION_SEPARATOR, '+', '-'};

    private String getUrl() {
        return isEmail() ? com.aspose.words.internal.zzZKN.format("mailto:{0}", super.getText()) : super.getText();
    }

    private boolean isEmail() {
        boolean z = false;
        for (int i = 0; i < super.getText().length(); i++) {
            char cCharAt = super.getText().charAt(i);
            if (cCharAt == ':') {
                return false;
            }
            if (cCharAt == '@') {
                z = true;
            }
        }
        return z;
    }

    private static boolean zzN(String str, int i, int i2) {
        int i3 = (i2 - i) + 1;
        if (i3 <= 0 || i3 > 63 || !com.aspose.words.internal.zzZYD.isLetterOrDigit(str.charAt(i)) || str.charAt(i2) == '-') {
            return false;
        }
        for (int i4 = i + 1; i4 <= i2; i4++) {
            if (!com.aspose.words.internal.zzZYD.isLetterOrDigit(str.charAt(i4)) && str.charAt(i4) != '-') {
                return false;
            }
        }
        return true;
    }

    private static boolean zzO(String str, int i, int i2) {
        if ((i2 - i) + 1 <= 0) {
            return true;
        }
        if (str.charAt(i) == '.') {
            return false;
        }
        while (i <= i2) {
            char cCharAt = str.charAt(i);
            if (!com.aspose.words.internal.zzZYD.isLetterOrDigit(cCharAt) && !com.aspose.words.internal.zzZ1.zzZ(zzZEI, cCharAt)) {
                return false;
            }
            if (cCharAt == '.' && str.charAt(i - 1) == '.') {
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean zzP(String str, int i, int i2) {
        int i3 = (i2 - i) + 1;
        if (i3 < 2 || i3 > 32 || !com.aspose.words.internal.zzZYD.isLetter(str.charAt(i))) {
            return false;
        }
        for (int i4 = i + 1; i4 <= i2; i4++) {
            if (!com.aspose.words.internal.zzZYD.isLetterOrDigit(str.charAt(i4)) && !com.aspose.words.internal.zzZ1.zzZ(zzZEH, str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzQ(String str, int i, int i2) {
        char cCharAt;
        int iZzZ;
        int i3 = (i2 - i) + 1;
        if (i3 <= 0 || (cCharAt = str.charAt(i2)) == '@' || cCharAt == '.' || (iZzZ = com.aspose.words.internal.zzZKN.zzZ(str, '@', i, i3)) == -1 || !zzO(str, i, iZzZ - 1)) {
            return false;
        }
        int i4 = iZzZ + 1;
        while (i4 <= i2) {
            int iZzZ2 = com.aspose.words.internal.zzZKN.zzZ(str, FilenameUtils.EXTENSION_SEPARATOR, i4, (i2 - i4) + 1);
            int i5 = iZzZ2 == -1 ? i2 : iZzZ2 - 1;
            if (!zzN(str, i4, i5)) {
                return false;
            }
            i4 = i5 + 2;
        }
        return true;
    }

    private static boolean zzR(String str, int i, int i2) {
        int iZzZ = com.aspose.words.internal.zzZKN.zzZ(str, ':', i, (i2 - i) + 1);
        if (iZzZ == -1 || !zzP(str, i, iZzZ - 1)) {
            return false;
        }
        for (int i3 = iZzZ + 1; i3 <= i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (zzZ1N.zzYz(cCharAt) || cCharAt == '<' || cCharAt == '>') {
                return false;
            }
        }
        return true;
    }

    public static boolean zzS(String str, int i, int i2) {
        return zzR(str, i, i2) || zzQ(str, i, i2);
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final String getText() {
        return com.aspose.words.internal.zzZKN.format("{0}{1}{2}", '<', super.getText(), '>');
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        zzY(zzyi);
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 1;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 7;
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final void zzZ(zzZ1T zzz1t) {
        zzz1t.zzT(this);
        zzz1t.zzZ3K().insertHyperlink(super.getText(), getUrl(), false);
        zzz1t.zzS(this);
    }

    public static boolean zzZ(zzJZ zzjz, zzJZ zzjz2) {
        return zzS(zzjz.getText(), zzjz.getEnd() + 1, zzjz2.getStart() - 1);
    }
}
