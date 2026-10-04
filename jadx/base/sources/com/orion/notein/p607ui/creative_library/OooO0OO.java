package com.orion.notein.p607ui.creative_library;

import OooO0o.C20424OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o00o00O0.C25252OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import o0Oo0Oo.C28085OooO;
import o0Oo0Ooo.C28140OooO0o0;
import o0Oo0oOo.C28312OooO0oO;
import o0oo000O.OooOO0O;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailFragment$observeUiEvents$1", m80623f = "CreativeLibraryDetailFragment.kt", m80624l = {226}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CreativeLibraryDetailFragment f70997OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70998OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailFragment$observeUiEvents$1$1", m80623f = "CreativeLibraryDetailFragment.kt", m80624l = {227}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CreativeLibraryDetailFragment f70999OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71000OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailFragment$observeUiEvents$1$1$1", m80623f = "CreativeLibraryDetailFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19173OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C23028OooO0Oo.OooO0OO, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CreativeLibraryDetailFragment f71001OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f71002OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19173OooO00o(CreativeLibraryDetailFragment creativeLibraryDetailFragment, Continuation<? super C19173OooO00o> continuation) {
                super(2, continuation);
                this.f71001OooOo = creativeLibraryDetailFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19173OooO00o c19173OooO00o = new C19173OooO00o(this.f71001OooOo, continuation);
                c19173OooO00o.f71002OooOo0o = obj;
                return c19173OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C23028OooO0Oo.OooO0OO oooO0OO, Continuation<? super C32460OooOooO> continuation) {
                return ((C19173OooO00o) create(oooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C23028OooO0Oo.OooO0OO oooO0OO = (C23028OooO0Oo.OooO0OO) this.f71002OooOo0o;
                boolean z = oooO0OO instanceof C23028OooO0Oo.OooO0OO.OooO00o;
                CreativeLibraryDetailFragment creativeLibraryDetailFragment = this.f71001OooOo;
                if (z) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("CreativeLibraryDetailFragment");
                    c20358OooO00o.OooO00o("UiEvent: NavigateToLogin", new Object[0]);
                    ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = creativeLibraryDetailFragment.requireActivity();
                    OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                    C28085OooO.OooO00o(activityC21897OooOo0RequireActivity, false);
                } else if (oooO0OO instanceof C23028OooO0Oo.OooO0OO.C19174OooO0OO) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("CreativeLibraryDetailFragment");
                    c20358OooO00o2.OooO00o("UiEvent: NavigateToVip", new Object[0]);
                    C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(creativeLibraryDetailFragment);
                    Context contextRequireContext = creativeLibraryDetailFragment.requireContext();
                    OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    if (OooOO0O.OooO00o(contextRequireContext)) {
                        C28026OooO0OO.OooO00o(c24572OooOO0oOooO0OO, R.id.membership_plans_dialog, null);
                    } else {
                        C28026OooO0OO.OooO00o(c24572OooOO0oOooO0OO, R.id.membership_plans_bottom_sheet, null);
                    }
                } else if (oooO0OO instanceof C23028OooO0Oo.OooO0OO.C19175OooO0Oo) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("CreativeLibraryDetailFragment");
                    C23028OooO0Oo.OooO0OO.C19175OooO0Oo c19175OooO0Oo = (C23028OooO0Oo.OooO0OO.C19175OooO0Oo) oooO0OO;
                    StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("UiEvent: ShowPurchaseDialog materialId=", c19175OooO0Oo.f71024OooO00o, ", price=");
                    sbOooO0o0.append(c19175OooO0Oo.f71025OooO0O0);
                    c20358OooO00o3.OooO00o(sbOooO0o0.toString(), new Object[0]);
                    String str = ((C23028OooO0Oo.C19176OooO0Oo) creativeLibraryDetailFragment.OooOoOO().f71011OooOO0O.f121747OooOo0o.getValue()).f71030OooO0Oo;
                    C28140OooO0o0.OooO00o(creativeLibraryDetailFragment, C21030OooOO0o.OooO0OO(creativeLibraryDetailFragment), c19175OooO0Oo.f71024OooO00o, str, c19175OooO0Oo.f71025OooO0O0, new C28312OooO0oO(creativeLibraryDetailFragment, 0));
                } else {
                    if (!(oooO0OO instanceof C23028OooO0Oo.OooO0OO.OooO0O0)) {
                        throw new C32442OooOO0o();
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("CreativeLibraryDetailFragment");
                    C23028OooO0Oo.OooO0OO.OooO0O0 oooO0O0 = (C23028OooO0Oo.OooO0OO.OooO0O0) oooO0OO;
                    c20358OooO00o4.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("UiEvent: NavigateToMyTemplate materialId=", oooO0O0.f71022OooO00o), new Object[0]);
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(creativeLibraryDetailFragment), R.id.paperConfigDialogFragment, BundleKt.bundleOf(new C32443OooOOO("strategyType", "CREATE_NOTE"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, null), new C32443OooOOO("targetMaterialId", oooO0O0.f71022OooO00o)));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CreativeLibraryDetailFragment creativeLibraryDetailFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f70999OooOo = creativeLibraryDetailFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f70999OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71000OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                CreativeLibraryDetailFragment creativeLibraryDetailFragment = this.f70999OooOo;
                C23028OooO0Oo c23028OooO0OoOooOoOO = creativeLibraryDetailFragment.OooOoOO();
                C19173OooO00o c19173OooO00o = new C19173OooO00o(creativeLibraryDetailFragment, null);
                this.f71000OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c23028OooO0OoOooOoOO.f71014OooOOO0, c19173OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(CreativeLibraryDetailFragment creativeLibraryDetailFragment, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f70997OooOo = creativeLibraryDetailFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0OO(this.f70997OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70998OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CreativeLibraryDetailFragment creativeLibraryDetailFragment = this.f70997OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = creativeLibraryDetailFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(creativeLibraryDetailFragment, null);
            this.f70998OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
