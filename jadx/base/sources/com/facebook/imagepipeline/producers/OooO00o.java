package com.facebook.imagepipeline.producers;

import o00oo.C25638OooO0oO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o implements InterfaceC22291OoooO0O<C25638OooO0oO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC22291OoooO0O<C25638OooO0oO> f67280OooO00o;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C19102OooO00o extends OooOOOO<C25638OooO0oO, C25638OooO0oO> {
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
        @Override // com.facebook.imagepipeline.producers.OooO0O0
        public final void OooO0oo(int i, Object obj) {
            C25638OooO0oO c25638OooO0oO = (C25638OooO0oO) obj;
            OooO<O> oooO = this.f67330OooO0O0;
            if (c25638OooO0oO == null) {
                oooO.OooO00o(i, null);
                return;
            }
            if (!C25638OooO0oO.Oooo00o(c25638OooO0oO)) {
                c25638OooO0oO.Oooo000();
            }
            oooO.OooO00o(i, c25638OooO0oO);
        }
    }

    public OooO00o(InterfaceC22291OoooO0O<C25638OooO0oO> interfaceC22291OoooO0O) {
        this.f67280OooO00o = interfaceC22291OoooO0O;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<C25638OooO0oO> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        this.f67280OooO00o.OooO00o(new C19102OooO00o(oooO), interfaceC22288OoooO);
    }
}
