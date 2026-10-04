package o0Ooo0o;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.huawei.hms.framework.common.ContextCompat;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.colorpicker.ColorPickerView;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.o0OO00O;
import o0oOOO0o.C30832OooOO0O;
import oO0o0O0o.C33596OooOOo0;

/* JADX INFO: renamed from: o0Ooo0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29415OooO0o {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int f104304OooOOO = o000000O.OooO0o(220);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final int f104305OooOOOO = o000000O.OooO0o(270);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final int[] f104306OooOOOo = {SupportMenu.CATEGORY_MASK, -4608, -10485950, -16713217, -13958913, -4980481, SupportMenu.CATEGORY_MASK};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final TextView f104307OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f104308OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PopupWindow f104309OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SeekBar f104310OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SeekBar f104311OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ImageView f104312OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ColorPickerView f104313OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final TextView f104314OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final View f104315OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final TextView f104316OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f104317OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f104318OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public C30832OooOO0O f104319OooOOO0;

    public C29415OooO0o(Context context) {
        int i = f104304OooOOO;
        this.f104308OooO00o = i;
        this.f104318OooOO0o = -1;
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        final View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_page_padding_color, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        ColorPickerView colorPickerView = (ColorPickerView) viewInflate.findViewById(R.id.color_picker);
        OooOOO0.OooO0oO(colorPickerView, "<set-?>");
        this.f104313OooO0o0 = colorPickerView;
        ColorPickerView colorPickerViewOooO0OO = OooO0OO();
        float f = ColorPickerView.f76837Oooo00O;
        colorPickerViewOooO0OO.setCorners(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        OooO0OO().setCallback(new C29414OooO0Oo(this));
        SeekBar seekBar = (SeekBar) viewInflate.findViewById(R.id.hue_bar);
        OooOOO0.OooO0oO(seekBar, "<set-?>");
        this.f104310OooO0OO = seekBar;
        float f2 = i;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f2, 0.0f, f104306OooOOOo, (float[]) null, tileMode);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(linearGradient);
        OooO0Oo().setProgressDrawable(shapeDrawable);
        OooO0Oo().setOnSeekBarChangeListener(new C29416OooO0o0(this));
        float[] fArr = new float[3];
        Color.colorToHSV(this.f104318OooOO0o, fArr);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, f2, 0.0f, Color.HSVToColor(0, fArr), Color.HSVToColor(255, fArr), tileMode);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
        shapeDrawable2.getPaint().setShader(linearGradient2);
        SeekBar seekBar2 = (SeekBar) viewInflate.findViewById(R.id.alpha_bar);
        OooOOO0.OooO0oO(seekBar2, "<set-?>");
        this.f104311OooO0Oo = seekBar2;
        OooO0O0().setProgressDrawable(shapeDrawable2);
        OooO0O0().setOnSeekBarChangeListener(new C29413OooO0OO(this));
        this.f104315OooO0oo = viewInflate.findViewById(R.id.color);
        TextView textView = (TextView) viewInflate.findViewById(R.id.color_hex);
        this.f104316OooOO0 = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.color_alpha);
        this.f104307OooO = textView2;
        textView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0Ooo0o.OooO00o
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                C30832OooOO0O c30832OooOO0O;
                Integer numOooOO0o = C33596OooOOo0.OooOO0o(16, textView3.getText().toString());
                int iIntValue = numOooOO0o != null ? numOooOO0o.intValue() : 0;
                Integer numOooOOO0 = C33596OooOOo0.OooOOO0(textView3.getText().toString());
                int i3 = (((int) ((((numOooOOO0 != null ? numOooOOO0.intValue() : 100) <= 100 ? r3 : 100) / 100.0f) * 255)) << 24) | iIntValue;
                C29415OooO0o c29415OooO0o = this.f104299OooOo0o;
                c29415OooO0o.OooO0o0(i3);
                float[] fArr2 = new float[3];
                Color.colorToHSV(c29415OooO0o.f104318OooOO0o, fArr2);
                c29415OooO0o.OooO0Oo().setProgress((int) fArr2[0]);
                c29415OooO0o.OooO0O0().setProgress(255 & (c29415OooO0o.f104318OooOO0o >> 24));
                c29415OooO0o.OooO0oO(c29415OooO0o.f104318OooOO0o);
                c29415OooO0o.OooO0OO().setColor(c29415OooO0o.f104318OooOO0o | ViewCompat.MEASURED_STATE_MASK);
                if (!c29415OooO0o.f104317OooOO0O && (c30832OooOO0O = c29415OooO0o.f104319OooOOO0) != null) {
                    c30832OooOO0O.OooO00o(c29415OooO0o.f104318OooOO0o);
                }
                View view = viewInflate;
                Object systemService2 = ContextCompat.getSystemService(view.getContext(), "input_method");
                OooOOO0.OooO0o0(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService2).hideSoftInputFromWindow(view.getWindowToken(), 0);
                return true;
            }
        });
        textView2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0Ooo0o.OooO0O0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                C30832OooOO0O c30832OooOO0O;
                Integer numOooOOO0 = C33596OooOOo0.OooOOO0(textView3.getText().toString());
                int iOooO0O0 = oO0O00O.OooO00o.OooO0O0((((numOooOOO0 != null ? numOooOOO0.intValue() : 100) <= 100 ? r3 : 100) / 100.0f) * 255);
                C29415OooO0o c29415OooO0o = this.f104301OooOo0o;
                Integer numOooOO0o = C33596OooOOo0.OooOO0o(16, c29415OooO0o.f104316OooOO0.getText().toString());
                c29415OooO0o.OooO0o0((iOooO0O0 << 24) | (numOooOO0o != null ? numOooOO0o.intValue() : 0));
                float[] fArr2 = new float[3];
                Color.colorToHSV(c29415OooO0o.f104318OooOO0o, fArr2);
                c29415OooO0o.OooO0Oo().setProgress((int) fArr2[0]);
                c29415OooO0o.OooO0O0().setProgress(255 & (c29415OooO0o.f104318OooOO0o >> 24));
                c29415OooO0o.OooO0oO(c29415OooO0o.f104318OooOO0o);
                c29415OooO0o.OooO0OO().setColor(c29415OooO0o.f104318OooOO0o | ViewCompat.MEASURED_STATE_MASK);
                if (!c29415OooO0o.f104317OooOO0O && (c30832OooOO0O = c29415OooO0o.f104319OooOOO0) != null) {
                    c30832OooOO0O.OooO00o(c29415OooO0o.f104318OooOO0o);
                }
                View view = viewInflate;
                Object systemService2 = ContextCompat.getSystemService(view.getContext(), "input_method");
                OooOOO0.OooO0o0(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService2).hideSoftInputFromWindow(view.getWindowToken(), 0);
                return true;
            }
        });
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_add_or_remove_color);
        OooOOO0.OooO0oO(textView3, "<set-?>");
        this.f104314OooO0oO = textView3;
        OooO00o().setOnClickListener(new o0OO00O(this, 3));
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_add_or_remove);
        OooOOO0.OooO0oO(imageView, "<set-?>");
        this.f104312OooO0o = imageView;
        PopupWindow popupWindow = new PopupWindow(viewInflate, i, f104305OooOOOO, true);
        this.f104309OooO0O0 = popupWindow;
        popupWindow.setElevation(10.0f);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setSoftInputMode(32);
    }

    public final TextView OooO00o() {
        TextView textView = this.f104314OooO0oO;
        if (textView != null) {
            return textView;
        }
        OooOOO0.OooOOOO("addOrRemoveText");
        throw null;
    }

    public final SeekBar OooO0O0() {
        SeekBar seekBar = this.f104311OooO0Oo;
        if (seekBar != null) {
            return seekBar;
        }
        OooOOO0.OooOOOO("alphaBar");
        throw null;
    }

    public final ColorPickerView OooO0OO() {
        ColorPickerView colorPickerView = this.f104313OooO0o0;
        if (colorPickerView != null) {
            return colorPickerView;
        }
        OooOOO0.OooOOOO("colorPickerView");
        throw null;
    }

    public final SeekBar OooO0Oo() {
        SeekBar seekBar = this.f104310OooO0OO;
        if (seekBar != null) {
            return seekBar;
        }
        OooOOO0.OooOOOO("hueSeekBar");
        throw null;
    }

    public final void OooO0o(View view, int i, boolean z, boolean z2) {
        PopupWindow popupWindow = this.f104309OooO0O0;
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
            return;
        }
        this.f104317OooOO0O = z;
        Context context = popupWindow.getContentView().getContext();
        if (this.f104317OooOO0O) {
            ImageView imageView = this.f104312OooO0o;
            if (imageView == null) {
                OooOOO0.OooOOOO("addOrRemoveIcon");
                throw null;
            }
            imageView.setImageResource(R.drawable.ic_ni_add_outline_normal);
            OooO00o().setText(R.string.add_page_padding_color);
            OooO00o().setTextColor(context.getColor(R.color.color_blue_primary));
        } else {
            ImageView imageView2 = this.f104312OooO0o;
            if (imageView2 == null) {
                OooOOO0.OooOOOO("addOrRemoveIcon");
                throw null;
            }
            imageView2.setImageResource(R.drawable.editor_menu_item_delete);
            OooO00o().setText(R.string.remove_page_padding_color);
            OooO00o().setTextColor(context.getColor(R.color.item_text_name_color));
        }
        ImageView imageView3 = this.f104312OooO0o;
        if (imageView3 == null) {
            OooOOO0.OooOOOO("addOrRemoveIcon");
            throw null;
        }
        imageView3.setEnabled(z2);
        OooO00o().setEnabled(z2);
        if (!z2) {
            OooO00o().setTextColor(context.getColor(R.color.item_text_name_color_disable));
        }
        OooO0o0(i);
        float[] fArr = new float[3];
        Color.colorToHSV(this.f104318OooOO0o, fArr);
        OooO0Oo().setProgress((int) fArr[0]);
        OooO0O0().setProgress((this.f104318OooOO0o >> 24) & 255);
        OooO0oO(this.f104318OooOO0o);
        OooO0OO().setColor(this.f104318OooOO0o | ViewCompat.MEASURED_STATE_MASK);
        View contentView = popupWindow.getContentView();
        int width = popupWindow.getWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
        int height = popupWindow.getHeight();
        contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), height == -2 ? 0 : 1073741824));
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        popupWindow.showAsDropDown(view, Math.min(-((contentView.getMeasuredWidth() - view.getWidth()) / 2), (rect.right - contentView.getMeasuredWidth()) - rect2.right), 0, 8388659);
    }

    public final void OooO0o0(int i) {
        this.f104318OooOO0o = i;
        View view = this.f104315OooO0oo;
        Drawable background = view.getBackground();
        OooOOO0.OooO0o0(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setColor(i);
        view.setBackground(gradientDrawable);
        String str = String.format("%06x", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & i)}, 1));
        Locale locale = Locale.getDefault();
        OooOOO0.OooO0o(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
        this.f104316OooOO0.setText(upperCase);
        this.f104307OooO.setText(String.valueOf((int) ((((i >> 24) & 255) / 255.0f) * 100.0f)));
    }

    public final void OooO0oO(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f104308OooO00o, 0.0f, Color.HSVToColor(0, fArr), Color.HSVToColor(255, fArr), Shader.TileMode.CLAMP);
        Drawable progressDrawable = OooO0O0().getProgressDrawable();
        OooOOO0.OooO0o0(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.ShapeDrawable");
        ((ShapeDrawable) progressDrawable).getPaint().setShader(linearGradient);
        OooO0O0().invalidate();
    }
}
