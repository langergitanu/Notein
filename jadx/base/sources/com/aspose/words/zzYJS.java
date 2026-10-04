package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJS implements zzZBH {
    private boolean zzXCp;

    public zzYJS(boolean z) {
        this.zzXCp = z;
    }

    private static boolean zzA(ArrayList<Object> arrayList, int i) {
        return i != 0 && (arrayList.get(i - 1) instanceof zzY94);
    }

    private static boolean zzB(ArrayList<Object> arrayList, int i) {
        return zzA(arrayList, i) && zzz(arrayList, i);
    }

    private static boolean zzY(StringBuilder sb, char c) {
        return sb.toString().contains(Character.toString(c));
    }

    private static ArrayList<Object> zzZc(ArrayList<Object> arrayList) {
        if (arrayList.size() > 1) {
            for (Object obj : arrayList) {
                if ((obj instanceof zzZVZ) || (obj instanceof zzY4C) || (obj instanceof zzY85)) {
                }
            }
            ArrayList<Object> arrayList2 = new ArrayList<>((arrayList.size() * 2) - 1);
            com.aspose.words.internal.zzZQG.zzZ(arrayList2, arrayList.get(0));
            for (int i = 1; i < arrayList.size(); i++) {
                Object objOooO00o = C21505OooO0Oo.OooO00o(1, arrayList2);
                Object obj2 = arrayList.get(i);
                if ((obj2 instanceof zzZVZ) && ((objOooO00o instanceof zzZVZ) || (objOooO00o instanceof zzY4B))) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzT>) arrayList2, new zzT());
                }
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, obj2);
            }
            return arrayList2;
        }
        return arrayList;
    }

    private static ArrayList<Object> zzZd(ArrayList<Object> arrayList) {
        if (arrayList.size() == 0) {
            return arrayList;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size());
        for (Object obj : arrayList) {
            if (!(obj instanceof zzY94)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, obj);
            }
        }
        return arrayList2;
    }

    private static ArrayList<Object> zzZe(ArrayList<Object> arrayList) {
        if (arrayList.size() == 0) {
            return arrayList;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            zzYNQ zzynq = (zzYNQ) com.aspose.words.internal.zzZKW.zzZ(obj, zzYNQ.class);
            if (zzynq == null || zzynq.zzYqQ() || !zzB(arrayList, i)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, obj);
            }
        }
        return arrayList2;
    }

    private static boolean zzz(ArrayList<Object> arrayList, int i) {
        return i != arrayList.size() - 1 && (arrayList.get(i + 1) instanceof zzY94);
    }

    @Override // com.aspose.words.zzZBH
    public final zzZSM zzZ(zzZSM zzzsm, zzZQM zzzqm, String str) {
        return zzzsm;
    }

    @Override // com.aspose.words.zzZBH
    public final ArrayList<Object> zzZ(ArrayList<Object> arrayList, zzZQM zzzqm) {
        return (this.zzXCp || arrayList.size() <= 0 || !(arrayList.get(0) instanceof zzY94)) ? zzZc(zzZd(zzZe(arrayList))) : new ArrayList<>();
    }

    @Override // com.aspose.words.zzZBH
    public final boolean zzZ(char c, String str, int i, StringBuilder sb) {
        char cZzH5 = com.aspose.words.internal.zzJB.zzH5();
        char cZzH4 = com.aspose.words.internal.zzJB.zzH4();
        if (c == cZzH4 || c == cZzH5) {
            return zzY(sb, cZzH5) || zzZ(c, str, i, cZzH4);
        }
        return false;
    }

    private static boolean zzZ(char c, String str, int i, char c2) {
        int iZzH3;
        if (c != c2 || (iZzH3 = com.aspose.words.internal.zzJB.zzH3()) == 0) {
            return false;
        }
        if (i + iZzH3 >= str.length()) {
            return true;
        }
        for (int i2 = 0; i2 < iZzH3; i2++) {
            if (!Character.isDigit(str.charAt(i + i2 + 1))) {
                return true;
            }
        }
        return false;
    }
}
