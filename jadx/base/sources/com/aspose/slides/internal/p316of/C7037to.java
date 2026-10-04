package com.aspose.slides.internal.p316of;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p268m7.C6325k4;
import com.aspose.slides.internal.p268m7.C6326kk;
import com.aspose.slides.internal.p268m7.C6327x1;
import com.aspose.slides.internal.p274mh.C6387x1;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14052dq;

/* JADX INFO: renamed from: com.aspose.slides.internal.of.to */
/* JADX INFO: loaded from: classes4.dex */
public class C7037to {
    /* JADX INFO: renamed from: du */
    private static C12004dy m27505du(int i) {
        return C7035kk.m27502x1(i != 0 ? i != 1 ? "Monospaced" : "SansSerif" : "Serif");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12004dy m27506k4(int i) {
        C12004dy c12004dyM27508to;
        if (!C14052dq.f47191x1) {
            c12004dyM27508to = C14052dq.m66573to().m67327k4() == 4 ? m27508to(i) : (C14052dq.m66573to().m67327k4() == 6 || C14052dq.m66573to().m67327k4() == 7) ? m27507kk(i) : m27509x1(i);
        }
        if (c12004dyM27508to != null) {
            return c12004dyM27508to;
        }
        throw new ArgumentException("Unable to find any font for: GenericFontFamilies." + C14042ak.m66410k4(C6387x1.class, i));
    }

    /* JADX INFO: renamed from: kk */
    private static C12004dy m27507kk(int i) {
        C12004dy c12004dyM27486k4 = C7033h4.m27486k4(i);
        if (c12004dyM27486k4 == null) {
            c12004dyM27486k4 = C6327x1.m25894k4(Integer.valueOf(i));
        }
        return c12004dyM27486k4 == null ? m27505du(i) : c12004dyM27486k4;
    }

    /* JADX INFO: renamed from: to */
    private static C12004dy m27508to(int i) {
        C12004dy c12004dyM25891k4 = C6325k4.m25891k4(i);
        if (c12004dyM25891k4 == null) {
            c12004dyM25891k4 = C7033h4.m27486k4(i);
        }
        if (c12004dyM25891k4 == null) {
            c12004dyM25891k4 = C6327x1.m25894k4(Integer.valueOf(i));
        }
        return c12004dyM25891k4 == null ? m27505du(i) : c12004dyM25891k4;
    }

    /* JADX INFO: renamed from: x1 */
    private static C12004dy m27509x1(int i) {
        C12004dy c12004dyM25892k4 = C6326kk.m25892k4(i);
        if (c12004dyM25892k4 == null) {
            c12004dyM25892k4 = C7033h4.m27486k4(i);
        }
        if (c12004dyM25892k4 == null) {
            c12004dyM25892k4 = C6327x1.m25894k4(Integer.valueOf(i));
        }
        return c12004dyM25892k4 == null ? m27505du(i) : c12004dyM25892k4;
    }
}
