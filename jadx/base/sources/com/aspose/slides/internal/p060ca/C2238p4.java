package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.p4 */
/* JADX INFO: loaded from: classes3.dex */
public class C2238p4 {
    /* JADX INFO: renamed from: k4 */
    public static byte[] m11227k4(byte[] bArr) {
        if (bArr != null) {
            return new C2241p8().m11239k4(bArr);
        }
        throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }
}
