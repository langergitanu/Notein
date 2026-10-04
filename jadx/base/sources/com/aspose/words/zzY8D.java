package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8D extends ArrayList<zzY8E> {
    private com.aspose.words.internal.zzZQC<zzY8E> zzYOC = new com.aspose.words.internal.zzZQC<>();
    private zzZOI zzX8W = new zzZOI();
    private zzZOG zzX8V = new zzZOG();
    private zzZO3 zzX8U = new zzZO3();
    private zzZO2 zzX8S = new zzZO2();

    public zzY8D() {
        for (int i = 0; i <= 6; i++) {
            com.aspose.words.internal.zzZQG.zzZ(this, new zzY8E(i));
        }
    }

    private zzY8E zzY1P() {
        return this.zzYOC.peek();
    }

    private void zzY1S() {
        int length = 0;
        for (zzY8E zzy8e : this) {
            this.zzX8S.zzZ(zzy8e.zzY20(), length);
            length += zzy8e.zzY1Z().length();
        }
        this.zzX8S.zzBV(zzY1Q());
    }

    private void zzY1T() {
        int length = 0;
        for (zzY8E zzy8e : this) {
            this.zzX8U.zzZ(zzy8e.zzY21(), length);
            length += zzy8e.zzY1Z().length();
        }
        this.zzX8U.zzBV(zzY1Q());
    }

    private void zzY1U() {
        int length = 0;
        int iZzZ = 0;
        for (zzY8E zzy8e : this) {
            iZzZ = this.zzX8V.zzZ(zzy8e.zzY22(), length, iZzZ);
            length += zzy8e.zzY1Z().length();
        }
    }

    private void zzY1V() {
        int length = 0;
        for (zzY8E zzy8e : this) {
            this.zzX8W.zzZ(zzy8e.zzY23(), length);
            length += zzy8e.zzY1Z().length();
        }
    }

    private void zzY1W() {
        int iZzY1Q = zzY1Q();
        Iterator<zzY8E> it = iterator();
        while (it.hasNext()) {
            it.next().zzky(iZzY1Q);
        }
    }

    private void zzkx(int i) {
        int length = 2048;
        for (zzY8E zzy8e : this) {
            zzy8e.zzZrm().zzGl(length);
            zzy8e.zzZrl().zzGl(length);
            length += zzy8e.zzY1Z().length() * 2;
        }
    }

    public final void append(String str) {
        com.aspose.words.internal.zzZNH.zzU(zzY1P().zzY1Z(), str);
    }

    public final void zzAC(String str) {
        zzY1P().zzY23().zzy(zzY1P().getLength(), str);
    }

    public final void zzG4(int i) {
        this.zzYOC.push(zzkw(i));
    }

    public final void zzV(SmartTag smartTag) {
        zzY1P().zzY21().zzY(zzY1P().getLength(), smartTag);
    }

    public final void zzW(SmartTag smartTag) {
        zzY1P().zzY21().zzZ(zzY1P().getLength(), smartTag);
    }

    public final void zzX(zzYNJ zzynj) {
        zzY1P().zzZrm().zzX(zzY1P().getLength(), zzynj);
    }

    public final void zzY(EditableRangeStart editableRangeStart) {
        zzY1P().zzY22().zzZ(zzY1P().getLength(), editableRangeStart);
    }

    public final int zzY1Q() {
        Iterator<zzY8E> it = iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().zzY1Z().length();
        }
        return length;
    }

    public final int zzY1R() {
        return zzY1P().getLength();
    }

    public final void zzY1X() {
        zzY1W();
        zzkx(2048);
        zzY1V();
        zzY1U();
        zzY1T();
        zzY1S();
    }

    public final int zzY1Y() {
        return zzY1P().zzY1Y();
    }

    public final zzZO2 zzY20() {
        return this.zzX8S;
    }

    public final zzZO3 zzY21() {
        return this.zzX8U;
    }

    public final zzZOG zzY22() {
        return this.zzX8V;
    }

    public final zzZOI zzY23() {
        return this.zzX8W;
    }

    public final void zzY25() {
        zzY1P().zzY25();
    }

    public final void zzYNh() {
        zzY1P().zzYNh();
    }

    public final void zzYY(String str, int i) {
        zzY1P().zzY23().zzW(zzY1P().getLength(), str, i);
    }

    public final void zzZ(int i, int i2, zzXF zzxf) {
        zzY1P().zzZrl().zzZ(i, i2, zzxf);
    }

    public final int zzZqT() {
        return zzY1P().zzZqT();
    }

    public final void zzZqV() {
        this.zzYOC.pop();
    }

    public final zzY8E zzkw(int i) {
        return get(i);
    }

    public final void zzZ(zzZNP zzznp) {
        zzY1P().zzY24().zzX(zzY1P().getLength(), zzznp);
    }

    public final void zzY(EditableRangeEnd editableRangeEnd) {
        zzY1P().zzY22().zzZ(zzY1P().getLength(), editableRangeEnd);
    }

    public final void zzY(SubDocument subDocument) {
        zzY1P().zzY20().zzZ(zzY1P().getLength(), subDocument);
    }
}
