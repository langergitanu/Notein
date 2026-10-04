package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class t8a extends el1 {

    /* JADX INFO: renamed from: k4 */
    public final C14327q4 f49051k4;

    public t8a(MathBlock mathBlock, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathBlock, interfaceC0851ce);
        C14327q4 c14327q42 = new C14327q4();
        this.f49051k4 = c14327q42;
        c14327q4.CloneTo(c14327q42);
        IGenericEnumerator<IMathElement> it = mathBlock.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                IMathElement next = it.next();
                C14327q4 c14327q4Clone = c14327q4.Clone();
                if (i > 0 && c14327q4Clone.f48230ck == 0) {
                    c14327q4Clone.f48230ck = 1;
                }
                if (this.f49051k4.f48242yj && C7019kk.m27469x1(next, MathematicalText.class)) {
                    MathematicalText mathematicalText = (MathematicalText) next;
                    String value = mathematicalText.getValue();
                    String[] strArrM67414k4 = C14113y2.m67414k4(value, '&');
                    for (int i2 = 0; i2 < strArrM67414k4.length; i2++) {
                        if (!C14113y2.m67411k4(strArrM67414k4[i2])) {
                            mathematicalText.setValue(strArrM67414k4[i2]);
                            m5579k4(mathematicalText, c14327q4Clone.Clone());
                            i++;
                        }
                        if (i2 < strArrM67414k4.length - 1) {
                            mathematicalText.setValue("&");
                            m5579k4(mathematicalText, c14327q4Clone.Clone());
                            i++;
                        }
                    }
                    mathematicalText.setValue(value);
                } else {
                    c14327q4Clone.f48242yj = false;
                    m5579k4(next, c14327q4Clone.Clone());
                    i++;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v4, types: [float] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.aspose.slides.el1, java.lang.Object] */
    /* JADX INFO: renamed from: k4 */
    public static h2y m70992k4(IGenericList<el1> iGenericList, C14327q4 c14327q4) {
        if (iGenericList.size() == 0) {
            return new h2y();
        }
        if (iGenericList.size() == 1) {
            return iGenericList.get_Item(0).m5578h4();
        }
        wsf wsfVar = new wsf();
        for (int i = 0; i < iGenericList.size(); i++) {
            wsf.m72910k4(wsfVar.Clone(), iGenericList.get_Item(i).m5578h4().f5390x1.Clone()).CloneTo(wsfVar);
        }
        h2y h2yVar = new h2y();
        wsfVar.CloneTo(h2yVar.f5390x1);
        float fM68100k4 = 0.0f;
        int i2 = 0;
        while (i2 < iGenericList.size()) {
            el1 el1Var = iGenericList.get_Item(i2);
            h2y h2yVarClone = el1Var.m5578h4().Clone();
            ?? Append = fM68100k4;
            if (c14327q4.f48230ck != 2) {
                Append = fM68100k4;
                Append = fM68100k4;
                if (C7019kk.m27469x1(el1Var, b3e.class) && i2 > 0) {
                    float[] fArr = {fM68100k4};
                    int i3 = i2 - 1;
                    Append = (m70994k4((b3e) el1Var, iGenericList.get_Item(i3), fArr) && C7019kk.m27469x1(iGenericList.get_Item(i3), dxs.class)) ? StringBuffer.append((String) c14327q4.f48231du) : fArr[0];
                }
            }
            el1Var.m5584x1(Append, wsfVar.f49849k4 - h2yVarClone.f5390x1.f49849k4);
            float f = Append + h2yVarClone.f5389k4;
            h2yVar.f5389k4 = f;
            fM68100k4 = f;
            if (c14327q4.f48230ck != 2) {
                fM68100k4 = f;
                if (C7019kk.m27469x1(el1Var, b3e.class)) {
                    int i4 = i2 + 1;
                    fM68100k4 = f;
                    if (i4 < iGenericList.size()) {
                        float[] fArr2 = new float[1];
                        if (i2 > 0) {
                            fArr2[0] = f;
                            m70993k4((b3e) el1Var, iGenericList.get_Item(i2 - 1), iGenericList.get_Item(i4), fArr2);
                            fM68100k4 = fArr2[0];
                        } else {
                            fArr2[0] = f;
                            m70993k4((b3e) el1Var, null, iGenericList.get_Item(i4), fArr2);
                            fM68100k4 = fArr2[0];
                        }
                    }
                }
            }
            i2++;
            if (i2 < iGenericList.size()) {
                fM68100k4 = fM68100k4;
                if (C7019kk.m27469x1(iGenericList.get_Item(i2), C1138gb.class)) {
                    fM68100k4 = fM68100k4;
                    if (((MathDelimiter) iGenericList.get_Item(i2).f4820c5).getBeginningCharacter() != '(') {
                        fM68100k4 += nn2.m68100k4(c14327q4.f48231du);
                    }
                }
                if (C7019kk.m27469x1(el1Var, C14431s3.class)) {
                    fM68100k4 = (nn2.m68100k4(c14327q4.f48231du) * 0.8f) + fM68100k4;
                }
            }
        }
        return h2yVar;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        return m70992k4(this.f4826m9, this.f49051k4.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70993k4(b3e b3eVar, el1 el1Var, el1 el1Var2, float[] fArr) {
        String str = b3eVar.f4099k4;
        if (str.length() < 1) {
            return;
        }
        char cOooO00o = androidx.core.content.OooO0O0.OooO00o(1, str);
        if (C3047dy.m12846b3(cOooO00o) || cOooO00o == ',') {
            if (C7019kk.m27469x1(el1Var2, b3e.class)) {
                b3e b3eVar2 = (b3e) el1Var2;
                if (!C14113y2.m67411k4(b3eVar2.f4099k4) && C14117yj.m67534ks(b3eVar2.f4099k4.charAt(0))) {
                    return;
                }
            }
            if (str.charAt(0) != '=' || el1Var == null || !C7019kk.m27469x1(el1Var, C1138gb.class)) {
                fArr[0] = fArr[0] + nn2.m68100k4(b3eVar.f4105x1);
            } else {
                fArr[0] = (nn2.m68100k4(b3eVar.f4105x1) * 1.3f) + fArr[0];
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m70994k4(b3e b3eVar, el1 el1Var, float[] fArr) {
        String str = b3eVar.f4099k4;
        if (str.length() < 1 || !C3047dy.m12846b3(str.charAt(0)) || (C7019kk.m27469x1(el1Var, b3e.class) && "=".equals(((b3e) el1Var).f4099k4))) {
            return false;
        }
        if (C7019kk.m27469x1(el1Var, C14431s3.class)) {
            fArr[0] = (nn2.m68100k4(b3eVar.f4105x1) * 0.3f) + fArr[0];
            return true;
        }
        if (str.charAt(0) == '=' && C7019kk.m27469x1(el1Var, C1138gb.class)) {
            fArr[0] = (nn2.m68100k4(b3eVar.f4105x1) * 1.3f) + fArr[0];
        } else {
            fArr[0] = fArr[0] + nn2.m68100k4(b3eVar.f4105x1);
        }
        return true;
    }
}
