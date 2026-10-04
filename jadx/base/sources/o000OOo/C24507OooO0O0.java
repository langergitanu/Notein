package o000OOo;

import OooO0Oo.C20398OooO0O0;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0O0O00.C25851OooO0o0;

/* JADX INFO: renamed from: o000OOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24507OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CharSequence f82882OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f82883OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f82884OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final BreakIterator f82885OooO0Oo;

    /* JADX INFO: renamed from: o000OOo.OooO0O0$OooO00o */
    public static final class OooO00o {
        public static boolean OooO00o(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public C24507OooO0O0(CharSequence charSequence, int i, Locale locale) {
        this.f82882OooO00o = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        OooOOO0.OooO0o(wordInstance, "getWordInstance(locale)");
        this.f82885OooO0Oo = wordInstance;
        this.f82883OooO0O0 = Math.max(0, -50);
        this.f82884OooO0OO = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new C25851OooO0o0(i, charSequence));
    }

    public final void OooO00o(int i) {
        int i2 = this.f82883OooO0O0;
        int i3 = this.f82884OooO0OO;
        if (i > i3 || i2 > i) {
            throw new IllegalArgumentException(C20398OooO0O0.OooO00o(']', C20398OooO0O0.OooO0O0("Invalid offset: ", i, ". Valid range is [", " , ", i2), i3).toString());
        }
    }

    public final boolean OooO0O0(int i) {
        return i <= this.f82884OooO0OO && this.f82883OooO0O0 + 1 <= i && Character.isLetterOrDigit(Character.codePointBefore(this.f82882OooO00o, i));
    }

    public final boolean OooO0OO(int i) {
        int i2 = this.f82883OooO0O0 + 1;
        if (i > this.f82884OooO0OO || i2 > i) {
            return false;
        }
        return OooO00o.OooO00o(Character.codePointBefore(this.f82882OooO00o, i));
    }

    public final boolean OooO0Oo(int i) {
        return i < this.f82884OooO0OO && this.f82883OooO0O0 <= i && Character.isLetterOrDigit(Character.codePointAt(this.f82882OooO00o, i));
    }

    public final boolean OooO0o0(int i) {
        if (i >= this.f82884OooO0OO || this.f82883OooO0O0 > i) {
            return false;
        }
        return OooO00o.OooO00o(Character.codePointAt(this.f82882OooO00o, i));
    }
}
