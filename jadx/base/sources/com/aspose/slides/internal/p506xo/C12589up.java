package com.aspose.slides.internal.p506xo;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p045br.C1844m9;
import com.aspose.slides.internal.p240kw.C5995kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xo.up */
/* JADX INFO: loaded from: classes5.dex */
public class C12589up extends AbstractC12578c5 {

    /* JADX INFO: renamed from: du */
    protected static final Dictionary<String, C7182dy> f42128du;

    /* JADX INFO: renamed from: h4 */
    private C12582fa f42129h4;

    static {
        Dictionary<String, C7182dy> dictionary = new Dictionary<>();
        f42128du = dictionary;
        dictionary.addItem("Courier", C7182dy.f19578pi);
        dictionary.addItem("Courier-Bold", C7182dy.f19621sa);
        dictionary.addItem("Courier-BoldOblique", C7182dy.f19720yi);
        dictionary.addItem("Courier-Oblique", C7182dy.f19637tg);
        dictionary.addItem("Helvetica", C7182dy.f19516ls);
        dictionary.addItem("Helvetica-Bold", C7182dy.f19450hg);
        dictionary.addItem("Helvetica-BoldOblique", C7182dy.f19508l7);
        dictionary.addItem("Helvetica-Oblique", C7182dy.f19409eo);
        dictionary.addItem("Symbol", C7182dy.f19380d6);
        dictionary.addItem("Times-Roman", C7182dy.f19485jo);
        dictionary.addItem("Times-Bold", C7182dy.f19369cc);
        dictionary.addItem("Times-BoldItalic", C7182dy.f19544n7);
        dictionary.addItem("Times-Italic", C7182dy.f19414f2);
        dictionary.addItem("ZapfDingbats", C7182dy.f19744zo);
    }

    public C12589up() {
        m58778k4();
        this.f42121k4.m27815x1(C7182dy.f19585pu, C7182dy.f19660uu);
    }

    /* JADX INFO: renamed from: k4 */
    private void m58778k4() {
        C7185jd c7185jdM58775x1 = m58775x1(this.f42121k4.mo27767fa(C7182dy.f19687wt));
        if (c7185jdM58775x1 == null) {
            C7182dy c7182dyM27792du = this.f42121k4.m27792du(C7182dy.f19515lr);
            if (f42128du.containsKey(m58756du()) && (C7182dy.f19380d6.equals(c7182dyM27792du) || C7182dy.f19744zo.equals(c7182dyM27792du))) {
                m58763k4(c7182dyM27792du);
            } else {
                m58763k4((C7182dy) null);
            }
            C5995kk c5995kkM58774up = m58774up();
            if (c5995kkM58774up != null) {
                IGenericEnumerator<KeyValuePair<TKey, TValue>> it = c5995kkM58774up.m24224x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair keyValuePair = (KeyValuePair) it.next();
                        m58757dy().m26126k4(((Integer) keyValuePair.getKey()).intValue(), ((Integer) keyValuePair.getValue()).intValue());
                        m58761jd().m26126k4(((Integer) keyValuePair.getValue()).intValue(), ((Integer) keyValuePair.getKey()).intValue());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        } else if (C7019kk.m27469x1(c7185jdM58775x1, C7182dy.class)) {
            m58763k4((C7182dy) c7185jdM58775x1);
        } else if (C7019kk.m27469x1(c7185jdM58775x1, C7187kk.class)) {
            C7187kk c7187kk = (C7187kk) c7185jdM58775x1;
            C7185jd c7185jdM58775x12 = m58775x1(c7187kk.mo27767fa(C7182dy.f19665v4));
            if (c7185jdM58775x12 == null) {
                m58763k4((C7182dy) null);
            } else {
                m58763k4((C7182dy) c7185jdM58775x12);
            }
            m58765k4(c7187kk, null);
        }
        m58720u4();
    }

    /* JADX INFO: renamed from: wl */
    private void m58780wl() {
        m58772to();
        m58779k4(m58772to() == null);
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12578c5, com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: kk */
    public String mo58718kk(byte[] bArr, int i, int i2) {
        if (this.f42129h4 != null && m58772to() == null) {
            String strMo58718kk = this.f42129h4.mo58718kk(bArr, i, i2);
            if (!C14113y2.m67411k4(strMo58718kk)) {
                return strMo58718kk;
            }
        }
        return super.mo58718kk(bArr, i, i2);
    }

    public C12589up(C7187kk c7187kk) {
        super(c7187kk);
        m58778k4();
        m58780wl();
        AbstractC12580du abstractC12580duM58776x6 = m58776x6();
        if (abstractC12580duM58776x6 == null || !C7019kk.m27469x1(abstractC12580duM58776x6, C12583h4.class) || ((C12583h4) abstractC12580duM58776x6).m58739fa() == null) {
            return;
        }
        try {
            this.f42129h4 = new C12582fa(this.f42121k4);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m58779k4(boolean z) {
        AbstractC12580du abstractC12580duM58776x6 = m58776x6();
        if (abstractC12580duM58776x6 != null) {
            C7019kk.m27469x1(abstractC12580duM58776x6, C12583h4.class);
        }
    }

    public C12589up(String str) {
        this();
        m58767k4(str);
        m58762k4(new C1844m9());
        m58764k4((C7185jd) C7182dy.f19402ee);
    }
}
