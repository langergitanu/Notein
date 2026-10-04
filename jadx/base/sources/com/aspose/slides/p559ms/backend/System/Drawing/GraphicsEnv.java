package com.aspose.slides.p559ms.backend.System.Drawing;

import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GraphicsEnv {

    /* JADX INFO: renamed from: k4 */
    private static GraphicsEnv f47388k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC14121du f47390x1 = mo67577k4();

    /* JADX INFO: renamed from: kk */
    private AbstractC14124to f47389kk = mo67578x1();

    static {
        Iterator it = ServiceLoader.load(GraphicsEnv.class).iterator();
        while (it.hasNext()) {
            f47388k4 = (GraphicsEnv) it.next();
        }
    }

    /* JADX INFO: renamed from: du */
    public static InterfaceC14121du m67573du() {
        return m67574kk().f47390x1;
    }

    /* JADX INFO: renamed from: kk */
    public static synchronized GraphicsEnv m67574kk() {
        return f47388k4;
    }

    /* JADX INFO: renamed from: to */
    public static AbstractC14124to m67575to() {
        return m67574kk().f47389kk;
    }

    /* JADX INFO: renamed from: h4 */
    public abstract int mo67576h4();

    /* JADX INFO: renamed from: k4 */
    public abstract InterfaceC14121du mo67577k4();

    /* JADX INFO: renamed from: x1 */
    public abstract AbstractC14124to mo67578x1();
}
