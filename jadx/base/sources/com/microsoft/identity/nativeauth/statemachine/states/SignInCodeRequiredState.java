package com.microsoft.identity.nativeauth.statemachine.states;

import OooOOO0.AbstractC20449OooO0Oo;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OooO0.C29573OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/microsoft/identity/nativeauth/statemachine/states/SignInCodeRequiredState;", "LOooOOO0/OooO0Oo;", "", "Landroid/os/Parcelable;", "CREATOR", "OooO00o", "msal_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class SignInCodeRequiredState extends AbstractC20449OooO0Oo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f69023OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f69024OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C29573OooO0OO f69025OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ArrayList f69026OooOoO0;

    /* JADX INFO: renamed from: com.microsoft.identity.nativeauth.statemachine.states.SignInCodeRequiredState$OooO00o, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SignInCodeRequiredState> {
        @Override // android.os.Parcelable.Creator
        public final SignInCodeRequiredState createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return new SignInCodeRequiredState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SignInCodeRequiredState[] newArray(int i) {
            return new SignInCodeRequiredState[i];
        }
    }

    public SignInCodeRequiredState() {
        throw null;
    }

    public SignInCodeRequiredState(Parcel parcel) {
        Object obj;
        String string = parcel.readString();
        string = string == null ? "" : string;
        String string2 = parcel.readString();
        string2 = string2 == null ? TelemetryEventStrings.Value.UNSET : string2;
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Serializable) parcel.readSerializable(C29573OooO0OO.class.getClassLoader(), C29573OooO0OO.class);
        } else {
            Serializable serializable = parcel.readSerializable();
            obj = (C29573OooO0OO) (serializable instanceof C29573OooO0OO ? serializable : null);
        }
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type com.microsoft.identity.nativeauth.NativeAuthPublicClientApplicationConfiguration");
        this.f69024OooOo0o = string;
        this.f69023OooOo = string2;
        this.f69026OooOoO0 = arrayListCreateStringArrayList;
        this.f69025OooOoO = (C29573OooO0OO) obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OooOOO0.OooO0oO(parcel, "parcel");
        parcel.writeString(this.f69024OooOo0o);
        parcel.writeString(this.f69023OooOo);
        parcel.writeStringList(this.f69026OooOoO0);
        parcel.writeSerializable(this.f69025OooOoO);
    }
}
