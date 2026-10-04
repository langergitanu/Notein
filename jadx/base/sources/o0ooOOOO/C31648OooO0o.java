package o0ooOOOO;

import com.orion.notein.domain.models.note.Outline;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0ooOOOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C31648OooO0o<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Outline f113132OooOo0o;

    public C31648OooO0o(Outline outline) {
        this.f113132OooOo0o = outline;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Outline outline = this.f113132OooOo0o;
        return C24536OooO0Oo.OooO0O0(Integer.valueOf(outline.getChildren().indexOf(((Outline) t).getId())), Integer.valueOf(outline.getChildren().indexOf(((Outline) t2).getId())));
    }
}
