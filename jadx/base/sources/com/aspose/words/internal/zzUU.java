package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzUU {
    private static ArrayList<zzU1> zzSb;
    private zzZOP zzS2;
    private int zzS3;
    private byte[] zzS4;
    private boolean zzS5;
    private int zzS6;
    private byte[] zzS7 = new byte[8000];
    private static byte[] zzSa = zzZO0.zzhV().getBytes("\"data:image");
    private static byte[] zzS9 = zzZO0.zzhV().getBytes("\"");
    private static byte[] zzS8 = zzZO0.zzhV().getBytes("base64");

    static {
        ArrayList<zzU1> arrayList = new ArrayList<>();
        zzSb = arrayList;
        zzZQG.zzZ((ArrayList<zzTZ>) arrayList, new zzTZ());
        zzZQG.zzZ((ArrayList<zzTY>) zzSb, new zzTY());
        zzZQG.zzZ((ArrayList<zzTW>) zzSb, new zzTW());
        zzZQG.zzZ((ArrayList<zzTV>) zzSb, new zzTV());
        zzZQG.zzZ((ArrayList<zzTT>) zzSb, new zzTT());
        zzZQG.zzZ((ArrayList<zzTS>) zzSb, new zzTS());
        zzZQG.zzZ((ArrayList<zzUR>) zzSb, new zzUR());
        zzZQG.zzZ((ArrayList<zzUS>) zzSb, new zzUS());
        zzZQG.zzZ((ArrayList<zzUQ>) zzSb, new zzUQ());
        zzZQG.zzZ((ArrayList<zzU5>) zzSb, new zzU5());
        zzZQG.zzZ((ArrayList<zzU7>) zzSb, new zzU7());
        zzZQG.zzZ((ArrayList<zzU6>) zzSb, new zzU6());
        zzZQG.zzZ((ArrayList<zzU4>) zzSb, new zzU4());
        zzZQG.zzZ((ArrayList<zzU9>) zzSb, new zzU9());
        zzZQG.zzZ((ArrayList<zzUN>) zzSb, new zzUN());
        zzZQG.zzZ((ArrayList<zzUM>) zzSb, new zzUM());
        zzZQG.zzZ((ArrayList<zzUK>) zzSb, new zzUK());
        zzZQG.zzZ((ArrayList<zzUI>) zzSb, new zzUI());
        zzZQG.zzZ((ArrayList<zzUG>) zzSb, new zzUG());
        zzZQG.zzZ((ArrayList<zzUE>) zzSb, new zzUE());
        zzZQG.zzZ((ArrayList<zzUD>) zzSb, new zzUD());
        zzZQG.zzZ((ArrayList<zzU3>) zzSb, new zzU3());
        zzZQG.zzZ((ArrayList<zzU2>) zzSb, new zzU2());
        zzZQG.zzZ((ArrayList<zzUA>) zzSb, new zzUA());
        zzZQG.zzZ((ArrayList<zzUB>) zzSb, new zzUB());
    }

    private zzUU(zzZOP zzzop) {
        this.zzS2 = zzzop;
    }

    private void zzN(byte[] bArr) {
        this.zzS4 = bArr;
        this.zzS3 = bArr.length;
    }

    public static zzZO0 zzS(zzZOP zzzop) throws Exception {
        long position = zzzop.getPosition();
        try {
            try {
                zzzop.zzH(0L);
                zzUU zzuu = new zzUU(zzzop);
                zzuu.zzN(zzZYQ.zzZZ(zzzop));
                zzUP zzupZzUh = zzuu.zzUh();
                return zzupZzUh == null ? zzZO0.zzhV() : zzZ(zzupZzUh);
            } catch (Exception e) {
                e.getMessage();
                zzzop.zzH(position);
                return null;
            }
        } finally {
            zzzop.zzH(position);
        }
    }

    private void zzUb() throws Exception {
        int iZzZ;
        int iZzZ2 = zzZ1.zzZ(this.zzS4, zzSa, 0, this.zzS3);
        int i = 0;
        while (iZzZ2 != -1 && (iZzZ = zzZ1.zzZ(this.zzS4, zzS8, zzSa.length + iZzZ2, this.zzS3)) != -1 && zzZ1.zzZ(this.zzS4, zzS9, iZzZ2 + zzSa.length, iZzZ) == -1) {
            int length = (zzS8.length + iZzZ) - i;
            int i2 = this.zzS6;
            this.zzS6 = zzZ1.zzZ(this.zzS4, i, length, this.zzS7, i2) + i2;
            int iZzZ3 = zzZ1.zzZ(this.zzS4, zzS9, iZzZ + zzS8.length, this.zzS3);
            while (iZzZ3 == -1) {
                int i3 = this.zzS2.read(this.zzS4, 0, 3072);
                this.zzS3 = i3;
                iZzZ3 = Math.min(this.zzS7.length - this.zzS6, i3);
                this.zzS3 = iZzZ3;
                if (iZzZ3 == 0) {
                    break;
                } else {
                    iZzZ3 = zzZ1.zzZ(this.zzS4, zzS9, 0, iZzZ3);
                }
            }
            i = iZzZ3 + 1;
            iZzZ2 = zzZ1.zzZ(this.zzS4, zzSa, i, this.zzS3);
        }
        int i4 = this.zzS6;
        this.zzS6 = zzZ1.zzZ(this.zzS4, i, this.zzS3 - i, this.zzS7, i4) + i4;
    }

    private zzUP zzUh() throws Exception {
        zzUb();
        this.zzS5 = zzS(this.zzS7, this.zzS6);
        zzUP zzup = null;
        for (int i = 0; i < zzSb.size(); i++) {
            zzUP zzupZzZ = zzSb.get(i).zzZ(this);
            if (zzupZzZ != null && (zzup == null || zzupZzZ.compareTo(zzup) >= 0)) {
                zzup = zzupZzZ;
            }
        }
        return zzup;
    }

    private static zzZO0 zzZ(zzUP zzup) throws Exception {
        String name = zzup.getName();
        zzZO0 zzzo0ZzV3 = zzZO0.zzV3(name);
        if (zz0T.zzss()) {
            int i = zzZOF.ORDINAL$4894b8c8;
            if (zzZKN.zzX("ISO-8859-1", name, i)) {
                return zzZO0.zzV3("Windows-1252");
            }
            if (zzZKN.zzX("ISO-8859-2", name, i)) {
                return zzZO0.zzV3("Windows-1250");
            }
            if (zzZKN.zzX("ISO-8859-7", name, i) && zzZKN.zzX(TranslateLanguage.GREEK, zzup.getLanguage(), i)) {
                return zzZO0.zzV3("Windows-1253");
            }
            if (zzZKN.zzX("ISO-8859-8", name, i) && zzZKN.zzX(TranslateLanguage.HEBREW, zzup.getLanguage(), i)) {
                return zzZO0.zzV3("Windows-1255");
            }
            if (zzZKN.zzX("ISO-8859-8-I", name, i) && zzZKN.zzX(TranslateLanguage.HEBREW, zzup.getLanguage(), i)) {
                return zzZO0.zzV3("Windows-1255");
            }
            if (zzZKN.zzX("ISO-8859-9", name, i) && zzZKN.zzX(TranslateLanguage.TURKISH, zzup.getLanguage(), i)) {
                return zzZO0.zzV3("Windows-1254");
            }
        }
        return zzzo0ZzV3;
    }

    public final boolean zzUc() {
        return this.zzS5;
    }

    public final int zzUd() {
        return this.zzS3;
    }

    public final int zzUe() {
        return this.zzS6;
    }

    public final byte[] zzUf() {
        return this.zzS4;
    }

    public final byte[] zzUg() {
        return this.zzS7;
    }

    private static boolean zzS(byte[] bArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if ((bArr[i2] & 255) >= 128) {
                return true;
            }
        }
        return false;
    }
}
