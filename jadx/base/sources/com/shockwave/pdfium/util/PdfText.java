package com.shockwave.pdfium.util;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes10.dex */
public class PdfText {
    private RectF bounds;
    private String text;

    public PdfText() {
    }

    public RectF getBounds() {
        return this.bounds;
    }

    public String getText() {
        return this.text;
    }

    public void setBounds(RectF rectF) {
        this.bounds = rectF;
    }

    public void setText(String str) {
        this.text = str;
    }

    public PdfText(String str, float f, float f2, float f3, float f4) {
        this.text = str;
        this.bounds = new RectF(f, f2, f3, f4);
    }

    public PdfText(String str, RectF rectF) {
        this.text = str;
        this.bounds = rectF;
    }
}
