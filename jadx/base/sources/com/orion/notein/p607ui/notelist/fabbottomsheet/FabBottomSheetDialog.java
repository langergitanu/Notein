package com.orion.notein.p607ui.notelist.fabbottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.OooOOOO;
import androidx.navigation.fragment.NavHostFragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.PhoneBottomSheetDialog;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabBottomSheetDialog;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o0o0O00.C30191OooO0oO;
import o0o0O00.C30207OooOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/fabbottomsheet/FabBottomSheetDialog;", "Lcom/orion/notein/ui/PhoneBottomSheetDialog;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FabBottomSheetDialog extends PhoneBottomSheetDialog {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C30191OooO0oO f77461OooOoO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.fabbottomsheet.FabBottomSheetDialog$onViewCreated$1$1", m80623f = "FabBottomSheetDialog.kt", m80624l = {114}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NavHostFragment f77462OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77463OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f77464OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NavHostFragment navHostFragment, OooO0O0 oooO0O0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f77462OooOo = navHostFragment;
            this.f77464OooOoO0 = oooO0O0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f77462OooOo, this.f77464OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77463OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f77463OooOo0o = 1;
                if (C33644OoooO0.OooO00o(200L, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            OooOOOO oooOOOO = this.f77462OooOo.getChildFragmentManager().f64823OooOoOO;
            if (oooOOOO instanceof C30207OooOo.OooO0O0) {
                ((C30207OooOo.OooO0O0) oooOOOO).OooOo0O(this.f77464OooOoO0);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 implements C30207OooOo.OooO00o {
        public OooO0O0() {
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooO() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooO();
            }
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooO00o() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooO00o();
            }
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooO0O0() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooO0O0();
            }
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooO0OO() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooO0OO();
            }
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooO0Oo() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooO0Oo();
            }
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooO0o() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooO0o();
            }
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooO0o0() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooO0o0();
            }
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooO0oO() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooO0oO();
            }
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooO0oo() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooO0oo();
            }
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooOO0() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooOO0();
            }
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooOO0O() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooOO0O();
            }
        }

        @Override // o0o0O00.C30207OooOo.OooO00o
        public final void OooOO0o() {
            FabBottomSheetDialog fabBottomSheetDialog = FabBottomSheetDialog.this;
            fabBottomSheetDialog.dismiss();
            C30191OooO0oO c30191OooO0oO = fabBottomSheetDialog.f77461OooOoO0;
            if (c30191OooO0oO != null) {
                c30191OooO0oO.OooOO0o();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_bottom_sheet_fab, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.PhoneBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        final OooO0O0 oooO0O0 = new OooO0O0();
        Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.nav_host_fragment);
        final NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        if (navHostFragment != null) {
            navHostFragment.OooOoO0().OooO0O0(new C24572OooOO0o.OooO0O0() { // from class: o0o00ooO.OooO00o
                @Override // o000o0O0.C24572OooOO0o.OooO0O0
                public final void OooO00o(C24572OooOO0o c24572OooOO0o, C24583OooOo0o destination, Bundle bundle2) {
                    OooOOO0.OooO0oO(c24572OooOO0o, "<unused var>");
                    OooOOO0.OooO0oO(destination, "destination");
                    InterfaceC21987OooOoo viewLifecycleOwner = this.f107278OooO00o.getViewLifecycleOwner();
                    OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new FabBottomSheetDialog.OooO00o(navHostFragment, oooO0O0, null), 3);
                }
            });
        }
    }
}
