package com.orion.notein.p607ui.noteeditor.propertypanel.comment;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/comment/QuoteIconView;", "Landroid/view/View;", "", C18437z2.f56754h, "LoO00ooO/OooOooO;", "setQuoteType", "(I)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class QuoteIconView extends View {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f75793OooOo0o;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        int i = this.f75793OooOo0o;
        if (i == 0) {
            canvas.drawColor(Color.parseColor("#fff07f"));
            throw null;
        }
        if (i == 1) {
            canvas.drawRect(new Rect(0, 0, getWidth(), getHeight()), (Paint) null);
            throw null;
        }
        if (i != 2) {
            return;
        }
        canvas.drawRect(new Rect(0, 0, getWidth(), getHeight()), (Paint) null);
        throw null;
    }

    public final void setQuoteType(int type) {
        this.f75793OooOo0o = type;
        invalidate();
    }
}
