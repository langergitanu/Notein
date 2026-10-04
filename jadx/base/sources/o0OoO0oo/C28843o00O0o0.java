package o0OoO0oo;

import android.content.Context;
import android.view.DragEvent;
import androidx.core.content.ContextCompat;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import java.util.ArrayList;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0OoO0oo.o00O0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28843o00O0o0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DragEvent f102150OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102151OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ float f102152OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f102153OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ float f102154OooOoOO;

    public /* synthetic */ C28843o00O0o0(NoteEditorFragment noteEditorFragment, DragEvent dragEvent, ArrayList arrayList, float f, float f2) {
        this.f102151OooOo0o = noteEditorFragment;
        this.f102150OooOo = dragEvent;
        this.f102153OooOoO0 = arrayList;
        this.f102152OooOoO = f;
        this.f102154OooOoOO = f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // oO0O000o.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        DragEvent dragEvent = this.f102150OooOo;
        ArrayList arrayList = this.f102153OooOoO0;
        float f = this.f102152OooOoO;
        float f2 = this.f102154OooOoOO;
        NoteEditorFragment noteEditorFragment = this.f102151OooOo0o;
        RunnableC28846o00O0o0o runnableC28846o00O0o0o = new RunnableC28846o00O0o0o(noteEditorFragment, dragEvent, arrayList, f, f2);
        Context contextRequireContext = noteEditorFragment.requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        if (ContextCompat.checkSelfPermission(contextRequireContext, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            runnableC28846o00O0o0o.run();
        } else {
            Context contextRequireContext2 = noteEditorFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
            if (contextRequireContext2.getApplicationInfo().targetSdkVersion < 30) {
                noteEditorFragment.f73039o00000O0 = runnableC28846o00O0o0o;
                noteEditorFragment.f73038o00000O.OooO00o("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
