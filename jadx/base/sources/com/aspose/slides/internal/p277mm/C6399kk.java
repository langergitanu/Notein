package com.aspose.slides.internal.p277mm;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p244l7.C6012x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p347px.C9580c5;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.mm.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6399kk {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Integer, C9579bv> f18184k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private static Dictionary<String, String> f18187x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private static Dictionary<String, String> f18185kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private static Dictionary<String, String> f18186to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private static Dictionary<String, String> f18183du = new Dictionary<>();

    static {
        f18187x1.addItem("ＭＳ Ｐゴシック", "MS PGothic");
        f18187x1.addItem("ＭＳ Ｐ明朝", "MS PMincho");
        f18187x1.addItem("ＭＳ ゴシック", "MS Gothic");
        f18187x1.addItem("ＭＳ 明朝", "MS Mincho");
        f18185kk.addItem("굴림체", "GulimChe");
        f18185kk.addItem("바탕체", "BatangChe");
        f18185kk.addItem("돋움체", "DotumChe");
        f18185kk.addItem("궁서체", "GungsuhChe");
        f18185kk.addItem("바탕", "Batang");
        f18185kk.addItem("굴림", "Gulim");
        f18185kk.addItem("돋움", "Dotum");
        f18185kk.addItem("궁서", "Gungsuh");
        f18185kk.addItem("휴먼아미체", "Ami R");
        f18185kk.addItem("HY목각파임B", "HYPMokGak-Bold");
        f18185kk.addItem("HY얕은샘물M", "HYShortSamul-Medium");
        f18185kk.addItem("HY엽서M", "HYPost-Medium");
        f18185kk.addItem("휴먼둥근헤드라인", "Headline R");
        f18185kk.addItem("휴먼편지체", "Pyunji R");
        f18185kk.addItem("HY견고딕", "HYGothic-Extra");
        f18185kk.addItem("HY신문명조", "HYSinMun-MyeongJo");
        f18185kk.addItem("HY견명조", "HYMyeongJo-Extra");
        f18185kk.addItem("HY타자M", "HYTaJa-Medium");
        f18185kk.addItem("휴먼각진헤드라인", "Headline Sans R");
        f18185kk.addItem("휴먼옛체", "Yet R");
        f18186to.addItem("宋体", "SimSun");
        f18186to.addItem("黑体", "SimHei");
        f18186to.addItem("仿宋_GB2312", "FangSong_GB2312");
        f18186to.addItem("楷体_GB2312", "KaiTi_GB2312");
        f18186to.addItem("幼圆", "YouYuan");
        f18186to.addItem("华文宋体", "STSong");
        f18186to.addItem("华文中宋", "STZhongsong");
        f18186to.addItem("华文楷体", "STKaiti");
        f18186to.addItem("华文仿宋", "STFangsong");
        f18186to.addItem("华文细黑", "STXihei");
        f18186to.addItem("华文隶书", "STLiti");
        f18186to.addItem("华文行楷", "STXingkai");
        f18186to.addItem("华文新魏", "STXinwei");
        f18186to.addItem("华文琥珀", "STHupo");
        f18186to.addItem("华文彩云", "STCaiyun");
        f18186to.addItem("方正姚体简体", "FZYaoTi");
        f18186to.addItem("方正舒体简体", "FZShuTi");
        f18186to.addItem("新宋体", "NSimSun");
        f18186to.addItem("隶书", "LiSu");
        f18183du.addItem("新細明體", "PMingLiu");
        f18183du.addItem("細明體", "MingLiu");
        f18183du.addItem("華康儷粗黑", "DFLiHeiBold(P)");
        f18183du.addItem("華康新儷粗黑", "DFLiHeiBold");
        f18183du.addItem("標楷體", "DFKai-SB");
    }

    /* JADX INFO: renamed from: k4 */
    public static C9579bv m26256k4(C6012x1.k4 k4Var) {
        C9579bv c9579bvM26257k4;
        Dictionary<String, String> dictionary;
        String str = k4Var.f17021yj;
        if ("".equals(str)) {
            c9579bvM26257k4 = null;
        } else {
            int iM26265kk = C6400x1.m26265kk(k4Var);
            c9579bvM26257k4 = m26257k4(str, iM26265kk);
            if (c9579bvM26257k4 == null) {
                byte b = k4Var.f17008c5;
                if (b == -128) {
                    dictionary = f18187x1;
                } else if (b == -127 || b == -126) {
                    dictionary = f18185kk;
                } else if (b == -122) {
                    dictionary = f18186to;
                } else if (b == -120) {
                    dictionary = f18183du;
                }
                c9579bvM26257k4 = m26258k4(str, iM26265kk, dictionary);
            }
        }
        return c9579bvM26257k4 == null ? m26259x1(k4Var) : c9579bvM26257k4;
    }

    /* JADX INFO: renamed from: x1 */
    private static C9579bv m26259x1(C6012x1.k4 k4Var) {
        int iHashCode = k4Var.hashCode();
        Dictionary<Integer, C9579bv> dictionary = f18184k4;
        if (dictionary.containsKey(Integer.valueOf(iHashCode))) {
            return dictionary.get_Item(Integer.valueOf(iHashCode));
        }
        C9579bv c9579bvM26254k4 = C6398k4.m26254k4(C9580c5.m46807k4(), k4Var);
        if (c9579bvM26254k4 != null) {
            dictionary.addItem(Integer.valueOf(iHashCode), c9579bvM26254k4);
        }
        return c9579bvM26254k4 == null ? C9580c5.m46807k4().mo46809k4("Arial", C6400x1.m26265kk(k4Var), null) : c9579bvM26254k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C9579bv m26257k4(String str, int i) {
        return C9580c5.m46807k4().mo46809k4(str, i, null);
    }

    /* JADX INFO: renamed from: k4 */
    private static C9579bv m26258k4(String str, int i, Dictionary<String, String> dictionary) {
        if (!dictionary.containsKey(str)) {
            return null;
        }
        C9579bv c9579bvM26257k4 = m26257k4(dictionary.get_Item(str), i);
        if (c9579bvM26257k4 != null) {
            return c9579bvM26257k4;
        }
        Dictionary.ValueCollection.Enumerator<String, String> it = dictionary.getValues().iterator();
        while (it.hasNext() && (c9579bvM26257k4 = m26257k4(it.next(), i)) == null) {
            try {
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c9579bvM26257k4;
    }
}
