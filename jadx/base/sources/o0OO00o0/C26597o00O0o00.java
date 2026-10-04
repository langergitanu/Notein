package o0OO00o0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.orion.notein.global.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO00o0.o00O0o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageRepoImpl$savePlaceHolderImage$2", m80623f = "ImageRepoImpl.kt", m80624l = {151}, m80625m = "invokeSuspend")
public final class C26597o00O0o00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public File f91723OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Bitmap f91724OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26596o00O0o0 f91725OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f91726OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f91727OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f91728OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f91729OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26597o00O0o00(C26596o00O0o0 c26596o00O0o0, int i, int i2, String str, Continuation<? super C26597o00O0o00> continuation) {
        super(2, continuation);
        this.f91725OooOoO = c26596o00O0o0;
        this.f91727OooOoOO = i;
        this.f91729OooOoo0 = i2;
        this.f91728OooOoo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26597o00O0o00(this.f91725OooOoO, this.f91727OooOoOO, this.f91729OooOoo0, this.f91728OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C26597o00O0o00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        Bitmap bitmapCreateBitmap;
        File file;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91726OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26596o00O0o0 c26596o00O0o0 = this.f91725OooOoO;
            c26596o00O0o0.getClass();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            int i2 = this.f91727OooOoOO;
            int i3 = this.f91729OooOoo0;
            bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config);
            kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas();
            canvas.setBitmap(bitmapCreateBitmap);
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c26596o00O0o0.f91722OooO0OO;
            Drawable drawable = ContextCompat.getDrawable(abstractApplicationC26277OooOoOO, R.drawable.bg_deleted_image_placeholder);
            if (drawable != null) {
                drawable.setBounds(0, 0, i2, i3);
                drawable.draw(canvas);
            }
            Paint paint = new Paint();
            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
            paint.setAlpha(255);
            paint.setTextSize(Oooo0.o000000O.OooO0oo(14.0f));
            paint.setAntiAlias(true);
            paint.setUnderlineText(false);
            String string = abstractApplicationC26277OooOoOO.getString(R.string.image_is_deleted);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            canvas.drawText(abstractApplicationC26277OooOoOO.getString(R.string.image_is_deleted), (i2 - paint.measureText(string)) / 2.0f, i3 / 2.0f, paint);
            File externalFilesDir = abstractApplicationC26277OooOoOO.getExternalFilesDir(null);
            this.f91724OooOo0o = bitmapCreateBitmap;
            this.f91723OooOo = externalFilesDir;
            this.f91726OooOoO0 = 1;
            obj = c26596o00O0o0.OooOOOo(this.f91728OooOoo, null, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file = externalFilesDir;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = this.f91723OooOo;
            bitmapCreateBitmap = this.f91724OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        File file2 = new File(file, (String) obj);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            } catch (IOException unused) {
                Log.e("ImageRepoImpl", "save placeholder image failed.");
            }
            return file2.getAbsolutePath();
        } finally {
            fileOutputStream.close();
        }
    }
}
