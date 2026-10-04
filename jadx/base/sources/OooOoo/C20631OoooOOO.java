package OooOoo;

import OooOoOO.AbstractC20531OooOOo;
import OooOoOO.C20527OooOOO;
import OooOoOO.C20555OoooO0;
import OooOoOO.C20557OoooO0O;
import OooOoOO.C20562OoooOoO;
import OooOoOO.C20563OoooOoo;
import OooOoOO.C20580ooOO;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24032OooOooO;
import o00ooO0.C25751OooOoo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: OooOoo.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", m80623f = "ScrollExtensions.kt", m80624l = {41}, m80625m = "invokeSuspend")
public final class C20631OoooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC20633OoooOo0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f59091OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f59092OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C20555OoooO0 f59093OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f59094OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C24032OooOooO f59095OooOoOO;

    /* JADX INFO: renamed from: OooOoo.OoooOOO$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<Float, Float, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20633OoooOo0 f59096OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24032OooOooO f59097OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24032OooOooO c24032OooOooO, InterfaceC20633OoooOo0 interfaceC20633OoooOo0) {
            super(2);
            this.f59097OooOo0o = c24032OooOooO;
            this.f59096OooOo = interfaceC20633OoooOo0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(Float f, Float f2) {
            float fFloatValue = f.floatValue();
            f2.floatValue();
            C24032OooOooO c24032OooOooO = this.f59097OooOo0o;
            float f3 = c24032OooOooO.f80939OooOo0o;
            c24032OooOooO.f80939OooOo0o = this.f59096OooOo.OooO00o(fFloatValue - f3) + f3;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20631OoooOOO(float f, C20555OoooO0 c20555OoooO0, C24032OooOooO c24032OooOooO, Continuation continuation) {
        super(2, continuation);
        this.f59094OooOoO0 = f;
        this.f59093OooOoO = c20555OoooO0;
        this.f59095OooOoOO = c24032OooOooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C20631OoooOOO c20631OoooOOO = new C20631OoooOOO(this.f59094OooOoO0, this.f59093OooOoO, this.f59095OooOoOO, continuation);
        c20631OoooOOO.f59091OooOo = obj;
        return c20631OoooOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC20633OoooOo0 interfaceC20633OoooOo0, Continuation<? super C32460OooOooO> continuation) {
        return ((C20631OoooOOO) create(interfaceC20633OoooOo0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f59092OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooO00o oooO00o = new OooO00o(this.f59095OooOoOO, (InterfaceC20633OoooOo0) this.f59091OooOo);
            this.f59092OooOo0o = 1;
            OooOoOO.o0OoOo0 o0oooo02 = C20580ooOO.f58832OooO00o;
            Comparable f = new Float(0.0f);
            Float f2 = new Float(this.f59094OooOoO0);
            AbstractC20531OooOOo abstractC20531OooOOoOooO0OO = (AbstractC20531OooOOo) o0oooo02.f58815OooO00o.invoke((T) new Float(0.0f));
            if (abstractC20531OooOOoOooO0OO == null) {
                abstractC20531OooOOoOooO0OO = C25751OooOoo.OooO0OO((AbstractC20531OooOOo) o0oooo02.f58815OooO00o.invoke((T) f));
            }
            AbstractC20531OooOOo abstractC20531OooOOo = abstractC20531OooOOoOooO0OO;
            Object objOooO00o = C20562OoooOoO.OooO00o(new C20527OooOOO(o0oooo02, f, abstractC20531OooOOo, 56), new C20563OoooOoo(this.f59093OooOoO, o0oooo02, f, f2, abstractC20531OooOOo), Long.MIN_VALUE, new C20557OoooO0O(0, oooO00o, o0oooo02), this);
            if (objOooO00o != obj2) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != obj2) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
