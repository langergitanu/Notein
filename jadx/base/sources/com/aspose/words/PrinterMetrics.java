package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class PrinterMetrics {

    public class PrinterFontMetrics implements com.aspose.words.internal.zzH4 {
        private float zz9P;
        private float zz9Q;
        private float zz9R;
        private float zz9S;
        private float zz9T;

        @Override // com.aspose.words.internal.zzH4
        public float getAscentPoints() {
            return this.zz9T;
        }

        @Override // com.aspose.words.internal.zzH4
        public float getAscentRawPoints() {
            return this.zz9Q;
        }

        @Override // com.aspose.words.internal.zzH4
        public float getCharWidthPoints(int i, float f) {
            return 0.0f;
        }

        @Override // com.aspose.words.internal.zzH4
        public float getDescentPoints() {
            return this.zz9S;
        }

        @Override // com.aspose.words.internal.zzH4
        public float getDescentRawPoints() {
            return this.zz9P;
        }

        @Override // com.aspose.words.internal.zzH4
        public float getLineSpacingPoints() {
            return this.zz9R;
        }

        @Override // com.aspose.words.internal.zzH4
        public float getRawCharWidthPoints(int i, float f) {
            return 0.0f;
        }

        @Override // com.aspose.words.internal.zzH4
        public float getTextWidthPoints(String str, float f) {
            return 0.0f;
        }

        @Override // com.aspose.words.internal.zzH4
        public void setAscentPoints(float f) {
            this.zz9T = f;
        }

        @Override // com.aspose.words.internal.zzH4
        public void setAscentRawPoints(float f) {
            this.zz9Q = f;
        }

        @Override // com.aspose.words.internal.zzH4
        public void setDescentPoints(float f) {
            this.zz9S = f;
        }

        @Override // com.aspose.words.internal.zzH4
        public void setDescentRawPoints(float f) {
            this.zz9P = f;
        }

        @Override // com.aspose.words.internal.zzH4
        public void setLineSpacingPoints(float f) {
            this.zz9R = f;
        }
    }

    public static boolean hasPrinterGraphics() {
        return false;
    }

    public float getDpi() {
        return 96.0f;
    }

    public PrinterFontMetrics getPrinterFontMetrics(String str, float f, int i) {
        return null;
    }

    public boolean hasMetricsForFont(String str) {
        return false;
    }

    public boolean isPrinterAvailable() {
        return false;
    }

    public boolean isPrinterGraphicsAvailable() {
        return false;
    }

    public com.aspose.words.internal.zzH4 getPrinterFontMetrics(String str, float f, int i, boolean z) {
        return null;
    }
}
