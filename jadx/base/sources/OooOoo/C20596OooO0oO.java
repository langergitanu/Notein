package OooOoo;

import OooOoOO.C20525OooOO0O;
import OooOoOO.C20527OooOOO;
import OooOoOO.C20529OooOOOO;
import OooOoOO.C20536OooOo0O;
import OooOoOO.C20562OoooOoO;
import OooOoOO.C20580ooOO;
import OooOoOO.InterfaceC20537OooOo0o;
import OooOoo.o00O0O;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24032OooOooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: OooOoo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", m80623f = "Scrollable.kt", m80624l = {545}, m80625m = "invokeSuspend")
public final class C20596OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Float>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f58898OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24032OooOooO f58899OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C20597OooO0oo f58900OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f58901OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o00O0O.OooO0O0 f58902OooOoOO;

    /* JADX INFO: renamed from: OooOoo.OooO0oO$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C20525OooOO0O<Float, C20529OooOOOO>, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ o00O0O.OooO0O0 f58903OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24032OooOooO f58904OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C20597OooO0oo f58905OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C24032OooOooO f58906OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24032OooOooO c24032OooOooO, o00O0O.OooO0O0 oooO0O0, C24032OooOooO c24032OooOooO2, C20597OooO0oo c20597OooO0oo) {
            super(1);
            this.f58904OooOo0o = c24032OooOooO;
            this.f58903OooOo = oooO0O0;
            this.f58906OooOoO0 = c24032OooOooO2;
            this.f58905OooOoO = c20597OooO0oo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(C20525OooOO0O<Float, C20529OooOOOO> c20525OooOO0O) {
            C20525OooOO0O<Float, C20529OooOOOO> animateDecay = c20525OooOO0O;
            kotlin.jvm.internal.OooOOO0.OooO0oO(animateDecay, "$this$animateDecay");
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = animateDecay.f58634OooO0o0;
            float fFloatValue = ((Number) parcelableSnapshotMutableState.getValue()).floatValue();
            C24032OooOooO c24032OooOooO = this.f58904OooOo0o;
            float f = fFloatValue - c24032OooOooO.f80939OooOo0o;
            float fOooO00o = this.f58903OooOo.OooO00o(f);
            c24032OooOooO.f80939OooOo0o = ((Number) parcelableSnapshotMutableState.getValue()).floatValue();
            this.f58906OooOoO0.f80939OooOo0o = ((Number) animateDecay.f58629OooO00o.OooO0O0().invoke(animateDecay.f58633OooO0o)).floatValue();
            if (Math.abs(f - fOooO00o) > 0.5f) {
                animateDecay.f58628OooO.setValue(Boolean.FALSE);
                animateDecay.f58632OooO0Oo.invoke();
            }
            this.f58905OooOoO.getClass();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20596OooO0oO(float f, C20597OooO0oo c20597OooO0oo, o00O0O.OooO0O0 oooO0O0, Continuation continuation) {
        super(2, continuation);
        this.f58901OooOoO0 = f;
        this.f58900OooOoO = c20597OooO0oo;
        this.f58902OooOoOO = oooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C20596OooO0oO(this.f58901OooOoO0, this.f58900OooOoO, this.f58902OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Float> continuation) {
        return ((C20596OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        float f;
        C24032OooOooO c24032OooOooO;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f58898OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            f = this.f58901OooOoO0;
            if (Math.abs(f) > 1.0f) {
                C24032OooOooO c24032OooOooO2 = new C24032OooOooO();
                c24032OooOooO2.f80939OooOo0o = f;
                C24032OooOooO c24032OooOooO3 = new C24032OooOooO();
                OooOoOO.o0OoOo0 o0oooo02 = C20580ooOO.f58832OooO00o;
                C20527OooOOO c20527OooOOO = new C20527OooOOO(o0oooo02, Float.valueOf(0.0f), new C20529OooOOOO(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                C20597OooO0oo c20597OooO0oo = this.f58900OooOoO;
                InterfaceC20537OooOo0o<Float> interfaceC20537OooOo0o = c20597OooO0oo.f58907OooO00o;
                OooO00o oooO00o = new OooO00o(c24032OooOooO3, this.f58902OooOoOO, c24032OooOooO2, c20597OooO0oo);
                this.f58899OooOo0o = c24032OooOooO2;
                this.f58898OooOo = 1;
                Object objOooO00o = C20562OoooOoO.OooO00o(c20527OooOOO, new C20536OooOo0O(interfaceC20537OooOo0o, o0oooo02, c20527OooOOO.f58637OooOo.getValue(), c20527OooOOO.f58640OooOoO0), Long.MIN_VALUE, oooO00o, this);
                if (objOooO00o != obj2) {
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO00o == obj2) {
                    return obj2;
                }
                c24032OooOooO = c24032OooOooO2;
            }
            return new Float(f);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c24032OooOooO = this.f58899OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        f = c24032OooOooO.f80939OooOo0o;
        return new Float(f);
    }
}
