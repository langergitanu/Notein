package o0o0OO;

import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVOFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o0OOO0.C30543OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0OO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.viewmodel.TiledPageViewModel$pageOperationList$1", m80623f = "TiledPageViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30373OooOOo0 extends AbstractC32476OooO implements InterfaceC32511OooOOoo<List<? extends TiledPagePreviewVO>, Boolean, Boolean, TiledPagePreviewVOFilter, Continuation<? super List<? extends C30543OooO00o>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f108403OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f108404OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ TiledPagePreviewVOFilter f108405OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ boolean f108406OooOoO0;

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        C30373OooOOo0 c30373OooOOo0 = new C30373OooOOo0(5, (Continuation) serializable);
        c30373OooOOo0.f108404OooOo0o = (List) obj;
        c30373OooOOo0.f108403OooOo = zBooleanValue;
        c30373OooOOo0.f108406OooOoO0 = zBooleanValue2;
        c30373OooOOo0.f108405OooOoO = (TiledPagePreviewVOFilter) obj4;
        return c30373OooOOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f108404OooOo0o;
        boolean z = this.f108403OooOo;
        boolean z2 = this.f108406OooOoO0;
        TiledPagePreviewVOFilter tiledPagePreviewVOFilter = this.f108405OooOoO;
        List<Integer> list2 = C30543OooO00o.f109251OooO0Oo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            boolean z3 = false;
            boolean readOnly = tiledPagePreviewVOFilter != null ? tiledPagePreviewVOFilter.getReadOnly() : false;
            boolean z4 = iIntValue == 0 || iIntValue == 1 || iIntValue == 2 || iIntValue == 5;
            boolean zIsEmpty = list.isEmpty();
            boolean z5 = !zIsEmpty;
            switch (iIntValue) {
                case 0:
                case 1:
                case 3:
                case 5:
                case 6:
                    break;
                case 2:
                    z5 = !zIsEmpty && z && !readOnly;
                    break;
                case 4:
                    if (!zIsEmpty && !readOnly) {
                        z5 = true;
                        break;
                    }
                    break;
                default:
                    z5 = true;
                    break;
            }
            if (z2 && z4) {
                z3 = true;
            }
            arrayList.add(new C30543OooO00o(iIntValue, z3, z5));
        }
        return arrayList;
    }
}
