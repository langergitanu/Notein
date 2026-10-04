package com.aspose.slides.internal.p295na;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p199j5.InterfaceC5195kk;
import com.aspose.slides.internal.p199j5.InterfaceC5196to;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.na.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6791h4 implements InterfaceC5196to, IDisposable {

    /* JADX INFO: renamed from: du */
    private InterfaceC12777qq f18801du;

    /* JADX INFO: renamed from: h4 */
    private boolean f18802h4;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12777qq f18803k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC5195kk f18804kk;

    /* JADX INFO: renamed from: to */
    private boolean f18805to;

    /* JADX INFO: renamed from: x1 */
    private int f18806x1;

    public C6791h4(InterfaceC12777qq interfaceC12777qq, int i, InterfaceC5195kk interfaceC5195kk, boolean z) {
        if (interfaceC12777qq == null) {
            throw new ArgumentNullException("root");
        }
        this.f18803k4 = interfaceC12777qq;
        this.f18806x1 = i;
        this.f18804kk = interfaceC5195kk;
        this.f18805to = z;
    }

    /* JADX INFO: renamed from: to */
    private void m26862to() {
        if (this.f18802h4) {
            throw new C12786x1((byte) 11);
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m26863kk();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x000a -> B:6:0x000e). Please report as a decompilation issue!!! */
    @Override // com.aspose.slides.internal.p199j5.InterfaceC5196to
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC12777qq mo22192k4() {
        m26862to();
        InterfaceC12777qq interfaceC12777qqMo22631g8 = this.f18801du;
        interfaceC12777qqMo22631g8 = interfaceC12777qqMo22631g8 == null ? this.f18803k4 : interfaceC12777qqMo22631g8.mo22631g8();
        if (interfaceC12777qqMo22631g8 != null) {
            if (C6790du.m26861k4(interfaceC12777qqMo22631g8, this.f18806x1)) {
                InterfaceC5195kk interfaceC5195kk = this.f18804kk;
                if (interfaceC5195kk == null) {
                    this.f18801du = interfaceC12777qqMo22631g8;
                } else if (interfaceC5195kk.mo22191k4(interfaceC12777qqMo22631g8) == 1) {
                    this.f18801du = interfaceC12777qqMo22631g8;
                    return interfaceC12777qqMo22631g8;
                }
            }
            if (interfaceC12777qqMo22631g8 != null) {
            }
        }
        return interfaceC12777qqMo22631g8;
    }

    /* JADX INFO: renamed from: kk */
    public final void m26863kk() {
        this.f18802h4 = true;
        this.f18801du = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x000a -> B:6:0x000e). Please report as a decompilation issue!!! */
    @Override // com.aspose.slides.internal.p199j5.InterfaceC5196to
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC12777qq mo22193x1() {
        m26862to();
        InterfaceC12777qq interfaceC12777qqMo22654sv = this.f18801du;
        interfaceC12777qqMo22654sv = interfaceC12777qqMo22654sv == null ? this.f18803k4 : interfaceC12777qqMo22654sv.mo22654sv();
        if (interfaceC12777qqMo22654sv != null) {
            if (C6790du.m26861k4(interfaceC12777qqMo22654sv, this.f18806x1)) {
                InterfaceC5195kk interfaceC5195kk = this.f18804kk;
                if (interfaceC5195kk == null) {
                    this.f18801du = interfaceC12777qqMo22654sv;
                } else if (interfaceC5195kk.mo22191k4(interfaceC12777qqMo22654sv) == 1) {
                    this.f18801du = interfaceC12777qqMo22654sv;
                    return interfaceC12777qqMo22654sv;
                }
            }
            if (interfaceC12777qqMo22654sv != null) {
            }
        }
        return interfaceC12777qqMo22654sv;
    }
}
