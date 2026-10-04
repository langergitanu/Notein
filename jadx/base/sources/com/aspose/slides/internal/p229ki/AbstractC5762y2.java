package com.aspose.slides.internal.p229ki;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.y2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5762y2 extends AbstractC10929m9 {

    /* JADX INFO: renamed from: du */
    public String f15811du;

    /* JADX INFO: renamed from: dy */
    public boolean f15812dy;

    /* JADX INFO: renamed from: h4 */
    public int f15813h4;

    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du f15814k4;

    /* JADX INFO: renamed from: m9 */
    public boolean f15815m9;

    /* JADX INFO: renamed from: to */
    public String f15816to;

    /* JADX INFO: renamed from: x1 */
    public int f15817x1;

    public AbstractC5762y2(AbstractC5762y2 abstractC5762y2) {
        this.f15812dy = true;
        this.f15814k4 = abstractC5762y2.f15814k4.deepClone();
        this.f15817x1 = abstractC5762y2.f15817x1;
        this.f15816to = abstractC5762y2.f15816to;
        this.f15811du = abstractC5762y2.f15811du;
        this.f15813h4 = abstractC5762y2.f15813h4;
        this.f15815m9 = abstractC5762y2.f15815m9;
        this.f15812dy = abstractC5762y2.f15812dy;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m23361h4() {
        int i;
        return this.f15816to == null ? this.f15817x1 == this.f15814k4.mo21857kk() || (i = this.f15817x1) == 9 || (i == 4 && (this.f15814k4.mo21857kk() == 6 || this.f15814k4.mo21857kk() == 5)) : this.f15814k4.mo21857kk() == 1 && (this.f15816to.length() == 0 || C14113y2.m67363du(this.f15816to, this.f15814k4.mo21867to())) && C14113y2.m67363du(this.f15811du, this.f15814k4.mo21841du());
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        return this.f15814k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return this.f15813h4;
    }

    public AbstractC5762y2(AbstractC10925du abstractC10925du, int i, boolean z) {
        this(abstractC10925du, z);
        this.f15817x1 = i;
    }

    public AbstractC5762y2(AbstractC10925du abstractC10925du, String str, String str2, boolean z) {
        this(abstractC10925du, z);
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        if (str2 == null) {
            throw new ArgumentNullException("namespaceURI");
        }
        this.f15816to = str;
        this.f15811du = str2;
    }

    public AbstractC5762y2(AbstractC10925du abstractC10925du, boolean z) {
        this.f15812dy = true;
        this.f15814k4 = abstractC10925du;
        this.f15815m9 = z;
    }
}
