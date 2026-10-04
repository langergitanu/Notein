package o000OoOo;

import android.view.MotionEvent;
import java.util.Iterator;

/* JADX INFO: renamed from: o000OoOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24540OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MotionEvent.PointerCoords[] f82999OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f83000OooO0O0;

    /* JADX INFO: renamed from: o000OoOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C19626OooO00o implements Iterable<C24540OooO00o> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final MotionEvent f83001OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f83002OooOo0o;

        /* JADX INFO: renamed from: o000OoOo.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C19627OooO00o implements Iterator<C24540OooO00o> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f83004OooOo0o = 0;

            public C19627OooO00o() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f83004OooOo0o < C19626OooO00o.this.f83001OooOo.getHistorySize() + 1;
            }

            @Override // java.util.Iterator
            public final C24540OooO00o next() {
                C19626OooO00o c19626OooO00o = C19626OooO00o.this;
                int i = this.f83004OooOo0o;
                MotionEvent motionEvent = c19626OooO00o.f83001OooOo;
                if (i > motionEvent.getHistorySize()) {
                    return null;
                }
                int i2 = c19626OooO00o.f83002OooOo0o;
                C24540OooO00o c24540OooO00o = new C24540OooO00o(i2);
                int i3 = this.f83004OooOo0o;
                int historySize = motionEvent.getHistorySize();
                MotionEvent.PointerCoords[] pointerCoordsArr = c24540OooO00o.f82999OooO00o;
                int i4 = 0;
                if (i3 < historySize) {
                    while (i4 < i2) {
                        motionEvent.getHistoricalPointerCoords(i4, this.f83004OooOo0o, pointerCoordsArr[i4]);
                        i4++;
                    }
                    c24540OooO00o.f83000OooO0O0 = motionEvent.getHistoricalEventTime(this.f83004OooOo0o);
                } else {
                    while (i4 < i2) {
                        motionEvent.getPointerCoords(i4, pointerCoordsArr[i4]);
                        i4++;
                    }
                    c24540OooO00o.f83000OooO0O0 = motionEvent.getEventTime();
                }
                this.f83004OooOo0o++;
                return c24540OooO00o;
            }
        }

        public C19626OooO00o(MotionEvent motionEvent) {
            this.f83001OooOo = motionEvent;
            this.f83002OooOo0o = motionEvent.getPointerCount();
        }

        @Override // java.lang.Iterable
        public final Iterator<C24540OooO00o> iterator() {
            return new C19627OooO00o();
        }
    }

    public C24540OooO00o(int i) {
        this.f82999OooO00o = new MotionEvent.PointerCoords[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f82999OooO00o[i2] = new MotionEvent.PointerCoords();
        }
    }
}
