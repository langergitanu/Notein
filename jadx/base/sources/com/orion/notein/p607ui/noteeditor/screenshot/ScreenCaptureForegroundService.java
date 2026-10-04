package com.orion.notein.p607ui.noteeditor.screenshot;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.Image;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.activity.result.ActivityResult;
import androidx.core.app.ServiceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.screenshot.OooO0O0;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0oo000O.C31182OooO;
import o0oo000O.C31194OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/screenshot/ScreenCaptureForegroundService;", "Landroid/app/Service;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ScreenCaptureForegroundService extends Service {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f76241OooOoO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0O0.OooO00o f76242OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f76243OooOo0o = new OooO00o();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicBoolean f76244OooOoO0 = new AtomicBoolean(false);

    public final class OooO00o extends Binder {
        public OooO00o() {
        }
    }

    public final void OooO00o() {
        stopForeground(true);
        OooO0O0.OooO00o oooO00o = this.f76242OooOo;
        if (oooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ScreenShotWindow");
            c20358OooO00o.OooO0o0("ScreenShot, onFail", new Object[0]);
            com.orion.notein.p607ui.noteeditor.screenshot.OooO00o oooO00o2 = oooO00o.f76240OooO00o;
            oooO00o2.f76234OooO0O0.OooO0O0();
            oooO00o2.OooO0OO();
        }
    }

    public final void OooO0O0(Image image, RectF rectF) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("ScreenCaptureForegroundService");
        c20358OooO00o.OooO0o0("ScreenShot, onScreenshotImageAvailable, image: " + image + ", roi: " + rectF, new Object[0]);
        Image.Plane plane = image.getPlanes()[0];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((plane.getRowStride() - (image.getWidth() * plane.getPixelStride())) / plane.getPixelStride()) + image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(plane.getBuffer());
        boolean z = true;
        if (!bitmapCreateBitmap.isRecycled()) {
            int height = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth();
            int[] iArr = new int[height];
            bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            int i = 0;
            while (true) {
                if (i < height) {
                    if (iArr[i] != 0) {
                        z = false;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("ScreenCaptureForegroundService");
        c20358OooO00o2.OooO0o0("ScreenShot, onScreenshotImageAvailable, isEmptyBitmap: " + z, new Object[0]);
        if (z) {
            image.close();
            this.f76244OooOoO0.set(false);
            return;
        }
        int iMax = Math.max(0, (int) rectF.left);
        int iMax2 = Math.max(0, (int) rectF.top);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, iMax, iMax2, Math.min(bitmapCreateBitmap.getWidth() - iMax, (int) rectF.width()), Math.min(bitmapCreateBitmap.getHeight() - iMax2, (int) rectF.height()));
        OooOOO0.OooO0o(bitmapCreateBitmap2, "createBitmap(...)");
        image.close();
        Uri uriOooO00o = null;
        try {
            File file = new File(getBaseContext().getCacheDir(), "screenshot.png");
            if (C31182OooO.OooO0OO(bitmapCreateBitmap2, file, Bitmap.CompressFormat.PNG, 100)) {
                uriOooO00o = C31194OooOOo0.OooO00o(getBaseContext(), file);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("ScreenCaptureForegroundService");
            c20358OooO00o3.OooO0Oo(e, "ScreenShot, onScreenshotImageAvailable error.", new Object[0]);
        }
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
        }
        if (!bitmapCreateBitmap2.isRecycled()) {
            bitmapCreateBitmap2.recycle();
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o4.OooOOO0("ScreenCaptureForegroundService");
        c20358OooO00o4.OooO0o0("ScreenShot, onScreenshotImageAvailable, screenshotUri: " + uriOooO00o, new Object[0]);
        if (uriOooO00o == null) {
            OooO00o();
            return;
        }
        OooO0O0.OooO00o oooO00o = this.f76242OooOo;
        if (oooO00o != null) {
            c20358OooO00o4.OooOOO0("ScreenShotWindow");
            c20358OooO00o4.OooO0o0("ScreenShot, onSuccess, screenshot: " + uriOooO00o, new Object[0]);
            com.orion.notein.p607ui.noteeditor.screenshot.OooO00o oooO00o2 = oooO00o.f76240OooO00o;
            oooO00o2.f76234OooO0O0.OooO00o(uriOooO00o);
            oooO00o2.OooO0OO();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f76243OooOo0o;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        OooOOO0.OooO0oO(intent, "intent");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO00o("onStartCommand : set screenshotToken = false", new Object[0]);
        this.f76244OooOoO0.set(false);
        NotificationChannel notificationChannel = new NotificationChannel("notein_screenshot_channel", "screenshot", 0);
        notificationChannel.setLockscreenVisibility(0);
        Object systemService = getSystemService("notification");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) MainActivity.class), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        OooOOO0.OooO0o(activity, "let(...)");
        Notification notificationBuild = new Notification.Builder(this, "notein_screenshot_channel").setContentText(getString(R.string.screenshot_completed)).setSmallIcon(R.drawable.ic_logo).setContentIntent(activity).build();
        OooOOO0.OooO0o(notificationBuild, "build(...)");
        ServiceCompat.startForeground(this, 1, notificationBuild, Build.VERSION.SDK_INT >= 29 ? 32 : 0);
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("user_grant_op_result") : null;
        ActivityResult activityResult = obj instanceof ActivityResult ? (ActivityResult) obj : null;
        Integer numValueOf = activityResult != null ? Integer.valueOf(activityResult.f62240OooOo0o) : null;
        Intent intent2 = activityResult != null ? activityResult.f62239OooOo : null;
        c20358OooO00o.OooOOO0("ScreenCaptureForegroundService");
        c20358OooO00o.OooO0o0("ScreenShot, startToScreenshot, resultCode: " + numValueOf + ", resultData: " + intent2, new Object[0]);
        if (numValueOf == null || intent2 == null) {
            OooO00o();
            return 2;
        }
        Bundle extras2 = intent.getExtras();
        Object obj2 = extras2 != null ? extras2.get("roi") : null;
        RectF rectF = obj2 instanceof RectF ? (RectF) obj2 : null;
        Bundle extras3 = intent.getExtras();
        Object obj3 = extras3 != null ? extras3.get("screen_size") : null;
        int[] iArr = obj3 instanceof int[] ? (int[]) obj3 : null;
        c20358OooO00o.OooOOO0("ScreenCaptureForegroundService");
        c20358OooO00o.OooO0o0("ScreenShot, startToScreenshot, roi: " + rectF + ", screenSize: " + iArr, new Object[0]);
        if (rectF == null || iArr == null) {
            OooO00o();
            return 2;
        }
        Object systemService2 = getApplicationContext().getSystemService("media_projection");
        OooOOO0.OooO0o0(systemService2, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        MediaProjection mediaProjection = ((MediaProjectionManager) systemService2).getMediaProjection(numValueOf.intValue(), intent2);
        if (mediaProjection != null) {
            C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new o0o000.OooO0O0(this, mediaProjection, rectF, iArr, null), 3);
            return 2;
        }
        c20358OooO00o.OooOOO0("ScreenCaptureForegroundService");
        c20358OooO00o.OooO0OO("ScreenShot, startToScreenshot, getMediaProjection returned null.", new Object[0]);
        OooO00o();
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        stopForeground(true);
        return super.onUnbind(intent);
    }
}
