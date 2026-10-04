package com.orion.notein.p607ui.login.verificationcode;

import com.orion.notein.p607ui.login.verificationcode.OooO00o;
import kotlin.coroutines.Continuation;
import o0ooOOO0.C31626OooO0o0;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneCodeLoginViewModel$onResendRequested$1", m80623f = "PhoneCodeLoginViewModel.kt", m80624l = {105, 110, 116}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f72624OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f72625OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C31626OooO0o0 f72626OooOoO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneCodeLoginViewModel$onResendRequested$1$success$1", m80623f = "PhoneCodeLoginViewModel.kt", m80624l = {106}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f72627OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72628OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C31626OooO0o0 f72629OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0OO oooO0OO, C31626OooO0o0 c31626OooO0o0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f72627OooOo = oooO0OO;
            this.f72629OooOoO0 = c31626OooO0o0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f72627OooOo, this.f72629OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72628OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            OooO0OO oooO0OO = this.f72627OooOo;
            C31626OooO0o0 c31626OooO0o0 = this.f72629OooOoO0;
            String str = c31626OooO0o0.f113059OooO00o;
            String str2 = c31626OooO0o0.f113060OooO0O0;
            this.f72628OooOo0o = 1;
            Object objOooOO0 = oooO0OO.f72631OooO0Oo.OooOO0(str, str2, this);
            return objOooOO0 == enumC32485OooO00o ? enumC32485OooO00o : objOooOO0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO0OO oooO0OO, C31626OooO0o0 c31626OooO0o0, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f72624OooOo = oooO0OO;
        this.f72626OooOoO0 = c31626OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f72624OooOo, this.f72626OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r8.emit(r2, r17) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (r8.emit(r2, r17) == r1) goto L28;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objOooO0o;
        Object value2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f72625OooOo0o;
        OooO0OO oooO0OO = this.f72624OooOo;
        C33781o00o0O c33781o00o0O = oooO0OO.f72635OooO0oo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C31626OooO0o0.OooO00o((C31626OooO0o0) value, null, false, false, null, 60, true, 63)));
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(oooO0OO, this.f72626OooOoO0, null);
            this.f72625OooOo0o = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                OooO0OO.OooO0oO(oooO0OO);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o = obj;
        boolean zBooleanValue = ((Boolean) objOooO0o).booleanValue();
        C33772OooooOo c33772OooooOo = oooO0OO.f72636OooOO0;
        if (zBooleanValue) {
            OooO00o.C19238OooO00o c19238OooO00o = OooO00o.C19238OooO00o.f72621OooO00o;
            this.f72625OooOo0o = 2;
        } else {
            do {
                value2 = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value2, C31626OooO0o0.OooO00o((C31626OooO0o0) value2, null, false, false, null, 0, false, 127)));
            OooO00o.OooO0OO oooO0OO2 = new OooO00o.OooO0OO();
            this.f72625OooOo0o = 3;
        }
        return enumC32485OooO00o;
    }
}
