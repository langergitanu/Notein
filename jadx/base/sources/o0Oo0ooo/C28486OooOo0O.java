package o0Oo0ooo;

import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import o0OOOO0o.C27130OoooOOo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0ooo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.VerificationRequestViewModel$ensurePhoneIsAvailable$result$1", m80623f = "VerificationRequestViewModel.kt", m80624l = {181}, m80625m = "invokeSuspend")
public final class C28486OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends Integer>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f100933OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100934OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f100935OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28489OooOoO0 f100936OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f100937OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28486OooOo0O(C28489OooOoO0 c28489OooOoO0, String str, String str2, Continuation<? super C28486OooOo0O> continuation) {
        super(2, continuation);
        this.f100936OooOoO0 = c28489OooOoO0;
        this.f100935OooOoO = str;
        this.f100937OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28486OooOo0O c28486OooOo0O = new C28486OooOo0O(this.f100936OooOoO0, this.f100935OooOoO, this.f100937OooOoOO, continuation);
        c28486OooOo0O.f100933OooOo = obj;
        return c28486OooOo0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends Integer>> continuation) {
        return ((C28486OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100934OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C28489OooOoO0 c28489OooOoO0 = this.f100936OooOoO0;
                String str = this.f100935OooOoO;
                String str2 = this.f100937OooOoOO;
                C27129OoooOOO c27129OoooOOO = c28489OooOoO0.f100957OooO0o0;
                this.f100934OooOo0o = 1;
                c27129OoooOOO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27130OoooOOo(c27129OoooOOO, str, str2, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = new Integer(((Number) obj).intValue());
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        return new C32445OooOOOO(objOooO00o);
    }
}
