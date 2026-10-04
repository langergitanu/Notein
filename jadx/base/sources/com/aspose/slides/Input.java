package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class Input {

    /* JADX INFO: renamed from: k4 */
    private final ITemplateEngine f2570k4;

    public Input(ITemplateEngine iTemplateEngine) {
        this.f2570k4 = iTemplateEngine;
    }

    public final <TContextObject> void addTemplate(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("key");
        }
        if (str2 == null) {
            throw new ArgumentNullException("path");
        }
        if (!C3131h4.m13361kk(str2)) {
            throw new ArgumentException(C14113y2.m67402k4("\"{0}\" does not exist", str2), "path");
        }
        try {
            m1841k4(str, str2, C7019kk.m27443k4((Class<?>) TemplateContext.class));
        } catch (RuntimeException e) {
            throw new Exception(C14113y2.m67400k4(C14113y2.m67402k4("Unhandled exception on adding template \"{0}\" from file \"{1}\":", str, str2), C14113y2.m67408k4(C14052dq.m66570kk(), e.getMessage())));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final <TContextObject> void m1842k4(String str, C14367qz<TContextObject> c14367qz) {
        ((zk0) C7019kk.m27452k4((Object) this.f2570k4, zk0.class)).m74552k4(str, c14367qz);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1841k4(String str, String str2, AbstractC14068j5 abstractC14068j5) {
        this.f2570k4.addTemplate(str, C3131h4.m13346c5(str2), abstractC14068j5);
    }
}
