package com.aspose.words;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQV {
    private String zzYFn;
    private String zzYFo;
    private String zzYFp;
    private boolean zzYFq;
    private String zzYFr;
    private boolean zzYFs;
    private String zzYFt;
    private String zzYFu;
    private String zzYFv;
    private String zzYFw;
    private String zzYFx;
    private String zzYFy;
    private int zzYFz;
    private String zzZCG;
    private int zzjv;

    public zzZQV(FieldIndex fieldIndex) {
        this.zzZCG = fieldIndex.getBookmarkName();
        this.zzYFz = zzZ(fieldIndex);
        this.zzYFy = zzZc(fieldIndex.getSequenceSeparator(), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        this.zzYFx = zzZc(fieldIndex.getPageNumberSeparator(), ", ");
        this.zzjv = zzZQ3.zzLV(fieldIndex.getEntryType());
        this.zzYFw = zzZc(fieldIndex.getPageRangeSeparator(), "–");
        this.zzYFv = zzZc(fieldIndex.getCrossReferenceSeparator(), ". ");
        this.zzYFu = zzZc(fieldIndex.getPageNumberListSeparator(), ", ");
        this.zzYFt = zzM5(fieldIndex.getLetterRange());
        this.zzYFs = fieldIndex.getRunSubentriesOnSameLine();
        this.zzYFr = fieldIndex.getSequenceName();
        this.zzYFq = fieldIndex.getUseYomi();
        this.zzYFp = fieldIndex.getLanguageId();
        zzM4(fieldIndex.getHeading());
    }

    private void zzM4(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == 'A' || cCharAt == 'a') {
                    if (z) {
                        sb.append(cCharAt);
                    } else {
                        com.aspose.words.internal.zzZNH.zzU(sb, "{0}");
                        z = true;
                    }
                } else if (cCharAt == '{') {
                    com.aspose.words.internal.zzZNH.zzU(sb, "{{");
                } else if (cCharAt == '}') {
                    com.aspose.words.internal.zzZNH.zzU(sb, "}}");
                } else {
                    if (!z && Character.isLetter(cCharAt)) {
                        this.zzYFo = ControlChar.zzZs5;
                        return;
                    }
                    sb.append(cCharAt);
                }
            }
            if (z) {
                this.zzYFn = sb.toString();
            } else {
                this.zzYFo = str;
            }
        }
    }

    private static String zzM5(String str) {
        char cZzZK;
        char cZzZK2;
        if (str == null) {
            return null;
        }
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(str);
        return (strZzTX.length() >= 2 && (cZzZK = com.aspose.words.internal.zzZKU.zzZK(strZzTX.charAt(0))) <= (cZzZK2 = com.aspose.words.internal.zzZKU.zzZK(strZzTX.charAt(strZzTX.length() - 1)))) ? new String(new char[]{cZzZK, cZzZK2}) : "";
    }

    private static int zzZ(FieldIndex fieldIndex) {
        return Math.min(4, Math.max(0, fieldIndex.zzZdz() ? fieldIndex.zzZdy().zzUz(0) : 0));
    }

    private static String zzZc(String str, String str2) {
        return str == null ? str2 : str.length() > 15 ? str.substring(0, 15) : str;
    }

    public final String getBookmarkName() {
        return this.zzZCG;
    }

    public final String getCrossReferenceSeparator() {
        return this.zzYFv;
    }

    public final String getLetterRange() {
        return this.zzYFt;
    }

    public final String getPageNumberListSeparator() {
        return this.zzYFu;
    }

    public final String getPageNumberSeparator() {
        return this.zzYFx;
    }

    public final String getPageRangeSeparator() {
        return this.zzYFw;
    }

    public final boolean getRunSubentriesOnSameLine() {
        return this.zzYFs;
    }

    public final String getSequenceName() {
        return this.zzYFr;
    }

    public final String getSequenceSeparator() {
        return this.zzYFy;
    }

    public final boolean hasSequenceName() {
        return this.zzYFr != null;
    }

    public final String zzZ5(char c) {
        String str = this.zzYFo;
        if (str != null) {
            return str;
        }
        String str2 = this.zzYFn;
        if (str2 != null) {
            return com.aspose.words.internal.zzZKN.format(str2, Character.valueOf(c));
        }
        return null;
    }

    public final boolean zzZfb() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzYFt);
    }

    public final boolean zzZfc() {
        return this.zzYFt != null;
    }

    public final boolean zzZfd() {
        return this.zzYFz > 0;
    }

    public final int zzZfe() {
        return this.zzYFz;
    }

    public final boolean zzZff() {
        return this.zzZCG != null;
    }

    public final boolean zzZfg() {
        return (this.zzYFo == null && this.zzYFn == null) ? false : true;
    }

    public final int zzuZ() {
        return this.zzjv;
    }
}
