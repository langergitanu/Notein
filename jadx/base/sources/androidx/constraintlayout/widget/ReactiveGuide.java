package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.C21627OooO0oO;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements C21627OooO0oO.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f64168OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f64169OooOo0o;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f64168OooOo;
    }

    public int getAttributeId() {
        return this.f64169OooOo0o;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
    }

    public void setApplyToConstraintSetId(int i) {
        this.f64168OooOo = i;
    }

    public void setAttributeId(int i) {
        HashSet<WeakReference<C21627OooO0oO.OooO00o>> hashSet;
        C21627OooO0oO sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f64169OooOo0o;
        if (i2 != -1 && (hashSet = sharedValues.f64154OooO00o.get(Integer.valueOf(i2))) != null) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference<C21627OooO0oO.OooO00o> weakReference : hashSet) {
                C21627OooO0oO.OooO00o oooO00o = weakReference.get();
                if (oooO00o == null || oooO00o == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f64169OooOo0o = i;
        if (i != -1) {
            sharedValues.OooO00o(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) getLayoutParams();
        oooO00o.f63877OooO00o = i;
        setLayoutParams(oooO00o);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) getLayoutParams();
        oooO00o.f63878OooO0O0 = i;
        setLayoutParams(oooO00o);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) getLayoutParams();
        oooO00o.f63879OooO0OO = f;
        setLayoutParams(oooO00o);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
