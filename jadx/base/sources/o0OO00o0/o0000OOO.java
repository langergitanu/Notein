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

/* JADX INFO: loaded from: classes9.dex */
public final class o0000OOO implements InterfaceC33721OooO0o<Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f91314OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f91315OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f91316OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f91317OooOo0o;

        /* JADX INFO: renamed from: o0OO00o0.o0000OOO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.GlobalSettingRepoImpl$getPenCorrectToLineSetting$$inlined$map$1$2", m80623f = "GlobalSettingRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19772OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f91318OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f91319OooOo0o;

            public C19772OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f91319OooOo0o = obj;
                this.f91318OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, AbstractC24338OooO0o0.OooO00o oooO00o) {
            this.f91317OooOo0o = interfaceC33723OooO0oO;
            this.f91316OooOo = oooO00o;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19772OooO00o c19772OooO00o;
            if (continuation instanceof C19772OooO00o) {
                c19772OooO00o = (C19772OooO00o) continuation;
                int i = c19772OooO00o.f91318OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19772OooO00o.f91318OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19772OooO00o = new C19772OooO00o(continuation);
                }
            }
            Object obj2 = c19772OooO00o.f91319OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19772OooO00o.f91318OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Boolean bool = (Boolean) ((AbstractC24338OooO0o0) obj).OooO0OO(this.f91316OooOo);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                c19772OooO00o.f91318OooOo = 1;
                if (this.f91317OooOo0o.emit(boolValueOf, c19772OooO00o) == enumC32485OooO00o) {
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

    public o0000OOO(InterfaceC33721OooO0o interfaceC33721OooO0o, AbstractC24338OooO0o0.OooO00o oooO00o) {
        this.f91315OooOo0o = interfaceC33721OooO0o;
        this.f91314OooOo = oooO00o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f91315OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f91314OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
