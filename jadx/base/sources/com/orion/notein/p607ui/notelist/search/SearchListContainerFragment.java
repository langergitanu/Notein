package com.orion.notein.p607ui.notelist.search;

import OooO0Oo.AbstractC20413OooOo0O;
import OooO0Oo.C20418OooOoo;
import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.google.android.material.tabs.TabLayout;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.notefilterbottomsheet.NoteFilterBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o0O0o0oO.o00oO0O;
import o0O0o0oO.o0Oo0oo;
import o0Oo0o0o.oo000o;
import o0o00oo.ViewOnClickListenerC30097OooO0Oo;
import o0o0O00.C30214OooOoOO;
import o0o0O0OO.C30275OooO0O0;
import o0o0O0OO.C30277OooO0Oo;
import o0o0O0OO.C30278OooO0o;
import o0o0O0OO.C30279OooO0o0;
import o0o0O0o.C30294OooO0OO;
import o0o0O0o0.C30296OooO00o;
import o0o0O0o0.C30305OooOO0O;
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
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/search/SearchListContainerFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SearchListContainerFragment extends Hilt_SearchListContainerFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f77986OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C24568OooO0oO f77987OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public NoteSearchView f77988OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public OooO00o f77989OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C30294OooO0OO f77990Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f77991Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public NoteFilterBottomSheetDialog f77992Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f77993Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C30275OooO0O0 f77994Oooo0O0;

    public static final class OooO00o extends AbstractC20413OooOo0O {
        public OooO00o() {
            super(true);
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            C21030OooOO0o.OooO0OO(SearchListContainerFragment.this).OooOOo0();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListContainerFragment$onViewCreated$3", m80623f = "SearchListContainerFragment.kt", m80624l = {112, 121}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f77996OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77997OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.SearchListContainerFragment$onViewCreated$3$1", m80623f = "SearchListContainerFragment.kt", m80624l = {115}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ SearchListContainerFragment f77999OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78000OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListContainerFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19430OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ SearchListContainerFragment f78001OooOo0o;

                public C19430OooO00o(SearchListContainerFragment searchListContainerFragment) {
                    this.f78001OooOo0o = searchListContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<SortKeyVO> list = (List) obj;
                    C30294OooO0OO c30294OooO0OO = this.f78001OooOo0o.f77990Oooo0;
                    if (c30294OooO0OO != null) {
                        c30294OooO0OO.OooO0OO(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(SearchListContainerFragment searchListContainerFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77999OooOo = searchListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77999OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78000OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    SearchListContainerFragment searchListContainerFragment = this.f77999OooOo;
                    C30296OooO00o c30296OooO00oOooOoOO = searchListContainerFragment.OooOoOO();
                    C19430OooO00o c19430OooO00o = new C19430OooO00o(searchListContainerFragment);
                    this.f78000OooOo0o = 1;
                    if (c30296OooO00oOooOoOO.f108007OooOo0o.f121747OooOo0o.collect(c19430OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListContainerFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C19431OooO0O0<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ SearchListContainerFragment f78002OooOo0o;

            public C19431OooO0O0(SearchListContainerFragment searchListContainerFragment) {
                this.f78002OooOo0o = searchListContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                SearchListContainerFragment searchListContainerFragment = this.f78002OooOo0o;
                if (iIntValue == 0) {
                    NoteSearchView noteSearchView = searchListContainerFragment.f77988OooOooO;
                    if (noteSearchView == null) {
                        OooOOO0.OooOOOO("searchView");
                        throw null;
                    }
                    noteSearchView.OooO00o(0, false);
                } else if (iIntValue == 1) {
                    NoteSearchView noteSearchView2 = searchListContainerFragment.f77988OooOooO;
                    if (noteSearchView2 == null) {
                        OooOOO0.OooOOOO("searchView");
                        throw null;
                    }
                    noteSearchView2.OooO00o(8, false);
                } else if (iIntValue == 2) {
                    NoteSearchView noteSearchView3 = searchListContainerFragment.f77988OooOooO;
                    if (noteSearchView3 == null) {
                        OooOOO0.OooOOOO("searchView");
                        throw null;
                    }
                    noteSearchView3.OooO00o(0, true);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = SearchListContainerFragment.this.new OooO0O0(continuation);
            oooO0O0.f77996OooOo = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) throws Throwable {
            ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
        
            if (r9.f108008OooOoO.f121747OooOo0o.collect(r1, r8) == r0) goto L18;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC33636Oooo00o interfaceC33636Oooo00o;
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77997OooOo0o;
            SearchListContainerFragment searchListContainerFragment = SearchListContainerFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f77996OooOo;
                C30296OooO00o c30296OooO00oOooOoOO = searchListContainerFragment.OooOoOO();
                C30278OooO0o c30278OooO0o = (C30278OooO0o) searchListContainerFragment.f77987OooOoo0.getValue();
                this.f77996OooOo = interfaceC33636Oooo00o;
                this.f77997OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30305OooOO0O(c30278OooO0o.f107918OooO0O0, c30296OooO00oOooOoOO, null), this);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o != obj2) {
                }
                return obj2;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                throw new C32438OooO0oO();
            }
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f77996OooOo;
            C32446OooOOOo.OooO0O0(obj);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(searchListContainerFragment, null), 3);
            C30296OooO00o c30296OooO00oOooOoOO2 = searchListContainerFragment.OooOoOO();
            C19431OooO0O0 c19431OooO0O0 = new C19431OooO0O0(searchListContainerFragment);
            this.f77996OooOo = null;
            this.f77997OooOo0o = 2;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            SearchListContainerFragment searchListContainerFragment = SearchListContainerFragment.this;
            Bundle arguments = searchListContainerFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + searchListContainerFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListContainerFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23703OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23703OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return SearchListContainerFragment.this;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78005OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78005OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78005OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListContainerFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23704OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23703OooO0Oo f78006OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23704OooO0o0(C23703OooO0Oo c23703OooO0Oo) {
            super(0);
            this.f78006OooOo0o = c23703OooO0Oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78006OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListContainerFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23705OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78007OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23705OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78007OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78007OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.search.SearchListContainerFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23706OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78008OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23706OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78008OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78008OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? SearchListContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o0o0O0OO.OooO0O0] */
    public SearchListContainerFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f77987OooOoo0 = new C24568OooO0oO(oooo0.OooO0O0(C30278OooO0o.class), new OooO0OO());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23704OooO0o0(new C23703OooO0Oo()));
        this.f77986OooOoo = new C22026ooOO(oooo0.OooO0O0(C30296OooO00o.class), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23706OooO0oo(interfaceC32440OooOO0OooO0O0), new C23705OooO0oO(interfaceC32440OooOO0OooO0O0));
        this.f77994Oooo0O0 = new C24572OooOO0o.OooO0O0() { // from class: o0o0O0OO.OooO0O0
            @Override // o000o0O0.C24572OooOO0o.OooO0O0
            public final void OooO00o(C24572OooOO0o c24572OooOO0o, C24583OooOo0o destination, Bundle bundle) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(c24572OooOO0o, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
                if (destination.f83302OooOooO == R.id.searchListFragment) {
                    this.f107908OooO00o.OooOoOO().OooO0oO();
                }
            }
        };
    }

    public final C30296OooO00o OooOoOO() {
        return (C30296OooO00o) this.f77986OooOoo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f77989OooOooo = new OooO00o();
        C20418OooOoo onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        OooO00o oooO00o = this.f77989OooOooo;
        if (oooO00o != null) {
            onBackPressedDispatcher.OooO00o(this, oooO00o);
        } else {
            OooOOO0.OooOOOO("backPressedCallback");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_search_list_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C21030OooOO0o.OooO0OO(this).OooOo0o(this.f77994Oooo0O0);
        super.onDestroyView();
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C30296OooO00o c30296OooO00oOooOoOO = OooOoOO();
        String str = ((C30278OooO0o) this.f77987OooOoo0.getValue()).f107917OooO00o;
        C33781o00o0O c33781o00o0O = c30296OooO00oOooOoOO.f107993OooOO0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, str);
        final NoteSearchView noteSearchView = (NoteSearchView) view;
        this.f77988OooOooO = noteSearchView;
        SearchView searchView = (SearchView) noteSearchView.findViewById(R.id.search_box);
        noteSearchView.f77979OooOo0o = searchView;
        if (searchView == null) {
            OooOOO0.OooOOOO("searchBox");
            throw null;
        }
        searchView.setOnQueryTextListener(new com.orion.notein.p607ui.notelist.search.OooO00o(noteSearchView));
        View viewFindViewById = noteSearchView.findViewById(R.id.tv_cancel);
        noteSearchView.f77978OooOo = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC30097OooO0Oo(noteSearchView, 1));
        noteSearchView.f77981OooOoO0 = noteSearchView.findViewById(R.id.search_result_empty_wrapper);
        noteSearchView.f77980OooOoO = noteSearchView.findViewById(R.id.search_result_tip);
        SearchView searchView2 = noteSearchView.f77979OooOo0o;
        if (searchView2 == null) {
            OooOOO0.OooOOOO("searchBox");
            throw null;
        }
        searchView2.postDelayed(new Runnable() { // from class: o0o0O0OO.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                SearchView searchView3 = noteSearchView.f77979OooOo0o;
                if (searchView3 != null) {
                    searchView3.setIconified(false);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchBox");
                    throw null;
                }
            }
        }, 200L);
        NoteSearchView noteSearchView2 = this.f77988OooOooO;
        if (noteSearchView2 == null) {
            OooOOO0.OooOOOO("searchView");
            throw null;
        }
        noteSearchView2.setSearchListener(new com.orion.notein.p607ui.notelist.search.OooO0O0(this));
        if (((TabLayout) view.findViewById(R.id.tablayout)) != null) {
            new C30214OooOoOO(this, view, ((Number) OooOoOO().f108004OooOo0.getValue()).intValue(), new C30279OooO0o0(this)).OooO0O0();
            OooOoOO().OooOO0(null);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_more_note_tab);
        if (imageView != null) {
            imageView.setOnClickListener(new o0Oo0oo(this, 4));
            TextView textView = (TextView) view.findViewById(R.id.tv_note_filter);
            if (textView != null) {
                this.f77991Oooo000 = textView;
                SearchListFragment searchListFragment = new SearchListFragment();
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(childFragmentManager);
                oooO00o.OooO0o0(searchListFragment, R.id.fragment_container);
                oooO00o.OooO0oo();
                OooOoOO().OooOO0((Integer) OooOoOO().f108004OooOo0.getValue());
                InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
                OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30277OooO0Oo(this, null), 3);
            }
        }
        View viewFindViewById2 = view.findViewById(R.id.sort);
        this.f77993Oooo00o = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnSort");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new o00oO0O(2, view, this));
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f77990Oooo0 = new C30294OooO0OO(contextRequireContext, new oo000o(this, 5));
        C21030OooOO0o.OooO0OO(this).OooO0O0(this.f77994Oooo0O0);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO0O0(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        Log.d("SearchListContainerFragment", "onViewStateRestored");
    }
}
