package o0OOo0o;

import com.orion.notein.domain.models.page.PageLayer;
import java.util.Comparator;
import java.util.List;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0OOo0o.o00O0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27461o00O0oo<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ List f96116OooOo0o;

    public C27461o00O0oo(List list) {
        this.f96116OooOo0o = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String id = ((PageLayer) t).getId();
        List list = this.f96116OooOo0o;
        return C24536OooO0Oo.OooO0O0(Integer.valueOf(list.indexOf(id)), Integer.valueOf(list.indexOf(((PageLayer) t2).getId())));
    }
}
