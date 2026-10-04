package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import kotlin.jvm.internal.OooOOO0;
import o00O0O00.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SidecarDeviceState f66645OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f66647OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f66648OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f66644OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final WeakHashMap f66646OooO0OO = new WeakHashMap();

    public DistinctElementSidecarCallback(OooO00o oooO00o, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f66647OooO0Oo = oooO00o;
        this.f66648OooO0o0 = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (o00O0O00.OooO00o.C19655OooO00o.OooO0O0(r2) == o00O0O00.OooO00o.C19655OooO00o.OooO0O0(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f66644OooO00o) {
            try {
                OooO00o oooO00o = this.f66647OooO0Oo;
                SidecarDeviceState sidecarDeviceState2 = this.f66645OooO0O0;
                oooO00o.getClass();
                if (!OooOOO0.OooO0O0(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 == null) {
                    }
                    this.f66645OooO0O0 = sidecarDeviceState;
                    this.f66648OooO0o0.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f66644OooO00o) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f66646OooO0OO.get(iBinder);
                this.f66647OooO0Oo.getClass();
                if (OooOOO0.OooO0O0(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo) ? true : (sidecarWindowLayoutInfo2 == null || sidecarWindowLayoutInfo == null) ? false : OooO00o.OooO0O0(OooO00o.C19655OooO00o.OooO0OO(sidecarWindowLayoutInfo2), OooO00o.C19655OooO00o.OooO0OO(sidecarWindowLayoutInfo))) {
                    return;
                }
                this.f66646OooO0OO.put(iBinder, sidecarWindowLayoutInfo);
                this.f66648OooO0o0.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
