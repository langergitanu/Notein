package com.orion.notein.domain.models.note;

import com.hihonor.honorid.core.data.TmemberRight;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oooo.C24761OooO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0010J\b\u00107\u001a\u00020/H\u0002J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00109\u001a\u00020\u001fH\u0002J\u0018\u0010:\u001a\u0002052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u0010H\u0002J\u0010\u0010;\u001a\u0002052\u0006\u00106\u001a\u00020\u0010H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0005R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R \u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006<"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/NoteBuilder;", "", "defaultPageTheme", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "<init>", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;)V", "getDefaultPageTheme", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "setDefaultPageTheme", "defaultPageSpec", "Lcom/orion/notein/domain/models/page/PaperSpec;", "getDefaultPageSpec", "()Lcom/orion/notein/domain/models/page/PaperSpec;", "setDefaultPageSpec", "(Lcom/orion/notein/domain/models/page/PaperSpec;)V", TmemberRight.TAG_USERID, "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", NoteMeta.PROPERTY_TITLE, "getTitle", "setTitle", NoteMeta.PROPERTY_PARENT_ID, "getParentId", "setParentId", "coverTheme", "getCoverTheme", "setCoverTheme", "pdfInfo", "Lcom/orion/notein/domain/models/note/PdfInfo;", "getPdfInfo", "()Lcom/orion/notein/domain/models/note/PdfInfo;", "setPdfInfo", "(Lcom/orion/notein/domain/models/note/PdfInfo;)V", "unbounded", "", "getUnbounded", "()Z", "setUnbounded", "(Z)V", "id", "getId", "setId", "pages", "", "Lcom/orion/notein/domain/models/page/Page;", "getPages", "()Ljava/util/List;", "setPages", "(Ljava/util/List;)V", "build", "Lcom/orion/notein/domain/models/note/Note;", "defaultTitle", "getDefaultPageTemplate", "getPdfPages", "info", "buildPdfNote", "buildNote", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteBuilder {
    private PaperTheme coverTheme;
    private PaperSpec defaultPageSpec;
    private PaperTheme defaultPageTheme;
    private String id;
    private List<Page> pages;
    private String parentId;
    private PdfInfo pdfInfo;
    private String title;
    private boolean unbounded;
    private String userId;

    public NoteBuilder(PaperTheme defaultPageTheme) {
        OooOOO0.OooO0oO(defaultPageTheme, "defaultPageTheme");
        this.defaultPageTheme = defaultPageTheme;
        this.defaultPageSpec = PaperSpec.INSTANCE.getA4();
        this.userId = "";
        this.pages = C34434OooOoO.f123453OooOo0o;
    }

    private final Note buildNote(String defaultTitle) {
        String str;
        Page page;
        ArrayList arrayList;
        String strOooO00o = this.id;
        if (strOooO00o == null) {
            strOooO00o = C24761OooO.OooO00o("toString(...)");
        }
        String str2 = strOooO00o;
        String str3 = this.title;
        if (str3 == null) {
            str3 = defaultTitle;
        }
        Page page2 = new Page(C24761OooO.OooO00o("toString(...)"), str2, this.unbounded ? PaperSpec.INSTANCE.getUNBOUNDED() : this.defaultPageSpec, this.defaultPageTheme.getOrientation(), this.defaultPageTheme, null, null, null, this.unbounded, 0, System.currentTimeMillis(), System.currentTimeMillis(), null, null, 0, false, null, null, null, 520928, null);
        ArrayList arrayList2 = new ArrayList();
        PaperTheme paperTheme = this.coverTheme;
        if (paperTheme != null) {
            page = page2;
            str = str3;
            arrayList = arrayList2;
            arrayList.add(new Page(C24761OooO.OooO00o("toString(...)"), str2, PaperSpec.INSTANCE.getA4(), paperTheme.getOrientation(), paperTheme, null, null, null, this.unbounded, 0, System.currentTimeMillis(), System.currentTimeMillis(), null, null, 0, false, null, null, null, 520928, null));
        } else {
            str = str3;
            page = page2;
            arrayList = arrayList2;
        }
        if (this.pages.isEmpty()) {
            arrayList.add(page);
        } else {
            arrayList.addAll(this.pages);
        }
        if (this.unbounded && arrayList.size() > 1) {
            throw new IllegalArgumentException("Unbounded note should only have one page");
        }
        boolean z = this.unbounded;
        return new Note(str2, null, this.parentId, null, str, false, page, arrayList, null, null, 0L, 0L, null, null, false, 0, null, z ? 1.47f : 1.0f, null, z, false, 1441546, null);
    }

    private final Note buildPdfNote(PdfInfo pdfInfo, String defaultTitle) {
        String strOooO00o = this.id;
        if (strOooO00o == null) {
            strOooO00o = C24761OooO.OooO00o("toString(...)");
        }
        String str = strOooO00o;
        String str2 = this.title;
        return new Note(str, null, this.parentId, null, str2 == null ? defaultTitle : str2, false, Page.copy$default(getDefaultPageTemplate(), null, null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524287, null), getPdfPages(pdfInfo), null, C34434OooOoO.f123453OooOo0o, 0L, 0L, null, pdfInfo, false, 0, null, 0.0f, null, false, false, 2088202, null);
    }

    private final Page getDefaultPageTemplate() {
        return new Page(null, "", PaperSpec.INSTANCE.getA4(), this.defaultPageTheme.getOrientation(), this.defaultPageTheme, null, null, "", false, 0, System.currentTimeMillis(), System.currentTimeMillis(), null, null, 0, false, null, null, null, 488289, null);
    }

    private final List<Page> getPdfPages(PdfInfo info) {
        return this.pages;
    }

    public final Note build(String defaultTitle) {
        Note noteBuildPdfNote;
        OooOOO0.OooO0oO(defaultTitle, "defaultTitle");
        PdfInfo pdfInfo = this.pdfInfo;
        return (pdfInfo == null || (noteBuildPdfNote = buildPdfNote(pdfInfo, defaultTitle)) == null) ? buildNote(defaultTitle) : noteBuildPdfNote;
    }

    public final PaperTheme getCoverTheme() {
        return this.coverTheme;
    }

    public final PaperSpec getDefaultPageSpec() {
        return this.defaultPageSpec;
    }

    public final PaperTheme getDefaultPageTheme() {
        return this.defaultPageTheme;
    }

    public final String getId() {
        return this.id;
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

    public final String getTitle() {
        return this.title;
    }

    public final boolean getUnbounded() {
        return this.unbounded;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setCoverTheme(PaperTheme paperTheme) {
        this.coverTheme = paperTheme;
    }

    public final void setDefaultPageSpec(PaperSpec paperSpec) {
        OooOOO0.OooO0oO(paperSpec, "<set-?>");
        this.defaultPageSpec = paperSpec;
    }

    public final void setDefaultPageTheme(PaperTheme paperTheme) {
        OooOOO0.OooO0oO(paperTheme, "<set-?>");
        this.defaultPageTheme = paperTheme;
    }

    public final void setId(String str) {
        this.id = str;
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

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUnbounded(boolean z) {
        this.unbounded = z;
    }

    public final void setUserId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.userId = str;
    }
}
