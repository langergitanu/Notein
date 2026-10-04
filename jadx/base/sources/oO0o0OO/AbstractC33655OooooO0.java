package oO0o0OO;

import androidx.core.location.LocationRequestCompat;
import o000o0o.C24613OooO0OO;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: renamed from: oO0o0OO.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33655OooooO0 extends AbstractC33630OooOooO {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f121334OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f121335OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f121336OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C34426OooOO0o<AbstractC33647OoooOO0<?>> f121337OooOoOO;

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final AbstractC33630OooOooO o000OOo0(int i) {
        C24613OooO0OO.OooO0O0(1);
        return this;
    }

    public final void o000OOoO(boolean z) {
        long j = this.f121336OooOoO0 - (z ? 4294967296L : 1L);
        this.f121336OooOoO0 = j;
        if (j <= 0 && this.f121335OooOoO) {
            shutdown();
        }
    }

    public final boolean o000Oo() {
        C34426OooOO0o<AbstractC33647OoooOO0<?>> c34426OooOO0o = this.f121337OooOoOO;
        if (c34426OooOO0o == null) {
            return false;
        }
        AbstractC33647OoooOO0<?> abstractC33647OoooOO0RemoveFirst = c34426OooOO0o.isEmpty() ? null : c34426OooOO0o.removeFirst();
        if (abstractC33647OoooOO0RemoveFirst == null) {
            return false;
        }
        abstractC33647OoooOO0RemoveFirst.run();
        return true;
    }

    public final void o000Oo00(AbstractC33647OoooOO0<?> abstractC33647OoooOO0) {
        C34426OooOO0o<AbstractC33647OoooOO0<?>> c34426OooOO0o = this.f121337OooOoOO;
        if (c34426OooOO0o == null) {
            c34426OooOO0o = new C34426OooOO0o<>();
            this.f121337OooOoOO = c34426OooOO0o;
        }
        c34426OooOO0o.addLast(abstractC33647OoooOO0);
    }

    public final void o000Oo0O(boolean z) {
        this.f121336OooOoO0 = (z ? 4294967296L : 1L) + this.f121336OooOoO0;
        if (z) {
            return;
        }
        this.f121335OooOoO = true;
    }

    public long o000Oo0o() {
        if (o000Oo()) {
            return 0L;
        }
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    public void shutdown() {
    }
}
