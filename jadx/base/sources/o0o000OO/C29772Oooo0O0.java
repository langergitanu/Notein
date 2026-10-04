package o0o000OO;

import com.orion.notein.domain.models.User;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o000OO.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29772Oooo0O0<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f105659OooOo0o;

    /* JADX INFO: renamed from: o0o000OO.Oooo0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$username$lambda$2$$inlined$map$1$2", m80623f = "TextAnnoViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f105660OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f105661OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f105661OooOo0o = obj;
            this.f105660OooOo |= Integer.MIN_VALUE;
            return C29772Oooo0O0.this.emit(null, this);
        }
    }

    public C29772Oooo0O0(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f105659OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        String nickname;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f105660OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f105660OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f105661OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f105660OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            User user = (User) obj;
            if (user == null || (nickname = user.getNickname()) == null) {
                nickname = "";
                oooO00o.f105660OooOo = 1;
                if (this.f105659OooOo0o.emit(nickname, oooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (nickname.length() == 0) {
                    nickname = user.getMobile();
                }
                if (nickname == null) {
                }
                oooO00o.f105660OooOo = 1;
                if (this.f105659OooOo0o.emit(nickname, oooO00o) == enumC32485OooO00o) {
                }
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
