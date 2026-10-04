package androidx.dynamicanimation.animation;

import OooOo.C20493Oooo00o;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ThreadLocal<OooO00o> f64656OooO0o = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C21853OooO0Oo f64660OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C20493Oooo00o<OooO0O0, Long> f64657OooO00o = new C20493Oooo00o<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<OooO0O0> f64658OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C19011OooO00o f64659OooO0OO = new C19011OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f64661OooO0o0 = false;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19011OooO00o {
        public C19011OooO00o() {
        }
    }

    public interface OooO0O0 {
        boolean OooO00o(long j);
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C19011OooO00o f64663OooO00o;

        public OooO0OO(C19011OooO00o c19011OooO00o) {
            this.f64663OooO00o = c19011OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static class C21853OooO0Oo extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Choreographer f64664OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ChoreographerFrameCallbackC19012OooO00o f64665OooO0OO;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC19012OooO00o implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC19012OooO00o() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                ArrayList<OooO0O0> arrayList;
                C19011OooO00o c19011OooO00o = C21853OooO0Oo.this.f64663OooO00o;
                c19011OooO00o.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                OooO00o oooO00o = OooO00o.this;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i = 0;
                while (true) {
                    arrayList = oooO00o.f64658OooO0O0;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    OooO0O0 oooO0O0 = arrayList.get(i);
                    if (oooO0O0 != null) {
                        C20493Oooo00o<OooO0O0, Long> c20493Oooo00o = oooO00o.f64657OooO00o;
                        Long l = c20493Oooo00o.get(oooO0O0);
                        if (l == null) {
                            oooO0O0.OooO00o(jUptimeMillis);
                        } else if (l.longValue() < jUptimeMillis2) {
                            c20493Oooo00o.remove(oooO0O0);
                            oooO0O0.OooO00o(jUptimeMillis);
                        }
                    }
                    i++;
                }
                if (oooO00o.f64661OooO0o0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    oooO00o.f64661OooO0o0 = false;
                }
                if (arrayList.size() > 0) {
                    if (oooO00o.f64660OooO0Oo == null) {
                        oooO00o.f64660OooO0Oo = new C21853OooO0Oo(oooO00o.f64659OooO0OO);
                    }
                    C21853OooO0Oo c21853OooO0Oo = oooO00o.f64660OooO0Oo;
                    c21853OooO0Oo.f64664OooO0O0.postFrameCallback(c21853OooO0Oo.f64665OooO0OO);
                }
            }
        }

        public C21853OooO0Oo(C19011OooO00o c19011OooO00o) {
            super(c19011OooO00o);
            this.f64664OooO0O0 = Choreographer.getInstance();
            this.f64665OooO0OO = new ChoreographerFrameCallbackC19012OooO00o();
        }
    }
}
