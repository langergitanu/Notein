package o0Oo0o00;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o0Oo0o00.C28201OooooO0;
import o0oOoOo.C31035OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;

/* JADX INFO: renamed from: o0Oo0o00.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$syncingFileVO$1", m80623f = "CloudSyncViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28218o0ooOoO extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends CloudMetaLocal>, Map<String, ? extends String>, Set<? extends String>, Continuation<? super List<? extends C31035OooO0o0>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Map f100040OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f100041OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C28201OooooO0 f100042OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Set f100043OooOoO0;

    /* JADX INFO: renamed from: o0Oo0o00.o0ooOoO$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(((C31035OooO0o0) t).f110806OooO0O0, ((C31035OooO0o0) t2).f110806OooO0O0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28218o0ooOoO(C28201OooooO0 c28201OooooO0, Continuation<? super C28218o0ooOoO> continuation) {
        super(4, continuation);
        this.f100042OooOoO = c28201OooooO0;
    }

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(List<? extends CloudMetaLocal> list, Map<String, ? extends String> map, Set<? extends String> set, Continuation<? super List<? extends C31035OooO0o0>> continuation) {
        C28218o0ooOoO c28218o0ooOoO = new C28218o0ooOoO(this.f100042OooOoO, continuation);
        c28218o0ooOoO.f100041OooOo0o = list;
        c28218o0ooOoO.f100040OooOo = map;
        c28218o0ooOoO.f100043OooOoO0 = set;
        return c28218o0ooOoO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r6 != 7) goto L26;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C31035OooO0o0 c31035OooO0o0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List<CloudMetaLocal> list = this.f100041OooOo0o;
        Map<String, String> map = this.f100040OooOo;
        Set set = this.f100043OooOoO0;
        ArrayList arrayList = new ArrayList();
        for (CloudMetaLocal cloudMetaLocal : list) {
            C28201OooooO0 c28201OooooO0 = this.f100042OooOoO;
            c28201OooooO0.getClass();
            SyncPhase phase = cloudMetaLocal.getSyncState().getPhase();
            boolean z2 = cloudMetaLocal.getLastErrorCode() != null;
            int[] iArr = C28201OooooO0.OooO00o.f99968OooO00o;
            int i = iArr[phase.ordinal()];
            if ((i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 7) && !z2) {
                int i2 = iArr[phase.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    z = true;
                    c31035OooO0o0 = new C31035OooO0o0(cloudMetaLocal.getId(), c28201OooooO0.OooO0oO(cloudMetaLocal, map), z);
                } else if (i2 == 3 || i2 == 4 || i2 == 6) {
                    z = false;
                    c31035OooO0o0 = new C31035OooO0o0(cloudMetaLocal.getId(), c28201OooooO0.OooO0oO(cloudMetaLocal, map), z);
                }
            } else {
                c31035OooO0o0 = null;
            }
            if (c31035OooO0o0 != null) {
                arrayList.add(c31035OooO0o0);
            }
        }
        return oOo000Oo.OooOo.o00O0O(arrayList, new OooO00o());
    }
}
