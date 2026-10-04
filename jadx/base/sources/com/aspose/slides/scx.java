package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18385v2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class scx {
    /* JADX INFO: renamed from: k4 */
    public static com.aspose.slides.internal.p332p7.aq8 m70502k4(int i, int i2, com.aspose.slides.internal.p332p7.lxj[] lxjVarArr, com.aspose.slides.internal.p332p7.w7y w7yVar) {
        lxjVarArr[0].m36513k4(w7yVar.m43545k4());
        if (i <= 1 || i - i2 <= 0) {
            return lxjVarArr[0].m36516x1();
        }
        lxjVarArr[0] = (com.aspose.slides.internal.p332p7.lxj) lxjVarArr[0].m36516x1().m28417k4("list").m29542x1();
        return m70502k4(i, i2 + 1, lxjVarArr, w7yVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.aspose.slides.internal.p332p7.gwj m70510x1(Paragraph paragraph, IParagraphFormatEffectiveData iParagraphFormatEffectiveData, int i, com.aspose.slides.internal.p332p7.w7y w7yVar) {
        com.aspose.slides.internal.p332p7.zob zobVarM38866x1;
        com.aspose.slides.internal.p332p7.pcw pcwVar = (com.aspose.slides.internal.p332p7.pcw) w7yVar.m43544k4("list-level-style-number").m29542x1();
        pcwVar.m38860k4(((long) i) & 4294967295L);
        byte numberedBulletStyle = iParagraphFormatEffectiveData.getBullet().getNumberedBulletStyle();
        if (numberedBulletStyle != 14) {
            if (numberedBulletStyle != 15) {
                if (numberedBulletStyle == 28) {
                    pcwVar.m38861k4("1");
                } else if (numberedBulletStyle != 29) {
                    switch (numberedBulletStyle) {
                        case 0:
                            pcwVar.m38863kk(".");
                            pcwVar.m38861k4("a");
                            break;
                        case 1:
                            pcwVar.m38863kk(".");
                            pcwVar.m38861k4(C18385v2.f56336h);
                            break;
                        case 2:
                            pcwVar.m38863kk(")");
                            pcwVar.m38861k4("1");
                            break;
                        case 3:
                            pcwVar.m38863kk(".");
                            pcwVar.m38861k4("1");
                            break;
                        case 4:
                            pcwVar.m38868x1("(");
                            pcwVar.m38863kk(")");
                            pcwVar.m38861k4(ContextChain.TAG_INFRA);
                            break;
                        case 5:
                            pcwVar.m38863kk(")");
                            pcwVar.m38861k4(ContextChain.TAG_INFRA);
                            break;
                        case 6:
                            pcwVar.m38863kk(".");
                            pcwVar.m38861k4(ContextChain.TAG_INFRA);
                            break;
                        case 7:
                            pcwVar.m38863kk(".");
                            break;
                        case 8:
                            pcwVar.m38868x1("(");
                            pcwVar.m38863kk(")");
                            pcwVar.m38861k4("a");
                            break;
                        case 9:
                            pcwVar.m38863kk(")");
                            pcwVar.m38861k4("a");
                            break;
                        case 10:
                            pcwVar.m38868x1("(");
                            pcwVar.m38863kk(")");
                            pcwVar.m38861k4(C18385v2.f56336h);
                            break;
                        case 11:
                            pcwVar.m38863kk(")");
                            pcwVar.m38861k4(C18385v2.f56336h);
                            break;
                        case 12:
                            pcwVar.m38868x1("(");
                            pcwVar.m38863kk(")");
                            pcwVar.m38861k4("1");
                            break;
                        default:
                            pcwVar.m38861k4("");
                            break;
                    }
                }
                pcwVar.m38867x1(((long) iParagraphFormatEffectiveData.getBullet().getNumberedBulletStartWith()) & 4294967295L);
                com.aspose.slides.internal.p332p7.gwj gwjVarM38859k4 = pcwVar.m38859k4();
                zobVarM38866x1 = pcwVar.m38866x1();
                zobVarM38866x1.m45793c5(wgi.m72700du(iParagraphFormatEffectiveData.getBullet().getHeight()));
                if (paragraph.getParagraphFormat().getBullet().isBulletHardFont() == 1 && iParagraphFormatEffectiveData.getBullet().getFont().getFontName().length() > 0) {
                    zobVarM38866x1.m45806h4(iParagraphFormatEffectiveData.getBullet().getFont().getFontName().charAt(0) == '+' ? C14113y2.m67408k4("'", iParagraphFormatEffectiveData.getBullet().getFont().getFontName(), "'") : C14113y2.m67408k4("'", iParagraphFormatEffectiveData.getBullet().getFont().getFontName(paragraph.m2169up().getSlide().createThemeEffective()), "'"));
                }
                if (paragraph.getParagraphFormat().getBullet().isBulletHardColor() == 1) {
                    zobVarM38866x1.m45813k4(wgi.m72720k4(((C14176nc) iParagraphFormatEffectiveData.getBullet().getFillFormat()).m67938m9().Clone()));
                    return gwjVarM38859k4;
                }
                if (paragraph.getPortions().getCount() > 0) {
                    m70505k4(paragraph.getParagraphFormat(), (Portion) paragraph.getPortions().get_Item(0), zobVarM38866x1);
                }
                return gwjVarM38859k4;
            }
            pcwVar.m38861k4("I");
            pcwVar.m38867x1(((long) iParagraphFormatEffectiveData.getBullet().getNumberedBulletStartWith()) & 4294967295L);
            com.aspose.slides.internal.p332p7.gwj gwjVarM38859k42 = pcwVar.m38859k4();
            zobVarM38866x1 = pcwVar.m38866x1();
            zobVarM38866x1.m45793c5(wgi.m72700du(iParagraphFormatEffectiveData.getBullet().getHeight()));
            if (paragraph.getParagraphFormat().getBullet().isBulletHardFont() == 1) {
                zobVarM38866x1.m45806h4(iParagraphFormatEffectiveData.getBullet().getFont().getFontName().charAt(0) == '+' ? C14113y2.m67408k4("'", iParagraphFormatEffectiveData.getBullet().getFont().getFontName(), "'") : C14113y2.m67408k4("'", iParagraphFormatEffectiveData.getBullet().getFont().getFontName(paragraph.m2169up().getSlide().createThemeEffective()), "'"));
            }
            if (paragraph.getParagraphFormat().getBullet().isBulletHardColor() == 1) {
            }
        } else {
            pcwVar.m38868x1("(");
        }
        pcwVar.m38863kk(")");
        pcwVar.m38861k4("I");
        pcwVar.m38867x1(((long) iParagraphFormatEffectiveData.getBullet().getNumberedBulletStartWith()) & 4294967295L);
        com.aspose.slides.internal.p332p7.gwj gwjVarM38859k422 = pcwVar.m38859k4();
        zobVarM38866x1 = pcwVar.m38866x1();
        zobVarM38866x1.m45793c5(wgi.m72700du(iParagraphFormatEffectiveData.getBullet().getHeight()));
        if (paragraph.getParagraphFormat().getBullet().isBulletHardFont() == 1) {
        }
        if (paragraph.getParagraphFormat().getBullet().isBulletHardColor() == 1) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.gwj m70503k4(Paragraph paragraph, IParagraphFormatEffectiveData iParagraphFormatEffectiveData, int i, com.aspose.slides.internal.p332p7.w7y w7yVar) {
        com.aspose.slides.internal.p332p7.him himVar = (com.aspose.slides.internal.p332p7.him) w7yVar.m43544k4("list-level-style-bullet").m29542x1();
        himVar.m33464k4(((long) i) & 4294967295L);
        himVar.m33463k4(iParagraphFormatEffectiveData.getBullet().getChar());
        com.aspose.slides.internal.p332p7.gwj gwjVarM33462k4 = himVar.m33462k4();
        com.aspose.slides.internal.p332p7.zob zobVarM33467x1 = himVar.m33467x1();
        zobVarM33467x1.m45793c5(wgi.m72700du(iParagraphFormatEffectiveData.getBullet().getHeight()));
        zobVarM33467x1.m45806h4(iParagraphFormatEffectiveData.getBullet().getFont().getFontName().charAt(0) != '+' ? C14113y2.m67408k4("'", iParagraphFormatEffectiveData.getBullet().getFont().getFontName(), "'") : C14113y2.m67408k4("'", iParagraphFormatEffectiveData.getBullet().getFont().getFontName(paragraph.m2169up().getSlide().createThemeEffective()), "'"));
        if (iParagraphFormatEffectiveData.getBullet().getFillFormat().getFillType() == 1) {
            zobVarM33467x1.m45813k4(wgi.m72720k4(((C14176nc) iParagraphFormatEffectiveData.getBullet().getFillFormat()).m67938m9().Clone()));
        }
        return gwjVarM33462k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.w7y m70504k4(Paragraph paragraph, int i, pkv pkvVar, com.aspose.slides.internal.p332p7.gwj[] gwjVarArr) {
        gwjVarArr[0] = null;
        com.aspose.slides.internal.p332p7.w7y w7yVarM69129k4 = pkvVar.m69129k4("L");
        IParagraphFormatEffectiveData effective = paragraph.getParagraphFormat().getEffective();
        byte type = effective.getBullet().getType();
        if (type == 1) {
            gwjVarArr[0] = m70503k4(paragraph, effective, i, w7yVarM69129k4);
            return w7yVarM69129k4;
        }
        if (type == 2) {
            gwjVarArr[0] = m70510x1(paragraph, effective, i, w7yVarM69129k4);
            return w7yVarM69129k4;
        }
        if (type != 3) {
            return w7yVarM69129k4;
        }
        m70508k4(paragraph, effective, i, w7yVarM69129k4, pkvVar);
        return w7yVarM69129k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70505k4(IParagraphFormat iParagraphFormat, Portion portion, com.aspose.slides.internal.p332p7.zob zobVar) {
        IPortionFormatEffectiveData effective = portion.getPortionFormat().getEffective();
        if (effective.getFillFormat().getFillType() == 1) {
            zobVar.m45813k4(wgi.m72720k4(((C14176nc) effective.getFillFormat()).m67938m9().Clone()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70506k4(IParagraphFormatEffectiveData iParagraphFormatEffectiveData, com.aspose.slides.internal.p332p7.gwj gwjVar) {
        if (gwjVar == null) {
            return;
        }
        if (!C14044b3.m66437kk(iParagraphFormatEffectiveData.getIndent()) && !C14044b3.m66437kk(iParagraphFormatEffectiveData.getMarginLeft())) {
            float marginLeft = iParagraphFormatEffectiveData.getMarginLeft() + iParagraphFormatEffectiveData.getIndent();
            if (marginLeft != 0.0f) {
                gwjVar.m32968k4(wgi.m72741x1(marginLeft));
            }
        }
        if (C14044b3.m66437kk(iParagraphFormatEffectiveData.getIndent())) {
            return;
        }
        gwjVar.m32974x1(wgi.m72741x1(iParagraphFormatEffectiveData.getIndent() * (-1.0f)));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70507k4(IParagraphFormatEffectiveData iParagraphFormatEffectiveData, com.aspose.slides.internal.p332p7.mdp mdpVar) {
        if (!C14044b3.m66437kk(iParagraphFormatEffectiveData.getIndent())) {
            mdpVar.m36866h4(wgi.m72741x1(iParagraphFormatEffectiveData.getIndent()));
        }
        if (C14044b3.m66437kk(iParagraphFormatEffectiveData.getMarginLeft())) {
            return;
        }
        mdpVar.m36884to(wgi.m72741x1(iParagraphFormatEffectiveData.getMarginLeft()));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70508k4(Paragraph paragraph, IParagraphFormatEffectiveData iParagraphFormatEffectiveData, int i, com.aspose.slides.internal.p332p7.w7y w7yVar, pkv pkvVar) {
        IBulletFormatEffectiveData bullet = iParagraphFormatEffectiveData.getBullet();
        if (bullet.getFillFormat().getFillType() != 4 || bullet.getFillFormat().getPictureFillFormat().getPicture().getImage() == null) {
            return;
        }
        PPImage pPImage = (PPImage) bullet.getFillFormat().getPictureFillFormat().getPicture().getImage();
        com.aspose.slides.internal.p332p7.tiw tiwVar = (com.aspose.slides.internal.p332p7.tiw) w7yVar.m43544k4("list-level-style-image").m29542x1();
        tiwVar.m41758k4(((long) i) & 4294967295L);
        tiwVar.m41757k4(1);
        tiwVar.m41764x1(1);
        tiwVar.m41761kk(1);
        tiwVar.m41759k4(pkvVar.m69130x1().m2056k4(pPImage));
        com.aspose.slides.internal.p332p7.gwj gwjVarM41756k4 = tiwVar.m41756k4();
        gwjVarM41756k4.m32973x1(2);
        gwjVarM41756k4.m32967k4(8);
        gwjVarM41756k4.m32970kk(wgi.m72717k4(pPImage.getWidth()));
        gwjVarM41756k4.m32971to(wgi.m72717k4(pPImage.getHeight()));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b7 A[LOOP:0: B:51:0x01b5->B:52:0x01b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ea A[Catch: all -> 0x01f4, LOOP:1: B:76:0x01e4->B:60:0x01ea, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x01f4, blocks: (B:58:0x01e4, B:60:0x01ea), top: B:76:0x01e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fc A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m70509k4(Paragraph paragraph, TextFrame textFrame, boolean z, com.aspose.slides.internal.p332p7.lxj[] lxjVarArr, int i, C7394ca.k4 k4Var, pkv pkvVar) {
        C7394ca c7394caMo2788k4;
        com.aspose.slides.internal.p332p7.ok7 ok7Var;
        com.aspose.slides.internal.p332p7.mdp mdpVar;
        float fontHeight;
        ITabEffectiveData[] tabs;
        IGenericEnumerator<IPortion> it;
        boolean zM27456k4;
        if (paragraph == null) {
            throw new ArgumentNullException("paragraph");
        }
        if (k4Var == null) {
            throw new ArgumentNullException("addPElementDelegate");
        }
        fqc fqcVarM2200ks = paragraph.m2161k4().m2200ks();
        boolean z2 = false;
        com.aspose.slides.internal.p332p7.gwj gwjVar = null;
        if (lxjVarArr[0] == null) {
            c7394caMo2788k4 = k4Var.mo2788k4(ContextChain.TAG_PRODUCT);
        } else {
            if (!C14113y2.m67411k4(paragraph.m2168to())) {
                int depth = paragraph.getParagraphFormat().getDepth() + 1;
                com.aspose.slides.internal.p332p7.gwj[] gwjVarArr = {null};
                com.aspose.slides.internal.p332p7.w7y w7yVarM70504k4 = m70504k4(paragraph, depth, pkvVar, gwjVarArr);
                com.aspose.slides.internal.p332p7.gwj gwjVar2 = gwjVarArr[0];
                ok7Var = (com.aspose.slides.internal.p332p7.ok7) m70502k4(depth, i, lxjVarArr, w7yVarM70504k4).m28417k4(ContextChain.TAG_PRODUCT).m29542x1();
                gwjVar = gwjVar2;
                com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("P", 2);
                ok7Var.m38329x1(lzcVarM69128k4.m36546k4());
                mdpVar = (com.aspose.slides.internal.p332p7.mdp) lzcVarM69128k4.m36545k4("paragraph-properties").m29542x1();
                mdpVar.m36873k4(q9u.f48267dy.get_Item(Integer.valueOf(fqcVarM2200ks.getAlignment())).intValue());
                if (lxjVarArr[0] != null) {
                    m70507k4(fqcVarM2200ks, mdpVar);
                } else {
                    m70506k4(fqcVarM2200ks, gwjVar);
                    if (C7019kk.m27469x1(textFrame.m2924kk(), SmartArtShape.class)) {
                    }
                }
                if (!C14044b3.m66437kk(fqcVarM2200ks.getMarginRight())) {
                    mdpVar.m36860du(wgi.m72741x1(fqcVarM2200ks.getMarginRight()));
                }
                fontHeight = fqcVarM2200ks.getDefaultPortionFormat().getFontHeight();
                if ((fqcVarM2200ks.getSpaceBefore() <= 0.05f || fqcVarM2200ks.getSpaceAfter() > 0.05f) && paragraph.getPortions().getCount() > 0) {
                }
                if (!C14044b3.m66437kk(fqcVarM2200ks.getSpaceBefore())) {
                    mdpVar.m36879m9(wgi.m72741x1(ay6.m3796du(fqcVarM2200ks.getSpaceBefore(), fontHeight)));
                }
                if (!C14044b3.m66437kk(fqcVarM2200ks.getSpaceAfter())) {
                    mdpVar.m36862dy(wgi.m72741x1(ay6.m3796du(fqcVarM2200ks.getSpaceAfter(), fontHeight)));
                }
                if (!C14044b3.m66437kk(fqcVarM2200ks.getSpaceWithin())) {
                    mdpVar.m36889x1(wgi.m72704h4(fqcVarM2200ks.getSpaceWithin()));
                }
                if (!C14044b3.m66437kk(fqcVarM2200ks.getDefaultTabSize()) && fqcVarM2200ks.getDefaultTabSize() > 0.0f) {
                    mdpVar.m36876kk(wgi.m72741x1(fqcVarM2200ks.getDefaultTabSize()));
                }
                tabs = fqcVarM2200ks.getTabs();
                if (tabs != null && tabs.length > 0) {
                    com.aspose.slides.internal.p332p7.dxw dxwVar = (com.aspose.slides.internal.p332p7.dxw) mdpVar.m36870k4("tab-stops").m29542x1();
                    for (ITabEffectiveData iTabEffectiveData : tabs) {
                        com.aspose.slides.internal.p332p7.c0x c0xVar = new com.aspose.slides.internal.p332p7.c0x();
                        c0xVar.m29380k4(wgi.m72741x1(iTabEffectiveData.getPosition()));
                        dxwVar.m30698k4(c0xVar);
                    }
                }
                if (z && C14113y2.m67411k4(paragraph.m2168to())) {
                    z2 = true;
                }
                it = paragraph.getPortions().iterator();
                while (it.hasNext()) {
                    try {
                        c0l.m4412k4((Portion) it.next(), textFrame, z2, ok7Var, pkvVar);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (zM27456k4) {
                    return;
                } else {
                    return;
                }
            }
            if (lxjVarArr[0].m36511du().length == 0) {
                com.aspose.slides.internal.p332p7.gwj[] gwjVarArr2 = {null};
                com.aspose.slides.internal.p332p7.w7y w7yVarM70504k42 = m70504k4(paragraph, paragraph.getParagraphFormat().getDepth() + 1, pkvVar, gwjVarArr2);
                gwjVar = gwjVarArr2[0];
                lxjVarArr[0].m36513k4(w7yVarM70504k42.m43545k4());
                c7394caMo2788k4 = lxjVarArr[0].m36512k4().m39031k4(ContextChain.TAG_PRODUCT);
            } else {
                c7394caMo2788k4 = lxjVarArr[0].m36511du()[lxjVarArr[0].m36511du().length - 1].m28417k4(ContextChain.TAG_PRODUCT);
            }
        }
        ok7Var = (com.aspose.slides.internal.p332p7.ok7) c7394caMo2788k4.m29542x1();
        com.aspose.slides.internal.p332p7.lzc lzcVarM69128k42 = pkvVar.m69128k4("P", 2);
        ok7Var.m38329x1(lzcVarM69128k42.m36546k4());
        mdpVar = (com.aspose.slides.internal.p332p7.mdp) lzcVarM69128k42.m36545k4("paragraph-properties").m29542x1();
        mdpVar.m36873k4(q9u.f48267dy.get_Item(Integer.valueOf(fqcVarM2200ks.getAlignment())).intValue());
        if (lxjVarArr[0] != null) {
        }
        if (!C14044b3.m66437kk(fqcVarM2200ks.getMarginRight())) {
        }
        fontHeight = fqcVarM2200ks.getDefaultPortionFormat().getFontHeight();
        fontHeight = fqcVarM2200ks.getSpaceBefore() <= 0.05f ? ((Portion) paragraph.getPortions().get_Item(0)).f3048k4.mo7668k4(true).Clone().m56575x1() : ((Portion) paragraph.getPortions().get_Item(0)).f3048k4.mo7668k4(true).Clone().m56575x1();
        if (!C14044b3.m66437kk(fqcVarM2200ks.getSpaceBefore())) {
        }
        if (!C14044b3.m66437kk(fqcVarM2200ks.getSpaceAfter())) {
        }
        if (!C14044b3.m66437kk(fqcVarM2200ks.getSpaceWithin())) {
        }
        if (!C14044b3.m66437kk(fqcVarM2200ks.getDefaultTabSize())) {
            mdpVar.m36876kk(wgi.m72741x1(fqcVarM2200ks.getDefaultTabSize()));
        }
        tabs = fqcVarM2200ks.getTabs();
        if (tabs != null) {
            com.aspose.slides.internal.p332p7.dxw dxwVar2 = (com.aspose.slides.internal.p332p7.dxw) mdpVar.m36870k4("tab-stops").m29542x1();
            while (i < r1) {
            }
        }
        if (z) {
            z2 = true;
        }
        it = paragraph.getPortions().iterator();
        while (it.hasNext()) {
        }
    }
}
