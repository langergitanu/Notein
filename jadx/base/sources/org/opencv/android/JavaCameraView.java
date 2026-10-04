package org.opencv.android;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes10.dex */
public class JavaCameraView extends CameraBridgeViewBase implements Camera.PreviewCallback {
    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        synchronized (this) {
            throw null;
        }
    }
}
