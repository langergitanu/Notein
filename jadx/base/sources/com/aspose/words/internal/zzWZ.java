package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzWZ {
    private zzZ5V zzU1;
    private zzZ6T zzU2;
    private zzZOG zzU3;

    public static zzWZ zzR(String str, String str2) throws Exception {
        zzZOS zzzosZzY = zzZOU.zzY(str, 3, 1);
        try {
            return zzS1.zzX(zzzosZzY, str2);
        } finally {
            zzzosZzY.close();
        }
    }

    public static zzWZ zzVh() {
        return new zzWZ();
    }

    public static zzWZ zzX(String str, String str2, String str3) throws Exception {
        zzZOS zzzosZzY = zzZOU.zzY(str, 3, 1);
        try {
            return zzS1.zzY(zzzosZzY, str2, str3);
        } finally {
            zzzosZzY.close();
        }
    }

    public static zzWZ zzY(byte[] bArr, String str) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzS1.zzX(zzzor, str);
        } finally {
            zzzor.close();
        }
    }

    public final zzZOG zzVi() {
        return this.zzU3;
    }

    public final zzZ5V zzVj() {
        return this.zzU1;
    }

    public final zzZ6T zzVk() {
        return this.zzU2;
    }

    public final void zzZ(zzZ6T zzz6t) {
        this.zzU2 = zzz6t;
        this.zzU3 = zzS1.zzY(zzz6t);
    }

    public final void zzZ(zzZ5V zzz5v) {
        this.zzU1 = zzz5v;
    }

    public final void zzZ(zzZOG zzzog) {
        this.zzU3 = zzzog;
    }

    public final String zzZ(zzZDA zzzda) {
        zzZ8D zzz8d;
        zzZ8D[] zzz8dArrZzS = this.zzU2.zzXIe().zzS(zzzda);
        if (zzz8dArrZzS.length <= 0 || (zzz8d = zzz8dArrZzS[0]) == null) {
            return null;
        }
        return zzz8d.zzXIq().zzXIs().toString();
    }
}
