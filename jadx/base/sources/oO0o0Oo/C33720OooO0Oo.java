package oO0o0Oo;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OoO.C33811OooOo0O;

/* JADX INFO: renamed from: oO0o0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33720OooO0Oo<T> implements InterfaceC33721OooO0o<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32508OooOOOo<Object, Object, Boolean> f121511OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33721OooO0o<T> f121512OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.OooO0Oo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<Object> f121513OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33720OooO0Oo<T> f121514OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO<T> f121515OooOoO0;

        /* JADX INFO: renamed from: oO0o0Oo.OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m80623f = "Distinct.kt", m80624l = {73}, m80625m = "emit")
        public static final class C20326OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f121516OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f121517OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public int f121518OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C20326OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C20326OooO00o> continuation) {
                super(continuation);
                this.f121516OooOo = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f121517OooOo0o = obj;
                this.f121518OooOoO0 |= Integer.MIN_VALUE;
                return this.f121516OooOo.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(C33720OooO0Oo<T> c33720OooO0Oo, C24034Oooo00O<Object> c24034Oooo00O, InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO) {
            this.f121514OooOo0o = c33720OooO0Oo;
            this.f121513OooOo = c24034Oooo00O;
            this.f121515OooOoO0 = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
            C20326OooO00o c20326OooO00o;
            if (continuation instanceof C20326OooO00o) {
                c20326OooO00o = (C20326OooO00o) continuation;
                int i = c20326OooO00o.f121518OooOoO0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20326OooO00o.f121518OooOoO0 = i - Integer.MIN_VALUE;
                } else {
                    c20326OooO00o = new C20326OooO00o(this, continuation);
                }
            }
            Object obj = c20326OooO00o.f121517OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20326OooO00o.f121518OooOoO0;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33720OooO0Oo<T> c33720OooO0Oo = this.f121514OooOo0o;
                c33720OooO0Oo.getClass();
                C24034Oooo00O<Object> c24034Oooo00O = this.f121513OooOo;
                Object obj2 = c24034Oooo00O.f80942OooOo0o;
                if (obj2 != C33811OooOo0O.f121897OooO00o && c33720OooO0Oo.f121511OooOo.invoke(obj2, t).booleanValue()) {
                    return C32460OooOooO.f116667OooO00o;
                }
                c24034Oooo00O.f80942OooOo0o = t;
                c20326OooO00o.f121518OooOoO0 = 1;
                if (this.f121515OooOoO0.emit(t, c20326OooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C33720OooO0Oo(InterfaceC32508OooOOOo interfaceC32508OooOOOo, InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f121512OooOo0o = interfaceC33721OooO0o;
        this.f121511OooOo = interfaceC32508OooOOOo;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
        c24034Oooo00O.f80942OooOo0o = (T) C33811OooOo0O.f121897OooO00o;
        Object objCollect = this.f121512OooOo0o.collect(new OooO00o(this, c24034Oooo00O, interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
