package o0o0O0O0;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31039OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.pdf.ImportPdfViewModel$currentFileNodes$1", m80623f = "ImportPdfViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32511OooOOoo<Map<String, ? extends List<? extends C31039OooOO0O>>, File, String, Set<? extends String>, Continuation<? super List<? extends C31039OooOO0O>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ File f107886OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Map f107887OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Set f107888OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ String f107889OooOoO0;

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        OooOO0O oooOO0O = new OooOO0O(5, (Continuation) serializable);
        oooOO0O.f107887OooOo0o = (Map) obj;
        oooOO0O.f107886OooOo = (File) obj2;
        oooOO0O.f107889OooOoO0 = (String) obj3;
        oooOO0O.f107888OooOoO = (Set) obj4;
        return oooOO0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Map map = this.f107887OooOo0o;
        File file = this.f107886OooOo;
        String str = this.f107889OooOoO0;
        Set set = this.f107888OooOoO;
        if (str.length() > 0) {
            List list = (List) map.get("/storage");
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    C31039OooOO0O c31039OooOO0O = (C31039OooOO0O) obj2;
                    if (!c31039OooOO0O.f110818OooO0OO && C33599OooOo0O.OooOoOO(c31039OooOO0O.f110817OooO0O0, str, true)) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = 0;
            }
        } else {
            arrayList = (List) map.get(file.getAbsolutePath());
        }
        if (arrayList == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        Iterable<C31039OooOO0O> iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        for (C31039OooOO0O c31039OooOO0O2 : iterable) {
            arrayList2.add(C31039OooOO0O.OooO00o(c31039OooOO0O2, set.contains(c31039OooOO0O2.f110816OooO00o)));
        }
        final OooO oooO = new OooO();
        return OooOo.o00O0O(arrayList2, new Comparator() { // from class: o0o0O0O0.OooOO0
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return ((Number) oooO.invoke(obj3, obj4)).intValue();
            }
        });
    }
}
