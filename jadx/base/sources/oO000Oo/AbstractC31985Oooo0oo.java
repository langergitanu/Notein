package oO000Oo;

import com.google.common.base.MoreObjects;
import com.google.firebase.firestore.remote.RunnableC22702OooOOo0;
import java.util.concurrent.TimeUnit;
import oO0OOo0o.AbstractC33093Oooo0oo;
import oO0OOo0o.C33101OoooOO0;

/* JADX INFO: renamed from: oO000Oo.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31985Oooo0oo extends AbstractC33093Oooo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Ooo f114205OooO00o;

    public AbstractC31985Oooo0oo(o00Ooo o00ooo2) {
        this.f114205OooO00o = o00ooo2;
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final void OooO() {
        this.f114205OooO00o.OooO();
    }

    @Override // oO0OOo0o.AbstractC33060OooO0Oo
    public final String OooO00o() {
        return this.f114205OooO00o.f114636OooOo0O.OooO00o();
    }

    @Override // oO0OOo0o.AbstractC33060OooO0Oo
    public final <RequestT, ResponseT> oO0OOo0o.OooO0o<RequestT, ResponseT> OooO0oO(C33101OoooOO0<RequestT, ResponseT> c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO) {
        return this.f114205OooO00o.f114636OooOo0O.OooO0oO(c33101OoooOO0, oooO0OO);
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final boolean OooO0oo(long j) throws InterruptedException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return this.f114205OooO00o.OooO0oo(j);
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final oO0OOo0o.OooOOO OooOO0() {
        return this.f114205OooO00o.OooOO0();
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final void OooOO0O(oO0OOo0o.OooOOO oooOOO, RunnableC22702OooOOo0 runnableC22702OooOOo0) {
        this.f114205OooO00o.OooOO0O(oooOOO, runnableC22702OooOOo0);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", this.f114205OooO00o).toString();
    }
}
