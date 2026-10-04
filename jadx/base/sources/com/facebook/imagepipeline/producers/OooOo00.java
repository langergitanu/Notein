package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C22265OooOOOo;
import java.util.concurrent.Executor;
import o00o0OOO.C25401OooO0o;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0Ooo.InterfaceC25423OooO;
import o00o0o00.C25438OooO00o;
import o00oOoOo.C25623OooO0OO;
import o00oo.C25638OooO0oO;
import o00oo0O0.C25661OooO0o;
import o00oo0O0.C25667OooOO0o;
import o00oo0O0.C25675OooOo;
import o00oo0Oo.InterfaceC25687OooO0OO;
import o00ooO.C25732OooO0O0;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOo00 implements InterfaceC22291OoooO0O<C25638OooO0oO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25423OooO<InterfaceC25687OooO0OO> f67343OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25667OooOO0o f67344OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC22291OoooO0O<C25638OooO0oO> f67345OooO0OO;

    public static class OooO00o extends OooOOOO<C25638OooO0oO, C25638OooO0oO> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC22288OoooO f67346OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final InterfaceC25423OooO<InterfaceC25687OooO0OO> f67347OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C25667OooOO0o f67348OooO0o0;

        public OooO00o(OooO oooO, InterfaceC22288OoooO interfaceC22288OoooO, InterfaceC25423OooO interfaceC25423OooO, C25667OooOO0o c25667OooOO0o) {
            super(oooO);
            this.f67346OooO0OO = interfaceC22288OoooO;
            this.f67347OooO0Oo = interfaceC25423OooO;
            this.f67348OooO0o0 = c25667OooOO0o;
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
            C25638OooO0oO encodedImage = (C25638OooO0oO) obj;
            InterfaceC22288OoooO interfaceC22288OoooO = this.f67346OooO0OO;
            interfaceC22288OoooO.OooOOo0().OooO0OO(interfaceC22288OoooO, "DiskCacheWriteProducer");
            boolean zOooO0o0 = OooO0O0.OooO0o0(i);
            OooO<O> oooO = this.f67330OooO0O0;
            if (!zOooO0o0 && encodedImage != null && (i & 10) == 0) {
                encodedImage.ooOO();
                if (encodedImage.f87501OooOo != C25623OooO0OO.f87455OooO0OO) {
                    C25763OooO00o c25763OooO00oOooOOoo = interfaceC22288OoooO.OooOOoo();
                    final C25401OooO0o key = this.f67348OooO0o0.OooO0OO(c25763OooO00oOooOOoo, interfaceC22288OoooO.OooO00o());
                    InterfaceC25687OooO0OO interfaceC25687OooO0OO = this.f67347OooO0Oo.get();
                    final C25661OooO0o c25661OooO0oOooO00o = C22265OooOOOo.OooO00o(c25763OooO00oOooOOoo, interfaceC25687OooO0OO.OooO00o(), interfaceC25687OooO0OO.OooO0O0(), interfaceC25687OooO0OO.OooO0OO());
                    if (c25661OooO0oOooO00o == null) {
                        interfaceC22288OoooO.OooOOo0().OooOO0O(interfaceC22288OoooO, "DiskCacheWriteProducer", new C22265OooOOOo.OooO00o("Got no disk cache for CacheChoice: " + Integer.valueOf(c25763OooO00oOooOOoo.f87910OooO00o.ordinal()).toString()), null);
                        oooO.OooO00o(i, encodedImage);
                        return;
                    }
                    c25661OooO0oOooO00o.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(encodedImage, "encodedImage");
                    C25732OooO0O0.OooO00o();
                    Executor executor = c25661OooO0oOooO00o.f87595OooO0o0;
                    if (!C25638OooO0oO.Oooo0OO(encodedImage)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    C25675OooOo c25675OooOo = c25661OooO0oOooO00o.f87596OooO0oO;
                    synchronized (c25675OooOo) {
                        key.getClass();
                        if (!C25638OooO0oO.Oooo0OO(encodedImage)) {
                            throw new IllegalArgumentException();
                        }
                        C25638OooO0oO.OooO0OO((C25638OooO0oO) c25675OooOo.f87621OooO00o.put(key, C25638OooO0oO.OooO00o(encodedImage)));
                        c25675OooOo.OooO0O0();
                    }
                    final C25638OooO0oO c25638OooO0oOOooO00o = C25638OooO0oO.OooO00o(encodedImage);
                    try {
                        executor.execute(new Runnable() { // from class: o00oo0O0.OooO0Oo
                            @Override // java.lang.Runnable
                            public final void run() {
                                C25638OooO0oO c25638OooO0oO = c25638OooO0oOOooO00o;
                                C25661OooO0o this$0 = c25661OooO0oOooO00o;
                                InterfaceC25397OooO00o key2 = key;
                                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                                C25675OooOo c25675OooOo2 = this$0.f87596OooO0oO;
                                kotlin.jvm.internal.OooOOO0.OooO0oO(key2, "$key");
                                try {
                                    this$0.OooO0O0(key2, c25638OooO0oO);
                                } finally {
                                }
                            }
                        });
                    } catch (Exception e) {
                        C25438OooO00o.OooO(e, "Failed to schedule disk-cache write for %s", key.OooO00o());
                        c25675OooOo.OooO0OO(key, encodedImage);
                        C25638OooO0oO.OooO0OO(c25638OooO0oOOooO00o);
                    }
                    interfaceC22288OoooO.OooOOo0().OooO(interfaceC22288OoooO, "DiskCacheWriteProducer", null);
                    oooO.OooO00o(i, encodedImage);
                    return;
                }
            }
            interfaceC22288OoooO.OooOOo0().OooO(interfaceC22288OoooO, "DiskCacheWriteProducer", null);
            oooO.OooO00o(i, encodedImage);
        }
    }

    public OooOo00(InterfaceC25423OooO<InterfaceC25687OooO0OO> interfaceC25423OooO, C25667OooOO0o c25667OooOO0o, InterfaceC22291OoooO0O<C25638OooO0oO> interfaceC22291OoooO0O) {
        this.f67343OooO00o = interfaceC25423OooO;
        this.f67344OooO0O0 = c25667OooOO0o;
        this.f67345OooO0OO = interfaceC22291OoooO0O;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<C25638OooO0oO> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        if (interfaceC22288OoooO.o0Oo0oo().f87928OooOo0o >= 2) {
            interfaceC22288OoooO.Oooo00o("disk", "nil-result_write");
            oooO.OooO00o(1, null);
        } else {
            if (interfaceC22288OoooO.OooOOoo().OooO0OO(32)) {
                oooO = new OooO00o(oooO, interfaceC22288OoooO, this.f67343OooO00o, this.f67344OooO0O0);
            }
            this.f67345OooO0OO.OooO00o(oooO, interfaceC22288OoooO);
        }
    }
}
