package o0OoO000;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0OoO000.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28549Oooo0O0 extends ClickableSpan {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TextView f101193OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f101194OooOo0o;

    public C28549Oooo0O0(oO0O000o.OooO00o<C32460OooOooO> oooO00o, TextView textView) {
        this.f101194OooOo0o = oooO00o;
        this.f101193OooOo = textView;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(widget, "widget");
        this.f101194OooOo0o.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
        TextView textView = this.f101193OooOo;
        ds.setColor(textView.getCurrentTextColor());
        ds.setTypeface(Typeface.create(textView.getTypeface(), 1));
    }
}
