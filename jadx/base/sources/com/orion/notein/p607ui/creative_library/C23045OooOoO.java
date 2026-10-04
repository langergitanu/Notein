package com.orion.notein.p607ui.creative_library;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.C23047OooOoOO;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o00o00O0.C25252OooO0Oo;
import o00oo0Oo.C25708OooOoOO;
import o0Oo00o.C28026OooO0OO;
import o0Oo0Oo.C28085OooO;
import o0Oo0Ooo.C28140OooO0o0;
import o0oo000O.OooOO0O;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreatorProfileFragment$observeUiEvents$1", m80623f = "CreatorProfileFragment.kt", m80624l = {138}, m80625m = "invokeSuspend")
public final class C23045OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CreatorProfileFragment f71179OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71180OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOoO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreatorProfileFragment$observeUiEvents$1$1", m80623f = "CreatorProfileFragment.kt", m80624l = {139}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CreatorProfileFragment f71181OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71182OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOoO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreatorProfileFragment$observeUiEvents$1$1$1", m80623f = "CreatorProfileFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19181OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C23047OooOoOO.OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ CreatorProfileFragment f71183OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f71184OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19181OooO00o(CreatorProfileFragment creatorProfileFragment, Continuation<? super C19181OooO00o> continuation) {
                super(2, continuation);
                this.f71183OooOo = creatorProfileFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19181OooO00o c19181OooO00o = new C19181OooO00o(this.f71183OooOo, continuation);
                c19181OooO00o.f71184OooOo0o = obj;
                return c19181OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C23047OooOoOO.OooO0O0 oooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((C19181OooO00o) create(oooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                String str;
                String str2;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C23047OooOoOO.OooO0O0 oooO0O0 = (C23047OooOoOO.OooO0O0) this.f71184OooOo0o;
                boolean z = oooO0O0 instanceof C23047OooOoOO.OooO0O0.OooO00o;
                CreatorProfileFragment creatorProfileFragment = this.f71183OooOo;
                if (z) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("CreatorProfileFragment");
                    c20358OooO00o.OooO00o("UiEvent: NavigateToLogin", new Object[0]);
                    ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = creatorProfileFragment.requireActivity();
                    OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                    C28085OooO.OooO00o(activityC21897OooOo0RequireActivity, false);
                } else {
                    Object obj2 = null;
                    if (oooO0O0 instanceof C23047OooOoOO.OooO0O0.C19183OooO0O0) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("CreatorProfileFragment");
                        c20358OooO00o2.OooO00o("UiEvent: NavigateToVip", new Object[0]);
                        C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(creatorProfileFragment);
                        Context contextRequireContext = creatorProfileFragment.requireContext();
                        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        if (OooOO0O.OooO00o(contextRequireContext)) {
                            C28026OooO0OO.OooO00o(c24572OooOO0oOooO0OO, R.id.membership_plans_dialog, null);
                        } else {
                            C28026OooO0OO.OooO00o(c24572OooOO0oOooO0OO, R.id.membership_plans_bottom_sheet, null);
                        }
                    } else {
                        if (!(oooO0O0 instanceof C23047OooOoOO.OooO0O0.OooO0OO)) {
                            throw new C32442OooOO0o();
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("CreatorProfileFragment");
                        C23047OooOoOO.OooO0O0.OooO0OO oooO0OO = (C23047OooOoOO.OooO0O0.OooO0OO) oooO0O0;
                        c20358OooO00o3.OooO00o("UiEvent: ShowPurchaseDialog materialId=" + oooO0OO.f71215OooO00o + ", price=" + oooO0OO.f71216OooO0O0, new Object[0]);
                        Iterator<T> it = ((C23047OooOoOO.OooO0OO) creatorProfileFragment.OooOoOO().f71202OooOOOO.f121747OooOo0o.getValue()).f71222OooO0o.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            str = oooO0OO.f71215OooO00o;
                            if (!zHasNext) {
                                break;
                            }
                            Object next = it.next();
                            if (OooOOO0.OooO0O0(((C23047OooOoOO.OooO00o) next).f71204OooO00o, str)) {
                                obj2 = next;
                                break;
                            }
                        }
                        C23047OooOoOO.OooO00o oooO00o = (C23047OooOoOO.OooO00o) obj2;
                        if (oooO00o == null || (str2 = oooO00o.f71205OooO0O0) == null) {
                            str2 = "";
                        }
                        C28140OooO0o0.OooO00o(creatorProfileFragment, C21030OooOO0o.OooO0OO(creatorProfileFragment), str, str2, oooO0OO.f71216OooO0O0, new C25708OooOoOO(creatorProfileFragment, 2));
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CreatorProfileFragment creatorProfileFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71181OooOo = creatorProfileFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f71181OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71182OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                CreatorProfileFragment creatorProfileFragment = this.f71181OooOo;
                C23047OooOoOO c23047OooOoOOOooOoOO = creatorProfileFragment.OooOoOO();
                C19181OooO00o c19181OooO00o = new C19181OooO00o(creatorProfileFragment, null);
                this.f71182OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c23047OooOoOOOooOoOO.f71200OooOOO, c19181OooO00o, this) == enumC32485OooO00o) {
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
    public C23045OooOoO(CreatorProfileFragment creatorProfileFragment, Continuation<? super C23045OooOoO> continuation) {
        super(2, continuation);
        this.f71179OooOo = creatorProfileFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23045OooOoO(this.f71179OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23045OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71180OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CreatorProfileFragment creatorProfileFragment = this.f71179OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = creatorProfileFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(creatorProfileFragment, null);
            this.f71180OooOo0o = 1;
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
