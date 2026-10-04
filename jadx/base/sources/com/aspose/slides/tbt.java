package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10398dc;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class tbt {

    /* JADX INFO: renamed from: k4 */
    private static final String[] f49092k4;

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<Byte, Byte> f49093x1;

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    static {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.slides.tbt.<clinit>():void");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m71069k4(int i) {
        int i2 = i - 1;
        if (i2 >= 0) {
            String[] strArr = f49092k4;
            if (i2 < strArr.length) {
                return strArr[i2];
            }
        }
        return f49092k4[3];
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71070k4(PatternFormat patternFormat, C10534m3 c10534m3, boolean z, y2n y2nVar) {
        C10609qn c10609qn;
        IColorFormat backColor;
        int i;
        C10480ii c10480iiM51263x1 = c10534m3.m51263x1();
        if (z) {
            c10609qn = new C10609qn(452, 1L);
            c10480iiM51263x1.m50930x1(c10609qn);
            C14294pm.m69144k4(patternFormat.getForeColor(), c10480iiM51263x1, 448, 449, y2nVar);
            backColor = patternFormat.getBackColor();
            i = 450;
        } else {
            c10609qn = new C10609qn(384, 1L);
            c10480iiM51263x1.m50930x1(c10609qn);
            C14294pm.m69144k4(patternFormat.getForeColor(), c10480iiM51263x1, 385, 386, y2nVar);
            backColor = patternFormat.getBackColor();
            i = 387;
        }
        C14294pm.m69144k4(backColor, c10480iiM51263x1, i, 388, y2nVar);
        c10480iiM51263x1.m50928kk(390);
        if (patternFormat.getPatternStyle() == 0 || patternFormat.getPatternStyle() == -1) {
            return;
        }
        C10609qn c10609qn2 = new C10609qn(z ? 453 : 390, true, 0L);
        c10480iiM51263x1.m50926k4(c10609qn2);
        y2nVar.m71947k4(c10609qn2, patternFormat.getPatternStyle());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71071k4(PatternFormat patternFormat, boolean z, ri7 ri7Var) {
        long j;
        ColorFormat colorFormat;
        int i;
        int i2;
        C10462h9 c10462h9M70140fa = ri7Var.m70140fa();
        ColorFormat colorFormat2 = (ColorFormat) patternFormat.getForeColor();
        if (z) {
            C14294pm.m69140k4(colorFormat2, c10462h9M70140fa, 448, 449, 0L);
            colorFormat = (ColorFormat) patternFormat.getBackColor();
            i = 388;
            j = 16777215;
            i2 = 450;
        } else {
            j = 16777215;
            C14294pm.m69140k4(colorFormat2, c10462h9M70140fa, 385, 386, 16777215L);
            colorFormat = (ColorFormat) patternFormat.getBackColor();
            i = 388;
            i2 = 387;
        }
        C14294pm.m69140k4(colorFormat, c10462h9M70140fa, i2, i, j);
        a3u a3uVarM64712du = ri7Var.m70149up().m64712du();
        C10609qn c10609qn = (C10609qn) C7019kk.m27452k4((Object) C10398dc.m50669x1(c10462h9M70140fa, z ? 453 : 390), C10609qn.class);
        patternFormat.setPatternStyle((byte) 0);
        if (c10609qn != null) {
            uki[] ukiVarArr = {null};
            boolean zTryGetValue = a3uVarM64712du.m71939c5().tryGetValue(Integer.valueOf((int) c10609qn.m51597ar()), ukiVarArr);
            uki ukiVar = ukiVarArr[0];
            if (zTryGetValue) {
                Byte[] bArr = {(byte) 0};
                boolean zTryGetValue2 = f49093x1.tryGetValue(Byte.valueOf(ukiVar.m71723m9()), bArr);
                byte bByteValue = bArr[0].byteValue();
                if (zTryGetValue2) {
                    patternFormat.setPatternStyle(bByteValue);
                    return;
                }
            }
            C14047bz c14047bzClone = a3uVarM64712du.m3200x6()[(int) (((c10609qn.m51597ar() & 4294967295L) - 1) & 4294967295L)].Clone();
            for (int i3 = 1; i3 < 49; i3++) {
                if (C14067j2.m66728k4(c14047bzClone.Clone(), C5133k4.m22000kk("resources/patterns", C14113y2.m67408k4(m71069k4(i3), " Guid.dat")).Clone().Clone())) {
                    patternFormat.setPatternStyle(f6b.m5928m9(i3));
                    return;
                }
            }
        }
    }
}
