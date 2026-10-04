package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import androidx.core.graphics.drawable.WrappedDrawable;

/* JADX INFO: loaded from: classes.dex */
public class OooOOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f62926OooO0OO = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbsSeekBar f62927OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Bitmap f62928OooO0O0;

    public OooOOO0(AbsSeekBar absSeekBar) {
        this.f62927OooO00o = absSeekBar;
    }

    public void OooO00o(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = this.f62927OooO00o;
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(absSeekBar.getContext(), attributeSet, f62926OooO0OO, i, 0);
        Drawable drawableOooO0OO = c21565OoooOO0OooO0o.OooO0OO(0);
        if (drawableOooO0OO != null) {
            if (drawableOooO0OO instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableOooO0OO;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableOooO0O0 = OooO0O0(animationDrawable.getFrame(i2), true);
                    drawableOooO0O0.setLevel(10000);
                    animationDrawable2.addFrame(drawableOooO0O0, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableOooO0OO = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableOooO0OO);
        }
        Drawable drawableOooO0OO2 = c21565OoooOO0OooO0o.OooO0OO(1);
        if (drawableOooO0OO2 != null) {
            absSeekBar.setProgressDrawable(OooO0O0(drawableOooO0OO2, false));
        }
        c21565OoooOO0OooO0o.OooO0oO();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable OooO0O0(Drawable drawable, boolean z) {
        if (drawable instanceof WrappedDrawable) {
            WrappedDrawable wrappedDrawable = (WrappedDrawable) drawable;
            Drawable wrappedDrawable2 = wrappedDrawable.getWrappedDrawable();
            if (wrappedDrawable2 != null) {
                wrappedDrawable.setWrappedDrawable(OooO0O0(wrappedDrawable2, z));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = OooO0O0(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f62928OooO0O0 == null) {
                    this.f62928OooO0O0 = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
