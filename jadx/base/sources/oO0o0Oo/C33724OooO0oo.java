package oO0o0Oo;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33724OooO0oo implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ List f121520OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.OooO0oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", m80623f = "Builders.kt", m80624l = {111}, m80625m = "collect")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121521OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f121522OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public InterfaceC33723OooO0oO f121523OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public Iterator f121525OooOoOO;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121522OooOo0o = obj;
            this.f121521OooOo |= Integer.MIN_VALUE;
            return C33724OooO0oo.this.collect(null, this);
        }
    }

    public C33724OooO0oo(List list) {
        this.f121520OooOo0o = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        Iterator it;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121521OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121521OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj = oooO00o.f121522OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121521OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
            it = this.f121520OooOo0o.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = oooO00o.f121525OooOoOO;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = oooO00o.f121523OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO3;
        }
        while (it.hasNext()) {
            Object next = it.next();
            oooO00o.f121523OooOoO = interfaceC33723OooO0oO2;
            oooO00o.f121525OooOoOO = it;
            oooO00o.f121521OooOo = 1;
            if (interfaceC33723OooO0oO2.emit(next, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
