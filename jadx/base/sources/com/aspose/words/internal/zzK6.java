package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18241k5;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzK6 {
    private HashMap<String, String[]> zzBB = new HashMap<>();

    private static String zzY(String str, int i, zzJJ zzjj) {
        StringBuilder sb = new StringBuilder();
        zzZNH.zzU(sb, str);
        zzZNH.zzZ(zzZNH.zzU(sb, ":style="), Integer.valueOf(i));
        if (zzjj != null) {
            if (zzjj.getWeight() != 0) {
                zzZNH.zzU(sb, ":weight=").append(zzjj.getWeight());
            }
            if (zzjj.getCharset() != -1 && zzjj.getCharset() != 0) {
                zzZNH.zzU(sb, ":charset=").append(zzjj.getCharset());
            }
        }
        return sb.toString();
    }

    private static String[] zzZQ(String str) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (String str2 : zzZKN.zzR(str, '\n')) {
            String[] strArrZzR = zzZKN.zzR(str2, ':');
            if (zzZKN.zzW(strArrZzR[0], ".ttf", zzZOF.ORDINAL$4894b8c8)) {
                sb.setLength(0);
                String strZzZ = zzZ(sb, zzZKN.zzTX(strArrZzR[1]));
                if (!zzZKN.zzU3(strZzZ)) {
                    zzZQG.zzZ((ArrayList<String>) arrayList, strZzZ);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final boolean isFontConfigAvailable() {
        String[] strArrZzZ = zzZ("Arial", 0, null);
        return strArrZzZ != null && strArrZzZ.length > 0;
    }

    public final void resetCache() {
        this.zzBB.clear();
    }

    public final zzZXH zzZ(String str, int i, zzJJ zzjj, zzKJ zzkj) {
        String[] strArrZzZ = zzZ(str, i, zzjj);
        if (strArrZzZ == null) {
            return null;
        }
        for (String str2 : strArrZzZ) {
            zzZXH zzzxhZzV = zzkj.zzV(str2, i);
            if (zzzxhZzV != null) {
                return zzzxhZzV;
            }
        }
        return null;
    }

    private String[] zzZ(String str, int i, zzJJ zzjj) {
        if (!zzZYD.zzXk(str)) {
            return null;
        }
        if (this.zzBB.containsKey(str)) {
            return this.zzBB.get(str);
        }
        zzY(str, i, zzjj);
        zz0H zz0hZzsn = zz0T.zzsn();
        if (!zz0hZzsn.zzsc() || zz0hZzsn.zzsd() == null || !zz0hZzsn.zzsd().contains(C18241k5.f55433h)) {
            return null;
        }
        String[] strArrZzZQ = zzZQ(zz0hZzsn.zzsd());
        if (strArrZzZQ.length == 0) {
            return null;
        }
        zzZQF.zzY(this.zzBB, str, strArrZzZQ);
        return strArrZzZQ;
    }

    private static String zzZ(StringBuilder sb, String str) {
        char cCharAt;
        for (int i = 1; i < str.length() && (cCharAt = str.charAt(i)) != '\"'; i++) {
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
