package com.facebook.imagepipeline.producers;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0Ooo.C25428OooO0o;
import o00o0o.AbstractC25434OooO00o;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo.InterfaceC25639OooO0oo;
import o00oo.InterfaceC25640OooOO0o;
import o00oo0O0.C25657OooO00o;
import o00oo0O0.C25667OooOO0o;
import o00oo0O0.C25670OooOOOO;
import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C22262OooO0oO implements InterfaceC22291OoooO0O<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25670OooOOOO f67297OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25667OooOO0o f67298OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC22291OoooO0O<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> f67299OooO0OO;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooO0oO$OooO00o */
    public class OooO00o extends OooOOOO<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>, AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ InterfaceC25397OooO00o f67300OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f67301OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO oooO, InterfaceC25397OooO00o interfaceC25397OooO00o, boolean z) {
            super(oooO);
            this.f67300OooO0OO = interfaceC25397OooO00o;
            this.f67301OooO0Oo = z;
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
            AbstractC25434OooO00o abstractC25434OooO00o;
            AbstractC25434OooO00o abstractC25434OooO00o2 = (AbstractC25434OooO00o) obj;
            try {
                C25732OooO0O0.OooO00o();
                boolean zOooO0Oo = OooO0O0.OooO0Oo(i);
                OooO<O> oooO = this.f67330OooO0O0;
                if (abstractC25434OooO00o2 == null) {
                    if (zOooO0Oo) {
                        oooO.OooO00o(i, null);
                    }
                    return;
                }
                if (((InterfaceC25636OooO0Oo) abstractC25434OooO00o2.Oooo000()).o000O() || OooO0O0.OooOO0O(i, 8)) {
                    oooO.OooO00o(i, abstractC25434OooO00o2);
                    return;
                }
                InterfaceC25397OooO00o interfaceC25397OooO00o = this.f67300OooO0OO;
                C22262OooO0oO c22262OooO0oO = C22262OooO0oO.this;
                if (!zOooO0Oo && (abstractC25434OooO00o = c22262OooO0oO.f67297OooO00o.get(interfaceC25397OooO00o)) != null) {
                    try {
                        InterfaceC25640OooOO0o interfaceC25640OooOO0oO000 = ((InterfaceC25636OooO0Oo) abstractC25434OooO00o2.Oooo000()).o000();
                        InterfaceC25640OooOO0o interfaceC25640OooOO0oO0002 = ((InterfaceC25636OooO0Oo) abstractC25434OooO00o.Oooo000()).o000();
                        if (((o00oo.OooOO0O) interfaceC25640OooOO0oO0002).f87515OooO0OO || ((o00oo.OooOO0O) interfaceC25640OooOO0oO0002).f87513OooO00o >= ((o00oo.OooOO0O) interfaceC25640OooOO0oO000).f87513OooO00o) {
                            oooO.OooO00o(i, abstractC25434OooO00o);
                            return;
                        }
                    } finally {
                        abstractC25434OooO00o.close();
                    }
                }
                AbstractC25434OooO00o abstractC25434OooO00oOooO0Oo = this.f67301OooO0Oo ? c22262OooO0oO.f67297OooO00o.OooO0Oo(interfaceC25397OooO00o, abstractC25434OooO00o2) : null;
                if (zOooO0Oo) {
                    try {
                        oooO.OooO0OO(1.0f);
                    } catch (Throwable th) {
                        AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooO0Oo);
                        throw th;
                    }
                }
                if (abstractC25434OooO00oOooO0Oo != null) {
                    abstractC25434OooO00o2 = abstractC25434OooO00oOooO0Oo;
                }
                oooO.OooO00o(i, abstractC25434OooO00o2);
                AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooO0Oo);
            } finally {
                C25732OooO0O0.OooO00o();
            }
        }
    }

    public C22262OooO0oO(C25670OooOOOO c25670OooOOOO, C25667OooOO0o c25667OooOO0o, InterfaceC22291OoooO0O interfaceC22291OoooO0O) {
        this.f67297OooO00o = c25670OooOOOO;
        this.f67298OooO0O0 = c25667OooOO0o;
        this.f67299OooO0OO = interfaceC22291OoooO0O;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        try {
            C25732OooO0O0.OooO00o();
            o000oOoO o000ooooOooOOo0 = interfaceC22288OoooO.OooOOo0();
            o000ooooOooOOo0.OooO0OO(interfaceC22288OoooO, OooO0OO());
            C25657OooO00o c25657OooO00oOooO0O0 = this.f67298OooO0O0.OooO0O0(interfaceC22288OoooO.OooOOoo(), interfaceC22288OoooO.OooO00o());
            AbstractC25434OooO00o abstractC25434OooO00o = interfaceC22288OoooO.OooOOoo().OooO0OO(1) ? this.f67297OooO00o.get(c25657OooO00oOooO0O0) : null;
            if (abstractC25434OooO00o != null) {
                interfaceC22288OoooO.OooOooo(((InterfaceC25639OooO0oo) abstractC25434OooO00o.Oooo000()).getExtras());
                boolean z = ((o00oo.OooOO0O) ((InterfaceC25636OooO0Oo) abstractC25434OooO00o.Oooo000()).o000()).f87515OooO0OO;
                if (z) {
                    o000ooooOooOOo0.OooO(interfaceC22288OoooO, OooO0OO(), o000ooooOooOOo0.OooO0Oo(interfaceC22288OoooO, OooO0OO()) ? C25428OooO0o.OooO00o("cached_value_found", TelemetryEventStrings.Value.TRUE) : null);
                    o000ooooOooOOo0.OooO0O0(interfaceC22288OoooO, OooO0OO(), true);
                    interfaceC22288OoooO.Oooo00o("memory_bitmap", OooO0O0());
                    oooO.OooO0OO(1.0f);
                }
                oooO.OooO00o(z ? 1 : 0, abstractC25434OooO00o);
                abstractC25434OooO00o.close();
                if (z) {
                    return;
                }
            }
            if (interfaceC22288OoooO.o0Oo0oo().f87928OooOo0o >= 4) {
                o000ooooOooOOo0.OooO(interfaceC22288OoooO, OooO0OO(), o000ooooOooOOo0.OooO0Oo(interfaceC22288OoooO, OooO0OO()) ? C25428OooO0o.OooO00o("cached_value_found", TelemetryEventStrings.Value.FALSE) : null);
                o000ooooOooOOo0.OooO0O0(interfaceC22288OoooO, OooO0OO(), false);
                interfaceC22288OoooO.Oooo00o("memory_bitmap", OooO0O0());
                oooO.OooO00o(1, null);
                return;
            }
            OooO<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> oooOOooO0Oo = OooO0Oo(oooO, c25657OooO00oOooO0O0, interfaceC22288OoooO.OooOOoo().OooO0OO(2));
            o000ooooOooOOo0.OooO(interfaceC22288OoooO, OooO0OO(), o000ooooOooOOo0.OooO0Oo(interfaceC22288OoooO, OooO0OO()) ? C25428OooO0o.OooO00o("cached_value_found", TelemetryEventStrings.Value.FALSE) : null);
            C25732OooO0O0.OooO00o();
            this.f67299OooO0OO.OooO00o(oooOOooO0Oo, interfaceC22288OoooO);
            C25732OooO0O0.OooO00o();
        } finally {
            C25732OooO0O0.OooO00o();
        }
    }

    public String OooO0O0() {
        return "pipe_bg";
    }

    public String OooO0OO() {
        return "BitmapMemoryCacheProducer";
    }

    public OooO<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> OooO0Oo(OooO<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> oooO, InterfaceC25397OooO00o interfaceC25397OooO00o, boolean z) {
        return new OooO00o(oooO, interfaceC25397OooO00o, z);
    }
}
