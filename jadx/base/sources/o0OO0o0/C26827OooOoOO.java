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

/* JADX INFO: renamed from: o0OO0o0.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$updateItemDescription$2", m80623f = "OneDriveCloudService.kt", m80624l = {439, 441}, m80625m = "invokeSuspend")
public final class C26827OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C26804OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92845OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92846OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f92847OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92848OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26827OooOoOO(String str, String str2, Continuation continuation, C26800OooO c26800OooO) {
        super(2, continuation);
        this.f92845OooOo = c26800OooO;
        this.f92848OooOoO0 = str;
        this.f92847OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26827OooOoOO(this.f92848OooOoO0, this.f92847OooOoO, continuation, this.f92845OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C26804OooO0OO> continuation) {
        return ((C26827OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92846OooOo0o;
        C26800OooO c26800OooO = this.f92845OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f92846OooOo0o = 1;
            Gson gson = C26800OooO.f92718OooO0o0;
            obj = c26800OooO.OooO0o0(this);
            if (obj != enumC32485OooO00o) {
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
        C26800OooO.OooO0OO oooO0OO = (C26800OooO.OooO0OO) obj;
        C26804OooO0OO c26804OooO0OO = new C26804OooO0OO(null, null, null, this.f92848OooOoO0, 4031);
        OneDriveApiService oneDriveApiService = c26800OooO.f92719OooO00o;
        String str = oooO0OO.f92729OooO0OO;
        this.f92846OooOo0o = 2;
        Object objUpdateDriveItemById = oneDriveApiService.updateDriveItemById(str, oooO0OO.f92728OooO0O0, this.f92847OooOoO, c26804OooO0OO, this);
        return objUpdateDriveItemById == enumC32485OooO00o ? enumC32485OooO00o : objUpdateDriveItemById;
    }
}
