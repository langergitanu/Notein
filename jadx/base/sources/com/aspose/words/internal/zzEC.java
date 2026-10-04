package com.aspose.words.internal;

import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes5.dex */
public final class zzEC extends zzDQ {
    private static final zzZHW zzUR = new zzZHW("brushProperty", "width", "height", "color", "transparency", "tip", "rasterOp", "antiAliased", "fitToCurve", "ignorePressure", "ellipse", "rectangle", BackupFile.EXTENSION_NOTEIN_FILE);

    private zzEC(zzDO zzdo) {
        super(zzdo);
    }

    private boolean zz0(boolean z) {
        return zzD9().zzX("value", z);
    }

    private zzPV zzD(zzPV zzpv) {
        String strZzV = zzD9().zzV("value", "");
        if (zzZKN.zzU3(strZzV) || strZzV.charAt(0) != '#' || strZzV.length() != 7) {
            return zzpv;
        }
        return new zzPV((zzpv.zzPD() << 24) | zzJB.zzZe(strZzV.substring(1)));
    }

    private int zzDC() {
        return zzUR.zzTP(zzD9().zzV("units", "cm")) != 12 ? 0 : 1;
    }

    private zzED zzDD() throws Exception {
        zzED zzed = new zzED();
        String strZzV = zzD9().zzV("id", "");
        if (zzZKN.zzU3(strZzV)) {
            throw new zzDS("Malformed brush structure.");
        }
        zzD8().zzD5().zzW(strZzV, zzed);
        while (zzD9().zzQ("brush")) {
            if (zzUR.zzTP(zzD9().getLocalName()) != 0) {
                throw new zzDS("Invalid Ink Element.");
            }
            zzZ(zzed);
        }
        return zzed;
    }

    private zzPV zzE(zzPV zzpv) {
        return zzPV.zzX(255 - zzD9().zzX("value", 255 - zzpv.zzPD()), zzpv.zzPC(), zzpv.zzPB(), zzpv.zzPA());
    }

    private int zzVP(int i) {
        int iZzTP = zzUR.zzTP(zzD9().zzV("value", ""));
        if (iZzTP == 10) {
            return 0;
        }
        if (iZzTP != 11) {
            return i;
        }
        return 1;
    }

    private int zzVQ(int i) {
        String strZzV = zzD9().zzV("value", "");
        return zzZKN.zzU3(strZzV) ? i : zzDP.zzYF(strZzV);
    }

    public static zzED zzZ(zzDO zzdo) throws Exception {
        return new zzEC(zzdo).zzDD();
    }

    private double zzZP(double d) {
        double dZzZ = zzD9().zzZ("value", Double.NaN);
        return Double.isNaN(dZzZ) ? d : dZzZ;
    }

    private void zzZ(zzED zzed) {
        switch (zzUR.zzTP(zzD9().zzV("name", ""))) {
            case 1:
                zzed.setWidth(zzZP(zzed.getWidth()));
                zzed.zzVS(zzDC());
                break;
            case 2:
                zzed.setHeight(zzZP(zzed.getHeight()));
                zzed.zzVR(zzDC());
                break;
            case 3:
                zzed.zzY(zzD(zzed.zzZy()));
                break;
            case 4:
                zzed.zzY(zzE(zzed.zzZy()));
                break;
            case 5:
                zzed.zzVU(zzVP(zzed.zzDK()));
                break;
            case 6:
                zzed.zzVT(zzVQ(zzed.zzDJ()));
                break;
            case 7:
                zzed.zz3(zz0(zzed.zzDI()));
                break;
            case 8:
                zzed.zz2(zz0(zzed.zzDH()));
                break;
            case 9:
                zzed.zz1(zz0(zzed.zzDG()));
                break;
        }
    }
}
