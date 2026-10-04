package com.orion.notein.domain.models.note;

import OooOO0.OooO0OO;
import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import android.graphics.Bitmap;
import androidx.appcompat.app.OooOOO;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.facebook.soloader.OooOo;
import com.hihonor.honorid.core.data.TmemberRight;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000oooo.C24761OooO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\b\u0018\u0000 {2\u00020\u0001:\u0002{|Bõ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\n\u0010^\u001a\u0004\u0018\u00010_H\u0007J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\tHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u000b0\rHÆ\u0003J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\u000f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\t\u0010j\u001a\u00020\u0011HÆ\u0003J\t\u0010k\u001a\u00020\u0011HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010n\u001a\u00020\tHÆ\u0003J\t\u0010o\u001a\u00020\u0018HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u001bHÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010VJ\t\u0010s\u001a\u00020\tHÆ\u0003J\t\u0010t\u001a\u00020\tHÆ\u0003Jü\u0001\u0010u\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010vJ\u0013\u0010w\u001a\u00020\t2\b\u0010x\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010y\u001a\u00020\u0018HÖ\u0001J\t\u0010z\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00106\"\u0004\b:\u00108R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\"\"\u0004\bD\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010\u0016\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010.\"\u0004\bJ\u00100R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\"\"\u0004\bP\u0010$R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010Y\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010\u001d\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010.\"\u0004\b[\u00100R\u001a\u0010\u001e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010.\"\u0004\b]\u00100¨\u0006}"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/Note;", "", "id", "", TmemberRight.TAG_USERID, NoteMeta.PROPERTY_PARENT_ID, "recoverParentId", NoteMeta.PROPERTY_TITLE, NoteMeta.PROPERTY_FAVORITE, "", "defaultPage", "Lcom/orion/notein/domain/models/page/Page;", "pages", "", "pageLayerIds", "outlines", C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "tnPath", "pdfInfo", "Lcom/orion/notein/domain/models/note/PdfInfo;", NoteMeta.PROPERTY_IN_TRASH_BIN, "savedPageIndex", "", "activatedPageLayerId", "zoom", "", "sortKey", "unboundedNote", "usingOwnPdf", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/orion/notein/domain/models/page/Page;Ljava/util/List;Ljava/util/List;Ljava/util/List;JJLjava/lang/String;Lcom/orion/notein/domain/models/note/PdfInfo;ZILjava/lang/String;FLjava/lang/Integer;ZZ)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getUserId", "setUserId", "getParentId", "setParentId", "getRecoverParentId", "setRecoverParentId", "getTitle", "setTitle", "getFavorite", "()Z", "setFavorite", "(Z)V", "getDefaultPage", "()Lcom/orion/notein/domain/models/page/Page;", "setDefaultPage", "(Lcom/orion/notein/domain/models/page/Page;)V", "getPages", "()Ljava/util/List;", "setPages", "(Ljava/util/List;)V", "getPageLayerIds", "setPageLayerIds", "getOutlines", "setOutlines", "getCreationTime", "()J", "setCreationTime", "(J)V", "getLastModificationTime", "setLastModificationTime", "getTnPath", "setTnPath", "getPdfInfo", "()Lcom/orion/notein/domain/models/note/PdfInfo;", "setPdfInfo", "(Lcom/orion/notein/domain/models/note/PdfInfo;)V", "getInTrashBin", "setInTrashBin", "getSavedPageIndex", "()I", "setSavedPageIndex", "(I)V", "getActivatedPageLayerId", "setActivatedPageLayerId", "getZoom", "()F", "setZoom", "(F)V", "getSortKey", "()Ljava/lang/Integer;", "setSortKey", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUnboundedNote", "setUnboundedNote", "getUsingOwnPdf", "setUsingOwnPdf", "getTnBitmap", "Landroid/graphics/Bitmap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/orion/notein/domain/models/page/Page;Ljava/util/List;Ljava/util/List;Ljava/util/List;JJLjava/lang/String;Lcom/orion/notein/domain/models/note/PdfInfo;ZILjava/lang/String;FLjava/lang/Integer;ZZ)Lcom/orion/notein/domain/models/note/Note;", "equals", "other", "hashCode", "toString", "Companion", "Builder", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Note {
    public static final String KEY_INITIAL_PAGE_INDEX = "key_initial_page_index";
    private String activatedPageLayerId;
    private long creationTime;
    private Page defaultPage;
    private boolean favorite;
    private String id;
    private boolean inTrashBin;
    private long lastModificationTime;
    private List<String> outlines;
    private List<String> pageLayerIds;
    private List<Page> pages;
    private String parentId;
    private PdfInfo pdfInfo;
    private String recoverParentId;
    private int savedPageIndex;
    private Integer sortKey;
    private String title;
    private String tnPath;
    private boolean unboundedNote;
    private String userId;
    private boolean usingOwnPdf;
    private float zoom;

    @Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010 \u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0014\u0010!\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0014\u0010\u0018\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012J\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006$"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/Note$Builder;", "", "<init>", "()V", "id", "", NoteMeta.PROPERTY_PARENT_ID, NoteMeta.PROPERTY_TITLE, "defaultPageTheme", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "defaultPageSpec", "Lcom/orion/notein/domain/models/page/PaperSpec;", NoteMeta.PROPERTY_FAVORITE, "", "unbounded", "pdfInfo", "Lcom/orion/notein/domain/models/note/PdfInfo;", "pages", "", "Lcom/orion/notein/domain/models/page/Page;", "outlines", "Lcom/orion/notein/domain/models/note/Outline;", "getOutlines", "()Ljava/util/List;", "setOutlines", "(Ljava/util/List;)V", "setId", "setParentId", "setTitle", "setDefaultPageTheme", "setDefaultPageSpec", "setUnbounded", "setPdfInfo", "setPages", "build", "Lcom/orion/notein/domain/models/note/Note;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Builder {
        private PaperSpec defaultPageSpec;
        private PaperTheme defaultPageTheme;
        private boolean favorite;
        private String id;
        private List<Outline> outlines;
        private List<Page> pages;
        private String parentId;
        private PdfInfo pdfInfo;
        private String title;
        private boolean unbounded;

        public Builder() {
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            this.pages = c34434OooOoO;
            this.outlines = c34434OooOoO;
        }

        public final Note build() {
            if (this.unbounded && this.pages.size() > 1) {
                throw new IllegalArgumentException("unbounded note can only have one page");
            }
            float f = this.unbounded ? 1.47f : 1.0f;
            String strOooO00o = C24761OooO.OooO00o("toString(...)");
            String str = this.id;
            if (str == null) {
                OooOOO0.OooOOOO("id");
                throw null;
            }
            PaperSpec paperSpec = this.defaultPageSpec;
            if (paperSpec == null) {
                OooOOO0.OooOOOO("defaultPageSpec");
                throw null;
            }
            PaperTheme paperTheme = this.defaultPageTheme;
            if (paperTheme == null) {
                OooOOO0.OooOOOO("defaultPageTheme");
                throw null;
            }
            if (paperTheme == null) {
                OooOOO0.OooOOOO("defaultPageTheme");
                throw null;
            }
            Page page = new Page(strOooO00o, str, paperSpec, paperTheme.getOrientation(), paperTheme, null, null, null, this.unbounded, 0, System.currentTimeMillis(), System.currentTimeMillis(), null, null, 0, false, null, null, null, 520928, null);
            if (this.pages.isEmpty()) {
                this.pages = OooOo.OooO0oO(page);
            }
            String str2 = this.id;
            if (str2 == null) {
                OooOOO0.OooOOOO("id");
                throw null;
            }
            String str3 = this.title;
            if (str3 == null) {
                OooOOO0.OooOOOO(NoteMeta.PROPERTY_TITLE);
                throw null;
            }
            List<Page> list = this.pages;
            List<Outline> list2 = this.outlines;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((Outline) obj).getParentId() == null) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Outline) it.next()).getId());
            }
            return new Note(str2, null, this.parentId, null, str3, this.favorite, page, list, null, arrayList2, 0L, 0L, null, this.pdfInfo, false, 0, null, f, null, this.unbounded, false, 1432842, null);
        }

        public final List<Outline> getOutlines() {
            return this.outlines;
        }

        public final Builder setDefaultPageSpec(PaperSpec defaultPageSpec) {
            OooOOO0.OooO0oO(defaultPageSpec, "defaultPageSpec");
            this.defaultPageSpec = defaultPageSpec;
            return this;
        }

        public final Builder setDefaultPageTheme(PaperTheme defaultPageTheme) {
            OooOOO0.OooO0oO(defaultPageTheme, "defaultPageTheme");
            this.defaultPageTheme = defaultPageTheme;
            return this;
        }

        public final Builder setId(String id) {
            OooOOO0.OooO0oO(id, "id");
            this.id = id;
            return this;
        }

        /* JADX INFO: renamed from: setOutlines, reason: collision with other method in class */
        public final void m80762setOutlines(List<Outline> list) {
            OooOOO0.OooO0oO(list, "<set-?>");
            this.outlines = list;
        }

        public final Builder setPages(List<Page> pages) {
            OooOOO0.OooO0oO(pages, "pages");
            this.pages = pages;
            return this;
        }

        public final Builder setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public final Builder setPdfInfo(PdfInfo pdfInfo) {
            this.pdfInfo = pdfInfo;
            return this;
        }

        public final Builder setTitle(String title) {
            OooOOO0.OooO0oO(title, "title");
            this.title = title;
            return this;
        }

        public final Builder setUnbounded(boolean unbounded) {
            this.unbounded = unbounded;
            return this;
        }

        public final Builder setOutlines(List<Outline> outlines) {
            OooOOO0.OooO0oO(outlines, "outlines");
            this.outlines = outlines;
            return this;
        }
    }

    public Note() {
        this(null, null, null, null, null, false, null, null, null, null, 0L, 0L, null, null, false, 0, null, 0.0f, null, false, false, 2097151, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Note copy$default(Note note, String str, String str2, String str3, String str4, String str5, boolean z, Page page, List list, List list2, List list3, long j, long j2, String str6, PdfInfo pdfInfo, boolean z2, int i, String str7, float f, Integer num, boolean z3, boolean z4, int i2, Object obj) {
        boolean z5;
        boolean z6;
        String str8 = (i2 & 1) != 0 ? note.id : str;
        String str9 = (i2 & 2) != 0 ? note.userId : str2;
        String str10 = (i2 & 4) != 0 ? note.parentId : str3;
        String str11 = (i2 & 8) != 0 ? note.recoverParentId : str4;
        String str12 = (i2 & 16) != 0 ? note.title : str5;
        boolean z7 = (i2 & 32) != 0 ? note.favorite : z;
        Page page2 = (i2 & 64) != 0 ? note.defaultPage : page;
        List list4 = (i2 & 128) != 0 ? note.pages : list;
        List list5 = (i2 & 256) != 0 ? note.pageLayerIds : list2;
        List list6 = (i2 & 512) != 0 ? note.outlines : list3;
        long j3 = (i2 & 1024) != 0 ? note.creationTime : j;
        long j4 = (i2 & 2048) != 0 ? note.lastModificationTime : j2;
        String str13 = str8;
        String str14 = (i2 & 4096) != 0 ? note.tnPath : str6;
        PdfInfo pdfInfo2 = (i2 & 8192) != 0 ? note.pdfInfo : pdfInfo;
        boolean z8 = (i2 & 16384) != 0 ? note.inTrashBin : z2;
        int i3 = (i2 & 32768) != 0 ? note.savedPageIndex : i;
        String str15 = (i2 & 65536) != 0 ? note.activatedPageLayerId : str7;
        float f2 = (i2 & 131072) != 0 ? note.zoom : f;
        Integer num2 = (i2 & 262144) != 0 ? note.sortKey : num;
        boolean z9 = (i2 & 524288) != 0 ? note.unboundedNote : z3;
        if ((i2 & 1048576) != 0) {
            z6 = z9;
            z5 = note.usingOwnPdf;
        } else {
            z5 = z4;
            z6 = z9;
        }
        return note.copy(str13, str9, str10, str11, str12, z7, page2, list4, list5, list6, j3, j4, str14, pdfInfo2, z8, i3, str15, f2, num2, z6, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.outlines;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTnPath() {
        return this.tnPath;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final PdfInfo getPdfInfo() {
        return this.pdfInfo;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getInTrashBin() {
        return this.inTrashBin;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getSavedPageIndex() {
        return this.savedPageIndex;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getActivatedPageLayerId() {
        return this.activatedPageLayerId;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final float getZoom() {
        return this.zoom;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getSortKey() {
        return this.sortKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getUnboundedNote() {
        return this.unboundedNote;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getUsingOwnPdf() {
        return this.usingOwnPdf;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecoverParentId() {
        return this.recoverParentId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getFavorite() {
        return this.favorite;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Page getDefaultPage() {
        return this.defaultPage;
    }

    public final List<Page> component8() {
        return this.pages;
    }

    public final List<String> component9() {
        return this.pageLayerIds;
    }

    public final Note copy(String id, String userId, String parentId, String recoverParentId, String title, boolean favorite, Page defaultPage, List<Page> pages, List<String> pageLayerIds, List<String> outlines, long creationTime, long lastModificationTime, String tnPath, PdfInfo pdfInfo, boolean inTrashBin, int savedPageIndex, String activatedPageLayerId, float zoom, Integer sortKey, boolean unboundedNote, boolean usingOwnPdf) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(pages, "pages");
        OooOOO0.OooO0oO(pageLayerIds, "pageLayerIds");
        OooOOO0.OooO0oO(outlines, "outlines");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(activatedPageLayerId, "activatedPageLayerId");
        return new Note(id, userId, parentId, recoverParentId, title, favorite, defaultPage, pages, pageLayerIds, outlines, creationTime, lastModificationTime, tnPath, pdfInfo, inTrashBin, savedPageIndex, activatedPageLayerId, zoom, sortKey, unboundedNote, usingOwnPdf);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Note)) {
            return false;
        }
        Note note = (Note) other;
        return OooOOO0.OooO0O0(this.id, note.id) && OooOOO0.OooO0O0(this.userId, note.userId) && OooOOO0.OooO0O0(this.parentId, note.parentId) && OooOOO0.OooO0O0(this.recoverParentId, note.recoverParentId) && OooOOO0.OooO0O0(this.title, note.title) && this.favorite == note.favorite && OooOOO0.OooO0O0(this.defaultPage, note.defaultPage) && OooOOO0.OooO0O0(this.pages, note.pages) && OooOOO0.OooO0O0(this.pageLayerIds, note.pageLayerIds) && OooOOO0.OooO0O0(this.outlines, note.outlines) && this.creationTime == note.creationTime && this.lastModificationTime == note.lastModificationTime && OooOOO0.OooO0O0(this.tnPath, note.tnPath) && OooOOO0.OooO0O0(this.pdfInfo, note.pdfInfo) && this.inTrashBin == note.inTrashBin && this.savedPageIndex == note.savedPageIndex && OooOOO0.OooO0O0(this.activatedPageLayerId, note.activatedPageLayerId) && Float.compare(this.zoom, note.zoom) == 0 && OooOOO0.OooO0O0(this.sortKey, note.sortKey) && this.unboundedNote == note.unboundedNote && this.usingOwnPdf == note.usingOwnPdf;
    }

    public final String getActivatedPageLayerId() {
        return this.activatedPageLayerId;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final Page getDefaultPage() {
        return this.defaultPage;
    }

    public final boolean getFavorite() {
        return this.favorite;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInTrashBin() {
        return this.inTrashBin;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final List<String> getOutlines() {
        return this.outlines;
    }

    public final List<String> getPageLayerIds() {
        return this.pageLayerIds;
    }

    public final List<Page> getPages() {
        return this.pages;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final PdfInfo getPdfInfo() {
        return this.pdfInfo;
    }

    public final String getRecoverParentId() {
        return this.recoverParentId;
    }

    public final int getSavedPageIndex() {
        return this.savedPageIndex;
    }

    public final Integer getSortKey() {
        return this.sortKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Bitmap getTnBitmap() {
        return null;
    }

    public final String getTnPath() {
        return this.tnPath;
    }

    public final boolean getUnboundedNote() {
        return this.unboundedNote;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean getUsingOwnPdf() {
        return this.usingOwnPdf;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.userId);
        String str = this.parentId;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recoverParentId;
        int iOooO0O02 = o00000.OooO0O0(OooO00o.OooO0O0((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title), 31, this.favorite);
        Page page = this.defaultPage;
        int iOooO0O03 = OooO00o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C21445Oooo.OooO00o(this.outlines, C21445Oooo.OooO00o(this.pageLayerIds, C21445Oooo.OooO00o(this.pages, (iOooO0O02 + (page == null ? 0 : page.hashCode())) * 31, 31), 31), 31), 31, this.creationTime), 31, this.lastModificationTime), 31, this.tnPath);
        PdfInfo pdfInfo = this.pdfInfo;
        int iOooO0OO = C20509OooO0oo.OooO0OO(this.zoom, OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.savedPageIndex, o00000.OooO0O0((iOooO0O03 + (pdfInfo == null ? 0 : pdfInfo.hashCode())) * 31, 31, this.inTrashBin), 31), 31, this.activatedPageLayerId), 31);
        Integer num = this.sortKey;
        return Boolean.hashCode(this.usingOwnPdf) + o00000.OooO0O0((iOooO0OO + (num != null ? num.hashCode() : 0)) * 31, 31, this.unboundedNote);
    }

    public final void setActivatedPageLayerId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.activatedPageLayerId = str;
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setDefaultPage(Page page) {
        this.defaultPage = page;
    }

    public final void setFavorite(boolean z) {
        this.favorite = z;
    }

    public final void setId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.id = str;
    }

    public final void setInTrashBin(boolean z) {
        this.inTrashBin = z;
    }

    public final void setLastModificationTime(long j) {
        this.lastModificationTime = j;
    }

    public final void setOutlines(List<String> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.outlines = list;
    }

    public final void setPageLayerIds(List<String> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.pageLayerIds = list;
    }

    public final void setPages(List<Page> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.pages = list;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setPdfInfo(PdfInfo pdfInfo) {
        this.pdfInfo = pdfInfo;
    }

    public final void setRecoverParentId(String str) {
        this.recoverParentId = str;
    }

    public final void setSavedPageIndex(int i) {
        this.savedPageIndex = i;
    }

    public final void setSortKey(Integer num) {
        this.sortKey = num;
    }

    public final void setTitle(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.title = str;
    }

    public final void setTnPath(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.tnPath = str;
    }

    public final void setUnboundedNote(boolean z) {
        this.unboundedNote = z;
    }

    public final void setUserId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.userId = str;
    }

    public final void setUsingOwnPdf(boolean z) {
        this.usingOwnPdf = z;
    }

    public final void setZoom(float f) {
        this.zoom = f;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.userId;
        String str3 = this.parentId;
        String str4 = this.recoverParentId;
        String str5 = this.title;
        boolean z = this.favorite;
        Page page = this.defaultPage;
        List<Page> list = this.pages;
        List<String> list2 = this.pageLayerIds;
        List<String> list3 = this.outlines;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        String str6 = this.tnPath;
        PdfInfo pdfInfo = this.pdfInfo;
        boolean z2 = this.inTrashBin;
        int i = this.savedPageIndex;
        String str7 = this.activatedPageLayerId;
        float f = this.zoom;
        Integer num = this.sortKey;
        boolean z3 = this.unboundedNote;
        boolean z4 = this.usingOwnPdf;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Note(id=", str, ", userId=", str2, ", parentId=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", recoverParentId=", str4, ", title=");
        sbOooO0O0.append(str5);
        sbOooO0O0.append(", favorite=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", defaultPage=");
        sbOooO0O0.append(page);
        sbOooO0O0.append(", pages=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", pageLayerIds=");
        sbOooO0O0.append(list2);
        sbOooO0O0.append(", outlines=");
        sbOooO0O0.append(list3);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", tnPath=", sbOooO0O0);
        sbOooO0O0.append(str6);
        sbOooO0O0.append(", pdfInfo=");
        sbOooO0O0.append(pdfInfo);
        sbOooO0O0.append(", inTrashBin=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", savedPageIndex=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", activatedPageLayerId=");
        sbOooO0O0.append(str7);
        sbOooO0O0.append(", zoom=");
        sbOooO0O0.append(f);
        sbOooO0O0.append(", sortKey=");
        sbOooO0O0.append(num);
        sbOooO0O0.append(", unboundedNote=");
        sbOooO0O0.append(z3);
        sbOooO0O0.append(", usingOwnPdf=");
        return OooOOO.OooO00o(sbOooO0O0, ")", z4);
    }

    public Note(String id, String userId, String str, String str2, String title, boolean z, Page page, List<Page> pages, List<String> pageLayerIds, List<String> outlines, long j, long j2, String tnPath, PdfInfo pdfInfo, boolean z2, int i, String activatedPageLayerId, float f, Integer num, boolean z3, boolean z4) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(pages, "pages");
        OooOOO0.OooO0oO(pageLayerIds, "pageLayerIds");
        OooOOO0.OooO0oO(outlines, "outlines");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(activatedPageLayerId, "activatedPageLayerId");
        this.id = id;
        this.userId = userId;
        this.parentId = str;
        this.recoverParentId = str2;
        this.title = title;
        this.favorite = z;
        this.defaultPage = page;
        this.pages = pages;
        this.pageLayerIds = pageLayerIds;
        this.outlines = outlines;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.tnPath = tnPath;
        this.pdfInfo = pdfInfo;
        this.inTrashBin = z2;
        this.savedPageIndex = i;
        this.activatedPageLayerId = activatedPageLayerId;
        this.zoom = f;
        this.sortKey = num;
        this.unboundedNote = z3;
        this.usingOwnPdf = z4;
    }

    public /* synthetic */ Note(String str, String str2, String str3, String str4, String str5, boolean z, Page page, List list, List list2, List list3, long j, long j2, String str6, PdfInfo pdfInfo, boolean z2, int i, String str7, float f, Integer num, boolean z3, boolean z4, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : page, (i2 & 128) != 0 ? new ArrayList() : list, (i2 & 256) != 0 ? new ArrayList() : list2, (i2 & 512) != 0 ? C34434OooOoO.f123453OooOo0o : list3, (i2 & 1024) != 0 ? System.currentTimeMillis() : j, (i2 & 2048) != 0 ? System.currentTimeMillis() : j2, (i2 & 4096) == 0 ? str6 : "", (i2 & 8192) != 0 ? null : pdfInfo, (i2 & 16384) != 0 ? false : z2, (i2 & 32768) != 0 ? 0 : i, (i2 & 65536) != 0 ? "default" : str7, (i2 & 131072) != 0 ? 1.0f : f, (i2 & 262144) != 0 ? null : num, (i2 & 524288) != 0 ? false : z3, (i2 & 1048576) != 0 ? true : z4);
    }
}
