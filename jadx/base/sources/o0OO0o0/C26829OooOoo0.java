package o0OO0o0;

import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.google.gson.Gson;
import com.orion.notein.data.repo.cloudsync.onedrive.OneDriveApiService;
import kotlin.coroutines.Continuation;
import o0OO0o0.C26800OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO0o0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$updateItemFileSystemInfo$2", m80623f = "OneDriveCloudService.kt", m80624l = {461, 468}, m80625m = "invokeSuspend")
public final class C26829OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C26804OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f92854OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92855OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92856OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92857OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26829OooOoo0(String str, String str2, Continuation continuation, C26800OooO c26800OooO) {
        super(2, continuation);
        this.f92854OooOo = str;
        this.f92857OooOoO0 = str2;
        this.f92856OooOoO = c26800OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26829OooOoo0(this.f92854OooOo, this.f92857OooOoO0, continuation, this.f92856OooOoO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C26804OooO0OO> continuation) {
        return ((C26829OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92855OooOo0o;
        C26800OooO c26800OooO = this.f92856OooOoO;
        String str = this.f92854OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (str != null && str.length() != 0) {
                this.f92855OooOo0o = 1;
                Gson gson = C26800OooO.f92718OooO0o0;
                obj = c26800OooO.OooO0o0(this);
                if (obj == enumC32485OooO00o) {
                }
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "OneDriveCloudService", "updateItemFileSystemInfo skipped: no timestamps provided for ");
            sbOooO0O0.append(this.f92857OooOoO0);
            c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26800OooO.OooO0OO oooO0OO = (C26800OooO.OooO0OO) obj;
        C26804OooO0OO c26804OooO0OO = new C26804OooO0OO(null, new o00000O0(str), null, null, 4079);
        OneDriveApiService oneDriveApiService = c26800OooO.f92719OooO00o;
        String str2 = oooO0OO.f92729OooO0OO;
        this.f92855OooOo0o = 2;
        Object objUpdateDriveItemById = oneDriveApiService.updateDriveItemById(str2, oooO0OO.f92728OooO0O0, this.f92857OooOoO0, c26804OooO0OO, this);
        return objUpdateDriveItemById == enumC32485OooO00o ? enumC32485OooO00o : objUpdateDriveItemById;
    }
}
