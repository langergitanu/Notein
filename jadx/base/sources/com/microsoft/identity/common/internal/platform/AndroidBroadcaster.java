package com.microsoft.identity.common.internal.platform;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.microsoft.identity.common.java.util.IBroadcaster;
import com.microsoft.identity.common.java.util.ported.PropertyBag;

/* JADX INFO: loaded from: classes9.dex */
public class AndroidBroadcaster implements IBroadcaster {
    private final Context mContext;

    public AndroidBroadcaster(Context context) {
        if (context == null) {
            throw new NullPointerException("mContext is marked non-null but is null");
        }
        this.mContext = context;
    }

    @Override // com.microsoft.identity.common.java.util.IBroadcaster
    public void sendBroadcast(String str, PropertyBag propertyBag) {
        if (str == null) {
            throw new NullPointerException("broadcastId is marked non-null but is null");
        }
        Intent intent = new Intent();
        intent.setAction(str);
        if (propertyBag != null) {
            for (String str2 : propertyBag.keySet()) {
                intent.putExtra(str2, (Parcelable[]) propertyBag.get(str2));
            }
        }
        this.mContext.sendBroadcast(intent);
    }
}
