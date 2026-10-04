package OooOoo;

import Oooo0.C20892o0ooOO0;
import Oooo0.C20893o0ooOoO;
import OooooO0.C21290OooO0o0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o00Ooo.InterfaceC25074OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: OooOoo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m80623f = "DragGestureDetector.kt", m80624l = {235, 236, 241}, m80625m = "invokeSuspend")
public final class C20605OooOOo0 extends AbstractC32484OooO0oo implements InterfaceC32508OooOOOo<InterfaceC25074OooO0OO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f58956OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f58957OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C20892o0ooOO0 f58958OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0.o00oO0O f58959OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Oooo0.o0ooOOo f58960OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C20893o0ooOoO f58961OooOoo0;

    /* JADX INFO: renamed from: OooOoo.OooOOo0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<o00Ooo.OooOo00, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C20893o0ooOoO f58962OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C20893o0ooOoO c20893o0ooOoO) {
            super(1);
            this.f58962OooOo0o = c20893o0ooOoO;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(o00Ooo.OooOo00 oooOo00) {
            o00Ooo.OooOo00 it = oooOo00;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            this.f58962OooOo0o.invoke(it, new C21290OooO0o0(o00Ooo.OooOOO.OooO0oO(it, false)));
            it.OooO00o();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20605OooOOo0(Oooo0.o00oO0O o00oo0o, C20892o0ooOO0 c20892o0ooOO0, Oooo0.o0ooOOo o0ooooo2, C20893o0ooOoO c20893o0ooOoO, Continuation continuation) {
        super(2, continuation);
        this.f58959OooOoO0 = o00oo0o;
        this.f58958OooOoO = c20892o0ooOO0;
        this.f58960OooOoOO = o0ooooo2;
        this.f58961OooOoo0 = c20893o0ooOoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C20605OooOOo0 c20605OooOOo0 = new C20605OooOOo0(this.f58959OooOoO0, this.f58958OooOoO, this.f58960OooOoOO, this.f58961OooOoo0, continuation);
        c20605OooOOo0.f58956OooOo = obj;
        return c20605OooOOo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC25074OooO0OO interfaceC25074OooO0OO, Continuation<? super C32460OooOooO> continuation) {
        return ((C20605OooOOo0) create(interfaceC25074OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007b, B:35:0x0083, B:37:0x0091, B:39:0x00a2, B:41:0x00a6, B:46:0x00af, B:47:0x00b2, B:48:0x00b5, B:49:0x00bb, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:54:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007b, B:35:0x0083, B:37:0x0091, B:39:0x00a2, B:41:0x00a6, B:46:0x00af, B:47:0x00b2, B:48:0x00b5, B:49:0x00bb, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:54:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007b, B:35:0x0083, B:37:0x0091, B:39:0x00a2, B:41:0x00a6, B:46:0x00af, B:47:0x00b2, B:48:0x00b5, B:49:0x00bb, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:54:0x0009 }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC25074OooO0OO interfaceC25074OooO0OO;
        o00Ooo.OooOo00 oooOo00;
        InterfaceC25074OooO0OO interfaceC25074OooO0OO2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f58957OooOo0o;
        Oooo0.o0ooOOo o0ooooo2 = this.f58960OooOoOO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC25074OooO0OO = (InterfaceC25074OooO0OO) this.f58956OooOo;
                this.f58956OooOo = interfaceC25074OooO0OO;
                this.f58957OooOo0o = 1;
                obj = C20645o00o0O.OooO00o(interfaceC25074OooO0OO, (3 & 1) != 0, o00Ooo.OooOOOO.f85129OooOo, this);
                if (obj == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i == 2) {
                    interfaceC25074OooO0OO = (InterfaceC25074OooO0OO) this.f58956OooOo;
                    C32446OooOOOo.OooO0O0(obj);
                    oooOo00 = (o00Ooo.OooOo00) obj;
                    if (oooOo00 != null) {
                        this.f58959OooOoO0.invoke(new C21290OooO0o0(oooOo00.f85146OooO0OO));
                        long j = oooOo00.f85144OooO00o;
                        OooO00o oooO00o = new OooO00o(this.f58961OooOoo0);
                        this.f58956OooOo = interfaceC25074OooO0OO;
                        this.f58957OooOo0o = 3;
                        obj = C20601OooOO0o.OooO0OO(interfaceC25074OooO0OO, j, oooO00o, this);
                        if (obj != enumC32485OooO00o) {
                            interfaceC25074OooO0OO2 = interfaceC25074OooO0OO;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25074OooO0OO2 = (InterfaceC25074OooO0OO) this.f58956OooOo;
                C32446OooOOOo.OooO0O0(obj);
                if (((Boolean) obj).booleanValue()) {
                    o0ooooo2.invoke();
                } else {
                    List<o00Ooo.OooOo00> list = interfaceC25074OooO0OO2.o00Ooo().f85127OooO00o;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        o00Ooo.OooOo00 oooOo002 = list.get(i2);
                        kotlin.jvm.internal.OooOOO0.OooO0oO(oooOo002, "<this>");
                        if ((oooOo002.OooO0O0() || !oooOo002.f85150OooO0oO || oooOo002.f85147OooO0Oo) ? false : true) {
                            oooOo002.OooO00o();
                        }
                    }
                    this.f58958OooOoO.invoke();
                }
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC25074OooO0OO = (InterfaceC25074OooO0OO) this.f58956OooOo;
            C32446OooOOOo.OooO0O0(obj);
            long j2 = ((o00Ooo.OooOo00) obj).f85144OooO00o;
            this.f58956OooOo = interfaceC25074OooO0OO;
            this.f58957OooOo0o = 2;
            obj = C20601OooOO0o.OooO0O0(interfaceC25074OooO0OO, j2, this);
            if (obj != enumC32485OooO00o) {
                oooOo00 = (o00Ooo.OooOo00) obj;
                if (oooOo00 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        } catch (CancellationException e) {
            o0ooooo2.invoke();
            throw e;
        }
    }
}
