package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.b3 */
/* JADX INFO: loaded from: classes5.dex */
public class C13858b3 implements InterfaceC14059g8 {

    /* JADX INFO: renamed from: du */
    private int f46348du;

    /* JADX INFO: renamed from: k4 */
    private Object[] f46349k4;

    /* JADX INFO: renamed from: kk */
    private int f46350kk;

    /* JADX INFO: renamed from: to */
    private int f46351to;

    /* JADX INFO: renamed from: x1 */
    private int f46352x1;

    public C13858b3(int i) {
        this(i, Integer.MAX_VALUE);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        return new C13858b3((Object[]) C7019kk.m27458kk(AbstractC14092to.m67208k4((Object) this.f46349k4).deepClone(), Object[].class), this.f46352x1, this.f46350kk, this.f46351to);
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m65177k4() {
        int i = this.f46350kk;
        int i2 = this.f46351to;
        if (i == i2) {
            if (this.f46348du <= i) {
                throw new XmlException("Stack overflow.", C14113y2.f47374k4);
            }
            Object[] objArr = new Object[i2 + this.f46352x1];
            if (i > 0) {
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f46349k4), 0, AbstractC14092to.m67208k4((Object) objArr), 0, this.f46350kk);
            }
            this.f46349k4 = objArr;
            this.f46351to += this.f46352x1;
        }
        Object[] objArr2 = this.f46349k4;
        int i3 = this.f46350kk;
        this.f46350kk = i3 + 1;
        return objArr2[i3];
    }

    /* JADX INFO: renamed from: kk */
    public final Object m65181kk() {
        int i = this.f46350kk;
        if (i > 0) {
            return this.f46349k4[i - 1];
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public final int m65182to() {
        return this.f46350kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final Object m65183x1() {
        int i = this.f46350kk;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        this.f46350kk = i2;
        return this.f46349k4[i2];
    }

    public C13858b3(int i, int i2) {
        this.f46352x1 = i;
        this.f46350kk = 0;
        this.f46349k4 = new Object[i];
        this.f46351to = i;
        this.f46348du = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m65178k4(int i) {
        if (i < 0 || i >= this.f46350kk) {
            throw new IndexOutOfRangeException();
        }
        return this.f46349k4[i];
    }

    private C13858b3(Object[] objArr, int i, int i2, int i3) {
        this.f46349k4 = objArr;
        this.f46352x1 = i;
        this.f46350kk = i2;
        this.f46351to = i3;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65179k4(int i, Object obj) {
        if (i < 0 || i >= this.f46350kk) {
            throw new IndexOutOfRangeException();
        }
        this.f46349k4[i] = obj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65180k4(Object obj) {
        int i = this.f46350kk;
        if (i > 0) {
            this.f46349k4[i - 1] = obj;
        }
    }
}
