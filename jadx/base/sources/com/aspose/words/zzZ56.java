package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ56 implements Cloneable {
    int zzYdA;
    int zzYdB;
    int zzYdC;
    int zzYdD;
    private boolean zzYdq;
    private zzYAU zzYdr;
    private zzYAU zzYds;
    private zzYAU zzYdt;
    int zzYdu;
    int zzYdv;
    int zzYdw;
    int zzYdx;
    int zzYdy;
    int zzYdz;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private void zz0(zzYAU zzyau) throws Exception {
        int iZzZY;
        int iZzZY2;
        if (this.zzYdt == null) {
            this.zzYdt = zzyau;
            this.zzYds = zzyau;
            this.zzYdr = zzyau;
            iZzZY = 0;
            iZzZY2 = 0;
        } else {
            if (zzyau.zzHV() + zzyau.zzHU() > zzYQz() + zzYQy()) {
                this.zzYdt = zzyau;
            }
            iZzZY = zzZY(zzyau);
            iZzZY2 = zzZY(this.zzYds);
            int iZzZY3 = zzZY(this.zzYdr);
            if (zzyau.zzYjN() + iZzZY > zzYQx() + iZzZY2) {
                this.zzYds = zzyau;
                iZzZY2 = iZzZY;
            }
            if (zzyau.zzYjL() - iZzZY > zzYQw() - iZzZY3) {
                this.zzYdr = zzyau;
            } else {
                iZzZY = iZzZY3;
            }
        }
        this.zzYdD = Math.max(zzYQx() + iZzZY2, 0);
        this.zzYdC = Math.max(zzYQw() - iZzZY, 0);
    }

    private void zz1(zzYAU zzyau) throws Exception {
        zz0(zzyau);
        zzZZ(zzyau);
    }

    private void zz2(zzYAU zzyau) throws Exception {
        if (this.zzYdq == zzyau.zzY6B() || zzyau.zzYjN() + zzyau.zzYjL() > this.zzYdD + this.zzYdC) {
            if (zzyau.zzY6B() && !this.zzYdq) {
                zzYQA();
                this.zzYdq = true;
            }
            zz1(zzyau);
        }
    }

    private static boolean zz3(zzYAU zzyau) {
        zzYAH zzyah;
        return (!zzyau.zzY7w() || ((zzYAU) zzyau.zz5Y()) == null || ((zzYAU) zzyau.zz5Z()) == zzyau.zzY6S().zzZ9r() || (zzyah = (zzYAH) com.aspose.words.internal.zzZKW.zzZ((zzYAU) zzyau.zz5Y(), zzYAH.class)) == null || zzyah.getFieldType() != 57) ? false : true;
    }

    private static boolean zzX(zzYAU zzyau, boolean z) {
        zzYAH zzyah = (zzYAH) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYAH.class);
        if (zzyah != null && zzyah.getFieldType() == 70) {
            if (zzyah.zzY5B() == zzyah) {
                return true;
            }
            if (zzyah.zzY5A() == zzyah) {
                return false;
            }
        }
        return z;
    }

    private void zzYQA() {
        this.zzYdD = 0;
        this.zzYdC = 0;
        this.zzYdB = 0;
        this.zzYdt = null;
        this.zzYds = null;
        this.zzYdr = null;
    }

    private int zzYQw() throws Exception {
        zzYAU zzyau = this.zzYdr;
        if (zzyau == null) {
            return 0;
        }
        return zzyau.zzYjL();
    }

    private int zzYQx() throws Exception {
        zzYAU zzyau = this.zzYds;
        if (zzyau == null) {
            return 0;
        }
        return zzyau.zzYjN();
    }

    private int zzYQy() throws Exception {
        zzYAU zzyau = this.zzYdt;
        if (zzyau == null) {
            return 0;
        }
        return zzyau.zzHU();
    }

    private int zzYQz() throws Exception {
        zzYAU zzyau = this.zzYdt;
        if (zzyau == null) {
            return 0;
        }
        return zzyau.zzHV();
    }

    private static boolean zzZ(Ref<zzYAU> ref) throws Exception {
        Object objZzPk;
        zzY9Y zzy9y = null;
        for (zzYAU zzyau = ref.get(); zzyau != null; zzyau = (zzYAU) zzyau.zz5Z()) {
            zzY9Y zzy9y2 = (zzY9Y) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9Y.class);
            if (zzy9y2 != null && zzy9y2.zzZ1s() == 3) {
                zzy9y = zzy9y2;
            }
        }
        if (zzy9y == null || (objZzPk = zzy9y.zzYRv().zzY3I().zzPk(190)) == null) {
            return false;
        }
        int iZzm = com.aspose.words.internal.zzSA.zzm(((Integer) objZzPk).intValue());
        zzYAU zzyau2 = (zzYAU) com.aspose.words.internal.zzZKW.zzZ(ref.get().zz5R(), zzYAU.class);
        zzZ32 zzz32ZzX = zzZ32.zzX(zzyau2.zzY6N());
        zzz32ZzX.setSize(iZzm);
        zzyau2.zzU(zzZ32.zzW(zzz32ZzX));
        zzyau2.zzZ(ref.get().zza9());
        zzyau2.zzY(ref.get().zzZZJ());
        zzyau2.zzu(ref.get());
        ref.set(zzyau2);
        return true;
    }

    public static int zzZX(zzYAU zzyau) {
        int i;
        float f;
        float f2;
        ((zzZ37) ((zzYMM) ((zzZ55) zzyau.zzZZJ()).zza9()).zzYTt()).getLineSpacingRule();
        zzZ55 zzz55 = (zzZ55) zzyau.zzZZJ();
        zzZ37 zzz37 = (zzZ37) ((zzYMM) zzz55.zza9()).zzYTt();
        boolean zZzYMq = zzz55.zzab().zza7().zzYMq();
        int baselineAlignment = zzz37.getBaselineAlignment();
        int iZzHT = zzz37.zzHT();
        int iZzP4 = zzyau.zzY6N().zzYKN().zzP4();
        int iZzP3 = zzyau.zzY6N().zzYKN().zzP3();
        if (baselineAlignment == 0) {
            i = -iZzP4;
            if (!zZzYMq) {
                return i;
            }
            f = iZzHT;
            f2 = 0.6f;
        } else {
            if (baselineAlignment != 1) {
                if (baselineAlignment != 3) {
                    return 0;
                }
                return iZzP3 / 2;
            }
            i = (iZzP3 / 2) - (iZzP4 / 2);
            if (!zZzYMq) {
                return i;
            }
            f = iZzHT;
            f2 = 0.3f;
        }
        return i + ((int) (f * f2));
    }

    private void zzZZ(zzYAU zzyau) throws Exception {
        if (zzyau.getSpacing() > this.zzYdB) {
            this.zzYdB = zzyau.getSpacing();
        }
    }

    public final int getHeight() {
        return this.zzYdA + zzYQD() + this.zzYdu;
    }

    public final void zz4(zzYAU zzyau) throws Exception {
        if (zzyau == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Ref ref = new Ref(zzyau);
        zzZ(ref);
        zzYAU zzyau2 = null;
        zzYAU zzyau3 = null;
        zzYAU zzyau4 = null;
        zzYAU zzyau5 = null;
        boolean zZzX = false;
        boolean z = false;
        boolean z2 = false;
        for (zzYAU zzyau6 = (zzYAU) ref.get(); zzyau6 != null; zzyau6 = (zzYAU) zzyau6.zz5Z()) {
            switch (zzyau6.zzZo6()) {
                case 0:
                    zZzX = zzX(zzyau6, zZzX);
                    continue;
                    break;
                case 9216:
                case EditingLanguage.ARABIC_YEMEN /* 9217 */:
                case 9238:
                case 9244:
                case 9245:
                case 9250:
                case 9747:
                case 11284:
                case 11285:
                    if (!zZzX || (zzyau6.zzZo6() != 9238 && zzyau6.zzZo6() != 9747)) {
                        if (zzyau6.zzY7r() != 5121 && !zzyau6.zzYol()) {
                            zzyau2 = zzyau6;
                        }
                        if (!zz3(zzyau6) && (zzyau6.zzY7r() != 5121 || ((zzZ37) ((zzYMM) ((zzZ55) zzyau6.zzZZJ()).zza9()).zzYTt()).getBaselineAlignment() != 0)) {
                            zz2(zzyau6);
                        }
                    } else if (zzyau2 != null || z) {
                    }
                    break;
                case 10754:
                case 10768:
                case 10769:
                case 10770:
                case 10782:
                case 12803:
                    if (zZzX && zzyau6.zzZo6() == 10769) {
                        zz2(zzyau6);
                        zzyau2 = zzyau6;
                    } else if (zzyau2 != null || z) {
                    }
                    break;
                case 21513:
                case 21514:
                case 21515:
                case 21537:
                case 21577:
                case 21586:
                case 21595:
                case 21639:
                case 21779:
                case 21788:
                case 21857:
                case 21858:
                case 21859:
                case 21860:
                case 21861:
                    if (zzyau2 != null) {
                        continue;
                    } else if (!z && !((zzYAS) zzyau6).zzY6d()) {
                        zzyau4 = zzyau6;
                        zzyau3 = null;
                    }
                    break;
                case 25604:
                    if (zzyau6.zzY6M().zzYLJ().isFloating()) {
                        continue;
                    } else {
                        boolean z3 = zzyau3 != null;
                        if (zzyau6.zzY7r() == 5121) {
                            zzyau5 = zzyau6;
                        } else if (zzyau6.getContentHeight() > 0) {
                            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzY9X>) arrayList, (zzY9X) zzyau6);
                            z2 = z2 || zzyau6.getSpacing() > 0;
                        }
                        z = z3;
                    }
                    break;
                default:
                    break;
            }
            zzyau3 = zzyau6;
        }
        if (zzyau2 == null) {
            if (zzyau3 == null) {
                zzyau3 = zzyau4;
            }
            if (zzyau3 != null) {
                if (arrayList.size() == 0) {
                    zz2(zzyau3);
                } else if (!z2) {
                    zzZZ(zzyau3);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zz1((zzY9X) it.next());
        }
        if (zzyau5 != null) {
            zz1(zzyau5);
        }
    }

    public final zzZ56 zzYQB() {
        return (zzZ56) memberwiseClone();
    }

    public final int zzYQC() {
        return zzYQF() + this.zzYdx + this.zzYdw;
    }

    public final int zzYQD() {
        return this.zzYdy + this.zzYdz + this.zzYdx + this.zzYdw + this.zzYdv;
    }

    public final int zzYQE() {
        return this.zzYdw + this.zzYdv + this.zzYdu;
    }

    public final int zzYQF() {
        return this.zzYdA + this.zzYdz + this.zzYdy;
    }

    public final int zzZY(zzYAU zzyau) throws Exception {
        int baselineAlignment = ((zzZ37) ((zzYMM) ((zzZ55) zzyau.zzZZJ()).zza9()).zzYTt()).getBaselineAlignment();
        if (baselineAlignment == 0) {
            return zzYQz() - zzyau.zzHV();
        }
        if (baselineAlignment == 1) {
            return ((zzYQz() - zzyau.zzHV()) / 2) - ((zzYQy() - zzyau.zzHU()) / 2);
        }
        if (baselineAlignment != 3) {
            return 0;
        }
        return (zzyau.zzHU() - zzYQy()) / 2;
    }
}
