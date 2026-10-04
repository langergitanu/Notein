package com.orion.notein.domain.models.material;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OoooooO.C21445Oooo;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOoo0O.C27836OooO0o;
import o0OOoo0O.C27838OooO0oO;
import o0OOoo0O.C27839OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b+\u0010,J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020-H\u0096@¢\u0006\u0004\b\u001c\u0010/J\"\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u00022\u0006\u0010.\u001a\u00020-H\u0096@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\u0015J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010\u0015J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010\u0015J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010\u0015J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b8\u0010\u0018J\u0010\u00109\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010\u0015J\u0010\u0010>\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b@\u0010AJz\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bD\u0010\u0015J\u0010\u0010E\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\bE\u0010AJ\u001a\u0010H\u001a\u00020\u001b2\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010J\u001a\u0004\bL\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bM\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bN\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010O\u001a\u0004\bP\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010Q\u001a\u0004\bR\u0010:R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010<R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bU\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010V\u001a\u0004\bW\u0010?R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010X\u001a\u0004\bY\u0010A¨\u0006Z"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/Sticker;", "Lcom/orion/notein/domain/models/material/Material;", "", "id", NoteMeta.PROPERTY_TITLE, "description", "thumbnailUrl", "", "previewUrls", "Lcom/orion/notein/domain/models/material/Entitlement;", "entitlement", "Lcom/orion/notein/domain/models/material/Creator;", "creator", "downloadUrl", "", "fileSize", "", "stickerCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/orion/notein/domain/models/material/Entitlement;Lcom/orion/notein/domain/models/material/Creator;Ljava/lang/String;JI)V", "getDownloadPath", "()Ljava/lang/String;", "Lcom/orion/notein/domain/models/material/Material$SpecItem;", "getDisplaySpecs", "()Ljava/util/List;", "Lcom/orion/notein/domain/models/material/DownloadState;", "downloadState", "", "isApplied", "Lcom/orion/notein/domain/models/material/MaterialActionType;", "getActionType", "(Lcom/orion/notein/domain/models/material/DownloadState;Z)Lcom/orion/notein/domain/models/material/MaterialActionType;", "getActionLabel", "(Lcom/orion/notein/domain/models/material/DownloadState;Z)Ljava/lang/String;", "needsFileDownload", "()Z", "baseDir", "getLocalStoragePath", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/orion/notein/domain/models/material/MaterialDownloader;", "downloader", "LoO0o0Oo/OooO0o;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "download", "(Lcom/orion/notein/domain/models/material/MaterialDownloader;)LoO0o0Oo/OooO0o;", "Lcom/orion/notein/domain/models/material/MaterialOperationContext;", "context", "(Lcom/orion/notein/domain/models/material/MaterialOperationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "localPath", "LoO00ooO/OooOooO;", "apply", "(Ljava/lang/String;Lcom/orion/notein/domain/models/material/MaterialOperationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "()Lcom/orion/notein/domain/models/material/Entitlement;", "component7", "()Lcom/orion/notein/domain/models/material/Creator;", "component8", "component9", "()J", "component10", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/orion/notein/domain/models/material/Entitlement;Lcom/orion/notein/domain/models/material/Creator;Ljava/lang/String;JI)Lcom/orion/notein/domain/models/material/Sticker;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getDescription", "getThumbnailUrl", "Ljava/util/List;", "getPreviewUrls", "Lcom/orion/notein/domain/models/material/Entitlement;", "getEntitlement", "Lcom/orion/notein/domain/models/material/Creator;", "getCreator", "getDownloadUrl", "J", "getFileSize", "I", "getStickerCount", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Sticker extends Material {
    private final Creator creator;
    private final String description;
    private final String downloadUrl;
    private final Entitlement entitlement;
    private final long fileSize;
    private final String id;
    private final List<String> previewUrls;
    private final int stickerCount;
    private final String thumbnailUrl;
    private final String title;

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.Sticker$apply$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.Sticker", m80623f = "Material.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_6}, m80625m = "apply")
    public static final class C188841 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C188841(Continuation<? super C188841> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Sticker.this.apply(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.Sticker$download$1 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0Oo/OooO0oO;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0Oo/OooO0oO;)V"}, m80613k = 3, m80614mv = {2, 1, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.Sticker$download$1", m80623f = "Material.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_4, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_4}, m80625m = "invokeSuspend")
    public static final class C188851 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super DownloadResult>, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ MaterialDownloader $downloader;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ Sticker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188851(MaterialDownloader materialDownloader, Sticker sticker, Continuation<? super C188851> continuation) {
            super(2, continuation);
            this.$downloader = materialDownloader;
            this.this$0 = sticker;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C188851 c188851 = new C188851(this.$downloader, this.this$0, continuation);
            c188851.L$0 = obj;
            return c188851;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r7.emit(r1, r6) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        
            if (r7.emit(r1, r6) == r0) goto L19;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.L$0;
            if (this.$downloader == null) {
                DownloadResult.Failed failed = new DownloadResult.Failed(this.this$0, new IllegalStateException("MaterialDownloader not provided"));
                this.label = 1;
            } else {
                DownloadResult.Failed failed2 = new DownloadResult.Failed(this.this$0, new IllegalStateException("Use MaterialDownloaderImpl.download() instead"));
                this.label = 2;
            }
            return enumC32485OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33723OooO0oO<? super DownloadResult> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
            return ((C188851) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.Sticker$isApplied$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.Sticker", m80623f = "Material.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_5}, m80625m = "isApplied")
    public static final class C188861 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C188861(Continuation<? super C188861> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Sticker.this.isApplied(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sticker(String id, String title, String description, String thumbnailUrl, List<String> previewUrls, Entitlement entitlement, Creator creator, String downloadUrl, long j, int i) {
        super(null);
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(thumbnailUrl, "thumbnailUrl");
        OooOOO0.OooO0oO(previewUrls, "previewUrls");
        OooOOO0.OooO0oO(entitlement, "entitlement");
        OooOOO0.OooO0oO(creator, "creator");
        OooOOO0.OooO0oO(downloadUrl, "downloadUrl");
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
        this.previewUrls = previewUrls;
        this.entitlement = entitlement;
        this.creator = creator;
        this.downloadUrl = downloadUrl;
        this.fileSize = j;
        this.stickerCount = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Sticker copy$default(Sticker sticker, String str, String str2, String str3, String str4, List list, Entitlement entitlement, Creator creator, String str5, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sticker.id;
        }
        if ((i2 & 2) != 0) {
            str2 = sticker.title;
        }
        if ((i2 & 4) != 0) {
            str3 = sticker.description;
        }
        if ((i2 & 8) != 0) {
            str4 = sticker.thumbnailUrl;
        }
        if ((i2 & 16) != 0) {
            list = sticker.previewUrls;
        }
        if ((i2 & 32) != 0) {
            entitlement = sticker.entitlement;
        }
        if ((i2 & 64) != 0) {
            creator = sticker.creator;
        }
        if ((i2 & 128) != 0) {
            str5 = sticker.downloadUrl;
        }
        if ((i2 & 256) != 0) {
            j = sticker.fileSize;
        }
        if ((i2 & 512) != 0) {
            i = sticker.stickerCount;
        }
        int i3 = i;
        long j2 = j;
        Creator creator2 = creator;
        String str6 = str5;
        List list2 = list;
        Entitlement entitlement2 = entitlement;
        return sticker.copy(str, str2, str3, str4, list2, entitlement2, creator2, str6, j2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.orion.notein.domain.models.material.Material
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(String str, MaterialOperationContext materialOperationContext, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        C188841 c188841;
        if (continuation instanceof C188841) {
            c188841 = (C188841) continuation;
            int i = c188841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c188841.label = i - Integer.MIN_VALUE;
            } else {
                c188841 = new C188841(continuation);
            }
        }
        Object obj = c188841.result;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c188841.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (str == null) {
                throw new IllegalStateException("Sticker local path is required for apply operation");
            }
            C27836OooO0o addStickerUseCase = materialOperationContext.getAddStickerUseCase();
            if (addStickerUseCase == null) {
                throw new IllegalStateException("AddStickerToCollectionUseCase not provided in context");
            }
            c188841.label = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27838OooO0oO(str, addStickerUseCase, this, null), c188841);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getStickerCount() {
        return this.stickerCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final List<String> component5() {
        return this.previewUrls;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Entitlement getEntitlement() {
        return this.entitlement;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Creator getCreator() {
        return this.creator;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    public final Sticker copy(String id, String title, String description, String thumbnailUrl, List<String> previewUrls, Entitlement entitlement, Creator creator, String downloadUrl, long fileSize, int stickerCount) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(thumbnailUrl, "thumbnailUrl");
        OooOOO0.OooO0oO(previewUrls, "previewUrls");
        OooOOO0.OooO0oO(entitlement, "entitlement");
        OooOOO0.OooO0oO(creator, "creator");
        OooOOO0.OooO0oO(downloadUrl, "downloadUrl");
        return new Sticker(id, title, description, thumbnailUrl, previewUrls, entitlement, creator, downloadUrl, fileSize, stickerCount);
    }

    @Override // com.orion.notein.domain.models.material.Material
    public InterfaceC33721OooO0o<DownloadResult> download(MaterialDownloader downloader) {
        return new C33770OooooO0(new C188851(downloader, this, null));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sticker)) {
            return false;
        }
        Sticker sticker = (Sticker) other;
        return OooOOO0.OooO0O0(this.id, sticker.id) && OooOOO0.OooO0O0(this.title, sticker.title) && OooOOO0.OooO0O0(this.description, sticker.description) && OooOOO0.OooO0O0(this.thumbnailUrl, sticker.thumbnailUrl) && OooOOO0.OooO0O0(this.previewUrls, sticker.previewUrls) && this.entitlement == sticker.entitlement && OooOOO0.OooO0O0(this.creator, sticker.creator) && OooOOO0.OooO0O0(this.downloadUrl, sticker.downloadUrl) && this.fileSize == sticker.fileSize && this.stickerCount == sticker.stickerCount;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getActionLabel(DownloadState downloadState, boolean isApplied) {
        OooOOO0.OooO0oO(downloadState, "downloadState");
        return isApplied ? "已添加" : downloadState == DownloadState.DOWNLOADED ? "导入贴纸集" : "下载";
    }

    @Override // com.orion.notein.domain.models.material.Material
    public MaterialActionType getActionType(DownloadState downloadState, boolean isApplied) {
        OooOOO0.OooO0oO(downloadState, "downloadState");
        return isApplied ? MaterialActionType.APPLIED : downloadState == DownloadState.DOWNLOADED ? MaterialActionType.IMPORT_STICKER : MaterialActionType.DOWNLOAD;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public Creator getCreator() {
        return this.creator;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getDescription() {
        return this.description;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public List<Material.SpecItem> getDisplaySpecs() {
        return OooOo.OooO0oO(new Material.SpecItem(FirebaseAnalytics.Param.ITEMS, Integer.valueOf(this.stickerCount)));
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getDownloadPath() {
        return OooO00o.OooO00o("creative_library/stickers/", getId());
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public Entitlement getEntitlement() {
        return this.entitlement;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public long getFileSize() {
        return this.fileSize;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getId() {
        return this.id;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getLocalStoragePath(String baseDir) {
        OooOOO0.OooO0oO(baseDir, "baseDir");
        String strOoooo00 = C33599OooOo0O.Ooooo00(getDownloadUrl(), "/");
        return baseDir + "/stickers/" + getId() + "/" + strOoooo00;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public List<String> getPreviewUrls() {
        return this.previewUrls;
    }

    public final int getStickerCount() {
        return this.stickerCount;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.stickerCount) + C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.creator.hashCode() + ((this.entitlement.hashCode() + C21445Oooo.OooO00o(this.previewUrls, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.thumbnailUrl), 31)) * 31)) * 31, 31, this.downloadUrl), 31, this.fileSize);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.orion.notein.domain.models.material.Material
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isApplied(MaterialOperationContext materialOperationContext, Continuation<? super Boolean> continuation) throws Throwable {
        C188861 c188861;
        boolean zBooleanValue;
        if (continuation instanceof C188861) {
            c188861 = (C188861) continuation;
            int i = c188861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c188861.label = i - Integer.MIN_VALUE;
            } else {
                c188861 = new C188861(continuation);
            }
        }
        Object objOooO0o = c188861.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c188861.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C27836OooO0o addStickerUseCase = materialOperationContext.getAddStickerUseCase();
            if (addStickerUseCase == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            String id = getId();
            c188861.label = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27839OooO0oo(addStickerUseCase, id, null), c188861);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        zBooleanValue = ((Boolean) objOooO0o).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // com.orion.notein.domain.models.material.Material
    public boolean needsFileDownload() {
        return true;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.thumbnailUrl;
        List<String> list = this.previewUrls;
        Entitlement entitlement = this.entitlement;
        Creator creator = this.creator;
        String str5 = this.downloadUrl;
        long j = this.fileSize;
        int i = this.stickerCount;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Sticker(id=", str, ", title=", str2, ", description=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", thumbnailUrl=", str4, ", previewUrls=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", entitlement=");
        sbOooO0O0.append(entitlement);
        sbOooO0O0.append(", creator=");
        sbOooO0O0.append(creator);
        sbOooO0O0.append(", downloadUrl=");
        sbOooO0O0.append(str5);
        sbOooO0O0.append(", fileSize=");
        sbOooO0O0.append(j);
        sbOooO0O0.append(", stickerCount=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
