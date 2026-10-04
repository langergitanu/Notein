package com.aspose.slides;

import com.oplus.ocs.base.common.ConnectionResult;
import com.oplus.ocs.base.common.api.OnConnectionFailedListener;
import com.orion.notein.MainActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000oOoO implements OnConnectionFailedListener {
    public static double OooO00o(double d, double d2, double d3, double d4) {
        return (d * d2) + d3 + d4;
    }

    public static void OooO0O0(IParagraphFormat iParagraphFormat, byte b, float f, float f2, float f3) {
        iParagraphFormat.getBullet().setType(b);
        iParagraphFormat.getDefaultPortionFormat().setFontHeight(f);
        iParagraphFormat.setMarginLeft(f2);
        iParagraphFormat.setIndent(f3);
    }

    @Override // com.oplus.ocs.base.common.api.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        MainActivity.initOppoOCS$lambda$1(connectionResult);
    }
}
