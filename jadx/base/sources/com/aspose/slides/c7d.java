package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8210lt;
import com.aspose.slides.internal.p332p7.C8249m9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class c7d {
    /* JADX INFO: renamed from: k4 */
    public static void m4500k4(Ink ink, d7i d7iVar, C8210lt c8210lt) {
        if (c8210lt == null) {
            return;
        }
        d7iVar.m4969k4(c8210lt.m36425k4());
        d7iVar.m4974x1(c8210lt.m36431x1());
        d7iVar.m4971kk(c8210lt.m36428kk());
        if (c8210lt.m36430to() == null || c8210lt.m36430to().length <= 0) {
            return;
        }
        for (C8249m9 c8249m9 : c8210lt.m36430to()) {
            d7iVar.m4972to().addItem(c8249m9.mo28309k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4501k4(d7i d7iVar, C8210lt c8210lt) {
        c8210lt.m36427k4(d7iVar.m4968k4());
        c8210lt.m36432x1(d7iVar.m4973x1());
        c8210lt.m36429kk(d7iVar.m4970kk());
        if (d7iVar.m4972to().size() > 0) {
            List.Enumerator<String> it = d7iVar.m4972to().iterator();
            while (it.hasNext()) {
                try {
                    String next = it.next();
                    C8249m9 c8249m9 = new C8249m9();
                    c8249m9.mo28310k4(next);
                    c8210lt.m36426k4(c8249m9);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }
}
