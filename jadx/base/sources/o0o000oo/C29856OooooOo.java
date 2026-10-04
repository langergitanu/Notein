package o0o000oo;

import java.util.Comparator;
import java.util.Map;
import o000OoO.C24536OooO0Oo;
import o0o00Oo0.C29909OooO0O0;

/* JADX INFO: renamed from: o0o000oo.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29856OooooOo<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Map f105890OooOo0o;

    public C29856OooooOo(Map map) {
        this.f105890OooOo0o = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Integer numValueOf = Integer.valueOf(((C29909OooO0O0) t).f106118OooO00o);
        Map map = this.f105890OooOo0o;
        return C24536OooO0Oo.OooO0O0((Integer) map.get(numValueOf), (Integer) map.get(Integer.valueOf(((C29909OooO0O0) t2).f106118OooO00o)));
    }
}
