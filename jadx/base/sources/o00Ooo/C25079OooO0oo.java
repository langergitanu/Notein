package o00Ooo;

import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.p002ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* JADX INFO: renamed from: o00Ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25079OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f85110OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseLongArray f85111OooO0O0 = new SparseLongArray();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SparseBooleanArray f85112OooO0OO = new SparseBooleanArray();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f85113OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f85115OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f85114OooO0o = -1;

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C25086OooOo0O OooO00o(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long jValueAt;
        long j2;
        long jOooOO0;
        long jOooO00o;
        long jOooOo0o;
        int toolType;
        int i3;
        int historySize;
        int i4;
        char c;
        char c2;
        long jOooO00o2;
        int i5;
        int i6;
        AndroidComposeView androidComposeView2 = androidComposeView;
        kotlin.jvm.internal.OooOOO0.OooO0oO(motionEvent, "motionEvent");
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f85111OooO0O0;
        SparseBooleanArray sparseBooleanArray = this.f85112OooO0OO;
        int i7 = 3;
        if (actionMasked == 3) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f85115OooO0o0 || source != this.f85114OooO0o) {
                this.f85115OooO0o0 = toolType2;
                this.f85114OooO0o = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            j = 1;
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j3 = this.f85110OooO00o;
                this.f85110OooO00o = j3 + 1;
                sparseLongArray.put(pointerId, j3);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else if (actionMasked2 != 9) {
            j = 1;
        } else {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j4 = this.f85110OooO00o;
                j = 1;
                this.f85110OooO00o = j4 + 1;
                sparseLongArray.put(pointerId2, j4);
            }
        }
        boolean z3 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z4 = actionMasked == 8;
        if (z3) {
            i = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i = 1;
        }
        int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList pointers = this.f85113OooO0Oo;
        pointers.clear();
        long j5 = j;
        int pointerCount = motionEvent.getPointerCount();
        int i8 = 0;
        while (i8 < pointerCount) {
            boolean z5 = (z3 || i8 == actionIndex2 || (z4 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i8);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (iIndexOfKey >= 0) {
                z = z3;
                z2 = z4;
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
            } else {
                z = z3;
                long j6 = this.f85110OooO00o;
                z2 = z4;
                this.f85110OooO00o = j6 + j5;
                sparseLongArray.put(pointerId3, j6);
                jValueAt = j6;
            }
            float pressure = motionEvent.getPressure(i8);
            long jOooO00o3 = C21289OooO0o.OooO00o(motionEvent.getX(i8), motionEvent.getY(i8));
            if (i8 == 0) {
                jOooO00o = C21289OooO0o.OooO00o(motionEvent.getRawX(), motionEvent.getRawY());
                jOooOo0o = androidComposeView2.OooOo0o(jOooO00o);
            } else if (Build.VERSION.SDK_INT >= 29) {
                jOooO00o = OooOO0.f85116OooO00o.OooO00o(motionEvent, i8);
                jOooOo0o = androidComposeView2.OooOo0o(jOooO00o);
            } else {
                j2 = jOooO00o3;
                jOooOO0 = androidComposeView2.OooOO0(jOooO00o3);
                toolType = motionEvent.getToolType(i8);
                if (toolType == 0) {
                    i3 = 0;
                } else if (toolType != 1) {
                    int i9 = 2;
                    if (toolType != 2) {
                        if (toolType != i7) {
                            i9 = 4;
                            if (toolType != 4) {
                            }
                        }
                        i3 = i9;
                    } else {
                        i3 = i7;
                    }
                } else {
                    i3 = 1;
                }
                ArrayList arrayList = new ArrayList();
                historySize = motionEvent.getHistorySize();
                i4 = 0;
                while (i4 < historySize) {
                    float historicalX = motionEvent.getHistoricalX(i8, i4);
                    float historicalY = motionEvent.getHistoricalY(i8, i4);
                    if (Float.isInfinite(historicalX) || Float.isNaN(historicalX) || Float.isInfinite(historicalY) || Float.isNaN(historicalY)) {
                        i5 = actionIndex2;
                        i6 = i8;
                    } else {
                        i6 = i8;
                        i5 = actionIndex2;
                        arrayList.add(new C25077OooO0o0(motionEvent.getHistoricalEventTime(i4), C21289OooO0o.OooO00o(historicalX, historicalY)));
                    }
                    i4++;
                    i8 = i6;
                    actionIndex2 = i5;
                }
                int i10 = actionIndex2;
                int i11 = i8;
                if (motionEvent.getActionMasked() != 8) {
                    c2 = '\n';
                    c = '\t';
                    jOooO00o2 = C21289OooO0o.OooO00o(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                } else {
                    c = '\t';
                    c2 = '\n';
                    jOooO00o2 = C21290OooO0o0.f61718OooO0O0;
                }
                pointers.add(new C25087OooOo0o(jValueAt, motionEvent.getEventTime(), jOooOO0, j2, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i11), false), arrayList, jOooO00o2));
                i8 = i11 + 1;
                androidComposeView2 = androidComposeView;
                z3 = z;
                z4 = z2;
                actionIndex2 = i10;
                i7 = 3;
            }
            jOooOO0 = jOooO00o;
            j2 = jOooOo0o;
            toolType = motionEvent.getToolType(i8);
            if (toolType == 0) {
            }
            ArrayList arrayList2 = new ArrayList();
            historySize = motionEvent.getHistorySize();
            i4 = 0;
            while (i4 < historySize) {
            }
            int i102 = actionIndex2;
            int i112 = i8;
            if (motionEvent.getActionMasked() != 8) {
            }
            pointers.add(new C25087OooOo0o(jValueAt, motionEvent.getEventTime(), jOooOO0, j2, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i112), false), arrayList2, jOooO00o2));
            i8 = i112 + 1;
            androidComposeView2 = androidComposeView;
            z3 = z;
            z4 = z2;
            actionIndex2 = i102;
            i7 = 3;
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i2 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i2 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i12 = i2;
                while (true) {
                    if (i12 >= pointerCount2) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    }
                    if (motionEvent.getPointerId(i12) == iKeyAt) {
                        break;
                    }
                    i12++;
                }
            }
        }
        motionEvent.getEventTime();
        kotlin.jvm.internal.OooOOO0.OooO0oO(pointers, "pointers");
        kotlin.jvm.internal.OooOOO0.OooO0oO(motionEvent, "motionEvent");
        C25086OooOo0O c25086OooOo0O = new C25086OooOo0O();
        c25086OooOo0O.f85155OooO00o = pointers;
        c25086OooOo0O.f85156OooO0O0 = motionEvent;
        return c25086OooOo0O;
    }
}
