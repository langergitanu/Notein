package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzYVH {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("id", "date", "createdate", "name", "author", "initials", "original", "colFirst", "col-first", "colLast", "col-last", C18437z2.f56754h, "edGrp", "ed", "displacedByCustomXml");
    private String mName;
    private String zzLu;
    private int zzXUs;
    private int zzXUt;
    private int zzXUu;
    private String zzXUv;
    private String zzXUw;
    private com.aspose.words.internal.zzZQ9 zzXWR;
    private int zzYG;
    private int zzYLN;
    private String zzYLO;
    private String zzmP;

    public zzYVH(zzYU4 zzyu4) {
        this.zzYG = -1;
        this.zzXWR = com.aspose.words.internal.zzZQ9.zz35;
        this.mName = "";
        this.zzLu = "";
        this.zzXUw = "";
        this.zzXUv = "";
        this.zzXUu = -1;
        this.zzXUt = -1;
        this.zzmP = "";
        this.zzYLN = 0;
        this.zzYLO = "";
        this.zzXUs = 2;
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 0:
                    int iZzb = zzyu4.zzb();
                    if (iZzb < 0) {
                        zzyu4.zzZ(16777216, 14, "Negative Ids are not supported by AW, Id was corrected to positive value");
                        iZzb = Math.abs(iZzb);
                    }
                    this.zzYG = iZzb;
                    break;
                case 1:
                case 2:
                    this.zzXWR = com.aspose.words.internal.zzJB.zzZx(zzyu4.getValue());
                    break;
                case 3:
                    this.mName = zzyu4.getValue();
                    break;
                case 4:
                    this.zzLu = zzyu4.getValue();
                    break;
                case 5:
                    this.zzXUw = zzyu4.getValue();
                    break;
                case 6:
                    this.zzXUv = zzyu4.getValue();
                    break;
                case 7:
                case 8:
                    this.zzXUu = zzyu4.zzb();
                    break;
                case 9:
                case 10:
                    this.zzXUt = zzyu4.zzb();
                    break;
                case 11:
                    this.zzmP = zzyu4.getValue();
                    break;
                case 12:
                    this.zzYLN = zzZXQ.zzNu(zzyu4.getValue());
                    break;
                case 13:
                    this.zzYLO = zzyu4.getValue();
                    break;
                case 14:
                    this.zzXUs = zzZXQ.zzNt(zzyu4.getValue());
                    break;
            }
        }
    }

    public final String getAuthor() {
        return this.zzLu;
    }

    public final int getEditorGroup() {
        return this.zzYLN;
    }

    public final int getId() {
        return this.zzYG;
    }

    public final String getInitials() {
        return this.zzXUw;
    }

    public final String getName() {
        return this.mName;
    }

    public final String getSingleUser() {
        return this.zzYLO;
    }

    public final String getType() {
        return this.zzmP;
    }

    public final int zz9d() {
        return this.zzXUs;
    }

    public final boolean zzYDj() {
        return this.zzYG >= 0;
    }

    public final int zzYzf() {
        return this.zzXUt;
    }

    public final int zzYzg() {
        return this.zzXUu;
    }

    public final String zzYzh() {
        return this.zzXUv;
    }

    public final boolean zzZFI() {
        return "Word.Comment".equals(this.zzmP) && this.zzYG >= 0;
    }

    public final com.aspose.words.internal.zzZQ9 zzkT() {
        return this.zzXWR;
    }
}
