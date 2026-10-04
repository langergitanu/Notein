package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14044b3;

/* JADX INFO: loaded from: classes3.dex */
final class eza extends AbstractC1137ga<Tab, eza> implements ITabEffectiveData {

    /* JADX INFO: renamed from: k4 */
    private double f4944k4;

    /* JADX INFO: renamed from: x1 */
    private int f4945x1;

    public eza() {
        this.f4944k4 = Double.NaN;
        this.f4945x1 = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C14044b3.m66430k4(getPosition(), ((Tab) obj).getPosition());
    }

    @Override // com.aspose.slides.ITabEffectiveData
    public final int getAlignment() {
        return this.f4945x1;
    }

    @Override // com.aspose.slides.ITabEffectiveData
    public final double getPosition() {
        return this.f4944k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5788k4(InterfaceC14672vc interfaceC14672vc) {
        eza ezaVar = (eza) interfaceC14672vc;
        this.f4944k4 = ezaVar.f4944k4;
        this.f4945x1 = ezaVar.f4945x1;
    }

    public eza(Tab tab) {
        this();
        this.f4944k4 = tab.getPosition();
        this.f4945x1 = tab.getAlignment();
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, Tab tab) {
        m5788k4(interfaceC14672vc);
        this.f4944k4 = tab.getPosition();
        this.f4945x1 = tab.getAlignment();
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(eza ezaVar) {
        return ezaVar != null && C3085sv.m13088k4(this.f4944k4, ezaVar.f4944k4) && this.f4945x1 == ezaVar.f4945x1;
    }
}
