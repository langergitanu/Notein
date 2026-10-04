package o0o00oO;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o00oO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29973OooOo0 implements InterfaceC33721OooO0o<Integer> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29970OooOOo f106466OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f106467OooOo0o;

    /* JADX INFO: renamed from: o0o00oO.OooOo0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29970OooOOo f106468OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f106469OooOo0o;

        /* JADX INFO: renamed from: o0o00oO.OooOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateViewModel$special$$inlined$map$1$2", m80623f = "TranslateViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20033OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f106470OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f106471OooOo0o;

            public C20033OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f106471OooOo0o = obj;
                this.f106470OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C29970OooOOo c29970OooOOo) {
            this.f106469OooOo0o = interfaceC33723OooO0oO;
            this.f106468OooOo = c29970OooOOo;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20033OooO00o c20033OooO00o;
            int iIntValue;
            if (continuation instanceof C20033OooO00o) {
                c20033OooO00o = (C20033OooO00o) continuation;
                int i = c20033OooO00o.f106470OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20033OooO00o.f106470OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20033OooO00o = new C20033OooO00o(continuation);
                }
            }
            Object obj2 = c20033OooO00o.f106471OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20033OooO00o.f106470OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Integer num = (Integer) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95014OooOOO0);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    this.f106468OooOo.getClass();
                    iIntValue = 0;
                }
                Integer num2 = new Integer(iIntValue);
                c20033OooO00o.f106470OooOo = 1;
                if (this.f106469OooOo0o.emit(num2, c20033OooO00o) == enumC32485OooO00o) {
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

    public C29973OooOo0(InterfaceC33721OooO0o interfaceC33721OooO0o, C29970OooOOo c29970OooOOo) {
        this.f106467OooOo0o = interfaceC33721OooO0o;
        this.f106466OooOo = c29970OooOOo;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f106467OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f106466OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
