package o00oOOo0;

import android.graphics.Bitmap;
import android.util.SparseArray;
import kotlin.jvm.internal.OooOOO0;
import o00o0Oo.InterfaceExecutorServiceC25418OooO0o0;
import o00o0o.AbstractC25434OooO00o;
import o00o0o00.C25438OooO00o;
import o00oOOOO.C25585OooO00o;
import o00oOOOO.InterfaceC25586OooO0O0;
import o00oOooO.C25631OooO00o;
import o00oo0OO.AbstractC25682OooO0O0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o00oOOo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25593OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC25682OooO0O0 f87297OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25631OooO00o f87298OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Bitmap.Config f87299OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceExecutorServiceC25418OooO0o0 f87300OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SparseArray<Runnable> f87301OooO0o0;

    /* JADX INFO: renamed from: o00oOOo0.OooO0O0$OooO00o */
    public final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC25586OooO0O0 f87302OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C25585OooO00o f87303OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final int f87304OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f87305OooOoO0;

        public OooO00o(C25585OooO00o c25585OooO00o, InterfaceC25586OooO0O0 interfaceC25586OooO0O0, int i, int i2) {
            this.f87303OooOo0o = c25585OooO00o;
            this.f87302OooOo = interfaceC25586OooO0O0;
            this.f87305OooOoO0 = i;
            this.f87304OooOoO = i2;
        }

        public final boolean OooO00o(int i, int i2) {
            AbstractC25434OooO00o abstractC25434OooO00oOooO0O0;
            C25593OooO0O0 c25593OooO0O0 = C25593OooO0O0.this;
            C25585OooO00o c25585OooO00o = this.f87303OooOo0o;
            int i3 = 2;
            try {
                if (i2 == 1) {
                    abstractC25434OooO00oOooO0O0 = this.f87302OooOo.OooO0O0();
                } else {
                    if (i2 != 2) {
                        return false;
                    }
                    try {
                        abstractC25434OooO00oOooO0O0 = c25593OooO0O0.f87297OooO00o.OooO00o(c25585OooO00o.f87283OooOO0o, c25585OooO00o.f87284OooOOO0, c25593OooO0O0.f87299OooO0OO);
                        i3 = -1;
                    } catch (RuntimeException e) {
                        c25593OooO0O0.getClass();
                        C25438OooO00o.OooO0oO(C25593OooO0O0.class, "Failed to create frame bitmap", e);
                        return false;
                    }
                }
                AbstractC25434OooO00o abstractC25434OooO00o = abstractC25434OooO00oOooO0O0;
                boolean zOooO0O0 = OooO0O0(i, abstractC25434OooO00o, i2);
                AbstractC25434OooO00o.OooOooo(abstractC25434OooO00o);
                return (zOooO0O0 || i3 == -1) ? zOooO0O0 : OooO00o(i, i3);
            } catch (Throwable th) {
                AbstractC25434OooO00o.OooOooo(null);
                throw th;
            }
        }

        public final boolean OooO0O0(int i, AbstractC25434OooO00o<Bitmap> abstractC25434OooO00o, int i2) {
            if (!AbstractC25434OooO00o.ooOO(abstractC25434OooO00o) || abstractC25434OooO00o == null || !C25593OooO0O0.this.f87298OooO0O0.OooO00o(i, abstractC25434OooO00o.Oooo000())) {
                return false;
            }
            C25593OooO0O0.this.getClass();
            C25438OooO00o.OooO0Oo(C25593OooO0O0.class, Integer.valueOf(i), "Frame %d ready.");
            synchronized (C25593OooO0O0.this.f87301OooO0o0) {
                this.f87302OooOo.OooO0o0(i, abstractC25434OooO00o);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (this.f87302OooOo.OooO0Oo(this.f87305OooOoO0)) {
                    C25593OooO0O0.this.getClass();
                    C25438OooO00o.OooO0Oo(C25593OooO0O0.class, Integer.valueOf(this.f87305OooOoO0), "Frame %d is cached already.");
                    C25593OooO0O0 c25593OooO0O0 = C25593OooO0O0.this;
                    synchronized (c25593OooO0O0.f87301OooO0o0) {
                        c25593OooO0O0.f87301OooO0o0.remove(this.f87304OooOoO);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                    return;
                }
                if (OooO00o(this.f87305OooOoO0, 1)) {
                    C25593OooO0O0.this.getClass();
                    C25438OooO00o.OooO0Oo(C25593OooO0O0.class, Integer.valueOf(this.f87305OooOoO0), "Prepared frame %d.");
                } else {
                    C25593OooO0O0.this.getClass();
                    C25438OooO00o.OooO0O0(C25593OooO0O0.class, "Could not prepare frame %d.", Integer.valueOf(this.f87305OooOoO0));
                }
                C25593OooO0O0 c25593OooO0O02 = C25593OooO0O0.this;
                synchronized (c25593OooO0O02.f87301OooO0o0) {
                    c25593OooO0O02.f87301OooO0o0.remove(this.f87304OooOoO);
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                }
            } catch (Throwable th) {
                C25593OooO0O0 c25593OooO0O03 = C25593OooO0O0.this;
                synchronized (c25593OooO0O03.f87301OooO0o0) {
                    c25593OooO0O03.f87301OooO0o0.remove(this.f87304OooOoO);
                    C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                    throw th;
                }
            }
        }
    }

    public C25593OooO0O0(AbstractC25682OooO0O0 platformBitmapFactory, C25631OooO00o c25631OooO00o, Bitmap.Config bitmapConfig, InterfaceExecutorServiceC25418OooO0o0 executorService) {
        OooOOO0.OooO0oO(platformBitmapFactory, "platformBitmapFactory");
        OooOOO0.OooO0oO(bitmapConfig, "bitmapConfig");
        OooOOO0.OooO0oO(executorService, "executorService");
        this.f87297OooO00o = platformBitmapFactory;
        this.f87298OooO0O0 = c25631OooO00o;
        this.f87299OooO0OO = bitmapConfig;
        this.f87300OooO0Oo = executorService;
        this.f87301OooO0o0 = new SparseArray<>();
    }
}
