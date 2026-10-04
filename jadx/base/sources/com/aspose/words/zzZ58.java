package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ58 {
    private zzY76 zzYdF;
    private zzVE zzYe8;
    private zzZ55 zzYeg;
    private int zzYes;

    private static boolean zzO(zzZ55 zzz55, int i) throws Exception {
        if (i == 0) {
            return false;
        }
        zzTF zztfZzZZJ = zzz55.zzZZJ();
        zzZ55 zzz552 = (zzZ55) zzz55.zzYo0();
        for (int i2 = 0; i2 < i; i2++) {
            if (zzz552 != null && zzz552.zzZZJ() == zztfZzZZJ) {
                zzYAU zzyauZzS = zzVE.zzS((zzYAU) zzz552.zz6w());
                if (com.aspose.words.internal.zzZYD.zzXk(zzyauZzS.getText()) && com.aspose.words.internal.zzZKN.zzW(zzyauZzS.getText(), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                    zzz552 = (zzZ55) zzz552.zzYo0();
                }
            }
            return false;
        }
        return true;
    }

    public static String zzR(zzYAU zzyau, int i) throws Exception {
        return zzZ(zzyau, i, (Ref<zzYAU>) new Ref(null));
    }

    private static int zzS(zzVE zzve) throws Exception {
        zzVE zzve2 = new zzVE(zzve);
        if (zzve2.moveNext()) {
            return zzve2.zz11();
        }
        return 0;
    }

    private zzVF zzU(zzVF zzvf) throws Exception {
        RefInt refInt = new RefInt(0);
        RefInt refInt2 = new RefInt(0);
        RefInt refInt3 = new RefInt(0);
        zzZDB zzzdbZzZ = zzZ(zzvf, refInt, refInt2, refInt3);
        int i = refInt.get();
        int i2 = refInt2.get();
        int i3 = refInt3.get();
        if (zzzdbZzZ == null) {
            return null;
        }
        zzVE zzve = new zzVE(zzvf.zz14(), null);
        zzve.zzX(zzvf);
        for (int i4 = (i + i2) - 1; i4 < i3; i4++) {
            if (com.aspose.words.internal.zzAN.zzZP(zzzdbZzZ.zzYX5()[i4])) {
                return zzve.zz0V();
            }
            zzve.moveNext();
        }
        return null;
    }

    public static boolean zzZ(zzZ55 zzz55, zzY76 zzy76, int i, zzVE zzve, int i2) throws Exception {
        if (!zzc(zzve.zz14())) {
            return false;
        }
        zzZ58 zzz58 = new zzZ58();
        zzz58.zzYe8 = zzve;
        zzz58.zzYeg = zzz55;
        zzz58.zzYdF = zzy76;
        zzz58.zzYes = i;
        return zzz58.zzxI(i2);
    }

    private int zza(zzYAU zzyau) throws Exception {
        if (((zzYAU) this.zzYeg.zz6x()) != zzyau) {
            zzY9B.zzC((zzYAU) this.zzYeg.zz6x(), zzyau);
        }
        int width = 0;
        for (zzYAU zzyau2 = (zzYAU) this.zzYeg.zz6x(); zzyau2 != zzyau; zzyau2 = (zzYAU) zzyau2.zzYo1()) {
            zzY9U zzy9u = (zzY9U) com.aspose.words.internal.zzZKW.zzZ(zzyau2, zzY9U.class);
            width += zzy9u == null ? zzyau2.getWidth() : this.zzYdF.zzZ(zzy9u);
        }
        return width;
    }

    private boolean zzb(zzYAU zzyau) throws Exception {
        if (this.zzYeg.zza7().zzZYM()) {
            return false;
        }
        int width = this.zzYeg.zzZZJ().getWidth();
        if (this.zzYeg.zzZZJ().zz60() == 16) {
            zzWT zzwt = (zzWT) this.zzYeg.zzZZJ();
            width -= zzwt.zz5X() + zzwt.zz5V();
        }
        int iZzYM4 = width - ((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYM4();
        int iZza = zza(zzyau);
        return !(iZza <= 0) && iZza > iZzYM4 - this.zzYeg.zza7().getHyphenationZone();
    }

    private static boolean zzc(zzYAU zzyau) throws Exception {
        if (zzyau.zzY6C()) {
            return false;
        }
        zzZ55 zzz55 = (zzZ55) zzyau.zzZZJ();
        return ((zzYMM) zzz55.zza9()).zzYoe() && zzY9R.zzmY(zzyau.zzZo6()) && !zzO(zzz55, zzz55.zza7().getConsecutiveHyphenLimit());
    }

    public static boolean zzxH(int i) {
        return i != 7;
    }

    private boolean zzxI(int i) throws Exception {
        boolean z = false;
        RefInt refInt = new RefInt(0);
        RefInt refInt2 = new RefInt(0);
        RefInt refInt3 = new RefInt(0);
        zzZDB zzzdbZzZ = zzZ(this.zzYe8.zz0V(), refInt, refInt2, refInt3);
        int i2 = refInt.get();
        int i3 = refInt2.get();
        refInt3.get();
        if (zzzdbZzZ == null) {
            return false;
        }
        zzYAU zzyauZz14 = this.zzYe8.zz14();
        int index = this.zzYe8.getIndex();
        int width = this.zzYeg.getWidth() + this.zzYes;
        for (int i4 = (i2 + i3) - 1; i4 >= i3; i4--) {
            if (com.aspose.words.internal.zzAN.zzZP(zzzdbZzZ.zzYX5()[i4]) && width > zzYAA.zzZ(this.zzYeg, this.zzYe8.zz14().zzY6N()) + i && (this.zzYeg.zza7().zzZYM() || width >= zzS(this.zzYe8) + i)) {
                z = true;
                break;
            }
            i -= this.zzYe8.zz11();
            this.zzYe8.movePrevious();
            if (this.zzYe8.zz13()) {
                break;
            }
        }
        if (!z) {
            this.zzYe8.zzY(zzyauZz14, index);
        }
        return z;
    }

    public static zzVF zzZ(zzZ55 zzz55, zzVF zzvf, zzY76 zzy76) throws Exception {
        if (!zzc(zzvf.zz14())) {
            return null;
        }
        zzZ58 zzz58 = new zzZ58();
        zzz58.zzYdF = zzy76;
        zzz58.zzYeg = zzz55;
        return zzz58.zzU(zzvf);
    }

    private zzZDB zzZ(zzVF zzvf, RefInt refInt, RefInt refInt2, RefInt refInt3) throws Exception {
        zzZDA zzzdaZzZ;
        refInt3.set(0);
        RefInt refInt4 = new RefInt(0);
        Ref ref = new Ref(null);
        String strZzZ = zzZ(zzvf, this.zzYeg.zza7().zzZYM(), refInt, refInt2, refInt4, ref);
        int i = refInt4.get();
        zzYAU zzyau = (zzYAU) ref.get();
        if (strZzZ == null || (zzzdaZzZ = Hyphenation.zzZ(i, this.zzYeg.zzab())) == null) {
            return null;
        }
        if (refInt2.get() == 0 && zzb(zzyau)) {
            return null;
        }
        refInt3.set(strZzZ.length());
        return zzzdaZzZ.zzQ(strZzZ, this.zzYeg.zza7().zzZYM(), this.zzYeg.zza7().zzYMy());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (r15.get() != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
    
        if (r15.get().zzY6N().zzYKG() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
    
        if (r11 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        r14.set(r15.get().zzZo2());
        r10 = new com.aspose.words.ref.Ref(null);
        r12 = zzZ(r15.get(), r6, (com.aspose.words.ref.Ref<com.aspose.words.zzYAU>) r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (((com.aspose.words.zzYAU) r10.get()).zzY6N().zzYKG() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
    
        if (r11 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010d, code lost:
    
        return r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[PHI: r6
      0x0077: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:12:0x0040, B:22:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String zzZ(zzVF zzvf, boolean z, RefInt refInt, RefInt refInt2, RefInt refInt3, Ref<zzYAU> ref) throws Exception {
        ref.set(null);
        zzYAU zzyauZz14 = zzvf.zz14();
        refInt3.set(0);
        refInt.set(0);
        refInt2.set(0);
        zzYAH zzyahZzY6j = zzyauZz14.zzY6j();
        if ((zzyahZzY6j != null && !zzxH(zzyahZzY6j.getFieldType())) || zzyauZz14.zzY6C()) {
            return null;
        }
        int index = zzvf.getIndex();
        zzZ55 zzz55 = (zzZ55) zzyauZz14.zzZZJ();
        boolean z2 = false;
        int i = 0;
        while (true) {
            com.aspose.words.internal.zzZYD.zzXk(zzyauZz14.getText());
            if (!(zzyauZz14 instanceof zzYAA)) {
                int iLastIndexOf = zzyauZz14.getText().substring(0, index + 1).lastIndexOf(45);
                if (iLastIndexOf >= 0 && !z) {
                    return null;
                }
                if (iLastIndexOf == index) {
                    break;
                }
                ref.set(zzyauZz14);
                i = iLastIndexOf + 1;
                if (z2) {
                    refInt2.set(((refInt2.get() + index) - i) + 1);
                } else {
                    refInt.set(((refInt.get() + index) - i) + 1);
                }
                if (i > 0) {
                    break;
                }
            } else {
                zzyauZz14 = zzVE.zzS((zzYAU) zzyauZz14.zzYo0());
                if (zzyauZz14 == null || !zzY9R.zzmY(zzyauZz14.zzZo6()) || zzyauZz14.zzY6j() != zzyahZzY6j) {
                    break;
                }
                if (zzyauZz14.zzY6C()) {
                    return null;
                }
                if (!z2 && zzz55 != ((zzZ55) zzyauZz14.zzZZJ())) {
                    if (((zzZ55) zzyauZz14.zzZZJ()).zzac()) {
                        z2 = true;
                    } else {
                        zzz55 = (zzZ55) zzyauZz14.zzZZJ();
                    }
                }
                index = zzyauZz14.getText().length() - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String zzZ(zzYAU zzyau, int i, Ref<zzYAU> ref) throws Exception {
        StringBuilder sb = new StringBuilder();
        ref.set(zzyau);
        int length = zzyau.getText().length() - 1;
        zzYAH zzyahZzY6j = zzyau.zzY6j();
        if (zzyahZzY6j != null) {
            zzyahZzY6j.getFieldType();
        }
        boolean zZzYMA = zzyau.zza7().zzYMA();
        while (true) {
            com.aspose.words.internal.zzZYD.zzXk(zzyau.getText());
            if (!(zzyau instanceof zzYAA)) {
                int iIndexOf = zzyau.getText().substring(i, (length - i) + 1 + i).indexOf(45);
                if (iIndexOf >= 0) {
                    length = (iIndexOf + i) - 1;
                }
                sb.append((CharSequence) zzyau.getText(), i, (length - i) + 1 + i);
                if (length < zzyau.getText().length() - 1) {
                    break;
                }
            } else {
                ref.set(zzyau);
                zzyau = zzVE.zzT((zzYAU) zzyau.zzYo1());
                if (zzyau == null || !zzY9R.zzmY(zzyau.zzZo6()) || zzyau.zzY6j() != zzyahZzY6j || (zZzYMA && (zzyau.zzY6D() || ref.get().zzY6D() != zzyau.zzY6D()))) {
                    break;
                }
                length = zzyau.getText().length() - 1;
                i = 0;
            }
        }
        return sb.toString();
    }
}
