package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIF extends zzTI {
    public zzYIF() {
    }

    public static ArrayList<zzWX> zzCE(String str) {
        ArrayList<zzWX> arrayList = new ArrayList<>();
        int length = 0;
        for (zzWX zzwx = new zzWX(); zzwx.zzf(str, length); zzwx = new zzWX()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzwx);
            length += zzwx.getLength() - 1;
        }
        return arrayList;
    }

    private static boolean zzZ7(ArrayList<zzWX> arrayList) {
        Iterator<zzWX> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!it.next().zz6E()) {
                return false;
            }
        }
        return arrayList.size() > 0;
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final String getText() {
        StringBuilder sb = new StringBuilder();
        if (getCount() > 0) {
            sb.append('|');
        }
        Iterator<zzYI> it = iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNH.zzU(sb, ((zzWX) it.next()).getText());
            sb.append('|');
        }
        return sb.toString();
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzZv(char c) {
        return c == '|' || c == '-' || c == ':' || c == ' ';
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 3;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        if (!zze(str, i) || zz9A().length() > 0) {
            return false;
        }
        ArrayList<zzWX> arrayListZzCE = zzCE(zz9C());
        if (!zzZ7(arrayListZzCE)) {
            return false;
        }
        isEmpty();
        Iterator<zzWX> it = arrayListZzCE.iterator();
        while (it.hasNext()) {
            zzY(it.next());
        }
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 20;
    }

    public zzYIF(String str) {
        Iterator<zzWX> it = zzCE(str).iterator();
        while (it.hasNext()) {
            zzY(it.next());
        }
    }
}
