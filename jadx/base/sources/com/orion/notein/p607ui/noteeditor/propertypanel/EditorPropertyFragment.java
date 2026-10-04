package com.orion.notein.p607ui.noteeditor.propertypanel;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00oo.C28039OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28147OooO;
import o0Oo0o00.ViewOnClickListenerC28154OooO0oO;
import o0Oo0o00.ViewOnClickListenerC28155OooO0oo;
import o0Oooo0.ViewOnClickListenerC29610OooO00o;
import oO00ooO.C32443OooOOO;
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
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/EditorPropertyFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class EditorPropertyFragment extends Hilt_EditorPropertyFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TabLayout f75450OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f75451OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ViewPager2 f75452OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f75453OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C22026ooOO f75454Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ViewGroup f75455Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f75456Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public o0o0O.OooO0O0 f75457Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C22026ooOO f75458Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final OooO00o f75459Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final Object f75460Oooo0o0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75461OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75461OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75461OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorPropertyFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooO00o extends ViewPager2.AbstractC22132OooO0o0 {
        public OooO00o() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC22132OooO0o0
        public final void onPageSelected(int i) {
            EditorPropertyFragment editorPropertyFragment = EditorPropertyFragment.this;
            com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0 oooO0O0 = (com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0) editorPropertyFragment.f75460Oooo0o0.get((OooO0O0.OooO00o) editorPropertyFragment.OooOoO().f73410o000000o.getValue());
            if (oooO0O0 == null) {
                return;
            }
            TextView textView = editorPropertyFragment.f75453OooOooo;
            if (textView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("txtTitle");
                throw null;
            }
            Context contextRequireContext = editorPropertyFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            textView.setText(oooO0O0.OooO0O0(contextRequireContext, i));
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$onViewCreated$2$1", m80623f = "EditorPropertyFragment.kt", m80624l = {87}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f75464OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75465OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f75467OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ View f75468OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(View view, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f75468OooOoOO = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorPropertyFragment.this.new OooO0O0(this.f75468OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i3 = this.f75467OooOoO0;
            EditorPropertyFragment editorPropertyFragment = EditorPropertyFragment.this;
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C22026ooOO c22026ooOO = editorPropertyFragment.f75454Oooo0;
                C32443OooOOO c32443OooOOO = (C32443OooOOO) ((com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o) c22026ooOO.getValue()).f75603OooOOOo.f121747OooOo0o.getValue();
                int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
                com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o = (com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o) c22026ooOO.getValue();
                this.f75465OooOo0o = iIntValue;
                this.f75464OooOo = iIntValue2;
                this.f75467OooOoO0 = 1;
                obj = Boolean.valueOf(oooO00o.f75591OooO.OooO0Oo().getUnlimitedQuota());
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                i = iIntValue2;
                i2 = iIntValue;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = this.f75464OooOo;
                int i5 = this.f75465OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                i = i4;
                i2 = i5;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            o0o0O.OooO0O0 oooO0O0 = editorPropertyFragment.f75457Oooo00o;
            if (oooO0O0 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("quotaUsagePopupMenu");
                throw null;
            }
            View view = this.f75468OooOoOO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
            oooO0O0.OooO0OO(view, i2, i, zBooleanValue, true);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$onViewCreated$3", m80623f = "EditorPropertyFragment.kt", m80624l = {109}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75470OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$onViewCreated$3$1", m80623f = "EditorPropertyFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0O0.OooO00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPropertyFragment f75471OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75472OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorPropertyFragment editorPropertyFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75471OooOo = editorPropertyFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f75471OooOo, continuation);
                oooO00o.f75472OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(OooO0O0.OooO00o oooO00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(oooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) this.f75472OooOo0o;
                EditorPropertyFragment editorPropertyFragment = this.f75471OooOo;
                com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0 oooO0O0 = (com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0) editorPropertyFragment.f75460Oooo0o0.get(oooO00o);
                if (oooO0O0 != null) {
                    ViewGroup viewGroup = editorPropertyFragment.f75455Oooo000;
                    if (viewGroup == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("aiQuotaUsage");
                        throw null;
                    }
                    viewGroup.setVisibility(oooO00o == OooO0O0.OooO00o.f75496OooOo ? 0 : 8);
                    ViewPager2 viewPager2 = editorPropertyFragment.f75452OooOooO;
                    if (viewPager2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPager");
                        throw null;
                    }
                    viewPager2.setAdapter(oooO0O0.OooO00o(editorPropertyFragment));
                    Context contextRequireContext = editorPropertyFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    TabLayout tabLayout = editorPropertyFragment.f75450OooOoo;
                    if (tabLayout == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tabLayout");
                        throw null;
                    }
                    ViewPager2 viewPager22 = editorPropertyFragment.f75452OooOooO;
                    if (viewPager22 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPager");
                        throw null;
                    }
                    oooO0O0.OooO0OO(contextRequireContext, tabLayout, viewPager22).attach();
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorPropertyFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75470OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                EditorPropertyFragment editorPropertyFragment = EditorPropertyFragment.this;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoO = editorPropertyFragment.OooOoO();
                OooO00o oooO00o = new OooO00o(editorPropertyFragment, null);
                this.f75470OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoO.f73410o000000o, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$onViewCreated$4", m80623f = "EditorPropertyFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23501OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f75474OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$onViewCreated$4$1", m80623f = "EditorPropertyFragment.kt", m80624l = {118}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPropertyFragment f75475OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75476OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$onViewCreated$4$1$1", m80623f = "EditorPropertyFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19344OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Integer, ? extends Integer>, Continuation<? super C32460OooOooO>, Object> {
                public C19344OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19344OooO00o(2, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends Integer, ? extends Integer> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19344OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorPropertyFragment editorPropertyFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75475OooOo = editorPropertyFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f75475OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75476OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o = (com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o) this.f75475OooOo.f75454Oooo0.getValue();
                    C19344OooO00o c19344OooO00o = new C19344OooO00o(2, null);
                    this.f75476OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO00o.f75603OooOOOo, c19344OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$OooO0Oo$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$onViewCreated$4$2", m80623f = "EditorPropertyFragment.kt", m80624l = {123}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPropertyFragment f75477OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75478OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$OooO0Oo$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$onViewCreated$4$2$1", m80623f = "EditorPropertyFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32460OooOooO, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorPropertyFragment f75479OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorPropertyFragment editorPropertyFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75479OooOo0o = editorPropertyFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO00o(this.f75479OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32460OooOooO c32460OooOooO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c32460OooOooO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPropertyFragment editorPropertyFragment = this.f75479OooOo0o;
                    if (editorPropertyFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("EditorPropertyFragment");
                        c20358OooO00o.OooO00o("handleAiQuotaExceeded: TipsDialogFragment is already shown", new Object[0]);
                    } else {
                        String string = editorPropertyFragment.getString(R.string.title_dialog_ai_quota_used_up);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        String string2 = editorPropertyFragment.getString(R.string.content_dialog_ai_quota_used_up);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        new TipsDialogFragment(string, string2, new ViewOnClickListenerC26311Ooooooo(), new ViewOnClickListenerC29610OooO00o(editorPropertyFragment, 0), null, editorPropertyFragment.getString(R.string.purchase), 0, null, 384).show(editorPropertyFragment.getChildFragmentManager(), "TipsDialogFragment");
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(EditorPropertyFragment editorPropertyFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f75477OooOo = editorPropertyFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f75477OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75478OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPropertyFragment editorPropertyFragment = this.f75477OooOo;
                    C33772OooooOo c33772OooooOo = ((com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o) editorPropertyFragment.f75454Oooo0.getValue()).f75601OooOOO0;
                    OooO00o oooO00o = new OooO00o(editorPropertyFragment, null);
                    this.f75478OooOo0o = 1;
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

        public C23501OooO0Oo(Continuation<? super C23501OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23501OooO0Oo c23501OooO0Oo = EditorPropertyFragment.this.new C23501OooO0Oo(continuation);
            c23501OooO0Oo.f75474OooOo0o = obj;
            return c23501OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23501OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f75474OooOo0o;
            EditorPropertyFragment editorPropertyFragment = EditorPropertyFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(editorPropertyFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(editorPropertyFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23502OooO0o0 f75480OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C23502OooO0o0 c23502OooO0o0) {
            super(0);
            this.f75480OooOo0o = c23502OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75480OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23502OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23502OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return EditorPropertyFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23503OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75482OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23503OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75482OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75482OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23504OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75483OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23504OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75483OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75483OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ androidx.ink.geometry.OooO f75484OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(androidx.ink.geometry.OooO oooO) {
            super(0);
            this.f75484OooOo0o = oooO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75484OooOo0o.invoke();
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75485OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75485OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75485OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23505OooOO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75486OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23505OooOO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75486OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75486OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75487OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75487OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75487OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorPropertyFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public EditorPropertyFragment() {
        C23502OooO0o0 c23502OooO0o0 = new C23502OooO0o0();
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0o(c23502OooO0o0));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f75454Oooo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.class), new C23503OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C23504OooO0oo(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooOO0(new androidx.ink.geometry.OooO(this, 1)));
        this.f75458Oooo0O0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new OooOO0O(interfaceC32440OooOO0OooO0O02), new OooOOO0(interfaceC32440OooOO0OooO0O02), new C23505OooOO0o(interfaceC32440OooOO0OooO0O02));
        this.f75459Oooo0OO = new OooO00o();
        OooO0O0.OooO00o oooO00o = OooO0O0.OooO00o.f75497OooOo0o;
        com.orion.notein.p607ui.noteeditor.propertypanel.OooO0OO oooO0OO = new com.orion.notein.p607ui.noteeditor.propertypanel.OooO0OO();
        OooO0O0.OooO00o oooO00o2 = OooO0O0.OooO00o.f75497OooOo0o;
        this.f75460Oooo0o0 = C34444Oooo0O0.OooO0oo(new C32443OooOOO(oooO00o, oooO0OO), new C32443OooOOO(OooO0O0.OooO00o.f75496OooOo, new com.orion.notein.p607ui.noteeditor.propertypanel.OooO00o()));
    }

    public final com.orion.notein.p607ui.noteeditor.OooO0OO OooOoO() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f75458Oooo0O0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_note_editor_property, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) throws IllegalAccessException, NoSuchFieldException {
        int i = 1;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_property_panel_close);
        this.f75451OooOoo0 = viewFindViewById;
        if (viewFindViewById == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28154OooO0oO(this, i));
        Context context = getContext();
        if (context == null || !C28039OooO00o.OooO00o((C33163OooO0oO) context)) {
            View view2 = this.f75451OooOoo0;
            if (view2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnClose");
                throw null;
            }
            view2.setTranslationY(0.0f);
        } else {
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoO = OooOoO();
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            if (oooO0OOOooOoO.Oooo0oo(contextRequireContext)) {
                View view3 = this.f75451OooOoo0;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnClose");
                    throw null;
                }
                view3.setTranslationY(o000000O.OooO0o0(10.0f));
            }
        }
        this.f75453OooOooo = (TextView) view.findViewById(R.id.txt_title);
        ViewOnClickListenerC28147OooO viewOnClickListenerC28147OooO = new ViewOnClickListenerC28147OooO(this, 2);
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        this.f75457Oooo00o = new o0o0O.OooO0O0(contextRequireContext2, viewOnClickListenerC28147OooO, true);
        this.f75455Oooo000 = (ViewGroup) view.findViewById(R.id.cl_remaining_quota);
        View viewFindViewById2 = view.findViewById(R.id.btn_quota_usage);
        this.f75456Oooo00O = viewFindViewById2;
        if (viewFindViewById2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnAiQuotaUsage");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC28155OooO0oo(this, i));
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoO2 = OooOoO();
        Context contextRequireContext3 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
        if (!oooO0OOOooOoO2.Oooo0oo(contextRequireContext3)) {
            View view4 = this.f75451OooOoo0;
            if (view4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnClose");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
            kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, o000000O.OooO0o(2), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            View view5 = this.f75451OooOoo0;
            if (view5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnClose");
                throw null;
            }
            view5.setLayoutParams(marginLayoutParams);
            TextView textView = this.f75453OooOooo;
            if (textView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("txtTitle");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) layoutParams2;
            View view6 = this.f75451OooOoo0;
            if (view6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnClose");
                throw null;
            }
            oooO00o.f63876OooO = view6.getId();
            View view7 = this.f75451OooOoo0;
            if (view7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnClose");
                throw null;
            }
            oooO00o.f63887OooOO0o = view7.getId();
            oooO00o.setMargins(((ViewGroup.MarginLayoutParams) oooO00o).leftMargin, 0, ((ViewGroup.MarginLayoutParams) oooO00o).rightMargin, ((ViewGroup.MarginLayoutParams) oooO00o).bottomMargin);
            TextView textView2 = this.f75453OooOooo;
            if (textView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("txtTitle");
                throw null;
            }
            textView2.setLayoutParams(oooO00o);
        }
        this.f75450OooOoo = (TabLayout) view.findViewById(R.id.tab_layout);
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.content_pager);
        this.f75452OooOooO = viewPager2;
        if (viewPager2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPager");
            throw null;
        }
        viewPager2.OooO00o(this.f75459Oooo0OO);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0OO(null), 3);
        Field declaredField = ViewPager2.class.getDeclaredField("Oooo000");
        declaredField.setAccessible(true);
        ViewPager2 viewPager22 = this.f75452OooOooO;
        if (viewPager22 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPager");
            throw null;
        }
        Object obj = declaredField.get(viewPager22);
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) obj;
        Field declaredField2 = RecyclerView.class.getDeclaredField("mTouchSlop");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(recyclerView);
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.Int");
        declaredField2.set(recyclerView, Integer.valueOf(((Integer) obj2).intValue() * 3));
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C23501OooO0Oo(null), 3);
    }
}
