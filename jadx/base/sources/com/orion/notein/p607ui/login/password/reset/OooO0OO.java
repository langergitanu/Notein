package com.orion.notein.p607ui.login.password.reset;

import com.orion.notein.domain.models.User;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.password.reset.OooO0O0;
import kotlin.coroutines.Continuation;
import o0O0ooo0.EnumC26248OooOo0;
import o0OOOO0o.C27129OoooOOO;
import o0OOOO0o.o000oOoO;
import o0oO0O00.C30780OooOO0O;
import o0oO0O00.C30781OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.reset.SetPasswordViewModel$setNewPasswordAfterLogin$1", m80623f = "SetPasswordViewModel.kt", m80624l = {183, 197, 207}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30781OooOO0o f72520OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f72521OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f72522OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f72523OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f72524OooOoOO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.reset.SetPasswordViewModel$setNewPasswordAfterLogin$1$success$1", m80623f = "SetPasswordViewModel.kt", m80624l = {188, 190}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30781OooOO0o f72525OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72526OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f72527OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f72528OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f72529OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C30781OooOO0o c30781OooOO0o, String str, String str2, String str3, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f72525OooOo = c30781OooOO0o;
            this.f72528OooOoO0 = str;
            this.f72527OooOoO = str2;
            this.f72529OooOoOO = str3;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f72525OooOo, this.f72528OooOoO0, this.f72527OooOoO, this.f72529OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72526OooOo0o;
            C30781OooOO0o c30781OooOO0o = this.f72525OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27129OoooOOO c27129OoooOOO = c30781OooOO0o.f110058OooO0Oo;
                String strOooO0Oo = c27129OoooOOO.OooO0Oo();
                if (C33599OooOo0O.Oooo0o0(strOooO0Oo)) {
                    return Boolean.FALSE;
                }
                this.f72526OooOo0o = 1;
                c27129OoooOOO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000oOoO(c27129OoooOOO, strOooO0Oo, null), this);
                if (obj != enumC32485OooO00o) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            User user = (User) obj;
            if (user == null) {
                return Boolean.FALSE;
            }
            String region = user.getRegion();
            if (region == null) {
                region = "86";
            }
            String mobile = user.getMobile();
            this.f72526OooOo0o = 2;
            Object objOooOO0O = c30781OooOO0o.f110058OooO0Oo.OooOO0O(this.f72528OooOoO0, this.f72527OooOoO, region, mobile, this.f72529OooOoOO, this);
            return objOooOO0O == enumC32485OooO00o ? enumC32485OooO00o : objOooOO0O;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(C30781OooOO0o c30781OooOO0o, String str, String str2, String str3, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f72520OooOo = c30781OooOO0o;
        this.f72523OooOoO0 = str;
        this.f72522OooOoO = str2;
        this.f72524OooOoOO = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0OO(this.f72520OooOo, this.f72523OooOoO0, this.f72522OooOoO, this.f72524OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r3.emit(r2, r20) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (r3.emit(r2, r20) == r1) goto L33;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objOooO0o;
        Object value2;
        Object value3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f72521OooOo0o;
        C30781OooOO0o c30781OooOO0o = this.f72520OooOo;
        C33781o00o0O c33781o00o0O = c30781OooOO0o.f110060OooO0o0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C30780OooOO0O.OooO00o((C30780OooOO0O) value, null, false, true, EnumC26248OooOo0.f89694OooOo0o, null, 49)));
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(c30781OooOO0o, this.f72523OooOoO0, this.f72522OooOoO, this.f72524OooOoOO, null);
            this.f72521OooOo0o = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o = obj;
        boolean zBooleanValue = ((Boolean) objOooO0o).booleanValue();
        C33772OooooOo c33772OooooOo = c30781OooOO0o.f110061OooO0oO;
        if (zBooleanValue) {
            do {
                value3 = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value3, C30780OooOO0O.OooO00o((C30780OooOO0O) value3, null, false, false, null, null, 57)));
            OooO0O0.C19227OooO0O0 c19227OooO0O0 = OooO0O0.C19227OooO0O0.f72519OooO00o;
            this.f72521OooOo0o = 2;
        } else {
            do {
                value2 = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value2, C30780OooOO0O.OooO00o((C30780OooOO0O) value2, null, this.f72523OooOoO0.length() > 0, false, EnumC26248OooOo0.f89694OooOo0o, new Integer(R.string.password_hint), 33)));
            OooO0O0.OooO00o oooO00o2 = new OooO0O0.OooO00o();
            this.f72521OooOo0o = 3;
        }
    }
}
