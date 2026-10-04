package o0Oo0ooo;

import com.orion.notein.domain.models.login.LoginInfo;
import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import o0OOOo0.C27174OooO0O0;
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
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0ooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.LoginViewModel$login$2", m80623f = "LoginViewModel.kt", m80624l = {85, 86, 87}, m80625m = "invokeSuspend")
public final class C28474OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<LoginInfo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C28477OooOOO0 f100883OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f100884OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f100885OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C27174OooO0O0 f100886OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C28477OooOOO0 f100887OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f100888OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f100889OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28474OooOO0O(C28477OooOOO0 c28477OooOOO0, int i, String str, Continuation<? super C28474OooOO0O> continuation) {
        super(2, continuation);
        this.f100887OooOoOO = c28477OooOOO0;
        this.f100889OooOoo0 = i;
        this.f100888OooOoo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28474OooOO0O(this.f100887OooOoOO, this.f100889OooOoo0, this.f100888OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<LoginInfo>> continuation) {
        return ((C28474OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C27174OooO0O0 c27174OooO0O0;
        Object obj2;
        LoginInfo loginInfo;
        String token;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100885OooOoO;
        int i2 = this.f100889OooOoo0;
        C28477OooOOO0 c28477OooOOO0 = this.f100887OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f100885OooOoO = 1;
            if (C28477OooOOO0.OooO0o0(c28477OooOOO0, i2, true, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                C27174OooO0O0 c27174OooO0O02 = (C27174OooO0O0) obj;
                this.f100884OooOo0o = obj;
                this.f100883OooOo = c28477OooOOO0;
                this.f100886OooOoO0 = c27174OooO0O02;
                this.f100885OooOoO = 3;
                if (C28477OooOOO0.OooO0o0(c28477OooOOO0, i2, false, this) != enumC32485OooO00o) {
                    c27174OooO0O0 = c27174OooO0O02;
                    obj2 = obj;
                    loginInfo = (LoginInfo) c27174OooO0O0.OooO0O0();
                    if (loginInfo != null) {
                    }
                    return obj2;
                }
                return enumC32485OooO00o;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27174OooO0O0 = this.f100886OooOoO0;
            c28477OooOOO0 = this.f100883OooOo;
            obj2 = this.f100884OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            loginInfo = (LoginInfo) c27174OooO0O0.OooO0O0();
            if (loginInfo != null) {
                if (loginInfo.getUser() == null || (token = loginInfo.getToken()) == null || token.length() == 0) {
                    loginInfo = null;
                }
                if (loginInfo != null) {
                    c28477OooOOO0.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C28464OooO(c28477OooOOO0, null), 3);
                }
            }
            return obj2;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27129OoooOOO c27129OoooOOO = c28477OooOOO0.f100896OooO0Oo;
        this.f100885OooOoO = 2;
        obj = c27129OoooOOO.OooO0o(i2, this.f100888OooOoo, this);
        if (obj != enumC32485OooO00o) {
            C27174OooO0O0 c27174OooO0O022 = (C27174OooO0O0) obj;
            this.f100884OooOo0o = obj;
            this.f100883OooOo = c28477OooOOO0;
            this.f100886OooOoO0 = c27174OooO0O022;
            this.f100885OooOoO = 3;
            if (C28477OooOOO0.OooO0o0(c28477OooOOO0, i2, false, this) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
