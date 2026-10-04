package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5N {
    private boolean zzX3j;
    private ArrayList<zzYMD> zzX3k = new ArrayList<>();
    private zzTF zzZss;

    public zzY5N(zzTF zztf) {
        this.zzZss = zztf;
    }

    private static void zzS(com.aspose.words.internal.zzDB zzdb) {
        zzdb.sort();
        for (int count = zzdb.getCount() - 1; count > 0; count--) {
            if (zzdb.get(count) == zzdb.get(count - 1)) {
                zzdb.removeAt(count);
            }
        }
    }

    private com.aspose.words.internal.zzZQ5 zzX(zzYMD zzymd, zzTF zztf) throws Exception {
        int y;
        int iZz60 = zzymd.zz60();
        if (iZz60 != 8) {
            y = iZz60 != 32 ? zzymd.getY() : zzYJP.zzZZ((zzZ55) zzymd);
        } else {
            zzYIA zzyia = (zzYIA) zzymd;
            y = zzyia.zzYjB() ? zzymd.getY() - ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzXYi() : zzymd.getY();
        }
        return zzZ(zztf, new com.aspose.words.internal.zzZQ5(zztf.zz5X(), zztf.zz5W() + y, zztf.zzZXS(), zzymd.getHeight() + (zzymd.getY() - y)));
    }

    private boolean zzXVM() {
        return this.zzZss.zz60() == 1;
    }

    private static void zzY(com.aspose.words.internal.zzDB zzdb, int i, int i2, int i3) {
        if (i2 >= i || i >= i3) {
            return;
        }
        zzdb.add(i);
    }

    private static boolean zzZ(zzYMD zzymd, zzUZ zzuz) {
        if (zzuz == null) {
            return false;
        }
        zzUZ zzuz2 = (zzUZ) zzymd.zzqh(2);
        while (zzuz2 != null) {
            zzuz2 = (zzUZ) zzuz2.zz5Z();
            if (zzuz2 == zzuz) {
                break;
            }
        }
        return zzuz2 == zzuz;
    }

    private static boolean zzZN(zzZ55 zzz55) throws Exception {
        if (zzz55.zzZZJ().zz60() != 2) {
            return false;
        }
        zzUZ zzuz = (zzUZ) zzz55.zzZZJ();
        if (((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).getColumnsCount() == 1 || !zzuz.zz0n() || zzz55.zzI(true, true).zzZo6() != 21858) {
            return false;
        }
        zzz55.zzYnY();
        return !zzp(zzuz);
    }

    public static zzY5N zzZO(zzZ55 zzz55) {
        return zzz55.zzYQf() ? ((zzWT) zzz55.zzZZJ()).zzYG(false) : ((zzYN8) zzz55.zzqh(1)).zzYG(false);
    }

    public static boolean zze(zzYMD zzymd) throws Exception {
        if (zzymd.zz60() != 32) {
            return false;
        }
        zzZ55 zzz55 = (zzZ55) zzymd;
        if (zzz55.zzYQ9()) {
            return true;
        }
        return zzZN(zzz55);
    }

    private static boolean zzp(zzUZ zzuz) {
        zzTC zztc = (zzTC) zzuz.zz6x();
        while (zztc != ((zzTC) zzuz.zz6w())) {
            if (!zzYJP.zzl(zztc)) {
                return true;
            }
            zzZ39 zzz39ZzZ8G = zztc.zzZXN().zzZ8G();
            if (zzz39ZzZ8G.zzYMd() == 2 && zzz39ZzZ8G.getTop() < 0) {
                return true;
            }
            zztc = (zzTC) zztc.zzZXN().zzZ91().zz5Z();
            if (zztc == null || zztc.zzZZJ() != zzuz) {
                return false;
            }
        }
        return false;
    }

    public final void zzD(zzWT zzwt) throws Exception {
        if (zzwt.zzZZJ().zzZZJ().zz60() != 2) {
            return;
        }
        zzUZ zzuz = (zzUZ) zzwt.zzZZJ().zzZZJ();
        if (zzuz.zz0o()) {
            boolean z = false;
            zzZNH zzznh = null;
            for (zzZNO zzzno : zzXVS()) {
                if (zzwt.zzS(zzzno.zzZ93())) {
                    if (!zzzno.zzZ8X()) {
                        z = true;
                        zzZ(zzzno, true, true);
                        zzzno.zzVJ(true);
                    } else if (zzznh == null) {
                        zzznh = (zzZNH) zzzno;
                    }
                }
            }
            if (!z) {
                if (zzznh != null) {
                    zzYQ(zzznh.zzZ90());
                }
            } else {
                zzTC zztcZzZXK = ((zzYIA) zzwt.zzZZJ()).zzZXK();
                if (zztcZzZXK != null) {
                    zzuz.zzV(zztcZzZXK.zza9());
                }
            }
        }
    }

    public final boolean zzK(zzZNO zzzno) {
        return zzXVM() ? zzzno.zzZ8Z() == 3 && (zzXVV() || zzzno.zzbD()) : zzzno.zzZ8Z() == 4;
    }

    public final com.aspose.words.internal.zzDB zzV6(int i, int i2) throws Exception {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB(zzXVS().getCount() * 2);
        for (zzZNO zzzno : zzXVS()) {
            zzzno.zzZ8Y();
            if (!zzzno.zzZ8X() && zzzno.zzZ8T()) {
                zzY(zzdb, zzzno.zzZ8R().getTop(), i, i2);
                zzY(zzdb, zzzno.zzZ8R().getBottom(), i, i2);
            }
        }
        zzS(zzdb);
        return zzdb;
    }

    public final boolean zzW(zzYBL zzybl) throws Exception {
        if (zzybl.zz60() == 16) {
            return false;
        }
        zzUZ zzuz = (zzUZ) zzybl;
        zzYN8 zzyn8ZzZ8m = zzuz.zzZ8m();
        if (zzyn8ZzZ8m.zzYF(false) == null) {
            return false;
        }
        zzZNO zzzno = null;
        boolean z = false;
        zzZNO zzzno2 = null;
        for (zzZNO zzzno3 : zzyn8ZzZ8m.zz5N()) {
            if (!zzzno3.zzZ8W() && !zzzno3.zzZ8X()) {
                if (zzyn8ZzZ8m != zzzno3.zzZ93().zzZ8m()) {
                    if (zzzno == null) {
                        zzzno = zzzno3;
                    }
                    if (zzzno3.zzZ90() instanceof zzY9X) {
                        ((zzZ55) ((zzY9X) zzzno3.zzZ90()).zzZZJ()).zzUP(true);
                    }
                    zzzno2 = zzzno3;
                } else if (zzzno3.zzZ8H()) {
                    zzZ(zzuz, zzzno3);
                    zzzno3.zzZ8P();
                    if (zzzno3.zzZ96()) {
                        z = true;
                    }
                }
            }
        }
        boolean z2 = zzzno != null;
        if (z2) {
            zzZ(zzuz, zzzno2);
            zzYQ(zzzno.zzZ90());
        }
        return z2 || z;
    }

    public final int zzXVN() {
        return this.zzX3k.size();
    }

    public final int zzXVO() throws Exception {
        int iMax = 0;
        for (zzZNO zzzno : zzXVS()) {
            if (zzzno.zzZ99() == 25604) {
                iMax = Math.max(iMax, zzzno.zzZ8V().getWidth());
            }
        }
        return iMax;
    }

    public final boolean zzXVP() throws Exception {
        zzWT zzwt = (zzWT) this.zzZss;
        zzZNO zzzno = null;
        for (zzZNO zzzno2 : zzXVS()) {
            if (zzzno != null) {
                break;
            }
            if (zzzno2.zzZ93().zzqh(16) != zzwt) {
                zzwt.zzY(zzzno2);
                zzzno = zzzno2;
            }
        }
        boolean z = zzzno != null;
        if (z) {
            zzYQ(zzzno.zzZ90());
        }
        return z;
    }

    public final void zzXVQ() {
        this.zzX3k.clear();
    }

    public final int zzXVR() {
        if (zzXVV()) {
            return 0;
        }
        for (int i = 0; i < zzXVS().getCount(); i++) {
            if (zzK(zzXVS().zzBz(i))) {
                return i;
            }
        }
        return zzXVS().getCount();
    }

    public final zzZNL zzXVS() {
        return zzXVM() ? ((zzYN8) this.zzZss).zz5N() : ((zzWT) this.zzZss).zz5N();
    }

    public final void zzXVT() throws Exception {
        for (zzZNO zzzno : zzXVS()) {
            if (zzzno.zzbD()) {
                break;
            } else {
                zzZ(zzzno, false, true);
            }
        }
        zzq(null);
    }

    public final void zzXVU() {
        this.zzX3j = false;
    }

    public final boolean zzXVV() {
        return this.zzX3j || this.zzZss.zza7().zzZYM();
    }

    public final boolean zzXVW() throws Exception {
        if (zzXVV()) {
            return false;
        }
        this.zzX3j = true;
        if (!zzXVM()) {
            return false;
        }
        this.zzX3k.size();
        for (zzZNO zzzno : zzXVS()) {
            if (zzzno.zzbD()) {
                break;
            }
            if (!zzZKY.zzT(zzzno.zzZ8E())) {
                zzZ(zzzno, false, true);
            }
        }
        return zzq(null) > 0;
    }

    public final boolean zzXVX() {
        return this.zzZss.zz60() == 16 && ((zzWV) ((zzWT) this.zzZss).zza9()).zz6c();
    }

    public final void zzYQ(Object obj) throws Exception {
        if (zzXVS().zzZ(obj, this)) {
            zzq(null);
        }
    }

    public final int zzYqn() throws Exception {
        if (zzXVM()) {
            return ((zzYN8) this.zzZss).zzYqn();
        }
        return 1073741823;
    }

    public final zzTF zzZZJ() {
        return this.zzZss;
    }

    public final int zzq(zzUZ zzuz) throws Exception {
        int i = 0;
        for (int i2 = 0; i2 < this.zzX3k.size(); i2++) {
            zzYMD zzymd = this.zzX3k.get(i2);
            if (!zzZ(zzymd, zzuz)) {
                zzymd.zzNd(3);
                i++;
            }
        }
        this.zzX3k.clear();
        return i;
    }

    public final zzZ50 zzZ(com.aspose.words.internal.zzZQ5 zzzq5, int i, int i2, int i3, int i4, int i5, zzYBL zzybl) throws Exception {
        ArrayList arrayList = new ArrayList();
        zzYCP zzycp = new zzYCP(zzzq5.getX(), zzzq5.getRight());
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYCP>) arrayList, zzycp);
        int height = zzzq5.getHeight();
        int x = zzzq5.getX();
        int width = zzzq5.getWidth();
        zzXR zzxr = new zzXR(x, i, width, i2);
        zzXR zzxr2 = new zzXR(x, i3, width, i4);
        int i6 = 1073741823;
        boolean zZzYMg = false;
        int i7 = 0;
        int i8 = height;
        for (int iZzXVR = zzXVR(); iZzXVR < zzXVS().getCount(); iZzXVR++) {
            zzZNO zzznoZzBz = zzXVS().zzBz(iZzXVR);
            zzznoZzBz.zzZ8Y();
            if (zzZ(zzznoZzBz, zzycp, zzybl)) {
                zzXR zzxrZzXx = zzznoZzBz.zzXx(zzzq5.getX(), zzzq5.getWidth());
                zzXR[] zzxrArrZzZ = zzXP.zzZ(zzxrZzXx, zzznoZzBz.zzZ8G().zzYMg() ? zzxr2 : zzxr);
                if (zzxrArrZzZ != null && zzxrArrZzZ.length > 0) {
                    RefInt refInt = new RefInt(i6);
                    zzZ(zzznoZzBz, zzxrZzXx, zzxrArrZzZ, refInt);
                    int i9 = refInt.get();
                    int iZzZ = zzZ(arrayList, zzzq5.getY(), i8, zzxrArrZzZ, zzznoZzBz.zzZ98(), i5);
                    i7++;
                    zZzYMg = zzznoZzBz.zzZ8G().zzYMg() | zZzYMg;
                    i6 = i9;
                    i8 = iZzZ;
                }
            }
        }
        return new zzZ50(arrayList, zzzq5.getY(), i8, i6, zZzYMg, i7);
    }

    private static void zzZ(zzZNO zzzno, zzXR zzxr, zzXR[] zzxrArr, RefInt refInt) {
        int bottom;
        if (zzzno.zzZ8G().zzYMg() && !zzxr.zz7F()) {
            bottom = 0;
            for (zzXR zzxr2 : zzxrArr) {
                if (bottom < zzxr2.getBottom()) {
                    bottom = zzxr2.getBottom();
                }
            }
        } else {
            bottom = zzxr.getBottom();
        }
        refInt.set(Math.min(refInt.get(), bottom));
    }

    private boolean zzZ(zzZNO zzzno, zzYCP zzycp, zzYBL zzybl) throws Exception {
        if (zzzno.zzZ8X() || !zzzno.zzZ8T()) {
            return false;
        }
        com.aspose.words.internal.zzZQ5 zzzq5ZzZ8A = zzzno.zzZ8A();
        return (zzybl.zz60() != 2 || zzzq5ZzZ8A.getTop() <= zzYqn()) && !zzZ(zzybl, zzzno) && zzzq5ZzZ8A.getRight() >= zzycp.getLeft() && zzycp.getRight() > zzzq5ZzZ8A.getLeft();
    }

    private static boolean zzZ(zzYBL zzybl, zzZNO zzzno) {
        return zzybl.zz60() == 1024 && zzzno.zzZ93().zzqh(1024) != zzybl;
    }

    public final zzY09 zzZ(com.aspose.words.internal.zzZQ5 zzzq5, int i, zzYBL zzybl) throws Exception {
        com.aspose.words.internal.zzZQ5 zzzq52;
        zzXR zzxrZzXx;
        zzXR[] zzxrArrZzZ;
        int iZzYqo;
        int iMin;
        com.aspose.words.internal.zzZQ5 zzzq53 = new com.aspose.words.internal.zzZQ5(zzzq5.getX(), zzzq5.getY(), zzzq5.getWidth(), zzzq5.getHeight());
        com.aspose.words.internal.zzZQ5 zzzq54 = com.aspose.words.internal.zzZQ5.zz2U;
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYCP>) arrayList, new zzYCP(zzzq5.getX(), zzzq5.getRight()));
        int height = zzzq5.getHeight();
        int i2 = height - 1;
        zzXR zzxr = new zzXR(zzzq5);
        boolean zZzXVM = zzXVM();
        if (zZzXVM) {
            zzYN8 zzyn8 = (zzYN8) this.zzZss;
            if (zzybl.zz60() == 1024) {
                iMin = i;
                iZzYqo = 0;
            } else {
                iZzYqo = zzyn8.zzYqo();
                iMin = Math.min(zzyn8.zzYqn(), i);
            }
            zzzq54 = new com.aspose.words.internal.zzZQ5(zzyn8.zz5X(), iZzYqo, zzyn8.zzZXT() - zzyn8.zz5X(), iMin - iZzYqo);
        }
        int iMin2 = 1073741823;
        int iZzXVR = zzXVR();
        int iZzZ = height;
        while (iZzXVR < zzXVS().getCount()) {
            zzZNO zzznoZzBz = zzXVS().zzBz(iZzXVR);
            zzznoZzBz.zzZ8Y();
            if (!zzznoZzBz.zzZ8X() && zzznoZzBz.zzZ8T()) {
                if (!zzZ(zzybl, zzznoZzBz) && (zzxrArrZzZ = zzXP.zzZ((zzxrZzXx = zzznoZzBz.zzXx(zzxr.getX(), zzxr.getWidth())), zzxr)) != null && zzxrArrZzZ.length > 0 && (!zZzXVM || zzzq54.zzP(zzznoZzBz.zzZ8R().zz7G()))) {
                    zzzq52 = zzzq53;
                    boolean z = zzxrZzXx.getY() < zzzq52.getY();
                    if (!zzznoZzBz.zzZ8G().zzYMg() || z || this.zzZss.zza7().zzZYM()) {
                        iMin2 = Math.min(iMin2, zzxrZzXx.getBottom());
                        iZzZ = zzZ(arrayList, zzzq5.getY(), iZzZ, zzxrArrZzZ, zzznoZzBz.zzZ98(), i2);
                    }
                }
                iZzXVR++;
                zzzq53 = zzzq52;
            }
            zzzq52 = zzzq53;
            iZzXVR++;
            zzzq53 = zzzq52;
        }
        return new zzY09(arrayList, iMin2);
    }

    public static void zzZ(zzUZ zzuz, zzZNO zzzno) {
        zzTF zztfZzZ8I;
        if (zzzno.zzZ8I() == null) {
            zztfZzZ8I = zzuz;
        } else if (zzzno.zzZ8I().zzZZJ() != zzuz.zzZZJ()) {
            zztfZzZ8I = (zzYN8) zzuz.zzZZJ();
        } else {
            zztfZzZ8I = zzzno.zzZ8I();
        }
        zzzno.zzZ8Z();
        zzWT zzwt = (zzWT) zzzno.zzZ93().zzqh(16);
        if (zzwt == null) {
            zztfZzZ8I.zzY(zzzno);
            return;
        }
        zzuz.zzS(zzwt);
        zzTC zztcZzZ8E = zzzno.zzZ8E();
        zztfZzZ8I.zzV(zztcZzZ8E.zza9());
        zztfZzZ8I.zzS(zztcZzZ8E);
    }

    public final void zzZ(zzZNO zzzno, boolean z, boolean z2) throws Exception {
        if (zzzno.zzZ8X() || !zzzno.zzZ8T()) {
            return;
        }
        zzXR zzxrZzZ8R = zzzno.zzZ8R();
        if (z) {
            int iZzYy = com.aspose.words.internal.zzSA.zzYy(10);
            zzxrZzZ8R = zzxrZzZ8R.zzM(iZzYy, iZzYy, iZzYy, iZzYy);
        }
        if (!z) {
            zzzno.zzZ8R();
        }
        if (!zzXVM()) {
            zzzno.zzZ8Z();
        }
        zzZ(zzxrZzZ8R, (zzYMD) null, (z2 && (zzXVM() && this.zzZss.zza7().zzZYM())) ? (zzZKY) zzzno.zzZ93().zzqh(1024) : null);
    }

    public final int zzZ(zzXR zzxr, zzYMD zzymd, zzZKY zzzky) throws Exception {
        int i = 0;
        if (!zzXVM()) {
            return zzZ(this.zzZss, zzxr, zzymd) ? 4 : 0;
        }
        zzYN8 zzyn8 = (zzYN8) this.zzZss;
        zzUZ zzuz = (zzUZ) (zzymd != null ? zzymd.zzqh(2) : null);
        zzUZ zzuz2 = (zzUZ) zzyn8.zz6x();
        while (zzuz2 != null) {
            if (!zzuz2.isEmpty()) {
                if (zzuz2.getX() != Integer.MIN_VALUE && zzuz2.getY() != Integer.MIN_VALUE) {
                    if (zzxr.zzP(new com.aspose.words.internal.zzZQ5(zzuz2.zzYqr(), zzuz2.getSize())) && zzZ(zzuz2, zzxr, zzymd)) {
                        i = 1;
                    }
                } else if (zzuz2.getX() == Integer.MIN_VALUE) {
                    zzuz2.getY();
                }
            }
            zzuz2 = zzuz2 == zzuz ? null : (zzUZ) zzuz2.zz5Z();
        }
        return (zzzky == null || !zzZ(zzzky, zzxr, zzymd)) ? i : i | 2;
    }

    private boolean zzZ(zzTF zztf, zzXR zzxr, zzYMD zzymd) throws Exception {
        zzXR[] zzxrArrZzZ = zzXP.zzZ(zzxr, new zzXR(zzZ(zztf, new com.aspose.words.internal.zzZQ5(zztf.zz5X(), zztf.zz5W(), zztf.zzZXS(), 1073741823))));
        byte b = 0;
        for (zzYMD zzymdZz6x = zztf.zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
            if (!zzYJP.zzl(zzymdZz6x) && zzymdZz6x.zzac() && !zze(zzymdZz6x)) {
                com.aspose.words.internal.zzZQ5 zzzq5ZzX = zzX(zzymdZz6x, zztf);
                if (zzxrArrZzZ != null) {
                    int length = zzxrArrZzZ.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (zzxrArrZzZ[i].zzP(zzzq5ZzX)) {
                            zzzq5ZzX.getLeft();
                            zzzq5ZzX.getTop();
                            zzzq5ZzX.getRight();
                            zzzq5ZzX.getBottom();
                            com.aspose.words.internal.zzZQG.zzZ(this.zzX3k, zzymdZz6x);
                            if (b >= 0) {
                                b = 1;
                            }
                        } else {
                            i++;
                        }
                    }
                }
                if (zzymdZz6x == zzymd && b <= 0) {
                    b = -1;
                }
            }
        }
        if (b < 0 && zzX(zzymd, zztf).getBottom() > zzxr.getY()) {
            b = 1;
        }
        return b > 0;
    }

    private com.aspose.words.internal.zzZQ5 zzZ(zzTF zztf, com.aspose.words.internal.zzZQ5 zzzq5) throws Exception {
        if (!zzXVM()) {
            return zzzq5;
        }
        long jZzYqr = zztf.zzYqr();
        return new com.aspose.words.internal.zzZQ5(zzzq5.getX() + ((int) jZzYqr), zzzq5.getY() + ((int) (jZzYqr >> 32)), zzzq5.getWidth(), zzzq5.getHeight());
    }

    private static int zzZ(ArrayList<zzYCP> arrayList, int i, int i2, zzXR[] zzxrArr, int i3, int i4) {
        for (zzXR zzxr : zzxrArr) {
            int iZzZ = 0;
            while (iZzZ < arrayList.size()) {
                zzYCP zzycp = arrayList.get(iZzZ);
                int y = zzxr.getY() - i;
                if (y < i2 && zzxr.getRight() > zzycp.getX() && zzycp.getRight() > zzxr.getX()) {
                    if (y <= i4) {
                        iZzZ += zzZ(arrayList, iZzZ, zzxr.getX(), zzxr.getRight(), i3);
                    } else if (y < i2) {
                        i2 = y;
                    }
                }
                iZzZ++;
            }
        }
        return i2;
    }

    private static int zzZ(ArrayList<zzYCP> arrayList, int i, int i2, int i3, int i4) {
        zzYCP zzycp = arrayList.get(i);
        if (zzycp.getRight() > i2 && i3 > zzycp.getX()) {
            zzYCP zzycp2 = zzYCP.zzXnG;
            if (i2 - zzycp.getX() > i4) {
                zzycp2 = new zzYCP(zzycp.getX(), i2);
            }
            zzYCP zzycp3 = zzYCP.zzXnG;
            if (zzycp.getRight() - i3 > i4) {
                zzycp3 = new zzYCP(i3, zzycp.getRight());
            }
            if (zzycp2.isEmpty() && zzycp3.isEmpty()) {
                arrayList.remove(i);
                return -1;
            }
            if (!zzycp2.isEmpty() && !zzycp3.isEmpty()) {
                arrayList.set(i, zzycp2);
                arrayList.add(i + 1, zzycp3);
                return 1;
            }
            if (zzycp2.isEmpty()) {
                zzycp2 = zzycp3;
            }
            arrayList.set(i, zzycp2);
            arrayList.get(i).isEmpty();
        }
        return 0;
    }
}
