package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21528OooO0oO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final PorterDuff.Mode f62910OooO0O0 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static C21528OooO0oO f62911OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C21556Oooo0OO f62912OooO00o;

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooO0oO$OooO00o */
    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int[] f62913OooO00o = {2131230864, 2131230862, 2131230788};

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f62914OooO0O0 = {2131230812, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int[] f62915OooO0OO = {2131230861, 2131230863, 2131230805, R.drawable.abc_text_cursor_material, 2131230858, 2131230859, 2131230860};

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int[] f62916OooO0Oo = {2131230837, R.drawable.abc_cab_background_internal_bg, 2131230836};

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int[] f62918OooO0o0 = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int[] f62917OooO0o = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean OooO00o(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList OooO0O0(Context context, int i) {
            int iOooO0OO = C21549Oooo.OooO0OO(context, R.attr.colorControlHighlight);
            int iOooO0O0 = C21549Oooo.OooO0O0(context, R.attr.colorButtonNormal);
            int[] iArr = C21549Oooo.f63001OooO0O0;
            int[] iArr2 = C21549Oooo.f63003OooO0Oo;
            int iCompositeColors = ColorUtils.compositeColors(iOooO0OO, i);
            return new ColorStateList(new int[][]{iArr, iArr2, C21549Oooo.f63002OooO0OO, C21549Oooo.f63004OooO0o}, new int[]{iOooO0O0, iCompositeColors, ColorUtils.compositeColors(iOooO0OO, i), i});
        }

        public static LayerDrawable OooO0OO(C21556Oooo0OO c21556Oooo0OO, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableOooO0OO = c21556Oooo0OO.OooO0OO(context, R.drawable.abc_star_black_48dp);
            Drawable drawableOooO0OO2 = c21556Oooo0OO.OooO0OO(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableOooO0OO instanceof BitmapDrawable) && drawableOooO0OO.getIntrinsicWidth() == dimensionPixelSize && drawableOooO0OO.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableOooO0OO;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableOooO0OO.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableOooO0OO.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableOooO0OO2 instanceof BitmapDrawable) && drawableOooO0OO2.getIntrinsicWidth() == dimensionPixelSize && drawableOooO0OO2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableOooO0OO2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableOooO0OO2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableOooO0OO2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void OooO0o0(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C21528OooO0oO.f62910OooO0O0;
            }
            drawableMutate.setColorFilter(C21528OooO0oO.OooO0OO(i, mode));
        }

        public final ColorStateList OooO0Oo(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return ContextCompat.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i == 2131230854) {
                return ContextCompat.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i != R.drawable.abc_switch_thumb_material) {
                if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    return OooO0O0(context, C21549Oooo.OooO0OO(context, R.attr.colorButtonNormal));
                }
                if (i == R.drawable.abc_btn_borderless_material) {
                    return OooO0O0(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return OooO0O0(context, C21549Oooo.OooO0OO(context, R.attr.colorAccent));
                }
                if (i == 2131230849 || i == R.drawable.abc_spinner_textfield_background_material) {
                    return ContextCompat.getColorStateList(context, R.color.abc_tint_spinner);
                }
                if (OooO00o(this.f62914OooO0O0, i)) {
                    return C21549Oooo.OooO0Oo(context, R.attr.colorControlNormal);
                }
                if (OooO00o(this.f62918OooO0o0, i)) {
                    return ContextCompat.getColorStateList(context, R.color.abc_tint_default);
                }
                if (OooO00o(this.f62917OooO0o, i)) {
                    return ContextCompat.getColorStateList(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return ContextCompat.getColorStateList(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListOooO0Oo = C21549Oooo.OooO0Oo(context, R.attr.colorSwitchThumbNormal);
            if (colorStateListOooO0Oo == null || !colorStateListOooO0Oo.isStateful()) {
                iArr[0] = C21549Oooo.f63001OooO0O0;
                iArr2[0] = C21549Oooo.OooO0O0(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = C21549Oooo.f63005OooO0o0;
                iArr2[1] = C21549Oooo.OooO0OO(context, R.attr.colorControlActivated);
                iArr[2] = C21549Oooo.f63004OooO0o;
                iArr2[2] = C21549Oooo.OooO0OO(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = C21549Oooo.f63001OooO0O0;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListOooO0Oo.getColorForState(iArr3, 0);
                iArr[1] = C21549Oooo.f63005OooO0o0;
                iArr2[1] = C21549Oooo.OooO0OO(context, R.attr.colorControlActivated);
                iArr[2] = C21549Oooo.f63004OooO0o;
                iArr2[2] = colorStateListOooO0Oo.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized C21528OooO0oO OooO00o() {
        try {
            if (f62911OooO0OO == null) {
                OooO0Oo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f62911OooO0OO;
    }

    public static synchronized PorterDuffColorFilter OooO0OO(int i, PorterDuff.Mode mode) {
        return C21556Oooo0OO.OooO0o0(i, mode);
    }

    public static synchronized void OooO0Oo() {
        if (f62911OooO0OO == null) {
            C21528OooO0oO c21528OooO0oO = new C21528OooO0oO();
            f62911OooO0OO = c21528OooO0oO;
            c21528OooO0oO.f62912OooO00o = C21556Oooo0OO.OooO0O0();
            C21556Oooo0OO c21556Oooo0OO = f62911OooO0OO.f62912OooO00o;
            OooO00o oooO00o = new OooO00o();
            synchronized (c21556Oooo0OO) {
                c21556Oooo0OO.f63059OooO0o0 = oooO00o;
            }
        }
    }

    public static void OooO0o0(Drawable drawable, C21564OoooO0O c21564OoooO0O, int[] iArr) {
        PorterDuff.Mode mode = C21556Oooo0OO.f63052OooO0o;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c21564OoooO0O.f63091OooO0Oo;
        if (!z && !c21564OoooO0O.f63090OooO0OO) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterOooO0o0 = null;
        ColorStateList colorStateList = z ? c21564OoooO0O.f63088OooO00o : null;
        PorterDuff.Mode mode2 = c21564OoooO0O.f63090OooO0OO ? c21564OoooO0O.f63089OooO0O0 : C21556Oooo0OO.f63052OooO0o;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterOooO0o0 = C21556Oooo0OO.OooO0o0(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterOooO0o0);
    }

    public final synchronized Drawable OooO0O0(Context context, int i) {
        return this.f62912OooO00o.OooO0OO(context, i);
    }
}
