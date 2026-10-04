package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33747Oooo implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.data.repo.transactions.o000oOoO f121653OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.Oooo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f121654OooOo0o;

        /* JADX INFO: renamed from: oO0o0Oo.Oooo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m80623f = "Transform.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20329OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f121655OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f121656OooOo0o;

            public C20329OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f121656OooOo0o = obj;
                this.f121655OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f121654OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
            C20329OooO00o c20329OooO00o;
            if (continuation instanceof C20329OooO00o) {
                c20329OooO00o = (C20329OooO00o) continuation;
                int i = c20329OooO00o.f121655OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20329OooO00o.f121655OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20329OooO00o = new C20329OooO00o(continuation);
                }
            }
            Object obj = c20329OooO00o.f121656OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20329OooO00o.f121655OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (t != null) {
                    c20329OooO00o.f121655OooOo = 1;
                    if (this.f121654OooOo0o.emit(t, c20329OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
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

    public C33747Oooo(com.orion.notein.data.repo.transactions.o000oOoO o000oooo2) {
        this.f121653OooOo0o = o000oooo2;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f121653OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
