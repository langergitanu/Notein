package oO0o0Oo;

import Oooo0O0.C20945OoooO00;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24033OooOooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33742OooOoOO<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO<T> f121629OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24033OooOooo f121630OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f121631OooOoO0;

    /* JADX INFO: renamed from: oO0o0Oo.OooOoOO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", m80623f = "Limit.kt", m80624l = {58, 60}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C33742OooOoOO<T> f121632OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f121633OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f121634OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(C33742OooOoOO<? super T> c33742OooOoOO, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f121632OooOo = c33742OooOoOO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121633OooOo0o = obj;
            this.f121634OooOoO0 |= Integer.MIN_VALUE;
            return this.f121632OooOo.emit(null, this);
        }
    }

    public C33742OooOoOO(C24033OooOooo c24033OooOooo, InterfaceC33723OooO0oO interfaceC33723OooO0oO, Object obj) {
        this.f121630OooOo0o = c24033OooOooo;
        this.f121629OooOo = interfaceC33723OooO0oO;
        this.f121631OooOoO0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121634OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121634OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        }
        Object obj = oooO00o.f121633OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121634OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24033OooOooo c24033OooOooo = this.f121630OooOo0o;
            int i3 = c24033OooOooo.f80940OooOo0o + 1;
            c24033OooOooo.f80940OooOo0o = i3;
            InterfaceC33723OooO0oO<T> interfaceC33723OooO0oO = this.f121629OooOo;
            if (i3 >= 1) {
                oooO00o.f121634OooOoO0 = 2;
                C20945OoooO00.OooO00o(interfaceC33723OooO0oO, t, this.f121631OooOoO0, oooO00o);
                return enumC32485OooO00o;
            }
            oooO00o.f121634OooOoO0 = 1;
            if (interfaceC33723OooO0oO.emit(t, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
