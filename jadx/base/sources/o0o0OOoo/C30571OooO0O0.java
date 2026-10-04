package o0o0OOoo;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.orion.notein.p607ui.pay.google.CancelSubscriptionAlertDialog;

/* JADX INFO: renamed from: o0o0OOoo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30571OooO0O0 extends ClickableSpan {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ CancelSubscriptionAlertDialog f109378OooOo0o;

    public C30571OooO0O0(CancelSubscriptionAlertDialog cancelSubscriptionAlertDialog) {
        this.f109378OooOo0o = cancelSubscriptionAlertDialog;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(widget, "widget");
        this.f109378OooOo0o.Oooo00O();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }
}
