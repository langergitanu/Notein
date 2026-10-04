package o0oOoOO0;

import com.orion.notein.domain.models.User;
import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import o0O0ooo0.EnumC26248OooOo0;
import o0OOOO0o.C27129OoooOOO;
import o0OOOO0o.o00Oo0;
import o0OOOooO.C27268OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOoOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.profile.NicknameViewModel$submitNickname$1", m80623f = "NicknameViewModel.kt", m80624l = {99, 106, 110, 128}, m80625m = "invokeSuspend")
public final class C31020OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31019OooO0o f110755OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110756OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31020OooO0o0(Continuation continuation, C31019OooO0o c31019OooO0o) {
        super(2, continuation);
        this.f110755OooOo = c31019OooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31020OooO0o0(continuation, this.f110755OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31020OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r12.emit(r15, r14) == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        if (r12.emit(r1, r14) != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
    
        if (r12.emit(r15, r14) == r0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[LOOP:0: B:31:0x009d->B:49:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        Object value;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110756OooOo0o;
        C31019OooO0o c31019OooO0o = this.f110755OooOo;
        int i2 = R.string.nick_name_is_illegal;
        C33781o00o0O c33781o00o0O = c31019OooO0o.f110754OooO0oo;
        C33772OooooOo c33772OooooOo = c31019OooO0o.f110751OooO0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = ((C31016OooO0O0) c33781o00o0O.getValue()).f110733OooO00o;
            if (str.length() > 14 || !C31019OooO0o.f110748OooOO0.matcher(str).matches()) {
                C31019OooO0o.OooO0o0(c31019OooO0o, R.string.nick_name_is_illegal);
                C27268OooO0O0 c27268OooO0O0 = new C27268OooO0O0(0, -2);
                this.f110756OooOo0o = 1;
            } else {
                User user = (User) c31019OooO0o.f110752OooO0o0.getValue();
                if (user == null) {
                    C31019OooO0o.OooO0o0(c31019OooO0o, R.string.network_error);
                    C27268OooO0O0 c27268OooO0O02 = new C27268OooO0O0(0, -1);
                    this.f110756OooOo0o = 2;
                } else {
                    user.getId();
                    this.f110756OooOo0o = 3;
                    C27129OoooOOO c27129OoooOOO = c31019OooO0o.f110750OooO0Oo;
                    c27129OoooOOO.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00Oo0(c27129OoooOOO, str, null), this);
                    if (obj != enumC32485OooO00o) {
                        iIntValue = ((Number) obj).intValue();
                        if (iIntValue != 0) {
                        }
                        C27268OooO0O0 c27268OooO0O03 = new C27268OooO0O0(0, iIntValue);
                        this.f110756OooOo0o = 4;
                    }
                }
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        if (i == 2) {
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        iIntValue = ((Number) obj).intValue();
        if (iIntValue != 0) {
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C31016OooO0O0.OooO00o((C31016OooO0O0) value, EnumC26248OooOo0.f89694OooOo0o, R.string.account_setting_nickname_hint, false)));
        } else {
            if (iIntValue != -2) {
                i2 = R.string.network_error;
            }
            C31019OooO0o.OooO0o0(c31019OooO0o, i2);
        }
        C27268OooO0O0 c27268OooO0O032 = new C27268OooO0O0(0, iIntValue);
        this.f110756OooOo0o = 4;
    }
}
