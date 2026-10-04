package com.orion.notein.p607ui.noteeditor.propertypanel.p608ai;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.domain.models.p605ai.NoteSummary;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorSummaryFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.StatusDisplayView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24564OooO00o;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o00o00Oo.C25256OooO00o;
import o0OOOo0.C27174OooO0O0;
import o0Oo00o.C28026OooO0OO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0Ooo.ViewOnClickListenerC28134OooO;
import o0Oo0ooO.ViewOnClickListenerC28426OooOo0;
import o0Oo0ooO.ViewOnClickListenerC28427OooOo00;
import o0OoOO00.ViewOnClickListenerC29007OooOo0;
import o0Ooo.C29264OooOOO;
import o0Oooo.C29597OooO0oo;
import o0Oooo.OooOo00;
import o0oOoOo.C31050OooOo00;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/ai/EditorSummaryFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class EditorSummaryFragment extends Hilt_EditorSummaryFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f75538OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f75539OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TextView f75540OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f75541OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f75542Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ViewGroup f75543Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ViewGroup f75544Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f75545Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f75546Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f75547Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public StatusDisplayView f75548Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f75549Oooo0o0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75550OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75550OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75550OooOo0o.getValue()).getViewModelStore();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$generateSummary$1", m80623f = "EditorSummaryFragment.kt", m80624l = {215}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75552OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C33163OooO0oO f75553OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ boolean f75554OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, C33163OooO0oO c33163OooO0oO, Continuation continuation) {
            super(2, continuation);
            this.f75554OooOoO0 = z;
            this.f75553OooOoO = c33163OooO0oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorSummaryFragment.this.new OooO00o(this.f75554OooOoO0, this.f75553OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<NoteSummary> list;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75552OooOo0o;
            EditorSummaryFragment editorSummaryFragment = EditorSummaryFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO00o.C23517OooO0Oo c23517OooO0Oo = new OooO00o.C23517OooO0Oo(OooO00o.OooO0OO.OooO0o.f75652OooO00o, null, null);
                StatusDisplayView statusDisplayView = editorSummaryFragment.f75548Oooo0o;
                if (statusDisplayView == null) {
                    OooOOO0.OooOOOO("statusDisplayView");
                    throw null;
                }
                statusDisplayView.setStatueMessage(c23517OooO0Oo);
                com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00oOooOoOO = editorSummaryFragment.OooOoOO();
                this.f75552OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29597OooO0oo(oooO00oOooOoOO, this.f75554OooOoO0, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) obj;
            C31050OooOo00 c31050OooOo00 = (C31050OooOo00) editorSummaryFragment.OooOoOO().f75610OooOo0O.f121747OooOo0o.getValue();
            boolean z = (c31050OooOo00 == null || (list = c31050OooOo00.f110856OooO0O0) == null || !(list.isEmpty() ^ true)) ? false : true;
            if (OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "400008") && editorSummaryFragment.OooOoOO().f75616OooOoo0.get()) {
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorSummaryFragment), new C24564OooO00o(R.id.action_noteEditorContainerFragment_to_aiQuotaPayDialogFragment));
            }
            if (c27174OooO0O0.f94862OooO00o) {
                StatusDisplayView statusDisplayView2 = editorSummaryFragment.f75548Oooo0o;
                if (statusDisplayView2 == null) {
                    OooOOO0.OooOOOO("statusDisplayView");
                    throw null;
                }
                statusDisplayView2.setStatueMessage(null);
            } else if (z) {
                Context contextRequireContext = editorSummaryFragment.requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C25206OooO0Oo.OooO0OO(this.f75553OooOoO, C25256OooO00o.OooO0o(contextRequireContext, c27174OooO0O0.getErrorCode(), editorSummaryFragment.OooOoOO().OooOO0O()));
            } else {
                Context contextRequireContext2 = editorSummaryFragment.requireContext();
                OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                OooO00o.C23517OooO0Oo c23517OooO0Oo2 = new OooO00o.C23517OooO0Oo(OooO00o.OooO0OO.C23516OooO0o0.f75653OooO00o, c27174OooO0O0.getErrorCode(), C25256OooO00o.OooO0o(contextRequireContext2, c27174OooO0O0.getErrorCode(), editorSummaryFragment.OooOoOO().OooOO0O()));
                StatusDisplayView statusDisplayView3 = editorSummaryFragment.f75548Oooo0o;
                if (statusDisplayView3 == null) {
                    OooOOO0.OooOOOO("statusDisplayView");
                    throw null;
                }
                statusDisplayView3.setStatueMessage(c23517OooO0Oo2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 implements StatusDisplayView.OooO00o {
        public OooO0O0() {
        }

        @Override // com.orion.notein.ui.noteeditor.propertypanel.ai.StatusDisplayView.OooO00o
        public final void OooO00o() {
            com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00oOooOoOO = EditorSummaryFragment.this.OooOoOO();
            oooO00oOooOoOO.OooOO0();
            oooO00oOooOoOO.OooOOO(OooO00o.OooO0O0.C19357OooO00o.f75642OooO00o, null);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$onViewCreated$8", m80623f = "EditorSummaryFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f75557OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$onViewCreated$8$1", m80623f = "EditorSummaryFragment.kt", m80624l = {132}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorSummaryFragment f75558OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75559OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19348OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorSummaryFragment f75560OooOo0o;

                public C19348OooO00o(EditorSummaryFragment editorSummaryFragment) {
                    this.f75560OooOo0o = editorSummaryFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    this.f75560OooOo0o.OooOoOO().OooOO0o((String) obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorSummaryFragment editorSummaryFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75558OooOo = editorSummaryFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f75558OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75559OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorSummaryFragment editorSummaryFragment = this.f75558OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.OooO0OO) editorSummaryFragment.f75538OooOoo.getValue();
                    C19348OooO00o c19348OooO00o = new C19348OooO00o(editorSummaryFragment);
                    this.f75559OooOo0o = 1;
                    if (oooO0OO.f73397OoooOoo.f121747OooOo0o.collect(c19348OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$onViewCreated$8$2", m80623f = "EditorSummaryFragment.kt", m80624l = {138}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorSummaryFragment f75561OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75562OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorSummaryFragment f75563OooOo0o;

                public OooO00o(EditorSummaryFragment editorSummaryFragment) {
                    this.f75563OooOo0o = editorSummaryFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    EditorSummaryFragment editorSummaryFragment = this.f75563OooOo0o;
                    editorSummaryFragment.OooOoOO().f75616OooOoo0.set(zBooleanValue);
                    if (zBooleanValue) {
                        editorSummaryFragment.OooOoOO().OooOO0o((String) ((com.orion.notein.p607ui.noteeditor.OooO0OO) editorSummaryFragment.f75538OooOoo.getValue()).f73397OoooOoo.f121747OooOo0o.getValue());
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(EditorSummaryFragment editorSummaryFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f75561OooOo = editorSummaryFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f75561OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75562OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorSummaryFragment editorSummaryFragment = this.f75561OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.OooO0OO) editorSummaryFragment.f75538OooOoo.getValue();
                    OooO00o oooO00o = new OooO00o(editorSummaryFragment);
                    this.f75562OooOo0o = 1;
                    if (oooO0OO.f73407o00000.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$OooO0OO$OooO0OO, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$onViewCreated$8$3", m80623f = "EditorSummaryFragment.kt", m80624l = {147}, m80625m = "invokeSuspend")
        public static final class C19349OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorSummaryFragment f75564OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75565OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$OooO0OO$OooO0OO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$onViewCreated$8$3$1", m80623f = "EditorSummaryFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C31050OooOo00, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorSummaryFragment f75566OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75567OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorSummaryFragment editorSummaryFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75566OooOo = editorSummaryFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75566OooOo, continuation);
                    oooO00o.f75567OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C31050OooOo00 c31050OooOo00, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c31050OooOo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C31050OooOo00 c31050OooOo00 = (C31050OooOo00) this.f75567OooOo0o;
                    EditorSummaryFragment editorSummaryFragment = this.f75566OooOo;
                    ViewGroup viewGroup = editorSummaryFragment.f75543Oooo000;
                    if (viewGroup == null) {
                        OooOOO0.OooOOOO("btnContainer");
                        throw null;
                    }
                    viewGroup.setVisibility(c31050OooOo00 != null ? 0 : 8);
                    if (c31050OooOo00 == null) {
                        TextView textView = editorSummaryFragment.f75541OooOooo;
                        if (textView != null) {
                            textView.setText("");
                            return C32460OooOooO.f116667OooO00o;
                        }
                        OooOOO0.OooOOOO("summaryText");
                        throw null;
                    }
                    ViewGroup viewGroup2 = editorSummaryFragment.f75544Oooo00O;
                    if (viewGroup2 == null) {
                        OooOOO0.OooOOOO("pageIndicatorContainer");
                        throw null;
                    }
                    List<NoteSummary> list = c31050OooOo00.f110856OooO0O0;
                    viewGroup2.setVisibility(list.size() > 1 ? 0 : 8);
                    int i = c31050OooOo00.f110857OooO0OO;
                    if (i < 0 || i >= list.size()) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooO0OO(C20860Ooooooo.OooO0OO(c20358OooO00o, "EditorSummaryFragment", "Invalid page index: ", i), new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    TextView textView2 = editorSummaryFragment.f75541OooOooo;
                    if (textView2 == null) {
                        OooOOO0.OooOOOO("summaryText");
                        throw null;
                    }
                    textView2.setText(list.get(i).getSummary());
                    List<NoteSummary> list2 = list;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((NoteSummary) it.next()).getSummary());
                    }
                    editorSummaryFragment.OooOoo0(arrayList);
                    TextView textView3 = editorSummaryFragment.f75546Oooo0O0;
                    if (textView3 == null) {
                        OooOOO0.OooOOOO("pageIndicator");
                        throw null;
                    }
                    textView3.setText((i + 1) + " / " + list.size());
                    View view = editorSummaryFragment.f75545Oooo00o;
                    if (view == null) {
                        OooOOO0.OooOOOO("btnPrevious");
                        throw null;
                    }
                    view.setEnabled(i > 0);
                    View view2 = editorSummaryFragment.f75542Oooo0;
                    if (view2 != null) {
                        view2.setEnabled(i < list.size() - 1);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("btnNext");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19349OooO0OO(EditorSummaryFragment editorSummaryFragment, Continuation<? super C19349OooO0OO> continuation) {
                super(2, continuation);
                this.f75564OooOo = editorSummaryFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19349OooO0OO(this.f75564OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19349OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75565OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorSummaryFragment editorSummaryFragment = this.f75564OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00oOooOoOO = editorSummaryFragment.OooOoOO();
                    OooO00o oooO00o = new OooO00o(editorSummaryFragment, null);
                    this.f75565OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO00oOooOoOO.f75610OooOo0O, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$onViewCreated$8$4", m80623f = "EditorSummaryFragment.kt", m80624l = {175}, m80625m = "invokeSuspend")
        public static final class OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorSummaryFragment f75568OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75569OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$onViewCreated$8$4$1", m80623f = "EditorSummaryFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO00o.C23517OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorSummaryFragment f75570OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75571OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorSummaryFragment editorSummaryFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75570OooOo = editorSummaryFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75570OooOo, continuation);
                    oooO00o.f75571OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(OooO00o.C23517OooO0Oo c23517OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c23517OooO0Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    OooO00o.C23517OooO0Oo c23517OooO0Oo = (OooO00o.C23517OooO0Oo) this.f75571OooOo0o;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("EditorSummaryFragment");
                    c20358OooO00o.OooO0o0("Status message: " + c23517OooO0Oo, new Object[0]);
                    boolean zOooO0O0 = OooOOO0.OooO0O0(c23517OooO0Oo != null ? c23517OooO0Oo.f75654OooO00o : null, OooO00o.OooO0OO.OooO0O0.f75649OooO00o);
                    EditorSummaryFragment editorSummaryFragment = this.f75570OooOo;
                    if (zOooO0O0) {
                        editorSummaryFragment.OooOoO(false);
                    } else {
                        StatusDisplayView statusDisplayView = editorSummaryFragment.f75548Oooo0o;
                        if (statusDisplayView == null) {
                            OooOOO0.OooOOOO("statusDisplayView");
                            throw null;
                        }
                        statusDisplayView.setStatueMessage(c23517OooO0Oo);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0Oo(EditorSummaryFragment editorSummaryFragment, Continuation<? super OooO0Oo> continuation) {
                super(2, continuation);
                this.f75568OooOo = editorSummaryFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0Oo(this.f75568OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75569OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorSummaryFragment editorSummaryFragment = this.f75568OooOo;
                    InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(editorSummaryFragment.OooOoOO().f75612OooOoO, 500L);
                    OooO00o oooO00o = new OooO00o(editorSummaryFragment, null);
                    this.f75569OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0oOooOO0O, oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0OO oooO0OO = EditorSummaryFragment.this.new OooO0OO(continuation);
            oooO0OO.f75557OooOo0o = obj;
            return oooO0OO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f75557OooOo0o;
            EditorSummaryFragment editorSummaryFragment = EditorSummaryFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(editorSummaryFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(editorSummaryFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19349OooO0OO(editorSummaryFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0Oo(editorSummaryFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23511OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooOo00 f75572OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23511OooO0Oo(OooOo00 oooOo00) {
            super(0);
            this.f75572OooOo0o = oooOo00;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75572OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75573OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75573OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75573OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23512OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75574OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23512OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75574OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75574OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23513OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75575OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23513OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75575OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75575OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorSummaryFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorSummaryFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23514OooO0oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29264OooOOO f75577OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23514OooO0oo(C29264OooOOO c29264OooOOO) {
            super(0);
            this.f75577OooOo0o = c29264OooOOO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75577OooOo0o.invoke();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75578OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75578OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75578OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75579OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75579OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75579OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorSummaryFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public EditorSummaryFragment() {
        OooOo00 oooOo00 = new OooOo00(this, 0);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23511OooO0Oo(oooOo00));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f75539OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.class), new C23512OooO0o0(interfaceC32440OooOO0OooO0O0), new C23513OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23514OooO0oo(new C29264OooOOO(this, 1)));
        this.f75538OooOoo = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new OooO(interfaceC32440OooOO0OooO0O02), new OooOO0O(interfaceC32440OooOO0OooO0O02), new OooOO0(interfaceC32440OooOO0OooO0O02));
    }

    public final void OooOoO(boolean z) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(z, (C33163OooO0oO) context, null), 3);
    }

    public final com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o OooOoOO() {
        return (com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o) this.f75539OooOoo0.getValue();
    }

    public final void OooOoo0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        String str = (String) it.next();
        TextView textView = this.f75540OooOooO;
        if (textView == null) {
            OooOOO0.OooOOOO("textMeasurer");
            throw null;
        }
        textView.setText(str);
        TextView textView2 = this.f75540OooOooO;
        if (textView2 == null) {
            OooOOO0.OooOOOO("textMeasurer");
            throw null;
        }
        textView2.getExtendedPaddingBottom();
        TextView textView3 = this.f75540OooOooO;
        if (textView3 == null) {
            OooOOO0.OooOOOO("textMeasurer");
            throw null;
        }
        int height = textView3.getLayout().getHeight();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            TextView textView4 = this.f75540OooOooO;
            if (textView4 == null) {
                OooOOO0.OooOOOO("textMeasurer");
                throw null;
            }
            textView4.setText(str2);
            TextView textView5 = this.f75540OooOooO;
            if (textView5 == null) {
                OooOOO0.OooOOOO("textMeasurer");
                throw null;
            }
            textView5.getExtendedPaddingBottom();
            TextView textView6 = this.f75540OooOooO;
            if (textView6 == null) {
                OooOOO0.OooOOOO("textMeasurer");
                throw null;
            }
            int height2 = textView6.getLayout().getHeight();
            if (height < height2) {
                height = height2;
            }
        }
        TextView textView7 = this.f75541OooOooo;
        if (textView7 != null) {
            textView7.setMinHeight(height);
        } else {
            OooOOO0.OooOOOO("summaryText");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_editor_summary, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f75540OooOooO = (TextView) view.findViewById(R.id.tv_measurer);
        TextView textView = (TextView) view.findViewById(R.id.tv_summary);
        this.f75541OooOooo = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("summaryText");
            throw null;
        }
        textView.setTextIsSelectable(false);
        TextView textView2 = this.f75541OooOooo;
        if (textView2 == null) {
            OooOOO0.OooOOOO("summaryText");
            throw null;
        }
        textView2.post(new com.microsoft.identity.common.java.cache.OooO00o(this, 1));
        this.f75543Oooo000 = (ViewGroup) view.findViewById(R.id.cl_operation_container);
        View viewFindViewById = view.findViewById(R.id.btn_copy);
        this.f75547Oooo0OO = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnCopy");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28134OooO(this, 2));
        View viewFindViewById2 = view.findViewById(R.id.btn_recreate);
        this.f75549Oooo0o0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnRecreate");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC28427OooOo00(this, 2));
        StatusDisplayView statusDisplayView = (StatusDisplayView) view.findViewById(R.id.error_view);
        this.f75548Oooo0o = statusDisplayView;
        if (statusDisplayView == null) {
            OooOOO0.OooOOOO("statusDisplayView");
            throw null;
        }
        statusDisplayView.setOnRetryListener(new OooO0O0());
        this.f75544Oooo00O = (ViewGroup) view.findViewById(R.id.cl_page_indicator);
        View viewFindViewById3 = view.findViewById(R.id.btn_previous);
        this.f75545Oooo00o = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnPrevious");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC28426OooOo0(this, 2));
        View viewFindViewById4 = view.findViewById(R.id.btn_next);
        this.f75542Oooo0 = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnNext");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById4, 500L, new ViewOnClickListenerC29007OooOo0(this, 1));
        this.f75546Oooo0O0 = (TextView) view.findViewById(R.id.tv_page_indicator);
        TextView textView3 = this.f75540OooOooO;
        if (textView3 == null) {
            OooOOO0.OooOOOO("textMeasurer");
            throw null;
        }
        textView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0Oooo.OooOo0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                EditorSummaryFragment editorSummaryFragment = this.f104980OooOo0o;
                C31050OooOo00 c31050OooOo00 = (C31050OooOo00) editorSummaryFragment.OooOoOO().f75610OooOo0O.f121747OooOo0o.getValue();
                if (c31050OooOo00 == null) {
                    return;
                }
                List<NoteSummary> list = c31050OooOo00.f110856OooO0O0;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((NoteSummary) it.next()).getSummary());
                }
                editorSummaryFragment.OooOoo0(arrayList);
            }
        });
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0OO(null), 3);
    }
}
