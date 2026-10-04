package com.aspose.slides.internal.p213jw;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.xk */
/* JADX INFO: loaded from: classes.dex */
public class C5563xk extends AbstractC5535bv {

    /* JADX INFO: renamed from: k4 */
    private String f15318k4;

    /* JADX INFO: renamed from: kk */
    private String f15319kk;

    /* JADX INFO: renamed from: x1 */
    private String f15320x1;

    public C5563xk(String str, String str2, String str3, C5552rv c5552rv) {
        super(c5552rv);
        m22865k4(str2);
        m22867to(str3);
        m22863du(str);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: c5 */
    public String mo22604c5() {
        return mo22612m9();
    }

    /* JADX INFO: renamed from: du */
    public final void m22863du(String str) {
        this.f15319kk = str;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: fa */
    public byte mo22608fa() {
        return (byte) 13;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m22864k4() {
        return this.f15318k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m22866kk() {
        return this.f15319kk;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: m9 */
    public String mo22612m9() {
        return "xml";
    }

    /* JADX INFO: renamed from: to */
    public final void m22867to(String str) {
        if (str == null) {
            this.f15320x1 = C14113y2.f47374k4;
        } else {
            if (str.length() != 0 && !"yes".equals(str) && !TranslateLanguage.NORWEGIAN.equals(str)) {
                throw new ArgumentException();
            }
            this.f15320x1 = str;
        }
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public InterfaceC12777qq mo22614x1(boolean z) {
        return mo22660v4().m22794kk(m22866kk(), m22864k4(), m22868x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22865k4(String str) {
        if (str == null) {
            str = C14113y2.f47374k4;
        }
        this.f15318k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m22868x1() {
        return this.f15320x1;
    }
}
