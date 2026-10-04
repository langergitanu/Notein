package com.orion.notein.p607ui.login.password;

import androidx.lifecycle.o0OoOo0;
import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.login.LoginErrorCode;
import com.orion.notein.domain.models.login.LoginInfo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.password.OooO00o;
import com.orion.notein.p607ui.login.password.OooO0O0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOOo0.C27174OooO0O0;
import o0OOo0o.C27377o00000Oo;
import o0OOo0o.C27542o00o0oOO;
import o0OOo0o.C27543o00o0oOo;
import o0OoO0.C28517OooOOOo;
import o0OoO0.C28518OooOOo;
import o0OoO0.C28519OooOOo0;
import o0OoO0.C28520OooOOoo;
import o0OoO0.C28521OooOo0;
import o0OoO0.C28522OooOo0O;
import o0OoO0.OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33596OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.PasswordLoginViewModel$onLoginClicked$1", m80623f = "PasswordLoginViewModel.kt", m80624l = {107, 121, 141, 164, 179}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f72477OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOO0O f72478OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28522OooOo0O f72479OooOoO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.PasswordLoginViewModel$onLoginClicked$1$isPhoneValid$1", m80623f = "PasswordLoginViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f72480OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28522OooOo0O f72481OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C28522OooOo0O c28522OooOo0O, OooOO0O oooOO0O, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f72481OooOo0o = c28522OooOo0O;
            this.f72480OooOo = oooOO0O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f72481OooOo0o, this.f72480OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C27377o00000Oo c27377o00000Oo = this.f72481OooOo0o.f101115OooO0Oo;
            OooOO0O oooOO0O = this.f72480OooOo;
            return Boolean.valueOf(c27377o00000Oo.OooO00o(oooOO0O.f101094OooO00o, oooOO0O.f101095OooO0O0));
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.PasswordLoginViewModel$onLoginClicked$1$response$1", m80623f = "PasswordLoginViewModel.kt", m80624l = {122}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<LoginInfo>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C28522OooOo0O f72482OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72483OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f72484OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C28522OooOo0O c28522OooOo0O, OooOO0O oooOO0O, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f72482OooOo = c28522OooOo0O;
            this.f72484OooOoO0 = oooOO0O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f72482OooOo, this.f72484OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<LoginInfo>> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72483OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C28522OooOo0O c28522OooOo0O = this.f72482OooOo;
            OooOO0O oooOO0O = this.f72484OooOoO0;
            String str = oooOO0O.f101094OooO00o;
            this.f72483OooOo0o = 1;
            Object objOooO0oO = c28522OooOo0O.f101117OooO0o0.OooO0oO(str, oooOO0O.f101095OooO0O0, oooOO0O.f101097OooO0Oo, this);
            return objOooO0oO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(C28522OooOo0O c28522OooOo0O, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f72479OooOoO0 = c28522OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0OO(this.f72479OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (r9.emit(r15, r14) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0133, code lost:
    
        if (r9.emit(r0, r14) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0164, code lost:
    
        if (r9.emit(r15, r14) == r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        OooOO0O oooOO0O;
        C27174OooO0O0 c27174OooO0O0;
        boolean z;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f72477OooOo;
        C28522OooOo0O c28522OooOo0O = this.f72479OooOoO0;
        List listOooO0oO = null;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c28522OooOo0O.OooO0o0(new C28519OooOOo0());
            oooOO0O = (OooOO0O) c28522OooOo0O.f101119OooO0oo.getValue();
            if (C33599OooOo0O.Oooo0o0(oooOO0O.f101095OooO0O0)) {
                c28522OooOo0O.OooO0o0(new C27542o00o0oOO(1));
                return C32460OooOooO.f116667OooO00o;
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(c28522OooOo0O, oooOO0O, null);
            this.f72478OooOo0o = oooOO0O;
            this.f72477OooOo = 1;
            obj = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            oooOO0O = this.f72478OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3 && i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            c27174OooO0O0 = (C27174OooO0O0) obj;
            String errorCode = c27174OooO0O0.getErrorCode();
            Integer numOooOOO0 = errorCode == null ? C33596OooOOo0.OooOOO0(errorCode) : null;
            z = c27174OooO0O0.f94862OooO00o;
            C33772OooooOo c33772OooooOo = c28522OooOo0O.f101120OooOO0;
            if (z || numOooOOO0 == null || numOooOOO0.intValue() != 0) {
                if (!OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "10012") || OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), LoginErrorCode.ERROR_CODE_USER_NOT_EXIST)) {
                    c28522OooOo0O.OooO0o0(new C28520OooOOoo(0));
                } else if (OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "10016")) {
                    LoginInfo loginInfo = (LoginInfo) c27174OooO0O0.OooO0O0();
                    long j = 1;
                    if (loginInfo != null) {
                        long waitTime = loginInfo.getWaitTime() / ((long) 60000);
                        if (waitTime >= 1) {
                            j = waitTime;
                        }
                    }
                    final int i2 = (int) j;
                    c28522OooOo0O.OooO0o0(new InterfaceC32507OooOO0o() { // from class: o0OoO0.OooOo00
                        @Override // oO0O000o.InterfaceC32507OooOO0o
                        public final Object invoke(Object obj2) {
                            return OooOO0O.OooO00o((OooOO0O) obj2, null, null, null, null, false, new OooO00o.OooO0OO(i2), false, false, false, StyleIdentifier.LIST_TABLE_2_ACCENT_4);
                        }
                    });
                    OooO0O0.C19225OooO0O0 c19225OooO0O0 = new OooO0O0.C19225OooO0O0(R.string.retry_login_after_a_few_minutes, OooOo.OooO0oO(String.valueOf(i2)));
                    this.f72477OooOo = 4;
                } else {
                    c28522OooOo0O.OooO0o0(new C28521OooOo0());
                    String errorCode2 = c27174OooO0O0.getErrorCode();
                    if (errorCode2 != null) {
                        if (C33599OooOo0O.Oooo0o0(errorCode2)) {
                            errorCode2 = null;
                        }
                        if (errorCode2 != null) {
                            listOooO0oO = OooOo.OooO0oO(errorCode2);
                        }
                    }
                    if (listOooO0oO == null) {
                        listOooO0oO = C34434OooOoO.f123453OooOo0o;
                    }
                    OooO0O0.C19225OooO0O0 c19225OooO0O02 = new OooO0O0.C19225OooO0O0(R.string.network_error, listOooO0oO);
                    this.f72477OooOo = 5;
                }
                return C32460OooOooO.f116667OooO00o;
            }
            c28522OooOo0O.OooO0o0(new C28518OooOOo());
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c28522OooOo0O);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28517OooOOOo(c28522OooOo0O, null), 2);
            OooO0O0.OooO00o oooO00o2 = OooO0O0.OooO00o.f72474OooO00o;
            this.f72477OooOo = 3;
        }
        if (!((Boolean) obj).booleanValue()) {
            c28522OooOo0O.OooO0o0(new C27543o00o0oOo(1));
            return C32460OooOooO.f116667OooO00o;
        }
        C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O02 = ExecutorC33873OooO0O0.f122045OooOoO0;
        OooO0O0 oooO0O0 = new OooO0O0(c28522OooOo0O, oooOO0O, null);
        this.f72478OooOo0o = null;
        this.f72477OooOo = 2;
        obj = C33609OooO0oo.OooO0o(executorC33873OooO0O02, oooO0O0, this);
        if (obj != enumC32485OooO00o) {
            c27174OooO0O0 = (C27174OooO0O0) obj;
            String errorCode3 = c27174OooO0O0.getErrorCode();
            if (errorCode3 == null) {
            }
            z = c27174OooO0O0.f94862OooO00o;
            C33772OooooOo c33772OooooOo2 = c28522OooOo0O.f101120OooOO0;
            if (z) {
            }
            if (OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "10012")) {
                c28522OooOo0O.OooO0o0(new C28520OooOOoo(0));
            }
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }
}
