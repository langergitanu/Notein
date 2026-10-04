package Oooo0;

import OooOoo.C20645o00o0O;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00Ooo.C25084OooOOoo;
import o00Ooo.InterfaceC25074OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", m80623f = "LongPressTextDragObserver.kt", m80624l = {98, 102}, m80625m = "invokeSuspend")
public final class o0O0O00 extends AbstractC32484OooO0oo implements InterfaceC32508OooOOOo<InterfaceC25074OooO0OO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f60234OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o00Ooo.OooOo00 f60235OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20865o00000oO f60236OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f60237OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(InterfaceC20865o00000oO interfaceC20865o00000oO, Continuation<? super o0O0O00> continuation) {
        super(2, continuation);
        this.f60236OooOoO = interfaceC20865o00000oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o0O0O00 o0o0o00 = new o0O0O00(this.f60236OooOoO, continuation);
        o0o0o00.f60237OooOoO0 = obj;
        return o0o0o00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC25074OooO0OO interfaceC25074OooO0OO, Continuation<? super C32460OooOooO> continuation) {
        return ((o0O0O00) create(interfaceC25074OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0051 -> B:17:0x0054). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC25074OooO0OO interfaceC25074OooO0OO;
        InterfaceC25074OooO0OO interfaceC25074OooO0OO2;
        o00Ooo.OooOo00 oooOo00;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f60234OooOo;
        InterfaceC20865o00000oO interfaceC20865o00000oO = this.f60236OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC25074OooO0OO = (InterfaceC25074OooO0OO) this.f60237OooOoO0;
            this.f60237OooOoO0 = interfaceC25074OooO0OO;
            this.f60234OooOo = 1;
            obj = C20645o00o0O.OooO00o(interfaceC25074OooO0OO, (3 & 1) != 0, o00Ooo.OooOOOO.f85129OooOo, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOo00 = this.f60235OooOo0o;
                interfaceC25074OooO0OO2 = (InterfaceC25074OooO0OO) this.f60237OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                List<o00Ooo.OooOo00> list = ((o00Ooo.OooOOO0) obj).f85127OooO00o;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    o00Ooo.OooOo00 oooOo002 = list.get(i2);
                    if (C25084OooOOoo.OooO00o(oooOo002.f85144OooO00o, oooOo00.f85144OooO00o) && oooOo002.f85147OooO0Oo) {
                        this.f60237OooOoO0 = interfaceC25074OooO0OO2;
                        this.f60235OooOo0o = oooOo00;
                        this.f60234OooOo = 2;
                        obj = interfaceC25074OooO0OO2.o00o0O(o00Ooo.OooOOOO.f85129OooOo, this);
                    }
                }
                interfaceC20865o00000oO.OooO0Oo();
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC25074OooO0OO = (InterfaceC25074OooO0OO) this.f60237OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
        }
        o00Ooo.OooOo00 oooOo003 = (o00Ooo.OooOo00) obj;
        long j = oooOo003.f85146OooO0OO;
        interfaceC20865o00000oO.OooO00o();
        interfaceC25074OooO0OO2 = interfaceC25074OooO0OO;
        oooOo00 = oooOo003;
        this.f60237OooOoO0 = interfaceC25074OooO0OO2;
        this.f60235OooOo0o = oooOo00;
        this.f60234OooOo = 2;
        obj = interfaceC25074OooO0OO2.o00o0O(o00Ooo.OooOOOO.f85129OooOo, this);
    }
}
