package o0OOooO;

import com.orion.notein.domain.models.page.PageLayer;
import java.util.Comparator;
import java.util.List;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0OOooO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27876OooO0o<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ List f98521OooOo0o;

    public C27876OooO0o(List list) {
        this.f98521OooOo0o = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String id = ((PageLayer) t).getId();
        List list = this.f98521OooOo0o;
        return C24536OooO0Oo.OooO0O0(Integer.valueOf(list.indexOf(id)), Integer.valueOf(list.indexOf(((PageLayer) t2).getId())));
    }
}
