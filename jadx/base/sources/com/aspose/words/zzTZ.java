package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzTZ implements zzZ8R {
    private static int[] zzZtb = {0, 0, 0, 0, 9730, 9219, 9220, 9221, 9222, 9223, 9224, EditingLanguage.ENGLISH_CARIBBEAN, 9738, 0, 9228, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9238, 9239, 0, 0, 0, 9755, 0, 0, 0, 0, 0, 0, 0, 9251, 0, 0, 0, 0, 0, 0, 9258, 0, 0, 0, 0, 0, 9264, 9265, 0, 9267, 9268, 9269, 9270, 9271, 9272, 0, 0, EditingLanguage.INARI_SAMI_FINLAND, 0, 0, 0, 2103, EditingLanguage.ARABIC_IRAQ, 2050, 0, 0, 0, 2054, 0, 0, 0, EditingLanguage.SPANISH_MEXICO, 0, 10764, 2136, 10329, 0, 0, 0, 10803, 0, 2101, 2102, 2103, 2104, 2105, 2106, EditingLanguage.NORTHERN_SAMI_SWEDEN, EditingLanguage.IRISH, 0, 10814, 0, 0, 0, 10818, 0, 10820, 0, 10822, 0, 10824, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10835, 2132, 2133, 2134, 11776, 9792, 0, 0, 0, 0, 0, 0};
    static int zzZtc = 8;
    private zzZLN zzZt9;
    private zzYBC zzZta;
    boolean zzZtd;
    boolean zzZte;
    int zzZtf;

    public zzTZ(com.aspose.words.internal.zzZOX zzzox, int i, int i2, ArrayList<zzZLN> arrayList, int i3) throws Exception {
        this.zzZta = new zzYBC(i, i2);
        this.zzZtd = (zzzox.zzXa() & 1) != 0;
        int iZzXc = zzzox.zzXc();
        boolean z = !zzZRA.zzDL(i3) && (1073741824 & iZzXc) == 0;
        this.zzZte = z;
        if (!z && !zzZRA.zzDL(i3)) {
            iZzXc = (iZzXc & 1073741823) / 2;
        }
        this.zzZtf = iZzXc;
        short sZzXa = zzzox.zzXa();
        if ((sZzXa & 1) != 0) {
            this.zzZt9 = arrayList.get((sZzXa & 65534) >> 1);
        } else {
            int i4 = zzZtb[(sZzXa & 254) >> 1];
            this.zzZt9 = new zzZLN(new byte[]{(byte) i4, (byte) (i4 >> 8), (byte) (sZzXa >> 8)});
        }
    }

    @Override // com.aspose.words.zzZ8R
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzJ((short) 0);
        if (this.zzZte) {
            zzzow.zzl(this.zzZtf);
        } else {
            zzzow.zzl((this.zzZtf * 2) | 1073741824);
        }
        zzzow.zzJ((short) 0);
    }

    public final zzZLN zzZYF() {
        return this.zzZt9;
    }

    public final zzYBC zzZYG() {
        return this.zzZta;
    }

    public zzTZ(int i, int i2, int i3, boolean z) {
        this.zzZta = new zzYBC(i, i2);
        this.zzZtf = i3;
        this.zzZte = z;
        this.zzZtd = false;
        this.zzZt9 = new zzZLN();
    }
}
