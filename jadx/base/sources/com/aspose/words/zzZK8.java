package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZK8 implements Iterable<zzZK9> {
    private long zzYtu = 1;
    private com.aspose.words.internal.zzZYT<zzZK9> zzYtv = new com.aspose.words.internal.zzZYT<>();

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(obj, null)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(obj, this)) {
            return true;
        }
        if (obj.getClass() != zzZK8.class) {
            return false;
        }
        return zzZ((zzZK8) obj);
    }

    public final String getAttributeValue(String str, String str2) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        zzZK9 zzzk9ZzL6 = zzL6(str);
        return zzzk9ZzL6 != null ? zzzk9ZzL6.getValue() : str2;
    }

    public int hashCode() {
        Iterator<zzZK9> it = this.zzYtv.zzl9().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 397) ^ it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<zzZK9> iterator() {
        return this.zzYtv.zzl9().iterator();
    }

    public final void rename(String str, String str2) {
        zzZK9 zzzk9 = (zzZK9) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) this.zzYtv, str);
        if (zzzk9 != null) {
            this.zzYtv.remove(str);
            this.zzYtv.zzB(str2, new zzZK9(str2, zzzk9.getValue()));
            this.zzYtu++;
        }
    }

    public final zzZK9 zzL6(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        return (zzZK9) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) this.zzYtv, str);
    }

    public final void zzY(zzZK9 zzzk9) {
        if (this.zzYtv.containsKey(zzzk9.getName())) {
            return;
        }
        this.zzYtv.zzB(zzzk9.getName(), zzzk9);
        this.zzYtu++;
    }

    public final boolean zzZ(zzZK8 zzzk8) {
        if (com.aspose.words.internal.zzZKO.zzA(zzzk8, null)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(zzzk8, this)) {
            return true;
        }
        if (this.zzYtv.getCount() != zzzk8.zzYtv.getCount()) {
            return false;
        }
        for (zzZK9 zzzk9 : this.zzYtv.zzl9()) {
            zzZK9 zzzk9ZzL6 = zzzk8.zzL6(zzzk9.getName());
            if (zzzk9ZzL6 == null || !zzzk9ZzL6.zzZ(zzzk9)) {
                return false;
            }
        }
        return true;
    }

    public final long zzZ4r() {
        return this.zzYtu;
    }

    public final int zzZQ(String str, int i) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        zzZK9 zzzk9ZzL6 = zzL6(str);
        if (zzzk9ZzL6 == null) {
            return 1;
        }
        return zzZDY.zzG(zzzk9ZzL6.getValue(), 1, i);
    }

    public final int zzZR(String str, int i) {
        int iZzZo;
        com.aspose.words.internal.zzZYD.zzXk(str);
        zzZK9 zzzk9ZzL6 = zzL6(str);
        return (zzzk9ZzL6 == null || (iZzZo = com.aspose.words.internal.zzJB.zzZo(zzzk9ZzL6.getValue())) == Integer.MIN_VALUE) ? i : iZzZo;
    }

    public final String zzZ(zzXYQ zzxyq) {
        StringBuilder sb = new StringBuilder();
        ArrayList<zzZK9> arrayListZzY = com.aspose.words.internal.zzZQG.zzY(this.zzYtv.zzl9());
        Iterator<zzZK9> it = this.zzYtv.zzl9().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzZK9 next = it.next();
            if (!zzxyq.zzyd(next.getName()) && com.aspose.words.internal.zzZYD.zzg(next.getName(), "xlink:")) {
                zzxyq.zzXQx();
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZK9>) arrayListZzY, new zzZK9("xmlns:xlink", "http://www.w3.org/1999/xlink"));
                break;
            }
        }
        boolean z = false;
        for (zzZK9 zzzk9 : arrayListZzY) {
            if (z) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            com.aspose.words.internal.zzZNH.zzU(com.aspose.words.internal.zzZNH.zzU(sb, zzzk9.getName()), "=\"");
            for (int i = 0; i < zzzk9.getValue().length(); i++) {
                char cCharAt = zzzk9.getValue().charAt(i);
                if (cCharAt == '\"') {
                    com.aspose.words.internal.zzZNH.zzU(sb, "&quot;");
                } else if (cCharAt == '&') {
                    com.aspose.words.internal.zzZNH.zzU(sb, "&amp;");
                } else if (cCharAt == '<') {
                    com.aspose.words.internal.zzZNH.zzU(sb, "&lt;");
                } else if (cCharAt == '>') {
                    com.aspose.words.internal.zzZNH.zzU(sb, "&gt;");
                } else if (cCharAt != 160) {
                    sb.append(cCharAt);
                } else {
                    com.aspose.words.internal.zzZNH.zzU(sb, "&#xa0;");
                }
            }
            sb.append('\"');
            z = true;
        }
        return sb.toString();
    }
}
