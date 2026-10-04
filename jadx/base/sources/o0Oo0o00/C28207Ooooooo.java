package o0Oo0o00;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.EnumC27285OooO;
import o0oOoOo.C31033OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32513OooOo0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0Oo0o00.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$cloudSyncOverviewVO$1", m80623f = "CloudSyncViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28207Ooooooo extends AbstractC32476OooO implements InterfaceC32513OooOo0O<List<? extends CloudMetaLocal>, List<? extends CloudMetaRemote>, EnumC27285OooO, Long, Boolean, Integer, Integer, Continuation<? super C31033OooO0Oo>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ EnumC27285OooO f99983OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f99984OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ boolean f99985OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ long f99986OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ int f99987OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ int f99988OooOoo0;

    public C28207Ooooooo(Continuation<? super C28207Ooooooo> continuation) {
        super(8, continuation);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f99984OooOo0o;
        EnumC27285OooO enumC27285OooO = this.f99983OooOo;
        long j = this.f99986OooOoO0;
        boolean z2 = this.f99985OooOoO;
        int i = this.f99987OooOoOO;
        int i2 = this.f99988OooOoo0;
        if (enumC27285OooO == null) {
            return null;
        }
        int i3 = 0;
        if (z2 || i > 0) {
            z = true;
            break;
        }
        List<CloudMetaLocal> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (CloudMetaLocal cloudMetaLocal : list2) {
                if (cloudMetaLocal.getSyncState().getPhase() == SyncPhase.PACKAGING || cloudMetaLocal.getSyncState().getPhase() == SyncPhase.UPLOADING || cloudMetaLocal.getSyncState().getPhase() == SyncPhase.DOWNLOADING || cloudMetaLocal.getSyncState().getPhase() == SyncPhase.RESTORING || cloudMetaLocal.getSyncState().getPhase() == SyncPhase.RESOLVING_CONFLICT) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        List list3 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((CloudMetaLocal) it.next()).getId());
        }
        int size = oOo000Oo.OooOo.o0OO00O(arrayList).size();
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (((CloudMetaLocal) it2.next()).getSyncState().getPhase() != SyncPhase.CLEAN && (i3 = i3 + 1) < 0) {
                    C34429OooOOo0.OooOOo0();
                    throw null;
                }
            }
        }
        return new C31033OooO0Oo(enumC27285OooO == EnumC27285OooO.f95076OooOo0o ? C31033OooO0Oo.OooO00o.f110793OooOo0o : z ? C31033OooO0Oo.OooO00o.f110795OooOoO0 : i2 > 0 ? C31033OooO0Oo.OooO00o.f110798OooOoo0 : i3 > 0 ? C31033OooO0Oo.OooO00o.f110796OooOoOO : j == 0 ? C31033OooO0Oo.OooO00o.f110792OooOo : C31033OooO0Oo.OooO00o.f110794OooOoO, enumC27285OooO, i3, size, j);
    }

    @Override // oO0O000o.InterfaceC32513OooOo0O
    public final Object o0Oo0oo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        long jLongValue = ((Number) obj4).longValue();
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        int iIntValue = ((Number) obj6).intValue();
        int iIntValue2 = ((Number) obj7).intValue();
        C28207Ooooooo c28207Ooooooo = new C28207Ooooooo((Continuation) serializable);
        c28207Ooooooo.f99984OooOo0o = (List) obj;
        c28207Ooooooo.f99983OooOo = (EnumC27285OooO) obj3;
        c28207Ooooooo.f99986OooOoO0 = jLongValue;
        c28207Ooooooo.f99985OooOoO = zBooleanValue;
        c28207Ooooooo.f99987OooOoOO = iIntValue;
        c28207Ooooooo.f99988OooOoo0 = iIntValue2;
        return c28207Ooooooo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
