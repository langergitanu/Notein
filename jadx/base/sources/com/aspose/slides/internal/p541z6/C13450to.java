package com.aspose.slides.internal.p541z6;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.huawei.hms.common.util.ExtractNativeUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.z6.to */
/* JADX INFO: loaded from: classes5.dex */
public class C13450to {

    /* JADX INFO: renamed from: k4 */
    public static final C13450to f45032k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC13441ck f45035kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f45036m9;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC13440c5 f45038x1;

    /* JADX INFO: renamed from: to */
    private long f45037to = C7019kk.m27461m9(1073741824, 9);

    /* JADX INFO: renamed from: du */
    private long f45033du = C7019kk.m27461m9(Integer.valueOf(ExtractNativeUtils.f52517e), 9);

    /* JADX INFO: renamed from: h4 */
    private long f45034h4 = C13447k4.f45030k4;

    static {
        C13450to c13450to = new C13450to(new C13445h4());
        f45032k4 = c13450to;
        c13450to.m62568k4(true);
    }

    public C13450to(InterfaceC13440c5 interfaceC13440c5, InterfaceC13441ck interfaceC13441ck) {
        if (interfaceC13440c5 == null) {
            throw new ArgumentNullException("errorHandler");
        }
        if (interfaceC13441ck == null) {
            throw new ArgumentNullException("tempFileService");
        }
        this.f45038x1 = interfaceC13440c5;
        this.f45035kk = interfaceC13441ck;
    }

    /* JADX INFO: renamed from: du */
    public final long m62564du() {
        return this.f45037to;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m62565h4() {
        return this.f45036m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13441ck m62566k4() {
        return this.f45035kk;
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC13440c5 m62569kk() {
        return this.f45038x1;
    }

    /* JADX INFO: renamed from: to */
    public final long m62570to() {
        return this.f45034h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m62571x1() {
        return this.f45033du;
    }

    public C13450to(InterfaceC13441ck interfaceC13441ck) {
        if (interfaceC13441ck == null) {
            throw new ArgumentNullException("tempFileService");
        }
        this.f45038x1 = new C13448kk();
        this.f45035kk = interfaceC13441ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62567k4(long j) {
        this.f45033du = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62572x1(long j) {
        this.f45037to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62568k4(boolean z) {
        this.f45036m9 = z;
    }
}
