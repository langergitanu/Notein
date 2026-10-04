package o0Oo0oOo;

import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0oOo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryListViewModel$downloadMaterial$1", m80623f = "CreativeLibraryListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28341Oooo0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<DownloadResult, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23033OooOO0o f100476OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f100477OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28341Oooo0O0(C23033OooOO0o c23033OooOO0o, Continuation<? super C28341Oooo0O0> continuation) {
        super(2, continuation);
        this.f100476OooOo = c23033OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28341Oooo0O0 c28341Oooo0O0 = new C28341Oooo0O0(this.f100476OooOo, continuation);
        c28341Oooo0O0.f100477OooOo0o = obj;
        return c28341Oooo0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(DownloadResult downloadResult, Continuation<? super C32460OooOooO> continuation) {
        return ((C28341Oooo0O0) create(downloadResult, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        DownloadResult downloadResult = (DownloadResult) this.f100477OooOo0o;
        if (!(downloadResult instanceof DownloadResult.Success) && !(downloadResult instanceof DownloadResult.NoFileNeeded) && !(downloadResult instanceof DownloadResult.Failed) && !(downloadResult instanceof DownloadResult.InProgress)) {
            if (!(downloadResult instanceof DownloadResult.AuthRequired)) {
                throw new C32442OooOO0o();
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CreativeLibraryListVM");
            c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Download auth required: ", C24035Oooo00o.f80943OooO00o.OooO0O0(downloadResult.getClass()).OooOO0()), new Object[0]);
            C23033OooOO0o c23033OooOO0o = this.f100476OooOo;
            C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c23033OooOO0o), null, null, new com.orion.notein.p607ui.creative_library.OooOOO((DownloadResult.AuthRequired) downloadResult, c23033OooOO0o, null), 3);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
