package androidx.constraintlayout.utils.widget;

import androidx.appcompat.widget.AppCompatButton;

/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f63842OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f63843OooOo0o;

    public float getRound() {
        return this.f63842OooOo;
    }

    public float getRoundPercent() {
        return this.f63843OooOo0o;
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f63842OooOo = f;
            float f2 = this.f63843OooOo0o;
            this.f63843OooOo0o = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f63842OooOo != f;
        this.f63842OooOo = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            getWidth();
            getHeight();
            throw null;
        }
        setClipToOutline(false);
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f63843OooOo0o != f;
        this.f63843OooOo0o = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            Math.min(getWidth(), getHeight());
            throw null;
        }
        setClipToOutline(false);
        if (z) {
            invalidateOutline();
        }
    }
}
