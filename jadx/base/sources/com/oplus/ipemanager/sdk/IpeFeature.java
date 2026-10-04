package com.oplus.ipemanager.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m80612d2 = {"Lcom/oplus/ipemanager/sdk/IpeFeature;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "parcel", "(Ljava/lang/String;ILandroid/os/Parcel;)V", "", "flags", "LoO00ooO/OooOooO;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "CREATOR", "DEMO_MODE", "FUNCTION_VIBRATION", "FEEDBACK_VIBRATION", "com.oplus.ocs.ipe_sdk_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public enum IpeFeature implements Parcelable {
    DEMO_MODE,
    FUNCTION_VIBRATION,
    FEEDBACK_VIBRATION;


    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* JADX INFO: renamed from: com.oplus.ipemanager.sdk.IpeFeature$a, reason: from kotlin metadata */
    @Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m80612d2 = {"Lcom/oplus/ipemanager/sdk/IpeFeature$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ipemanager/sdk/IpeFeature;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/oplus/ipemanager/sdk/IpeFeature;", "com.oplus.ocs.ipe_sdk_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion implements Parcelable.Creator<IpeFeature> {
        private Companion() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IpeFeature createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return IpeFeature.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ IpeFeature[] newArray(int i) {
            return new IpeFeature[i];
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int flags) {
        OooOOO0.OooO0oO(parcel, "parcel");
        parcel.writeInt(ordinal());
    }

    IpeFeature(Parcel parcel) {
        this();
    }
}
