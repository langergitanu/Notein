package com.aspose.slides.internal.p242l0;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.l0.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5999k4 implements InterfaceC14059g8, Cloneable {

    /* JADX INFO: renamed from: du */
    private boolean f16931du;

    /* JADX INFO: renamed from: dy */
    private int f16932dy;

    /* JADX INFO: renamed from: h4 */
    private int f16933h4;

    /* JADX INFO: renamed from: k4 */
    private String f16934k4;

    /* JADX INFO: renamed from: kk */
    private int f16935kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f16936m9;

    /* JADX INFO: renamed from: to */
    private int f16937to;

    /* JADX INFO: renamed from: x1 */
    private short f16938x1;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public String m24230k4() {
        return this.f16934k4;
    }

    public String toString() {
        return C14113y2.m67407k4("Printer [PrinterSettings ", this.f16934k4, " Copies=", Short.valueOf(this.f16938x1), " Collate=", Boolean.valueOf(this.f16931du), " Duplex=", Boolean.valueOf(this.f16936m9), " FromPage=", Integer.valueOf(this.f16935kk), " LandscapeAngle=", Integer.valueOf(this.f16932dy), " MaximumCopies=", Integer.valueOf(this.f16933h4), " OutputPort=", " ToPage=", Integer.valueOf(this.f16937to), "]");
    }
}
