package o0OO0o0;

import com.orion.notein.data.repo.cloudsync.onedrive.OneDriveApiService;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0o0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$fetchDriveInfo$2", m80623f = "OneDriveCloudService.kt", m80624l = {54}, m80625m = "invokeSuspend")
public final class C26818OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C26808OooO0oO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92805OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92806OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92807OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26818OooOOo0(C26800OooO c26800OooO, String str, Continuation<? super C26818OooOOo0> continuation) {
        super(2, continuation);
        this.f92805OooOo = c26800OooO;
        this.f92807OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26818OooOOo0(this.f92805OooOo, this.f92807OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C26808OooO0oO> continuation) {
        return ((C26818OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92806OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        OneDriveApiService oneDriveApiService = this.f92805OooOo.f92719OooO00o;
        String str = "Bearer " + this.f92807OooOoO0;
        this.f92806OooOo0o = 1;
        Object drive = oneDriveApiService.getDrive(str, this);
        return drive == enumC32485OooO00o ? enumC32485OooO00o : drive;
    }
}
