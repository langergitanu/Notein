package com.orion.notein.p607ui.noteeditor.audio.view;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34426OooOO0o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34446Oooo0o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/audio/view/WaveBarsStreamView;", "Landroid/view/View;", "Lcom/orion/notein/ui/noteeditor/audio/view/WaveBarsStreamView$OooO00o;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LoO00ooO/OooOooO;", "setOnAmplitudeUpdateListener", "(Lcom/orion/notein/ui/noteeditor/audio/view/WaveBarsStreamView$OooO00o;)V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class WaveBarsStreamView extends View {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34426OooOO0o<Float> f74433OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Paint f74434OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f74435OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f74436OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f74437OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final long f74438OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final float f74439OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f74440OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final com.orion.notein.p607ui.noteeditor.audio.view.OooO00o f74441OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public OooO00o f74442Oooo000;

    public interface OooO00o {
        float OooO00o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveBarsStreamView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#1D5AC5"));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f74434OooOo0o = paint;
        this.f74433OooOo = new C34426OooOO0o<>(999);
        this.f74436OooOoO0 = o000000O.OooO0o0(2.0f);
        this.f74435OooOoO = o000000O.OooO0o0(1.5f);
        this.f74439OooOoo0 = o000000O.OooO0o0(0.5f);
        this.f74438OooOoo = 16L;
        this.f74441OooOooo = new com.orion.notein.p607ui.noteeditor.audio.view.OooO00o(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f74440OooOooO = false;
        removeCallbacks(this.f74441OooOooo);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight() / 2.0f;
        float f = this.f74437OooOoOO + width;
        float f2 = this.f74436OooOoO0;
        float f3 = this.f74435OooOoO;
        int i = (int) (f / (f2 + f3));
        List listO0ooOO0 = OooOo.o0ooOO0(this.f74433OooOo);
        int i2 = 0;
        Iterator it = new C34446Oooo0o(OooOo.o0ooOoO(listO0ooOO0.subList(listO0ooOO0.size() > i ? listO0ooOO0.size() - i : 0, listO0ooOO0.size()))).iterator();
        while (true) {
            ListIterator<T> listIterator = ((C34446Oooo0o.OooO00o) it).f123472OooOo0o;
            if (!listIterator.hasPrevious()) {
                return;
            }
            Object objPrevious = listIterator.previous();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            float fFloatValue = ((Number) objPrevious).floatValue() * height;
            float f4 = this.f74436OooOoO0;
            float f5 = (width - this.f74437OooOoOO) - ((f4 + f3) * i2);
            canvas.drawRoundRect(f5 - f4, height - fFloatValue, f5, fFloatValue + height, f4, f4, this.f74434OooOo0o);
            i2 = i3;
        }
    }

    public final void setOnAmplitudeUpdateListener(OooO00o listener) {
        OooOOO0.OooO0oO(listener, "listener");
        this.f74442Oooo000 = listener;
    }
}
