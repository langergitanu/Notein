package com.orion.penkit.models;

import OooOoO.C20509OooO0oo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\u001d¨\u0006#"}, m80612d2 = {"Lcom/orion/penkit/models/RPointF;", "", "", "x", "y", "r", "<init>", "(FFF)V", "LoO00ooO/OooOooO;", "setValue", "component1", "()F", "component2", "component3", "copy", "(FFF)Lcom/orion/penkit/models/RPointF;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getX", "setX", "(F)V", "getY", "setY", "getR", "setR", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class RPointF {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private float r;
    private float x;
    private float y;

    @Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, m80612d2 = {"Lcom/orion/penkit/models/RPointF$Companion;", "", "<init>", "()V", "getDistance", "", "p1", "Lcom/orion/penkit/models/RPointF;", "p2", "getMidPoint", "getTangencyPoints", "", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final double getDistance(RPointF p1, RPointF p2) {
            OooOOO0.OooO0oO(p1, "p1");
            OooOOO0.OooO0oO(p2, "p2");
            float x = p2.getX() - p1.getX();
            float y = p2.getY() - p1.getY();
            return Math.sqrt((y * y) + (x * x));
        }

        public final RPointF getMidPoint(RPointF p1, RPointF p2) {
            OooOOO0.OooO0oO(p1, "p1");
            OooOOO0.OooO0oO(p2, "p2");
            RPointF rPointF = new RPointF(0.0f, 0.0f, 0.0f, 7, null);
            float f = 2;
            rPointF.setX((p2.getX() + p1.getX()) / f);
            rPointF.setY((p2.getY() + p1.getY()) / f);
            rPointF.setR((p2.getR() + p1.getR()) / f);
            return rPointF;
        }

        public final List<RPointF> getTangencyPoints(RPointF p1, RPointF p2) {
            OooOOO0.OooO0oO(p1, "p1");
            OooOOO0.OooO0oO(p2, "p2");
            float x = p2.getX() - p1.getX();
            float y = p2.getY() - p1.getY();
            double distance = getDistance(p1, p2);
            double d = y;
            double d2 = x;
            int i = 4;
            C24018OooO0oo c24018OooO0oo = null;
            float f = 0.0f;
            return C34429OooOOo0.OooOO0o(new RPointF((float) (((double) p1.getX()) - ((((double) p1.getR()) / distance) * d)), (float) (((((double) p1.getR()) / distance) * d2) + ((double) p1.getY())), 0.0f, 4, null), new RPointF((float) (((((double) p1.getR()) / distance) * d) + ((double) p1.getX())), (float) (((double) p1.getY()) - ((((double) p1.getR()) / distance) * d2)), f, i, c24018OooO0oo), new RPointF((float) (((((double) p2.getR()) / distance) * d) + ((double) p2.getX())), (float) (((double) p2.getY()) - ((((double) p2.getR()) / distance) * d2)), f, i, c24018OooO0oo), new RPointF((float) (((double) p2.getX()) - ((((double) p2.getR()) / distance) * d)), (float) (((((double) p2.getR()) / distance) * d2) + ((double) p2.getY())), f, i, c24018OooO0oo));
        }

        private Companion() {
        }
    }

    public RPointF() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public static /* synthetic */ RPointF copy$default(RPointF rPointF, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rPointF.x;
        }
        if ((i & 2) != 0) {
            f2 = rPointF.y;
        }
        if ((i & 4) != 0) {
            f3 = rPointF.r;
        }
        return rPointF.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getR() {
        return this.r;
    }

    public final RPointF copy(float x, float y, float r) {
        return new RPointF(x, y, r);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RPointF)) {
            return false;
        }
        RPointF rPointF = (RPointF) other;
        return Float.compare(this.x, rPointF.x) == 0 && Float.compare(this.y, rPointF.y) == 0 && Float.compare(this.r, rPointF.r) == 0;
    }

    public final float getR() {
        return this.r;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.hashCode(this.r) + C20509OooO0oo.OooO0OO(this.y, Float.hashCode(this.x) * 31, 31);
    }

    public final void setR(float f) {
        this.r = f;
    }

    public final void setValue(float x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public String toString() {
        float f = this.x;
        float f2 = this.y;
        return Oooo00o.OooO0OO.OooO0OO(C20509OooO0oo.OooO0Oo("RPointF(x=", f, ", y=", f2, ", r="), this.r, ")");
    }

    public RPointF(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.r = f3;
    }

    public /* synthetic */ RPointF(float f, float f2, float f3, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3);
    }
}
