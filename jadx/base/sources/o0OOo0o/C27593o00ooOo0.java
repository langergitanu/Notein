package o0OOo0o;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOo0o.o00ooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27593o00ooOo0 implements InterfaceC33721OooO0o<C32443OooOOO<? extends NoteinFirebaseUser, ? extends FirebaseUserMembership>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteinFirebaseUser f96894OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f96895OooOo0o;

    /* JADX INFO: renamed from: o0OOo0o.o00ooOo0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteinFirebaseUser f96896OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f96897OooOo0o;

        /* JADX INFO: renamed from: o0OOo0o.o00ooOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.VipFeatureUseCase$whetherToAllowTheFeatureByGoogleBilling$lambda$3$$inlined$map$1$2", m80623f = "VipFeatureUseCase.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19866OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f96898OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f96899OooOo0o;

            public C19866OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f96899OooOo0o = obj;
                this.f96898OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, NoteinFirebaseUser noteinFirebaseUser) {
            this.f96897OooOo0o = interfaceC33723OooO0oO;
            this.f96896OooOo = noteinFirebaseUser;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19866OooO00o c19866OooO00o;
            if (continuation instanceof C19866OooO00o) {
                c19866OooO00o = (C19866OooO00o) continuation;
                int i = c19866OooO00o.f96898OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19866OooO00o.f96898OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19866OooO00o = new C19866OooO00o(continuation);
                }
            }
            Object obj2 = c19866OooO00o.f96899OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19866OooO00o.f96898OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                C32443OooOOO c32443OooOOO = new C32443OooOOO(this.f96896OooOo, (FirebaseUserMembership) obj);
                c19866OooO00o.f96898OooOo = 1;
                if (this.f96897OooOo0o.emit(c32443OooOOO, c19866OooO00o) == enumC32485OooO00o) {
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

    public C27593o00ooOo0(InterfaceC33721OooO0o interfaceC33721OooO0o, NoteinFirebaseUser noteinFirebaseUser) {
        this.f96895OooOo0o = interfaceC33721OooO0o;
        this.f96894OooOo = noteinFirebaseUser;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super C32443OooOOO<? extends NoteinFirebaseUser, ? extends FirebaseUserMembership>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f96895OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f96894OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
