package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.rv */
/* JADX INFO: loaded from: classes.dex */
public class C5956rv {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m24097k4(AbstractC13901ga abstractC13901ga, AbstractC4705c6 abstractC4705c6, int i, AbstractC5941k4 abstractC5941k4) {
        if (C7019kk.m27469x1(abstractC13901ga, InterfaceC5919c6.class)) {
            ((InterfaceC5919c6) abstractC13901ga).mo23905k4(abstractC4705c6, i, abstractC5941k4);
        } else {
            m24099x1(abstractC13901ga, abstractC4705c6, i, abstractC5941k4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public static void m24099x1(AbstractC13901ga abstractC13901ga, AbstractC4705c6 abstractC4705c6, int i, AbstractC5941k4 abstractC5941k4) {
        if (abstractC13901ga == null) {
            throw new ArgumentNullException("node");
        }
        IEnumerator it = abstractC13901ga.getChildNodes().iterator();
        while (it.hasNext()) {
            try {
                m24097k4((AbstractC13901ga) it.next(), abstractC4705c6, i, abstractC5941k4);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m24098k4(AbstractC13901ga abstractC13901ga, C6765kp c6765kp, int i, AbstractC5941k4 abstractC5941k4) {
        if (C7019kk.m27469x1(abstractC13901ga, InterfaceC5919c6.class)) {
            ((InterfaceC5919c6) abstractC13901ga).mo23906k4(c6765kp, i, abstractC5941k4);
        } else {
            m24100x1(abstractC13901ga, c6765kp, i, abstractC5941k4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public static void m24100x1(AbstractC13901ga abstractC13901ga, C6765kp c6765kp, int i, AbstractC5941k4 abstractC5941k4) {
        if (abstractC13901ga == null) {
            throw new ArgumentNullException("node");
        }
        IEnumerator it = abstractC13901ga.getChildNodes().iterator();
        while (it.hasNext()) {
            try {
                m24098k4((AbstractC13901ga) it.next(), c6765kp, i, abstractC5941k4);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }
}
