package com.orion.penkit.models;

import OooOoO.C20509OooO0oo;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u000f¨\u0006'"}, m80612d2 = {"Lcom/orion/penkit/models/EraserDot;", "", "", "cx", TranslateLanguage.WELSH, "radius", "<init>", "(FFF)V", "dx", "dy", "LoO00ooO/OooOooO;", "offset", "(FF)V", "factor", "scale", "(F)V", "component1", "()F", "component2", "component3", "copy", "(FFF)Lcom/orion/penkit/models/EraserDot;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getCx", "setCx", "getCy", "setCy", "getRadius", "setRadius", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class EraserDot {
    private float cx;
    private float cy;
    private float radius;

    public EraserDot(float f, float f2, float f3) {
        this.cx = f;
        this.cy = f2;
        this.radius = f3;
    }

    public static /* synthetic */ EraserDot copy$default(EraserDot eraserDot, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = eraserDot.cx;
        }
        if ((i & 2) != 0) {
            f2 = eraserDot.cy;
        }
        if ((i & 4) != 0) {
            f3 = eraserDot.radius;
        }
        return eraserDot.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getCx() {
        return this.cx;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getCy() {
        return this.cy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    public final EraserDot copy(float cx, float cy, float radius) {
        return new EraserDot(cx, cy, radius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EraserDot)) {
            return false;
        }
        EraserDot eraserDot = (EraserDot) other;
        return Float.compare(this.cx, eraserDot.cx) == 0 && Float.compare(this.cy, eraserDot.cy) == 0 && Float.compare(this.radius, eraserDot.radius) == 0;
    }

    public final float getCx() {
        return this.cx;
    }

    public final float getCy() {
        return this.cy;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return Float.hashCode(this.radius) + C20509OooO0oo.OooO0OO(this.cy, Float.hashCode(this.cx) * 31, 31);
    }

    public final void offset(float dx, float dy) {
        this.cx += dx;
        this.cy += dy;
    }

    public final void scale(float factor) {
        this.cx *= factor;
        this.cy *= factor;
        this.radius *= factor;
    }

    public final void setCx(float f) {
        this.cx = f;
    }

    public final void setCy(float f) {
        this.cy = f;
    }

    public final void setRadius(float f) {
        this.radius = f;
    }

    public String toString() {
        float f = this.cx;
        float f2 = this.cy;
        return Oooo00o.OooO0OO.OooO0OO(C20509OooO0oo.OooO0Oo("EraserDot(cx=", f, ", cy=", f2, ", radius="), this.radius, ")");
    }
}
