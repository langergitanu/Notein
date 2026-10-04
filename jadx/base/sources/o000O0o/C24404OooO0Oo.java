package o000O0o;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.OooO0OO;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o000O0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24404OooO0Oo implements InputFilter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextView f82390OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f82391OooO0O0;

    /* JADX INFO: renamed from: o000O0o.OooO0Oo$OooO00o */
    public static class OooO00o extends OooO0OO.AbstractC21864OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference f82392OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final WeakReference f82393OooO0O0;

        public OooO00o(TextView textView, C24404OooO0Oo c24404OooO0Oo) {
            this.f82392OooO00o = new WeakReference(textView);
            this.f82393OooO0O0 = new WeakReference(c24404OooO0Oo);
        }

        @Override // androidx.emoji2.text.OooO0OO.AbstractC21864OooO0o0
        public final void OooO0O0() throws Throwable {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.f82392OooO00o.get();
            InputFilter inputFilter = (InputFilter) this.f82393OooO0O0.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        androidx.emoji2.text.OooO0OO oooO0OOOooO00o = androidx.emoji2.text.OooO0OO.OooO00o();
                        if (text == null) {
                            length = 0;
                        } else {
                            oooO0OOOooO00o.getClass();
                            length = text.length();
                        }
                        CharSequence charSequenceOooO0o = oooO0OOOooO00o.OooO0o(text, 0, length);
                        if (text == charSequenceOooO0o) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(charSequenceOooO0o);
                        int selectionEnd = Selection.getSelectionEnd(charSequenceOooO0o);
                        textView.setText(charSequenceOooO0o);
                        if (charSequenceOooO0o instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequenceOooO0o;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public C24404OooO0Oo(TextView textView) {
        this.f82390OooO00o = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f82390OooO00o;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iOooO0O0 = androidx.emoji2.text.OooO0OO.OooO00o().OooO0O0();
        if (iOooO0O0 != 0) {
            if (iOooO0O0 == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return androidx.emoji2.text.OooO0OO.OooO00o().OooO0o(charSequence, 0, charSequence.length());
            }
            if (iOooO0O0 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.OooO0OO oooO0OOOooO00o = androidx.emoji2.text.OooO0OO.OooO00o();
        if (this.f82391OooO0O0 == null) {
            this.f82391OooO0O0 = new OooO00o(textView, this);
        }
        oooO0OOOooO00o.OooO0oO(this.f82391OooO0O0);
        return charSequence;
    }
}
