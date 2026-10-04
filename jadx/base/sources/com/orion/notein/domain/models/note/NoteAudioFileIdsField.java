package com.orion.notein.domain.models.note;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.firestore.util.OooOOO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/NoteAudioFileIdsField;", "", "id", "", NoteMeta.PROPERTY_NOTE_ID, "fileIds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getNoteId", "getFileIds", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteAudioFileIdsField {
    private final List<String> fileIds;
    private final String id;
    private final String noteId;

    public NoteAudioFileIdsField(String id, String noteId, List<String> fileIds) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(fileIds, "fileIds");
        this.id = id;
        this.noteId = noteId;
        this.fileIds = fileIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoteAudioFileIdsField copy$default(NoteAudioFileIdsField noteAudioFileIdsField, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteAudioFileIdsField.id;
        }
        if ((i & 2) != 0) {
            str2 = noteAudioFileIdsField.noteId;
        }
        if ((i & 4) != 0) {
            list = noteAudioFileIdsField.fileIds;
        }
        return noteAudioFileIdsField.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    public final List<String> component3() {
        return this.fileIds;
    }

    public final NoteAudioFileIdsField copy(String id, String noteId, List<String> fileIds) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(fileIds, "fileIds");
        return new NoteAudioFileIdsField(id, noteId, fileIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteAudioFileIdsField)) {
            return false;
        }
        NoteAudioFileIdsField noteAudioFileIdsField = (NoteAudioFileIdsField) other;
        return OooOOO0.OooO0O0(this.id, noteAudioFileIdsField.id) && OooOOO0.OooO0O0(this.noteId, noteAudioFileIdsField.noteId) && OooOOO0.OooO0O0(this.fileIds, noteAudioFileIdsField.fileIds);
    }

    public final List<String> getFileIds() {
        return this.fileIds;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public int hashCode() {
        return this.fileIds.hashCode() + OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.noteId;
        return OooOOO.OooO0O0(")", OooO0o.OooO0O0("NoteAudioFileIdsField(id=", str, ", noteId=", str2, ", fileIds="), this.fileIds);
    }
}
