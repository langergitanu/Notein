package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10374bs;
import com.aspose.slides.internal.p407st.C10398dc;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10711xc;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.vi */
/* JADX INFO: loaded from: classes3.dex */
class C14680vi {
    /* JADX INFO: renamed from: k4 */
    public static void m72288k4(byte b, C10711xc c10711xc) {
        if (b != -1) {
            C10374bs c10374bs = (C10374bs) c10711xc.m51976x1().m50923k4(447);
            if (c10374bs == null) {
                C10480ii c10480iiM51976x1 = c10711xc.m51976x1();
                c10374bs = new C10374bs();
                c10480iiM51976x1.m50926k4(c10374bs);
            }
            c10374bs.m50485ck(b == 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb A[PHI: r9 r19
      0x00cb: PHI (r9v11 long) = (r9v1 long), (r9v1 long), (r9v1 long), (r9v1 long), (r9v1 long), (r9v1 long), (r9v8 long), (r9v12 long), (r9v13 long) binds: [B:49:0x0136, B:51:0x0141, B:47:0x0113, B:46:0x0105, B:44:0x00ff, B:45:0x0101, B:42:0x00ec, B:31:0x00b4, B:22:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r19v4 java.lang.Class) = 
      (r19v0 java.lang.Class)
      (r19v0 java.lang.Class)
      (r19v0 java.lang.Class)
      (r19v0 java.lang.Class)
      (r19v0 java.lang.Class)
      (r19v0 java.lang.Class)
      (r19v1 java.lang.Class)
      (r19v5 java.lang.Class)
      (r19v6 java.lang.Class)
     binds: [B:49:0x0136, B:51:0x0141, B:47:0x0113, B:46:0x0105, B:44:0x00ff, B:45:0x0101, B:42:0x00ec, B:31:0x00b4, B:22:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m72289k4(IFillFormat iFillFormat, ri7 ri7Var) {
        Class cls;
        long j;
        long j2;
        byte b;
        C12009k4 c12009k4;
        byte b2;
        C10609qn c10609qnM50667kk;
        long j3;
        long jM51597ar;
        int i;
        C10462h9 c10462h9M70140fa = ri7Var.m70140fa();
        C10609qn c10609qn = (C10609qn) C7019kk.m27452k4((Object) C10398dc.m50669x1(c10462h9M70140fa, 447), C10609qn.class);
        C10711xc c10711xcMo50863m9 = c10462h9M70140fa.mo50863m9();
        C10609qn c10609qn2 = (c10711xcMo50863m9 == null || c10711xcMo50863m9.m51976x1() == null) ? null : (C10609qn) C7019kk.m27452k4((Object) c10711xcMo50863m9.m51976x1().m50923k4(447), C10374bs.class);
        C10462h9 c10462h9 = ri7Var.m70147rv() != null ? (C10462h9) ri7Var.m70147rv().m69489kk() : null;
        if (C14294pm.m69146k4(c10609qn == null ? c10609qn2 : c10609qn, c10462h9M70140fa, c10462h9)) {
            cls = C10609qn.class;
            j = 0;
            long jM50663k4 = C10398dc.m50663k4(c10462h9M70140fa, c10462h9, 384, c10462h9M70140fa.mo50864to().m52025c5() != 75 ? 0L : 4294967295L);
            switch ((int) jM50663k4) {
                case -1:
                    j2 = 0;
                    long jM50663k42 = C10398dc.m50663k4(c10462h9M70140fa, c10462h9, 385, 4294967295L);
                    long jM50663k43 = C10398dc.m50663k4(c10462h9M70140fa, c10462h9, 386, 4294967295L);
                    if (jM50663k42 == 4294967295L && jM50663k43 == 4294967295L) {
                        b = 0;
                        iFillFormat.setFillType((byte) 0);
                    } else {
                        b = 0;
                        iFillFormat.setFillType((byte) 1);
                        C14294pm.m69141k4(iFillFormat.getSolidFillColor(), c10462h9M70140fa, c10462h9, 385, 386, 16777215L);
                    }
                    break;
                case 0:
                    j2 = 0;
                    iFillFormat.setFillType((byte) 1);
                    C14294pm.m69141k4(iFillFormat.getSolidFillColor(), c10462h9M70140fa, c10462h9, 385, 386, 16777215L);
                    b = 0;
                    break;
                case 1:
                    iFillFormat.setFillType((byte) 3);
                    tbt.m71071k4((PatternFormat) iFillFormat.getPatternFormat(), false, ri7Var);
                    if (iFillFormat.getPatternFormat().getPatternStyle() == 0) {
                        long jM50663k44 = C10398dc.m50663k4(c10462h9M70140fa, c10462h9, 390, 0L) & 4294967295L;
                        if (jM50663k44 > 0) {
                            j2 = 0;
                            if (jM50663k44 < ri7Var.m70149up().m64712du().m71939c5().size() + 1) {
                                iFillFormat.setFillType((byte) 4);
                                moa.m64927k4((PictureFillFormat) iFillFormat.getPictureFillFormat(), 2L, ri7Var);
                                IPPImage image = iFillFormat.getPictureFillFormat().getPicture().getImage();
                                if (image != null && ((C10398dc.m50669x1(c10462h9M70140fa, 385) != null || C10398dc.m50669x1(c10462h9M70140fa, 387) != null) && !"image/x-wmf".equals(image.getContentType()))) {
                                    C12009k4 c12009k42 = (C12009k4) ((PPImage) iFillFormat.getPictureFillFormat().getPicture().getImage()).m2131k4();
                                    try {
                                        int i2 = 8;
                                        if (c12009k42.mo15760yj() == 8 && c12009k42.mo15757m9() == 8) {
                                            try {
                                                c12009k4 = new C12009k4(8, 8, 2498570);
                                            } catch (RuntimeException e) {
                                                e = e;
                                                c12009k4 = null;
                                            }
                                            try {
                                                C12003du c12003duClone = ((ColorFormat) iFillFormat.getPatternFormat().getBackColor()).m1084to().Clone();
                                                C12003du c12003duClone2 = ((ColorFormat) iFillFormat.getPatternFormat().getForeColor()).m1084to().Clone();
                                                int i3 = 0;
                                                while (i3 < i2) {
                                                    int i4 = 0;
                                                    while (i4 < i2) {
                                                        c12009k4.m56604k4(i3, i4, c12009k42.m56609x1(i3, i4).m56506h4() == C12003du.m56460uz().m56506h4() ? c12003duClone.Clone() : c12003duClone2.Clone());
                                                        i4++;
                                                        i2 = 8;
                                                    }
                                                    i3++;
                                                    i2 = 8;
                                                }
                                                iFillFormat.getPictureFillFormat().getPicture().setImage(((ImageCollection) ri7Var.m70149up().m64712du().m71946k4().getImages()).m1724k4(c12009k4));
                                                c12009k4.dispose();
                                            } catch (RuntimeException e2) {
                                                e = e2;
                                                C3085sv.m13082k4(e);
                                                if (c12009k4 != null) {
                                                    c12009k4.dispose();
                                                }
                                            }
                                        }
                                        c12009k42.dispose();
                                    } catch (Throwable th) {
                                        if (c12009k42 != null) {
                                            c12009k42.dispose();
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            j2 = j;
                        }
                        b = 0;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    iFillFormat.setFillType((byte) 4);
                    moa.m64927k4((PictureFillFormat) iFillFormat.getPictureFillFormat(), jM50663k4, ri7Var);
                    j2 = j;
                    b = 0;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    iFillFormat.setFillType((byte) 2);
                    C1160gs.m6896k4((GradientFormat) iFillFormat.getGradientFormat(), ri7Var);
                    j2 = j;
                    b = 0;
                    break;
                case 8:
                default:
                    b2 = -1;
                    iFillFormat.setFillType(b2);
                    j2 = j;
                    b = 0;
                    break;
                case 9:
                    AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) ((FillFormat) iFillFormat).getParent_IPresentationComponent(), AutoShape.class);
                    if (autoShape != null) {
                        autoShape.setUseBackgroundFill(true);
                    }
                    j2 = j;
                    b = 0;
                    break;
            }
        } else {
            C10609qn c10609qn3 = (C10609qn) C7019kk.m27452k4((Object) C10398dc.m50669x1(c10462h9M70140fa, 385), C10609qn.class);
            if (c10609qn != null || c10609qn3 == null || c10462h9M70140fa.mo50864to().m52025c5() == 75) {
                cls = C10609qn.class;
                j = 0;
                if ((c10609qn == null && !c10462h9M70140fa.mo50864to().m52044to() && c10462h9M70140fa.mo50864to().m52025c5() == 202) || c10462h9M70140fa.mo50859du() == null) {
                    iFillFormat.setFillType((byte) 1);
                    ((ColorFormat) iFillFormat.getSolidFillColor()).m1080k4(C12003du.m56385i5().Clone());
                } else {
                    b2 = 0;
                    iFillFormat.setFillType(b2);
                }
            } else {
                iFillFormat.setFillType((byte) 1);
                cls = C10609qn.class;
                j = 0;
                C14294pm.m69141k4(iFillFormat.getSolidFillColor(), c10462h9M70140fa, c10462h9, 385, 386, 16777215L);
            }
            j2 = j;
            b = 0;
        }
        if (c10609qn2 != null) {
            c10609qn = c10609qn2;
        }
        if (c10462h9 != null) {
            C10711xc c10711xcMo50863m92 = c10462h9.mo50863m9();
            if (c10711xcMo50863m92 == null || c10711xcMo50863m92.m51976x1() == null) {
                i = 447;
                c10609qnM50667kk = null;
            } else {
                i = 447;
                c10609qnM50667kk = (C10609qn) C7019kk.m27452k4((Object) c10711xcMo50863m92.m51976x1().m50923k4(447), cls);
            }
            if (c10609qnM50667kk == null) {
                c10609qnM50667kk = C10398dc.m50667kk(c10462h9, i);
            }
        } else {
            c10609qnM50667kk = null;
        }
        if (c10609qn != null) {
            jM51597ar = c10609qn.m51597ar();
            if (c10609qnM50667kk != null) {
                long j4 = (jM51597ar & 4294967295L) >> 16;
                jM51597ar = (c10609qnM50667kk.m51597ar() & (~(j4 & 4294967295L)) & 4294967295L) | (j4 & 4294967295L & c10609qn.m51597ar());
            }
        } else {
            if (c10609qnM50667kk == null) {
                j3 = 4294967295L;
                if (j3 != 4294967295L) {
                    iFillFormat.setRotateWithShape((byte) -1);
                    return;
                } else {
                    iFillFormat.setRotateWithShape((j3 & 32) != j2 ? (byte) 1 : b);
                    return;
                }
            }
            jM51597ar = c10609qnM50667kk.m51597ar();
        }
        j3 = C18177fb.f54859s & jM51597ar;
        if (j3 != 4294967295L) {
        }
    }

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
    /* JADX INFO: renamed from: k4 */
    public static void m72290k4(
    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
