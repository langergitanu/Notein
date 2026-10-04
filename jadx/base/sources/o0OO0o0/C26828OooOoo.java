package o0OO0o0;

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

/* JADX INFO: renamed from: o0OO0o0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$updateItemMetadata$2", m80623f = "OneDriveCloudService.kt", m80624l = {397, 412}, m80625m = "invokeSuspend")
public final class C26828OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C26804OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f92849OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92850OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92851OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92852OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f92853OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26828OooOoo(String str, String str2, String str3, Continuation continuation, C26800OooO c26800OooO) {
        super(2, continuation);
        this.f92849OooOo = str;
        this.f92852OooOoO0 = str2;
        this.f92851OooOoO = c26800OooO;
        this.f92853OooOoOO = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26800OooO c26800OooO = this.f92851OooOoO;
        return new C26828OooOoo(this.f92849OooOo, this.f92852OooOoO0, this.f92853OooOoOO, continuation, c26800OooO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C26804OooO0OO> continuation) {
        return ((C26828OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO0o0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92850OooOo0o;
        C26800OooO c26800OooO = this.f92851OooOoO;
        String str = this.f92852OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str2 = this.f92849OooOo;
            if ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) {
                return null;
            }
            this.f92850OooOo0o = 1;
            Gson gson = C26800OooO.f92718OooO0o0;
            objOooO0o0 = c26800OooO.OooO0o0(this);
            if (objOooO0o0 != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o0 = obj;
        C26800OooO.OooO0OO oooO0OO = (C26800OooO.OooO0OO) objOooO0o0;
        C26804OooO0OO c26804OooO0OO = new C26804OooO0OO(this.f92849OooOo, str != null ? new o00000O0(str) : null, null, null, 4077);
        OneDriveApiService oneDriveApiService = c26800OooO.f92719OooO00o;
        String str3 = oooO0OO.f92729OooO0OO;
        this.f92850OooOo0o = 2;
        Object objUpdateDriveItemById = oneDriveApiService.updateDriveItemById(str3, oooO0OO.f92728OooO0O0, this.f92853OooOoOO, c26804OooO0OO, this);
        return objUpdateDriveItemById == enumC32485OooO00o ? enumC32485OooO00o : objUpdateDriveItemById;
    }
}
