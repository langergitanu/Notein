package oO00OoO;

import java.util.LinkedHashMap;
import java.util.Map;
import oO00OoO.C32280OooO0O0;

/* JADX INFO: renamed from: oO00OoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32279OooO00o extends LinkedHashMap<Object, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32280OooO0O0.OooO00o f116001OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32279OooO00o(C32280OooO0O0.OooO00o oooO00o, int i) {
        super(i, 0.75f, true);
        this.f116001OooOo0o = oooO00o;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Object, Object> entry) {
        return size() > this.f116001OooOo0o.f116004OooO0O0;
    }
}
