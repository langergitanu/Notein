package o0OOoOo0;

import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o0OOO0OO.C27020OooOoO0;
import o0OOOO00.C27091OooOOo;
import o0OOo0Oo.InterfaceC27306OooOo00;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32443OooOOO;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0OOoOo0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27819OooOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27306OooOo00 f98267OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f98268OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C28009OooOOOO f98269OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27020OooOoO0 f98270OooO0Oo;

    public C27819OooOoo(InterfaceC27306OooOo00 labelRepo, InterfaceC27313OooOoo0 noteMetaRepo, C28009OooOOOO c28009OooOOOO, C27020OooOoO0 c27020OooOoO0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(labelRepo, "labelRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        this.f98267OooO00o = labelRepo;
        this.f98268OooO0O0 = noteMetaRepo;
        this.f98269OooO0OO = c28009OooOOOO;
        this.f98270OooO0Oo = c27020OooOoO0;
    }

    public static final InterfaceC33721OooO0o OooO00o(C27819OooOoo c27819OooOoo, ArrayList arrayList) {
        c27819OooOoo.getClass();
        return arrayList.isEmpty() ? new C33716OooO(C34434OooOoO.f123453OooOo0o) : new C27801OooOO0((InterfaceC33721OooO0o[]) oOo000Oo.OooOo.o0ooOO0(arrayList).toArray(new InterfaceC33721OooO0o[0]), 0);
    }

    public final C27808OooOOo OooO0O0(String noteId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        return new C27808OooOOo(this.f98267OooO00o.OooOO0O(com.facebook.soloader.OooOo.OooO0oO(noteId)), noteId);
    }

    public final o0OOOO00.OooOOO0 OooO0OO(String noteId, List pageIds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageIds, "pageIds");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        return new o0OOOO00.OooOOO0(this.f98267OooO00o.OooOOOo(Oooo0.OooO0o0(new C32443OooOOO(noteId, pageIds))), noteId, 1);
    }

    public final C27091OooOOo OooO0Oo(List pages) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pages, "pages");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : pages) {
            String noteId = ((Page) obj).getNoteId();
            Object arrayList = linkedHashMap.get(noteId);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(noteId, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Oooo0.OooO0Oo(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Page) it.next()).getId());
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return new C27091OooOOo(this.f98267OooO00o.OooOOOo(linkedHashMap2), 1);
    }
}
