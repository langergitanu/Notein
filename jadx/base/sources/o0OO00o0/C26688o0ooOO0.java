package o0OO00o0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO00o0.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26688o0ooOO0 implements InterfaceC33721OooO0o<Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f92141OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f92142OooOo0o;

    /* JADX INFO: renamed from: o0OO00o0.o0ooOO0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f92143OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f92144OooOo0o;

        /* JADX INFO: renamed from: o0OO00o0.o0ooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.GlobalSettingRepoImpl$getEnableColorInversion$$inlined$map$1$2", m80623f = "GlobalSettingRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19805OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f92145OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f92146OooOo0o;

            public C19805OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f92146OooOo0o = obj;
                this.f92145OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, AbstractC24338OooO0o0.OooO00o oooO00o) {
            this.f92144OooOo0o = interfaceC33723OooO0oO;
            this.f92143OooOo = oooO00o;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19805OooO00o c19805OooO00o;
            if (continuation instanceof C19805OooO00o) {
                c19805OooO00o = (C19805OooO00o) continuation;
                int i = c19805OooO00o.f92145OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19805OooO00o.f92145OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19805OooO00o = new C19805OooO00o(continuation);
                }
            }
            Object obj2 = c19805OooO00o.f92146OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19805OooO00o.f92145OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Boolean bool = (Boolean) ((AbstractC24338OooO0o0) obj).OooO0OO(this.f92143OooOo);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                c19805OooO00o.f92145OooOo = 1;
                if (this.f92144OooOo0o.emit(boolValueOf, c19805OooO00o) == enumC32485OooO00o) {
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

    public C26688o0ooOO0(InterfaceC33721OooO0o interfaceC33721OooO0o, AbstractC24338OooO0o0.OooO00o oooO00o) {
        this.f92142OooOo0o = interfaceC33721OooO0o;
        this.f92141OooOo = oooO00o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f92142OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f92141OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
