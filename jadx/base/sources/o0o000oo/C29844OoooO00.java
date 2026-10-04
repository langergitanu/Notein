package o0o000oo;

import android.widget.ImageView;
import androidx.core.view.PointerIconCompat;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o000oo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initBtnUndoRedo$3", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29844OoooO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105867OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f105868OooOo0o;

    /* JADX INFO: renamed from: o0o000oo.OoooO00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initBtnUndoRedo$3$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {PointerIconCompat.TYPE_ZOOM_OUT}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ BaseToolbarChildFragment f105869OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105870OooOo0o;

        /* JADX INFO: renamed from: o0o000oo.OoooO00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20027OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f105871OooOo0o;

            public C20027OooO00o(BaseToolbarChildFragment baseToolbarChildFragment) {
                this.f105871OooOo0o = baseToolbarChildFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ImageView imageView = this.f105871OooOo0o.f76490Oooo0oO;
                if (imageView != null) {
                    imageView.setEnabled(zBooleanValue);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnRedo");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f105869OooOo = baseToolbarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f105869OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105870OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                BaseToolbarChildFragment baseToolbarChildFragment = this.f105869OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                C20027OooO00o c20027OooO00o = new C20027OooO00o(baseToolbarChildFragment);
                this.f105870OooOo0o = 1;
                if (Oooo0OO2.f73417o0000Ooo.f121747OooOo0o.collect(c20027OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    /* JADX INFO: renamed from: o0o000oo.OoooO00$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initBtnUndoRedo$3$2", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1024}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ BaseToolbarChildFragment f105872OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f105873OooOo0o;

        /* JADX INFO: renamed from: o0o000oo.OoooO00$OooO0O0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f105874OooOo0o;

            public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment) {
                this.f105874OooOo0o = baseToolbarChildFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ImageView imageView = this.f105874OooOo0o.f76488Oooo0o;
                if (imageView != null) {
                    imageView.setEnabled(zBooleanValue);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnUndo");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f105872OooOo = baseToolbarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f105872OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f105873OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                BaseToolbarChildFragment baseToolbarChildFragment = this.f105872OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                OooO00o oooO00o = new OooO00o(baseToolbarChildFragment);
                this.f105873OooOo0o = 1;
                if (Oooo0OO2.f73414o00000Oo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29844OoooO00(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C29844OoooO00> continuation) {
        super(2, continuation);
        this.f105867OooOo = baseToolbarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29844OoooO00 c29844OoooO00 = new C29844OoooO00(this.f105867OooOo, continuation);
        c29844OoooO00.f105868OooOo0o = obj;
        return c29844OoooO00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29844OoooO00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f105868OooOo0o;
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105867OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(baseToolbarChildFragment, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(baseToolbarChildFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
