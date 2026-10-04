package com.orion.notein.domain.models.material;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001>B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH¦@¢\u0006\u0004\b\u000e\u0010!J\"\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u001fH¦@¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\nR\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0006R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0001\u0005?@ABC¨\u0006D"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/Material;", "", "<init>", "()V", "", "getDownloadPath", "()Ljava/lang/String;", "", "Lcom/orion/notein/domain/models/material/Material$SpecItem;", "getDisplaySpecs", "()Ljava/util/List;", "Lcom/orion/notein/domain/models/material/DownloadState;", "downloadState", "", "isApplied", "Lcom/orion/notein/domain/models/material/MaterialActionType;", "getActionType", "(Lcom/orion/notein/domain/models/material/DownloadState;Z)Lcom/orion/notein/domain/models/material/MaterialActionType;", "getActionLabel", "(Lcom/orion/notein/domain/models/material/DownloadState;Z)Ljava/lang/String;", "needsFileDownload", "()Z", "baseDir", "getLocalStoragePath", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/orion/notein/domain/models/material/MaterialDownloader;", "downloader", "LoO0o0Oo/OooO0o;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "download", "(Lcom/orion/notein/domain/models/material/MaterialDownloader;)LoO0o0Oo/OooO0o;", "Lcom/orion/notein/domain/models/material/MaterialOperationContext;", "context", "(Lcom/orion/notein/domain/models/material/MaterialOperationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "localPath", "LoO00ooO/OooOooO;", "apply", "(Ljava/lang/String;Lcom/orion/notein/domain/models/material/MaterialOperationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getId", "id", "getTitle", NoteMeta.PROPERTY_TITLE, "getDescription", "description", "getThumbnailUrl", "thumbnailUrl", "getPreviewUrls", "previewUrls", "Lcom/orion/notein/domain/models/material/Entitlement;", "getEntitlement", "()Lcom/orion/notein/domain/models/material/Entitlement;", "entitlement", "Lcom/orion/notein/domain/models/material/Creator;", "getCreator", "()Lcom/orion/notein/domain/models/material/Creator;", "creator", "getDownloadUrl", "downloadUrl", "", "getFileSize", "()J", "fileSize", "SpecItem", "Lcom/orion/notein/domain/models/material/Font;", "Lcom/orion/notein/domain/models/material/Palette;", "Lcom/orion/notein/domain/models/material/Sticker;", "Lcom/orion/notein/domain/models/material/TemplateBook;", "Lcom/orion/notein/domain/models/material/TemplateCollection;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class Material {

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0001HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/Material$SpecItem;", "", "labelKey", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getLabelKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class SpecItem {
        private final String labelKey;
        private final Object value;

        public SpecItem(String labelKey, Object value) {
            OooOOO0.OooO0oO(labelKey, "labelKey");
            OooOOO0.OooO0oO(value, "value");
            this.labelKey = labelKey;
            this.value = value;
        }

        public static /* synthetic */ SpecItem copy$default(SpecItem specItem, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = specItem.labelKey;
            }
            if ((i & 2) != 0) {
                obj = specItem.value;
            }
            return specItem.copy(str, obj);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLabelKey() {
            return this.labelKey;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public final SpecItem copy(String labelKey, Object value) {
            OooOOO0.OooO0oO(labelKey, "labelKey");
            OooOOO0.OooO0oO(value, "value");
            return new SpecItem(labelKey, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpecItem)) {
                return false;
            }
            SpecItem specItem = (SpecItem) other;
            return OooOOO0.OooO0O0(this.labelKey, specItem.labelKey) && OooOOO0.OooO0O0(this.value, specItem.value);
        }

        public final String getLabelKey() {
            return this.labelKey;
        }

        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.labelKey.hashCode() * 31);
        }

        public String toString() {
            return "SpecItem(labelKey=" + this.labelKey + ", value=" + this.value + ")";
        }
    }

    public /* synthetic */ Material(C24018OooO0oo c24018OooO0oo) {
        this();
    }

    public abstract Object apply(String str, MaterialOperationContext materialOperationContext, Continuation<? super C32460OooOooO> continuation);

    public abstract InterfaceC33721OooO0o<DownloadResult> download(MaterialDownloader downloader);

    public abstract String getActionLabel(DownloadState downloadState, boolean isApplied);

    public abstract MaterialActionType getActionType(DownloadState downloadState, boolean isApplied);

    public abstract Creator getCreator();

    public abstract String getDescription();

    public abstract List<SpecItem> getDisplaySpecs();

    public abstract String getDownloadPath();

    public abstract String getDownloadUrl();

    public abstract Entitlement getEntitlement();

    public abstract long getFileSize();

    public abstract String getId();

    public abstract String getLocalStoragePath(String baseDir);

    public abstract List<String> getPreviewUrls();

    public abstract String getThumbnailUrl();

    public abstract String getTitle();

    public abstract Object isApplied(MaterialOperationContext materialOperationContext, Continuation<? super Boolean> continuation);

    public abstract boolean needsFileDownload();

    private Material() {
    }
}
