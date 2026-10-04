package o0OO0o00;

import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.orion.notein.App;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0o00.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSessionManager$refreshAccessTokenInternal$2$1$1", m80623f = "HuaweiDriveSessionManager.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C26900OoooO00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26889Oooo f93315OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93316OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AuthHuaweiId f93317OooOoO0;

    /* JADX INFO: renamed from: o0OO0o00.OoooO00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSessionManager$refreshAccessTokenInternal$2$1$1$1", m80623f = "HuaweiDriveSessionManager.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AuthHuaweiId f93318OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f93319OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AuthHuaweiId authHuaweiId, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f93318OooOo = authHuaweiId;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f93318OooOo, continuation);
            oooO00o.f93319OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f93319OooOo0o;
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69543OooOoo0;
            c24334OooO0O0.OooO0oO(App.f69601o0ooOoO, this.f93318OooOo.getAccessToken());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26900OoooO00(C26889Oooo c26889Oooo, AuthHuaweiId authHuaweiId, Continuation<? super C26900OoooO00> continuation) {
        super(2, continuation);
        this.f93315OooOo = c26889Oooo;
        this.f93317OooOoO0 = authHuaweiId;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26900OoooO00(this.f93315OooOo, this.f93317OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26900OoooO00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93316OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = this.f93315OooOo.f93265OooO0O0;
            OooO00o oooO00o = new OooO00o(this.f93317OooOoO0, null);
            this.f93316OooOo0o = 1;
            if (C24332OooO.OooO00o(oooOO02, oooO00o, this) == enumC32485OooO00o) {
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
