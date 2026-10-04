package com.facebook.imagepipeline.producers;

import OooOOO0.AbstractC20449OooO0Oo;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00o0o0o.AbstractC25442OooO;
import o00o0o0o.InterfaceC25443OooO00o;
import o00oo.C25638OooO0oO;
import o00oo0oO.C25729OooO0o;
import o00ooO.C25732OooO0O0;
import o00ooO0.C25750OooOoOO;
import o00ooO0.C25752OooOoo0;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22289OoooO0 implements InterfaceC22291OoooO0O<C25638OooO0oO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25750OooOoOO f67415OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25443OooO00o f67416OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC20449OooO0Oo f67417OooO0OO;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooO0$OooO00o */
    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ C22271OooOo0o f67418OooO00o;

        public OooO00o(C22271OooOo0o c22271OooOo0o) {
            this.f67418OooO00o = c22271OooOo0o;
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [OooOOO0.OooO0Oo, java.lang.Object, java.lang.String] */
        public final void OooO00o(InputStream inputStream) throws IOException {
            C25732OooO0O0.OooO00o();
            C22289OoooO0 c22289OoooO0 = C22289OoooO0.this;
            C25752OooOoo0 c25752OooOoo0OooO0O0 = c22289OoooO0.f67415OooO00o.OooO0O0();
            InterfaceC25443OooO00o interfaceC25443OooO00o = c22289OoooO0.f67416OooO0O0;
            byte[] bArr = interfaceC25443OooO00o.get(16384);
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    ?? r7 = c22289OoooO0.f67417OooO0OO;
                    C22271OooOo0o c22271OooOo0o = this.f67418OooO00o;
                    if (i < 0) {
                        r7.length();
                        c22289OoooO0.OooO0O0(c25752OooOoo0OooO0O0, c22271OooOo0o);
                        interfaceC25443OooO00o.release(bArr);
                        c25752OooOoo0OooO0O0.close();
                        C25732OooO0O0.OooO00o();
                        return;
                    }
                    if (i > 0) {
                        c25752OooOoo0OooO0O0.write(bArr, 0, i);
                        C25729OooO0o c25729OooO0oOooO00o = c22271OooOo0o.f67357OooO0O0.OooOOO0().OooO00o();
                        OooO<C25638OooO0oO> oooO = c22271OooOo0o.f67356OooO00o;
                        if (c25729OooO0oOooO00o != null) {
                            InterfaceC22288OoooO interfaceC22288OoooO = c22271OooOo0o.f67357OooO0O0;
                            if (interfaceC22288OoooO.Oooo0OO()) {
                                r7.getClass();
                                long jUptimeMillis = SystemClock.uptimeMillis();
                                if (jUptimeMillis - c22271OooOo0o.f67358OooO0OO >= 100) {
                                    c22271OooOo0o.f67358OooO0OO = jUptimeMillis;
                                    interfaceC22288OoooO.OooOOo0().OooO00o(interfaceC22288OoooO);
                                    C22289OoooO0.OooO0OO(c25752OooOoo0OooO0O0, 0, oooO);
                                }
                            }
                        }
                        oooO.OooO0OO(1.0f - ((float) Math.exp(((double) (-c25752OooOoo0OooO0O0.f87880OooOoO0)) / 50000.0d)));
                    }
                } catch (Throwable th) {
                    interfaceC25443OooO00o.release(bArr);
                    c25752OooOoo0OooO0O0.close();
                    throw th;
                }
            }
        }
    }

    public C22289OoooO0(C25750OooOoOO c25750OooOoOO, InterfaceC25443OooO00o interfaceC25443OooO00o, AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        this.f67415OooO00o = c25750OooOoOO;
        this.f67416OooO0O0 = interfaceC25443OooO00o;
        this.f67417OooO0OO = abstractC20449OooO0Oo;
    }

    public static void OooO0OO(AbstractC25442OooO abstractC25442OooO, int i, OooO oooO) throws Throwable {
        C25435OooO0O0 c25435OooO0O0O00Oo0 = AbstractC25434OooO00o.o00Oo0(abstractC25442OooO.OooO00o());
        C25638OooO0oO c25638OooO0oO = null;
        try {
            C25638OooO0oO c25638OooO0oO2 = new C25638OooO0oO(c25435OooO0O0O00Oo0);
            try {
                c25638OooO0oO2.Oooo000();
                oooO.OooO00o(i, c25638OooO0oO2);
                c25638OooO0oO2.close();
                c25435OooO0O0O00Oo0.close();
            } catch (Throwable th) {
                th = th;
                c25638OooO0oO = c25638OooO0oO2;
                C25638OooO0oO.OooO0OO(c25638OooO0oO);
                AbstractC25434OooO00o.OooOooo(c25435OooO0O0O00Oo0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [OooOOO0.OooO0Oo, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.facebook.imagepipeline.producers.OooOo0o, com.facebook.imagepipeline.producers.OooOoO$OooO00o, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<C25638OooO0oO> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        interfaceC22288OoooO.OooOOo0().OooO0OO(interfaceC22288OoooO, "NetworkFetchProducer");
        ?? r0 = this.f67417OooO0OO;
        ?? OooOO0O2 = r0.OooOO0O(oooO, interfaceC22288OoooO);
        new OooO00o(OooOO0O2);
        r0.getByteArray(OooOO0O2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v3, types: [OooOOO0.OooO0Oo, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.facebook.imagepipeline.producers.o000oOoO] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.imagepipeline.producers.OooOo0o, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooO0O0(AbstractC25442OooO abstractC25442OooO, C22271OooOo0o c22271OooOo0o) throws Throwable {
        abstractC25442OooO.size();
        o000oOoO o000ooooOooOOo0 = c22271OooOo0o.f67357OooO0O0.OooOOo0();
        InterfaceC22288OoooO interfaceC22288OoooO = c22271OooOo0o.f67357OooO0O0;
        ?? string = !o000ooooOooOOo0.OooO0Oo(interfaceC22288OoooO, "NetworkFetchProducer") ? 0 : this.f67417OooO0OO.getString(c22271OooOo0o);
        ?? OooOOo02 = interfaceC22288OoooO.OooOOo0();
        OooOOo02.OooO(interfaceC22288OoooO, "NetworkFetchProducer", string);
        OooOOo02.OooO0O0(interfaceC22288OoooO, "NetworkFetchProducer", true);
        interfaceC22288OoooO.Oooo0("network");
        OooO0OO(abstractC25442OooO, 1, c22271OooOo0o.f67356OooO00o);
    }
}
