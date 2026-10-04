package com.google.mlkit.vision.text.pipeline;

/* JADX INFO: loaded from: classes8.dex */
public abstract class VkpTextRecognizerOptions {

    public static abstract class Builder {
        public abstract VkpTextRecognizerOptions build();

        public abstract Builder setConfigLabel(String str);

        public abstract Builder setEnableLowLatencyInBackground(boolean z);

        public abstract Builder setLanguageHint(String str);

        public abstract Builder setModelDir(String str);
    }

    public static Builder builder(String str, String str2, String str3) {
        zbc zbcVar = new zbc();
        zbcVar.setConfigLabel(str);
        if (str2 == null) {
            str2 = "mlkit-google-ocr-models";
        }
        zbcVar.setModelDir(str2);
        zbcVar.setLanguageHint(str3);
        zbcVar.setEnableLowLatencyInBackground(false);
        return zbcVar;
    }

    public abstract String zba();

    public abstract String zbb();

    public abstract String zbc();

    public abstract boolean zbd();
}
