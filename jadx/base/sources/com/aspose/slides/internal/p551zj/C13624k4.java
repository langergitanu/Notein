package com.aspose.slides.internal.p551zj;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.zj.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13624k4 {

    /* JADX INFO: renamed from: k4 */
    private byte f45239k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f45240x1;

    public C13624k4() {
        m62878k4();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte m62877k4(char c) {
        byte bM62879k4 = C13625x1.m62879k4(c);
        if (bM62879k4 == 0 || bM62879k4 == 1) {
            bM62879k4 = 2;
        } else if (bM62879k4 == 31) {
            int iM67545x1 = C14117yj.m67545x1(c);
            if (iM67545x1 == 5 || iM67545x1 == 6) {
                bM62879k4 = 9;
            }
        } else if (bM62879k4 == 32 || bM62879k4 == 36) {
        }
        byte b = this.f45239k4;
        if (b == -1) {
            this.f45239k4 = bM62879k4;
            if (C7019kk.m27462to(Byte.valueOf(bM62879k4), 6) == C7019kk.m27462to((Object) (byte) 9, 6)) {
                this.f45239k4 = (byte) 2;
            }
            return (byte) 4;
        }
        if (b == 6 || (b == 11 ? C7019kk.m27462to(Byte.valueOf(bM62879k4), 6) != C7019kk.m27462to((Object) (byte) 23, 6) : b == 23 || b == 24)) {
            m62878k4();
            this.f45239k4 = bM62879k4;
            return (byte) 5;
        }
        if (bM62879k4 != 6 && bM62879k4 != 11) {
            if (bM62879k4 == 33) {
                this.f45240x1 = true;
                return (byte) 4;
            }
            if (bM62879k4 != 23 && bM62879k4 != 24) {
                boolean z = this.f45240x1;
                this.f45240x1 = false;
                byte bM62880k4 = C13625x1.m62880k4(C7019kk.m27462to(Byte.valueOf(this.f45239k4), 6), C7019kk.m27462to(Byte.valueOf(bM62879k4), 6));
                if (bM62880k4 != 0) {
                    if (bM62880k4 == 1) {
                        this.f45239k4 = bM62879k4;
                        return z ? (byte) 1 : (byte) 4;
                    }
                    if (bM62880k4 == 2) {
                        if (!z) {
                            return (byte) 4;
                        }
                        this.f45239k4 = bM62879k4;
                        return (byte) 2;
                    }
                    if (bM62880k4 == 3) {
                        if (z) {
                            this.f45239k4 = bM62879k4;
                        }
                        return (byte) 3;
                    }
                    if (bM62880k4 != 4) {
                        return bM62880k4;
                    }
                }
                this.f45239k4 = bM62879k4;
                return bM62880k4;
            }
        }
        this.f45239k4 = bM62879k4;
        return (byte) 4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62878k4() {
        this.f45239k4 = (byte) -1;
        this.f45240x1 = false;
    }
}
