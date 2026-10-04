package o000O0o;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.OooO0OO;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o000O0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24406OooO0oO implements TextWatcher {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO00o f82401OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final EditText f82402OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f82403OooOoO0 = true;

    /* JADX INFO: renamed from: o000O0o.OooO0oO$OooO00o */
    public static class OooO00o extends OooO0OO.AbstractC21864OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference f82404OooO00o;

        public OooO00o(EditText editText) {
            this.f82404OooO00o = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.OooO0OO.AbstractC21864OooO0o0
        public final void OooO0O0() throws Throwable {
            C24406OooO0oO.OooO00o((EditText) this.f82404OooO00o.get(), 1);
        }
    }

    public C24406OooO0oO(EditText editText) {
        this.f82402OooOo0o = editText;
    }

    public static void OooO00o(EditText editText, int i) throws Throwable {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.OooO0OO oooO0OOOooO00o = androidx.emoji2.text.OooO0OO.OooO00o();
            if (editableText == null) {
                length = 0;
            } else {
                oooO0OOOooO00o.getClass();
                length = editableText.length();
            }
            oooO0OOOooO00o.OooO0o(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.f82402OooOo0o;
        if (!editText.isInEditMode() && this.f82403OooOoO0 && androidx.emoji2.text.OooO0OO.OooO0OO() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iOooO0O0 = androidx.emoji2.text.OooO0OO.OooO00o().OooO0O0();
            if (iOooO0O0 != 0) {
                if (iOooO0O0 == 1) {
                    androidx.emoji2.text.OooO0OO.OooO00o().OooO0o((Spannable) charSequence, i, i3 + i);
                    return;
                } else if (iOooO0O0 != 3) {
                    return;
                }
            }
            androidx.emoji2.text.OooO0OO oooO0OOOooO00o = androidx.emoji2.text.OooO0OO.OooO00o();
            if (this.f82401OooOo == null) {
                this.f82401OooOo = new OooO00o(editText);
            }
            oooO0OOOooO00o.OooO0oO(this.f82401OooOo);
        }
    }
}
