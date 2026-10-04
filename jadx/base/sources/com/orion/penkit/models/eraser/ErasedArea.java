package com.orion.penkit.models.eraser;

import android.graphics.PointF;
import com.facebook.common.callercontext.ContextChain;
import com.orion.penkit.models.Segment;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H$J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\n\u001a\u00020\u000bH$J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/penkit/models/eraser/ErasedArea;", "", "<init>", "()V", "isPointInsideArea", "", ContextChain.TAG_PRODUCT, "Landroid/graphics/PointF;", "calculateAreaSegmentIntersections", "", "segment", "Lcom/orion/penkit/models/Segment;", "quickReject", "intersects", DrawToolFactory.LASSO_TYPE_RECT, "circleArea", "Lcom/orion/penkit/models/eraser/CircleArea;", "calculateErasedSegment", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class ErasedArea {
    protected static final int BOTH_IN_AREA = 17;
    protected static final int END_IN_AREA = 16;
    protected static final int END_POINT_IN_AREA = 16;
    protected static final int NEITHER_IN_AREA = 0;
    protected static final int START_IN_AREA = 1;
    protected static final int START_POINT_IN_AREA = 1;

    public abstract List<PointF> calculateAreaSegmentIntersections(Segment segment);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final Segment calculateErasedSegment(Segment segment) {
        OooOOO0.OooO0oO(segment, "segment");
        boolean zIsPointInsideArea = isPointInsideArea(segment.getStart());
        ?? r0 = zIsPointInsideArea;
        if (isPointInsideArea(segment.getEnd())) {
            r0 = (zIsPointInsideArea ? 1 : 0) | 16;
        }
        if (r0 == 0) {
            if (quickReject(segment)) {
                return null;
            }
            List<PointF> listCalculateAreaSegmentIntersections = calculateAreaSegmentIntersections(segment);
            if (listCalculateAreaSegmentIntersections.size() == 2) {
                return new Segment(listCalculateAreaSegmentIntersections.get(0), listCalculateAreaSegmentIntersections.get(1));
            }
            return null;
        }
        if (r0 == 1) {
            return new Segment(segment.getStart(), calculateAreaSegmentIntersections(segment).get(0));
        }
        if (r0 == 16) {
            return new Segment(calculateAreaSegmentIntersections(segment).get(0), segment.getEnd());
        }
        if (r0 != 17) {
            return null;
        }
        return segment;
    }

    public abstract boolean intersects(Segment segment);

    public abstract boolean intersects(CircleArea circleArea);

    public abstract boolean intersects(List<? extends PointF> rect);

    public abstract boolean isPointInsideArea(PointF p);

    public boolean quickReject(Segment segment) {
        OooOOO0.OooO0oO(segment, "segment");
        return false;
    }
}
