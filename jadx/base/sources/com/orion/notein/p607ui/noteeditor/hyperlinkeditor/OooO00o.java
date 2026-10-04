package com.orion.notein.p607ui.noteeditor.hyperlinkeditor;

import Oooo0.o000000O;
import Oooo0oO.C21022OooO0OO;
import android.content.Context;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import androidx.transition.OooOOOO;
import com.aspose.slides.C22201OooO0oO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.UrlLinkDialogFragment;
import com.orion.penkit.models.HyperLinkInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28774o0000o0O;
import o0OoO0oo.C28779o0000oOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
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
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel$initByViewModel$6", m80623f = "HyperLinkEditorPanel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO f74528OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f74529OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ HyperLinkEditorPanel f74530OooOoO0;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel$initByViewModel$6$1", m80623f = "HyperLinkEditorPanel.kt", m80624l = {123}, m80625m = "invokeSuspend")
    public static final class C19294OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO f74531OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74532OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel$initByViewModel$6$1$1", m80623f = "HyperLinkEditorPanel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19295OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {
            public C19295OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19295OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C19295OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19294OooO00o(com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO, Continuation<? super C19294OooO00o> continuation) {
            super(2, continuation);
            this.f74531OooOo = oooO0OO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C19294OooO00o(this.f74531OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19294OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74532OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = this.f74531OooOo;
                C19295OooO00o c19295OooO00o = new C19295OooO00o(2, null);
                this.f74532OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OO.f74565OooOOOO, c19295OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel$initByViewModel$6$2", m80623f = "HyperLinkEditorPanel.kt", m80624l = {127}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO f74533OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74534OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ HyperLinkEditorPanel f74535OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel$initByViewModel$6$2$1", m80623f = "HyperLinkEditorPanel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19296OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends String, ? extends Integer>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ HyperLinkEditorPanel f74536OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f74537OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19296OooO00o(HyperLinkEditorPanel hyperLinkEditorPanel, Continuation<? super C19296OooO00o> continuation) {
                super(2, continuation);
                this.f74536OooOo = hyperLinkEditorPanel;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19296OooO00o c19296OooO00o = new C19296OooO00o(this.f74536OooOo, continuation);
                c19296OooO00o.f74537OooOo0o = obj;
                return c19296OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C32443OooOOO<? extends String, ? extends Integer> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                return ((C19296OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f74537OooOo0o;
                HyperLinkEditorPanel hyperLinkEditorPanel = this.f74536OooOo;
                Context context = hyperLinkEditorPanel.getContext();
                if (c32443OooOOO == null || context == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                ((Number) c32443OooOOO.f116637OooOo).intValue();
                TextView textView = hyperLinkEditorPanel.f74497OooOoOO;
                if (textView != null) {
                    textView.setText(context.getString(R.string.create_hyperlink_related_to_page));
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("pageLinkPageInfo");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO, HyperLinkEditorPanel hyperLinkEditorPanel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f74533OooOo = oooO0OO;
            this.f74535OooOoO0 = hyperLinkEditorPanel;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f74533OooOo, this.f74535OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74534OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = this.f74533OooOo;
                C19296OooO00o c19296OooO00o = new C19296OooO00o(this.f74535OooOoO0, null);
                this.f74534OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OO.f74559OooO0oo, c19296OooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel$initByViewModel$6$3", m80623f = "HyperLinkEditorPanel.kt", m80624l = {139}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO f74538OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74539OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
        public static final class C19297OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final C19297OooO00o<T> f74540OooOo0o = new C19297OooO00o<>();

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f74538OooOo = oooO0OO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f74538OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74539OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = this.f74538OooOo;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = C19297OooO00o.f74540OooOo0o;
            this.f74539OooOo0o = 1;
            oooO0OO.f74562OooOO0o.collect(interfaceC33723OooO0oO, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel$initByViewModel$6$4", m80623f = "HyperLinkEditorPanel.kt", m80624l = {143}, m80625m = "invokeSuspend")
    public static final class C23425OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO f74541OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74542OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ HyperLinkEditorPanel f74543OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
        public static final class C19298OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO f74544OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ HyperLinkEditorPanel f74545OooOo0o;

            public C19298OooO00o(HyperLinkEditorPanel hyperLinkEditorPanel, com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO) {
                this.f74545OooOo0o = hyperLinkEditorPanel;
                this.f74544OooOo = oooO0OO;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                boolean z;
                C32449OooOOoo c32449OooOOoo = (C32449OooOOoo) obj;
                OooO0OO.OooO0O0 oooO0O0 = (OooO0OO.OooO0O0) c32449OooOOoo.f116647OooOo;
                if (!OooOOO0.OooO0O0(oooO0O0, OooO0OO.OooO0O0.OooO0o0.f74581OooO00o)) {
                    boolean zOooO0O0 = OooOOO0.OooO0O0(oooO0O0, OooO0OO.OooO0O0.C19300OooO0O0.f74577OooO00o);
                    HyperLinkEditorPanel hyperLinkEditorPanel = this.f74545OooOo0o;
                    C c = c32449OooOOoo.f116649OooOoO0;
                    if (zOooO0O0) {
                        OooOOO0.OooO0o0(c, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                        B b = ((C32443OooOOO) c).f116637OooOo;
                        if (b instanceof HyperLinkInfo) {
                            hyperLinkEditorPanel.setVisibility(0);
                            HyperLinkInfo link = (HyperLinkInfo) b;
                            HyperLinkResizeEditor hyperLinkResizeEditor = hyperLinkEditorPanel.f74493OooOo;
                            if (hyperLinkResizeEditor == null) {
                                OooOOO0.OooOOOO("editor");
                                throw null;
                            }
                            OooOOO0.OooO0oO(link, "link");
                            hyperLinkResizeEditor.setVisibility(0);
                            RectF bounds = link.getBounds();
                            int iOooO0o = o000000O.OooO0o(15);
                            ViewGroup viewGroup = hyperLinkResizeEditor.f74508OooOoO0;
                            if (viewGroup == null) {
                                OooOOO0.OooOOOO("contentContainer");
                                throw null;
                            }
                            float f = iOooO0o;
                            viewGroup.setX(bounds.left - f);
                            ViewGroup viewGroup2 = hyperLinkResizeEditor.f74508OooOoO0;
                            if (viewGroup2 == null) {
                                OooOOO0.OooOOOO("contentContainer");
                                throw null;
                            }
                            viewGroup2.setY(bounds.top - f);
                            ViewGroup viewGroup3 = hyperLinkResizeEditor.f74508OooOoO0;
                            if (viewGroup3 == null) {
                                OooOOO0.OooOOOO("contentContainer");
                                throw null;
                            }
                            int i = iOooO0o * 2;
                            viewGroup3.getLayoutParams().width = ((int) bounds.width()) + i;
                            ViewGroup viewGroup4 = hyperLinkResizeEditor.f74508OooOoO0;
                            if (viewGroup4 == null) {
                                OooOOO0.OooOOOO("contentContainer");
                                throw null;
                            }
                            viewGroup4.getLayoutParams().height = ((int) bounds.height()) + i;
                            hyperLinkResizeEditor.OooO0O0();
                            hyperLinkResizeEditor.requestLayout();
                        }
                    } else {
                        OooO0OO.OooO0O0.OooO0Oo oooO0Oo = OooO0OO.OooO0O0.OooO0Oo.f74579OooO00o;
                        if (OooOOO0.OooO0O0(oooO0O0, oooO0Oo) || OooOOO0.OooO0O0(oooO0O0, OooO0OO.OooO0O0.C19301OooO0OO.f74578OooO00o) || OooOOO0.OooO0O0(oooO0O0, OooO0OO.OooO0O0.OooO0o.f74580OooO00o)) {
                            if (c != 0) {
                                C32443OooOOO c32443OooOOO = (C32443OooOOO) c;
                                HyperLinkInfo hyperLinkInfo = (HyperLinkInfo) c32443OooOOO.f116638OooOo0o;
                                HyperLinkInfo hyperLinkInfo2 = (HyperLinkInfo) c32443OooOOO.f116637OooOo;
                                HyperLinkEditorPanel.OooO00o hyperLinkEditorEventListener = hyperLinkEditorPanel.getHyperLinkEditorEventListener();
                                if (hyperLinkEditorEventListener != null) {
                                    hyperLinkEditorEventListener.OooO0Oo(hyperLinkInfo, hyperLinkInfo2, true);
                                }
                            }
                            int i2 = HyperLinkEditorPanel.f74492Oooo00o;
                            hyperLinkEditorPanel.OooO00o();
                            if (OooOOO0.OooO0O0(oooO0O0, oooO0Oo)) {
                                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = hyperLinkEditorPanel.f74494OooOo0o;
                                if (oooO0OO == null) {
                                    OooOOO0.OooOOOO("viewModel");
                                    throw null;
                                }
                                CharSequence charSequence = (CharSequence) oooO0OO.f74558OooO0oO.getValue();
                                String str = (String) (charSequence.length() != 0 ? charSequence : null);
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "HyperLinkEditorPanel", "HyperLinkEditorPanel.openPageLinkDialog, noteId: ", str, "."), new Object[0]);
                                if (str != null && str.length() != 0) {
                                    C28026OooO0OO.OooO0O0(C21022OooO0OO.OooO0O0(hyperLinkEditorPanel), new C28774o0000o0O(str, str));
                                }
                            } else if (OooOOO0.OooO0O0(oooO0O0, OooO0OO.OooO0O0.C19301OooO0OO.f74578OooO00o)) {
                                com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO2 = hyperLinkEditorPanel.f74494OooOo0o;
                                if (oooO0OO2 == null) {
                                    OooOOO0.OooOOOO("viewModel");
                                    throw null;
                                }
                                CharSequence charSequence2 = (CharSequence) oooO0OO2.f74558OooO0oO.getValue();
                                String str2 = (String) (charSequence2.length() != 0 ? charSequence2 : null);
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "HyperLinkEditorPanel", "HyperLinkEditorPanel.openOtherNoteSelection, noteId: ", str2, "."), new Object[0]);
                                if (str2 != null && str2.length() != 0) {
                                    C28026OooO0OO.OooO0O0(C21022OooO0OO.OooO0O0(hyperLinkEditorPanel), new C28779o0000oOo(str2));
                                }
                            } else {
                                FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(hyperLinkEditorPanel).getChildFragmentManager();
                                OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
                                if (childFragmentManager.OooOooo("UrlLinkDialogFragment") == null) {
                                    UrlLinkDialogFragment urlLinkDialogFragment = new UrlLinkDialogFragment();
                                    com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO3 = hyperLinkEditorPanel.f74494OooOo0o;
                                    if (oooO0OO3 == null) {
                                        OooOOO0.OooOOOO("viewModel");
                                        throw null;
                                    }
                                    HyperLinkInfo hyperLinkInfo3 = oooO0OO3.f74564OooOOO0;
                                    if (hyperLinkInfo3 == null || hyperLinkInfo3.getType() != 0) {
                                        urlLinkDialogFragment.f74671Oooo0O0 = "";
                                    } else {
                                        String destination = hyperLinkInfo3.getDestination();
                                        OooOOO0.OooO0oO(destination, "<set-?>");
                                        urlLinkDialogFragment.f74671Oooo0O0 = destination;
                                    }
                                    urlLinkDialogFragment.f74672Oooo0OO = new o00O0OO0.OooO00o(hyperLinkEditorPanel);
                                    urlLinkDialogFragment.show(childFragmentManager, "UrlLinkDialogFragment");
                                }
                            }
                        } else if (OooOOO0.OooO0O0(oooO0O0, OooO0OO.OooO0O0.OooO00o.f74576OooO00o)) {
                            if (c != 0) {
                                C32443OooOOO c32443OooOOO2 = (C32443OooOOO) c;
                                HyperLinkInfo hyperLinkInfo4 = (HyperLinkInfo) c32443OooOOO2.f116638OooOo0o;
                                HyperLinkInfo hyperLinkInfo5 = (HyperLinkInfo) c32443OooOOO2.f116637OooOo;
                                String destination2 = hyperLinkInfo4 != null ? hyperLinkInfo4.getDestination() : null;
                                if (destination2 == null || destination2.length() == 0) {
                                    String destination3 = hyperLinkInfo5 != null ? hyperLinkInfo5.getDestination() : null;
                                    z = !(destination3 == null || destination3.length() == 0);
                                } else {
                                    z = false;
                                }
                                HyperLinkEditorPanel.OooO00o hyperLinkEditorEventListener2 = hyperLinkEditorPanel.getHyperLinkEditorEventListener();
                                if (hyperLinkEditorEventListener2 != null) {
                                    hyperLinkEditorEventListener2.OooO0Oo(hyperLinkInfo4, hyperLinkInfo5, false);
                                }
                            } else {
                                z = false;
                            }
                            int i3 = HyperLinkEditorPanel.f74492Oooo00o;
                            hyperLinkEditorPanel.OooO00o();
                            com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO4 = this.f74544OooOo;
                            oooO0OO4.OooO0oo(OooO0OO.OooO00o.f74567OooOo0o, null);
                            if (z && ((Boolean) oooO0OO4.f74565OooOOOO.f121747OooOo0o.getValue()).booleanValue()) {
                                CardView cardView = hyperLinkEditorPanel.f74500OooOooO;
                                if (cardView == null) {
                                    OooOOO0.OooOOOO("exitTipsDialog");
                                    throw null;
                                }
                                cardView.setVisibility(0);
                            }
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23425OooO0Oo(com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO, HyperLinkEditorPanel hyperLinkEditorPanel, Continuation<? super C23425OooO0Oo> continuation) {
            super(2, continuation);
            this.f74541OooOo = oooO0OO;
            this.f74543OooOoO0 = hyperLinkEditorPanel;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23425OooO0Oo(this.f74541OooOo, this.f74543OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C23425OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74542OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = this.f74541OooOo;
            C33772OooooOo c33772OooooOo = oooO0OO.f74560OooOO0;
            C19298OooO00o c19298OooO00o = new C19298OooO00o(this.f74543OooOoO0, oooO0OO);
            this.f74542OooOo0o = 1;
            c33772OooooOo.collect(c19298OooO00o, this);
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO, HyperLinkEditorPanel hyperLinkEditorPanel, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f74528OooOo = oooO0OO;
        this.f74530OooOoO0 = hyperLinkEditorPanel;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO00o oooO00o = new OooO00o(this.f74528OooOo, this.f74530OooOoO0, continuation);
        oooO00o.f74529OooOo0o = obj;
        return oooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f74529OooOo0o;
        com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO oooO0OO = this.f74528OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19294OooO00o(oooO0OO, null), 3);
        HyperLinkEditorPanel hyperLinkEditorPanel = this.f74530OooOoO0;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(oooO0OO, hyperLinkEditorPanel, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(oooO0OO, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23425OooO0Oo(oooO0OO, hyperLinkEditorPanel, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
