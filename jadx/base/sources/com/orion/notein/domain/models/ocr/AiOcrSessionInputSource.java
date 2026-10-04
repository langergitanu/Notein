package com.orion.notein.domain.models.ocr;

import OooOo.C20485OooOoO;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0011J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001cR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u00101¨\u00063"}, m80612d2 = {"Lcom/orion/notein/domain/models/ocr/AiOcrSessionInputSource;", "Landroid/os/Parcelable;", "", "id", "", "sourceType", "", "sourceUris", "Landroid/os/Bundle;", "extras", "<init>", "(Ljava/lang/String;ILjava/util/List;Landroid/os/Bundle;)V", "password", "LoO00ooO/OooOooO;", "setPdfPassword", "(Ljava/lang/String;)V", "getPdfPassword", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "component3", "()Ljava/util/List;", "component4", "()Landroid/os/Bundle;", "copy", "(Ljava/lang/String;ILjava/util/List;Landroid/os/Bundle;)Lcom/orion/notein/domain/models/ocr/AiOcrSessionInputSource;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getSourceType", "Ljava/util/List;", "getSourceUris", "Landroid/os/Bundle;", "getExtras", "setExtras", "(Landroid/os/Bundle;)V", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class AiOcrSessionInputSource implements Parcelable {
    public static final int SOURCE_TYPE_CAMERA = 2;
    public static final int SOURCE_TYPE_IMAGE = 0;
    public static final int SOURCE_TYPE_NONE = -1;
    public static final int SOURCE_TYPE_NOTE = 3;
    public static final int SOURCE_TYPE_PDF = 1;
    private Bundle extras;
    private final String id;
    private final int sourceType;
    private final List<String> sourceUris;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AiOcrSessionInputSource> CREATOR = new Creator();
    private static final AiOcrSessionInputSource NONE = new AiOcrSessionInputSource("", -1, C34434OooOoO.f123453OooOo0o, null, 8, null);

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/ocr/AiOcrSessionInputSource$Companion;", "", "<init>", "()V", "SOURCE_TYPE_NONE", "", "SOURCE_TYPE_IMAGE", "SOURCE_TYPE_PDF", "SOURCE_TYPE_CAMERA", "SOURCE_TYPE_NOTE", "NONE", "Lcom/orion/notein/domain/models/ocr/AiOcrSessionInputSource;", "getNONE", "()Lcom/orion/notein/domain/models/ocr/AiOcrSessionInputSource;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final AiOcrSessionInputSource getNONE() {
            return AiOcrSessionInputSource.NONE;
        }

        private Companion() {
        }
    }

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Creator implements Parcelable.Creator<AiOcrSessionInputSource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiOcrSessionInputSource createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return new AiOcrSessionInputSource(parcel.readString(), parcel.readInt(), parcel.createStringArrayList(), parcel.readBundle(AiOcrSessionInputSource.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiOcrSessionInputSource[] newArray(int i) {
            return new AiOcrSessionInputSource[i];
        }
    }

    public AiOcrSessionInputSource(String id, int i, List<String> sourceUris, Bundle extras) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(sourceUris, "sourceUris");
        OooOOO0.OooO0oO(extras, "extras");
        this.id = id;
        this.sourceType = i;
        this.sourceUris = sourceUris;
        this.extras = extras;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiOcrSessionInputSource copy$default(AiOcrSessionInputSource aiOcrSessionInputSource, String str, int i, List list, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aiOcrSessionInputSource.id;
        }
        if ((i2 & 2) != 0) {
            i = aiOcrSessionInputSource.sourceType;
        }
        if ((i2 & 4) != 0) {
            list = aiOcrSessionInputSource.sourceUris;
        }
        if ((i2 & 8) != 0) {
            bundle = aiOcrSessionInputSource.extras;
        }
        return aiOcrSessionInputSource.copy(str, i, list, bundle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    public final List<String> component3() {
        return this.sourceUris;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Bundle getExtras() {
        return this.extras;
    }

    public final AiOcrSessionInputSource copy(String id, int sourceType, List<String> sourceUris, Bundle extras) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(sourceUris, "sourceUris");
        OooOOO0.OooO0oO(extras, "extras");
        return new AiOcrSessionInputSource(id, sourceType, sourceUris, extras);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiOcrSessionInputSource)) {
            return false;
        }
        AiOcrSessionInputSource aiOcrSessionInputSource = (AiOcrSessionInputSource) other;
        return OooOOO0.OooO0O0(this.id, aiOcrSessionInputSource.id) && this.sourceType == aiOcrSessionInputSource.sourceType && OooOOO0.OooO0O0(this.sourceUris, aiOcrSessionInputSource.sourceUris) && OooOOO0.OooO0O0(this.extras, aiOcrSessionInputSource.extras);
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPdfPassword() {
        return this.extras.getString("pdf_password");
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final List<String> getSourceUris() {
        return this.sourceUris;
    }

    public int hashCode() {
        return this.extras.hashCode() + C21445Oooo.OooO00o(this.sourceUris, C20785Oooo00o.OooO00o(this.sourceType, this.id.hashCode() * 31, 31), 31);
    }

    public final void setExtras(Bundle bundle) {
        OooOOO0.OooO0oO(bundle, "<set-?>");
        this.extras = bundle;
    }

    public final void setPdfPassword(String password) {
        OooOOO0.OooO0oO(password, "password");
        this.extras.putString("pdf_password", password);
    }

    public String toString() {
        String str = this.id;
        int i = this.sourceType;
        List<String> list = this.sourceUris;
        Bundle bundle = this.extras;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "AiOcrSessionInputSource(id=", str, ", sourceType=", ", sourceUris=");
        sbOooO0OO.append(list);
        sbOooO0OO.append(", extras=");
        sbOooO0OO.append(bundle);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeString(this.id);
        dest.writeInt(this.sourceType);
        dest.writeStringList(this.sourceUris);
        dest.writeBundle(this.extras);
    }

    public /* synthetic */ AiOcrSessionInputSource(String str, int i, List list, Bundle bundle, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, i, list, (i2 & 8) != 0 ? new Bundle() : bundle);
    }
}
