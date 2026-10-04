package o0OOo0oo;

import com.microsoft.identity.common.internal.net.cache.HttpCache;
import com.orion.notein.domain.models.cloud.NoteCloudQuota;
import java.io.Serializable;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27616OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97105OooO00o;

    public C27616OooO0o(InterfaceC27605OooO00o cloudSyncRepo, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        this.f97105OooO00o = cloudSyncRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27612OooO00o c27612OooO00o;
        if (abstractC32479OooO0OO instanceof C27612OooO00o) {
            c27612OooO00o = (C27612OooO00o) abstractC32479OooO0OO;
            int i = c27612OooO00o.f97092OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27612OooO00o.f97092OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27612OooO00o = new C27612OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27612OooO00o.f97091OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27612OooO00o.f97092OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        c27612OooO00o.f97092OooOoO0 = 1;
        Object objOooo000 = this.f97105OooO00o.Oooo000(c27612OooO00o);
        return objOooo000 == enumC32485OooO00o ? enumC32485OooO00o : objOooo000;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27613OooO0O0 c27613OooO0O0;
        Object objOooO0OO;
        if (abstractC32479OooO0OO instanceof C27613OooO0O0) {
            c27613OooO0O0 = (C27613OooO0O0) abstractC32479OooO0OO;
            int i = c27613OooO0O0.f97095OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27613OooO0O0.f97095OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27613OooO0O0 = new C27613OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27613OooO0O0.f97094OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27613OooO0O0.f97095OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27613OooO0O0.f97095OooOoO0 = 1;
            objOooO0OO = this.f97105OooO00o.OooO0OO(c27613OooO0O0);
            if (objOooO0OO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0OO = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        boolean z = objOooO0OO instanceof C32445OooOOOO.OooO00o;
        if (z) {
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO0OO);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            return C32446OooOOOo.OooO00o(thOooO00o);
        }
        if (z) {
            objOooO0OO = null;
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooO0OO);
        NoteCloudQuota noteCloudQuota = (NoteCloudQuota) objOooO0OO;
        long userCapacity = noteCloudQuota.getUserCapacity() - noteCloudQuota.getUsedSpace();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("CheckCloudSyncServiceUseCase");
        long usedSpace = noteCloudQuota.getUsedSpace();
        long userCapacity2 = noteCloudQuota.getUserCapacity();
        StringBuilder sbOooO00o = o00oO0O.o0OoOo0.OooO00o(usedSpace, "Cloud quota check: used=", " / total=");
        sbOooO00o.append(userCapacity2);
        sbOooO00o.append(", remain=");
        sbOooO00o.append(userCapacity);
        c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
        return Boolean.valueOf(userCapacity >= HttpCache.DEFAULT_HTTP_CACHE_CAPACITY_BYTES);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27614OooO0OO c27614OooO0OO;
        EnumC27285OooO enumC27285OooO;
        Object objOooO00o;
        Throwable thOooO00o;
        if (abstractC32479OooO0OO instanceof C27614OooO0OO) {
            c27614OooO0OO = (C27614OooO0OO) abstractC32479OooO0OO;
            int i = c27614OooO0OO.f97098OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27614OooO0OO.f97098OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27614OooO0OO = new C27614OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27614OooO0OO.f97096OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27614OooO0OO.f97098OooOoO;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            c27614OooO0OO.f97097OooOo0o = this;
            c27614OooO0OO.f97098OooOoO = 1;
            objOooO0o = this.f97105OooO00o.OooO0o(c27614OooO0OO);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enumC27285OooO = (EnumC27285OooO) c27614OooO0OO.f97097OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    zBooleanValue = ((Boolean) objOooO0o).booleanValue();
                    objOooO00o = Boolean.valueOf(zBooleanValue);
                } catch (Throwable th) {
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("AboutCloudSyncUseCase");
                    c20358OooO00o.OooO0Oo(thOooO00o, "Failed to check cloud authorization for type: %s", enumC27285OooO);
                    objOooO00o = Boolean.FALSE;
                }
                return !((Boolean) objOooO00o).booleanValue() ? enumC27285OooO : EnumC27285OooO.f95076OooOo0o;
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        enumC27285OooO = (EnumC27285OooO) objOooO0o;
        objOooO00o = Boolean.valueOf(zBooleanValue);
        thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
        }
        if (!((Boolean) objOooO00o).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27617OooO0o0 c27617OooO0o0;
        Object objOooO0Oo;
        if (abstractC32479OooO0OO instanceof C27617OooO0o0) {
            c27617OooO0o0 = (C27617OooO0o0) abstractC32479OooO0OO;
            int i = c27617OooO0o0.f97108OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27617OooO0o0.f97108OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27617OooO0o0 = new C27617OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27617OooO0o0.f97107OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27617OooO0o0.f97108OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27617OooO0o0.f97108OooOoO0 = 1;
            objOooO0Oo = this.f97105OooO00o.OooO0Oo(c27617OooO0o0);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0Oo = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        if (objOooO0Oo instanceof C32445OooOOOO.OooO00o) {
            return null;
        }
        return objOooO0Oo;
    }
}
