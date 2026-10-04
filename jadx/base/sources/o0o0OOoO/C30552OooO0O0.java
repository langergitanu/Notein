package o0o0OOoO;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.pay.aiquota.AiQuotaPayDialogFragment;
import o0oOoOoO.C31099OooO0o0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0o0OOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30552OooO0O0 extends ClickableSpan {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AiQuotaPayDialogFragment f109287OooOo0o;

    public C30552OooO0O0(AiQuotaPayDialogFragment aiQuotaPayDialogFragment) {
        this.f109287OooOo0o = aiQuotaPayDialogFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(widget, "widget");
        Context contextRequireContext = this.f109287OooOo0o.requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
        ds.setColor(this.f109287OooOo0o.requireContext().getColor(R.color.text_blue));
    }
}
