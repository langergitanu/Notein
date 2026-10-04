package o0OOo0o;

import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o00OO000<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f96138OooOo0o;

    public o00OO000(ArrayList arrayList) {
        this.f96138OooOo0o = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String id = ((Page) t).getId();
        ArrayList arrayList = this.f96138OooOo0o;
        return C24536OooO0Oo.OooO0O0(Integer.valueOf(arrayList.indexOf(id)), Integer.valueOf(arrayList.indexOf(((Page) t2).getId())));
    }
}
