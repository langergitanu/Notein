package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZWU {
    private static final zzZHW zzUR = new zzZHW("SubstitutesTable");
    private zzZYG<ArrayList<String>> zz95 = new zzZYG<>(false);

    private static String zzG(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            zzZNH.zzU(sb, it.next());
            zzZNH.zzU(sb, ", ");
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }

    private static ArrayList<String> zzWO(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : zzZKN.zzR(str, ',')) {
            zzZQG.zzZ(arrayList, zzZKN.zzTX(str2));
        }
        return arrayList;
    }

    private static void zzZ(zzO zzo, zzZYG<ArrayList<String>> zzzyg) {
        while (zzo.zzQ("SubstitutesTable")) {
            if ("Item".equals(zzo.getLocalName())) {
                String strZzV = zzo.zzV("OriginalFont", "");
                ArrayList<String> arrayListZzWO = zzWO(zzo.zzV("SubstituteFonts", ""));
                if (zzZYD.zzXk(strZzV) && arrayListZzWO.size() > 0) {
                    zzzyg.zzW(strZzV, arrayListZzWO);
                }
            }
        }
    }

    public static zzZWU zzZV(zzZOP zzzop) throws Exception {
        zzO zzo = new zzO(zzzop);
        zzZYG<ArrayList<String>> zzzyg = new zzZYG<>(false);
        while (zzo.zzQ("TableSubstitutionSettings")) {
            if (zzUR.zzTP(zzo.getLocalName()) == 0) {
                zzZ(zzo, zzzyg);
            }
        }
        zzZWU zzzwu = new zzZWU();
        zzzwu.zz95 = zzzyg;
        return zzzwu;
    }

    public static zzZWU zzos() throws Exception {
        zzZOP zzzopZzX1 = zzZXR.zzX1("Aspose.Resources.TableSubstitutionAndroid.xml");
        try {
            return zzZV(zzzopZzX1);
        } finally {
            if (zzzopZzX1 != null) {
                zzzopZzX1.close();
            }
        }
    }

    public static zzZWU zzot() throws Exception {
        zzZOP zzzopZzX1 = zzZXR.zzX1("Aspose.Resources.TableSubstitutionLinux.xml");
        try {
            return zzZV(zzzopZzX1);
        } finally {
            if (zzzopZzX1 != null) {
                zzzopZzX1.close();
            }
        }
    }

    public static zzZWU zzou() throws Exception {
        zzZOP zzzopZzX1 = zzZXR.zzX1("Aspose.Resources.TableSubstitutionWin.xml");
        try {
            return zzZV(zzzopZzX1);
        } finally {
            if (zzzopZzX1 != null) {
                zzzopZzX1.close();
            }
        }
    }

    public final void addSubstitutes(String str, String... strArr) {
        if (zzZYD.zzXk(str) && strArr != null) {
            ArrayList<String> arrayListZzZ = zzZ(this.zz95.get(str), strArr);
            if (arrayListZzZ.size() > 0) {
                this.zz95.set(str, arrayListZzZ);
            } else {
                this.zz95.zzXn(str);
            }
        }
    }

    public final Iterable<String> getSubstitutes(String str) {
        if (zzZYD.zzXk(str)) {
            return this.zz95.get(str);
        }
        return null;
    }

    public final void setSubstitutes(String str, String... strArr) {
        if (zzZYD.zzXk(str)) {
            this.zz95.zzXn(str);
            if (strArr == null) {
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str2 : strArr) {
                zzZQG.zzZ(arrayList, str2);
            }
            if (arrayList.size() > 0) {
                this.zz95.zzW(str, arrayList);
            }
        }
    }

    public final void zzL(zzZOP zzzop) throws Exception {
        zzP zzp = new zzP(zzzop, true);
        zzp.zzZ("TableSubstitutionSettings");
        zzp.zzX("xmlns", "Aspose.Words");
        zzp.zzY("SubstitutesTable");
        for (String str : this.zz95.zzxs()) {
            ArrayList<String> arrayList = this.zz95.get(str);
            if (arrayList != null && arrayList.size() != 0) {
                zzp.zzY("Item");
                zzp.zzX("OriginalFont", str);
                zzp.zzX("SubstituteFonts", zzG(arrayList));
                zzp.zzp();
            }
        }
        zzp.zzp();
        zzp.endDocument();
    }

    private static ArrayList<String> zzZ(ArrayList<String> arrayList, String... strArr) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (String str : strArr) {
            if (!arrayList.contains(str)) {
                zzZQG.zzZ(arrayList, str);
            }
        }
        return arrayList;
    }

    public final zzZXH zzZ(String str, int i, String str2, zzKJ zzkj) {
        zzZXH zzzxhZzZ = zzZ(str, i, zzkj);
        return (zzzxhZzZ == null && zzZYD.zzXk(str2)) ? zzZ(str2, i, zzkj) : zzzxhZzZ;
    }

    private zzZXH zzZ(String str, int i, zzKJ zzkj) {
        ArrayList<String> arrayList;
        if (zzZYD.zzXk(str) && (arrayList = this.zz95.get(str)) != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                zzZXH zzzxhZzV = zzkj.zzV(it.next(), i);
                if (zzzxhZzV != null) {
                    return zzzxhZzV;
                }
            }
        }
        return null;
    }
}
