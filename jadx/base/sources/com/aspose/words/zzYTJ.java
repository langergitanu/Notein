package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTJ {
    private double zzXRK;
    private int zzZCp;
    private com.aspose.words.internal.zzPV zzZf = com.aspose.words.internal.zzPV.zzHZ;

    private zzYTJ() {
    }

    public static zzYTJ zzZ(zzYTJ zzytj, String str) {
        if (zzytj == null) {
            zzytj = new zzYTJ();
        }
        if ("none".equals(str)) {
            zzytj.zzZCp = 0;
            return zzytj;
        }
        boolean z = false;
        for (String str2 : com.aspose.words.internal.zzZKN.zzR(str, ControlChar.SPACE_CHAR)) {
            String strZzTX = com.aspose.words.internal.zzZKN.zzTX(str2);
            if (com.aspose.words.internal.zzZKN.zzS(strZzTX, "#", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) || "transparent".equals(strZzTX)) {
                zzytj.zzZf = zzYOU.zzDu(strZzTX);
            } else if (zzYSF.zzFO(strZzTX)) {
                zzytj.zzXRK = zzYSF.zzFW(strZzTX);
                z = true;
            } else if (zzytj.zzZCp == 0) {
                zzytj.zzZCp = zzYS3.zzF8(strZzTX);
            }
        }
        if (z && zzytj.zzXRK == 0.0d) {
            zzytj.zzZCp = 0;
        }
        return zzytj;
    }

    public final int getLineStyle() {
        return this.zzZCp;
    }

    public final double zzYyc() {
        return this.zzXRK;
    }

    public final com.aspose.words.internal.zzPV zzZy() {
        return this.zzZf;
    }

    public static Border zzZ(zzYTJ zzytj, double d, boolean z) {
        Border border = new Border();
        if (zzytj != null) {
            border.zzOV(zzytj.zzZCp);
            border.zzm(zzytj.zzZf);
            border.zzOU(zzYOU.zzZ(border, zzytj.zzXRK));
        }
        if (!z && zzytj != null && zzytj.zzZCp != 0) {
            double d2 = d * 28.34645669291339d;
            if (d2 > 31.0d) {
                d2 = 31.0d;
            }
            border.zzOT(com.aspose.words.internal.zzAN.zzZG(d2));
        }
        if (border.equals(Border.zzZCe)) {
            border.zzYN(true);
        }
        return border;
    }

    public static Border zzZ(zzYTJ zzytj) {
        return zzZ(zzytj, 0.0d, false);
    }
}
