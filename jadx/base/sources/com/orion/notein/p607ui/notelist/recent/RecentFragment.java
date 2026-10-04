package com.orion.notein.p607ui.notelist.recent;

import OooOOOo.OooOOO0;
import OooOoOO.C20519OooO0Oo;
import Oooo0O0.OooOO0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.notelist.recent.RecentFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o0O0o0oO.ViewOnClickListenerC26049OoooOO0;
import o0O0o0oO.ViewOnClickListenerC26051OoooOOo;
import o0O0oooO.o0Oo0oo;
import o0Oo0o00.C28201OooooO0;
import o0o00oOo.C30028OooO;
import o0o00oOo.C30035OooO0oO;
import o0o0O00.C30201OooOOO0;
import o0o0O0O.C30262OooO0oO;
import o0o0O0O.C30263OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/recent/RecentFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class RecentFragment extends Hilt_RecentFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f77867OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f77868OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f77869OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f77870OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public com.orion.notein.p607ui.notelist.OooO00o f77871Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f77872Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public RecyclerView f77873Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C30035OooO0oO f77874Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public o0o0O0.OooO f77875Oooo0O0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f77876OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77876OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77876OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? RecentFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.recent.RecentFragment$onResume$1$1", m80623f = "RecentFragment.kt", m80624l = {86}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f77878OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77879OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ RecentFragment f77880OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f77881OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f77882OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, RecentFragment recentFragment, int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f77878OooOo = str;
            this.f77881OooOoO0 = str2;
            this.f77880OooOoO = recentFragment;
            this.f77882OooOoOO = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f77878OooOo, this.f77881OooOoO0, this.f77880OooOoO, this.f77882OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77879OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String str = this.f77878OooOo;
                if (str.length() > 0) {
                    String str2 = this.f77881OooOoO0;
                    if (str2.length() > 0) {
                        com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOooO = this.f77880OooOoO.OooOooO();
                        this.f77879OooOo0o = 1;
                        if (oooO0OOOooOooO.OooOo0O(str, this.f77882OooOoOO, str2, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
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

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return RecentFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return RecentFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.recent.RecentFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23693OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23693OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return RecentFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23694OooO0o0 f77886OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C23694OooO0o0 c23694OooO0o0) {
            super(0);
            this.f77886OooOo0o = c23694OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f77886OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.recent.RecentFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23694OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23694OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return RecentFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.recent.RecentFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23695OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77888OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23695OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77888OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f77888OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.recent.RecentFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23696OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f77889OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23696OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f77889OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f77889OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public RecentFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0o(new C23694OooO0o0()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f77868OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.notelist.OooO0OO.class), new C23695OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C23696OooO0oo(interfaceC32440OooOO0OooO0O0));
        this.f77867OooOoo = new C22026ooOO(oooo0.OooO0O0(C28201OooooO0.class), new OooO0O0(), new C23693OooO0Oo(), new OooO0OO());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoOO(RecentFragment recentFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0o0O0O.OooO oooO;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof o0o0O0O.OooO) {
            oooO = (o0o0O0O.OooO) abstractC32479OooO0OO;
            int i2 = oooO.f107814OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO.f107814OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                oooO = new o0o0O0O.OooO(recentFragment, abstractC32479OooO0OO);
            }
        }
        o0o0O0O.OooO oooO2 = oooO;
        Object objShowNonVipFeatureLimitedDialog$default = oooO2.f107813OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = oooO2.f107814OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = recentFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            oooO2.f107814OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, oooO2, 6, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public final LockNoteFragment OooOoo() {
        Fragment fragmentOooOooo = getChildFragmentManager().OooOooo("LockNoteFragment");
        if (fragmentOooOooo != null) {
            return (LockNoteFragment) fragmentOooOooo;
        }
        LockNoteFragment lockNoteFragment = new LockNoteFragment();
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
        oooO00oOooO0OO.OooO0Oo(0, lockNoteFragment, "LockNoteFragment", 1);
        oooO00oOooO0OO.OooOO0O();
        return lockNoteFragment;
    }

    public final int OooOoo0(Context context) {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(OooOooO().f77164OoooOOO.f121747OooOo0o.getValue(), Boolean.TRUE)) {
            return 1;
        }
        return Math.max(1, (context.getResources().getConfiguration().screenWidthDp - 64) / 138);
    }

    public final com.orion.notein.p607ui.notelist.OooO0OO OooOooO() {
        return (com.orion.notein.p607ui.notelist.OooO0OO) this.f77868OooOoo0.getValue();
    }

    public final void OooOooo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        RecyclerView recyclerView = this.f77873Oooo00O;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iOooOoo0 = OooOoo0(context);
        if (gridLayoutManager.f65751OooOo != iOooOoo0) {
            RecyclerView recyclerView2 = this.f77873Oooo00O;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                throw null;
            }
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(requireContext(), iOooOoo0);
            gridLayoutManager2.scrollToPosition(gridLayoutManager.findFirstVisibleItemPosition());
            recyclerView2.setLayoutManager(gridLayoutManager2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_recent_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        OooOO0.OooO00o(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getSupportFragmentManager().Oooooo0("rename", this, new InterfaceC21912Oooo0o() { // from class: o0o0O0O.OooO00o
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                int i = bundle.getInt(C18437z2.f56754h);
                String string = bundle.getString("id");
                String str2 = string == null ? "" : string;
                String string2 = bundle.getString("new_name");
                String str3 = string2 == null ? "" : string2;
                RecentFragment recentFragment = this.f107815OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = recentFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new RecentFragment.OooO00o(str2, str3, recentFragment, i, null), 2);
            }
        });
        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = requireActivity();
        kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
        ((MainActivity) activityC21897OooOo0RequireActivity).setDrawerEnable(true);
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.setContentInsetsAbsolute(0, 0);
        View viewFindViewById = view.findViewById(R.id.btn_menu);
        this.f77869OooOooO = viewFindViewById;
        if (viewFindViewById == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnMenu");
            throw null;
        }
        viewFindViewById.setOnClickListener(new o0Oo0oo(this, 7));
        View viewFindViewById2 = view.findViewById(R.id.btn_search);
        this.f77870OooOooo = viewFindViewById2;
        if (viewFindViewById2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnSearch");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC26049OoooOO0(this, 6));
        this.f77872Oooo000 = view.findViewById(R.id.empty_bg_wrapper);
        this.f77873Oooo00O = (RecyclerView) view.findViewById(R.id.item_list);
        C30035OooO0oO c30035OooO0oO = new C30035OooO0oO();
        this.f77874Oooo00o = c30035OooO0oO;
        c30035OooO0oO.f106769OooO0O0 = new ViewOnClickListenerC26051OoooOOo(this, 4);
        c30035OooO0oO.f106770OooO0OO = new View.OnContextClickListener() { // from class: o0o0O0O.OooO0OO
            @Override // android.view.View.OnContextClickListener
            public final boolean onContextClick(View view2) {
                Object tag = view2.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                NoteVO noteVO = (NoteVO) tag;
                if (noteVO.getInSelectMode()) {
                    return false;
                }
                int type = noteVO.getType();
                if (type != 0 && type != 1) {
                    return false;
                }
                RecentFragment recentFragment = this.f107817OooO00o;
                o0o0O0.OooO oooO = recentFragment.f77875Oooo0O0;
                if (oooO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                    throw null;
                }
                if (oooO.OooO0O0()) {
                    o0o0O0.OooO oooO2 = recentFragment.f77875Oooo0O0;
                    if (oooO2 != null) {
                        oooO2.OooO00o();
                        return true;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                    throw null;
                }
                o0o0O0.OooO oooO3 = recentFragment.f77875Oooo0O0;
                if (oooO3 != null) {
                    oooO3.OooO0OO(view2, noteVO);
                    return true;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                throw null;
            }
        };
        RecyclerView recyclerView = this.f77873Oooo00O;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), OooOoo0(context)));
        C30035OooO0oO c30035OooO0oO2 = this.f77874Oooo00o;
        if (c30035OooO0oO2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
            throw null;
        }
        recyclerView.setAdapter(c30035OooO0oO2);
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = this.f77873Oooo00O;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        recyclerView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0o0O0O.OooO0Oo
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f107818OooOo0o.OooOooo();
            }
        });
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30262OooO0oO(this, null), 3);
        kotlin.jvm.internal.OooOOO0.OooO0o(requireContext(), "requireContext(...)");
        C20519OooO0Oo.OooO0OO(new C30028OooO());
        new AtomicBoolean(false);
        C30201OooOOO0 c30201OooOOO0 = new C30201OooOOO0(this, new oO0O000o.OooO00o() { // from class: o0o0O0O.OooO0O0
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return this.f107816OooOo0o.OooOoo();
            }
        }, OooOooO(), (C28201OooooO0) this.f77867OooOoo.getValue());
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f77875Oooo0O0 = new o0o0O0.OooO(contextRequireContext, c30201OooOOO0);
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        this.f77871Oooo0 = new com.orion.notein.p607ui.notelist.OooO00o(contextRequireContext2, new C30263OooO0oo(this));
    }
}
