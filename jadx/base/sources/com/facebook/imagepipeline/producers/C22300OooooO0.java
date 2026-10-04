package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22300OooooO0<T> implements InterfaceC22291OoooO0O<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC22291OoooO0O<T> f67454OooO00o;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooooO0$OooO00o */
    public class OooO00o extends OooOOOO<T, Void> {
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
            if (OooO0O0.OooO0Oo(i)) {
                this.f67330OooO0O0.OooO00o(i, null);
            }
        }
    }

    public C22300OooooO0(InterfaceC22291OoooO0O<T> interfaceC22291OoooO0O) {
        this.f67454OooO00o = interfaceC22291OoooO0O;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<Void> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        this.f67454OooO00o.OooO00o(new OooO00o(oooO), interfaceC22288OoooO);
    }
}
