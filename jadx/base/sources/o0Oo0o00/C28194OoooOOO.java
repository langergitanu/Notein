package o0Oo0o00;

import androidx.lifecycle.AbstractC22019Ooooooo;
import com.orion.notein.domain.models.cloudsync.CloudAuthRequest;
import com.orion.notein.domain.models.cloudsync.CloudAuthResult;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import kotlin.Metadata;
import o00Oo000.C25035OooO0O0;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOo0oo.C27615OooO0Oo;
import o0OOo0oo.C27616OooO0o;
import o0OOo0oo.C27624OooOOO0;
import o0OOo0oo.C27634OooOo0o;
import o0OOo0oo.C27635OooOoO;
import o0OOo0oo.C27637OooOoOO;
import o0OOo0oo.C27639OooOoo0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0o00.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0Oo0o00/OoooOOO;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C28194OoooOOO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33769Ooooo0o f99906OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27605OooO00o f99907OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27635OooOoO f99908OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25035OooO0O0 f99909OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27639OooOoo0 f99910OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33769Ooooo0o f99911OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33769Ooooo0o f99912OooOO0;

    public C28194OoooOOO(InterfaceC27605OooO00o cloudSyncRepo, C25035OooO0O0 c25035OooO0O0, C27635OooOoO c27635OooOoO, C27616OooO0o aboutCloudSyncUseCase, C27639OooOoo0 cloudSyncRemoteConfig) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(aboutCloudSyncUseCase, "aboutCloudSyncUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRemoteConfig, "cloudSyncRemoteConfig");
        this.f99907OooO0Oo = cloudSyncRepo;
        this.f99909OooO0o0 = c25035OooO0O0;
        this.f99908OooO0o = c27635OooOoO;
        this.f99910OooO0oO = cloudSyncRemoteConfig;
        InterfaceC27605OooO00o interfaceC27605OooO00o = aboutCloudSyncUseCase.f97105OooO00o;
        this.f99911OooO0oo = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOO0o(C25252OooO0Oo.OooOO0(interfaceC27605OooO00o.OooOo00(), interfaceC27605OooO00o.Oooo0OO(EnumC27285OooO.f95075OooOo), interfaceC27605OooO00o.Oooo0OO(EnumC27285OooO.f95078OooOoO0), interfaceC27605OooO00o.Oooo0OO(EnumC27285OooO.f95077OooOoO), interfaceC27605OooO00o.Oooo0OO(EnumC27285OooO.f95079OooOoOO), new C27615OooO0Oo(null))), androidx.lifecycle.o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), EnumC27285OooO.f95076OooOo0o);
        this.f99906OooO = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOo0O(new C27634OooOo0o(c27635OooOoO.f97184OooO0O0.getData(), c27635OooOoO), ExecutorC33873OooO0O0.f122045OooOoO0), androidx.lifecycle.o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), C27635OooOoO.f97182OooO0o0);
        this.f99912OooOO0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOO0o(new C27637OooOoOO(cloudSyncRemoteConfig.f97201OooO00o.isInitialized(), cloudSyncRemoteConfig)), androidx.lifecycle.o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(C28194OoooOOO c28194OoooOOO, EnumC27285OooO enumC27285OooO, CloudAuthRequest cloudAuthRequest, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28192OoooO0O c28192OoooO0O;
        Object objOooOOO0;
        C28194OoooOOO c28194OoooOOO2;
        EnumC27285OooO enumC27285OooO2;
        Throwable th;
        C28194OoooOOO c28194OoooOOO3 = c28194OoooOOO;
        EnumC27285OooO enumC27285OooO3 = enumC27285OooO;
        c28194OoooOOO3.getClass();
        if (abstractC32479OooO0OO instanceof C28192OoooO0O) {
            c28192OoooO0O = (C28192OoooO0O) abstractC32479OooO0OO;
            int i = c28192OoooO0O.f99901OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28192OoooO0O.f99901OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c28192OoooO0O = new C28192OoooO0O(c28194OoooOOO3, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c28192OoooO0O.f99900OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28192OoooO0O.f99901OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (!c28194OoooOOO3.f99910OooO0oO.OooO00o()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudSyncViewModel");
                c20358OooO00o.OooOO0O("Cloud sync is remotely disabled, cannot authorize", new Object[0]);
                return new CloudAuthResult.Failure(CloudSyncError.CODE_REMOTE_DISABLED, "Cloud sync is temporarily unavailable", null, 4, null);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("CloudSyncViewModel");
            c20358OooO00o2.OooO0o0("authorize CloudSyncType=" + enumC27285OooO3, new Object[0]);
            c28192OoooO0O.f99898OooOo0o = c28194OoooOOO3;
            c28192OoooO0O.f99897OooOo = enumC27285OooO3;
            c28192OoooO0O.f99901OooOoOO = 1;
            C25035OooO0O0 c25035OooO0O0 = c28194OoooOOO3.f99909OooO0o0;
            c25035OooO0O0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27624OooOOO0(c25035OooO0O0, enumC27285OooO3, cloudAuthRequest, null), c28192OoooO0O);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) c28192OoooO0O.f99898OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                ((C32445OooOOOO) objOooO0o).getClass();
                th = th2;
                return new CloudAuthResult.Failure(null, th != null ? th.getMessage() : null, th, 1, null);
            }
            enumC27285OooO2 = c28192OoooO0O.f99897OooOo;
            c28194OoooOOO2 = (C28194OoooOOO) c28192OoooO0O.f99898OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            objOooOOO0 = ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
            if (objOooOOO0 instanceof C32445OooOOOO.OooO00o) {
                return CloudAuthResult.Success.INSTANCE;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOOO0);
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("CloudSyncViewModel");
            c20358OooO00o3.OooO0Oo(thOooO00o, "ensureInitialized failed for " + enumC27285OooO2, new Object[0]);
            C25035OooO0O0 c25035OooO0O02 = c28194OoooOOO2.f99909OooO0o0;
            c28192OoooO0O.f99898OooOo0o = thOooO00o;
            c28192OoooO0O.f99897OooOo = null;
            c28192OoooO0O.f99901OooOoOO = 3;
            if (c25035OooO0O02.OooO0O0(enumC27285OooO2, c28192OoooO0O) != enumC32485OooO00o) {
                th = thOooO00o;
                return new CloudAuthResult.Failure(null, th != null ? th.getMessage() : null, th, 1, null);
            }
            return enumC32485OooO00o;
        }
        EnumC27285OooO enumC27285OooO4 = c28192OoooO0O.f99897OooOo;
        C28194OoooOOO c28194OoooOOO4 = (C28194OoooOOO) c28192OoooO0O.f99898OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        enumC27285OooO3 = enumC27285OooO4;
        c28194OoooOOO3 = c28194OoooOOO4;
        CloudAuthResult cloudAuthResult = (CloudAuthResult) objOooO0o;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(cloudAuthResult, CloudAuthResult.Success.INSTANCE)) {
            return cloudAuthResult;
        }
        InterfaceC27605OooO00o interfaceC27605OooO00o = c28194OoooOOO3.f99907OooO0Oo;
        c28192OoooO0O.f99898OooOo0o = c28194OoooOOO3;
        c28192OoooO0O.f99897OooOo = enumC27285OooO3;
        c28192OoooO0O.f99901OooOoOO = 2;
        objOooOOO0 = interfaceC27605OooO00o.OooOOO0(enumC27285OooO3, c28192OoooO0O);
        if (objOooOOO0 != enumC32485OooO00o) {
            EnumC27285OooO enumC27285OooO5 = enumC27285OooO3;
            c28194OoooOOO2 = c28194OoooOOO3;
            enumC27285OooO2 = enumC27285OooO5;
            if (objOooOOO0 instanceof C32445OooOOOO.OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    public final Object OooO0o(EnumC27285OooO enumC27285OooO, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28189OoooO(this, enumC27285OooO, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0oO(EnumC27285OooO enumC27285OooO, AbstractC32476OooO abstractC32476OooO) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("CloudSyncViewModel");
        c20358OooO00o.OooO0o0("setCurrentCLoudType: " + enumC27285OooO, new Object[0]);
        Object objOooo0o0 = this.f99907OooO0Oo.Oooo0o0(enumC27285OooO, abstractC32476OooO);
        return objOooo0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooo0o0 : C32460OooOooO.f116667OooO00o;
    }
}
