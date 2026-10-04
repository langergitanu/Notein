package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzJ6 {
    private zzJF zzZig;
    private String zzZi3 = "";
    private String zzZi2 = "";
    private int zzZi1 = 2;
    private int zzZi0 = 0;
    private int zzZhZ = 1;
    private int zzZhY = 3;
    private ArrayList<Integer> zzZhX = new ArrayList<>();
    private ArrayList<Integer> zzZhW = new ArrayList<>();

    private static void zzZ(com.aspose.words.internal.zzZYT<String> zzzyt, String str, ArrayList<Integer> arrayList) {
        if (!zzzyt.containsKey(str) || !com.aspose.words.internal.zzZYD.zzXk(zzzyt.get(str))) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<int>) arrayList, 5);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<int>) arrayList, 8);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<int>) arrayList, 6);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<int>) arrayList, 1);
            return;
        }
        for (String str2 : com.aspose.words.internal.zzZKN.zzR(zzzyt.get(str), ControlChar.SPACE_CHAR)) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, Integer.valueOf(zz9Z.zzPM(str2)));
        }
    }

    public final void zzX(com.aspose.words.internal.zzZYT<String> zzzyt) {
        if (zzzyt.containsKey("srcNode")) {
            this.zzZi3 = zzzyt.get("srcNode");
        }
        if (zzzyt.containsKey("dstNode")) {
            this.zzZi2 = zzzyt.get("dstNode");
        }
        if (zzzyt.containsKey("begSty")) {
            this.zzZi1 = zz9Z.zzPL(zzzyt.get("begSty"));
        }
        if (zzzyt.containsKey("endSty")) {
            this.zzZi0 = zz9Z.zzPL(zzzyt.get("endSty"));
        }
        if (zzzyt.containsKey("dim")) {
            this.zzZhZ = zz9Z.zzPN(zzzyt.get("dim"));
        }
        if (zzzyt.containsKey("connRout")) {
            this.zzZhY = zz9Z.zzPK(zzzyt.get("connRout"));
        }
        zzZ(zzzyt, "begPts", this.zzZhX);
        zzZ(zzzyt, "endPts", this.zzZhW);
        this.zzZig = zzJF.zzY(zzzyt);
    }

    public final boolean zzZRS() {
        return this.zzZhZ == 0;
    }

    public final boolean zzZRT() {
        return this.zzZi0 == 0;
    }

    public final boolean zzZRU() {
        return this.zzZi1 == 0;
    }

    public final int zzZRV() {
        return this.zzZhY;
    }

    public final ArrayList<Integer> zzZRW() {
        return this.zzZhW;
    }

    public final ArrayList<Integer> zzZRX() {
        return this.zzZhX;
    }

    public final String zzZRY() {
        return this.zzZi2;
    }

    public final String zzZRZ() {
        return this.zzZi3;
    }
}
