package o0OoO0oO;

import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.widget.colorpickerpopupwindow.ColorPickerBottomSheetDialog;
import o0O0o0oO.ViewOnClickListenerC26036Oooo;
import o0Oo00oO.C28038OooO0Oo;
import o0oOoo0O.C31144OooO00o;
import o0oOoo0O.C31147OooO0Oo;

/* JADX INFO: renamed from: o0OoO0oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28679OooO0oo extends C31144OooO00o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ViewOnClickListenerC26036Oooo f101624OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f101625OooOO0O;

    /* JADX INFO: renamed from: o0OoO0oO.OooO0oo$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }
    }

    @Override // o0oOoo0O.C31144OooO00o
    public final void OooO0O0(View contentView) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(contentView, "contentView");
        if (!C28038OooO0Oo.OooO0O0(this.f111117OooO00o)) {
            OooO00o().setElevation(10.0f);
            OooO00o().setOutsideTouchable(true);
            OooO00o().setInputMethodMode(1);
            OooO00o().setSoftInputMode(16);
            OooO00o().getContentView().setSystemUiVisibility(2);
        }
        contentView.setBackground(contentView.getContext().getDrawable(R.drawable.page_color_add_popup_window_bg));
        ((TextView) contentView.findViewById(R.id.label_color_hex)).setTextColor(ContextCompat.getColor(contentView.getContext(), R.color.item_text_description_color));
        EditText editText = (EditText) contentView.findViewById(R.id.color_hex);
        editText.setTextColor(ContextCompat.getColor(contentView.getContext(), R.color.item_text_name_color));
        editText.setBackground(editText.getContext().getDrawable(R.drawable.page_create_color_picker_hex_border_bg));
        ((TextView) contentView.findViewById(R.id.label_color_alpha)).setTextColor(ContextCompat.getColor(contentView.getContext(), R.color.item_text_name_color_disable));
        EditText editText2 = (EditText) contentView.findViewById(R.id.color_alpha);
        editText2.setTextColor(ContextCompat.getColor(contentView.getContext(), R.color.item_text_name_color_disable));
        editText2.setBackground(editText2.getContext().getDrawable(R.drawable.page_create_color_picker_alpha_border_bg));
        ((TextView) contentView.findViewById(R.id.tv_add_color)).setText(contentView.getContext().getString(R.string.note_creation_create_page_color));
        final View viewFindViewById = contentView.findViewById(R.id.cl_add_color);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById);
        viewFindViewById.setVisibility(0);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: o0OoO0oO.OooO0oO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C28679OooO0oo c28679OooO0oo = this;
                viewFindViewById.setTag(Integer.valueOf(c28679OooO0oo.f101625OooOO0O));
                ViewOnClickListenerC26036Oooo viewOnClickListenerC26036Oooo = c28679OooO0oo.f101624OooOO0;
                if (viewOnClickListenerC26036Oooo != null) {
                    viewOnClickListenerC26036Oooo.onClick(view);
                }
            }
        });
        SeekBar seekBar = (SeekBar) contentView.findViewById(R.id.alpha_bar);
        seekBar.setEnabled(false);
        seekBar.setVisibility(8);
        OooO00o oooO00o = new OooO00o();
        this.f111123OooO0oO = oooO00o;
        ColorPickerBottomSheetDialog colorPickerBottomSheetDialog = this.f111120OooO0Oo;
        if (colorPickerBottomSheetDialog != null) {
            colorPickerBottomSheetDialog.f80136OooOoO0 = oooO00o;
            C31147OooO0Oo c31147OooO0Oo = colorPickerBottomSheetDialog.f80138OooOoo0;
            if (c31147OooO0Oo != null) {
                c31147OooO0Oo.f111131OooO0OO = oooO00o;
            }
        }
    }
}
