package o00Oo00;

import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: renamed from: o00Oo00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25033OooO0Oo extends ContentObserver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f85010OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0OO f85011OooO0O0;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.f85011OooO0O0 != null) {
            OooO0OO.OooO0O0(this.f85010OooO00o);
        } else {
            Log.e("VMS_IDLG_SDK_Observer", "mIdentifierIdClient is null");
        }
    }
}
