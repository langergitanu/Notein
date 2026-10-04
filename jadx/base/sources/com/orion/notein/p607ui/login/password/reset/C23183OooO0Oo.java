package com.orion.notein.p607ui.login.password.reset;

import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.password.reset.OooO0O0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0O0ooo0.EnumC26248OooOo0;
import o0OOOo0.C27174OooO0O0;
import o0oO0O00.C30780OooOO0O;
import o0oO0O00.C30781OooOO0o;
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

/* JADX INFO: renamed from: com.orion.notein.ui.login.password.reset.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.reset.SetPasswordViewModel$setNewPasswordBeforeLogin$1", m80623f = "SetPasswordViewModel.kt", m80624l = {106, 114, 124}, m80625m = "invokeSuspend")
public final class C23183OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30781OooOO0o f72530OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f72531OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f72532OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f72533OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f72534OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f72535OooOoo0;

    /* JADX INFO: renamed from: com.orion.notein.ui.login.password.reset.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.reset.SetPasswordViewModel$setNewPasswordBeforeLogin$1$response$1", m80623f = "SetPasswordViewModel.kt", m80624l = {107}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30781OooOO0o f72536OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72537OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f72538OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f72539OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f72540OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ String f72541OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C30781OooOO0o c30781OooOO0o, String str, String str2, String str3, String str4, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f72536OooOo = c30781OooOO0o;
            this.f72539OooOoO0 = str;
            this.f72538OooOoO = str2;
            this.f72540OooOoOO = str3;
            this.f72541OooOoo0 = str4;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f72536OooOo, this.f72539OooOoO0, this.f72538OooOoO, this.f72540OooOoOO, this.f72541OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72537OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C30781OooOO0o c30781OooOO0o = this.f72536OooOo;
            this.f72537OooOo0o = 1;
            Object objOooOO0O = c30781OooOO0o.f110058OooO0Oo.f94599OooO0Oo.OooOO0O(this.f72539OooOoO0, this.f72538OooOoO, this.f72540OooOoOO, this.f72541OooOoo0, this);
            return objOooOO0O == enumC32485OooO00o ? enumC32485OooO00o : objOooOO0O;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23183OooO0Oo(C30781OooOO0o c30781OooOO0o, String str, String str2, String str3, String str4, Continuation<? super C23183OooO0Oo> continuation) {
        super(2, continuation);
        this.f72530OooOo = c30781OooOO0o;
        this.f72533OooOoO0 = str;
        this.f72532OooOoO = str2;
        this.f72534OooOoOO = str3;
        this.f72535OooOoo0 = str4;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23183OooO0Oo(this.f72530OooOo, this.f72533OooOoO0, this.f72532OooOoO, this.f72534OooOoOO, this.f72535OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23183OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        if (r5.emit(r2, r21) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (r5.emit(r2, r21) == r1) goto L35;
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
        int i = this.f72531OooOo0o;
        C30781OooOO0o c30781OooOO0o = this.f72530OooOo;
        C33781o00o0O c33781o00o0O = c30781OooOO0o.f110060OooO0o0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C30780OooOO0O.OooO00o((C30780OooOO0O) value, null, false, true, EnumC26248OooOo0.f89694OooOo0o, null, 49)));
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(c30781OooOO0o, this.f72533OooOoO0, this.f72532OooOoO, this.f72534OooOoOO, this.f72535OooOoo0, null);
            this.f72531OooOo0o = 1;
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
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) objOooO0o;
        boolean z = c27174OooO0O0.f94862OooO00o;
        C33772OooooOo c33772OooooOo = c30781OooOO0o.f110061OooO0oO;
        if (z && OooOOO0.OooO0O0(c27174OooO0O0.OooO0O0(), Boolean.TRUE)) {
            do {
                value3 = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value3, C30780OooOO0O.OooO00o((C30780OooOO0O) value3, null, false, false, null, null, 57)));
            OooO0O0.C19227OooO0O0 c19227OooO0O0 = OooO0O0.C19227OooO0O0.f72519OooO00o;
            this.f72531OooOo0o = 2;
        } else {
            do {
                value2 = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value2, C30780OooOO0O.OooO00o((C30780OooOO0O) value2, null, this.f72533OooOoO0.length() > 0, false, EnumC26248OooOo0.f89694OooOo0o, new Integer(R.string.password_hint), 33)));
            OooO0O0.OooO00o oooO00o2 = new OooO0O0.OooO00o();
            this.f72531OooOo0o = 3;
        }
    }
}
