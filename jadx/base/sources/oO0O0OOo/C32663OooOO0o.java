package oO0O0OOo;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.InterfaceC33611OooOO0O;

/* JADX INFO: renamed from: oO0O0OOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32663OooOO0o implements OooOO0O {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f117374OooOoO = AtomicIntegerFieldUpdater.newUpdater(C32663OooOO0o.class, "_interestedOps");

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final SocketChannel f117376OooOo0o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AtomicBoolean f117375OooOo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C32659OooO0oO f117377OooOoO0 = new C32659OooO0oO();
    private volatile /* synthetic */ int _interestedOps = 0;

    public C32663OooOO0o(SocketChannel socketChannel) {
        this.f117376OooOo0o = socketChannel;
    }

    @Override // oO0O0OOo.OooOO0O
    public final void Oooo00O(OooOO0 oooOO02, boolean z) {
        int i;
        int i2 = oooOO02.f117373OooOo0o;
        do {
            i = this._interestedOps;
        } while (!f117374OooOoO.compareAndSet(this, i, z ? i | i2 : (~i2) & i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f117375OooOo.compareAndSet(false, true)) {
            this._interestedOps = 0;
            C32659OooO0oO c32659OooO0oO = this.f117377OooOoO0;
            for (OooOO0 interest : OooOO0.f117367OooOo) {
                c32659OooO0oO.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(interest, "interest");
                InterfaceC33611OooOO0O<C32460OooOooO> andSet = C32659OooO0oO.f117361OooO00o[interest.ordinal()].getAndSet(c32659OooO0oO, null);
                if (andSet != null) {
                    andSet.resumeWith(C32446OooOOOo.OooO00o(new C32657OooO0o("Closed channel.")));
                }
            }
        }
    }

    public void dispose() {
        close();
    }

    @Override // oO0O0OOo.OooOO0O
    public SelectableChannel getChannel() {
        return this.f117376OooOo0o;
    }

    @Override // oO0O0OOo.OooOO0O
    public final boolean isClosed() {
        return this.f117375OooOo.get();
    }

    @Override // oO0O0OOo.OooOO0O
    public final int o00000o0() {
        return this._interestedOps;
    }

    @Override // oO0O0OOo.OooOO0O
    public final C32659OooO0oO o000OOo() {
        return this.f117377OooOoO0;
    }
}
