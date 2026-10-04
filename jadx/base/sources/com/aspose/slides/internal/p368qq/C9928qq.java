package com.aspose.slides.internal.p368qq;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: renamed from: com.aspose.slides.internal.qq.qq */
/* JADX INFO: loaded from: classes4.dex */
public class C9928qq extends AbstractC9922k4 {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC9933up f35814k4;

    public C9928qq(InterfaceC9933up interfaceC9933up, short s, InterfaceC9933up interfaceC9933up2) {
        super(s, interfaceC9933up);
        this.f35814k4 = interfaceC9933up2;
    }

    @Override // com.aspose.slides.internal.p368qq.AbstractC9922k4, com.aspose.slides.internal.p368qq.InterfaceC9933up
    /* JADX INFO: renamed from: dy */
    public InterfaceC9933up mo48820dy() {
        return this.f35814k4;
    }

    @Override // com.aspose.slides.internal.p368qq.AbstractC9922k4, com.aspose.slides.internal.p368qq.InterfaceC9933up
    /* JADX INFO: renamed from: m9 */
    public String mo48821m9() {
        short sMo48850k4 = mo48850k4();
        if (sMo48850k4 == 38) {
            return DrawToolFactory.LASSO_TYPE_RECT;
        }
        switch (sMo48850k4) {
            case 25:
                return "counter";
            case 26:
                return "counters";
            case 27:
                return "rgb";
            default:
                return super.mo48821m9();
        }
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(mo48821m9());
        c6765kp.m26792k4("()");
        return c6765kp.toString();
    }
}
