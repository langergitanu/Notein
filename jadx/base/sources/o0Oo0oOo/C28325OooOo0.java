package o0Oo0oOo;

import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import java.util.List;
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

/* JADX INFO: renamed from: o0Oo0oOo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailViewModel$downloadMaterial$1", m80623f = "CreativeLibraryDetailViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28325OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<DownloadResult, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Material f100449OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f100450OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C23028OooO0Oo f100451OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28325OooOo0(Material material, C23028OooO0Oo c23028OooO0Oo, Continuation<? super C28325OooOo0> continuation) {
        super(2, continuation);
        this.f100449OooOo = material;
        this.f100451OooOoO0 = c23028OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28325OooOo0 c28325OooOo0 = new C28325OooOo0(this.f100449OooOo, this.f100451OooOoO0, continuation);
        c28325OooOo0.f100450OooOo0o = obj;
        return c28325OooOo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(DownloadResult downloadResult, Continuation<? super C32460OooOooO> continuation) {
        return ((C28325OooOo0) create(downloadResult, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        DownloadResult downloadResult = (DownloadResult) this.f100450OooOo0o;
        boolean z = downloadResult instanceof DownloadResult.Success;
        Material material = this.f100449OooOo;
        if (z || (downloadResult instanceof DownloadResult.NoFileNeeded)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CreativeLibraryDetailVM");
            c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Download completed: ", material.getTitle()), new Object[0]);
        } else if (downloadResult instanceof DownloadResult.Failed) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("CreativeLibraryDetailVM");
            c20358OooO00o2.OooO0Oo(((DownloadResult.Failed) downloadResult).getError(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Download failed: ", material.getTitle()), new Object[0]);
        } else if (downloadResult instanceof DownloadResult.InProgress) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("CreativeLibraryDetailVM");
            c20358OooO00o3.OooO00o(Oooo0oO.o0Oo0oo.OooO0O0((int) (((DownloadResult.InProgress) downloadResult).getProgress() * 100), "Download progress: ", "%"), new Object[0]);
        } else {
            if (!(downloadResult instanceof DownloadResult.AuthRequired)) {
                throw new C32442OooOO0o();
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("CreativeLibraryDetailVM");
            c20358OooO00o4.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Download auth required: ", C24035Oooo00o.f80943OooO00o.OooO0O0(downloadResult.getClass()).OooOO0()), new Object[0]);
            C23028OooO0Oo c23028OooO0Oo = this.f100451OooOoO0;
            List<C23028OooO0Oo.OooO0O0> list = C23028OooO0Oo.f71003OooOOOo;
            C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c23028OooO0Oo), null, null, new com.orion.notein.p607ui.creative_library.OooO0o((DownloadResult.AuthRequired) downloadResult, c23028OooO0Oo, null), 3);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
