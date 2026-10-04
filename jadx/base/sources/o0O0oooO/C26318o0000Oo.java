package o0O0oooO;

import com.orion.notein.domain.models.User;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0O0oooO.o0000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26318o0000Oo<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f90198OooOo0o;

    /* JADX INFO: renamed from: o0O0oooO.o0000Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$noteinUser$lambda$3$$inlined$map$1$2", m80623f = "UserViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f90199OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f90200OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f90200OooOo0o = obj;
            this.f90199OooOo |= Integer.MIN_VALUE;
            return C26318o0000Oo.this.emit(null, this);
        }
    }

    public C26318o0000Oo(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f90198OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        String nickname;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f90199OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f90199OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f90200OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f90199OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            User userCopy$default = (User) obj;
            if (userCopy$default != null && ((nickname = userCopy$default.getNickname()) == null || nickname.length() == 0)) {
                userCopy$default = User.copy$default(userCopy$default, null, null, userCopy$default.getMobile(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283, null);
            }
            oooO00o.f90199OooOo = 1;
            if (this.f90198OooOo0o.emit(userCopy$default, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
