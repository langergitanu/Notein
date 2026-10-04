package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZXB {
    private ArrayList<String> zz9H;
    private ArrayList<String> zz9I;
    private String zz9J;
    private String zz9K;
    private String zzF3;
    private String zzaF;
    private String zzaG;

    private static ArrayList<zzZXC> zzI(ArrayList<zzZXC> arrayList) {
        ArrayList<zzZXC> arrayList2 = new ArrayList<>();
        for (zzZXC zzzxc : arrayList) {
            if (zzZw(zzzxc.zzTw(), zzzxc.zzTv())) {
                zzZQG.zzZ(arrayList2, zzzxc);
            }
        }
        return arrayList2;
    }

    private static String zzJ(ArrayList<zzZXC> arrayList) {
        String strZzQ = zzQ(arrayList, 3);
        if (strZzQ == null) {
            strZzQ = zzQ(arrayList, 1);
        }
        return strZzQ == null ? zzQ(arrayList, 0) : strZzQ;
    }

    private static ArrayList<String> zzK(ArrayList<zzZXC> arrayList) {
        ArrayList<String> arrayListZzR = zzR(arrayList, 3);
        if (arrayListZzR.size() == 0) {
            arrayListZzR = zzR(arrayList, 1);
        }
        return arrayListZzR.size() == 0 ? zzR(arrayList, 0) : arrayListZzR;
    }

    private static String zzO(ArrayList<zzZXC> arrayList, int i) {
        for (zzZXC zzzxc : arrayList) {
            if (zzzxc.zzp6() == i) {
                return zzzxc.getName();
            }
        }
        return null;
    }

    private static String zzP(ArrayList<zzZXC> arrayList, int i) {
        String strZzO = null;
        if (arrayList.size() == 0) {
            return null;
        }
        if (i == 3) {
            strZzO = zzO(arrayList, EditingLanguage.ENGLISH_US);
        } else if (i == 1) {
            strZzO = zzO(arrayList, 0);
        }
        return strZzO == null ? arrayList.get(0).getName() : strZzO;
    }

    private static String zzQ(ArrayList<zzZXC> arrayList, int i) {
        if (zzR(arrayList, i).size() == 0) {
            return null;
        }
        ArrayList<zzZXC> arrayListZzI = zzI(arrayList);
        if (arrayListZzI.size() != 0) {
            arrayList = arrayListZzI;
        }
        return zzP(arrayList, i);
    }

    private static ArrayList<String> zzR(ArrayList<zzZXC> arrayList, int i) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (zzZXC zzzxc : arrayList) {
            if (zzzxc.zzTw() == i) {
                zzZQG.zzZ(arrayList2, zzzxc.getName());
            }
        }
        return arrayList2;
    }

    private static boolean zzZw(int i, int i2) {
        return (i == 3 && i2 == 3) ? false : true;
    }

    public static zzZXB zzr(zzY0 zzy0) throws Exception {
        long position = zzy0.zzq().getPosition();
        if (zzy0.zzX9() != 0) {
            throw new IllegalStateException("Unsupported Name table format.");
        }
        short sZzX9 = zzy0.zzX9();
        short sZzX92 = zzy0.zzX9();
        zzZXB zzzxb = new zzZXB();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (int i = 0; i < (sZzX9 & 65535); i++) {
            zzZXC zzzxcZzZ = zzZXC.zzZ(zzy0, position, 65535 & sZzX92);
            if (zzzxcZzZ != null) {
                int iZzp5 = zzzxcZzZ.zzp5();
                if (iZzp5 == 1) {
                    zzZQG.zzZ((ArrayList<zzZXC>) arrayList, zzzxcZzZ);
                } else if (iZzp5 == 2) {
                    zzZQG.zzZ((ArrayList<zzZXC>) arrayList2, zzzxcZzZ);
                } else if (iZzp5 == 4) {
                    zzZQG.zzZ((ArrayList<zzZXC>) arrayList3, zzzxcZzZ);
                } else if (iZzp5 == 5) {
                    zzZQG.zzZ((ArrayList<zzZXC>) arrayList5, zzzxcZzZ);
                } else if (iZzp5 == 6) {
                    zzZQG.zzZ((ArrayList<zzZXC>) arrayList4, zzzxcZzZ);
                }
            }
        }
        zzzxb.zzF3 = zzJ(arrayList);
        zzzxb.zzaG = zzJ(arrayList2);
        zzzxb.zzaF = zzJ(arrayList3);
        zzzxb.zz9J = zzJ(arrayList4);
        zzzxb.zz9K = zzJ(arrayList5);
        zzzxb.zz9I = zzK(arrayList);
        zzzxb.zz9H = zzK(arrayList3);
        if (zzzxb.zzF3 == null || zzzxb.zzaG == null || zzzxb.zzaF == null) {
            throw new IllegalStateException("Font do not have required names.");
        }
        return zzzxb;
    }

    public final String getFullFontName() {
        return this.zzaF;
    }

    public final String zzPh() {
        return this.zzF3;
    }

    public final ArrayList<String> zzp0() {
        return this.zz9H;
    }

    public final ArrayList<String> zzp1() {
        return this.zz9I;
    }

    public final String zzp2() {
        return this.zz9J;
    }

    public final String zzp3() {
        return this.zzaG;
    }

    public final String zzp4() {
        return this.zz9K;
    }
}
