package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C22277OooOooO;
import com.facebook.imagepipeline.producers.C22297OoooOoo;
import o00o0Ooo.C25428OooO0o;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00oOoOo.C25622OooO0O0;
import o00oo.C25638OooO0oO;
import o00oo0O.C25654OooO0Oo;
import o00ooO0.C25752OooOoo0;
import o00ooO0o.C25763OooO00o;
import o00ooOO0.C25773OooO0O0;
import o00ooOO0.C25776OooO0o;
import o00ooOO0.InterfaceC25774OooO0OO;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22295OoooOo0 implements C22277OooOooO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C22297OoooOoo.OooO00o f67435OooO00o;

    public C22295OoooOo0(C22297OoooOoo.OooO00o oooO00o) {
        this.f67435OooO00o = oooO00o;
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
    @Override // com.facebook.imagepipeline.producers.C22277OooOooO.OooO00o
    public final void OooO00o(C25638OooO0oO c25638OooO0oO, int i) {
        C22297OoooOoo.OooO00o oooO00o = this.f67435OooO00o;
        if (c25638OooO0oO == null) {
            oooO00o.f67330OooO0O0.OooO00o(i, null);
            return;
        }
        C25776OooO0o c25776OooO0o = oooO00o.f67444OooO0Oo;
        c25638OooO0oO.ooOO();
        InterfaceC25774OooO0OO interfaceC25774OooO0OOCreateImageTranscoder = c25776OooO0o.createImageTranscoder(c25638OooO0oO.f87501OooOo, oooO00o.f67443OooO0OO);
        OooO<O> oooO = oooO00o.f67330OooO0O0;
        InterfaceC22288OoooO interfaceC22288OoooO = oooO00o.f67446OooO0o0;
        interfaceC22288OoooO.OooOOo0().OooO0OO(interfaceC22288OoooO, "ResizeAndRotateProducer");
        C25763OooO00o c25763OooO00oOooOOoo = interfaceC22288OoooO.OooOOoo();
        C25752OooOoo0 c25752OooOoo0OooO0O0 = C22297OoooOoo.this.f67439OooO0O0.OooO0O0();
        try {
            try {
                C25654OooO0Oo c25654OooO0Oo = c25763OooO00oOooOOoo.f87916OooO0oO;
                c25638OooO0oO.ooOO();
                C25773OooO0O0 c25773OooO0O0OooO0O0 = interfaceC25774OooO0OOCreateImageTranscoder.OooO0O0(c25638OooO0oO, c25752OooOoo0OooO0O0, c25654OooO0Oo, c25638OooO0oO.f87509OooOooo);
                int i2 = c25773OooO0O0OooO0O0.f87945OooO00o;
                if (i2 == 2) {
                    throw new RuntimeException("Error while transcoding the image");
                }
                C25428OooO0o c25428OooO0oOooOO0o = oooO00o.OooOO0o(c25638OooO0oO, c25773OooO0O0OooO0O0, interfaceC25774OooO0OOCreateImageTranscoder.getIdentifier());
                C25435OooO0O0 c25435OooO0O0O00Oo0 = AbstractC25434OooO00o.o00Oo0(c25752OooOoo0OooO0O0.OooO00o());
                try {
                    C25638OooO0oO c25638OooO0oO2 = new C25638OooO0oO(c25435OooO0O0O00Oo0);
                    c25638OooO0oO2.f87501OooOo = C25622OooO0O0.f87441OooO00o;
                    try {
                        c25638OooO0oO2.Oooo000();
                        interfaceC22288OoooO.OooOOo0().OooO(interfaceC22288OoooO, "ResizeAndRotateProducer", c25428OooO0oOooOO0o);
                        if (i2 != 1) {
                            i |= 16;
                        }
                        oooO.OooO00o(i, c25638OooO0oO2);
                        c25435OooO0O0O00Oo0.close();
                        c25752OooOoo0OooO0O0.close();
                    } finally {
                        c25638OooO0oO2.close();
                    }
                } catch (Throwable th) {
                    AbstractC25434OooO00o.OooOooo(c25435OooO0O0O00Oo0);
                    throw th;
                }
            } catch (Exception e) {
                interfaceC22288OoooO.OooOOo0().OooOO0O(interfaceC22288OoooO, "ResizeAndRotateProducer", e, null);
                if (OooO0O0.OooO0Oo(i)) {
                    oooO.onFailure(e);
                }
                c25752OooOoo0OooO0O0.close();
            }
        } catch (Throwable th2) {
            c25752OooOoo0OooO0O0.close();
            throw th2;
        }
    }
}
