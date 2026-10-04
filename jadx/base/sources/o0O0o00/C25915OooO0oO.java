package o0O0o00;

import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.orion.penkit.models.DualLinkRefInfo;
import com.orion.penkit.models.DualLinkSourceInfo;
import com.orion.penkit.models.ImageInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import o0oo0o.InterfaceC31283OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25915OooO0oO extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.orion.editor.OooO00o f88475OooO00o;

    public C25915OooO0oO(com.orion.editor.OooO00o oooO00o) {
        this.f88475OooO00o = oooO00o;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(final MotionEvent motionEvent) {
        com.orion.editor.OooO00o oooO00o = this.f88475OooO00o;
        HashMap mapOooO0oO = oooO00o.f69064OooOO0.OooO0oO();
        ArrayList arrayList = new ArrayList();
        Iterator it = mapOooO0oO.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) ((Map.Entry) it.next()).getValue());
        }
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) arrayList.stream().filter(new Predicate() { // from class: o0O0o00.OooO0o
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) obj;
                C25915OooO0oO c25915OooO0oO = this.f88470OooO00o;
                c25915OooO0oO.getClass();
                boolean z = interfaceC31284OooO0O02 instanceof DualLinkRefInfo;
                if (z || (interfaceC31284OooO0O02 instanceof DualLinkSourceInfo)) {
                    boolean fixed = z ? ((ImageInfo) ((DualLinkRefInfo) interfaceC31284OooO0O02).getItem()).getFixed() : false;
                    InterfaceC31283OooO00o interfaceC31283OooO00o = (InterfaceC31283OooO00o) interfaceC31284OooO0O02;
                    com.orion.editor.OooO00o oooO00o2 = c25915OooO0oO.f88475OooO00o;
                    RectF clickableBound = interfaceC31283OooO00o.getClickableBound(oooO00o2.f69056OooO00o.getZoomLevel());
                    MotionEvent motionEvent2 = motionEvent;
                    oooO00o2.f69094Oooo0o0 = clickableBound.contains(motionEvent2.getX(), motionEvent2.getY());
                    oooO00o2.f69093Oooo0o = interfaceC31283OooO00o.getFixedIconBounds(oooO00o2.f69056OooO00o.getZoomLevel()).contains(motionEvent2.getX(), motionEvent2.getY());
                    C34406OooO00o.f123390OooO00o.OooO00o("isDualLinkRefIconClick: " + oooO00o2.f69094Oooo0o0 + ", isDualLinkFixedIconClick: " + oooO00o2.f69093Oooo0o, new Object[0]);
                    if (oooO00o2.f69094Oooo0o0) {
                        return true;
                    }
                    if (oooO00o2.f69093Oooo0o && fixed) {
                        return true;
                    }
                }
                return false;
            }
        }).findFirst().orElse(null);
        oooO00o.f69092Oooo0OO = interfaceC31284OooO0O0;
        return interfaceC31284OooO0O0 != null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f88475OooO00o.f69092Oooo0OO = null;
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        Log.d("DragPinchManager", "dual link onLongPress");
        com.orion.editor.OooO00o oooO00o = this.f88475OooO00o;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = oooO00o.f69092Oooo0OO;
        if (interfaceC31284OooO0O0 == null) {
            Log.e("DragPinchManager", "dual link item is null");
        } else if (oooO00o.f69094Oooo0o0) {
            oooO00o.f69056OooO00o.Oooooo0(interfaceC31284OooO0O0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f88475OooO00o.f69092Oooo0OO = null;
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        com.orion.editor.OooO00o oooO00o = this.f88475OooO00o;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = oooO00o.f69092Oooo0OO;
        if (interfaceC31284OooO0O0 == null) {
            return false;
        }
        if (interfaceC31284OooO0O0 instanceof DualLinkRefInfo) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(DualLinkRefInfo.EXTRA_OF_IS_FIXED_ICON_CLICKED, oooO00o.f69093Oooo0o);
            bundle.putBoolean(DualLinkRefInfo.EXTRA_OF_IS_REF_ICON_CLICKED, oooO00o.f69094Oooo0o0);
            ((DualLinkRefInfo) oooO00o.f69092Oooo0OO).setExtra(bundle);
        }
        com.orion.editor.OooO00o.OooO0Oo(oooO00o, motionEvent);
        oooO00o.f69056OooO00o.OoooO0(oooO00o.f69092Oooo0OO, false);
        return true;
    }
}
