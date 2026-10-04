package o0O0o00;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.PressurePoint;
import com.orion.penkit.models.ShapeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import o00o0o0o.C25446OooO0Oo;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0O0o00.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25919OooOO0o extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.orion.editor.OooO00o f88481OooO00o;

    public C25919OooOO0o(com.orion.editor.OooO00o oooO00o) {
        this.f88481OooO00o = oooO00o;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(final MotionEvent motionEvent) {
        com.orion.editor.OooO00o oooO00o = this.f88481OooO00o;
        HashMap mapOooO0oO = oooO00o.f69064OooOO0.OooO0oO();
        ArrayList arrayList = new ArrayList();
        final HashMap map = new HashMap();
        for (Map.Entry entry : mapOooO0oO.entrySet()) {
            Integer num = (Integer) entry.getKey();
            num.getClass();
            List list = (List) entry.getValue();
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                map.put(((InterfaceC31284OooO0O0) it.next()).getId(), num);
            }
        }
        oooO00o.f69095Oooo0oO = (InterfaceC31284OooO0O0) arrayList.stream().filter(new Predicate() { // from class: o0O0o00.OooOO0O
            /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
            @Override // java.util.function.Predicate
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean test(Object obj) {
                float fOooOo0O;
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                com.orion.editor.OooO00o oooO00o2 = this.f88478OooO00o.f88481OooO00o;
                if (oooO00o2.f69056OooO00o.getPenWidthScale()) {
                    Integer num2 = (Integer) map.get(interfaceC31284OooO0O0.getId());
                    if (num2 != null) {
                        fOooOo0O = oooO00o2.f69056OooO00o.OooOo0O(1, num2.intValue());
                    }
                    return false;
                }
                fOooOo0O = 1.0f;
                boolean z = interfaceC31284OooO0O0 instanceof DrawRecord;
                MotionEvent motionEvent2 = motionEvent;
                if (z) {
                    DrawRecord drawRecord = (DrawRecord) interfaceC31284OooO0O0;
                    if (drawRecord.getType() == 11) {
                        List<PressurePoint> points = drawRecord.getPoints();
                        int i = 0;
                        while (i < points.size() - 1) {
                            PressurePoint pressurePoint = points.get(i);
                            i++;
                            PressurePoint pressurePoint2 = points.get(i);
                            if (C25446OooO0Oo.OooOO0(pressurePoint.getX(), pressurePoint.getY(), pressurePoint2.getX(), pressurePoint2.getY(), motionEvent2.getX(), motionEvent2.getY()) <= (drawRecord.getWidth() * fOooOo0O) / 2.0f) {
                                return true;
                            }
                        }
                    } else if (interfaceC31284OooO0O0 instanceof ShapeInfo) {
                        ShapeInfo shapeInfo = (ShapeInfo) interfaceC31284OooO0O0;
                        if (shapeInfo.getTapeLike()) {
                            return shapeInfo.pointInShapeAreaWithWidth(new PointF(motionEvent2.getX(), motionEvent2.getY()), fOooOo0O);
                        }
                    }
                }
                return false;
            }
        }).findFirst().orElse(null);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f88481OooO00o.f69095Oooo0oO = null;
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f88481OooO00o.f69095Oooo0oO = null;
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        com.orion.editor.OooO00o oooO00o = this.f88481OooO00o;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = oooO00o.f69095Oooo0oO;
        if (interfaceC31284OooO0O0 == null) {
            return false;
        }
        oooO00o.f69056OooO00o.OoooO0(interfaceC31284OooO0O0, false);
        com.orion.editor.OooO00o.OooO0Oo(oooO00o, motionEvent);
        return true;
    }
}
