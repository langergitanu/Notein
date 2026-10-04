package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzE8 extends zzDQ {
    private static final zzZHW zzUR = new zzZHW("channelProperty");

    private zzE8(zzDO zzdo) {
        super(zzdo);
    }

    private zzE7 zzDz() {
        int iZzYI = zzDP.zzYI(zzD9().zzV("channel", ""));
        int iZzYG = zzDP.zzYG(zzD9().zzV("name", ""));
        double dZzZ = zzD9().zzZ("value", Double.NaN);
        String strZzV = zzD9().zzV("units", "");
        if (zzZKN.zzS(strZzV, "1/", zzZOF.ORDINAL$4894b8c8)) {
            strZzV = strZzV.substring(2);
            dZzZ = 1.0d / dZzZ;
        }
        return new zzE7(iZzYI, iZzYG, dZzZ, zzDP.zzYH(strZzV));
    }

    private ArrayList<zzE7> zzEd() {
        ArrayList<zzE7> arrayList = new ArrayList<>();
        while (zzD9().zzQ("channelProperties")) {
            if (zzUR.zzTP(zzD9().getLocalName()) != 0) {
                throw new zzDS("Invalid channelProperties element.");
            }
            zzZQG.zzZ(arrayList, zzDz());
        }
        return arrayList;
    }

    public static ArrayList<zzE7> zzY(zzDO zzdo) {
        return new zzE8(zzdo).zzEd();
    }
}
