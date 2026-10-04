package o00OooO;

import androidx.fragment.app.C21929Ooooo0o;

/* JADX INFO: renamed from: o00OooO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25141OooOOo0<Z> implements InterfaceC25145OooOo0o<Z> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f85563OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f85564OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooOOO0 f85565OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC25145OooOo0o<Z> f85566OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooOOOO f85567OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f85568OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f85569OooOoo0;

    public C25141OooOOo0(InterfaceC25145OooOo0o interfaceC25145OooOo0o, boolean z, boolean z2, OooOOOO oooOOOO, OooOOO0 oooOOO0) {
        C21929Ooooo0o.OooO0OO(interfaceC25145OooOo0o, "Argument must not be null");
        this.f85566OooOoO0 = interfaceC25145OooOo0o;
        this.f85564OooOo0o = z;
        this.f85563OooOo = z2;
        this.f85567OooOoOO = oooOOOO;
        C21929Ooooo0o.OooO0OO(oooOOO0, "Argument must not be null");
        this.f85565OooOoO = oooOOO0;
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Class<Z> OooO00o() {
        return this.f85566OooOoO0.OooO00o();
    }

    public final synchronized void OooO0O0() {
        if (this.f85568OooOoo) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f85569OooOoo0++;
    }

    public final void OooO0OO() {
        boolean z;
        synchronized (this) {
            int i = this.f85569OooOoo0;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f85569OooOoo0 = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f85565OooOoO.OooO0o0(this.f85567OooOoOO, this);
        }
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final Z get() {
        return this.f85566OooOoO0.get();
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final int getSize() {
        return this.f85566OooOoO0.getSize();
    }

    @Override // o00OooO.InterfaceC25145OooOo0o
    public final synchronized void recycle() {
        if (this.f85569OooOoo0 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f85568OooOoo) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f85568OooOoo = true;
        if (this.f85563OooOo) {
            this.f85566OooOoO0.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f85564OooOo0o + ", listener=" + this.f85565OooOoO + ", key=" + this.f85567OooOoOO + ", acquired=" + this.f85569OooOoo0 + ", isRecycled=" + this.f85568OooOoo + ", resource=" + this.f85566OooOoO0 + '}';
    }
}
