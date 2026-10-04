package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzUY {
    private zzUZ zzZvp;
    private zzYBK zzZvy;
    private int zzZvz;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean zz00() throws Exception {
        boolean z = false;
        if (this.zzZvp.zz04()) {
            return false;
        }
        zzUZ zzuzZzYm = this.zzZvp.zzYm(false);
        zzYBK zzybk = this.zzZvy;
        zzUZ zzuz = this.zzZvp;
        boolean zZzO = zzO(zzuzZzYm) | zzybk.zzZ((zzYBL) zzuz, this.zzZvz, zzuz.zz0m(), false);
        if (this.zzZvp.isActive()) {
            zzUZ zzuz2 = this.zzZvp;
            if (zzYI9.zzY(zzuz2, zzuz2.zz0m())) {
                z = true;
            }
        }
        return zZzO | z;
    }

    private boolean zzO(zzUZ zzuz) throws Exception {
        if (zzuz == null) {
            return false;
        }
        zzuz.isActive();
        if (!zzuz.zza7().zzZYM()) {
            return false;
        }
        if (!this.zzZvp.isActive() || this.zzZvp.isEmpty()) {
            if (!this.zzZvp.zzY8m()) {
                return false;
            }
            zzYIA zzyia = (zzYIA) com.aspose.words.internal.zzZKW.zzZ((zzTC) (!this.zzZvp.isActive() ? zzuz.zzYn(false) : (zzUZ) this.zzZvp.zzYo1()).zz6x(), zzYIA.class);
            if (zzyia == null || !zzyia.zzYjB()) {
                return false;
            }
            zzyia.zzRr(true);
            return true;
        }
        zzYIA zzyia2 = (zzYIA) com.aspose.words.internal.zzZKW.zzZ((zzTC) this.zzZvp.zz6x(), zzYIA.class);
        if (zzyia2 == null || !zzyia2.zzYjA() || zzyia2.zz0t() + ((zzY6N) ((zzYIC) zzyia2.zza9()).zza9()).zzXYi() > this.zzZvz || zzyia2 == ((zzTC) this.zzZvp.zz6w())) {
            return false;
        }
        zzyia2.zzRr(false);
        return true;
    }

    private boolean zzW(zzUZ zzuz, int i) throws Exception {
        this.zzZvp = zzuz;
        if (zzuz != null) {
            zzuz.isActive();
        }
        this.zzZvz = i;
        this.zzZvy = new zzYBK();
        if (zz00()) {
            return true;
        }
        if (!this.zzZvp.isActive()) {
            return false;
        }
        if (zzZZZ()) {
            return true;
        }
        if (!this.zzZvp.isEmpty() || this.zzZvp.zz09() != null || this.zzZvp.zz08() != null) {
            this.zzZvp.isActive();
            this.zzZvp.zz0u();
            this.zzZvp.zzYU(true);
            this.zzZvp.zzZXO();
            return false;
        }
        if (!zzuz.zzY8m() || ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLt().length == 1) {
            this.zzZvp.remove();
        }
        if (this.zzZvp.isActive()) {
            this.zzZvp.zzYU(true);
        }
        return false;
    }

    private boolean zzZ(zzZMU zzzmu) throws Exception {
        if (this.zzZvp.isEmpty()) {
            return false;
        }
        boolean zZzZ = zzV0.zzZ(this.zzZvy, zzzmu, this.zzZvz);
        if (zZzZ && zzzmu.zzYzo() != null) {
            zzzmu.zzYzo().zzYU(false);
        }
        return zZzZ;
    }

    private void zzZZX() throws Exception {
        if (this.zzZvp.zz08() != null || ((zzZ2D) this.zzZvp.zza9()).zzYJ3()) {
            new zzZUD().zzZ(this.zzZvp.zzab().zzZoY().zzY(this.zzZvp, true), this.zzZvz, this.zzZvp.zz5Z() == null && this.zzZvp.zz5Y() == null && this.zzZvp.isEmpty() && (this.zzZvp.zz09() == null || this.zzZvp.zz09().isEmpty()), false);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private zzZMU zzZZY() throws Exception {
        if (((zzZ2D) this.zzZvp.zza9()).zzZrS() || this.zzZvp.zz09() != null) {
            zzZMU zzzmu = new zzZMU();
            zzzmu.zzZ(this.zzZvp.zzab().zzZoZ().zzY(this.zzZvp, true), this.zzZvz, true, false);
            if (this.zzZvp.zz09() == null) {
                return null;
            }
            return zzzmu;
        }
        if (this.zzZvp.zz0g() && this.zzZvp.zza9().zza7().zzYMP() && zzV0.zzU(this.zzZvp)) {
            zzYBK zzybk = this.zzZvy;
            zzUZ zzuz = this.zzZvp;
            zzybk.zzZ((zzYBL) zzuz, zzZMW.zzI(zzuz.zz0H()), this.zzZvp.zz0m(), false);
        }
        return null;
    }

    private boolean zzZZZ() throws Exception {
        if (this.zzZvp.zza8().zzYT2()) {
            return false;
        }
        this.zzZvp.zzYU(true);
        this.zzZvp.zzYj(true);
        zzZMU zzzmuZzZZY = zzZZY();
        if (zzzmuZzZZY != null && zzZ(zzzmuZzZZY)) {
            return true;
        }
        zzZZX();
        this.zzZvp.zzYj(false);
        return false;
    }

    public final boolean zzX(zzUZ zzuz, int i) throws Exception {
        zzYMD.zzr(zzuz);
        boolean zZzW = zzW(zzuz, i);
        zzuz.isActive();
        zzYMD.zzq(zzuz);
        return zZzW;
    }
}
