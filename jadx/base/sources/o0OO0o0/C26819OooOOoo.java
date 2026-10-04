package o0OO0o0;

import com.google.gson.Gson;
import com.orion.notein.data.repo.cloudsync.onedrive.OneDriveApiService;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO0o0.C26800OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OO0o0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$fetchItemVersions$2", m80623f = "OneDriveCloudService.kt", m80624l = {524, 525}, m80625m = "invokeSuspend")
public final class C26819OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends C26807OooO0o0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92808OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92809OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92810OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26819OooOOoo(C26800OooO c26800OooO, String str, Continuation<? super C26819OooOOoo> continuation) {
        super(2, continuation);
        this.f92808OooOo = c26800OooO;
        this.f92810OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26819OooOOoo(this.f92808OooOo, this.f92810OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends C26807OooO0o0>> continuation) {
        return ((C26819OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92809OooOo0o;
        C26800OooO c26800OooO = this.f92808OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f92809OooOo0o = 1;
            Gson gson = C26800OooO.f92718OooO0o0;
            obj = c26800OooO.OooO0o0(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            List<C26807OooO0o0> listOooO00o = ((C26806OooO0o) obj).OooO00o();
            return listOooO00o == null ? C34434OooOoO.f123453OooOo0o : listOooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26800OooO.OooO0OO oooO0OO = (C26800OooO.OooO0OO) obj;
        OneDriveApiService oneDriveApiService = c26800OooO.f92719OooO00o;
        String str = oooO0OO.f92729OooO0OO;
        this.f92809OooOo0o = 2;
        obj = oneDriveApiService.getDriveItemVersions(str, oooO0OO.f92728OooO0O0, this.f92810OooOoO0, this);
    }
}
