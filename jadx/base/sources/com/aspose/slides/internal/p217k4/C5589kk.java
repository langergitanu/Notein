package com.aspose.slides.internal.p217k4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5589kk implements InterfaceC5585h4 {

    /* JADX INFO: renamed from: du */
    protected int f15401du;

    /* JADX INFO: renamed from: dy */
    protected int f15402dy;

    /* JADX INFO: renamed from: h4 */
    protected int f15403h4;

    /* JADX INFO: renamed from: k4 */
    protected char[] f15404k4;

    /* JADX INFO: renamed from: kk */
    protected int f15405kk;

    /* JADX INFO: renamed from: m9 */
    protected List f15406m9;

    /* JADX INFO: renamed from: to */
    protected int f15407to;

    /* JADX INFO: renamed from: x1 */
    protected int f15408x1;

    public C5589kk() {
        this.f15405kk = 0;
        this.f15407to = 1;
        this.f15401du = 0;
        this.f15403h4 = 0;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: du */
    public void mo22949du() {
        mo22959x1(this.f15402dy);
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5585h4
    /* JADX INFO: renamed from: h4 */
    public int mo22945h4() {
        return this.f15407to;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: k4 */
    public int mo22951k4(int i) {
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            i++;
            if ((this.f15405kk + i) - 1 < 0) {
                return -1;
            }
        }
        int i2 = this.f15405kk;
        if ((i2 + i) - 1 >= this.f15408x1) {
            return -1;
        }
        return this.f15404k4[(i2 + i) - 1];
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: kk */
    public int mo22953kk() {
        return this.f15408x1;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5585h4
    /* JADX INFO: renamed from: m9 */
    public int mo22947m9() {
        return this.f15401du;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: to */
    public int mo22956to() {
        C5592m9 c5592m9;
        if (this.f15406m9 == null) {
            ArrayList arrayList = new ArrayList();
            this.f15406m9 = arrayList;
            arrayList.add(null);
        }
        int i = this.f15403h4 + 1;
        this.f15403h4 = i;
        if (i >= this.f15406m9.size()) {
            c5592m9 = new C5592m9();
            this.f15406m9.add(c5592m9);
        } else {
            c5592m9 = (C5592m9) this.f15406m9.get(this.f15403h4);
        }
        c5592m9.f15413k4 = this.f15405kk;
        c5592m9.f15415x1 = this.f15407to;
        c5592m9.f15414kk = this.f15401du;
        int i2 = this.f15403h4;
        this.f15402dy = i2;
        return i2;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: x1 */
    public int mo22958x1() {
        return this.f15405kk;
    }

    public C5589kk(String str) {
        this();
        this.f15404k4 = str.toCharArray();
        this.f15408x1 = str.length();
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5585h4
    /* JADX INFO: renamed from: k4 */
    public String mo22946k4(int i, int i2) {
        return new String(this.f15404k4, i, (i2 - i) + 1);
    }

    /* JADX INFO: renamed from: kk */
    public void m22960kk(int i) {
        this.f15403h4 = i - 1;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: to */
    public void mo22957to(int i) {
        if (i <= this.f15405kk) {
            this.f15405kk = i;
        } else {
            while (this.f15405kk < i) {
                mo22952k4();
            }
        }
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: x1 */
    public void mo22959x1(int i) {
        C5592m9 c5592m9 = (C5592m9) this.f15406m9.get(i);
        mo22957to(c5592m9.f15413k4);
        this.f15407to = c5592m9.f15415x1;
        this.f15401du = c5592m9.f15414kk;
        m22960kk(i);
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5607yj
    /* JADX INFO: renamed from: k4 */
    public void mo22952k4() {
        int i = this.f15405kk;
        if (i < this.f15408x1) {
            this.f15401du++;
            if (this.f15404k4[i] == '\n') {
                this.f15407to++;
                this.f15401du = 0;
            }
            this.f15405kk = i + 1;
        }
    }
}
