package o0o000;

import android.content.res.Resources;
import android.graphics.RectF;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.orion.notein.p607ui.noteeditor.screenshot.ScreenCaptureForegroundService;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.screenshot.ScreenCaptureForegroundService$startToScreenshot$1", m80623f = "ScreenCaptureForegroundService.kt", m80624l = {141, 142}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ScreenCaptureForegroundService f105389OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105390OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ RectF f105391OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ MediaProjection f105392OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int[] f105393OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(ScreenCaptureForegroundService screenCaptureForegroundService, MediaProjection mediaProjection, RectF rectF, int[] iArr, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f105389OooOo = screenCaptureForegroundService;
        this.f105392OooOoO0 = mediaProjection;
        this.f105391OooOoO = rectF;
        this.f105393OooOoOO = iArr;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f105389OooOo, this.f105392OooOoO0, this.f105391OooOoO, this.f105393OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(3:6|26|27)(2:7|8))(1:9))(3:10|(0)|25)|13|28|14|(1:16)(3:17|(1:19)(1:20)|21)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f1, code lost:
    
        r3 = oOO00oo.C34406OooO00o.f123390OooO00o;
        r3.OooOOO0("ScreenCaptureForegroundService");
        r3.OooO0Oo(r0, "ScreenShot, startToScreenshotInternal createVirtualDisplay error.", new java.lang.Object[0]);
        r5.OooO00o();
        r0 = oO00ooO.C32460OooOooO.f116667OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0102, code lost:
    
        if (r0 != r2) goto L26;
     */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, oO0o0OO.o00000OO] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, android.hardware.display.VirtualDisplay] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C32460OooOooO c32460OooOooO;
        Handler handler;
        ImageReader imageReader;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105390OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f105390OooOo0o = 1;
            if (C33644OoooO0.OooO00o(300L, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f105390OooOo0o = 2;
        int i2 = ScreenCaptureForegroundService.f76241OooOoO;
        final ScreenCaptureForegroundService screenCaptureForegroundService = this.f105389OooOo;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("ScreenCaptureForegroundService");
        c20358OooO00o.OooO0o0("ScreenShot, startToScreenshotInternal start.", new Object[0]);
        int i3 = Resources.getSystem().getDisplayMetrics().densityDpi;
        int[] iArr = this.f105393OooOoOO;
        int i4 = iArr[0];
        int i5 = iArr[1];
        ImageReader imageReaderNewInstance = ImageReader.newInstance(i4, i5, 1, 1);
        OooOOO0.OooO0o(imageReaderNewInstance, "newInstance(...)");
        c20358OooO00o.OooOOO0("ScreenCaptureForegroundService");
        StringBuilder sb = new StringBuilder("screenWidth: ");
        C24472OooOoo.OooO0O0(sb, ", screenHeight: ", ", screenDensityDpi: ", i4, i5);
        sb.append(i3);
        c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
        final C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
        Surface surface = imageReaderNewInstance.getSurface();
        OooO0OO oooO0OO = new OooO0OO();
        final MediaProjection mediaProjection = this.f105392OooOoO0;
        mediaProjection.registerCallback(oooO0OO, null);
        ?? CreateVirtualDisplay = mediaProjection.createVirtualDisplay("screenshot", i4, i5, i3, 16, surface, null, null);
        c24034Oooo00O.f80942OooOo0o = CreateVirtualDisplay;
        if (CreateVirtualDisplay == 0) {
            c20358OooO00o.OooOOO0("ScreenCaptureForegroundService");
            c20358OooO00o.OooO0OO("ScreenShot, startToScreenshotInternal createVirtualDisplay returned null.", new Object[0]);
            screenCaptureForegroundService.OooO00o();
            c32460OooOooO = C32460OooOooO.f116667OooO00o;
        } else {
            final C24034Oooo00O c24034Oooo00O2 = new C24034Oooo00O();
            boolean zOooOOo = C33595OooOOo.OooOOo(Build.MANUFACTURER, "HONOR", true);
            final RectF rectF = this.f105391OooOoO;
            if (zOooOOo) {
                handler = null;
                imageReader = imageReaderNewInstance;
                c24034Oooo00O2.f80942OooOo0o = C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C29723OooO0Oo(screenCaptureForegroundService, imageReaderNewInstance, rectF, c24034Oooo00O, mediaProjection, null), 3);
            } else {
                handler = null;
                imageReader = imageReaderNewInstance;
            }
            c20358OooO00o.OooOOO0("ScreenCaptureForegroundService");
            c20358OooO00o.OooO0o0("ScreenShot, startToScreenshotInternal createVirtualDisplay success.", new Object[0]);
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: o0o000.OooO00o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    RectF rectF2 = rectF;
                    C24034Oooo00O c24034Oooo00O3 = c24034Oooo00O;
                    MediaProjection mediaProjection2 = mediaProjection;
                    int i6 = ScreenCaptureForegroundService.f76241OooOoO;
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("ScreenCaptureForegroundService");
                    c20358OooO00o2.OooO0o0("OnImageAvailableListener call start.", new Object[0]);
                    ScreenCaptureForegroundService screenCaptureForegroundService2 = screenCaptureForegroundService;
                    if (screenCaptureForegroundService2.f76244OooOoO0.get()) {
                        c20358OooO00o2.OooOOO0("ScreenCaptureForegroundService");
                        c20358OooO00o2.OooO0o0("ScreenShot, startToScreenshotInternal OnImageAvailableListener screenshotToken is true, return.", new Object[0]);
                        return;
                    }
                    c20358OooO00o2.OooOOO0("ScreenCaptureForegroundService");
                    c20358OooO00o2.OooO0o0("ScreenShot, cancel acquireLatestImageJob", new Object[0]);
                    InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) c24034Oooo00O2.f80942OooOo0o;
                    if (interfaceC33672o00ooo != null) {
                        interfaceC33672o00ooo.cancel((CancellationException) null);
                    }
                    try {
                        Image imageAcquireLatestImage = imageReader2.acquireLatestImage();
                        OooOOO0.OooO0o(imageAcquireLatestImage, "acquireLatestImage(...)");
                        screenCaptureForegroundService2.f76244OooOoO0.set(true);
                        screenCaptureForegroundService2.OooO0O0(imageAcquireLatestImage, rectF2);
                    } catch (Exception e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("ScreenCaptureForegroundService");
                        c20358OooO00o3.OooO0Oo(e, "ScreenShot, startToScreenshotInternal acquireLatestImage error.", new Object[0]);
                        screenCaptureForegroundService2.OooO00o();
                    } finally {
                        ((VirtualDisplay) c24034Oooo00O3.f80942OooOo0o).release();
                        mediaProjection2.stop();
                    }
                }
            }, handler);
            c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }
}
