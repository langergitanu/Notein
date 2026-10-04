package com.aspose.slides.internal.p112en;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.en.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C3773m9 {

    /* JADX INFO: renamed from: k4 */
    private final IGenericDictionary<C7182dy, InterfaceC3764c5> f10288k4;

    public C3773m9() {
        Dictionary dictionary = new Dictionary();
        this.f10288k4 = dictionary;
        C3767dy c3767dy = new C3767dy();
        new C3766du();
        C3772kk c3772kk = new C3772kk();
        C3768fa c3768fa = new C3768fa();
        C3776x1 c3776x1 = new C3776x1();
        C3771k4 c3771k4 = new C3771k4();
        C3777yj c3777yj = new C3777yj();
        C3774to c3774to = new C3774to();
        C3765ck c3765ck = new C3765ck();
        C3770jd c3770jd = new C3770jd();
        dictionary.addItem(C7182dy.f19604r5, c3767dy);
        dictionary.addItem(C7182dy.f19553nx, c3767dy);
        dictionary.addItem(C7182dy.f19742zm, c3765ck);
        dictionary.addItem(C7182dy.f19465ii, c3765ck);
        dictionary.addItem(C7182dy.f19669vh, c3772kk);
        dictionary.addItem(C7182dy.f19601qw, c3772kk);
        dictionary.addItem(C7182dy.f19514lq, c3768fa);
        dictionary.addItem(C7182dy.f19571p4, c3768fa);
        dictionary.addItem(C7182dy.f19471ix, c3776x1);
        dictionary.addItem(C7182dy.f19649u4, c3776x1);
        dictionary.addItem(C7182dy.f19502ks, c3771k4);
        dictionary.addItem(C7182dy.f19614rv, c3771k4);
        dictionary.addItem(C7182dy.f19555nz, c3777yj);
        dictionary.addItem(C7182dy.f19576pd, c3777yj);
        dictionary.addItem(C7182dy.f19724yo, c3774to);
        dictionary.addItem(C7182dy.f19537mx, c3765ck);
        dictionary.addItem(C7182dy.f19602qx, c3770jd);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC3764c5 m15098k4(C7182dy c7182dy) {
        if (this.f10288k4.containsKey(c7182dy)) {
            return this.f10288k4.get_Item(c7182dy);
        }
        throw new IOException(C14113y2.m67402k4("Unknown stream filter is encountered: {0}", c7182dy));
    }
}
