package o000O000;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: o000O000.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24386OooOOOo implements Spannable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Spannable f82291OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f82292OooOo0o = false;

    /* JADX INFO: renamed from: o000O000.OooOOOo$OooO00o */
    public static class OooO00o {
        public boolean OooO00o(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    /* JADX INFO: renamed from: o000O000.OooOOOo$OooO0O0 */
    public static class OooO0O0 extends OooO00o {
        @Override // o000O000.C24386OooOOOo.OooO00o
        public final boolean OooO00o(CharSequence charSequence) {
            return C24387OooOOo0.OooO00o(charSequence) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    public C24386OooOOOo(Spannable spannable) {
        this.f82291OooOo = spannable;
    }

    public final void OooO00o() {
        Spannable spannable = this.f82291OooOo;
        if (!this.f82292OooOo0o) {
            if ((Build.VERSION.SDK_INT < 28 ? new OooO00o() : new OooO0O0()).OooO00o(spannable)) {
                this.f82291OooOo = new SpannableString(spannable);
            }
        }
        this.f82292OooOo0o = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f82291OooOo.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f82291OooOo.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f82291OooOo.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f82291OooOo.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f82291OooOo.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f82291OooOo.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f82291OooOo.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f82291OooOo.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f82291OooOo.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        OooO00o();
        this.f82291OooOo.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        OooO00o();
        this.f82291OooOo.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f82291OooOo.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f82291OooOo.toString();
    }
}
