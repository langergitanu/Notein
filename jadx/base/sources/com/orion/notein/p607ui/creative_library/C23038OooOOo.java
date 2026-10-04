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
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o00o00O0.C25252OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import o0Oo0Oo.C28085OooO;
import o0Oo0Ooo.C28140OooO0o0;
import o0Oo0oOo.C28349OoooO00;
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

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$observeUiEvents$1", m80623f = "CreativeLibrarySearchFragment.kt", m80624l = {130}, m80625m = "invokeSuspend")
public final class C23038OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CreativeLibrarySearchFragment f71132OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71133OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$observeUiEvents$1$1", m80623f = "CreativeLibrarySearchFragment.kt", m80624l = {131}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CreativeLibrarySearchFragment f71134OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71135OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$observeUiEvents$1$1$1", m80623f = "CreativeLibrarySearchFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19179OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C23040OooOOoo.OooO00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CreativeLibrarySearchFragment f71136OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f71137OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19179OooO00o(CreativeLibrarySearchFragment creativeLibrarySearchFragment, Continuation<? super C19179OooO00o> continuation) {
                super(2, continuation);
                this.f71136OooOo = creativeLibrarySearchFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19179OooO00o c19179OooO00o = new C19179OooO00o(this.f71136OooOo, continuation);
                c19179OooO00o.f71137OooOo0o = obj;
                return c19179OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C23040OooOOoo.OooO00o oooO00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19179OooO00o) create(oooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                String str;
                Object next;
                String str2;
                int i = 0;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C23040OooOOoo.OooO00o oooO00o = (C23040OooOOoo.OooO00o) this.f71137OooOo0o;
                boolean z = oooO00o instanceof C23040OooOOoo.OooO00o.C19180OooO00o;
                CreativeLibrarySearchFragment creativeLibrarySearchFragment = this.f71136OooOo;
                if (z) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("CreativeLibrarySearchFragment");
                    c20358OooO00o.OooO00o("UiEvent: NavigateToLogin", new Object[0]);
                    ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = creativeLibrarySearchFragment.requireActivity();
                    OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                    C28085OooO.OooO00o(activityC21897OooOo0RequireActivity, false);
                } else {
                    Object obj2 = null;
                    if (oooO00o instanceof C23040OooOOoo.OooO00o.OooO0OO) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("CreativeLibrarySearchFragment");
                        c20358OooO00o2.OooO00o("UiEvent: NavigateToVip", new Object[0]);
                        C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(creativeLibrarySearchFragment);
                        Context contextRequireContext = creativeLibrarySearchFragment.requireContext();
                        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        if (OooOO0O.OooO00o(contextRequireContext)) {
                            C28026OooO0OO.OooO00o(c24572OooOO0oOooO0OO, R.id.membership_plans_dialog, null);
                        } else {
                            C28026OooO0OO.OooO00o(c24572OooOO0oOooO0OO, R.id.membership_plans_bottom_sheet, null);
                        }
                    } else if (oooO00o instanceof C23040OooOOoo.OooO00o.C23041OooO0Oo) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("CreativeLibrarySearchFragment");
                        C23040OooOOoo.OooO00o.C23041OooO0Oo c23041OooO0Oo = (C23040OooOOoo.OooO00o.C23041OooO0Oo) oooO00o;
                        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("UiEvent: ShowPurchaseDialog materialId=", c23041OooO0Oo.f71156OooO00o, ", price=");
                        sbOooO0o0.append(c23041OooO0Oo.f71157OooO0O0);
                        c20358OooO00o3.OooO00o(sbOooO0o0.toString(), new Object[0]);
                        Iterator<T> it = ((C23040OooOOoo.OooO0O0) creativeLibrarySearchFragment.OooOoOO().f71152OooOOO0.f121747OooOo0o.getValue()).f71159OooO0O0.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            Object obj3 = obj2;
                            str = c23041OooO0Oo.f71156OooO00o;
                            if (!zHasNext) {
                                next = obj3;
                                break;
                            }
                            next = it.next();
                            if (OooOOO0.OooO0O0(((C23033OooOO0o.OooO00o) next).f71088OooO00o, str)) {
                                break;
                            }
                            obj2 = obj3;
                        }
                        C23033OooOO0o.OooO00o oooO00o2 = (C23033OooOO0o.OooO00o) next;
                        if (oooO00o2 == null || (str2 = oooO00o2.f71089OooO0O0) == null) {
                            str2 = "";
                        }
                        C28140OooO0o0.OooO00o(creativeLibrarySearchFragment, C21030OooOO0o.OooO0OO(creativeLibrarySearchFragment), str, str2, c23041OooO0Oo.f71157OooO0O0, new C28349OoooO00(creativeLibrarySearchFragment, i));
                    } else {
                        if (!(oooO00o instanceof C23040OooOOoo.OooO00o.OooO0O0)) {
                            throw new C32442OooOO0o();
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("CreativeLibrarySearchFragment");
                        C23040OooOOoo.OooO00o.OooO0O0 oooO0O0 = (C23040OooOOoo.OooO00o.OooO0O0) oooO00o;
                        c20358OooO00o4.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("UiEvent: NavigateToMyTemplate materialId=", oooO0O0.f71154OooO00o), new Object[0]);
                        C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(creativeLibrarySearchFragment), R.id.paperConfigDialogFragment, BundleKt.bundleOf(new C32443OooOOO("strategyType", "CREATE_NOTE"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, null), new C32443OooOOO("targetMaterialId", oooO0O0.f71154OooO00o)));
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CreativeLibrarySearchFragment creativeLibrarySearchFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71134OooOo = creativeLibrarySearchFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f71134OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71135OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                CreativeLibrarySearchFragment creativeLibrarySearchFragment = this.f71134OooOo;
                C23040OooOOoo c23040OooOOooOooOoOO = creativeLibrarySearchFragment.OooOoOO();
                C19179OooO00o c19179OooO00o = new C19179OooO00o(creativeLibrarySearchFragment, null);
                this.f71135OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c23040OooOOooOooOoOO.f71148OooOO0, c19179OooO00o, this) == enumC32485OooO00o) {
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
    public C23038OooOOo(CreativeLibrarySearchFragment creativeLibrarySearchFragment, Continuation<? super C23038OooOOo> continuation) {
        super(2, continuation);
        this.f71132OooOo = creativeLibrarySearchFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23038OooOOo(this.f71132OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23038OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71133OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CreativeLibrarySearchFragment creativeLibrarySearchFragment = this.f71132OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = creativeLibrarySearchFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(creativeLibrarySearchFragment, null);
            this.f71133OooOo0o = 1;
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
