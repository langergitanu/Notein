package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKN {
    private com.aspose.words.internal.zzD4 zzYtD = new com.aspose.words.internal.zzD4();

    public final void invalidate() {
        this.zzYtD.clear();
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
    public final boolean zzU(Inline inline) {
        int iHashCode = inline.hashCode();
        if (this.zzYtD.zzVE(iHashCode)) {
            return com.aspose.words.internal.zzZQB.zzRr(this.zzYtD.get(iHashCode));
        }
        boolean zZzYUU = inline.zzYUU();
        this.zzYtD.add(iHashCode, zZzYUU ? 1 : 0);
        return zZzYUU;
    }
}
