package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4I {
    private TxtLoadOptions zzX1y;
    private com.aspose.words.internal.zzZOO zzY3t;
    private ArrayList<zzY4J> zzZ9n;

    public zzY4I(com.aspose.words.internal.zzZOO zzzoo, TxtLoadOptions txtLoadOptions) {
        this.zzY3t = zzzoo;
        this.zzX1y = txtLoadOptions;
    }

    private static boolean zzA8(String str) {
        if (str.length() < 5 || !(str.charAt(0) == '*' || str.charAt(0) == '-' || str.charAt(0) == '=' || str.charAt(0) == '~')) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    private static int zzA9(String str) {
        boolean z = true;
        int i = 0;
        for (int i2 = 0; z && i2 < str.length(); i2++) {
            if (str.charAt(i2) == ' ') {
                i++;
            } else if (str.charAt(i2) == '\t') {
                i += 4;
            } else {
                z = false;
            }
        }
        return i;
    }

    private zzY4J zzW(zzY4N zzy4n) {
        zzY4J zzy4j;
        int size = this.zzZ9n.size();
        while (true) {
            size--;
            if (size < 0) {
                zzy4j = null;
                break;
            }
            zzy4j = this.zzZ9n.get(size);
            if (zzy4j.zzXUL() != null) {
                break;
            }
        }
        if (zzy4j == null || !zzy4n.zzY(zzy4j.zzXUL())) {
            return null;
        }
        return zzy4j;
    }

    private zzY4O zzY(zzZ3Z zzz3z) throws Exception {
        String strZzU;
        int trailingSpacesOptions = this.zzX1y.getTrailingSpacesOptions();
        int leadingSpacesOptions = this.zzX1y.getLeadingSpacesOptions();
        String line = this.zzY3t.readLine();
        if (zzz3z != null) {
            zzz3z.zzYX(this.zzY3t.zzq());
        }
        if (line == null) {
            return new zzY4O(2);
        }
        if (trailingSpacesOptions == 0) {
            line = com.aspose.words.internal.zzZKN.zzT(line, ControlChar.SPACE_CHAR);
        }
        int i = 1;
        if (leadingSpacesOptions == 1) {
            line = com.aspose.words.internal.zzZKN.zzU(line, ControlChar.SPACE_CHAR);
        }
        String strZzS = com.aspose.words.internal.zzZKN.zzS(line, ControlChar.SPACE_CHAR);
        if ("".equals(strZzS)) {
            zzY4O zzy4o = new zzY4O(3);
            zzZ(line, zzy4o);
            return zzy4o;
        }
        int i2 = 0;
        int i3 = zzA8(strZzS) ? 4 : 0;
        int iZzA9 = zzA9(line);
        zzY4N zzy4nZzYX = null;
        if (leadingSpacesOptions != 2 || iZzA9 <= 0) {
            strZzU = com.aspose.words.internal.zzZKN.zzU(line, ControlChar.SPACE_CHAR);
            if (i3 == 4 || (zzy4nZzYX = zzYX(strZzU, iZzA9)) == null) {
                i = i3;
                i2 = iZzA9;
            } else {
                int length = zzy4nZzYX.getText().length();
                while (length < strZzU.length() && strZzU.charAt(length) == ' ') {
                    length++;
                }
                strZzU = com.aspose.words.internal.zzZKN.zzT(strZzU, 0, length);
                i2 = iZzA9 + length;
            }
        } else {
            strZzU = line;
            i = i3;
        }
        zzY4O zzy4o2 = new zzY4O(strZzU, i2, i);
        zzZ(line, zzy4o2);
        zzy4o2.zzZ(zzy4nZzYX);
        return zzy4o2;
    }

    private zzY4N zzYX(String str, int i) {
        zzY4N zzy4nZzZ = zzY4M.zzZ(str, this.zzX1y);
        if (zzy4nZzZ == null) {
            return null;
        }
        zzy4nZzZ.zzjt(i);
        zzy4nZzZ.zzY(zzW(zzy4nZzZ));
        zzy4nZzZ.zzZ(zzZ(zzy4nZzZ, zzy4nZzZ.zzXUF()));
        if (zzy4nZzZ.zzXUG() == null && !zzy4nZzZ.zzXUD() && zzy4nZzZ.zzXUF() == null) {
            return null;
        }
        return zzy4nZzZ;
    }

    public final zzY4J[] zzZ(zzZ3Z zzz3z) throws Exception {
        this.zzZ9n = new ArrayList<>();
        zzY4O zzy4oZzY = zzY(zzz3z);
        while (zzy4oZzY.zzXUO() != 2) {
            int iZzXUO = zzy4oZzY.zzXUO();
            if (iZzXUO != 0 && iZzXUO != 1 && iZzXUO != 3 && iZzXUO != 4) {
                throw new IllegalArgumentException();
            }
            zzZ(zzy4oZzY);
            zzy4oZzY = zzY(zzz3z);
        }
        zzY4J[] zzy4jArr = new zzY4J[this.zzZ9n.size()];
        for (int i = 0; i < this.zzZ9n.size(); i++) {
            zzy4jArr[i] = this.zzZ9n.get(i);
        }
        return zzy4jArr;
    }

    private static void zzZ(String str, zzY4O zzy4o) {
        if (str.length() == 0 || androidx.core.content.OooO0O0.OooO00o(1, str) != '\f') {
            return;
        }
        zzy4o.zzXUM();
    }

    private zzY4J zzZ(zzY4N zzy4n, zzY4J zzy4j) {
        zzY4J zzy4j2 = null;
        for (int size = this.zzZ9n.size() - 1; size >= 0; size--) {
            zzY4J zzy4j3 = this.zzZ9n.get(size);
            if (zzy4j == zzy4j3) {
                break;
            }
            if (zzy4j3.zzXUL() != null && zzy4j3.zzXUL().zzX(zzy4n)) {
                if (zzy4j3.zzXUL().zzXUE().zzZ1m() && zzy4j3.zzXUL().zzXUH() == zzy4n.zzXUH()) {
                    return zzy4j3;
                }
                if (zzy4j3.zzXUL().zzXUE().zzXUA() && (zzy4j2 == null || Math.abs(zzy4j3.zzXUL().zzXUH() - zzy4n.zzXUH()) < Math.abs(zzy4j2.zzXUL().zzXUH() - zzy4n.zzXUH()))) {
                    zzy4j2 = zzy4j3;
                }
            }
            if (zzy4j == null && zzy4j3.zzXUL() != null && zzy4j3.zzXUL().zzXUF() == null && zzy4j3.zzXUL().zzXUD()) {
                return zzy4j2;
            }
        }
        return zzy4j2;
    }

    private void zzZ(zzY4O zzy4o) {
        zzY4J zzy4j = new zzY4J();
        zzy4j.zzwb(zzy4o.zzYM7());
        zzy4j.zzID(zzy4o.getText());
        zzy4j.zzZ(zzy4o.zzXUL());
        zzy4j.zzPA(zzy4o.zzXUN());
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ9n, zzy4j);
    }
}
