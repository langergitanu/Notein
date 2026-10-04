package o0OOo0oo;

import android.content.Context;
import com.orion.notein.domain.models.cloudsync.CloudEvent;
import kotlin.coroutines.Continuation;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOoO0.C27715OooO0o;
import o0OOoO00.C27723OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27618OooO0oO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27639OooOoo0 f97109OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f97110OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97111OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27723OooO0O0 f97112OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27629OooOOoo f97113OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0000OOO f97114OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27684o0000o0 f97115OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27665OooooO0 f97116OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27715OooO0o f97117OooO0oo;

    /* JADX INFO: renamed from: o0OOo0oo.OooO0oO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f97118OooO00o;

        static {
            int[] iArr = new int[CloudEvent.AccountEvent.Type.values().length];
            try {
                iArr[CloudEvent.AccountEvent.Type.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CloudEvent.AccountEvent.Type.LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f97118OooO00o = iArr;
        }
    }

    public C27618OooO0oO(Context context, InterfaceC27605OooO00o repo, C27723OooO0O0 facade, C27629OooOOoo c27629OooOOoo, C27684o0000o0 notifier, o0000OOO syncAllUseCase, C27665OooooO0 legacyMigrationUseCase, C27715OooO0o migrationGuard, C27639OooOoo0 cloudSyncRemoteConfig) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(repo, "repo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(facade, "facade");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notifier, "notifier");
        kotlin.jvm.internal.OooOOO0.OooO0oO(syncAllUseCase, "syncAllUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(legacyMigrationUseCase, "legacyMigrationUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(migrationGuard, "migrationGuard");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRemoteConfig, "cloudSyncRemoteConfig");
        this.f97110OooO00o = context;
        this.f97111OooO0O0 = repo;
        this.f97112OooO0OO = facade;
        this.f97113OooO0Oo = c27629OooOOoo;
        this.f97115OooO0o0 = notifier;
        this.f97114OooO0o = syncAllUseCase;
        this.f97116OooO0oO = legacyMigrationUseCase;
        this.f97117OooO0oo = migrationGuard;
        this.f97109OooO = cloudSyncRemoteConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r7 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        if (r7.OooO00o(r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27618OooO0oO c27618OooO0oO, CloudEvent.AccountEvent accountEvent, Continuation continuation) {
        C27619OooO0oo c27619OooO0oo;
        c27618OooO0oO.getClass();
        if (continuation instanceof C27619OooO0oo) {
            c27619OooO0oo = (C27619OooO0oo) continuation;
            int i = c27619OooO0oo.f97121OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27619OooO0oo.f97121OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27619OooO0oo = new C27619OooO0oo(c27618OooO0oO, continuation);
            }
        }
        Object objOooO0OO = c27619OooO0oo.f97119OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27619OooO0oo.f97121OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            int i3 = OooO00o.f97118OooO00o[accountEvent.getState().ordinal()];
            if (i3 == 1) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudEventHandlerUseCase");
                c20358OooO00o.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Account logged in: ", accountEvent.getAccountId()), new Object[0]);
                c27619OooO0oo.f97120OooOo0o = c27618OooO0oO;
                c27619OooO0oo.f97121OooOoO = 1;
                objOooO0OO = c27618OooO0oO.f97117OooO0oo.OooO0OO(c27619OooO0oo);
                if (objOooO0OO != enumC32485OooO00o) {
                    if (!((Boolean) objOooO0OO).booleanValue()) {
                    }
                }
            } else {
                if (i3 != 2) {
                    throw new C32442OooOO0o();
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("CloudEventHandlerUseCase");
                c20358OooO00o2.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Account logged out: ", accountEvent.getAccountId()), new Object[0]);
                c27619OooO0oo.f97121OooOoO = 3;
                Object objOooOOO0 = c27618OooO0oO.f97112OooO0OO.f97800OooO00o.OooOOO0(true, c27619OooO0oo);
                if (objOooOOO0 != enumC32485OooO00o) {
                    objOooOOO0 = C32460OooOooO.f116667OooO00o;
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0OO);
            return C32460OooOooO.f116667OooO00o;
        }
        c27618OooO0oO = c27619OooO0oo.f97120OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0OO);
        if (!((Boolean) objOooO0OO).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        o0000OOO o0000ooo = c27618OooO0oO.f97114OooO0o;
        c27619OooO0oo.f97120OooOo0o = null;
        c27619OooO0oo.f97121OooOoO = 2;
    }
}
