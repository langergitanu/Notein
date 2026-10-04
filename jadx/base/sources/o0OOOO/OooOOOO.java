package o0OOOO;

import com.orion.notein.data.service.user.NoteinFirebaseUserApiService;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.datasource.NoteinFirebaseUserRemoteDataSource$login$2", m80623f = "NoteinFirebaseUserRemoteDataSource.kt", m80624l = {42}, m80625m = "invokeSuspend")
public final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<NoteinFirebaseUserApiService.OooO0O0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f94302OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94303OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f94304OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94305OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f94306OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27082OooOOOo f94307OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(String str, String str2, String str3, String str4, C27082OooOOOo c27082OooOOOo, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f94302OooOo = str;
        this.f94305OooOoO0 = str2;
        this.f94304OooOoO = str3;
        this.f94306OooOoOO = str4;
        this.f94307OooOoo0 = c27082OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOOO(this.f94302OooOo, this.f94305OooOoO0, this.f94304OooOoO, this.f94306OooOoOO, this.f94307OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<NoteinFirebaseUserApiService.OooO0O0>> continuation) {
        return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        T t;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94303OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String str = this.f94304OooOoO;
                if (str == null) {
                    str = "";
                }
                String str2 = this.f94306OooOoOO;
                NoteinFirebaseUserApiService.OooO00o oooO00o = new NoteinFirebaseUserApiService.OooO00o(this.f94302OooOo, this.f94305OooOoO0, str, str2 != null ? str2 : "");
                NoteinFirebaseUserApiService noteinFirebaseUserApiService = this.f94307OooOoo0.f94308OooO00o;
                this.f94303OooOo0o = 1;
                obj = noteinFirebaseUserApiService.OooO0O0(oooO00o, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C35238OooOoO c35238OooOoO = (C35238OooOoO) obj;
            if (c35238OooOoO.f126541OooO00o.OooO0OO() && (t = c35238OooOoO.f126542OooO0O0) != 0) {
                return t;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteinFirebaseUserRemoteDataSource");
            c20358OooO00o.OooO0OO("loginByFirebase failed: " + c35238OooOoO.f126541OooO00o.f124259OooOoO, new Object[0]);
            return new C27174OooO0O0(false, null, null, null, 14);
        } catch (IOException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteinFirebaseUserRemoteDataSource");
            c20358OooO00o2.OooO0Oo(e, "loginByFirebase failed", new Object[0]);
            return new C27174OooO0O0(false, null, "199999", null, 10);
        }
    }
}
