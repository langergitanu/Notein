package com.facebook.imagepipeline.producers;

import o00oo.C25638OooO0oO;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22263OooO0oo implements InterfaceC22291OoooO0O<C25638OooO0oO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C22297OoooOoo f67303OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C22304Oooooo0 f67304OooO0O0;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooO0oo$OooO00o */
    public class OooO00o extends OooOOOO<C25638OooO0oO, C25638OooO0oO> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC22288OoooO f67305OooO0OO;

        public OooO00o(OooO oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
            super(oooO);
            this.f67305OooO0OO = interfaceC22288OoooO;
        }

        @Override // com.facebook.imagepipeline.producers.OooOOOO, com.facebook.imagepipeline.producers.OooO0O0
        public final void OooO0oO(Throwable th) {
            C22263OooO0oo.this.f67304OooO0O0.OooO00o(this.f67330OooO0O0, this.f67305OooO0OO);
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
        @Override // com.facebook.imagepipeline.producers.OooO0O0
        public final void OooO0oo(int i, Object obj) {
            boolean zOooO0Oo;
            C25638OooO0oO c25638OooO0oO = (C25638OooO0oO) obj;
            InterfaceC22288OoooO interfaceC22288OoooO = this.f67305OooO0OO;
            C25763OooO00o c25763OooO00oOooOOoo = interfaceC22288OoooO.OooOOoo();
            boolean zOooO0Oo2 = OooO0O0.OooO0Oo(i);
            c25763OooO00oOooOOoo.getClass();
            if (c25638OooO0oO == null) {
                zOooO0Oo = false;
            } else {
                c25638OooO0oO.ooOO();
                int i2 = c25638OooO0oO.f87504OooOoO0;
                if (i2 == 90 || i2 == 270) {
                    c25638OooO0oO.ooOO();
                    int i3 = c25638OooO0oO.f87507OooOoo0;
                    c25638OooO0oO.ooOO();
                    zOooO0Oo = C22306Ooooooo.OooO0Oo(i3, c25638OooO0oO.f87505OooOoOO);
                } else {
                    c25638OooO0oO.ooOO();
                    int i4 = c25638OooO0oO.f87505OooOoOO;
                    c25638OooO0oO.ooOO();
                    zOooO0Oo = C22306Ooooooo.OooO0Oo(i4, c25638OooO0oO.f87507OooOoo0);
                }
            }
            OooO<O> oooO = this.f67330OooO0O0;
            if (c25638OooO0oO != null && zOooO0Oo) {
                if (zOooO0Oo2 && zOooO0Oo) {
                    oooO.OooO00o(i, c25638OooO0oO);
                } else {
                    oooO.OooO00o(i & (-2), c25638OooO0oO);
                }
            }
            if (!zOooO0Oo2 || zOooO0Oo || c25763OooO00oOooOOoo.OooO00o()) {
                return;
            }
            C25638OooO0oO.OooO0OO(c25638OooO0oO);
            C22263OooO0oo.this.f67304OooO0O0.OooO00o(oooO, interfaceC22288OoooO);
        }
    }

    public C22263OooO0oo(C22297OoooOoo c22297OoooOoo, C22304Oooooo0 c22304Oooooo0) {
        this.f67303OooO00o = c22297OoooOoo;
        this.f67304OooO0O0 = c22304Oooooo0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<C25638OooO0oO> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        this.f67303OooO00o.OooO00o(new OooO00o(oooO, interfaceC22288OoooO), interfaceC22288OoooO);
    }
}
