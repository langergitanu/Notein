package o00Ooo;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooOo00> f85127OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f85128OooO0O0;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OooOOO0(List<OooOo00> list, C25078OooO0oO c25078OooO0oO) {
        this.f85127OooO00o = list;
        MotionEvent motionEvent = c25078OooO0oO != null ? (MotionEvent) c25078OooO0oO.f85109OooO0O0.f85156OooO0O0 : null;
        int i = 0;
        if (motionEvent != null) {
            motionEvent.getButtonState();
        }
        MotionEvent motionEvent2 = c25078OooO0oO != null ? (MotionEvent) c25078OooO0oO.f85109OooO0O0.f85156OooO0O0 : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = c25078OooO0oO != null ? (MotionEvent) c25078OooO0oO.f85109OooO0O0.f85156OooO0O0 : null;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked == 0) {
                i = 1;
            } else if (actionMasked == 1) {
                i = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 7:
                        i = 3;
                        break;
                    case 8:
                        i = 6;
                        break;
                    case 9:
                        i = 4;
                        break;
                    case 10:
                        i = 5;
                        break;
                }
            }
        } else {
            int size = list.size();
            while (i < size) {
                OooOo00 oooOo00 = list.get(i);
                if (OooOOO.OooO0O0(oooOo00)) {
                    i = 2;
                } else if (OooOOO.OooO00o(oooOo00)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.f85128OooO0O0 = i;
    }
}
