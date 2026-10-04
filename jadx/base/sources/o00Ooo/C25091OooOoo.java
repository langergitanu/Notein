package o00Ooo;

import kotlin.coroutines.Continuation;
import o00Ooo.C25093OooOooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o00Ooo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", m80623f = "SuspendingPointerInputFilter.kt", m80624l = {620, 621}, m80625m = "invokeSuspend")
public final class C25091OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f85168OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f85169OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C25093OooOooO.OooO00o<Object> f85170OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25091OooOoo(long j, C25093OooOooO.OooO00o<Object> oooO00o, Continuation<? super C25091OooOoo> continuation) {
        super(2, continuation);
        this.f85168OooOo = j;
        this.f85170OooOoO0 = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C25091OooOoo(this.f85168OooOo, this.f85170OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C25091OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (oO0o0OO.C33644OoooO0.OooO00o(1, r10) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f85169OooOo0o;
        long j = this.f85168OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f85169OooOo0o = 1;
            if (C33644OoooO0.OooO00o(j - 1, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            C33614OooOOO0 c33614OooOOO0 = this.f85170OooOoO0.f85186OooOoO0;
            if (c33614OooOOO0 != null) {
                c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(new C25081OooOOOo(j)));
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f85169OooOo0o = 2;
    }
}
