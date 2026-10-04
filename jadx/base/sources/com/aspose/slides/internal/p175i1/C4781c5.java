package com.aspose.slides.internal.p175i1;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.i1.c5 */
/* JADX INFO: loaded from: classes.dex */
class C4781c5<T> extends AbstractC4786k4 {
    public C4781c5(T t, int i, int i2) {
        super(t, i, i2);
        if (t == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        if (i < 0) {
            throw new ArgumentException("key should be positive");
        }
        if (i2 < 0) {
            throw new ArgumentException("offset should be positive");
        }
    }
}
