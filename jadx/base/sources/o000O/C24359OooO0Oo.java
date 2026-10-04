package o000O;

import android.os.Build;
import android.util.Log;
import android.view.MotionEvent;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o000O.OooO00o;
import o000O0oO.C24410OooO0Oo;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: renamed from: o000O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24359OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34426OooOO0o<OooO00o> f82161OooO00o = new C34426OooOO0o<>(100);

    public C24359OooO0Oo() {
        for (int i = 0; i < 100; i++) {
            OooO00o oooO00o = new OooO00o();
            oooO00o.OooO00o();
            this.f82161OooO00o.addLast(oooO00o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OooO00o OooO0OO(C24359OooO0Oo c24359OooO0Oo, MotionEvent motionEvent, OooO00o.C24358OooO0Oo c24358OooO0Oo, C24410OooO0Oo c24410OooO0Oo, long j) {
        OooO00o.OooO0O0 oooO0O0;
        c24359OooO0Oo.getClass();
        OooO00o OooO00o2 = c24359OooO0Oo.OooO00o();
        if (c24410OooO0Oo != null) {
            OooO00o2.f82141OooO0OO = c24410OooO0Oo;
        }
        OooO00o2.f82140OooO0O0 = c24358OooO0Oo;
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                oooO0O0 = OooO00o.OooO0O0.f82149OooO0O0;
                OooO00o2.f82139OooO00o = oooO0O0;
                int historySize = motionEvent.getHistorySize();
                OooO00o2.f82142OooO0Oo = historySize + 1;
                OooO00o2.f82144OooO0o0 = historySize;
                OooO00o2.f82143OooO0o = Build.VERSION.SDK_INT >= 34 ? motionEvent.getEventTimeNanos() : motionEvent.getEventTime() * 1000000;
            } else if (actionMasked == 1) {
                oooO0O0 = OooO00o.OooO0O0.f82153OooO0o0;
                OooO00o2.f82139OooO00o = oooO0O0;
                int historySize2 = motionEvent.getHistorySize();
                OooO00o2.f82142OooO0Oo = historySize2 + 1;
                OooO00o2.f82144OooO0o0 = historySize2;
                OooO00o2.f82143OooO0o = Build.VERSION.SDK_INT >= 34 ? motionEvent.getEventTimeNanos() : motionEvent.getEventTime() * 1000000;
            } else {
                if (actionMasked == 2) {
                    oooO0O0 = OooO00o.OooO0O0.f82150OooO0OO;
                } else if (actionMasked == 3) {
                    oooO0O0 = OooO00o.OooO0O0.f82152OooO0o;
                } else if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        oooO0O0 = OooO00o.OooO0O0.f82148OooO00o;
                        Log.e("LatencyData.EventAction", "Unknown MotionEvent.actionMasked " + motionEvent.getActionMasked());
                    }
                }
                OooO00o2.f82139OooO00o = oooO0O0;
                int historySize22 = motionEvent.getHistorySize();
                OooO00o2.f82142OooO0Oo = historySize22 + 1;
                OooO00o2.f82144OooO0o0 = historySize22;
                OooO00o2.f82143OooO0o = Build.VERSION.SDK_INT >= 34 ? motionEvent.getEventTimeNanos() : motionEvent.getEventTime() * 1000000;
            }
        }
        OooO00o2.f82145OooO0oO = j;
        return OooO00o2;
    }

    public final OooO00o OooO00o() {
        C34426OooOO0o<OooO00o> c34426OooOO0o = this.f82161OooO00o;
        OooO00o oooO00oRemoveFirst = c34426OooOO0o.isEmpty() ? null : c34426OooOO0o.removeFirst();
        if (oooO00oRemoveFirst != null) {
            return oooO00oRemoveFirst;
        }
        OooO00o oooO00o = new OooO00o();
        Log.w(C24035Oooo00o.f80943OooO00o.OooO0O0(C24359OooO0Oo.class).OooOO0(), "Pool is empty; allocating a LatencyData. You should have preallocated more instances.");
        return oooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(MotionEvent event, OooO00o.C24358OooO0Oo c24358OooO0Oo, C24410OooO0Oo inProgressStrokeId, long j, boolean z, C34426OooOO0o datas) {
        OooO00o.OooO0O0 oooO0O0;
        long historicalEventTime;
        long historicalEventTimeNanos;
        OooOOO0.OooO0oO(event, "event");
        OooOOO0.OooO0oO(inProgressStrokeId, "inProgressStrokeId");
        OooOOO0.OooO0oO(datas, "datas");
        datas.clear();
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            oooO0O0 = OooO00o.OooO0O0.f82149OooO0O0;
        } else if (actionMasked == 1) {
            oooO0O0 = OooO00o.OooO0O0.f82153OooO0o0;
        } else if (actionMasked == 2) {
            oooO0O0 = z ? OooO00o.OooO0O0.f82151OooO0Oo : OooO00o.OooO0O0.f82150OooO0OO;
        } else if (actionMasked == 3) {
            oooO0O0 = OooO00o.OooO0O0.f82152OooO0o;
        } else if (actionMasked != 5) {
            if (actionMasked != 6) {
                oooO0O0 = OooO00o.OooO0O0.f82148OooO00o;
                Log.e("LatencyData.EventAction", "Unknown MotionEvent.actionMasked " + event.getActionMasked());
            }
        }
        int historySize = event.getHistorySize();
        if (historySize < 0) {
            return;
        }
        int i = 0;
        while (true) {
            OooO00o OooO00o2 = OooO00o();
            OooO00o2.f82141OooO0OO = inProgressStrokeId;
            OooO00o2.f82140OooO0O0 = c24358OooO0Oo;
            OooO00o2.f82139OooO00o = oooO0O0;
            OooO00o2.f82142OooO0Oo = historySize + 1;
            OooO00o2.f82144OooO0o0 = i;
            if (i == event.getHistorySize()) {
                if (Build.VERSION.SDK_INT >= 34) {
                    historicalEventTimeNanos = event.getEventTimeNanos();
                } else {
                    historicalEventTime = event.getEventTime();
                    historicalEventTimeNanos = historicalEventTime * 1000000;
                }
            } else if (Build.VERSION.SDK_INT >= 34) {
                historicalEventTimeNanos = event.getHistoricalEventTimeNanos(i);
            } else {
                historicalEventTime = event.getHistoricalEventTime(i);
                historicalEventTimeNanos = historicalEventTime * 1000000;
            }
            OooO00o2.f82143OooO0o = historicalEventTimeNanos;
            OooO00o2.f82145OooO0oO = j;
            datas.addLast(OooO00o2);
            if (i == historySize) {
                return;
            } else {
                i++;
            }
        }
    }
}
