package com.orion.notein.data.repo.cloudsync.onedrive;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/data/repo/cloudsync/onedrive/CreateUploadSessionPostRequestBody;", "", "item", "Lcom/orion/notein/data/repo/cloudsync/onedrive/DriveItemUploadableProperties;", "<init>", "(Lcom/orion/notein/data/repo/cloudsync/onedrive/DriveItemUploadableProperties;)V", "getItem", "()Lcom/orion/notein/data/repo/cloudsync/onedrive/DriveItemUploadableProperties;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CreateUploadSessionPostRequestBody {

    @SerializedName("item")
    private final DriveItemUploadableProperties item;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateUploadSessionPostRequestBody() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CreateUploadSessionPostRequestBody copy$default(CreateUploadSessionPostRequestBody createUploadSessionPostRequestBody, DriveItemUploadableProperties driveItemUploadableProperties, int i, Object obj) {
        if ((i & 1) != 0) {
            driveItemUploadableProperties = createUploadSessionPostRequestBody.item;
        }
        return createUploadSessionPostRequestBody.copy(driveItemUploadableProperties);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DriveItemUploadableProperties getItem() {
        return this.item;
    }

    public final CreateUploadSessionPostRequestBody copy(DriveItemUploadableProperties item) {
        return new CreateUploadSessionPostRequestBody(item);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateUploadSessionPostRequestBody) && OooOOO0.OooO0O0(this.item, ((CreateUploadSessionPostRequestBody) other).item);
    }

    public final DriveItemUploadableProperties getItem() {
        return this.item;
    }

    public int hashCode() {
        DriveItemUploadableProperties driveItemUploadableProperties = this.item;
        if (driveItemUploadableProperties == null) {
            return 0;
        }
        return driveItemUploadableProperties.hashCode();
    }

    public String toString() {
        return "CreateUploadSessionPostRequestBody(item=" + this.item + ")";
    }

    public CreateUploadSessionPostRequestBody(DriveItemUploadableProperties driveItemUploadableProperties) {
        this.item = driveItemUploadableProperties;
    }

    public /* synthetic */ CreateUploadSessionPostRequestBody(DriveItemUploadableProperties driveItemUploadableProperties, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : driveItemUploadableProperties);
    }
}
