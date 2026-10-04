package o0OO0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o implements InterfaceC33721OooO0o<String> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26436OooO0Oo f90800OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f90801OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f90802OooOoO0;

    /* JADX INFO: renamed from: o0OO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19752OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26436OooO0Oo f90803OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f90804OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f90805OooOoO0;

        /* JADX INFO: renamed from: o0OO0.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.analytics.AnalyticsRepoImpl$getStatsEventCount$$inlined$map$1$2", m80623f = "AnalyticsRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19753OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f90806OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f90807OooOo0o;

            public C19753OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f90807OooOo0o = obj;
                this.f90806OooOo |= Integer.MIN_VALUE;
                return C19752OooO00o.this.emit(null, this);
            }
        }

        public C19752OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C26436OooO0Oo c26436OooO0Oo, String str) {
            this.f90804OooOo0o = interfaceC33723OooO0oO;
            this.f90803OooOo = c26436OooO0Oo;
            this.f90805OooOoO0 = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19753OooO00o c19753OooO00o;
            if (continuation instanceof C19753OooO00o) {
                c19753OooO00o = (C19753OooO00o) continuation;
                int i = c19753OooO00o.f90806OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19753OooO00o.f90806OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19753OooO00o = new C19753OooO00o(continuation);
                }
            }
            Object obj2 = c19753OooO00o.f90807OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19753OooO00o.f90806OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                this.f90803OooOo.getClass();
                String strValueOf = String.valueOf(((AbstractC24338OooO0o0) obj).OooO0OO(C24340OooO0oo.OooO0Oo(this.f90805OooOoO0)));
                c19753OooO00o.f90806OooOo = 1;
                if (this.f90804OooOo0o.emit(strValueOf, c19753OooO00o) == enumC32485OooO00o) {
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

    public OooO00o(InterfaceC33721OooO0o interfaceC33721OooO0o, C26436OooO0Oo c26436OooO0Oo, String str) {
        this.f90801OooOo0o = interfaceC33721OooO0o;
        this.f90800OooOo = c26436OooO0Oo;
        this.f90802OooOoO0 = str;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f90801OooOo0o.collect(new C19752OooO00o(interfaceC33723OooO0oO, this.f90800OooOo, this.f90802OooOoO0), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
