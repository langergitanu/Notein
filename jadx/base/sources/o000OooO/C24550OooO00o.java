package o000OooO;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.MotionPredictor;
import java.util.concurrent.TimeUnit;
import o000O00.OooOO0;
import o000Oo.InterfaceC24508OooO00o;
import o000OoOO.C24538OooO0O0;
import o000OoOo.C24543OooO0Oo;

/* JADX INFO: renamed from: o000OooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24550OooO00o implements InterfaceC24508OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MotionPredictor f83124OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24538OooO0O0 f83125OooO0OO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f83129OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C24543OooO0Oo f83123OooO00o = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f83126OooO0Oo = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f83128OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f83127OooO0o = -2;

    public C24550OooO00o(Context context, int i) {
        this.f83125OooO0OO = new C24538OooO0O0(context);
        this.f83124OooO0O0 = OooOO0.OooO00o(context);
        this.f83129OooO0oO = i;
    }

    @Override // o000Oo.InterfaceC24508OooO00o
    public final void OooO00o(MotionEvent motionEvent) {
        C24538OooO0O0 c24538OooO0O0 = this.f83125OooO0OO;
        c24538OooO0O0.getClass();
        c24538OooO0O0.f82996OooO00o = motionEvent.getEventTime();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f83128OooO0o0 != source || this.f83127OooO0o != deviceId) {
            this.f83126OooO0Oo = this.f83124OooO0O0.isPredictionAvailable(deviceId, source);
            this.f83127OooO0o = deviceId;
            this.f83128OooO0o0 = source;
        }
        if (this.f83126OooO0Oo) {
            this.f83124OooO0O0.record(motionEvent);
            return;
        }
        if (this.f83123OooO00o == null) {
            this.f83123OooO00o = new C24543OooO0Oo(this.f83129OooO0oO);
        }
        this.f83123OooO00o.OooO00o(motionEvent);
    }

    @Override // o000Oo.InterfaceC24508OooO00o
    public final MotionEvent OooO0O0() {
        int iOooO00o = this.f83125OooO0OO.OooO00o();
        if (this.f83126OooO0Oo) {
            return this.f83124OooO0O0.predict(TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis() + ((long) iOooO00o)));
        }
        if (this.f83123OooO00o == null) {
            this.f83123OooO00o = new C24543OooO0Oo(this.f83129OooO0oO);
        }
        return this.f83123OooO00o.OooO0O0(iOooO00o);
    }
}
