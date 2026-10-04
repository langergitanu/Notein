package com.orion.notein.p607ui.noteeditor.propertypanel.p608ai;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.firestore.local.RunnableC22649OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorChatFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.StatusDisplayView;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o00o00Oo.C25256OooO00o;
import o0OOOo0.C27174OooO0O0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0Ooo.ViewOnClickListenerC28139OooO0o;
import o0Oooo.C29601OooOOO;
import o0Oooo.C29603OooOOOO;
import o0Oooo0o.C29612OooO00o;
import o0OoooOO.C29633OooO00o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/ai/EditorChatFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class EditorChatFragment extends Hilt_EditorChatFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f75499OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f75500OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f75501OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public EditText f75502OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C29612OooO00o f75503Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ImageView f75504Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public StatusDisplayView f75505Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public RecyclerView f75506Oooo00o;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75507OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75507OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75507OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooO00o implements StatusDisplayView.OooO00o {
        public OooO00o() {
        }

        @Override // com.orion.notein.ui.noteeditor.propertypanel.ai.StatusDisplayView.OooO00o
        public final void OooO00o() {
            com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00oOooOoO = EditorChatFragment.this.OooOoO();
            oooO00oOooOoO.OooOO0();
            oooO00oOooOoO.OooOOO(OooO00o.OooO0O0.C19357OooO00o.f75642OooO00o, null);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$onViewCreated$6", m80623f = "EditorChatFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f75510OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$onViewCreated$6$1", m80623f = "EditorChatFragment.kt", m80624l = {134}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorChatFragment f75511OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75512OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19346OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorChatFragment f75513OooOo0o;

                public C19346OooO00o(EditorChatFragment editorChatFragment) {
                    this.f75513OooOo0o = editorChatFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    this.f75513OooOo0o.OooOoO().OooOO0o((String) obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorChatFragment editorChatFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75511OooOo = editorChatFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f75511OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75512OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorChatFragment editorChatFragment = this.f75511OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.OooO0OO) editorChatFragment.f75499OooOoo.getValue();
                    C19346OooO00o c19346OooO00o = new C19346OooO00o(editorChatFragment);
                    this.f75512OooOo0o = 1;
                    if (oooO0OO.f73397OoooOoo.f121747OooOo0o.collect(c19346OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$onViewCreated$6$2", m80623f = "EditorChatFragment.kt", m80624l = {140}, m80625m = "invokeSuspend")
        public static final class C19347OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorChatFragment f75514OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75515OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$OooO0O0$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorChatFragment f75516OooOo0o;

                public OooO00o(EditorChatFragment editorChatFragment) {
                    this.f75516OooOo0o = editorChatFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    EditorChatFragment editorChatFragment = this.f75516OooOo0o;
                    editorChatFragment.OooOoO().f75616OooOoo0.set(zBooleanValue);
                    if (zBooleanValue) {
                        editorChatFragment.OooOoO().OooOO0o((String) ((com.orion.notein.p607ui.noteeditor.OooO0OO) editorChatFragment.f75499OooOoo.getValue()).f73397OoooOoo.f121747OooOo0o.getValue());
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19347OooO0O0(EditorChatFragment editorChatFragment, Continuation<? super C19347OooO0O0> continuation) {
                super(2, continuation);
                this.f75514OooOo = editorChatFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19347OooO0O0(this.f75514OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19347OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75515OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorChatFragment editorChatFragment = this.f75514OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = (com.orion.notein.p607ui.noteeditor.OooO0OO) editorChatFragment.f75499OooOoo.getValue();
                    OooO00o oooO00o = new OooO00o(editorChatFragment);
                    this.f75515OooOo0o = 1;
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$onViewCreated$6$3", m80623f = "EditorChatFragment.kt", m80624l = {149}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorChatFragment f75517OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75518OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$onViewCreated$6$3$1", m80623f = "EditorChatFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29633OooO00o>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorChatFragment f75519OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75520OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorChatFragment editorChatFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75519OooOo = editorChatFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75519OooOo, continuation);
                    oooO00o.f75520OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C29633OooO00o> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f75520OooOo0o;
                    EditorChatFragment editorChatFragment = this.f75519OooOo;
                    C29612OooO00o c29612OooO00o = editorChatFragment.f75503Oooo0;
                    if (c29612OooO00o != null) {
                        c29612OooO00o.OooO0o0(list, new RunnableC22649OooOoo(editorChatFragment, 1));
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("chatAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(EditorChatFragment editorChatFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f75517OooOo = editorChatFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f75517OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75518OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorChatFragment editorChatFragment = this.f75517OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00oOooOoO = editorChatFragment.OooOoO();
                    OooO00o oooO00o = new OooO00o(editorChatFragment, null);
                    this.f75518OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO00oOooOoO.f75607OooOo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$OooO0O0$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$onViewCreated$6$4", m80623f = "EditorChatFragment.kt", m80624l = {157}, m80625m = "invokeSuspend")
        public static final class C23506OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorChatFragment f75521OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75522OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$OooO0O0$OooO0Oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$onViewCreated$6$4$1", m80623f = "EditorChatFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO00o.C23517OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorChatFragment f75523OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75524OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorChatFragment editorChatFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75523OooOo = editorChatFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75523OooOo, continuation);
                    oooO00o.f75524OooOo0o = obj;
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
                    OooO00o.C23517OooO0Oo c23517OooO0Oo = (OooO00o.C23517OooO0Oo) this.f75524OooOo0o;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("EditorOutlineFragment");
                    c20358OooO00o.OooO0o0("Error message: " + c23517OooO0Oo, new Object[0]);
                    StatusDisplayView statusDisplayView = this.f75523OooOo.f75505Oooo00O;
                    if (statusDisplayView != null) {
                        statusDisplayView.setStatueMessage(c23517OooO0Oo);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("statusDisplayView");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23506OooO0Oo(EditorChatFragment editorChatFragment, Continuation<? super C23506OooO0Oo> continuation) {
                super(2, continuation);
                this.f75521OooOo = editorChatFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23506OooO0Oo(this.f75521OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23506OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75522OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorChatFragment editorChatFragment = this.f75521OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00oOooOoO = editorChatFragment.OooOoO();
                    OooO00o oooO00o = new OooO00o(editorChatFragment, null);
                    this.f75522OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO00oOooOoO.f75612OooOoO, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$onViewCreated$6$5", m80623f = "EditorChatFragment.kt", m80624l = {164}, m80625m = "invokeSuspend")
        public static final class OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorChatFragment f75525OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75526OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$onViewCreated$6$5$1", m80623f = "EditorChatFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C27174OooO0O0<C32460OooOooO>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorChatFragment f75527OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75528OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorChatFragment editorChatFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75527OooOo = editorChatFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75527OooOo, continuation);
                    oooO00o.f75528OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C27174OooO0O0<C32460OooOooO> c27174OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c27174OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) this.f75528OooOo0o;
                    EditorChatFragment editorChatFragment = this.f75527OooOo;
                    Context context = editorChatFragment.getContext();
                    if (context != null) {
                        C25206OooO0Oo.OooO0OO((ContextWrapper) context, C25256OooO00o.OooO0o(context, c27174OooO0O0.getErrorCode(), editorChatFragment.OooOoO().OooOO0O()));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o0(EditorChatFragment editorChatFragment, Continuation<? super OooO0o0> continuation) {
                super(2, continuation);
                this.f75525OooOo = editorChatFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o0(this.f75525OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75526OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorChatFragment editorChatFragment = this.f75525OooOo;
                    C33772OooooOo c33772OooooOo = editorChatFragment.OooOoO().f75618OooOooo;
                    OooO00o oooO00o = new OooO00o(editorChatFragment, null);
                    this.f75526OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33772OooooOo, oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = EditorChatFragment.this.new OooO0O0(continuation);
            oooO0O0.f75510OooOo0o = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f75510OooOo0o;
            EditorChatFragment editorChatFragment = EditorChatFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(editorChatFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19347OooO0O0(editorChatFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(editorChatFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23506OooO0Oo(editorChatFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o0(editorChatFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29601OooOOO f75529OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C29601OooOOO c29601OooOOO) {
            super(0);
            this.f75529OooOo0o = c29601OooOOO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75529OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23507OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75530OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23507OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75530OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75530OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75531OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75531OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75531OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorChatFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23508OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75533OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23508OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75533OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75533OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23509OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29603OooOOOO f75534OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23509OooO0oO(C29603OooOOOO c29603OooOOOO) {
            super(0);
            this.f75534OooOo0o = c29603OooOOOO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75534OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.EditorChatFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23510OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75535OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23510OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75535OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75535OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75536OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75536OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75536OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorChatFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public EditorChatFragment() {
        C29601OooOOO c29601OooOOO = new C29601OooOOO(this, 0);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0OO(c29601OooOOO));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f75500OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.class), new C23507OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23508OooO0o0(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23509OooO0oO(new C29603OooOOOO(this)));
        this.f75499OooOoo = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new C23510OooO0oo(interfaceC32440OooOO0OooO0O02), new OooOO0(interfaceC32440OooOO0OooO0O02), new OooO(interfaceC32440OooOO0OooO0O02));
    }

    public final com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o OooOoO() {
        return (com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o) this.f75500OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_editor_chat, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f75506Oooo00o = (RecyclerView) view.findViewById(R.id.chatHistory);
        EditText editText = (EditText) view.findViewById(R.id.input);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0Oooo.OooOOOo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                View view3 = this.f104977OooO00o.f75501OooOooO;
                if (view3 != null) {
                    view3.setActivated(z);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputContainer");
                    throw null;
                }
            }
        });
        this.f75502OooOooo = editText;
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0Oooo.OooOOo0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                Window window;
                Window window2;
                EditorChatFragment editorChatFragment = this.f104979OooO00o;
                if (z) {
                    ActivityC21897OooOo0 activity = editorChatFragment.getActivity();
                    if (activity == null || (window2 = activity.getWindow()) == null) {
                        return;
                    }
                    window2.setSoftInputMode(16);
                    return;
                }
                ActivityC21897OooOo0 activity2 = editorChatFragment.getActivity();
                if (activity2 == null || (window = activity2.getWindow()) == null) {
                    return;
                }
                window.setSoftInputMode(32);
            }
        });
        this.f75504Oooo000 = (ImageView) view.findViewById(R.id.iv_send);
        this.f75501OooOooO = view.findViewById(R.id.cl_input);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        RecyclerView recyclerView = this.f75506Oooo00o;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("chatRecycler");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        this.f75503Oooo0 = new C29612OooO00o(C29612OooO00o.C20010OooO00o.f104985OooO00o);
        new LinearLayoutManager(getContext()).setOrientation(0);
        RecyclerView recyclerView2 = this.f75506Oooo00o;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("chatRecycler");
            throw null;
        }
        C29612OooO00o c29612OooO00o = this.f75503Oooo0;
        if (c29612OooO00o == null) {
            OooOOO0.OooOOOO("chatAdapter");
            throw null;
        }
        recyclerView2.setAdapter(c29612OooO00o);
        RecyclerView recyclerView3 = this.f75506Oooo00o;
        if (recyclerView3 == null) {
            OooOOO0.OooOOOO("chatRecycler");
            throw null;
        }
        recyclerView3.setOnTouchListener(new View.OnTouchListener() { // from class: o0Oooo.OooOOo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                Object systemService = this.f104978OooOo0o.requireContext().getSystemService("input_method");
                kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                return false;
            }
        });
        ImageView imageView = this.f75504Oooo000;
        if (imageView == null) {
            OooOOO0.OooOOOO("sendButton");
            throw null;
        }
        C28050OooO0OO.OooO00o(imageView, 500L, new ViewOnClickListenerC28139OooO0o(this, 2));
        StatusDisplayView statusDisplayView = (StatusDisplayView) view.findViewById(R.id.error_view);
        this.f75505Oooo00O = statusDisplayView;
        if (statusDisplayView == null) {
            OooOOO0.OooOOOO("statusDisplayView");
            throw null;
        }
        statusDisplayView.setOnRetryListener(new OooO00o());
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
    }
}
