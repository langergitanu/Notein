package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZV9 {
    public static String toString(int i) {
        switch (i) {
            case -1:
                return "Group";
            case 0:
                return "Canvas";
            case 1:
                return "OrganizationalChart";
            case 2:
                return "Radial";
            case 3:
                return "Cycle";
            case 4:
                return "Pyramid";
            case 5:
                return "Venn";
            case 6:
                return "Target";
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: Unknown EditAs value, please update EditAsEnum.ToString().");
        }
    }
}
