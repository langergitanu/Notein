package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a$\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a<\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\n\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a(\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a(\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0011\u0010\u000f\u001a2\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a2\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0014\u001a(\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0016\u0010\u000f\u001a0\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a(\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u001b\u0010\u000f\u001a(\u0010\u001c\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\b¢\u0006\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, m80612d2 = {"Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "LoO00ooO/OooOooO;", "builderAction", "Landroid/text/SpannedString;", "buildSpannedString", "(LoO0O000o/OooOO0o;)Landroid/text/SpannedString;", "", "", "spans", "inSpans", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;LoO0O000o/OooOO0o;)Landroid/text/SpannableStringBuilder;", "span", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;LoO0O000o/OooOO0o;)Landroid/text/SpannableStringBuilder;", "bold", "(Landroid/text/SpannableStringBuilder;LoO0O000o/OooOO0o;)Landroid/text/SpannableStringBuilder;", "italic", "underline", "", "color", "(Landroid/text/SpannableStringBuilder;ILoO0O000o/OooOO0o;)Landroid/text/SpannableStringBuilder;", "backgroundColor", "strikeThrough", "", "proportion", "scale", "(Landroid/text/SpannableStringBuilder;FLoO0O000o/OooOO0o;)Landroid/text/SpannableStringBuilder;", "superscript", "subscript", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class SpannableStringBuilderKt {
    public static final SpannableStringBuilder backgroundColor(SpannableStringBuilder spannableStringBuilder, int i, InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i);
        int length = spannableStringBuilder.length();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder bold(SpannableStringBuilder spannableStringBuilder, InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannedString buildSpannedString(InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    public static final SpannableStringBuilder color(SpannableStringBuilder spannableStringBuilder, int i, InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = spannableStringBuilder.length();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object[] objArr, InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        int length = spannableStringBuilder.length();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder italic(SpannableStringBuilder spannableStringBuilder, InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder scale(SpannableStringBuilder spannableStringBuilder, float f, InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length = spannableStringBuilder.length();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder strikeThrough(SpannableStringBuilder spannableStringBuilder, InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder subscript(SpannableStringBuilder spannableStringBuilder, InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder superscript(SpannableStringBuilder spannableStringBuilder, InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder underline(SpannableStringBuilder spannableStringBuilder, InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object obj, InterfaceC32507OooOO0o<? super SpannableStringBuilder, C32460OooOooO> interfaceC32507OooOO0o) {
        int length = spannableStringBuilder.length();
        interfaceC32507OooOO0o.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
