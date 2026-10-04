package o000O0oo;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.ink.authoring.internal.OooO0o;

/* JADX INFO: renamed from: o000O0oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24425OooOO0O implements oO0O000o.OooO00o {
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        HandlerThread handlerThread = new HandlerThread("CanvasInProgressStrokesRenderHelperV33_Render");
        handlerThread.start();
        return new OooO0o.C21938OooO0o0(handlerThread, new Handler(handlerThread.getLooper()));
    }
}
