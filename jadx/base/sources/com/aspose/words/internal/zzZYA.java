package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZYA extends zzZV5 {
    private zzZY2<zzPY> zzbJ;
    private zzZY2<zzPY> zzbK;
    private zzZY2<zzPY> zzbL;
    private zzZY0 zzbM;
    private zzP zzbN;

    public zzZYA(zzZY0 zzzy0, zzP zzp) {
        super(zzzy0);
        this.zzbN = zzp;
        this.zzbM = zzzy0;
        this.zzbL = new zzZY2<>(zzzy0, 5);
        this.zzbK = new zzZY2<>(zzzy0, 7);
        this.zzbJ = new zzZY2<>(zzzy0, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float zzR(zzPY zzpy) {
        float fZzPD;
        if (zzpy == null) {
            fZzPD = 1.0f;
        } else {
            int iZzPH = zzpy.zzPH();
            if (iZzPH == 0) {
                fZzPD = ((zzOI) zzpy).zzZy().zzPD() / 255.0f;
            } else if (iZzPH == 2) {
                fZzPD = ((zzOH) zzpy).zzNf();
            }
        }
        if (fZzPD < 0.0f || fZzPD > 1.0f) {
            return 1.0f;
        }
        return fZzPD;
    }

    private void zzV(zzPY zzpy, String str) {
        zzOP zzop = (zzOP) zzpy;
        this.zzbN.zzY("radialGradient");
        this.zzbN.zzX("id", str);
        if (zzop.zzNo()) {
            this.zzbN.zzX("gradientUnits", "userSpaceOnUse");
        }
        this.zzbN.zzX("spreadMethod", zzY(zzop));
        boolean zZzNo = zzop.zzNo();
        this.zzbN.zzX("cx", zzZY1.zzZ(zzop.zzNs().zzPs(), zZzNo));
        this.zzbN.zzX(TranslateLanguage.WELSH, zzZY1.zzZ(zzop.zzNs().zzPr(), zZzNo));
        this.zzbN.zzX("r", zzZY1.zzZ(zzop.zzNp(), zZzNo));
        this.zzbN.zzX("fx", zzZY1.zzZ(zzop.zzNr().zzPs(), zZzNo));
        this.zzbN.zzX("fy", zzZY1.zzZ(zzop.zzNr().zzPr(), zZzNo));
        this.zzbN.zzX(TranslateLanguage.FRENCH, zzZY1.zzZ(zzop.zzNq(), zZzNo));
        if (zzop.zzNb() != null && !zzop.zzNb().isIdentity()) {
            this.zzbN.zzX("gradientTransform", zzZY1.zzu(zzop.zzNb()));
        }
        for (zzPI zzpi : zzop.zzOP()) {
            zzY(zzpi.zzZy(), zzpi.zzOG());
        }
        this.zzbN.zzp();
    }

    private void zzW(zzPY zzpy, String str) {
        zzPA zzpa = (zzPA) zzpy;
        this.zzbN.zzY("linearGradient");
        this.zzbN.zzX("id", str);
        this.zzbN.zzX("gradientUnits", "userSpaceOnUse");
        this.zzbN.zzX("spreadMethod", "repeat");
        this.zzbN.zzX("x1", zzZY1.zzZ(zzpa.zzOw().getX(), true, 9));
        this.zzbN.zzX("y1", zzZY1.zzZ(zzpa.zzOw().getY(), true, 9));
        this.zzbN.zzX("x2", zzZY1.zzZ(zzpa.zzOw().zzkw(), true, 9));
        this.zzbN.zzX("y2", zzZY1.zzZ(zzpa.zzOw().zzZo(), true, 9));
        if (zzpa.zzNb() != null && !zzpa.zzNb().isIdentity()) {
            this.zzbN.zzX("gradientTransform", zzZY1.zzu(zzpa.zzNb()));
        }
        if (zzpa.zzOP() == null) {
            zzY(zzpa.zzOv(), 0.0f);
            zzY(zzpa.zzOu(), 1.0f);
        } else {
            for (zzPI zzpi : zzpa.zzOP()) {
                zzY(zzpi.zzZy(), zzpi.zzOG());
            }
        }
        this.zzbN.zzp();
    }

    private void zzX(zzPY zzpy, String str) {
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 3) {
            zzW(zzpy, str);
        } else {
            if (iZzPH != 4) {
                throw new IllegalStateException("Incorrect brush type specified for gradient.");
            }
            zzV(zzpy, str);
        }
    }

    private void zzY(zzPY zzpy, String str) throws Exception {
        zzOH zzohZzZ;
        byte[] bArrZzDL;
        if (zzpy.zzPH() == 5) {
            this.zzbM.zzG9();
            zzohZzZ = zzXH.zzZ((zzP0) zzpy);
        } else {
            zzohZzZ = (zzOH) zzpy;
        }
        try {
            zzXN zzxn = new zzXN(zzohZzZ);
            try {
                bArrZzDL = zzn4().zznf().zzW(zzxn);
                zzxn.dispose();
            } catch (Throwable th) {
                zzxn.dispose();
                throw th;
            }
        } catch (Exception unused) {
            bArrZzDL = zzEF.zzDL();
            zzn4().zz2("Image can not be processed. Possibly unsupported image format.");
        }
        zzZ(bArrZzDL, zzohZzZ.zzNb().zzOh(), str);
    }

    private void zzZ(zzPY zzpy, String str) throws Exception {
        zzZ(zzIK.zzZ((zzPK) zzpy), null, str);
    }

    public final String zzS(zzPY zzpy) {
        String strZzf;
        if (zzpy == null) {
            return "none";
        }
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 0) {
            return zzZVC.zzw(((zzOI) zzpy).zzZy());
        }
        if (iZzPH == 1) {
            strZzf = this.zzbK.zzf(zzpy);
        } else if (iZzPH == 2) {
            strZzf = this.zzbJ.zzf(zzpy);
        } else if (iZzPH == 3 || iZzPH == 4) {
            strZzf = this.zzbL.zzf(zzpy);
        } else {
            if (iZzPH != 5) {
                return "none";
            }
            strZzf = this.zzbJ.zzf(zzpy);
        }
        return zzZKN.format("url(#{0})", strZzf);
    }

    public final void zzqZ() throws Exception {
        Iterator<zzPY> it = this.zzbL.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzX((zzPY) entry.getValue(), (String) entry.getKey());
        }
        Iterator<zzPY> it2 = this.zzbK.iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            zzZ((zzPY) entry2.getValue(), (String) entry2.getKey());
        }
        Iterator<zzPY> it3 = this.zzbJ.iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            zzY((zzPY) entry3.getValue(), (String) entry3.getKey());
        }
    }

    private void zzZ(byte[] bArr, zzP9 zzp9, String str) throws Exception {
        zzEG zzegZzZT = zzEF.zzZT(bArr);
        this.zzbN.zzY("pattern");
        this.zzbN.zzX("id", str);
        this.zzbN.zzX("patternUnits", "userSpaceOnUse");
        this.zzbN.zzX("patternContentUnits", "userSpaceOnUse");
        this.zzbN.zzX("x", "0");
        this.zzbN.zzX("y", "0");
        this.zzbN.zzX("width", zzJB.zzWD(zzegZzZT.getWidth()));
        this.zzbN.zzX("height", zzJB.zzWD(zzegZzZT.getHeight()));
        zzP9 zzp9Zzv = zzp9 != null ? zzZY1.zzv(zzp9) : null;
        if (zzp9Zzv != null && !zzp9Zzv.isIdentity()) {
            this.zzbN.zzX("patternTransform", zzZY1.zzt(zzp9Zzv));
        }
        this.zzbN.zzY(AbstractJwtRequest.ClaimNames.USE);
        this.zzbN.zzX("xlink:href", zzZKN.format("#{0}", zzn4().zzS(bArr, null)));
        this.zzbN.zzX("width", zzZY1.zzZ(zzegZzZT.getWidth(), true, 9));
        this.zzbN.zzX("height", zzZY1.zzZ(zzegZzZT.getHeight(), true, 9));
        this.zzbN.zzp();
        this.zzbN.zzp();
    }

    private static String zzY(zzOP zzop) {
        int iZzNa = zzop.zzNa();
        if (iZzNa == 0) {
            return "repeat";
        }
        if (iZzNa != 1 && iZzNa != 2 && iZzNa != 3) {
            return "pad";
        }
        return "reflect";
    }

    private void zzY(zzPV zzpv, float f) {
        this.zzbN.zzY("stop");
        this.zzbN.zzX("offset", zzZY1.zzZ(f, false, 9));
        this.zzbN.zzX("stop-color", zzZVC.zzw(zzpv));
        float fZzPD = zzpv.zzPD() / 255.0f;
        if (fZzPD >= 0.0f && fZzPD < 1.0f) {
            this.zzbN.zzX("stop-opacity", zzZY1.zzZ(fZzPD, false, 9));
        }
        this.zzbN.zzp();
    }
}
