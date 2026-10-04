package com.facebook.imagepipeline.producers;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import o00o0OOO.C25401OooO0o;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0Ooo.C25428OooO0o;
import o00o0o.AbstractC25434OooO00o;
import o00oOoOo.C25623OooO0OO;
import o00oo.C25638OooO0oO;
import o00oo0O0.C25667OooOO0o;
import o00oo0O0.C25670OooOOOO;
import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22270OooOo0O implements InterfaceC22291OoooO0O<C25638OooO0oO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25670OooOOOO f67349OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25667OooOO0o f67350OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC22291OoooO0O<C25638OooO0oO> f67351OooO0OO;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOo0O$OooO00o */
    public static class OooO00o extends OooOOOO<C25638OooO0oO, C25638OooO0oO> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C25670OooOOOO f67352OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final InterfaceC25397OooO00o f67353OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f67354OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f67355OooO0o0;

        public OooO00o(OooO oooO, C25670OooOOOO c25670OooOOOO, InterfaceC25397OooO00o interfaceC25397OooO00o, boolean z) {
            super(oooO);
            this.f67352OooO0OO = c25670OooOOOO;
            this.f67353OooO0Oo = interfaceC25397OooO00o;
            this.f67355OooO0o0 = z;
            this.f67354OooO0o = true;
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
            C25638OooO0oO c25638OooO0oO = (C25638OooO0oO) obj;
            try {
                C25732OooO0O0.OooO00o();
                boolean zOooO0o0 = OooO0O0.OooO0o0(i);
                OooO<O> oooO = this.f67330OooO0O0;
                if (!zOooO0o0 && c25638OooO0oO != null) {
                    if (!((i & 10) != 0)) {
                        c25638OooO0oO.ooOO();
                        if (c25638OooO0oO.f87501OooOo != C25623OooO0OO.f87455OooO0OO) {
                            AbstractC25434OooO00o abstractC25434OooO00oOooOOO0 = AbstractC25434OooO00o.OooOOO0(c25638OooO0oO.f87502OooOo0o);
                            if (abstractC25434OooO00oOooOOO0 != null) {
                                try {
                                    AbstractC25434OooO00o abstractC25434OooO00oOooO0Oo = (this.f67354OooO0o && this.f67355OooO0o0) ? this.f67352OooO0OO.OooO0Oo(this.f67353OooO0Oo, abstractC25434OooO00oOooOOO0) : null;
                                    if (abstractC25434OooO00oOooO0Oo != null) {
                                        try {
                                            C25638OooO0oO c25638OooO0oO2 = new C25638OooO0oO(abstractC25434OooO00oOooO0Oo);
                                            c25638OooO0oO2.OooOOO0(c25638OooO0oO);
                                            try {
                                                oooO.OooO0OO(1.0f);
                                                oooO.OooO00o(i, c25638OooO0oO2);
                                                C25732OooO0O0.OooO00o();
                                                return;
                                            } finally {
                                                c25638OooO0oO2.close();
                                            }
                                        } finally {
                                            abstractC25434OooO00oOooO0Oo.close();
                                        }
                                    }
                                } finally {
                                    abstractC25434OooO00oOooOOO0.close();
                                }
                            }
                            oooO.OooO00o(i, c25638OooO0oO);
                            C25732OooO0O0.OooO00o();
                            return;
                        }
                    }
                }
                oooO.OooO00o(i, c25638OooO0oO);
                C25732OooO0O0.OooO00o();
            } catch (Throwable th) {
                C25732OooO0O0.OooO00o();
                throw th;
            }
        }
    }

    public C22270OooOo0O(C25670OooOOOO c25670OooOOOO, C25667OooOO0o c25667OooOO0o, InterfaceC22291OoooO0O interfaceC22291OoooO0O) {
        this.f67349OooO00o = c25670OooOOOO;
        this.f67350OooO0O0 = c25667OooOO0o;
        this.f67351OooO0OO = interfaceC22291OoooO0O;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<C25638OooO0oO> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        try {
            C25732OooO0O0.OooO00o();
            o000oOoO o000ooooOooOOo0 = interfaceC22288OoooO.OooOOo0();
            o000ooooOooOOo0.OooO0OO(interfaceC22288OoooO, "EncodedMemoryCacheProducer");
            C25401OooO0o c25401OooO0oOooO0OO = this.f67350OooO0O0.OooO0OO(interfaceC22288OoooO.OooOOoo(), interfaceC22288OoooO.OooO00o());
            boolean zOooO0OO = interfaceC22288OoooO.OooOOoo().OooO0OO(4);
            C25670OooOOOO c25670OooOOOO = this.f67349OooO00o;
            AbstractC25434OooO00o abstractC25434OooO00o = zOooO0OO ? c25670OooOOOO.get(c25401OooO0oOooO0OO) : null;
            try {
                if (abstractC25434OooO00o != null) {
                    C25638OooO0oO c25638OooO0oO = new C25638OooO0oO(abstractC25434OooO00o);
                    try {
                        o000ooooOooOOo0.OooO(interfaceC22288OoooO, "EncodedMemoryCacheProducer", o000ooooOooOOo0.OooO0Oo(interfaceC22288OoooO, "EncodedMemoryCacheProducer") ? C25428OooO0o.OooO00o("cached_value_found", TelemetryEventStrings.Value.TRUE) : null);
                        o000ooooOooOOo0.OooO0O0(interfaceC22288OoooO, "EncodedMemoryCacheProducer", true);
                        interfaceC22288OoooO.Oooo0("memory_encoded");
                        oooO.OooO0OO(1.0f);
                        oooO.OooO00o(1, c25638OooO0oO);
                        c25638OooO0oO.close();
                        abstractC25434OooO00o.close();
                        return;
                    } catch (Throwable th) {
                        c25638OooO0oO.close();
                        throw th;
                    }
                }
                if (interfaceC22288OoooO.o0Oo0oo().f87928OooOo0o >= 3) {
                    o000ooooOooOOo0.OooO(interfaceC22288OoooO, "EncodedMemoryCacheProducer", o000ooooOooOOo0.OooO0Oo(interfaceC22288OoooO, "EncodedMemoryCacheProducer") ? C25428OooO0o.OooO00o("cached_value_found", TelemetryEventStrings.Value.FALSE) : null);
                    o000ooooOooOOo0.OooO0O0(interfaceC22288OoooO, "EncodedMemoryCacheProducer", false);
                    interfaceC22288OoooO.Oooo00o("memory_encoded", "nil-result");
                    oooO.OooO00o(1, null);
                    AbstractC25434OooO00o.OooOooo(abstractC25434OooO00o);
                    return;
                }
                boolean zOooO0OO2 = interfaceC22288OoooO.OooOOoo().OooO0OO(8);
                interfaceC22288OoooO.OooOOO0().OooO0O0().getClass();
                OooO00o oooO00o = new OooO00o(oooO, c25670OooOOOO, c25401OooO0oOooO0OO, zOooO0OO2);
                o000ooooOooOOo0.OooO(interfaceC22288OoooO, "EncodedMemoryCacheProducer", o000ooooOooOOo0.OooO0Oo(interfaceC22288OoooO, "EncodedMemoryCacheProducer") ? C25428OooO0o.OooO00o("cached_value_found", TelemetryEventStrings.Value.FALSE) : null);
                this.f67351OooO0OO.OooO00o(oooO00o, interfaceC22288OoooO);
                AbstractC25434OooO00o.OooOooo(abstractC25434OooO00o);
            } catch (Throwable th2) {
                AbstractC25434OooO00o.OooOooo(abstractC25434OooO00o);
                throw th2;
            }
        } finally {
            C25732OooO0O0.OooO00o();
        }
    }
}
