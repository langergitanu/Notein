package com.orion.notein.p607ui.noteeditor.screenshot;

import OooO0o.OooO0O0;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.p607ui.noteeditor.screenshot.ScreenshotPanel;
import kotlin.jvm.internal.OooOOO0;
import o0O0O0oo.C25877OooO0o0;
import o0o000.C29726OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements ScreenshotPanel.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ActivityC21897OooOo0 f76233OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC19380OooO00o f76234OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0<Intent> f76235OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f76236OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f76237OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C29726OooO0oo f76238OooO0o0;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.screenshot.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19380OooO00o {
        void OooO00o(Uri uri);

        void OooO0O0();
    }

    public OooO00o(ActivityC21897OooOo0 activityC21897OooOo0, InterfaceC19380OooO00o screenshotEventListener, OooO0O0 permissionLauncher) {
        OooOOO0.OooO0oO(screenshotEventListener, "screenshotEventListener");
        OooOOO0.OooO0oO(permissionLauncher, "permissionLauncher");
        this.f76233OooO00o = activityC21897OooOo0;
        this.f76234OooO0O0 = screenshotEventListener;
        this.f76235OooO0OO = permissionLauncher;
        this.f76237OooO0o = new OooO0O0(this);
    }

    @Override // com.orion.notein.ui.noteeditor.screenshot.ScreenshotPanel.OooO00o
    public final void OooO00o() {
        OooO0OO();
    }

    @Override // com.orion.notein.ui.noteeditor.screenshot.ScreenshotPanel.OooO00o
    public final void OooO0O0(C29726OooO0oo c29726OooO0oo) {
        OooO0OO();
        this.f76238OooO0o0 = c29726OooO0oo;
        Object systemService = this.f76233OooO00o.getSystemService("media_projection");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        Intent intentCreateScreenCaptureIntent = ((MediaProjectionManager) systemService).createScreenCaptureIntent();
        OooOOO0.OooO0o(intentCreateScreenCaptureIntent, "createScreenCaptureIntent(...)");
        this.f76235OooO0OO.OooO00o(intentCreateScreenCaptureIntent);
    }

    public final void OooO0OO() {
        if (this.f76236OooO0Oo) {
            OooO0O0 oooO0O0 = this.f76237OooO0o;
            ActivityC21897OooOo0 activityC21897OooOo0 = this.f76233OooO00o;
            activityC21897OooOo0.unbindService(oooO0O0);
            activityC21897OooOo0.stopService(new Intent(activityC21897OooOo0, (Class<?>) ScreenCaptureForegroundService.class));
            this.f76236OooO0Oo = false;
        }
        C25877OooO0o0.OooO00o("ScreenShotWindow");
    }
}
