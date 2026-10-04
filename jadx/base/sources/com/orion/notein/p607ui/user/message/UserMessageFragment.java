package com.orion.notein.p607ui.user.message;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0Oo0o0o.ViewOnClickListenerC28234OooOO0o;
import o0o00Oo.C29899OooO0o0;
import o0oOo0Oo.C30967OooO0O0;
import o0oOo0Oo.C30972OooO0oO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/user/message/UserMessageFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UserMessageFragment extends Hilt_UserMessageFragment {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final int f79796Oooo000 = o000000O.OooO0o(16);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f79797OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f79798OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public RecyclerView f79799OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public com.orion.notein.p607ui.user.message.OooO00o f79800OooOooo;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return UserMessageFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return UserMessageFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return UserMessageFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.message.UserMessageFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23877OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23877OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return UserMessageFragment.this;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79805OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79805OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f79805OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.message.UserMessageFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23878OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23877OooO0Oo f79806OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23878OooO0o0(C23877OooO0Oo c23877OooO0Oo) {
            super(0);
            this.f79806OooOo0o = c23877OooO0Oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f79806OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.message.UserMessageFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23879OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79807OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23879OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79807OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79807OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.message.UserMessageFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23880OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f79808OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23880OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79808OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79808OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? UserMessageFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public UserMessageFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23878OooO0o0(new C23877OooO0Oo()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f79798OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C30972OooO0oO.class), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23880OooO0oo(interfaceC32440OooOO0OooO0O0), new C23879OooO0oO(interfaceC32440OooOO0OooO0O0));
        this.f79797OooOoo = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO00o(), new OooO0OO(), new OooO0O0());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.user_messages_fragment, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setBackgroundResource(R.color.layout_bg_color);
        }
        View viewFindViewById = view.findViewById(R.id.btn_back);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28234OooOO0o(viewFindViewById, 3));
        ((TextView) view.findViewById(R.id.tv_title)).setText(getString(R.string.message_notification));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_message);
        if (recyclerView == null) {
            return;
        }
        this.f79799OooOooO = recyclerView;
        recyclerView.addItemDecoration(new C29899OooO0o0(f79796Oooo000, 2));
        com.orion.notein.p607ui.user.message.OooO00o oooO00o = new com.orion.notein.p607ui.user.message.OooO00o();
        this.f79800OooOooo = oooO00o;
        oooO00o.f79784OooO0O0 = new com.orion.notein.p607ui.user.message.OooO0OO(this);
        RecyclerView recyclerView2 = this.f79799OooOooO;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("messageListView");
            throw null;
        }
        recyclerView2.setAdapter(oooO00o);
        RecyclerView recyclerView3 = this.f79799OooOooO;
        if (recyclerView3 == null) {
            OooOOO0.OooOOOO("messageListView");
            throw null;
        }
        recyclerView3.setOverScrollMode(1);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30967OooO0O0(this, null), 3);
    }
}
