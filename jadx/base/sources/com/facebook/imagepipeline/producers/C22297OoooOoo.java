package com.facebook.imagepipeline.producers;

import java.util.HashMap;
import java.util.concurrent.Executor;
import o00o0Ooo.C25428OooO0o;
import o00o0Ooo.C25429OooO0o0;
import o00o0oOo.EnumC25460OooO0OO;
import o00oOoOo.C25622OooO0O0;
import o00oOoOo.C25623OooO0OO;
import o00oo.C25638OooO0oO;
import o00oo0O.C25654OooO0Oo;
import o00ooO0.C25750OooOoOO;
import o00ooO0o.C25763OooO00o;
import o00ooOO0.C25773OooO0O0;
import o00ooOO0.C25776OooO0o;
import o00ooOO0.C25777OooO0o0;
import o00ooOO0.InterfaceC25774OooO0OO;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22297OoooOoo implements InterfaceC22291OoooO0O<C25638OooO0oO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f67438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25750OooOoOO f67439OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC22291OoooO0O<C25638OooO0oO> f67440OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f67441OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25776OooO0o f67442OooO0o0;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooOoo$OooO00o */
    public class OooO00o extends OooOOOO<C25638OooO0oO, C25638OooO0oO> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f67443OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C25776OooO0o f67444OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f67445OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final InterfaceC22288OoooO f67446OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final C22277OooOooO f67447OooO0oO;

        public OooO00o(OooO oooO, InterfaceC22288OoooO interfaceC22288OoooO, boolean z, C25776OooO0o c25776OooO0o) {
            super(oooO);
            this.f67445OooO0o = false;
            this.f67446OooO0o0 = interfaceC22288OoooO;
            interfaceC22288OoooO.OooOOoo().getClass();
            this.f67443OooO0OO = z;
            this.f67444OooO0Oo = c25776OooO0o;
            this.f67447OooO0oO = new C22277OooOooO(C22297OoooOoo.this.f67438OooO00o, new C22295OoooOo0(this));
            interfaceC22288OoooO.OooO0OO(new C22296OoooOoO(this, oooO));
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0oo(int i, Object obj) {
            EnumC25460OooO0OO enumC25460OooO0OO;
            boolean z;
            boolean zContains;
            C25638OooO0oO c25638OooO0oOOooO00o = (C25638OooO0oO) obj;
            if (this.f67445OooO0o) {
                return;
            }
            boolean zOooO0Oo = OooO0O0.OooO0Oo(i);
            boolean z2 = true;
            OooO<O> oooO = this.f67330OooO0O0;
            if (c25638OooO0oOOooO00o == null) {
                if (zOooO0Oo) {
                    oooO.OooO00o(1, null);
                    return;
                }
                return;
            }
            c25638OooO0oOOooO00o.ooOO();
            C25623OooO0OO c25623OooO0OO = c25638OooO0oOOooO00o.f87501OooOo;
            InterfaceC22288OoooO interfaceC22288OoooO = this.f67446OooO0o0;
            C25763OooO00o c25763OooO00oOooOOoo = interfaceC22288OoooO.OooOOoo();
            InterfaceC25774OooO0OO interfaceC25774OooO0OOCreateImageTranscoder = this.f67444OooO0Oo.createImageTranscoder(c25623OooO0OO, this.f67443OooO0OO);
            c25638OooO0oOOooO00o.ooOO();
            C25623OooO0OO c25623OooO0OO2 = c25638OooO0oOOooO00o.f87501OooOo;
            C25623OooO0OO c25623OooO0OO3 = C25623OooO0OO.f87455OooO0OO;
            EnumC25460OooO0OO enumC25460OooO0OO2 = EnumC25460OooO0OO.f86760OooOoO0;
            EnumC25460OooO0OO enumC25460OooO0OO3 = EnumC25460OooO0OO.f86758OooOo0o;
            if (c25623OooO0OO2 == c25623OooO0OO3) {
                enumC25460OooO0OO = enumC25460OooO0OO2;
            } else {
                c25638OooO0oOOooO00o.ooOO();
                boolean zOooO0OO = interfaceC25774OooO0OOCreateImageTranscoder.OooO0OO(c25638OooO0oOOooO00o.f87501OooOo);
                enumC25460OooO0OO = EnumC25460OooO0OO.f86757OooOo;
                if (zOooO0OO) {
                    C25654OooO0Oo c25654OooO0Oo = c25763OooO00oOooOOoo.f87916OooO0oO;
                    if (c25654OooO0Oo.f87573OooO00o) {
                        z = false;
                        if (!z && !interfaceC25774OooO0OOCreateImageTranscoder.OooO00o(c25638OooO0oOOooO00o, c25763OooO00oOooOOoo.f87916OooO0oO)) {
                            z2 = false;
                        }
                        if (z2) {
                            enumC25460OooO0OO = enumC25460OooO0OO3;
                        }
                    } else {
                        if (C25777OooO0o0.OooO0O0(c25638OooO0oOOooO00o, c25654OooO0Oo) == 0) {
                            if (c25654OooO0Oo.f87573OooO00o) {
                                c25638OooO0oOOooO00o.f87503OooOoO = 0;
                                zContains = false;
                            } else {
                                C25429OooO0o0<Integer> c25429OooO0o0 = C25777OooO0o0.f87948OooO00o;
                                c25638OooO0oOOooO00o.ooOO();
                                zContains = c25429OooO0o0.contains(Integer.valueOf(c25638OooO0oOOooO00o.f87503OooOoO));
                            }
                            if (zContains) {
                            }
                            if (!z) {
                                z2 = false;
                            }
                            if (z2) {
                            }
                        }
                        z = true;
                        if (!z) {
                        }
                        if (z2) {
                        }
                    }
                }
            }
            if (zOooO0Oo || enumC25460OooO0OO != enumC25460OooO0OO2) {
                if (enumC25460OooO0OO == enumC25460OooO0OO3) {
                    C22277OooOooO c22277OooOooO = this.f67447OooO0oO;
                    if (c22277OooOooO.OooO0o0(c25638OooO0oOOooO00o, i)) {
                        if (zOooO0Oo || interfaceC22288OoooO.Oooo0OO()) {
                            c22277OooOooO.OooO0OO();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (c25623OooO0OO != C25622OooO0O0.f87441OooO00o && c25623OooO0OO != C25622OooO0O0.f87450OooOO0O) {
                    interfaceC22288OoooO.OooOOoo().f87916OooO0oO.getClass();
                } else if (!interfaceC22288OoooO.OooOOoo().f87916OooO0oO.f87573OooO00o) {
                    c25638OooO0oOOooO00o.ooOO();
                    if (c25638OooO0oOOooO00o.f87504OooOoO0 != 0) {
                        c25638OooO0oOOooO00o.ooOO();
                        if (c25638OooO0oOOooO00o.f87504OooOoO0 != -1 && (c25638OooO0oOOooO00o = C25638OooO0oO.OooO00o(c25638OooO0oOOooO00o)) != null) {
                            c25638OooO0oOOooO00o.f87504OooOoO0 = 0;
                        }
                    }
                }
                oooO.OooO00o(i, c25638OooO0oOOooO00o);
            }
        }

        public final C25428OooO0o OooOO0o(C25638OooO0oO c25638OooO0oO, C25773OooO0O0 c25773OooO0O0, String str) {
            long j;
            InterfaceC22288OoooO interfaceC22288OoooO = this.f67446OooO0o0;
            if (!interfaceC22288OoooO.OooOOo0().OooO0Oo(interfaceC22288OoooO, "ResizeAndRotateProducer")) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            c25638OooO0oO.ooOO();
            sb.append(c25638OooO0oO.f87505OooOoOO);
            sb.append("x");
            c25638OooO0oO.ooOO();
            sb.append(c25638OooO0oO.f87507OooOoo0);
            String string = sb.toString();
            HashMap map = new HashMap();
            c25638OooO0oO.ooOO();
            map.put("Image format", String.valueOf(c25638OooO0oO.f87501OooOo));
            map.put("Original size", string);
            map.put("Requested size", "Unspecified");
            C22277OooOooO c22277OooOooO = this.f67447OooO0oO;
            synchronized (c22277OooOooO) {
                j = c22277OooOooO.f67373OooO - c22277OooOooO.f67381OooO0oo;
            }
            map.put("queueTime", String.valueOf(j));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(c25773OooO0O0));
            return new C25428OooO0o(map);
        }
    }

    public C22297OoooOoo(Executor executor, C25750OooOoOO c25750OooOoOO, InterfaceC22291OoooO0O interfaceC22291OoooO0O, boolean z, C25776OooO0o c25776OooO0o) {
        executor.getClass();
        this.f67438OooO00o = executor;
        c25750OooOoOO.getClass();
        this.f67439OooO0O0 = c25750OooOoOO;
        this.f67440OooO0OO = interfaceC22291OoooO0O;
        c25776OooO0o.getClass();
        this.f67442OooO0o0 = c25776OooO0o;
        this.f67441OooO0Oo = z;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<C25638OooO0oO> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        this.f67440OooO0OO.OooO00o(new OooO00o(oooO, interfaceC22288OoooO, this.f67441OooO0Oo, this.f67442OooO0o0), interfaceC22288OoooO);
    }
}
