package o0O0oooO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0O0oooO.o000O0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26336o000O0oo implements InterfaceC33721OooO0o<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33781o00o0O f90352OooOo0o;

    /* JADX INFO: renamed from: o0O0oooO.o000O0oo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f90353OooOo0o;

        /* JADX INFO: renamed from: o0O0oooO.o000O0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$special$$inlined$map$7$2", m80623f = "UserViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19745OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f90354OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f90355OooOo0o;

            public C19745OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f90355OooOo0o = obj;
                this.f90354OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f90353OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19745OooO00o c19745OooO00o;
            if (continuation instanceof C19745OooO00o) {
                c19745OooO00o = (C19745OooO00o) continuation;
                int i = c19745OooO00o.f90354OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19745OooO00o.f90354OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19745OooO00o = new C19745OooO00o(continuation);
                }
            }
            Object obj2 = c19745OooO00o.f90355OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19745OooO00o.f90354OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                c19745OooO00o.f90354OooOo = 1;
                if (this.f90353OooOo0o.emit(boolValueOf, c19745OooO00o) == enumC32485OooO00o) {
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

    public C26336o000O0oo(C33781o00o0O c33781o00o0O) {
        this.f90352OooOo0o = c33781o00o0O;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
        this.f90352OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return EnumC32485OooO00o.f116726OooOo0o;
    }
}
