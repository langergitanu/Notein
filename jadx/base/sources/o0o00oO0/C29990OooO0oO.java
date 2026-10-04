package o0o00oO0;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.framework.common.ContextCompat;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.colorpicker.ColorPickerView;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0oOo.o00Ooo;
import o0OoO000.o0OO00O;
import o0OoO000.o0Oo0oo;
import o0OoO000.oo0o0Oo;
import o0o00Ooo.C29915OooO0OO;
import o0o00Ooo.C29920OooO0oo;
import o0o00o0.C29935OooO0o0;
import o0o00o0.InterfaceC29930OooO00o;
import oO0o0O0o.C33596OooOOo0;

/* JADX INFO: renamed from: o0o00oO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29990OooO0oO implements InterfaceC29930OooO00o {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final int[] f106521Oooo0oo = {SupportMenu.CATEGORY_MASK, -4608, -10485950, -16713217, -13958913, -4980481, SupportMenu.CATEGORY_MASK};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final View f106522OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f106523OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final View f106524OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final TextView f106525OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final TextView f106526OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ViewGroup f106527OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final View f106528OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ColorPickerView f106529OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final SeekBar f106530OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final TextView f106531Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final SeekBar f106532Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final View f106533Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final TextView f106534Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final ViewGroup f106535Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final RecyclerView f106536Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public C29935OooO0o0 f106537Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public PenColorVO f106538Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f106539Oooo0oO;

    public C29990OooO0oO(int i, View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        this.f106523OooOo0o = i;
        View viewFindViewById = view.findViewById(R.id.btn_eyedropper);
        this.f106522OooOo = viewFindViewById;
        TextView textView = (TextView) view.findViewById(R.id.tab_color_picker);
        this.f106525OooOoO0 = textView;
        this.f106524OooOoO = view.findViewById(R.id.color_picker_focus_bar);
        TextView textView2 = (TextView) view.findViewById(R.id.tab_color_sets);
        this.f106526OooOoOO = textView2;
        this.f106528OooOoo0 = view.findViewById(R.id.color_sets_focus_bar);
        this.f106527OooOoo = (ViewGroup) view.findViewById(R.id.color_picker_wrapper);
        ColorPickerView colorPickerView = (ColorPickerView) view.findViewById(R.id.color_picker);
        this.f106529OooOooO = colorPickerView;
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.hue_bar);
        this.f106530OooOooo = seekBar;
        SeekBar seekBar2 = (SeekBar) view.findViewById(R.id.alpha_bar);
        this.f106532Oooo000 = seekBar2;
        this.f106533Oooo00O = view.findViewById(R.id.color);
        TextView textView3 = (TextView) view.findViewById(R.id.color_alpha);
        this.f106534Oooo00o = textView3;
        TextView textView4 = (TextView) view.findViewById(R.id.color_hex);
        this.f106531Oooo0 = textView4;
        this.f106535Oooo0O0 = (ViewGroup) view.findViewById(R.id.color_set_wrapper);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.color_set_list);
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        recyclerView.setAdapter(C28038OooO0Oo.OooO0O0(context) ? new C29915OooO0OO(R.layout.item_color_set_bottom_sheet, R.layout.item_color_set_color_bottom_sheet) : new C29915OooO0OO(0));
        this.f106536Oooo0OO = recyclerView;
        viewFindViewById.setOnClickListener(new oo0o0Oo(this, 3));
        textView.setOnClickListener(new o0Oo0oo(this, 1));
        textView2.setOnClickListener(new o0OO00O(this, 4));
        colorPickerView.setCallback(new C29989OooO0o0(this));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, i, 0.0f, f106521Oooo0oo, (float[]) null, Shader.TileMode.CLAMP);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(linearGradient);
        seekBar.setProgressDrawable(shapeDrawable);
        seekBar.setOnSeekBarChangeListener(new C29988OooO0o(this));
        OooO0o();
        seekBar2.setOnSeekBarChangeListener(new C29987OooO0Oo(this));
        textView4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o00oO0.OooO0OO
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i2, KeyEvent keyEvent) {
                C29935OooO0o0 c29935OooO0o0;
                Integer numOooOO0o = C33596OooOOo0.OooOO0o(16, textView5.getText().toString());
                int iIntValue = numOooOO0o != null ? numOooOO0o.intValue() : 0;
                Integer numOooOOO0 = C33596OooOOo0.OooOOO0(textView5.getText().toString());
                int i3 = (((int) ((((numOooOOO0 != null ? numOooOOO0.intValue() : 100) <= 100 ? r4 : 100) / 100.0f) * 255)) << 24) | iIntValue;
                C29990OooO0oO c29990OooO0oO = this.f106517OooOo0o;
                c29990OooO0oO.OooO0OO(i3);
                float[] fArr = new float[3];
                Color.colorToHSV(c29990OooO0oO.f106539Oooo0oO, fArr);
                c29990OooO0oO.f106530OooOooo.setProgress((int) fArr[0]);
                c29990OooO0oO.f106532Oooo000.setProgress((c29990OooO0oO.f106539Oooo0oO >> 24) & 255);
                c29990OooO0oO.f106529OooOooO.setColor(c29990OooO0oO.f106539Oooo0oO | ViewCompat.MEASURED_STATE_MASK);
                PenColorVO penColorVO = c29990OooO0oO.f106538Oooo0o0;
                if (penColorVO != null && (c29935OooO0o0 = c29990OooO0oO.f106537Oooo0o) != null) {
                    int type = penColorVO.getType();
                    int index = penColorVO.getIndex();
                    int i4 = c29990OooO0oO.f106539Oooo0oO;
                    PenBox.OooO0o oooO0o = c29935OooO0o0.f106279OooO0O0;
                    if (oooO0o != null) {
                        oooO0o.OooO00o(type, index, i4);
                    }
                }
                TextView textView6 = c29990OooO0oO.f106531Oooo0;
                Object systemService = ContextCompat.getSystemService(textView6.getContext(), "input_method");
                kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(textView6.getWindowToken(), 0);
                return true;
            }
        });
        textView3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o00oO0.OooO0O0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i2, KeyEvent keyEvent) {
                C29935OooO0o0 c29935OooO0o0;
                Integer numOooOOO0 = C33596OooOOo0.OooOOO0(textView5.getText().toString());
                int iOooO0O0 = oO0O00O.OooO00o.OooO0O0((((numOooOOO0 != null ? numOooOOO0.intValue() : 100) <= 100 ? r4 : 100) / 100.0f) * 255);
                C29990OooO0oO c29990OooO0oO = this.f106516OooOo0o;
                Integer numOooOO0o = C33596OooOOo0.OooOO0o(16, c29990OooO0oO.f106531Oooo0.getText().toString());
                c29990OooO0oO.OooO0OO((iOooO0O0 << 24) | (numOooOO0o != null ? numOooOO0o.intValue() : 0));
                float[] fArr = new float[3];
                Color.colorToHSV(c29990OooO0oO.f106539Oooo0oO, fArr);
                c29990OooO0oO.f106530OooOooo.setProgress((int) fArr[0]);
                c29990OooO0oO.f106532Oooo000.setProgress((c29990OooO0oO.f106539Oooo0oO >> 24) & 255);
                c29990OooO0oO.f106529OooOooO.setColor(c29990OooO0oO.f106539Oooo0oO | ViewCompat.MEASURED_STATE_MASK);
                PenColorVO penColorVO = c29990OooO0oO.f106538Oooo0o0;
                if (penColorVO != null && (c29935OooO0o0 = c29990OooO0oO.f106537Oooo0o) != null) {
                    int type = penColorVO.getType();
                    int index = penColorVO.getIndex();
                    int i3 = c29990OooO0oO.f106539Oooo0oO;
                    PenBox.OooO0o oooO0o = c29935OooO0o0.f106279OooO0O0;
                    if (oooO0o != null) {
                        oooO0o.OooO00o(type, index, i3);
                    }
                }
                TextView textView6 = c29990OooO0oO.f106534Oooo00o;
                Object systemService = ContextCompat.getSystemService(textView6.getContext(), "input_method");
                kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(textView6.getWindowToken(), 0);
                return true;
            }
        });
        RecyclerView.AbstractC22062OooO0oO adapter = recyclerView.getAdapter();
        kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorSetAdapter");
        ((C29915OooO0OO) adapter).f106139OooO0Oo = new o00Ooo(this, 3);
        this.f106539Oooo0oO = -1;
    }

    public final void OooO00o(PenColorVO vo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(vo, "vo");
        OooO0o0(0);
        this.f106536Oooo0OO.scrollToPosition(0);
        this.f106538Oooo0o0 = vo;
        OooO0OO(vo.getColor());
        float[] fArr = new float[3];
        Color.colorToHSV(this.f106539Oooo0oO, fArr);
        this.f106530OooOooo.setProgress((int) fArr[0]);
        this.f106532Oooo000.setProgress((this.f106539Oooo0oO >> 24) & 255);
        this.f106529OooOooO.setColor(this.f106539Oooo0oO | ViewCompat.MEASURED_STATE_MASK);
    }

    public final void OooO0O0(boolean z) {
        this.f106532Oooo000.setVisibility(z ? 0 : 8);
        this.f106534Oooo00o.setEnabled(z);
    }

    public final void OooO0OO(int i) {
        this.f106539Oooo0oO = i;
        View view = this.f106533Oooo00O;
        Drawable background = view.getBackground();
        kotlin.jvm.internal.OooOOO0.OooO0o0(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setColor(i);
        view.setBackground(gradientDrawable);
        String str = String.format("%06x", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & i)}, 1));
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.OooOOO0.OooO0o(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
        this.f106531Oooo0.setText(upperCase);
        this.f106534Oooo00o.setText(String.valueOf((int) ((((i >> 24) & 255) / 255.0f) * 100.0f)));
        OooO0o();
    }

    public final void OooO0Oo(boolean z) {
        this.f106522OooOo.setVisibility(z ? 0 : 8);
    }

    public final void OooO0o() {
        float[] fArr = new float[3];
        Color.colorToHSV(this.f106539Oooo0oO, fArr);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f106523OooOo0o, 0.0f, Color.HSVToColor(0, fArr), Color.HSVToColor(255, fArr), Shader.TileMode.CLAMP);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(linearGradient);
        SeekBar seekBar = this.f106532Oooo000;
        Context context = seekBar.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        if (C28038OooO0Oo.OooO0O0(context)) {
            seekBar.setProgressDrawable(shapeDrawable);
            return;
        }
        final LayerDrawable layerDrawable = new LayerDrawable(new ShapeDrawable[]{shapeDrawable});
        layerDrawable.setLayerHeight(0, o000000O.OooO0o(16));
        layerDrawable.setLayerInset(0, 0, o000000O.OooO0o(4), 0, 0);
        seekBar.post(new Runnable() { // from class: o0o00oO0.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                this.f106515OooOo0o.f106532Oooo000.setProgressDrawable(layerDrawable);
            }
        });
    }

    public final void OooO0o0(int i) {
        boolean z = i == 0;
        boolean z2 = i == 1;
        this.f106525OooOoO0.setSelected(z);
        this.f106524OooOoO.setVisibility(z ? 0 : 4);
        this.f106527OooOoo.setVisibility(z ? 0 : 4);
        this.f106526OooOoOO.setSelected(z2);
        this.f106528OooOoo0.setVisibility(z2 ? 0 : 4);
        this.f106535Oooo0O0.setVisibility(z2 ? 0 : 8);
    }

    @Override // o0o00o0.InterfaceC29930OooO00o
    public final void OooOOo(List<C29920OooO0oo> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        RecyclerView.AbstractC22062OooO0oO adapter = this.f106536Oooo0OO.getAdapter();
        kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorSetAdapter");
        ((C29915OooO0OO) adapter).OooO0Oo(list);
    }

    @Override // o0o00o0.InterfaceC29930OooO00o
    public final void onDismiss() {
        RecyclerView.AbstractC22062OooO0oO adapter = this.f106536Oooo0OO.getAdapter();
        kotlin.jvm.internal.OooOOO0.OooO0o0(adapter, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorSetAdapter");
        C29915OooO0OO.OooO0O0 oooO0O0 = ((C29915OooO0OO) adapter).f106140OooO0o0;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(false);
        }
    }
}
