package com.orion.notein.p607ui.user.message;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.orion.notein.p607ui.user.message.OooO00o;
import kotlin.jvm.internal.OooOOO0;
import o0oOoOo.C31057OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 extends ClickableSpan {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f79791OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ URLSpan f79792OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO00o.C23875OooO0o0 f79793OooOoO0;

    public OooO0O0(URLSpan uRLSpan, OooO00o oooO00o, OooO00o.C23875OooO0o0 c23875OooO0o0) {
        this.f79792OooOo0o = uRLSpan;
        this.f79791OooOo = oooO00o;
        this.f79793OooOoO0 = c23875OooO0o0;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        OooO00o.InterfaceC23874OooO0Oo interfaceC23874OooO0Oo;
        OooOOO0.OooO0oO(widget, "widget");
        URLSpan uRLSpan = this.f79792OooOo0o;
        if (uRLSpan == null || (interfaceC23874OooO0Oo = this.f79791OooOo.f79784OooO0O0) == null) {
            return;
        }
        Object tag = this.f79793OooOoO0.itemView.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteinMessageVO");
        String url = uRLSpan.getURL();
        OooOOO0.OooO0o(url, "getURL(...)");
        interfaceC23874OooO0Oo.OooO00o((C31057OooOoo0) tag, url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        OooOOO0.OooO0oO(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }
}
