package o0OOooo;

import com.orion.notein.domain.models.User;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33799OooOO0O;

/* JADX INFO: renamed from: o0OOooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27978OooO0O0 implements InterfaceC33721OooO0o<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33799OooOO0O f99198OooOo0o;

    /* JADX INFO: renamed from: o0OOooo.OooO0O0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f99199OooOo0o;

        /* JADX INFO: renamed from: o0OOooo.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.user.ObservePremiumAccessUseCase$invoke$$inlined$map$1$2", m80623f = "ObservePremiumAccessUseCase.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19881OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f99200OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f99201OooOo0o;

            public C19881OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f99201OooOo0o = obj;
                this.f99200OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f99199OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19881OooO00o c19881OooO00o;
            if (continuation instanceof C19881OooO00o) {
                c19881OooO00o = (C19881OooO00o) continuation;
                int i = c19881OooO00o.f99200OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19881OooO00o.f99200OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19881OooO00o = new C19881OooO00o(continuation);
                }
            }
            Object obj2 = c19881OooO00o.f99201OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19881OooO00o.f99200OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                User user = (User) obj;
                boolean z = false;
                boolean zIsVip = user != null ? user.isVip() : false;
                boolean zIsFreeTrial = user != null ? user.isFreeTrial() : false;
                if (!zIsVip && !zIsFreeTrial) {
                    z = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                c19881OooO00o.f99200OooOo = 1;
                if (this.f99199OooOo0o.emit(boolValueOf, c19881OooO00o) == enumC32485OooO00o) {
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

    public C27978OooO0O0(C33799OooOO0O c33799OooOO0O) {
        this.f99198OooOo0o = c33799OooOO0O;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f99198OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
