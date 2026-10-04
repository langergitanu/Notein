package com.android.billingclient.api;

import android.text.TextUtils;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class SkuDetails {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        ((SkuDetails) obj).getClass();
        return TextUtils.equals(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SkuDetails: ".concat(CloudMetaExtra.DEFINE_NON_PARENT_ID);
    }
}
