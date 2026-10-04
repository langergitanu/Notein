package com.aspose.words;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes6.dex */
class zzU1 extends InternableComplexAttr implements zzZCY, Cloneable {
    private String mName;
    private int zzZti;

    private zzU1(String str) {
        this.zzZti = 0;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            throw new IllegalStateException("Empty name.");
        }
        this.mName = str;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzMU(int i) {
        if (i == 0) {
            return 0;
        }
        switch (i) {
            case 65537:
            case 65538:
            case 65539:
            case InputDeviceCompat.SOURCE_TRACKBALL /* 65540 */:
                return 1;
            default:
                switch (i) {
                    case 131073:
                    case 131074:
                    case 131075:
                    case 131076:
                        return 2;
                    default:
                        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: themeFontCore");
                }
        }
    }

    private static int zzMV(int i) {
        if (i == 1) {
            return 65536;
        }
        if (i == 2) {
            return 131072;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: themeFont");
    }

    public static zzU1 zzMW(int i) {
        return new zzU1(i);
    }

    public static zzU1 zzSP(String str) {
        if (str.length() > 31) {
            str = str.substring(0, 31);
        }
        return new zzU1(str);
    }

    public static zzU1 zzYh(int i, int i2) {
        return new zzU1(zzMV(i) | i2);
    }

    public static String zzZ(Object obj, Theme theme) {
        return zzZ(obj, theme, zzYEF.zzYdx());
    }

    @Override // com.aspose.words.zzZCY
    public zzZCY deepCloneComplexAttr() {
        return (zzU1) memberwiseClone();
    }

    public boolean equals(Object obj) {
        return (obj instanceof zzU1) && zzZ(this, (zzU1) obj);
    }

    public final String getName() {
        if (zzZYI()) {
            throw new IllegalStateException("Inaccessible because font is defined by theme font.");
        }
        return this.mName;
    }

    public final int getThemeFont() {
        if (zzZYI()) {
            return zzMU(zzZYJ());
        }
        return 0;
    }

    public int hashCode() {
        return com.aspose.words.internal.zzZKN.format("{0}{1}", this.mName, Integer.valueOf(this.zzZti)).hashCode();
    }

    @Override // com.aspose.words.zzZCY
    public boolean isInheritedComplexAttr() {
        return false;
    }

    public String toString() {
        return zzZYI() ? zzY5I.toString(this.zzZti) : this.mName;
    }

    public final boolean zzZYI() {
        return (this.zzZti == 0 || com.aspose.words.internal.zzZYD.zzXk(this.mName)) ? false : true;
    }

    public final int zzZYJ() {
        if (zzZYI()) {
            return this.zzZti;
        }
        throw new IllegalStateException("Inaccessible because font is defined by font name.");
    }

    public static String zzZ(Object obj, Theme theme, String str) {
        return zzZ(obj, theme, str, zzYEF.zzYdx());
    }

    public static String zzZ(Object obj, Theme theme, String str, String str2) {
        if (obj == null) {
            return null;
        }
        zzU1 zzu1 = (zzU1) obj;
        if (!zzu1.zzZYI()) {
            return zzu1.getName();
        }
        if (theme == null) {
            return str2;
        }
        String fontName = theme.getFontName(zzu1.zzZYJ());
        return com.aspose.words.internal.zzZYD.zzXk(fontName) ? fontName : str;
    }

    private zzU1(int i) {
        this.zzZti = i;
    }

    public static boolean zzZ(zzU1 zzu1, zzU1 zzu12) {
        if (com.aspose.words.internal.zzZKO.zzA(zzu1, zzu12)) {
            return true;
        }
        return !com.aspose.words.internal.zzZKO.zzA(null, zzu1) && !com.aspose.words.internal.zzZKO.zzA(null, zzu12) && com.aspose.words.internal.zzZKN.equals(zzu1.mName, zzu12.mName) && zzu1.zzZti == zzu12.zzZti;
    }

    public static boolean zzZ(com.aspose.words.internal.zzGQ zzgq, zzU1 zzu1) throws Exception {
        if (zzu1 == null) {
            return false;
        }
        if (zzu1.zzZYI()) {
            return (zzu1.zzZYJ() & 65535) == 3;
        }
        return com.aspose.words.internal.zzJF.zzZ(zzgq, zzu1.getName());
    }
}
