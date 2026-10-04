package oO000Oo;

import com.google.common.base.Preconditions;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: oO000Oo.o0000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32044o0000o0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C32044o0000o0 f114555OooO0Oo = new C32044o0000o0(new OooO00o());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final IdentityHashMap<OooO0OO<?>, OooO0O0> f114556OooO00o = new IdentityHashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f114557OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ScheduledExecutorService f114558OooO0OO;

    /* JADX INFO: renamed from: oO000Oo.o0000o0$OooO00o */
    public class OooO00o {
    }

    /* JADX INFO: renamed from: oO000Oo.o0000o0$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f114559OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f114560OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ScheduledFuture<?> f114561OooO0OO;

        public OooO0O0(Object obj) {
            this.f114559OooO00o = obj;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000o0$OooO0OO */
    public interface OooO0OO<T> {
        void OooO0O0(T t);

        T create();
    }

    public C32044o0000o0(OooO00o oooO00o) {
        this.f114557OooO0O0 = oooO00o;
    }

    public static <T> T OooO00o(OooO0OO<T> oooO0OO) {
        T t;
        C32044o0000o0 c32044o0000o0 = f114555OooO0Oo;
        synchronized (c32044o0000o0) {
            try {
                OooO0O0 oooO0O0 = c32044o0000o0.f114556OooO00o.get(oooO0OO);
                if (oooO0O0 == null) {
                    oooO0O0 = new OooO0O0(oooO0OO.create());
                    c32044o0000o0.f114556OooO00o.put(oooO0OO, oooO0O0);
                }
                ScheduledFuture<?> scheduledFuture = oooO0O0.f114561OooO0OO;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    oooO0O0.f114561OooO0OO = null;
                }
                oooO0O0.f114560OooO0O0++;
                t = (T) oooO0O0.f114559OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public static void OooO0O0(OooO0OO oooO0OO, Object obj) {
        C32044o0000o0 c32044o0000o0 = f114555OooO0Oo;
        synchronized (c32044o0000o0) {
            try {
                OooO0O0 oooO0O0 = c32044o0000o0.f114556OooO00o.get(oooO0OO);
                if (oooO0O0 == null) {
                    throw new IllegalArgumentException("No cached instance found for " + oooO0OO);
                }
                Preconditions.checkArgument(obj == oooO0O0.f114559OooO00o, "Releasing the wrong instance");
                Preconditions.checkState(oooO0O0.f114560OooO0O0 > 0, "Refcount has already reached zero");
                int i = oooO0O0.f114560OooO0O0 - 1;
                oooO0O0.f114560OooO0O0 = i;
                if (i == 0) {
                    Preconditions.checkState(oooO0O0.f114561OooO0OO == null, "Destroy task already scheduled");
                    if (c32044o0000o0.f114558OooO0OO == null) {
                        c32044o0000o0.f114557OooO0O0.getClass();
                        c32044o0000o0.f114558OooO0OO = Executors.newSingleThreadScheduledExecutor(C31989OoooO0O.OooO0o0("grpc-shared-destroyer-%d"));
                    }
                    oooO0O0.f114561OooO0OO = c32044o0000o0.f114558OooO0OO.schedule(new o00O0O(new RunnableC32045o0000o0O(c32044o0000o0, oooO0O0, oooO0OO, obj)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
