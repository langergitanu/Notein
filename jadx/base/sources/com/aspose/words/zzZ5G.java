package com.aspose.words;

import com.aspose.words.internal.C22243OooO0Oo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5G {
    private static float[] zzYej = {0.18f, 0.28f};
    private zzZYZ zzYSF;
    private ArrayList<zzZ6H> zzYel;
    private ArrayList<com.aspose.words.internal.zzZL> zzYem;
    private zzZ6U zzYen;
    private boolean zzYeo;
    private zzY4A zzYeq;
    private zzZAI zzYgG;
    private zzZ71 zzZFF;
    private ArrayList<com.aspose.words.internal.zzZL> zzZFw;
    private boolean zzYek = true;
    private zzXX zzYep = new zzXX(1);

    public zzZ5G(zzZ71 zzz71, zzZAI zzzai, zzZYZ zzzyz, boolean z) {
        this.zzZFF = zzz71;
        this.zzYgG = zzzai;
        this.zzYeq = new zzY4A(zzz71);
        this.zzYeo = z;
        this.zzYSF = zzzyz;
    }

    public static com.aspose.words.internal.zzPV zz0(com.aspose.words.internal.zzPV zzpv) {
        return com.aspose.words.internal.zzPV.zzX(zzpv.zzPD(), (int) (zzpv.zzPC() * 0.6f), (int) (zzpv.zzPB() * 0.6f), (int) (zzpv.zzPA() * 0.6f));
    }

    private void zz6(com.aspose.words.internal.zzG zzg) {
        if (zzg == null) {
            return;
        }
        this.zzYgG.zzZ2n();
        this.zzZFF.zzZI();
        this.zzYgG.zzZ2l();
        this.zzYek = true;
    }

    private static com.aspose.words.internal.zzZS zzB(com.aspose.words.internal.zzZL zzzl) {
        com.aspose.words.internal.zzZS zzzs = new com.aspose.words.internal.zzZS(33554432);
        zzzs.zzX(zzzl);
        return zzzs;
    }

    private void zzI(zzZ6H zzz6h) throws Exception {
        Border border = zzz6h.getFont().getBorder();
        if (border.isVisible() && this.zzYen != null && zzz6h.zz14().zzY75()) {
            if (!this.zzYep.zz8u()) {
                this.zzYep.zz8z();
            }
            com.aspose.words.internal.zzZQ4 zzzq4ZzYSx = zzz6h.zzYSx();
            this.zzYep.zzZ(this.zzZFF.zzZ9(new com.aspose.words.internal.zzZQ4(zzzq4ZzYSx.getX(), Math.max(0.0f, zzzq4ZzYSx.getY()), zzzq4ZzYSx.getWidth(), Math.min(this.zzYen.getHeight(), zzzq4ZzYSx.getHeight()))), zzz6h.zz14().zzY6H() ? border : Border.zzZCe, zzz6h.zz14().zzY6G() ? border : Border.zzZCe, border, border);
            if (zzz6h.zz14().zzY6G()) {
                this.zzYep.zzZ(this.zzZFF);
            }
        }
    }

    private void zzJ(zzZ6H zzz6h) throws Exception {
        if (zzz6h.getFont().getStrikeThrough()) {
            float fZzYC = com.aspose.words.internal.zzZPY.zzYC(zzz6h.zzZT());
            zzZ68 zzz68 = (zzZ68) com.aspose.words.internal.zzZKW.zzZ(zzz6h, zzZ68.class);
            zzZ(zzz6h, fZzYC - ((zzz68 == null || !zzz68.zzYRA()) ? zzz6h.getFont().zzZ7i() * 0.23f : (zzz68.zz14().zzYjN() / 2) / 1000.0f));
        } else if (zzz6h.getFont().getDoubleStrikeThrough()) {
            for (int i = 0; i < 2; i++) {
                zzZ(zzz6h, com.aspose.words.internal.zzZPY.zzYC(zzz6h.zzZT()) - (zzz6h.getFont().zzZ7i() * zzYej[i]));
            }
        }
    }

    private String zzJk(String str) {
        return !this.zzZFF.zzYTR().zzYTd() ? str : com.aspose.words.internal.zzZKN.zzX(str, ControlChar.zzZs5, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) ? zzT7.zzZs0 : str.replace(ControlChar.zzZs5, zzT7.zzZs0);
    }

    private boolean zzJl(String str) {
        return this.zzZFF.zzYTR().zzYTd() && str.contains(ControlChar.zzZs5);
    }

    private static com.aspose.words.internal.zzZU zzK(com.aspose.words.internal.zz7 zz7Var) {
        while (zz7Var.getCount() != 0) {
            com.aspose.words.internal.zzZU zzzu = (com.aspose.words.internal.zzZU) com.aspose.words.internal.zzZKW.zzZ(zz7Var.zzN(zz7Var.getCount() - 1), com.aspose.words.internal.zzZU.class);
            if (zzzu != null) {
                return zzzu;
            }
            zz7Var = (com.aspose.words.internal.zz7) com.aspose.words.internal.zzZKW.zzZ(zz7Var.zzN(zz7Var.getCount() - 1), com.aspose.words.internal.zz7.class);
            if (zz7Var == null) {
                return null;
            }
        }
        return null;
    }

    private void zzL(zzZ6H zzz6h) throws Exception {
        if ((zzz6h.zz14().zzZo6() == 25604 ? zzz6h.getFont().getShading().isVisible() : this.zzZFF.zzQ(zzz6h.getFont().getShading())) && (!(zzz6h instanceof zzZ6D))) {
            zzYCM.zzZ(this.zzZFF.zzZ9(zzz6h.zzYTP()), zzz6h.getFont().getShading(), this.zzZFF);
        }
    }

    private void zzM(zzZ6H zzz6h) throws Exception {
        zzYAU zzyauZz14 = zzz6h.zz14();
        if (zzyauZz14.zzaa() == null || !zzyauZz14.zza8().zzYT3()) {
            return;
        }
        boolean z = (zzyauZz14 instanceof zzY9Z) && (zzyauZz14.zzaa() instanceof zzYVI);
        if (z || (zzyauZz14 instanceof zzYAD)) {
            zzZ99 zzz99 = z ? (zzZ99) com.aspose.words.internal.zzZKW.zzZ(com.aspose.words.internal.zzZKW.zzZ(((zzYVN) zzyauZz14.zza9().zzYTk()).zzYzk(), zzYAD.class), zzZ99.class) : (zzZ99) com.aspose.words.internal.zzZKW.zzZ(((zzYMM) zzyauZz14.zzY6L().zza9().zzYTk().zzZXZ()).zzYos().zzI(true, true), zzY9Z.class);
            if (zzz99 == null) {
                return;
            }
            this.zzZFF.zzS(new com.aspose.words.internal.zzI(this.zzZFF.zzXB(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) zzz6h.zzZT()), 0.0f)), zzz99.zzZkA()));
        }
    }

    private com.aspose.words.internal.zzZR zzN(zzZ6H zzz6h) throws Exception {
        if (zzz6h.zzYRZ() == null || !this.zzYek) {
            return null;
        }
        return new com.aspose.words.internal.zzZR(this.zzZFF.zzZ9(zzz6h.zzYSx()), zzz6h.zzYRZ(), zzz6h.zzZe(), zzz6h.getScreenTip());
    }

    public static com.aspose.words.internal.zzPV zzO(zzZ6H zzz6h) {
        com.aspose.words.internal.zzPV zzpvZzP = zzP(zzz6h);
        if (!zzpvZzP.isEmpty()) {
            if (zzpvZzP.toArgb() == com.aspose.words.internal.zzZQ1.zzRh(zzz6h.getFont().getColor())) {
                return com.aspose.words.internal.zzPV.zzKa;
            }
            if (zzpvZzP.zzPC() < 56 || zzpvZzP.zzPB() < 56 || zzpvZzP.zzPA() < 56) {
                return com.aspose.words.internal.zzPV.zzI5;
            }
        }
        return com.aspose.words.internal.zzPV.zzX(255, 192, 192, 192);
    }

    public static com.aspose.words.internal.zzPV zzP(zzZ6H zzz6h) {
        return zzz6h.zzYgm.zza9() instanceof zzYMM ? ((zzZ37) ((zzYMM) zzz6h.zzYgm.zza9()).zzYTt()).zzYMW().zzOK() : com.aspose.words.internal.zzPV.zzHZ;
    }

    private void zzQ(zzZ6H zzz6h) throws Exception {
        com.aspose.words.internal.zzZU zzzu = new com.aspose.words.internal.zzZU(zzz6h.zzYRY(), com.aspose.words.internal.zzPY.zzPJ(), this.zzZFF.zzXB(zzz6h.zzZT()), " ");
        zzzu.zzZ(zzN(zzz6h));
        this.zzZFF.zzS(zzzu);
    }

    private void zzR(zzZ6H zzz6h) throws Exception {
        com.aspose.words.internal.zzP9 zzp9;
        Font font = zzz6h.getFont();
        com.aspose.words.internal.zzPV zzpvZzQ = this.zzZFF.zzQ(zzz6h.getFont().zz8Q(), zzz6h.zz14().zzY6N().zzYL1());
        com.aspose.words.internal.zzPV zzpvZzW = zzW(zzz6h, zzpvZzQ);
        com.aspose.words.internal.zzPV zzpvZzX = zzX(zzz6h, zzpvZzQ);
        long jZzXB = this.zzZFF.zzXB(zzz6h.zzZT());
        float f = font.getEmboss() ? -0.8f : font.getEngrave() ? 0.8f : 0.0f;
        long jOooO00o = C22243OooO0Oo.OooO00o(f, Float.intBitsToFloat((int) jZzXB) + f, jZzXB);
        int iMax = Math.max(1, font.getScaling());
        if (iMax != 100) {
            zzp9 = new com.aspose.words.internal.zzP9();
            float f2 = iMax / 100.0f;
            int i = (int) jOooO00o;
            zzp9.zzY((-Float.intBitsToFloat(i)) * f2, 0.0f, 0);
            zzp9.zzZ(f2, 1.0f, 0);
            zzp9.zzY(Float.intBitsToFloat(i) / f2, 0.0f, 0);
        } else {
            zzp9 = null;
        }
        com.aspose.words.internal.zzP9 zzp92 = zzp9;
        if (zzz6h.zzUU(this.zzZFF.zzYTR().zzYTd())) {
            zzZ(zzz6h, jOooO00o, zzp92, zzpvZzX, zzpvZzW);
        } else {
            zzY(zzz6h, jOooO00o, zzp92, zzpvZzX, zzpvZzW);
        }
    }

    private void zzS(zzZ6H zzz6h) throws Exception {
        int iZzZo6 = zzz6h.zz14().zzZo6();
        if (iZzZo6 != 9747) {
            if (iZzZo6 == 10754) {
                zzZ(zzz6h, zzT7.zzZs0, zzz6h.zzYRY());
                return;
            }
            if (iZzZo6 == 10782) {
                zzZ(zzz6h, zzT7.zzZrY, zzz6h.zzYRY());
                return;
            }
            if (iZzZo6 == 10783) {
                zzZ(zzz6h, zzT7.zzZrX, zzz6h.zzYRY());
                return;
            }
            switch (iZzZo6) {
                case 10768:
                case 10769:
                case 10770:
                    break;
                default:
                    zzR(zzz6h);
                    break;
            }
            return;
        }
        zzZ(zzz6h, zzT7.zzZrZ, zzz6h.zzYRY());
    }

    private void zzT(zzZ6H zzz6h) throws Exception {
        this.zzYgG.zzZ(zzz6h);
    }

    private void zzU(zzZ6H zzz6h) throws Exception {
        zzT(zzz6h);
        this.zzZFF.zzU(zzz6h.getFont().getShading());
        if (zzz6h.zz14().zzZo6() == 12803) {
            zzY((zzZ65) zzz6h);
        } else if (zzY9R.zzmX(zzz6h.zz14().zzZo6()) && this.zzZFF.zzYTR().zzYTd()) {
            zzS(zzz6h);
        } else {
            zzR(zzz6h);
        }
        this.zzZFF.zzZ7c();
    }

    private static com.aspose.words.internal.zzPV zzW(zzZ6H zzz6h, com.aspose.words.internal.zzPV zzpv) {
        return zzz6h.getFont().getOutline() ? zzpv : com.aspose.words.internal.zzPV.zzHZ;
    }

    private void zzY(zzZ6H zzz6h, com.aspose.words.internal.zzG zzg) throws Exception {
        zzg.zzZM().zzZ(com.aspose.words.internal.zzZQ4.zzT(zzg.zzZM().zzZZ(), this.zzZFF.zzZ9(zzz6h.zzYSx())));
    }

    private void zzYR2() throws Exception {
        com.aspose.words.internal.zzG zzgZzZ = null;
        String strZzYRZ = null;
        for (zzZ6H zzz6h : this.zzYel) {
            if (zzz6h.zzYRZ() == null) {
                zz6(zzgZzZ);
                zzgZzZ = null;
            } else if (com.aspose.words.internal.zzZKN.equals(zzz6h.zzYRZ(), strZzYRZ)) {
                zzY(zzz6h, zzgZzZ);
            } else {
                zzgZzZ = zzZ(zzz6h, zzgZzZ);
            }
            zzU(zzz6h);
            strZzYRZ = zzz6h.zzYRZ();
        }
        zz6(zzgZzZ);
    }

    private void zzYR4() throws Exception {
        zzZ55 zzz55 = (zzZ55) this.zzYen.zzYgm;
        if (((zzYMM) zzz55.zza9()).zzaa().zzbD() && zzz55.getLineNumber() > 0) {
            zzZ2D zzz2d = (zzZ2D) ((zzYMM) zzz55.zza9()).zzYTk();
            zzZ2C zzz2c = (zzZ2C) zzz2d.zza9();
            zzY9S zzy9s = new zzY9S(Integer.toString(zzz55.getLineNumber()));
            zzy9s.zzU(zzZ32.zzW(zzz2c.zza7().zzbi()));
            zzy9s.zzY(zzz55);
            if (((zzZ35) zzz2d.zzYTt()).zzZz()) {
                zzy9s.setX(zzz55.zzZZJ().getWidth() + ((zzZ35) zzz2d.zzYTt()).zzYLm());
            } else {
                zzy9s.setX(((-((zzZ35) zzz2d.zzYTt()).zzYLm()) - zzy9s.getWidth()) - zzz55.getX());
            }
            zzy9s.setY((zzz55.getBaseline() - zzy9s.zzYjN()) + zzy9s.zzYjL());
            zzV(new zzZ64(zzy9s));
        }
    }

    private void zzYR5() {
        Iterator<com.aspose.words.internal.zzZL> it = this.zzYem.iterator();
        while (it.hasNext()) {
            this.zzZFF.zzS(it.next());
        }
    }

    private void zzYR6() throws Exception {
        if (this.zzYeq.zzXUh()) {
            this.zzYgG.zzZ2f();
            this.zzYeq.zzXUi();
            this.zzYgG.zzZ2e();
        }
    }

    public static float zzYu(float f) {
        return f * 0.042f;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private com.aspose.words.internal.zzG zzZ(zzZ6H zzz6h, com.aspose.words.internal.zzG zzg) throws Exception {
        zz6(zzg);
        this.zzYek = false;
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.zzZR zzzr = new com.aspose.words.internal.zzZR(this.zzZFF.zzZ9(zzz6h.zzYSx()), zzz6h.zzYRZ(), zzz6h.zzZe(), zzz6h.getScreenTip());
        zzg2.zzZ(zzzr);
        this.zzYgG.zzW(zzzr);
        this.zzZFF.zzL(zzg2);
        return zzg2;
    }

    public static com.aspose.words.internal.zzPV zzZZ(com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzPV zzpv2 = com.aspose.words.internal.zzPV.zzKa;
        if (zzpv.isEmpty() || (zzpv.zzPC() == zzpv.zzPB() && zzpv.zzPB() == zzpv.zzPA())) {
            return zzpv2;
        }
        com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(zzpv);
        zzip.zzZQ(zzip.zzGu() * ((double) (zzip.zzGu() > 0.5d ? 0.8f : 1.2f)));
        return zzip.zzGx();
    }

    private static zzYAU zzo(zzYAU zzyau) throws Exception {
        zzYMD zzymdZz5Z = zzyau.zz5Z();
        while (true) {
            zzYAU zzyau2 = (zzYAU) zzymdZz5Z;
            if (zzyau2 == null) {
                return null;
            }
            if (zzY9R.zzmY(zzyau2.zzZo6())) {
                if (zzyau2.zzY6N().zzY(zzyau.zzY6N())) {
                    return zzyau2;
                }
                return null;
            }
            zzymdZz5Z = zzyau2.zz5Z();
        }
    }

    private static zzYAU zzp(zzYAU zzyau) throws Exception {
        zzYMD zzymdZz5Y = zzyau.zz5Y();
        while (true) {
            zzYAU zzyau2 = (zzYAU) zzymdZz5Y;
            if (zzyau2 == null) {
                return null;
            }
            if (zzY9R.zzmY(zzyau2.zzZo6())) {
                if (zzyau2.zzY6N().zzY(zzyau.zzY6N())) {
                    return zzyau2;
                }
                return null;
            }
            zzymdZz5Y = zzyau2.zz5Y();
        }
    }

    private static float zzq(zzYAU zzyau) throws Exception {
        int iZzZXS = zzyau.zzZXS();
        for (zzYAU zzyauZzp = zzp(zzyau); zzyauZzp != null; zzyauZzp = zzp(zzyauZzp)) {
            iZzZXS += zzyauZzp.zzZXS();
        }
        while (true) {
            zzyau = zzo(zzyau);
            if (zzyau == null) {
                return iZzZXS / 1000.0f;
            }
            iZzZXS += zzyau.zzZXS();
        }
    }

    private static float zzr(zzYAU zzyau) throws Exception {
        int iZzZXS = 0;
        for (zzYAU zzyauZzp = zzp(zzyau); zzyauZzp != null; zzyauZzp = zzp(zzyauZzp)) {
            iZzZXS += zzyauZzp.zzZXS();
        }
        return iZzZXS / 1000.0f;
    }

    private static char zzxM(int i) {
        if (i == 1) {
            return FilenameUtils.EXTENSION_SEPARATOR;
        }
        if (i == 2) {
            return '-';
        }
        if (i == 3 || i == 4) {
            return '_';
        }
        return i != 5 ? (char) 0 : (char) 8729;
    }

    public final void zzV(zzZ6H zzz6h) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYel, zzz6h);
    }

    public final void zzX(zzZ6U zzz6u) throws Exception {
        this.zzYen = zzz6u;
        this.zzYel = new ArrayList<>();
        if (((zzZ55) this.zzYen.zzYgm).zzYPQ()) {
            this.zzZFF.zzXE(this.zzYen.zzZT()).zzZ(com.aspose.words.internal.zzP8.zzM(com.aspose.words.internal.zzZQ4.zz2T));
        } else {
            this.zzZFF.zzXC(this.zzYen.zzZT());
        }
        this.zzYem = new ArrayList<>();
        zzYR4();
        zzYS.zzZ(this.zzYen.zzYgm, 1);
    }

    public final void zzYR3() throws Exception {
        ArrayList<zzZ6H> arrayList = this.zzYel;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        this.zzYgG.zzZ2f();
        Iterator<zzZ6H> it = this.zzYel.iterator();
        while (it.hasNext()) {
            zzX(it.next(), false);
        }
        this.zzYgG.zzZ2e();
        zzYR2();
        this.zzYgG.zzZ2f();
        Iterator<zzZ6H> it2 = this.zzYel.iterator();
        while (it2.hasNext()) {
            zzW(it2.next(), true);
        }
        this.zzYgG.zzZ2e();
        this.zzYel.clear();
    }

    public final void zzYR7() throws Exception {
        zzYR3();
        zzYR6();
        if (((zzZ55) this.zzYen.zzYgm).zzYPQ()) {
            this.zzYgG.zzZ2n();
            this.zzZFF.zzZI();
        } else {
            this.zzZFF.zzXC(0L);
        }
        zzYR5();
        if (!this.zzZFF.zzYTR().zzYSZ().isEmpty()) {
            this.zzZFF.zzU(new com.aspose.words.internal.zzZQ4(this.zzYen.zzZm(), this.zzYen.zzZo(), this.zzYen.getWidth(), this.zzYen.getHeight()), this.zzZFF.zzYTR().zzYSZ());
        }
        if (!this.zzZFF.zzYTR().zzYSY().isEmpty()) {
            float baseline = (((zzZ55) this.zzYen.zzYgm).getBaseline() / 1000.0f) + this.zzYen.zzZo();
            this.zzZFF.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(this.zzYen.zzZm(), baseline), com.aspose.words.internal.zzZPY.zzG(this.zzYen.zzZm() + this.zzYen.getWidth(), baseline)}, this.zzZFF.zzYTR().zzYSY());
        }
        this.zzYen = null;
        this.zzYem = null;
        this.zzYel = null;
    }

    private static String zzV(OleFormat oleFormat) throws Exception {
        if (oleFormat.getOlePackage() != null && com.aspose.words.internal.zzZYD.zzXk(oleFormat.getOlePackage().getDisplayName())) {
            return oleFormat.getOlePackage().getDisplayName();
        }
        String suggestedFileName = oleFormat.getSuggestedFileName();
        if (!com.aspose.words.internal.zzZYD.zzXk(suggestedFileName)) {
            suggestedFileName = oleFormat.getIconCaption();
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(suggestedFileName)) {
            suggestedFileName = "Attachment";
        }
        return (com.aspose.words.internal.zzZOQ.hasExtension(suggestedFileName) || !com.aspose.words.internal.zzZYD.zzXk(oleFormat.getSuggestedExtension())) ? suggestedFileName : com.aspose.words.internal.zzZOQ.zzZX(suggestedFileName, oleFormat.getSuggestedExtension());
    }

    private com.aspose.words.internal.zzK zzW(zzZ68 zzz68) throws Exception {
        if (!this.zzZFF.zzYTR().zzYT5() || zzz68.getNode().getNodeType() != 18) {
            return null;
        }
        Shape shape = (Shape) zzz68.getNode();
        if (!shape.zzZid() || shape.zzYyi() != 1 || shape.getOleFormat().zzYrB() == null) {
            return null;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            shape.getOleFormat().zzYrB().saveForUser(zzzor, shape);
            byte[] bArrZzZX = com.aspose.words.internal.zzZYQ.zzZX(zzzor);
            zzzor.close();
            if (bArrZzZX.length == 0) {
                return null;
            }
            return new com.aspose.words.internal.zzK(this.zzZFF.zzZ9(zzz68.zzYSx()), bArrZzZX, zzV(shape.getOleFormat()), shape.getOleFormat().zzYrA() != null ? shape.getOleFormat().zzYrA().getContentType() : zzYO6.zzD3(shape.getOleFormat().getProgId()));
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    private void zzK(zzZ6H zzz6h) throws Exception {
        if (zzz6h.getFont().zzZ7k().isEmpty()) {
            return;
        }
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(this.zzZFF.zzZ9(zzz6h.zzYTP()));
        if (zzz6h.zzbK()) {
            zzzgZzW.zzZ(com.aspose.words.internal.zzP8.zzM(zzz6h.zzbL()));
        }
        zzzgZzW.zzY(new com.aspose.words.internal.zzOI(zzz6h.getFont().zzZ7k()));
        this.zzZFF.zzS(zzzgZzW);
    }

    public final void zzY(zzZ69 zzz69) throws Exception {
        zzYR3();
        com.aspose.words.internal.zzZQ4 zzzq4ZzJH = zzz69.zzJH();
        float height = (zzzq4ZzJH.getHeight() * 0.58f) + zzzq4ZzJH.zzZo();
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(this.zzZFF.zzXB(com.aspose.words.internal.zzZPY.zzG(zzzq4ZzJH.getX(), height)), this.zzZFF.zzXB(com.aspose.words.internal.zzZPY.zzG(zzzq4ZzJH.zzkw(), height)));
        zzzgZzZ.zzX(new com.aspose.words.internal.zzOU(com.aspose.words.internal.zzPV.zzKa, 0.72f));
        this.zzZFF.zzS(zzzgZzZ);
    }

    private static com.aspose.words.internal.zz7 zzZ(zzZ68 zzz68, com.aspose.words.internal.zz7 zz7Var) {
        com.aspose.words.internal.zzZS zzzs;
        int nodeType = zzz68.getNode().getNodeType();
        if (nodeType == 17) {
            com.aspose.words.internal.zzZS zzzs2 = new com.aspose.words.internal.zzZS(64);
            zzzs2.zzX(zz7Var);
            return zzzs2;
        }
        if (nodeType != 18) {
            return zz7Var;
        }
        if (zzz68.zzZua().zz7u().zzY9I()) {
            zzzs = new com.aspose.words.internal.zzZS(262144);
        } else {
            zzzs = new com.aspose.words.internal.zzZS(64);
        }
        zzzs.zzX(zz7Var);
        return zzzs;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzX(zzZ68 zzz68) throws Exception {
        zzYR3();
        com.aspose.words.internal.zzZR zzzrZzN = zzN(zzz68);
        com.aspose.words.internal.zzL zzlZzW = zzW(zzz68);
        if (zzzrZzN != null) {
            this.zzYgG.zzW(zzzrZzN);
        }
        boolean zIsInline = zzz68.isInline();
        if (zIsInline) {
            zzX((zzZ6H) zzz68, true);
        }
        long jZzZT = zzz68.zzZT();
        long jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzZT), com.aspose.words.internal.zzZPY.zzYC(jZzZT) - zzz68.zzYRW());
        com.aspose.words.internal.zzG zzgZzV = zzz68.zzV(this.zzZFF.zzYTR());
        if (zzgZzV.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzgZzV);
        }
        if (zIsInline) {
            jZzG = this.zzZFF.zzXB(jZzG);
        }
        zzgZzV.zzZO().zzY(Float.intBitsToFloat((int) jZzG), com.aspose.words.internal.zzZPY.zzYC(jZzG), 1);
        zzgZzV.zzZ(zzzrZzN);
        if (zzgZzV.zzZM() != null) {
            zzgZzV.zzZM().zzZ(new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), zzgZzV.zzZM().zzZZ().getSize()));
        }
        if (zzlZzW != null) {
            com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
            zzg.zzZ(zzlZzW);
            zzg.zzX((com.aspose.words.internal.zzZL) zzgZzV);
            zzgZzV = zzg;
        }
        com.aspose.words.internal.zzZS zzzsZzB = zzB(zzZ(zzz68, (com.aspose.words.internal.zzZL) zzZ(zzz68, (com.aspose.words.internal.zz7) zzgZzV)));
        zz8 zz8Var = new zz8(zzz68, zzzsZzB, zzgZzV);
        zzzsZzB.setTag(zz8Var);
        this.zzZFF.zzS(zzzsZzB);
        if (zIsInline) {
            zzW((zzZ6H) zzz68, false);
            ArrayList<com.aspose.words.internal.zzZL> arrayList = this.zzZFw;
            if (arrayList != null) {
                zz8Var.zzD(arrayList);
                this.zzZFw = null;
            }
        }
        if (zzzrZzN != null) {
            this.zzYgG.zzZ2n();
            this.zzYgG.zzZ2l();
        }
    }

    private void zzY(zzZ65 zzz65) throws Exception {
        if (this.zzYgG.zzZ2c()) {
            zzQ(zzz65);
        }
        if (this.zzZFF.zzYTR().zzYTb()) {
            zzZ(zzz65, ((zzZ55) zzz65.zz14().zzZZJ()).zz5T() ? "\uf021" : "\uf022", this.zzYSF.zzY("Wingdings 3", 12.0f, 0));
        }
        zzX(zzz65);
    }

    private void zzW(zzZ6H zzz6h, boolean z) throws Exception {
        if (z) {
            this.zzZFF.zzU(zzz6h.getFont().getShading());
        }
        if (zzz6h.zzYRQ()) {
            zzJ(zzz6h);
        }
        this.zzYeq.zzB(zzz6h);
        zzI(zzz6h);
        this.zzZFF.zzZ7c();
        if (this.zzZFF.zzYTR().zzYSW().isEmpty() || (zzz6h instanceof zzZ68)) {
            return;
        }
        zzZ71 zzz71 = this.zzZFF;
        zzz71.zzU(zzz71.zzZ9(zzz6h.zzYSx()), this.zzZFF.zzYTR().zzYSW());
    }

    private static boolean zzZ(Cluster[] clusterArr, String str) {
        int length = str.length();
        int i = 0;
        for (Cluster cluster : clusterArr) {
            int codepointsLength = cluster.getCodepointsLength() + i;
            if (cluster.getCodepoints()[0] >= 65536) {
                cluster.getCodepointsLength();
                codepointsLength++;
            }
            i = codepointsLength;
            if (length < i) {
                return false;
            }
        }
        return length == i;
    }

    public final void zzY(zzZ6B zzz6b) throws Exception {
        boolean z;
        int iZzYRG;
        if (zzz6b.zzYRF()) {
            z = false;
        } else {
            if (this.zzYgG.zzZ2c() && ((iZzYRG = zzz6b.zzYRG()) == 0 || iZzYRG == 1 || iZzYRG == 3 || iZzYRG == 4 || iZzYRG == 10)) {
                zzYR3();
                zzT(zzz6b);
                zzQ(zzz6b);
            }
            z = zzz6b.zz14().zzYol() || !this.zzZFF.zzYTR().zzYTc();
            if (zzz6b.getStoryType() != 5 && z) {
                return;
            }
        }
        zzYR3();
        this.zzZFF.zzU(zzz6b.getFont().getShading());
        switch (zzz6b.zzYRG()) {
            case 0:
                zzZ(zzz6b, ((zzYAS) zzz6b.zzYgm).zzY6N().zzZUF() != 0, z);
                break;
            case 1:
                zzY(zzz6b, ".....Page Break.....", z);
                break;
            case 2:
                zzY(zzz6b, ".....Column Break.....", z);
                break;
            case 3:
            case 10:
                zzZ(zzz6b, "¶", z);
                break;
            case 4:
                zzZ(zzz6b, "¤", z);
                break;
            case 5:
                zzY(zzz6b, ":::::Section Break (Next Page):::::", z);
                break;
            case 6:
                zzY(zzz6b, ":::::Section Break (Continuous):::::", z);
                break;
            case 7:
                zzY(zzz6b, ":::::Section Break (Even Page):::::", z);
                break;
            case 8:
                zzY(zzz6b, ":::::Section Break (Odd Page):::::", z);
                break;
            case 9:
                zzY(zzz6b, ":::::End of Section:::::", z);
                break;
            default:
                throw new IllegalStateException("Unknown end of line type.");
        }
        this.zzZFF.zzZ7c();
    }

    private void zzZ(zzZ6H zzz6h, long j, String str, com.aspose.words.internal.zzP9 zzp9, Cluster[] clusterArr) throws Exception {
        com.aspose.words.internal.zzPV zzpvZzO = zzO(zzz6h);
        zzZ(zzz6h, zzpvZzO, zzpvZzO, j, zzz6h.zzYRY().zzPg() * 0.042f, str, zzp9, null, clusterArr);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private com.aspose.words.internal.zzZU zzZ(zzZ6H zzz6h, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2, long j, float f, String str, com.aspose.words.internal.zzP9 zzp9, zz0R zz0r, Cluster[] clusterArr) throws Exception {
        zzZ5G zzz5g;
        com.aspose.words.internal.zzZU zzzu;
        com.aspose.words.internal.zzZU zzzu2;
        com.aspose.words.internal.zzZU zzzu3 = new com.aspose.words.internal.zzZU(zzz6h.zzYRY(), zzpv, zzpv2, C22243OooO0Oo.OooO00o(f, Float.intBitsToFloat((int) j) + f, j), str, com.aspose.words.internal.zzZPW.zzG(zzz6h.zzYRX(), (zzz6h.getFont().getSubscript() || zzz6h.getFont().getSuperscript()) ? zzz6h.getFont().zzZ7i() : zzz6h.getHeight()), (float) zzz6h.zzYRP(), zzz6h.zz14().zzZSu(), clusterArr);
        if (zzp9 != null) {
            zzzu3.zzW(zzp9);
            zzzu3.zzZO().lock();
        }
        if (zz0r != null) {
            com.aspose.words.internal.zzZL zzzlZzZ = zz0r.zzZ(zzzu3, zz0r.zzZt2() ? zzr(zzz6h.zz14()) : Float.NaN, zz0r.zzZt2() ? zzq(zzz6h.zz14()) : Float.NaN);
            com.aspose.words.internal.zzZU zzzu4 = (com.aspose.words.internal.zzZU) com.aspose.words.internal.zzZKW.zzZ(zzzlZzZ, com.aspose.words.internal.zzZU.class);
            com.aspose.words.internal.zzZU zzzuZzK = zzzu4;
            if (zzzu4 == null) {
                zzzuZzK = zzK((com.aspose.words.internal.zz7) zzzlZzZ);
            }
            zzz5g = this;
            zzzu = zzzuZzK;
            zzzu2 = zzzlZzZ;
        } else {
            zzz5g = this;
            zzzu = zzzu3;
            zzzu2 = zzzu3;
        }
        zzz5g.zzZFF.zzS(zzzu2);
        return zzzu;
    }

    private void zzZ(zzZ6H zzz6h, String str, com.aspose.words.internal.zzPM zzpm) throws Exception {
        long jZz6 = zzpm.zz6(str);
        com.aspose.words.internal.zzZU zzzu = new com.aspose.words.internal.zzZU(zzpm, com.aspose.words.internal.zzPV.zzKa, com.aspose.words.internal.zzPV.zzHZ, this.zzZFF.zzXB(com.aspose.words.internal.zzZPY.zzG(((zzz6h.zzYRX() - Float.intBitsToFloat((int) jZz6)) / 2.0f) + Float.intBitsToFloat((int) zzz6h.zzZT()), com.aspose.words.internal.zzZPY.zzYC(zzz6h.zzZT()))), str, jZz6, 0.0f);
        zzzu.zzZ(zzN(zzz6h));
        this.zzZFF.zzS(zzzu);
    }

    public final void zzY(zzZ6G zzz6g) throws Exception {
        zzYR3();
        if (zzz6g.zzW(this.zzZFF.zzYTR())) {
            this.zzZFF.zzS(new com.aspose.words.internal.zzI(this.zzZFF.zzXB(zzz6g.zzZT()), zzz6g.getName()));
        }
    }

    private static com.aspose.words.internal.zzPV zzX(zzZ6H zzz6h, com.aspose.words.internal.zzPV zzpv) {
        Font font = zzz6h.getFont();
        com.aspose.words.internal.zzPV zzpv2 = com.aspose.words.internal.zzPV.zzHZ;
        if (!font.getOutline()) {
            return zzpv;
        }
        if (!font.getShadow()) {
            return zzpv2;
        }
        com.aspose.words.internal.zzPV zzpvZzP = zzP(zzz6h);
        return zzpvZzP.isEmpty() ? com.aspose.words.internal.zzPV.zzI5 : zzpvZzP;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzY(zzZ6C zzz6c) throws Exception {
        com.aspose.words.internal.zzZV zzzc;
        zzK(zzz6c);
        long jZzZT = zzz6c.zzZT();
        String name = zzz6c.getName();
        this.zzZFF.zzU(zzz6c.getFont().getShading());
        com.aspose.words.internal.zzPV zzpvZz7 = this.zzZFF.zz7(((zzYAU) zzz6c.zzYgm).zzY6N().zzZy());
        this.zzZFF.zzZ7c();
        com.aspose.words.internal.zzPV zzpvZzZ7k = zzz6c.getFont().zzZ7k();
        int iZzYRH = zzz6c.zzYRH();
        if (iZzYRH == 0) {
            long size = zzz6c.getSize();
            com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzZT), com.aspose.words.internal.zzZPY.zzYC(jZzZT) - com.aspose.words.internal.zzZPW.zzYz(size)), size);
            if (com.aspose.words.internal.zzZYD.zzXk(zzz6c.zzYQ())) {
                zzzc = new com.aspose.words.internal.zzZB(name, zzzq4, zzz6c.zzYQ(), zzz6c.zzYR(), zzpvZz7, zzz6c.getMaxLength());
            } else {
                zzzc = new com.aspose.words.internal.zzZC(name, zzzq4, zzz6c.zzYRY(), com.aspose.words.internal.zzZPW.zzYz(size), zzz6c.zzYS(), zzz6c.zzYR(), zzpvZz7, zzz6c.getMaxLength());
            }
        } else if (iZzYRH == 1) {
            float fZzYz = com.aspose.words.internal.zzZPW.zzYz(zzz6c.getSize());
            com.aspose.words.internal.zzC zzc = new com.aspose.words.internal.zzC(new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) jZzZT), com.aspose.words.internal.zzZPY.zzYC(jZzZT) - fZzYz, fZzYz, fZzYz), name, zzpvZz7, zzpvZzZ7k, com.aspose.words.internal.zzZPY.zzG(zzz6c.zzZm(), zzz6c.zzZo()));
            zzc.zzO(zzz6c.isChecked());
            zzzc = zzc;
        } else if (iZzYRH == 2) {
            int selectedIndex = zzz6c.getSelectedIndex();
            ArrayList<String> arrayListZzZA = zzz6c.zzZA();
            if (arrayListZzZA.size() <= 0) {
                com.aspose.words.internal.zzZQG.zzZ(arrayListZzZA, " ");
            }
            if (selectedIndex < 0 || selectedIndex >= arrayListZzZA.size()) {
                selectedIndex = 0;
            }
            zzzc = new com.aspose.words.internal.zz9(new com.aspose.words.internal.zzZQ4(jZzZT, com.aspose.words.internal.zzZPX.zzYA(0L)), name, arrayListZzZA, selectedIndex, zzpvZz7, zzpvZzZ7k, zzz6c.zzYRY(), com.aspose.words.internal.zzZPY.zzG(zzz6c.zzZm(), zzz6c.zzZo()), zzz6c.zz14().zzZSu());
        } else {
            throw new IllegalStateException("Unknown form field type.");
        }
        com.aspose.words.internal.zzZV zzzv = zzzc;
        zzzv.zzN(zzz6c.isEnabled());
        this.zzZFF.zzS(zzzv);
    }

    private void zzX(zzZ6H zzz6h, long j, String str, com.aspose.words.internal.zzP9 zzp9, Cluster[] clusterArr) throws Exception {
        if (zzz6h.zz14().zzY6N().zzYKL().zzYKj()) {
            return;
        }
        if (!zzz6h.getFont().getEmboss() && !zzz6h.getFont().getEngrave()) {
            if (zzz6h.getFont().getShadow()) {
                zzZ(zzz6h, j, str, zzp9, clusterArr);
                return;
            }
            return;
        }
        zzY(zzz6h, j, str, zzp9, clusterArr);
    }

    private void zzZ(zzZ6H zzz6h, String str, boolean z) throws Exception {
        com.aspose.words.internal.zzPM zzpmZzYRY;
        zzZ5G zzz5g;
        zzZ6H zzz6h2;
        String str2;
        if (com.aspose.words.internal.zzJF.zzZK(zzz6h.getFont().getName())) {
            zzpmZzYRY = this.zzYSF.zzY("Times New Roman", (float) zzz6h.getFont().getSize(), zzz6h.getFont().zzza());
        } else {
            zzpmZzYRY = zzz6h.zzYRY();
        }
        com.aspose.words.internal.zzPM zzpm = zzpmZzYRY;
        if (z) {
            zzz5g = this;
            zzz6h2 = zzz6h;
            str2 = str;
        } else {
            zzX(zzz6h, this.zzZFF.zzXB(zzz6h.zzZT()), str, null, null);
            zzz5g = this;
            zzz6h2 = zzz6h;
            str2 = str;
        }
        com.aspose.words.internal.zzPV zzpvZz7 = zzz5g.zzZFF.zz7(zzz6h2.getFont().zz8Q());
        zzz5g.zzZ(zzz6h2, str2, zzpm, zzX(zzz6h2, zzpvZz7), zzW(zzz6h2, zzpvZz7), zzz6h2.zz14().zzYRr(), z);
    }

    private void zzX(zzZ65 zzz65) throws Exception {
        char cZzxM = zzxM(zzz65.getLeader());
        if (cZzxM == 0) {
            return;
        }
        int iZzZXS = zzz65.zz14().zzZXS();
        int iZzY5 = zzz65.zzYRY().zzY5(cZzxM);
        int iZzVH = zzz65.zz14().zzVH(iZzY5, 1);
        zzYAU zzyauZz14 = zzz65.zz14();
        if (iZzVH == 0) {
            zzz65.zz14().zzY7f();
            zzyauZz14 = zzYAB.zzZ(12803, null, 0, null);
            zzZ32 zzz32ZzX = zzZ32.zzX(zzz65.zz14().zzY6N());
            zzz32ZzX.setSpacing((int) (zzz65.zz14().getScaledWidth(iZzY5) * (-0.75f)));
            zzz32ZzX.setSnapToGrid(false);
            zzyauZz14.zzU(zzZ32.zzW(zzz32ZzX));
            zzyauZz14.zzY(zzz65.zz14().zzZZJ());
            zzyauZz14.zzYPO();
            iZzVH = zzyauZz14.zzVH(iZzY5, 1);
        }
        zzZ64 zzz64 = new zzZ64(zzyauZz14, com.aspose.words.internal.zzZKN.zzS(cZzxM, iZzZXS / iZzVH));
        zzz64.zzY(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) zzz65.zzZT()) + ((iZzZXS % iZzVH) / 1000.0f), com.aspose.words.internal.zzZPY.zzYC(zzz65.zzZT())));
        zzR(zzz64);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void zzZ(zzZ6H zzz6h, String str, com.aspose.words.internal.zzPM zzpm, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2, zz0R zz0r, boolean z) throws Exception {
        com.aspose.words.internal.zzZU zzzu = new com.aspose.words.internal.zzZU(zzpm, zzpv, zzpv2, this.zzZFF.zzXB(zzz6h.zzZT()), str, zzpm.zz6(str), 0.0f, false, null, z);
        zzZ71 zzz71 = this.zzZFF;
        com.aspose.words.internal.zzZU zzzuZzG = zzzu;
        zzzuZzG = zzzu;
        if (zz0r != null && !z) {
            zzzuZzG = zz0r.zzG(zzzu);
        }
        zzz71.zzS(zzzuZzG);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void zzZ(zzZ6H zzz6h, float f) throws Exception {
        long jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) zzz6h.zzZT()), f);
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) zzz6h.zzZT()) + zzz6h.zzYRR(), f);
        float fZzZ7i = zzz6h.getFont().zzZ7i() * 0.05f;
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(this.zzZFF.zzXB(jZzG), this.zzZFF.zzXB(jZzG2));
        zzzgZzZ.zzX(new com.aspose.words.internal.zzOU(this.zzZFF.zz7(zzz6h.getFont().zz8Q()), fZzZ7i));
        com.aspose.words.internal.zzZG zzzgZzx = zzzgZzZ;
        if (zzz6h.zz14().zzY6N().zzYKL().zzYKj()) {
            zzzgZzx = zzz6h.zz14().zzYRr().zzx(zzzgZzZ);
        }
        zzZ68 zzz68 = (zzZ68) com.aspose.words.internal.zzZKW.zzZ(zzz6h, zzZ68.class);
        if (zzz68 != null && zzz68.zzYRz() && zzz68.zzYRB()) {
            if (this.zzZFw == null) {
                this.zzZFw = new ArrayList<>();
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) this.zzZFw, zzzgZzx);
            return;
        }
        this.zzZFF.zzS(zzzgZzx);
    }

    private void zzX(zzZ6H zzz6h, boolean z) throws Exception {
        zzM(zzz6h);
        if (z) {
            this.zzZFF.zzU(zzz6h.getFont().getShading());
        }
        zzL(zzz6h);
        zzK(zzz6h);
    }

    private com.aspose.words.internal.zz7 zzZ(zzZ68 zzz68, com.aspose.words.internal.zzZL zzzl) throws Exception {
        zzZD9 zzzd9ZzY = this.zzYgG.zzY(zzz68);
        com.aspose.words.internal.zz7 zz7VarZzbH = zzzd9ZzY.zzbH();
        zz7VarZzbH.zzX(zzzl);
        this.zzYgG.zzZ(zzzl, zzzd9ZzY);
        return zz7VarZzbH;
    }

    public final void zzY(zzZ6D zzz6d) throws Exception {
        zzYR3();
        zzT(zzz6d);
        zzX((zzZ6H) zzz6d, true);
        long jZzXB = this.zzZFF.zzXB(com.aspose.words.internal.zzZPY.zzG(zzz6d.zzZm(), ((zzz6d.zz14().getBaseline() + zzz6d.zz14().zzYjL()) / 1000.0f) - zzz6d.getWidth()));
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) jZzXB) + 1.1f, com.aspose.words.internal.zzZPY.zzYC(jZzXB) + 1.1f, zzz6d.getWidth() - 2.2f, zzz6d.getWidth() - 2.2f);
        this.zzZFF.zzU(zzz6d.getFont().getShading());
        com.aspose.words.internal.zzPV zzpvZz7 = this.zzZFF.zz7(((zzYAL) zzz6d.zzYgm).zzY6N().zzZy());
        this.zzZFF.zzZ7c();
        this.zzZFF.zzS(com.aspose.words.internal.zzZG.zzZ(zzzq4, new com.aspose.words.internal.zzOU(zzpvZz7, 0.7f)));
        if (zzz6d.isChecked()) {
            com.aspose.words.internal.zzOU zzou = new com.aspose.words.internal.zzOU(zzpvZz7, 0.5f);
            com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(zzzq4.zzZE(), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()));
            zzzgZzZ.zzX(zzou);
            this.zzZFF.zzS(zzzgZzZ);
            com.aspose.words.internal.zzZG zzzgZzZ2 = com.aspose.words.internal.zzZG.zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn()));
            zzzgZzZ2.zzX(zzou);
            this.zzZFF.zzS(zzzgZzZ2);
        }
        zzW((zzZ6H) zzz6d, false);
    }

    private void zzZ(zzZ6H zzz6h, long j, com.aspose.words.internal.zzP9 zzp9, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) throws Exception {
        float fIntBitsToFloat = Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) zzz6h.zzZT());
        ArrayList<zzZ6H> arrayListZzYRK = zzz6h.zzYRK();
        if (this.zzYeo && zzz6h.zzYS0()) {
            Collections.reverse(arrayListZzYRK);
        }
        for (zzZ6H zzz6h2 : arrayListZzYRK) {
            zzY(zzz6h2, com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) zzz6h2.zzZT()) + fIntBitsToFloat, com.aspose.words.internal.zzZPY.zzYC(j)), zzp9, zzpv, zzpv2);
        }
    }

    private void zzZ(zzZ6H zzz6h, boolean z, boolean z2) throws Exception {
        zzZ(zzz6h, z ? "\uf02a" : "\uf038", this.zzYSF.zzY("Wingdings 3", 12.0f, 0), com.aspose.words.internal.zzPV.zzKa, com.aspose.words.internal.zzPV.zzHZ, null, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzY(zzZ6H zzz6h, long j, com.aspose.words.internal.zzP9 zzp9, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) throws Exception {
        Cluster[] clusterArrZzO;
        Cluster[] clusterArr;
        zzZ5G zzz5g;
        zzZ6H zzz6h2;
        long j2;
        com.aspose.words.internal.zzP9 zzp92;
        if (zzz6h.zzYRL()) {
            String text = zzz6h.getText();
            boolean z = !this.zzYeo && zzz6h.zzYS0();
            if (this.zzZFF.zzYTR().zzYSN() && zzz6h.zz14().zzY6g() && !zzJl(zzz6h.getText())) {
                clusterArrZzO = zzz6h.zz14().zzYof().zzO(zzz6h.zz14());
                if (!zzZ(clusterArrZzO, text)) {
                    text = Cluster.getString(clusterArrZzO);
                }
                if (clusterArrZzO.length > 1 && z) {
                    int length = clusterArrZzO.length;
                    Cluster[] clusterArr2 = new Cluster[length];
                    System.arraycopy(clusterArrZzO, 0, clusterArr2, 0, clusterArrZzO.length);
                    com.aspose.words.internal.zzZKV.zzZ(clusterArr2, length);
                    clusterArrZzO = clusterArr2;
                }
            } else {
                clusterArrZzO = null;
            }
            String strZzJk = zzJk(text);
            if (strZzJk.length() > 1 && z) {
                strZzJk = com.aspose.words.internal.zzZYD.zzX9(strZzJk);
            }
            String str = strZzJk;
            if (zzz6h.zz14().zzYRO()) {
                Cluster[] clusterArrZzZ = clusterArrZzO != null ? clusterArrZzO : zzz6h.zz14().zzY6N().zzZr().zzZ(str, 0.0f);
                boolean zZzY = zzY(clusterArrZzZ, zzz6h.zz14().zzY6N().zzZr().zzPh());
                if (clusterArrZzO == null && zZzY) {
                    clusterArr = clusterArrZzZ;
                    zzz5g = this;
                    j2 = j;
                    zzp92 = zzp9;
                    zzz6h2 = zzz6h;
                }
            } else {
                clusterArr = clusterArrZzO;
                zzz5g = this;
                zzz6h2 = zzz6h;
                j2 = j;
                zzp92 = zzp9;
            }
            zzz5g.zzX(zzz6h2, j2, str, zzp92, clusterArr);
            com.aspose.words.internal.zzZU zzzuZzZ = zzZ(zzz6h, zzpv, zzpv2, j, 0.0f, str, zzp9, zzz6h.zz14().zzYRr(), clusterArr);
            zzzuZzZ.zzZ(zzN(zzz6h));
            zzYCO zzycoZzZ = zz5.zzZ(zzz6h.zz14(), zzzuZzZ.zzZm(), Float.intBitsToFloat((int) zzzuZzZ.getSize()));
            if (zzycoZzZ.getLength() > 0.0f) {
                zzzuZzZ.zzZ(com.aspose.words.internal.zzP8.zzM(new com.aspose.words.internal.zzZQ4(zzycoZzZ.zzYbM(), zzzuZzZ.zzZo(), zzycoZzZ.getLength(), com.aspose.words.internal.zzZPW.zzYz(zzzuZzZ.getSize()))));
            }
            if (zzz6h.zz6c()) {
                zzzuZzZ.zzZi();
            }
        }
    }

    private static boolean zzY(Cluster[] clusterArr, String str) {
        boolean z = false;
        for (Cluster cluster : clusterArr) {
            for (int i = 0; i < cluster.getCodepoints().length; i++) {
                int iZzH = zzXJ.zzH(cluster.getCodepoints()[i], str);
                if (iZzH != 0) {
                    cluster.getCodepoints()[i] = iZzH;
                    z = true;
                }
            }
        }
        return z;
    }

    private void zzY(zzZ6H zzz6h, long j, String str, com.aspose.words.internal.zzP9 zzp9, Cluster[] clusterArr) throws Exception {
        com.aspose.words.internal.zzPV zzpv;
        com.aspose.words.internal.zzPV zzpvZzP = zzP(zzz6h);
        if (zzpvZzP.isEmpty()) {
            zzpvZzP = com.aspose.words.internal.zzPV.zzI5;
        }
        com.aspose.words.internal.zzPV zzpvZz0 = zz0(zzpvZzP);
        com.aspose.words.internal.zzPV zzpvZzZZ = zzZZ(zzpvZzP);
        if (zzz6h.getFont().getEngrave()) {
            zzpv = zzpvZz0;
            zzpvZz0 = zzpvZzZZ;
        } else {
            zzpv = zzpvZzZZ;
        }
        zzZ(zzz6h, zzpvZz0, zzW(zzz6h, zzpvZz0), j, 0.8f, str, zzp9, null, clusterArr);
        zzZ(zzz6h, zzpv, zzW(zzz6h, zzpv), j, -0.8f, str, zzp9, null, clusterArr);
    }

    private void zzY(zzZ6H zzz6h, String str, boolean z) throws Exception {
        zzZ(zzz6h, str, this.zzYSF.zzY("Arial", 8.0f, 0), com.aspose.words.internal.zzPV.zzKa, com.aspose.words.internal.zzPV.zzHZ, null, z);
    }
}
