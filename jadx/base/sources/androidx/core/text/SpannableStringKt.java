package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0086\n¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0086\n¢\u0006\u0004\b\f\u0010\u0010¨\u0006\u0011"}, m80612d2 = {"", "Landroid/text/Spannable;", "toSpannable", "(Ljava/lang/CharSequence;)Landroid/text/Spannable;", "LoO00ooO/OooOooO;", "clearSpans", "(Landroid/text/Spannable;)V", "", "start", "end", "", "span", "set", "(Landroid/text/Spannable;IILjava/lang/Object;)V", "LoO0O00oo/OooO;", "range", "(Landroid/text/Spannable;LoO0O00oo/OooO;Ljava/lang/Object;)V", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class SpannableStringKt {
    public static final void clearSpans(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, int i, int i2, Object obj) {
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(Spannable spannable, oO0O00oo.OooO oooO, Object obj) {
        spannable.setSpan(obj, oooO.f116812OooOo0o, oooO.f116811OooOo, 17);
    }
}
