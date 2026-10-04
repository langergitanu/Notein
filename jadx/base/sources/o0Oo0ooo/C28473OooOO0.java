package o0Oo0ooo;

import androidx.fragment.app.ActivityC21897OooOo0;
import com.hihonor.cloudservice.support.account.request.SignInOptions;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO00o0.o000Oo0;
import o0OOOO0o.C27096OooO0Oo;
import o0OOOO0o.C27099OooO0oo;
import o0OOOO0o.C27129OoooOOO;
import o0OOOO0o.C27147o0ooOO0;
import o0OOOO0o.C27148o0ooOoO;
import o0OOOO0o.o000000;
import o0OOOO0o.o00000O0;
import o0OOOO0o.o0O0O00;
import o0OOOo0.C27174OooO0O0;
import o0Oo00oO.C28035OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0ooo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.LoginViewModel$authorize$2", m80623f = "LoginViewModel.kt", m80624l = {76, 77}, m80625m = "invokeSuspend")
public final class C28473OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super InterfaceC33721OooO0o<? extends C27174OooO0O0<AuthorizeInfo>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28477OooOOO0 f100876OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100877OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ActivityC21897OooOo0 f100878OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f100879OooOoO0;

    /* JADX INFO: renamed from: o0Oo0ooo.OooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.LoginViewModel$authorize$2$1", m80623f = "LoginViewModel.kt", m80624l = {78}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C27174OooO0O0<AuthorizeInfo>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C28477OooOOO0 f100880OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f100881OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f100882OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C28477OooOOO0 c28477OooOOO0, int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f100880OooOo = c28477OooOOO0;
            this.f100882OooOoO0 = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f100880OooOo, this.f100882OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C27174OooO0O0<AuthorizeInfo> c27174OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c27174OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f100881OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f100881OooOo0o = 1;
                if (C28477OooOOO0.OooO0o0(this.f100880OooOo, this.f100882OooOoO0, false, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28473OooOO0(C28477OooOOO0 c28477OooOOO0, int i, ActivityC21897OooOo0 activityC21897OooOo0, Continuation continuation) {
        super(2, continuation);
        this.f100876OooOo = c28477OooOOO0;
        this.f100879OooOoO0 = i;
        this.f100878OooOoO = activityC21897OooOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28473OooOO0(this.f100876OooOo, this.f100879OooOoO0, this.f100878OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super InterfaceC33721OooO0o<? extends C27174OooO0O0<AuthorizeInfo>>> continuation) {
        return ((C28473OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        if (r10 == r2) goto L29;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100877OooOo0o;
        int i2 = this.f100879OooOoO0;
        C28477OooOOO0 c28477OooOOO0 = this.f100876OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f100877OooOo0o = 1;
            if (C28477OooOOO0.OooO0o0(c28477OooOOO0, i2, true, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return new o000Oo0((InterfaceC33721OooO0o) obj, new OooO00o(c28477OooOOO0, i2, null), 1);
        }
        C32446OooOOOo.OooO0O0(obj);
        C27129OoooOOO c27129OoooOOO = c28477OooOOO0.f100896OooO0Oo;
        this.f100877OooOo0o = 2;
        if (i2 == 0) {
            C27099OooO0oo c27099OooO0oo = c27129OoooOOO.f94601OooO0o0;
            c27099OooO0oo.getClass();
            obj = C25252OooO0Oo.OooO0o0(new C27096OooO0Oo(c27099OooO0oo, null));
        } else if (i2 == 1) {
            o0O0O00 o0o0o00 = c27129OoooOOO.f94600OooO0o;
            o0o0o00.getClass();
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("notein", strValueOf);
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = o0o0o00.f94738OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(abstractApplicationC26277OooOoOO, "<this>");
            obj = C28035OooO00o.OooO0O0(abstractApplicationC26277OooOoOO, "com.tencent.mm") ? C25252OooO0Oo.OooO0o0(new C27147o0ooOO0(strOooO00o, o0o0o00, null)) : C25252OooO0Oo.OooO0o0(new C27148o0ooOoO(o0o0o00, strOooO00o, strValueOf, null));
        } else if (i2 == 2) {
            o0OOOO0o.OooOOOO oooOOOO = c27129OoooOOO.f94602OooO0oO;
            oooOOOO.getClass();
            SignInOptions signInOptions = SignInOptions.DEFAULT_AUTH_REQUEST_PARAM;
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            hashSet.addAll(signInOptions.f68827OooOo0o);
            hashSet2.addAll(signInOptions.f68826OooOo);
            obj = C25252OooO0Oo.OooO0o0(new o0OOOO0o.OooOO0O(oooOOOO, new SignInOptions(new ArrayList(hashSet), new ArrayList(hashSet2), "104421645"), null));
        } else {
            if (i2 != 3) {
                c27129OoooOOO.getClass();
                throw new IllegalArgumentException("invalid login type");
            }
            o00000O0 o00000o02 = c27129OoooOOO.f94603OooO0oo;
            ActivityC21897OooOo0 activityC21897OooOo0 = this.f100878OooOoO;
            o00000o02.getClass();
            C33770OooooO0 c33770OooooO0 = new C33770OooooO0(new o000000(activityC21897OooOo0, o00000o02, null));
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C25252OooO0Oo.OooOo0O(c33770OooooO0, ExecutorC33873OooO0O0.f122045OooOoO0);
        }
    }
}
