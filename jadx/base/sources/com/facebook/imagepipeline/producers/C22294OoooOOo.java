package com.facebook.imagepipeline.producers;

import o00o0o.AbstractC25434OooO00o;
import o00o0o0o.InterfaceC25449OooO0oO;
import o00oo.C25638OooO0oO;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22294OoooOOo implements InterfaceC22291OoooO0O<AbstractC25434OooO00o<InterfaceC25449OooO0oO>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC22291OoooO0O<C25638OooO0oO> f67434OooO00o;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooOOo$OooO00o */
    public final class OooO00o extends OooOOOO<C25638OooO0oO, AbstractC25434OooO00o<InterfaceC25449OooO0oO>> {
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
            AbstractC25434OooO00o abstractC25434OooO00oOooOOO0 = null;
            try {
                if (C25638OooO0oO.Oooo0OO(c25638OooO0oO) && c25638OooO0oO != null) {
                    abstractC25434OooO00oOooOOO0 = AbstractC25434OooO00o.OooOOO0(c25638OooO0oO.f87502OooOo0o);
                }
                this.f67330OooO0O0.OooO00o(i, abstractC25434OooO00oOooOOO0);
            } finally {
                AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooOOO0);
            }
        }
    }

    public C22294OoooOOo(InterfaceC22291OoooO0O<C25638OooO0oO> interfaceC22291OoooO0O) {
        this.f67434OooO00o = interfaceC22291OoooO0O;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<AbstractC25434OooO00o<InterfaceC25449OooO0oO>> consumer, InterfaceC22288OoooO context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(consumer, "consumer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        this.f67434OooO00o.OooO00o(new OooO00o(consumer), context);
    }
}
