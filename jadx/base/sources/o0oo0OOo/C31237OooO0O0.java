package o0oo0OOo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.DynamicDrawableSpan;
import android.util.LruCache;
import com.facebook.soloader.OooOo;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.api.format.RTHtml;
import com.orion.notein.richeditor.api.format.RTSpanned;
import com.orion.notein.richeditor.api.format.RTText;
import com.orion.penkit.models.TextBoxInfo;
import java.util.Iterator;
import kotlin.jvm.internal.OooO0OO;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo0OOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31237OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C31237OooO0O0 f111407OooO0O0 = new C31237OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LruCache<Integer, Layout> f111408OooO00o = new LruCache<>(5);

    public static void OooO00o(Spannable spannable) {
        Iterator it = OooOo.OooO0oO(DynamicDrawableSpan.class).iterator();
        while (it.hasNext()) {
            kotlin.jvm.internal.OooO0O0 OooO0O02 = OooO0OO.OooO0O0((DynamicDrawableSpan[]) spannable.getSpans(0, spannable.length(), (Class) it.next()));
            while (OooO0O02.hasNext()) {
                spannable.removeSpan((DynamicDrawableSpan) OooO0O02.next());
            }
        }
    }

    public static Bitmap OooO0O0(Context context, TextBoxInfo textBoxInfo) {
        OooOOO0.OooO0oO(context, "context");
        RectF bounds = textBoxInfo.getBounds();
        CharSequence charSequenceOooO0Oo = OooO0Oo(context, textBoxInfo);
        if (charSequenceOooO0Oo == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TextBoxRender");
            c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unable to get the spannable string from TextBoxInfo. ", textBoxInfo.getText()), new Object[0]);
            return null;
        }
        if (charSequenceOooO0Oo instanceof Spannable) {
            OooO00o((Spannable) charSequenceOooO0Oo);
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textBoxInfo.getTextSize());
        textPaint.setColor(textBoxInfo.getDefaultTextColor());
        StaticLayout staticLayoutOooO0OO = OooO0OO(context, charSequenceOooO0Oo, (int) textBoxInfo.getBoxWidth(), textBoxInfo.getLineHeight(), textPaint);
        if (bounds.width() <= 0.001f || bounds.height() <= 0.01f) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("TextBoxRender");
            c20358OooO00o2.OooO0OO("The bounds of TextBoxInfo is invalid. " + textBoxInfo, new Object[0]);
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) Math.ceil(bounds.width()), (int) Math.ceil(bounds.height()), Bitmap.Config.ARGB_8888);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        bitmapCreateBitmap.eraseColor(textBoxInfo.getBackgroundColor());
        float fWidth = bounds.width() / textBoxInfo.getBoxWidth();
        canvas.scale(fWidth, fWidth);
        staticLayoutOooO0OO.draw(canvas);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static StaticLayout OooO0OO(Context context, CharSequence text, int i, float f, TextPaint textPaint) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(text, "text");
        textPaint.density = 1.0f;
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        StaticLayout.Builder lineSpacing = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, i).setLineSpacing(0.0f, f);
        OooOOO0.OooO0o(lineSpacing, "setLineSpacing(...)");
        StaticLayout staticLayoutBuild = lineSpacing.build();
        OooOOO0.OooO0o(staticLayoutBuild, "build(...)");
        return staticLayoutBuild;
    }

    public static CharSequence OooO0Oo(Context context, TextBoxInfo textBoxInfo) {
        RTText rTTextConvertTo = new RTHtml(textBoxInfo.getText()).convertTo(context, RTFormat.SPANNED);
        RTSpanned rTSpanned = rTTextConvertTo instanceof RTSpanned ? (RTSpanned) rTTextConvertTo : null;
        if (rTSpanned != null) {
            return rTSpanned.getText();
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("TextBoxRender");
        c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("No text. ", textBoxInfo.getText()), new Object[0]);
        return null;
    }
}
