package o0OOoOO;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOoOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.createpage.CreateImagePagesUseCase$sliceLongImage$2", m80623f = "CreateImagePagesUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27773OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<String>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f98107OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f98108OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ File f98109OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f98110OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27773OooO0Oo(String str, int i, int i2, File file, Continuation<? super C27773OooO0Oo> continuation) {
        super(2, continuation);
        this.f98108OooOo0o = str;
        this.f98107OooOo = i;
        this.f98110OooOoO0 = i2;
        this.f98109OooOoO = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27773OooO0Oo(this.f98108OooOo0o, this.f98107OooOo, this.f98110OooOoO0, this.f98109OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<String>> continuation) {
        return ((C27773OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        int i;
        Bitmap bitmapCreateScaledBitmap;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f98108OooOo0o;
        int i2 = 0;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(str, false);
        OooOOO0.OooO0o(bitmapRegionDecoderNewInstance, "newInstance(...)");
        int width = bitmapRegionDecoderNewInstance.getWidth();
        int height = bitmapRegionDecoderNewInstance.getHeight();
        int i3 = this.f98107OooOo;
        int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(this.f98110OooOoO0 / (i3 / width));
        int iOooO0O02 = oO0O00O.OooO00o.OooO0O0(i3 * 1.5f);
        String strOooO0o = C32501OooO0oO.OooO0o(new File(str));
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i4 < height) {
            int iMin = Math.min(i4 + iOooO0O0, height);
            Rect rect = new Rect(i2, i4, width, iMin);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            int iWidth = rect.width();
            int i6 = 1;
            while (true) {
                i = width;
                if ((rect.height() / i6) * (iWidth / i6) <= 20000000) {
                    break;
                }
                i6 *= 2;
                width = i;
            }
            options.inSampleSize = i6;
            Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
            if (bitmapDecodeRegion == null) {
                break;
            }
            int iMin2 = Math.min(bitmapDecodeRegion.getWidth(), iOooO0O02);
            float width2 = iMin2 / bitmapDecodeRegion.getWidth();
            int iOooO0O03 = oO0O00O.OooO00o.OooO0O0(bitmapDecodeRegion.getHeight() * width2);
            if (width2 == 1.0f) {
                bitmapCreateScaledBitmap = bitmapDecodeRegion;
            } else {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeRegion, iMin2, iOooO0O03, true);
                OooOOO0.OooO0Oo(bitmapCreateScaledBitmap);
            }
            if (bitmapCreateScaledBitmap != bitmapDecodeRegion) {
                bitmapDecodeRegion.recycle();
            }
            File file = new File(this.f98109OooOoO, strOooO0o + "_p" + i5 + ".webp");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream);
                fileOutputStream.close();
                bitmapCreateScaledBitmap.recycle();
                arrayList.add(file.getAbsolutePath());
                i5++;
                i4 = iMin;
                width = i;
                i2 = 0;
            } finally {
            }
        }
        bitmapRegionDecoderNewInstance.recycle();
        return arrayList;
    }
}
