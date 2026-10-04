package o0ooo;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.ocr.dialog.ReplacePageSelectorDialogFragment;

/* JADX INFO: renamed from: o0ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31690OooO0oo implements TextWatcher {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ReplacePageSelectorDialogFragment f113229OooOo0o;

    public C31690OooO0oo(ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment) {
        this.f113229OooOo0o = replacePageSelectorDialogFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ReplacePageSelectorDialogFragment replacePageSelectorDialogFragment = this.f113229OooOo0o;
        try {
            int i4 = Integer.parseInt(String.valueOf(charSequence));
            int iIntValue = ((Number) replacePageSelectorDialogFragment.Oooo0().f108655OooOOO.getValue()).intValue();
            if (i4 < 1 || i4 > iIntValue) {
                EditText editText = replacePageSelectorDialogFragment.f78295Oooo;
                if (editText != null) {
                    editText.setTextColor(ContextCompat.getColor(editText.getContext(), R.color.warning_color));
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputPageNum");
                    throw null;
                }
            }
            EditText editText2 = replacePageSelectorDialogFragment.f78295Oooo;
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
