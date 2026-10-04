package com.orion.notein.domain.models.material;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OoO.C24536OooO0Oo;
import o0OOoo0O.C27841OooOO0O;
import o0OOoo0O.C27842OooOO0o;
import o0OOoo0O.C27844OooOOO0;
import oO00ooO.C32443OooOOO;
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
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ\u001f\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020 0\u0007¢\u0006\u0004\b!\u0010\u001eJ\u001f\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\b\u0012\u0004\u0012\u000206052\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b7\u00108J\u0018\u0010(\u001a\u00020'2\u0006\u0010:\u001a\u000209H\u0096@¢\u0006\u0004\b(\u0010;J\"\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u00022\u0006\u0010:\u001a\u000209H\u0096@¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010\u001bJ\u0010\u0010A\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bA\u0010\u001bJ\u0010\u0010B\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bB\u0010\u001bJ\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u0010\u001bJ\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\bD\u0010\u001eJ\u0010\u0010E\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bI\u0010\u001bJ\u0010\u0010J\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007HÆ\u0003¢\u0006\u0004\bR\u0010\u001eJ\u009e\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007HÆ\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bU\u0010\u001bJ\u0010\u0010V\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bV\u0010QJ\u001a\u0010Y\u001a\u00020'2\b\u0010X\u001a\u0004\u0018\u00010WHÖ\u0003¢\u0006\u0004\bY\u0010ZR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010[\u001a\u0004\b\\\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010[\u001a\u0004\b]\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010[\u001a\u0004\b^\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010[\u001a\u0004\b_\u0010\u001bR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010`\u001a\u0004\ba\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010b\u001a\u0004\bc\u0010FR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010d\u001a\u0004\be\u0010HR\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010[\u001a\u0004\bf\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010g\u001a\u0004\bh\u0010KR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010i\u001a\u0004\bj\u0010MR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010k\u001a\u0004\bl\u0010OR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010m\u001a\u0004\bn\u0010QR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010`\u001a\u0004\bo\u0010\u001e¨\u0006p"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/TemplateBook;", "Lcom/orion/notein/domain/models/material/Material;", "", "id", NoteMeta.PROPERTY_TITLE, "description", "thumbnailUrl", "", "previewUrls", "Lcom/orion/notein/domain/models/material/Entitlement;", "entitlement", "Lcom/orion/notein/domain/models/material/Creator;", "creator", "downloadUrl", "", "fileSize", "Lcom/orion/notein/domain/models/material/PageSize;", "pageSize", "Lcom/orion/notein/domain/models/material/Orientation;", "orientation", "", "pageCount", "Lcom/orion/notein/domain/models/material/TemplateFile;", "files", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/orion/notein/domain/models/material/Entitlement;Lcom/orion/notein/domain/models/material/Creator;Ljava/lang/String;JLcom/orion/notein/domain/models/material/PageSize;Lcom/orion/notein/domain/models/material/Orientation;ILjava/util/List;)V", "getDownloadPath", "()Ljava/lang/String;", "Lcom/orion/notein/domain/models/material/Material$SpecItem;", "getDisplaySpecs", "()Ljava/util/List;", "getAvailableOrientations", "LoO00ooO/OooOOO;", "getAvailableColorOptions", "color", "getFilePath", "(Lcom/orion/notein/domain/models/material/Orientation;Ljava/lang/String;)Ljava/lang/String;", "Lcom/orion/notein/domain/models/material/DownloadState;", "downloadState", "", "isApplied", "Lcom/orion/notein/domain/models/material/MaterialActionType;", "getActionType", "(Lcom/orion/notein/domain/models/material/DownloadState;Z)Lcom/orion/notein/domain/models/material/MaterialActionType;", "getActionLabel", "(Lcom/orion/notein/domain/models/material/DownloadState;Z)Ljava/lang/String;", "needsFileDownload", "()Z", "baseDir", "getLocalStoragePath", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/orion/notein/domain/models/material/MaterialDownloader;", "downloader", "LoO0o0Oo/OooO0o;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "download", "(Lcom/orion/notein/domain/models/material/MaterialDownloader;)LoO0o0Oo/OooO0o;", "Lcom/orion/notein/domain/models/material/MaterialOperationContext;", "context", "(Lcom/orion/notein/domain/models/material/MaterialOperationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "localPath", "LoO00ooO/OooOooO;", "apply", "(Ljava/lang/String;Lcom/orion/notein/domain/models/material/MaterialOperationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "()Lcom/orion/notein/domain/models/material/Entitlement;", "component7", "()Lcom/orion/notein/domain/models/material/Creator;", "component8", "component9", "()J", "component10", "()Lcom/orion/notein/domain/models/material/PageSize;", "component11", "()Lcom/orion/notein/domain/models/material/Orientation;", "component12", "()I", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/orion/notein/domain/models/material/Entitlement;Lcom/orion/notein/domain/models/material/Creator;Ljava/lang/String;JLcom/orion/notein/domain/models/material/PageSize;Lcom/orion/notein/domain/models/material/Orientation;ILjava/util/List;)Lcom/orion/notein/domain/models/material/TemplateBook;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getDescription", "getThumbnailUrl", "Ljava/util/List;", "getPreviewUrls", "Lcom/orion/notein/domain/models/material/Entitlement;", "getEntitlement", "Lcom/orion/notein/domain/models/material/Creator;", "getCreator", "getDownloadUrl", "J", "getFileSize", "Lcom/orion/notein/domain/models/material/PageSize;", "getPageSize", "Lcom/orion/notein/domain/models/material/Orientation;", "getOrientation", "I", "getPageCount", "getFiles", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TemplateBook extends Material {
    private final Creator creator;
    private final String description;
    private final String downloadUrl;
    private final Entitlement entitlement;
    private final long fileSize;
    private final List<TemplateFile> files;
    private final String id;
    private final Orientation orientation;
    private final int pageCount;
    private final PageSize pageSize;
    private final List<String> previewUrls;
    private final String thumbnailUrl;
    private final String title;

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.TemplateBook$apply$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.TemplateBook", m80623f = "Material.kt", m80624l = {300}, m80625m = "apply")
    public static final class C188871 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C188871(Continuation<? super C188871> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TemplateBook.this.apply(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.TemplateBook$download$1 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0Oo/OooO0oO;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0Oo/OooO0oO;)V"}, m80613k = 3, m80614mv = {2, 1, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.TemplateBook$download$1", m80623f = "Material.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1, StyleIdentifier.GRID_TABLE_3_ACCENT_2}, m80625m = "invokeSuspend")
    public static final class C188881 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super DownloadResult>, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ MaterialDownloader $downloader;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TemplateBook this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188881(MaterialDownloader materialDownloader, TemplateBook templateBook, Continuation<? super C188881> continuation) {
            super(2, continuation);
            this.$downloader = materialDownloader;
            this.this$0 = templateBook;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C188881 c188881 = new C188881(this.$downloader, this.this$0, continuation);
            c188881.L$0 = obj;
            return c188881;
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
            return ((C188881) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.TemplateBook$isApplied$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.TemplateBook", m80623f = "Material.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2}, m80625m = "isApplied")
    public static final class C188891 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C188891(Continuation<? super C188891> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TemplateBook.this.isApplied(null, this);
        }
    }

    public /* synthetic */ TemplateBook(String str, String str2, String str3, String str4, List list, Entitlement entitlement, Creator creator, String str5, long j, PageSize pageSize, Orientation orientation, int i, List list2, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, str4, list, entitlement, creator, str5, j, pageSize, orientation, i, (i2 & 4096) != 0 ? C34434OooOoO.f123453OooOo0o : list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.orion.notein.domain.models.material.Material
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(String str, MaterialOperationContext materialOperationContext, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        C188871 c188871;
        if (continuation instanceof C188871) {
            c188871 = (C188871) continuation;
            int i = c188871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c188871.label = i - Integer.MIN_VALUE;
            } else {
                c188871 = new C188871(continuation);
            }
        }
        Object objOooO0o = c188871.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c188871.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (str == null) {
                throw new IllegalStateException("TemplateBook local path is required for apply operation");
            }
            C27844OooOOO0 applyTemplateBookUseCase = materialOperationContext.getApplyTemplateBookUseCase();
            if (applyTemplateBookUseCase != null) {
                c188871.label = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27841OooOO0O(str, applyTemplateBookUseCase, this, null), c188871);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            throw new IllegalStateException("ApplyTemplateBookUseCase not provided in context");
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(objOooO0o);
        if (((String) objOooO0o) != null) {
            return C32460OooOooO.f116667OooO00o;
        }
        throw new IllegalStateException("ApplyTemplateBookUseCase not provided in context");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PageSize getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getPageCount() {
        return this.pageCount;
    }

    public final List<TemplateFile> component13() {
        return this.files;
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

    public final TemplateBook copy(String id, String title, String description, String thumbnailUrl, List<String> previewUrls, Entitlement entitlement, Creator creator, String downloadUrl, long fileSize, PageSize pageSize, Orientation orientation, int pageCount, List<TemplateFile> files) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(thumbnailUrl, "thumbnailUrl");
        OooOOO0.OooO0oO(previewUrls, "previewUrls");
        OooOOO0.OooO0oO(entitlement, "entitlement");
        OooOOO0.OooO0oO(creator, "creator");
        OooOOO0.OooO0oO(downloadUrl, "downloadUrl");
        OooOOO0.OooO0oO(pageSize, "pageSize");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(files, "files");
        return new TemplateBook(id, title, description, thumbnailUrl, previewUrls, entitlement, creator, downloadUrl, fileSize, pageSize, orientation, pageCount, files);
    }

    @Override // com.orion.notein.domain.models.material.Material
    public InterfaceC33721OooO0o<DownloadResult> download(MaterialDownloader downloader) {
        return new C33770OooooO0(new C188881(downloader, this, null));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemplateBook)) {
            return false;
        }
        TemplateBook templateBook = (TemplateBook) other;
        return OooOOO0.OooO0O0(this.id, templateBook.id) && OooOOO0.OooO0O0(this.title, templateBook.title) && OooOOO0.OooO0O0(this.description, templateBook.description) && OooOOO0.OooO0O0(this.thumbnailUrl, templateBook.thumbnailUrl) && OooOOO0.OooO0O0(this.previewUrls, templateBook.previewUrls) && this.entitlement == templateBook.entitlement && OooOOO0.OooO0O0(this.creator, templateBook.creator) && OooOOO0.OooO0O0(this.downloadUrl, templateBook.downloadUrl) && this.fileSize == templateBook.fileSize && this.pageSize == templateBook.pageSize && this.orientation == templateBook.orientation && this.pageCount == templateBook.pageCount && OooOOO0.OooO0O0(this.files, templateBook.files);
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getActionLabel(DownloadState downloadState, boolean isApplied) {
        OooOOO0.OooO0oO(downloadState, "downloadState");
        return isApplied ? "去创建" : downloadState == DownloadState.DOWNLOADED ? "添加到我的模版" : "下载";
    }

    @Override // com.orion.notein.domain.models.material.Material
    public MaterialActionType getActionType(DownloadState downloadState, boolean isApplied) {
        OooOOO0.OooO0oO(downloadState, "downloadState");
        return isApplied ? MaterialActionType.GO_TO_CREATE : downloadState == DownloadState.DOWNLOADED ? MaterialActionType.ADD_TEMPLATE : MaterialActionType.DOWNLOAD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C32443OooOOO<String, String>> getAvailableColorOptions() {
        if (this.files.isEmpty()) {
            return C34434OooOoO.f123453OooOo0o;
        }
        List<TemplateFile> list = this.files;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (TemplateFile templateFile : list) {
            arrayList.add(new C32443OooOOO(templateFile.getColor(), templateFile.getColorName()));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add((String) ((C32443OooOOO) obj).f116638OooOo0o)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final List<Orientation> getAvailableOrientations() {
        if (this.files.isEmpty()) {
            return OooOo.OooO0oO(this.orientation);
        }
        List<TemplateFile> list = this.files;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TemplateFile) it.next()).getOrientation());
        }
        return oOo000Oo.OooOo.o00O0O(oOo000Oo.OooOo.Oooo0(arrayList), new Comparator() { // from class: com.orion.notein.domain.models.material.TemplateBook$getAvailableOrientations$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Orientation orientation = (Orientation) t;
                Orientation orientation2 = Orientation.PORTRAIT;
                return C24536OooO0Oo.OooO0O0(Integer.valueOf(orientation == orientation2 ? 0 : 1), Integer.valueOf(((Orientation) t2) == orientation2 ? 0 : 1));
            }
        });
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
        return C34429OooOOo0.OooOO0o(new Material.SpecItem("size", this.pageSize), new Material.SpecItem("orientation", this.orientation), new Material.SpecItem("pages", Integer.valueOf(this.pageCount)));
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getDownloadPath() {
        return OooO00o.OooO00o("creative_library/templates/books/", getId());
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public Entitlement getEntitlement() {
        return this.entitlement;
    }

    public final String getFilePath(Orientation orientation, String color) {
        Object next;
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(color, "color");
        Iterator<T> it = this.files.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TemplateFile templateFile = (TemplateFile) next;
            if (templateFile.getOrientation() == orientation && OooOOO0.OooO0O0(templateFile.getColor(), color)) {
                break;
            }
        }
        TemplateFile templateFile2 = (TemplateFile) next;
        if (templateFile2 != null) {
            return templateFile2.getPath();
        }
        return null;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public long getFileSize() {
        return this.fileSize;
    }

    public final List<TemplateFile> getFiles() {
        return this.files;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getId() {
        return this.id;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getLocalStoragePath(String baseDir) {
        OooOOO0.OooO0oO(baseDir, "baseDir");
        String strOoooo00 = C33599OooOo0O.Ooooo00(getDownloadUrl(), "/");
        if (strOoooo00.length() == 0) {
            strOoooo00 = "template_book.pdf";
        }
        return baseDir + "/templates/books/" + getId() + "/" + strOoooo00;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public final PageSize getPageSize() {
        return this.pageSize;
    }

    @Override // com.orion.notein.domain.models.material.Material
    public List<String> getPreviewUrls() {
        return this.previewUrls;
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
        return this.files.hashCode() + C20785Oooo00o.OooO00o(this.pageCount, (this.orientation.hashCode() + ((this.pageSize.hashCode() + C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.creator.hashCode() + ((this.entitlement.hashCode() + C21445Oooo.OooO00o(this.previewUrls, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.thumbnailUrl), 31)) * 31)) * 31, 31, this.downloadUrl), 31, this.fileSize)) * 31)) * 31, 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.orion.notein.domain.models.material.Material
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isApplied(MaterialOperationContext materialOperationContext, Continuation<? super Boolean> continuation) throws Throwable {
        C188891 c188891;
        boolean zBooleanValue;
        if (continuation instanceof C188891) {
            c188891 = (C188891) continuation;
            int i = c188891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c188891.label = i - Integer.MIN_VALUE;
            } else {
                c188891 = new C188891(continuation);
            }
        }
        Object objOooO0o = c188891.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c188891.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C27844OooOOO0 applyTemplateBookUseCase = materialOperationContext.getApplyTemplateBookUseCase();
            if (applyTemplateBookUseCase == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            String id = getId();
            c188891.label = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27842OooOO0o(applyTemplateBookUseCase, id, null), c188891);
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
        PageSize pageSize = this.pageSize;
        Orientation orientation = this.orientation;
        int i = this.pageCount;
        List<TemplateFile> list2 = this.files;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("TemplateBook(id=", str, ", title=", str2, ", description=");
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
        sbOooO0O0.append(", pageSize=");
        sbOooO0O0.append(pageSize);
        sbOooO0O0.append(", orientation=");
        sbOooO0O0.append(orientation);
        sbOooO0O0.append(", pageCount=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", files=");
        sbOooO0O0.append(list2);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateBook(String id, String title, String description, String thumbnailUrl, List<String> previewUrls, Entitlement entitlement, Creator creator, String downloadUrl, long j, PageSize pageSize, Orientation orientation, int i, List<TemplateFile> files) {
        super(null);
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(thumbnailUrl, "thumbnailUrl");
        OooOOO0.OooO0oO(previewUrls, "previewUrls");
        OooOOO0.OooO0oO(entitlement, "entitlement");
        OooOOO0.OooO0oO(creator, "creator");
        OooOOO0.OooO0oO(downloadUrl, "downloadUrl");
        OooOOO0.OooO0oO(pageSize, "pageSize");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(files, "files");
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
        this.previewUrls = previewUrls;
        this.entitlement = entitlement;
        this.creator = creator;
        this.downloadUrl = downloadUrl;
        this.fileSize = j;
        this.pageSize = pageSize;
        this.orientation = orientation;
        this.pageCount = i;
        this.files = files;
    }
}
