package o0oOoOO0;

import com.orion.notein.domain.models.User;
import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0O0ooo0.EnumC26248OooOo0;
import o0OOOO0o.C27129OoooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33799OooOO0O;

/* JADX INFO: renamed from: o0oOoOO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.profile.NicknameViewModel$1", m80623f = "NicknameViewModel.kt", m80624l = {68}, m80625m = "invokeSuspend")
public final class C31017OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31019OooO0o f110737OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110738OooOo0o;

    /* JADX INFO: renamed from: o0oOoOO0.OooO0OO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C31019OooO0o f110739OooOo0o;

        public OooO00o(C31019OooO0o c31019OooO0o) {
            this.f110739OooOo0o = c31019OooO0o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            String nickname;
            C33781o00o0O c33781o00o0O;
            Object value;
            C31016OooO0O0 c31016OooO0O0;
            User user = (User) obj;
            C31019OooO0o c31019OooO0o = this.f110739OooOo0o;
            c31019OooO0o.f110752OooO0o0.setValue(user);
            if (user == null || (nickname = user.getNickname()) == null) {
                nickname = "";
            } else {
                if (nickname.length() <= 0) {
                    nickname = null;
                }
                if (nickname == null) {
                }
            }
            do {
                c33781o00o0O = c31019OooO0o.f110754OooO0oo;
                value = c33781o00o0O.getValue();
                c31016OooO0O0 = (C31016OooO0O0) value;
                if (!c31016OooO0O0.f110736OooO0Oo) {
                    c31016OooO0O0 = new C31016OooO0O0(nickname, EnumC26248OooOo0.f89694OooOo0o, R.string.account_setting_nickname_hint, false);
                }
            } while (!c33781o00o0O.OooO(value, c31016OooO0O0));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0oOoOO0.OooO0OO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.profile.NicknameViewModel$1$invokeSuspend$$inlined$flatMapLatest$1", m80623f = "NicknameViewModel.kt", m80624l = {190, 189}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super User>, String, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f110740OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f110741OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C31019OooO0o f110742OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f110743OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Continuation continuation, C31019OooO0o c31019OooO0o) {
            super(3, continuation);
            this.f110742OooOoO = c31019OooO0o;
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super User> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation, this.f110742OooOoO);
            oooO0O0.f110740OooOo = interfaceC33723OooO0oO;
            oooO0O0.f110743OooOoO0 = str;
            return oooO0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (o00o00O0.C25252OooO0Oo.OooOOO0(r1, (oO0o0Oo.InterfaceC33721OooO0o) r6, r5) == r0) goto L15;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f110741OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = this.f110740OooOo;
                String str = (String) this.f110743OooOoO0;
                C27129OoooOOO c27129OoooOOO = this.f110742OooOoO.f110750OooO0Oo;
                this.f110740OooOo = interfaceC33723OooO0oO;
                this.f110741OooOo0o = 1;
                obj = c27129OoooOOO.OooO0o0(str);
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
            interfaceC33723OooO0oO = this.f110740OooOo;
            C32446OooOOOo.OooO0O0(obj);
            this.f110740OooOo = null;
            this.f110741OooOo0o = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31017OooO0OO(Continuation continuation, C31019OooO0o c31019OooO0o) {
        super(2, continuation);
        this.f110737OooOo = c31019OooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31017OooO0OO(continuation, this.f110737OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31017OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110738OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C31019OooO0o c31019OooO0o = this.f110737OooOo;
            C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(c31019OooO0o.f110750OooO0Oo.OooO0OO(), new OooO0O0(null, c31019OooO0o));
            OooO00o oooO00o = new OooO00o(c31019OooO0o);
            this.f110738OooOo0o = 1;
            Object objCollect = c33799OooOO0OOooOoO.collect(new C31018OooO0Oo(oooO00o), this);
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == enumC32485OooO00o) {
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
