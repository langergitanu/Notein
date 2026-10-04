package io.ktor.client.engine.cio;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0Oo0oOo.C28328OooOo0o;
import oO000o.InterfaceC32083OooO0oO;
import oO000oo0.C32137OooO00o;
import oO000oo0.C32138OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O0OOo.C32654OooO0O0;
import oO0Ooo0O.C33419OoooO0;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33662Ooooooo;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33623OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.C33880OooOO0;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends oO000o.OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C23932OooO0o0 f80352OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AbstractC33630OooOooO f80353OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final oO00OOo0.OooO0OO<String, C23938OooOOo0> f80354OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Set<InterfaceC32083OooO0oO<? extends Object>> f80355OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C23934OooO0oo f80356OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f80357OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f80358Oooo000;

    /* JADX INFO: renamed from: io.ktor.client.engine.cio.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.CIOEngine$1", m80623f = "CIOEngine.kt", m80624l = {68, 71, 71}, m80625m = "invokeSuspend")
    public static final class C19591OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f80359OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Throwable f80360OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C32654OooO0O0 f80361OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33672o00ooo f80362OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19591OooO00o(InterfaceC33672o00ooo interfaceC33672o00ooo, C32654OooO0O0 c32654OooO0O0, Continuation continuation) {
            super(2, continuation);
            this.f80362OooOoO0 = interfaceC33672o00ooo;
            this.f80361OooOoO = c32654OooO0O0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C19591OooO00o(this.f80362OooOoO0, this.f80361OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19591OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        
            if (((oO0o0OO.InterfaceC33672o00ooo) r9).join(r8) == r0) goto L26;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f80359OooOo;
            InterfaceC33672o00ooo.OooO00o oooO00o = InterfaceC33672o00ooo.OooO00o.f121379OooOo0o;
            C32654OooO0O0 c32654OooO0O0 = this.f80361OooOoO;
            InterfaceC34415OooO0oo interfaceC34415OooO0oo = c32654OooO0O0.f117342OooOoo;
            try {
            } catch (Throwable th) {
                c32654OooO0O0.close();
                InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = interfaceC34415OooO0oo.get(oooO00o);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
                this.f80360OooOo0o = th;
                this.f80359OooOo = 3;
                if (((InterfaceC33672o00ooo) oooO0O0).join(this) != enumC32485OooO00o) {
                    throw th;
                }
            }
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33672o00ooo interfaceC33672o00ooo = this.f80362OooOoO0;
                this.f80359OooOo = 1;
                if (interfaceC33672o00ooo.join(this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i == 2) {
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = this.f80360OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                throw th2;
            }
            C32446OooOOOo.OooO0O0(obj);
            c32654OooO0O0.close();
            InterfaceC34415OooO0oo.OooO0O0 oooO0O02 = interfaceC34415OooO0oo.get(oooO00o);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O02);
            this.f80359OooOo = 2;
        }
    }

    public OooO00o(C23932OooO0o0 c23932OooO0o0) {
        super("ktor-cio");
        this.f80352OooOoO = c23932OooO0o0;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0.f122045OooOoO0.getClass();
        AbstractC33630OooOooO abstractC33630OooOooOO000OOo0 = C33880OooOO0.f122052OooOoO0.o000OOo0(4);
        this.f80353OooOoOO = abstractC33630OooOooOO000OOo0;
        this.f80355OooOoo0 = oOo000Oo.OooOOO.OoooOo0(new InterfaceC32083OooO0oO[]{C33419OoooO0.f120809OooO0Oo, C32137OooO00o.f115235OooO00o, C32138OooO0O0.f115236OooO00o});
        this.f80354OooOoo = new oO00OOo0.OooO0OO<>();
        C32654OooO0O0 c32654OooO0O0 = new C32654OooO0O0(abstractC33630OooOooOO000OOo0);
        c23932OooO0o0.f80384OooO00o.getClass();
        this.f80356OooOooO = new C23934OooO0oo(c32654OooO0O0, c23932OooO0o0.f80386OooO0OO);
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooOOO0 = super.OooOOO0();
        InterfaceC33672o00ooo.OooO00o oooO00o = InterfaceC33672o00ooo.OooO00o.f121379OooOo0o;
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = interfaceC34415OooO0ooOooOOO0.get(oooO00o);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO00o = C28328OooOo0o.OooO00o((InterfaceC33672o00ooo) oooO0O0);
        this.f80357OooOooo = interfaceC34415OooO0ooOooO00o;
        this.f80358Oooo000 = interfaceC34415OooO0ooOooOOO0.plus(interfaceC34415OooO0ooOooO00o);
        InterfaceC34415OooO0oo.OooO0O0 oooO0O02 = interfaceC34415OooO0ooOooO00o.get(oooO00o);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O02);
        C33609OooO0oo.OooO0O0(C33662Ooooooo.f121350OooOo0o, interfaceC34415OooO0ooOooOOO0, EnumC33637Oooo0O0.f121319OooOoO0, new C19591OooO00o((InterfaceC33672o00ooo) oooO0O02, c32654OooO0O0, null));
    }

    @Override // oO000o.OooO0o, oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f80358Oooo000;
    }

    @Override // oO000o.OooO0o, oO000o.OooO0O0
    public final Set<InterfaceC32083OooO0oO<? extends Object>> OoooOOo() {
        return this.f80355OooOoo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x00d9
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // oO000o.OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OoooOo0(oO000oo.C32134OooO0o0 r11, oO00ooo.AbstractC32479OooO0OO r12) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.OooO00o.OoooOo0(oO000oo.OooO0o0, oO00ooo.OooO0OO):java.lang.Object");
    }

    @Override // oO000o.OooO0o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        Iterator<Map.Entry<String, C23938OooOOo0>> it = this.f80354OooOoo.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().close();
        }
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = this.f80357OooOooo.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO0O0, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((InterfaceC33623OooOo0O) oooO0O0).complete();
    }

    @Override // oO000o.OooO0O0
    public final AbstractC33630OooOooO o000O0oO() {
        return this.f80353OooOoOO;
    }
}
