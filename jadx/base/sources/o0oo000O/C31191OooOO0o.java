package o0oo000O;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import java.io.File;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo000O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.utils.ShortcutUtils$createLargeIconFromThumbnail$2", m80623f = "ShortcutUtils.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C31191OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Icon>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f111235OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31191OooOO0o(String str, Continuation<? super C31191OooOO0o> continuation) {
        super(2, continuation);
        this.f111235OooOo0o = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31191OooOO0o(this.f111235OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Icon> continuation) {
        return ((C31191OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapCreateScaledBitmap;
        String str = this.f111235OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        try {
            if (str.length() == 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ShortcutUtils");
                c20358OooO00o.OooO00o("Thumbnail path is empty", new Object[0]);
                return null;
            }
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("ShortcutUtils");
                c20358OooO00o2.OooO00o("Loading large thumbnail from: ".concat(str), new Object[0]);
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                if (bitmapDecodeFile == null) {
                    c20358OooO00o2.OooOOO0("ShortcutUtils");
                    c20358OooO00o2.OooOO0O("Failed to decode thumbnail bitmap", new Object[0]);
                    return null;
                }
                OooOOO.f111236OooO00o.getClass();
                int width = bitmapDecodeFile.getWidth();
                int height = bitmapDecodeFile.getHeight();
                if (width == 576 && height == 576) {
                    bitmapCreateScaledBitmap = bitmapDecodeFile;
                } else {
                    float f = 576;
                    float f2 = width;
                    float f3 = height;
                    float fMax = Math.max(f / f2, f / f3);
                    int i = (int) (f2 * fMax);
                    int i2 = (int) (f3 * fMax);
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, i, i2, true);
                    kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                    if (i != 576 || i2 != 576) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, (i - 576) / 2, (i2 - 576) / 2, 576, 576);
                        kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                        bitmapCreateScaledBitmap.recycle();
                        bitmapCreateScaledBitmap = bitmapCreateBitmap;
                    }
                }
                bitmapDecodeFile.recycle();
                c20358OooO00o2.OooOOO0("ShortcutUtils");
                c20358OooO00o2.OooO00o("Successfully created large icon from thumbnail", new Object[0]);
                return Icon.createWithBitmap(bitmapCreateScaledBitmap);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("ShortcutUtils");
            c20358OooO00o3.OooO00o("Thumbnail file not found: ".concat(str), new Object[0]);
            return null;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooO0Oo(e, androidx.core.app.OooO.OooO0O0(c20358OooO00o4, "ShortcutUtils", "Error creating large icon from thumbnail: ", str), new Object[0]);
            return null;
        }
    }
}
