package o00Ooo;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o00Ooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25078OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f85108OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25086OooOo0O f85109OooO0O0;

    public C25078OooO0oO(LinkedHashMap linkedHashMap, C25086OooOo0O c25086OooOo0O) {
        this.f85108OooO00o = linkedHashMap;
        this.f85109OooO0O0 = c25086OooOo0O;
    }

    public final boolean OooO00o(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) this.f85109OooO0O0.f85155OooO00o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (C25084OooOOoo.OooO00o(((C25087OooOo0o) obj).f85158OooO00o, j)) {
                break;
            }
            i++;
        }
        C25087OooOo0o c25087OooOo0o = (C25087OooOo0o) obj;
        if (c25087OooOo0o != null) {
            return c25087OooOo0o.f85165OooO0oo;
        }
        return false;
    }
}
