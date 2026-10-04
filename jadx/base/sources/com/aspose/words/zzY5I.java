package com.aspose.words;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5I {
    public static String toString(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Ascii";
        }
        if (i == 2) {
            return "Bidi";
        }
        if (i == 3) {
            return "EastAsia";
        }
        if (i == 4) {
            return "HAnsi";
        }
        if (i == 16711680) {
            return "GroupMask";
        }
        switch (i) {
            case 65535:
                return "RegionMask";
            case 65536:
                return "Major";
            case 65537:
                return "MajorAscii";
            case 65538:
                return "MajorBidi";
            case 65539:
                return "MajorEastAsia";
            case InputDeviceCompat.SOURCE_TRACKBALL /* 65540 */:
                return "MajorHAnsi";
            default:
                switch (i) {
                    case 131072:
                        return "Minor";
                    case 131073:
                        return "MinorAscii";
                    case 131074:
                        return "MinorBidi";
                    case 131075:
                        return "MinorEastAsia";
                    case 131076:
                        return "MinorHAnsi";
                    default:
                        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: Unknown ThemeFont value, please update ThemeFontHelper.ToString().");
                }
        }
    }
}
