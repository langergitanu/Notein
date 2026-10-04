package o00O00oO;

import android.app.Activity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oo00o.InterfaceC34660OooO00o;

/* JADX INFO: renamed from: o00O00oO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", m80623f = "WindowInfoTrackerImpl.kt", m80624l = {63}, m80625m = "invokeSuspend")
public final class C24821OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super C24822OooOO0o>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f84179OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f84180OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Activity f84181OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f84182OooOoO0;

    /* JADX INFO: renamed from: o00O00oO.OooOO0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C24812OooO f84183OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f84184OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOO0O oooOO0O, C24812OooO c24812OooO) {
            super(0);
            this.f84184OooOo0o = oooOO0O;
            this.f84183OooOo = c24812OooO;
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            ((InterfaceC34660OooO00o) this.f84184OooOo0o.f84185OooO0O0).OooO00o(this.f84183OooOo);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24821OooOO0(OooOO0O oooOO0O, Activity activity, Continuation<? super C24821OooOO0> continuation) {
        super(2, continuation);
        this.f84182OooOoO0 = oooOO0O;
        this.f84181OooOoO = activity;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24821OooOO0 c24821OooOO0 = new C24821OooOO0(this.f84182OooOoO0, this.f84181OooOoO, continuation);
        c24821OooOO0.f84179OooOo = obj;
        return c24821OooOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super C24822OooOO0o> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C24821OooOO0) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f84180OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f84179OooOo;
            C24812OooO c24812OooO = new C24812OooO(interfaceC33712OooOo0O);
            OooOO0O oooOO0O = this.f84182OooOoO0;
            ((InterfaceC34660OooO00o) oooOO0O.f84185OooO0O0).OooO0O0(this.f84181OooOoO, new o0000OO0.OooO(), c24812OooO);
            OooO00o oooO00o = new OooO00o(oooOO0O, c24812OooO);
            this.f84180OooOo0o = 1;
            if (C33711OooOo00.OooO00o(interfaceC33712OooOo0O, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
