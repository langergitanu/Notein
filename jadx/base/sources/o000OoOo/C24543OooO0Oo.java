package o000OoOo;

import Oooo0.C20856OooooOo;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.lang.reflect.Array;
import java.util.Locale;
import o000OoOo.C24540OooO00o;
import o000OoOo.C24540OooO00o.C19626OooO00o.C19627OooO00o;

/* JADX INFO: renamed from: o000OoOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24543OooO0Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f83022OooO0OO = Log.isLoggable("MultiPointerPredictor", 3);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SparseArray<OooO0o> f83023OooO00o = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f83024OooO0O0;

    public C24543OooO0Oo(int i) {
        this.f83024OooO0O0 = i;
    }

    public final void OooO00o(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        SparseArray<OooO0o> sparseArray = this.f83023OooO00o;
        if (actionMasked == 0 || actionMasked == 5) {
            OooO0o oooO0o = new OooO0o(this.f83024OooO0O0, pointerId, motionEvent.getToolType(actionIndex));
            oooO0o.OooO00o(motionEvent);
            sparseArray.put(pointerId, oooO0o);
            return;
        }
        if (actionMasked == 1) {
            OooO0o oooO0o2 = sparseArray.get(pointerId);
            if (oooO0o2 != null) {
                sparseArray.remove(pointerId);
                oooO0o2.OooO00o(motionEvent);
            }
            sparseArray.clear();
            return;
        }
        if (actionMasked == 6) {
            OooO0o oooO0o3 = sparseArray.get(pointerId);
            if (oooO0o3 != null) {
                sparseArray.remove(pointerId);
                oooO0o3.OooO00o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            sparseArray.clear();
        } else if (actionMasked == 2) {
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray.valueAt(i).OooO00o(motionEvent);
            }
        }
    }

    public final MotionEvent OooO0O0(int i) {
        SparseArray<OooO0o> sparseArray = this.f83023OooO00o;
        int size = sparseArray.size();
        boolean z = f83022OooO0OO;
        if (size == 0) {
            if (z) {
                Log.d("MultiPointerPredictor", "predict() -> null: no pointer on screen");
            }
            return null;
        }
        if (size == 1) {
            MotionEvent motionEventOooO0O0 = sparseArray.valueAt(0).OooO0O0(i);
            if (z) {
                Log.d("MultiPointerPredictor", "predict() -> MotionEvent: " + motionEventOooO0O0);
            }
            return motionEventOooO0O0;
        }
        int[] iArr = new int[size];
        MotionEvent[] motionEventArr = new MotionEvent[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = sparseArray.keyAt(i2);
            motionEventArr[i2] = sparseArray.valueAt(i2).OooO0O0(i);
        }
        int historySize = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            MotionEvent motionEvent = motionEventArr[i3];
            if (motionEvent == null) {
                for (int i4 = 0; i4 < size; i4++) {
                    MotionEvent motionEvent2 = motionEventArr[i4];
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                }
                return null;
            }
            if (motionEvent.getHistorySize() < historySize) {
                historySize = motionEvent.getHistorySize();
            }
        }
        int i5 = historySize + 1;
        MotionEvent.PointerCoords[][] pointerCoordsArr = (MotionEvent.PointerCoords[][]) Array.newInstance((Class<?>) MotionEvent.PointerCoords.class, i5, size);
        long[] jArr = new long[i5];
        for (int i6 = 0; i6 < size; i6++) {
            C24540OooO00o.C19626OooO00o.C19627OooO00o c19627OooO00o = new C24540OooO00o.C19626OooO00o(motionEventArr[i6]).new C19627OooO00o();
            int i7 = 0;
            while (c19627OooO00o.hasNext()) {
                C24540OooO00o c24540OooO00o = (C24540OooO00o) c19627OooO00o.next();
                pointerCoordsArr[i7][i6] = c24540OooO00o.f82999OooO00o[0];
                jArr[i7] = c24540OooO00o.f83000OooO0O0;
                i7++;
                if (i5 <= i7) {
                    break;
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            motionEventArr[i8].recycle();
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[size];
        for (int i9 = 0; i9 < size; i9++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i9] = pointerProperties;
            pointerProperties.id = iArr[i9];
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEventArr[0].getDownTime(), jArr[0], 2, size, pointerPropertiesArr, pointerCoordsArr[0], 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
        for (int i10 = 1; i10 < i5; i10++) {
            motionEventObtain.addBatch(jArr[i10], pointerCoordsArr[i10], 0);
        }
        if (z) {
            Locale locale = Locale.ROOT;
            StringBuilder sb = new StringBuilder(C20856OooooOo.OooO0O0("predict() -> MotionEvent: (pointerCount=", motionEventObtain.getPointerCount(), ", historySize=", ");", motionEventObtain.getHistorySize()));
            C24540OooO00o.C19626OooO00o.C19627OooO00o c19627OooO00o2 = new C24540OooO00o.C19626OooO00o(motionEventObtain).new C19627OooO00o();
            while (c19627OooO00o2.hasNext()) {
                C24540OooO00o c24540OooO00o2 = (C24540OooO00o) c19627OooO00o2.next();
                sb.append("      ");
                for (MotionEvent.PointerCoords pointerCoords : c24540OooO00o2.f82999OooO00o) {
                    sb.append(String.format(Locale.ROOT, "(%f, %f)", Float.valueOf(pointerCoords.x), Float.valueOf(pointerCoords.y)));
                }
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            Log.d("MultiPointerPredictor", sb.toString());
        }
        return motionEventObtain;
    }
}
