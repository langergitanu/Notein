package oO0o0Oo;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OoO.C33801OooOOO;

/* JADX INFO: renamed from: oO0o0Oo.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33758OoooO implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f121702OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o[] f121703OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.OoooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m80623f = "Zip.kt", m80624l = {StyleIdentifier.COLORFUL_GRID_ACCENT_6, StyleIdentifier.COLORFUL_LIST_ACCENT_6}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<Object>, Object[], Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f121704OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121705OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ Object f121706OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object[] f121707OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Continuation continuation, InterfaceC32509OooOOo interfaceC32509OooOOo) {
            super(3, continuation);
            this.f121706OooOoO = interfaceC32509OooOOo;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oO0O000o.OooOOo] */
        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Object[] objArr, Continuation<? super C32460OooOooO> continuation) {
            OooO00o oooO00o = new OooO00o(continuation, this.f121706OooOoO);
            oooO00o.f121704OooOo = interfaceC33723OooO0oO;
            oooO00o.f121707OooOoO0 = objArr;
            return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, oO0O000o.OooOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121705OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = this.f121704OooOo;
                Object[] objArr = this.f121707OooOoO0;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f121704OooOo = interfaceC33723OooO0oO;
                this.f121705OooOo0o = 1;
                obj = this.f121706OooOoO.invoke(obj2, obj3, obj4, this);
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
            interfaceC33723OooO0oO = this.f121704OooOo;
            C32446OooOOOo.OooO0O0(obj);
            this.f121704OooOo = null;
            this.f121705OooOo0o = 2;
        }
    }

    public C33758OoooO(InterfaceC33721OooO0o[] interfaceC33721OooO0oArr, InterfaceC32509OooOOo interfaceC32509OooOOo) {
        this.f121703OooOo0o = interfaceC33721OooO0oArr;
        this.f121702OooOo = interfaceC32509OooOOo;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, oO0O000o.OooOOo] */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation continuation) {
        Object objOooO00o = C33801OooOOO.OooO00o(continuation, C33765OoooOo0.f121745OooOo0o, new OooO00o(null, this.f121702OooOo), interfaceC33723OooO0oO, this.f121703OooOo0o);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }
}
