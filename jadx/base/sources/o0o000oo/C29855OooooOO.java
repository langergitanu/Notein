package o0o000oo;

import java.util.Comparator;
import java.util.Map;
import o000OoO.C24536OooO0Oo;
import o0o00Oo0.C29908OooO00o;

/* JADX INFO: renamed from: o0o000oo.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29855OooooOO<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Map f105889OooOo0o;

    public C29855OooooOO(Map map) {
        this.f105889OooOo0o = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Integer numValueOf = Integer.valueOf(((C29908OooO00o) t).f106114OooO00o);
        Map map = this.f105889OooOo0o;
        return C24536OooO0Oo.OooO0O0((Integer) map.get(numValueOf), (Integer) map.get(Integer.valueOf(((C29908OooO00o) t2).f106114OooO00o)));
    }
}
