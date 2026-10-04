package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes6.dex */
final class zz4C extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("gradFill", "pattFill", "noFill", "solidFill", "prstDash", "custDash", "headEnd", "tailEnd", "bevel", "miter", "round", "extLst", "ds");
    private zzZXT zzZfi;

    private zz4C(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    public static zz4G zz4(zzZXT zzzxt) throws Exception {
        zz4C zz4c = new zz4C(zzzxt);
        String localName = zzzxt.zzZsD().getLocalName();
        if (!"ln".equals(localName) && !"textOutline".equals(localName) && !"uLn".equals(localName) && !"hiddenLine".equals(localName)) {
            return null;
        }
        zz4G zz4g = new zz4G();
        zz4c.zzU(zz4g);
        zz4c.zzW(zz4g);
        return zz4g;
    }

    private int zzOq(String str) {
        return zz84.zzPh(this.zzZfi.zzZsD().zzV(str, ""));
    }

    private int zzOr(String str) {
        return zz84.zzPg(this.zzZfi.zzZsD().zzV(str, ""));
    }

    private void zzQ(zz4G zz4g) {
        double dZzZ = this.zzZfi.zzZsD().zzZ("w", Double.NaN);
        if (Double.isNaN(dZzZ)) {
            return;
        }
        zz4g.zzXK(dZzZ);
    }

    private void zzR(zz4G zz4g) {
        String strZzV = this.zzZfi.zzZsD().zzV("cmpd", "");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            zz4g.zzHo(zz84.zzPb(strZzV));
        }
    }

    private void zzS(zz4G zz4g) {
        String strZzV = this.zzZfi.zzZsD().zzV("cap", "");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            zz4g.setEndCap(zz84.zzPc(strZzV));
        }
    }

    private void zzT(zz4G zz4g) {
        String strZzV = this.zzZfi.zzZsD().zzV("algn", "");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            zz4g.zzWX(BackupFile.EXTENSION_NOTEIN_FILE.equals(strZzV));
        }
    }

    private void zzU(zz4G zz4g) {
        zzQ(zz4g);
        zzR(zz4g);
        zzS(zz4g);
        zzT(zz4g);
    }

    private void zzV(zz4G zz4g) {
        zz4g.zzHn(1);
        zz4g.zzXJ(zz3W.zzZ(this.zzZfi.zzZsD().zzV("lim", ""), this.zzZfi.zzZqn()));
    }

    private void zzW(zz4G zz4g) throws Exception {
        boolean zEquals = "textOutline".equals(this.zzZfi.zzZsD().getLocalName());
        String localName = this.zzZfi.zzZsD().getLocalName();
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 0:
                case 1:
                case 2:
                case 3:
                    zz4g.setFill(zEquals ? zz7V.zza(this.zzZfi) : zz7V.zzc(this.zzZfi));
                    break;
                case 4:
                    zz4g.zzZ(zzZxu());
                    break;
                case 5:
                    zz4g.zzZ(zzZxt());
                    break;
                case 6:
                    zz4g.zzZ(new zz6T());
                    zzY(zz4g.zzZxB());
                    break;
                case 7:
                    zz4g.zzZ(new zz12());
                    zzY(zz4g.zzZxA());
                    break;
                case 8:
                    zz4g.zzHn(0);
                    break;
                case 9:
                    zzV(zz4g);
                    break;
                case 10:
                    zz4g.zzHn(2);
                    break;
                case 11:
                    zz4g.setExtensions(zz81.zzd(this.zzZfi));
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
    }

    private void zzY(zz5V zz5v) {
        zz5v.setLength(zzOr("len"));
        zz5v.setType(zzZxv());
        zz5v.setWidth(zzOq("w"));
    }

    private zzAW zzZxs() {
        zzAW zzaw = new zzAW();
        zzaw.zzXY(zz3W.zzZ(this.zzZfi.zzZsD().zzV("d", ""), this.zzZfi.zzZqn()));
        zzaw.zzXX(zz3W.zzZ(this.zzZfi.zzZsD().zzV("sp", ""), this.zzZfi.zzZqn()));
        return zzaw;
    }

    private zzAX zzZxt() {
        zzAY zzay = new zzAY();
        while (this.zzZfi.zzZsD().zzQ("custDash")) {
            if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 12) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                com.aspose.words.internal.zzZQG.zzZ(zzay.zzZEX(), zzZxs());
            }
        }
        return zzay;
    }

    private zzAX zzZxu() {
        zz3G zz3g = new zz3G();
        zz3g.zzHa(zz84.zzPa(this.zzZfi.zzZsD().zzV("val", "solid")));
        return zz3g;
    }

    private int zzZxv() {
        return zz84.zzPf(this.zzZfi.zzZsD().zzV(C18437z2.f56754h, ""));
    }
}
