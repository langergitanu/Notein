package com.orion.notein.p607ui.creative_library;

import com.orion.notein.p607ui.creative_library.Oooo0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$observeState$1", m80623f = "DownloadedMaterialListFragment.kt", m80624l = {104}, m80625m = "invokeSuspend")
public final class C23053Oooo00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DownloadedMaterialListFragment f71252OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71253OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo00O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$observeState$1$1", m80623f = "DownloadedMaterialListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Oooo0.OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ DownloadedMaterialListFragment f71254OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f71255OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(DownloadedMaterialListFragment downloadedMaterialListFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71254OooOo = downloadedMaterialListFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f71254OooOo, continuation);
            oooO00o.f71255OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Oooo0.OooO0O0 oooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(oooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Oooo0.OooO0O0 oooO0O0 = (Oooo0.OooO0O0) this.f71255OooOo0o;
            com.orion.notein.p607ui.creative_library.OooO00o oooO00o = this.f71254OooOo.f70922OooOooO;
            if (oooO00o != null) {
                oooO00o.OooO0Oo(oooO0O0.f71249OooO0O0);
                return C32460OooOooO.f116667OooO00o;
            }
            OooOOO0.OooOOOO("adapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23053Oooo00O(DownloadedMaterialListFragment downloadedMaterialListFragment, Continuation<? super C23053Oooo00O> continuation) {
        super(2, continuation);
        this.f71252OooOo = downloadedMaterialListFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23053Oooo00O(this.f71252OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23053Oooo00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71253OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            DownloadedMaterialListFragment downloadedMaterialListFragment = this.f71252OooOo;
            Oooo0 oooo0 = (Oooo0) downloadedMaterialListFragment.f70920OooOoo.getValue();
            OooO00o oooO00o = new OooO00o(downloadedMaterialListFragment, null);
            this.f71253OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(oooo0.f71246OooOO0, oooO00o, this) == enumC32485OooO00o) {
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
