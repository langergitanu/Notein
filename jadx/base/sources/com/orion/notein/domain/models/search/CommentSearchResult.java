package com.orion.notein.domain.models.search;

import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.note.Comment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u001e¨\u0006."}, m80612d2 = {"Lcom/orion/notein/domain/models/search/CommentSearchResult;", "Lcom/orion/notein/domain/models/search/ISearchResult;", "", "query", "id", "tnPath", "LoO00ooO/OooOOO;", "", "tnSize", "pageIndex", "Lcom/orion/notein/domain/models/note/Comment;", "comment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LoO00ooO/OooOOO;ILcom/orion/notein/domain/models/note/Comment;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()LoO00ooO/OooOOO;", "getQuery", "getId", "getTnPath", "getTnSize", "getName", "deepCopy", "()Lcom/orion/notein/domain/models/search/ISearchResult;", "component5", "()I", "component6", "()Lcom/orion/notein/domain/models/note/Comment;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LoO00ooO/OooOOO;ILcom/orion/notein/domain/models/note/Comment;)Lcom/orion/notein/domain/models/search/CommentSearchResult;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "LoO00ooO/OooOOO;", "I", "getPageIndex", "Lcom/orion/notein/domain/models/note/Comment;", "getComment", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CommentSearchResult implements ISearchResult {
    private final Comment comment;
    private final String id;
    private final int pageIndex;
    private final String query;
    private final String tnPath;
    private final C32443OooOOO<Integer, Integer> tnSize;

    public CommentSearchResult(String query, String id, String tnPath, C32443OooOOO<Integer, Integer> tnSize, int i, Comment comment) {
        OooOOO0.OooO0oO(query, "query");
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(tnSize, "tnSize");
        OooOOO0.OooO0oO(comment, "comment");
        this.query = query;
        this.id = id;
        this.tnPath = tnPath;
        this.tnSize = tnSize;
        this.pageIndex = i;
        this.comment = comment;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getTnPath() {
        return this.tnPath;
    }

    private final C32443OooOOO<Integer, Integer> component4() {
        return this.tnSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentSearchResult copy$default(CommentSearchResult commentSearchResult, String str, String str2, String str3, C32443OooOOO c32443OooOOO, int i, Comment comment, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = commentSearchResult.query;
        }
        if ((i2 & 2) != 0) {
            str2 = commentSearchResult.id;
        }
        if ((i2 & 4) != 0) {
            str3 = commentSearchResult.tnPath;
        }
        if ((i2 & 8) != 0) {
            c32443OooOOO = commentSearchResult.tnSize;
        }
        if ((i2 & 16) != 0) {
            i = commentSearchResult.pageIndex;
        }
        if ((i2 & 32) != 0) {
            comment = commentSearchResult.comment;
        }
        int i3 = i;
        Comment comment2 = comment;
        return commentSearchResult.copy(str, str2, str3, c32443OooOOO, i3, comment2);
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Comment getComment() {
        return this.comment;
    }

    public final CommentSearchResult copy(String query, String id, String tnPath, C32443OooOOO<Integer, Integer> tnSize, int pageIndex, Comment comment) {
        OooOOO0.OooO0oO(query, "query");
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(tnSize, "tnSize");
        OooOOO0.OooO0oO(comment, "comment");
        return new CommentSearchResult(query, id, tnPath, tnSize, pageIndex, comment);
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public ISearchResult deepCopy() {
        return copy$default(this, null, null, null, null, 0, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentSearchResult)) {
            return false;
        }
        CommentSearchResult commentSearchResult = (CommentSearchResult) other;
        return OooOOO0.OooO0O0(this.query, commentSearchResult.query) && OooOOO0.OooO0O0(this.id, commentSearchResult.id) && OooOOO0.OooO0O0(this.tnPath, commentSearchResult.tnPath) && OooOOO0.OooO0O0(this.tnSize, commentSearchResult.tnSize) && this.pageIndex == commentSearchResult.pageIndex && OooOOO0.OooO0O0(this.comment, commentSearchResult.comment);
    }

    public final Comment getComment() {
        return this.comment;
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public String getId() {
        return this.id;
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public String getName() {
        return this.comment.getTitle();
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public String getQuery() {
        return this.query;
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public String getTnPath() {
        return this.tnPath;
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public C32443OooOOO<Integer, Integer> getTnSize() {
        return C32443OooOOO.OooO00o(this.tnSize);
    }

    public int hashCode() {
        return this.comment.hashCode() + C20785Oooo00o.OooO00o(this.pageIndex, (this.tnSize.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(this.query.hashCode() * 31, 31, this.id), 31, this.tnPath)) * 31, 31);
    }

    public String toString() {
        String str = this.query;
        String str2 = this.id;
        String str3 = this.tnPath;
        C32443OooOOO<Integer, Integer> c32443OooOOO = this.tnSize;
        int i = this.pageIndex;
        Comment comment = this.comment;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("CommentSearchResult(query=", str, ", id=", str2, ", tnPath=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", tnSize=");
        sbOooO0O0.append(c32443OooOOO);
        sbOooO0O0.append(", pageIndex=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", comment=");
        sbOooO0O0.append(comment);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
