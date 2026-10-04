package o0OoO000;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000OO extends ClickableSpan {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TextView f101293OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f101294OooOo0o;

    public o00000OO(oO0O000o.OooO00o<C32460OooOooO> oooO00o, TextView textView) {
        this.f101294OooOo0o = oooO00o;
        this.f101293OooOo = textView;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(widget, "widget");
        this.f101294OooOo0o.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
        TextView textView = this.f101293OooOo;
        ds.setColor(textView.getCurrentTextColor());
        ds.setTypeface(Typeface.create(textView.getTypeface(), 1));
    }
}
