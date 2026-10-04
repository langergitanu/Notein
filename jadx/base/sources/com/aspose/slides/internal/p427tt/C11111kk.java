package com.aspose.slides.internal.p427tt;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p244l7.C6012x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tt.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11111kk {

    /* JADX INFO: renamed from: du */
    private static final Dictionary<String, String> f38442du;

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Integer, C9790ts> f38443k4 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<String, String> f38444kk;

    /* JADX INFO: renamed from: to */
    private static final Dictionary<String, String> f38445to;

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<String, String> f38446x1;

    static {
        Dictionary<String, String> dictionary = new Dictionary<>();
        f38446x1 = dictionary;
        Dictionary<String, String> dictionary2 = new Dictionary<>();
        f38444kk = dictionary2;
        Dictionary<String, String> dictionary3 = new Dictionary<>();
        f38445to = dictionary3;
        Dictionary<String, String> dictionary4 = new Dictionary<>();
        f38442du = dictionary4;
        dictionary.addItem("ＭＳ Ｐゴシック", "MS PGothic");
        dictionary.addItem("ＭＳ Ｐ明朝", "MS PMincho");
        dictionary.addItem("ＭＳ ゴシック", "MS Gothic");
        dictionary.addItem("ＭＳ 明朝", "MS Mincho");
        dictionary2.addItem("굴림체", "GulimChe");
        dictionary2.addItem("바탕체", "BatangChe");
        dictionary2.addItem("돋움체", "DotumChe");
        dictionary2.addItem("궁서체", "GungsuhChe");
        dictionary2.addItem("바탕", "Batang");
        dictionary2.addItem("굴림", "Gulim");
        dictionary2.addItem("돋움", "Dotum");
        dictionary2.addItem("궁서", "Gungsuh");
        dictionary2.addItem("휴먼아미체", "Ami R");
        dictionary2.addItem("HY목각파임B", "HYPMokGak-Bold");
        dictionary2.addItem("HY얕은샘물M", "HYShortSamul-Medium");
        dictionary2.addItem("HY엽서M", "HYPost-Medium");
        dictionary2.addItem("휴먼둥근헤드라인", "Headline R");
        dictionary2.addItem("휴먼편지체", "Pyunji R");
        dictionary2.addItem("HY견고딕", "HYGothic-Extra");
        dictionary2.addItem("HY신문명조", "HYSinMun-MyeongJo");
        dictionary2.addItem("HY견명조", "HYMyeongJo-Extra");
        dictionary2.addItem("HY타자M", "HYTaJa-Medium");
        dictionary2.addItem("휴먼각진헤드라인", "Headline Sans R");
        dictionary2.addItem("휴먼옛체", "Yet R");
        dictionary3.addItem("宋体", "SimSun");
        dictionary3.addItem("黑体", "SimHei");
        dictionary3.addItem("仿宋_GB2312", "FangSong_GB2312");
        dictionary3.addItem("楷体_GB2312", "KaiTi_GB2312");
        dictionary3.addItem("幼圆", "YouYuan");
        dictionary3.addItem("华文宋体", "STSong");
        dictionary3.addItem("华文中宋", "STZhongsong");
        dictionary3.addItem("华文楷体", "STKaiti");
        dictionary3.addItem("华文仿宋", "STFangsong");
        dictionary3.addItem("华文细黑", "STXihei");
        dictionary3.addItem("华文隶书", "STLiti");
        dictionary3.addItem("华文行楷", "STXingkai");
        dictionary3.addItem("华文新魏", "STXinwei");
        dictionary3.addItem("华文琥珀", "STHupo");
        dictionary3.addItem("华文彩云", "STCaiyun");
        dictionary3.addItem("方正姚体简体", "FZYaoTi");
        dictionary3.addItem("方正舒体简体", "FZShuTi");
        dictionary3.addItem("新宋体", "NSimSun");
        dictionary3.addItem("隶书", "LiSu");
        dictionary4.addItem("新細明體", "PMingLiu");
        dictionary4.addItem("細明體", "MingLiu");
        dictionary4.addItem("華康儷粗黑", "DFLiHeiBold(P)");
        dictionary4.addItem("華康新儷粗黑", "DFLiHeiBold");
        dictionary4.addItem("標楷體", "DFKai-SB");
    }

    /* JADX INFO: renamed from: k4 */
    public static C9790ts m53646k4(C6012x1.k4 k4Var) {
        C9790ts c9790tsM53647k4;
        Dictionary<String, String> dictionary;
        String str = k4Var.f17021yj;
        if ("".equals(str)) {
            c9790tsM53647k4 = null;
        } else {
            int iM53660kk = C11113x1.m53660kk(k4Var);
            c9790tsM53647k4 = m53647k4(str, iM53660kk);
            if (c9790tsM53647k4 == null) {
                byte b = k4Var.f17008c5;
                if (b == -128) {
                    dictionary = f38446x1;
                } else if (b == -127 || b == -126) {
                    dictionary = f38444kk;
                } else if (b == -122) {
                    dictionary = f38445to;
                } else if (b == -120) {
                    dictionary = f38442du;
                }
                c9790tsM53647k4 = m53648k4(str, iM53660kk, dictionary);
            }
        }
        return c9790tsM53647k4 == null ? m53649x1(k4Var) : c9790tsM53647k4;
    }

    /* JADX INFO: renamed from: x1 */
    private static C9790ts m53649x1(C6012x1.k4 k4Var) {
        int iM53651k4 = C11112to.f38447k4.m53651k4(k4Var);
        Dictionary<Integer, C9790ts> dictionary = f38443k4;
        if (dictionary.containsKey(Integer.valueOf(iM53651k4))) {
            return dictionary.get_Item(Integer.valueOf(iM53651k4));
        }
        C9790ts c9790tsM53640k4 = C11110k4.m53640k4(C9763ck.m48030to(), k4Var);
        if (c9790tsM53640k4 != null) {
            dictionary.addItem(Integer.valueOf(iM53651k4), c9790tsM53640k4);
        }
        return c9790tsM53640k4 == null ? C9763ck.m48030to().mo48032k4("Arial", C11113x1.m53660kk(k4Var), (String) null) : c9790tsM53640k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C9790ts m53647k4(String str, int i) {
        return C9763ck.m48030to().mo48031k4(str, i);
    }

    /* JADX INFO: renamed from: k4 */
    private static C9790ts m53648k4(String str, int i, Dictionary<String, String> dictionary) {
        if (!dictionary.containsKey(str)) {
            return null;
        }
        C9790ts c9790tsM53647k4 = m53647k4(dictionary.get_Item(str), i);
        if (c9790tsM53647k4 != null) {
            return c9790tsM53647k4;
        }
        Dictionary.ValueCollection.Enumerator<String, String> it = dictionary.getValues().iterator();
        while (it.hasNext() && (c9790tsM53647k4 = m53647k4(it.next(), i)) == null) {
            try {
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c9790tsM53647k4;
    }
}
