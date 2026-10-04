package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p342pq.C9478du;
import com.aspose.slides.internal.p342pq.C9480kk;
import com.aspose.slides.internal.p398sf.C10227x1;

/* JADX INFO: loaded from: classes3.dex */
public final class IdentityNotMappedException extends SystemException {

    /* JADX INFO: renamed from: k4 */
    private C10227x1 f4896k4;

    public IdentityNotMappedException() {
        super("Couldn't translate some identities.");
    }

    public void getObjectData(C9480kk c9480kk, C9478du c9478du) {
        throw new NotImplementedException();
    }

    public C10227x1 getUnmappedIdentities() {
        if (this.f4896k4 == null) {
            this.f4896k4 = new C10227x1();
        }
        return this.f4896k4;
    }

    public IdentityNotMappedException(String str) {
        super(str);
    }

    public IdentityNotMappedException(String str, java.lang.Exception exc) {
        super(str, exc);
    }
}
