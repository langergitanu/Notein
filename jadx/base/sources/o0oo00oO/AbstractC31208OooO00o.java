package o0oo00oO;

import com.orion.notein.MainActivity;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0oo00oO.InterfaceC31214OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33703OooOOO0;
import oO0o0OOo.InterfaceC33701OooOO0o;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo00oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31208OooO00o implements InterfaceC31214OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC31213OooO0oO f111285OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public MainActivity.OooOO0O f111287OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap<InterfaceC31214OooO0oo.OooO0o, InterfaceC31214OooO0oo.C31216OooO0o0> f111286OooO0O0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33695OooO0o0 f111288OooO0Oo = C33703OooOOO0.OooO00o(100, 6, null);

    /* JADX INFO: renamed from: o0oo00oO.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.penkit.capabilities.BaseStylusEventCapability$1", m80623f = "BaseStylusEventCapability.kt", m80624l = {32, 41, 48}, m80625m = "invokeSuspend")
    public static final class C20164OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public InterfaceC31214OooO0oo.OooO0o f111289OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public InterfaceC33701OooOO0o f111290OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f111291OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public MainActivity.OooOO0O f111292OooOoO0;

        /* JADX INFO: renamed from: o0oo00oO.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.penkit.capabilities.BaseStylusEventCapability$1$1", m80623f = "BaseStylusEventCapability.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20165OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ InterfaceC31214OooO0oo.C31216OooO0o0 f111294OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC31214OooO0oo.OooO0OO f111295OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ InterfaceC31214OooO0oo.OooO0o f111296OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20165OooO00o(InterfaceC31214OooO0oo.OooO0OO oooO0OO, InterfaceC31214OooO0oo.C31216OooO0o0 c31216OooO0o0, InterfaceC31214OooO0oo.OooO0o oooO0o, Continuation<? super C20165OooO00o> continuation) {
                super(2, continuation);
                this.f111295OooOo0o = oooO0OO;
                this.f111294OooOo = c31216OooO0o0;
                this.f111296OooOoO0 = oooO0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C20165OooO00o(this.f111295OooOo0o, this.f111294OooOo, this.f111296OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C20165OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f111295OooOo0o.OooO00o(this.f111294OooOo, this.f111296OooOoO0);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C20164OooO00o(Continuation<? super C20164OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return AbstractC31208OooO00o.this.new C20164OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C20164OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r13, r14, r17) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0048, code lost:
        
            r2 = r11;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006a -> B:13:0x0048). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC33701OooOO0o oooO00o;
            InterfaceC31214OooO0oo.C31216OooO0o0 c31216OooO0o0OooO00o;
            InterfaceC33701OooOO0o interfaceC33701OooOO0o;
            InterfaceC31214OooO0oo.OooO0o oooO0o;
            MainActivity.OooOO0O oooOO0O;
            InterfaceC31214OooO0oo.C31216OooO0o0 c31216OooO0o0;
            Object objOooO00o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f111291OooOoO;
            AbstractC31208OooO00o abstractC31208OooO00o = AbstractC31208OooO00o.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33695OooO0o0 c33695OooO0o0 = abstractC31208OooO00o.f111288OooO0Oo;
                c33695OooO0o0.getClass();
                oooO00o = new C33695OooO0o0.OooO00o();
            } else if (i == 1) {
                oooO00o = this.f111290OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO00o = obj;
                if (((Boolean) objOooO00o).booleanValue()) {
                    return C32460OooOooO.f116667OooO00o;
                }
                oooO0o = (InterfaceC31214OooO0oo.OooO0o) oooO00o.next();
                MainActivity.OooOO0O oooOO0O2 = abstractC31208OooO00o.f111287OooO0OO;
                if (oooOO0O2 != null) {
                    this.f111290OooOo0o = oooO00o;
                    this.f111289OooOo = oooO0o;
                    this.f111292OooOoO0 = oooOO0O2;
                    this.f111291OooOoO = 2;
                    c31216OooO0o0OooO00o = abstractC31208OooO00o.f111286OooO0O0.get(oooO0o);
                    if (c31216OooO0o0OooO00o == null) {
                        c31216OooO0o0OooO00o = abstractC31208OooO00o.f111285OooO00o.OooO00o(oooO0o, this);
                    }
                    if (c31216OooO0o0OooO00o != enumC32485OooO00o) {
                        interfaceC33701OooOO0o = oooO00o;
                        oooOO0O = oooOO0O2;
                        c31216OooO0o0 = (InterfaceC31214OooO0oo.C31216OooO0o0) c31216OooO0o0OooO00o;
                        if (c31216OooO0o0 != null) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("BaseStylusEvent");
                c20358OooO00o.OooOO0O("No event listener registered, dropping stylus event: " + oooO0o, new Object[0]);
            } else if (i == 2) {
                oooOO0O = this.f111292OooOoO0;
                oooO0o = this.f111289OooOo;
                interfaceC33701OooOO0o = this.f111290OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c31216OooO0o0OooO00o = obj;
                c31216OooO0o0 = (InterfaceC31214OooO0oo.C31216OooO0o0) c31216OooO0o0OooO00o;
                if (c31216OooO0o0 != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("BaseStylusEvent");
                    c20358OooO00o2.OooOO0O("No action mapped for stylus event: " + oooO0o, new Object[0]);
                    oooO00o = interfaceC33701OooOO0o;
                } else {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("BaseStylusEvent");
                    c20358OooO00o3.OooO0o0("Received stylus event: " + oooO0o + ", mapped action: " + c31216OooO0o0, new Object[0]);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
                    C20165OooO00o c20165OooO00o = new C20165OooO00o(oooOO0O, c31216OooO0o0, oooO0o, null);
                    this.f111290OooOo0o = interfaceC33701OooOO0o;
                    this.f111289OooOo = null;
                    this.f111292OooOoO0 = null;
                    this.f111291OooOoO = 3;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO00o = this.f111290OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            this.f111290OooOo0o = oooO00o;
            this.f111289OooOo = null;
            this.f111292OooOoO0 = null;
            this.f111291OooOoO = 1;
            objOooO00o = oooO00o.OooO00o(this);
            if (objOooO00o != enumC32485OooO00o) {
                if (((Boolean) objOooO00o).booleanValue()) {
                }
            }
            return enumC32485OooO00o;
        }
    }

    public AbstractC31208OooO00o(InterfaceC31213OooO0oO interfaceC31213OooO0oO) {
        this.f111285OooO00o = interfaceC31213OooO0oO;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C20164OooO00o(null), 3);
    }

    @Override // o0oo00oO.InterfaceC31214OooO0oo
    public final void OooO0O0(MainActivity.OooOO0O oooOO0O) {
        this.f111287OooO0OO = oooOO0O;
    }

    public final void OooO0OO(InterfaceC31214OooO0oo.C31216OooO0o0 c31216OooO0o0, InterfaceC31214OooO0oo.OooO0o event) {
        OooOOO0.OooO0oO(event, "event");
        this.f111286OooO0O0.put(event, c31216OooO0o0);
    }
}
