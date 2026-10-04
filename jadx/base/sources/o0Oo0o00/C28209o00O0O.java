package o0Oo0o00;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o0Oo0o00.C28201OooooO0;
import o0oOoOo.C31032OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0Oo0o00.o00O0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$issueFileVO$1", m80623f = "CloudSyncViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28209o00O0O extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends CloudMetaLocal>, Map<String, ? extends String>, Set<? extends String>, Continuation<? super List<? extends C31032OooO0OO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Map f99992OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f99993OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C28201OooooO0 f99994OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Set f99995OooOoO0;

    /* JADX INFO: renamed from: o0Oo0o00.o00O0O$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Boolean.valueOf(((C31032OooO0OO) t2).f110784OooO0OO), Boolean.valueOf(((C31032OooO0OO) t).f110784OooO0OO));
        }
    }

    /* JADX INFO: renamed from: o0Oo0o00.o00O0O$OooO0O0 */
    public static final class OooO0O0<T> implements Comparator {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO00o f99996OooOo0o;

        public OooO0O0(OooO00o oooO00o) {
            this.f99996OooOo0o = oooO00o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f99996OooOo0o.compare(t, t2);
            return iCompare != 0 ? iCompare : C24536OooO0Oo.OooO0O0(((C31032OooO0OO) t).f110783OooO0O0, ((C31032OooO0OO) t2).f110783OooO0O0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28209o00O0O(C28201OooooO0 c28201OooooO0, Continuation<? super C28209o00O0O> continuation) {
        super(4, continuation);
        this.f99994OooOoO = c28201OooooO0;
    }

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(List<? extends CloudMetaLocal> list, Map<String, ? extends String> map, Set<? extends String> set, Continuation<? super List<? extends C31032OooO0OO>> continuation) {
        C28209o00O0O c28209o00O0O = new C28209o00O0O(this.f99994OooOoO, continuation);
        c28209o00O0O.f99993OooOo0o = list;
        c28209o00O0O.f99992OooOo = map;
        c28209o00O0O.f99995OooOoO0 = set;
        return c28209o00O0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r8;
        C31032OooO0OO c31032OooO0OO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f99993OooOo0o;
        Map<String, String> map = this.f99992OooOo;
        Set set = this.f99995OooOoO0;
        C28201OooooO0 c28201OooooO0 = this.f99994OooOoO;
        c28201OooooO0.getClass();
        List<CloudMetaLocal> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String lastErrorCode = ((CloudMetaLocal) it.next()).getLastErrorCode();
            if (lastErrorCode != null) {
                arrayList.add(lastErrorCode);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            r8 = c28201OooooO0.f99961OooOooO;
            if (!zHasNext) {
                break;
            }
            Object next = it2.next();
            String str = (String) next;
            if (r8.containsKey(str) && !kotlin.jvm.internal.OooOOO0.OooO0O0(str, CloudSyncError.CODE_NETWORK)) {
                arrayList2.add(next);
            }
        }
        LinkedHashSet linkedHashSetOooO0oo = C34449Oooo0oo.OooO0oo(set, oOo000Oo.OooOo.o0OO00O(arrayList2));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = linkedHashSetOooO0oo.iterator();
        while (true) {
            C31032OooO0OO c31032OooO0OO2 = null;
            if (!it3.hasNext()) {
                break;
            }
            String str2 = (String) it3.next();
            Integer num = (Integer) r8.get(str2);
            if (num != null) {
                String string = c28201OooooO0.f99947OooOOOo.getString(num.intValue());
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                c31032OooO0OO2 = new C31032OooO0OO(str2, string, false, true, str2);
            }
            if (c31032OooO0OO2 != null) {
                arrayList3.add(c31032OooO0OO2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (CloudMetaLocal cloudMetaLocal : list2) {
            boolean z = cloudMetaLocal.getSyncState().getPhase() == SyncPhase.CLEAN;
            int i = C28201OooooO0.OooO00o.f99968OooO00o[cloudMetaLocal.getSyncState().getPhase().ordinal()];
            boolean z2 = i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            if (z || z2) {
                c31032OooO0OO = null;
            } else {
                boolean z3 = cloudMetaLocal.getSyncState().getPhase() == SyncPhase.CONFLICT;
                String lastErrorCode2 = cloudMetaLocal.getLastErrorCode();
                if (z3 || lastErrorCode2 != null) {
                    c31032OooO0OO = new C31032OooO0OO(cloudMetaLocal.getId(), c28201OooooO0.OooO0oO(cloudMetaLocal, map), z3, false, lastErrorCode2);
                }
            }
            if (c31032OooO0OO != null) {
                arrayList4.add(c31032OooO0OO);
            }
        }
        return oOo000Oo.OooOo.OooooOO(arrayList3, oOo000Oo.OooOo.o00O0O(arrayList4, new OooO0O0(new OooO00o())));
    }
}
