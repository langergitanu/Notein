package androidx.emoji2.text;

import android.content.Context;
import androidx.core.os.TraceCompat;
import androidx.emoji2.text.C21867OooO0Oo;
import androidx.emoji2.text.C21868OooO0o0;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.OooO0OO;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o000O000.C24380OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements o00O0000.OooO0O0<Boolean> {

    public static class OooO00o extends OooO0OO.AbstractC19015OooO0OO {
    }

    public static class OooO0O0 implements OooO0OO.InterfaceC21865OooO0oO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f64703OooO00o;

        public OooO0O0(Context context) {
            this.f64703OooO00o = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.OooO0OO.InterfaceC21865OooO0oO
        public final void OooO00o(final OooO0OO.AbstractC21866OooO0oo abstractC21866OooO0oo) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new o000O000.OooO00o("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: o000O000.OooO0o
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.OooO0O0 oooO0O0 = this.f82256OooOo0o;
                    OooO0OO.AbstractC21866OooO0oo abstractC21866OooO0oo2 = abstractC21866OooO0oo;
                    ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                    oooO0O0.getClass();
                    try {
                        C21868OooO0o0 c21868OooO0o0OooO00o = androidx.emoji2.text.OooO00o.OooO00o(oooO0O0.f64703OooO00o);
                        if (c21868OooO0o0OooO00o == null) {
                            throw new RuntimeException("EmojiCompat font provider not available on this device.");
                        }
                        C21868OooO0o0.OooO0O0 oooO0O02 = (C21868OooO0o0.OooO0O0) c21868OooO0o0OooO00o.f64719OooO00o;
                        synchronized (oooO0O02.f64730OooO0Oo) {
                            oooO0O02.f64731OooO0o = threadPoolExecutor2;
                        }
                        c21868OooO0o0OooO00o.f64719OooO00o.OooO00o(new C21867OooO0Oo(abstractC21866OooO0oo2, threadPoolExecutor2));
                    } catch (Throwable th) {
                        abstractC21866OooO0oo2.OooO00o(th);
                        threadPoolExecutor2.shutdown();
                    }
                }
            });
        }
    }

    public static class OooO0OO implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                TraceCompat.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.OooO0OO.OooO0OO()) {
                    androidx.emoji2.text.OooO0OO.OooO00o().OooO0Oo();
                }
            } finally {
                TraceCompat.endSection();
            }
        }
    }

    @Override // o00O0000.OooO0O0
    public final Boolean OooO00o(Context context) {
        Object objOooO0O0;
        OooO00o oooO00o = new OooO00o(new OooO0O0(context));
        oooO00o.f64720OooO0O0 = 1;
        if (androidx.emoji2.text.OooO0OO.f64706OooOO0O == null) {
            synchronized (androidx.emoji2.text.OooO0OO.f64705OooOO0) {
                try {
                    if (androidx.emoji2.text.OooO0OO.f64706OooOO0O == null) {
                        androidx.emoji2.text.OooO0OO.f64706OooOO0O = new androidx.emoji2.text.OooO0OO(oooO00o);
                    }
                } finally {
                }
            }
        }
        o00O0000.OooO00o oooO00oOooO0OO = o00O0000.OooO00o.OooO0OO(context);
        oooO00oOooO0OO.getClass();
        synchronized (o00O0000.OooO00o.f84072OooO0o0) {
            try {
                objOooO0O0 = oooO00oOooO0OO.f84073OooO00o.get(ProcessLifecycleInitializer.class);
                if (objOooO0O0 == null) {
                    objOooO0O0 = oooO00oOooO0OO.OooO0O0(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC21979OooOOo0 lifecycle = ((InterfaceC21987OooOoo) objOooO0O0).getLifecycle();
        lifecycle.OooO00o(new C24380OooO0o0(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // o00O0000.OooO0O0
    public final List<Class<? extends o00O0000.OooO0O0<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
