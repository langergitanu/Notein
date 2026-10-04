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

/* JADX INFO: renamed from: o0OO00o0.o0000o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26534o0000o0O implements InterfaceC33721OooO0o<Float> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f91364OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f91365OooOo0o;

    /* JADX INFO: renamed from: o0OO00o0.o0000o0O$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f91366OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f91367OooOo0o;

        /* JADX INFO: renamed from: o0OO00o0.o0000o0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.GlobalSettingRepoImpl$getPenPressToEraserPressure$$inlined$map$1$2", m80623f = "GlobalSettingRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19778OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f91368OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f91369OooOo0o;

            public C19778OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f91369OooOo0o = obj;
                this.f91368OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, AbstractC24338OooO0o0.OooO00o oooO00o) {
            this.f91367OooOo0o = interfaceC33723OooO0oO;
            this.f91366OooOo = oooO00o;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19778OooO00o c19778OooO00o;
            if (continuation instanceof C19778OooO00o) {
                c19778OooO00o = (C19778OooO00o) continuation;
                int i = c19778OooO00o.f91368OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19778OooO00o.f91368OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19778OooO00o = new C19778OooO00o(continuation);
                }
            }
            Object obj2 = c19778OooO00o.f91369OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19778OooO00o.f91368OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Float f = (Float) ((AbstractC24338OooO0o0) obj).OooO0OO(this.f91366OooOo);
                Float f2 = new Float(f != null ? f.floatValue() : 0.5f);
                c19778OooO00o.f91368OooOo = 1;
                if (this.f91367OooOo0o.emit(f2, c19778OooO00o) == enumC32485OooO00o) {
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

    public C26534o0000o0O(InterfaceC33721OooO0o interfaceC33721OooO0o, AbstractC24338OooO0o0.OooO00o oooO00o) {
        this.f91365OooOo0o = interfaceC33721OooO0o;
        this.f91364OooOo = oooO00o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Float> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f91365OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f91364OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
