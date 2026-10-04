package o0OOo0o;

import com.orion.notein.domain.models.page.Page;
import java.util.Comparator;
import java.util.List;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o00OO00O<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ List f96139OooOo0o;

    public o00OO00O(List list) {
        this.f96139OooOo0o = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String id = ((Page) t).getId();
        List list = this.f96139OooOo0o;
        return C24536OooO0Oo.OooO0O0(Integer.valueOf(list.indexOf(id)), Integer.valueOf(list.indexOf(((Page) t2).getId())));
    }
}
