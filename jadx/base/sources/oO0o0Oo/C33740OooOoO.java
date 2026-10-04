package oO0o0Oo;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24033OooOooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OoO.C33790OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33740OooOoO implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f121621OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.OooOoO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", m80623f = "Limit.kt", m80624l = {112}, m80625m = "collect")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121622OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f121623OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Object f121624OooOoO;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121623OooOo0o = obj;
            this.f121622OooOo |= Integer.MIN_VALUE;
            return C33740OooOoO.this.collect(null, this);
        }
    }

    public C33740OooOoO(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f121621OooOo0o = interfaceC33721OooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        C33790OooO00o e;
        Object obj;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121622OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121622OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f121623OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121622OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            Object obj3 = new Object();
            C24033OooOooo c24033OooOooo = new C24033OooOooo();
            try {
                InterfaceC33721OooO0o interfaceC33721OooO0o = this.f121621OooOo0o;
                C33742OooOoOO c33742OooOoOO = new C33742OooOoOO(c24033OooOooo, interfaceC33723OooO0oO, obj3);
                oooO00o.f121624OooOoO = obj3;
                oooO00o.f121622OooOo = 1;
                if (interfaceC33721OooO0o.collect(c33742OooOoOO, oooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } catch (C33790OooO00o e2) {
                e = e2;
                obj = obj3;
                if (e.f121821OooOo0o != obj) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = oooO00o.f121624OooOoO;
            try {
                C32446OooOOOo.OooO0O0(obj2);
            } catch (C33790OooO00o e3) {
                e = e3;
                if (e.f121821OooOo0o != obj) {
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
