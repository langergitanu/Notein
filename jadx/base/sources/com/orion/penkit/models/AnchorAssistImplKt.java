package com.orion.penkit.models;

import OooOoOO.C20519OooO0Oo;
import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.InterfaceC32440OooOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u001b\u0010\n\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000e\"\u001b\u0010\u0014\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m80612d2 = {"Landroid/graphics/PointF;", "Lcom/orion/penkit/models/IntPoint;", "toIntPoint", "(Landroid/graphics/PointF;)Lcom/orion/penkit/models/IntPoint;", "toPointF", "(Lcom/orion/penkit/models/IntPoint;)Landroid/graphics/PointF;", "EMPTY_INT_POINT$delegate", "LoO00ooO/OooOO0;", "getEMPTY_INT_POINT", "()Lcom/orion/penkit/models/IntPoint;", "EMPTY_INT_POINT", "Lcom/orion/penkit/models/HorizontalLine;", "EMPTY_HORIZONTAL_LINE$delegate", "getEMPTY_HORIZONTAL_LINE", "()Lcom/orion/penkit/models/HorizontalLine;", "EMPTY_HORIZONTAL_LINE", "Lcom/orion/penkit/models/VerticalLine;", "EMPTY_VERTICAL_LINE$delegate", "getEMPTY_VERTICAL_LINE", "()Lcom/orion/penkit/models/VerticalLine;", "EMPTY_VERTICAL_LINE", "ni-penkit_release"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AnchorAssistImplKt {
    private static final InterfaceC32440OooOO0 EMPTY_INT_POINT$delegate = C20519OooO0Oo.OooO0OO(new OooO00o());
    private static final InterfaceC32440OooOO0 EMPTY_HORIZONTAL_LINE$delegate = C20519OooO0Oo.OooO0OO(new OooO0O0());
    private static final InterfaceC32440OooOO0 EMPTY_VERTICAL_LINE$delegate = C20519OooO0Oo.OooO0OO(new OooO0OO());

    /* JADX INFO: Access modifiers changed from: private */
    public static final HorizontalLine EMPTY_HORIZONTAL_LINE_delegate$lambda$1() {
        return new HorizontalLine(getEMPTY_INT_POINT(), getEMPTY_INT_POINT());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntPoint EMPTY_INT_POINT_delegate$lambda$0() {
        return new IntPoint(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerticalLine EMPTY_VERTICAL_LINE_delegate$lambda$2() {
        return new VerticalLine(getEMPTY_INT_POINT(), getEMPTY_INT_POINT());
    }

    public static final HorizontalLine getEMPTY_HORIZONTAL_LINE() {
        return (HorizontalLine) EMPTY_HORIZONTAL_LINE$delegate.getValue();
    }

    public static final IntPoint getEMPTY_INT_POINT() {
        return (IntPoint) EMPTY_INT_POINT$delegate.getValue();
    }

    public static final VerticalLine getEMPTY_VERTICAL_LINE() {
        return (VerticalLine) EMPTY_VERTICAL_LINE$delegate.getValue();
    }

    public static final IntPoint toIntPoint(PointF pointF) {
        OooOOO0.OooO0oO(pointF, "<this>");
        return new IntPoint((int) pointF.x, (int) pointF.y);
    }

    public static final PointF toPointF(IntPoint intPoint) {
        OooOOO0.OooO0oO(intPoint, "<this>");
        return new PointF(intPoint.getX().intValue(), intPoint.getY().intValue());
    }
}
