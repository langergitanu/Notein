package com.aspose.slides.internal.p526yj;

import com.aspose.slides.internal.p217k4.C5580c5;
import com.aspose.slides.internal.p217k4.InterfaceC5585h4;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p489x1.C12365to;
import com.aspose.slides.internal.p489x1.InterfaceC12359fa;
import com.aspose.slides.internal.p492x4.AbstractC12384m9;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.internal.p526yj.C12847x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.yj.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12845k4 extends C5580c5 {

    /* JADX INFO: renamed from: up */
    private static final C12380dy f42737up = new C12380dy("\\\\([\\n\\r\\f0-9a-fA-F]{1,6})\\s*");

    /* JADX INFO: renamed from: ks */
    private C12847x1.to f42738ks;

    /* JADX INFO: renamed from: yj */
    private String f42739yj;

    public C12845k4(int i, C12847x1.to toVar) {
        super(i);
        this.f42738ks = new C12847x1.to(toVar);
    }

    /* JADX INFO: renamed from: kk */
    public static String m59726kk(InterfaceC12359fa interfaceC12359fa) {
        return ((C12845k4) ((C12365to) interfaceC12359fa).m57939fa()).m59729c5();
    }

    /* JADX INFO: renamed from: x1 */
    public static String m59727x1(InterfaceC12359fa interfaceC12359fa) {
        return C14113y2.m67422kk(((C12845k4) ((C12365to) interfaceC12359fa).m57939fa()).m59729c5(), 1);
    }

    /* JADX INFO: renamed from: c5 */
    public final String m59729c5() {
        if (this.f42739yj == null && mo22924x1() != null) {
            String strMo22924x1 = mo22924x1();
            if (C14113y2.m67429to(strMo22924x1, IOUtils.DIR_SEPARATOR_WINDOWS) != -1) {
                strMo22924x1 = f42737up.m57982k4(strMo22924x1, new AbstractC12384m9() { // from class: com.aspose.slides.internal.yj.k4.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Css.Grammar.CSSToken.ReplaceEscapedIdentifiers(System.Text.RegularExpressions.Match)";
                    }

                    @Override // com.aspose.slides.internal.p492x4.AbstractC12384m9
                    /* JADX INFO: renamed from: k4 */
                    public String mo24906k4(C12385to c12385to) {
                        return C12845k4.m59728x1(c12385to);
                    }
                });
            }
            if (C14113y2.m67429to(strMo22924x1, IOUtils.DIR_SEPARATOR_WINDOWS) != -1) {
                strMo22924x1 = C14113y2.m67401k4(strMo22924x1, "\\", C14113y2.f47374k4);
            }
            this.f42739yj = strMo22924x1;
        }
        return this.f42739yj;
    }

    /* JADX INFO: renamed from: dy */
    public final C12847x1.to m59730dy() {
        return this.f42738ks;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12845k4 m59731k4(C12847x1.to toVar) {
        this.f42738ks = toVar;
        return this;
    }

    @Override // com.aspose.slides.internal.p217k4.C5580c5
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4("/").m26791k4(this.f42738ks).m26792k4("/").m26792k4(super.toString());
        return c6765kp.toString();
    }

    public C12845k4(int i, C12847x1.to toVar, int i2, int i3) {
        super(i);
        this.f42738ks = new C12847x1.to(toVar);
        this.f15368dy = i2;
        this.f15366c5 = i3;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m59724k4(InterfaceC12359fa interfaceC12359fa) {
        return C14113y2.m67422kk(((C12845k4) ((C12365to) interfaceC12359fa).m57939fa()).m59729c5(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static String m59728x1(C12385to c12385to) {
        int[] iArr = {0};
        return C14057f9.m66589k4(C14113y2.m67422kk(c12385to.mo57995kk(), 1), 515, C6344m9.f18038k4, iArr) ? C14113y2.m67389k4((char) iArr[0], 1) : C14113y2.f47374k4;
    }

    public C12845k4(InterfaceC5585h4 interfaceC5585h4, int i, int i2, int i3, int i4) {
        super(interfaceC5585h4, i, i2, i3, i4);
    }
}
