package o0Oo0oOo;

import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.domain.models.material.DownloadState;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import com.orion.notein.p607ui.creative_library.C23042OooOo0;
import java.util.ArrayList;
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
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Oo0oOo.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchViewModel$downloadMaterial$1", m80623f = "CreativeLibrarySearchViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28352OoooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<DownloadResult, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f100508OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f100509OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C23040OooOOoo f100510OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28352OoooOOO(C23040OooOOoo c23040OooOOoo, String str, Continuation continuation) {
        super(2, continuation);
        this.f100508OooOo = str;
        this.f100510OooOoO0 = c23040OooOOoo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28352OoooOOO c28352OoooOOO = new C28352OoooOOO(this.f100510OooOoO0, this.f100508OooOo, continuation);
        c28352OoooOOO.f100509OooOo0o = obj;
        return c28352OoooOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(DownloadResult downloadResult, Continuation<? super C32460OooOooO> continuation) {
        return ((C28352OoooOOO) create(downloadResult, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C33781o00o0O c33781o00o0O;
        Object value;
        C23040OooOOoo.OooO0O0 oooO0O0;
        ArrayList arrayList;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        DownloadResult downloadResult = (DownloadResult) this.f100509OooOo0o;
        boolean z = downloadResult instanceof DownloadResult.Success;
        C23040OooOOoo c23040OooOOoo = this.f100510OooOoO0;
        String str = this.f100508OooOo;
        if (z || (downloadResult instanceof DownloadResult.NoFileNeeded)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "CreativeLibrarySearchVM", "Download completed: ", str), new Object[0]);
            DownloadState downloadState = DownloadState.DOWNLOADED;
            do {
                c33781o00o0O = c23040OooOOoo.f71150OooOO0o;
                value = c33781o00o0O.getValue();
                oooO0O0 = (C23040OooOOoo.OooO0O0) value;
                List<C23033OooOO0o.OooO00o> list = oooO0O0.f71159OooO0O0;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                for (C23033OooOO0o.OooO00o OooO00o2 : list) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(OooO00o2.f71088OooO00o, str)) {
                        Material material = OooO00o2.f71097OooOO0O;
                        boolean z2 = OooO00o2.f71098OooOO0o;
                        MaterialActionType actionType = material.getActionType(downloadState, z2);
                        if (actionType == null) {
                            actionType = OooO00o2.f71094OooO0oO;
                        }
                        String actionLabel = material.getActionLabel(downloadState, z2);
                        if (actionLabel == null) {
                            actionLabel = OooO00o2.f71095OooO0oo;
                        }
                        OooO00o2 = C23033OooOO0o.OooO00o.OooO00o(OooO00o2, actionType, actionLabel, false, downloadState, 3391);
                    }
                    arrayList.add(OooO00o2);
                }
            } while (!c33781o00o0O.OooO(value, C23040OooOOoo.OooO0O0.OooO00o(oooO0O0, arrayList, 13)));
        } else if (downloadResult instanceof DownloadResult.Failed) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("CreativeLibrarySearchVM");
            c20358OooO00o2.OooO0Oo(((DownloadResult.Failed) downloadResult).getError(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Download failed: ", str), new Object[0]);
        } else if (downloadResult instanceof DownloadResult.InProgress) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("CreativeLibrarySearchVM");
            c20358OooO00o3.OooO00o(Oooo0oO.o0Oo0oo.OooO0O0((int) (((DownloadResult.InProgress) downloadResult).getProgress() * 100), "Download progress: ", "%"), new Object[0]);
        } else {
            if (!(downloadResult instanceof DownloadResult.AuthRequired)) {
                throw new C32442OooOO0o();
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("CreativeLibrarySearchVM");
            c20358OooO00o4.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Download auth required: ", C24035Oooo00o.f80943OooO00o.OooO0O0(downloadResult.getClass()).OooOO0()), new Object[0]);
            C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c23040OooOOoo), null, null, new C23042OooOo0((DownloadResult.AuthRequired) downloadResult, c23040OooOOoo, null), 3);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
