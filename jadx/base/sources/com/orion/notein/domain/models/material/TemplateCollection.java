package com.orion.notein.domain.models.material;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
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
import o0OOo0o.C27555o00oOOO0;
import o0OOo0o.C27570o00oOoo0;
import o0OOoo0O.C27843OooOOO;
import o0OOoo0O.C27845OooOOOO;
import o0OOoo0O.C27848OooOOo0;
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
@Metadata(m80611d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b \u0010\u001fJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\"0\u0007¢\u0006\u0004\b#\u0010\u001fJ\u001f\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020)H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00109\u001a\b\u0012\u0004\u0012\u000208072\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b9\u0010:J\u0018\u0010*\u001a\u00020)2\u0006\u0010<\u001a\u00020;H\u0096@¢\u0006\u0004\b*\u0010=J\"\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010\u00022\u0006\u0010<\u001a\u00020;H\u0096@¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bB\u0010\u001cJ\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u0010\u001cJ\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u0010\u001cJ\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u0010\u001cJ\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\bF\u0010\u001fJ\u0010\u0010G\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bK\u0010\u001cJ\u0010\u0010L\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\bT\u0010\u001fJ\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007HÆ\u0003¢\u0006\u0004\bU\u0010\u001fJ®\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007HÆ\u0001¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bX\u0010\u001cJ\u0010\u0010Y\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bY\u0010SJ\u001a\u0010\\\u001a\u00020)2\b\u0010[\u001a\u0004\u0018\u00010ZHÖ\u0003¢\u0006\u0004\b\\\u0010]R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010^\u001a\u0004\b_\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010^\u001a\u0004\b`\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010^\u001a\u0004\ba\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010^\u001a\u0004\bb\u0010\u001cR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010c\u001a\u0004\bd\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010e\u001a\u0004\bf\u0010HR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010g\u001a\u0004\bh\u0010JR\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010^\u001a\u0004\bi\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010j\u001a\u0004\bk\u0010MR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010l\u001a\u0004\bm\u0010OR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010n\u001a\u0004\bo\u0010QR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010p\u001a\u0004\bq\u0010SR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\br\u0010\u001fR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010c\u001a\u0004\bs\u0010\u001f¨\u0006t"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/TemplateCollection;", "Lcom/orion/notein/domain/models/material/Material;", "", "id", NoteMeta.PROPERTY_TITLE, "description", "thumbnailUrl", "", "previewUrls", "Lcom/orion/notein/domain/models/material/Entitlement;", "entitlement", "Lcom/orion/notein/domain/models/material/Creator;", "creator", "downloadUrl", "", "fileSize", "Lcom/orion/notein/domain/models/material/PageSize;", "pageSize", "Lcom/orion/notein/domain/models/material/Orientation;", "orientation", "", "pageCount", "colorVariants", "Lcom/orion/notein/domain/models/material/TemplateFile;", "files", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/orion/notein/domain/models/material/Entitlement;Lcom/orion/notein/domain/models/material/Creator;Ljava/lang/String;JLcom/orion/notein/domain/models/material/PageSize;Lcom/orion/notein/domain/models/material/Orientation;ILjava/util/List;Ljava/util/List;)V", "getDownloadPath", "()Ljava/lang/String;", "Lcom/orion/notein/domain/models/material/Material$SpecItem;", "getDisplaySpecs", "()Ljava/util/List;", "getAvailableColors", "getAvailableOrientations", "LoO00ooO/OooOOO;", "getAvailableColorOptions", "color", "getFilePath", "(Lcom/orion/notein/domain/models/material/Orientation;Ljava/lang/String;)Ljava/lang/String;", "Lcom/orion/notein/domain/models/material/DownloadState;", "downloadState", "", "isApplied", "Lcom/orion/notein/domain/models/material/MaterialActionType;", "getActionType", "(Lcom/orion/notein/domain/models/material/DownloadState;Z)Lcom/orion/notein/domain/models/material/MaterialActionType;", "getActionLabel", "(Lcom/orion/notein/domain/models/material/DownloadState;Z)Ljava/lang/String;", "needsFileDownload", "()Z", "baseDir", "getLocalStoragePath", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/orion/notein/domain/models/material/MaterialDownloader;", "downloader", "LoO0o0Oo/OooO0o;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "download", "(Lcom/orion/notein/domain/models/material/MaterialDownloader;)LoO0o0Oo/OooO0o;", "Lcom/orion/notein/domain/models/material/MaterialOperationContext;", "context", "(Lcom/orion/notein/domain/models/material/MaterialOperationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "localPath", "LoO00ooO/OooOooO;", "apply", "(Ljava/lang/String;Lcom/orion/notein/domain/models/material/MaterialOperationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "()Lcom/orion/notein/domain/models/material/Entitlement;", "component7", "()Lcom/orion/notein/domain/models/material/Creator;", "component8", "component9", "()J", "component10", "()Lcom/orion/notein/domain/models/material/PageSize;", "component11", "()Lcom/orion/notein/domain/models/material/Orientation;", "component12", "()I", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/orion/notein/domain/models/material/Entitlement;Lcom/orion/notein/domain/models/material/Creator;Ljava/lang/String;JLcom/orion/notein/domain/models/material/PageSize;Lcom/orion/notein/domain/models/material/Orientation;ILjava/util/List;Ljava/util/List;)Lcom/orion/notein/domain/models/material/TemplateCollection;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getDescription", "getThumbnailUrl", "Ljava/util/List;", "getPreviewUrls", "Lcom/orion/notein/domain/models/material/Entitlement;", "getEntitlement", "Lcom/orion/notein/domain/models/material/Creator;", "getCreator", "getDownloadUrl", "J", "getFileSize", "Lcom/orion/notein/domain/models/material/PageSize;", "getPageSize", "Lcom/orion/notein/domain/models/material/Orientation;", "getOrientation", "I", "getPageCount", "getColorVariants", "getFiles", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TemplateCollection extends Material {
    private final List<String> colorVariants;
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

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.TemplateCollection$apply$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.TemplateCollection", m80623f = "Material.kt", m80624l = {192, 198}, m80625m = "apply")
    public static final class C188901 extends AbstractC32479OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C188901(Continuation<? super C188901> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TemplateCollection.this.apply(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.TemplateCollection$download$1 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0Oo/OooO0oO;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0Oo/OooO0oO;)V"}, m80613k = 3, m80614mv = {2, 1, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.TemplateCollection$download$1", m80623f = "Material.kt", m80624l = {176, 179}, m80625m = "invokeSuspend")
    public static final class C188911 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super DownloadResult>, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ MaterialDownloader $downloader;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TemplateCollection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188911(MaterialDownloader materialDownloader, TemplateCollection templateCollection, Continuation<? super C188911> continuation) {
            super(2, continuation);
            this.$downloader = materialDownloader;
            this.this$0 = templateCollection;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C188911 c188911 = new C188911(this.$downloader, this.this$0, continuation);
            c188911.L$0 = obj;
            return c188911;
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
            return ((C188911) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.TemplateCollection$isApplied$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.TemplateCollection", m80623f = "Material.kt", m80624l = {183}, m80625m = "isApplied")
    public static final class C188921 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C188921(Continuation<? super C188921> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TemplateCollection.this.isApplied(null, this);
        }
    }

    public /* synthetic */ TemplateCollection(String str, String str2, String str3, String str4, List list, Entitlement entitlement, Creator creator, String str5, long j, PageSize pageSize, Orientation orientation, int i, List list2, List list3, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, str4, list, entitlement, creator, str5, j, pageSize, orientation, i, list2, (i2 & 8192) != 0 ? C34434OooOoO.f123453OooOo0o : list3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.orion.notein.domain.models.material.Material
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(String str, MaterialOperationContext materialOperationContext, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        C188901 c188901;
        TemplateCollection templateCollection;
        if (continuation instanceof C188901) {
            c188901 = (C188901) continuation;
            int i = c188901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c188901.label = i - Integer.MIN_VALUE;
            } else {
                c188901 = new C188901(continuation);
            }
        }
        Object objOooO0o = c188901.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c188901.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (str == null) {
                throw new IllegalStateException("Template local path is required for apply operation");
            }
            C27848OooOOo0 applyTemplateUseCase = materialOperationContext.getApplyTemplateUseCase();
            if (applyTemplateUseCase == null) {
                throw new IllegalStateException("ApplyTemplateMaterialUseCase not provided in context");
            }
            c188901.L$0 = this;
            c188901.L$1 = materialOperationContext;
            c188901.label = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27843OooOOO(str, applyTemplateUseCase, this, null), c188901);
            if (objOooO0o2 != enumC32485OooO00o) {
                objOooO0o2 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o2 != enumC32485OooO00o) {
                templateCollection = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            templateCollection = (TemplateCollection) c188901.L$0;
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (((String) objOooO0o) != null) {
                return C32460OooOooO.f116667OooO00o;
            }
            throw new IllegalStateException(OooO00o.OooO00o("Failed to add template to My Templates: no valid variant files found for template ", templateCollection.getId()));
        }
        materialOperationContext = (MaterialOperationContext) c188901.L$1;
        templateCollection = (TemplateCollection) c188901.L$0;
        C32446OooOOOo.OooO0O0(objOooO0o);
        C27570o00oOoo0 themeUseCase = materialOperationContext.getThemeUseCase();
        if (themeUseCase == null) {
            throw new IllegalStateException("ThemeUseCase not provided in context");
        }
        c188901.L$0 = templateCollection;
        c188901.L$1 = null;
        c188901.label = 2;
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27555o00oOOO0(templateCollection, themeUseCase, null), c188901);
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

    public final List<String> component13() {
        return this.colorVariants;
    }

    public final List<TemplateFile> component14() {
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

    public final TemplateCollection copy(String id, String title, String description, String thumbnailUrl, List<String> previewUrls, Entitlement entitlement, Creator creator, String downloadUrl, long fileSize, PageSize pageSize, Orientation orientation, int pageCount, List<String> colorVariants, List<TemplateFile> files) {
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
        OooOOO0.OooO0oO(colorVariants, "colorVariants");
        OooOOO0.OooO0oO(files, "files");
        return new TemplateCollection(id, title, description, thumbnailUrl, previewUrls, entitlement, creator, downloadUrl, fileSize, pageSize, orientation, pageCount, colorVariants, files);
    }

    @Override // com.orion.notein.domain.models.material.Material
    public InterfaceC33721OooO0o<DownloadResult> download(MaterialDownloader downloader) {
        return new C33770OooooO0(new C188911(downloader, this, null));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemplateCollection)) {
            return false;
        }
        TemplateCollection templateCollection = (TemplateCollection) other;
        return OooOOO0.OooO0O0(this.id, templateCollection.id) && OooOOO0.OooO0O0(this.title, templateCollection.title) && OooOOO0.OooO0O0(this.description, templateCollection.description) && OooOOO0.OooO0O0(this.thumbnailUrl, templateCollection.thumbnailUrl) && OooOOO0.OooO0O0(this.previewUrls, templateCollection.previewUrls) && this.entitlement == templateCollection.entitlement && OooOOO0.OooO0O0(this.creator, templateCollection.creator) && OooOOO0.OooO0O0(this.downloadUrl, templateCollection.downloadUrl) && this.fileSize == templateCollection.fileSize && this.pageSize == templateCollection.pageSize && this.orientation == templateCollection.orientation && this.pageCount == templateCollection.pageCount && OooOOO0.OooO0O0(this.colorVariants, templateCollection.colorVariants) && OooOOO0.OooO0O0(this.files, templateCollection.files);
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
            List<String> list = this.colorVariants;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (String str : list) {
                arrayList.add(new C32443OooOOO(str, str));
            }
            return arrayList;
        }
        List<TemplateFile> list2 = this.files;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (TemplateFile templateFile : list2) {
            arrayList2.add(new C32443OooOOO(templateFile.getColor(), templateFile.getColorName()));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (hashSet.add((String) ((C32443OooOOO) obj).f116638OooOo0o)) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public final List<String> getAvailableColors() {
        return this.colorVariants;
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
        return oOo000Oo.OooOo.o00O0O(oOo000Oo.OooOo.Oooo0(arrayList), new Comparator() { // from class: com.orion.notein.domain.models.material.TemplateCollection$getAvailableOrientations$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Orientation orientation = (Orientation) t;
                Orientation orientation2 = Orientation.PORTRAIT;
                return C24536OooO0Oo.OooO0O0(Integer.valueOf(orientation == orientation2 ? 0 : 1), Integer.valueOf(((Orientation) t2) == orientation2 ? 0 : 1));
            }
        });
    }

    public final List<String> getColorVariants() {
        return this.colorVariants;
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
        return C34429OooOOo0.OooOO0o(new Material.SpecItem("size", this.pageSize), new Material.SpecItem("orientation", this.orientation), new Material.SpecItem("sheets", Integer.valueOf(this.pageCount)));
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getDownloadPath() {
        return OooO00o.OooO00o("creative_library/templates/collections/", getId());
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
        return baseDir + "/templates/" + getId() + "/" + strOoooo00;
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
        return this.files.hashCode() + C21445Oooo.OooO00o(this.colorVariants, C20785Oooo00o.OooO00o(this.pageCount, (this.orientation.hashCode() + ((this.pageSize.hashCode() + C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.creator.hashCode() + ((this.entitlement.hashCode() + C21445Oooo.OooO00o(this.previewUrls, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.thumbnailUrl), 31)) * 31)) * 31, 31, this.downloadUrl), 31, this.fileSize)) * 31)) * 31, 31), 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.orion.notein.domain.models.material.Material
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isApplied(MaterialOperationContext materialOperationContext, Continuation<? super Boolean> continuation) throws Throwable {
        C188921 c188921;
        boolean zBooleanValue;
        if (continuation instanceof C188921) {
            c188921 = (C188921) continuation;
            int i = c188921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c188921.label = i - Integer.MIN_VALUE;
            } else {
                c188921 = new C188921(continuation);
            }
        }
        Object objOooO0o = c188921.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c188921.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C27848OooOOo0 applyTemplateUseCase = materialOperationContext.getApplyTemplateUseCase();
            if (applyTemplateUseCase == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            String id = getId();
            c188921.label = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27845OooOOOO(applyTemplateUseCase, id, null), c188921);
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
        List<String> list2 = this.colorVariants;
        List<TemplateFile> list3 = this.files;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("TemplateCollection(id=", str, ", title=", str2, ", description=");
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
        sbOooO0O0.append(", colorVariants=");
        sbOooO0O0.append(list2);
        sbOooO0O0.append(", files=");
        sbOooO0O0.append(list3);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateCollection(String id, String title, String description, String thumbnailUrl, List<String> previewUrls, Entitlement entitlement, Creator creator, String downloadUrl, long j, PageSize pageSize, Orientation orientation, int i, List<String> colorVariants, List<TemplateFile> files) {
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
        OooOOO0.OooO0oO(colorVariants, "colorVariants");
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
        this.colorVariants = colorVariants;
        this.files = files;
    }
}
