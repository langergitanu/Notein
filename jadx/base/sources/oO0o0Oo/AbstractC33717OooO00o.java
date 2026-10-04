package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OoO.C33808OooOo;

/* JADX INFO: renamed from: oO0o0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33717OooO00o<T> implements InterfaceC33721OooO0o<T> {

    /* JADX INFO: renamed from: oO0o0Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.AbstractFlow", m80623f = "Flow.kt", m80624l = {226}, m80625m = "collect")
    public static final class C20325OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f121501OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C33808OooOo f121502OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f121503OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ AbstractC33717OooO00o<T> f121504OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20325OooO00o(AbstractC33717OooO00o<T> abstractC33717OooO00o, Continuation<? super C20325OooO00o> continuation) {
            super(continuation);
            this.f121504OooOoO0 = abstractC33717OooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121501OooOo = obj;
            this.f121503OooOoO |= Integer.MIN_VALUE;
            return this.f121504OooOoO0.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v5, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        C20325OooO00o c20325OooO00o;
        Throwable th;
        C33808OooOo c33808OooOo;
        if (continuation instanceof C20325OooO00o) {
            c20325OooO00o = (C20325OooO00o) continuation;
            int i = c20325OooO00o.f121503OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c20325OooO00o.f121503OooOoO = i - Integer.MIN_VALUE;
            } else {
                c20325OooO00o = new C20325OooO00o(this, continuation);
            }
        }
        Object obj = c20325OooO00o.f121501OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c20325OooO00o.f121503OooOoO;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33808OooOo = c20325OooO00o.f121502OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                c33808OooOo.releaseIntercepted();
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th2) {
                th = th2;
                c33808OooOo.releaseIntercepted();
                throw th;
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        C33808OooOo c33808OooOo2 = new C33808OooOo(interfaceC33723OooO0oO, c20325OooO00o.getContext());
        try {
            c20325OooO00o.f121502OooOo0o = c33808OooOo2;
            c20325OooO00o.f121503OooOoO = 1;
            Object objInvoke = ((C33770OooooO0) this).f121748OooOo0o.invoke(c33808OooOo2, c20325OooO00o);
            if (objInvoke != obj2) {
                objInvoke = C32460OooOooO.f116667OooO00o;
            }
            if (objInvoke == obj2) {
                return obj2;
            }
            c33808OooOo = c33808OooOo2;
            c33808OooOo.releaseIntercepted();
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th3) {
            th = th3;
            c33808OooOo = c33808OooOo2;
            c33808OooOo.releaseIntercepted();
            throw th;
        }
    }
}
