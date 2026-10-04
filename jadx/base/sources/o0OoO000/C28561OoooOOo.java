package o0OoO000;

import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27315OooOooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO000.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseLoginViewModel$signUp$3", m80623f = "FirebaseLoginViewModel.kt", m80624l = {76, 77}, m80625m = "invokeSuspend")
public final class C28561OoooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28560OoooOOO f101236OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101237OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f101238OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f101239OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f101240OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f101241OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28561OoooOOo(C28560OoooOOO c28560OoooOOO, String str, String str2, String str3, String str4, Continuation<? super C28561OoooOOo> continuation) {
        super(2, continuation);
        this.f101236OooOo = c28560OoooOOO;
        this.f101239OooOoO0 = str;
        this.f101238OooOoO = str2;
        this.f101240OooOoOO = str3;
        this.f101241OooOoo0 = str4;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28561OoooOOo(this.f101236OooOo, this.f101239OooOoO0, this.f101238OooOoO, this.f101240OooOoOO, this.f101241OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28561OoooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (o0OoO000.C28560OoooOOO.OooO0o0(r2, (o0OOOo0.C27174OooO0O0) r11, r10) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C28561OoooOOo c28561OoooOOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101237OooOo0o;
        C28560OoooOOO c28560OoooOOO = this.f101236OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27315OooOooo interfaceC27315OooOooo = c28560OoooOOO.f101223OooO0Oo;
            this.f101237OooOo0o = 1;
            c28561OoooOOo = this;
            obj = interfaceC27315OooOooo.OooO00o(this.f101239OooOoO0, this.f101238OooOoO, this.f101240OooOoOO, this.f101241OooOoo0, c28561OoooOOo);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        c28561OoooOOo = this;
        c28561OoooOOo.f101237OooOo0o = 2;
    }
}
