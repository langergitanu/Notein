package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14044b3;

/* JADX INFO: loaded from: classes3.dex */
final class ks4 implements ITab {

    /* JADX INFO: renamed from: k4 */
    private double f45849k4;

    /* JADX INFO: renamed from: kk */
    private TabCollection f45850kk;

    /* JADX INFO: renamed from: to */
    private long f45851to;

    /* JADX INFO: renamed from: x1 */
    private int f45852x1;

    public ks4(double d, int i) {
        this.f45849k4 = d;
        this.f45852x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m64132x1() {
        this.f45851to++;
        TabCollection tabCollection = this.f45850kk;
        if (tabCollection != null) {
            tabCollection.m2862k4();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C14044b3.m66430k4(getPosition(), ((Tab) obj).getPosition());
    }

    @Override // com.aspose.slides.ITab
    public final int getAlignment() {
        return this.f45852x1;
    }

    @Override // com.aspose.slides.ITab
    public final double getPosition() {
        return this.f45849k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m64133k4() {
        return this.f45851to;
    }

    @Override // com.aspose.slides.ITab
    public final void setAlignment(int i) {
        this.f45852x1 = i;
        m64132x1();
    }

    @Override // com.aspose.slides.ITab
    public final void setPosition(double d) {
        this.f45849k4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64134k4(TabCollection tabCollection) {
        this.f45850kk = tabCollection;
        m64132x1();
    }
}
