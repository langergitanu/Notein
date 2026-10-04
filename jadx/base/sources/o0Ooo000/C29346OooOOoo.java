package o0Ooo000;

import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0Ooo000.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29346OooOOoo<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return C24536OooO0Oo.OooO0O0(Long.valueOf(((NoteTreeInfo) t2).getCreateTime()), Long.valueOf(((NoteTreeInfo) t).getCreateTime()));
    }
}
