package o00Oo00;

import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Handler {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        Object obj;
        if (message.what != 11) {
            Log.e("VMS_IDLG_SDK_Client", "message type valid");
            return;
        }
        int i = message.getData().getInt(C18437z2.f56754h);
        String string = message.getData().getString(HiAnalyticsConstant.HaKey.BI_KEY_APPID);
        OooO00o oooO00o = OooO0OO.f85009OooOO0;
        oooO00o.getClass();
        if (i == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else if (i == 1) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + string);
        } else if (i == 2) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + string);
        } else {
            if (i != 4) {
                uri2 = null;
                cursorQuery = oooO00o.f84999OooO00o.getContentResolver().query(uri2, null, null, null, null);
                if (cursorQuery == null) {
                    string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                    cursorQuery.close();
                } else {
                    Log.d("VMS_IDLG_SDK_DB", "return cursor is null,return");
                }
                OooO0OO.f85007OooO0oO = string;
                obj = OooO0OO.f85004OooO0Oo;
                synchronized (obj) {
                    obj.notify();
                }
                return;
            }
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
        }
        uri2 = uri;
        cursorQuery = oooO00o.f84999OooO00o.getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery == null) {
        }
        OooO0OO.f85007OooO0oO = string;
        obj = OooO0OO.f85004OooO0Oo;
        synchronized (obj) {
        }
    }
}
