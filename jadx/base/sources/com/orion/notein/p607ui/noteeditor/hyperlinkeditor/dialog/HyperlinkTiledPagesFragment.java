package com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import Oooo0oO.C21030OooOO0o;
import Oooo0oO.o0Oo0oo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22201OooO0oO;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26290Oooo0o0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28183Oooo0O0;
import o0OoOooO.C29251OooO00o;
import o0Ooo00.C29325OooO0O0;
import o0Ooo00.C29327OooO0Oo;
import o0Ooo000.C29332OooO0Oo;
import o0Ooo000.C29333OooO0o;
import o0Ooo000.C29334OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/hyperlinkeditor/dialog/HyperlinkTiledPagesFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class HyperlinkTiledPagesFragment extends Hilt_HyperlinkTiledPagesFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f74634OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C24568OooO0oO f74635OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f74636Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f74637Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public RecyclerView f74638Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C29251OooO00o f74639Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f74640Oooo0O0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment$onViewCreated$3", m80623f = "HyperlinkTiledPagesFragment.kt", m80624l = {93}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74642OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment$onViewCreated$3$1", m80623f = "HyperlinkTiledPagesFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19304OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteMeta, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ HyperlinkTiledPagesFragment f74643OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f74644OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19304OooO00o(HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment, Continuation<? super C19304OooO00o> continuation) {
                super(2, continuation);
                this.f74643OooOo = hyperlinkTiledPagesFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19304OooO00o c19304OooO00o = new C19304OooO00o(this.f74643OooOo, continuation);
                c19304OooO00o.f74644OooOo0o = obj;
                return c19304OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(NoteMeta noteMeta, Continuation<? super C32460OooOooO> continuation) {
                return ((C19304OooO00o) create(noteMeta, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                NoteMeta noteMeta = (NoteMeta) this.f74644OooOo0o;
                TextView textView = this.f74643OooOo.f74637Oooo000;
                if (textView != null) {
                    textView.setText(noteMeta.getTitle());
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("noteTitle");
                throw null;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return HyperlinkTiledPagesFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74642OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment = HyperlinkTiledPagesFragment.this;
                C29327OooO0Oo c29327OooO0OoOooOoo0 = hyperlinkTiledPagesFragment.OooOoo0();
                C19304OooO00o c19304OooO00o = new C19304OooO00o(hyperlinkTiledPagesFragment, null);
                this.f74642OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29327OooO0OoOooOoo0.f104018OooO, c19304OooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment = HyperlinkTiledPagesFragment.this;
            Bundle arguments = hyperlinkTiledPagesFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + hyperlinkTiledPagesFragment + " has null arguments");
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return HyperlinkTiledPagesFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23429OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f74647OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23429OooO0Oo(OooO0OO oooO0OO) {
            super(0);
            this.f74647OooOo0o = oooO0OO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f74647OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74648OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74648OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74648OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23430OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74649OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23430OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74649OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f74649OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23431OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f74650OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23431OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74650OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74650OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? HyperlinkTiledPagesFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public HyperlinkTiledPagesFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23429OooO0Oo(new OooO0OO()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f74634OooOooO = new C22026ooOO(oooo0.OooO0O0(C29327OooO0Oo.class), new C23430OooO0o0(interfaceC32440OooOO0OooO0O0), new C23431OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
        this.f74635OooOooo = new C24568OooO0oO(oooo0.OooO0O0(C29333OooO0o.class), new OooO0O0());
    }

    public final C29327OooO0Oo OooOoo0() {
        return (C29327OooO0Oo) this.f74634OooOooO.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_aerial_view_pages, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        final String str = ((C29333OooO0o) this.f74635OooOooo.getValue()).f104050OooO00o;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "HyperlinkTiledPagesFragment", "AerialViewPagesFragment.onViewCreated, noteId: ", str, "."), new Object[0]);
        c20358OooO00o.OooOOO0("HyperlinkTiledPagesFragment");
        c20358OooO00o.OooO0o0(o0Oo0oo.OooO0O0(hashCode(), "AerialViewPagesFragment.onViewCreated, hash: ", "."), new Object[0]);
        C33781o00o0O c33781o00o0O = OooOoo0().f104022OooO0oO;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, str);
        this.f74637Oooo000 = (TextView) view.findViewById(R.id.tv_note_title_aerial_view);
        this.f74636Oooo0 = view.findViewById(R.id.btn_confirm_aerial);
        View viewFindViewById = view.findViewById(R.id.btn_cancel_aerial);
        this.f74640Oooo0O0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("cancelBt");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28183Oooo0O0(this, 2));
        View view2 = this.f74636Oooo0;
        if (view2 == null) {
            OooOOO0.OooOOOO("confirmBt");
            throw null;
        }
        C28050OooO0OO.OooO00o(view2, 500L, new View.OnClickListener() { // from class: o0Ooo000.OooO00o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment = this.f104041OooOo0o;
                CharSequence charSequence = (CharSequence) hyperlinkTiledPagesFragment.OooOoo0().f104023OooO0oo.getValue();
                if (charSequence.length() == 0) {
                    charSequence = null;
                }
                String str2 = (String) charSequence;
                if (str2 == null) {
                    str2 = "";
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("source_note_id", ((C29333OooO0o) hyperlinkTiledPagesFragment.f74635OooOooo.getValue()).f104051OooO0O0);
                bundle2.putString("note_id", str);
                bundle2.putString("page_id", str2);
                hyperlinkTiledPagesFragment.getParentFragmentManager().OooooOo(bundle2, "hyperlink_nav_result");
                C21030OooOO0o.OooO0OO(hyperlinkTiledPagesFragment).OooOOo(R.id.noteEditorContainerFragment, false);
            }
        });
        this.f74638Oooo00O = (RecyclerView) view.findViewById(R.id.rv_aerial_view);
        C29251OooO00o c29251OooO00o = new C29251OooO00o(C29251OooO00o.OooO0O0.f103744OooO00o);
        this.f74639Oooo00o = c29251OooO00o;
        c29251OooO00o.f103740OooO0O0 = new ViewOnClickListenerC26290Oooo0o0(this, 3);
        RecyclerView recyclerView = this.f74638Oooo00O;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("tiledPageList");
            throw null;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), recyclerView.getResources().getConfiguration().screenWidthDp > 640 ? 5 : 3));
        C29251OooO00o c29251OooO00o2 = this.f74639Oooo00o;
        if (c29251OooO00o2 == null) {
            OooOOO0.OooOOOO("tiledPageAdapter");
            throw null;
        }
        recyclerView.setAdapter(c29251OooO00o2);
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = this.f74638Oooo00O;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("tiledPageList");
            throw null;
        }
        recyclerView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0Ooo000.OooO0O0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int iOooO0o = (i3 - i) / o000000O.OooO0o(128);
                HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment = this.f104042OooOo0o;
                RecyclerView recyclerView3 = hyperlinkTiledPagesFragment.f74638Oooo00O;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageList");
                    throw null;
                }
                RecyclerView.OooOOOO layoutManager = recyclerView3.getLayoutManager();
                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                if (gridLayoutManager.f65751OooOo != iOooO0o) {
                    RecyclerView recyclerView4 = hyperlinkTiledPagesFragment.f74638Oooo00O;
                    if (recyclerView4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageList");
                        throw null;
                    }
                    GridLayoutManager gridLayoutManager2 = new GridLayoutManager(hyperlinkTiledPagesFragment.requireContext(), iOooO0o);
                    gridLayoutManager2.scrollToPosition(gridLayoutManager.findFirstVisibleItemPosition());
                    recyclerView4.setLayoutManager(gridLayoutManager2);
                }
            }
        });
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29334OooO0o0(this, null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO00o(null), 3);
        C29327OooO0Oo c29327OooO0OoOooOoo0 = OooOoo0();
        o00000OO o00000oo2 = c29327OooO0OoOooOoo0.f104020OooO0o;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        c29327OooO0OoOooOoo0.f104020OooO0o = C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(o0OoOo0.OooO00o(c29327OooO0OoOooOoo0).OooOOO0()), null, null, new C29325OooO0O0(c29327OooO0OoOooOoo0, str, null), 3);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C29332OooO0Oo(this, null), 3);
    }
}
