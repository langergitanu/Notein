package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18385v2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.j6 */
/* JADX INFO: loaded from: classes3.dex */
class C13674j6 {

    /* JADX INFO: renamed from: k4 */
    private static final String[] f45414k4 = {"list-level-style-number", "list-level-style-bullet", "list-level-style-image"};

    /* JADX INFO: renamed from: k4 */
    private static byte m63221k4(String... strArr) {
        if (strArr == null || strArr.length != 3) {
            throw new ArgumentException("templateParams");
        }
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        if ("(".equals(str) && ")".equals(str3) && "a".equals(str2)) {
            return (byte) 8;
        }
        if ("".equals(str) && ")".equals(str3) && "a".equals(str2)) {
            return (byte) 9;
        }
        if ("".equals(str) && ".".equals(str3) && "a".equals(str2)) {
            return (byte) 0;
        }
        if ("(".equals(str) && ")".equals(str3) && C18385v2.f56336h.equals(str2)) {
            return (byte) 10;
        }
        if ("".equals(str) && ")".equals(str3) && C18385v2.f56336h.equals(str2)) {
            return (byte) 11;
        }
        if ("".equals(str) && ".".equals(str3) && C18385v2.f56336h.equals(str2)) {
            return (byte) 1;
        }
        if ("".equals(str) && ".".equals(str3) && "1".equals(str2)) {
            return (byte) 3;
        }
        if ("(".equals(str) && ")".equals(str3) && "1".equals(str2)) {
            return (byte) 12;
        }
        if ("".equals(str) && ")".equals(str3) && "1".equals(str2)) {
            return (byte) 2;
        }
        if ("".equals(str) && "".equals(str3) && "1".equals(str2)) {
            return (byte) 28;
        }
        if ("(".equals(str) && ")".equals(str3) && ContextChain.TAG_INFRA.equals(str2)) {
            return (byte) 4;
        }
        if ("".equals(str) && ")".equals(str3) && ContextChain.TAG_INFRA.equals(str2)) {
            return (byte) 5;
        }
        if ("".equals(str) && ".".equals(str3) && ContextChain.TAG_INFRA.equals(str2)) {
            return (byte) 6;
        }
        if ("(".equals(str) && ")".equals(str3) && "I".equals(str2)) {
            return (byte) 14;
        }
        if ("".equals(str) && ")".equals(str3) && "I".equals(str2)) {
            return (byte) 15;
        }
        return ("".equals(str) && ".".equals(str3) && "I".equals(str2)) ? (byte) 7 : (byte) -1;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m63230x1(IParagraphFormat iParagraphFormat, PortionCollection portionCollection, com.aspose.slides.internal.p332p7.w7y w7yVar, int i, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.gwj gwjVarM41762to;
        C7394ca c7394caM63223k4 = m63223k4(w7yVar, i);
        if (c7394caM63223k4 == null) {
            return;
        }
        if ("list-level-style-number".equals(c7394caM63223k4.m29539k4())) {
            com.aspose.slides.internal.p332p7.pcw pcwVar = (com.aspose.slides.internal.p332p7.pcw) c7394caM63223k4.m29542x1();
            m63228k4(iParagraphFormat, pcwVar, wxbVar);
            m63226k4(iParagraphFormat, portionCollection, pcwVar.m38855c5(), wxbVar);
            gwjVarM41762to = pcwVar.m38857dy();
        } else if ("list-level-style-bullet".equals(c7394caM63223k4.m29539k4())) {
            com.aspose.slides.internal.p332p7.him himVar = (com.aspose.slides.internal.p332p7.him) c7394caM63223k4.m29542x1();
            m63227k4(iParagraphFormat, himVar);
            m63226k4(iParagraphFormat, portionCollection, himVar.m33461h4(), wxbVar);
            gwjVarM41762to = himVar.m33460du();
        } else {
            if (!"list-level-style-image".equals(c7394caM63223k4.m29539k4())) {
                throw new ArgumentOutOfRangeException();
            }
            com.aspose.slides.internal.p332p7.tiw tiwVar = (com.aspose.slides.internal.p332p7.tiw) c7394caM63223k4.m29542x1();
            m63229k4(iParagraphFormat, tiwVar, wxbVar);
            gwjVarM41762to = tiwVar.m41762to();
        }
        m63224k4(iParagraphFormat, portionCollection, gwjVarM41762to, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m63222k4(PortionCollection portionCollection, com.aspose.slides.internal.p332p7.zob zobVar) {
        lrb lrbVarM2305bv = ((Portion) portionCollection.get_Item(0)).m2295x1().m2305bv();
        double dM72703h4 = wgi.m72703h4(zobVar.m45808jd());
        if (C14044b3.m66437kk(dM72703h4)) {
            return 100.0f;
        }
        return (float) ((dM72703h4 * 100.0d) / ((double) lrbVarM2305bv.getFontHeight()));
    }

    /* JADX INFO: renamed from: k4 */
    public static C7394ca m63223k4(com.aspose.slides.internal.p332p7.w7y w7yVar, int i) {
        boolean zM27456k4;
        if (w7yVar == null) {
            return null;
        }
        List.Enumerator<C7394ca> it = w7yVar.m43546x1().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if ("list-level-style-number".equals(next.m29539k4())) {
                    if ((((com.aspose.slides.internal.p332p7.pcw) next.m29542x1()).m38862kk() & 4294967295L) == i) {
                        if (zM27456k4) {
                            return next;
                        }
                        return next;
                    }
                } else if ("list-level-style-bullet".equals(next.m29539k4())) {
                    if ((((com.aspose.slides.internal.p332p7.him) next.m29542x1()).m33465kk() & 4294967295L) == i) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                            return next;
                        }
                        return next;
                    }
                } else if ("list-level-style-image".equals(next.m29539k4()) && (((com.aspose.slides.internal.p332p7.tiw) next.m29542x1()).m41763x1() & 4294967295L) == i) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63224k4(IParagraphFormat iParagraphFormat, PortionCollection portionCollection, com.aspose.slides.internal.p332p7.gwj gwjVar, wxb wxbVar) {
        if (iParagraphFormat == null) {
            throw new ArgumentNullException("paragraphFormat");
        }
        if (gwjVar == null) {
            return;
        }
        if (wgi.m72731kk(gwjVar.m32966k4()) && wgi.m72731kk(gwjVar.m32972x1())) {
            float fM72703h4 = (float) wgi.m72703h4(gwjVar.m32972x1());
            float fM72703h42 = (float) wgi.m72703h4(gwjVar.m32966k4());
            if (fM72703h4 >= 0.0f) {
                fM72703h4 *= -1.0f;
            }
            iParagraphFormat.setIndent(fM72703h4);
            if (C14064he.m66715kk(iParagraphFormat.getMarginLeft()) || iParagraphFormat.getMarginLeft() < fM72703h42) {
                iParagraphFormat.setMarginLeft(fM72703h42 - iParagraphFormat.getIndent());
            }
        } else {
            if (wgi.m72731kk(gwjVar.m32972x1())) {
                iParagraphFormat.setIndent(((float) wgi.m72703h4(gwjVar.m32972x1())) * (-1.0f));
                iParagraphFormat.setMarginLeft(iParagraphFormat.getIndent() * (-1.0f));
            }
            if (wgi.m72731kk(gwjVar.m32966k4())) {
                float fM72703h43 = (float) wgi.m72703h4(gwjVar.m32966k4());
                if (C14064he.m66715kk(iParagraphFormat.getMarginLeft()) || iParagraphFormat.getMarginLeft() < fM72703h43) {
                    iParagraphFormat.setMarginLeft(fM72703h43);
                }
            }
        }
        if (iParagraphFormat.getBullet().getType() == 3 && wgi.m72731kk(gwjVar.m32969kk())) {
            float width = iParagraphFormat.getBullet().getPicture().getImage().getWidth();
            float fM72703h44 = ((float) wgi.m72703h4(gwjVar.m32969kk())) / width;
            if (fM72703h44 < 1.0f) {
                fM72703h44 = 1.0f;
            }
            float f = width * fM72703h44;
            iParagraphFormat.getBullet().setHeight(C14064he.m66715kk((portionCollection == null || portionCollection.getCount() <= 0) ? iParagraphFormat.getDefaultPortionFormat().getFontHeight() : ((Portion) portionCollection.get_Item(0)).m2295x1().m2305bv().getFontHeight()) ? 100.0f : (float) C14116yg.m67501x1((f / r4) * 100.0f));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63225k4(IParagraphFormat iParagraphFormat, PortionCollection portionCollection, com.aspose.slides.internal.p332p7.w7y w7yVar, int i, wxb wxbVar) {
        iParagraphFormat.setDepth((short) C3085sv.m13072k4(i - 1, 0, 8));
        m63230x1(iParagraphFormat, portionCollection, w7yVar, i, wxbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m63226k4(IParagraphFormat iParagraphFormat, PortionCollection portionCollection, com.aspose.slides.internal.p332p7.zob zobVar, wxb wxbVar) {
        float fM63222k4;
        FontData fontData;
        if (zobVar == null) {
            return;
        }
        IBulletFormat bullet = iParagraphFormat.getBullet();
        if (!wgi.m72731kk(zobVar.m45808jd()) || !wgi.m72742x1(zobVar.m45808jd())) {
            if (portionCollection != null && portionCollection.getCount() > 0 && !wgi.m72742x1(zobVar.m45808jd())) {
                fM63222k4 = m63222k4(portionCollection, zobVar);
            }
            if (wgi.m72731kk(zobVar.m45804h4())) {
                String strM67401k4 = C14113y2.m67401k4(zobVar.m45804h4(), "'", "");
                byte b = (wgi.m72731kk(zobVar.m45791c5()) && C14113y2.m67363du("x-symbol", zobVar.m45791c5())) ? (byte) 2 : (byte) 1;
                if (wxbVar.m72957k4().m69951k4().m2385ks().m7124k4(strM67401k4, b, 0, 18.0f, 0, false).m68818to() || (b == 2 && !C14117yj.m67513ck(bullet.getChar()))) {
                    fontData = new FontData(strM67401k4, b);
                } else {
                    FontData fontData2 = C13827mb.f46185k4;
                    fontData = new FontData(fontData2, fontData2.getFontName(), b);
                }
                bullet.setFont(fontData);
                bullet.setBulletHardFont((byte) 1);
            }
            if (wgi.m72731kk(zobVar.m45829x1())) {
                return;
            }
            ((ColorFormat) bullet.getColor()).m1080k4(wgi.m72698ck(zobVar.m45829x1()).Clone());
            bullet.setBulletHardColor((byte) 1);
            return;
        }
        fM63222k4 = wgi.m72737to(zobVar.m45808jd());
        bullet.setHeight(fM63222k4);
        if (wgi.m72731kk(zobVar.m45804h4())) {
        }
        if (wgi.m72731kk(zobVar.m45829x1())) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63227k4(IParagraphFormat iParagraphFormat, com.aspose.slides.internal.p332p7.him himVar) {
        BulletFormat bulletFormat = (BulletFormat) iParagraphFormat.getBullet();
        bulletFormat.setType((byte) 1);
        bulletFormat.setChar(himVar.m33466to());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63228k4(IParagraphFormat iParagraphFormat, com.aspose.slides.internal.p332p7.pcw pcwVar, wxb wxbVar) {
        BulletFormat bulletFormat = (BulletFormat) iParagraphFormat.getBullet();
        if (C14113y2.m67411k4(pcwVar.m38865to())) {
            return;
        }
        bulletFormat.setType((byte) 2);
        String strM38856du = pcwVar.m38856du();
        if (strM38856du == null) {
            strM38856du = "";
        }
        String strM38865to = pcwVar.m38865to();
        if (strM38865to == null) {
            strM38865to = "";
        }
        String strM38858h4 = pcwVar.m38858h4();
        bulletFormat.setNumberedBulletStyle(m63221k4(strM38856du, strM38865to, strM38858h4 != null ? strM38858h4 : ""));
        if ((pcwVar.m38864m9() & 4294967295L) != 1) {
            bulletFormat.setNumberedBulletStartWith((short) pcwVar.m38864m9());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63229k4(IParagraphFormat iParagraphFormat, com.aspose.slides.internal.p332p7.tiw tiwVar, wxb wxbVar) {
        BulletFormat bulletFormat = (BulletFormat) iParagraphFormat.getBullet();
        bulletFormat.setType((byte) 3);
        bulletFormat.getPicture().setImage(wxbVar.m72957k4().m69949k4(tiwVar.m41760kk()));
    }
}
