package com.microsoft.identity.nativeauth.statemachine.states;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.microsoft.identity.client.IAccount;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OooO0.C29573OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/microsoft/identity/nativeauth/statemachine/states/AccountState;", "Landroid/os/Parcelable;", "CREATOR", "OooO00o", "msal_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class AccountState implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C29573OooO0OO f69012OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final IAccount f69013OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f69014OooOoO0;

    /* JADX INFO: renamed from: com.microsoft.identity.nativeauth.statemachine.states.AccountState$OooO00o, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AccountState> {
        @Override // android.os.Parcelable.Creator
        public final AccountState createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return new AccountState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountState[] newArray(int i) {
            return new AccountState[i];
        }
    }

    public AccountState(Parcel parcel) {
        Object obj;
        Object obj2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            obj = (Serializable) parcel.readSerializable(IAccount.class.getClassLoader(), IAccount.class);
        } else {
            Serializable serializable = parcel.readSerializable();
            obj = (IAccount) (serializable instanceof IAccount ? serializable : null);
        }
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type com.microsoft.identity.client.IAccount");
        IAccount iAccount = (IAccount) obj;
        String string = parcel.readString();
        string = string == null ? TelemetryEventStrings.Value.UNSET : string;
        if (i >= 33) {
            obj2 = (Serializable) parcel.readSerializable(C29573OooO0OO.class.getClassLoader(), C29573OooO0OO.class);
        } else {
            Serializable serializable2 = parcel.readSerializable();
            obj2 = (C29573OooO0OO) (serializable2 instanceof C29573OooO0OO ? serializable2 : null);
        }
        OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type com.microsoft.identity.nativeauth.NativeAuthPublicClientApplicationConfiguration");
        this.f69013OooOo0o = iAccount;
        this.f69012OooOo = (C29573OooO0OO) obj2;
        this.f69014OooOoO0 = string;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OooOOO0.OooO0oO(parcel, "parcel");
        parcel.writeSerializable(this.f69013OooOo0o);
        parcel.writeSerializable(this.f69014OooOoO0);
        parcel.writeSerializable(this.f69012OooOo);
    }
}
