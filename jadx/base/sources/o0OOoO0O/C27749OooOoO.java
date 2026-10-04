package o0OOoO0O;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.SyncState;

/* JADX INFO: renamed from: o0OOoO0O.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27749OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CloudMetaLocal f97952OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SyncState f97953OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SyncState f97954OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f97955OooO0Oo;

    public C27749OooOoO(CloudMetaLocal meta, SyncState fromState, SyncState toState, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(meta, "meta");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fromState, "fromState");
        kotlin.jvm.internal.OooOOO0.OooO0oO(toState, "toState");
        this.f97952OooO00o = meta;
        this.f97953OooO0O0 = fromState;
        this.f97954OooO0OO = toState;
        this.f97955OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27749OooOoO)) {
            return false;
        }
        C27749OooOoO c27749OooOoO = (C27749OooOoO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f97952OooO00o, c27749OooOoO.f97952OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f97953OooO0O0, c27749OooOoO.f97953OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f97954OooO0OO, c27749OooOoO.f97954OooO0OO) && this.f97955OooO0Oo == c27749OooOoO.f97955OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97955OooO0Oo) + ((this.f97954OooO0OO.hashCode() + ((this.f97953OooO0O0.hashCode() + (this.f97952OooO00o.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransitionResult(meta=" + this.f97952OooO00o + ", fromState=" + this.f97953OooO0O0 + ", toState=" + this.f97954OooO0OO + ", shouldExecuteSideEffect=" + this.f97955OooO0Oo + ")";
    }
}
