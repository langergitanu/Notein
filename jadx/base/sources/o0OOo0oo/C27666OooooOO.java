package o0OOo0oo;

import Oooo0.C20855OooooOO;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import java.util.Set;

/* JADX INFO: renamed from: o0OOo0oo.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27666OooooOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Set<SyncPhase> f97310OooO00o = oOo000Oo.OooOOO.OoooOo0(new SyncPhase[]{SyncPhase.DIRTY_CLOUD, SyncPhase.DOWNLOADING, SyncPhase.RESTORING});

    public static final boolean OooO00o(CloudMetaLocal cloudMetaLocal) {
        if (cloudMetaLocal.getMetaVersion() == 0) {
            return f97310OooO00o.contains(cloudMetaLocal.getSyncState().getPhase());
        }
        return false;
    }

    public static final String OooO0O0(String str) {
        return (str == null || str.length() == 0) ? "empty" : C20855OooooOO.OooO0OO(str.length(), str.hashCode(), "len=", ",hash=");
    }
}
