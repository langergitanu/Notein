package com.orion.notein.p607ui.settings.debug;

import OooOoOO.C20519OooO0Oo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0o0OoOO.C30717Oooo0OO;
import o0o0OoOO.C30719Oooo0o0;
import o0o0OoOo.C30722OooO00o;
import o0o0OoOo.C30731OooOO0O;
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
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/settings/debug/DebugImportedPdfListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DebugImportedPdfListFragment extends Hilt_DebugImportedPdfListFragment {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f79073OooOoo0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugImportedPdfListFragment$onViewCreated$1", m80623f = "DebugImportedPdfListFragment.kt", m80624l = {43}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79075OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C30719Oooo0o0 f79076OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.DebugImportedPdfListFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugImportedPdfListFragment$onViewCreated$1$1", m80623f = "DebugImportedPdfListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19486OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C30717Oooo0OO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C30719Oooo0o0 f79077OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f79078OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19486OooO00o(C30719Oooo0o0 c30719Oooo0o0, Continuation<? super C19486OooO00o> continuation) {
                super(2, continuation);
                this.f79077OooOo = c30719Oooo0o0;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19486OooO00o c19486OooO00o = new C19486OooO00o(this.f79077OooOo, continuation);
                c19486OooO00o.f79078OooOo0o = obj;
                return c19486OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C30717Oooo0OO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19486OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f79077OooOo.OooO0Oo((List) this.f79078OooOo0o);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C30719Oooo0o0 c30719Oooo0o0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f79076OooOoO0 = c30719Oooo0o0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return DebugImportedPdfListFragment.this.new OooO00o(this.f79076OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79075OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30722OooO00o c30722OooO00o = (C30722OooO00o) DebugImportedPdfListFragment.this.f79073OooOoo0.getValue();
                C19486OooO00o c19486OooO00o = new C19486OooO00o(this.f79076OooOoO0, null);
                this.f79075OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c30722OooO00o.f109882OooOoo0, c19486OooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return DebugImportedPdfListFragment.this;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f79080OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f79080OooOo0o = oooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f79080OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.DebugImportedPdfListFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23813OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79081OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23813OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79081OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f79081OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f79082OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79082OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79082OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? DebugImportedPdfListFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.DebugImportedPdfListFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23814OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79084OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23814OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79084OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79084OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public DebugImportedPdfListFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new OooO0O0()));
        this.f79073OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30722OooO00o.class), new C23813OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23814OooO0o0(interfaceC32440OooOO0OooO0O0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_debug_pdf_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C30722OooO00o c30722OooO00o = (C30722OooO00o) this.f79073OooOoo0.getValue();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30722OooO00o);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30731OooOO0O(c30722OooO00o, null), 2);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_pdf_list);
        C30719Oooo0o0 c30719Oooo0o0 = new C30719Oooo0o0(C30719Oooo0o0.OooO00o.f109850OooO00o);
        recyclerView.setAdapter(c30719Oooo0o0);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(c30719Oooo0o0, null), 3);
    }
}
