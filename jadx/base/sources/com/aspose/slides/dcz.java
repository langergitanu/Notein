package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class dcz {
    /* JADX INFO: renamed from: k4 */
    public static int m5045k4(byte b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return 2;
        }
        if (b != 2) {
            return b != 3 ? 0 : 4;
        }
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.lxj m5046k4(short s, Dictionary<com.aspose.slides.internal.p332p7.lxj, Short> dictionary) {
        List list = new List();
        Dictionary.Enumerator<com.aspose.slides.internal.p332p7.lxj, Short> it = dictionary.iterator();
        com.aspose.slides.internal.p332p7.lxj lxjVar = null;
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (((Short) next.getValue()).shortValue() == s) {
                    lxjVar = (com.aspose.slides.internal.p332p7.lxj) next.getKey();
                } else if (((Short) next.getValue()).shortValue() > s) {
                    list.addItem(next.getKey());
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
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                dictionary.removeItemByKey((com.aspose.slides.internal.p332p7.lxj) it2.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        return lxjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:6:0x002b, B:8:0x0031, B:12:0x0047, B:20:0x005c, B:33:0x00e6, B:35:0x00f9, B:23:0x007c, B:25:0x0090, B:31:0x00d9, B:26:0x00b6, B:28:0x00ca), top: B:45:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m5047k4(TextFrame textFrame, C7394ca.k4 k4Var, pkv pkvVar) {
        C7394ca.k4 k4Var2;
        short sShortValue;
        com.aspose.slides.internal.p332p7.lxj lxjVar;
        if (textFrame.getParagraphs().getCount() == 0) {
            return;
        }
        Dictionary dictionary = new Dictionary();
        boolean zM27469x1 = C7019kk.m27469x1(textFrame.m2924kk(), Cell.class);
        IGenericEnumerator<IParagraph> it = textFrame.getParagraphs().iterator();
        byte b = -1;
        com.aspose.slides.internal.p332p7.lxj lxjVarM5046k4 = null;
        while (it.hasNext()) {
            try {
                Paragraph paragraph = (Paragraph) it.next();
                byte[] bArr = {0};
                boolean zM5051k4 = m5051k4(paragraph, bArr);
                byte b2 = bArr[0];
                if (zM5051k4 && (lxjVarM5046k4 == null || lxjVarM5046k4.m36511du().length == 0 || (b != -1 && b2 != b))) {
                    k4Var2 = k4Var;
                    lxjVarM5046k4 = (com.aspose.slides.internal.p332p7.lxj) k4Var2.mo2788k4("list").m29542x1();
                    dictionary.clear();
                    dictionary.set_Item(lxjVarM5046k4, Short.valueOf(paragraph.getParagraphFormat().getDepth()));
                } else {
                    k4Var2 = k4Var;
                    if (zM5051k4) {
                        if (((Short) dictionary.get_Item(lxjVarM5046k4)).shortValue() < paragraph.getParagraphFormat().getDepth()) {
                            lxjVarM5046k4 = (com.aspose.slides.internal.p332p7.lxj) lxjVarM5046k4.m36511du()[lxjVarM5046k4.m36511du().length - 1].m28417k4("list").m29542x1();
                            dictionary.set_Item(lxjVarM5046k4, Short.valueOf(paragraph.getParagraphFormat().getDepth()));
                        } else if (((Short) dictionary.get_Item(lxjVarM5046k4)).shortValue() > paragraph.getParagraphFormat().getDepth()) {
                            lxjVarM5046k4 = m5046k4(paragraph.getParagraphFormat().getDepth(), (Dictionary<com.aspose.slides.internal.p332p7.lxj, Short>) dictionary);
                        }
                        if (lxjVarM5046k4 != null) {
                            sShortValue = ((Short) dictionary.get_Item(lxjVarM5046k4)).shortValue();
                        }
                    } else {
                        sShortValue = 0;
                        lxjVarM5046k4 = null;
                    }
                    com.aspose.slides.internal.p332p7.lxj[] lxjVarArr = {lxjVarM5046k4};
                    scx.m70509k4(paragraph, textFrame, zM27469x1, lxjVarArr, sShortValue + 1, k4Var2, pkvVar);
                    lxjVar = lxjVarArr[0];
                    if (lxjVar == null) {
                        dictionary.set_Item(lxjVar, Short.valueOf(paragraph.getParagraphFormat().getDepth()));
                    }
                    lxjVarM5046k4 = lxjVar;
                    b = b2;
                }
                sShortValue = 0;
                com.aspose.slides.internal.p332p7.lxj[] lxjVarArr2 = {lxjVarM5046k4};
                scx.m70509k4(paragraph, textFrame, zM27469x1, lxjVarArr2, sShortValue + 1, k4Var2, pkvVar);
                lxjVar = lxjVarArr2[0];
                if (lxjVar == null) {
                }
                lxjVarM5046k4 = lxjVar;
                b = b2;
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5048k4(TextFrame textFrame, C7394ca.k4 k4Var, String str, pkv pkvVar) {
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (k4Var == null) {
            throw new ArgumentNullException("addTextElements");
        }
        m5049k4(textFrame, pkvVar.m4421kk().get_Item(str));
        m5047k4(textFrame, k4Var, pkvVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m5049k4(TextFrame textFrame, final com.aspose.slides.internal.p332p7.lzc lzcVar) {
        w0l w0lVar;
        double d;
        double d2;
        C0880d4 c0880d4;
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to());
        if (rsvVar == null) {
            rsvVar = new com.aspose.slides.internal.p332p7.rsv();
        }
        w0l w0lVarM2937b3 = textFrame.m2908jd().m2937b3();
        int iM5045k4 = m5045k4(w0lVarM2937b3.getAnchoringType());
        if (iM5045k4 != 0) {
            rsvVar.m40519x1(iM5045k4);
        }
        double marginLeft = w0lVarM2937b3.getMarginLeft();
        double marginTop = w0lVarM2937b3.getMarginTop();
        double marginRight = w0lVarM2937b3.getMarginRight();
        double marginBottom = w0lVarM2937b3.getMarginBottom();
        GeometryShape geometryShape = (GeometryShape) C7019kk.m27452k4((Object) textFrame.m2924kk(), GeometryShape.class);
        if (geometryShape == null || (c0880d4 = (C0880d4) C7019kk.m27452k4((Object) ((GeometryShape) textFrame.m2924kk()).mo272to(), C0880d4.class)) == null || c0880d4.m4914m9() == null) {
            w0lVar = w0lVarM2937b3;
            d = marginLeft;
            d2 = marginTop;
        } else {
            tbp tbpVar = new tbp();
            w0lVar = w0lVarM2937b3;
            tbp tbpVar2 = new tbp();
            C1258im c1258im = new C1258im();
            tbp[] tbpVarArr = {tbpVar};
            tbp[] tbpVarArr2 = {tbpVar2};
            C1258im[] c1258imArr = {c1258im};
            ai9.m3628k4(c0880d4.m4914m9(), tbpVarArr, tbpVarArr2, c1258imArr);
            tbpVarArr[0].CloneTo(tbpVar);
            tbpVarArr2[0].CloneTo(tbpVar2);
            c1258imArr[0].CloneTo(c1258im);
            nuk nukVar = new nuk();
            tbpVar.m71061du().CloneTo(nukVar.f47615k4);
            tbpVar2.m71061du().CloneTo(nukVar.f47617x1);
            nuk nukVarClone = geometryShape.m2546bz().m5637k4(nukVar).Clone();
            IShapeFrame frame = geometryShape.getFrame();
            double x = marginLeft + ((double) (nukVarClone.f47615k4.f47836k4 - frame.getX()));
            double y = marginTop + ((double) (nukVarClone.f47615k4.f47837x1 - frame.getY()));
            d = x;
            marginRight += (double) ((frame.getWidth() + frame.getX()) - (nukVarClone.f47615k4.f47836k4 + nukVarClone.f47617x1.f47836k4));
            marginBottom += (double) ((frame.getHeight() + frame.getY()) - (nukVarClone.f47615k4.f47837x1 + nukVarClone.f47617x1.f47837x1));
            d2 = y;
        }
        double d3 = d;
        if (!C14044b3.m66437kk(d3)) {
            rsvVar.m40513wl(wgi.m72741x1(d3));
        }
        if (!C14044b3.m66437kk(marginRight)) {
            rsvVar.m40495qq(wgi.m72741x1(marginRight));
        }
        if (!C14044b3.m66437kk(d2)) {
            rsvVar.m40503u4(wgi.m72741x1(d2));
        }
        if (!C14044b3.m66437kk(marginBottom)) {
            rsvVar.m40509uz(wgi.m72741x1(marginBottom));
        }
        if (w0lVar.getWrapText()) {
            rsvVar.m40499to(2);
        } else {
            rsvVar.m40499to(1);
        }
        if (!C7019kk.m27469x1(textFrame.m2924kk(), Cell.class) && w0lVar.getTextVerticalType() == 1) {
            ((com.aspose.slides.internal.p332p7.mdp) wgi.m72713k4(com.aspose.slides.internal.p332p7.mdp.class, "paragraph-properties", lzcVar.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.dcz.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(lzcVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return lzcVar.m36545k4(str);
                }
            })).m36883to(3);
        }
        if (((com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to())) == null) {
            lzcVar.m36548k4(new C7394ca("graphic-properties", rsvVar));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5050k4(TextFrame textFrame, final com.aspose.slides.internal.p332p7.pb4 pb4Var, com.aspose.slides.internal.p332p7.vtn vtnVar, pkv pkvVar) {
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (vtnVar == null) {
            throw new ArgumentNullException("frameElement");
        }
        com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("pr", 10);
        vtnVar.m43302kk(lzcVarM69128k4.m36546k4());
        if (!textFrame.m2908jd().m2937b3().m72612fa()) {
            com.aspose.slides.internal.p332p7.lzc lzcVarM69128k42 = pkvVar.m69128k4("P", 2);
            vtnVar.m43290du(lzcVarM69128k42.m36546k4());
            ((com.aspose.slides.internal.p332p7.mdp) lzcVarM69128k42.m36545k4("paragraph-properties").m29542x1()).m36872k4((byte) 1);
        }
        m5049k4(textFrame, lzcVarM69128k4);
        m5047k4(textFrame, new C7394ca.k4() { // from class: com.aspose.slides.dcz.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(pb4Var) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfdraw_CT_TextBoxElementData.AddContentElements(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return pb4Var.m38780k4(str);
            }
        }, pkvVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m5051k4(Paragraph paragraph, byte[] bArr) {
        if (paragraph.m2161k4().m2206x1().m429c5() && paragraph.m2161k4().m2206x1().getType() > 0) {
            bArr[0] = paragraph.m2161k4().m2206x1().getType();
            return true;
        }
        byte type = paragraph.m2161k4().getEffective().getBullet().getType();
        bArr[0] = type;
        return type > 0;
    }
}
