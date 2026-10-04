package com.orion.notein.p607ui.creative_library;

import Oooo0oO.C21030OooOO0o;
import androidx.core.os.BundleKt;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.Oooo0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0Oo00o.C28026OooO0OO;
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

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$observeUiEvents$1", m80623f = "DownloadedMaterialListFragment.kt", m80624l = {112}, m80625m = "invokeSuspend")
public final class C23054Oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DownloadedMaterialListFragment f71256OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71257OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo00o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$observeUiEvents$1$1", m80623f = "DownloadedMaterialListFragment.kt", m80624l = {113}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ DownloadedMaterialListFragment f71258OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71259OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$observeUiEvents$1$1$1", m80623f = "DownloadedMaterialListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19185OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Oooo0.OooO00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ DownloadedMaterialListFragment f71260OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f71261OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19185OooO00o(DownloadedMaterialListFragment downloadedMaterialListFragment, Continuation<? super C19185OooO00o> continuation) {
                super(2, continuation);
                this.f71260OooOo = downloadedMaterialListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19185OooO00o c19185OooO00o = new C19185OooO00o(this.f71260OooOo, continuation);
                c19185OooO00o.f71261OooOo0o = obj;
                return c19185OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Oooo0.OooO00o oooO00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19185OooO00o) create(oooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Oooo0.OooO00o oooO00o = (Oooo0.OooO00o) this.f71261OooOo0o;
                if (!(oooO00o instanceof Oooo0.OooO00o.C19184OooO00o)) {
                    throw new C32442OooOO0o();
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("DownloadedMaterialListFragment");
                Oooo0.OooO00o.C19184OooO00o c19184OooO00o = (Oooo0.OooO00o.C19184OooO00o) oooO00o;
                c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("UiEvent: NavigateToMyTemplate materialId=", c19184OooO00o.f71247OooO00o), new Object[0]);
                DownloadedMaterialListFragment downloadedMaterialListFragment = this.f71260OooOo;
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(downloadedMaterialListFragment), R.id.paperConfigDialogFragment, BundleKt.bundleOf(new C32443OooOOO("strategyType", "CREATE_NOTE"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, null), new C32443OooOOO("targetMaterialId", c19184OooO00o.f71247OooO00o)));
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(DownloadedMaterialListFragment downloadedMaterialListFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71258OooOo = downloadedMaterialListFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f71258OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71259OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                DownloadedMaterialListFragment downloadedMaterialListFragment = this.f71258OooOo;
                Oooo0 oooo0 = (Oooo0) downloadedMaterialListFragment.f70920OooOoo.getValue();
                C19185OooO00o c19185OooO00o = new C19185OooO00o(downloadedMaterialListFragment, null);
                this.f71259OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooo0.f71245OooO0oo, c19185OooO00o, this) == enumC32485OooO00o) {
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
    public C23054Oooo00o(DownloadedMaterialListFragment downloadedMaterialListFragment, Continuation<? super C23054Oooo00o> continuation) {
        super(2, continuation);
        this.f71256OooOo = downloadedMaterialListFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23054Oooo00o(this.f71256OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23054Oooo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71257OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            DownloadedMaterialListFragment downloadedMaterialListFragment = this.f71256OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = downloadedMaterialListFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(downloadedMaterialListFragment, null);
            this.f71257OooOo0o = 1;
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
