package o00o0oo;

import android.util.Pair;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import java.util.Map;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import o00o0o.AbstractC25434OooO00o;

/* JADX INFO: renamed from: o00o0oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25464OooO0OO<T> implements InterfaceC25467OooO0o0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Map<String, Object> f86768OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AbstractC25434OooO00o f86771OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Throwable f86773OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f86772OooO0o = 0.0f;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f86770OooO0OO = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f86769OooO0O0 = OooO00o.f86776OooOo0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ConcurrentLinkedQueue<Pair<InterfaceC25468OooO0oO<T>, Executor>> f86774OooO0oO = new ConcurrentLinkedQueue<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0oo.OooO0OO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f86775OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f86776OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f86777OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f86778OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("IN_PROGRESS", 0);
            f86776OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o(MaterialPurchaseStatusResponse.STATUS_SUCCESS, 1);
            f86775OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("FAILURE", 2);
            f86778OooOoO0 = oooO00o3;
            f86777OooOoO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f86777OooOoO.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean OooO() {
        boolean z;
        if (OooO0o()) {
            z = !OooO0OO();
        }
        return z;
    }

    @Override // o00o0oo.InterfaceC25467OooO0o0
    public final synchronized Throwable OooO00o() {
        return this.f86773OooO0o0;
    }

    @Override // o00o0oo.InterfaceC25467OooO0o0
    public final synchronized float OooO0O0() {
        return this.f86772OooO0o;
    }

    @Override // o00o0oo.InterfaceC25467OooO0o0
    public final synchronized boolean OooO0OO() {
        return this.f86769OooO0O0 != OooO00o.f86776OooOo0o;
    }

    @Override // o00o0oo.InterfaceC25467OooO0o0
    public final void OooO0Oo(InterfaceC25468OooO0oO interfaceC25468OooO0oO, AbstractExecutorService abstractExecutorService) {
        boolean z;
        abstractExecutorService.getClass();
        synchronized (this) {
            try {
                if (this.f86770OooO0OO) {
                    return;
                }
                if (this.f86769OooO0O0 == OooO00o.f86776OooOo0o) {
                    this.f86774OooO0oO.add(Pair.create(interfaceC25468OooO0oO, abstractExecutorService));
                }
                boolean z2 = hasResult() || OooO0OO() || OooO();
                if (z2) {
                    synchronized (this) {
                        z = this.f86769OooO0O0 == OooO00o.f86778OooOoO0;
                    }
                    abstractExecutorService.execute(new RunnableC25462OooO00o(this, z, interfaceC25468OooO0oO, OooO()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean OooO0o() {
        return this.f86770OooO0OO;
    }

    public void OooO0o0(T t) {
    }

    public final void OooO0oO() {
        boolean z;
        synchronized (this) {
            z = this.f86769OooO0O0 == OooO00o.f86778OooOoO0;
        }
        boolean zOooO = OooO();
        for (Pair<InterfaceC25468OooO0oO<T>, Executor> pair : this.f86774OooO0oO) {
            ((Executor) pair.second).execute(new RunnableC25462OooO00o(this, z, (InterfaceC25468OooO0oO) pair.first, zOooO));
        }
    }

    public final boolean OooO0oo(Throwable th, Map<String, Object> map) {
        boolean z;
        synchronized (this) {
            if (this.f86770OooO0OO || this.f86769OooO0O0 != OooO00o.f86776OooOo0o) {
                z = false;
            } else {
                this.f86769OooO0O0 = OooO00o.f86778OooOoO0;
                this.f86773OooO0o0 = th;
                this.f86768OooO00o = map;
                z = true;
            }
        }
        if (z) {
            OooO0oO();
        }
        return z;
    }

    @Override // o00o0oo.InterfaceC25467OooO0o0
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f86770OooO0OO) {
                    return false;
                }
                this.f86770OooO0OO = true;
                AbstractC25434OooO00o abstractC25434OooO00o = this.f86771OooO0Oo;
                this.f86771OooO0Oo = null;
                if (abstractC25434OooO00o != null) {
                    OooO0o0(abstractC25434OooO00o);
                }
                if (!OooO0OO()) {
                    OooO0oO();
                }
                synchronized (this) {
                    this.f86774OooO0oO.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o00o0oo.InterfaceC25467OooO0o0
    public final Map<String, Object> getExtras() {
        return this.f86768OooO00o;
    }

    @Override // o00o0oo.InterfaceC25467OooO0o0
    public synchronized T getResult() {
        return (T) this.f86771OooO0Oo;
    }

    @Override // o00o0oo.InterfaceC25467OooO0o0
    public synchronized boolean hasResult() {
        return this.f86771OooO0Oo != null;
    }
}
