package o0O0o00;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: o0O0o00.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25935OooOoo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f88550OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25908OooO f88551OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f88552OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f88554OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f88555OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f88556OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f88557OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f88558OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f88559OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f88560OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f88561OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public MotionEvent f88562OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public MotionEvent f88563OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public MotionEvent f88564OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public MotionEvent f88565OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f88566OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f88567OooOOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final int f88549OooOo00 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final int f88548OooOo0 = ViewConfiguration.getDoubleTapTimeout();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f88553OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final boolean f88568OooOOoo = true;

    /* JADX INFO: renamed from: o0O0o00.OooOoo$OooO00o */
    public class OooO00o extends Handler {
        public OooO00o() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                C25935OooOoo c25935OooOoo = C25935OooOoo.this;
                if (i == 2) {
                    c25935OooOoo.f88553OooO0OO.removeMessages(3);
                    c25935OooOoo.f88558OooO0oo = false;
                    c25935OooOoo.f88550OooO = true;
                    c25935OooOoo.f88551OooO00o.getClass();
                    return;
                }
                if (i != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                OooO0O0 oooO0O0 = c25935OooOoo.f88552OooO0O0;
                if (oooO0O0 != null) {
                    if (c25935OooOoo.f88557OooO0oO) {
                        c25935OooOoo.f88558OooO0oo = true;
                    } else {
                        oooO0O0.OooO00o(c25935OooOoo.f88565OooOOOo);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o0O0o00.OooOoo$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: o0O0o00.OooOoo$OooO0OO */
    public static class OooO0OO implements OooO0O0 {
    }

    public C25935OooOoo(Context context, C25908OooO c25908OooO) {
        int scaledDoubleTapSlop;
        int touchSlop;
        this.f88551OooO00o = c25908OooO;
        this.f88552OooO0O0 = c25908OooO;
        if (context == null) {
            touchSlop = ViewConfiguration.getTouchSlop();
            scaledDoubleTapSlop = 100;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            touchSlop = scaledTouchSlop;
        }
        int i = touchSlop * touchSlop;
        this.f88554OooO0Oo = i;
        this.f88556OooO0o0 = i;
        this.f88555OooO0o = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }

    public final void OooO00o(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2;
        int action = motionEvent.getAction();
        MotionEvent motionEvent3 = this.f88562OooOOO;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
        }
        this.f88562OooOOO = MotionEvent.obtain(motionEvent);
        int i = action & 255;
        boolean z = i == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        boolean z2 = (motionEvent.getFlags() & 8) != 0;
        int pointerCount = motionEvent.getPointerCount();
        float f2 = 0.0f;
        float y = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (actionIndex != i2) {
                float x = motionEvent.getX(i2) + f2;
                y = motionEvent.getY(i2) + y;
                f2 = x;
            }
        }
        if (z) {
            pointerCount--;
        }
        float f3 = pointerCount;
        float f4 = f2 / f3;
        float f5 = y / f3;
        OooO0O0 oooO0O0 = this.f88552OooO0O0;
        OooO00o oooO00o = this.f88553OooO0OO;
        if (i == 0) {
            MotionEvent motionEvent4 = this.f88565OooOOOo;
            if (motionEvent4 != null) {
                motionEvent4.recycle();
            }
            this.f88565OooOOOo = MotionEvent.obtain(motionEvent);
            if (oooO0O0 != null) {
                boolean zHasMessages = oooO00o.hasMessages(3);
                if (zHasMessages) {
                    oooO00o.removeMessages(3);
                }
                MotionEvent motionEvent5 = this.f88563OooOOO0;
                int i3 = f88548OooOo0;
                if (motionEvent5 == null || (motionEvent2 = this.f88564OooOOOO) == null || !zHasMessages || !this.f88560OooOO0O) {
                    f = f4;
                } else {
                    long eventTime = motionEvent.getEventTime() - motionEvent2.getEventTime();
                    f = f4;
                    if (eventTime <= i3 && eventTime >= 40) {
                        int x2 = ((int) motionEvent5.getX()) - ((int) motionEvent.getX());
                        int y2 = ((int) motionEvent5.getY()) - ((int) motionEvent.getY());
                        if ((y2 * y2) + (x2 * x2) < ((motionEvent5.getFlags() & 8) != 0 ? 0 : this.f88555OooO0o)) {
                            this.f88561OooOO0o = true;
                        }
                    }
                }
                oooO00o.sendEmptyMessageDelayed(3, i3);
            } else {
                f = f4;
            }
            this.f88567OooOOo0 = f;
            this.f88566OooOOo = f5;
            MotionEvent motionEvent6 = this.f88563OooOOO0;
            if (motionEvent6 != null) {
                motionEvent6.recycle();
            }
            this.f88563OooOOO0 = MotionEvent.obtain(motionEvent);
            this.f88559OooOO0 = true;
            this.f88560OooOO0O = true;
            this.f88557OooO0oO = true;
            this.f88550OooO = false;
            this.f88558OooO0oo = false;
            if (this.f88568OooOOoo) {
                oooO00o.removeMessages(2);
                oooO00o.sendMessageAtTime(oooO00o.obtainMessage(2), this.f88563OooOOO0.getDownTime() + ((long) ViewConfiguration.getLongPressTimeout()));
            }
            oooO00o.sendEmptyMessageAtTime(1, this.f88563OooOOO0.getDownTime() + ((long) f88549OooOo00));
            return;
        }
        C25908OooO c25908OooO = this.f88551OooO00o;
        if (i == 1) {
            this.f88557OooO0oO = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            if (!this.f88561OooOO0o && this.f88559OooOO0) {
                c25908OooO.getClass();
                if (this.f88558OooO0oo && oooO0O0 != null) {
                    oooO0O0.OooO00o(motionEvent);
                }
            }
            MotionEvent motionEvent7 = this.f88564OooOOOO;
            if (motionEvent7 != null) {
                motionEvent7.recycle();
            }
            this.f88564OooOOOO = motionEventObtain;
            this.f88561OooOO0o = false;
            this.f88558OooO0oo = false;
            oooO00o.removeMessages(1);
            oooO00o.removeMessages(2);
            return;
        }
        if (i == 2) {
            if (this.f88550OooO || this.f88561OooOO0o || !this.f88559OooOO0) {
                return;
            }
            int i4 = (int) (f4 - this.f88567OooOOo0);
            int i5 = (int) (f5 - this.f88566OooOOo);
            int i6 = (i5 * i5) + (i4 * i4);
            if (i6 > (z2 ? 0 : this.f88554OooO0Oo)) {
                this.f88559OooOO0 = false;
                oooO00o.removeMessages(3);
                oooO00o.removeMessages(1);
                oooO00o.removeMessages(2);
            }
            if (i6 > (z2 ? 0 : this.f88556OooO0o0)) {
                this.f88560OooOO0O = false;
                return;
            }
            return;
        }
        if (i != 3) {
            if (i != 5) {
                if (i != 6) {
                    return;
                }
                this.f88567OooOOo0 = f4;
                this.f88566OooOOo = f5;
                return;
            }
            this.f88567OooOOo0 = f4;
            this.f88566OooOOo = f5;
            MotionEvent motionEvent8 = this.f88565OooOOOo;
            if (motionEvent8 != null) {
                motionEvent8.recycle();
            }
            this.f88565OooOOOo = MotionEvent.obtain(motionEvent);
            return;
        }
        if (motionEvent.getPointerCount() >= 3) {
            String upperCase = Build.BRAND.toUpperCase();
            if ((upperCase.contains("XIAOMI") || upperCase.contains("VIVO") || upperCase.contains("OPPO")) && !this.f88561OooOO0o && this.f88559OooOO0) {
                Log.i("MultiTouchGestureDetector", "Special brand device may trigger three-finger gesture. deviceBrand: " + upperCase + ", ev: " + motionEvent);
                c25908OooO.getClass();
                if (motionEvent.getEventTime() - motionEvent.getDownTime() < 100 && oooO0O0 != null) {
                    oooO0O0.OooO00o(motionEvent);
                }
            }
        }
        oooO00o.removeMessages(1);
        oooO00o.removeMessages(2);
        oooO00o.removeMessages(3);
        this.f88561OooOO0o = false;
        this.f88557OooO0oO = false;
        this.f88559OooOO0 = false;
        this.f88560OooOO0O = false;
        this.f88558OooO0oo = false;
        this.f88550OooO = false;
    }
}
