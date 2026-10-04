package o0O0OoOo;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0OO {

    public static final class OooO00o extends ClickableSpan {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Integer f88431OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C25900OooO00o f88432OooOo0o;

        public OooO00o(C25900OooO00o c25900OooO00o, Integer num) {
            this.f88432OooOo0o = c25900OooO00o;
            this.f88431OooOo = num;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            OooOOO0.OooO0oO(widget, "widget");
            this.f88432OooOo0o.f88429OooO0OO.invoke(widget);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds) {
            OooOOO0.OooO0oO(ds, "ds");
            super.updateDrawState(ds);
            Integer num = this.f88431OooOo;
            if (num != null) {
                ds.setColor(num.intValue());
            }
            ds.setUnderlineText(false);
        }
    }

    public static final void OooO00o(TextView textView, int i, C25900OooO00o... c25900OooO00oArr) {
        OooOOO0.OooO0oO(textView, "<this>");
        if (c25900OooO00oArr.length == 0) {
            textView.setText(textView.getContext().getString(i));
            textView.setMovementMethod(null);
            textView.setLinksClickable(false);
            return;
        }
        ArrayList arrayList = new ArrayList(c25900OooO00oArr.length);
        for (C25900OooO00o c25900OooO00o : c25900OooO00oArr) {
            arrayList.add(textView.getContext().getString(c25900OooO00o.f88427OooO00o));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String string = textView.getContext().getString(i, Arrays.copyOf(strArr, strArr.length));
        OooOOO0.OooO0o(string, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int length = c25900OooO00oArr.length;
        int i2 = 0;
        int i3 = 0;
        int length2 = 0;
        while (i2 < length) {
            C25900OooO00o c25900OooO00o2 = c25900OooO00oArr[i2];
            int i4 = i3 + 1;
            String str = strArr[i3];
            OooOOO0.OooO0o(str, "get(...)");
            int iOooo0O0 = C33599OooOo0O.Oooo0O0(string, str, length2, false, 4);
            if (iOooo0O0 != -1) {
                length2 = str.length() + iOooo0O0;
                Integer num = c25900OooO00o2.f88428OooO0O0;
                spannableStringBuilder.setSpan(new OooO00o(c25900OooO00o2, num != null ? Integer.valueOf(ContextCompat.getColor(textView.getContext(), num.intValue())) : null), iOooo0O0, length2, 33);
            }
            i2++;
            i3 = i4;
        }
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        textView.setLinksClickable(true);
    }
}
