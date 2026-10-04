package androidx.appcompat.widget;

import OooOo.C20478OooOOOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C21528OooO0oO;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.orion.notein.global.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.appcompat.widget.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21556Oooo0OO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static C21556Oooo0OO f63053OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public WeakHashMap<Context, OooOo.Oooo0<ColorStateList>> f63055OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final WeakHashMap<Context, OooOo.OooOOO<WeakReference<Drawable.ConstantState>>> f63056OooO0O0 = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TypedValue f63057OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f63058OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C21528OooO0oO.OooO00o f63059OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final PorterDuff.Mode f63052OooO0o = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f63054OooO0oo = new OooO00o(6);

    /* JADX INFO: renamed from: androidx.appcompat.widget.Oooo0OO$OooO00o */
    public static class OooO00o extends C20478OooOOOo<Integer, PorterDuffColorFilter> {
    }

    public static synchronized C21556Oooo0OO OooO0O0() {
        try {
            if (f63053OooO0oO == null) {
                f63053OooO0oO = new C21556Oooo0OO();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f63053OooO0oO;
    }

    public static synchronized PorterDuffColorFilter OooO0o0(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        OooO00o oooO00o = f63054OooO0oo;
        oooO00o.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = oooO00o.get(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            oooO00o.put(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public final Drawable OooO00o(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference<Drawable.ConstantState> weakReferenceOooO0O0;
        if (this.f63057OooO0OO == null) {
            this.f63057OooO0OO = new TypedValue();
        }
        TypedValue typedValue = this.f63057OooO0OO;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            OooOo.OooOOO<WeakReference<Drawable.ConstantState>> oooOOO = this.f63056OooO0O0.get(context);
            drawableNewDrawable = null;
            if (oooOOO != null && (weakReferenceOooO0O0 = oooOOO.OooO0O0(j)) != null) {
                Drawable.ConstantState constantState = weakReferenceOooO0O0.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    oooOOO.OooO0o(j);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableOooO0OO = null;
        if (this.f63059OooO0o0 != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableOooO0OO = new LayerDrawable(new Drawable[]{OooO0OO(context, R.drawable.abc_cab_background_internal_bg), OooO0OO(context, 2131230805)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableOooO0OO = C21528OooO0oO.OooO00o.OooO0OO(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableOooO0OO = C21528OooO0oO.OooO00o.OooO0OO(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableOooO0OO = C21528OooO0oO.OooO00o.OooO0OO(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableOooO0OO == null) {
            return layerDrawableOooO0OO;
        }
        layerDrawableOooO0OO.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableOooO0OO.getConstantState();
                if (constantState2 != null) {
                    OooOo.OooOOO<WeakReference<Drawable.ConstantState>> oooOOO2 = this.f63056OooO0O0.get(context);
                    if (oooOOO2 == null) {
                        oooOOO2 = new OooOo.OooOOO<>();
                        this.f63056OooO0O0.put(context, oooOOO2);
                    }
                    oooOOO2.OooO0o0(j, new WeakReference<>(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableOooO0OO;
    }

    public final synchronized Drawable OooO0OO(Context context, int i) {
        return OooO0Oo(context, i, false);
    }

    public final synchronized Drawable OooO0Oo(Context context, int i, boolean z) {
        Drawable drawableOooO00o;
        try {
            if (!this.f63058OooO0Oo) {
                this.f63058OooO0Oo = true;
                Drawable drawableOooO0OO = OooO0OO(context, R.drawable.abc_vector_test);
                if (drawableOooO0OO == null || (!(drawableOooO0OO instanceof androidx.vectordrawable.graphics.drawable.OooO0o) && !"android.graphics.drawable.VectorDrawable".equals(drawableOooO0OO.getClass().getName()))) {
                    this.f63058OooO0Oo = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableOooO00o = OooO00o(context, i);
            if (drawableOooO00o == null) {
                drawableOooO00o = ContextCompat.getDrawable(context, i);
            }
            if (drawableOooO00o != null) {
                drawableOooO00o = OooO0oO(context, i, z, drawableOooO00o);
            }
            if (drawableOooO00o != null) {
                C21545OooOooO.OooO00o(drawableOooO00o);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableOooO00o;
    }

    public final synchronized ColorStateList OooO0o(Context context, int i) {
        ColorStateList colorStateListOooO0OO;
        OooOo.Oooo0<ColorStateList> oooo0;
        WeakHashMap<Context, OooOo.Oooo0<ColorStateList>> weakHashMap = this.f63055OooO00o;
        ColorStateList colorStateListOooO0Oo = null;
        colorStateListOooO0OO = (weakHashMap == null || (oooo0 = weakHashMap.get(context)) == null) ? null : oooo0.OooO0OO(i);
        if (colorStateListOooO0OO == null) {
            C21528OooO0oO.OooO00o oooO00o = this.f63059OooO0o0;
            if (oooO00o != null) {
                colorStateListOooO0Oo = oooO00o.OooO0Oo(context, i);
            }
            if (colorStateListOooO0Oo != null) {
                if (this.f63055OooO00o == null) {
                    this.f63055OooO00o = new WeakHashMap<>();
                }
                OooOo.Oooo0<ColorStateList> oooo02 = this.f63055OooO00o.get(context);
                if (oooo02 == null) {
                    oooo02 = new OooOo.Oooo0<>();
                    this.f63055OooO00o.put(context, oooo02);
                }
                oooo02.OooO00o(i, colorStateListOooO0Oo);
            }
            colorStateListOooO0OO = colorStateListOooO0Oo;
        }
        return colorStateListOooO0OO;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable OooO0oO(Context context, int i, boolean z, Drawable drawable) {
        int i2;
        boolean z2;
        int iRound;
        ColorStateList colorStateListOooO0o = OooO0o(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListOooO0o != null) {
            Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTintList(drawableWrap, colorStateListOooO0o);
            if (this.f63059OooO0o0 != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                DrawableCompat.setTintMode(drawableWrap, mode);
            }
            return drawableWrap;
        }
        if (this.f63059OooO0o0 != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iOooO0OO = C21549Oooo.OooO0OO(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C21528OooO0oO.f62910OooO0O0;
                C21528OooO0oO.OooO00o.OooO0o0(drawableFindDrawableByLayerId, iOooO0OO, mode2);
                C21528OooO0oO.OooO00o.OooO0o0(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), C21549Oooo.OooO0OO(context, R.attr.colorControlNormal), mode2);
                C21528OooO0oO.OooO00o.OooO0o0(layerDrawable.findDrawableByLayerId(android.R.id.progress), C21549Oooo.OooO0OO(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iOooO0O0 = C21549Oooo.OooO0O0(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C21528OooO0oO.f62910OooO0O0;
                C21528OooO0oO.OooO00o.OooO0o0(drawableFindDrawableByLayerId2, iOooO0O0, mode3);
                C21528OooO0oO.OooO00o.OooO0o0(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), C21549Oooo.OooO0OO(context, R.attr.colorControlActivated), mode3);
                C21528OooO0oO.OooO00o.OooO0o0(layerDrawable2.findDrawableByLayerId(android.R.id.progress), C21549Oooo.OooO0OO(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C21528OooO0oO.OooO00o oooO00o = this.f63059OooO0o0;
        boolean z3 = false;
        if (oooO00o != null) {
            PorterDuff.Mode mode4 = C21528OooO0oO.f62910OooO0O0;
            if (C21528OooO0oO.OooO00o.OooO00o(oooO00o.f62913OooO00o, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (C21528OooO0oO.OooO00o.OooO00o(oooO00o.f62915OooO0OO, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (C21528OooO0oO.OooO00o.OooO00o(oooO00o.f62916OooO0Oo, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == 2131230825) {
                    iRound = Math.round(40.8f);
                    i2 = 16842800;
                    z2 = true;
                    if (z2) {
                        Drawable drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(C21528OooO0oO.OooO0OO(C21549Oooo.OooO0OO(context, i2), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z3 = true;
                    }
                } else if (i != R.drawable.abc_dialog_material_background) {
                    i2 = 0;
                    z2 = false;
                    iRound = -1;
                    if (z2) {
                    }
                }
                i2 = 16842801;
            }
            z2 = true;
            iRound = -1;
            if (z2) {
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
