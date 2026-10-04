package com.xiaomi.account;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.account.OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public class XiaomiOAuthResponse implements Parcelable {
    public static final Parcelable.Creator<XiaomiOAuthResponse> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.xiaomi.account.OooO00o f80221OooOo0o;

    public static class OooO00o implements Parcelable.Creator<XiaomiOAuthResponse> {
        @Override // android.os.Parcelable.Creator
        public final XiaomiOAuthResponse createFromParcel(Parcel parcel) {
            com.xiaomi.account.OooO00o oooO00o;
            XiaomiOAuthResponse xiaomiOAuthResponse = new XiaomiOAuthResponse();
            IBinder strongBinder = parcel.readStrongBinder();
            int i = OooO00o.AbstractBinderC19585OooO00o.f80217OooO0o0;
            if (strongBinder == null) {
                oooO00o = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.xiaomi.account.IXiaomiAuthResponse");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof com.xiaomi.account.OooO00o)) {
                    OooO00o.AbstractBinderC19585OooO00o.C19586OooO00o c19586OooO00o = new OooO00o.AbstractBinderC19585OooO00o.C19586OooO00o();
                    c19586OooO00o.f80218OooO0o0 = strongBinder;
                    oooO00o = c19586OooO00o;
                } else {
                    oooO00o = (com.xiaomi.account.OooO00o) iInterfaceQueryLocalInterface;
                }
            }
            xiaomiOAuthResponse.f80221OooOo0o = oooO00o;
            return xiaomiOAuthResponse;
        }

        @Override // android.os.Parcelable.Creator
        public final XiaomiOAuthResponse[] newArray(int i) {
            return new XiaomiOAuthResponse[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f80221OooOo0o.asBinder());
    }
}
