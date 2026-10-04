package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6X extends zzZ6S {
    public zzZ6X(zzUN zzun) {
        super(zzun);
    }

    private static com.aspose.words.internal.zzZZQ zzT(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        com.aspose.words.internal.zzZZQ zzzzq = new com.aspose.words.internal.zzZZQ();
        zzYN8 zzyn8ZzZ8m = zzyau.zzZ8m();
        zzZ55 zzz55ZzYQe = (zzZ55) zzyau.zzZZJ();
        while (zzz55ZzYQe != null) {
            if (zzz55ZzYQe.zzZ8m() == zzyn8ZzZ8m) {
                if (((zzYAU) zzz55ZzYQe.zz6w()).zzZo6() != 21586 && ((zzYAU) zzz55ZzYQe.zz6w()).zzZo6() != 21595) {
                    zzYAU zzyau3 = zzz55ZzYQe == zzyau.zzZZJ() ? zzyau : (zzYAU) zzz55ZzYQe.zz6x();
                    zzYAU zzyau4 = zzz55ZzYQe == zzyau2.zzZZJ() ? zzyau2 : (zzYAU) zzz55ZzYQe.zz6w();
                    long jZzZ = zzYMD.zzZ(zzyau3, 1, true, false);
                    zzzzq.zzf(com.aspose.words.internal.zzSA.zzY(new com.aspose.words.internal.zzZQ5((int) jZzZ, (int) (jZzZ >> 32), zzyau4.getRight() - zzyau3.getX(), zzyau3.getHeight())));
                }
                if (zzz55ZzYQe == zzyau2.zzZZJ()) {
                    break;
                }
            }
            zzz55ZzYQe = zzz55ZzYQe.zzYQe();
        }
        return zzzzq;
    }

    private com.aspose.words.internal.zzZZQ zzX(zzYAQ zzyaq) throws Exception {
        zzZ55 zzz55 = (zzZ55) zzyaq.zzZZJ();
        int contentHeight = zzz55.getContentHeight();
        long jZzZ = zzYMD.zzZ(zzyaq, 1, true, false);
        zzWT zzwtZzYnX = zzz55.zzYnX();
        if (zzyaq.zzY60() && zzwtZzYnX != null) {
            RefInt refInt = new RefInt(contentHeight);
            jZzZ = zzZ(jZzZ, zzz55, zzwtZzYnX, refInt);
            contentHeight = refInt.get();
        }
        return new com.aspose.words.internal.zzZZQ(new com.aspose.words.internal.zzZQ4[]{com.aspose.words.internal.zzSA.zzY(new com.aspose.words.internal.zzZQ5((int) jZzZ, (int) (jZzZ >> 32), zzyaq.getWidth(), contentHeight))});
    }

    public final boolean zzQ(zzZ6P zzz6p) {
        zzYAQ zzyaqZzYTC = zzYTC();
        return zzyaqZzYTC.zzY65() == null || zzyaqZzYTC.zzY65().zzZ8m() == ((zzYN8) zzz6p.zzYgm);
    }

    public final boolean zzR(zzZ6P zzz6p) {
        zzYAQ zzyaqZzYTC = zzYTC();
        return zzyaqZzYTC.zzY64() == null || zzyaqZzYTC.zzY64().zzZ8m() == ((zzYN8) zzz6p.zzYgm);
    }

    public final com.aspose.words.internal.zzZZQ zzS(zzZ6P zzz6p) throws Exception {
        zzYAQ zzyaqZzYTC = zzYTC();
        zzYAU zzyauZzY65 = zzyaqZzYTC.zzY65();
        zzYAU zzyauZzY64 = zzyaqZzYTC.zzY64();
        if (zzyauZzY65 == null) {
            return zzX(zzyaqZzYTC);
        }
        if (zzyauZzY65.zzZ8m() != ((zzYN8) zzz6p.zzYgm)) {
            zzyauZzY65 = zzZ(zzz6p, true);
        }
        if (zzyauZzY64.zzZ8m() != ((zzYN8) zzz6p.zzYgm)) {
            zzyauZzY64 = zzZ(zzz6p, false);
        }
        zzyauZzY65.zzZ8m();
        zzyauZzY64.zzZ8m();
        com.aspose.words.internal.zzZZQ zzzzq = new com.aspose.words.internal.zzZZQ();
        zzzzq.zzY(zzT(zzyauZzY65, zzyauZzY64));
        ArrayList<zzYIA> arrayListZzZ = zzZ(zzyaqZzYTC.zzY65(), zzz6p);
        if (arrayListZzZ != null && arrayListZzZ.size() > 0) {
            zzzzq.zzZ(zzzzq.getCount() - 1, zzZ(zzyaqZzYTC.zzY65(), arrayListZzZ));
        }
        return zzzzq;
    }

    public final zzYAQ zzYTC() {
        return ((zzUI) this.zzYgm.zza9()).zzZZC();
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzz61.zzX(this);
        zzUN zzun = (zzUN) this.zzYgm;
        zzUO zzuo = new zzUO(zzun);
        zzZ55 zzz55ZzZZN = null;
        while (zzuo.moveNext() && zzuo.zzZZN() != zzun.zzZZI()) {
            if (zzz55ZzZZN == null || ((zzYMM) zzuo.zzZZN().zza9()) != ((zzYMM) zzz55ZzZZN.zza9())) {
                zzz55ZzZZN = zzuo.zzZZN();
                zzZ6N zzz6n = new zzZ6N(zzuo.zzZZN());
                zzz6n.zzY(com.aspose.words.internal.zzSA.zzF(com.aspose.words.internal.zzZPZ.zzZm(zzuo.zzZZN().getX(), zzuo.zzZZM())));
                zzz6n.zzZ(zzz61);
            }
        }
        zzz61.zzW(this);
    }

    @Override // com.aspose.words.zzZ6S
    public final com.aspose.words.internal.zzZQ4 zzbL() throws Exception {
        return new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, getWidth(), getHeight());
    }

    private zzZ55 zzZ(zzZ55 zzz55, zzY6N zzy6n) throws Exception {
        zzZ55 zzz55Zzb;
        while (true) {
            zzz55Zzb = zzZ55.zzb(zzz55);
            if (zzz55Zzb != null) {
                break;
            }
            zzy6n.zzhk();
            zzy6n = (zzY6N) ((zzYIC) ((zzYIA) ((zzWT) ((zzYIA) ((zzYIC) zzy6n.zzZXZ()).zz6x()).zzZZJ()).zzZZJ()).zza9()).zza9();
            zzz55Zzb = zzZ55.zzR(zzy6n);
            if (zzz55Zzb != null) {
                break;
            }
            zzz55 = null;
        }
        return zzz55Zzb;
    }

    private static com.aspose.words.internal.zzZZQ zzZ(zzYAU zzyau, ArrayList<zzYIA> arrayList) throws Exception {
        if (arrayList != null) {
            arrayList.size();
        }
        com.aspose.words.internal.zzZZQ zzzzq = new com.aspose.words.internal.zzZZQ();
        zzZ55 zzz55ZzYQe = (zzZ55) zzyau.zzZZJ();
        while (zzz55ZzYQe != null) {
            if (((zzYAU) zzz55ZzYQe.zz6w()).zzZo6() != 21586 && ((zzYAU) zzz55ZzYQe.zz6w()).zzZo6() != 21595) {
                zzYIA zzyia = (zzYIA) ((zzWT) zzz55ZzYQe.zzZZJ()).zzZZJ();
                if (!((zzYIC) zzyia.zza9()).zzBz()) {
                    break;
                }
                long jZzZ = zzYMD.zzZ(zzyia, 1, true, false);
                long jZzZ2 = zzYMD.zzZ(arrayList.get(0), 1, true, false);
                int iZzXYi = ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzXYi();
                zzYAU zzyau2 = zzz55ZzYQe == zzyau.zzZZJ() ? zzyau : (zzYAU) zzz55ZzYQe.zz6x();
                long jZzZ3 = zzYMD.zzZ(zzyau2, 1, true, false);
                int i = (((int) (jZzZ3 >> 32)) - ((int) (jZzZ >> 32))) + (((int) (jZzZ2 >> 32)) - iZzXYi);
                Iterator<zzYIA> it = arrayList.iterator();
                while (it.hasNext()) {
                    zzzzq.zzf(com.aspose.words.internal.zzSA.zzY(new com.aspose.words.internal.zzZQ5(((int) jZzZ3) + (((int) it.next().zzYqr()) - ((int) jZzZ)), i, ((zzYAU) zzz55ZzYQe.zz6w()).getRight() - zzyau2.getX(), zzyau2.getHeight())));
                }
            }
            zzz55ZzYQe = zzz55ZzYQe.zzYQe();
        }
        return zzzzq;
    }

    private static ArrayList<zzYIA> zzZ(zzYAU zzyau, zzZ6P zzz6p) {
        zzWT zzwtZzYnX = zzyau.zzYnX();
        if (zzwtZzYnX == null || !((zzYIC) ((zzYIA) zzwtZzYnX.zzZZJ()).zza9()).zzBz()) {
            return null;
        }
        zzYIA zzyia = (zzYIA) zzwtZzYnX.zzZZJ();
        zzUZ zzuz = (zzUZ) zzyia.zzqh(2);
        ArrayList<zzYIA> arrayList = new ArrayList<>();
        while (true) {
            zzuz = (zzUZ) zzuz.zzYo1();
            if (zzuz == null) {
                break;
            }
            if (((zzYN8) zzuz.zzZZJ()) == ((zzYN8) zzz6p.zzYgm)) {
                zzYIA zzyia2 = (zzYIA) com.aspose.words.internal.zzZKW.zzZ((zzTC) zzuz.zz6x(), zzYIA.class);
                if (zzyia2 == null || zzyia2.zza5().zza6() != zzyia.zza5().zza6()) {
                    break;
                }
                if (zzyia2.zzYjB()) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList, zzyia2);
                }
            }
        }
        return arrayList;
    }

    private long zzZ(long j, zzZ55 zzz55, zzWT zzwt, RefInt refInt) throws Exception {
        zzYIC zzyic = (zzYIC) ((zzWV) zzwt.zza9()).zza9();
        if (zzY39.zzO(zzyic)) {
            return j;
        }
        zzZ55 zzz55ZzZ = zzZ(zzz55, (zzY6N) ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zza9());
        if (zzz55ZzZ.zzZZJ().zz60() != 16) {
            refInt.set(zzz55ZzZ.getContentHeight());
            return zzYMD.zzZ(zzz55ZzZ, 1, true, false);
        }
        zzY6N zzy6n = (zzY6N) zzyic.zza9();
        if (zzy6n.zzhk() && zzz55ZzZ.zzZZJ().zza9() == zzy6n.zza9()) {
            refInt.set(zzz55ZzZ.getHeight());
            return zzYMD.zzZ(zzz55ZzZ, 1, true, false);
        }
        long jZzZ = zzYMD.zzZ((zzYIA) ((zzWT) zzz55ZzZ.zzZZJ()).zzZZJ(), 1, true, false);
        int x = (zzy6n.zzY6a().isFloating() || zzy6n.zzhk()) ? (int) jZzZ : ((zzUZ) zzz55ZzZ.zzqh(2)).getX();
        refInt.set(zzz55ZzZ.zzZZJ().getHeight());
        zzY6N zzy6n2 = (zzY6N) ((zzYIC) ((zzWV) zzz55ZzZ.zzZZJ().zza9()).zza9()).zza9();
        if (zzy6n2 != null && zzy6n2 != zzy6n && !zzY39.zzO((zzYIC) zzy6n.zzZXY())) {
            refInt.set(0);
        }
        return com.aspose.words.internal.zzZPZ.zzZm(x, (int) (jZzZ >> 32));
    }

    private zzYAU zzZ(zzZ6P zzz6p, boolean z) throws Exception {
        zzYBL zzybl;
        zzWT zzwtZzZ;
        if (z) {
            zzybl = (zzUZ) ((zzYN8) zzz6p.zzYgm).zz6x();
        } else {
            zzybl = (zzUZ) ((zzYN8) zzz6p.zzYgm).zz6w();
        }
        zzYAQ zzyaqZzYTC = zzYTC();
        zzWT zzwtZzYnX = (z ? zzyaqZzYTC.zzY65() : zzyaqZzYTC.zzY64()).zzYnX();
        if (zzwtZzYnX != null && (zzwtZzZ = zzZ(zzz6p, zzwtZzYnX, z)) != null) {
            zzybl = zzwtZzZ;
        }
        zzZ55 zzz55Zzw = zzybl.zzw(z, true);
        if (z) {
            return (zzYAU) zzz55Zzw.zz6x();
        }
        return (zzYAU) zzz55Zzw.zz6w();
    }

    private static zzWT zzZ(zzZ6P zzz6p, zzWT zzwt, boolean z) {
        zzWT zzwt2;
        zzWV zzwvZz6i;
        while (true) {
            if (z) {
                zzwt2 = (zzWT) zzwt.zzYo1();
            } else {
                zzwt2 = (zzWT) zzwt.zzYo0();
            }
            if (zzwt2 != null) {
                zzwt = zzwt2;
            } else if (((zzY6N) ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zza9()).zzhk()) {
                zzwt = (zzWT) ((zzYIA) zzwt.zzZZJ()).zzZZJ();
            } else {
                if (z) {
                    zzwvZz6i = ((zzWV) zzwt.zza9()).zz6h();
                } else {
                    zzwvZz6i = ((zzWV) zzwt.zza9()).zz6i();
                }
                if (zzwvZz6i == null) {
                    return null;
                }
                zzwt = z ? zzwvZz6i.zz6t() : zzwvZz6i.zz6s();
            }
            if (!zzwt.isShared() || !zzwt.isEmpty()) {
                if (zzwt.zzZ8m() == ((zzYN8) zzz6p.zzYgm)) {
                    while (zzwt.isEmpty()) {
                        zzwt = (zzWT) (z ? zzwt.zz5Z() : zzwt.zz5Y());
                    }
                    return zzwt;
                }
            }
        }
    }
}
