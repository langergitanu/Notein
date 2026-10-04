package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class zz5Z extends zz6 {
    private zz5X zzkZ;
    private zz61 zzl0;
    private zz6C zzll;
    private zz62 zzlr;
    private zz69 zzls;

    public zz5Z(zzZOP zzzop, zz62 zz62Var) throws Exception {
        this.zzlr = zz62Var;
        zzZ(zzzop, zz62Var);
    }

    private void zzB(zzP9 zzp9) throws Exception {
        if (zzp9 == null || zzp9.isIdentity() || zzp9.zzOp()) {
            return;
        }
        float[] fArrZzOs = zzp9.zzOs();
        this.zzls.zzO(fArrZzOs[0], fArrZzOs[1]);
        this.zzls.zzK((byte) -92);
        this.zzls.zzM((byte) 101);
        this.zzls.zzO(fArrZzOs[2], 0.0f);
        this.zzls.zzK((byte) -91);
        this.zzls.zzM((byte) 102);
        this.zzls.zz9(-fArrZzOs[3]);
        this.zzls.zzK((byte) -95);
        this.zzls.zzM((byte) 100);
    }

    private void zzC(zzP8 zzp8) throws Exception {
        this.zzls.zzM((byte) -123);
        zzp8.zzY(this.zzl0);
        this.zzls.zzL((byte) 0);
        this.zzls.zzK((byte) 83);
        this.zzls.zzM((byte) 98);
        this.zzls.zzM((byte) -123);
    }

    private void zzG3() throws Exception {
        this.zzls.zzP((short) 1);
        this.zzls.zzK(PatternStyle.Horizontal);
        this.zzls.zzM((byte) 68);
        this.zzls.zzM((byte) 73);
    }

    private void zzKF() throws Exception {
        this.zzls.writeByte((byte) 27);
        this.zzls.write("%-12345X");
        this.zzls.write("@PJL ENTER LANGUAGE = PCLXL");
        this.zzls.writeByte((byte) 13);
        this.zzls.writeByte((byte) 10);
        this.zzls.writeStreamHeader();
    }

    private void zzV(zzZH zzzh) throws Exception {
        int iZzX = zz6B.zzX(zzSA.zzr(Float.intBitsToFloat((int) zzzh.getSize())), zzSA.zzr(zzZPW.zzYz(zzzh.getSize())), zzzh.zzZ3());
        if (iZzX != 19) {
            this.zzls.zzL((byte) iZzX);
            this.zzls.zzK((byte) 37);
            return;
        }
        float fIntBitsToFloat = (float) (((double) Float.intBitsToFloat((int) zzzh.getSize())) / 2.834645669291339d);
        float fZzYz = (float) (((double) zzZPW.zzYz(zzzh.getSize())) / 2.834645669291339d);
        if (zzzh.zzZ3()) {
            this.zzls.zzO(fZzYz, fIntBitsToFloat);
        } else {
            this.zzls.zzO(fIntBitsToFloat, fZzYz);
        }
        this.zzls.zzK(PatternStyle.Shingle);
        this.zzls.zzL((byte) 1);
        this.zzls.zzK(PatternStyle.Wave);
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
    private void zzW(zzZH zzzh) throws Exception {
        this.zzls.zzL((byte) 0);
        this.zzls.zzK((byte) -120);
        this.zzls.zzL((byte) 1);
        this.zzls.zzK((byte) -126);
        this.zzls.zzM((byte) 72);
        this.zzls.zzL(zzzh.zzZ3() ? (byte) 1 : (byte) 0);
        this.zzls.zzK((byte) 40);
        zzV(zzzh);
        this.zzls.zzL((byte) 0);
        this.zzls.zzK(PatternStyle.DownwardDiagonal);
        this.zzls.zzL((byte) zzzh.getPaperTray());
        this.zzls.zzK((byte) 38);
        this.zzls.zzM((byte) 67);
        this.zzls.zzY((short) 0, (short) 0);
        this.zzls.zzK(PatternStyle.Plaid);
        this.zzls.zzM((byte) 117);
        this.zzls.zzO(8.333333f, 8.333333f);
        this.zzls.zzK(PatternStyle.Sphere);
        this.zzls.zzM((byte) 119);
    }

    private void zzn(long j) throws Exception {
        this.zzls.zzZb(j);
        this.zzls.zzK((byte) 76);
        this.zzls.zzM((byte) 107);
    }

    private void zzwt() throws Exception {
        this.zzls.zzM((byte) 66);
        this.zzls.writeByte((byte) 27);
        this.zzls.write("%-12345X");
    }

    private void zzwu() throws Exception {
        this.zzls.zzL((byte) 0);
        this.zzls.zzK((byte) -122);
        this.zzls.zzY((short) 600, (short) 600);
        this.zzls.zzK((byte) -119);
        this.zzls.zzL((byte) 2);
        this.zzls.zzK((byte) -113);
        this.zzls.zzM((byte) 65);
    }

    public final void endDocument() throws Exception {
        zzwt();
    }

    public final void zzO(zzZL zzzl) throws Exception {
        zz60.zzZ(zzzl, this.zzlr).zzZ(this);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzZH zzzh) throws Exception {
        zzG3();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZH zzzh) throws Exception {
        zzW(zzzh);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) throws Exception {
        zzY(zzg, false);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        zzZ((zzHU) zzg, false);
    }

    private void zzY(zzHU zzhu, boolean z) throws Exception {
        if (z || zzZT.zzW(zzhu)) {
            this.zzls.zzM((byte) 96);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        zzZ((zzHU) zzzg, true);
        this.zzls.zzL((byte) 2);
        this.zzls.zzK((byte) 3);
        this.zzls.zzM((byte) 106);
        if (zzZT.zzU(zzzg)) {
            zzC(zzzg.zzZN());
        }
        zzZQ4 zzzq4ZzS = zz6E.zzK(zzzg) ? zzP6.zzS(zzzg.zzZ0()) : zzZQ4.zz2T;
        this.zzll.zzwK().zzV(zzzg.zzZ1(), zzzq4ZzS);
        this.zzll.zzwK().zzY(zzzg.zzZ2(), zzzq4ZzS);
        zzzg.zzZ0().zzY(this.zzl0);
        this.zzls.zzM((byte) -122);
        zzY(zzzg, true);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        zzn(zzzp.zzZT());
        zz66 zz66VarZzT = this.zzll.zzwI().zzT(zzzp);
        zz66VarZzT.zzY(this.zzls);
        zz66VarZzT.zzX(this.zzls);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzzu.isHidden()) {
            return;
        }
        zzZ((zzHU) zzzu, false);
        zzB(zzzu.zzZO());
        this.zzkZ.zzL(zzzu);
        zzY(zzzu, false);
    }

    private void zzZ(zzZOP zzzop, zz62 zz62Var) throws Exception {
        if (zzzop != null) {
            zz69 zz69Var = new zz69(zzzop);
            this.zzls = zz69Var;
            zz6C zz6c = new zz6C(zz69Var, zz62Var);
            this.zzll = zz6c;
            this.zzl0 = new zz61(zz6c);
            this.zzkZ = new zz5X(this.zzll);
            zzKF();
            zzwu();
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
    }

    private void zzZ(zzHU zzhu, boolean z) throws Exception {
        if (z || zzZT.zzW(zzhu)) {
            this.zzls.zzM((byte) 97);
            if (zzZT.zzU(zzhu)) {
                zzC(zzhu.zzZN());
            }
        }
    }
}
