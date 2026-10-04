package o0OO0o00;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.C21904OooOoo0;
import com.huawei.cloud.base.auth.DriveCredential;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import com.orion.notein.App;
import com.orion.notein.domain.models.cloudsync.CloudAuthCredentials;
import com.orion.notein.domain.models.cloudsync.CloudAuthRequest;
import com.orion.notein.domain.models.cloudsync.CloudAuthResult;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o00o00O0.C25252OooO0Oo;
import o0OO0o00.C26889Oooo.OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO0o00.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26889Oooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f93264OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f93265OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OO0o00.OooO00o f93266OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f93267OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C32447OooOOo f93268OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C32447OooOOo f93269OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C26887OooOooO f93270OooO0oO;

    /* JADX INFO: renamed from: o0OO0o00.Oooo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSessionManager$refreshAccessToken$1$1", m80623f = "HuaweiDriveSessionManager.kt", m80624l = {67}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f93272OooOo0o;

        /* JADX INFO: renamed from: o0OO0o00.Oooo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSessionManager$refreshAccessToken$1$1$1", m80623f = "HuaweiDriveSessionManager.kt", m80624l = {68}, m80625m = "invokeSuspend")
        public static final class C19822OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C26889Oooo f93273OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f93274OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19822OooO00o(C26889Oooo c26889Oooo, Continuation<? super C19822OooO00o> continuation) {
                super(2, continuation);
                this.f93273OooOo = c26889Oooo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19822OooO00o(this.f93273OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
                return ((C19822OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) throws Throwable {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f93274OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return obj;
                }
                C32446OooOOOo.OooO0O0(obj);
                this.f93274OooOo0o = 1;
                C26889Oooo c26889Oooo = this.f93273OooOo;
                c26889Oooo.getClass();
                oOo0000O.OooOO0 oooOO02 = new oOo0000O.OooOO0(C21904OooOoo0.OooO0o0(this));
                Object value = c26889Oooo.f93268OooO0o.getValue();
                kotlin.jvm.internal.OooOOO0.OooO0o(value, "getValue(...)");
                ((HuaweiIdAuthService) value).silentSignIn().OooO0o0(new C26899OoooO0(c26889Oooo, oooOO02)).OooO0OO(new C26901OoooO0O(c26889Oooo, oooOO02));
                Object objOooO00o = oooOO02.OooO00o();
                return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C26889Oooo.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f93272OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C19822OooO00o c19822OooO00o = new C19822OooO00o(C26889Oooo.this, null);
            this.f93272OooOo0o = 1;
            Object objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c19822OooO00o, this);
            return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [o0OO0o00.OooOooO] */
    public C26889Oooo(Context context, o0000o0O.OooOO0<AbstractC24338OooO0o0> preferences, o0OO0o00.OooO00o huaweiCloudService) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(preferences, "preferences");
        kotlin.jvm.internal.OooOOO0.OooO0oO(huaweiCloudService, "huaweiCloudService");
        this.f93264OooO00o = context;
        this.f93265OooO0O0 = preferences;
        this.f93266OooO0OO = huaweiCloudService;
        this.f93267OooO0Oo = new AtomicBoolean(true);
        this.f93269OooO0o0 = C20519OooO0Oo.OooO0OO(new C26886OooOoo0());
        this.f93268OooO0o = C20519OooO0Oo.OooO0OO(new C26885OooOoo(this, 0));
        this.f93270OooO0oO = new DriveCredential.AccessMethod() { // from class: o0OO0o00.OooOooO
            @Override // com.huawei.cloud.base.auth.DriveCredential.AccessMethod
            public final String refreshToken() {
                return (String) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, this.f93258OooO00o.new OooO00o(null));
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ed, code lost:
    
        if (r6.OooO0Oo(r2) == r3) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(CloudAuthRequest cloudAuthRequest, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26888OooOooo c26888OooOooo;
        Object objOooO00o;
        CloudAuthCredentials.Huawei huawei;
        C26889Oooo c26889Oooo;
        Object objOooO0o0;
        C26889Oooo c26889Oooo2;
        C32443OooOOO c32443OooOOO;
        Object objOooO00o2;
        if (abstractC32479OooO0OO instanceof C26888OooOooo) {
            c26888OooOooo = (C26888OooOooo) abstractC32479OooO0OO;
            int i = c26888OooOooo.f93263OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26888OooOooo.f93263OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c26888OooOooo = new C26888OooOooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c26888OooOooo.f93262OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26888OooOooo.f93263OooOoOO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            Object payload = cloudAuthRequest != null ? cloudAuthRequest.getPayload() : null;
            huawei = payload instanceof CloudAuthCredentials.Huawei ? (CloudAuthCredentials.Huawei) payload : null;
            if (huawei != null) {
                String unionId = huawei.getUnionId();
                String accessToken = huawei.getAccessToken();
                c26888OooOooo.f93260OooOo0o = this;
                c26888OooOooo.f93259OooOo = huawei;
                c26888OooOooo.f93263OooOoOO = 1;
                objOooO0o0 = OooO0o0(unionId, accessToken, c26888OooOooo);
                if (objOooO0o0 != obj) {
                    c26889Oooo2 = this;
                    if (!(objOooO0o0 instanceof C32445OooOOOO.OooO00o)) {
                    }
                }
            } else {
                c26888OooOooo.f93260OooOo0o = this;
                c26888OooOooo.f93263OooOoOO = 2;
                objOooO0OO = OooO0OO(c26888OooOooo);
                if (objOooO0OO != obj) {
                    c26889Oooo = this;
                    c32443OooOOO = (C32443OooOOO) objOooO0OO;
                    c26889Oooo2 = c26889Oooo;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            huawei = c26888OooOooo.f93259OooOo;
            c26889Oooo2 = c26888OooOooo.f93260OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            objOooO0o0 = ((C32445OooOOOO) objOooO0OO).f116639OooOo0o;
            if (!(objOooO0o0 instanceof C32445OooOOOO.OooO00o)) {
                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO0o0);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("HuaweiDriveSession");
                c20358OooO00o.OooO0Oo(thOooO00o, "authorize: persistHuaweiCredentials failed", new Object[0]);
                return new CloudAuthResult.Failure(null, thOooO00o != null ? thOooO00o.getMessage() : null, thOooO00o, 1, null);
            }
            c32443OooOOO = new C32443OooOOO(huawei.getUnionId(), huawei.getAccessToken());
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0OO);
                ((C32445OooOOOO) objOooO0OO).getClass();
                objOooO00o = CloudAuthResult.Success.INSTANCE;
                Throwable thOooO00o2 = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o2 == null) {
                    return objOooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("HuaweiDriveSession");
                c20358OooO00o2.OooO0Oo(thOooO00o2, "authorize: ensureInitialized failed", new Object[0]);
                return new CloudAuthResult.Failure(null, thOooO00o2.getMessage(), thOooO00o2, 1, null);
            }
            c26889Oooo = c26888OooOooo.f93260OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c32443OooOOO = (C32443OooOOO) objOooO0OO;
            c26889Oooo2 = c26889Oooo;
        }
        String str = (String) c32443OooOOO.f116638OooOo0o;
        String str2 = (String) c32443OooOOO.f116637OooOo;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            try {
                Object value = c26889Oooo2.f93268OooO0o.getValue();
                kotlin.jvm.internal.OooOOO0.OooO0o(value, "getValue(...)");
                objOooO00o2 = ((HuaweiIdAuthService) value).getSignInIntent();
            } catch (Throwable th2) {
                objOooO00o2 = C32446OooOOOo.OooO00o(th2);
            }
            Throwable thOooO00o3 = C32445OooOOOO.OooO00o(objOooO00o2);
            if (thOooO00o3 == null) {
                Intent intent = (Intent) objOooO00o2;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(intent);
                return new CloudAuthResult.RequiresUserAction(intent);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("HuaweiDriveSession");
            c20358OooO00o3.OooO0Oo(thOooO00o3, "authorize: acquire sign-in intent failed", new Object[0]);
            return new CloudAuthResult.Failure(null, thOooO00o3.getMessage(), thOooO00o3, 1, null);
        }
        c26888OooOooo.f93260OooOo0o = null;
        c26888OooOooo.f93259OooOo = null;
        c26888OooOooo.f93263OooOoOO = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo000 oooo000;
        C26889Oooo c26889Oooo;
        C26889Oooo c26889Oooo2;
        Object objOooO00o;
        Throwable thOooO00o;
        if (abstractC32479OooO0OO instanceof Oooo000) {
            oooo000 = (Oooo000) abstractC32479OooO0OO;
            int i = oooo000.f93281OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f93281OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooo000.f93279OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooo000.f93281OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooo000.f93280OooOo0o = this;
            oooo000.f93281OooOoO = 1;
            if (this.f93266OooO0OO.OooO0o(oooo000) != enumC32485OooO00o) {
                c26889Oooo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26889Oooo2 = oooo000.f93280OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            try {
                Object value = c26889Oooo2.f93268OooO0o.getValue();
                kotlin.jvm.internal.OooOOO0.OooO0o(value, "getValue(...)");
                objOooO00o = ((HuaweiIdAuthService) value).cancelAuthorization();
            } catch (Throwable th) {
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("HuaweiDriveSession");
                c20358OooO00o.OooO0Oo(thOooO00o, "cancelAuthorization failed", new Object[0]);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        c26889Oooo = oooo000.f93280OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = c26889Oooo.f93265OooO0O0;
        C26890Oooo00O c26890Oooo00O = new C26890Oooo00O(2, null);
        oooo000.f93280OooOo0o = c26889Oooo;
        oooo000.f93281OooOoO = 2;
        if (C24332OooO.OooO00o(oooOO02, c26890Oooo00O, oooo000) != enumC32485OooO00o) {
            c26889Oooo2 = c26889Oooo;
            Object value2 = c26889Oooo2.f93268OooO0o.getValue();
            kotlin.jvm.internal.OooOOO0.OooO0o(value2, "getValue(...)");
            objOooO00o = ((HuaweiIdAuthService) value2).cancelAuthorization();
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26891Oooo00o c26891Oooo00o;
        if (abstractC32479OooO0OO instanceof C26891Oooo00o) {
            c26891Oooo00o = (C26891Oooo00o) abstractC32479OooO0OO;
            int i = c26891Oooo00o.f93286OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26891Oooo00o.f93286OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26891Oooo00o = new C26891Oooo00o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c26891Oooo00o.f93285OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26891Oooo00o.f93286OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = this.f93265OooO0O0.getData();
            c26891Oooo00o.f93286OooOoO0 = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(data, c26891Oooo00o);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) objOooOOo;
        return new C32443OooOOO(abstractC24338OooO0o0.OooO0OO(App.f69600o0ooOOo), abstractC24338OooO0o0.OooO0OO(App.f69601o0ooOoO));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r5.OooO0OO(r4, r8, r2, r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo0 oooo0;
        C26889Oooo c26889Oooo;
        if (abstractC32479OooO0OO instanceof Oooo0) {
            oooo0 = (Oooo0) abstractC32479OooO0OO;
            int i = oooo0.f93277OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0.f93277OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = oooo0.f93275OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooo0.f93277OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                oooo0.f93276OooOo0o = this;
                oooo0.f93277OooOoO = 1;
                objOooO0OO = OooO0OO(oooo0);
                if (objOooO0OO != obj) {
                    c26889Oooo = this;
                }
                return obj;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0OO);
                return C32460OooOooO.f116667OooO00o;
            }
            c26889Oooo = oooo0.f93276OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            C32443OooOOO c32443OooOOO = (C32443OooOOO) objOooO0OO;
            String str = (String) c32443OooOOO.f116638OooOo0o;
            String str2 = (String) c32443OooOOO.f116637OooOo;
            if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                return C32446OooOOOo.OooO00o(new IllegalStateException("Huawei Drive not authorized"));
            }
            o0OO0o00.OooO00o oooO00o = c26889Oooo.f93266OooO0OO;
            C26887OooOooO c26887OooOooO = c26889Oooo.f93270OooO0oO;
            oooo0.f93276OooOo0o = null;
            oooo0.f93277OooOoO = 2;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r7.OooO0o(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26896Oooo0oO c26896Oooo0oO;
        C26889Oooo c26889Oooo;
        if (abstractC32479OooO0OO instanceof C26896Oooo0oO) {
            c26896Oooo0oO = (C26896Oooo0oO) abstractC32479OooO0OO;
            int i = c26896Oooo0oO.f93304OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26896Oooo0oO.f93304OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26896Oooo0oO = new C26896Oooo0oO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26896Oooo0oO.f93302OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26896Oooo0oO.f93304OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = this.f93265OooO0O0;
                C26897Oooo0oo c26897Oooo0oo = new C26897Oooo0oo(str, str2, null);
                c26896Oooo0oO.f93303OooOo0o = this;
                c26896Oooo0oO.f93304OooOoO = 1;
                if (C24332OooO.OooO00o(oooOO02, c26897Oooo0oo, c26896Oooo0oO) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c26889Oooo = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                c26889Oooo = c26896Oooo0oO.f93303OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            o0OO0o00.OooO00o oooO00o = c26889Oooo.f93266OooO0OO;
            c26896Oooo0oO.f93303OooOo0o = null;
            c26896Oooo0oO.f93304OooOoO = 2;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }
}
