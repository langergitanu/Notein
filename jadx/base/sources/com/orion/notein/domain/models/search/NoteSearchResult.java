package com.orion.notein.domain.models.search;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.note.Note;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJN\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006*"}, m80612d2 = {"Lcom/orion/notein/domain/models/search/NoteSearchResult;", "Lcom/orion/notein/domain/models/search/ISearchResult;", "", "query", "id", "tnPath", "LoO00ooO/OooOOO;", "", "tnSize", "Lcom/orion/notein/domain/models/note/Note;", BackupFile.FILE_CONTENT_TYPE_NOTE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LoO00ooO/OooOOO;Lcom/orion/notein/domain/models/note/Note;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()LoO00ooO/OooOOO;", "getQuery", "getId", "getTnPath", "getTnSize", "getName", "deepCopy", "()Lcom/orion/notein/domain/models/search/ISearchResult;", "component5", "()Lcom/orion/notein/domain/models/note/Note;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LoO00ooO/OooOOO;Lcom/orion/notein/domain/models/note/Note;)Lcom/orion/notein/domain/models/search/NoteSearchResult;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "LoO00ooO/OooOOO;", "Lcom/orion/notein/domain/models/note/Note;", "getNote", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteSearchResult implements ISearchResult {
    private final String id;
    private final Note note;
    private final String query;
    private final String tnPath;
    private final C32443OooOOO<Integer, Integer> tnSize;

    public NoteSearchResult(String query, String id, String tnPath, C32443OooOOO<Integer, Integer> tnSize, Note note) {
        OooOOO0.OooO0oO(query, "query");
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(tnSize, "tnSize");
        OooOOO0.OooO0oO(note, "note");
        this.query = query;
        this.id = id;
        this.tnPath = tnPath;
        this.tnSize = tnSize;
        this.note = note;
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
    public static /* synthetic */ NoteSearchResult copy$default(NoteSearchResult noteSearchResult, String str, String str2, String str3, C32443OooOOO c32443OooOOO, Note note, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteSearchResult.query;
        }
        if ((i & 2) != 0) {
            str2 = noteSearchResult.id;
        }
        if ((i & 4) != 0) {
            str3 = noteSearchResult.tnPath;
        }
        if ((i & 8) != 0) {
            c32443OooOOO = noteSearchResult.tnSize;
        }
        if ((i & 16) != 0) {
            note = noteSearchResult.note;
        }
        Note note2 = note;
        String str4 = str3;
        return noteSearchResult.copy(str, str2, str4, c32443OooOOO, note2);
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Note getNote() {
        return this.note;
    }

    public final NoteSearchResult copy(String query, String id, String tnPath, C32443OooOOO<Integer, Integer> tnSize, Note note) {
        OooOOO0.OooO0oO(query, "query");
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(tnSize, "tnSize");
        OooOOO0.OooO0oO(note, "note");
        return new NoteSearchResult(query, id, tnPath, tnSize, note);
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public ISearchResult deepCopy() {
        return copy$default(this, null, null, null, null, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteSearchResult)) {
            return false;
        }
        NoteSearchResult noteSearchResult = (NoteSearchResult) other;
        return OooOOO0.OooO0O0(this.query, noteSearchResult.query) && OooOOO0.OooO0O0(this.id, noteSearchResult.id) && OooOOO0.OooO0O0(this.tnPath, noteSearchResult.tnPath) && OooOOO0.OooO0O0(this.tnSize, noteSearchResult.tnSize) && OooOOO0.OooO0O0(this.note, noteSearchResult.note);
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public String getId() {
        return this.id;
    }

    @Override // com.orion.notein.domain.models.search.ISearchResult
    public String getName() {
        return this.note.getTitle();
    }

    public final Note getNote() {
        return this.note;
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
        return this.note.hashCode() + ((this.tnSize.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(this.query.hashCode() * 31, 31, this.id), 31, this.tnPath)) * 31);
    }

    public String toString() {
        String str = this.query;
        String str2 = this.id;
        String str3 = this.tnPath;
        C32443OooOOO<Integer, Integer> c32443OooOOO = this.tnSize;
        Note note = this.note;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteSearchResult(query=", str, ", id=", str2, ", tnPath=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", tnSize=");
        sbOooO0O0.append(c32443OooOOO);
        sbOooO0O0.append(", note=");
        sbOooO0O0.append(note);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
