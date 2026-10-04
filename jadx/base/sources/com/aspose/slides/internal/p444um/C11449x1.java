package com.aspose.slides.internal.p444um;

import com.aspose.slides.internal.p368qq.AbstractC9911ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.um.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11449x1 extends AbstractC9911ar {
    public C11449x1(String str) {
        super(str, true);
    }

    /* JADX INFO: renamed from: dy */
    private void m54514dy() {
        while (true) {
            switch (m48783x1()) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    break;
                default:
                    this.f35784x1 = 3;
                    return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    @Override // com.aspose.slides.internal.p368qq.AbstractC9911ar
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo48777du() {
        int iM48783x1;
        int iM48783x12;
        int iM48783x13;
        int i = this.f35780k4;
        if (i == -1) {
            this.f35784x1 = -1;
            return;
        }
        if (i == 32) {
            mo48777du();
            return;
        }
        if (i == 43) {
            this.f35784x1 = 1;
            m48783x1();
            return;
        }
        if (i == 45) {
            this.f35784x1 = 2;
            m48783x1();
            return;
        }
        if (i != 69 && i != 101) {
            if (i != 78) {
                if (i == 79) {
                    int iM48783x14 = m48783x1();
                    if ((iM48783x14 == 68 || iM48783x14 == 100) && ((iM48783x13 = m48783x1()) == 68 || iM48783x13 == 100)) {
                        m48783x1();
                        if (this.f35780k4 == -1) {
                            this.f35784x1 = 5;
                            return;
                        }
                        return;
                    }
                } else if (i != 110) {
                    if (i != 111) {
                        switch (i) {
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                                m54514dy();
                                break;
                        }
                        return;
                    }
                }
            }
            this.f35784x1 = 4;
            m48783x1();
            return;
        }
        int iM48783x15 = m48783x1();
        if ((iM48783x15 == 86 || iM48783x15 == 118) && (((iM48783x1 = m48783x1()) == 69 || iM48783x1 == 101) && ((iM48783x12 = m48783x1()) == 78 || iM48783x12 == 110))) {
            m48783x1();
            if (this.f35780k4 == -1) {
                this.f35784x1 = 6;
                return;
            }
            return;
        }
        this.f35784x1 = 0;
    }

    @Override // com.aspose.slides.internal.p368qq.AbstractC9911ar
    /* JADX INFO: renamed from: h4 */
    public int mo48778h4() {
        if (this.f35780k4 == -1) {
            return 0;
        }
        switch (this.f35784x1) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 1;
            case 5:
                return 3;
            case 6:
                return 4;
            default:
                return super.mo48778h4();
        }
    }
}
