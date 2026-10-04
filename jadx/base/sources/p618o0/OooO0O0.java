package p618o0;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import oO00OoO0.C32281OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0O0 implements TextWatcher {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f80951OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f80952OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Editable f80953OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C32281OooO00o f80954OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f80955OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f80956OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f80957OooOoo0;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OooO00o(Editable editable) {
        CharSequence charSequence;
        this.f80954OooOoO0.OooO0o();
        String str = "+" + this.f80955OooOoOO;
        boolean z = this.f80956OooOoo;
        if (!z) {
            int length = editable.length();
            charSequence = editable;
            if (length > 0) {
                char cCharAt = editable.charAt(0);
                charSequence = editable;
                if (cCharAt != '0') {
                    charSequence = str + ((Object) editable);
                }
            }
        }
        int length2 = charSequence.length();
        char c = 0;
        String strOooO = "";
        for (int i = 0; i < length2; i++) {
            char cCharAt2 = charSequence.charAt(i);
            if (PhoneNumberUtils.isNonSeparator(cCharAt2)) {
                if (c != 0) {
                    strOooO = this.f80954OooOoO0.OooO(c);
                }
                c = cCharAt2;
            }
        }
        if (c != 0) {
            strOooO = this.f80954OooOoO0.OooO(c);
        }
        String strTrim = strOooO.trim();
        if (z || charSequence.length() == 0 || charSequence.charAt(0) != '0') {
            strTrim = strTrim.length() > str.length() ? strTrim.charAt(str.length()) == ' ' ? strTrim.substring(str.length() + 1) : strTrim.substring(str.length()) : "";
        }
        return TextUtils.isEmpty(strTrim) ? "" : strTrim;
    }

    @Override // android.text.TextWatcher
    public final synchronized void afterTextChanged(Editable editable) {
        boolean z = true;
        if (this.f80951OooOo) {
            if (editable.length() == 0) {
                z = false;
            }
            this.f80951OooOo = z;
            return;
        }
        if (this.f80952OooOo0o) {
            return;
        }
        int selectionEnd = Selection.getSelectionEnd(editable);
        boolean z2 = selectionEnd == editable.length();
        String strOooO00o = OooO00o(editable);
        if (!strOooO00o.equals(editable.toString())) {
            if (!z2) {
                int i = 0;
                for (int i2 = 0; i2 < editable.length() && i2 < selectionEnd; i2++) {
                    if (PhoneNumberUtils.isNonSeparator(editable.charAt(i2))) {
                        i++;
                    }
                }
                selectionEnd = 0;
                int i3 = 0;
                while (true) {
                    if (selectionEnd >= strOooO00o.length()) {
                        selectionEnd = 0;
                        break;
                    } else {
                        if (i3 == i) {
                            break;
                        }
                        if (PhoneNumberUtils.isNonSeparator(strOooO00o.charAt(selectionEnd))) {
                            i3++;
                        }
                        selectionEnd++;
                    }
                }
            } else {
                selectionEnd = strOooO00o.length();
            }
        }
        if (!z2) {
            while (true) {
                int i4 = selectionEnd - 1;
                if (i4 > 0 && !PhoneNumberUtils.isNonSeparator(strOooO00o.charAt(i4))) {
                    selectionEnd--;
                }
            }
        }
        try {
            this.f80952OooOo0o = true;
            editable.replace(0, editable.length(), strOooO00o, 0, strOooO00o.length());
            this.f80952OooOo0o = false;
            this.f80953OooOoO = editable;
            Selection.setSelection(editable, selectionEnd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f80952OooOo0o || this.f80951OooOo || i2 <= 0) {
            return;
        }
        for (int i4 = i; i4 < i + i2; i4++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                if (this.f80957OooOoo0) {
                    return;
                }
                this.f80951OooOo = true;
                this.f80954OooOoO0.OooO0o();
                return;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f80952OooOo0o || this.f80951OooOo || i3 <= 0) {
            return;
        }
        for (int i4 = i; i4 < i + i3; i4++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                this.f80951OooOo = true;
                this.f80954OooOoO0.OooO0o();
                return;
            }
        }
    }
}
