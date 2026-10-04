package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzK2 {
    private static final zzZHW zzUR = new zzZHW("FallbackTable");
    private ArrayList<zzK4> zzBv = new ArrayList<>();

    public static zzK2 zzHX() throws Exception {
        zzZOP zzzopZzX1 = zzZXR.zzX1("Aspose.Resources.NotoFallbackSetting.xml");
        try {
            return zzI(zzzopZzX1);
        } finally {
            if (zzzopZzX1 != null) {
                zzzopZzX1.close();
            }
        }
    }

    public static zzK2 zzHY() {
        try {
            zzZOP zzzopZzX1 = zzZXR.zzX1("Aspose.Resources.MsOfficeFallbackSetting.xml");
            try {
                return zzI(zzzopZzX1);
            } finally {
                if (zzzopZzX1 != null) {
                    zzzopZzX1.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static zzK2 zzI(zzZOP zzzop) throws Exception {
        zzO zzo = new zzO(zzzop);
        zzK2 zzk2 = new zzK2();
        while (zzo.zzQ("FontFallbackSettings")) {
            if (zzUR.zzTP(zzo.getLocalName()) == 0) {
                zzk2.zzBv = zzZ(zzo);
            }
        }
        return zzk2;
    }

    public static zzK2 zzW(Iterable<zzJU> iterable) {
        int i;
        int length = zzJG.zzzS.length;
        String[] strArr = new String[length];
        Iterator<zzJU> it = iterable.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            zzJU next = it.next();
            while (true) {
                int[] iArr = zzJG.zzzS;
                if (i < iArr.length) {
                    if (next.zzHC().zzWL(iArr[i]) && strArr[i] == null) {
                        strArr[i] = next.getFontFamilyName();
                    }
                    i++;
                }
            }
        }
        zzK2 zzk2 = new zzK2();
        while (i < length) {
            if (strArr[i] != null) {
                zzK4 zzk4 = new zzK4();
                zzZQG.zzZ(zzk4.zzI2(), strArr[i]);
                ArrayList<zzK3> arrayListZzI3 = zzk4.zzI3();
                int[] iArr2 = zzJG.zzzT;
                int i2 = i * 2;
                zzZQG.zzZ(arrayListZzI3, new zzK3(iArr2[i2], iArr2[i2 + 1]));
                zzZQG.zzZ(zzk2.zzBv, zzk4);
            }
            i++;
        }
        return zzk2;
    }

    public final void zzH(zzZOP zzzop) throws Exception {
        zzP zzp = new zzP(zzzop, true);
        zzp.zzZ("FontFallbackSettings");
        zzp.zzX("xmlns", "Aspose.Words");
        zzp.zzY("FallbackTable");
        for (zzK4 zzk4 : this.zzBv) {
            zzp.zzY("Rule");
            zzZ(zzp, zzk4);
            zzZ(zzp, "FallbackFonts", zzk4.zzI2());
            zzZ(zzp, "BaseFonts", zzk4.zzI1());
            zzp.zzp();
        }
        zzp.zzp();
        zzp.endDocument();
    }

    public final zzZXH zzZ(zzZXH zzzxh, int i, boolean z, zzGQ zzgq) {
        if (zzJF.zzZK(zzzxh.zzPh())) {
            return null;
        }
        for (zzK4 zzk4 : this.zzBv) {
            if (zzk4.zzS(zzzxh.zzPh(), i)) {
                Iterator<String> it = zzk4.zzI2().iterator();
                while (it.hasNext()) {
                    zzZXH zzzxhZzO = zzgq.zzO(it.next(), 0);
                    if (zzzxhZzO != null && zzzxhZzO.zzpP().zzC(i, z)) {
                        return zzzxhZzO;
                    }
                }
            }
        }
        return null;
    }

    private static ArrayList<zzK4> zzZ(zzO zzo) {
        ArrayList<zzK4> arrayList = new ArrayList<>();
        while (zzo.zzQ("FallbackTable")) {
            if ("Rule".equals(zzo.getLocalName())) {
                zzK4 zzk4 = new zzK4();
                zzZ(zzo.zzV("Ranges", ""), zzk4);
                zzZ(zzo.zzV("FallbackFonts", ""), zzk4.zzI2());
                zzZ(zzo.zzV("BaseFonts", ""), zzk4.zzI1());
                zzZQG.zzZ(arrayList, zzk4);
            }
        }
        return arrayList;
    }

    private static void zzZ(String str, zzK4 zzk4) {
        if (zzZYD.zzXk(zzZKN.zzTX(str))) {
            for (String str2 : zzZKN.zzR(str, ',')) {
                if (zzZYD.zzXk(zzZKN.zzTX(str2))) {
                    String[] strArrZzR = zzZKN.zzR(str2, '-');
                    int length = strArrZzR.length;
                    if (length == 1) {
                        int iZzZe = zzJB.zzZe(strArrZzR[0]);
                        zzZQG.zzZ(zzk4.zzI3(), new zzK3(iZzZe, iZzZe));
                    } else if (length == 2) {
                        zzZQG.zzZ(zzk4.zzI3(), new zzK3(zzJB.zzZe(strArrZzR[0]), zzJB.zzZe(strArrZzR[1])));
                    } else {
                        throw new IllegalStateException("Invalid fallback ranges format.");
                    }
                }
            }
        }
    }

    private static void zzZ(String str, ArrayList<String> arrayList) {
        if (zzZYD.zzXk(zzZKN.zzTX(str))) {
            for (String str2 : zzZKN.zzR(str, ',')) {
                if (zzZYD.zzXk(zzZKN.zzTX(str2))) {
                    zzZQG.zzZ(arrayList, zzZKN.zzTX(str2));
                }
            }
        }
    }

    private static void zzZ(zzP zzp, zzK4 zzk4) {
        if (zzk4.zzI3().size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (zzK3 zzk3 : zzk4.zzI3()) {
            zzZNH.zzU(sb, zzJB.zzWu(zzk3.zzI0()));
            if (zzk3.zzHZ() != zzk3.zzI0()) {
                sb.append('-');
                zzZNH.zzU(sb, zzJB.zzWu(zzk3.zzHZ()));
            }
            zzZNH.zzU(sb, ", ");
        }
        sb.setLength(sb.length() - 2);
        if (sb.length() > 0) {
            zzp.zzX("Ranges", sb.toString());
        }
    }

    private static void zzZ(zzP zzp, String str, ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            zzZNH.zzU(sb, it.next());
            zzZNH.zzU(sb, ", ");
        }
        sb.setLength(sb.length() - 2);
        if (sb.length() > 0) {
            zzp.zzX(str, sb.toString());
        }
    }
}
