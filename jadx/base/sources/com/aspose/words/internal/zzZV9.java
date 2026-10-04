package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZV9 {
    private int[] zz79 = new int[8];

    private static String zzRR(int i) {
        switch (i) {
            case 0:
                return "image";
            case 1:
                return "font";
            case 2:
                return "text";
            case 3:
                return "svg";
            case 4:
                return "clip";
            case 5:
                return "gradient";
            case 6:
                return "texture";
            case 7:
                return "hatch";
            default:
                return "";
        }
    }

    public final String zzW7(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(zzRR(i));
        int[] iArr = this.zz79;
        int i2 = iArr[i] + 1;
        iArr[i] = i2;
        sb.append(zzJB.zz5(i2));
        return sb.toString();
    }
}
