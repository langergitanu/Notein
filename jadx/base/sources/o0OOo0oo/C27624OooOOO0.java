package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudAuthRequest;
import com.orion.notein.domain.models.cloudsync.CloudAuthResult;
import kotlin.coroutines.Continuation;
import o00Oo000.C25035OooO0O0;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.CloudSyncAuthUseCase$authorize$2", m80623f = "CloudSyncAuthUseCase.kt", m80624l = {26, 33}, m80625m = "invokeSuspend")
public final class C27624OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super CloudAuthResult>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C25035OooO0O0 f97139OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f97140OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ CloudAuthRequest f97141OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ EnumC27285OooO f97142OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27624OooOOO0(C25035OooO0O0 c25035OooO0O0, EnumC27285OooO enumC27285OooO, CloudAuthRequest cloudAuthRequest, Continuation<? super C27624OooOOO0> continuation) {
        super(2, continuation);
        this.f97139OooOo = c25035OooO0O0;
        this.f97142OooOoO0 = enumC27285OooO;
        this.f97141OooOoO = cloudAuthRequest;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27624OooOOO0(this.f97139OooOo, this.f97142OooOoO0, this.f97141OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super CloudAuthResult> continuation) {
        return ((C27624OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r14 == r0) goto L25;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f97140OooOo0o;
        C25035OooO0O0 c25035OooO0O0 = this.f97139OooOo;
        try {
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C27629OooOOoo c27629OooOOoo = (C27629OooOOoo) c25035OooO0O0.f85015OooO0OO;
                    this.f97140OooOo0o = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27626OooOOOo(c27629OooOOoo, null), this);
                    if (objOooO0o != enumC32485OooO00o) {
                        objOooO0o = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0o != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    CloudAuthResult cloudAuthResult = (CloudAuthResult) obj;
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(cloudAuthResult, CloudAuthResult.Success.INSTANCE)) {
                        C34406OooO00o.f123390OooO00o.OooO0o0("CloudSync authorize success", new Object[0]);
                        return cloudAuthResult;
                    }
                    if (cloudAuthResult instanceof CloudAuthResult.RequiresUserAction) {
                        C34406OooO00o.f123390OooO00o.OooO0o0("CloudSync authorize requires user action", new Object[0]);
                        return cloudAuthResult;
                    }
                    if (!(cloudAuthResult instanceof CloudAuthResult.Failure)) {
                        throw new C32442OooOO0o();
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("CloudSyncAuthUseCase");
                    CloudAuthResult.Failure failure = (CloudAuthResult.Failure) cloudAuthResult;
                    Throwable throwable = failure.getThrowable();
                    String errorCode = failure.getErrorCode();
                    if (errorCode == null) {
                        errorCode = failure.getMessage();
                    }
                    c20358OooO00o.OooO0Oo(throwable, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("CloudSync authorize failed: ", errorCode), new Object[0]);
                    return cloudAuthResult;
                }
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC27605OooO00o interfaceC27605OooO00o = (InterfaceC27605OooO00o) c25035OooO0O0.f85014OooO0O0;
                EnumC27285OooO enumC27285OooO = this.f97142OooOoO0;
                CloudAuthRequest cloudAuthRequest = this.f97141OooOoO;
                this.f97140OooOo0o = 2;
                obj = interfaceC27605OooO00o.OooO(enumC27285OooO, cloudAuthRequest, this);
            } catch (Throwable th) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("CloudSyncAuthUseCase");
                c20358OooO00o2.OooO0Oo(th, "CloudSync authorize threw exception", new Object[0]);
                return new CloudAuthResult.Failure(null, th.getMessage(), th, 1, null);
            }
        } catch (Throwable th2) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("CloudSyncAuthUseCase");
            c20358OooO00o3.OooO0Oo(th2, "CloudSync pre-check failed", new Object[0]);
            return new CloudAuthResult.Failure(null, th2.getMessage(), th2, 1, null);
        }
    }
}
