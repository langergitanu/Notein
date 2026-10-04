package com.aspose.words.internal;

import com.aspose.words.C22241OooO0Oo;
import com.aspose.words.internal.zzZLA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLD extends zzZLZ {
    zzZLA zzZQE;
    zzZLA[] zzZQF;
    private boolean zzZQG;
    private zzZN6 zzZQH;
    private String zzZQI;

    public static zzZLD zzf(zzZQR zzzqr) throws zzZQS {
        zzZLD zzzld = new zzZLD();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzld.setId(attributeValue);
                } else if ("xpath".equals(strZzRu)) {
                    zzzld.zzZQI = attributeValue;
                } else {
                    zzzld.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e) {
                zzZHV.zzY(e);
            }
        }
        char c = 1;
        while (zzzqr.hasNext()) {
            zzzqr.next();
            int eventType = zzzqr.getEventType();
            if (eventType != 1) {
                if (eventType == 2) {
                    break;
                }
            } else {
                if (c > 1 || !"annotation".equals(zzzqr.getLocalName())) {
                    break;
                }
                zzzld.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzld;
    }

    private static int zzp(String str, int i) {
        boolean z = true;
        while (z && str.length() > i) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ') {
                i++;
            } else {
                z = false;
            }
        }
        return i;
    }

    public final String getXPath() {
        return this.zzZQI;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        if (this.zzZQH == null) {
            this.zzZQH = new zzZN6(new zzZNB());
        }
        this.zzZQE = new zzZLA();
        zzZ(this.zzZQI, zzzn3);
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    public final void zzfE() {
        this.zzZQG = true;
    }

    private void zzZ(String str, zzZN3 zzzn3) {
        ArrayList arrayList = new ArrayList();
        zzZ(str, 0, arrayList, zzzn3);
        this.zzZQF = (zzZLA[]) arrayList.toArray(new zzZLA[arrayList.size()]);
    }

    private void zzZ(String str, int i, List list, zzZN3 zzzn3) {
        int i2;
        int iZzp;
        int iZzp2;
        int iZzp3 = zzp(str, i);
        if (str.length() < iZzp3 + 3 || str.charAt(iZzp3) != '.' || str.length() <= (iZzp2 = (iZzp = zzp(str, iZzp3 + 1)) + 2) || str.substring(iZzp, iZzp2).indexOf("//") != iZzp) {
            i2 = iZzp3;
        } else {
            this.zzZQE.zzfA();
            i2 = iZzp2;
        }
        zzZ(str, i2, new ArrayList(), list, zzzn3);
    }

    private void zzZ(String str, int i, List list, List list2, zzZN3 zzzn3) {
        int i2;
        int iZzp;
        int i3;
        int iZzp2;
        int iZzp3 = zzp(str, i);
        if (str.length() == iZzp3) {
            return;
        }
        zzZLA.zzX zzx = new zzZLA.zzX();
        if ('@' == str.charAt(iZzp3)) {
            if (this.zzZQG) {
                this.zzZQE = null;
                return;
            }
            zzx.zzfw();
            iZzp3 = zzp(str, iZzp3 + 1);
            if (str.length() > iZzp3 && str.charAt(iZzp3) == '*') {
                iZzp3++;
                zzx.zzfv();
            }
        }
        if ('.' == str.charAt(iZzp3)) {
            iZzp3++;
            zzx.zzfy();
        }
        if ('*' == str.charAt(iZzp3)) {
            iZzp3++;
            zzx.zzfv();
        }
        if ('c' == str.charAt(iZzp3) && str.length() > (i3 = iZzp3 + 5) && str.substring(iZzp3, i3).indexOf("child") == iZzp3 && str.length() > (iZzp2 = zzp(str, i3)) && str.charAt(iZzp2) == ':' && str.charAt(iZzp2 + 1) == ':') {
            int i4 = iZzp2 + 2;
            if (str.length() > i4 && str.charAt(i4) == '*') {
                iZzp3 = iZzp2 + 3;
                zzx.zzfv();
            } else {
                iZzp3 = zzp(str, i4);
            }
        }
        if ('a' == str.charAt(iZzp3) && str.length() > (i2 = iZzp3 + 9) && str.substring(iZzp3, i2).indexOf("attribute") == iZzp3 && str.length() > (iZzp = zzp(str, i2)) && str.charAt(iZzp) == ':' && str.charAt(iZzp + 1) == ':') {
            if (this.zzZQG) {
                this.zzZQE = null;
                return;
            }
            int i5 = iZzp + 2;
            zzx.zzfw();
            if (str.length() > i5 && str.charAt(i5) == '*') {
                iZzp3 = iZzp + 3;
                zzx.zzfv();
            } else {
                iZzp3 = zzp(str, i5);
            }
        }
        int i6 = iZzp3;
        while (str.length() > i6 && zzZNA.zzZP(str.charAt(i6))) {
            i6++;
        }
        if (i6 == iZzp3) {
            this.zzZQE = null;
            return;
        }
        if (str.length() != i6 && str.charAt(i6) == ':') {
            String strSubstring = str.substring(iZzp3, i6 - iZzp3);
            int i7 = i6 + 1;
            if (str.length() > i7 && str.charAt(i7) == '*') {
                StringBuilder sb = new StringBuilder("Specified prefix '");
                sb.append(strSubstring);
                sb.append("' is not declared.");
                this.zzZQE = null;
                return;
            }
            int i8 = i7;
            while (str.length() > i8 && zzZNA.zzZP(str.charAt(i8))) {
                i8++;
            }
            zzx.setName(C22241OooO0Oo.OooO00o(i8, i7, i7, i7, str));
            StringBuilder sb2 = new StringBuilder("Specified prefix '");
            sb2.append(strSubstring);
            sb2.append("' is not declared.");
            this.zzZQE = null;
            return;
        }
        zzx.setName(str.substring(iZzp3, i6 - iZzp3));
        if (!zzx.zzfz()) {
            list.add(zzx);
        }
        int iZzp4 = zzp(str, i6);
        if (str.length() == iZzp4) {
            this.zzZQE.zzZ((zzZLA.zzX[]) list.toArray(new zzZLA.zzX[list.size()]));
            list2.add(this.zzZQE);
            return;
        }
        if (str.charAt(iZzp4) == '/') {
            int i9 = iZzp4 + 1;
            if (zzx.zzfx()) {
                this.zzZQE = null;
                return;
            }
            zzZ(str, i9, list, list2, zzzn3);
            zzZLA zzzla = this.zzZQE;
            if (zzzla == null) {
                return;
            }
            zzzla.zzZ((zzZLA.zzX[]) list.toArray(new zzZLA.zzX[list.size()]));
            return;
        }
        if (str.charAt(iZzp4) == '|') {
            this.zzZQE.zzZ((zzZLA.zzX[]) list.toArray(new zzZLA.zzX[list.size()]));
            list2.add(this.zzZQE);
            this.zzZQE = new zzZLA();
            zzZ(str, iZzp4 + 1, list2, zzzn3);
            return;
        }
        this.zzZQE = null;
    }
}
