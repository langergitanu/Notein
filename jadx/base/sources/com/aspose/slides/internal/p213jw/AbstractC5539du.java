package com.aspose.slides.internal.p213jw;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p517y2.InterfaceC12768h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.du */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5539du extends AbstractC5535bv implements InterfaceC12768h4 {

    /* JADX INFO: renamed from: k4 */
    private String f15210k4;

    public AbstractC5539du(String str, C5552rv c5552rv) {
        super(c5552rv);
        this.f15210k4 = str;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12768h4
    /* JADX INFO: renamed from: k4 */
    public String mo22687k4() {
        String str = this.f15210k4;
        return str != null ? str : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12768h4
    /* JADX INFO: renamed from: to */
    public void mo22692to(String str) {
        this.f15210k4 = new C6765kp(this.f15210k4).m26792k4(str).toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m22693x1() {
        String str = this.f15210k4;
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public String m22688k4(int i, int i2) {
        m22693x1();
        return m22693x1() == 0 ? C14113y2.f47374k4 : C14113y2.m67443x1(this.f15210k4, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public void m22694x1(int i, int i2) {
        this.f15210k4 = new C6765kp(this.f15210k4).m26809x1(i, i2).toString();
    }

    /* JADX INFO: renamed from: k4 */
    public void m22689k4(int i, int i2, String str) {
        this.f15210k4 = new C6765kp(this.f15210k4).m26809x1(i, i2).m26786k4(i, str).toString();
    }

    /* JADX INFO: renamed from: k4 */
    public void m22690k4(int i, String str) {
        this.f15210k4 = new C6765kp(this.f15210k4).m26786k4(i, str).toString();
    }

    /* JADX INFO: renamed from: k4 */
    public void m22691k4(String str) {
        this.f15210k4 = str;
    }
}
