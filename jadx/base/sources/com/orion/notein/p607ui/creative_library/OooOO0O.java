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
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o00o00O0.C25252OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import o0Oo0Oo.C28085OooO;
import o0Oo0Ooo.C28140OooO0o0;
import o0Oo0oOo.C28334OooOooO;
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
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryListFragment$observeUiEvents$1", m80623f = "CreativeLibraryListFragment.kt", m80624l = {158}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CreativeLibraryListFragment f71070OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71071OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryListFragment$observeUiEvents$1$1", m80623f = "CreativeLibraryListFragment.kt", m80624l = {159}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CreativeLibraryListFragment f71072OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71073OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryListFragment$observeUiEvents$1$1$1", m80623f = "CreativeLibraryListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19177OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C23033OooOO0o.OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CreativeLibraryListFragment f71074OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f71075OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19177OooO00o(CreativeLibraryListFragment creativeLibraryListFragment, Continuation<? super C19177OooO00o> continuation) {
                super(2, continuation);
                this.f71074OooOo = creativeLibraryListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19177OooO00o c19177OooO00o = new C19177OooO00o(this.f71074OooOo, continuation);
                c19177OooO00o.f71075OooOo0o = obj;
                return c19177OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C23033OooOO0o.OooO0O0 oooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((C19177OooO00o) create(oooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
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
                C23033OooOO0o.OooO0O0 oooO0O0 = (C23033OooOO0o.OooO0O0) this.f71075OooOo0o;
                boolean z = oooO0O0 instanceof C23033OooOO0o.OooO0O0.OooO00o;
                CreativeLibraryListFragment creativeLibraryListFragment = this.f71074OooOo;
                if (z) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("CreativeLibraryListFragment");
                    c20358OooO00o.OooO00o("UiEvent: NavigateToLogin", new Object[0]);
                    ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = creativeLibraryListFragment.requireActivity();
                    OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                    C28085OooO.OooO00o(activityC21897OooOo0RequireActivity, false);
                } else {
                    Object obj2 = null;
                    if (oooO0O0 instanceof C23033OooOO0o.OooO0O0.OooO0OO) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("CreativeLibraryListFragment");
                        c20358OooO00o2.OooO00o("UiEvent: NavigateToVip", new Object[0]);
                        C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(creativeLibraryListFragment);
                        Context contextRequireContext = creativeLibraryListFragment.requireContext();
                        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        if (o0oo000O.OooOO0O.OooO00o(contextRequireContext)) {
                            C28026OooO0OO.OooO00o(c24572OooOO0oOooO0OO, R.id.membership_plans_dialog, null);
                        } else {
                            C28026OooO0OO.OooO00o(c24572OooOO0oOooO0OO, R.id.membership_plans_bottom_sheet, null);
                        }
                    } else if (oooO0O0 instanceof C23033OooOO0o.OooO0O0.C23034OooO0Oo) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("CreativeLibraryListFragment");
                        C23033OooOO0o.OooO0O0.C23034OooO0Oo c23034OooO0Oo = (C23033OooOO0o.OooO0O0.C23034OooO0Oo) oooO0O0;
                        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("UiEvent: ShowPurchaseDialog materialId=", c23034OooO0Oo.f71102OooO00o, ", price=");
                        sbOooO0o0.append(c23034OooO0Oo.f71103OooO0O0);
                        c20358OooO00o3.OooO00o(sbOooO0o0.toString(), new Object[0]);
                        Iterator<T> it = ((C23033OooOO0o.OooO0OO) creativeLibraryListFragment.OooOoo().f71085OooOOO.f121747OooOo0o.getValue()).f71106OooO0OO.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            Object obj3 = obj2;
                            str = c23034OooO0Oo.f71102OooO00o;
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
                        C23033OooOO0o.OooO00o oooO00o = (C23033OooOO0o.OooO00o) next;
                        if (oooO00o == null || (str2 = oooO00o.f71089OooO0O0) == null) {
                            str2 = "";
                        }
                        C28140OooO0o0.OooO00o(creativeLibraryListFragment, C21030OooOO0o.OooO0OO(creativeLibraryListFragment), str, str2, c23034OooO0Oo.f71103OooO0O0, new C28334OooOooO(creativeLibraryListFragment, i));
                    } else {
                        if (!(oooO0O0 instanceof C23033OooOO0o.OooO0O0.C19178OooO0O0)) {
                            throw new C32442OooOO0o();
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("CreativeLibraryListFragment");
                        C23033OooOO0o.OooO0O0.C19178OooO0O0 c19178OooO0O0 = (C23033OooOO0o.OooO0O0.C19178OooO0O0) oooO0O0;
                        c20358OooO00o4.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("UiEvent: NavigateToMyTemplate materialId=", c19178OooO0O0.f71100OooO00o), new Object[0]);
                        C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(creativeLibraryListFragment), R.id.paperConfigDialogFragment, BundleKt.bundleOf(new C32443OooOOO("strategyType", "CREATE_NOTE"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, null), new C32443OooOOO("targetMaterialId", c19178OooO0O0.f71100OooO00o)));
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CreativeLibraryListFragment creativeLibraryListFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71072OooOo = creativeLibraryListFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f71072OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71073OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                CreativeLibraryListFragment creativeLibraryListFragment = this.f71072OooOo;
                C23033OooOO0o c23033OooOO0oOooOoo = creativeLibraryListFragment.OooOoo();
                C19177OooO00o c19177OooO00o = new C19177OooO00o(creativeLibraryListFragment, null);
                this.f71073OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c23033OooOO0oOooOoo.f71082OooOO0, c19177OooO00o, this) == enumC32485OooO00o) {
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
    public OooOO0O(CreativeLibraryListFragment creativeLibraryListFragment, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f71070OooOo = creativeLibraryListFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0O(this.f71070OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71071OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CreativeLibraryListFragment creativeLibraryListFragment = this.f71070OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = creativeLibraryListFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(creativeLibraryListFragment, null);
            this.f71071OooOo0o = 1;
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
