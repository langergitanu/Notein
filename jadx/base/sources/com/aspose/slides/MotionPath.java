package com.aspose.slides;

import android.graphics.PointF;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
public class MotionPath implements IMotionPath {

    /* JADX INFO: renamed from: k4 */
    List<IMotionCmdPath> f2826k4 = new List<>();

    @Override // com.aspose.slides.IMotionPath
    public final IMotionCmdPath add(int i, PointF[] pointFArr, int i2, boolean z) {
        return m2021k4(i, C3085sv.m13097k4(pointFArr), i2, z);
    }

    @Override // com.aspose.slides.IMotionPath
    public final void clear() {
        this.f2826k4.clear();
    }

    @Override // com.aspose.slides.IMotionPath
    public final int getCount() {
        return this.f2826k4.size();
    }

    @Override // com.aspose.slides.IMotionPath
    public final IMotionCmdPath get_Item(int i) {
        return this.f2826k4.get_Item(i);
    }

    @Override // com.aspose.slides.IMotionPath
    public final void insert(int i, int i2, PointF[] pointFArr, int i3, boolean z) {
        m2022k4(i, i2, C3085sv.m13097k4(pointFArr), i3, z);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IMotionCmdPath> iterator() {
        return this.f2826k4.iterator();
    }

    public final IGenericEnumerator<IMotionCmdPath> iteratorJava() {
        return this.f2826k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public IMotionCmdPath m2021k4(int i, C12025x6[] c12025x6Arr, int i2, boolean z) {
        MotionCmdPath motionCmdPath = new MotionCmdPath(i, c12025x6Arr, i2, z);
        this.f2826k4.addItem(motionCmdPath);
        return motionCmdPath;
    }

    @Override // com.aspose.slides.IMotionPath
    public final void remove(IMotionCmdPath iMotionCmdPath) {
        this.f2826k4.removeItem(iMotionCmdPath);
    }

    @Override // com.aspose.slides.IMotionPath
    public final void removeAt(int i) {
        this.f2826k4.removeAt(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m2022k4(int i, int i2, C12025x6[] c12025x6Arr, int i3, boolean z) {
        this.f2826k4.insertItem(i, new MotionCmdPath(i2, c12025x6Arr, i3, z));
    }
}
