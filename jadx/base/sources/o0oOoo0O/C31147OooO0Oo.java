package o0oOoo0O;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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
import o0OoO0oO.C28679OooO0oo;
import oO0o0O0o.C33596OooOOo0;

/* JADX INFO: renamed from: o0oOoo0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31147OooO0Oo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int[] f111127OooOO0O = {SupportMenu.CATEGORY_MASK, -4608, -10485950, -16713217, -13958913, -4980481, SupportMenu.CATEGORY_MASK};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final TextView f111128OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f111129OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f111130OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C28679OooO0oo.OooO00o f111131OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ColorPickerView f111132OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final SeekBar f111133OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SeekBar f111134OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final View f111135OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final TextView f111136OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f111137OooOO0;

    /* JADX INFO: renamed from: o0oOoo0O.OooO0Oo$OooO00o */
    public static final class OooO00o implements ColorPickerView.OooO00o {
        public OooO00o() {
        }

        @Override // com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorPickerView.OooO00o
        public final void OooO00o(int i) {
            C28679OooO0oo.OooO00o oooO00o = C31147OooO0Oo.this.f111131OooO0OO;
            if (oooO00o != null) {
                C28679OooO0oo.this.f101625OooOO0O = i;
            }
        }

        @Override // com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorPickerView.OooO00o
        public final void OooO0O0(int i) {
            C31147OooO0Oo c31147OooO0Oo = C31147OooO0Oo.this;
            c31147OooO0Oo.OooO00o((i & 16777215) | (((c31147OooO0Oo.f111137OooOO0 >> 24) & 255) << 24));
        }
    }

    /* JADX INFO: renamed from: o0oOoo0O.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 implements SeekBar.OnSeekBarChangeListener {
        public OooO0O0() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            OooOOO0.OooO0oO(seekBar, "seekBar");
            int progress = seekBar.getProgress();
            C31147OooO0Oo c31147OooO0Oo = C31147OooO0Oo.this;
            float[] fArr = {progress, 0.0f, 0.0f};
            Color.colorToHSV(c31147OooO0Oo.f111137OooOO0, fArr);
            c31147OooO0Oo.f111132OooO0Oo.setColorHSV(fArr);
            c31147OooO0Oo.OooO00o(Color.HSVToColor((c31147OooO0Oo.f111137OooOO0 >> 24) & 255, fArr));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            OooOOO0.OooO0oO(seekBar, "seekBar");
            C31147OooO0Oo c31147OooO0Oo = C31147OooO0Oo.this;
            C28679OooO0oo.OooO00o oooO00o = c31147OooO0Oo.f111131OooO0OO;
            if (oooO00o != null) {
                C28679OooO0oo.this.f101625OooOO0O = c31147OooO0Oo.f111137OooOO0;
            }
        }
    }

    /* JADX INFO: renamed from: o0oOoo0O.OooO0Oo$OooO0OO */
    public static final class OooO0OO implements SeekBar.OnSeekBarChangeListener {
        public OooO0OO() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            OooOOO0.OooO0oO(seekBar, "seekBar");
            int progress = seekBar.getProgress();
            C31147OooO0Oo c31147OooO0Oo = C31147OooO0Oo.this;
            int i2 = c31147OooO0Oo.f111137OooOO0;
            if (progress != ((i2 >> 24) & 255)) {
                c31147OooO0Oo.OooO00o((seekBar.getProgress() << 24) | (16777215 & i2));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            OooOOO0.OooO0oO(seekBar, "seekBar");
            C31147OooO0Oo c31147OooO0Oo = C31147OooO0Oo.this;
            C28679OooO0oo.OooO00o oooO00o = c31147OooO0Oo.f111131OooO0OO;
            if (oooO00o != null) {
                C28679OooO0oo.this.f101625OooOO0O = c31147OooO0Oo.f111137OooOO0;
            }
        }
    }

    public C31147OooO0Oo(View view, int i, boolean z) {
        this.f111129OooO00o = view;
        this.f111130OooO0O0 = i;
        ColorPickerView colorPickerView = (ColorPickerView) view.findViewById(R.id.color_picker);
        if (z) {
            float f = ColorPickerView.f76837Oooo00O;
            colorPickerView.setCorners(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        colorPickerView.setCallback(new OooO00o());
        this.f111132OooO0Oo = colorPickerView;
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.hue_bar);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, i, 0.0f, f111127OooOO0O, (float[]) null, Shader.TileMode.CLAMP);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(linearGradient);
        seekBar.setProgressDrawable(shapeDrawable);
        seekBar.setOnSeekBarChangeListener(new OooO0O0());
        this.f111134OooO0o0 = seekBar;
        SeekBar seekBar2 = (SeekBar) view.findViewById(R.id.alpha_bar);
        seekBar2.setOnSeekBarChangeListener(new OooO0OO());
        this.f111133OooO0o = seekBar2;
        OooO0O0();
        this.f111135OooO0oO = view.findViewById(R.id.color);
        TextView textView = (TextView) view.findViewById(R.id.color_hex);
        textView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0oOoo0O.OooO0O0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                Integer numOooOO0o = C33596OooOOo0.OooOO0o(16, textView2.getText().toString());
                int iIntValue = numOooOO0o != null ? numOooOO0o.intValue() : 0;
                Integer numOooOOO0 = C33596OooOOo0.OooOOO0(textView2.getText().toString());
                int i3 = (((int) ((((numOooOOO0 != null ? numOooOOO0.intValue() : 100) <= 100 ? r2 : 100) / 100.0f) * 255)) << 24) | iIntValue;
                C31147OooO0Oo c31147OooO0Oo = this.f111125OooOo0o;
                c31147OooO0Oo.OooO00o(i3);
                float[] fArr = new float[3];
                Color.colorToHSV(c31147OooO0Oo.f111137OooOO0, fArr);
                c31147OooO0Oo.f111134OooO0o0.setProgress((int) fArr[0]);
                c31147OooO0Oo.f111132OooO0Oo.setColor(c31147OooO0Oo.f111137OooOO0 | ViewCompat.MEASURED_STATE_MASK);
                C28679OooO0oo.OooO00o oooO00o = c31147OooO0Oo.f111131OooO0OO;
                if (oooO00o != null) {
                    C28679OooO0oo.this.f101625OooOO0O = c31147OooO0Oo.f111137OooOO0;
                }
                View view2 = c31147OooO0Oo.f111129OooO00o;
                Object systemService = ContextCompat.getSystemService(view2.getContext(), "input_method");
                OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                return true;
            }
        });
        this.f111128OooO = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.color_alpha);
        textView2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0oOoo0O.OooO0OO
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                Integer numOooOOO0 = C33596OooOOo0.OooOOO0(textView3.getText().toString());
                int iOooO0O0 = oO0O00O.OooO00o.OooO0O0((((numOooOOO0 != null ? numOooOOO0.intValue() : 100) <= 100 ? r2 : 100) / 100.0f) * 255);
                C31147OooO0Oo c31147OooO0Oo = this.f111126OooOo0o;
                Integer numOooOO0o = C33596OooOOo0.OooOO0o(16, c31147OooO0Oo.f111128OooO.getText().toString());
                c31147OooO0Oo.OooO00o((iOooO0O0 << 24) | (numOooOO0o != null ? numOooOO0o.intValue() : 0));
                float[] fArr = new float[3];
                Color.colorToHSV(c31147OooO0Oo.f111137OooOO0, fArr);
                c31147OooO0Oo.f111134OooO0o0.setProgress((int) fArr[0]);
                c31147OooO0Oo.f111132OooO0Oo.setColor(c31147OooO0Oo.f111137OooOO0 | ViewCompat.MEASURED_STATE_MASK);
                C28679OooO0oo.OooO00o oooO00o = c31147OooO0Oo.f111131OooO0OO;
                if (oooO00o != null) {
                    C28679OooO0oo.this.f101625OooOO0O = c31147OooO0Oo.f111137OooOO0;
                }
                View view2 = c31147OooO0Oo.f111129OooO00o;
                Object systemService = ContextCompat.getSystemService(view2.getContext(), "input_method");
                OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
                return true;
            }
        });
        this.f111136OooO0oo = textView2;
        this.f111137OooOO0 = -1;
    }

    public final void OooO00o(int i) {
        this.f111137OooOO0 = i;
        View view = this.f111135OooO0oO;
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
        this.f111128OooO.setText(upperCase);
        this.f111136OooO0oo.setText(String.valueOf((int) ((((i >> 24) & 255) / 255.0f) * 100.0f)));
        OooO0O0();
    }

    public final void OooO0O0() {
        float[] fArr = new float[3];
        Color.colorToHSV(this.f111137OooOO0, fArr);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f111130OooO0O0, 0.0f, Color.HSVToColor(0, fArr), Color.HSVToColor(255, fArr), Shader.TileMode.CLAMP);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(linearGradient);
        SeekBar seekBar = this.f111133OooO0o;
        seekBar.setProgressDrawable(shapeDrawable);
        seekBar.setProgress((this.f111137OooOO0 >> 24) & 255);
    }
}
