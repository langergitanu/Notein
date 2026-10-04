package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97646OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O f97647OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27684o0000o0 f97648OooO0OO;

    public o0O0O00(InterfaceC27605OooO00o cloudSyncRepo, o00000O o00000o, C27684o0000o0 notificationBus) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notificationBus, "notificationBus");
        this.f97646OooO00o = cloudSyncRepo;
        this.f97647OooO0O0 = o00000o;
        this.f97648OooO0OO = notificationBus;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo0o0Oo oo0o0oo;
        Object objOooo00o;
        o0O0O00 o0o0o00;
        Object obj;
        o0O0O00 o0o0o002;
        Throwable thOooO00o;
        if (abstractC32479OooO0OO instanceof oo0o0Oo) {
            oo0o0oo = (oo0o0Oo) abstractC32479OooO0OO;
            int i = oo0o0oo.f97681OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo0o0oo.f97681OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oo0o0oo = new oo0o0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = oo0o0oo.f97680OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo0o0oo.f97681OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            oo0o0oo.f97678OooOo0o = this;
            oo0o0oo.f97681OooOoOO = 1;
            objOooo00o = this.f97646OooO00o.Oooo00o(oo0o0oo);
            if (objOooo00o != enumC32485OooO00o) {
                o0o0o00 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = oo0o0oo.f97677OooOo;
            o0o0o002 = oo0o0oo.f97678OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            o0o0o00 = o0o0o002;
            objOooo00o = obj;
            thOooO00o = C32445OooOOOO.OooO00o(objOooo00o);
            if (thOooO00o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PullRemoteChangesUseCase");
                c20358OooO00o.OooO0Oo(thOooO00o, "pollRemoteChanges failed", new Object[0]);
                CloudSyncError cloudSyncError = thOooO00o instanceof CloudSyncError ? (CloudSyncError) thOooO00o : null;
                if (cloudSyncError != null && cloudSyncError.getIsGlobalError()) {
                    o0o0o00.f97648OooO0OO.OooO00o(cloudSyncError);
                }
            }
            return objOooo00o;
        }
        o0o0o00 = oo0o0oo.f97678OooOo0o;
        C32446OooOOOo.OooO0O0(obj2);
        objOooo00o = ((C32445OooOOOO) obj2).f116639OooOo0o;
        if (!(objOooo00o instanceof C32445OooOOOO.OooO00o)) {
            o00000O o00000o = o0o0o00.f97647OooO0O0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            oo0o0oo.f97678OooOo0o = o0o0o00;
            oo0o0oo.f97677OooOo = objOooo00o;
            oo0o0oo.f97681OooOoOO = 2;
            if (o00000o.OooO00o(jCurrentTimeMillis, oo0o0oo) != enumC32485OooO00o) {
                obj = objOooo00o;
                o0o0o002 = o0o0o00;
                o0o0o00 = o0o0o002;
                objOooo00o = obj;
            }
            return enumC32485OooO00o;
        }
        thOooO00o = C32445OooOOOO.OooO00o(objOooo00o);
        if (thOooO00o != null) {
        }
        return objOooo00o;
    }
}
