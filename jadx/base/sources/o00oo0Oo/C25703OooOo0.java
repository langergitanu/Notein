package o00oo0Oo;

import androidx.core.util.Pools;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.producers.C22302OooooOo;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import o00OooO.C25139OooOOOo;
import o00OooO0.C25150OooO00o;
import o00o00O0.C25252OooO0Oo;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0Oo.InterfaceExecutorServiceC25418OooO0o0;
import o00o0Ooo.InterfaceC25423OooO;
import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;
import o00o0o0o.C25444OooO0O0;
import o00o0o0o.InterfaceC25449OooO0oO;
import o00oOooo.InterfaceC25632OooO00o;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo0O0.C25663OooO0oO;
import o00oo0O0.C25664OooO0oo;
import o00oo0O0.C25668OooOOO;
import o00oo0O0.C25670OooOOOO;
import o00oo0O0.C25672OooOOo;
import o00oo0O0.InterfaceC25665OooOO0;
import o00oo0OO.AbstractC25682OooO0O0;
import o00oo0OO.C25681OooO00o;
import o00oo0oO.InterfaceC25727OooO0OO;
import o00ooO.C25732OooO0O0;
import o00ooO0.C25754OooOooo;
import o00ooO0O.C25761OooO0O0;
import o00ooO0O.InterfaceC25762OooO0OO;
import o00ooOO0.C25776OooO0o;

/* JADX INFO: renamed from: o00oo0Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25703OooOo0 {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static C25703OooOo0 f87726OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static C25701OooOOo0 f87727OooOOo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public InterfaceC25727OooO0OO f87728OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C22302OooooOo f87729OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25700OooOOo f87730OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25685OooO00o f87731OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC25423OooO<InterfaceC25687OooO0OO> f87732OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C25670OooOOOO<InterfaceC25397OooO00o, InterfaceC25636OooO0Oo> f87733OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public InterfaceC25665OooOO0<InterfaceC25397OooO00o, InterfaceC25636OooO0Oo> f87734OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C25672OooOOo f87735OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C25670OooOOOO<InterfaceC25397OooO00o, InterfaceC25449OooO0oO> f87736OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C25776OooO0o f87737OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooOo f87738OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public C25722OoooO00 f87739OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public C25761OooO0O0 f87740OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public C25681OooO00o f87741OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public InterfaceC25632OooO00o f87742OooOOOO;

    public C25703OooOo0(C25700OooOOo c25700OooOOo) {
        C25732OooO0O0.OooO00o();
        this.f87730OooO0O0 = c25700OooOOo;
        OooOo00 oooOo00 = c25700OooOOo.f87693OooOo0O;
        oooOo00.getClass();
        this.f87729OooO00o = new C22302OooooOo((ExecutorService) c25700OooOOo.f87671OooO.f87638OooO0Oo);
        this.f87731OooO0OO = new C25685OooO00o(c25700OooOOo.f87690OooOo);
        C25732OooO0O0.OooO00o();
        this.f87732OooO0Oo = c25700OooOOo.f87678OooO0oO;
        oooOo00.getClass();
    }

    public static synchronized void OooO0oo(C25700OooOOo c25700OooOOo) {
        try {
            if (f87726OooOOOo != null && C25438OooO00o.f86720OooO00o.OooO00o(5)) {
                C25439OooO0O0.OooO0O0(5, C25703OooOo0.class.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f87726OooOOOo = new C25703OooOo0(c25700OooOOo);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final InterfaceC25632OooO00o OooO00o() {
        if (this.f87742OooOOOO == null) {
            AbstractC25682OooO0O0 abstractC25682OooO0O0OooO0o = OooO0o();
            C25700OooOOo c25700OooOOo = this.f87730OooO0O0;
            C25686OooO0O0 c25686OooO0O0 = c25700OooOOo.f87671OooO;
            InterfaceC25665OooOO0<InterfaceC25397OooO00o, InterfaceC25636OooO0Oo> interfaceC25665OooOO0OooO0O0 = OooO0O0();
            OooOo00 oooOo00 = c25700OooOOo.f87693OooOo0O;
            oooOo00.getClass();
            oooOo00.getClass();
            oooOo00.getClass();
            oooOo00.getClass();
            if (!Ooooo0o.Oooo000.f61699OooO00o) {
                try {
                    Class cls = Boolean.TYPE;
                    Class cls2 = Integer.TYPE;
                    Constructor constructor = AnimatedFactoryV2Impl.class.getConstructor(AbstractC25682OooO0O0.class, InterfaceC25699OooOOOo.class, InterfaceC25665OooOO0.class, cls, cls, cls2, cls2, InterfaceExecutorServiceC25418OooO0o0.class);
                    Boolean bool = Boolean.FALSE;
                    Object objNewInstance = constructor.newInstance(abstractC25682OooO0O0OooO0o, c25686OooO0O0, interfaceC25665OooOO0OooO0O0, bool, bool, 30, 1000, null);
                    kotlin.jvm.internal.OooOOO0.OooO0o0(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                    Ooooo0o.Oooo000.f61700OooO0O0 = (InterfaceC25632OooO00o) objNewInstance;
                } catch (Throwable unused) {
                }
                if (Ooooo0o.Oooo000.f61700OooO0O0 != null) {
                    Ooooo0o.Oooo000.f61699OooO00o = true;
                }
            }
            this.f87742OooOOOO = Ooooo0o.Oooo000.f61700OooO0O0;
        }
        return this.f87742OooOOOO;
    }

    public final InterfaceC25665OooOO0<InterfaceC25397OooO00o, InterfaceC25636OooO0Oo> OooO0O0() {
        if (this.f87734OooO0o0 == null) {
            C25700OooOOo c25700OooOOo = this.f87730OooO0O0;
            C25664OooO0oo c25664OooO0oo = c25700OooOOo.f87695OooOoO0;
            OooOo00 oooOo00 = c25700OooOOo.f87693OooOo0O;
            oooOo00.getClass();
            oooOo00.getClass();
            c25664OooO0oo.getClass();
            C25672OooOOo c25672OooOOo = new C25672OooOOo(new C25663OooO0oO(), c25700OooOOo.f87673OooO0O0, c25700OooOOo.f87672OooO00o, null);
            c25700OooOOo.f87684OooOOO0.getClass();
            this.f87734OooO0o0 = c25672OooOOo;
        }
        return this.f87734OooO0o0;
    }

    public final C25670OooOOOO<InterfaceC25397OooO00o, InterfaceC25636OooO0Oo> OooO0OO() {
        if (this.f87733OooO0o == null) {
            InterfaceC25665OooOO0<InterfaceC25397OooO00o, InterfaceC25636OooO0Oo> interfaceC25665OooOO0OooO0O0 = OooO0O0();
            this.f87730OooO0O0.f87680OooOO0.getClass();
            this.f87733OooO0o = new C25670OooOOOO<>(interfaceC25665OooOO0OooO0O0, new C25150OooO00o());
        }
        return this.f87733OooO0o;
    }

    public final C25670OooOOOO<InterfaceC25397OooO00o, InterfaceC25449OooO0oO> OooO0Oo() {
        if (this.f87736OooO0oo == null) {
            C25700OooOOo c25700OooOOo = this.f87730OooO0O0;
            c25700OooOOo.getClass();
            if (this.f87735OooO0oO == null) {
                C25672OooOOo c25672OooOOo = new C25672OooOOo(new C25668OooOOO(), c25700OooOOo.f87674OooO0OO, c25700OooOOo.f87679OooO0oo, null);
                c25700OooOOo.f87684OooOOO0.getClass();
                this.f87735OooO0oO = c25672OooOOo;
            }
            C25672OooOOo c25672OooOOo2 = this.f87735OooO0oO;
            c25700OooOOo.f87680OooOO0.getClass();
            this.f87736OooO0oo = new C25670OooOOOO<>(c25672OooOOo2, new C25139OooOOOo());
        }
        return this.f87736OooO0oo;
    }

    public final AbstractC25682OooO0O0 OooO0o() {
        if (this.f87741OooOOO0 == null) {
            C25754OooOooo poolFactory = this.f87730OooO0O0.f87685OooOOOO;
            InterfaceC25762OooO0OO platformDecoder = OooO0oO();
            kotlin.jvm.internal.OooOOO0.OooO0oO(poolFactory, "poolFactory");
            kotlin.jvm.internal.OooOOO0.OooO0oO(platformDecoder, "platformDecoder");
            C25685OooO00o closeableReferenceFactory = this.f87731OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(closeableReferenceFactory, "closeableReferenceFactory");
            o00ooO0.OooOO0 oooOO0OooO00o = poolFactory.OooO00o();
            kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OooO00o, "getBitmapPool(...)");
            this.f87741OooOOO0 = new C25681OooO00o(oooOO0OooO00o, closeableReferenceFactory);
        }
        return this.f87741OooOOO0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 o00oo0Oo.OooOOo0, still in use, count: 3, list:
          (r2v0 o00oo0Oo.OooOOo0) from 0x0144: MOVE (r26v0 o00oo0Oo.OooOOo0) = (r2v0 o00oo0Oo.OooOOo0)
          (r2v0 o00oo0Oo.OooOOo0) from 0x0107: MOVE (r26v2 o00oo0Oo.OooOOo0) = (r2v0 o00oo0Oo.OooOOo0)
          (r2v0 o00oo0Oo.OooOOo0) from 0x00a0: MOVE (r26v4 o00oo0Oo.OooOOo0) = (r2v0 o00oo0Oo.OooOOo0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final o00oo0Oo.C25701OooOOo0 OooO0o0() {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00oo0Oo.C25703OooOo0.OooO0o0():o00oo0Oo.OooOOo0");
    }

    public final InterfaceC25762OooO0OO OooO0oO() {
        if (this.f87740OooOOO == null) {
            C25700OooOOo c25700OooOOo = this.f87730OooO0O0;
            C25754OooOooo poolFactory = c25700OooOOo.f87685OooOOOO;
            OooOo00 oooOo00 = c25700OooOOo.f87693OooOo0O;
            oooOo00.getClass();
            oooOo00.getClass();
            C25252OooO0Oo platformDecoderOptions = oooOo00.f87745OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(poolFactory, "poolFactory");
            kotlin.jvm.internal.OooOOO0.OooO0oO(platformDecoderOptions, "platformDecoderOptions");
            o00ooO0.OooOO0 oooOO0OooO00o = poolFactory.OooO00o();
            kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OooO00o, "getBitmapPool(...)");
            int i = poolFactory.f87891OooO00o.f87884OooO0OO.f87902OooO0Oo;
            Pools.SynchronizedPool synchronizedPool = new Pools.SynchronizedPool(i);
            for (int i2 = 0; i2 < i; i2++) {
                C25444OooO0O0.OooO00o oooO00o = C25444OooO0O0.f86726OooO00o;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16384);
                kotlin.jvm.internal.OooOOO0.OooO0o(byteBufferAllocate, "allocate(...)");
                synchronizedPool.release(byteBufferAllocate);
            }
            this.f87740OooOOO = new C25761OooO0O0(oooOO0OooO00o, synchronizedPool, platformDecoderOptions);
        }
        return this.f87740OooOOO;
    }
}
