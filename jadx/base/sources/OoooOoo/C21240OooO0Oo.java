package OoooOoo;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: OoooOoo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21240OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C21240OooO0Oo f61622OooO00o = new C21240OooO0Oo();

    public final CharSequence OooO(AutofillValue value) {
        OooOOO0.OooO0oO(value, "value");
        CharSequence textValue = value.getTextValue();
        OooOOO0.OooO0o(textValue, "value.textValue");
        return textValue;
    }

    public final AutofillId OooO00o(ViewStructure structure) {
        OooOOO0.OooO0oO(structure, "structure");
        return structure.getAutofillId();
    }

    public final boolean OooO0O0(AutofillValue value) {
        OooOOO0.OooO0oO(value, "value");
        return value.isDate();
    }

    public final boolean OooO0OO(AutofillValue value) {
        OooOOO0.OooO0oO(value, "value");
        return value.isList();
    }

    public final boolean OooO0Oo(AutofillValue value) {
        OooOOO0.OooO0oO(value, "value");
        return value.isText();
    }

    public final void OooO0o(ViewStructure structure, String[] hints) {
        OooOOO0.OooO0oO(structure, "structure");
        OooOOO0.OooO0oO(hints, "hints");
        structure.setAutofillHints(hints);
    }

    public final boolean OooO0o0(AutofillValue value) {
        OooOOO0.OooO0oO(value, "value");
        return value.isToggle();
    }

    public final void OooO0oO(ViewStructure structure, AutofillId parent, int i) {
        OooOOO0.OooO0oO(structure, "structure");
        OooOOO0.OooO0oO(parent, "parent");
        structure.setAutofillId(parent, i);
    }

    public final void OooO0oo(ViewStructure structure, int i) {
        OooOOO0.OooO0oO(structure, "structure");
        structure.setAutofillType(i);
    }
}
