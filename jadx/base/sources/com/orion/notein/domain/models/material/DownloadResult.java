package com.orion.notein.domain.models.material;

import androidx.core.app.NotificationCompat;
import com.aspose.slides.internal.p497xc.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/DownloadResult;", "", "<init>", "()V", "Success", "NoFileNeeded", "Failed", "InProgress", "AuthRequired", "Lcom/orion/notein/domain/models/material/DownloadResult$AuthRequired;", "Lcom/orion/notein/domain/models/material/DownloadResult$Failed;", "Lcom/orion/notein/domain/models/material/DownloadResult$InProgress;", "Lcom/orion/notein/domain/models/material/DownloadResult$NoFileNeeded;", "Lcom/orion/notein/domain/models/material/DownloadResult$Success;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class DownloadResult {

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/DownloadResult$AuthRequired;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "<init>", "()V", "material", "Lcom/orion/notein/domain/models/material/Material;", "getMaterial", "()Lcom/orion/notein/domain/models/material/Material;", "NeedLogin", "NeedVip", "NeedPurchase", "Lcom/orion/notein/domain/models/material/DownloadResult$AuthRequired$NeedLogin;", "Lcom/orion/notein/domain/models/material/DownloadResult$AuthRequired$NeedPurchase;", "Lcom/orion/notein/domain/models/material/DownloadResult$AuthRequired$NeedVip;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static abstract class AuthRequired extends DownloadResult {

        @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/DownloadResult$AuthRequired$NeedLogin;", "Lcom/orion/notein/domain/models/material/DownloadResult$AuthRequired;", "material", "Lcom/orion/notein/domain/models/material/Material;", "<init>", "(Lcom/orion/notein/domain/models/material/Material;)V", "getMaterial", "()Lcom/orion/notein/domain/models/material/Material;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final /* data */ class NeedLogin extends AuthRequired {
            private final Material material;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NeedLogin(Material material) {
                super(null);
                OooOOO0.OooO0oO(material, "material");
                this.material = material;
            }

            public static /* synthetic */ NeedLogin copy$default(NeedLogin needLogin, Material material, int i, Object obj) {
                if ((i & 1) != 0) {
                    material = needLogin.material;
                }
                return needLogin.copy(material);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Material getMaterial() {
                return this.material;
            }

            public final NeedLogin copy(Material material) {
                OooOOO0.OooO0oO(material, "material");
                return new NeedLogin(material);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NeedLogin) && OooOOO0.OooO0O0(this.material, ((NeedLogin) other).material);
            }

            @Override // com.orion.notein.domain.models.material.DownloadResult.AuthRequired
            public Material getMaterial() {
                return this.material;
            }

            public int hashCode() {
                return this.material.hashCode();
            }

            public String toString() {
                return "NeedLogin(material=" + this.material + ")";
            }
        }

        @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/DownloadResult$AuthRequired$NeedPurchase;", "Lcom/orion/notein/domain/models/material/DownloadResult$AuthRequired;", "material", "Lcom/orion/notein/domain/models/material/Material;", "priceCents", "", "<init>", "(Lcom/orion/notein/domain/models/material/Material;I)V", "getMaterial", "()Lcom/orion/notein/domain/models/material/Material;", "getPriceCents", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final /* data */ class NeedPurchase extends AuthRequired {
            private final Material material;
            private final int priceCents;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NeedPurchase(Material material, int i) {
                super(null);
                OooOOO0.OooO0oO(material, "material");
                this.material = material;
                this.priceCents = i;
            }

            public static /* synthetic */ NeedPurchase copy$default(NeedPurchase needPurchase, Material material, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    material = needPurchase.material;
                }
                if ((i2 & 2) != 0) {
                    i = needPurchase.priceCents;
                }
                return needPurchase.copy(material, i);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Material getMaterial() {
                return this.material;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getPriceCents() {
                return this.priceCents;
            }

            public final NeedPurchase copy(Material material, int priceCents) {
                OooOOO0.OooO0oO(material, "material");
                return new NeedPurchase(material, priceCents);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NeedPurchase)) {
                    return false;
                }
                NeedPurchase needPurchase = (NeedPurchase) other;
                return OooOOO0.OooO0O0(this.material, needPurchase.material) && this.priceCents == needPurchase.priceCents;
            }

            @Override // com.orion.notein.domain.models.material.DownloadResult.AuthRequired
            public Material getMaterial() {
                return this.material;
            }

            public final int getPriceCents() {
                return this.priceCents;
            }

            public int hashCode() {
                return Integer.hashCode(this.priceCents) + (this.material.hashCode() * 31);
            }

            public String toString() {
                return "NeedPurchase(material=" + this.material + ", priceCents=" + this.priceCents + ")";
            }
        }

        @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/DownloadResult$AuthRequired$NeedVip;", "Lcom/orion/notein/domain/models/material/DownloadResult$AuthRequired;", "material", "Lcom/orion/notein/domain/models/material/Material;", "<init>", "(Lcom/orion/notein/domain/models/material/Material;)V", "getMaterial", "()Lcom/orion/notein/domain/models/material/Material;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final /* data */ class NeedVip extends AuthRequired {
            private final Material material;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NeedVip(Material material) {
                super(null);
                OooOOO0.OooO0oO(material, "material");
                this.material = material;
            }

            public static /* synthetic */ NeedVip copy$default(NeedVip needVip, Material material, int i, Object obj) {
                if ((i & 1) != 0) {
                    material = needVip.material;
                }
                return needVip.copy(material);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Material getMaterial() {
                return this.material;
            }

            public final NeedVip copy(Material material) {
                OooOOO0.OooO0oO(material, "material");
                return new NeedVip(material);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NeedVip) && OooOOO0.OooO0O0(this.material, ((NeedVip) other).material);
            }

            @Override // com.orion.notein.domain.models.material.DownloadResult.AuthRequired
            public Material getMaterial() {
                return this.material;
            }

            public int hashCode() {
                return this.material.hashCode();
            }

            public String toString() {
                return "NeedVip(material=" + this.material + ")";
            }
        }

        public /* synthetic */ AuthRequired(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public abstract Material getMaterial();

        private AuthRequired() {
            super(null);
        }
    }

    @Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/DownloadResult$Failed;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "material", "Lcom/orion/notein/domain/models/material/Material;", "error", "", "<init>", "(Lcom/orion/notein/domain/models/material/Material;Ljava/lang/Throwable;)V", "getMaterial", "()Lcom/orion/notein/domain/models/material/Material;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class Failed extends DownloadResult {
        private final Throwable error;
        private final Material material;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Material material, Throwable error) {
            super(null);
            OooOOO0.OooO0oO(material, "material");
            OooOOO0.OooO0oO(error, "error");
            this.material = material;
            this.error = error;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Material material, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                material = failed.material;
            }
            if ((i & 2) != 0) {
                th = failed.error;
            }
            return failed.copy(material, th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Material getMaterial() {
            return this.material;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Failed copy(Material material, Throwable error) {
            OooOOO0.OooO0oO(material, "material");
            OooOOO0.OooO0oO(error, "error");
            return new Failed(material, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return OooOOO0.OooO0O0(this.material, failed.material) && OooOOO0.OooO0O0(this.error, failed.error);
        }

        public final Throwable getError() {
            return this.error;
        }

        public final Material getMaterial() {
            return this.material;
        }

        public int hashCode() {
            return this.error.hashCode() + (this.material.hashCode() * 31);
        }

        public String toString() {
            return "Failed(material=" + this.material + ", error=" + this.error + ")";
        }
    }

    @Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/DownloadResult$InProgress;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "material", "Lcom/orion/notein/domain/models/material/Material;", NotificationCompat.CATEGORY_PROGRESS, "", "<init>", "(Lcom/orion/notein/domain/models/material/Material;F)V", "getMaterial", "()Lcom/orion/notein/domain/models/material/Material;", "getProgress", "()F", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class InProgress extends DownloadResult {
        private final Material material;
        private final float progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(Material material, float f) {
            super(null);
            OooOOO0.OooO0oO(material, "material");
            this.material = material;
            this.progress = f;
        }

        public static /* synthetic */ InProgress copy$default(InProgress inProgress, Material material, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                material = inProgress.material;
            }
            if ((i & 2) != 0) {
                f = inProgress.progress;
            }
            return inProgress.copy(material, f);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Material getMaterial() {
            return this.material;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        public final InProgress copy(Material material, float progress) {
            OooOOO0.OooO0oO(material, "material");
            return new InProgress(material, progress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InProgress)) {
                return false;
            }
            InProgress inProgress = (InProgress) other;
            return OooOOO0.OooO0O0(this.material, inProgress.material) && Float.compare(this.progress, inProgress.progress) == 0;
        }

        public final Material getMaterial() {
            return this.material;
        }

        public final float getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return Float.hashCode(this.progress) + (this.material.hashCode() * 31);
        }

        public String toString() {
            return "InProgress(material=" + this.material + ", progress=" + this.progress + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/DownloadResult$NoFileNeeded;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "material", "Lcom/orion/notein/domain/models/material/Material;", "<init>", "(Lcom/orion/notein/domain/models/material/Material;)V", "getMaterial", "()Lcom/orion/notein/domain/models/material/Material;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class NoFileNeeded extends DownloadResult {
        private final Material material;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoFileNeeded(Material material) {
            super(null);
            OooOOO0.OooO0oO(material, "material");
            this.material = material;
        }

        public static /* synthetic */ NoFileNeeded copy$default(NoFileNeeded noFileNeeded, Material material, int i, Object obj) {
            if ((i & 1) != 0) {
                material = noFileNeeded.material;
            }
            return noFileNeeded.copy(material);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Material getMaterial() {
            return this.material;
        }

        public final NoFileNeeded copy(Material material) {
            OooOOO0.OooO0oO(material, "material");
            return new NoFileNeeded(material);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoFileNeeded) && OooOOO0.OooO0O0(this.material, ((NoFileNeeded) other).material);
        }

        public final Material getMaterial() {
            return this.material;
        }

        public int hashCode() {
            return this.material.hashCode();
        }

        public String toString() {
            return "NoFileNeeded(material=" + this.material + ")";
        }
    }

    @Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/DownloadResult$Success;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "material", "Lcom/orion/notein/domain/models/material/Material;", "localPath", "", "fileSize", "", "<init>", "(Lcom/orion/notein/domain/models/material/Material;Ljava/lang/String;J)V", "getMaterial", "()Lcom/orion/notein/domain/models/material/Material;", "getLocalPath", "()Ljava/lang/String;", "getFileSize", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class Success extends DownloadResult {
        private final long fileSize;
        private final String localPath;
        private final Material material;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(Material material, String localPath, long j) {
            super(null);
            OooOOO0.OooO0oO(material, "material");
            OooOOO0.OooO0oO(localPath, "localPath");
            this.material = material;
            this.localPath = localPath;
            this.fileSize = j;
        }

        public static /* synthetic */ Success copy$default(Success success, Material material, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                material = success.material;
            }
            if ((i & 2) != 0) {
                str = success.localPath;
            }
            if ((i & 4) != 0) {
                j = success.fileSize;
            }
            return success.copy(material, str, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Material getMaterial() {
            return this.material;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLocalPath() {
            return this.localPath;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getFileSize() {
            return this.fileSize;
        }

        public final Success copy(Material material, String localPath, long fileSize) {
            OooOOO0.OooO0oO(material, "material");
            OooOOO0.OooO0oO(localPath, "localPath");
            return new Success(material, localPath, fileSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return OooOOO0.OooO0O0(this.material, success.material) && OooOOO0.OooO0O0(this.localPath, success.localPath) && this.fileSize == success.fileSize;
        }

        public final long getFileSize() {
            return this.fileSize;
        }

        public final String getLocalPath() {
            return this.localPath;
        }

        public final Material getMaterial() {
            return this.material;
        }

        public int hashCode() {
            return Long.hashCode(this.fileSize) + OooO00o.OooO0O0(this.material.hashCode() * 31, 31, this.localPath);
        }

        public String toString() {
            Material material = this.material;
            String str = this.localPath;
            long j = this.fileSize;
            StringBuilder sb = new StringBuilder("Success(material=");
            sb.append(material);
            sb.append(", localPath=");
            sb.append(str);
            sb.append(", fileSize=");
            return android.support.v4.media.session.OooO00o.OooO00o(j, ")", sb);
        }
    }

    public /* synthetic */ DownloadResult(C24018OooO0oo c24018OooO0oo) {
        this();
    }

    private DownloadResult() {
    }
}
