package OooOoOO;

import OooOoOO.C20564Ooooo00;
import OoooOOo.C21216OooOooO;
import java.util.ListIterator;

/* JADX INFO: renamed from: OooOoOO.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20567Ooooo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Long> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20564Ooooo00<Object> f58786OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20567Ooooo0o(C20564Ooooo00<Object> c20564Ooooo00) {
        super(0);
        this.f58786OooOo0o = c20564Ooooo00;
    }

    @Override // oO0O000o.OooO00o
    public final Long invoke() {
        C20564Ooooo00<Object> c20564Ooooo00 = this.f58786OooOo0o;
        ListIterator<C20564Ooooo00<Object>.OooO0OO<?, ?>> listIterator = c20564Ooooo00.f58761OooO0oO.listIterator();
        long jMax = 0;
        while (true) {
            C21216OooOooO c21216OooOooO = (C21216OooOooO) listIterator;
            if (!c21216OooOooO.hasNext()) {
                break;
            }
            jMax = Math.max(jMax, ((C20564Ooooo00.OooO0OO) c21216OooOooO.next()).OooO0OO().f58753OooO0oo);
        }
        ListIterator<C20564Ooooo00<?>> listIterator2 = c20564Ooooo00.f58762OooO0oo.listIterator();
        while (true) {
            C21216OooOooO c21216OooOooO2 = (C21216OooOooO) listIterator2;
            if (!c21216OooOooO2.hasNext()) {
                return Long.valueOf(jMax);
            }
            jMax = Math.max(jMax, ((Number) ((C20564Ooooo00) c21216OooOooO2.next()).f58763OooOO0.getValue()).longValue());
        }
    }
}
