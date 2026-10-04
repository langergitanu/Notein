package oO0o0Oo;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OoO.C33801OooOOO;

/* JADX INFO: renamed from: oO0o0Oo.o000oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33777o000oOoO implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f121775OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o[] f121776OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.o000oOoO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", m80623f = "Zip.kt", m80624l = {StyleIdentifier.COLORFUL_GRID_ACCENT_6, StyleIdentifier.COLORFUL_LIST_ACCENT_6}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<Object>, Object[], Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f121777OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121778OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ AbstractC32476OooO f121779OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object[] f121780OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Continuation continuation, oO0O000o.OooOo00 oooOo00) {
            super(3, continuation);
            this.f121779OooOoO = (AbstractC32476OooO) oooOo00;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOo00] */
        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Object[] objArr, Continuation<? super C32460OooOooO> continuation) {
            OooO00o oooO00o = new OooO00o(continuation, this.f121779OooOoO);
            oooO00o.f121777OooOo = interfaceC33723OooO0oO;
            oooO00o.f121780OooOoO0 = objArr;
            return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r1.emit(r13, r12) == r0) goto L15;
         */
        /* JADX WARN: Type inference failed for: r5v0, types: [oO00ooo.OooO, oO0O000o.OooOo00] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            OooO00o oooO00o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121778OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = this.f121777OooOo;
                Object[] objArr = this.f121780OooOoO0;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                Object obj6 = objArr[4];
                this.f121777OooOo = interfaceC33723OooO0oO;
                this.f121778OooOo0o = 1;
                oooO00o = this;
                obj = this.f121779OooOoO.Oooo0OO(obj2, obj3, obj4, obj5, obj6, oooO00o);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC33723OooO0oO = this.f121777OooOo;
            C32446OooOOOo.OooO0O0(obj);
            oooO00o = this;
            oooO00o.f121777OooOo = null;
            oooO00o.f121778OooOo0o = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33777o000oOoO(InterfaceC33721OooO0o[] interfaceC33721OooO0oArr, oO0O000o.OooOo00 oooOo00) {
        this.f121776OooOo0o = interfaceC33721OooO0oArr;
        this.f121775OooOo = (AbstractC32476OooO) oooOo00;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [oO00ooo.OooO, oO0O000o.OooOo00] */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation continuation) {
        Object objOooO00o = C33801OooOOO.OooO00o(continuation, C33765OoooOo0.f121745OooOo0o, new OooO00o(null, this.f121775OooOo), interfaceC33723OooO0oO, this.f121776OooOo0o);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }
}
