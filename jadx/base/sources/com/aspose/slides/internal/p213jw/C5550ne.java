package com.aspose.slides.internal.p213jw;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p517y2.InterfaceC12776ne;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12785wl;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.ne */
/* JADX INFO: loaded from: classes.dex */
public class C5550ne extends AbstractC5535bv implements InterfaceC12776ne {

    /* JADX INFO: renamed from: du */
    private C5564yd<AbstractC5535bv> f15259du;

    /* JADX INFO: renamed from: h4 */
    private C5564yd<AbstractC5535bv> f15260h4;

    /* JADX INFO: renamed from: k4 */
    private String f15261k4;

    /* JADX INFO: renamed from: kk */
    private String f15262kk;

    /* JADX INFO: renamed from: to */
    private String f15263to;

    /* JADX INFO: renamed from: x1 */
    private String f15264x1;

    public C5550ne(String str, String str2, String str3, String str4, C5552rv c5552rv) {
        this.f15261k4 = str;
        this.f15264x1 = str2;
        this.f15262kk = str3;
        this.f15263to = str4;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12776ne
    /* JADX INFO: renamed from: du */
    public final String mo22765du() {
        return this.f15262kk;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: fa */
    public byte mo22608fa() {
        return (byte) 10;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m22766h4() {
        return this.f15263to;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m22767k4() {
        return this.f15261k4;
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC12785wl m22768kk() {
        if (this.f15260h4 == null) {
            this.f15260h4 = new C5564yd<>(this);
        }
        return this.f15260h4;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: m9 */
    public String mo22612m9() {
        return m22767k4();
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12776ne
    /* JADX INFO: renamed from: to */
    public final String mo22769to() {
        return this.f15264x1;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("<!DOCTYPE {0}", this.f15261k4);
        if (!C14113y2.m67411k4(this.f15264x1)) {
            c6765kp.m26796k4(" PUBLIC \"{0}\"", this.f15264x1);
        }
        if (!C14113y2.m67411k4(this.f15262kk)) {
            c6765kp.m26796k4(" SYSTEM \"{0}\"", this.f15262kk);
        }
        c6765kp.m26792k4(">");
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public InterfaceC12777qq mo22614x1(boolean z) {
        return mo22660v4().mo22788k4(this.f15261k4, this.f15264x1, this.f15262kk, this.f15263to);
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC12785wl m22770x1() {
        if (this.f15259du == null) {
            this.f15259du = new C5564yd<>(this);
        }
        return this.f15259du;
    }
}
