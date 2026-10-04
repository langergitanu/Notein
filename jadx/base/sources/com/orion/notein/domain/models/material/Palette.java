package com.orion.notein.domain.models.material;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OoooooO.C21445Oooo;
import android.graphics.Color;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.note.ColorSet;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOoo0O.C27837OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b*\u0010+J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b\u001b\u0010.J\"\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u0014J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\u0014J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010\u0014J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010\u0014J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b7\u0010\u0017J\u0010\u00108\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010\u0014J\u0010\u0010=\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b?\u0010\u0017J\u0080\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bB\u0010\u0014J\u0010\u0010D\u001a\u00020CHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020\u001a2\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010J\u001a\u0004\bL\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bM\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bN\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010O\u001a\u0004\bP\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010Q\u001a\u0004\bR\u00109R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010;R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bU\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010V\u001a\u0004\bW\u0010>R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bX\u0010\u0017¨\u0006Y"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/Palette;", "Lcom/orion/notein/domain/models/material/Material;", "", "id", NoteMeta.PROPERTY_TITLE, "description", "thumbnailUrl", "", "previewUrls", "Lcom/orion/notein/domain/models/material/Entitlement;", "entitlement", "Lcom/orion/notein/domain/models/material/Creator;", "creator", "downloadUrl", "", "fileSize", "colors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/orion/notein/domain/models/material/Entitlement;Lcom/orion/notein/domain/models/material/Creator;Ljava/lang/String;JLjava/util/List;)V", "getDownloadPath", "()Ljava/lang/String;", "Lcom/orion/notein/domain/models/material/Material$SpecItem;", "getDisplaySpecs", "()Ljava/util/List;", "Lcom/orion/notein/domain/models/material/DownloadState;", "downloadState", "", "isApplied", "Lcom/orion/notein/domain/models/material/MaterialActionType;", "getActionType", "(Lcom/orion/notein/domain/models/material/DownloadState;Z)Lcom/orion/notein/domain/models/material/MaterialActionType;", "getActionLabel", "(Lcom/orion/notein/domain/models/material/DownloadState;Z)Ljava/lang/String;", "needsFileDownload", "()Z", "baseDir", "getLocalStoragePath", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/orion/notein/domain/models/material/MaterialDownloader;", "downloader", "LoO0o0Oo/OooO0o;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "download", "(Lcom/orion/notein/domain/models/material/MaterialDownloader;)LoO0o0Oo/OooO0o;", "Lcom/orion/notein/domain/models/material/MaterialOperationContext;", "context", "(Lcom/orion/notein/domain/models/material/MaterialOperationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "localPath", "LoO00ooO/OooOooO;", "apply", "(Ljava/lang/String;Lcom/orion/notein/domain/models/material/MaterialOperationContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "()Lcom/orion/notein/domain/models/material/Entitlement;", "component7", "()Lcom/orion/notein/domain/models/material/Creator;", "component8", "component9", "()J", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/orion/notein/domain/models/material/Entitlement;Lcom/orion/notein/domain/models/material/Creator;Ljava/lang/String;JLjava/util/List;)Lcom/orion/notein/domain/models/material/Palette;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getDescription", "getThumbnailUrl", "Ljava/util/List;", "getPreviewUrls", "Lcom/orion/notein/domain/models/material/Entitlement;", "getEntitlement", "Lcom/orion/notein/domain/models/material/Creator;", "getCreator", "getDownloadUrl", "J", "getFileSize", "getColors", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Palette extends Material {
    private final List<String> colors;
    private final Creator creator;
    private final String description;
    private final String downloadUrl;
    private final Entitlement entitlement;
    private final long fileSize;
    private final String id;
    private final List<String> previewUrls;
    private final String thumbnailUrl;
    private final String title;

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.Palette$apply$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.Palette", m80623f = "Material.kt", m80624l = {498}, m80625m = "apply")
    public static final class C188811 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C188811(Continuation<? super C188811> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Palette.this.apply(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.Palette$download$1 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"LoO0o0Oo/OooO0oO;", "Lcom/orion/notein/domain/models/material/DownloadResult;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0Oo/OooO0oO;)V"}, m80613k = 3, m80614mv = {2, 1, 0})
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.Palette$download$1", m80623f = "Material.kt", m80624l = {488}, m80625m = "invokeSuspend")
    public static final class C188821 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super DownloadResult>, Continuation<? super C32460OooOooO>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C188821(Continuation<? super C188821> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C188821 c188821 = Palette.this.new C188821(continuation);
            c188821.L$0 = obj;
            return c188821;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.L$0;
                DownloadResult.NoFileNeeded noFileNeeded = new DownloadResult.NoFileNeeded(Palette.this);
                this.label = 1;
                if (interfaceC33723OooO0oO.emit(noFileNeeded, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33723OooO0oO<? super DownloadResult> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
            return ((C188821) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.domain.models.material.Palette$isApplied$1 */
    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.material.Palette", m80623f = "Material.kt", m80624l = {493}, m80625m = "isApplied")
    public static final class C188831 extends AbstractC32479OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C188831(Continuation<? super C188831> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Palette.this.isApplied(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Palette(String id, String title, String description, String thumbnailUrl, List<String> previewUrls, Entitlement entitlement, Creator creator, String downloadUrl, long j, List<String> colors) {
        super(null);
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(thumbnailUrl, "thumbnailUrl");
        OooOOO0.OooO0oO(previewUrls, "previewUrls");
        OooOOO0.OooO0oO(entitlement, "entitlement");
        OooOOO0.OooO0oO(creator, "creator");
        OooOOO0.OooO0oO(downloadUrl, "downloadUrl");
        OooOOO0.OooO0oO(colors, "colors");
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
        this.previewUrls = previewUrls;
        this.entitlement = entitlement;
        this.creator = creator;
        this.downloadUrl = downloadUrl;
        this.fileSize = j;
        this.colors = colors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Palette copy$default(Palette palette, String str, String str2, String str3, String str4, List list, Entitlement entitlement, Creator creator, String str5, long j, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = palette.id;
        }
        if ((i & 2) != 0) {
            str2 = palette.title;
        }
        if ((i & 4) != 0) {
            str3 = palette.description;
        }
        if ((i & 8) != 0) {
            str4 = palette.thumbnailUrl;
        }
        if ((i & 16) != 0) {
            list = palette.previewUrls;
        }
        if ((i & 32) != 0) {
            entitlement = palette.entitlement;
        }
        if ((i & 64) != 0) {
            creator = palette.creator;
        }
        if ((i & 128) != 0) {
            str5 = palette.downloadUrl;
        }
        if ((i & 256) != 0) {
            j = palette.fileSize;
        }
        if ((i & 512) != 0) {
            list2 = palette.colors;
        }
        List list3 = list2;
        long j2 = j;
        Creator creator2 = creator;
        String str6 = str5;
        List list4 = list;
        Entitlement entitlement2 = entitlement;
        return palette.copy(str, str2, str3, str4, list4, entitlement2, creator2, str6, j2, list3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.orion.notein.domain.models.material.Material
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(String str, MaterialOperationContext materialOperationContext, Continuation<? super C32460OooOooO> continuation) {
        C188811 c188811;
        Palette palette;
        if (continuation instanceof C188811) {
            c188811 = (C188811) continuation;
            int i = c188811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c188811.label = i - Integer.MIN_VALUE;
                palette = this;
            } else {
                palette = this;
                c188811 = palette.new C188811(continuation);
            }
        }
        Object obj = c188811.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c188811.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27837OooO0o0 addPaletteUseCase = materialOperationContext.getAddPaletteUseCase();
            if (addPaletteUseCase == null) {
                throw new IllegalStateException("AddPaletteToColorSetUseCase not provided in context");
            }
            c188811.label = 1;
            String id = palette.getId();
            String title = palette.getTitle();
            List<String> colors = palette.getColors();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(colors, 10));
            Iterator<T> it = colors.iterator();
            while (it.hasNext()) {
                arrayList.add(new Integer(Color.parseColor((String) it.next())));
            }
            Object objOooO00o = addPaletteUseCase.f98345OooO00o.OooO00o(new ColorSet(id, title, arrayList, Color.parseColor("#EFEFEF"), 0, 1, System.currentTimeMillis(), 0), c188811);
            if (objOooO00o != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
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

    public final List<String> component10() {
        return this.colors;
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

    public final Palette copy(String id, String title, String description, String thumbnailUrl, List<String> previewUrls, Entitlement entitlement, Creator creator, String downloadUrl, long fileSize, List<String> colors) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(description, "description");
        OooOOO0.OooO0oO(thumbnailUrl, "thumbnailUrl");
        OooOOO0.OooO0oO(previewUrls, "previewUrls");
        OooOOO0.OooO0oO(entitlement, "entitlement");
        OooOOO0.OooO0oO(creator, "creator");
        OooOOO0.OooO0oO(downloadUrl, "downloadUrl");
        OooOOO0.OooO0oO(colors, "colors");
        return new Palette(id, title, description, thumbnailUrl, previewUrls, entitlement, creator, downloadUrl, fileSize, colors);
    }

    @Override // com.orion.notein.domain.models.material.Material
    public InterfaceC33721OooO0o<DownloadResult> download(MaterialDownloader downloader) {
        return new C33770OooooO0(new C188821(null));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Palette)) {
            return false;
        }
        Palette palette = (Palette) other;
        return OooOOO0.OooO0O0(this.id, palette.id) && OooOOO0.OooO0O0(this.title, palette.title) && OooOOO0.OooO0O0(this.description, palette.description) && OooOOO0.OooO0O0(this.thumbnailUrl, palette.thumbnailUrl) && OooOOO0.OooO0O0(this.previewUrls, palette.previewUrls) && this.entitlement == palette.entitlement && OooOOO0.OooO0O0(this.creator, palette.creator) && OooOOO0.OooO0O0(this.downloadUrl, palette.downloadUrl) && this.fileSize == palette.fileSize && OooOOO0.OooO0O0(this.colors, palette.colors);
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getActionLabel(DownloadState downloadState, boolean isApplied) {
        OooOOO0.OooO0oO(downloadState, "downloadState");
        return isApplied ? "已添加" : downloadState == DownloadState.DOWNLOADED ? "加入自定义色彩集" : "下载";
    }

    @Override // com.orion.notein.domain.models.material.Material
    public MaterialActionType getActionType(DownloadState downloadState, boolean isApplied) {
        OooOOO0.OooO0oO(downloadState, "downloadState");
        return isApplied ? MaterialActionType.APPLIED : downloadState == DownloadState.DOWNLOADED ? MaterialActionType.ADD_PALETTE : MaterialActionType.DOWNLOAD;
    }

    public final List<String> getColors() {
        return this.colors;
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
        return OooOo.OooO0oO(new Material.SpecItem("colors", Integer.valueOf(this.colors.size())));
    }

    @Override // com.orion.notein.domain.models.material.Material
    public String getDownloadPath() {
        return OooO00o.OooO00o("creative_library/palettes/", getId());
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
        return "";
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
        return this.colors.hashCode() + C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.creator.hashCode() + ((this.entitlement.hashCode() + C21445Oooo.OooO00o(this.previewUrls, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.thumbnailUrl), 31)) * 31)) * 31, 31, this.downloadUrl), 31, this.fileSize);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.orion.notein.domain.models.material.Material
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isApplied(MaterialOperationContext materialOperationContext, Continuation<? super Boolean> continuation) {
        C188831 c188831;
        boolean zBooleanValue;
        if (continuation instanceof C188831) {
            c188831 = (C188831) continuation;
            int i = c188831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c188831.label = i - Integer.MIN_VALUE;
            } else {
                c188831 = new C188831(continuation);
            }
        }
        Object objOooO00o = c188831.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c188831.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            C27837OooO0o0 addPaletteUseCase = materialOperationContext.getAddPaletteUseCase();
            if (addPaletteUseCase == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            String id = getId();
            c188831.label = 1;
            objOooO00o = addPaletteUseCase.OooO00o(id, c188831);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        zBooleanValue = ((Boolean) objOooO00o).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // com.orion.notein.domain.models.material.Material
    public boolean needsFileDownload() {
        return false;
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
        List<String> list2 = this.colors;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Palette(id=", str, ", title=", str2, ", description=");
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
        sbOooO0O0.append(", colors=");
        sbOooO0O0.append(list2);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
