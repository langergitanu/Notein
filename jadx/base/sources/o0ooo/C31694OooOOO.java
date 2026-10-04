package o0ooo;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.ocr.dialog.ScannedPageSelectDialogFragment;

/* JADX INFO: renamed from: o0ooo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31694OooOOO implements TextWatcher {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ScannedPageSelectDialogFragment f113232OooOo0o;

    public C31694OooOOO(ScannedPageSelectDialogFragment scannedPageSelectDialogFragment) {
        this.f113232OooOo0o = scannedPageSelectDialogFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = this.f113232OooOo0o;
        try {
            int i4 = Integer.parseInt(String.valueOf(charSequence));
            int iIntValue = ((Number) scannedPageSelectDialogFragment.Oooo00o().f108655OooOOO.getValue()).intValue();
            if (i4 < 1 || i4 > iIntValue) {
                EditText editText = scannedPageSelectDialogFragment.f78350Oooo0oO;
                if (editText != null) {
                    editText.setTextColor(ContextCompat.getColor(editText.getContext(), R.color.warning_color));
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                    throw null;
                }
            }
            EditText editText2 = scannedPageSelectDialogFragment.f78350Oooo0oO;
            if (editText2 != null) {
                editText2.setTextColor(ContextCompat.getColor(editText2.getContext(), R.color.item_text_name_color));
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                throw null;
            }
        } catch (Exception unused) {
        }
    }
}
