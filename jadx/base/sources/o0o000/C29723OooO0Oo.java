package o0o000;

import android.graphics.RectF;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import com.orion.notein.p607ui.noteeditor.screenshot.ScreenCaptureForegroundService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.screenshot.ScreenCaptureForegroundService$startToScreenshotInternal$3", m80623f = "ScreenCaptureForegroundService.kt", m80624l = {194}, m80625m = "invokeSuspend")
public final class C29723OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ScreenCaptureForegroundService f105394OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105395OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ RectF f105396OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ImageReader f105397OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<VirtualDisplay> f105398OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MediaProjection f105399OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29723OooO0Oo(ScreenCaptureForegroundService screenCaptureForegroundService, ImageReader imageReader, RectF rectF, C24034Oooo00O<VirtualDisplay> c24034Oooo00O, MediaProjection mediaProjection, Continuation<? super C29723OooO0Oo> continuation) {
        super(2, continuation);
        this.f105394OooOo = screenCaptureForegroundService;
        this.f105397OooOoO0 = imageReader;
        this.f105396OooOoO = rectF;
        this.f105398OooOoOO = c24034Oooo00O;
        this.f105399OooOoo0 = mediaProjection;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29723OooO0Oo(this.f105394OooOo, this.f105397OooOoO0, this.f105396OooOoO, this.f105398OooOoOO, this.f105399OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29723OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        MediaProjection mediaProjection = this.f105399OooOoo0;
        C24034Oooo00O<VirtualDisplay> c24034Oooo00O = this.f105398OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105395OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ScreenCaptureForegroundService");
            c20358OooO00o.OooO0o0("ScreenShot, acquireLatestImageJob start delay 1s", new Object[0]);
            this.f105395OooOo0o = 1;
            if (C33644OoooO0.OooO00o(1000L, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        ScreenCaptureForegroundService screenCaptureForegroundService = this.f105394OooOo;
        try {
            if (screenCaptureForegroundService.f76244OooOoO0.get()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("ScreenCaptureForegroundService");
                c20358OooO00o2.OooO0o0("ScreenShot, acquireLatestImageJob cancel because screenshotToken is true.", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            try {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("ScreenCaptureForegroundService");
                c20358OooO00o3.OooO0o0("ScreenShot, acquireLatestImageJob start acquireLatestImage", new Object[0]);
                screenCaptureForegroundService.f76244OooOoO0.set(true);
                Image imageAcquireLatestImage = this.f105397OooOoO0.acquireLatestImage();
                OooOOO0.OooO0o(imageAcquireLatestImage, "acquireLatestImage(...)");
                c20358OooO00o3.OooOOO0("ScreenCaptureForegroundService");
                c20358OooO00o3.OooO0o0("ScreenShot, acquireLatestImageJob get image: " + imageAcquireLatestImage.getWidth() + ", " + imageAcquireLatestImage.getHeight(), new Object[0]);
                screenCaptureForegroundService.OooO0O0(imageAcquireLatestImage, this.f105396OooOoO);
            } catch (Exception e) {
                screenCaptureForegroundService.OooO00o();
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("ScreenCaptureForegroundService");
                c20358OooO00o4.OooO0Oo(e, "acquireLatestImageJob error.", new Object[0]);
                VirtualDisplay virtualDisplay = c24034Oooo00O.f80942OooOo0o;
                if (virtualDisplay != null) {
                }
            }
            return C32460OooOooO.f116667OooO00o;
        } finally {
            VirtualDisplay virtualDisplay2 = c24034Oooo00O.f80942OooOo0o;
            if (virtualDisplay2 != null) {
                virtualDisplay2.release();
            }
            mediaProjection.stop();
        }
    }
}
