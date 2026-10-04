package oO0OOo0o;

import java.util.Comparator;
import oO0OOo0o.o00O0O;

/* JADX INFO: renamed from: oO0OOo0o.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33122ooOO implements Comparator<Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O.OooO00o f119781OooOo0o;

    public C33122ooOO(o00O0O.OooO00o oooO00o) {
        this.f119781OooOo0o = oooO00o;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        o00O0O.OooO00o oooO00o = this.f119781OooOo0o;
        int iOooO0O0 = oooO00o.OooO0O0(obj) - oooO00o.OooO0O0(obj2);
        return iOooO0O0 != 0 ? iOooO0O0 : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
