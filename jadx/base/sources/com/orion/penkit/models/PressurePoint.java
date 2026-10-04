package com.orion.penkit.models;

import OooOoO.C20509OooO0oo;
import android.graphics.PointF;
import com.facebook.common.callercontext.ContextChain;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0O00oo.OooOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o000000O;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000278B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010.R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010+\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010.R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010+\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010.R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u00106¨\u00069"}, m80612d2 = {"Lcom/orion/penkit/models/PressurePoint;", "Ljava/io/Serializable;", "", "x", "y", ContextChain.TAG_PRODUCT, "", "action", "<init>", "(FFFI)V", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(IFFFILoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$ni_penkit_release", "(Lcom/orion/penkit/models/PressurePoint;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Landroid/graphics/PointF;", "toPointF", "()Landroid/graphics/PointF;", "component1", "()F", "component2", "component3", "component4", "()I", "copy", "(FFFI)Lcom/orion/penkit/models/PressurePoint;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getX", "setX", "(F)V", "getY", "setY", "getP", "setP", "I", "getAction", "setAction", "(I)V", "Companion", "$serializer", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PressurePoint implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int action;
    private float p;
    private float x;
    private float y;

    @Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/penkit/models/PressurePoint$Companion;", "", "<init>", "()V", "Lcom/orion/penkit/models/PressurePoint;", "p1", "p2", "", "getDistance", "(Lcom/orion/penkit/models/PressurePoint;Lcom/orion/penkit/models/PressurePoint;)F", "t", "interpolate", "(Lcom/orion/penkit/models/PressurePoint;Lcom/orion/penkit/models/PressurePoint;F)Lcom/orion/penkit/models/PressurePoint;", "LoO0o0ooO/OooO0OO;", "serializer", "()LoO0o0ooO/OooO0OO;", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final float getDistance(PressurePoint p1, PressurePoint p2) {
            OooOOO0.OooO0oO(p1, "p1");
            OooOOO0.OooO0oO(p2, "p2");
            return (float) Math.sqrt(((p1.getY() - p2.getY()) * (p1.getY() - p2.getY())) + ((p1.getX() - p2.getX()) * (p1.getX() - p2.getX())));
        }

        public final PressurePoint interpolate(PressurePoint p1, PressurePoint p2, float t) {
            OooOOO0.OooO0oO(p1, "p1");
            OooOOO0.OooO0oO(p2, "p2");
            float fOooO0o0 = OooOO0.OooO0o0(t, 0.0f, 1.0f);
            return new PressurePoint(((p2.getX() - p1.getX()) * fOooO0o0) + p1.getX(), ((p2.getY() - p1.getY()) * fOooO0o0) + p1.getY(), ((p2.getP() - p1.getP()) * fOooO0o0) + p1.getP(), p1.getAction());
        }

        public final InterfaceC33911OooO0OO<PressurePoint> serializer() {
            return PressurePoint$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PressurePoint(int i, float f, float f2, float f3, int i2, o000000O o000000o2) {
        if (15 != (i & 15)) {
            C24242OooOOo.OooO0O0(i, 15, PressurePoint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.x = f;
        this.y = f2;
        this.p = f3;
        this.action = i2;
    }

    public static /* synthetic */ PressurePoint copy$default(PressurePoint pressurePoint, float f, float f2, float f3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = pressurePoint.x;
        }
        if ((i2 & 2) != 0) {
            f2 = pressurePoint.y;
        }
        if ((i2 & 4) != 0) {
            f3 = pressurePoint.p;
        }
        if ((i2 & 8) != 0) {
            i = pressurePoint.action;
        }
        return pressurePoint.copy(f, f2, f3, i);
    }

    public static final /* synthetic */ void write$Self$ni_penkit_release(PressurePoint self, oO0oO000.OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        output.OooOOo0(serialDesc, 0, self.x);
        output.OooOOo0(serialDesc, 1, self.y);
        output.OooOOo0(serialDesc, 2, self.p);
        output.OooOoOO(3, self.action, serialDesc);
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
    public final float getP() {
        return this.p;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    public final PressurePoint copy(float x, float y, float p, int action) {
        return new PressurePoint(x, y, p, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PressurePoint)) {
            return false;
        }
        PressurePoint pressurePoint = (PressurePoint) other;
        return Float.compare(this.x, pressurePoint.x) == 0 && Float.compare(this.y, pressurePoint.y) == 0 && Float.compare(this.p, pressurePoint.p) == 0 && this.action == pressurePoint.action;
    }

    public final int getAction() {
        return this.action;
    }

    public final float getP() {
        return this.p;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Integer.hashCode(this.action) + C20509OooO0oo.OooO0OO(this.p, C20509OooO0oo.OooO0OO(this.y, Float.hashCode(this.x) * 31, 31), 31);
    }

    public final void setAction(int i) {
        this.action = i;
    }

    public final void setP(float f) {
        this.p = f;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public final PointF toPointF() {
        return new PointF(this.x, this.y);
    }

    public String toString() {
        float f = this.x;
        float f2 = this.y;
        float f3 = this.p;
        int i = this.action;
        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("PressurePoint(x=", f, ", y=", f2, ", p=");
        sbOooO0Oo.append(f3);
        sbOooO0Oo.append(", action=");
        sbOooO0Oo.append(i);
        sbOooO0Oo.append(")");
        return sbOooO0Oo.toString();
    }

    public PressurePoint(float f, float f2, float f3, int i) {
        this.x = f;
        this.y = f2;
        this.p = f3;
        this.action = i;
    }
}
