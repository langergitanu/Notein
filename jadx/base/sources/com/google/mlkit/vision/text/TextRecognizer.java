package com.google.mlkit.vision.text;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21997Oooo0o;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.odml.image.MlImage;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.interfaces.Detector;

/* JADX INFO: loaded from: classes8.dex */
public interface TextRecognizer extends Detector<Text>, OptionalModuleApi {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC21997Oooo0o(AbstractC21979OooOOo0.OooO00o.ON_DESTROY)
    void close();

    Task<Text> process(MlImage mlImage);

    Task<Text> process(InputImage inputImage);
}
