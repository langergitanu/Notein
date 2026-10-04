package o0OOo0o;

import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes9.dex */
public final class o0oOO {
    public static final NoteContent OooO00o(Note note) {
        return new NoteContent(note.getId(), note.getDefaultPage(), note.getPages(), note.getPageLayerIds(), note.getOutlines(), note.getPdfInfo(), note.getSavedPageIndex(), note.getActivatedPageLayerId(), note.getZoom(), 0.0f, 0.0f, false, note.getCreationTime(), note.getLastModificationTime(), null, 19968, null);
    }

    public static final Note OooO0O0(NoteMeta noteMeta, NoteContent content) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMeta, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        return new Note(noteMeta.getId(), noteMeta.getUserId(), noteMeta.getParentId(), noteMeta.getRecoverParentId(), noteMeta.getTitle(), noteMeta.getFavorite(), content.getDefaultPage(), content.getPages(), content.getPageLayerIds(), content.getOutlines(), noteMeta.getCreationTime(), content.getLastModificationTime(), noteMeta.getTnPath(), content.getPdfInfo(), noteMeta.getInTrashBin(), content.getSavedPageIndex(), content.getActivatedPageLayerId(), content.getZoom(), null, content.getUnboundedNote(), false, 1310720, null);
    }
}
