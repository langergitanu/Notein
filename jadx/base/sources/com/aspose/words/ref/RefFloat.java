package com.aspose.words.ref;

/* JADX INFO: loaded from: classes5.dex */
public class RefFloat {
    private float value;

    public RefFloat(float f) {
        this.value = f;
    }

    public float get() {
        return this.value;
    }

    public float set(float f) {
        this.value = f;
        return f;
    }

    public String toString() {
        return Float.toString(this.value);
    }
}
