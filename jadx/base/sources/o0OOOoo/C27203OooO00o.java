package o0OOOoo;

import com.orion.notein.domain.models.note.PenInfo;
import java.util.Comparator;
import java.util.List;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0OOOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27203OooO00o<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ List f94996OooOo0o;

    public C27203OooO00o(List list) {
        this.f94996OooOo0o = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Integer numValueOf = Integer.valueOf(((PenInfo) t).getType());
        List list = this.f94996OooOo0o;
        return C24536OooO0Oo.OooO0O0(Integer.valueOf(list.indexOf(numValueOf)), Integer.valueOf(list.indexOf(Integer.valueOf(((PenInfo) t2).getType()))));
    }
}
