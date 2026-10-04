package com.google.firebase.inappmessaging.display.internal;

import android.graphics.drawable.Drawable;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.huawei.hms.network.embedded.C18241k5;
import o00Ooo0o.EnumC25112OooO00o;
import o00OooO.C25140OooOOo;
import o00o00oO.InterfaceC25289OooO0o;
import o00o00oo.InterfaceC25293OooO;

/* JADX INFO: loaded from: classes8.dex */
public class GlideErrorListener implements InterfaceC25289OooO0o<Drawable> {
    private final FirebaseInAppMessagingDisplayCallbacks displayCallbacks;
    private final InAppMessage inAppMessage;

    public GlideErrorListener(InAppMessage inAppMessage, FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks) {
        this.inAppMessage = inAppMessage;
        this.displayCallbacks = firebaseInAppMessagingDisplayCallbacks;
    }

    @Override // o00o00oO.InterfaceC25289OooO0o
    public boolean onLoadFailed(C25140OooOOo c25140OooOOo, Object obj, InterfaceC25293OooO<Drawable> interfaceC25293OooO, boolean z) {
        Logging.logd("Image Downloading  Error : " + c25140OooOOo.getMessage() + C18241k5.f55433h + c25140OooOOo.getCause());
        if (this.inAppMessage == null || this.displayCallbacks == null) {
            return false;
        }
        if (c25140OooOOo.getLocalizedMessage().contains("Failed to decode")) {
            this.displayCallbacks.displayErrorEncountered(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.IMAGE_UNSUPPORTED_FORMAT);
            return false;
        }
        this.displayCallbacks.displayErrorEncountered(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.UNSPECIFIED_RENDER_ERROR);
        return false;
    }

    @Override // o00o00oO.InterfaceC25289OooO0o
    public boolean onResourceReady(Drawable drawable, Object obj, InterfaceC25293OooO<Drawable> interfaceC25293OooO, EnumC25112OooO00o enumC25112OooO00o, boolean z) {
        Logging.logd("Image Downloading  Success : " + drawable);
        return false;
    }
}
