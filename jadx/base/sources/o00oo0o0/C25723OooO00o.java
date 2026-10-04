package o00oo0o0;

import OooOoo0.OooOo00;
import android.util.Pair;
import com.facebook.imagepipeline.producers.C22298Ooooo00;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOOO0;
import o00o0o.AbstractC25434OooO00o;
import o00o0oo.AbstractC25464OooO0OO;
import o00o0oo.InterfaceC25468OooO0oO;
import o00o0oo.RunnableC25463OooO0O0;

/* JADX INFO: renamed from: o00oo0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25723OooO00o extends com.facebook.imagepipeline.producers.OooO0O0<Object> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C25724OooO0O0 f87805OooO0O0;

    public C25723OooO00o(C25724OooO0O0 c25724OooO0O0) {
        this.f87805OooO0O0 = c25724OooO0O0;
    }

    @Override // com.facebook.imagepipeline.producers.OooO0O0
    public final void OooO(float f) {
        boolean z;
        C25724OooO0O0 c25724OooO0O0 = this.f87805OooO0O0;
        synchronized (c25724OooO0O0) {
            z = false;
            if (!c25724OooO0O0.f86770OooO0OO && c25724OooO0O0.f86769OooO0O0 == AbstractC25464OooO0OO.OooO00o.f86776OooOo0o && f >= c25724OooO0O0.f86772OooO0o) {
                c25724OooO0O0.f86772OooO0o = f;
                z = true;
            }
        }
        if (z) {
            Iterator it = c25724OooO0O0.f86774OooO0oO.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((Executor) pair.second).execute(new RunnableC25463OooO0O0(c25724OooO0O0, (InterfaceC25468OooO0oO) pair.first));
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.OooO0O0
    public final void OooO0o() {
        C25724OooO0O0 c25724OooO0O0 = this.f87805OooO0O0;
        synchronized (c25724OooO0O0) {
            OooOo00.OooO0o(c25724OooO0O0.OooO0o());
        }
    }

    @Override // com.facebook.imagepipeline.producers.OooO0O0
    public final void OooO0oO(Throwable throwable) {
        OooOOO0.OooO0oO(throwable, "throwable");
        C25724OooO0O0 c25724OooO0O0 = this.f87805OooO0O0;
        C22298Ooooo00 producerContext = c25724OooO0O0.f87807OooO0oo;
        OooOOO0.OooO0oO(producerContext, "producerContext");
        if (c25724OooO0O0.OooO0oo(throwable, producerContext.getExtras())) {
            c25724OooO0O0.f87806OooO.OooO0oo(producerContext, throwable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r6 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r0.OooO0o0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r6 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066  */
    @Override // com.facebook.imagepipeline.producers.OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0oo(int i, Object obj) throws Throwable {
        boolean z;
        C25724OooO0O0 c25724OooO0O0 = this.f87805OooO0O0;
        C22298Ooooo00 producerContext = c25724OooO0O0.f87807OooO0oo;
        AbstractC25434OooO00o abstractC25434OooO00oOooOOO0 = AbstractC25434OooO00o.OooOOO0((AbstractC25434OooO00o) obj);
        OooOOO0.OooO0oO(producerContext, "producerContext");
        boolean zOooO0Oo = com.facebook.imagepipeline.producers.OooO0O0.OooO0Oo(i);
        c25724OooO0O0.f86768OooO00o = producerContext.f67290OooOoo0;
        AbstractC25434OooO00o abstractC25434OooO00o = null;
        try {
            try {
                synchronized (c25724OooO0O0) {
                    try {
                        if (!c25724OooO0O0.f86770OooO0OO && c25724OooO0O0.f86769OooO0O0 == AbstractC25464OooO0OO.OooO00o.f86776OooOo0o) {
                            if (zOooO0Oo) {
                                c25724OooO0O0.f86769OooO0O0 = AbstractC25464OooO0OO.OooO00o.f86775OooOo;
                                c25724OooO0O0.f86772OooO0o = 1.0f;
                            }
                            AbstractC25434OooO00o abstractC25434OooO00o2 = c25724OooO0O0.f86771OooO0Oo;
                            if (abstractC25434OooO00o2 != abstractC25434OooO00oOooOOO0) {
                                try {
                                    c25724OooO0O0.f86771OooO0Oo = abstractC25434OooO00oOooOOO0;
                                    abstractC25434OooO00oOooOOO0 = abstractC25434OooO00o2;
                                } catch (Throwable th) {
                                    th = th;
                                    abstractC25434OooO00oOooOOO0 = abstractC25434OooO00o2;
                                }
                            } else {
                                abstractC25434OooO00oOooOOO0 = null;
                            }
                        }
                        if (z) {
                            c25724OooO0O0.OooO0oO();
                        }
                        if (z && zOooO0Oo) {
                            c25724OooO0O0.f87806OooO.OooO0o(c25724OooO0O0.f87807OooO0oo);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC25434OooO00oOooOOO0 = null;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (abstractC25434OooO00o != null) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            throw th;
        } catch (Throwable th5) {
            th = th5;
            abstractC25434OooO00o = abstractC25434OooO00oOooOOO0;
            if (abstractC25434OooO00o != null) {
                c25724OooO0O0.OooO0o0(abstractC25434OooO00o);
            }
            throw th;
        }
    }
}
