package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.transition.C22102OooOOo;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o00O00oO.C24821OooOO0;
import o00O00oO.C24822OooOO0o;
import o00O00oO.InterfaceC24813OooO00o;
import o00O00oO.InterfaceC24815OooO0OO;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33718OooO0O0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", m80623f = "FoldingFeatureObserver.kt", m80624l = {97}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ androidx.slidingpanelayout.widget.OooO0O0 f66229OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f66230OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Activity f66231OooOoO0;

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19039OooO00o implements InterfaceC33723OooO0oO<InterfaceC24815OooO0OO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ androidx.slidingpanelayout.widget.OooO0O0 f66232OooOo0o;

        public C19039OooO00o(androidx.slidingpanelayout.widget.OooO0O0 oooO0O0) {
            this.f66232OooOo0o = oooO0O0;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(InterfaceC24815OooO0OO interfaceC24815OooO0OO, Continuation<? super C32460OooOooO> continuation) {
            C32460OooOooO c32460OooOooO;
            InterfaceC24815OooO0OO interfaceC24815OooO0OO2 = interfaceC24815OooO0OO;
            SlidingPaneLayout.OooO00o oooO00o = this.f66232OooOo0o.f66243OooO0Oo;
            if (oooO00o == null) {
                c32460OooOooO = null;
            } else {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f66266OoooO0 = interfaceC24815OooO0OO2;
                androidx.transition.OooO0O0 oooO0O0 = new androidx.transition.OooO0O0();
                oooO0O0.setDuration(300L);
                oooO0O0.setInterpolator(PathInterpolatorCompat.create(0.2f, 0.0f, 0.0f, 1.0f));
                C22102OooOOo.OooO00o(slidingPaneLayout, oooO0O0);
                slidingPaneLayout.requestLayout();
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            return c32460OooOooO == EnumC32485OooO00o.f116726OooOo0o ? c32460OooOooO : C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 implements InterfaceC33721OooO0o<InterfaceC24815OooO0OO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ androidx.slidingpanelayout.widget.OooO0O0 f66233OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f66234OooOo0o;

        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public static final class C19040OooO00o implements InterfaceC33723OooO0oO<C24822OooOO0o> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ androidx.slidingpanelayout.widget.OooO0O0 f66235OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f66236OooOo0o;

            /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.OooO00o$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", m80623f = "FoldingFeatureObserver.kt", m80624l = {138}, m80625m = "emit")
            public static final class C19041OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f66237OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f66238OooOo0o;

                public C19041OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f66238OooOo0o = obj;
                    this.f66237OooOo |= Integer.MIN_VALUE;
                    return C19040OooO00o.this.emit(null, this);
                }
            }

            public C19040OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, androidx.slidingpanelayout.widget.OooO0O0 oooO0O0) {
                this.f66236OooOo0o = interfaceC33723OooO0oO;
                this.f66235OooOo = oooO0O0;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(C24822OooOO0o c24822OooOO0o, Continuation continuation) {
                C19041OooO00o c19041OooO00o;
                Object next;
                if (continuation instanceof C19041OooO00o) {
                    c19041OooO00o = (C19041OooO00o) continuation;
                    int i = c19041OooO00o.f66237OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19041OooO00o.f66237OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19041OooO00o = new C19041OooO00o(continuation);
                    }
                }
                Object obj = c19041OooO00o.f66238OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19041OooO00o.f66237OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f66235OooOo.getClass();
                    Iterator it = ((Iterable) c24822OooOO0o.f84186OooO00o).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((InterfaceC24813OooO00o) next) instanceof InterfaceC24815OooO0OO) {
                            break;
                        }
                    }
                    InterfaceC24815OooO0OO interfaceC24815OooO0OO = next instanceof InterfaceC24815OooO0OO ? (InterfaceC24815OooO0OO) next : null;
                    if (interfaceC24815OooO0OO != null) {
                        c19041OooO00o.f66237OooOo = 1;
                        if (this.f66236OooOo0o.emit(interfaceC24815OooO0OO, c19041OooO00o) == enumC32485OooO00o) {
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

        public OooO0O0(InterfaceC33721OooO0o interfaceC33721OooO0o, androidx.slidingpanelayout.widget.OooO0O0 oooO0O0) {
            this.f66234OooOo0o = interfaceC33721OooO0o;
            this.f66233OooOo = oooO0O0;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super InterfaceC24815OooO0OO> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f66234OooOo0o.collect(new C19040OooO00o(interfaceC33723OooO0oO, this.f66233OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(androidx.slidingpanelayout.widget.OooO0O0 oooO0O0, Activity activity, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f66229OooOo = oooO0O0;
        this.f66231OooOoO0 = activity;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f66229OooOo, this.f66231OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f66230OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            androidx.slidingpanelayout.widget.OooO0O0 oooO0O0 = this.f66229OooOo;
            C33718OooO0O0 c33718OooO0O0OooO0o0 = C25252OooO0Oo.OooO0o0(new C24821OooOO0(oooO0O0.f66240OooO00o, this.f66231OooOoO0, null));
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0o = C25252OooO0Oo.OooOO0o(new OooO0O0(C25252OooO0Oo.OooOo0O(c33718OooO0O0OooO0o0, C33833OooOOOO.f121946OooO00o), oooO0O0));
            C19039OooO00o c19039OooO00o = new C19039OooO00o(oooO0O0);
            this.f66230OooOo0o = 1;
            if (interfaceC33721OooO0oOooOO0o.collect(c19039OooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
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
